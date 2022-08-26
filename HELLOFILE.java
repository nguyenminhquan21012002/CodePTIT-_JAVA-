
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuanNM
 */
public class HELLOFILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception {
        File f = new File("Hello.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
    
}
