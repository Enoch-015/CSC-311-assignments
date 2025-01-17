/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holidayChrismasChicken;
import java.util.Scanner;


public class HolidayChrismasChicken {
    public static void numberOneA(){
        for(int a = 0; a < 4; a++){
            System.out.println("****====****");
        }
    }
    
    public static void numberOneB(){
        for(int i = 0; i < 4; i++){ 
            for(int j = 0; j < 4; j++){
                System.out.print("*");
            }
            for(int k = 0; k < 4; k++){
                System.out.print("=");
            }
            for(int l = 0; l < 4; l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void numberTwoA(){
        for(int a = 0; a < 6; a++){
            if(a < 3){
                System.out.println("****======");
            }
            else {
                System.out.println("==========");
            }
        }
    }
    
    public static void numberTwoB(){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                if(i < 3 && j < 4){
                    System.out.print("*");
                }
                else {
                    System.out.print("=");   
                }
            }
            System.out.print("\n");
        }
    }
    
    public static double[] Sort(double[] arr){
//        2,5,4,1,3,6,3
//        1,5,4,2,3,6,3
        for(int i = 0; i < arr.length; i++){
            double smallest = arr[i];
            System.out.println(i + " "+ arr[i]);
            for(int j = i; j < arr.length; j++){
                double temp;
                if(arr[j] < smallest){
                    temp = smallest;
                    
                    smallest = arr[j];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
                System.out.println("Debog => smallest: " + smallest + "  arr[i]: " + arr[i] + "  arr[j]: " + arr[j] + "  ij: " + i + " " +  j);
            }
            System.out.println("\n");
        }
        
        return arr;
    }
    
    public static void numberThree(){
        double[] numbers = {2,5,4,1,3,6,3,7};
//        1,2,3,3,4,5,6,7
        
        double sortedNumbers[] = Sort(numbers.clone());
        
        System.out.println(sortedNumbers[0] + " " + sortedNumbers[1] + " " +  sortedNumbers[2] + " " + sortedNumbers[3] + " " + sortedNumbers[4]);
        
        double sum = 0;
        
        for(int i = 0; i < sortedNumbers.length; i++){
            sum += sortedNumbers[i];
        }
        
        double mean = sum/sortedNumbers.length;
        
        
        double median;
        
        if(sortedNumbers.length % 2 == 0){
            int middleIndex = sortedNumbers.length/2;
            median = (sortedNumbers[middleIndex] + sortedNumbers[middleIndex-1])/2;
        }
        else {
            int middleIndex = sortedNumbers.length/2;
            median = sortedNumbers[middleIndex];
        }
        
        int N = sortedNumbers.length;
        
        double devSum = 0;
        for(int i = 0; i < sortedNumbers.length; i++){
           devSum += (sortedNumbers[i] - mean) * (sortedNumbers[i] - mean);
        }
        
        double standardDeviation = Math.sqrt(devSum/N);
        
        System.out.println("Mean: " + mean + "\nMedian: " + median + "\nStandard Deviation: " + standardDeviation);
    }
    
    public static void numberFour(){
        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Please enter value for index " + i + ": ");
            
            inputs[i] = scanner.nextLine();
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("You entered the value: " + inputs[i] + " in index " + i);
        }
    }
    
    public static void numberFive(){
        Scanner scanner = new Scanner(System.in);
        String[][] inputs = new String[10][10];
        
        for(int i = 0; i < 10; i++){
            String[] inner = new String[10];
            
            for(int j = 0; j < 10; j++){
                System.out.println("Please enter value for index where X:" + i + ", Y:" + j + " : ");
                inner[j] = scanner.nextLine();
            }
            
            inputs[i] = inner;
        }
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println("You entered the value: " + inputs[i][j] + " in X: " + i + ", Y:" + j);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Question 1a: \n");
        numberOneA();
        System.out.println("Question 1b: \n");
        numberOneB();
        System.out.println("Question 2a: \n");
        numberTwoA();
        System.out.println("Question 2b: \n");
        numberTwoB();
        System.out.println("Question 3: \n");
        numberThree();
        System.out.println("Question 4: \n");
        numberFour();
        System.out.println("Question 5: \n");
        numberFive();
    }
}
