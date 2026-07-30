package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class y0s0 implements Iterator<ewr0> {

    /* JADX INFO: renamed from: a */
    public int f197047a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vyr0 f197048b;

    public y0s0(vyr0 vyr0Var) {
        this.f197048b = vyr0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f197047a < this.f197048b.f186420a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ewr0 next() {
        if (this.f197047a >= this.f197048b.f186420a.length()) {
            mor.m159308a();
            return null;
        }
        String str = this.f197048b.f186420a;
        int i = this.f197047a;
        this.f197047a = i + 1;
        return new vyr0(String.valueOf(str.charAt(i)));
    }
}
