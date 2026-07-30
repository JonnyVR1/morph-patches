package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wzy0 extends yzr0 {

    /* JADX INFO: renamed from: a */
    public final int f191850a;

    /* JADX INFO: renamed from: b */
    public int f191851b;

    public wzy0(int i, int i2) {
        mwy0.m160611b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f191850a = i;
        this.f191851b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo125414a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f191851b < this.f191850a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f191851b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f191851b;
        this.f191851b = i + 1;
        return mo125414a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f191851b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f191851b - 1;
        this.f191851b = i;
        return mo125414a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f191851b - 1;
    }
}
