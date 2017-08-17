<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="collection" type="java.util.Collection"%> 

<ul>
<c:forEach items="${collection}" var="item">
  <li>${item}</li>  
</c:forEach>
</ul>
