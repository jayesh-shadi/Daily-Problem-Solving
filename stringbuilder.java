public class stringbuilder {
    public static void main(String[] args) {
        
    }
 static String joinwords(String[] words)
    {
        StringBuilder sentence=new StringBuilder();
        for(String w:words)
        {
            sentence.append(w);
        }
        return sentence.toString();
    }
}
