/**
 */
package org.switchyard.tools.models.switchyard1_0.camel.file.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.edit.provider.ViewerNotification;
import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding;

import org.switchyard.tools.models.switchyard1_0.camel.file.FilePackage;
import org.switchyard.tools.models.switchyard1_0.hornetq.HornetQFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.jca.JcaFactory;
import org.switchyard.tools.models.switchyard1_0.resteasy.ResteasyFactory;
import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;
import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardPackage;
import org.switchyard.tools.models.switchyard1_0.switchyard.provider.SwitchYardBindingTypeItemProvider;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.camel.file.BaseCamelBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaseCamelBindingItemProvider
    extends SwitchYardBindingTypeItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BaseCamelBindingItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

        }
        return itemPropertyDescriptors;
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER);
            childrenFeatures.add(FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((BaseCamelBinding)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_BaseCamelBinding_type") :
            getString("_UI_BaseCamelBinding_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(BaseCamelBinding.class)) {
            case FilePackage.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER:
            case FilePackage.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER,
                 SwitchyardFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER,
                 HornetQFactory.eINSTANCE.createHornetQContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER,
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER,
                 JcaFactory.eINSTANCE.createJCAContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER,
                 ResteasyFactory.eINSTANCE.createRESTContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER,
                 HttpFactory.eINSTANCE.createHttpContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER,
                 SwitchyardFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER,
                 HornetQFactory.eINSTANCE.createHornetQMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER,
                 SOAPFactory.eINSTANCE.createSOAPMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER,
                 JcaFactory.eINSTANCE.createJCAMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER,
                 ResteasyFactory.eINSTANCE.createRESTMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER,
                 HttpFactory.eINSTANCE.createHttpMessageComposerType()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify =
            childFeature == SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__CONTEXT_MAPPER ||
            childFeature == FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_CONTEXT_MAPPER ||
            childFeature == SwitchyardPackage.Literals.SWITCH_YARD_BINDING_TYPE__MESSAGE_COMPOSER ||
            childFeature == FilePackage.Literals.BASE_CAMEL_BINDING__CAMEL_MESSAGE_COMPOSER;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}
