<html>
<#include "../common/header.ftl">
<link rel="stylesheet" href="../../css/login.css">
<body>
    <#--主要内容content-->
    <div class="container">
        <form role="form" method="post" action="/sell/seller/user/login"class="form-signin" role="form">
            <h2 class="form-signin-heading"><i class="glyphicon glyphicon-user"></i> 用户登录</h2>
            <div class="form-group has-success has-feedback">
                <input type="text" class="form-control" name="username" placeholder="请输入登录账号">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-success has-feedback">
                <input type="text" class="form-control" name="password" placeholder="请输入登录密码" style="margin-top:10px;">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <button type="submit" class="btn btn-lg btn-success btn-block">登 陆</button>
        </form>
    </div>

</div>
</body>
</html>