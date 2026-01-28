import java.util.*;

class Solution {
    public Queue<Integer> reverseKElements(Queue<Integer> q, int k) {

        if (q == null || k <= 0 || k > q.size()) return q;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

      
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }

   
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.offer(q.poll());
        }

        return q;
    }
}
