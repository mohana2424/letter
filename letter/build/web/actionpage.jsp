<%-- 
    Document   : actionpage
    Created on : 5 Sep, 2019, 1:09:35 PM
    Author     : MOHANA.J
--%>

<%@page import="post.script"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            int i=0;
            String qry;
            String sendername=request.getParameter("sendername");
            String receivername=request.getParameter("receivername");
            String sendernumber=request.getParameter("sendernumber");
            String receivernumber=request.getParameter("receivernumber");
            script s=new script();
            qry="insert into letter (sendername,receivername,senderno,receiverno)values('"+sendername+"','"+receivername+"','"+sendernumber+"','"+receivernumber+"')";
            try{
             i=s.insert(qry);
            }
            catch(Exception e){
                out.println("error : "+e);
            }
            if(i>0){
          %>  
          <script> alert("Success")</script>
          <% } %>
          <h1>Hello <%= sendername %>!</h1>
    </body>
</html>
