package org.patchy;
import org.patchy.utils.Finder;
import org.patchy.utils.OsFinder;

import java.util.Scanner;



import java.io.PrintStream;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintStream  p  = new PrintStream(System.out);
        OsFinder osFinder = new OsFinder();
        System.out.println(osFinder.getOs());


        p.println("""
            
            /$$$$$$$              /$$               /$$                          
           | $$__  $$            | $$              | $$                          
           | $$  \\ $$  /$$$$$$  /$$$$$$    /$$$$$$$| $$$$$$$  /$$   /$$ /$$   /$$
           | $$$$$$$/ |____  $$|_  $$_/   /$$_____/| $$__  $$| $$  | $$| $$  | $$
           | $$____/   /$$$$$$$  | $$    | $$      | $$  \\ $$| $$  | $$| $$  | $$
           | $$       /$$__  $$  | $$ /$$| $$      | $$  | $$| $$  | $$| $$  | $$
           | $$      |  $$$$$$$  |  $$$$/|  $$$$$$$| $$  | $$|  $$$$$$$|  $$$$$$$
           |__/       \\_______/   \\___/   \\_______/|__/  |__/ \\____  $$ \\____  $$
                                                              /$$  | $$ /$$  | $$
                                                             |  $$$$$$/|  $$$$$$/
                                                              \\______/  \\______/ 
                   
                """);


        p.print("What is the name of the file you are trying to find: ");
        String respone  = sc.next();
        Finder.findFile(respone);
        sc.close();


    }
}
