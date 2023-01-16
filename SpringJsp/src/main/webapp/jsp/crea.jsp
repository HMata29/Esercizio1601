<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<jsp:include page="head.jsp"></jsp:include>
<body >
<jsp:include page="navbar.jsp"></jsp:include>
<c:if test="${operation == true}">
    <div class="alert alert-success" role="alert">
        ok
    </div>
</c:if>

<div class="container" style="padding-top: 3rem" >
    <form action="${pageContext.request.contextPath}/creaProgetto" method="post">
        <div class="mb-3">
            <label for="nome" class="form-label">Nome</label>
            <input type="text" name="nome" class="form-control" id="nome" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="descrizione" class="form-label">Descrizione</label>
            <input type="text" name="descrizione" class="form-control" id="descrizione" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="skill" class="form-label">Skills</label>
            <input type="text" name="skill" class="form-control" id="skill">
        </div>
        <button type="submit" class="btn btn-primary">Crea</button>
    </form>
</div>
<br>
</body>
<jsp:include page="script.jsp"></jsp:include>