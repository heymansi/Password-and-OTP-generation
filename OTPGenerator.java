
//Java code to explain OTP generation using Math.random method
package com.hemansi;

import java.util.Timer;
import java.util.TimerTask;

public class OTPGenerator {

    public static void main(String[] args) {
        String OTP = generateOtp();
        System.out.println("Your OTP " + OTP + "is valid for 1 minute");
        Timer timer = new Timer();                  //it keeps track of time in background thread
        timer.scheduleAtFixedRate(new TimerTask()       //we have scheduled the timer to run for 1 minute with delay of 0 milliseconds
        {
            int i = 60;
            public void run()
            {
                i--;
                if(i<0)
                {
                    timer.cancel();
                    System.out.println("Time over!!");

                }
            }
        },0,1000);

    }
    public static String generateOtp()
    {
        int random = (int)(Math.random()*9000)+1000;            //we have multiplied Math.random by 9000 to give its maximum range
                                                                //and add 1000 to give minimum range
        //we have type casted Math.random as int cause its return type is double and we want integer
        String OTP = String.valueOf(random);
        return OTP;
    }
}
