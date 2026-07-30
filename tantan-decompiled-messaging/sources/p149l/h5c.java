package p149l;

/* JADX INFO: loaded from: classes.dex */
public class h5c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.h5c$a */
    public class C17228a<T> implements syg0<c5c<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f105941a;

        public C17228a(Throwable th) {
            this.f105941a = th;
        }

        @Override // p149l.syg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c5c<T> get() {
            return h5c.m129392b(this.f105941a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> syg0<c5c<T>> m129391a(Throwable th) {
        return new C17228a(th);
    }

    /* JADX INFO: renamed from: b */
    public static <T> c5c<T> m129392b(Throwable th) {
        ogf0 ogf0VarM164199x = ogf0.m164199x();
        ogf0VarM164199x.mo8191o(th);
        return ogf0VarM164199x;
    }

    /* JADX INFO: renamed from: c */
    public static c5c<Void> m129393c() {
        return t5g0.INSTANCE;
    }
}
