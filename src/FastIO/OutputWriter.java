package FastIO;

import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.PrintWriter;


/**
 * @author Sai Nikhil (tsnlegend@gmail.com)
 */
public class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void p(char[] array) {
        writer.print(array);
    }

    public void p(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
    }

    public void p(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(array[i]);
        }
    }

    public void p(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(array[i]);
        }
    }

    public void p(long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(array[i]);
        }
    }

    public void pn(int[] array) {
        p(array);
        writer.println();
    }

    public void pn(double[] array) {
        p(array);
        writer.println();
    }

    public void pn(long[] array) {
        p(array);
        writer.println();
    }

    public void pn() {
        writer.println();
    }

    public void pn(Object... objects) {
        p(objects);
        writer.println();
    }

    public void p(char i) {
        writer.print(i);
    }

    public void pn(char i) {
        writer.println(i);
    }

    public void pn(char[] array) {
        writer.println(array);
    }

    public void pf(String format, Object... objects) {
        writer.printf(format, objects);
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }

    public void p(long i) {
        writer.print(i);
    }

    public void pn(long i) {
        writer.println(i);
    }

    public void p(int i) {
        writer.print(i);
    }

    public void pn(int i) {
        writer.println(i);
    }

    public void separateLines(int[] array) {
        for (int i : array) {
            pn(i);
        }
    }
}