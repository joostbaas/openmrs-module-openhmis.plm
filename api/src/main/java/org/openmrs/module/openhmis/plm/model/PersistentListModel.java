/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.openhmis.plm.model;

import java.util.Date;

public class PersistentListModel {
	private Integer listId;
	private String key;
	private String listProvider;
	private String description;
	private Date dateCreated;

	PersistentListModel() {
	}

	public PersistentListModel(Integer listId, String key, String listProvider, String description, Date dateCreated) {
		this.listId = listId;
		this.key = key;
		this.listProvider = listProvider;
		this.description = description;
		this.dateCreated = dateCreated;
	}

	public String getListProvider() {
		return listProvider;
	}

	public void setListProvider(String listProvider) {
		this.listProvider = listProvider;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Integer getListId() {
		return listId;
	}

	public void setListId(Integer listId) {
		this.listId = listId;
	}
}

