<%@ page import="java.util.List" %>
<%@ page import="com.servlet.pojo.Rune" %>
<%@ page import="com.servlet.handle.RuneController" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Have we go!</title>
  </head>
  <body>
    <h1>DiabloII Rune Word</h1>
    <a href="back.jsp">Manager Web</a>
    <table border="1px">
        <tr>
          <td>符文编号</td>
          <td>符文名</td>
          <td>武器效果</td>
          <td>盔甲效果</td>
          <td>盾牌效果</td>
        </tr>
        <%
            RuneController rc = new RuneController();
            List<Rune> runeList = rc.getRunes();
            request.setAttribute("runeList", runeList);
        %>
        <c:forEach items="${requestScope.runeList}" var="rune">
          <tr>
            <td>${rune.id}</td>
            <td>${rune.runeName}</td>
            <td>${rune.weapInfo}</td>
            <td>${rune.armrInfo}</td>
            <td>${rune.shidInfo}</td>
          </tr>
        </c:forEach>
        <% request.removeAttribute("runeList"); %>
    </table>
  </body>
</html>