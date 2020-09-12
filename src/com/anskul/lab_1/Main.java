package com.anskul.lab_1;

import com.anskul.lab_1.classes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Faculty.list.add("ICS");
        Faculty.list.add("IPTDM");
        Faculty.list.add("IIBRT");
        Faculty.list.add("IEE");

        Subjects.subject.add("Match");
        Subjects.subject.add("Аstronomy");
        Subjects.subject.add("Biology");
        Subjects.subject.add("Ecology");
        Subjects.subject.add("English");

        Teachers.teacher.add("Warren  Foster");
        Teachers.teacher.add("Russell Griffith");
        Teachers.teacher.add("David  Banks");
        Teachers.teacher.add("Berenice  Osborne");
        Teachers.teacher.add("Merry  Foster");


        ArrayList<Students> Student = new ArrayList<>();
        ArrayList<Session> session = new ArrayList<>();

        session.add(new Session(5,2,4));
        session.add(new Session(2,1,2));
        session.add(new Session(5,1,1));
        session.add(new Session(4,4,0));
        session.add(new Session(3,3,3));

        Student.add(new Students("Alex Rotar",1,2,1,session));
        Student.add(new Students("Mark Kendi",4,3,4,session));

        System.out.println(Student);

    }

}
