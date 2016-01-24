package org.app.mrmobile.service;

import org.app.mrmobile.dtos.MrRequest;
import org.app.mrmobile.dtos.MrResponse;
import org.app.mrmobile.service.impl.MrAppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MrAppServiceExecutor  {

	@Autowired
	MrAppServiceImpl mrAppServiceImpl;
	
	public MrResponse getMrName(MrRequest mrRequest) {		
		return mrAppServiceImpl.getMrName(mrRequest);		
	}
	
	public String getLocation(){
		return mrAppServiceImpl.getLocation();
	}
}
