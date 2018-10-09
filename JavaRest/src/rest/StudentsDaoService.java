package rest;

import rest.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsDaoService {
//to do 1. Pasikurti connection
    //2. sukurti metoda kuris grazina result set

    private Connection connection;

    StudentsDaoService() {       //konstruktorius
        connection = DbConnection.CreateConnection();
        if (connection == null) {   //patikrinimas ar yra connection
            throw new IllegalArgumentException("Ei nera connection");
        }
    }

    public static void updateStudent(Student student) {  //keliavimas i DB  UPDATE
        String sql = "update student set name = ?, Surname = ?, Email = ?, Phone = ? where id ?";


        PreparedStatement preparedStatement = connection.preparedStatement(sql);

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
    //protected Student getStudent(int id);{
    // try {
    //PreparedStatement preparedStatement = connection.preparedStatement("Select * from student where id - ?");


    private Student selectStudentData(ResultSet resultSet) {
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

    public void createStudent(Student student) {
        try {
            String sql = "insert into student(name, surname, phone, email)values (?, ?, ?, ? ";   //iterpimas i lentele
            PreparedStatement preparedStatement = connection.preparedStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getEmail());
            preparedStatement.execute();   //ivykdymas
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) { //sukuriamas is kitos grupes
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("delete student where id=? ");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();  //ivykdymas
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
