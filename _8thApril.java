package April;

import java.util.ArrayList;
import java.util.Arrays;

public class _8thApril {
    public static void main(String[] args) {

    }
    public static Node clonegraph(Node node){
        if (node==null) return null;
        Node copy = new Node(node.val);
        Node[] visited = new Node[101];
        Arrays.fill(visited,null);
        dfs(node,copy,visited);
        return copy;
    }

    private static void dfs(Node node, Node copy, Node[] visited) {
        visited[copy.val] = copy;
        for (Node n:node.neighbors){
            if (visited[n.val]==null){
                Node newnode = new Node(n.val);
                copy.neighbors.add(newnode);
                dfs(n,newnode,visited);
            }else {
                copy.neighbors.add(visited[n.val]);
            }
        }
    }
}
