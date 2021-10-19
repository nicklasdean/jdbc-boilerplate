import java.sql.*;

public class ConnectionExample {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/[YOUR DATABASE NAME]","[YOUR USERNAME]","[YOUR PASSWORD]");
            PreparedStatement psts = conn.prepareStatement("SELECT * from employees");
            ResultSet resultSet = psts.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString(2));
            }

        }catch(SQLException e){
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }
    }
}
