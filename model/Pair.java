package org.example.model;
import java.util.ArrayList;
public class Pair {

    private ArrayList<Course> firstArrayList ;
    private ArrayList <Course> secondArrayList;

    public Pair(ArrayList<Course> firstArrayList, ArrayList<Course> secondArrayList) {
        this.firstArrayList = firstArrayList;
        this.secondArrayList = secondArrayList;

    }
    ArrayList<Course> getFirstArrayList() {
        return firstArrayList;
    }
    ArrayList<Course> getSecondArrayList() {
        return secondArrayList;
    }

}

