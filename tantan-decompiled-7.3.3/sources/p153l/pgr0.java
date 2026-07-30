package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class pgr0 implements Iterator<ewr0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f152324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f152325b;

    public pgr0(bir0 bir0Var, Iterator it, Iterator it2) {
        this.f152324a = it;
        this.f152325b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f152324a.hasNext()) {
            return true;
        }
        return this.f152325b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ewr0 next() {
        if (this.f152324a.hasNext()) {
            return new vyr0(((Integer) this.f152324a.next()).toString());
        }
        if (this.f152325b.hasNext()) {
            return new vyr0((String) this.f152325b.next());
        }
        mor.m159308a();
        return null;
    }
}
