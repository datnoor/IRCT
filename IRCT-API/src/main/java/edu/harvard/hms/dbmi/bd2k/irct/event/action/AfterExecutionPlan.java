/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.bd2k.irct.event.action;

import edu.harvard.hms.dbmi.bd2k.irct.event.IRCTEvent;
import edu.harvard.hms.dbmi.bd2k.irct.executable.Executable;
import edu.harvard.hms.dbmi.bd2k.irct.model.security.User;

/**
 * An event listener that is run after an execution plan is run
 */
public interface AfterExecutionPlan extends IRCTEvent {

	/**
	 * An action that is run after an execution plan is completed
	 * 
	 * @param session Session
	 * @param executable Executable
	 */
	void fire(User user, Executable executable);

}
