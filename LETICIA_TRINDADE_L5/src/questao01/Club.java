package questao01;

import java.util.ArrayList;

/* @Letícia S2 02/04/2022
    
 */
/**
 * Store details of club memberships.
 */
public class Club {

    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club() {
        this.members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members. A member is added if
     * there is not a member with the same name.
     *
     * @param member The member object to be added.
     * @return If there is success to insert a new member.
     */
    public boolean join(Membership member) {
        if (this.members.contains(member)) {
            return false;
        } else {
            this.members.add(member);
            return true;
        }
    }

    /**
     * @return The number of members (Membership objects) in the club.
     */
    public int numberOfMembers() {
        return this.members.size();
    }

    /**
     * Retorna se existe um sócio com o nome recebido.
     *
     * @param name Nome a ser consultado.
     * @return Se o sócio está no clube.
     */
    public boolean isMember(String name) {
        return this.members.toString().contentEquals(name);
    }

    /**
     * Remove do clube sócio cujo nome foi passado como parâmetro. Se não
     * existir um sócio com o nome recebido, nenhuma mudança acontece.
     *
     * @param memberName Nome do sócio a ser descadastrado.
     */
    public void exitClub(String memberName) {
        String nominho;
        for (int i = 0; i < this.members.size(); i++) {
            Membership nome = this.members.get(i);
            nominho = nome.getName();
            if (nominho.equals(memberName)) {
                members.remove(members.get(i));
            }
        }
    }

    /**
     * Retorna o sócio a mais tempo no clube. Se houver empate entre os que
     * estão a mais tempo no clube, retorna qualquer um dos que estão a mais
     * tempo.
     *
     * @return Sócio que está a mais tempo no clube.
     */
    public Membership olderMembership() {

        int membroant = 0;
        int c = 0;

        for (int i = 0; i < members.size(); i++) {
            Membership x = this.members.get(i);
            if (x.membershipMonths() >= c) {

                c = x.membershipMonths();
                membroant = i;

            }
        }

        return members.get(membroant);
    }

    /**
     * Retorna os sócios que estao associados a partir de um determinado ano.
     *
     * @param year ano da consulta.
     * @return Sócios desde o ano recebido.
     */
    public ArrayList<Membership> membersSince(int year) {

        ArrayList<Membership> c = new ArrayList();

        for (Membership member : this.members) {
            if (member.getYear() >= (year)) {
                c.add(member);
            }

        }
        if (c.isEmpty()) {
            return null;
        } else {
            return c;
        }
    }

    public void printMembers() {

        for (Membership member : this.members) {
            System.out.println("-------------------------------------- \n"
                    + "Membro No " + this.members.indexOf(member) );
            System.out.println(member.toString());
        }
        System.out.print("----------- FIM DA LISTAGEM ----------- \n");
    }

}
