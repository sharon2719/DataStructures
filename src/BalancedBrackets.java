import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    static HashMap<Character,Character>bracketsMap;
    static {
        bracketsMap=new HashMap<>();
        bracketsMap.put('(',')');
        bracketsMap.put('[',']');
        bracketsMap.put('{','}');

    }
    public static String isBalanced(String s){
       if ((s.length()%2)==1){
           return "NO";
       }
        Stack<Character>bracketsStack=new Stack<Character>();
       for(int j=0;j<s.length();j++){
           Character p=s.charAt(j);
           if(bracketsMap.containsKey(p)){
               bracketsStack.push(p);

           }
           else if (bracketsStack.isEmpty() || p != bracketsMap.get(bracketsStack.pop())){
               return "NO";
           }
       }
       return bracketsStack.isEmpty()?"YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{([)}"));
        System.out.println(isBalanced("{{[[(())]]}}"));

    }
































//    private static Scanner scanner=new Scanner(System.in);
    //        int m=scanner.nextInt();
//        for(int l=0;l<m;l++){
//            String brackets= scanner.nextLine();
//            String finalResult=isBalanced(brackets);


//        }
//        scanner.close();

}
