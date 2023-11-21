import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public List<String> solvePermutations(String word){
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);

            StringBuilder temp = new StringBuilder(word);
            temp.deleteCharAt(i);

            for (int j = 0; j < word.length(); ++j){
                temp.insert(j, c);
                
                if (!answer.contains(String.valueOf(temp))){
                    answer.add(String.valueOf(temp));
                }

                temp.reverse();

                if (!answer.contains(String.valueOf(temp))){
                    answer.add(String.valueOf(temp));
                }

                temp.reverse();
                temp.deleteCharAt(j);
            }
        }

        return answer;
    }
}
