public class Prob2 {
    public static void main(String args[]){
        int light_speed=186000;
        int days =1000;
        long seconds;
        long distance;
        seconds=days*24*60*60;
        distance=light_speed*seconds;
        System.out.println("Result: Light travels " +distance + " miles in " + days + " days.");
    }
}

