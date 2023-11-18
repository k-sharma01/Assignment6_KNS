/**
 * This class represents an object capable of performing a pre-order depth-first search of a binary tree
 * @author Bellarmine University, Kirin Sharma
 *
 */

public class DepthFirstSearch 
{       
	
	private int nodesTraversed; // holds the number of nodes that the object has traversed

	/**
	 * Default constructor initializes all values
	 */
	public DepthFirstSearch()
	{               
		System.out.println("\nCalling DFS with root node to do a Depth First Preorder Search.\n");
		nodesTraversed = 0;
	} // end default constructor

	
	/**
	 * Performs a depth-first pre order search on a binary tree given a root
	 * @param node the root of the tree to search
	 */
	public void DFS(Node node)        
	{
		System.out.println("Current Node Value: " + node.getData()); 
		nodesTraversed++;
		
		if(node.getlChild() == null && node.getrChild() == null) return;
		DFS(node.getlChild());
		DFS(node.getrChild());

	} // end DFS


	/**
	 * Getter for nodesTraversed
	 * @return the number of nodesTraversed
	 */
	public int getNodesTraversed() 
	{
		return nodesTraversed;
	} // end getNodesTraversed
	
} // end class