/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AIcallFunctionInst extends PInst
{
    private PIcallFunction _icallFunction_;

    public AIcallFunctionInst()
    {
        // Constructor
    }

    public AIcallFunctionInst(
        @SuppressWarnings("hiding") PIcallFunction _icallFunction_)
    {
        // Constructor
        setIcallFunction(_icallFunction_);

    }

    @Override
    public Object clone()
    {
        return new AIcallFunctionInst(
            cloneNode(this._icallFunction_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIcallFunctionInst(this);
    }

    public PIcallFunction getIcallFunction()
    {
        return this._icallFunction_;
    }

    public void setIcallFunction(PIcallFunction node)
    {
        if(this._icallFunction_ != null)
        {
            this._icallFunction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._icallFunction_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._icallFunction_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._icallFunction_ == child)
        {
            this._icallFunction_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._icallFunction_ == oldChild)
        {
            setIcallFunction((PIcallFunction) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}