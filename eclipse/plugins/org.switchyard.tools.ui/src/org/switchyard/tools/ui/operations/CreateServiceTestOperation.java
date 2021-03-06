/*************************************************************************************
 * Copyright (c) 2011 Red Hat, Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     JBoss by Red Hat - Initial implementation.
 ************************************************************************************/
package org.switchyard.tools.ui.operations;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.switchyard.tools.ui.Activator;
import org.switchyard.tools.ui.wizards.NewServiceTestClassWizardPage;

/**
 * CreateServiceTestOperation
 * 
 * Creates a new service test class.
 * 
 * @author Rob Cernich
 */
public class CreateServiceTestOperation extends AbstractSwitchYardProjectOperation {

    private NewServiceTestClassWizardPage _serviceTestClassPage;

    /**
     * Create a new CreateServiceTestOperation.
     * 
     * @param serviceTestClassPage the page creating the new test class.
     * @param uiInfo adaptable for UI Shell, may be null.
     */
    public CreateServiceTestOperation(NewServiceTestClassWizardPage serviceTestClassPage, IAdaptable uiInfo) {
        super(null, serviceTestClassPage.getSelectedMixInComponents(), false, "Creating new SwitchYard service test.",
                uiInfo);
        _serviceTestClassPage = serviceTestClassPage;
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException {
        try {
            monitor.beginTask("", 100);
            monitor.subTask("Creating service implementation.");
            IProgressMonitor subMonitor = new SubProgressMonitor(monitor, 100,
                    SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK);
            try {
                _serviceTestClassPage.createType(subMonitor);
            } catch (InterruptedException e) {
                throw new CoreException(new Status(Status.CANCEL, Activator.PLUGIN_ID, e.getMessage(), e));
            } finally {
                subMonitor.done();
                subMonitor.setTaskName("");
            }
        } finally {
            monitor.setTaskName("");
            monitor.done();
        }
    }

    @Override
    protected IProject getProject() {
        return _serviceTestClassPage.getJavaProject().getProject();
    }

}
