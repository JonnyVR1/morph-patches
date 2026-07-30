package p149l;

/* JADX INFO: loaded from: classes.dex */
public class vyg0 {

    /* JADX INFO: renamed from: a */
    public static final syg0<Boolean> f183523a = new C20763b();

    /* JADX INFO: renamed from: b */
    public static final syg0<Boolean> f183524b = new C20764c();

    /* JADX INFO: renamed from: c */
    public static final syg0<String> f183525c = new C20765d();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.vyg0$a */
    public class C20762a<T> implements syg0<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f183526a;

        public C20762a(Object obj) {
            this.f183526a = obj;
        }

        @Override // p149l.syg0
        public T get() {
            return (T) this.f183526a;
        }
    }

    /* JADX INFO: renamed from: l.vyg0$b */
    public class C20763b implements syg0<Boolean> {
        @Override // p149l.syg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.vyg0$c */
    public class C20764c implements syg0<Boolean> {
        @Override // p149l.syg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l.vyg0$d */
    public class C20765d implements syg0<String> {
        @Override // p149l.syg0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> syg0<T> m200647a(T t) {
        return new C20762a(t);
    }
}
