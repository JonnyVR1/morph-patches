package p153l;

/* JADX INFO: loaded from: classes.dex */
public class d7h0 {

    /* JADX INFO: renamed from: a */
    public static final a7h0<Boolean> f85512a = new C16472b();

    /* JADX INFO: renamed from: b */
    public static final a7h0<Boolean> f85513b = new C16473c();

    /* JADX INFO: renamed from: c */
    public static final a7h0<String> f85514c = new C16474d();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.d7h0$a */
    public class C16471a<T> implements a7h0<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f85515a;

        public C16471a(Object obj) {
            this.f85515a = obj;
        }

        @Override // p153l.a7h0
        public T get() {
            return (T) this.f85515a;
        }
    }

    /* JADX INFO: renamed from: l.d7h0$b */
    public class C16472b implements a7h0<Boolean> {
        @Override // p153l.a7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.d7h0$c */
    public class C16473c implements a7h0<Boolean> {
        @Override // p153l.a7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l.d7h0$d */
    public class C16474d implements a7h0<String> {
        @Override // p153l.a7h0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> a7h0<T> m114734a(T t) {
        return new C16471a(t);
    }
}
