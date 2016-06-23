package com.ibm.crl.uaqm.system.vo;

import java.util.Date;

import com.ibm.crl.uaqm.common.BaseVO;

public class Event extends BaseVO{
	
	private static final long serialVersionUID = -6330043216129676853L;

	private String Event_ID;
	private String Name;
	private String Description;
	private Date Start_Date;
	private Date End_Date;
	public String getEvent_ID() {
		return Event_ID;
	}
	public void setEvent_ID(String event_ID) {
		Event_ID = event_ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(Date end_Date) {
		End_Date = end_Date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
