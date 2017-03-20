<%--
  Created by IntelliJ IDEA.
  User: Mxia
  Date: 2017/3/17
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">
    <form action="/hello/hello.do" method="post">
        <input type="text" name="name">
        <input type="text" name="address"/>
        <button type="submit">保存</button>
    </form>

    
</div>
<h2>hello struts !!</h2>
<ul>
    <c:forEach items="${nameList}" var="num">
        <li>
                ${num}|${name}

        </li>
    </c:forEach>

</ul>

</body>
</html>
