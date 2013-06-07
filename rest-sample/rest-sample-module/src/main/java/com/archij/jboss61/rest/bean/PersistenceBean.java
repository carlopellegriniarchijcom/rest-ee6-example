package com.archij.jboss61.rest.bean;

import javax.ejb.Stateless;

import com.archij.jboss61.rest.model.Device;

@Stateless
public class PersistenceBean {
	public void addDevice(Device d) {
	    try {
	        System.out.println("Device "+d.getId()+" added");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
