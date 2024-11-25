import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean calculating = true;
        while(calculating){
            System.out.println("Calculate to interger numbers");
            System.out.println("Addition[1]<---->Subtration[2]<---->Division[3]<---->Multiplication[4]<---->Exit[0]");
            System.out.println("Insert a number to init a oparation:");
            switch (input.nextInt()){
                case 1:
                    System.out.println("Addition");
                    Operations.addition(input.nextInt(), input.nextInt());
                    break;
            
                case 2:
                    System.out.println("Subtration");
                    Operations.subtration(input.nextInt(), input.nextInt());
                    break;

                case 3:
                    System.out.println("Division");
                    Operations.division(input.nextInt(), input.nextInt());
                    break;

                case 4:
                    System.out.println("Mutiplication");
                    Operations.multiplication(input.nextInt(), input.nextInt());
                    break;
                    
                case 0:
                    calculating = false;
                    break;
                
                default:
                    System.out.println("Insert a valid number");
                    break;
            }
        }
        input.close();
    }
}
