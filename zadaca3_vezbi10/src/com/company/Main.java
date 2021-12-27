package com.company;

public class Main {

    public static void main(String[] args) {
        XmlCreator n=new XmlCreator();
        Student student = new Student();
        student.setIme("Stefan");
        student.setPrezime("Stefanovski");
        student.setIndeks("1000");

        XML xml=new XML();
        xml.createXMLFile("xml",student);
    }
}

