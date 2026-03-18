package uk.ac.kcl.inf.mdd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.mdd.services.SpellLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpellLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'then'", "'say'", "'move'", "'invoke'", "'up'", "'down'", "'left'", "'right'"
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

        public InternalSpellLangParser(TokenStream input, SpellLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SpellLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSpellLang.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSpellLang.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSpellLang.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpellLang.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_spells_0_0= ruleSpellDefinition ) )+ ( (lv_session_1_0= ruleSpellInvocation ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_spells_0_0 = null;

        EObject lv_session_1_0 = null;



        	enterRule();

        try {
            // InternalSpellLang.g:78:2: ( ( ( (lv_spells_0_0= ruleSpellDefinition ) )+ ( (lv_session_1_0= ruleSpellInvocation ) )+ ) )
            // InternalSpellLang.g:79:2: ( ( (lv_spells_0_0= ruleSpellDefinition ) )+ ( (lv_session_1_0= ruleSpellInvocation ) )+ )
            {
            // InternalSpellLang.g:79:2: ( ( (lv_spells_0_0= ruleSpellDefinition ) )+ ( (lv_session_1_0= ruleSpellInvocation ) )+ )
            // InternalSpellLang.g:80:3: ( (lv_spells_0_0= ruleSpellDefinition ) )+ ( (lv_session_1_0= ruleSpellInvocation ) )+
            {
            // InternalSpellLang.g:80:3: ( (lv_spells_0_0= ruleSpellDefinition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSpellLang.g:81:4: (lv_spells_0_0= ruleSpellDefinition )
            	    {
            	    // InternalSpellLang.g:81:4: (lv_spells_0_0= ruleSpellDefinition )
            	    // InternalSpellLang.g:82:5: lv_spells_0_0= ruleSpellDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSpellsSpellDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_spells_0_0=ruleSpellDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"spells",
            	    						lv_spells_0_0,
            	    						"uk.ac.kcl.inf.mdd.SpellLang.SpellDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalSpellLang.g:99:3: ( (lv_session_1_0= ruleSpellInvocation ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSpellLang.g:100:4: (lv_session_1_0= ruleSpellInvocation )
            	    {
            	    // InternalSpellLang.g:100:4: (lv_session_1_0= ruleSpellInvocation )
            	    // InternalSpellLang.g:101:5: lv_session_1_0= ruleSpellInvocation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSessionSpellInvocationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_session_1_0=ruleSpellInvocation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"session",
            	    						lv_session_1_0,
            	    						"uk.ac.kcl.inf.mdd.SpellLang.SpellInvocation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSpellDefinition"
    // InternalSpellLang.g:122:1: entryRuleSpellDefinition returns [EObject current=null] : iv_ruleSpellDefinition= ruleSpellDefinition EOF ;
    public final EObject entryRuleSpellDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellDefinition = null;


        try {
            // InternalSpellLang.g:122:56: (iv_ruleSpellDefinition= ruleSpellDefinition EOF )
            // InternalSpellLang.g:123:2: iv_ruleSpellDefinition= ruleSpellDefinition EOF
            {
             newCompositeNode(grammarAccess.getSpellDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpellDefinition=ruleSpellDefinition();

            state._fsp--;

             current =iv_ruleSpellDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpellDefinition"


    // $ANTLR start "ruleSpellDefinition"
    // InternalSpellLang.g:129:1: ruleSpellDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_spellCode_1_0= ruleSpellExpression ) ) ) ;
    public final EObject ruleSpellDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_spellCode_1_0 = null;



        	enterRule();

        try {
            // InternalSpellLang.g:135:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_spellCode_1_0= ruleSpellExpression ) ) ) )
            // InternalSpellLang.g:136:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_spellCode_1_0= ruleSpellExpression ) ) )
            {
            // InternalSpellLang.g:136:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_spellCode_1_0= ruleSpellExpression ) ) )
            // InternalSpellLang.g:137:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_spellCode_1_0= ruleSpellExpression ) )
            {
            // InternalSpellLang.g:137:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSpellLang.g:138:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSpellLang.g:138:4: (lv_name_0_0= RULE_ID )
            // InternalSpellLang.g:139:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSpellDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpellDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSpellLang.g:155:3: ( (lv_spellCode_1_0= ruleSpellExpression ) )
            // InternalSpellLang.g:156:4: (lv_spellCode_1_0= ruleSpellExpression )
            {
            // InternalSpellLang.g:156:4: (lv_spellCode_1_0= ruleSpellExpression )
            // InternalSpellLang.g:157:5: lv_spellCode_1_0= ruleSpellExpression
            {

            					newCompositeNode(grammarAccess.getSpellDefinitionAccess().getSpellCodeSpellExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_spellCode_1_0=ruleSpellExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpellDefinitionRule());
            					}
            					set(
            						current,
            						"spellCode",
            						lv_spellCode_1_0,
            						"uk.ac.kcl.inf.mdd.SpellLang.SpellExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpellDefinition"


    // $ANTLR start "entryRuleSpellExpression"
    // InternalSpellLang.g:178:1: entryRuleSpellExpression returns [EObject current=null] : iv_ruleSpellExpression= ruleSpellExpression EOF ;
    public final EObject entryRuleSpellExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellExpression = null;


        try {
            // InternalSpellLang.g:178:56: (iv_ruleSpellExpression= ruleSpellExpression EOF )
            // InternalSpellLang.g:179:2: iv_ruleSpellExpression= ruleSpellExpression EOF
            {
             newCompositeNode(grammarAccess.getSpellExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpellExpression=ruleSpellExpression();

            state._fsp--;

             current =iv_ruleSpellExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpellExpression"


    // $ANTLR start "ruleSpellExpression"
    // InternalSpellLang.g:185:1: ruleSpellExpression returns [EObject current=null] : (this_SimpleSpell_0= ruleSimpleSpell ( () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) ) )* ) ;
    public final EObject ruleSpellExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SimpleSpell_0 = null;

        EObject lv_next_3_0 = null;



        	enterRule();

        try {
            // InternalSpellLang.g:191:2: ( (this_SimpleSpell_0= ruleSimpleSpell ( () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) ) )* ) )
            // InternalSpellLang.g:192:2: (this_SimpleSpell_0= ruleSimpleSpell ( () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) ) )* )
            {
            // InternalSpellLang.g:192:2: (this_SimpleSpell_0= ruleSimpleSpell ( () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) ) )* )
            // InternalSpellLang.g:193:3: this_SimpleSpell_0= ruleSimpleSpell ( () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) ) )*
            {

            			newCompositeNode(grammarAccess.getSpellExpressionAccess().getSimpleSpellParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_SimpleSpell_0=ruleSimpleSpell();

            state._fsp--;


            			current = this_SimpleSpell_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSpellLang.g:201:3: ( () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSpellLang.g:202:4: () otherlv_2= 'then' ( (lv_next_3_0= ruleSimpleSpell ) )
            	    {
            	    // InternalSpellLang.g:202:4: ()
            	    // InternalSpellLang.g:203:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getSpellExpressionAccess().getComplexSpellStartAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSpellExpressionAccess().getThenKeyword_1_1());
            	    			
            	    // InternalSpellLang.g:213:4: ( (lv_next_3_0= ruleSimpleSpell ) )
            	    // InternalSpellLang.g:214:5: (lv_next_3_0= ruleSimpleSpell )
            	    {
            	    // InternalSpellLang.g:214:5: (lv_next_3_0= ruleSimpleSpell )
            	    // InternalSpellLang.g:215:6: lv_next_3_0= ruleSimpleSpell
            	    {

            	    						newCompositeNode(grammarAccess.getSpellExpressionAccess().getNextSimpleSpellParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_next_3_0=ruleSimpleSpell();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpellExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"next",
            	    							lv_next_3_0,
            	    							"uk.ac.kcl.inf.mdd.SpellLang.SimpleSpell");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpellExpression"


    // $ANTLR start "entryRuleSimpleSpell"
    // InternalSpellLang.g:237:1: entryRuleSimpleSpell returns [EObject current=null] : iv_ruleSimpleSpell= ruleSimpleSpell EOF ;
    public final EObject entryRuleSimpleSpell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSpell = null;


        try {
            // InternalSpellLang.g:237:52: (iv_ruleSimpleSpell= ruleSimpleSpell EOF )
            // InternalSpellLang.g:238:2: iv_ruleSimpleSpell= ruleSimpleSpell EOF
            {
             newCompositeNode(grammarAccess.getSimpleSpellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSpell=ruleSimpleSpell();

            state._fsp--;

             current =iv_ruleSimpleSpell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSpell"


    // $ANTLR start "ruleSimpleSpell"
    // InternalSpellLang.g:244:1: ruleSimpleSpell returns [EObject current=null] : (this_Say_0= ruleSay | this_Move_1= ruleMove ) ;
    public final EObject ruleSimpleSpell() throws RecognitionException {
        EObject current = null;

        EObject this_Say_0 = null;

        EObject this_Move_1 = null;



        	enterRule();

        try {
            // InternalSpellLang.g:250:2: ( (this_Say_0= ruleSay | this_Move_1= ruleMove ) )
            // InternalSpellLang.g:251:2: (this_Say_0= ruleSay | this_Move_1= ruleMove )
            {
            // InternalSpellLang.g:251:2: (this_Say_0= ruleSay | this_Move_1= ruleMove )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpellLang.g:252:3: this_Say_0= ruleSay
                    {

                    			newCompositeNode(grammarAccess.getSimpleSpellAccess().getSayParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Say_0=ruleSay();

                    state._fsp--;


                    			current = this_Say_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpellLang.g:261:3: this_Move_1= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getSimpleSpellAccess().getMoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_1=ruleMove();

                    state._fsp--;


                    			current = this_Move_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleSpell"


    // $ANTLR start "entryRuleSay"
    // InternalSpellLang.g:273:1: entryRuleSay returns [EObject current=null] : iv_ruleSay= ruleSay EOF ;
    public final EObject entryRuleSay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSay = null;


        try {
            // InternalSpellLang.g:273:44: (iv_ruleSay= ruleSay EOF )
            // InternalSpellLang.g:274:2: iv_ruleSay= ruleSay EOF
            {
             newCompositeNode(grammarAccess.getSayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSay=ruleSay();

            state._fsp--;

             current =iv_ruleSay; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSay"


    // $ANTLR start "ruleSay"
    // InternalSpellLang.g:280:1: ruleSay returns [EObject current=null] : (otherlv_0= 'say' ( (lv_word_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_word_1_0=null;


        	enterRule();

        try {
            // InternalSpellLang.g:286:2: ( (otherlv_0= 'say' ( (lv_word_1_0= RULE_ID ) ) ) )
            // InternalSpellLang.g:287:2: (otherlv_0= 'say' ( (lv_word_1_0= RULE_ID ) ) )
            {
            // InternalSpellLang.g:287:2: (otherlv_0= 'say' ( (lv_word_1_0= RULE_ID ) ) )
            // InternalSpellLang.g:288:3: otherlv_0= 'say' ( (lv_word_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSayAccess().getSayKeyword_0());
            		
            // InternalSpellLang.g:292:3: ( (lv_word_1_0= RULE_ID ) )
            // InternalSpellLang.g:293:4: (lv_word_1_0= RULE_ID )
            {
            // InternalSpellLang.g:293:4: (lv_word_1_0= RULE_ID )
            // InternalSpellLang.g:294:5: lv_word_1_0= RULE_ID
            {
            lv_word_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_word_1_0, grammarAccess.getSayAccess().getWordIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"word",
            						lv_word_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSay"


    // $ANTLR start "entryRuleMove"
    // InternalSpellLang.g:314:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalSpellLang.g:314:45: (iv_ruleMove= ruleMove EOF )
            // InternalSpellLang.g:315:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalSpellLang.g:321:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_movement_1_0= ruleMovement ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_movement_1_0 = null;



        	enterRule();

        try {
            // InternalSpellLang.g:327:2: ( (otherlv_0= 'move' ( (lv_movement_1_0= ruleMovement ) ) ) )
            // InternalSpellLang.g:328:2: (otherlv_0= 'move' ( (lv_movement_1_0= ruleMovement ) ) )
            {
            // InternalSpellLang.g:328:2: (otherlv_0= 'move' ( (lv_movement_1_0= ruleMovement ) ) )
            // InternalSpellLang.g:329:3: otherlv_0= 'move' ( (lv_movement_1_0= ruleMovement ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalSpellLang.g:333:3: ( (lv_movement_1_0= ruleMovement ) )
            // InternalSpellLang.g:334:4: (lv_movement_1_0= ruleMovement )
            {
            // InternalSpellLang.g:334:4: (lv_movement_1_0= ruleMovement )
            // InternalSpellLang.g:335:5: lv_movement_1_0= ruleMovement
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getMovementMovementEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_movement_1_0=ruleMovement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"movement",
            						lv_movement_1_0,
            						"uk.ac.kcl.inf.mdd.SpellLang.Movement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSpellInvocation"
    // InternalSpellLang.g:356:1: entryRuleSpellInvocation returns [EObject current=null] : iv_ruleSpellInvocation= ruleSpellInvocation EOF ;
    public final EObject entryRuleSpellInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpellInvocation = null;


        try {
            // InternalSpellLang.g:356:56: (iv_ruleSpellInvocation= ruleSpellInvocation EOF )
            // InternalSpellLang.g:357:2: iv_ruleSpellInvocation= ruleSpellInvocation EOF
            {
             newCompositeNode(grammarAccess.getSpellInvocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpellInvocation=ruleSpellInvocation();

            state._fsp--;

             current =iv_ruleSpellInvocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpellInvocation"


    // $ANTLR start "ruleSpellInvocation"
    // InternalSpellLang.g:363:1: ruleSpellInvocation returns [EObject current=null] : (otherlv_0= 'invoke' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSpellInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalSpellLang.g:369:2: ( (otherlv_0= 'invoke' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalSpellLang.g:370:2: (otherlv_0= 'invoke' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalSpellLang.g:370:2: (otherlv_0= 'invoke' ( (otherlv_1= RULE_ID ) ) )
            // InternalSpellLang.g:371:3: otherlv_0= 'invoke' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSpellInvocationAccess().getInvokeKeyword_0());
            		
            // InternalSpellLang.g:375:3: ( (otherlv_1= RULE_ID ) )
            // InternalSpellLang.g:376:4: (otherlv_1= RULE_ID )
            {
            // InternalSpellLang.g:376:4: (otherlv_1= RULE_ID )
            // InternalSpellLang.g:377:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpellInvocationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSpellInvocationAccess().getSpellSpellDefinitionCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpellInvocation"


    // $ANTLR start "ruleMovement"
    // InternalSpellLang.g:392:1: ruleMovement returns [Enumerator current=null] : ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) ;
    public final Enumerator ruleMovement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSpellLang.g:398:2: ( ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) ) )
            // InternalSpellLang.g:399:2: ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            {
            // InternalSpellLang.g:399:2: ( (enumLiteral_0= 'up' ) | (enumLiteral_1= 'down' ) | (enumLiteral_2= 'left' ) | (enumLiteral_3= 'right' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSpellLang.g:400:3: (enumLiteral_0= 'up' )
                    {
                    // InternalSpellLang.g:400:3: (enumLiteral_0= 'up' )
                    // InternalSpellLang.g:401:4: enumLiteral_0= 'up'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getMovementAccess().getUpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMovementAccess().getUpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpellLang.g:408:3: (enumLiteral_1= 'down' )
                    {
                    // InternalSpellLang.g:408:3: (enumLiteral_1= 'down' )
                    // InternalSpellLang.g:409:4: enumLiteral_1= 'down'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getMovementAccess().getDownEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMovementAccess().getDownEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpellLang.g:416:3: (enumLiteral_2= 'left' )
                    {
                    // InternalSpellLang.g:416:3: (enumLiteral_2= 'left' )
                    // InternalSpellLang.g:417:4: enumLiteral_2= 'left'
                    {
                    enumLiteral_2=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getMovementAccess().getLeftEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMovementAccess().getLeftEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpellLang.g:424:3: (enumLiteral_3= 'right' )
                    {
                    // InternalSpellLang.g:424:3: (enumLiteral_3= 'right' )
                    // InternalSpellLang.g:425:4: enumLiteral_3= 'right'
                    {
                    enumLiteral_3=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getMovementAccess().getRightEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMovementAccess().getRightEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMovement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});

}