<%@ page import="java.util.Arrays" %>
<%@ page language="java" trimDirectiveWhitespaces="true" pageEncoding="UTF-8" contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="listVo" type="com.sw.bbs.vos.ListVo"--%>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${listVo.name == null ? "게시판 오류" : listVo.name}</title>
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp"%>
<main>
    <h1>${listVo.name}</h1>
    <table>
        <thead>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성 일시</th>
            <th>조회수</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${Arrays.stream(listVo.articles).count() == 0}">
            <tr>
                <td colspan="5"><i>작성된 게시글이 없습니다.</i></td>
            </tr>
        </c:if>
        <c:forEach var="article" items="${listVo.articles}">
            <tr>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
</body>
</html>