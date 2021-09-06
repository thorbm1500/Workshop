package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Skriv dit input");
        Scanner a = new Scanner(System.in);

        int Input = a.nextInt();
        System.out.println(Input);
        int Input2 = a.nextInt();

        System.out.println(Input+Input2);
    }
}
