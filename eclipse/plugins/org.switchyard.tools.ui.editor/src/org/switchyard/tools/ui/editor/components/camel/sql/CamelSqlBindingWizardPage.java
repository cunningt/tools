/******************************************************************************* 
 * Copyright (c) 2012 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 * @author bfitzpat
 ******************************************************************************/
package org.switchyard.tools.ui.editor.components.camel.sql;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.soa.sca.sca1_1.model.sca.Binding;
import org.eclipse.soa.sca.sca1_1.model.sca.Contract;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.switchyard.tools.models.switchyard1_0.camel.sql.CamelSqlBindingType;
import org.switchyard.tools.models.switchyard1_0.camel.sql.SqlFactory;

/**
 * @author bfitzpat
 * 
 */
public class CamelSqlBindingWizardPage extends WizardPage {

    private CamelSQLComposite _sqlComposite = null;
    private CamelSqlBindingType _binding = SqlFactory.eINSTANCE.createCamelSqlBindingType();
    private Contract _targetContainer;

    /**
     * @param pageName String for name
     */
    public CamelSqlBindingWizardPage(String pageName) {
        super(pageName);
        setTitle("Specify SQL Binding Details");
        setDescription("Specify pertinent details for your SQL Binding.");
    }

    @Override
    public void createControl(Composite parent) {
        _targetContainer = ((CamelSqlBindingWizard)getWizard()).getTargetContainer();
        _sqlComposite = new CamelSQLComposite();
        _sqlComposite.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                setErrorMessage(_sqlComposite.getErrorMessage());
                setPageComplete(_sqlComposite.getErrorMessage() == null);
            }
        });
        _sqlComposite.setTargetObject(_targetContainer);
        _sqlComposite.createContents(parent, SWT.NONE);
        _sqlComposite.setBinding(_binding);

        setControl(_sqlComposite.getPanel());
        setPageComplete(_sqlComposite.getErrorMessage() == null);

        setErrorMessage(null);
    }

    /**
     * @return the binding being edited.
     */
    public Binding getBinding() {
        return _binding;
    }

}
