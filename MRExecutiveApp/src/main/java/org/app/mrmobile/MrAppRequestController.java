package org.app.mrmobile;

import org.app.mrmobile.dtos.MrRequest;
import org.app.mrmobile.dtos.MrResponse;
import org.app.mrmobile.service.MrAppServiceExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MrAppRequestController {

	private Logger logger = LoggerFactory.getLogger(MrAppRequestController.class);
	
	@Autowired
	MrAppServiceExecutor mrAppServiceExecutor;
	
	 @RequestMapping(value = "/getLocation", method = RequestMethod.POST,consumes =    "application/json", produces = "application/json")
	public String getLocation(@RequestBody MrRequest mrRequest) {
		 logger.info("Started getLocation");
		return mrAppServiceExecutor.getLocation();		
	}
	 
	 
	 
	 

	 @RequestMapping(value = "/test", method = RequestMethod.POST,consumes =    "application/json", produces = "application/json")
		public String test(){

			return "Test SuccessFul";		
		}
	 @RequestMapping(value = "/getMrName", method = RequestMethod.POST,consumes =    "application/json", produces = "application/json")
		public MrResponse getMrName(@RequestBody MrRequest mrRequest) {
		 	logger.info("Started getLocation");
			return mrAppServiceExecutor.getMrName(mrRequest);		
		}
} 	
