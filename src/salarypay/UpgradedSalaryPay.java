package salarypay;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UpgradedSalaryPay {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String userInput;
        
        do {
        String first = JOptionPane.showInputDialog("Please Enter Rendered Hour: ");
        int renderedHour = Integer.parseInt(first);
        String second = JOptionPane.showInputDialog("Please Enter Rate per Hour: ");
        int rateHour = Integer.parseInt(second);
        String third = JOptionPane.showInputDialog("Please Enter Undertime Hour: ");
        int undertimeHour = Integer.parseInt(third);
        String forth = JOptionPane.showInputDialog("Please Enter Undertime Hour Rate: ");
        int undertimeRate = Integer.parseInt(forth);
        String fifth = JOptionPane.showInputDialog("Please Enter Overtime Hour: ");
        int overtimeHour = Integer.parseInt(fifth);
        String sixth = JOptionPane.showInputDialog("Please Enter Overtime Hour Rate: ");
        int overtimeRate = Integer.parseInt(sixth);
        String seventh = JOptionPane.showInputDialog("Please Enter Other Deduction: ");
        int otherDeduction = Integer.parseInt(seventh);
       
        int totalrenderedHour = renderedHour - overtimeHour; 
        int totalrateHour = rateHour; 
        int overtimePay = overtimeHour * overtimeRate; 
        
        int basicSalary = (renderedHour * rateHour) + (overtimeHour * overtimeRate); 
        int totalDeduction = ((undertimeHour * undertimeRate) + otherDeduction); 
        int netPay = basicSalary - totalDeduction; 
        
        DecimalFormat formatter = new DecimalFormat("#,###");
        String rh = formatter.format(renderedHour);
        String rph = formatter.format(rateHour);
        String uh = formatter.format(undertimeHour); 
        String uhr = formatter.format(undertimeRate);
        String oh = formatter.format(overtimeHour);
        String ohr = formatter.format(overtimeRate);
        String od = formatter.format(otherDeduction);
        
        String trh = formatter.format(totalrenderedHour);
        String trph = formatter.format(totalrateHour);
        String op = formatter.format(overtimePay);
        String bs = formatter.format(basicSalary);
        String td = formatter.format(totalDeduction);
        String np = formatter.format(netPay);
        
        String output = "| - - - - - - - INPUT VALUE: - - - - - - - |\n" + 
                        "Rendered Hour: " + rh + " Hour" + "\n" +
                        "Rate per Hour: " + rph + " PHP" + "\n" +
                        "Undertime Hour: " + uh + " Hour" + "\n" +
                        "Undertime Hour Rate: " + uhr + " PHP" + "\n" +
                        "Overtime Hour: " + oh + " Hour" + "\n" +
                        "Overtime Hour Rate: " + ohr + " PHP" + "\n" +
                        "Other Deduction: " + od + " Hour" + "\n\n" + 
                        "| - - - - - - - - - RESULT:- - - - - - - - - |\n" +
                        "Total Rendered Hour are: " + trh + " Hour" + "\n" +
                        "Total Rate per Hour are: " + trph + " PHP" + "\n" +
                        "Ovetime Pay will be: " + op + " PHP" + "\n" +
                        "Basic Salary will be: " + bs + " PHP" + "\n" + 
                        "Total Deduction will be: " + td + " PHP" + "\n" + 
                        "Net Pay will be: " + np + " PHP"; 
        
        JOptionPane.showMessageDialog(null, output, "Employee Salary Pay",JOptionPane.INFORMATION_MESSAGE);
        
        System.out.println("Try Again? Please Enter an Input: [y/n]");
        userInput = scanner.nextLine();    
            } while(userInput.equalsIgnoreCase("y"));
    }
}     