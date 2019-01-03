package PE2;

public class factorial{
    public static int fact_int(int num){
        int i = 1;
        if (num >= 1)
            for(int j=1;j<=num;j++) {
                i *= j;
        }
        return i;
    }

    public static int fact_long(long num){
        int i=1;
        if (num >= 1)
        for(long j=1;j<=num;j++) {
            i *= j;
        }
        return i;
    }

}