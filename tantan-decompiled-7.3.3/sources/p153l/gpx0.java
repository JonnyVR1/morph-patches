package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class gpx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f105632a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hpx0 f105633b;

    public gpx0(hpx0 hpx0Var) {
        this.f105633b = hpx0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f105632a < this.f105633b.f111058a.size() || this.f105633b.f111059b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f105632a;
        int size = this.f105633b.f111058a.size();
        hpx0 hpx0Var = this.f105633b;
        if (i >= size) {
            hpx0Var.f111058a.add(hpx0Var.f111059b.next());
            return next();
        }
        int i2 = this.f105632a;
        this.f105632a = i2 + 1;
        return hpx0Var.f111058a.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
