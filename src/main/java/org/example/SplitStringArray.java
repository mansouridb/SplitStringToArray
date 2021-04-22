package org.example;

public class SplitStringArray {
    public static void main(String[] args) {

        String str="Carl,Susie,Fredrick,Bob,Erik";
              String[] st_Ar = str.split(",",5);
        System.out.println(str +"\":");
        for(int i=0;i<st_Ar.length;i++)
                {
                    System.out.println("st_Ar[" +i+ "]=" + st_Ar[i]);
                }
    }


    }

