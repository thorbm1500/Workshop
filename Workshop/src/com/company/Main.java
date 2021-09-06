package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Skriv dit input");
        //Printer teksten
        Scanner a = new Scanner(System.in);
        //Gør det muligt at modtage input

        int Input = a.nextInt();
        //Modtager input
        System.out.println(Input);
        //Printer dit første input
        int Input2 = a.nextInt();
        //Modtager dit andet input

        System.out.println(Input+Input2);
        //Ligger dine input sammen og printer det
    }
}
