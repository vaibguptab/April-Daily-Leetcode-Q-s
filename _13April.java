package April;

import java.util.Stack;

public class _13April {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        System.out.println(validatestack(pushed,popped));
    }

    private static boolean validatestack(int[] pushed, int[] popped) {
        if (pushed.length!=popped.length) return false;

        Stack<Integer> stack = new Stack<>();
        boolean flag ;
        for (int i=0;i< popped.length;i++){
            for (int j=0;j<pushed.length;j++){
                if (pushed[j]==popped[i]) {
//                    stack.peek();
                    break;
                } else if (stack.contains(popped[i]) || stack.contains(pushed[i])) {
                    continue;
                } else if (pushed[j] != popped[i]) {
                    stack.push(pushed[i]);
                }
            }

        }
        return false;
    }
}
