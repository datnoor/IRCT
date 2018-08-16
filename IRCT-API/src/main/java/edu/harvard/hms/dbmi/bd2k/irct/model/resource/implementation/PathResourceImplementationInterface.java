/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package edu.harvard.hms.dbmi.bd2k.irct.model.resource.implementation;

import edu.harvard.hms.dbmi.bd2k.irct.exception.ResourceInterfaceException;
import edu.harvard.hms.dbmi.bd2k.irct.model.find.FindInformationInterface;
import edu.harvard.hms.dbmi.bd2k.irct.model.ontology.Entity;
import edu.harvard.hms.dbmi.bd2k.irct.model.ontology.OntologyRelationship;
import edu.harvard.hms.dbmi.bd2k.irct.model.security.User;

import java.util.List;

/**
 * Provides an implemntation that descripes tha API for any resource that has
 * paths that can be traversed.
 */
public interface PathResourceImplementationInterface extends
		ResourceImplementationInterface {
	
	/**
	 * Given a path give all the associated paths of that type of relationship
	 * 
	 * @param path
	 *            Path
	 * @param relationship
	 *            Relationships
	 * @return Paths
	 * @throws ResourceInterfaceException
	 *             A resource exception occurred
	 */
	List<Entity> getPathRelationship(Entity path, OntologyRelationship relationship, User user)
			throws ResourceInterfaceException;

	/**
	 * Given a path find all entities that match the finds
	 * 
	 * @param path Path
	 * @param findInformation Information on finds
	 * @return Paths
	 * @throws ResourceInterfaceException A resource exception occurred
	 */
	List<Entity> find(Entity path, FindInformationInterface findInformation, User user) throws ResourceInterfaceException;

}
