package com.anskul.lab_1;

import com.anskul.lab_1.classes.Faculty;
import com.anskul.lab_1.classes.Session;
import com.anskul.lab_1.classes.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Students> Student = new ArrayList<>();
        //ArrayList<Session> list = new ArrayList<Session>();
        ArrayList<Session> list = new ArrayList<>();
        list.add(new Session("Match","Daniel Kim",4));

        Faculty.list.add("ICS");
        Faculty.list.add("IPTDM");
        Faculty.list.add("IIBRT");
        Faculty.list.add("IEE");


//        Student.add(new Students("Andrew", 5, 0, 5,
//                new Session("name","name", 4 )));
        Student.add(new Students("Alex Rotar",(byte)1,2,(byte)1,list));

        System.out.println(Student);

    }

}
