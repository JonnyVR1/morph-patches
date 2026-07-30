package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class srr0 implements Iterator<ymr0> {

    /* JADX INFO: renamed from: a */
    public int f166131a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ppr0 f166132b;

    public srr0(ppr0 ppr0Var) {
        this.f166132b = ppr0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f166131a < this.f166132b.f150679a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ymr0 next() {
        if (this.f166131a >= this.f166132b.f150679a.length()) {
            lmr.m150601a();
            return null;
        }
        String str = this.f166132b.f150679a;
        int i = this.f166131a;
        this.f166131a = i + 1;
        return new ppr0(String.valueOf(str.charAt(i)));
    }
}
