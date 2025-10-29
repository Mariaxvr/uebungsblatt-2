package h3;

public class H3_Main {
    public static void main(String[] args) {
        int i=140;
        int j=150;
        int k=-10;
        if (i>j && i<=200 && j<=100)
            k = 1;
        if (i>j && i>200 && j<=100)
            k = 2;
        if (i>j && i>200 && j>100)
            k = 3;
        if (i<=j && i<=200 && j<=100)
            k = 4;
        System.out.println(k);
    }
}
