/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Primes
{
	public static void main(String[] args) {
		for(int i=2; i<100; i++){ // Перебор чисел от 2 до 100
		    if (isPrime(i)){ // Проверка чисел на простоту
		        System.out.println(i); // Вывод простых чисел
		    }
		}
	}
	public static boolean isPrime(int n){
	    for(int i=2; i<n/2; i++){ // Перебор чисел от 2 до n/2
	        if (n%i==0){ // Проверка делимости n на i
	            return false; // Число не простое
	        }
	    }
	    return true; // Число простое
	}
}
