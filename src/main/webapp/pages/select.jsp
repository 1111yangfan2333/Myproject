<%--
  Created by IntelliJ IDEA.
  User: 54933
  Date: 2019/8/23 0023
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="../layui/jquery-1.10.2.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <script src="../layui/layui.js"></script>
</head>

<body>

<form class="layui-form" action="/select/findByName">
    <div class="layui-form layui-form-pane demoTable">
        <div class="layui-form-item">
            <label class="layui-form-label">题目名称</label>
            <div class="layui-input-block">
                <input type="text" name="coursename" required lay-verify="required" placeholder="请输入题目名称"
                       autocomplete="off" class="layui-input">
            </div>
        </div>

        <div class="layui-form-item">
            <label class="layui-form-label">选择框</label>
            <div class="layui-input-block">
                <select name="kemu" lay-verify="required">
                    <option value=""></option>
                    <option value="Java">Java</option>
                    <option value="Python">Python</option>
                    <option value="前端">前端</option>
                    <option value="C">C#</option>
                    <option value="C++">C++</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">单选框</label>
            <div class="layui-input-block">
                <input type="radio" name="Qtype" value="选择题" title="选择题" checked>
                <input type="radio" name="Qtype" value="判断题" title="判断题">
                <input type="radio" name="Qtype" value="填空题" title="填空题">
                <input type="radio" name="Qtype" value="简答题" title="简答题">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <%--<button class="layui-btn " data-type="reload" lay-submit lay-filter="formDemo">查询</button>--%>
                <button class="layui-btn " lay-submit lay-filter="formDemo">查询</button>
                <a href="back">
                    <button class="layui-btn layui-btn-primary " type="reset" id="reset">重置</button>
                </a>
            </div>
        </div>
    </div>
    </div>
</form>
</div>

<table class="layui-hide" id="test"></table>
<script>

    //分页
    layui.use('table', function () {
        var table = layui.table;
        table.render({
            elem: '#test'
            , url: '/Jianda/findAll'
            , limit: 5
            , startByZero: 0
            , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
                , curr: 1 //设定初始在第 5 页
                , groups: 10 //只显示 1 个连续页码
                , first: true //不显示首页
                , last: true //不显示尾页
            }
            , cols: [[
                {field: 'title', title: '题目', sort: true}
                , {field: 'option1', title: '选项一', sort: true}
                , {field: 'option2', title: '选项二', sort: true}
                , {field: 'option3', title: '选项三', sort: true}
                , {field: 'option4', title: '选项四', sort: true}
                , {field: 'answer', title: '正确答案', sort: true}
                , {field: 'typeid', title: '科目', sort: true}
                , {field: 'testQuestionId', title: '题型', sort: true}
            ]]
            ,id: 'testReload'
        });
        layui.use('form', function () {
            var form = layui.form;
            form.on('submit(formDemo)', function (data) {
                var formData = data.field;
                var coursename = formData.coursename,
                    kemu = formData.kemu,
                    url=formData.url,
                    Qtype = formData.Qtype;
                //执行重载
                table.reload('testReload',{
                    limit: 5
                    , startByZero: 0
                    , url: '/select/findByName',//后台做模糊搜索接口路径
                    page: {
                        layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
                        , curr: 1 //设定初始在第 5 页
                        , groups: 10 //只显示 1 个连续页码
                        , first: true //不显示首页
                        , last: true //不显示尾页
                    }
                    , where: {//这里传参  向后台
                        coursename: coursename,
                        kemu: kemu,
                        Qtype: Qtype
                        //可传多个参数到后台...  ，分隔
                    }
                    , method: 'post'
                    , cols: [[
                        {field: 'title', title: '题目', sort: true}
                        , {field: 'option1', title: '选项一', sort: true}
                        , {field: 'option2', title: '选项二', sort: true}
                        , {field: 'option3', title: '选项三', sort: true}
                        , {field: 'option4', title: '选项四', sort: true}
                        , {field: 'answer', title: '正确答案', sort: true}
                        , {field: 'typeid', title: '科目', sort: true}
                        , {field: 'testQuestionId', title: '题型', sort: true}
                    ]]
                });
                return false;//false：阻止表单跳转  true：表单跳转
            });
        });

    });
</script>
</body>
</html>
