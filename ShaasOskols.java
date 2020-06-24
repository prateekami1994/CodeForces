import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;


public class ShaasOskols {
    public static void main(String[] args) {
        InputStream InputStream = System.in;
        OutputStream OutputStream = System.out;
        InputReader in = new InputReader(InputStream);
        PrintWriter out = new PrintWriter(OutputStream);

        int n = in.nextInt();
        int[] birds = new int[n];

        for(int i = 0;i<n;i++)
            birds[i] = in.nextInt();

        int t = in.nextInt();

        while(t-->0) {
            int x = in.nextInt();
            int y = in.nextInt();

            if(x!=1)
                birds[x-2]+=y-1;
            if(x!=n)
                birds[x]=birds[x]+birds[x-1]-y;
            
            birds[x-1] = 0;
        }

        for(int i = 0;i<n;i++)
            out.println(birds[i]);

        
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

// Good Solution

// #include<iostream>
// #include<algorithm>
// using namespace std;
// int main(){
// 	int n,m,a[101]={0};
// 	int x,y,i;
// 	cin>>n;
// 	for(i=1;i<=n;i++)
// 		cin>>a[i];
// 	cin>>m;
// 	for(i=1;i<=m;i++){
// 		cin>>x>>y;
// 		a[x-1]+=y-1;
// 		a[x+1]+=a[x]-y;
// 		a[x]=0;
// 	}
// 	for(i=1;i<=n;i++)
// 		cout<<a[i]<<endl;
// 	return 0;
// }

