import sa.*;
import ts.*;

public class Sa2ts extends SaDepthFirstVisitor {


    Ts TableGlobale = new Ts();
    Ts TableLocale;
    int param=0;

    public Sa2ts(SaNode saRoot) {
        visit((SaProg) saRoot);

    }

    public Ts getTableGlobale() {
        return TableGlobale;
    }
    @Override
    public Object visit(SaDecVar node) {
        if(TableLocale!=null) {
            if (TableLocale.variables.size() < param){
                TableLocale.addParam(node.getNom());
            }
            else{
                TableLocale.addVar(node.getNom(),1);
            }
        }
        else {
            TableGlobale.addVar(node.getNom(),1);
        }
        return super.visit(node);
    }






}

