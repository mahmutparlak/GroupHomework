package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Group Homework 1 A: Write a program to swap 2 numbers without a temporary variable?
        int a = 15;
        int b = 20;
        System.out.println("Before swap a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap a = " + a + ", b = " + b);
//
//Group Homework 1 B: Swap  2 strings without a temporary variable?
//
        String name = "Mahmut";
        String surname = "Parlak";

        System.out.println("Before swap: name = " + name + " and surname = "+ surname);

        name = name + surname;

        surname = name.substring(0,name.length()-surname.length());

        name = name.substring(surname.length());

        System.out.println("After swap: name = " + name + " and surname = " + surname);
//
//Group Homework 2: Swap  2 strings without a temporary variable?
//
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write any number");

        int number = scanner.nextInt();
        scanner.close();

        boolean primeNumber = true;

        for (int i = 2; i < number/2; i++) {

            if (number % i == 0) {
                primeNumber = false;
                break;
            }
        }

        if (primeNumber) {
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }


// Group Homework 3: Write a Java Program to print the first 10 numbers of Fibonacci series.

        int firstNumber = 0;
        int secondNumber = 1;

        for (int i = 0; i < 10; i++) {

            System.out.print(firstNumber + " ");

            int thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }

// Group Homework 4: Maximum and minimum number in the array?

        int[] maxMinArray = {1, 100, 20, 37, -10};

        int minNumber = maxMinArray[0];
        int maxNumber = maxMinArray[0];

        for (int minimum : maxMinArray) {
            if (minimum < minNumber) {
                minNumber = minimum;
            }
        }
        System.out.println("The minimum number in the array is " + minNumber);

        for (int maximum : maxMinArray) {
            if (maximum > maxNumber) {
                maxNumber = maximum;
            }
        }
        System.out.println("The minimum number in the array is " + maxNumber);

// Group Homework 5: Write a java program to find the second largest number in the array?

        int[] secondMaxArray = {1, 100, 20, 37, -10};

        int firstBiggest = secondMaxArray[0];
        int secondBiggest = secondMaxArray[0];

        for (int sNumber : secondMaxArray) {
            if (sNumber > firstBiggest) {
                secondBiggest = firstBiggest;
                firstBiggest = sNumber;
            } else if (sNumber > secondBiggest) {
                secondBiggest = sNumber;
            }
        }
        System.out.println("Second Largest: " + secondBiggest);

// Group Homework 6: Create a 2D array to store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] sumNumbers = {{1, 2, 3}, {4, 5, 6}};

        int sum = 0;

        for (int[] firstSumNumber : sumNumbers) {
            for (int allSumNumber : firstSumNumber) {
                sum += allSumNumber;
            }
        }
        System.out.println(sum);


// Group Homework 7: Create a 2D array to store numbers in 3 rows and 4 columns.
// Develop a program which will identify/print the even numbers only.

        int[][] evenNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        for (int[] firstEven : evenNumbers) {
            for (int secondEven : firstEven) {
                if (secondEven % 2 == 0) {
                    System.out.println(secondEven);
                }
            }
        }

//  Group Homework 8: Create a 2D array to store numbers and calculate sum of all odd numbers.

        int[][] oddNumbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        int sum = 0;
        for (int[] firstSumOdd : oddNumbers) {
            for (int sumOdd : firstSumOdd) {
                if (sumOdd % 2 != 0) {
                    sum += sumOdd;
                }
            }
        }
        System.out.println(sum);


// Group Homework 9-Last: Create an array of countries: north america countries,
// south america countries, europe countries, asian countries, african countries.
// Then print all values from that array using 2 different loops and calculate
// how many total countries been stored.

        String[][] countries = {{"USA", "Canada", "Mexico"}, {"Brazil", "Chili", "Argentina"},
                                {"Germany", "France", "England"}, {"Iran", "China", "India"}, {"Algeria", "Morocco", "Cad"}};
        int count = 0;
        for (String[] country : countries) {
            for (String allCountry : country) {
                System.out.println(allCountry);
                count ++;
            }
        }
        System.out.println("In the array there are " + count + " country exist.");
//        --------------------------------------------------------------------------------------------------------------------

//        int[] numbers = {45, 78, 12,  67, 55};
//
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//        String a = "Love";
//        String b = "You";
//        System.out.println("Before swap: " + a + " " + b);
//        a = a + b;
//        b = a.substring(0, a.length() - b.length());
//        a = a.substring(b.length());
//        System.out.println("After : " + a + " " + b);

// Create a 2D array where you will store the following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
//After storing values print the following:
//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//        String [][] array = {
//                {"Mr","Mrs" , "Ms", "Miss"},
//                {"Smith", "Jordan", "Jackson", "Obama"}
//        };
//
//        System.out.println(array[0][0] + " " + array[1][0]);
//        System.out.println(array[0][1] + " " + array[1][1]);
//        System.out.println(array[0][2] + " " + array[1][2]);
//        System.out.println(array[0][3] + " " + array[1][3]);

//        String [][] car = {
//                {"Ford", "Chevrolet", "Tesla"},
//                {"Mercedes", "BMW", "Volkswagen"},
//                {"Kia", "Hyundai", "Daewoo"},
//                {"Ferrari", "Maserati", "Lamborghini"}
//        };
//
//        for (String[] a : car) {
//            for (String b : a) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }

//        int[][] array = {
//                {10, 20, 30},
//                {1, 2, 3, 4},
//                {100, 200, 300}
//        };

//        for (int[] a : array) {
//            for (int b : a) {
//                System.out.println(b);
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println(array[i][j]);
//            }
//        }
//        int[] numbers = {1, 1000, 100, 10000, 10};
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[0] < numbers[i])
//                numbers[0] = numbers[i];
//        }
//        System.out.println("Largest number of the array: "+ numbers[0]);

//        Create an array on double using scanner and calculate the sum of all elements that was stored in an array.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How many numbers would you like to add up?");
//        int size = scanner.nextInt();
//        double[] numbers = new double[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Please enter any numbers");
//            numbers[i] = scanner.nextDouble();
//        }
//
//        double sum = 0;
//
//        for (double number : numbers) {
//            sum = sum + number;
//        }
//        System.out.println(sum);


// Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
//        String[] countries = {"United States", "Russia", "Turkey"};
//
//        String capital;
//
//        for (String country : countries) {
//
//            switch (country) {
//
//                case "United States":
//                    capital = "DC";
//                    break;
//                case "Russia":
//                    capital = "Moscow";
//                    break;
//                case "Turkey":
//                    capital = "Ankara";
//                    break;
//                default:
//                    capital = "I do not know";
//            }
//
//            System.out.println("Capital of the " + country + " is " + capital);
//        }


//        String[] animals = {"Donkey", "Monkey", "Turkey", "Mouse", "Dog", "Cat"};
//
//        int animal = 0;
//
//        while (animal < animals.length) {
//            System.out.println(animals[animal]);
//            animal++;
//        }
//
//        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals[i]);
//        }
//
//        for (String s : animals) {
//            System.out.println(s);
//        }

//        int[] numbers = {3, 4, 5, 6, 7};
//        int sum = IntStream.of(numbers).sum();
//        System.out.println(sum);


//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                if (i == 1 || i ==4 || j == 1 || j == 4) {
//                    System.out.print("$");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for (int i = 7; i > 0; i--) {
//            for (int j = 1; j <= i; j ++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 2; i < 8; i++) {
//            for (int j = 1; j <= i; j ++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        int end = inp.nextInt();
//
//        for (int i = end-1; i >= 0; i--) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 11; i++) {
//            if (i == 5 || i == 6) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Happy New Year!");
//        int num = 20;
//
//        do {
//            System.out.println(num);
//            num-=2;
//        } while (num > 1);
//        double[] array;
//        array = new double[3];
//
//        array[0] = 12.99;
//        array[1] = 10.89;
//        String[] liquid = new String[4];
//        liquid[2] = "Water";
//        liquid[1] = "Tea";
//
//        System.out.println(liquid[0]);

//        or
//        String[] names = {"Mike", "Mahmut", "Jack", "Danilo", "Bryan"};
//
//        System.out.println(names[3]);

//        Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

//        char[] grade = new char[6];
//        grade[0] = 'A';
//        grade[1] = 'B';
//        grade[2] = 'C';
//        grade[3] = 'D';
//        grade[4] = 'E';
//        grade[5] = 'F';
//
//        System.out.println(grade[1]);
//
//        char[] grade1 = {'A', 'B', 'C', 'D', 'E', 'F'};
//        System.out.println(grade1[1]);
//
//        String [] group = new String[5];
//        group[0] = "Mahmut";
//        group[1] = "Maria";
//        group[2] = "Mike";
//        group[3] = "Munir";
//        group[4] = "Mira";
//
//        System.out.println(group[0]);
//
//        String []  group1= {"Mahmut", "Maria", "Mike", "Munir", "Mira"};
//
//        for (String valueFromArray : group1) {
//            System.out.println(valueFromArray);
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter how many names you want to store");
//        int size = scanner.nextInt();
//        String[] names = new String[size];
//
//        for (int i = 0; i < size; i++) {
//            System.out.println("Please enter any name");
//            names[i] = scanner.next();
//        }
//
//        for (String name : names) {
//            System.out.println(name + " ");
//        }
//        Create an array of cars and store 6 elements into it. Print all values from the array.
//            String[] car = {"Toyota", "Mazda", "Ford", "Mercedes", "BMW", "Tesla"};
//
//        for (String s : car) {
//            System.out.println(s);
//        }

//        String []  order= {"Java ", "Saturday ", "day.", "coding ", "is "};
//        System.out.println(order[1] + order[4] + order[0] + order[3] + order[2]);


//        for (int i =7; i < 99; i+=7) {
//            System.out.println(i);
//        }
    }
}
