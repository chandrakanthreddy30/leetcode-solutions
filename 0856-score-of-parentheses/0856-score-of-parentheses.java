class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int score=0;
       // int n=s.length();
        for (char c : s.toCharArray()){
            if(c=='('){
                stack.push(0);
            }
            else{
                int inside=stack.pop();
                if(inside==0) score=1;
                else{
                    score=2*inside;
                }
                int previous=stack.pop();
                stack.push(score+previous);
            }
        }
        return stack.pop();
    }
}