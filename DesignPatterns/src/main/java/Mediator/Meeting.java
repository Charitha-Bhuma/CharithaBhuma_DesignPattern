package Mediator;

import java.util.Date;

public class Meeting {
   public static void showMessage(Employee e, String message){
      System.out.println(new Date().toString() + " [" + e.getName() + "] : " + message);
   }
}