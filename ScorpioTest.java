/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeren.test;

import static java.lang.reflect.Array.get;
import java.util.Scanner;

/**
 *
 * @author Len_Z50-70
 */
public class ScorpioTest {

    public static double main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scorpio obj = new Scorpio();
        System.out.println("length: ");
        double len = input.nextDouble();

        for (int i = 0; i < obj.getArrScorpio().length; i++) {
            obj.getArrScorpio()[i] = new Scorpio();

        }
        System.out.println(obj);
        
        
    }
}
