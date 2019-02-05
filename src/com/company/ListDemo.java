package com.company;

import java.util.ArrayList;

public class ListDemo
{
    public void execute()
    {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Log Bench");
        myList.add("Bamboo mat");
        myList.add("Ivory King Size Bed");
        myList.add("Brick TV");
        myList.add("Glass Table");

        myList.remove(myList.size()-1);
        myList.remove(0);
        myList.remove(1);



        printList(myList);
    }

    private void printList(ArrayList<String> list)
    {
        for(String item:list)
        {
            System.out.print(item + " : ");
        }
    }
}
