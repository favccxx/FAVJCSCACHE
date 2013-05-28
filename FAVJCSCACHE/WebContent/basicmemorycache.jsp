<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JCS(Java Caching System)内存缓存测试</title>
</head>
<body style="text-align:center;margin:0px 0px">
	<form action="writeMemory">
		<h1>内存缓存测试</h1>
		<div style = "text-align:center">
			<div style = "float:left;width:600px;margin-left:20px">
				<h2>将CoolBoy写入缓存</h2>
				<div style="margin-top:15px;">
					<div style="display:inline-block">
						<label>姓名：</label>
						<input name="boyName" type="text" value="">
					</div>
				</div>
				<div style="margin-top:15px;">
					<div style="display:inline-block">
						<label>年龄：</label>
						<input name="boyAge" type="text" value="">
					</div>
				</div>
				<div style="margin-top:15px;">
					<div style="display:inline-block">
						<label>头发：</label>
						<input name="hairColor" type="text" value="">
					</div>
				</div>
				<div style="margin-top:15px;">
					<input type="submit" value="写入缓存">
				</div>
			</div>
			<div style="float:right;width:600px;margin-right:20px">
				<h2>从缓存中读取CoolBoy</h2>
			</div>
		</div>
	</form>
</body>
</html>