package example;

import org.joda.time.LocalDate;
import com.google.common.base.Joiner;

public class Example {
    public static void main( String... args ) {
        LocalDate date = new LocalDate();

        String[] parts = new String[3];
        parts[0] = String.valueOf( date.getYear() );
        parts[1] = String.valueOf( date.getMonthOfYear() );
        parts[2] = String.valueOf( date.getDayOfMonth() );

        String today = Joiner.on( '-' ).join( parts );

        System.out.println( "Hello World! The day is: " + today );
    }

    public static String join( String... parts ) {
    	return Joiner.on( ", " ).join( parts );
    }
}