package org.app.mrmobile.service.impl;

import org.app.mrmobile.dtos.MrRequest;
import org.app.mrmobile.dtos.MrResponse;
import org.app.mrmobile.service.MrAppService;
import org.springframework.stereotype.Component;

@Component
public class MrAppServiceImpl implements MrAppService {

	@Override
	public MrResponse getMrName(MrRequest mrRequest) {
		MrResponse mrResponse = new MrResponse();
		mrResponse.setInputNamename(mrRequest.getName());
		mrResponse.setOutputNamr("Mr "+mrRequest.getName());
		mrResponse.setAddress("Balewadi Pune");
		return mrResponse;		
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return "Pune";
	}

	
}
