
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

public class Grades {
    /* course unit
    */
    int assignment;
    int course_work;
    int practical;
    int presentation;
    int final_exam;
    int final_mark;
    int courseGrade;
    
    public Grades() {}

    public int getAssignment() {
        return assignment;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public int getCourse_work() {
        return course_work;
    }

    public void setCourse_work(int course_work) {
        this.course_work = course_work;
    }

    public int getPractical() {
        return practical;
    }

    public void setPractical(int practical) {
        this.practical = practical;
    }

    public int getPresentation() {
        return presentation;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }

    public int getFinal_exam() {
        return final_exam;
    }

    public void setFinal_exam(int final_exam) {
        this.final_exam = final_exam;
    }

    public int getFinal_mark() {
        return final_mark;
    }

    public void setFinal_mark(int final_mark) {
        this.final_mark = final_mark;
    }

    public int getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(int courseGrade) {
        this.courseGrade = courseGrade;
    }
    
    
}

      