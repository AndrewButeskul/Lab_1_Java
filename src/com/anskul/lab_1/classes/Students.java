package com.anskul.lab_1.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Students {

    private String name;
    private int record_number;
    private int faculty_id;
    private int course_number;
    private ArrayList<Session> sessions;

    public Students(){}

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

    public void Input(){

        ArrayList<Session> session = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scan.nextLine();

        System.out.println("Enter your record number: ");
        record_number = scan.nextInt();

        System.out.println("Select your faculty (index): \n 1. ICS  2. IPTDM  3. IIBRT  4. IEE");
        faculty_id += scan.nextInt();

        System.out.println("Enter your course number: ");
        course_number = scan.nextInt();

        for (int i = 0; i < 5; i++) {
            Session sess = new Session();
            sess.Input_S();
            session.add(sess);
        }
        this.sessions = session;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
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
        if(record_number > 0 && record_number <= 20)
            this.record_number = record_number;
        else
            this.record_number = -1;
    }

    public void set_Faculty_id(int faculty_id){
        if(faculty_id >= 0 && faculty_id <= 3)
            this.faculty_id = faculty_id;
        else {
            this.faculty_id = 0;
            System.out.println("You have selected not exist faculty!");
        }
    }

    public void set_Course(int course_number){
        if(course_number > 0 && course_number <= 6)
            this.course_number = course_number;
        else
            this.course_number = -1;
    }


}
