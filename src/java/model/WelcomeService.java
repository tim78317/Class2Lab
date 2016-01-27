/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author timothy
 */
public class WelcomeService {
    
    private Calendar current = Calendar.getInstance();
    
    public String greetingTime(){
       String greeting = "";
       int compareCurrent = current.get(Calendar.HOUR_OF_DAY);
        if(compareCurrent >= 1 && compareCurrent < 12){
          greeting = "Good morning," ;
        }else if(compareCurrent >= 12 && compareCurrent < 17){
            greeting = "Good afternoon,";
        }else if(compareCurrent >= 17 && compareCurrent > 1){
            greeting = "Good evening,";
        }
         return greeting;
    }
    
    public String outPutMessage(String name){
        
        return this.greetingTime() + name + ". Welcome!";
    }
    
}
