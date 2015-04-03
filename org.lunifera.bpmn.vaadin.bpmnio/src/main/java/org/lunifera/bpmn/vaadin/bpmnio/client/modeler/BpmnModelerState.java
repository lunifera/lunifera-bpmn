/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.bpmn.vaadin.bpmnio.client.modeler;

public class BpmnModelerState extends com.vaadin.shared.AbstractComponentState {

	public static final String BPMN_RESOURCE = "bpmnSrc";
	
	public String name;

	/**
	 * Indicates that the bpmn diagram should be reloaded.
	 */
	public boolean loadBpmn;

}