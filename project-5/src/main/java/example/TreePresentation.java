package example;

import model.Tree;
import static model.Tree.*;
import view.TreeView;

public class TreePresentation {
	public static void main( String[] args ) {
		Tree<Integer> tree =
			node( 5,
				node( 3, node( 1 ), node( 4 ) ),
				node( 7, node( 6 ), leaf() )
			);

		TreeView<Integer> view = new TreeView<>( tree );

		System.out.println( view.render() );
	}
}