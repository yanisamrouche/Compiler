/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.analysis;

import sc.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramme(AProgramme node);
    void caseALFunctionDecLFunctionDec(ALFunctionDecLFunctionDec node);
    void caseAEpsilon6LFunctionDec(AEpsilon6LFunctionDec node);
    void caseAFunctionDec(AFunctionDec node);
    void caseALDeclarationVarBOptLDeclarationVarBOpt(ALDeclarationVarBOptLDeclarationVarBOpt node);
    void caseAEpsilon5LDeclarationVarBOpt(AEpsilon5LDeclarationVarBOpt node);
    void caseALDeclarationVarLDeclarationVar(ALDeclarationVarLDeclarationVar node);
    void caseAEpsilon4LDeclarationVar(AEpsilon4LDeclarationVar node);
    void caseALDeclarationVarBLDeclarationVarB(ALDeclarationVarBLDeclarationVarB node);
    void caseAEpsilon7LDeclarationVarB(AEpsilon7LDeclarationVarB node);
    void caseAVarDeclarationVarDeclaration(AVarDeclarationVarDeclaration node);
    void caseAIntType(AIntType node);
    void caseAOVarVar(AOVarVar node);
    void caseATabVarVar(ATabVarVar node);
    void caseALInstLInst(ALInstLInst node);
    void caseAEpsilon1LInst(AEpsilon1LInst node);
    void caseAIwriteInst(AIwriteInst node);
    void caseAIreadInst(AIreadInst node);
    void caseAIaffectationInst(AIaffectationInst node);
    void caseAIcallFunctionInst(AIcallFunctionInst node);
    void caseAIwhileInst(AIwhileInst node);
    void caseAIreturnInst(AIreturnInst node);
    void caseAIifInst(AIifInst node);
    void caseAIblock(AIblock node);
    void caseAIaffectation(AIaffectation node);
    void caseAIwrite(AIwrite node);
    void caseAIread(AIread node);
    void caseACallFunction(ACallFunction node);
    void caseAIcallFunction(AIcallFunction node);
    void caseAIfIif(AIfIif node);
    void caseAElseIelse(AElseIelse node);
    void caseAEpsilon0Ielse(AEpsilon0Ielse node);
    void caseAIwhile(AIwhile node);
    void caseAIreturn(AIreturn node);
    void caseALExprLExpr(ALExprLExpr node);
    void caseAEpsilon2LExpr(AEpsilon2LExpr node);
    void caseALExprBLExprB(ALExprBLExprB node);
    void caseAEpsilon3LExprB(AEpsilon3LExprB node);
    void caseAOrExpr(AOrExpr node);
    void caseAExpr(AExpr node);
    void caseAAndExpr1(AAndExpr1 node);
    void caseAExpr1(AExpr1 node);
    void caseAEqualExpr2(AEqualExpr2 node);
    void caseAInfExpr2(AInfExpr2 node);
    void caseAExpr2(AExpr2 node);
    void caseAPlusExpr3(APlusExpr3 node);
    void caseAMinusExpr3(AMinusExpr3 node);
    void caseAExpr3(AExpr3 node);
    void caseAMultExpr4(AMultExpr4 node);
    void caseADivExpr4(ADivExpr4 node);
    void caseAExpr4(AExpr4 node);
    void caseANotExpr5(ANotExpr5 node);
    void caseAExpr5(AExpr5 node);
    void caseAParExpr6(AParExpr6 node);
    void caseANumberExpr6(ANumberExpr6 node);
    void caseAVarExpr6(AVarExpr6 node);
    void caseACallFunctionExpr6(ACallFunctionExpr6 node);

    void caseTNumber(TNumber node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTEqual(TEqual node);
    void caseTInf(TInf node);
    void caseTNot(TNot node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBrack(TLBrack node);
    void caseTRBrack(TRBrack node);
    void caseTLBar(TLBar node);
    void caseTRBar(TRBar node);
    void caseTAnd(TAnd node);
    void caseTOr(TOr node);
    void caseTIf(TIf node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTWhile(TWhile node);
    void caseTDo(TDo node);
    void caseTReturn(TReturn node);
    void caseTSemicolon(TSemicolon node);
    void caseTRead(TRead node);
    void caseTWrite(TWrite node);
    void caseTEps(TEps node);
    void caseTInt(TInt node);
    void caseTVrg(TVrg node);
    void caseTEspaces(TEspaces node);
    void caseTCommentaire(TCommentaire node);
    void caseTId(TId node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
