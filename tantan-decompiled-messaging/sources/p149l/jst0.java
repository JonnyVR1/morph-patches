package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class jst0 implements j2u0 {

    /* JADX INFO: renamed from: a */
    public final Iterator f119540a;

    /* JADX INFO: renamed from: b */
    public boolean f119541b;

    /* JADX INFO: renamed from: c */
    public Object f119542c;

    public jst0(Iterator it) {
        it.getClass();
        this.f119540a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f119541b || this.f119540a.hasNext();
    }

    @Override // p149l.j2u0, java.util.Iterator
    public final Object next() {
        if (!this.f119541b) {
            return this.f119540a.next();
        }
        Object obj = this.f119542c;
        this.f119541b = false;
        this.f119542c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f119541b) {
            qkq0.m175383a("Can't remove after you've peeked at next");
        } else {
            this.f119540a.remove();
        }
    }

    @Override // p149l.j2u0
    public final Object zza() {
        if (!this.f119541b) {
            this.f119542c = this.f119540a.next();
            this.f119541b = true;
        }
        return this.f119542c;
    }
}
