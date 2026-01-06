package com.example.app;

public class Student {
	private int rollNo;
    private String name;
    private double marks;

    public void setRollNo(int r) {
        rollNo = r;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setMarks(double m) {
        marks = m;
    }

    public double getMarks() {
        return marks;
    }

    public static void main(String args[]) {
        Student s = new Student();

        s.setRollNo(101);
        s.setName("Sathvika");
        s.setMarks(92.5);

        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    
}
}

