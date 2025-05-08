/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primecheckerapp;

/**
 *
 * @author HUY HUNG
 */
public class main {
   
    public static void main(String[] args) {
        PrimeChecker checker = new PrimeChecker();
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17};
        for (int n : testNumbers) {
            System.out.println(n + " is prime? " + checker.isPrime(n));
        }
    }

}
