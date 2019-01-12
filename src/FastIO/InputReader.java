package FastIO;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * @author Sai Nikhil (tsnlegend@gmail.com)
 */
public class InputReader {
    private boolean finished = false;

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    public int r() {
        if (numChars == -1) {
            throw new InputMismatchException();
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar++];
    }

    public int pk() {
        if (numChars == -1) {
            return -1;
        }
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                return -1;
            }
            if (numChars <= 0) {
                return -1;
            }
        }
        return buf[curChar];
    }

    public int nI() {
        int c = r();
        while (isSpaceChar(c)) {
            c = r();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = r();
        }
        int res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = r();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public long nL() {
        int c = r();
        while (isSpaceChar(c)) {
            c = r();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = r();
        }
        long res = 0;
        do {
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = r();
        } while (!isSpaceChar(c));
        return res * sgn;
    }

    public String nS() {
        int c = r();
        while (isSpaceChar(c)) {
            c = r();
        }
        StringBuilder res = new StringBuilder();
        do {
            if (Character.isValidCodePoint(c)) {
                res.appendCodePoint(c);
            }
            c = r();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public boolean isSpaceChar(int c) {
        if (filter != null) {
            return filter.isSpaceChar(c);
        }
        return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private String rL0() {
        StringBuilder buf = new StringBuilder();
        int c = r();
        while (c != '\n' && c != -1) {
            if (c != '\r') {
                buf.appendCodePoint(c);
            }
            c = r();
        }
        return buf.toString();
    }

    public String rL() {
        String s = rL0();
        while (s.trim().length() == 0) {
            s = rL0();
        }
        return s;
    }

    public String rL(boolean ignoreEmptyLines) {
        if (ignoreEmptyLines) {
            return rL();
        } else {
            return rL0();
        }
    }

    public BigInteger rBI() {
        try {
            return new BigInteger(nS());
        } catch (NumberFormatException e) {
            throw new InputMismatchException();
        }
    }

    public char nCh() {
        int c = r();
        while (isSpaceChar(c)) {
            c = r();
        }
        return (char) c;
    }

    public double nD() {
        int c = r();
        while (isSpaceChar(c)) {
            c = r();
        }
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = r();
        }
        double res = 0;
        while (!isSpaceChar(c) && c != '.') {
            if (c == 'e' || c == 'E') {
                return res * Math.pow(10, nI());
            }
            if (c < '0' || c > '9') {
                throw new InputMismatchException();
            }
            res *= 10;
            res += c - '0';
            c = r();
        }
        if (c == '.') {
            c = r();
            double m = 1;
            while (!isSpaceChar(c)) {
                if (c == 'e' || c == 'E') {
                    return res * Math.pow(10, nI());
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                m /= 10;
                res += (c - '0') * m;
                c = r();
            }
        }
        return res * sgn;
    }

    public boolean isExhausted() {
        int value;
        while (isSpaceChar(value = pk()) && value != -1) {
            r();
        }
        return value == -1;
    }

    public String next() {
        return nS();
    }

    public SpaceCharFilter getFilter() {
        return filter;
    }

    public void setFilter(SpaceCharFilter filter) {
        this.filter = filter;
    }

    public interface SpaceCharFilter {
        public boolean isSpaceChar(int ch);
    }
    public int[] nextIntArray(int n){
        int[] array=new int[n];
        for(int i=0;i<n;++i)array[i]=nI();
        return array;
    }
    public int[] nextSortedIntArray(int n){
        int array[]=nextIntArray(n);
        Arrays.sort(array);
        return array;
    }
    public int[] nextSumIntArray(int n){
        int[] array=new int[n];
        array[0]=nI();
        for(int i=1;i<n;++i)array[i]=array[i-1]+nI();
        return array;
    }
    public long[] nextLongArray(int n){
        long[] array=new long[n];
        for(int i=0;i<n;++i)array[i]=nL();
        return array;
    }
    public long[] nextSumLongArray(int n){
        long[] array=new long[n];
        array[0]=nI();
        for(int i=1;i<n;++i)array[i]=array[i-1]+nI();
        return array;
    }
    public long[] nextSortedLongArray(int n){
        long array[]=nextLongArray(n);
        Arrays.sort(array);
        return array;
    }
}
