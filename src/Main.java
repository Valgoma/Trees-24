
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("INPUT"));
        int N = sc.nextInt();
        int M = sc.nextInt();
        int res = cuttingTrees(N, M);
        System.out.println(res);
        String outputFName = "OUTPUT";
        String s = String.valueOf(res);
        Files.writeString(Path.of(outputFName), s);
    }

    private static int cuttingTrees(int n, int m) {
        if (n < m || n<=0 || m<=0 ||n >1000)
        {return 0;}
        int vars = n-m+1;
       int i = 1;
           while (m*(i+1) - i <=n)
           {
               vars = vars + n - m*(i+1) + i+1;
               i++;
           }
       return vars;
    }
}