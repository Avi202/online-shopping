<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">
		<!-- Would be to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- Would be to display the actual product -->
		<div class="col-md-9">
			<!-- Added Breadcrumb Component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClicksAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home /</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClicksCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home / </a></li>
							<li class="active">Category /</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>