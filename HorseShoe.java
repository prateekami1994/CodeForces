import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.*;

public class HorseShoe {
    public static void main(String[] args) {
        InputStream InputStream = System.in;
        OutputStream OutputStream = System.out;
        InputReader in = new InputReader(InputStream);
        PrintWriter out = new PrintWriter(OutputStream);

        HashSet<Integer> set = new HashSet<>();

        set.add(in.nextInt());
        set.add(in.nextInt());
        set.add(in.nextInt());
        set.add(in.nextInt());

        out.print(4-set.size());
        
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