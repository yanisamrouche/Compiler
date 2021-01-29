/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AProgramme extends PProgramme
{
    private PLDeclarationVarBOpt _lDeclarationVarBOpt_;
    private PLFunctionDec _lFunctionDec_;

    public AProgramme()
    {
        // Constructor
    }

    public AProgramme(
        @SuppressWarnings("hiding") PLDeclarationVarBOpt _lDeclarationVarBOpt_,
        @SuppressWarnings("hiding") PLFunctionDec _lFunctionDec_)
    {
        // Constructor
        setLDeclarationVarBOpt(_lDeclarationVarBOpt_);

        setLFunctionDec(_lFunctionDec_);

    }

    @Override
    public Object clone()
    {
        return new AProgramme(
            cloneNode(this._lDeclarationVarBOpt_),
            cloneNode(this._lFunctionDec_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramme(this);
    }

    public PLDeclarationVarBOpt getLDeclarationVarBOpt()
    {
        return this._lDeclarationVarBOpt_;
    }

    public void setLDeclarationVarBOpt(PLDeclarationVarBOpt node)
    {
        if(this._lDeclarationVarBOpt_ != null)
        {
            this._lDeclarationVarBOpt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lDeclarationVarBOpt_ = node;
    }

    public PLFunctionDec getLFunctionDec()
    {
        return this._lFunctionDec_;
    }

    public void setLFunctionDec(PLFunctionDec node)
    {
        if(this._lFunctionDec_ != null)
        {
            this._lFunctionDec_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lFunctionDec_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lDeclarationVarBOpt_)
            + toString(this._lFunctionDec_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lDeclarationVarBOpt_ == child)
        {
            this._lDeclarationVarBOpt_ = null;
            return;
        }

        if(this._lFunctionDec_ == child)
        {
            this._lFunctionDec_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lDeclarationVarBOpt_ == oldChild)
        {
            setLDeclarationVarBOpt((PLDeclarationVarBOpt) newChild);
            return;
        }

        if(this._lFunctionDec_ == oldChild)
        {
            setLFunctionDec((PLFunctionDec) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}