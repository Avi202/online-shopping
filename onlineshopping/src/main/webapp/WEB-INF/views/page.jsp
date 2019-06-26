<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="vendorcss" value="/resources/vendor/bootstrap/css" />
<spring:url var="vendorjs" value="/resources/vendor/bootstrap/js" />
<spring:url var="vendorjq" value="/resources/vendor/jquery" />
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Online Shopping - ${title}</title>
  <script>
      window.menu = '${title}';
  </script>
  <!-- Bootstrap core CSS -->
  <link href="${vendorcss}/bootstrap.min.css" rel="stylesheet">
  <!-- Bootstrap readable theme -->
  <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">
</head>
<body>
  <div class="wrapper">
  <!-- Navigation -->
  <%@include file="./shared/navbar.jsp" %>
  <!-- Page Content -->
  <div class="content">
  <c:if test="${userClicksHome == true}">
      <%@include file="pageContent.jsp" %>
  </c:if>
  <c:if test="${userClicksAbout == true}">
      <%@include file="about.jsp" %>
  </c:if>
  <c:if test="${userClicksContact == true}">
      <%@include file="contact.jsp" %>
  </c:if>
  <c:if test="${userClicksAllProducts == true or userClicksCategoryProducts == true}">
      <%@include file="listProducts.jsp" %>
  </c:if>
  </div>
  <!-- Footer comes here -->
  <%@include file="./shared/footer.jsp" %>
  </div>
  <!-- Bootstrap core JavaScript -->
  <script src="${vendorjq}/jquery.min.js"></script>
  <script src="${vendorjs}/bootstrap.bundle.min.js"></script>
  <!-- Self coded JavaScript -->
  <script src="${js}/myapp.js"></script>
</body>
</html>