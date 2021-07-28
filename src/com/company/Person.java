package com.company;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> bardiesOwned;


    public void likeBardy(boolean like)  {
        if(like) {
            System.out.println("Person like Bardy. ");
        } else {
            System.out.println("Person doesn't like Bardy. ");
        }
    }
    public void hasBardy(boolean has) {
        if(has) {
            System.out.println("Person has the bardy. ");
        }
        else if (has){
            likeBardy(true);
            System.out.println("Person doesn't have bardy, but like it, so I will give him a bardy. ");
        }else {
            System.out.println("Person doesn't have bardy and did not like it. ");
        }
        }

    public Person(String name, int age, boolean like, boolean has) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getBardiesOwned() {
        return bardiesOwned;
    }

    public void setBardiesOwned(List<String> bardiesOwned) {
        this.bardiesOwned = bardiesOwned;
    }
}
