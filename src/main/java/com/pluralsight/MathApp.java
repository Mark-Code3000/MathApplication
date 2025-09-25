package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        /*
        Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any
value you want. Print the answer (i.e "The highest salary is ...")
         */

        //variable to represent bob and garys salary
        int bobSalary = 45000;
        int garySalary = 185000;

        int highestSalary = Math.max(bobSalary, garySalary);


        //print out a sentence with the highest salary
        System.out.println("The highest salary is " + "$" + highestSalary);

        /*
        Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want.
         */

        int carPrice = 1200;
        int truckPrice = 1500;

        int lowerCost = Math.min(carPrice, truckPrice);

        //print out the lower value of the two variables of carPrice and truckPrice
        System.out.println("The lower costing vehicle is " + "$" + lowerCost);

        //Find and display the area of a circle whose radius is 7.25

        double radius = 7.25;
        double PI = 3.14;

        //formula for area of circle is A = PI * R * R

        System.out.println("The area of our circle is " + PI * radius * radius );

        //Find and display the square root a variable after it is set to 5.0

        double sqrVar = 5.0;
        double sRoot = Math.sqrt(sqrVar);


        //apply square root method to variable

        System.out.println("The square root of 5 is " + sRoot);

        //Find and display the distance between the points (5, 10) and (85, 50)
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        //apply formula to find distance between points

        double pntDistance = Math.sqrt((Math.pow(x2-x1, 2) +  Math.pow(y2-y1, 2)));

        System.out.println("The distance between our points are " + pntDistance);

       // Find and display the absolute (positive) value of a variable after it is set to













    }
}
