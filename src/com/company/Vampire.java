package com.company;

//extend means code can read enemy code also
public class Vampire extends Enemy {
    public void Talk(){
        System.out.println("I Want to suck your blood"); //Overloading this code because its have talk
    }
}
