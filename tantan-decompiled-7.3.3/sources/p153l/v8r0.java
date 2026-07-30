package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v8r0 extends y8r0 {

    /* JADX INFO: renamed from: a */
    public final int f182891a;

    /* JADX INFO: renamed from: b */
    public int f182892b;

    public v8r0(int i, int i2) {
        t8r0.m189691b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f182891a = i;
        this.f182892b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo200310a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f182892b < this.f182891a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f182892b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f182892b;
        this.f182892b = i + 1;
        return mo200310a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f182892b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f182892b - 1;
        this.f182892b = i;
        return mo200310a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f182892b - 1;
    }
}
