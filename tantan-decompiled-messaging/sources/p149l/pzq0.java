package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pzq0 extends szq0 {

    /* JADX INFO: renamed from: a */
    public final int f151968a;

    /* JADX INFO: renamed from: b */
    public int f151969b;

    public pzq0(int i, int i2) {
        nzq0.m162081b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f151968a = i;
        this.f151969b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo172250a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f151969b < this.f151968a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f151969b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f151969b;
        this.f151969b = i + 1;
        return mo172250a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f151969b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f151969b - 1;
        this.f151969b = i;
        return mo172250a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f151969b - 1;
    }
}
