package p153l;

import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public abstract class tyx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Object f176724a;

    /* JADX INFO: renamed from: b */
    public int f176725b = 2;

    /* JADX INFO: renamed from: a */
    public final Object m193631a() {
        this.f176725b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f176725b;
        if (i == 4) {
            wpg0.m207458a();
            return false;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f176725b = 4;
            this.f176724a = zza();
            if (this.f176725b != 3) {
                this.f176725b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        this.f176725b = 2;
        Object obj = this.f176724a;
        this.f176724a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();
}
