/*
 * generated by Xtext 2.12.0
 */
package se.gu.co4robots.xtext.promise.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import se.gu.co4robots.xtext.promise.services.PromiseGrammarAccess;

@SuppressWarnings("all")
public class PromiseSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PromiseGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ANDOp_ANDKeyword_3_1_or_AmpersandKeyword_3_0_or_AndKeyword_3_2;
	protected AbstractElementAlias match_Mission___ConditionsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_4__q;
	protected AbstractElementAlias match_OROp_ORKeyword_3_1_or_OrKeyword_3_2_or_VerticalLineKeyword_3_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PromiseGrammarAccess) access;
		match_ANDOp_ANDKeyword_3_1_or_AmpersandKeyword_3_0_or_AndKeyword_3_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getANDOpAccess().getANDKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getANDOpAccess().getAmpersandKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getANDOpAccess().getAndKeyword_3_2()));
		match_Mission___ConditionsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getMissionAccess().getConditionsKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_2_4()));
		match_OROp_ORKeyword_3_1_or_OrKeyword_3_2_or_VerticalLineKeyword_3_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOROpAccess().getORKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getOROpAccess().getOrKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getOROpAccess().getVerticalLineKeyword_3_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_ANDOp_ANDKeyword_3_1_or_AmpersandKeyword_3_0_or_AndKeyword_3_2.equals(syntax))
				emit_ANDOp_ANDKeyword_3_1_or_AmpersandKeyword_3_0_or_AndKeyword_3_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Mission___ConditionsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_4__q.equals(syntax))
				emit_Mission___ConditionsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OROp_ORKeyword_3_1_or_OrKeyword_3_2_or_VerticalLineKeyword_3_0.equals(syntax))
				emit_OROp_ORKeyword_3_1_or_OrKeyword_3_2_or_VerticalLineKeyword_3_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '&' | 'AND' | 'and'
	 *
	 * This ambiguous syntax occurs at:
	 *     inputOperators+=Operator (ambiguity) inputOperators+=Operator
	 */
	protected void emit_ANDOp_ANDKeyword_3_1_or_AmpersandKeyword_3_0_or_AndKeyword_3_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('conditions' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'mission' '{' (ambiguity) 'robots' robots+=Robot
	 */
	protected void emit_Mission___ConditionsKeyword_2_0_LeftCurlyBracketKeyword_2_1_RightCurlyBracketKeyword_2_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '|' | 'OR' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     inputOperators+=Operator (ambiguity) inputOperators+=Operator
	 */
	protected void emit_OROp_ORKeyword_3_1_or_OrKeyword_3_2_or_VerticalLineKeyword_3_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
