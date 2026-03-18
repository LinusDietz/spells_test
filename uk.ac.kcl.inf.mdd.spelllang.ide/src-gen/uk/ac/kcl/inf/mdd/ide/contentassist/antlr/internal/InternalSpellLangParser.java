package uk.ac.kcl.inf.mdd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.mdd.services.SpellLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpellLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'up'", "'down'", "'left'", "'right'", "'then'", "'say'", "'move'", "'invoke'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSpellLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpellLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpellLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpellLang.g"; }


    	private SpellLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpellLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSpellLang.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSpellLang.g:54:1: ( ruleModel EOF )
            // InternalSpellLang.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpellLang.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSpellLang.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSpellLang.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSpellLang.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSpellLang.g:69:3: ( rule__Model__Group__0 )
            // InternalSpellLang.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpellDefinition"
    // InternalSpellLang.g:78:1: entryRuleSpellDefinition : ruleSpellDefinition EOF ;
    public final void entryRuleSpellDefinition() throws RecognitionException {
        try {
            // InternalSpellLang.g:79:1: ( ruleSpellDefinition EOF )
            // InternalSpellLang.g:80:1: ruleSpellDefinition EOF
            {
             before(grammarAccess.getSpellDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSpellDefinition();

            state._fsp--;

             after(grammarAccess.getSpellDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpellDefinition"


    // $ANTLR start "ruleSpellDefinition"
    // InternalSpellLang.g:87:1: ruleSpellDefinition : ( ( rule__SpellDefinition__Group__0 ) ) ;
    public final void ruleSpellDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:91:2: ( ( ( rule__SpellDefinition__Group__0 ) ) )
            // InternalSpellLang.g:92:2: ( ( rule__SpellDefinition__Group__0 ) )
            {
            // InternalSpellLang.g:92:2: ( ( rule__SpellDefinition__Group__0 ) )
            // InternalSpellLang.g:93:3: ( rule__SpellDefinition__Group__0 )
            {
             before(grammarAccess.getSpellDefinitionAccess().getGroup()); 
            // InternalSpellLang.g:94:3: ( rule__SpellDefinition__Group__0 )
            // InternalSpellLang.g:94:4: rule__SpellDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpellDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpellDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpellDefinition"


    // $ANTLR start "entryRuleSpellExpression"
    // InternalSpellLang.g:103:1: entryRuleSpellExpression : ruleSpellExpression EOF ;
    public final void entryRuleSpellExpression() throws RecognitionException {
        try {
            // InternalSpellLang.g:104:1: ( ruleSpellExpression EOF )
            // InternalSpellLang.g:105:1: ruleSpellExpression EOF
            {
             before(grammarAccess.getSpellExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleSpellExpression();

            state._fsp--;

             after(grammarAccess.getSpellExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpellExpression"


    // $ANTLR start "ruleSpellExpression"
    // InternalSpellLang.g:112:1: ruleSpellExpression : ( ( rule__SpellExpression__Group__0 ) ) ;
    public final void ruleSpellExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:116:2: ( ( ( rule__SpellExpression__Group__0 ) ) )
            // InternalSpellLang.g:117:2: ( ( rule__SpellExpression__Group__0 ) )
            {
            // InternalSpellLang.g:117:2: ( ( rule__SpellExpression__Group__0 ) )
            // InternalSpellLang.g:118:3: ( rule__SpellExpression__Group__0 )
            {
             before(grammarAccess.getSpellExpressionAccess().getGroup()); 
            // InternalSpellLang.g:119:3: ( rule__SpellExpression__Group__0 )
            // InternalSpellLang.g:119:4: rule__SpellExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpellExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpellExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpellExpression"


    // $ANTLR start "entryRuleSimpleSpell"
    // InternalSpellLang.g:128:1: entryRuleSimpleSpell : ruleSimpleSpell EOF ;
    public final void entryRuleSimpleSpell() throws RecognitionException {
        try {
            // InternalSpellLang.g:129:1: ( ruleSimpleSpell EOF )
            // InternalSpellLang.g:130:1: ruleSimpleSpell EOF
            {
             before(grammarAccess.getSimpleSpellRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleSpell();

            state._fsp--;

             after(grammarAccess.getSimpleSpellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleSpell"


    // $ANTLR start "ruleSimpleSpell"
    // InternalSpellLang.g:137:1: ruleSimpleSpell : ( ( rule__SimpleSpell__Alternatives ) ) ;
    public final void ruleSimpleSpell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:141:2: ( ( ( rule__SimpleSpell__Alternatives ) ) )
            // InternalSpellLang.g:142:2: ( ( rule__SimpleSpell__Alternatives ) )
            {
            // InternalSpellLang.g:142:2: ( ( rule__SimpleSpell__Alternatives ) )
            // InternalSpellLang.g:143:3: ( rule__SimpleSpell__Alternatives )
            {
             before(grammarAccess.getSimpleSpellAccess().getAlternatives()); 
            // InternalSpellLang.g:144:3: ( rule__SimpleSpell__Alternatives )
            // InternalSpellLang.g:144:4: rule__SimpleSpell__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSpell__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSpellAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSpell"


    // $ANTLR start "entryRuleSay"
    // InternalSpellLang.g:153:1: entryRuleSay : ruleSay EOF ;
    public final void entryRuleSay() throws RecognitionException {
        try {
            // InternalSpellLang.g:154:1: ( ruleSay EOF )
            // InternalSpellLang.g:155:1: ruleSay EOF
            {
             before(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_1);
            ruleSay();

            state._fsp--;

             after(grammarAccess.getSayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSay"


    // $ANTLR start "ruleSay"
    // InternalSpellLang.g:162:1: ruleSay : ( ( rule__Say__Group__0 ) ) ;
    public final void ruleSay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:166:2: ( ( ( rule__Say__Group__0 ) ) )
            // InternalSpellLang.g:167:2: ( ( rule__Say__Group__0 ) )
            {
            // InternalSpellLang.g:167:2: ( ( rule__Say__Group__0 ) )
            // InternalSpellLang.g:168:3: ( rule__Say__Group__0 )
            {
             before(grammarAccess.getSayAccess().getGroup()); 
            // InternalSpellLang.g:169:3: ( rule__Say__Group__0 )
            // InternalSpellLang.g:169:4: rule__Say__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Say__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSay"


    // $ANTLR start "entryRuleMove"
    // InternalSpellLang.g:178:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalSpellLang.g:179:1: ( ruleMove EOF )
            // InternalSpellLang.g:180:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalSpellLang.g:187:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:191:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalSpellLang.g:192:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalSpellLang.g:192:2: ( ( rule__Move__Group__0 ) )
            // InternalSpellLang.g:193:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalSpellLang.g:194:3: ( rule__Move__Group__0 )
            // InternalSpellLang.g:194:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSpellInvocation"
    // InternalSpellLang.g:203:1: entryRuleSpellInvocation : ruleSpellInvocation EOF ;
    public final void entryRuleSpellInvocation() throws RecognitionException {
        try {
            // InternalSpellLang.g:204:1: ( ruleSpellInvocation EOF )
            // InternalSpellLang.g:205:1: ruleSpellInvocation EOF
            {
             before(grammarAccess.getSpellInvocationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpellInvocation();

            state._fsp--;

             after(grammarAccess.getSpellInvocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpellInvocation"


    // $ANTLR start "ruleSpellInvocation"
    // InternalSpellLang.g:212:1: ruleSpellInvocation : ( ( rule__SpellInvocation__Group__0 ) ) ;
    public final void ruleSpellInvocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:216:2: ( ( ( rule__SpellInvocation__Group__0 ) ) )
            // InternalSpellLang.g:217:2: ( ( rule__SpellInvocation__Group__0 ) )
            {
            // InternalSpellLang.g:217:2: ( ( rule__SpellInvocation__Group__0 ) )
            // InternalSpellLang.g:218:3: ( rule__SpellInvocation__Group__0 )
            {
             before(grammarAccess.getSpellInvocationAccess().getGroup()); 
            // InternalSpellLang.g:219:3: ( rule__SpellInvocation__Group__0 )
            // InternalSpellLang.g:219:4: rule__SpellInvocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpellInvocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpellInvocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpellInvocation"


    // $ANTLR start "ruleMovement"
    // InternalSpellLang.g:228:1: ruleMovement : ( ( rule__Movement__Alternatives ) ) ;
    public final void ruleMovement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:232:1: ( ( ( rule__Movement__Alternatives ) ) )
            // InternalSpellLang.g:233:2: ( ( rule__Movement__Alternatives ) )
            {
            // InternalSpellLang.g:233:2: ( ( rule__Movement__Alternatives ) )
            // InternalSpellLang.g:234:3: ( rule__Movement__Alternatives )
            {
             before(grammarAccess.getMovementAccess().getAlternatives()); 
            // InternalSpellLang.g:235:3: ( rule__Movement__Alternatives )
            // InternalSpellLang.g:235:4: rule__Movement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "rule__SimpleSpell__Alternatives"
    // InternalSpellLang.g:243:1: rule__SimpleSpell__Alternatives : ( ( ruleSay ) | ( ruleMove ) );
    public final void rule__SimpleSpell__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:247:1: ( ( ruleSay ) | ( ruleMove ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSpellLang.g:248:2: ( ruleSay )
                    {
                    // InternalSpellLang.g:248:2: ( ruleSay )
                    // InternalSpellLang.g:249:3: ruleSay
                    {
                     before(grammarAccess.getSimpleSpellAccess().getSayParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSay();

                    state._fsp--;

                     after(grammarAccess.getSimpleSpellAccess().getSayParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpellLang.g:254:2: ( ruleMove )
                    {
                    // InternalSpellLang.g:254:2: ( ruleMove )
                    // InternalSpellLang.g:255:3: ruleMove
                    {
                     before(grammarAccess.getSimpleSpellAccess().getMoveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getSimpleSpellAccess().getMoveParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpell__Alternatives"


    // $ANTLR start "rule__Movement__Alternatives"
    // InternalSpellLang.g:264:1: rule__Movement__Alternatives : ( ( ( 'up' ) ) | ( ( 'down' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) );
    public final void rule__Movement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:268:1: ( ( ( 'up' ) ) | ( ( 'down' ) ) | ( ( 'left' ) ) | ( ( 'right' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpellLang.g:269:2: ( ( 'up' ) )
                    {
                    // InternalSpellLang.g:269:2: ( ( 'up' ) )
                    // InternalSpellLang.g:270:3: ( 'up' )
                    {
                     before(grammarAccess.getMovementAccess().getUpEnumLiteralDeclaration_0()); 
                    // InternalSpellLang.g:271:3: ( 'up' )
                    // InternalSpellLang.g:271:4: 'up'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMovementAccess().getUpEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpellLang.g:275:2: ( ( 'down' ) )
                    {
                    // InternalSpellLang.g:275:2: ( ( 'down' ) )
                    // InternalSpellLang.g:276:3: ( 'down' )
                    {
                     before(grammarAccess.getMovementAccess().getDownEnumLiteralDeclaration_1()); 
                    // InternalSpellLang.g:277:3: ( 'down' )
                    // InternalSpellLang.g:277:4: 'down'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMovementAccess().getDownEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpellLang.g:281:2: ( ( 'left' ) )
                    {
                    // InternalSpellLang.g:281:2: ( ( 'left' ) )
                    // InternalSpellLang.g:282:3: ( 'left' )
                    {
                     before(grammarAccess.getMovementAccess().getLeftEnumLiteralDeclaration_2()); 
                    // InternalSpellLang.g:283:3: ( 'left' )
                    // InternalSpellLang.g:283:4: 'left'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMovementAccess().getLeftEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpellLang.g:287:2: ( ( 'right' ) )
                    {
                    // InternalSpellLang.g:287:2: ( ( 'right' ) )
                    // InternalSpellLang.g:288:3: ( 'right' )
                    {
                     before(grammarAccess.getMovementAccess().getRightEnumLiteralDeclaration_3()); 
                    // InternalSpellLang.g:289:3: ( 'right' )
                    // InternalSpellLang.g:289:4: 'right'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMovementAccess().getRightEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movement__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSpellLang.g:297:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:301:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSpellLang.g:302:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSpellLang.g:309:1: rule__Model__Group__0__Impl : ( ( ( rule__Model__SpellsAssignment_0 ) ) ( ( rule__Model__SpellsAssignment_0 )* ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:313:1: ( ( ( ( rule__Model__SpellsAssignment_0 ) ) ( ( rule__Model__SpellsAssignment_0 )* ) ) )
            // InternalSpellLang.g:314:1: ( ( ( rule__Model__SpellsAssignment_0 ) ) ( ( rule__Model__SpellsAssignment_0 )* ) )
            {
            // InternalSpellLang.g:314:1: ( ( ( rule__Model__SpellsAssignment_0 ) ) ( ( rule__Model__SpellsAssignment_0 )* ) )
            // InternalSpellLang.g:315:2: ( ( rule__Model__SpellsAssignment_0 ) ) ( ( rule__Model__SpellsAssignment_0 )* )
            {
            // InternalSpellLang.g:315:2: ( ( rule__Model__SpellsAssignment_0 ) )
            // InternalSpellLang.g:316:3: ( rule__Model__SpellsAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getSpellsAssignment_0()); 
            // InternalSpellLang.g:317:3: ( rule__Model__SpellsAssignment_0 )
            // InternalSpellLang.g:317:4: rule__Model__SpellsAssignment_0
            {
            pushFollow(FOLLOW_4);
            rule__Model__SpellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSpellsAssignment_0()); 

            }

            // InternalSpellLang.g:320:2: ( ( rule__Model__SpellsAssignment_0 )* )
            // InternalSpellLang.g:321:3: ( rule__Model__SpellsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getSpellsAssignment_0()); 
            // InternalSpellLang.g:322:3: ( rule__Model__SpellsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSpellLang.g:322:4: rule__Model__SpellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__SpellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSpellsAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSpellLang.g:331:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:335:1: ( rule__Model__Group__1__Impl )
            // InternalSpellLang.g:336:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSpellLang.g:342:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__SessionAssignment_1 ) ) ( ( rule__Model__SessionAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:346:1: ( ( ( ( rule__Model__SessionAssignment_1 ) ) ( ( rule__Model__SessionAssignment_1 )* ) ) )
            // InternalSpellLang.g:347:1: ( ( ( rule__Model__SessionAssignment_1 ) ) ( ( rule__Model__SessionAssignment_1 )* ) )
            {
            // InternalSpellLang.g:347:1: ( ( ( rule__Model__SessionAssignment_1 ) ) ( ( rule__Model__SessionAssignment_1 )* ) )
            // InternalSpellLang.g:348:2: ( ( rule__Model__SessionAssignment_1 ) ) ( ( rule__Model__SessionAssignment_1 )* )
            {
            // InternalSpellLang.g:348:2: ( ( rule__Model__SessionAssignment_1 ) )
            // InternalSpellLang.g:349:3: ( rule__Model__SessionAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getSessionAssignment_1()); 
            // InternalSpellLang.g:350:3: ( rule__Model__SessionAssignment_1 )
            // InternalSpellLang.g:350:4: rule__Model__SessionAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Model__SessionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSessionAssignment_1()); 

            }

            // InternalSpellLang.g:353:2: ( ( rule__Model__SessionAssignment_1 )* )
            // InternalSpellLang.g:354:3: ( rule__Model__SessionAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getSessionAssignment_1()); 
            // InternalSpellLang.g:355:3: ( rule__Model__SessionAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSpellLang.g:355:4: rule__Model__SessionAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__SessionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSessionAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__SpellDefinition__Group__0"
    // InternalSpellLang.g:365:1: rule__SpellDefinition__Group__0 : rule__SpellDefinition__Group__0__Impl rule__SpellDefinition__Group__1 ;
    public final void rule__SpellDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:369:1: ( rule__SpellDefinition__Group__0__Impl rule__SpellDefinition__Group__1 )
            // InternalSpellLang.g:370:2: rule__SpellDefinition__Group__0__Impl rule__SpellDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SpellDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpellDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellDefinition__Group__0"


    // $ANTLR start "rule__SpellDefinition__Group__0__Impl"
    // InternalSpellLang.g:377:1: rule__SpellDefinition__Group__0__Impl : ( ( rule__SpellDefinition__NameAssignment_0 ) ) ;
    public final void rule__SpellDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:381:1: ( ( ( rule__SpellDefinition__NameAssignment_0 ) ) )
            // InternalSpellLang.g:382:1: ( ( rule__SpellDefinition__NameAssignment_0 ) )
            {
            // InternalSpellLang.g:382:1: ( ( rule__SpellDefinition__NameAssignment_0 ) )
            // InternalSpellLang.g:383:2: ( rule__SpellDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getSpellDefinitionAccess().getNameAssignment_0()); 
            // InternalSpellLang.g:384:2: ( rule__SpellDefinition__NameAssignment_0 )
            // InternalSpellLang.g:384:3: rule__SpellDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SpellDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpellDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellDefinition__Group__0__Impl"


    // $ANTLR start "rule__SpellDefinition__Group__1"
    // InternalSpellLang.g:392:1: rule__SpellDefinition__Group__1 : rule__SpellDefinition__Group__1__Impl ;
    public final void rule__SpellDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:396:1: ( rule__SpellDefinition__Group__1__Impl )
            // InternalSpellLang.g:397:2: rule__SpellDefinition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpellDefinition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellDefinition__Group__1"


    // $ANTLR start "rule__SpellDefinition__Group__1__Impl"
    // InternalSpellLang.g:403:1: rule__SpellDefinition__Group__1__Impl : ( ( rule__SpellDefinition__SpellCodeAssignment_1 ) ) ;
    public final void rule__SpellDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:407:1: ( ( ( rule__SpellDefinition__SpellCodeAssignment_1 ) ) )
            // InternalSpellLang.g:408:1: ( ( rule__SpellDefinition__SpellCodeAssignment_1 ) )
            {
            // InternalSpellLang.g:408:1: ( ( rule__SpellDefinition__SpellCodeAssignment_1 ) )
            // InternalSpellLang.g:409:2: ( rule__SpellDefinition__SpellCodeAssignment_1 )
            {
             before(grammarAccess.getSpellDefinitionAccess().getSpellCodeAssignment_1()); 
            // InternalSpellLang.g:410:2: ( rule__SpellDefinition__SpellCodeAssignment_1 )
            // InternalSpellLang.g:410:3: rule__SpellDefinition__SpellCodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SpellDefinition__SpellCodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpellDefinitionAccess().getSpellCodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellDefinition__Group__1__Impl"


    // $ANTLR start "rule__SpellExpression__Group__0"
    // InternalSpellLang.g:419:1: rule__SpellExpression__Group__0 : rule__SpellExpression__Group__0__Impl rule__SpellExpression__Group__1 ;
    public final void rule__SpellExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:423:1: ( rule__SpellExpression__Group__0__Impl rule__SpellExpression__Group__1 )
            // InternalSpellLang.g:424:2: rule__SpellExpression__Group__0__Impl rule__SpellExpression__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SpellExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpellExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group__0"


    // $ANTLR start "rule__SpellExpression__Group__0__Impl"
    // InternalSpellLang.g:431:1: rule__SpellExpression__Group__0__Impl : ( ruleSimpleSpell ) ;
    public final void rule__SpellExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:435:1: ( ( ruleSimpleSpell ) )
            // InternalSpellLang.g:436:1: ( ruleSimpleSpell )
            {
            // InternalSpellLang.g:436:1: ( ruleSimpleSpell )
            // InternalSpellLang.g:437:2: ruleSimpleSpell
            {
             before(grammarAccess.getSpellExpressionAccess().getSimpleSpellParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleSpell();

            state._fsp--;

             after(grammarAccess.getSpellExpressionAccess().getSimpleSpellParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group__0__Impl"


    // $ANTLR start "rule__SpellExpression__Group__1"
    // InternalSpellLang.g:446:1: rule__SpellExpression__Group__1 : rule__SpellExpression__Group__1__Impl ;
    public final void rule__SpellExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:450:1: ( rule__SpellExpression__Group__1__Impl )
            // InternalSpellLang.g:451:2: rule__SpellExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpellExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group__1"


    // $ANTLR start "rule__SpellExpression__Group__1__Impl"
    // InternalSpellLang.g:457:1: rule__SpellExpression__Group__1__Impl : ( ( rule__SpellExpression__Group_1__0 )* ) ;
    public final void rule__SpellExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:461:1: ( ( ( rule__SpellExpression__Group_1__0 )* ) )
            // InternalSpellLang.g:462:1: ( ( rule__SpellExpression__Group_1__0 )* )
            {
            // InternalSpellLang.g:462:1: ( ( rule__SpellExpression__Group_1__0 )* )
            // InternalSpellLang.g:463:2: ( rule__SpellExpression__Group_1__0 )*
            {
             before(grammarAccess.getSpellExpressionAccess().getGroup_1()); 
            // InternalSpellLang.g:464:2: ( rule__SpellExpression__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSpellLang.g:464:3: rule__SpellExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SpellExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSpellExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group__1__Impl"


    // $ANTLR start "rule__SpellExpression__Group_1__0"
    // InternalSpellLang.g:473:1: rule__SpellExpression__Group_1__0 : rule__SpellExpression__Group_1__0__Impl rule__SpellExpression__Group_1__1 ;
    public final void rule__SpellExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:477:1: ( rule__SpellExpression__Group_1__0__Impl rule__SpellExpression__Group_1__1 )
            // InternalSpellLang.g:478:2: rule__SpellExpression__Group_1__0__Impl rule__SpellExpression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SpellExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpellExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group_1__0"


    // $ANTLR start "rule__SpellExpression__Group_1__0__Impl"
    // InternalSpellLang.g:485:1: rule__SpellExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__SpellExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:489:1: ( ( () ) )
            // InternalSpellLang.g:490:1: ( () )
            {
            // InternalSpellLang.g:490:1: ( () )
            // InternalSpellLang.g:491:2: ()
            {
             before(grammarAccess.getSpellExpressionAccess().getComplexSpellStartAction_1_0()); 
            // InternalSpellLang.g:492:2: ()
            // InternalSpellLang.g:492:3: 
            {
            }

             after(grammarAccess.getSpellExpressionAccess().getComplexSpellStartAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SpellExpression__Group_1__1"
    // InternalSpellLang.g:500:1: rule__SpellExpression__Group_1__1 : rule__SpellExpression__Group_1__1__Impl rule__SpellExpression__Group_1__2 ;
    public final void rule__SpellExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:504:1: ( rule__SpellExpression__Group_1__1__Impl rule__SpellExpression__Group_1__2 )
            // InternalSpellLang.g:505:2: rule__SpellExpression__Group_1__1__Impl rule__SpellExpression__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__SpellExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpellExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group_1__1"


    // $ANTLR start "rule__SpellExpression__Group_1__1__Impl"
    // InternalSpellLang.g:512:1: rule__SpellExpression__Group_1__1__Impl : ( 'then' ) ;
    public final void rule__SpellExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:516:1: ( ( 'then' ) )
            // InternalSpellLang.g:517:1: ( 'then' )
            {
            // InternalSpellLang.g:517:1: ( 'then' )
            // InternalSpellLang.g:518:2: 'then'
            {
             before(grammarAccess.getSpellExpressionAccess().getThenKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSpellExpressionAccess().getThenKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SpellExpression__Group_1__2"
    // InternalSpellLang.g:527:1: rule__SpellExpression__Group_1__2 : rule__SpellExpression__Group_1__2__Impl ;
    public final void rule__SpellExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:531:1: ( rule__SpellExpression__Group_1__2__Impl )
            // InternalSpellLang.g:532:2: rule__SpellExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpellExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group_1__2"


    // $ANTLR start "rule__SpellExpression__Group_1__2__Impl"
    // InternalSpellLang.g:538:1: rule__SpellExpression__Group_1__2__Impl : ( ( rule__SpellExpression__NextAssignment_1_2 ) ) ;
    public final void rule__SpellExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:542:1: ( ( ( rule__SpellExpression__NextAssignment_1_2 ) ) )
            // InternalSpellLang.g:543:1: ( ( rule__SpellExpression__NextAssignment_1_2 ) )
            {
            // InternalSpellLang.g:543:1: ( ( rule__SpellExpression__NextAssignment_1_2 ) )
            // InternalSpellLang.g:544:2: ( rule__SpellExpression__NextAssignment_1_2 )
            {
             before(grammarAccess.getSpellExpressionAccess().getNextAssignment_1_2()); 
            // InternalSpellLang.g:545:2: ( rule__SpellExpression__NextAssignment_1_2 )
            // InternalSpellLang.g:545:3: rule__SpellExpression__NextAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SpellExpression__NextAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSpellExpressionAccess().getNextAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__Group_1__2__Impl"


    // $ANTLR start "rule__Say__Group__0"
    // InternalSpellLang.g:554:1: rule__Say__Group__0 : rule__Say__Group__0__Impl rule__Say__Group__1 ;
    public final void rule__Say__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:558:1: ( rule__Say__Group__0__Impl rule__Say__Group__1 )
            // InternalSpellLang.g:559:2: rule__Say__Group__0__Impl rule__Say__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Say__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Say__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Say__Group__0"


    // $ANTLR start "rule__Say__Group__0__Impl"
    // InternalSpellLang.g:566:1: rule__Say__Group__0__Impl : ( 'say' ) ;
    public final void rule__Say__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:570:1: ( ( 'say' ) )
            // InternalSpellLang.g:571:1: ( 'say' )
            {
            // InternalSpellLang.g:571:1: ( 'say' )
            // InternalSpellLang.g:572:2: 'say'
            {
             before(grammarAccess.getSayAccess().getSayKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSayAccess().getSayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Say__Group__0__Impl"


    // $ANTLR start "rule__Say__Group__1"
    // InternalSpellLang.g:581:1: rule__Say__Group__1 : rule__Say__Group__1__Impl ;
    public final void rule__Say__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:585:1: ( rule__Say__Group__1__Impl )
            // InternalSpellLang.g:586:2: rule__Say__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Say__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Say__Group__1"


    // $ANTLR start "rule__Say__Group__1__Impl"
    // InternalSpellLang.g:592:1: rule__Say__Group__1__Impl : ( ( rule__Say__WordAssignment_1 ) ) ;
    public final void rule__Say__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:596:1: ( ( ( rule__Say__WordAssignment_1 ) ) )
            // InternalSpellLang.g:597:1: ( ( rule__Say__WordAssignment_1 ) )
            {
            // InternalSpellLang.g:597:1: ( ( rule__Say__WordAssignment_1 ) )
            // InternalSpellLang.g:598:2: ( rule__Say__WordAssignment_1 )
            {
             before(grammarAccess.getSayAccess().getWordAssignment_1()); 
            // InternalSpellLang.g:599:2: ( rule__Say__WordAssignment_1 )
            // InternalSpellLang.g:599:3: rule__Say__WordAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Say__WordAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSayAccess().getWordAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Say__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalSpellLang.g:608:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:612:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalSpellLang.g:613:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalSpellLang.g:620:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:624:1: ( ( 'move' ) )
            // InternalSpellLang.g:625:1: ( 'move' )
            {
            // InternalSpellLang.g:625:1: ( 'move' )
            // InternalSpellLang.g:626:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalSpellLang.g:635:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:639:1: ( rule__Move__Group__1__Impl )
            // InternalSpellLang.g:640:2: rule__Move__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalSpellLang.g:646:1: rule__Move__Group__1__Impl : ( ( rule__Move__MovementAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:650:1: ( ( ( rule__Move__MovementAssignment_1 ) ) )
            // InternalSpellLang.g:651:1: ( ( rule__Move__MovementAssignment_1 ) )
            {
            // InternalSpellLang.g:651:1: ( ( rule__Move__MovementAssignment_1 ) )
            // InternalSpellLang.g:652:2: ( rule__Move__MovementAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getMovementAssignment_1()); 
            // InternalSpellLang.g:653:2: ( rule__Move__MovementAssignment_1 )
            // InternalSpellLang.g:653:3: rule__Move__MovementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__MovementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getMovementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__SpellInvocation__Group__0"
    // InternalSpellLang.g:662:1: rule__SpellInvocation__Group__0 : rule__SpellInvocation__Group__0__Impl rule__SpellInvocation__Group__1 ;
    public final void rule__SpellInvocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:666:1: ( rule__SpellInvocation__Group__0__Impl rule__SpellInvocation__Group__1 )
            // InternalSpellLang.g:667:2: rule__SpellInvocation__Group__0__Impl rule__SpellInvocation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SpellInvocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpellInvocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellInvocation__Group__0"


    // $ANTLR start "rule__SpellInvocation__Group__0__Impl"
    // InternalSpellLang.g:674:1: rule__SpellInvocation__Group__0__Impl : ( 'invoke' ) ;
    public final void rule__SpellInvocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:678:1: ( ( 'invoke' ) )
            // InternalSpellLang.g:679:1: ( 'invoke' )
            {
            // InternalSpellLang.g:679:1: ( 'invoke' )
            // InternalSpellLang.g:680:2: 'invoke'
            {
             before(grammarAccess.getSpellInvocationAccess().getInvokeKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSpellInvocationAccess().getInvokeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellInvocation__Group__0__Impl"


    // $ANTLR start "rule__SpellInvocation__Group__1"
    // InternalSpellLang.g:689:1: rule__SpellInvocation__Group__1 : rule__SpellInvocation__Group__1__Impl ;
    public final void rule__SpellInvocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:693:1: ( rule__SpellInvocation__Group__1__Impl )
            // InternalSpellLang.g:694:2: rule__SpellInvocation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpellInvocation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellInvocation__Group__1"


    // $ANTLR start "rule__SpellInvocation__Group__1__Impl"
    // InternalSpellLang.g:700:1: rule__SpellInvocation__Group__1__Impl : ( ( rule__SpellInvocation__SpellAssignment_1 ) ) ;
    public final void rule__SpellInvocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:704:1: ( ( ( rule__SpellInvocation__SpellAssignment_1 ) ) )
            // InternalSpellLang.g:705:1: ( ( rule__SpellInvocation__SpellAssignment_1 ) )
            {
            // InternalSpellLang.g:705:1: ( ( rule__SpellInvocation__SpellAssignment_1 ) )
            // InternalSpellLang.g:706:2: ( rule__SpellInvocation__SpellAssignment_1 )
            {
             before(grammarAccess.getSpellInvocationAccess().getSpellAssignment_1()); 
            // InternalSpellLang.g:707:2: ( rule__SpellInvocation__SpellAssignment_1 )
            // InternalSpellLang.g:707:3: rule__SpellInvocation__SpellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SpellInvocation__SpellAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpellInvocationAccess().getSpellAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellInvocation__Group__1__Impl"


    // $ANTLR start "rule__Model__SpellsAssignment_0"
    // InternalSpellLang.g:716:1: rule__Model__SpellsAssignment_0 : ( ruleSpellDefinition ) ;
    public final void rule__Model__SpellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:720:1: ( ( ruleSpellDefinition ) )
            // InternalSpellLang.g:721:2: ( ruleSpellDefinition )
            {
            // InternalSpellLang.g:721:2: ( ruleSpellDefinition )
            // InternalSpellLang.g:722:3: ruleSpellDefinition
            {
             before(grammarAccess.getModelAccess().getSpellsSpellDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSpellDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpellsSpellDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SpellsAssignment_0"


    // $ANTLR start "rule__Model__SessionAssignment_1"
    // InternalSpellLang.g:731:1: rule__Model__SessionAssignment_1 : ( ruleSpellInvocation ) ;
    public final void rule__Model__SessionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:735:1: ( ( ruleSpellInvocation ) )
            // InternalSpellLang.g:736:2: ( ruleSpellInvocation )
            {
            // InternalSpellLang.g:736:2: ( ruleSpellInvocation )
            // InternalSpellLang.g:737:3: ruleSpellInvocation
            {
             before(grammarAccess.getModelAccess().getSessionSpellInvocationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpellInvocation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSessionSpellInvocationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SessionAssignment_1"


    // $ANTLR start "rule__SpellDefinition__NameAssignment_0"
    // InternalSpellLang.g:746:1: rule__SpellDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpellDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:750:1: ( ( RULE_ID ) )
            // InternalSpellLang.g:751:2: ( RULE_ID )
            {
            // InternalSpellLang.g:751:2: ( RULE_ID )
            // InternalSpellLang.g:752:3: RULE_ID
            {
             before(grammarAccess.getSpellDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpellDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellDefinition__NameAssignment_0"


    // $ANTLR start "rule__SpellDefinition__SpellCodeAssignment_1"
    // InternalSpellLang.g:761:1: rule__SpellDefinition__SpellCodeAssignment_1 : ( ruleSpellExpression ) ;
    public final void rule__SpellDefinition__SpellCodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:765:1: ( ( ruleSpellExpression ) )
            // InternalSpellLang.g:766:2: ( ruleSpellExpression )
            {
            // InternalSpellLang.g:766:2: ( ruleSpellExpression )
            // InternalSpellLang.g:767:3: ruleSpellExpression
            {
             before(grammarAccess.getSpellDefinitionAccess().getSpellCodeSpellExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpellExpression();

            state._fsp--;

             after(grammarAccess.getSpellDefinitionAccess().getSpellCodeSpellExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellDefinition__SpellCodeAssignment_1"


    // $ANTLR start "rule__SpellExpression__NextAssignment_1_2"
    // InternalSpellLang.g:776:1: rule__SpellExpression__NextAssignment_1_2 : ( ruleSimpleSpell ) ;
    public final void rule__SpellExpression__NextAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:780:1: ( ( ruleSimpleSpell ) )
            // InternalSpellLang.g:781:2: ( ruleSimpleSpell )
            {
            // InternalSpellLang.g:781:2: ( ruleSimpleSpell )
            // InternalSpellLang.g:782:3: ruleSimpleSpell
            {
             before(grammarAccess.getSpellExpressionAccess().getNextSimpleSpellParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleSpell();

            state._fsp--;

             after(grammarAccess.getSpellExpressionAccess().getNextSimpleSpellParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellExpression__NextAssignment_1_2"


    // $ANTLR start "rule__Say__WordAssignment_1"
    // InternalSpellLang.g:791:1: rule__Say__WordAssignment_1 : ( RULE_ID ) ;
    public final void rule__Say__WordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:795:1: ( ( RULE_ID ) )
            // InternalSpellLang.g:796:2: ( RULE_ID )
            {
            // InternalSpellLang.g:796:2: ( RULE_ID )
            // InternalSpellLang.g:797:3: RULE_ID
            {
             before(grammarAccess.getSayAccess().getWordIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSayAccess().getWordIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Say__WordAssignment_1"


    // $ANTLR start "rule__Move__MovementAssignment_1"
    // InternalSpellLang.g:806:1: rule__Move__MovementAssignment_1 : ( ruleMovement ) ;
    public final void rule__Move__MovementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:810:1: ( ( ruleMovement ) )
            // InternalSpellLang.g:811:2: ( ruleMovement )
            {
            // InternalSpellLang.g:811:2: ( ruleMovement )
            // InternalSpellLang.g:812:3: ruleMovement
            {
             before(grammarAccess.getMoveAccess().getMovementMovementEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getMovementMovementEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__MovementAssignment_1"


    // $ANTLR start "rule__SpellInvocation__SpellAssignment_1"
    // InternalSpellLang.g:821:1: rule__SpellInvocation__SpellAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SpellInvocation__SpellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpellLang.g:825:1: ( ( ( RULE_ID ) ) )
            // InternalSpellLang.g:826:2: ( ( RULE_ID ) )
            {
            // InternalSpellLang.g:826:2: ( ( RULE_ID ) )
            // InternalSpellLang.g:827:3: ( RULE_ID )
            {
             before(grammarAccess.getSpellInvocationAccess().getSpellSpellDefinitionCrossReference_1_0()); 
            // InternalSpellLang.g:828:3: ( RULE_ID )
            // InternalSpellLang.g:829:4: RULE_ID
            {
             before(grammarAccess.getSpellInvocationAccess().getSpellSpellDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpellInvocationAccess().getSpellSpellDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSpellInvocationAccess().getSpellSpellDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpellInvocation__SpellAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});

}