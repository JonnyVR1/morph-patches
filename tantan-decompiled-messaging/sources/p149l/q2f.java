package p149l;

import com.tantan.eventbus.EventBusException;
import com.tantan.eventbus.ThreadMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
public class q2f {

    /* JADX INFO: renamed from: g */
    private static final r2f f152235g = new r2f();

    /* JADX INFO: renamed from: a */
    private final Map<String, C19395b<?, ?>> f152236a;

    /* JADX INFO: renamed from: b */
    private final rpw f152237b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f152238c;

    /* JADX INFO: renamed from: d */
    private final boolean f152239d;

    /* JADX INFO: renamed from: e */
    private final zxv f152240e;

    /* JADX INFO: renamed from: f */
    private zs6<?> f152241f;

    /* JADX INFO: renamed from: l.q2f$a */
    public static /* synthetic */ class C19394a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f152242a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f152242a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f152242a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f152242a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f152242a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f152242a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: l.q2f$b */
    public class C19395b<T, O> {

        /* JADX INFO: renamed from: a */
        String f152243a;

        /* JADX INFO: renamed from: b */
        CopyOnWriteArrayList<b4g0<T>> f152244b;

        /* JADX INFO: renamed from: c */
        T f152245c;

        /* JADX INFO: renamed from: d */
        private final wd80<T> f152246d;

        /* JADX INFO: renamed from: e */
        private final ac2<T> f152247e;

        /* JADX INFO: renamed from: f */
        private final m21<T> f152248f;

        /* JADX INFO: renamed from: g */
        private final ThreadLocal<C19398e<T>> f152249g = new a();

        /* JADX INFO: renamed from: l.q2f$b$a */
        public class a extends ThreadLocal<C19398e<T>> {
            public a() {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C19398e<T> initialValue() {
                return new C19398e<>();
            }
        }

        public C19395b(String str) {
            this.f152243a = str;
            this.f152246d = q2f.this.f152237b != null ? q2f.this.f152237b.mo180401b(this) : null;
            this.f152247e = new ac2<>(this);
            this.f152248f = new m21<>(this);
        }

        /* JADX INFO: renamed from: a */
        private void m172451a(b4g0<T> b4g0Var, T t) {
            if (t != null) {
                m172454n(b4g0Var, t, q2f.this.m172447g());
            }
        }

        /* JADX INFO: renamed from: k */
        private void m172452k(T t, C19398e<T> c19398e) throws Error {
            if (m172453l(t, c19398e) || !q2f.this.f152239d) {
                return;
            }
            q2f.this.f152240e.mo112699a(Level.FINE, "No subscribers registered for event " + this.f152243a);
        }

        /* JADX INFO: renamed from: l */
        private boolean m172453l(T t, C19398e<T> c19398e) {
            CopyOnWriteArrayList<b4g0<T>> copyOnWriteArrayList = this.f152244b;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
                return false;
            }
            for (b4g0<T> b4g0Var : this.f152244b) {
                c19398e.f152258e = t;
                c19398e.f152257d = b4g0Var;
                try {
                    m172454n(b4g0Var, t, c19398e.f152256c);
                    boolean z = c19398e.f152259f;
                    c19398e.f152258e = null;
                    c19398e.f152257d = null;
                    c19398e.f152259f = false;
                    if (z) {
                        return true;
                    }
                } catch (Throwable th) {
                    c19398e.f152258e = null;
                    c19398e.f152257d = null;
                    c19398e.f152259f = false;
                    throw th;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: n */
        private void m172454n(b4g0<T> b4g0Var, T t, boolean z) {
            int i = C19394a.f152242a[b4g0Var.f73352d.ordinal()];
            if (i == 1) {
                m172459f(b4g0Var, t);
                return;
            }
            if (i == 2) {
                if (z) {
                    m172459f(b4g0Var, t);
                    return;
                } else {
                    this.f152246d.mo95707a(b4g0Var, t);
                    return;
                }
            }
            if (i == 3) {
                wd80<T> wd80Var = this.f152246d;
                if (wd80Var != null) {
                    wd80Var.mo95707a(b4g0Var, t);
                    return;
                } else {
                    m172459f(b4g0Var, t);
                    return;
                }
            }
            if (i != 4) {
                if (i == 5) {
                    this.f152248f.mo95707a(b4g0Var, t);
                    return;
                } else {
                    qkq0.m175383a("Unknown thread mode: ".concat(String.valueOf(b4g0Var.f73352d)));
                    return;
                }
            }
            if (z) {
                this.f152247e.mo95707a(b4g0Var, t);
            } else {
                m172459f(b4g0Var, t);
            }
        }

        /* JADX INFO: renamed from: b */
        public ExecutorService m172455b() {
            return q2f.this.f152238c;
        }

        /* JADX INFO: renamed from: c */
        public zxv m172456c() {
            return q2f.this.f152240e;
        }

        /* JADX INFO: renamed from: d */
        public String m172457d() {
            return this.f152243a;
        }

        /* JADX INFO: renamed from: e */
        public void m172458e(xi60<T> xi60Var) {
            T t = xi60Var.f192962a;
            b4g0<T> b4g0Var = xi60Var.f192963b;
            if (b4g0Var.f73356h) {
                m172459f(b4g0Var, t);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m172459f(b4g0<T> b4g0Var, T t) {
            b4g0Var.f73350b.onChanged(t);
        }

        /* JADX INFO: renamed from: g */
        public O m172460g() {
            return m172461h(ThreadMode.POSTING, 0, false);
        }

        /* JADX INFO: renamed from: h */
        public synchronized O m172461h(ThreadMode threadMode, int i, boolean z) {
            int i2;
            O o;
            try {
                b4g0<T> b4g0Var = new b4g0<>(this, this.f152243a, new f4g0(threadMode, i, z));
                if (this.f152244b == null) {
                    this.f152244b = new CopyOnWriteArrayList<>();
                }
                int size = this.f152244b.size();
                while (i2 <= size) {
                    i2 = (i2 != size && i <= this.f152244b.get(i2).f73353e) ? i2 + 1 : 0;
                    this.f152244b.add(i2, b4g0Var);
                    break;
                }
                o = (O) q2f.this.f152241f.mo95058a(b4g0Var, z);
                if (z) {
                    m172451a(b4g0Var, this.f152245c);
                }
            } catch (Throwable th) {
                throw th;
            }
            return o;
        }

        /* JADX INFO: renamed from: i */
        public O m172462i(boolean z) {
            return m172461h(ThreadMode.POSTING, 0, z);
        }

        /* JADX INFO: renamed from: j */
        public void mo172463j(T t) {
            C19398e<T> c19398e = this.f152249g.get();
            List<T> list = c19398e.f152254a;
            list.add(t);
            if (c19398e.f152255b) {
                return;
            }
            c19398e.f152256c = q2f.this.m172447g();
            c19398e.f152255b = true;
            if (c19398e.f152259f) {
                throw new EventBusException("Internal error. Abort state was not reset");
            }
            while (!list.isEmpty()) {
                try {
                    m172452k(list.remove(0), c19398e);
                } catch (Throwable th) {
                    c19398e.f152255b = false;
                    c19398e.f152256c = false;
                    throw th;
                }
            }
            c19398e.f152255b = false;
            c19398e.f152256c = false;
        }

        /* JADX INFO: renamed from: m */
        public void mo172464m(T t) {
            this.f152245c = t;
            mo172463j(t);
        }

        /* JADX INFO: renamed from: o */
        public synchronized void m172465o(b4g0<T> b4g0Var) {
            CopyOnWriteArrayList<b4g0<T>> copyOnWriteArrayList = this.f152244b;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                b4g0Var.f73356h = false;
                this.f152244b.remove(b4g0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.q2f$c */
    public class C19396c<O> extends C19395b<soj0, O> {
        public C19396c(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: p */
        public void m172467p() {
            mo172463j(soj0.f165695a);
        }

        /* JADX INFO: renamed from: q */
        public void m172468q() {
            mo172464m(soj0.f165695a);
        }
    }

    /* JADX INFO: renamed from: l.q2f$d */
    public class C19397d<T, O> extends C19395b<T, O> {
        public C19397d(String str) {
            super(str);
        }

        @Override // p149l.q2f.C19395b
        /* JADX INFO: renamed from: j */
        public void mo172463j(T t) {
            super.mo172463j(t);
        }

        @Override // p149l.q2f.C19395b
        /* JADX INFO: renamed from: m */
        public void mo172464m(T t) {
            super.mo172464m(t);
        }
    }

    /* JADX INFO: renamed from: l.q2f$e */
    public static final class C19398e<T> {

        /* JADX INFO: renamed from: a */
        final List<T> f152254a = new ArrayList();

        /* JADX INFO: renamed from: b */
        boolean f152255b;

        /* JADX INFO: renamed from: c */
        boolean f152256c;

        /* JADX INFO: renamed from: d */
        b4g0<T> f152257d;

        /* JADX INFO: renamed from: e */
        T f152258e;

        /* JADX INFO: renamed from: f */
        boolean f152259f;
    }

    public q2f(r2f r2fVar) {
        this.f152240e = r2fVar.m177600b();
        this.f152236a = new HashMap();
        this.f152237b = r2fVar.m177601c();
        this.f152239d = r2fVar.f157402a;
        this.f152238c = r2fVar.f157403b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m172447g() {
        rpw rpwVar = this.f152237b;
        return rpwVar == null || rpwVar.mo180400a();
    }

    /* JADX INFO: renamed from: h */
    public synchronized <T, O> C19397d<T, O> m172448h(String str) {
        try {
            if (!this.f152236a.containsKey(str)) {
                this.f152236a.put(str, new C19397d(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C19397d) this.f152236a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public synchronized <O> C19396c<O> m172449i(String str) {
        try {
            if (!this.f152236a.containsKey(str)) {
                this.f152236a.put(str, new C19396c(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C19396c) this.f152236a.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public <O> void m172450j(zs6<O> zs6Var) {
        this.f152241f = zs6Var;
    }

    public q2f() {
        this(f152235g);
    }
}
