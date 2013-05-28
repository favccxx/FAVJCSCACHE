package com.favccxx.favjcs.service;

import com.favccxx.favjcs.model.CoolBoy;
public class CacheBoyService {
	
	private static String cacheWrapper = "coolBoyCache";
	
	public static void putCacheBoy(){
		CoolBoy coolBoy = new CoolBoy();
		coolBoy.setBoyHeight(175);
		coolBoy.setBoyName("Cool Boy");
		coolBoy.setHairColor("Brown");
		coolBoy.settShirt("T-Shirt");
		
		CacheService.putCache(cacheWrapper, "favccxx", coolBoy);
		
	}
	
	public static CoolBoy getCacheBoy(String cacheKey){
		Object cacheBoy = CacheService.getCacheObj(cacheWrapper, cacheKey);
		if(cacheBoy != null){
			CoolBoy coolBoy = (CoolBoy)cacheBoy;
			return coolBoy;
		}
		return null;
	}
	
	
	
}
