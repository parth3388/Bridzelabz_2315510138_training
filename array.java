package fullStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergedPrograms {

    public static void main(String[] args) {
        // A single Scanner object is created and passed to methods that need it.
        Scanner sc = new Scanner(System.in);

        // Uncomment the function you want to run
        // runTwoDToOneD(sc);
        // runGradesCalculation(sc);
        // runDigitFrequency(sc);
        // runLeadersInArray();
        // runFactor(sc);
        // runRemoveOccurence();
        // runStudentGrades(sc);
        // runFizzBuzz(sc);
        // runRearrangeArray();

        // The scanner is closed at the end of the main method.
        sc.close();
    }

    // 1. Convert 2D Array to 1D Array (from TwoDToOneD.java)
    public static void runTwoDToOneD(Scanner sc) {
        System.out.println("--- 2D to 1D Array Converter ---");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }
        System.out.println("1D Array elements are:");
        System.out.println(Arrays.toString(array));
    }

    // 2. Calculate Student Grades (from GradesCalculation.java)
    public static void runGradesCalculation(Scanner sc) {
        System.out.println("--- Grades Calculation ---");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + " in Physics, Chemistry, and Maths:");
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Invalid input. Enter positive value again.");
                    j--;
                } else {
                    marks[i][j] = m;
                }
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\nResult:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d, Percentage=%.2f, Grade=%c%n",
                              (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }

    // 3. Calculate Digit Frequency (from DigitFrequency.java)
    public static void runDigitFrequency(Scanner sc) {
        System.out.println("--- Digit Frequency Calculator ---");
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if (number == 0) {
            System.out.println("Digit 0: 1 time(s)");
            return;
        }

        int[] freq = new int[10];
        long tempNum = Math.abs(number);

        while (tempNum > 0) {
            int digit = (int) (tempNum % 10);
            freq[digit]++;
            tempNum /= 10;
        }

        System.out.println("Frequency of digits in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i] + " time(s)");
            }
        }
    }

    // 4. Find Leaders in an Array (from LeadersInArray.java)
    public static void runLeadersInArray() {
        System.out.println("--- Leaders in Array ---");
        int[] arr = {10, 5, 3, 1, 9, 8};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.print("Leaders are: ");
        leader(arr);
    }

    public static void leader(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    // 5. Find Factors of a Number (from factor.java)
    public static void runFactor(Scanner sc) {
        System.out.println("--- Factor Finder ---");
        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Factors of " + num + " are: " + factors);
    }

    // 6. Remove All Occurrences of an Element (from RemoveOccurence.java)
    public static void runRemoveOccurence() {
        System.out.println("--- Remove All Occurrences ---");
        int[] arr = {5, 6, 6, 5, 6};
        int elementToRemove = 5;
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Element to remove: " + elementToRemove);

        int[] new_arr = removeEle(arr, elementToRemove);

        System.out.println("New Array: " + Arrays.toString(new_arr));
    }

    public static int[] removeEle(int[] arr, int ele) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                count++;
            }
        }
        int[] new_arr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ele) {
                new_arr[index++] = arr[i];
            }
        }
        return new_arr;
    }

    // 7. Calculate Student Grades (from StudentGrades.java)
    public static void runStudentGrades(Scanner sc) {
        System.out.println("--- Student Grades (Alternative Version) ---");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " in Physics, Chemistry, Maths:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else if (percentage[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d: Percentage = %.2f, Grade = %c%n", i + 1, percentage[i], grade[i]);
        }
    }

    // 8. FizzBuzz (from FizzBuzz.java)
    public static void runFizzBuzz(Scanner sc) {
        System.out.println("--- FizzBuzz ---");
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Please enter a positive integer!");
            return;
        }

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " = FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " = Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " = Buzz");
            } else {
                System.out.println(i + " = " + i);
            }
        }
    }

    // 9. Rearrange Array (from RearrangeArray.java)
    public static void runRearrangeArray() {
        System.out.println("--- Rearrange Array ---");
        int[] arr1 = {1, 2, 3, -4, -1, 4};
        System.out.println("Original Array 1: " + Arrays.toString(arr1));
        System.out.println("Rearranged Array 1: " + Arrays.toString(rearrange(arr1)));

        System.out.println();

        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        System.out.println("Original Array 2: " + Arrays.toString(arr2));
        System.out.println("Rearranged Array 2: " + Arrays.toString(rearrange(arr2)));
    }

    public static int[] rearrange(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[arr.length];
        int i = 0, p = 0, q = 0;

        // In the original file, the logic alternated between positive and negative
        // The below implementation keeps that logic.
        boolean turn = true;
        while (p < pos.size() && q < neg.size()) {
            if (turn) result[i++] = pos.get(p++);
            else result[i++] = neg.get(q++);
            turn = !turn;
        }
        
        while (p < pos.size()) result[i++] = pos.get(p++);
        while (q < neg.size()) result[i++] = neg.get(q++);
        
        return result;
    }
}
