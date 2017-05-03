<html>
<head>
    <title>学生信息</title>
    <link href="${request.contextPath}/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>
<body style="margin-top:50px;overflow: hidden;">
<form action="${request.contextPath}/student/save" method="post">
    <input type="hidden" name="id" value="<#if student.id??>${student.id}</#if>"/>
    <table class="gridtable" style="width:800px;">
        <tr>
            <th colspan="5">学生信息 - [<a href="${request.contextPath}/student">返回</a>]</th>
        </tr>
        <tr>
            <th>姓名：</th>
            <td><input type="text" name="name" value="<#if student.name??>${student.name}</#if>"/>
            </td>
            <th>学号：</th>
            <td><input type="text" name="stu_no" value="<#if student.stu_no??>${student.stu_no}</#if>"/>
            </td>
            <td><input type="submit" value="保存"/></td>
        </tr>
    <#if msg??>
        <tr style="color:#00ba00;">
            <th colspan="5">${msg}</th>
        </tr>
    </#if>
    </table>
</form>
</body>
</html>
