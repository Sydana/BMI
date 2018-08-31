import java.util.Scanner;

public class BMI_Project {
        public static void main(String[]args){
            Scanner keyboard;
            float weight;
            float height;
            float bmi;
            String name;
            float kg;
            float meters;


            keyboard = new Scanner(System.in);
            System.out.println("Hello. I am going to calculate your BMI. First, tell me your name.");
            name = keyboard.nextLine();
            System.out.println("Nice to meet you "+name+". Now could you tell me how much you weigh?");
            ;
            System.out.println("Okay, the next step is to tell me your height.");
            height = keyboard.nextLine();
            System.out.println("Alright. ");
            kg = "0.45392";
            meters = "0.3048";



            System.out.println("Your BMI is "(((weight*kg)/(height*meters)/height)".");
        }


}
