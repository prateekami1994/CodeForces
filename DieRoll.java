import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;


public class DieRoll {
    public static void main(String[] args) {
        InputStream InputStream = System.in;
        OutputStream OutputStream = System.out;
        InputReader in = new InputReader(InputStream);
        PrintWriter out = new PrintWriter(OutputStream);

        int Y = in.nextInt();
        int W = in.nextInt();

        int maxYW = 6-Math.max(Y,W)+1;

        int common = gcd(maxYW, 6);

        out.print(maxYW/common);
        out.print("/");
        out.print(6/common);


      
        out.close();
    }

    public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a, a);
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

