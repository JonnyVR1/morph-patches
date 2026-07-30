package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hgw0 extends zjw0 {

    /* JADX INFO: renamed from: a */
    public final int f107667a;

    /* JADX INFO: renamed from: b */
    public int f107668b;

    public hgw0(int i, int i2) {
        nfw0.m159280b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f107667a = i;
        this.f107668b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo130929a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f107668b < this.f107667a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f107668b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f107668b;
        this.f107668b = i + 1;
        return mo130929a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f107668b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f107668b - 1;
        this.f107668b = i;
        return mo130929a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f107668b - 1;
    }
}
