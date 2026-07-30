package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class nyt0 extends n3u0 {

    /* JADX INFO: renamed from: a */
    public final Object f141155a;

    /* JADX INFO: renamed from: b */
    public boolean f141156b;

    public nyt0(Object obj) {
        this.f141155a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f141156b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f141156b) {
            lmr.m150601a();
            return null;
        }
        this.f141156b = true;
        return this.f141155a;
    }
}
