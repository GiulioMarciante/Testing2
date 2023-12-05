import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni
public class Main {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        fullFormat(date);
        mediumFormat(date);
        shortFormat(date);
    }
    public static String fullFormat(OffsetDateTime date) {
        String dataStringFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Full: " + dataStringFull);
        return dataStringFull;
    }
    public static String mediumFormat(OffsetDateTime date) {
        String dataStringMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Medium: " + dataStringMedium);
        return dataStringMedium;
    }
    public static String shortFormat(OffsetDateTime date) {
        String dataStringShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Short: " + dataStringShort);
        return dataStringShort;
    }
}