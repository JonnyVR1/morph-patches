package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pdu0 extends cmu0 {

    /* JADX INFO: renamed from: a */
    public final int f148372a;

    /* JADX INFO: renamed from: b */
    public int f148373b;

    public pdu0(int i, int i2) {
        cbu0.m106028b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f148372a = i;
        this.f148373b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo101712a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f148373b < this.f148372a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f148373b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f148373b;
        this.f148373b = i + 1;
        return mo101712a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f148373b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f148373b - 1;
        this.f148373b = i;
        return mo101712a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f148373b - 1;
    }
}
