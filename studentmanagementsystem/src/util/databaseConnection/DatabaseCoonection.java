package util.databaseConnection;

import java.sql.*;
public interface DatabaseCoonection {
    public static Statement connectAndGetStatement()
    {
        class PrivateInformation
    {
        private  final String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
        private  final String username = "root";
        private  final String password= "";

        public String getUrl() {
            return url;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }

    try {
        PrivateInformation myInformation = new PrivateInformation();
        Connection conn = DriverManager.getConnection(myInformation.getUrl(), myInformation.getUsername(), myInformation.getPassword());
        System.out.println("Connection was successful");
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

    }
    catch(SQLException e)
    {
        System.out.println("Something happened while trying to connect");
    }
        return null;
    }
}
