package com.favccxx.favjcs.core;

import java.io.InputStream;
import java.util.Properties;

public class CacheProxy {
	
	private static boolean cacheEnabled = false;
	private static String cacheURL = null;

	/**
	 * 获取CacheServer的配置信息
	 * @throws Exception
	 */
	public static void init()throws Exception{
		InputStream in = null;
		try{
			in = CacheProxy.class.getClassLoader().getResourceAsStream("cacheserver.properties");
			Properties props = new Properties();
			props.load(in);
			if(props.getProperty("cacheEnabled") != null && "true".equals(props.getProperty("cacheEnabled"))){
				cacheEnabled = true;
			}
			if(props.getProperty("cacheURL") != null){
				cacheURL = props.getProperty("cacheURL");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(in != null){
				in.close();
			}
		}
	}
	
	
	
}
