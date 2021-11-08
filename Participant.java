package com.byaj;

public class Participant {
    public double fee;
    public int age;
    public String name;
    public String studentid;

    public String toString(){
        return name + "\n" +
                age + "\n" +
                studentid + "\n$" +
                fee + "\n";
    }
}
