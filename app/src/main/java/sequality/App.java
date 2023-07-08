/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import javax.swing.plaf.ProgressBarUI;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String printSumAndAve(int x, int y) {
        Calculate calc = new Calculate();
        return "Sum of " + x + " and " + y + " is " + calc.sum(x, y) + ". Average is " + calc.ave(x, y) + ".";
    }

    public String printSumAndAveInRange(int x, int y) {
        Calculate calc = new Calculate();
        return "Sum of " + x + " to " + y + " is " + calc.sumInRange(x, y) + ". Average is " + calc.aveInRange(x, y)
                + ".";
    }

    public String printSumOfOddAndEven(int x, int y) {
        Calculate calc = new Calculate();
        return "Sum of odd of " + x + " to " + y + " is " + calc.sumOfOddInRange(x, y) + ". Sum of even is "
                + calc.sumOfEvenInRange(x, y) + ".";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println(app.printSumAndAve(2, 3));
        System.out.println(app.printSumAndAveInRange(1, 10));
        System.out.println(app.printSumOfOddAndEven(1, 10));
    }
}
