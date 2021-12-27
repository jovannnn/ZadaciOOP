package com.company;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Student {
    public void createXML(String fileName,Student student){
        try{
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document=documentBuilder.newDocument();

            Element root =document.createElement("Student");
            document.appendChild(root);

            Element ime=document.createElement("Ime");
            Element prezime=document.createElement("Prezime");
            Element indeks=document.createElement("Indeks");
            root.appendChild(indeks);

            prezime.appendChild(document.createTextNode(student.getIme()));
            ime.appendChild(document.createTextNode(student.getPrezime()));
            indeks.appendChild(document.createTextNode(student.getIndeks()));

            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer transformer=transformerFactory.newTransformer();
            DOMSource source=new DOMSource(document);
            StreamResult result=new StreamResult(new File(fileName));
            transformer.transform(source,result);
            System.out.println("Fajlot e kreiran,imeto e"+fileName);
            System.out.println("Fajlot e zacuvan");

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
