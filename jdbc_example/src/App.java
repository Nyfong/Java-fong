
import java.sql.*;

public class App {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection to the database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");

            // Create a Statement object to execute the query
            stmt = con.createStatement();

            // Execute the SQL query
            rs = stmt.executeQuery("SELECT * FROM test");

            // Process the ResultSet
            while (rs.next()) {
                // Retrieve values from the ResultSet
                int id = rs.getInt("id");         // Get the 'id' column
                String name = rs.getString("name"); // Get the 'name' column
                int age = rs.getInt("age");       // Get the 'age' column

                // Print the retrieved values
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Close resources in the reverse order of creation
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
