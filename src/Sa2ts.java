import javafx.scene.control.Tab;
import sa.*;
import ts.Ts;
import ts.TsItemFct;
import ts.TsItemVar;

public class Sa2ts extends SaDepthFirstVisitor {

    Ts TableGlobale = new Ts();
    Ts TableLocale;
    int param = 0;


    public Sa2ts(SaNode saRoot){
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
    @Override
    public Object visit(SaDecTab node) {
        if(TableLocale!=null) {
            if (TableGlobale.variables.size() < param){
                TableLocale.addVar(node.getNom(), node.getTaille());
            }
            else{
                TableLocale.addParam(node.getNom());
            }
        }
        else {
            TableGlobale.addVar(node.getNom(),node.getTaille());
        }
        return super.visit(node);
    }



    @Override
    public Object visit(SaDecFonc node) {
        if(node.getParametres()==null){
            param=0;
        }
        else {
            param = node.getParametres().length();
        }
        TableLocale = new Ts();
        TableGlobale.addFct(node.getNom(),param,TableLocale,node);
        return super.visit(node);
    }



    @Override
    public Object visit(SaVarSimple node) {
        if(TableLocale != null){
            TableLocale.variables.put(node.getNom(), node.tsItem);
            return super.visit(node);
        }
        if(TableGlobale != null){
            TableGlobale.variables.put(node.getNom(), node.tsItem);
            return super.visit(node);
        }

        throw new RuntimeException("erreur: la variable " +node.getNom() +" n'existe pas");
    }

    @Override
    public Object visit(SaVarIndicee node) {
        if(TableGlobale != null){
            TableGlobale.variables.put(node.getNom(), node.tsItem);
            return super.visit(node);
        }
        throw new RuntimeException("erreur: la variable " +node.getNom() +" n'existe pas");
    }

    @Override
    public Object visit(SaAppel node) {
        if (TableGlobale.fonctions.containsKey(node.getNom())
                && node.getArguments().length() == TableGlobale.fonctions.get(node.getNom()).nbArgs) {
            TableGlobale.fonctions.put(node.getNom(), node.tsItem);
        }
        throw new RuntimeException();


    }


}
