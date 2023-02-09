import java.lang.reflect.Array;
import java.util.*;

public class Sarafini {

    String word1;
    String word2;
    String alpha;
    HashSet<String> dict;

    public Sarafini(String w1, String w2, String a, HashSet<String> d){
        word1 = w1;
        word2 = w2;
        alpha = a;
        dict = d;
    }

    public Stack<String> buildLadder() {
        Queue<Stack<String>> q = new LinkedList<Stack<String>>();
        Stack<String> tempStack = new Stack<String>();
        tempStack.push(word1);
        q.add(tempStack);
        while(!q.isEmpty()){
            Stack<String> stacks = new Stack<String>();
            for(String s: q.poll()){
                stacks.push(s);
            }
            String topWord = stacks.peek();
            //System.out.println(topWord);
            String tempWord;
            List<String> neighbors = new ArrayList<String>();
            for(int i = 0; i < topWord.length(); i++) {
                for (int j = 0; j < alpha.length(); j++) {
                    //System.out.println("Bird");
                    tempWord = topWord.substring(0, i) + alpha.substring(j, j + 1) + topWord.substring(i + 1);
                    if (dict.contains(tempWord)) {
                        neighbors.add(tempWord);
                    }
                }
            }
            ArrayList<String> idek = new ArrayList<String>();
            for(String str : neighbors){
                for(Stack<String> st: q){
                    for(String s : st){
                        if(s.equals(str)){
                            idek.add(str);
                        }
                    }
                }
            }
            for(String ugh : idek){
                neighbors.remove(ugh);
            }
            for(String str:neighbors){
                if(word2.equals(str)){
                    stacks.add(word2);
                    return stacks;
                }else{
                    Stack<String> copy = new Stack<String>();
                    for(String s: stacks){
                        copy.push(s);
                    }
                    copy.push(str);
                    q.add(copy);

                }
            }


        }

        return null;
    }
}

