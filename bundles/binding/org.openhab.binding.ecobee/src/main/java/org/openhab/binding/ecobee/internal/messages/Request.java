/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.ecobee.internal.messages;

/**
 * Base interface for all Ecobee API requests.
 * 
 * @author John Cocula
 * @since 1.7.0
 */
public interface Request {

	/**
	 * Send this request to the Ecobee API. Implementations specify a more concrete {@link Request} class.
	 * 
	 * @return a {@link Response} containing the requested data or an error
	 */
	Response execute();
}