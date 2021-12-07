import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome User, how many sides are equal in the Quadilateral you want to calculate?");
    byte sideEqual = sc.nextByte();

    switch (sideEqual){
      case 4:
        System.out.println("Input the side of the quadilateral");
        int side = sc.nextInt();
        FourSidesEqual square = new FourSidesEqual(side);
        System.out.println(square.calculatePerimeter());
        break;
      case 2:
        System.out.println("Input the length of the quadilateral");
        int l = sc.nextInt();
        System.out.println("Input the breadth of the quadilateral");
        int b = sc.nextInt();
        
        TwoSidesEqual rectangle = new TwoSidesEqual(l, b);

        System.out.println(rectangle.calculatePerimeter());
        break;
      case 0:
        System.out.println("Input the Side 1 of the quadilateral");
        int side1 = sc.nextInt();
        System.out.println("Input the Side 2 of the quadilateral");
        int side2 = sc.nextInt();
        System.out.println("Input the Side 3 of the quadilateral");
        int side3 = sc.nextInt();
        System.out.println("Input the Side 4 of the quadilateral");
        int side4 = sc.nextInt();
        
        ZeroSidesEqual trapezoid = new ZeroSidesEqual(side1, side2, side3, side4);

        System.out.println(trapezoid.calculatePerimeter());
        break;
      default:
        System.out.println("Wrong input!!!");
      
    }
   
  }
}

class Quadilateral{
  protected int side1;
  protected int side2;
  protected int side3;
  protected int side4;

  public int calculatePerimeter(){
    return side1+side2+side3+side4;
  }
  
}

class FourSidesEqual extends Quadilateral{
  FourSidesEqual (int side){
    super.side1 = side;
  }

  public int calculatePerimeter(){
    return super.side1 *4;
  }

}

class TwoSidesEqual extends Quadilateral{
  TwoSidesEqual (int length, int breadth){
    super.side1 = length;
    super.side2 = breadth;
  }

  public int calculatePerimeter(){
    return 2 * (super.side1 + super.side2);
  }

}

class ZeroSidesEqual extends Quadilateral{
  ZeroSidesEqual (int sideA, int sideB, int sideC, int sideD){
    super.side1 = sideA;
    super.side2 = sideB;
    super.side3 = sideC;
    super.side4 = sideD;
  }

  

}