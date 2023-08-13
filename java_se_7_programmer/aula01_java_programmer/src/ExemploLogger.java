import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploLogger {
    private static final Logger logger = Logger.getLogger(ExemploLogger.class.getName());

    public static void main(String[] args) {
        Scanner lei = new Scanner(System.in);

        logger.log(Level.WARNING, "Isso é uma mensagem de informação.");
        String filme = lei.nextLine();
        // logger.info( "Isso é uma mensagem de aviso.");
        // logger.log(Level.SEVERE, "Isso é uma mensagem de erro.");

        logger.log(Level.INFO, filme);
    }
}
