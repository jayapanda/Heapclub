package Graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class UndirectedGraphNode {
     int label;
     List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { 
    	label = x; 
    	neighbors = new ArrayList<UndirectedGraphNode>(); }
  };
 

public class CloneGraph {
	
	
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if(node==null)
    		return null;
	    boolean [] visited = new boolean[10];
	    for(int i = 0; i < 10;i++){
	    	visited[i] = false;
	    }
	    UndirectedGraphNode root= cloneGraphUtil( node,visited);
	    
        return root;
        
  
    }
    
    public UndirectedGraphNode cloneGraphUtil(UndirectedGraphNode v, boolean [] visited){
		visited[v.label] = true;
		UndirectedGraphNode root = new UndirectedGraphNode(v.label);
		
		Iterator<UndirectedGraphNode> itr = v.neighbors.listIterator();
		while(itr.hasNext()){
			UndirectedGraphNode n = itr.next();
			if(!visited[n.label]){
				visited[n.label] = true;
                root.neighbors.add(cloneGraphUtil(n, visited));
                
            }
        
		}
		
		return root;
		
	}
    
    public void BFS(UndirectedGraphNode v){
    	if(v==null)
    		return ;
		boolean [] visited = new boolean[10];
		
		LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
		
		visited[v.label] = true;
		queue.add(v);
		
		while(!queue.isEmpty()){
			UndirectedGraphNode n = queue.poll();
			System.out.print(n.label + " ");
			
			Iterator<UndirectedGraphNode> itr = n.neighbors.listIterator();
			while(itr.hasNext()){
				UndirectedGraphNode m = itr.next();
				if(!visited[m.label]){
					visited[m.label] = true;
					
					queue.add(m);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		UndirectedGraphNode node3 = new UndirectedGraphNode(3);
		UndirectedGraphNode node4 = new UndirectedGraphNode(4);
		
		node1.neighbors.add(node2);
		node1.neighbors.add(node4);
		
		node2.neighbors.add(node1);
		node2.neighbors.add(node3);
		
		node3.neighbors.add(node2);
		node3.neighbors.add(node4);
		
		node4.neighbors.add(node1);
		node4.neighbors.add(node3);
		
		CloneGraph cg = new CloneGraph();
		System.out.println("Original graph");
		cg.BFS(node1);
		System.out.println();
		UndirectedGraphNode result = cg.cloneGraph(node1);
		System.out.println("Cloned graph");
		cg.BFS(result);

	}

}

