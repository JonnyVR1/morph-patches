package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class agx0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f69532a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bgx0 f69533b;

    public agx0(bgx0 bgx0Var) {
        this.f69533b = bgx0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69532a < this.f69533b.f75537a.size() || this.f69533b.f75538b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f69532a;
        int size = this.f69533b.f75537a.size();
        bgx0 bgx0Var = this.f69533b;
        if (i >= size) {
            bgx0Var.f75537a.add(bgx0Var.f75538b.next());
            return next();
        }
        int i2 = this.f69532a;
        this.f69532a = i2 + 1;
        return bgx0Var.f75537a.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
