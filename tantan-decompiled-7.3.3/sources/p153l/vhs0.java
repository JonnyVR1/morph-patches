package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vhs0 extends vxu0 {

    /* JADX INFO: renamed from: a */
    public final int f184189a;

    /* JADX INFO: renamed from: b */
    public int f184190b;

    public vhs0(int i, int i2) {
        ses0.m185567b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f184189a = i;
        this.f184190b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo196526a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f184190b < this.f184189a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f184190b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f184190b;
        this.f184190b = i + 1;
        return mo196526a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f184190b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f184190b - 1;
        this.f184190b = i;
        return mo196526a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f184190b - 1;
    }
}
