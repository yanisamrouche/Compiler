import sa.*;
import sc.analysis.DepthFirstAdapter;
import sc.node.*;

public class Sc2sa extends DepthFirstAdapter {
    private SaNode returnValue;

    // programme = l_declaration_var_b_opt l_function_dec;
    public void caseAProgramme(AProgramme node){
        SaLDec var;
        SaLDec function;
        node.getLDeclarationVarBOpt().apply(this);
        var = (SaLDec) this.returnValue;
        node.getLFunctionDec().apply(this);
        function = (SaLDec) this.returnValue;
        this.returnValue = new SaProg(var,function);
   }

    // l_function_dec = {l_function_dec} function_dec l_function_dec | {epsilon6};
    public void caseALFunctionDecLFunctionDec(ALFunctionDecLFunctionDec node){
        SaDec func;
        SaLDec list;
        node.getFunctionDec().apply(this);
        func = (SaDec) this.returnValue;
        node.getLFunctionDec().apply(this);
        list = (SaLDec) this.returnValue;
        this.returnValue = new SaLDec(func, list);
    }

    // l_function_dec = {epsilon6};
    public void caseAEpsilon6LFunctionDec(AEpsilon6LFunctionDec node){
        this.returnValue = null;
    }

    // function_dec = id l_par l_declaration_var r_par l_declaration_var_b_opt iblock;
    public void caseAFunctionDec(AFunctionDec node){



    }







    // expr  =  {or} expr or expr1
    public void caseAOrExpr(AOrExpr node){
        SaExp op1;
        SaExp op2;
        node.getExpr().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getOr().apply(this);
        node.getExpr1().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpOr(op1, op2);
    }

    // expr = {expr1} expr1
    public void caseAExpr1Expr(AExpr1Expr node){
        SaExp op;
        node.getExpr1().apply(this);
        op = (SaExp) this.returnValue;
    }

    //expr1 =  {and} expr1 and expr2
    public void caseAAndExpr1(AAndExpr1 node){
        SaExp op1;
        SaExp op2;
        node.getExpr1().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getAnd().apply(this);
        node.getExpr2().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAnd(op1, op2);
    }

    //expr1 = {expr2} expr2
    public void caseAExpr2Expr1(AExpr2Expr1 node){
        SaExp op;
        node.getExpr2().apply(this);
        op = (SaExp) this.returnValue;
    }

    //expr2 =  {equal} expr2 equal expr3
    public void caseAEqualExpr2(AEqualExpr2 node){
        SaExp op1;
        SaExp op2;
        node.getExpr2().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getEqual().apply(this);
        node.getExpr3().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpEqual(op1,op2);
    }

    // expr2 = {inf} expr2 inf expr3
    public void caseAInfExpr2(AInfExpr2 node){
        SaExp op1;
        SaExp op2;
        node.getExpr2().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getInf().apply(this);
        node.getExpr3().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpInf(op1,op2);
    }

    // expr2 = {expr3} expr3
    public void caseAExpr3Expr2(AExpr3Expr2 node){
        SaExp op;
        node.getExpr3().apply(this);
        op = (SaExp) this.returnValue;
    }


    // expr3 = {plus} expr3 plus expr4
    public void caseAPlusExpr3(APlusExpr3 node){
        SaExp op1 = null;
        SaExp op2 = null;
        node.getExpr3().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getPlus().apply(this);
        node.getExpr4().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAdd(op1, op2);
    }

    // expr3 = {minus} expr3 minus expr4
    public void caseAMinusExpr3(AMinusExpr3 node){
        SaExp op1 = null;
        SaExp op2 = null;
        node.getExpr3().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getMinus().apply(this);
        node.getExpr4().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpSub(op1,op2);
    }

    // expr3 = {expr4} expr4
    public void caseAExpr4Expr3(AExpr4Expr3 node){
        SaExp op;
        node.getExpr4().apply(this);
        op = (SaExp) this.returnValue;
    }


   // expr4 =  {mult} expr4 mult expr5
    public void caseAMultExpr4(AMultExpr4 node){
        SaExp op1 = null;
        SaExp op2 = null;
        node.getExpr4().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getMult().apply(this);
        node.getExpr5().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpMult(op1,op2);
    }
   // expr4 =  {div} expr4 div expr5
    public void caseADivExpr4(ADivExpr4 node){
        SaExp op1 = null;
        SaExp op2 = null;
        node.getExpr4().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getDiv().apply(this);
        node.getExpr4().apply(this);
        op1 = (SaExp) this.returnValue;
        this.returnValue = new SaExpDiv(op1,op2);
    }
   // expr4 = {expr5} expr5
    public void caseAExpr5Expr4(AExpr5Expr4 node){
       SaExp op;
       node.getExpr5().apply(this);
       op = (SaExp) this.returnValue;
    }
    // expr5 =  {not} not expr5
    public void caseANotExpr5(ANotExpr5 node){
        SaExp op;
        node.getExpr5().apply(this);
        op = (SaExp) this.returnValue;
        node.getNot().apply(this);
        this.returnValue = new SaExpNot(op);
    }
    //expr5 = {expr6} expr6
    public void caseAExpr6Expr5(AExpr6Expr5 node){
        SaExp op;
        node.getExpr6().apply(this);
        op = (SaExp) this.returnValue;
    }
    //expr6 = {par} l_par expr r_par
    public void caseAParExpr6(AParExpr6 node){
        SaExp l_par;
        SaExp op;
        SaExp r_par;
        node.getLPar().apply(this);
        l_par = (SaExp) this.returnValue;
        node.getExpr().apply(this);
        op = (SaExp) this.returnValue;
        node.getRPar().apply(this);
        r_par = (SaExp) this.returnValue;
    }
    //expr6 = {number} number
    public void caseANumberExpr6(ANumberExpr6 node){
        SaExp op;
        node.getNumber().apply(this);
        op = (SaExp) this.returnValue;
    }
    //expr6 = {var} var
    public void caseAVarExpr6(AVarExpr6 node){
        SaExp op;
        node.getVar().apply(this);
        op = (SaExp) this.returnValue;
    }
    // expr6 = {call_function} call_function
    public void caseACallFunctionExpr6(ACallFunctionExpr6 node){
        SaExp op;
        node.getCallFunction().apply(this);
        op = (SaExp) this.returnValue;
    }
    // expr6 =  {read} read l_par r_par
    public void caseAReadExpr6(AReadExpr6 node){
        this.returnValue = new SaExpLire();
    }



}
