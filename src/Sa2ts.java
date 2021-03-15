import javafx.scene.control.Tab;
import sa.*;
import ts.Ts;
import ts.TsItemFct;
import ts.TsItemVar;

public class Sa2ts extends SaDepthFirstVisitor<Void> {

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
    public Void visit(SaDecVar node) {
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

        return null;
    }
    @Override
    public Void visit(SaDecTab node) {
        // le tableau est tjr une variable globale
        if(TableGlobale.getVar(node.getNom()) != null)
            throw new RuntimeException("Le tableau "+node.getNom()+" existe déja !");
        node.tsItem = TableGlobale.addVar(node.getNom(), node.getTaille());
        return null;
    }



    @Override
    public Void visit(SaDecFonc node) {
        Ts newTable = new Ts();
        TableLocale = newTable;
        String nom = node.getNom();
        int nbArgs;
        if(node.getParametres() == null)
            nbArgs = 0;
        else
            nbArgs = node.getParametres().length();
        if(TableGlobale.getFct(nom) != null)
            throw new RuntimeException("erreur: la fonction "+nom+" existe déja !");
        if(node.getParametres() != null)
            node.getParametres().accept(this);
        if (node.getVariable() != null)
            node.getVariable().accept(this);
        if (node.getCorps() != null)
            node.getCorps().accept(this);
        TableLocale = TableGlobale.getTableLocale(node.getNom());

        node.tsItem = TableGlobale.addFct(nom, nbArgs, newTable, node);
        return null;
    }



    @Override
    public Void visit(SaVarSimple node) {
       boolean isGlobal = false;
       if(TableLocale.getVar(node.getNom()) != null){// ==
           if(TableGlobale.getVar(node.getNom()) != null){// ==
               throw new RuntimeException("erreur1: la variable "+node.getNom()+" n'a pas été déclarée");
           }else {
               isGlobal = true;
           }
       }
       TsItemVar tsItemVar;
       if(isGlobal){
           tsItemVar = TableGlobale.getVar(node.getNom());
       }else {
           tsItemVar = TableLocale.getVar(node.getNom());
       }
       node.tsItem = tsItemVar;
       return null;

    }

    @Override
    public Void visit(SaVarIndicee node) {
        if(TableLocale.getVar(node.getNom()) != null)
            throw new RuntimeException("le tableau "+node.getNom()+" existe déja comme variable globale !");
        if(TableGlobale.variables.containsKey(node.getNom()))
            throw new RuntimeException("erreur ");
        node.tsItem = TableGlobale.getVar(node.getNom());
        return null;

    }

    @Override
    public Void visit(SaAppel node) {
        String nom = node.getNom();
        int nbArgs;
        if(node.getArguments() == null)
            nbArgs = 0;
        else
            nbArgs = node.getArguments().length();
        TsItemFct tsItemFct = TableGlobale.getFct(nom);
        if(TableGlobale.getFct(nom) == null)
            throw new RuntimeException("La fonction "+nom+" n'existe pas");

        if(nbArgs != tsItemFct.nbArgs)
            throw new RuntimeException("le nbr d'args passés " +
                    "à la fct appelée doit etre identique au nbr d'args formels ds la déclaration");
        node.tsItem = tsItemFct;
        return null;
    }


}
