import java.util.Random;
import java.util.Scanner;

public class RockPapaerSiscorrs {
    public static void main(String[] args) {
            Random rnd = new Random();
            Scanner sc = new Scanner(System.in);
            int  n;
            byte w=0, y=0, c=0, ip;

            do {
                System.out.println("Round "+(w+1)+" of 5");
                System.out.print("Enter Your Response (Rock (0) / Paper (1) / Scissors (2) ) : ");
                ip = sc.nextByte();
                n = rnd.nextInt(3);

                switch(ip)
                {
                    case 0:
                        switch (n)
                        {
                            case 0:  System.out.println("You : Rock , Computer : Rock ");
                                System.out.println("Tied Play Again");
                                break;

                            case 1:  System.out.println("You : Rock , Computer : Paper ");
                                w += 1;
                                System.out.println("You Lost round "+w);
                                c+=1;
                                break;

                            case 2:  System.out.println("You : Rock , Computer : Scissors ");
                                w += 1;
                                System.out.println("You Won round "+w);
                                y+=1;
                                break;
                        }
                        break;

                    case 1:
                        switch (n)
                        {
                            case 0:  System.out.println("You : Paper , Computer : Rock ");
                                w += 1;
                                System.out.println("You Won round "+w);
                                y+=1;
                                break;

                            case 1:  System.out.println("You : Paper , Computer : Paper ");
                                System.out.println("Tied Play Again");
                                break;

                            case 2:  System.out.println("You : Paper , Computer : Scissors ");
                                w += 1;
                                System.out.println("You Lost round "+w);
                                c+=1;
                                break;
                        }
                        break;

                    case 2:
                        switch (n)
                        {
                            case 0:  System.out.println("You : Scissors , Computer : Rock ");
                                w += 1;
                                System.out.println("You Lost round "+w);
                                c+=1;
                                break;

                            case 1:  System.out.println("You : Scissors , Computer : Paper ");
                                w += 1;
                                System.out.println("You Won round "+w);
                                y+=1;
                                break;

                            case 2:  System.out.println("You : Scissors , Computer : Scissors ");
                                System.out.println("Tied Play Again");
                                break;
                        }
                        break;

                    default:  System.out.println("Please Enter Correct Value ");
                        break;

                }

                System.out.println();
                System.out.println("You : "+y+" Computer : "+c);
                System.out.println();
            }while (w!=5);

            if(y > c)
            {
                System.out.println("Congratulations ! You Won by "+y+"-"+c );
            }
            else
            {
                System.out.println("You Lost By "+c+"-"+y );
            }

        }
}