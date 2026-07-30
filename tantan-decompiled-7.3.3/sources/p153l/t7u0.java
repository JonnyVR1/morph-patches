package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class t7u0 extends tcu0 {

    /* JADX INFO: renamed from: a */
    public final Object f172469a;

    /* JADX INFO: renamed from: b */
    public boolean f172470b;

    public t7u0(Object obj) {
        this.f172469a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f172470b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f172470b) {
            mor.m159308a();
            return null;
        }
        this.f172470b = true;
        return this.f172469a;
    }
}
