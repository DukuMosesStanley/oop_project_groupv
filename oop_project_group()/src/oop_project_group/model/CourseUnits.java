
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

public class CourseUnits {
    
    String name;
    int credit_unit;
    String description;
    String content;
    String course_code;
    String year;
    
    public CourseUnits(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit_unit() {
        return credit_unit;
    }

    public void setCredit_unit(int credit_unit) {
        this.credit_unit = credit_unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
    
}


      