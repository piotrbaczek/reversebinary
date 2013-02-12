/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PETTER
 */
public class Reversebinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        io.println(reversebinary(io.getInt()));
        io.close();
    }

    public static int reversebinary(int s) {
        return Integer.parseInt(new StringBuilder(Integer.toBinaryString(s)).reverse().toString(), 2);
    }
}
