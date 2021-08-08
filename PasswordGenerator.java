package com.hemansi;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int length = 0;                     //for length of password
        System.out.println("Enter length for password greater than equal to 8: ");
        length = sc.nextInt();
        if(length <8)
        {
            System.out.println("Please enter greater length");
            length = sc.nextInt();
        }
        System.out.println("Your password is : " + password(length));

    }
    public static char[] password(int len)         //method or password generation using given inputs
    {
        String CapitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String SmallLetters = CapitalLetters.toLowerCase();
        String numbers = "1234567890";
        String symbol = "!@#$%^&*_+-<>/?";
        String values = CapitalLetters + SmallLetters + numbers + symbol;
        //random method for password generation
        Random random = new Random();
        char[] password = new char[len];

        for(int i = 0; i < len ; i++)
        {
            //charAt() is used to get character value at a particular index
            //nextInt() is used as the values are scanned as integer
            password[i] = values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
}
