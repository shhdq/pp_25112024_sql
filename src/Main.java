import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        DBlogic db = new DBlogic();

        db.select();
    }
}