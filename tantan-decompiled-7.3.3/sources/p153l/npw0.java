package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class npw0 extends ftw0 {

    /* JADX INFO: renamed from: a */
    public final int f143138a;

    /* JADX INFO: renamed from: b */
    public int f143139b;

    public npw0(int i, int i2) {
        tow0.m192087b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f143138a = i;
        this.f143139b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo164250a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f143139b < this.f143138a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f143139b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f143139b;
        this.f143139b = i + 1;
        return mo164250a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f143139b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f143139b - 1;
        this.f143139b = i;
        return mo164250a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f143139b - 1;
    }
}
