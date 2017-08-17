/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemmerling.aufgabe8b_el_test.view;

//import controller.PersonSaveAction;
//import controller.PersonListAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import modell.Adresse;
//import modell.Person;

/**
 *
 * @author Salah Lejmi <info@jexp.org>
 */
public class AttributeSetter {

  public AttributeSetter() {
  }
  
  public static void setSomeAttributes(HttpServletRequest request, HttpServletResponse response) {
    request.setAttribute("obst", "Ananas");
    request.setAttribute("prop1", "nachname");
    request.setAttribute("prop2", "vorname");
    request.setAttribute("key100", "Ein key mit Leerzeichen");
    request.setAttribute("boolKey", "TrUe");
    request.setAttribute("myIndex", "2");
    request.setAttribute("zahl", "12");
    request.setAttribute("tip", "<b>Text</b> Fettdarstellung des Textes");
    //    request.setAttribute("Agent", "15");
//    request.setAttribute("myPerson", getSamplePerson()); // ${myPerson} --> pageContext.findAttribute("myPerson").toString()
//    request.setAttribute("myPerson2", getSamplePerson());
//    request.setAttribute("myPerson3", getSamplePerson());
//    request.setAttribute("p2", getSamplePerson());
//    Person person = getSamplePerson();
//    request.setAttribute("myPerson", person);
//    request.setAttribute("myPerson3", getSamplePerson());
//    request.setAttribute("my person", new Person("Arnold", "Anton"));
//    request.setAttribute("myKey", "my person");
//    request.setAttribute("myStringPersonMap", getSampleStringPersonMap()); // Map<String, Person> --> keys: "key1", "key2", "key3", ... 
//    System.out.println(getSampleStringPersonMap());
//    request.setAttribute("myIntegerPersonMap", getSampleIntegerPersonMap()); // Map<String, Person> --> keys: "10", "20", "30", ...
//    request.setAttribute("myPersonList", getSamplePersonList()); // List<Person>
    
//    request.setAttribute("myAction1", new PersonListAction());

//    request.setAttribute("myAction3", new PersonCreateAction());
    request.setAttribute("special one", "#+#+# Hallo #+#+#");
    //request.setAttribute("htmlGenerator", new HtmlGenerator());
    HttpSession session = request.getSession();
//    session.setAttribute("myPerson", new Person("Lejmi", "Salah"));
    response.addCookie(new Cookie("1a", "Streuselkuchen"));
    
    // ${sessionScope.myPerson}
    // ${myPerson}     page, request, session, application
  }

//  public static Person getSamplePerson() {
//    Person p = new Person("Müller", "Klaus");
//    p.setAdresse(new Adresse("Rosenweg", "12a"));
//    return p;
//  }
//
//  public static List<Person> getSamplePersonList() {
//    List<Person> personList = new ArrayList<>();
//    personList.add(new Person("Schmidt", "Peter"));
//    personList.add(new Person("Meyer", "Hans")); 
//    personList.add(new Person("Müller", "Klaus")); 
//    return personList;
//  }
//
//  private static Map getSampleIntegerPersonMap() {
//    final List<Person> pList = getSamplePersonList();
////    Map<Long, Person> personMap = new TreeMap<>();
//    Map<String, Person> personMap = new TreeMap<>();
//    for (int i = 0; i < pList.size(); i++) {
//      Person person = pList.get(i);
////      personMap.put((i+1)*10 + "", person); // ("10", new Person("Schmidt", "Peter"))
//      personMap.put((i+1)*10 + "", person); // ("10", new Person("Schmidt", "Peter"))
//    }
//    return personMap;
//  }
//  private static Map getSampleStringPersonMap() {
//    final List<Person> pList = getSamplePersonList();
//    Map<String, Person> personMap = new TreeMap<>();
//    for (int i = 0; i < pList.size(); i++) {
//      Person person = pList.get(i);
//      personMap.put("key" + (i+1), person); // ("key1", new Person("Schmidt", "Peter"))
//    }
//    personMap.put("Ein key mit Leerzeichen", new Person("Laus","Niko"));
//    return personMap;
//  }
  
  public Map getSortedMap(Map inputMap) {
    return new TreeMap(inputMap);
  }

//  public static List<Person> manipulate(List<Person> personList) {
//    return null;
//  }

} // end of Class
