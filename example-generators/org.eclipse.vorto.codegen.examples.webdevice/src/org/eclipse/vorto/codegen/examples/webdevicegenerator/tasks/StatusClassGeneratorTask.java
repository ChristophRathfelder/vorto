/*******************************************************************************
 *  Copyright (c) 2015 Bosch Software Innovations GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v1.0 which accompany this distribution.
 *   
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  The Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *   
 *  Contributors:
 *  Bosch Software Innovations GmbH - Please refer to git log
 *******************************************************************************/
package org.eclipse.vorto.codegen.examples.webdevicegenerator.tasks;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.vorto.codegen.api.tasks.AbstractTemplateGeneratorTask;
import org.eclipse.vorto.codegen.api.tasks.ITemplate;
import org.eclipse.vorto.codegen.examples.webdevicegenerator.tasks.templates.StatusClassTemplate;
import org.eclipse.vorto.core.api.model.informationmodel.FunctionblockProperty;

public class StatusClassGeneratorTask extends
		AbstractTemplateGeneratorTask<FunctionblockProperty> {

	@Override
	public String getFileName(final FunctionblockProperty model) {
		return StringUtils.capitalize(model.getName()) + "Status.java";
	}

	@Override
	public String getPath(final FunctionblockProperty model) {
		return ModuleUtil.getModelPath(model.getType());
	}

	@Override
	public ITemplate<FunctionblockProperty> getTemplate() {
		return new StatusClassTemplate();
	}
}