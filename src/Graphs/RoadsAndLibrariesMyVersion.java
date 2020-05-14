package Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class RoadsAndLibrariesMyVersion {
	int vertices;
	LinkedList<Integer> [] adj;
	
	public RoadsAndLibrariesMyVersion(int v){
		vertices = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++){
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdges(int v, int w){
		//Undirected graph and that is why we need to add v to w and w to v.
		adj[v].add(w);
		adj[w].add(v);
		
	}
	
	// Complete the roadsAndLibraries function below.
    public long calculatingMinCost(int n, int c_lib, int c_road, LinkedList<Integer> [] adj) {
    		int totalCost = 0;
    		/*
    		 * if the cost of the library is less than the cost of the road, then
    		 * build one library in each cities would be the optimal solution
    		 */
    		
    		if(c_lib < c_road)
    			return n*c_lib;
    		//if not, build one library for each connected component
    		boolean [] visited = new boolean[n];
    		
    		for(int i = 0 ; i < n ; i++){
    			if(!visited[i]){
	    			int tmpCost = c_lib;
	    			Stack<Integer> stk = new Stack<Integer>();
	    			stk.push(i);
	    			visited[i] = true;
	    			while(!stk.isEmpty()){
	    				int u = stk.pop();
		    			Iterator itr = adj[u].listIterator();
		    			while(itr.hasNext()){
		    				int v = (int)itr.next();
		    				if(!visited[v]){
		    					visited[v] = true;
		    					tmpCost+=c_road;
		    					stk.push(v);
		    				}
		    				  				
		    			}
	    			}
	    			totalCost+=tmpCost;
    			}
    		}
    		return totalCost;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RoadsAndLibrariesMyVersion ralm = new RoadsAndLibrariesMyVersion(3);
		ralm.addEdges(0, 1);
		ralm.addEdges(0, 2);
		//ralm.addEdges(1, 0);
		ralm.addEdges(1, 2);
		//ralm.addEdges(2, 0);
		//ralm.addEdges(2, 1);
		System.out.println(ralm.calculatingMinCost(3,2,1,ralm.adj));
		

	}

}
