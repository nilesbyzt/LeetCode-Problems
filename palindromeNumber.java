public class palindromeNumber {
    public boolean isPalindrome(int x) {
     if(x<0) return false;
     else{  
     String str = Integer.toString(x);

     String reverse="";

     for(int i = str.length()-1; i>=0; i--){
         reverse = reverse + str.charAt(i);
         if(str.equals(reverse)) return true;
     }
     return false;
     }

    }
}