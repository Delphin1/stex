<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="com.tsg.stex.model.Message" %>
<%@ page import="com.tsg.stex.service.stexService" %>
<%@ page import="com.tsg.stex.model.Item" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <link rel="stylesheet" type="text/css" href="./css/style.css"  />
    <meta charset="UTF-8">
    <title>StackExchange Search</title>
</head>
<body>
    <div class="center">
        <form action="stex" method="get">
            <input type="text" name="q"  placeholder="Type what you're looking for" size="100"/>
            <input type="submit" value="Send"/>
        </form>
    </div>
    <div class="out">
        <%

            //String q = (String) session.getAttribute("q");
            String q = (String) request.getAttribute("q");
            if (q != null) {
                out.println("q: " + q);
                Message message = stexService.stexSearch(q);
                out.println("size: " + message.getItems().size());
                if ((message != null) && (message.getItems().size()>0)) {
        %>
                    <table>
                        <tr>
                            <th>Creation date</th><th>Title</th><th>Owner</th>
                        </tr>
        <%
                for (Item i : message.getItems()) {
                    if (i.getIs_answered()) {
                        %><tr class="answered"><%
                    } else {
                        %><tr><%
                    }
        %>
                        <td nowrap><%=i.getCreation_dateStr()%></td><td><a href="<%=i.getLink()%>"><%=i.getTitle()%></a></td><td><a href="<%=i.getOwner().getLink()%>"><%=i.getOwner().getDisplay_name()%></a></td></tr>
        <%        }

        %>

                    </table>

        <%        }
            }
            else {
                out.println("q is null!");
            }

        %>
    </div>
</body>
</html>