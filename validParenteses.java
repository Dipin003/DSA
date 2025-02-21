import java.util.Stack;

public class validParenteses {
 
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(')  stack.push(')');
            else if(c =='{') stack.push('}');
            else if(c == '[') stack.push(']');

            else if(stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        validParenteses vp = new validParenteses();
        System.out.println(vp.isValid("()"));
        System.out.println(vp.isValid("()[]{}"));
    }
}
