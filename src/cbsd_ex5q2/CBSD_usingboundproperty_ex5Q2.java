/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cbsd_ex5q2;

import java.util.Scanner;

/**
 *
 * @author tleku
 */
public class CBSD_usingboundproperty_ex5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LiveScoreBean source = new LiveScoreBean();
        ScoreNowSub sub1 = new ScoreNowSub();
        FootballScoreSub sub2 = new FootballScoreSub();
        
        source.addPropertyChangeListener(sub1);
        source.addPropertyChangeListener(sub2);
        
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter Score :");
            String scoreIn = in.nextLine();
            if (scoreIn.equals("")) {
                break;
            }
            else {
                source.setScoreLineProperty(scoreIn);
            }
        }
    }
    
}
