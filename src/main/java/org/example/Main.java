package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

    }
}