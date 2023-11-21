import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Permutations
        String word1 = "a";
        String word2 = "ab";
        String word3 = "abc";
        String word4 = "aabb";

        Permutations p = new Permutations();

        System.out.println(p.solvePermutations(word1));
        System.out.println(p.solvePermutations(word2));
        System.out.println(p.solvePermutations(word3));
        System.out.println(p.solvePermutations(word4));

        // FindTheOddInt
        int[] nums1 = {7};
        int[] nums2 = {0};
        int[] nums3 = {1,1,2};
        int[] nums4 = {0,1,0,1,0};
        int[] nums5 = {1,2,2,3,3,3,4,3,3,3,2,2,1};

        findTheOddInt f = new findTheOddInt();

        System.out.println(f.SolveFindTheOddInt(nums1));
        System.out.println(f.SolveFindTheOddInt(nums2));
        System.out.println(f.SolveFindTheOddInt(nums3));
        System.out.println(f.SolveFindTheOddInt(nums4));
        System.out.println(f.SolveFindTheOddInt(nums5));

        // CountSmileys
        String[] faces1 = {":)", ";(", ";}", ":-D"};
        String[] faces2 = {";D", ":-(", ":-)", ";~)"};
        String[] faces3 = {";]", ":[", ";*", ":$", ";-D"};
        String[] faces4 = {};
        String[] faces5 = {"):", "D-;"};

        countSmileys cs = new countSmileys();

        System.out.println(cs.solveCountSmileys(faces1));
        System.out.println(cs.solveCountSmileys(faces2));
        System.out.println(cs.solveCountSmileys(faces3));
        System.out.println(cs.solveCountSmileys(faces4));
        System.out.println(cs.solveCountSmileys(faces5));

    }
}