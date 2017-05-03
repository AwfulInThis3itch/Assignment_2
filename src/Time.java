/**
 * Created by User on 5/1/2017.
 */
public class Time{

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

   public String toString (){

        return this.hours + " : "+ this.mins + " : " + this.secs;
   }
//test
    //test
//    @Override
//    public boolean equals(Time time) {
//      if(time.compareTo(time.hours))
//    }
}
