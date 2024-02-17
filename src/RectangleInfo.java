import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            double recLength = 0;
            double recWidth = 0;

            do {

                System.out.println("Enter the length of the rectangle: "); //prompt user for length
                if (in.hasNextDouble()) {
                    recLength = in.nextDouble();
                    break;
                } else {
                    in.nextLine();
                    System.out.println("You input was invalid, please try again."); //invalid input loop

                }
            }
            while (true);

            do {

                System.out.println("Enter width of the rectangle: "); //prompt user for the width
                if (in.hasNextDouble())
                {
                    recWidth = in.nextDouble();
                    break;
                }
                else {
                    in.nextLine();
                    System.out.println("You input was invalid, please try again."); //invalid input loop
                }
            }
            while (true);

            double recArea = recLength * recWidth;
            double recPer = (recLength + recWidth)*2;
            double recDia = Math.sqrt((recLength * recLength) + (recWidth*recWidth));

            System.out.println("The area of your rectangle is " + recArea + "and the perimeter is " + recPer);
            System.out.println("The length of the diagonal is " + recDia);

        }
    }
}