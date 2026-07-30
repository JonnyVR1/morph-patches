package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class btr0 implements Iterator<ymr0> {

    /* JADX INFO: renamed from: a */
    public int f77257a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ppr0 f77258b;

    public btr0(ppr0 ppr0Var) {
        this.f77258b = ppr0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77257a < this.f77258b.f150679a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ymr0 next() {
        if (this.f77257a >= this.f77258b.f150679a.length()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f77257a;
        this.f77257a = i + 1;
        return new ppr0(String.valueOf(i));
    }
}
