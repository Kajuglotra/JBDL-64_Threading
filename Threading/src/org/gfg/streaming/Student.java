package org.gfg.streaming;

import java.io.*;

public class Student implements Serializable  { // it provides u an extra check with it

    private static final long serialVersionUID = -6849794470754667710L;
    private String name1;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name1 = name;
        this.age = age;
        this.marks =marks;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name is ='" + name1 + '\'' +
                ", age=" + age +
                '}';
    }

    public static void writeObject() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/kajalglotra/Downloads/JBDL-64_Collection/demo1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        String a ="abc";
        Student s = new Student("name", 1, 10);
        objectOutputStream.writeObject(s);
    }
    public static Object readObject() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/Users/kajalglotra/Downloads/JBDL-64_Collection/demo1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObject();
        System.out.println(readObject());
    }
}
