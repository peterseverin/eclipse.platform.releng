/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.releng.internal.tools.pomversion;

import org.eclipse.osgi.util.NLS;


final class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.releng.internal.tools.pomversion.messages"; //$NON-NLS-1$

	public static String PomVersionErrorReporter_pom_version_error_marker_message;
	public static String PomVersionErrorReporter_pom_version_error_marker_message_feature;
	public static String PomVersionMarkerResolution_label;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// Do not instantiate
	}

}
