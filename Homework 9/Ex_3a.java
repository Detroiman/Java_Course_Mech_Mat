import java.io.*;
import java.util.Vector;
import java.util.Arrays;
import java.util.ArrayList;


public class Ex_3a
{

    public static void main(String[] args)
    {
        double[] a = {11, 31, 12, 10, 21, 1, 4, 5, 6, 45, 121, 43223, 5342, 12222, 321, 432, 432, 42, 4334, 43443};
        double[] b;
        writeDoubleArrayV1("input.double", a);
        b = readDoubleArrayV1("input.double");
        System.out.println(Arrays.toString(b));
        f1("input.double");
    }
    public static void
    writeDoubleArrayV1(String filename, double[] array)
    {
        FileOutputStream fos;
        BufferedOutputStream bos;
        DataOutputStream dos;
        try
        {
            fos = new FileOutputStream(filename);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            for (int i = 0; i < array.length; i++)
                dos.writeDouble(array[i]);
            dos.close();
        }
        catch (IOException e) {System.out.println(e);}
    }
    public static double[]
    readDoubleArrayV1(String filename)
    {
        FileInputStream fis;
        BufferedInputStream bis;
        DataInputStream dis;

        try
        {
            fis = new FileInputStream(filename);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            Vector<Double> v = new Vector<Double>();

            try
            {
                while (true)
                {
                    Double d = dis.readDouble();
                    v.add(d);
                }
            }
            catch (EOFException e)
            {
                dis.close();
                double[] array = new double[v.size()];
                for (int i = 0; i < array.length; i++)
                    array[i] = (double) v.get(i);
                return array;
            }
        }
        catch (IOException e) {System.out.println(e);}
        return null;
    }

    public static void f1(String filename) {
        double[] array = readDoubleArrayV1(filename);
        ArrayList<Double> list_num = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                list_num.add(array[i]);
            }
        }
        System.out.println(list_num);
    }
}
