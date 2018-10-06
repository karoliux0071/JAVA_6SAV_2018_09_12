import rest.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentsDaoService {
//to do 1. Pasikurti connection
    //2. sukurti metoda kuris grazina result set

    private Connection connection;

    StudentsDaoService() {       //konstruktorius
      connection = DbConnection.CreateConnection();
      if(connection == null) {   //patikrinimas ar yra connection
          throw new IllegalArgumentException("Ei nera connection");
      }
    }

    protected List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
             students.add(selectStudentData(resultSet));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    private Student selectStudentData(ResultSet resultSet){
        Student student = null;
        try {
            int id = resultSet.getInt("id");   //istraukia visus reikiamus parametrus
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            student = new Student(id, name, surname, email, phone);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }
}
