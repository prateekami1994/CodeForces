import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;


public class CF223A {
    
    public static void main(String[] args) {
        InputStream InputStream = System.in;
        OutputStream OutputStream = System.out;
        InputReader in = new InputReader(InputStream);
        PrintWriter out = new PrintWriter(OutputStream);

        int n = in.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0;i<n;i++)
            arr[i] = in.nextInt(); 

        for(int i = 0;i<n;i++)
            sum += arr[i];

        int l = 0;
        int r = n-1;

      
        int sereja = 0;
      

        while(l<=r) {
            if(arr[l]>arr[r]) {
                sereja += arr[l];
                l++;
            } else {
                sereja += arr[r];
                r--;
            }

            if(l<=r) {
                if(arr[l]>arr[r]) l++;
                else r--;
            }
        }

        out.printf("%d %d", sereja, sum-sereja);
        
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


// optimized solution

// #include<bits/stdc++.h>
// using namespace std;
// main()
// {int n,a[1010],ans[2],m=0;
// 	cin>>n;
// 	for(int i=1;i<=n;i++)
// 		cin>>a[i];
// 	int L=1,R=n;
// 	while(L<=R)
// 	{
// 		if(a[L]>=a[R])
// 			ans[m]+=a[L++];
// 		else
// 			ans[m]+=a[R--];
// 		m=(m+1)%2;
// 	}
// 	cout<<ans[0]<<" "<<ans[1];
// 	return 0;

// }



