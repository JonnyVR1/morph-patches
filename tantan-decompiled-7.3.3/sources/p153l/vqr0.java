package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class vqr0 implements Iterator<ewr0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator f185394a;

    public vqr0(Iterator it) {
        this.f185394a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f185394a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ ewr0 next() {
        return new vyr0((String) this.f185394a.next());
    }
}
