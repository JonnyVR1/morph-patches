package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class x2u0 extends pwu0 {

    /* JADX INFO: renamed from: a */
    public final Object f192196a;

    /* JADX INFO: renamed from: b */
    public boolean f192197b;

    public x2u0(Object obj) {
        this.f192196a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f192197b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f192197b) {
            mor.m159308a();
            return null;
        }
        this.f192197b = true;
        return this.f192196a;
    }
}
