package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p8s0 extends pou0 {

    /* JADX INFO: renamed from: a */
    public final int f147631a;

    /* JADX INFO: renamed from: b */
    public int f147632b;

    public p8s0(int i, int i2) {
        m5s0.m153143b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f147631a = i;
        this.f147632b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo163463a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f147632b < this.f147631a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f147632b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f147632b;
        this.f147632b = i + 1;
        return mo163463a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f147632b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f147632b - 1;
        this.f147632b = i;
        return mo163463a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f147632b - 1;
    }
}
