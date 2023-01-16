<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>
<body style="background: linear-gradient(to top left, #99ffcc 0%, #ff9999 100%);">
<div class="container text-center" style="padding-top: 3rem;">
    <div class="row">
        <c:forEach var="lista" items="${lista}">
            <div class="card col" style="width: 30rem;margin-right: 1rem ;border-radius: 38px;
background: linear-gradient(45deg, #e7e6d9, #c2c2b7);
box-shadow:  39px -39px 89px #d4d3c7,
             -39px 39px 89px #dcdbcf;">
                <div class="card-body">
                    <h5 class="card-title"><c:out value="${lista.getNome()}"/></h5>
                    <h6 class="card-subtitle mb-2 text-muted"><c:out value="${lista.getSkill()}"/></h6>
                    <p class="card-text"><c:out value="${lista.getDescrizione()}"/></p>
                    <a href="${pageContext.request.contextPath}/deleteProgetto?id=${lista.getId()}" class="card-link">Cancella</a>
                    <a href="${pageContext.request.contextPath}/updateDaLista?id=${lista.getId()}" class="card-link">Modifica</a>
                </div>
            </div>
    </c:forEach>
    </div>
</div>



</body>
<jsp:include page="script.jsp"></jsp:include>