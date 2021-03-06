import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.*;

public class CF55A {
    public static void main(String[] args) {
        InputStream InputStream = System.in;
        OutputStream OutputStream = System.out;
        InputReader in = new InputReader(InputStream);
        PrintWriter out = new PrintWriter(OutputStream);
        
        String input = in.next();
        int upper = 0;

        for(int i = 0;i<input.length();i++) {
            if((int)input.charAt(i) >= 65 && (int)input.charAt(i)<=90)
                upper++;
        }
    
        int lower = input.length() - upper;

        if(lower >= upper) {
            out.print(input.toLowerCase());
        } else {
            out.print(input.toUpperCase());
        }
        
            
        
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
 
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
 
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
 
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}