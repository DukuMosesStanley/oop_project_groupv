
package oop_project_group.model;

/*
        Group members
        =============
        
        Name                                 Registration Number
        ====                                 ===================
        CHANCE LUWONG                        18/847/BIT-S
        DUKU MOSES                           18/927/BSSE-S
        RICHARD KAMULAK JUSTIN LOKOSANG      18/1176/BIT-S
        PHILIP JUNGO                         18/1068/BIT-S

        */


public class Student {
    String firstName;
    String lastName;
    String email;
    Courses course;
 
    public Student(){}
    
    public Student(String name, String lastName, String email_address, Courses course){
        this.firstName = name;
        this.lastName = lastName;
        email_address = email;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
       // this.course = course;
    }

    
}


       