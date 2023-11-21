public class countSmileys {

    public int solveCountSmileys(String[] faces){
        int count = faces.length;

        for (String str : faces){
            for (int i = 0; i < str.length(); ++i){
                if (i == 0){
                    if (str.charAt(i) != ':' && str.charAt(i) != ';'){
                        --count;
                        break;
                    }
                }
                if (i == 1 && str.length() == 3) {
                    if (str.charAt(i) != '-' && str.charAt(i) != '~') {
                        --count;
                        break;
                    }
                }
                if ((i == 1 && str.length() == 2) || (i == 2 && str.length() == 3)) {
                    if (str.charAt(i) != ')' && str.charAt(i) != 'D') {
                        --count;
                        break;
                    }
                }
            }
        }

        return (faces.length > 0) ? count : 0;
    }
}