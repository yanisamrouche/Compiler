/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AEqualExpr2 extends PExpr2
{
    private PExpr2 _expr2_;
    private TEqual _equal_;
    private PExpr3 _expr3_;

    public AEqualExpr2()
    {
        // Constructor
    }

    public AEqualExpr2(
        @SuppressWarnings("hiding") PExpr2 _expr2_,
        @SuppressWarnings("hiding") TEqual _equal_,
        @SuppressWarnings("hiding") PExpr3 _expr3_)
    {
        // Constructor
        setExpr2(_expr2_);

        setEqual(_equal_);

        setExpr3(_expr3_);

    }

    @Override
    public Object clone()
    {
        return new AEqualExpr2(
            cloneNode(this._expr2_),
            cloneNode(this._equal_),
            cloneNode(this._expr3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualExpr2(this);
    }

    public PExpr2 getExpr2()
    {
        return this._expr2_;
    }

    public void setExpr2(PExpr2 node)
    {
        if(this._expr2_ != null)
        {
            this._expr2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr2_ = node;
    }

    public TEqual getEqual()
    {
        return this._equal_;
    }

    public void setEqual(TEqual node)
    {
        if(this._equal_ != null)
        {
            this._equal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equal_ = node;
    }

    public PExpr3 getExpr3()
    {
        return this._expr3_;
    }

    public void setExpr3(PExpr3 node)
    {
        if(this._expr3_ != null)
        {
            this._expr3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr2_)
            + toString(this._equal_)
            + toString(this._expr3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr2_ == child)
        {
            this._expr2_ = null;
            return;
        }

        if(this._equal_ == child)
        {
            this._equal_ = null;
            return;
        }

        if(this._expr3_ == child)
        {
            this._expr3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr2_ == oldChild)
        {
            setExpr2((PExpr2) newChild);
            return;
        }

        if(this._equal_ == oldChild)
        {
            setEqual((TEqual) newChild);
            return;
        }

        if(this._expr3_ == oldChild)
        {
            setExpr3((PExpr3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}