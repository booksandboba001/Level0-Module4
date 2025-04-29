package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {
        String score = JOptionPane.showInputDialog("What was your score out of a hundred?");
        double grade = Double.parseDouble(score)/100;
        System.out.println(grade);
        if ((grade >0)&& (grade < 0.59)){
            JOptionPane.showMessageDialog(null, "Your grade is an F. Did you really study?");
        }
        if ((grade > 0.60)&& (grade < 0.69)){
            JOptionPane.showMessageDialog(null, "Your grade is a D. Try harder next time!");
        }
        if ((grade >0.69)&& (grade < 0.79)){
            JOptionPane.showMessageDialog(null, "Your grade is an C. Almost a B. Study a bit harder, and you might make it!");
        }
        if ((grade > 0.79)&& (grade < 0.89)){
            JOptionPane.showMessageDialog(null, "Your grade is an B. Almost there...");
        }
        if ((grade >0.89)&& (grade < 1)){
            JOptionPane.showMessageDialog(null, "Your grade is an A for amazing! Great job!");
        }
        else if ((grade> 1)){
            JOptionPane.showMessageDialog(null, "Amazing! You're a natural at this subject!");
        }
    }
}
