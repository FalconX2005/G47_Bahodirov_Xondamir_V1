package task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findPhoneNUmber {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("PhoneNumbers.txt"))) {
            StringBuilder sb = new StringBuilder();

            while(br.readLine() != null) {
                sb.append(br.readLine());
            }
            Pattern pattern = Pattern.compile("\\+998\\(\\d{2}\\)\\d{7}");
            Matcher matcher = pattern.matcher(sb.toString());
            while(matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
