<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="resources/css/style.css"/>"/>
  </head>
  <body>
<jsp:include page="header.jsp"/>

<section class="login-page">
  <h2>Zaloguj się</h2>
  <form action="/login" method="post" name = "f">
    <div class="form-group">
      <input type="username" name="username" placeholder="Email" value=""/>
    </div>
    <div class="form-group">
      <input type="password" name="password" placeholder="Hasło" />
      <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
    </div>

    <div class="form-group form-group--buttons">
      <a href="<c:url value="/register" />" class="btn btn--without-border">Załóż konto</a>
      <button class="btn" type="submit" name="submit">Zaloguj się</button>
    </div>
  </form>
</section>


<jsp:include page="footer.jsp"/>
  </body>
</html>
