package com.anskul.lab_1.classes;

import java.util.function.IntFunction;

public class Session {
    private String subject_name;
    private String teacher_name;
    private int mark;

    public Session(String subject_name, String teacher_name, int mark) {
        this.subject_name = subject_name;
        this.teacher_name = teacher_name;
        this.setMark(mark);
    }

    @Override
    public String toString(){
        return "\nTeacher name: " + teacher_name + "\nSubject: " + subject_name + "\nMark: " + mark;
    }


    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark > 0 && mark <= 5)
            this.mark = mark;
        else
            this.mark = -1;
    }
}
