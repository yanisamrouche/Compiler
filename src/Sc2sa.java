import sa.*;
import sc.analysis.DepthFirstAdapter;
import sc.node.*;

public class Sc2sa extends DepthFirstAdapter {
    private SaNode returnValue;

    public void caseStart(Start node) {
        super.caseStart(node);
    }

    public SaNode getRoot() {
        return returnValue;
    }

    // programme = l_declaration_var_b_opt l_function_dec;
    @Override
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
    @Override
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
    @Override
    public void caseAEpsilon6LFunctionDec(AEpsilon6LFunctionDec node){
        this.returnValue = null;
    }

    // function_dec = id l_par l_declaration_var r_par l_declaration_var_b_opt iblock;
    @Override
    public void caseAFunctionDec(AFunctionDec node){
        String id;
        SaLDec l_declaration_var;
        SaLDec l_declaration_var_b_opt;
        SaInst iblock;

        node.getId().apply(this);
        id = node.getId().getText();
        node.getLDeclarationVar().apply(this);
        l_declaration_var = (SaLDec) this.returnValue;
        node.getLDeclarationVarBOpt().apply(this);
        l_declaration_var_b_opt = (SaLDec) this.returnValue;
        node.getIblock().apply(this);
        iblock = (SaInst) this.returnValue;
        this.returnValue = new SaDecFonc(id, l_declaration_var, l_declaration_var_b_opt, iblock);

    }

    // l_declaration_var_b_opt = {l_declaration_var_b_opt} l_declaration_var semicolon
    @Override
    public void caseALDeclarationVarBOptLDeclarationVarBOpt(ALDeclarationVarBOptLDeclarationVarBOpt node){
        SaLDec l_declaration_var;
        node.getLDeclarationVar().apply(this);
        l_declaration_var = (SaLDec) this.returnValue;
        node.getSemicolon().apply(this);
        this.returnValue = l_declaration_var;
    }

    // l_declaration_var_b_opt = {epsilon5};
    @Override
    public void caseAEpsilon5LDeclarationVarBOpt(AEpsilon5LDeclarationVarBOpt node){
        this.returnValue = null;
    }

    // l_declaration_var = {l_declaration_var} var l_declaration_var_b
    @Override
    public void caseALDeclarationVarLDeclarationVar(ALDeclarationVarLDeclarationVar node){
        SaDec var_declaration;
        SaLDec l_declaration_var_b;
        node.getVarDeclaration().apply(this);
        var_declaration = (SaDec) this.returnValue;
        node.getLDeclarationVarB().apply(this);
        l_declaration_var_b = (SaLDec) this.returnValue;
        this.returnValue = new SaLDec(var_declaration, l_declaration_var_b);
    }

    // l_declaration_var = {epsilon4}
    @Override
    public void caseAEpsilon4LDeclarationVar(AEpsilon4LDeclarationVar node){
        this.returnValue = null;
    }

    // l_declaration_var_b = {l_declaration_var_b} vrg var l_declaration_var_b
    @Override
    public void caseALDeclarationVarBLDeclarationVarB(ALDeclarationVarBLDeclarationVarB node){
        SaDec var_declaration;
        SaLDec l_declaration_var_b;
        node.getVarDeclaration().apply(this);
        var_declaration = (SaDec) this.returnValue;
        node.getLDeclarationVarB().apply(this);
        l_declaration_var_b = (SaLDec) this.returnValue;
        this.returnValue = new SaLDec(var_declaration,l_declaration_var_b) ;
    }
    @Override
    public void caseAEpsilon7LDeclarationVarB(AEpsilon7LDeclarationVarB node){
        this.returnValue = null;
    }




    // var = {o_var} id
    @Override
    public void caseAOVarVar(AOVarVar node) {
        String id;
        node.getId().apply(this);
        id = node.getId().getText().trim();
        returnValue = new SaVarSimple(id);
    }
    // var = {tab_var} id l_bar expr r_bar;
    @Override
    public void caseATabVarVar(ATabVarVar node) {
        String id;
        SaExp size;
        node.getId().apply(this);
        id = String.valueOf(node.getId()).trim();
        node.getExpr().apply(this);
        size =  (SaExp) this.returnValue;
        this.returnValue = new SaVarIndicee(id,size);
    }

    @Override
    public void caseAVarDeclarationVarDeclaration(AVarDeclarationVarDeclaration node) {
        String var;
        String tab;
        int size = 0;
        if(node.getVar() instanceof AOVarVar){
            node.getVar().apply(this);
            var = String.valueOf(node.getVar());
            returnValue = new SaDecVar(var);
        }else if(node.getVar() instanceof ATabVarVar) {
            node.getVar().apply(this);
            tab = String.valueOf(node.getVar());
            returnValue = new SaDecTab(tab, size);
        }
    }

    //l_inst = {l_inst} inst l_inst
    @Override
    public void caseALInstLInst(ALInstLInst node){
        SaInst inst;
        SaLInst l_inst;
        node.getInst().apply(this);
        inst = (SaInst) this.returnValue;
        node.getLInst().apply(this);
        l_inst = (SaLInst) this.returnValue;
        this.returnValue = new SaLInst(inst, l_inst);
    }

    @Override
    public void caseAEpsilon1LInst(AEpsilon1LInst node) {
        this.returnValue = null;
    }

    // iwrite = write l_par l_expr r_par semicolon;
    @Override
    public void caseAIwrite(AIwrite node){

        SaExp exp;
        node.getExpr().apply(this);
        exp = (SaExp) this.returnValue;
        this.returnValue = new SaInstEcriture(exp);


    }
    @Override
    public void caseAIwriteInst(AIwriteInst node) {
        SaInstEcriture e;
        node.getIwrite().apply(this);
        e = (SaInstEcriture) this.returnValue;
        this.returnValue = new SaInstEcriture(e.getArg());
    }

    @Override
    public void caseAIreadInst(AIreadInst node) {
        node.getIread().apply(this);
        SaExp r = (SaExp) this.returnValue;
        this.returnValue = r;
    }

    @Override
    public void caseAIaffectationInst(AIaffectationInst node) {
        SaInstAffect inst;
        node.getIaffectation().apply(this);
        inst = (SaInstAffect) this.returnValue;
        this.returnValue = new SaInstAffect(inst.getLhs(),inst.getRhs());
    }


    // iaffectation = var equal expr semicolon;

    @Override
    public void caseAIaffectation(AIaffectation node) {
        SaVar s;
        SaExp exp;
        node.getVar().apply(this);
        s = (SaVar) this.returnValue;
        node.getExpr().apply(this);
        exp = (SaExp) this.returnValue;
        this.returnValue = new SaInstAffect(s, exp);
    }

    //call_function =  id l_par l_expr r_par;
    @Override
    public void caseACallFunction(ACallFunction node){
        String id;
        SaLExp l_expr;
        id = node.getId().getText();
        node.getLPar().apply(this);
        node.getLExpr().apply(this);
        l_expr = (SaLExp) this.returnValue;
        node.getRPar().apply(this);
        this.returnValue = new SaAppel(id,l_expr);
    }


    @Override
    public void caseAIcallFunctionInst(AIcallFunctionInst node) {
        SaAppel call;
        node.getIcallFunction().apply(this);
        call = (SaAppel) this.returnValue;
        this.returnValue = new SaAppel(call.getNom(),call.getArguments());
    }

    //  iwhile = while l_par expr r_par do iblock;
    @Override
    public void caseAIwhile(AIwhile node) {
        SaExp cond;
        SaInst inst;
        node.getExpr().apply(this);
        cond = (SaExp) this.returnValue;
        node.getIblock().apply(this);
        inst = (SaInst) this.returnValue;
        this.returnValue = new SaInstTantQue(cond, inst);
    }

    @Override
    public void caseAIwhileInst(AIwhileInst node){
        SaInstTantQue tantQue;
        node.getIwhile().apply(this);
        tantQue = (SaInstTantQue) this.returnValue;
        this.returnValue = new SaInstTantQue(tantQue.getTest(),tantQue.getFaire());
    }
    // ireturn = return expr semicolon;
    @Override
    public void caseAIreturn(AIreturn node){
        SaExp exp;
        node.getExpr().apply(this);
        exp = (SaExp) this.returnValue;
        this.returnValue = new SaInstRetour(exp);
    }
    @Override
    public void caseAIreturnInst(AIreturnInst node) {
        SaInstRetour retour;
        node.getIreturn().apply(this);
        retour = (SaInstRetour) this.returnValue;
        this.returnValue = new SaInstRetour(retour.getVal());

    }

    // iif = {if} if expr then iblock ielse;
    @Override
    public void caseAIifInst(AIifInst node){
        SaInstSi si;
        node.getIif().apply(this);
        si = (SaInstSi) this.returnValue;
        this.returnValue = new SaInstSi(si.getTest(),si.getAlors(),si.getSinon());
    }

    @Override
    public void caseAIfIif(AIfIif node)
    {
        SaExp test;
        SaInst bloc;
        node.getExpr().apply(this);
        test = (SaExp) this.returnValue;
        node.getIblock().apply(this);
        bloc = (SaInst) this.returnValue;
        this.returnValue = new SaInstSi(test,bloc,null);
    }

    // ielse = {else} else iblock | {epsilon0};
    @Override
    public void caseAElseIelse(AElseIelse node){
        SaInstSi s;
        node.getElse().apply(this);
        s = (SaInstSi) this.returnValue;
        this.returnValue = new SaInstSi(s.getTest(),s.getAlors(),s.getSinon());

    }

    @Override
    public void caseAEpsilon0Ielse(AEpsilon0Ielse node)
    {
        this.returnValue =null;
    }

    // iblock = l_brack l_inst r_brack;
    @Override
    public void caseAIblock(AIblock node){
        SaLInst l_inst;
        node.getLInst().apply(this);
        l_inst = (SaLInst) this.returnValue;
        this.returnValue = new SaInstBloc(l_inst);
    }

    @Override
    public void caseAIblockInst(AIblockInst node){
        SaInstBloc bloc;
        node.getIblock().apply(this);
        bloc = (SaInstBloc) this.returnValue;
        this.returnValue = new SaInstBloc(bloc.getVal());
    }


    @Override
    public void caseALExprLExpr(ALExprLExpr node) {
        node.getExpr().apply(this);
        SaExp exp =(SaExp) this.returnValue;
        node.getLExprB().apply(this);
        SaLExp listExp =(SaLExp) this.returnValue;
        this.returnValue = new SaLExp(exp,listExp);

    }
    @Override
    public void caseAEpsilon3LExprB(AEpsilon3LExprB node)
    {
        this.returnValue = null;
    }

    @Override
    public void caseAEpsilon2LExpr(AEpsilon2LExpr node) {
        this.returnValue = null;
    }

    @Override
    public void caseALExprBLExprB(ALExprBLExprB node) {
        node.getExpr().apply(this);
        SaExp exp =(SaExp) this.returnValue;
        node.getLExprB().apply(this);
        SaLExp listExp =(SaLExp) this.returnValue;
        this.returnValue = new SaLExp(exp,listExp);
    }



    // expr  =  {or} expr or expr1
    @Override
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
    @Override
    public void caseAExpr1Expr(AExpr1Expr node){
        SaExp op;
        node.getExpr1().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }

    //expr1 =  {and} expr1 and expr2
    @Override
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
    @Override
    public void caseAExpr2Expr1(AExpr2Expr1 node){
        SaExp op;
        node.getExpr2().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }

    //expr2 =  {equal} expr2 equal expr3
    @Override
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
    @Override
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
    @Override
    public void caseAExpr3Expr2(AExpr3Expr2 node){
        SaExp op;
        node.getExpr3().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }


    // expr3 = {plus} expr3 plus expr4
    @Override
    public void caseAPlusExpr3(APlusExpr3 node){
        SaExp op1 ;
        SaExp op2 ;
        node.getExpr3().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getExpr4().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpAdd(op1, op2);
    }

    // expr3 = {minus} expr3 minus expr4
    @Override
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
    @Override
    public void caseAExpr4Expr3(AExpr4Expr3 node){
        SaExp op;
        node.getExpr4().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }


    // expr4 =  {mult} expr4 mult expr5
    @Override
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
    @Override
    public void caseADivExpr4(ADivExpr4 node){
        SaExp op1 = null;
        SaExp op2 = null;
        node.getExpr4().apply(this);
        op1 = (SaExp) this.returnValue;
        node.getDiv().apply(this);
        node.getExpr4().apply(this);
        op2 = (SaExp) this.returnValue;
        this.returnValue = new SaExpDiv(op1,op2);
    }
    // expr4 = {expr5} expr5
    @Override
    public void caseAExpr5Expr4(AExpr5Expr4 node){
        SaExp op;
        node.getExpr5().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }
    // expr5 =  {not} not expr5
    @Override
    public void caseANotExpr5(ANotExpr5 node){
        SaExp op;
        node.getExpr5().apply(this);
        op = (SaExp) this.returnValue;
        node.getNot().apply(this);
        this.returnValue = new SaExpNot(op);
    }
    //expr5 = {expr6} expr6
    @Override
    public void caseAExpr6Expr5(AExpr6Expr5 node){
        SaExp op;
        node.getExpr6().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }
    //expr6 = {par} l_par expr r_par
    @Override
    public void caseAParExpr6(AParExpr6 node){
        SaExp op;
        node.getExpr().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }
    //expr6 = {number} number
    @Override
    public void caseANumberExpr6(ANumberExpr6 node){
        String n;
        n = node.getNumber().getText();
        this.returnValue = new SaExpInt(Integer.parseInt(n));

    }
    //expr6 = {var} var
    @Override
    public void caseAVarExpr6(AVarExpr6 node){
        SaVar op;
        node.getVar().apply(this);
        op = (SaVar) this.returnValue;
        this.returnValue = new SaExpVar(op);
    }
    // expr6 = {call_function} call_function
    @Override
    public void caseACallFunctionExpr6(ACallFunctionExpr6 node){
        SaExp op;
        node.getCallFunction().apply(this);
        op = (SaExp) this.returnValue;
        this.returnValue = op;
    }
    // expr6 =  {read} read l_par r_par
    @Override
    public void caseAReadExpr6(AReadExpr6 node){
        this.returnValue = new SaExpLire();
    }
}
