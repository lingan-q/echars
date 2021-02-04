<%--
  Created by IntelliJ IDEA.
  User: Computer
  Date: 2020/12/23
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="commons/head.jsp"%>
<html>
<head>
    <title>登录页面</title>
    <style>
        input{
            width: 100px;
        }
        .formDiv{
            display: inline-block;
            height: 500px;
            width: 600px;
            position: relative;
            top: 200px;
            left: 600px;
        }
        span{
            display: inline-block;
            font-size: 12px;
            color: red;
        }
    </style>
    <script>
        $(function () {

        })
    </script>
</head>
<body>
<div class="formDiv">
    <form class="form-horizontal" method="post" action="user/login.do">
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">用户名:</label>
            <div class="col-sm-10" style="width: 200px">
                <input type="text" class="form-control" id="inputEmail3" placeholder="username">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">密码:</label>
            <div class="col-sm-10" style="width: 200px">
                <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
                <span>${login}</span>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">登录</button>
            </div>
        </div>
    </form>
</div>

</body>
</html>
