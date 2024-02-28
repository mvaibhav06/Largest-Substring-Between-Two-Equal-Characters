public class LargestSubstring {
    public static int maxLength(String s){
        int counter = 0;
        int out = Integer.MIN_VALUE;
        for (int i=0; i<s.length()-1; i++){
            for (int j=i+1; j<s.length(); j++){
                if (s.charAt(i) != s.charAt(j)){
//                    counter++;
                }else {
                    counter = j - i - 1;
                    if (out < counter){
                        if (counter > out){
                            out = counter;
                        }
                    }
                }

            }
            counter = 0;
        }
        if (out == Integer.MIN_VALUE){
            out = -1;
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println(maxLength("cbzxy"));
    }
}
