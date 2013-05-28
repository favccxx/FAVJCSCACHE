package com.favccxx.favjcs.service;

import java.util.HashMap;
import java.util.Map;

import com.favccxx.favjcs.core.CacheFactory;
import com.favccxx.favjcs.core.CacheWrapper;

public class CacheService {
	
	private static Map<String, CacheWrapper> hashMapWrapper = new HashMap<String, CacheWrapper>(); 
	private static Map<String, Map<String, String>> keys = new HashMap<String, Map<String, String>>();
	
	static{
		hashMapWrapper.put("coolBoyCache", CacheFactory.getCacheWrapper("coolBoyCache"));
	}
	
	public CacheService(){
		hashMapWrapper.put("coolBoyCache", CacheFactory.getCacheWrapper("coolBoyCache"));
	}

	public static void putCache(String cacheName, String cacheKey, Object obj){
		if(cacheName == null || cacheKey == null || obj == null){
			return;
		}

		CacheWrapper cacheWrapper = hashMapWrapper.get(cacheName);
		if(cacheWrapper == null){
			return;
		}
		
		//TODO 未来在判断是否需要同步，做分布式缓存使用
		
		innerPutCache(cacheName,cacheKey,obj);
	}
	
	
	public static void innerPutCache(String cacheName, String cacheKey, Object obj){
		CacheWrapper cacheWrapper = hashMapWrapper.get(cacheName);
		cacheWrapper.put(cacheKey, obj);
		Map<String, String> ids = keys.get(cacheName);
		if (ids != null) {
			ids.put(cacheKey, cacheKey);
		}
	}
	
	
	public static Object getCacheObj(String cacheName,String cacheKey){
		if(cacheName == null || cacheKey == null){
			return null;
		}
		
		CacheWrapper cacheWrapper = hashMapWrapper.get(cacheName);
		if(cacheWrapper == null){
			return null;
		}
		
		Object obj = cacheWrapper.get(cacheKey);
		if(obj != null){
			cacheWrapper.put(cacheKey, obj);
		}
		return obj;
	}

}
