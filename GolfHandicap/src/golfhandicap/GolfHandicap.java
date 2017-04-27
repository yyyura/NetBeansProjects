/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package golfhandicap;

/**
 *
 * @author yyyura
 */
public class GolfHandicap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double hand;
        hand = calcHandicap(6.3, 70, 72);
        System.out.println("Hand: " + hand);

    }

    public static double calcHandicap(double exactHandicap, int grossScore, int par) {
        double roundedHC = Math.round(exactHandicap); //roundedHC is exactHandicap rounded to the nearest integer
        double netScore = grossScore - roundedHC;     //netScore is the grossScore after the roundedHC is applied
        double changeToHC;                            //this is what is what the handicap is modified by (it is calculated based on the user's score in the round)
        if (netScore > par) {
            exactHandicap += 0.1;
        } else if (netScore < par) {
            if (exactHandicap <= 28.0 && exactHandicap >= 18.0) {
                //category 3 handicap
                changeToHC = (par - netScore) * 0.3;
                exactHandicap -= changeToHC;
            } else if (exactHandicap < 18.0 && exactHandicap >= 10.0) {
                //category 2 handicap
                changeToHC = (par - netScore) * 0.2;
                exactHandicap -= changeToHC;
            } else if (exactHandicap < 10.0) {
                //category 1 handicap
                changeToHC = (par - netScore) * 0.1;
                exactHandicap -= changeToHC;
            }
        }

        return exactHandicap;                      //this is where the handicap is applied to the database (may need changing)
    }

}
