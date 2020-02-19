ALTER TABLE "myfirstmodule$helper" ADD "pic" VARCHAR_IGNORECASE(200) NULL;
UPDATE "myfirstmodule$helper"
 SET "pic" = '\f0d1';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('ac14222e-5619-4af1-90d1-aa92c3867778', 
'0bbadc17-99cc-4f9c-9b55-5344f12c60fe', 
'pic', 
'pic', 
30, 
200, 
'\f0d1', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200218 17:40:36';
