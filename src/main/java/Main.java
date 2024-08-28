import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;


class Main {

    public static void main(String[] args) throws SQLException {
        // JDBC

        String url = "jdbc:mysql://localhost:3306/testdb";
        String userName = "root";
        String password = "";

        Connection conncetion = null;
        Statement statement = null;
        ResultSet results = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conncetion = DriverManager.getConnection(url, userName, password);

             statement = conncetion.createStatement();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please choose the option: ");
            System.out.println("1. Registration");
            System.out.println("2. Authorisation ");

            String userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1": {
                    System.out.println("Please enter ur name: ");
                    String userRegName = scanner.nextLine();
                    System.out.println("Please enter ur email: ");
                    String userRegEmail = scanner.nextLine();


                    userRegistration(conncetion, userRegEmail, userRegName);
                }
                case "2": {

                }
                default: {
                    System.out.println("Something went wrong!");
                }
            }
             results = statement.executeQuery("SELECT * FROM users");

//            id, email, name
            while (results.next()) {
                int id = results.getInt("id");
                String email = results.getString("email");
                String firstname = results.getString("firstname");


                System.out.println("[ID] " + id);
                System.out.println("[EMAIL] " + email);
                System.out.println("[firstname] " + firstname);
                System.out.println("------------------------");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            if(result == null) { result.close(); }
//            if(statement == null) { statement.close(); }
//            if(results == null) { result.close(); }
        }
    }
    public static void userRegistration(Connection conncetion, String e, String un) throws SQLException {
        try {
            String query = "INSERT INTO users(email, firstname) VALUE (?, ?)";
            PreparedStatement statement = conncetion.prepareStatement(query);
            statement.setString(1, e);
            statement.setString(2, un);

            int changCounter = statement.executeUpdate();

            if(changCounter > 0) {
                System.out.println("User was successfully registered!");
            }else {
                System.out.println("Something went wrong!");
            }
        }catch (SQLException err) {
            err.printStackTrace();
        }

    }


}