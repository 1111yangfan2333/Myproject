<%--
  Created by IntelliJ IDEA.
  User: 54933
  Date: 2019/8/23 0023
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script type="text/javascript" src="jquery-1.10.2.js"></script>
<link rel="stylesheet" href="layui/css/layui.css">
<script src="layui/layui.js"></script>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">蜗牛考试系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">题库</a></li>
            <li class="layui-nav-item"><a href="">阶段小测</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    肖虎
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">题库管理</a>
                    <dl class="layui-nav-child">
                        <dd class="main_left a"><a data-src="select.html">新增试题</a></dd>
                        <dd class="main_left a"><a data-src="javascript:;">查询试题</a></dd>
                        <dd class="main_left a"><a data-src="javascript:;">修改试题</a></dd>
                        <dd class="main_left a"><a data-src="javascript:;">删除试题</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">出题系统</a>
                    <dl class="layui-nav-child">
                        <dd class="main_left a"><a data-src="javascript:;">随机出题</a></dd>
                        <dd class="main_left a"><a data-src="javascript:;">生成试卷</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">联系我们</a></li>
                <li class="layui-nav-item"><a href="">关于我们</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <div class="main_right">
                <iframe frameborder="0" scrolling="yes" style="width: 100%" src="" id="aa">
                </iframe>
            </div>
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    //Demo
    layui.use('form', function(){
        var form = layui.form;

//监听提交
        form.on('submit(formDemo)', function(data){
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
    $(function(){
        //获取src值
        $(".main_left a").on("click",function(){
            var address =$(this).attr("data-src");
            $("iframe").attr("src",address);
        });
        //一下代码是根据窗口高度在设置iframe的高度
        var frame = $("#aa");

        var frameheight = $(window).height();
        console.log(frameheight);
        frame.css("height",frameheight);
    });

</script>
</body>
</html>