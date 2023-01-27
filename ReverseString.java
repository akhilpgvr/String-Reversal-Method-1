public class ReverseString {
    public static void main(String args[]){
        String say = "Hello";
        //Method-1

        for(Integer index = say.length(); index>0; index--){
            System.out.print(say.charAt(index-1));
        }
        
    }
}
