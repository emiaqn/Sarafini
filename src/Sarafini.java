import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Sarafini {

    String w1;
    String w2;
    Queue<Stack> seeni = new LinkedList<Stack>();
    List<String> words;

    public Sarafini(String word1, String word2, List<String> w){
        w1 = word1;
        w2 = word2;
        words = w;
    }

    public String ladder(){

        seeni.offer(new Stack<String>());
        seeni.peek().push(w1);

        while(!seeni.isEmpty()){
            seeni.poll();
            for(int i = 0; i < words.size(); i++)
            {
                int count =0;
                for(int x =0; x< words.get(i).length(); x++){

                }
            }
        }

    }



}
