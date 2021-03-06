/*
 * generated by Xtext 2.18.0.M3
 */
package se.gu.co4robots.xtext.promise.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import se.gu.co4robots.xtext.promise.parser.antlr.internal.InternalPromiseParser;
import se.gu.co4robots.xtext.promise.services.PromiseGrammarAccess;

public class PromiseParser extends AbstractAntlrParser {

	@Inject
	private PromiseGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPromiseParser createParser(XtextTokenStream stream) {
		return new InternalPromiseParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Mission";
	}

	public PromiseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PromiseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
