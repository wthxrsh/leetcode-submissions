class Solution {
    public boolean isValid(String s) {
        // 1. Fixed Typo: Deque/ArrayDeque
        Deque<Character> st = new ArrayDeque<>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 2. Push opening brackets
            if(c == '(' || c == '[' || c == '{') {
                st.push(c);
            } 
            // 3. Handle closing brackets
            else {
                // Check if stack is empty FIRST to avoid crash
                if (st.isEmpty()) {
                    return false;
                }
                
                char top = st.peek();
                
                // Check if the top matches the closing bracket
                if(c == ')' && top != '(') return false;
                if(c == ']' && top != '[') return false;
                if(c == '}' && top != '{') return false;
                
                // If it matches, remove it
                st.pop();
            }
        }
        
        // 4. Valid only if stack is empty at the end
        return st.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna