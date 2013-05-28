package com.favccxx.favjcs.web;

import org.apache.log4j.Logger;

import com.favccxx.favjcs.core.CacheFactory;
import com.favccxx.favjcs.model.CoolBoy;
import com.favccxx.favjcs.service.CacheService;

public class TestCache {

	private static Logger logger = Logger.getLogger(TestCache.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CacheFactory.initCache();
//		CacheFactory.getCacheWrapper("coolBoy");
		Object obj = CacheService.getCacheObj("coolBoyCache", "favccxx");
		if(obj != null){
			CoolBoy coolBoy = (CoolBoy)obj;
			logger.debug("coolBoy Height:" + coolBoy.getBoyHeight());
		}
		
	}

}
