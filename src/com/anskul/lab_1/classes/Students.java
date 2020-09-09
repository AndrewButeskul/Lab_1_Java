package com.anskul.lab_1.classes;

import java.util.ArrayList;

public class Students {

    private String name;
    private byte record_number;
    private int faculty_id;
    private byte course_number;
    private Session subject;


    public Students(String name, byte record_number, int faculty_id, byte course_number, Session subject){
        this.name = name;
        this.record_number = record_number;
        this.faculty_id = faculty_id;
        this.course_number = course_number;
        this.subject = subject;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" + "Record number: " + record_number +
                "\n" + "Faculty: " + Faculty.list.get(faculty_id) + "\n" + "Cource number: " + course_number + subject.toString();
    }

//---------------
//    public void Input(Students student){
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Name and inithial:");
//        student.set_Name(keyboard.nextLine());
//        System.out.println("Record number:");
//        student.set_Record(keyboard.nextByte());
//        System.out.println("Select your Faculty:");
//      //  student.set_Faculty(keyboard.nextByte()); +++
//        System.out.println("Course number:");
//        student.set_Course(keyboard.nextByte());
//    }

    public boolean Check_name(String name) {
        return name.matches("[а-яА-Я]+");
    }

    public String get_Name(){
        return name;
    }

    public byte get_Record(){
        return record_number;
    }

    public int get_Faculty_id(){
        return faculty_id;
    }

    public byte get_Course(){
        return course_number;
    }

    public void set_Name(String name){
        this.name = name;
    }

    public void set_Record(byte record_number){
        this.record_number = record_number;
    }

    public void set_Faculty_id(int faculty_id){
        this.faculty_id = faculty_id;
    }

    public void set_Course(byte course_number){
        this.course_number = course_number;
    }


    public Session getSubject() {
        return subject;
    }

    public void setSubject(Session subject) {
        this.subject = subject;
    }
}
