package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class rtt0 extends jnu0 {

    /* JADX INFO: renamed from: a */
    public final Object f160995a;

    /* JADX INFO: renamed from: b */
    public boolean f160996b;

    public rtt0(Object obj) {
        this.f160995a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f160996b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f160996b) {
            lmr.m150601a();
            return null;
        }
        this.f160996b = true;
        return this.f160995a;
    }
}
