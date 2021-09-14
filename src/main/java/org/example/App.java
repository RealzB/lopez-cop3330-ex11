package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        String uieuros = sc.nextLine();
        System.out.println("What is the exchange rate?");
        String uiexRate = sc.nextLine();

        float euros = Float.valueOf(uieuros);
        float exRate = Float.valueOf(uiexRate);

        String conclusion = String.format("%.0f euros at an exchange rate of %.4f is %.2f U.S. dollars.", euros, exRate, ((euros*exRate*100)+0.49)/100d);



        System.out.println(conclusion);




    }
}