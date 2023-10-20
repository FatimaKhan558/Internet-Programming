<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Drink Selection</title>
</head>
<body>
    <h1>Select a Drink:</h1>
    
    <form action="processSelection.jsp" method="post">
        <select name="selectedDrink">
            <%
                String url = "jdbc:mysql://localhost:3306/Database"; // Change this URL according to your database configuration
                String user = "yourUsername"; // Change this to your database username
                String password = "yourPassword"; // Change this to your database password

                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(url, user, password);

                    String query = "SELECT name, rate FROM beverages";
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery(query);

                    while (resultSet.next()) {
                        String name = resultSet.getString("name");
                        int rate = resultSet.getInt("rate");
            %>
            <option value="<%= name %>"><%= name %> - $<%= rate %></option>
            <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (resultSet != null) resultSet.close();
                    if (statement != null) statement.close();
                    if (connection != null) connection.close();
                }
            %>
        </select>
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
