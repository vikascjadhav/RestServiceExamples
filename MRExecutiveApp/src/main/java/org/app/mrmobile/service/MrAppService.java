package org.app.mrmobile.service;

import org.app.mrmobile.dtos.MrRequest;
import org.app.mrmobile.dtos.MrResponse;
import org.springframework.stereotype.Service;

@Service
public interface MrAppService {
	public MrResponse getMrName(MrRequest mrRequest);
	
	public String getLocation();
}
