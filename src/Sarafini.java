import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Sarafini {

    String w1;
    String w2;
    Queue<Stack> seeni = new LinkedList<Stack>();
    String alpha;
    List<String> dict;



    public Sarafini(String word1, String word2, String a, List<String> d){
        w1 = word1;
        w2 = word2;
        alpha = a;
        dict = d;
    }

    public String ladder() {
        boolean sus = false;
        String answa = "";

        seeni.offer(new Stack<String>());
        seeni.peek().push(w1);

        while (!seeni.isEmpty()) {
            for (int j = 0; j < w1.length(); j++) {
                {
                    for (int i = 0; i < alpha.length(); i++) {
                        String temp = w1.substring(0, j) + alpha.substring(i, i+1) + w1.substring(j+1);
                        if(dict.contains(temp))
                        {
                            for(Stack<String> s : seeni)
                            {
                                for(String teeni : s)
                                {
                                    if(teeni.equals(temp))
                                    {
                                        sus = true;
                                    }
                                }
                            }

                            if(sus == false) {

                                if (temp.equals(w2)) {
                                    for (Object lol : seeni.peek()) {
                                        answa += lol + " ";
                                    }
                                    return answa;
                                }
                                else{
                                    Stack<String> teepi = seeni.peek();
                                    teepi.push(temp);
                                    seeni.offer(teepi);
                                }
                            }

                        }
                    }

                }
            }

        }
        return null;


    }
}
