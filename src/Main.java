import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Pattern START = Pattern.compile("\\b[а-яА-Яa-zA-Z]+");

        Matcher m = START.matcher(s);
        StringBuilder sb = new StringBuilder();
        while(m.find()){
            String val = s.substring(m.start(), m.end());
            if(val.isEmpty()) sb.append(val);
            else sb.append(val.substring(0, 1).toUpperCase() + val.substring(1) + " ");
        }
        System.out.println(sb.toString());
    }

}