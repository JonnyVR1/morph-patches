package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class piw0 extends yjw0 {

    /* JADX INFO: renamed from: b */
    public static final Object f149692b = new Object();

    /* JADX INFO: renamed from: a */
    public Object f149693a;

    public piw0(Object obj) {
        this.f149693a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f149693a != f149692b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f149693a;
        Object obj2 = f149692b;
        if (obj != obj2) {
            this.f149693a = obj2;
            return obj;
        }
        lmr.m150601a();
        return null;
    }
}
