/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AIfIif extends PIif
{
    private TIf _if_;
    private PExpr _expr_;
    private TThen _then_;
    private PIblock _iblock_;
    private PIelse _ielse_;

    public AIfIif()
    {
        // Constructor
    }

    public AIfIif(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TThen _then_,
        @SuppressWarnings("hiding") PIblock _iblock_,
        @SuppressWarnings("hiding") PIelse _ielse_)
    {
        // Constructor
        setIf(_if_);

        setExpr(_expr_);

        setThen(_then_);

        setIblock(_iblock_);

        setIelse(_ielse_);

    }

    @Override
    public Object clone()
    {
        return new AIfIif(
            cloneNode(this._if_),
            cloneNode(this._expr_),
            cloneNode(this._then_),
            cloneNode(this._iblock_),
            cloneNode(this._ielse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfIif(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
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

    public TThen getThen()
    {
        return this._then_;
    }

    public void setThen(TThen node)
    {
        if(this._then_ != null)
        {
            this._then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._then_ = node;
    }

    public PIblock getIblock()
    {
        return this._iblock_;
    }

    public void setIblock(PIblock node)
    {
        if(this._iblock_ != null)
        {
            this._iblock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._iblock_ = node;
    }

    public PIelse getIelse()
    {
        return this._ielse_;
    }

    public void setIelse(PIelse node)
    {
        if(this._ielse_ != null)
        {
            this._ielse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ielse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._expr_)
            + toString(this._then_)
            + toString(this._iblock_)
            + toString(this._ielse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._then_ == child)
        {
            this._then_ = null;
            return;
        }

        if(this._iblock_ == child)
        {
            this._iblock_ = null;
            return;
        }

        if(this._ielse_ == child)
        {
            this._ielse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._then_ == oldChild)
        {
            setThen((TThen) newChild);
            return;
        }

        if(this._iblock_ == oldChild)
        {
            setIblock((PIblock) newChild);
            return;
        }

        if(this._ielse_ == oldChild)
        {
            setIelse((PIelse) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
