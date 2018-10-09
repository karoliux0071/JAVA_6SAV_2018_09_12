package rest;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/student")

public class StudentRest {

    @GET
    @Path("/all")
    @Produces (MediaType.APPLICATION_JSON)
    public List<Student> getAllStudents() {
        StudentsDaoService studentDoaService = new StudentsDaoService();
        List<Student> students = studentDoaService.getStudents();
        // to do kaip gauti duomenis is DB
        return students;
   // }
    //@GET
   // @Path("/{id}")
   // @Produces (MediaType.APPLICATION_JSON)
    //public Student returnStudent() {
      //  StudentsDaoService sdt = new StudentsDaoService();

        //return student;


    }
    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveStudent (Student student) {
        //StudentsDaoService studentsDaoService - new StudentsDaoService();
        //studentsDaoService.createStudent(student);
        return Response.status(Response.Status.CREATED).build();  //201 kodas HTTP

    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update (@PathParam("id")int id, Student student) {
        StudentsDaoService studentsDaoService = new StudentsDaoService();  //naujo objekto kurimas
        student.setId(id);  //setinam i objekta
        StudentsDaoService.updateStudent(student);


        return Response.ok().build();



    }
    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id")int id){
        StudentsDaoService studentsDaoService = new StudentsDaoService();
        studentsDaoService.deleteStudent(id);
        return Response.status(Response.Status.NO_CONTENT).build();

    }


}
