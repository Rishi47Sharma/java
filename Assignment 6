import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_handling {
     Exception_handling(){
         Scanner input = new Scanner(System.in);



      while(true){

          try{
              System.out.println("Exception handling");
              System.out.println("1.Display element from the Array ");
              System.out.println("2.Addition of two number ");
              System.out.print("Enter input:");
              int i = input.nextInt();

              switch(i){
                  case 1:
              {


                  System.out.print("Enter index:");
                  int a=input.nextInt();
                  int arr[] ={20,34,56,78,12,10};
                  System.out.println("Element at index "+a+"is "+arr[a]);
                  break;

              }
              case 2:
                  {
                      System.out.print("Enter first number:");
                      int num1= Integer.parseInt(input.next());
                      System.out.print("Enter Second number:");
                      int  num2 = Integer.parseInt(input.next());
                      int result= num1/num2;
                      System.out.println("Result: "+result);
                      break;
                  }
                  default:System.out.println("invalid input");
          }


          } catch(ArithmeticException e){
              System.out.println("Can't divide number by zero");
          }
          catch (NumberFormatException e){
              System.out.println("Number is not a integer");
          }
          catch(InputMismatchException e){
              System.out.println("Number is not a integer");

          }
          catch (ArrayIndexOutOfBoundsException e){
              System.out.println("Index out of bound");
          }
      }}
     }



class test{
    public static void main(String[] args) {
        Exception_handling obj = new Exception_handling();
    }
}

