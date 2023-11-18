/**
 * @author Nathan Johnson, Bellarmine University, Kirin Sharma
 *
 */
public class Application 
{

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		Tree aTree = new Tree();
		Node root = aTree.generatePracticeTree(5);

		DepthFirstSearch aSearch = new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println("\nThe number of nodes traversed: " + aSearch.getNodesTraversed());		
		System.out.println("The height of the tree: " + aTree.getHeight());		
		
	} // end main

} // end class