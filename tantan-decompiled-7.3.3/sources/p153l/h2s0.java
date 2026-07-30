package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class h2s0 implements Iterator<ewr0> {

    /* JADX INFO: renamed from: a */
    public int f107585a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vyr0 f107586b;

    public h2s0(vyr0 vyr0Var) {
        this.f107586b = vyr0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f107585a < this.f107586b.f186420a.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ewr0 next() {
        if (this.f107585a >= this.f107586b.f186420a.length()) {
            mor.m159308a();
            return null;
        }
        int i = this.f107585a;
        this.f107585a = i + 1;
        return new vyr0(String.valueOf(i));
    }
}
