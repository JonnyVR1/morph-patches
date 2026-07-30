package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lot0 extends u4u0 {

    /* JADX INFO: renamed from: a */
    public final int f129141a;

    /* JADX INFO: renamed from: b */
    public int f129142b;

    public lot0(int i, int i2) {
        ult0.m194266b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f129141a = i;
        this.f129142b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo122957a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f129142b < this.f129141a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f129142b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f129142b;
        this.f129142b = i + 1;
        return mo122957a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f129142b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f129142b - 1;
        this.f129142b = i;
        return mo122957a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f129142b - 1;
    }
}
