class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char k=st.pop();
                if((ch==')' && k!='(') || (ch=='}' && k!='{') || ch==']' && k!='['){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}