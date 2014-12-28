package org.jgll.grammar.slot;

import org.jgll.grammar.GrammarSlotRegistry;
import org.jgll.grammar.symbol.Epsilon;
import org.jgll.parser.GLLParser;
import org.jgll.sppf.NonPackedNode;
import org.jgll.util.Input;

public class EpsilonTransition extends AbstractTransition {

	public EpsilonTransition(GrammarSlot origin, GrammarSlot dest) {
		super(origin, dest);
	}

	@Override
	public void execute(GLLParser parser, Input input, NonPackedNode node) {
		dest.execute(parser, input, node);
	}
	
	@Override
	public String toString() {
		return Epsilon.getInstance().toString();
	}

	@Override
	public String getConstructorCode(GrammarSlotRegistry registry) {
		return new StringBuilder()
			.append("new EpsilonTransition(")
			.append("slot" + registry.getId(origin))
			.append(", ")
			.append("slot" + registry.getId(dest))
			.toString();
	}

}
