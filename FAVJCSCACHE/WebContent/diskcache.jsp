<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>硬盘缓存</title>
</head>
<body>
	<div style="text-align:center">
		<h1>硬盘缓存配置文件的属性</h1>
		<div style="text-align:left;">
			##############################################################
			####################Below is the disk cache###################
			jcs.default=DC
			jcs.default.cacheattributes=org.apache.jcs.engine.CompositeCacheAttributes
			jcs.default.cacheattributes.MaxObjects=1000
			jcs.default.cacheattributes.MemoryCacheName=org.apache.jcs.engine.memory.lru.LRUMemoryCache
			    
			    
			jcs.auxiliary.DC=org.apache.jcs.auxiliary.disk.indexed.IndexedDiskCacheFactory
			jcs.auxiliary.DC.attributes=org.apache.jcs.auxiliary.disk.indexed.IndexedDiskCacheAttributes
			jcs.auxiliary.DC.attributes.DiskPath=g:/dev/jcs/raf
			
			############################# Optional ##############################
			jcs.region.testCache1=DC
			jcs.region.testCache1.cacheattributes=
			    org.apache.jcs.engine.CompositeCacheAttributes
			jcs.region.testCache1.cacheattributes.MaxObjects=1000
			jcs.region.testCache1.cacheattributes.MemoryCacheName=
			    org.apache.jcs.engine.memory.lru.LRUMemoryCache
			jcs.region.testCache1.cacheattributes.UseMemoryShrinker=true
			jcs.region.testCache1.cacheattributes.MaxMemoryIdleTimeSeconds=3600
			jcs.region.testCache1.cacheattributes.ShrinkerIntervalSeconds=60
			jcs.region.testCache1.cacheattributes.MaxSpoolPerRun=500
			jcs.region.testCache1.elementattributes=org.apache.jcs.engine.ElementAttributes
			jcs.region.testCache1.elementattributes.IsEternal=false
			##############################################################
		</div>
		<div style="width:45%;float:left;">
			<h2>写入硬盘缓存</h2>
			
		</div>
		<div style="width:45%;float:right;">
			<h2>读取硬盘缓存</h2>
		</div>
	</div>
</body>
</html>