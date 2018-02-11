/**
 * An istance of this class represents a cash card.
 */

import java.util.GregorianCalendar;

public class CashCard 
{
    // class variables
    private static final String INITIAL = "CC";
    
    // instance variables
    /** the id of this card */
    private String cardId;
    /** the current balance of this card */
    private double cardBalance;
    /** the expiry date of the balance in this card */
    private GregorianCalendar expiryDate;

    //-------------------
    // Constructors
    //-------------------

    /**
     * Constructor.
     *
     * @param cardId		the id of this card
     * @param cardBalance	the balance of this card
     * @param expiryDate	the expiry date of the balance in this card
     *
     */	
    public CashCard( String cardId, double cardBalance, GregorianCalendar expiryDate ) 
    {
        this.setCardId(cardId);
        refill(cardBalance);
        setExpiryDate(expiryDate);
    } // end constructor CashCard 

    public void setCardId( String id )
    {
        cardId = id;

    } // end setCardId

    public String getCardId()
    {
        return cardId;
    } // end getCardId	

    /**
     * Sets the expiry date of the balance in this card
     * 
     * @param the expiry date of the balance in this card
     */
    public void setExpiryDate(GregorianCalendar date){
        expiryDate = date;
    }

    /**
     * Returns the expiry date of the balance in this card
     *
     * @return the expiry date of the balance in this card
     */
    public GregorianCalendar getExpiryDate(){
        return expiryDate;
    }

    public void refill( double amount ) 
    {
        cardBalance = cardBalance + amount;
    } // end refill

    public void deduct(double amount)
    {
        cardBalance = cardBalance - amount;
    } // end deduct

    public double getBalance()
    {
        return cardBalance;
    } // end getBalance	

    public String toString(){
        String s = String.format("%1$td/%1$tm/%1$ty", getExpiryDate());

        return String.format("%10s	%7.2f	%10s", getCardId(), getBalance(), s);
    } // end toString
} // end CashCard



	
	
