package com.favccxx.favjcs.core;

import org.apache.jcs.JCS;
import org.apache.jcs.access.exception.CacheException;
import org.apache.jcs.engine.CacheElement;

public class CacheWrapper {
	
	public JCS jcsCache = null;
	
	public CacheWrapper(JCS cache){
		this.jcsCache = cache;
	}
	
	public void put(String key , Object value){
		try{
			jcsCache.put(key, value);
		}catch(CacheException e){
			e.printStackTrace();
		}
	}
	
	public Object get(String key){
		CacheElement cacheElement = (CacheElement) jcsCache.getCacheElement(key);
        if (null != cacheElement) {
            Object object = cacheElement.val;
            return object;
        }
        return null;
	}
	
}
