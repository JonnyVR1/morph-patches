package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vrw0 extends etw0 {

    /* JADX INFO: renamed from: b */
    public static final Object f185531b = new Object();

    /* JADX INFO: renamed from: a */
    public Object f185532a;

    public vrw0(Object obj) {
        this.f185532a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f185532a != f185531b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f185532a;
        Object obj2 = f185531b;
        if (obj != obj2) {
            this.f185532a = obj2;
            return obj;
        }
        mor.m159308a();
        return null;
    }
}
