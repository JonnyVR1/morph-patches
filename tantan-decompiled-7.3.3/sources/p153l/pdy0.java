package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pdy0 extends jjr0 {

    /* JADX INFO: renamed from: a */
    public final int f151848a;

    /* JADX INFO: renamed from: b */
    public int f151849b;

    public pdy0(int i, int i2) {
        j3y0.m143369b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f151848a = i;
        this.f151849b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo151626a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f151849b < this.f151848a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f151849b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f151849b;
        this.f151849b = i + 1;
        return mo151626a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f151849b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f151849b - 1;
        this.f151849b = i;
        return mo151626a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f151849b - 1;
    }
}
