package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qqy0 extends sqr0 {

    /* JADX INFO: renamed from: a */
    public final int f155950a;

    /* JADX INFO: renamed from: b */
    public int f155951b;

    public qqy0(int i, int i2) {
        gny0.m127204b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f155950a = i;
        this.f155951b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo175980a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f155951b < this.f155950a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f155951b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f155951b;
        this.f155951b = i + 1;
        return mo175980a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f155951b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f155951b - 1;
        this.f155951b = i;
        return mo175980a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f155951b - 1;
    }
}
