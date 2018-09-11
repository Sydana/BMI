import java.util.Scanner;

public class BMI_Project {
        public static void main(String[]args){
            Scanner keyboard;
            float weight;
            float height;
            String name;




            keyboard = new Scanner(System.in);
            System.out.println("Hello. I am going to calculate your BMI. First, tell me your name.");
            name = keyboard.nextLine();
            System.out.println("Nice to meet you "+name+". Now could you tell me how much you weigh in pounds?");
            weight = keyboard.nextFloat();
            System.out.println("Okay, the next step is to tell me your height in feet.");
            height = keyboard.nextFloat();
            System.out.println("Alright. ");



            System.out.println("Your BMI is "+(703*((weight/((height*12)*(height*12)))))+".");
        }


}
