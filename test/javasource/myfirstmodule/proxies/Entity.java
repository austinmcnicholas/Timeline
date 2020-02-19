// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Entity
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject entityMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Entity";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		html("html"),
		Entity_helper("MyFirstModule.Entity_helper");

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

	public Entity(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Entity"));
	}

	protected Entity(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject entityMendixObject)
	{
		if (entityMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Entity", entityMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Entity");

		this.entityMendixObject = entityMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Entity.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Entity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Entity.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Entity initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Entity(context, mendixObject);
	}

	public static myfirstmodule.proxies.Entity load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Entity.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Entity> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Entity> result = new java.util.ArrayList<myfirstmodule.proxies.Entity>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Entity" + xpathConstraint))
			result.add(myfirstmodule.proxies.Entity.initialize(context, obj));
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
	 * @return value of html
	 */
	public final java.lang.String gethtml()
	{
		return gethtml(getContext());
	}

	/**
	 * @param context
	 * @return value of html
	 */
	public final java.lang.String gethtml(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.html.toString());
	}

	/**
	 * Set value of html
	 * @param html
	 */
	public final void sethtml(java.lang.String html)
	{
		sethtml(getContext(), html);
	}

	/**
	 * Set value of html
	 * @param context
	 * @param html
	 */
	public final void sethtml(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String html)
	{
		getMendixObject().setValue(context, MemberNames.html.toString(), html);
	}

	/**
	 * @return value of Entity_helper
	 */
	public final myfirstmodule.proxies.helper getEntity_helper() throws com.mendix.core.CoreException
	{
		return getEntity_helper(getContext());
	}

	/**
	 * @param context
	 * @return value of Entity_helper
	 */
	public final myfirstmodule.proxies.helper getEntity_helper(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.helper result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Entity_helper.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.helper.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Entity_helper
	 * @param entity_helper
	 */
	public final void setEntity_helper(myfirstmodule.proxies.helper entity_helper)
	{
		setEntity_helper(getContext(), entity_helper);
	}

	/**
	 * Set value of Entity_helper
	 * @param context
	 * @param entity_helper
	 */
	public final void setEntity_helper(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.helper entity_helper)
	{
		if (entity_helper == null)
			getMendixObject().setValue(context, MemberNames.Entity_helper.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Entity_helper.toString(), entity_helper.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return entityMendixObject;
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
			final myfirstmodule.proxies.Entity that = (myfirstmodule.proxies.Entity) obj;
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
		return "MyFirstModule.Entity";
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
