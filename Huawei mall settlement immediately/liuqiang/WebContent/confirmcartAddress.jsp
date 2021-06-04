<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>确认订单</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<td>姓名</td>
				<td>电话号码</td>
				<td>备用号码</td>
				<td>地址</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${addrList}" var="a">
				<tr>
					<td>${a.receive_name}</td>
					<td>${a.phone_num}</td>
					<td>${a.phone_other}</td>
					<td>${a.address}</td>
					<td>
						<a href="http://localhost:8080/HW_shop/toUpdateAddress?a_id=${a.a_id}">编辑</a>
							&nbsp;|&nbsp;
						<a href="http://localhost:8080/HW_shop/deleteAddress?a_id=${a.a_id}">删除</a>
					</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>