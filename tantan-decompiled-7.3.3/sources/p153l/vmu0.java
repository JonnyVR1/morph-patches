package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vmu0 extends ivu0 {

    /* JADX INFO: renamed from: a */
    public final int f184788a;

    /* JADX INFO: renamed from: b */
    public int f184789b;

    public vmu0(int i, int i2) {
        iku0.m140417b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f184788a = i;
        this.f184789b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo136583a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f184789b < this.f184788a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f184789b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f184789b;
        this.f184789b = i + 1;
        return mo136583a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f184789b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f184789b - 1;
        this.f184789b = i;
        return mo136583a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f184789b - 1;
    }
}
