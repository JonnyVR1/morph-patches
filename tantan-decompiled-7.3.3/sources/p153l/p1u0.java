package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class p1u0 implements pbu0 {

    /* JADX INFO: renamed from: a */
    public final Iterator f150197a;

    /* JADX INFO: renamed from: b */
    public boolean f150198b;

    /* JADX INFO: renamed from: c */
    public Object f150199c;

    public p1u0(Iterator it) {
        it.getClass();
        this.f150197a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f150198b || this.f150197a.hasNext();
    }

    @Override // p153l.pbu0, java.util.Iterator
    public final Object next() {
        if (!this.f150198b) {
            return this.f150197a.next();
        }
        Object obj = this.f150199c;
        this.f150198b = false;
        this.f150199c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f150198b) {
            wtq0.m207906a("Can't remove after you've peeked at next");
        } else {
            this.f150197a.remove();
        }
    }

    @Override // p153l.pbu0
    public final Object zza() {
        if (!this.f150198b) {
            this.f150199c = this.f150197a.next();
            this.f150198b = true;
        }
        return this.f150199c;
    }
}
