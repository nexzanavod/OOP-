package com.company;

public class Enemy {
    private int health;

    public void Talk(){
        System.out.println("I am an Enemy, You better run");
    }

    public void getHealth(){
        System.out.println(health);
    }

    public void setHealth(int x){
        health=x;
    }
}
