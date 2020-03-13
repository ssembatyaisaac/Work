<!DOCTYPE html>
<html>

<head>
    <title>Murach's Java Servets and JSP</title>
</head>

<body>
    <%
        //get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");    
    %>
        <h1>Thanks for joining our email list</h1>
        <p>Here is the information that you entered: </p>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">First name: </td>
                <td><%= firs tName%></td>
            </tr>
            <tr>
                <td align="right">Last name: </td>
                <td>
                    <%= lastName%>
                </td>
            </tr>
            <tr>
                <td align="right">Email Address: </td>
                <td>
                    <%= emailAddress%>
                </td>
            </tr>
        </table>

        <p>To enter another email address, click on the Back <br>button in your browser or the Return button shown <br></p>
        <form action="join_email_list.html" method="POST">
            <input type="Sumbit" value="Return">
        </form>
</body>

</html>