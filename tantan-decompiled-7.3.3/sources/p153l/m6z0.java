package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public abstract class m6z0 extends bor0 {

    /* JADX INFO: renamed from: a */
    public final int f135045a;

    /* JADX INFO: renamed from: b */
    public int f135046b;

    public m6z0(int i, int i2) {
        tuy0.m192767b(i2, i, FirebaseAnalytics.Param.INDEX);
        this.f135045a = i;
        this.f135046b = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo157267a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f135046b < this.f135045a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f135046b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        int i = this.f135046b;
        this.f135046b = i + 1;
        return mo157267a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f135046b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            mor.m159308a();
            return null;
        }
        int i = this.f135046b - 1;
        this.f135046b = i;
        return mo157267a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f135046b - 1;
    }
}
