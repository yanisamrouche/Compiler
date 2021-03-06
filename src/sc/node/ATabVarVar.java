/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ATabVarVar extends PVar
{
    private TId _id_;
    private TLBar _lBar_;
    private PExpr _expr_;
    private TRBar _rBar_;

    public ATabVarVar()
    {
        // Constructor
    }

    public ATabVarVar(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLBar _lBar_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TRBar _rBar_)
    {
        // Constructor
        setId(_id_);

        setLBar(_lBar_);

        setExpr(_expr_);

        setRBar(_rBar_);

    }

    @Override
    public Object clone()
    {
        return new ATabVarVar(
            cloneNode(this._id_),
            cloneNode(this._lBar_),
            cloneNode(this._expr_),
            cloneNode(this._rBar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATabVarVar(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TLBar getLBar()
    {
        return this._lBar_;
    }

    public void setLBar(TLBar node)
    {
        if(this._lBar_ != null)
        {
            this._lBar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBar_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TRBar getRBar()
    {
        return this._rBar_;
    }

    public void setRBar(TRBar node)
    {
        if(this._rBar_ != null)
        {
            this._rBar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._lBar_)
            + toString(this._expr_)
            + toString(this._rBar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._lBar_ == child)
        {
            this._lBar_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._rBar_ == child)
        {
            this._rBar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._lBar_ == oldChild)
        {
            setLBar((TLBar) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._rBar_ == oldChild)
        {
            setRBar((TRBar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
