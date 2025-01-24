package org.example;
public class Main {
    public static void main(String[] args) {

Course course=new Course();
course.setInstructor("ali");
course.setPrice(2222);
course.setDuration(6);
course.setPrice(212);
        System.out.println(course.getInstructor());
        System.out.println(course.getPrice());
        System.out.println(course.getDuration());

        System.out.println(course.getCourseInfo());
<<<<<<< HEAD
        System.out.println("mazgi");
=======
        System.out.println("qale");
        System.out.println("nima gap");
>>>>>>> 9819adf7f66a57cf13b8550abfa7bceea7b3938e
    }
}