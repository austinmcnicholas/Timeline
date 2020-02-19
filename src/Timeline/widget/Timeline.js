import {
    defineWidget,
    log,
    runCallback,
} from 'widget-base-helpers';

import $ from "jquery";

import template from './timeline.template.html';

import './Timeline.css';


export default defineWidget('Timeline', template, {

    _obj: null,
    microflow: null,
    entity: null,
    caption: null,
    title: null,
    viewReference: null,
    maxWidth: null,
    width: null,
    dotWidth: null,
    dotWidthSm: null,
    colorActive: null,
    colorInactive: null,
    fontAwesomeFlag: null,
    icon: null,

    constructor() {
        this.log = log.bind(this);
        this.runCallback = runCallback.bind(this);

       
    },

    postCreate() {
        log.call(this, 'postCreate', this._WIDGET_VERSION);

        

    },

    update(obj, callback) {
        log.call(this, 'update', this._WIDGET_VERSION);

        const objGuid = obj.getGuid();
        const captionAttribute = this.caption;
        const titleAttribute = this.title;
        const icon = this.icon;
        const fontAwesomeFlag = this.fontAwesomeFlag;
        
        
        //store the root in a var
        const root = document.documentElement;

        //styling constants
        const mWidth = this.maxWidth;
        const width = this.width;
        const dotWidth = this.dotWidth;
        const dotWidthSm = this.dotWidthSm;
        const colorActive = this.colorActive;
        const colorInactive = this.colorInactive;

        const reff = this.viewReference.split('/', 1).toString(); //grab just the reference
        //console.log('this is the captiona attribute: '+ this.caption);
        mx.data.action({
            params: {
                applyto: "selection",
                actionname: this.microflow,
                guids: [objGuid],
            },
            origin: this.mxform,
            callback: function(response) {
                
                    console.log('processing call back microflow');
                    console.log(response);

                    const start = '<div class="flex-parent"><div class="input-flex-container">';
                    const end = '</div></div>';
                    let first = true;
                    let body;
                    let object;
                    let count = 0;
                    for(object of response){
                        console.log('creat record for: '+ object.getGuid());
                        
                        let info = '';
                        if (titleAttribute){
                            info = object.get(titleAttribute);
                        }
                        const htmlFirst = '<div class="input active" id="' + object.getGuid() + '"><span data-year="'+ object.get(captionAttribute) + '" data-info="' + info + '"></span></div>';
                        const html = '<div class="input" id="' + object.getGuid() + '"><span data-year="'+ object.get(captionAttribute) + '" data-info=""></span></div>';
                        //handle the first record
                        if (first){
                            body = htmlFirst;
                            obj.set(reff, object.getGuid());
                            first = false;
                        } else {
                            body = body + html;
                        }
                        ++count;

                    }
                    const final = start + body + end;

                    //set the css variable so the timeline is styled correctly
                    root.style.setProperty('--width', width + 'vw');
                    root.style.setProperty('--maxWidth', mWidth + 'px');
                    root.style.setProperty('--dotWidth', dotWidth + 'px');
                    root.style.setProperty('--dotWidthSm', dotWidthSm + 'px');
                    root.style.setProperty('--active', colorActive);
                    root.style.setProperty('--inactive', colorInactive);
                    root.style.setProperty('--numdots', count);

                    //workin progress
                    if (fontAwesomeFlag){
                        root.style.setProperty('--title', icon);
                    } else {
                        root.style.setProperty('--title', 'attr(data-info)');
                    }

                    //insert timeline html
                    $('.timeline').html(final);

                    //setup on click functions
                    $(function(){
                        var inputs = $('.input');
                        var paras = $('.description-flex-container').find('p');
                        $(inputs).click(function(){
                            var t = $(this),
                                    ind = t.index(),
                                    matchedPara = $(paras).eq(ind);
                            
                            $(t).add(matchedPara).addClass('active');
                            $(inputs).not(t).add($(paras).not(matchedPara)).removeClass('active');
                            
                           
                            var id = t.attr("id");
                            console.log('record was clicked: '+ id);
                            console.log('reference being set: ' + reff);
                            console.log('object being set: '+ obj);
                            //obj.set("temp", id);
                            obj.set(reff, id);
                        });
                    });
                                
            },

            error: function(error) {
                console.error(error);
                //alert(error.message);
            }, 
        });


        if(callback) {callback();}
    },

});
