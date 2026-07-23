/*
 * MyFirstClass.java
 * Complete Solution
 */

public class MyFirstClass
{
    public static void main(String[] args)
    {
        // ==========================
        // Task 1: Vehicle Information
        // ==========================

        String make = "Renault";
        String model = "Laguna";
        String colour = "Blue";
        double engineSize = 1.8;
        byte gear = 2;

        System.out.println("Vehicle Information");
        System.out.println("-------------------");
        System.out.println("Make        : " + make);
        System.out.println("Model       : " + model);
        System.out.println("Colour      : " + colour);
        System.out.println("Engine Size : " + engineSize + "L");
        System.out.println();

        // ==========================
        // Task 2: if-else
        // ==========================

        if (engineSize <= 1.3)
        {
            System.out.println("You have a weak car.");
        }
        else
        {
            System.out.println("You have a powerful car.");
        }

        System.out.println();

        // ==========================
        // Task 3: if-else-if
        // ==========================

        System.out.print("Recommended speed: ");

        if (gear == -1)
        {
            System.out.println("Backwards!");
        }
        else if (gear == 0)
        {
            System.out.println("0 mph");
        }
        else if (gear == 1)
        {
            System.out.println("0 - 10 mph");
        }
        else if (gear == 2)
        {
            System.out.println("10 - 25 mph");
        }
        else if (gear == 3)
        {
            System.out.println("25 - 35 mph");
        }
        else if (gear == 4)
        {
            System.out.println("35 - 50 mph");
        }
        else if (gear == 5)
        {
            System.out.println("50 - 65 mph");
        }
        else if (gear == 6)
        {
            System.out.println("Over 65 mph");
        }
        else
        {
            System.out.println("Invalid gear.");
        }

        System.out.println();

        // ==========================
        // Task 4: switch-case
        // ==========================

        System.out.println("Using switch statement:");

        switch (gear)
        {
            case -1:
                System.out.println("Backwards!");
                break;

            case 0:
                System.out.println("0 mph");
                break;

            case 1:
                System.out.println("0 - 10 mph");
                break;

            case 2:
                System.out.println("10 - 25 mph");
                break;

            case 3:
                System.out.println("25 - 35 mph");
                break;

            case 4:
                System.out.println("35 - 50 mph");
                break;

            case 5:
                System.out.println("50 - 65 mph");
                break;

            case 6:
                System.out.println("Over 65 mph");
                break;

            default:
                System.out.println("Invalid gear.");
        }

        System.out.println();

        // ==========================
        // Task 5: Leap Years (2000-2050)
        // Correct Leap Year Rule
        // ==========================

        System.out.println("Leap Years (2000 - 2050)");
        System.out.println("------------------------");

        for (int year = 2000; year <= 2050; year++)
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println(year + " is a leap year.");
            }
        }

        System.out.println();

        // ==========================
        // Task 6: First Five Leap Years
        // ==========================

        System.out.println("First Five Leap Years");
        System.out.println("---------------------");

        int count = 0;

        for (int year = 2000; year <= 2050; year++)
        {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                System.out.println(year + " is a leap year.");
                count++;

                if (count == 5)
                {
                    break;
                }
            }
        }

        System.out.println();

        // ==========================
        // Task 7: print() vs println()
        // ==========================

        System.out.print("This uses print(). ");
        System.out.print("Notice both messages are on the same line.");

        System.out.println();

        System.out.println("This uses println().");
        System.out.println("Each message appears on a new line.");
    }
}