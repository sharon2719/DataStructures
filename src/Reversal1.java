import java.util.Stack;

public class Reversal1 {
    public static void reversal(String word){

        Stack <String> sentence=new Stack<>();

        String tempSentence="";

        for(int i=0;i<word.length();i++){
            if (word.charAt(i)==' '){

                sentence.add(tempSentence);
                tempSentence="";
            }
            else{
                tempSentence=tempSentence + word.charAt(i);
            }

        }
        sentence.add(tempSentence);
       while(!sentence.isEmpty()){
           tempSentence=sentence.pop();
           System.out.print(tempSentence + " ");
//           sentence.pop();
       }
    }


    public static void main(String[] args) {
        String word="Where need is greatest";
        reversal(word);
        System.out.println("\n");
        String word1="Simplicity is genius";
        reversal(word1);
    }
}

