package rest; //rasosi po slash

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/example")  //rasosi po slash


public class FirstRestExample {
    @GET
    @Path("/sayHi")   //rasosi po slash
    public String sayHi(){
        return "Labas";  //ismeta i langa

    }
    @GET
    @Path("sayHi/{name}")
    public String sayHiToName (@PathParam("name") String userName) {
        return  "Labas , kaip gyveni? " + userName;
    }
    // "/students/1/student"  kai reikia istraukti viena
    @GET
    @Path("/student")
    @Produces (MediaType.APPLICATION_JSON)
    public Student getStudent(){
        return new Student (1, "Andrius" , "Baltrunas" , "a@kcs.com", "+370846693");
    }
    @GET   //metodo paleidimas
    @Path("/students")
    @Produces (MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        return buildDummydata();
    }

    private List<Student> buildDummydata(){   //metodas
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Andrius" , "Baltrunas" , "a@kcs.com", "+370846693"));
        students.add(new Student(2, "Jonas" , "Jonaitis" , "j@kcs.com", "+370856693"));
        students.add(new Student(3, "Petras" , "Petraitis" , "p@kcs.com", "+370834693"));

        return students;

    }

    @GET
    @Path("/student/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentById(@PathParam("id")int id){
        List<Student> students = buildDummydata();
        return students.stream().filter(s-> s.getId() == id).findFirst().get();  //s - trumpinys

    }

    @GET
    @Path("/saveStudent")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student saveStudent (Student student){
        student.setId(4);
        student.setName(student.getName() + "_changed");
        student.setLastName(student.getLastName() + "_changed");
        student.setEmail(student.getEmail() +"_changed");
        student.setPhone(student.getPhone() + "_changed");
        return student;

    }


}


