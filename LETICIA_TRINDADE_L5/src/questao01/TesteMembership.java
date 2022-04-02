/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

/**
 *
 * @author sidneynogueira
 */

/* @Letícia S2 02/04/2022
    
*/
public class TesteMembership {
    
    public static void main(String[] args) {
        Membership m1 = new Membership("Pedro Paulo", 3, 2021);
        System.out.println(m1.toString());
        System.out.println("Meses de associado : "+m1.membershipMonths());
        Membership m2 = new Membership("Claudia Lima", 3, 2021);
        System.out.println(m2.toString());
        System.out.println("Meses de associado : "+m1.membershipMonths());
        try{
            Membership m3 = new Membership("Maria Paula", 13, 2021);
        }catch(IllegalArgumentException ex){
            System.out.println("Data invalida!");
        }
        try{
            Membership m4 = new Membership("Rodrigo Nunes", 1, 2023);
        }catch(IllegalArgumentException ex){
            System.out.println("Data invalida!");
        }
    }
    
}
