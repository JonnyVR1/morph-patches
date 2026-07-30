package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class j7r0 implements Iterator<ymr0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f116628a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f116629b;

    public j7r0(v8r0 v8r0Var, Iterator it, Iterator it2) {
        this.f116628a = it;
        this.f116629b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f116628a.hasNext()) {
            return true;
        }
        return this.f116629b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ymr0 next() {
        if (this.f116628a.hasNext()) {
            return new ppr0(((Integer) this.f116628a.next()).toString());
        }
        if (this.f116629b.hasNext()) {
            return new ppr0((String) this.f116629b.next());
        }
        lmr.m150601a();
        return null;
    }
}
