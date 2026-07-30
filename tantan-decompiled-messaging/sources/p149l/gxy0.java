package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public abstract class gxy0 extends ver0 {

    /* JADX INFO: renamed from: a */
    public final int f104948a;

    /* JADX INFO: renamed from: b */
    public int f104949b;

    public gxy0(int i, int i2) {
        nly0.m160081b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f104948a = i;
        this.f104949b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo124727a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f104949b < this.f104948a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f104949b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f104949b;
        this.f104949b = i + 1;
        return mo124727a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f104949b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            lmr.m150601a();
            return null;
        }
        int i = this.f104949b - 1;
        this.f104949b = i;
        return mo124727a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f104949b - 1;
    }
}
