package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vnw0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Object f184928a;

    /* JADX INFO: renamed from: b */
    public int f184929b = 2;

    /* JADX INFO: renamed from: a */
    public final Object m202011a() {
        this.f184929b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        tow0.m192094i(this.f184929b != 4);
        int i = this.f184929b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f184929b = 4;
            this.f184928a = zza();
            if (this.f184929b != 3) {
                this.f184929b = 1;
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
        this.f184929b = 2;
        Object obj = this.f184928a;
        this.f184928a = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();
}
