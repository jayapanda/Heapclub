package Graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AdjacencyMatrix {
	public void buildingAdjList(int[][] graph){
		
		Map<Integer, LinkedList<Integer>> adjList = new HashMap(graph.length);
		for(int i = 0; i <= graph.length;i++){
			adjList.put(i, new LinkedList<Integer>());
		}
		LinkedList<Integer> list= new LinkedList();
		for(int i = 0; i < graph.length;i++){
			for(int j = 0; j < graph[0].length;j++){
//				  list = adjList.get(i);
//				  list.add(graph[i][j]);
				adjList.get(i). add(graph[i][j]);
			}
				
		}
		
		for(int k :  adjList.keySet()){
			LinkedList<Integer> list1= new LinkedList();
			list1.addAll(adjList.get(k));
			System.out.println(k + ":"+ list1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] graph = {{1,2},{2,3},{3,1}};
		AdjacencyMatrix am = new AdjacencyMatrix();
		am.buildingAdjList(graph);

	}

}
