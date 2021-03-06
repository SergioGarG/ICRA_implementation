/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */
package se.gu.promise.wizards;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Class associated with the popupMenu for the folder
 * Start the wizard in the run method
 */

public class MissionAction implements IObjectActionDelegate 
{

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";

	IWorkbenchPart part;
	ISelection selection;

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart part) {
			this.part = part;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 * Instantiates the wizard and opens it in the wizard container
	 */
	public void run(IAction action) {
		
		// Instantiates and initializes the wizard
		MissionWizard wizard = new MissionWizard();
		if ((selection instanceof IStructuredSelection) || (selection == null))
			wizard.init(part.getSite().getWorkbenchWindow().getWorkbench(), 
			(IStructuredSelection)selection);
			
		// Instantiates the wizard container with the wizard and opens it
		WizardDialog dialog = new WizardDialog( part.getSite().getShell(), wizard);
		dialog.create();
		dialog.open();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
