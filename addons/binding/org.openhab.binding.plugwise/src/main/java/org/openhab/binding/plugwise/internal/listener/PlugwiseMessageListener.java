/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.plugwise.internal.listener;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.binding.plugwise.internal.protocol.Message;

/**
 * Interface for listeners of Plugwise response messages.
 *
 * @author Wouter Born - Initial contribution
 */
@NonNullByDefault
public interface PlugwiseMessageListener {

    void handleReponseMessage(Message message);

}
