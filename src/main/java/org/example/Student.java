package org.example;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Course {

    ArrayList<Course> enrolledCourses=new ArrayList<>();
    String name;

    public void enroll(Course course){

    }

}
