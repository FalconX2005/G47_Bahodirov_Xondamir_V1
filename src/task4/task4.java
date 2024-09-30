package task4;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task4 {
   static Logger log = Logger.getLogger("yil.oy.kub.log");
    public static void main(String[] args) throws IOException {
        LocalDate today = LocalDate.now();
        Level level = Level.SEVERE;
        FileHandler handler = new FileHandler("yil.oy.kub.log");
        handler.setLevel(level);
        CustomFormatter formatter = new CustomFormatter();
        handler.setFormatter(formatter);
        log.addHandler(handler);
        log.log(Level.INFO, "Starting task");
        log.log(Level.INFO, "Today is {0}", today);

    }
}
