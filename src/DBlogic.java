import java.sql.*;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/java_sql";
    String USER = "root";
    String PASS = "";

    // create
    public void register() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);

        Statement stmt = conn.createStatement();

        String sql = "insert into users (username, password) values ('shhdq', 'parole1234')";

        stmt.executeUpdate(sql);

        System.out.println("User created...");

    }

    // delete
    public void delete() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);

        Statement stmt = conn.createStatement();

        String sql = "delete from users where id = 1";

        stmt.executeUpdate(sql);

        System.out.println("User deleted...");

    }

    // update
    public void update() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);

        Statement stmt = conn.createStatement();

        String sql = "update users set password = 'jaunaparole' where id = 2";

        stmt.executeUpdate(sql);

        System.out.println("User updated...");

    }

    // select
    public void select() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select id, username, password from users");

        while (rs.next()) {
            System.out.println("id: " + rs.getInt("id"));
            System.out.println("username: " + rs.getString("username"));
            System.out.println("password: " + rs.getString("password"));
            System.out.println("----------------------------------------------");
        }




    }


}
