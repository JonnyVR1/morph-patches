package p153l;

/* JADX INFO: loaded from: classes.dex */
public class n6c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.n6c$a */
    public class C18811a<T> implements a7h0<i6c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f140441a;

        public C18811a(Throwable th) {
            this.f140441a = th;
        }

        @Override // p153l.a7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i6c<T> get() {
            return n6c.m161759b(this.f140441a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> a7h0<i6c<T>> m161758a(Throwable th) {
        return new C18811a(th);
    }

    /* JADX INFO: renamed from: b */
    public static <T> i6c<T> m161759b(Throwable th) {
        vof0 vof0VarM202118x = vof0.m202118x();
        vof0VarM202118x.mo8245o(th);
        return vof0VarM202118x;
    }

    /* JADX INFO: renamed from: c */
    public static i6c<Void> m161760c() {
        return beg0.INSTANCE;
    }
}
