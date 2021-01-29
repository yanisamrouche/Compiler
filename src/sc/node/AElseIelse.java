/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AElseIelse extends PIelse
{
    private TElse _else_;
    private PIblock _iblock_;

    public AElseIelse()
    {
        // Constructor
    }

    public AElseIelse(
        @SuppressWarnings("hiding") TElse _else_,
        @SuppressWarnings("hiding") PIblock _iblock_)
    {
        // Constructor
        setElse(_else_);

        setIblock(_iblock_);

    }

    @Override
    public Object clone()
    {
        return new AElseIelse(
            cloneNode(this._else_),
            cloneNode(this._iblock_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAElseIelse(this);
    }

    public TElse getElse()
    {
        return this._else_;
    }

    public void setElse(TElse node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._else_)
            + toString(this._iblock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        if(this._iblock_ == child)
        {
            this._iblock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._else_ == oldChild)
        {
            setElse((TElse) newChild);
            return;
        }

        if(this._iblock_ == oldChild)
        {
            setIblock((PIblock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}