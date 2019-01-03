package PE2;

public class power_4 {
    public static String power_4(int num){
        while(num > 1){
            if (num % 4 == 0){
                num /= 4;
                return ("Number is power of 4");
            }
        }
        return ("Number is not power of 4");
    }
}
