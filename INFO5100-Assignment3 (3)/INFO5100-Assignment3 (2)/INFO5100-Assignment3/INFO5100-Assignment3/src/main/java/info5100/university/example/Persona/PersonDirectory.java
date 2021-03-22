/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class PersonDirectory {
      static int id = 2021001;
      ArrayList<Person> personList;
    
      
      public PersonDirectory (){
          
       personList = new ArrayList();

    }

    public Person newPerson(Person p) {
        p.setId(id);
        id++;
        personList.add(p);
        return p;
    }

    public Person findPersonById(int id) {

        for (Person p : personList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
    
    public Person findPersonByName(String name){
        for(Person p : personList){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public ArrayList<Person> getPersonlist() {
        return personList;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personList = personlist;
    }
    
}
