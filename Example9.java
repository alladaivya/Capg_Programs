package pcg;
import java.time.*;
import java.util.*;

public class Example9 {  
   public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(1965, 02, 25);
        LocalDate now = LocalDate.now();

        Period dt = Period.between(pdate, now);

     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    dt.getYears(), dt.getMonths(), dt.getDays());
  }
} 
