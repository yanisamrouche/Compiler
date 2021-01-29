/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.analysis;

import java.util.*;
import sc.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgramme().apply(this);
        outStart(node);
    }

    public void inAProgramme(AProgramme node)
    {
        defaultIn(node);
    }

    public void outAProgramme(AProgramme node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgramme(AProgramme node)
    {
        inAProgramme(node);
        if(node.getLFunctionDec() != null)
        {
            node.getLFunctionDec().apply(this);
        }
        if(node.getLDeclarationVarBOpt() != null)
        {
            node.getLDeclarationVarBOpt().apply(this);
        }
        outAProgramme(node);
    }

    public void inALFunctionDecLFunctionDec(ALFunctionDecLFunctionDec node)
    {
        defaultIn(node);
    }

    public void outALFunctionDecLFunctionDec(ALFunctionDecLFunctionDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALFunctionDecLFunctionDec(ALFunctionDecLFunctionDec node)
    {
        inALFunctionDecLFunctionDec(node);
        if(node.getLFunctionDec() != null)
        {
            node.getLFunctionDec().apply(this);
        }
        if(node.getFunctionDec() != null)
        {
            node.getFunctionDec().apply(this);
        }
        outALFunctionDecLFunctionDec(node);
    }

    public void inAEpsilon6LFunctionDec(AEpsilon6LFunctionDec node)
    {
        defaultIn(node);
    }

    public void outAEpsilon6LFunctionDec(AEpsilon6LFunctionDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon6LFunctionDec(AEpsilon6LFunctionDec node)
    {
        inAEpsilon6LFunctionDec(node);
        outAEpsilon6LFunctionDec(node);
    }

    public void inAFunctionDec(AFunctionDec node)
    {
        defaultIn(node);
    }

    public void outAFunctionDec(AFunctionDec node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionDec(AFunctionDec node)
    {
        inAFunctionDec(node);
        if(node.getIblock() != null)
        {
            node.getIblock().apply(this);
        }
        if(node.getLDeclarationVarBOpt() != null)
        {
            node.getLDeclarationVarBOpt().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLDeclarationVar() != null)
        {
            node.getLDeclarationVar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAFunctionDec(node);
    }

    public void inALDeclarationVarBOptLDeclarationVarBOpt(ALDeclarationVarBOptLDeclarationVarBOpt node)
    {
        defaultIn(node);
    }

    public void outALDeclarationVarBOptLDeclarationVarBOpt(ALDeclarationVarBOptLDeclarationVarBOpt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALDeclarationVarBOptLDeclarationVarBOpt(ALDeclarationVarBOptLDeclarationVarBOpt node)
    {
        inALDeclarationVarBOptLDeclarationVarBOpt(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getLDeclarationVar() != null)
        {
            node.getLDeclarationVar().apply(this);
        }
        outALDeclarationVarBOptLDeclarationVarBOpt(node);
    }

    public void inAEpsilon5LDeclarationVarBOpt(AEpsilon5LDeclarationVarBOpt node)
    {
        defaultIn(node);
    }

    public void outAEpsilon5LDeclarationVarBOpt(AEpsilon5LDeclarationVarBOpt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon5LDeclarationVarBOpt(AEpsilon5LDeclarationVarBOpt node)
    {
        inAEpsilon5LDeclarationVarBOpt(node);
        outAEpsilon5LDeclarationVarBOpt(node);
    }

    public void inALDeclarationVarLDeclarationVar(ALDeclarationVarLDeclarationVar node)
    {
        defaultIn(node);
    }

    public void outALDeclarationVarLDeclarationVar(ALDeclarationVarLDeclarationVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALDeclarationVarLDeclarationVar(ALDeclarationVarLDeclarationVar node)
    {
        inALDeclarationVarLDeclarationVar(node);
        if(node.getLDeclarationVarB() != null)
        {
            node.getLDeclarationVarB().apply(this);
        }
        if(node.getVarDeclaration() != null)
        {
            node.getVarDeclaration().apply(this);
        }
        outALDeclarationVarLDeclarationVar(node);
    }

    public void inAEpsilon4LDeclarationVar(AEpsilon4LDeclarationVar node)
    {
        defaultIn(node);
    }

    public void outAEpsilon4LDeclarationVar(AEpsilon4LDeclarationVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon4LDeclarationVar(AEpsilon4LDeclarationVar node)
    {
        inAEpsilon4LDeclarationVar(node);
        outAEpsilon4LDeclarationVar(node);
    }

    public void inALDeclarationVarBLDeclarationVarB(ALDeclarationVarBLDeclarationVarB node)
    {
        defaultIn(node);
    }

    public void outALDeclarationVarBLDeclarationVarB(ALDeclarationVarBLDeclarationVarB node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALDeclarationVarBLDeclarationVarB(ALDeclarationVarBLDeclarationVarB node)
    {
        inALDeclarationVarBLDeclarationVarB(node);
        if(node.getLDeclarationVarB() != null)
        {
            node.getLDeclarationVarB().apply(this);
        }
        if(node.getVarDeclaration() != null)
        {
            node.getVarDeclaration().apply(this);
        }
        if(node.getVrg() != null)
        {
            node.getVrg().apply(this);
        }
        outALDeclarationVarBLDeclarationVarB(node);
    }

    public void inAEpsilon7LDeclarationVarB(AEpsilon7LDeclarationVarB node)
    {
        defaultIn(node);
    }

    public void outAEpsilon7LDeclarationVarB(AEpsilon7LDeclarationVarB node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon7LDeclarationVarB(AEpsilon7LDeclarationVarB node)
    {
        inAEpsilon7LDeclarationVarB(node);
        outAEpsilon7LDeclarationVarB(node);
    }

    public void inAVarDeclarationVarDeclaration(AVarDeclarationVarDeclaration node)
    {
        defaultIn(node);
    }

    public void outAVarDeclarationVarDeclaration(AVarDeclarationVarDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarDeclarationVarDeclaration(AVarDeclarationVarDeclaration node)
    {
        inAVarDeclarationVarDeclaration(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        outAVarDeclarationVarDeclaration(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inAOVarVar(AOVarVar node)
    {
        defaultIn(node);
    }

    public void outAOVarVar(AOVarVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOVarVar(AOVarVar node)
    {
        inAOVarVar(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAOVarVar(node);
    }

    public void inATabVarVar(ATabVarVar node)
    {
        defaultIn(node);
    }

    public void outATabVarVar(ATabVarVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATabVarVar(ATabVarVar node)
    {
        inATabVarVar(node);
        if(node.getRBar() != null)
        {
            node.getRBar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLBar() != null)
        {
            node.getLBar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outATabVarVar(node);
    }

    public void inALInstLInst(ALInstLInst node)
    {
        defaultIn(node);
    }

    public void outALInstLInst(ALInstLInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALInstLInst(ALInstLInst node)
    {
        inALInstLInst(node);
        if(node.getLInst() != null)
        {
            node.getLInst().apply(this);
        }
        if(node.getInst() != null)
        {
            node.getInst().apply(this);
        }
        outALInstLInst(node);
    }

    public void inAEpsilon1LInst(AEpsilon1LInst node)
    {
        defaultIn(node);
    }

    public void outAEpsilon1LInst(AEpsilon1LInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon1LInst(AEpsilon1LInst node)
    {
        inAEpsilon1LInst(node);
        outAEpsilon1LInst(node);
    }

    public void inAIwriteInst(AIwriteInst node)
    {
        defaultIn(node);
    }

    public void outAIwriteInst(AIwriteInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIwriteInst(AIwriteInst node)
    {
        inAIwriteInst(node);
        if(node.getIwrite() != null)
        {
            node.getIwrite().apply(this);
        }
        outAIwriteInst(node);
    }

    public void inAIreadInst(AIreadInst node)
    {
        defaultIn(node);
    }

    public void outAIreadInst(AIreadInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIreadInst(AIreadInst node)
    {
        inAIreadInst(node);
        if(node.getIread() != null)
        {
            node.getIread().apply(this);
        }
        outAIreadInst(node);
    }

    public void inAIaffectationInst(AIaffectationInst node)
    {
        defaultIn(node);
    }

    public void outAIaffectationInst(AIaffectationInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIaffectationInst(AIaffectationInst node)
    {
        inAIaffectationInst(node);
        if(node.getIaffectation() != null)
        {
            node.getIaffectation().apply(this);
        }
        outAIaffectationInst(node);
    }

    public void inAIcallFunctionInst(AIcallFunctionInst node)
    {
        defaultIn(node);
    }

    public void outAIcallFunctionInst(AIcallFunctionInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIcallFunctionInst(AIcallFunctionInst node)
    {
        inAIcallFunctionInst(node);
        if(node.getIcallFunction() != null)
        {
            node.getIcallFunction().apply(this);
        }
        outAIcallFunctionInst(node);
    }

    public void inAIwhileInst(AIwhileInst node)
    {
        defaultIn(node);
    }

    public void outAIwhileInst(AIwhileInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIwhileInst(AIwhileInst node)
    {
        inAIwhileInst(node);
        if(node.getIwhile() != null)
        {
            node.getIwhile().apply(this);
        }
        outAIwhileInst(node);
    }

    public void inAIreturnInst(AIreturnInst node)
    {
        defaultIn(node);
    }

    public void outAIreturnInst(AIreturnInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIreturnInst(AIreturnInst node)
    {
        inAIreturnInst(node);
        if(node.getIreturn() != null)
        {
            node.getIreturn().apply(this);
        }
        outAIreturnInst(node);
    }

    public void inAIifInst(AIifInst node)
    {
        defaultIn(node);
    }

    public void outAIifInst(AIifInst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIifInst(AIifInst node)
    {
        inAIifInst(node);
        if(node.getIif() != null)
        {
            node.getIif().apply(this);
        }
        outAIifInst(node);
    }

    public void inAIblock(AIblock node)
    {
        defaultIn(node);
    }

    public void outAIblock(AIblock node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIblock(AIblock node)
    {
        inAIblock(node);
        if(node.getRBrack() != null)
        {
            node.getRBrack().apply(this);
        }
        if(node.getLInst() != null)
        {
            node.getLInst().apply(this);
        }
        if(node.getLBrack() != null)
        {
            node.getLBrack().apply(this);
        }
        outAIblock(node);
    }

    public void inAIaffectation(AIaffectation node)
    {
        defaultIn(node);
    }

    public void outAIaffectation(AIaffectation node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIaffectation(AIaffectation node)
    {
        inAIaffectation(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAIaffectation(node);
    }

    public void inAIwrite(AIwrite node)
    {
        defaultIn(node);
    }

    public void outAIwrite(AIwrite node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIwrite(AIwrite node)
    {
        inAIwrite(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLExpr() != null)
        {
            node.getLExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getWrite() != null)
        {
            node.getWrite().apply(this);
        }
        outAIwrite(node);
    }

    public void inAIread(AIread node)
    {
        defaultIn(node);
    }

    public void outAIread(AIread node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIread(AIread node)
    {
        inAIread(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getRead() != null)
        {
            node.getRead().apply(this);
        }
        outAIread(node);
    }

    public void inACallFunction(ACallFunction node)
    {
        defaultIn(node);
    }

    public void outACallFunction(ACallFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallFunction(ACallFunction node)
    {
        inACallFunction(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getLExpr() != null)
        {
            node.getLExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outACallFunction(node);
    }

    public void inAIcallFunction(AIcallFunction node)
    {
        defaultIn(node);
    }

    public void outAIcallFunction(AIcallFunction node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIcallFunction(AIcallFunction node)
    {
        inAIcallFunction(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getCallFunction() != null)
        {
            node.getCallFunction().apply(this);
        }
        outAIcallFunction(node);
    }

    public void inAIfIif(AIfIif node)
    {
        defaultIn(node);
    }

    public void outAIfIif(AIfIif node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfIif(AIfIif node)
    {
        inAIfIif(node);
        if(node.getIelse() != null)
        {
            node.getIelse().apply(this);
        }
        if(node.getIblock() != null)
        {
            node.getIblock().apply(this);
        }
        if(node.getThen() != null)
        {
            node.getThen().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getIf() != null)
        {
            node.getIf().apply(this);
        }
        outAIfIif(node);
    }

    public void inAElseIelse(AElseIelse node)
    {
        defaultIn(node);
    }

    public void outAElseIelse(AElseIelse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAElseIelse(AElseIelse node)
    {
        inAElseIelse(node);
        if(node.getIblock() != null)
        {
            node.getIblock().apply(this);
        }
        if(node.getElse() != null)
        {
            node.getElse().apply(this);
        }
        outAElseIelse(node);
    }

    public void inAEpsilon0Ielse(AEpsilon0Ielse node)
    {
        defaultIn(node);
    }

    public void outAEpsilon0Ielse(AEpsilon0Ielse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon0Ielse(AEpsilon0Ielse node)
    {
        inAEpsilon0Ielse(node);
        outAEpsilon0Ielse(node);
    }

    public void inAIwhile(AIwhile node)
    {
        defaultIn(node);
    }

    public void outAIwhile(AIwhile node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIwhile(AIwhile node)
    {
        inAIwhile(node);
        if(node.getIblock() != null)
        {
            node.getIblock().apply(this);
        }
        if(node.getDo() != null)
        {
            node.getDo().apply(this);
        }
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getWhile() != null)
        {
            node.getWhile().apply(this);
        }
        outAIwhile(node);
    }

    public void inAIreturn(AIreturn node)
    {
        defaultIn(node);
    }

    public void outAIreturn(AIreturn node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIreturn(AIreturn node)
    {
        inAIreturn(node);
        if(node.getSemicolon() != null)
        {
            node.getSemicolon().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getReturn() != null)
        {
            node.getReturn().apply(this);
        }
        outAIreturn(node);
    }

    public void inALExprLExpr(ALExprLExpr node)
    {
        defaultIn(node);
    }

    public void outALExprLExpr(ALExprLExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALExprLExpr(ALExprLExpr node)
    {
        inALExprLExpr(node);
        if(node.getLExprB() != null)
        {
            node.getLExprB().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outALExprLExpr(node);
    }

    public void inAEpsilon2LExpr(AEpsilon2LExpr node)
    {
        defaultIn(node);
    }

    public void outAEpsilon2LExpr(AEpsilon2LExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon2LExpr(AEpsilon2LExpr node)
    {
        inAEpsilon2LExpr(node);
        outAEpsilon2LExpr(node);
    }

    public void inALExprBLExprB(ALExprBLExprB node)
    {
        defaultIn(node);
    }

    public void outALExprBLExprB(ALExprBLExprB node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALExprBLExprB(ALExprBLExprB node)
    {
        inALExprBLExprB(node);
        if(node.getLExprB() != null)
        {
            node.getLExprB().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getVrg() != null)
        {
            node.getVrg().apply(this);
        }
        outALExprBLExprB(node);
    }

    public void inAEpsilon3LExprB(AEpsilon3LExprB node)
    {
        defaultIn(node);
    }

    public void outAEpsilon3LExprB(AEpsilon3LExprB node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEpsilon3LExprB(AEpsilon3LExprB node)
    {
        inAEpsilon3LExprB(node);
        outAEpsilon3LExprB(node);
    }

    public void inAOrExpr(AOrExpr node)
    {
        defaultIn(node);
    }

    public void outAOrExpr(AOrExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrExpr(AOrExpr node)
    {
        inAOrExpr(node);
        if(node.getExpr1() != null)
        {
            node.getExpr1().apply(this);
        }
        if(node.getOr() != null)
        {
            node.getOr().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAOrExpr(node);
    }

    public void inAExpr(AExpr node)
    {
        defaultIn(node);
    }

    public void outAExpr(AExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr(AExpr node)
    {
        inAExpr(node);
        if(node.getExpr1() != null)
        {
            node.getExpr1().apply(this);
        }
        outAExpr(node);
    }

    public void inAAndExpr1(AAndExpr1 node)
    {
        defaultIn(node);
    }

    public void outAAndExpr1(AAndExpr1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndExpr1(AAndExpr1 node)
    {
        inAAndExpr1(node);
        if(node.getExpr2() != null)
        {
            node.getExpr2().apply(this);
        }
        if(node.getAnd() != null)
        {
            node.getAnd().apply(this);
        }
        if(node.getExpr1() != null)
        {
            node.getExpr1().apply(this);
        }
        outAAndExpr1(node);
    }

    public void inAExpr1(AExpr1 node)
    {
        defaultIn(node);
    }

    public void outAExpr1(AExpr1 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr1(AExpr1 node)
    {
        inAExpr1(node);
        if(node.getExpr2() != null)
        {
            node.getExpr2().apply(this);
        }
        outAExpr1(node);
    }

    public void inAEqualExpr2(AEqualExpr2 node)
    {
        defaultIn(node);
    }

    public void outAEqualExpr2(AEqualExpr2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualExpr2(AEqualExpr2 node)
    {
        inAEqualExpr2(node);
        if(node.getExpr3() != null)
        {
            node.getExpr3().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getExpr2() != null)
        {
            node.getExpr2().apply(this);
        }
        outAEqualExpr2(node);
    }

    public void inAInfExpr2(AInfExpr2 node)
    {
        defaultIn(node);
    }

    public void outAInfExpr2(AInfExpr2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInfExpr2(AInfExpr2 node)
    {
        inAInfExpr2(node);
        if(node.getExpr3() != null)
        {
            node.getExpr3().apply(this);
        }
        if(node.getInf() != null)
        {
            node.getInf().apply(this);
        }
        if(node.getExpr2() != null)
        {
            node.getExpr2().apply(this);
        }
        outAInfExpr2(node);
    }

    public void inAExpr2(AExpr2 node)
    {
        defaultIn(node);
    }

    public void outAExpr2(AExpr2 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr2(AExpr2 node)
    {
        inAExpr2(node);
        if(node.getExpr3() != null)
        {
            node.getExpr3().apply(this);
        }
        outAExpr2(node);
    }

    public void inAPlusExpr3(APlusExpr3 node)
    {
        defaultIn(node);
    }

    public void outAPlusExpr3(APlusExpr3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpr3(APlusExpr3 node)
    {
        inAPlusExpr3(node);
        if(node.getExpr4() != null)
        {
            node.getExpr4().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExpr3() != null)
        {
            node.getExpr3().apply(this);
        }
        outAPlusExpr3(node);
    }

    public void inAMinusExpr3(AMinusExpr3 node)
    {
        defaultIn(node);
    }

    public void outAMinusExpr3(AMinusExpr3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpr3(AMinusExpr3 node)
    {
        inAMinusExpr3(node);
        if(node.getExpr4() != null)
        {
            node.getExpr4().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExpr3() != null)
        {
            node.getExpr3().apply(this);
        }
        outAMinusExpr3(node);
    }

    public void inAExpr3(AExpr3 node)
    {
        defaultIn(node);
    }

    public void outAExpr3(AExpr3 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr3(AExpr3 node)
    {
        inAExpr3(node);
        if(node.getExpr4() != null)
        {
            node.getExpr4().apply(this);
        }
        outAExpr3(node);
    }

    public void inAMultExpr4(AMultExpr4 node)
    {
        defaultIn(node);
    }

    public void outAMultExpr4(AMultExpr4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExpr4(AMultExpr4 node)
    {
        inAMultExpr4(node);
        if(node.getExpr5() != null)
        {
            node.getExpr5().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getExpr4() != null)
        {
            node.getExpr4().apply(this);
        }
        outAMultExpr4(node);
    }

    public void inADivExpr4(ADivExpr4 node)
    {
        defaultIn(node);
    }

    public void outADivExpr4(ADivExpr4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExpr4(ADivExpr4 node)
    {
        inADivExpr4(node);
        if(node.getExpr5() != null)
        {
            node.getExpr5().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getExpr4() != null)
        {
            node.getExpr4().apply(this);
        }
        outADivExpr4(node);
    }

    public void inAExpr4(AExpr4 node)
    {
        defaultIn(node);
    }

    public void outAExpr4(AExpr4 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr4(AExpr4 node)
    {
        inAExpr4(node);
        if(node.getExpr5() != null)
        {
            node.getExpr5().apply(this);
        }
        outAExpr4(node);
    }

    public void inANotExpr5(ANotExpr5 node)
    {
        defaultIn(node);
    }

    public void outANotExpr5(ANotExpr5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotExpr5(ANotExpr5 node)
    {
        inANotExpr5(node);
        if(node.getExpr5() != null)
        {
            node.getExpr5().apply(this);
        }
        if(node.getNot() != null)
        {
            node.getNot().apply(this);
        }
        outANotExpr5(node);
    }

    public void inAExpr5(AExpr5 node)
    {
        defaultIn(node);
    }

    public void outAExpr5(AExpr5 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpr5(AExpr5 node)
    {
        inAExpr5(node);
        if(node.getExpr6() != null)
        {
            node.getExpr6().apply(this);
        }
        outAExpr5(node);
    }

    public void inAParExpr6(AParExpr6 node)
    {
        defaultIn(node);
    }

    public void outAParExpr6(AParExpr6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParExpr6(AParExpr6 node)
    {
        inAParExpr6(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAParExpr6(node);
    }

    public void inANumberExpr6(ANumberExpr6 node)
    {
        defaultIn(node);
    }

    public void outANumberExpr6(ANumberExpr6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberExpr6(ANumberExpr6 node)
    {
        inANumberExpr6(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberExpr6(node);
    }

    public void inAVarExpr6(AVarExpr6 node)
    {
        defaultIn(node);
    }

    public void outAVarExpr6(AVarExpr6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarExpr6(AVarExpr6 node)
    {
        inAVarExpr6(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarExpr6(node);
    }

    public void inACallFunctionExpr6(ACallFunctionExpr6 node)
    {
        defaultIn(node);
    }

    public void outACallFunctionExpr6(ACallFunctionExpr6 node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallFunctionExpr6(ACallFunctionExpr6 node)
    {
        inACallFunctionExpr6(node);
        if(node.getCallFunction() != null)
        {
            node.getCallFunction().apply(this);
        }
        outACallFunctionExpr6(node);
    }
}
