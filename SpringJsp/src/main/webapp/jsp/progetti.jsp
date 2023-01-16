<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>
<body>
<div class="container text-center" style="padding-top: 3rem; margin-left: 5%; margin-right: 5%; text-align: center">
    <div class="row">
        <c:forEach var="lista" items="${lista}">
            <div class="card col" style="width: 30rem;">
                <div class="card-body">
                    <h5 class="card-title"><c:out value="${lista.getNome()}"/></h5>
                    <h6 class="card-subtitle mb-2 text-muted"><c:out value="${lista.getSkill()}"/></h6>
                    <p class="card-text"><c:out value="${lista.getDescrizione()}"/></p>
                </div>
            </div>
    </c:forEach>
    </div>
</div>



</body>
<jsp:include page="script.jsp"></jsp:include>