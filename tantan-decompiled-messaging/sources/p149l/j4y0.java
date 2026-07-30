package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j4y0 extends dar0 {

    /* JADX INFO: renamed from: a */
    public final int f116251a;

    /* JADX INFO: renamed from: b */
    public int f116252b;

    public j4y0(int i, int i2) {
        dux0.m113750b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f116251a = i;
        this.f116252b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo117160a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f116252b < this.f116251a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f116252b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f116252b;
        this.f116252b = i + 1;
        return mo117160a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f116252b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f116252b - 1;
        this.f116252b = i;
        return mo117160a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f116252b - 1;
    }
}
