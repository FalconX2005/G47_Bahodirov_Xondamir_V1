package task4;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        Level level = record.getLevel();
        String message = record.getMessage();
        Throwable thrown = record.getThrown();

        return thrown.getMessage() + " " + level + " " + message + " " + thrown.getStackTrace();
    }
}
