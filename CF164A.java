import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;


public class CF164A {
    public static void main(String[] args) {
        InputStream InputStream = System.in;
        OutputStream OutputStream = System.out;
        InputReader in = new InputReader(InputStream);
        PrintWriter out = new PrintWriter(OutputStream);

        int n = in.nextInt();

        int[] home = new int[n];
        int[] away = new int[n];

        int result = 0;

        for(int i = 0;i<n;i++) {
            home[i] = in.nextInt();
            away[i] = in.nextInt();
        }

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                if(away[i] == home[j])
                    result++;
            }
        }

        out.print(result);
        
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