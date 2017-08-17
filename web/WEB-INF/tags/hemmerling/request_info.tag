<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="p" tagdir="/WEB-INF/tags/myTagFolder/" %>
<div style="padding: 20px;background-color: greenyellow">
<!--<hr/>-->
<h3>Request Attributes</h3>
<p:map inputMap="${attributeSetter.getSortedMap(requestScope)}" />
<!--<hr/>-->
</div>
