<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discount Price Calculator</title>
</head>
<body>
	<center>

		<a href="/getDiscountedPrice?lang=">English</a> <a
			href="/getDiscountedPrice?lang=ge">German</a> <a
			href="/getDiscountedPrice?lang=fr">French</a>

		<form:form action="calculateDiscountedPrice" method="GET"
			modelAttribute="product">
			<table>

				<tr>
					<td><spring:message code="label.productPrice" /></td>
					<td><form:input path="productPrice" name="productPrice"
							id="productPrice" /></td>
					<td><form:errors path="productPrice" /></td>
				</tr>

				<tr>
					<td><spring:message code="label.productType" /></td>
					<td><form:select path="productType" name="productType"
							id="productType" items="${productTypeList}" /></td>

				</tr>

				<tr>
					<td><input type="submit" id="calculateDiscountPrice"
						name="calculateDiscountPrice"
						value="<spring:message code='label.submit' />" /></td>
					<td><input type="reset" id="clear" name="clear"
						value="<spring:message code='label.clear' />" /></td>
				</tr>

			</table>
		</form:form>
	</center>
</body>
</html>