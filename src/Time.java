import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 5/1/2017.
 */
public class Time implements Comparable<Time>{

    private int hours;
    private int mins;
    private int secs;


    public Time(int hours, int mins, int secs) {
        if(hours<= 23 && hours >=0 ){
            this.hours = hours;
        }else{
            this.hours = 0;
            System.out.println("Wrong amount in Hours, Setting to 0");
        }
        if(mins >= 0 && mins <=59 && secs >= 0 && mins <= 59 ){
            this.mins = mins;
            this.secs = secs;
        }else {
            this.mins = 0;
            this.secs = 0;
            System.out.println("Wrong amount in Mins & Secs, Setting to 0");
        }

    }

    public Time(int hours) {
        if(hours<= 23 || hours >=0 ){
            this.hours = hours;
        }else{
            this.hours = 0;
            System.out.println("Wrong amount in hours, Setting to 0");
        }
    }

    public Time(int hours, int mins) {
        if(hours<= 23 || hours >=0 ){
            this.hours = hours;
        }else{
            this.hours = 0;
            System.out.println("Wrong amount in hours, Setting to 0");
        }
        if(mins >= 0 || mins <=59 ){
            this.mins = mins;
        }else{
            this.mins = 0;
            System.out.println("Wrong amount in mins, Setting to 0");
        }
    }

    public Time(){
        this.hours = 0;
        this.mins = 0;
        this.secs = 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    private String convertToString(){ //Helper Method
        String TimeIn24Format;
        TimeIn24Format = ( Integer.toString(this.hours)+ ":" +Integer.toString(this.mins)+ ":" + Integer.toString(this.secs));
        //System.out.println(TimeIn24Format + " Testing convertToString Method");
        return TimeIn24Format;
    }

    private String convert12To24Hr(){ //Helper Method
        String test = convertToString();

        Date date = null;

        try {
            date =  new SimpleDateFormat("hh:mm:ss").parse(test);
        }
        catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat date24Format= new SimpleDateFormat("HH:mm:ss a");
        String dateConversion = date24Format.format(date);
        return dateConversion;
    }

   public String toString (){

       return convert12To24Hr();

   }

    public boolean equals(Time otherTime) {

       if(!(otherTime instanceof Time)){
           System.out.println(otherTime + " is not a instance of Time");  //just a check to see if it is an instance of time
          return false;
       }else{
           //should check each value of obj and compare it to this Time values
           if(otherTime.hours == this.hours && otherTime.mins == this.mins && otherTime.secs == this.secs) {
               System.out.println("Same time of the two classes");
               return true;
           }
       }
        System.out.println("Not the same time");
        return false;
    }



    @Override
    public int compareTo(@NotNull Time o) {


       if(o.convert12To24Hr().contains("A")){
           //AM comes first
           if(o.hours == this.hours && o.mins == this.mins && o.secs == this.secs){
               System.out.println("The time is the Same in AM");
               return 0; // test if all the same time
               //test to see if both object o and time class have the same time
           }else if (o.hours < this.hours){
               System.out.println(o.convert12To24Hr() + " is earlier than " + this.convert12To24Hr());
               return 1;
           }else if (o.hours > this.hours){
               System.out.println(this.convert12To24Hr() + " is earlier than " + o.convert12To24Hr());
               return -1;
           }
           else{
               return -1;
           }
       }
       else if(o.convert12To24Hr().contains("P")){

           if(o.hours == this.hours && o.mins == this.mins && o.secs == this.secs){
               System.out.println("The Time is the same in PM");
               //test to see if both are pm
           }else if (o.hours > this.hours ){
               System.out.println(this.convert12To24Hr() + " is earlier in the day than " + o.convert12To24Hr());
               return -1;
           }else if(o.hours < this.hours){
               System.out.println(o.convert12To24Hr() + " is earlier in the day than " + this.convert12To24Hr());
               return 1;
           }

           System.out.println("This is PM");
           System.out.println(o.convert12To24Hr());

           return -1;
       }
        return 0;
    }

}
