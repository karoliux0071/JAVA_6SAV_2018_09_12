import java.sql.*;

public class mymainapp {   //klase kuri paleidzia programa
   public static void main(String[] args) {
       Connection connection = DBconnection.creatConnection();

       if (connection != null) {
           System.out.println("Prisijungeme");  //connection sukurimas

           try {
               Statement st = connection.createStatement();

               ResultSet resultSet = st.executeQuery("SELECT * FROM students");  //paima viska is students lenteles
               while (resultSet.next()) {
                   int id = resultSet.getInt("studentsid");  //stulpeliu pavadinimai
                   String name = resultSet.getString("name");
                   String surname = resultSet.getString("surname");
                   String phone = resultSet.getString("phone");
                   String email = resultSet.getString("email");
                   System.out.println(name + " " + surname + " " + phone + " " + email);

               }

           } catch (SQLException e) {
               e.printStackTrace();
           }
       }
   }


       private static void insertNewStudent(Connection connection, String name, String surname, String email, String phone){
           if(connection != null) {
               try {
                   PreparedStatement st = connection.prepareStatement("insert into students(name, surname, email,)values(?, ?, ?, ?)"); //2                   st.setString(1, name);
                   st.setString(2, surname);
                   st.setString(3, phone);
                   st.setString(4, email);
                   st.execute();  // butinai!   3
               } catch (SQLException e) {
                   System.out.println (e);
               }

           }
       }

       private static void updateStudent(Connection connection, int id, String name) {  //update funkcija
       if (connection != null) {
           try {
               PreparedStatement st = connection.prepareStatement("update student, set name=?, where id=?");
               st.setString(2, name);
               /// st.setString(1, );
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }



       }




   }

