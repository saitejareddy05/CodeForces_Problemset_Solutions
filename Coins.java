import java.io.*;

public class Coins {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            long value = 0;
            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }
            return value;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder result = new StringBuilder();

        int t = (int) fs.nextLong();

        while (t-- > 0) {
            long a = fs.nextLong();
            long b = fs.nextLong();

            boolean possible = false;

            long maximumY = a / b;

            for (long y = 0; y <= maximumY; y++) {
                long remaining = a - b * y;

                if (remaining % 2 == 0) {
                    possible = true;
                    break;
                }
            }

            result.append(possible ? "YES\n" : "NO\n");
        }

        System.out.print(result);
    }
}
