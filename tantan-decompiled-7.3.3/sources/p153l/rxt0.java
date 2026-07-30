package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rxt0 extends aeu0 {

    /* JADX INFO: renamed from: a */
    public final int f165378a;

    /* JADX INFO: renamed from: b */
    public int f165379b;

    public rxt0(int i, int i2) {
        avt0.m100520b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f165378a = i;
        this.f165379b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo152512a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f165379b < this.f165378a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f165379b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f165379b;
        this.f165379b = i + 1;
        return mo152512a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f165379b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f165379b - 1;
        this.f165379b = i;
        return mo152512a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f165379b - 1;
    }
}
