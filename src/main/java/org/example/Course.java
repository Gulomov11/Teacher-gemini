package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor

public class Course {
    final String name="";


    String instructor;
    double price;

    int duration;

    public String getCourseInfo(){
        return getCourseInfo();

    }
    public void setPrice(double newPrice){
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", instructor='" + instructor + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
