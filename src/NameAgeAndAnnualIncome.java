/**
 ***********************************************************************************************
 * Assignment: Name, Age, and Annual Income                                                    *
 *                                                                                             *
 * Write a program that declares the following:                                                *
 *                                                                                             *
 * • a String variable named name                                                              *
 * • an int variable named age                                                                 *
 * • a double variable named annualPay                                                         *
 *                                                                                             *
 * Store your age, name, and desired annual income as literals in these variables. The program *
 * should display these values on the screen in a manner similar to the following:             *
 * My name is Joe Mahoney, my age is 26, and I hope to earn $100000.0 per year.                *
 ***********************************************************************************************/

public class NameAgeAndAnnualIncome
{
    public static void main(String[] args)
    {
        /*
         ***********************************************
         * Variable Declarations                       *
         ***********************************************/
        String name = "Nikita Baiborodov";
        int age = 43;
        double annualPay = 300_000.0;

        /*
         ***********************************************
         * Display user's personal information         *
         ***********************************************/
        System.out.println("My name is " + name + ", my age is " + age + " and");
        System.out.println("I hope to earn $" + annualPay + " per year.");

        /*
         ***********************************************
         * Display developer credit                    *
         ***********************************************/
        System.out.println();
        System.out.println("Developed by Nikita Baiborodov.");

        System.exit(0);
    }
}