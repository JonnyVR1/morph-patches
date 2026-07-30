package p149l;

import java.util.Iterator;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes6.dex */
@NullMarked
public abstract class npx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Object f140016a;

    /* JADX INFO: renamed from: b */
    public int f140017b = 2;

    /* JADX INFO: renamed from: a */
    public final Object m160550a() {
        this.f140017b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f140017b;
        if (i == 4) {
            ohg0.m164364a();
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
            this.f140017b = 4;
            this.f140016a = zza();
            if (this.f140017b != 3) {
                this.f140017b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        this.f140017b = 2;
        Object obj = this.f140016a;
        this.f140016a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();
}
