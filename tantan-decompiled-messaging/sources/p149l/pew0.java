package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class pew0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Object f148499a;

    /* JADX INFO: renamed from: b */
    public int f148500b = 2;

    /* JADX INFO: renamed from: a */
    public final Object m168561a() {
        this.f148500b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        nfw0.m159287i(this.f148500b != 4);
        int i = this.f148500b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f148500b = 4;
            this.f148499a = zza();
            if (this.f148500b != 3) {
                this.f148500b = 1;
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
        this.f148500b = 2;
        Object obj = this.f148499a;
        this.f148499a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();
}
