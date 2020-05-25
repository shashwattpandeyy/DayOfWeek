import java.util.Scanner;

public class printDayOfTheWeek {
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 1: {
                System.out.println ( "Sunday" );
                break;
            }
            case 2: {
                System.out.println ( "Monday " );
                break;
            }
            case 3: {
                System.out.println ( " tuesday " );
                break;

            }
            case 4: {

                System.out.println ( "wednesday" );
                break;
            }
            case 5: {
                System.out.println ( "thursday" );
                break;
            }
            case 6: {
                System.out.println ( "friday" );
                break;
            }
            case 7: {
                System.out.println ( "saturday" );
                break;
            }
            default:
                System.out.println ( "entered wrong day" );
        }
    }


    public static void main(String[] args) {
        System.out.println ("Enter day" );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printDayOfTheWeek day = new printDayOfTheWeek ();
        day.printDayOfTheWeek ( a );
   }
    }
