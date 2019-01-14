<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-1-12
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Back Manager</title>
</head>
<body>
    <h1>Diablo II Background manager</h1>
    <a href="index.jsp">Index Web</a>
    <form action="insertrune.do" accept-charset="UTF-8">
        <input type="text" placeholder="符文名称" name="rune_name"><br><br>
        <input type="text" placeholder="对武器的效果" name="weap_info"><br><br>
        <input type="text" placeholder="对盔甲的效果" name="armr_info"><br><br>
        <input type="text" placeholder="对盾牌的效果" name="shid_info"><br><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>