// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class helper
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject helperMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.helper";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		text("text"),
		pic("pic"),
		Entity_helper("MyFirstModule.Entity_helper"),
		data("MyFirstModule.data");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public helper(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.helper"));
	}

	protected helper(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject helperMendixObject)
	{
		if (helperMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.helper", helperMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.helper");

		this.helperMendixObject = helperMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'helper.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.helper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.helper.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.helper initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.helper(context, mendixObject);
	}

	public static myfirstmodule.proxies.helper load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.helper.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.helper> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.helper> result = new java.util.ArrayList<myfirstmodule.proxies.helper>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.helper" + xpathConstraint))
			result.add(myfirstmodule.proxies.helper.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of text
	 */
	public final java.lang.String gettext()
	{
		return gettext(getContext());
	}

	/**
	 * @param context
	 * @return value of text
	 */
	public final java.lang.String gettext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.text.toString());
	}

	/**
	 * Set value of text
	 * @param text
	 */
	public final void settext(java.lang.String text)
	{
		settext(getContext(), text);
	}

	/**
	 * Set value of text
	 * @param context
	 * @param text
	 */
	public final void settext(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String text)
	{
		getMendixObject().setValue(context, MemberNames.text.toString(), text);
	}

	/**
	 * @return value of pic
	 */
	public final java.lang.String getpic()
	{
		return getpic(getContext());
	}

	/**
	 * @param context
	 * @return value of pic
	 */
	public final java.lang.String getpic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.pic.toString());
	}

	/**
	 * Set value of pic
	 * @param pic
	 */
	public final void setpic(java.lang.String pic)
	{
		setpic(getContext(), pic);
	}

	/**
	 * Set value of pic
	 * @param context
	 * @param pic
	 */
	public final void setpic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String pic)
	{
		getMendixObject().setValue(context, MemberNames.pic.toString(), pic);
	}

	/**
	 * @return value of Entity_helper
	 */
	public final myfirstmodule.proxies.Entity getEntity_helper() throws com.mendix.core.CoreException
	{
		return getEntity_helper(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity_helper
	 */
	public final myfirstmodule.proxies.Entity getEntity_helper(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Entity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Entity_helper.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Entity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Entity_helper
	 * @param entity_helper
	 */
	public final void setEntity_helper(myfirstmodule.proxies.Entity entity_helper)
	{
		setEntity_helper(getContext(), entity_helper);
	}

	/**
	 * Set value of Entity_helper
	 * @param context
	 * @param entity_helper
	 */
	public final void setEntity_helper(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Entity entity_helper)
	{
		if (entity_helper == null)
			getMendixObject().setValue(context, MemberNames.Entity_helper.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Entity_helper.toString(), entity_helper.getMendixObject().getId());
	}

	/**
	 * @return value of data
	 */
	public final myfirstmodule.proxies.Entity getdata() throws com.mendix.core.CoreException
	{
		return getdata(getContext());
	}

	/**
	 * @param context
	 * @return value of data
	 */
	public final myfirstmodule.proxies.Entity getdata(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Entity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.data.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Entity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of data
	 * @param data
	 */
	public final void setdata(myfirstmodule.proxies.Entity data)
	{
		setdata(getContext(), data);
	}

	/**
	 * Set value of data
	 * @param context
	 * @param data
	 */
	public final void setdata(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Entity data)
	{
		if (data == null)
			getMendixObject().setValue(context, MemberNames.data.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.data.toString(), data.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return helperMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.helper that = (myfirstmodule.proxies.helper) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.helper";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
