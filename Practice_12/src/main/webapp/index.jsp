<%-- 
    Document   : index
    Created on : 21 дек. 2022 г., 13:57:28
    Author     : Ярослав
--%>

<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        h1 {
            text-align: center;
        }
        #page {
            width: 800px;
            margin: auto;
        }
        form {
            width: 400px;
            margin: auto;
        }
        input[type=submit] {
            margin: auto;
        }
        body {
            background-image: url('https://p4.wallpaperbetter.com/wallpaper/290/826/480/pc-hd-1080p-nature-1920x1080-wallpaper-preview.jpg'); 
            background-repeat: no-repeat;
            background-size: 100%;
        }
    </style>
    <body>
        <form method="post" action="StudentAdd">
            <table>
                <tbody>
                    <tr>
                        <td><label for="name">Name</td>
                        <td><input id="name" type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td><label for="surname">Surname</td>
                        <td><input id="surname" type="text" name="surname"></td>
                    </tr>
                    <tr>
                        <td><label for="age">Age</td>
                        <td><input id="age" type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td><label for="email">Email</td>
                        <td><input id="email" type="text" name="email"></td>
                    </tr>
                    <tr>
                        <td><label for="group">Group</td>
                        <td><input id="group" type="text" name="group"></td>
                    </tr>
                    <tr>
                        <td><label for="faculty">Faculty</td>
                        <td><input id="faculty" type="text" name="faculty"></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" name="send" value="Send">
        </form>
        <c:if test="${students.size() > 0}">
            <table class="list">
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Age</th>
                    <th>Email</th>
                    <th>Group</th>
                    <th>Faculty</th>
                </tr>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td><c:out value="${student.getName()}"/></td>
                        <td><c:out value="${student.getSurname()}"/></td>
                        <td><c:out value="${student.getAge()}"/></td>
                        <td><c:out value="${student.getEmail()}"/></td>
                        <td><c:out value="${student.getGroup()}"/></td>
                        <td><c:out value="${student.getFaculty()}"/></td>
                    </tr>
                </c:forEach>
            </table>    
        </c:if>
    </body>
</html>

