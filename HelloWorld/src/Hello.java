public class Hello {




        public static String encrypt(final String text, final int n) {
            String originalString = text;
            String newString = text;
            String tempString = "";
            String encrypted = "";
            String secondChar = "";
            String otherChar = "";
            int stringLength = originalString.length();
            int counter = 0;

            System.out.println(newString.length());
            System.out.println(newString);
            while(counter <= n){
                //System.out.println("Counter: " + counter);
                tempString = "";
                for(int i = 0; i < stringLength-1; i++)
                {
                    //System.out.println(i);
                    System.out.println("NEW STRING: " + tempString);
                    if((i+1)%2 == 0){
                        secondChar = secondChar + newString.charAt(i);
                        //System.out.println("SECOND CHAR: " + secondChar);
                    }
                    else{
                        otherChar = otherChar + newString.charAt(i);
                        //System.out.println("OTHER CHAR: "+otherChar);
                    }
                    tempString = secondChar + otherChar;
                    //System.out.println("NEW STRING: " + tempString);
                }
                newString = tempString;
                counter++;
            }
            //System.out.println(newString);
            return newString;
        }

        public static String decrypt(final String encryptedText, final int n) {
            // Your code here
            return null;
        }


    public static void main(String[] args) {
        encrypt("This is a test!", 1);
    }
}
