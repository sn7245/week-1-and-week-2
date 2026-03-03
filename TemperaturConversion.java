import java.util.Scanner; 
class TemperaturConversion { 
    static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the temperature in Celsius: "); 
        double celsius = sc.nextDouble(); 
        double fahrenheitResult = (celsius * 9 / 5) + 32; 
        System.out.println("The temperature in Fahrenheit is " + fahrenheitResult); 
        sc.close(); 
    } 
} 