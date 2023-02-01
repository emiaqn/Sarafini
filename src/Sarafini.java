import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Sarafini {

    String w1;
    String w2;
    Queue<Stack> seeni = new LinkedList<Stack>();
    List<String> alpha;

    public Sarafini(String word1, String word2, List<String> a){
        w1 = word1;
        w2 = word2;
        alpha = a;
    }

    public String ladder(){

        seeni.offer(new Stack<String>());
        seeni.peek().push(w1);

        while(!seeni.isEmpty()){
            seeni.poll();
            for(int i = 0; i < alpha.size(); i++)
            {
             for(int j = 0; j < w1.length(); j++){
                 String temp = w1.substring(0,j) + alpha.get(i) + w1.substring(j, w1.length());
             }

            }
        }

    }



}
