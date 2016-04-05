/*******************************************************************************
 * Copyright (c) 2016 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 ******************************************************************************/
package org.eclipse.californium.core.observe;

import org.eclipse.californium.elements.CorrelationContext;

/**
 * A store of observation.
 */
public interface ObservationStore {

	/**
	 * Add an observation to the store.
	 */
	void add(Observation obs);
	
	/**
	 * Remove the observation initiated by the request with the given token.
	 */
	void remove(byte[] token);

	/**
	 * Get the the observation initiated by the request with the given token.
	 */
	Observation get(byte[] token);

	/**
	 * Set the security context for the current observation initiated by the
	 * request with the given token.
	 */
	void setContext(byte[] token, CorrelationContext correlationContext);
}
