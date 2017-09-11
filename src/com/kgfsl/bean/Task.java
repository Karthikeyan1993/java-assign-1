package com.kgfsl.bean;

import java.io.Serializable;

public class Task implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long tkid;
	private String tdesc;
	private String tCreatedBy;
	private String tAssignedTo;
	private String tstatus;
	private String tpriority;
	private String trisk;
	private String tcreated;
	private String tmodified;
	private boolean isActive;

	public long getTkid() {
		return tkid;
	}

	public void setTkid(long tkid) {
		this.tkid = tkid;
	}

	public String getTdesc() {
		return tdesc;
	}

	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}

	public String gettCreatedBy() {
		return tCreatedBy;
	}

	public void settCreatedBy(String tCreatedBy) {
		this.tCreatedBy = tCreatedBy;
	}

	public String gettAssignedTo() {
		return tAssignedTo;
	}

	public void settAssignedTo(String tAssignedTo) {
		this.tAssignedTo = tAssignedTo;
	}

	public String getTstatus() {
		return tstatus;
	}

	public void setTstatus(String tstatus) {
		this.tstatus = tstatus;
	}

	public String getTpriority() {
		return tpriority;
	}

	public void setTpriority(String tpriority) {
		this.tpriority = tpriority;
	}

	public String getTrisk() {
		return trisk;
	}

	public void setTrisk(String trisk) {
		this.trisk = trisk;
	}

	public String getTcreated() {
		return tcreated;
	}

	public void setTcreated(String tcreated) {
		this.tcreated = tcreated;
	}

	public String getTmodified() {
		return tmodified;
	}

	public void setTmodified(String tmodified) {
		this.tmodified = tmodified;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
