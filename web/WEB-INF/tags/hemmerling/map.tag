<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="inputMap" type="java.util.Map"%> 

<ul>
<c:forEach items="${inputMap}" var="item">
  <li>${item.key}=${item.value} - (${item.value.getClass().simpleName})</li>  
</c:forEach>
</ul>
