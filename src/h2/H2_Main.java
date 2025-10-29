package h2;

public class H2_Main {
    public static void main(String[] args) {
        int i=18;
        int j=3;
        int k=7;
        int min;
        int max;
        if (i<j&&i<k)
            min = i;
        else if (j<k)
            min = j;
        else
            min = k;
        if (i>j&&i>k)
            max = i;
        else if (j>k)
            max = j;
        else
            max = k;
        System.out.println(min);
        System.out.println(max);
    }
}
