/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdul5_kelompok72;
import java.util.Scanner;

public class Mdul5_kelompok72 {


    public static void main(String[] args) {
      
        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userLogin user = new userLogin( email, password );
        user.login();
    }
    
}
