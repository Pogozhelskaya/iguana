package org.jgll.sppf;

import java.util.Collections;
import java.util.List;

import org.jgll.grammar.slot.GrammarSlot;
import org.jgll.traversal.SPPFVisitor;

/**
 * 
 * @author Ali Afroozeh
 * 
 * TODO: try to replace it with null, doesn't much make sense
 *
 */
public class DummyNode extends NonPackedNode {
	
	private DummyNode(GrammarSlot slot, int leftExtent, int rightExtent) {
		super(slot, leftExtent, rightExtent);
	}

	private static DummyNode instance;
	
	public static DummyNode getInstance() {
		if(instance == null) {
			instance = new DummyNode(null, 0, 0);
		}
		return instance;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof DummyNode;
	}
	
	@Override
	public int hashCode() {
		return 16769023;
	}

	@Override
	public SPPFNode getChildAt(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<PackedNode> getChildren() {
		return Collections.emptyList();
	}

	@Override
	public boolean isAmbiguous() {
		return false;
	}

	@Override
	public int childrenCount() {
		return 0;
	}

	@Override
	public GrammarSlot getGrammarSlot() {
		return null;
	}

	@Override
	public void accept(SPPFVisitor visitAction) {
		throw new UnsupportedOperationException();
	}

}
