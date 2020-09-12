package com.anskul.lab_1.classes;

public class Session {
    private int subject_id;
    private int teacher_id;
    private int mark;

    public Session(int mark, int subject_id, int teacher_id) {
        this.subject_id = subject_id;
        this.teacher_id = teacher_id;
        this.setMark(mark);
    }

    @Override
    public String toString(){
        return "--------------\nTeacher name: " + Teachers.teacher.get(teacher_id) + "\nSubject: " +
                Subjects.subject.get(subject_id) + "\nMark: " + mark + "\n";
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
