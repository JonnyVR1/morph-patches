package org.spongycastle.pqc.math.linearalgebra;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class GF2nElement implements GFElement {
    protected int mDegree;
    protected GF2nField mField;

    public abstract void assignOne();

    public abstract void assignZero();

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public abstract Object clone();

    public final GF2nElement convert(GF2nField gF2nField) throws RuntimeException {
        return this.mField.convert(this, gF2nField);
    }

    public final GF2nField getField() {
        return this.mField;
    }

    public abstract GF2nElement increase();

    public abstract void increaseThis();

    public abstract GF2nElement solveQuadraticEquation() throws RuntimeException;

    public abstract GF2nElement square();

    public abstract GF2nElement squareRoot();

    public abstract void squareRootThis();

    public abstract void squareThis();

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public final GFElement subtract(GFElement gFElement) throws RuntimeException {
        return add(gFElement);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public final void subtractFromThis(GFElement gFElement) {
        addToThis(gFElement);
    }

    public abstract boolean testBit(int i);

    public abstract boolean testRightmostBit();

    public abstract int trace();
}
