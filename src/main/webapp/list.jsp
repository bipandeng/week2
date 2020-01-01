<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css3/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<td colspan="9">
				<form action="list" method="post">
					商品名称:<input type="text" name="name" value="${name }"> 英文名称:<input
						type="text" name="ename"> 尺寸:<input type="text"
						name="size"> 单价:<input type="text" name="price"> <input
						type="submit" value="搜索">
					<button>
						<a href="addGoods.jsp">添加</a>
					</button>
					<input type="button" onclick="dels()" value="批量删除">
				</form>
			</td>
		</tr>
		<tr>
			<th><input type="checkbox" onclick="fan()"></th>
			<th>商品名称</th>
			<th>英文名称</th>
			<th>尺寸</th>
			<th>单价(元)</th>
			<th>数量</th>
			<th>标签</th>
			<th>图片</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${pp.list }" var="tt">
			<tr>
				<td><input type="checkbox" name="ff" value="${tt.id }"></td>
				<td>${tt.name}</td>
				<td>${tt.ename}</td>
				<td>${tt.size}</td>
				<td>${tt.price}</td>
				<td>${tt.number}</td>
				<td>${tt.log}</td>
				<td><img alt="无图片" src="${tt.img }" width="150px"
					height="150px"></td>
				<td><a href="">商品详情</a> <a href="">商品编辑</a> <a href="">删除</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="9">当前${pp.pageNum }/${pp.pages }页,共有${pp.total }条数据
				<a href="list?pageNum=${pp.firstPage }">首页</a> <a
				href="list?pageNum=${pp.prePage }">上一页</a> <a
				href="list?pageNum=${pp.nextPage }">下一页</a> <a
				href="list?pageNum=${pp.lastPage }">末页</a>
			</td>
		</tr>
	</table>

</body>
</html>