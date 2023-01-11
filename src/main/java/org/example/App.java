package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("         *");
        System.out.println("         |");
        for (int i = 0; i < 20; i += 2){
            for (int j = 10 - i/2-1; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("        ###");
        System.out.println("        ###");

        System.out.println( "Hello World!" );
    }
}
