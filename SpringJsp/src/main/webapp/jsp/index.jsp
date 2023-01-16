<html>
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>
<body>
<div class="contenitore">
    <div class="immagine" style=" position: relative; text-align: center; color: white;">
        <img src="../background.jpg" class="img-fluid" alt="...">
        <h1 style="position: absolute; top: 25%; left: 50%;
        transform: translate(-50%, -50%); font-size: 90px;">Ciao mi chiamo Hedrick Matamorosa</h1>
        <h1 style="position: absolute; top: 40%; left: 50%;
            transform: translate(-50%, -50%);">Sono un Programmatore</h1>
        <a href="${pageContext.request.contextPath}/getAll"><button type="button" class="btn btn-secondary" style="position: absolute; top: 50%; left: 50%;
            transform: translate(-50%, -50%); opacity: 0.8;" >Vuoi vedere i miei progetti?</button></a>
    </div>
</div>
</body>
<jsp:include page="script.jsp"></jsp:include>