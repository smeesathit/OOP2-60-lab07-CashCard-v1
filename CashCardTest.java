import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class CashCardTest
{
    public static void main(String[] args) 
    {
        CashCard card1;

        card1	= new CashCard("CC101", 100.00, new GregorianCalendar(2019, Calendar.FEBRUARY, 12));
        System.out.println(card1.toString());

        System.out.println("\n");

        // refill money
        card1.refill(200);
        System.out.println("เติมเงิน 200 บาท == > ยอดเงิน = " + card1.getBalance());
        // deduct money
        card1.deduct(50);
        System.out.println("ตัดยอด: 50 บาท == > ยอดเงิน = " + card1.getBalance());
        // change expiry date
        card1.setExpiryDate(new GregorianCalendar(2019, Calendar.JUNE, 30));
        // show object data
        System.out.println("รหัสบัตร : " + card1.getCardId());
        System.out.println(String.format("ยอดเงิน: %7.2f", card1.getBalance()));
        System.out.println(String.format("วันหมดอายุ: %1$td/%1$tm/%1$ty", card1.getExpiryDate()));
    } // end main
} // end CashCardTest
