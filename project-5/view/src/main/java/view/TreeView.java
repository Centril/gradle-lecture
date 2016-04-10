package view;

import model.Tree;

import com.google.common.base.Joiner;

public class TreeView<T> {
	private Tree<T> tree;

	public TreeView( Tree<T> tree ) {
		this.tree = tree;
	}

    public String render() {
    	return renderTree( tree );
    }

    private String renderTree( Tree<T> tree ) {
        return tree == null
        	 ? "Leaf"
             : unwords( "Node", tree.data,
                                subtree( tree.left ),
                                subtree( tree.right ) );
    }

    private String subtree( Tree<T> tree ) {
        String r = renderTree( tree );
        return tree == null ? r : parens ( r );
    }

    private static String parens( String x ) {
        return "(" + x + ")";
    }

    private static String unwords( Object... parts ) {
        return Joiner.on( " " ).join( parts );
    }
}