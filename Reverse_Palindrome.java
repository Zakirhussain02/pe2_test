package PE2;

public class Reverse_Palindrome {
    public static String Reverse_String(String s){
        String reverse="";
        for(int j=s.length() -1;j>=0;j--)
        {
            reverse=reverse+s.charAt(j);
        }
        return reverse;
    }
    public static String Palindrome(String s){
        String reverse="",reverse_value="";
        for(int k=s.length()-1;k>=0;k--)
        {
            reverse=reverse+s.charAt(k);
        }
        if(s.equals(reverse))
        {
            reverse_value+=s+" is a Palindrome";
        }
        else{
            reverse_value+=s+" is not a Palindrome";
        }
        return reverse_value;
    }
}