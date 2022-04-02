package questao01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* @Letícia S2 02/04/2022
    
*/
public class Membership
{
    // The name of the member.
    private String name;
    // The month in which the membership was taken out.
    private int month;
    // The year in which the membership was taken out.
    private int year;

    /**
     * Constructor for objects of class Membership.
     * @param name The name of the member.
     * @param month The month in which they joined. (1 ... 12)
     * @param year The year in which they joined.
     */
    public Membership(String name, int month, int year) 
            throws IllegalArgumentException
    {
        if(month > 12 || month < 1 || this.isFuture(month, year)){
         throw new IllegalArgumentException("Data invalida!");
        }
        this.name = name;
        this.month = month;
        this.year = year;
    }
    
    /**
     * @return The member's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The month in which the member joined.
     *         A value in the range 1 ... 12
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * @return The year in which the member joined.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @return A string representation of this membership.
     */
    @Override
    public String toString()
    {
        return "Socio: " + name +
               " entrou no mes " +
               month + " de " + year;
    }
    
    public  int currentYear(){
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        return year;
    }
    
    public  int currentMonth(){
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH);
        return month+1;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Membership other = (Membership) obj;
        return this.name.equals(other.name);
    }

    /**
     * Retorna se a data recebida corresponde a uma data futura.
     * @param month
     * @param year
     * @return Se a data recebida é futura.
     */
    private boolean isFuture(int month, int year){
        
        if (year > currentYear() || year == currentYear() && currentMonth() <= month){
            return true;
        }
        else return year > currentYear();
        
    }
    
    /**
     * Retorna a quantidade de meses da associação.
     * @return 
     */
    public int membershipMonths(){
       
        return (((this.currentYear() - this.year)*12)-this.month)+this.currentMonth();
    }
    
    

}
