import org.joda.time.DateTime;

import javax.swing.*;
import java.util.Date;



public class Clock extends JFrame {


    public Clock(){


    }

    public static void main(String[] args){

        Date dt = new Date();

        DateTime current = new DateTime(dt);

        int month = current.getMonthOfYear();
        System.out.println( month);


    }
}
