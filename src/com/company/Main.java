package com.company;

public class Main {

    public static void main(String[] args) {

        Vampire vampire =new Vampire();
        Werewolf werewolf = new Werewolf();


        vampire.Talk();
        werewolf.Talk();
      System.out.println("***********************************");

      //Pointer of a method object
        Enemy enemy = vampire;
        enemy.Talk();

        System.out.println("***********************************");
        Enemy [] enemies = {vampire,werewolf};

        enemies[0].Talk();
        enemies[1].Talk();

    }
}
