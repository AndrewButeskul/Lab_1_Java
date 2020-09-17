package com.anskul.lab_1.classes;

import java.util.Scanner;

public class Session {
    private int subject_id;
    private int teacher_id;
    private int mark;

    public Session(int mark, int subject_id, int teacher_id) {
        this.subject_id = subject_id;
        this.teacher_id = teacher_id;
        this.setMark(mark);
    }

    public Session(){ }

    @Override
    public String toString(){
        return "--------------\nTeacher name: " + Teachers.teacher.get(teacher_id) + "\nSubject: " +
                Subjects.subject.get(subject_id) + "\nMark: " + mark + "\n";
    }

    public void Input_S(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Select your subjects (index): \n 1.Match  2.Аstronomy  3.Biology  4.Ecology  5.English");
        subject_id += scan.nextInt();

        System.out.println("Select your teacher (index): \n 1.Warren  Foster\n 2.Russell Griffith\n 3.David  Banks\n " +
                " 4.Berenice  Osborne\n  5.Merry  Foster");
        teacher_id += scan.nextInt();

        System.out.println("Enter your mark: (diapason 1 - 5)");
        mark = scan.nextInt();
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

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }
}
