/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.switchyard.tools.models.switchyard1_0.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.switchyard.tools.models.switchyard1_0.spring.RouteBuilderDefinition;
import org.switchyard.tools.models.switchyard1_0.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Builder Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.switchyard.tools.models.switchyard1_0.spring.impl.RouteBuilderDefinitionImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteBuilderDefinitionImpl extends IdentifiedTypeImpl implements RouteBuilderDefinition {
	/**
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected static final String REF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
	protected String ref = REF_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected RouteBuilderDefinitionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SpringPackage.eINSTANCE.getRouteBuilderDefinition();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getRef() {
        return ref;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRef(String newRef) {
        String oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.ROUTE_BUILDER_DEFINITION__REF, oldRef, ref));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SpringPackage.ROUTE_BUILDER_DEFINITION__REF:
                return getRef();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SpringPackage.ROUTE_BUILDER_DEFINITION__REF:
                setRef((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case SpringPackage.ROUTE_BUILDER_DEFINITION__REF:
                setRef(REF_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SpringPackage.ROUTE_BUILDER_DEFINITION__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (ref: ");
        result.append(ref);
        result.append(')');
        return result.toString();
    }

} //RouteBuilderDefinitionImpl
