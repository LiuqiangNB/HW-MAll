<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>确认订单</title>
</head>
<body>
	<div align="center">
		<h1>修改地址</h1>
		<form action="updateAddress" method="get">
			<input type="hidden" name="a_id" value="${t_addr.a_id}">
			*收货人:<input type="text" name="receive_name" id="receive_name" value="${t_addr.receive_name}"><br>
			*手机号码:<input type="text" name="phone_num" id="phone_num" value="${t_addr.phone_num}">
			备选号码:<input type="text" name="phone_other" id="phone_other" value="${t_addr.phone_other}"><br>
			*收货地址:<input type="text" name="address" id="address" value="${t_addr.address}">
			<input type="submit" value="取消"> &nbsp&nbsp
			<input type="submit" value="保存并使用">
		</form>
	</div>
	
</body>
</html>