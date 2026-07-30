package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class y4y0 extends b5y0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m3y0 f196366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4y0(m3y0 m3y0Var) {
        super(m3y0Var);
        this.f196366b = m3y0Var;
    }

    @Override // p149l.b5y0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new t3y0(this.f196366b);
    }
}
