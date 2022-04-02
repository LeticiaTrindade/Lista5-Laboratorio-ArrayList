/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao01;

import java.util.ArrayList;

/**
 *
 * @author sidneynogueira
 */


/* @Letícia S2 02/04/2022
    
*/
public class TesteClub {
    
    public static void main(String[] args) {
        Club c = new Club();
        System.out.println(c.join(new Membership("Carlos", 1, 2022)));
        c.join(new Membership("Pedro", 1, 2021));
        c.join(new Membership("Maria", 1, 2011));
        System.out.println(c.join(new Membership("Carlos", 1, 2011)));
        c.printMembers();
        System.out.println("\nMembros desde 2021");
        System.out.println("**************************************");
        ArrayList<Membership> members = c.membersSince(2021);
        for (Membership member : members) {
            System.out.println(member.toString());}
        System.out.println("**************************************");
        System.out.println("");
        System.out.printf("Mais antigo -> ");
        System.out.println(c.olderMembership());
        System.out.println(c.numberOfMembers());
        c.exitClub("Pedro");
        System.out.println(c.numberOfMembers());
    }
    
}

