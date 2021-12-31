import java.util.Scanner;

public abstract class shape {
    double a;
    double b;
    Scanner  input = new Scanner(System.in);
    public  abstract void inputData();
    public abstract void compute() ;

}
class triangle extends shape{
    @Override
    public void inputData() {
        System.out.print("Enter base of the triangle :");
        a = input.nextDouble();
        System.out.print("Enter Height of the triangle :");
        b = input.nextDouble();
    }

    public void compute(){
        double area = (0.5*a*b);
        System.out.println("Area of triangle :"+ area);
    }
}
class rectangle extends shape{
    @Override
    public  void inputData(){
        System.out.print("Enter Length of the triangle :");
        a = input.nextDouble();
        System.out.print("Enter Breath of the triangle :");
        b = input.nextDouble();
    }

    public void compute(){
        double area = (a*b);
        System.out.println("Area of Rectangle :"+ area);
    }



}
class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        do {

            System.out.println("1.Area of Triangle");
            System.out.println("2.Area of Rectangle");
            System.out.println("3.Exit");
            System.out.print("Calculate area of shape:");

            i = input.nextInt();
            switch (i) {
                case 1 -> {
                    shape area = new triangle();
                    area.inputData();
                    area.compute();

                }
                case 2 -> {
                    shape area = new rectangle();
                    area.inputData();
                    area.compute();

                }
                default -> System.out.println("invalid input");
            }


        } while (i != 3);
    }
}
