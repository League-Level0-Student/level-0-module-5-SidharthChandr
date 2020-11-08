package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
			    String x=JOptionPane.showInputDialog("Enter a number");
			    int num=Integer.parseInt(x);
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) {
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
	}
}
