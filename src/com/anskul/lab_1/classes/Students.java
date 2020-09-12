package com.anskul.lab_1.classes;

import java.util.ArrayList;

public class Students {

    private String name;
    private int record_number;
    private int faculty_id;
    private int course_number;
    private ArrayList<Session> sessions;

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }


    public Students(String name, int record_number, int faculty_id, int course_number, ArrayList<Session> sessions){
        this.name = name;
        this.record_number = record_number;
        this.faculty_id = faculty_id;
        this.course_number = course_number;
        this.sessions = sessions;
    }

    @Override
    public String toString(){
        return "\n-----------------------------------------\nName: " + name + "\n" + "Record number: " + record_number +
                "\n" + "Faculty: " + Faculty.list.get(faculty_id) + "\n" + "Cource number: " + course_number + "\n" + sessions.toString() + "\n";
    }


    public boolean Check_name(String name) {
        return name.matches("[а-яА-Я]+");
    }

    public String get_Name(){
        return name;
    }

    public int get_Record(){
        return record_number;
    }

    public int get_Faculty_id(){
        return faculty_id;
    }

    public int get_Course(){
        return course_number;
    }

    public void set_Name(String name){
        this.name = name;
    }

    public void set_Record(int record_number){
        this.record_number = record_number;
    }

    public void set_Faculty_id(int faculty_id){
        this.faculty_id = faculty_id;
    }

    public void set_Course(int course_number){
        this.course_number = course_number;
    }


}
