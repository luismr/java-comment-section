public class Solution {
    public static int solution(int N, String S, String[] comments) {
        if (comments == null || S == null || S.trim().isEmpty()) {
            return 0;
        }
        
        String searchPattern = "\\b" + java.util.regex.Pattern.quote(S.toLowerCase()) + "\\b";
        return (int) java.util.Arrays.stream(comments)
            .filter(comment -> comment != null && 
                   comment.toLowerCase().matches(".*" + searchPattern + ".*"))
            .count();
    }
} 