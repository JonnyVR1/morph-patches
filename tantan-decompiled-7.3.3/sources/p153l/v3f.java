package p153l;

import com.tantan.eventbus.EventBusException;
import com.tantan.eventbus.ThreadMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes11.dex */
public class v3f {

    /* JADX INFO: renamed from: g */
    private static final w3f f182182g = new w3f();

    /* JADX INFO: renamed from: a */
    private final Map<String, C20734b<?, ?>> f182183a;

    /* JADX INFO: renamed from: b */
    private final qsw f182184b;

    /* JADX INFO: renamed from: c */
    private final ExecutorService f182185c;

    /* JADX INFO: renamed from: d */
    private final boolean f182186d;

    /* JADX INFO: renamed from: e */
    private final wzv f182187e;

    /* JADX INFO: renamed from: f */
    private cu6<?> f182188f;

    /* JADX INFO: renamed from: l.v3f$a */
    public static /* synthetic */ class C20733a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f182189a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f182189a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f182189a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f182189a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f182189a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f182189a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: l.v3f$b */
    public class C20734b<T, O> {

        /* JADX INFO: renamed from: a */
        String f182190a;

        /* JADX INFO: renamed from: b */
        CopyOnWriteArrayList<jcg0<T>> f182191b;

        /* JADX INFO: renamed from: c */
        T f182192c;

        /* JADX INFO: renamed from: d */
        private final dm80<T> f182193d;

        /* JADX INFO: renamed from: e */
        private final hc2<T> f182194e;

        /* JADX INFO: renamed from: f */
        private final t21<T> f182195f;

        /* JADX INFO: renamed from: g */
        private final ThreadLocal<C20737e<T>> f182196g = new a();

        /* JADX INFO: renamed from: l.v3f$b$a */
        public class a extends ThreadLocal<C20737e<T>> {
            public a() {
            }

            @Override // java.lang.ThreadLocal
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C20737e<T> initialValue() {
                return new C20737e<>();
            }
        }

        public C20734b(String str) {
            this.f182190a = str;
            this.f182193d = v3f.this.f182184b != null ? v3f.this.f182184b.mo177818b(this) : null;
            this.f182194e = new hc2<>(this);
            this.f182195f = new t21<>(this);
        }

        /* JADX INFO: renamed from: a */
        private void m199261a(jcg0<T> jcg0Var, T t) {
            if (t != null) {
                m199264n(jcg0Var, t, v3f.this.m199257g());
            }
        }

        /* JADX INFO: renamed from: k */
        private void m199262k(T t, C20737e<T> c20737e) throws Error {
            if (m199263l(t, c20737e) || !v3f.this.f182186d) {
                return;
            }
            v3f.this.f182187e.mo208767a(Level.FINE, "No subscribers registered for event " + this.f182190a);
        }

        /* JADX INFO: renamed from: l */
        private boolean m199263l(T t, C20737e<T> c20737e) {
            CopyOnWriteArrayList<jcg0<T>> copyOnWriteArrayList = this.f182191b;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
                return false;
            }
            for (jcg0<T> jcg0Var : this.f182191b) {
                c20737e.f182205e = t;
                c20737e.f182204d = jcg0Var;
                try {
                    m199264n(jcg0Var, t, c20737e.f182203c);
                    boolean z = c20737e.f182206f;
                    c20737e.f182205e = null;
                    c20737e.f182204d = null;
                    c20737e.f182206f = false;
                    if (z) {
                        return true;
                    }
                } catch (Throwable th) {
                    c20737e.f182205e = null;
                    c20737e.f182204d = null;
                    c20737e.f182206f = false;
                    throw th;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: n */
        private void m199264n(jcg0<T> jcg0Var, T t, boolean z) {
            int i = C20733a.f182189a[jcg0Var.f120053d.ordinal()];
            if (i == 1) {
                m199269f(jcg0Var, t);
                return;
            }
            if (i == 2) {
                if (z) {
                    m199269f(jcg0Var, t);
                    return;
                } else {
                    this.f182193d.mo116941a(jcg0Var, t);
                    return;
                }
            }
            if (i == 3) {
                dm80<T> dm80Var = this.f182193d;
                if (dm80Var != null) {
                    dm80Var.mo116941a(jcg0Var, t);
                    return;
                } else {
                    m199269f(jcg0Var, t);
                    return;
                }
            }
            if (i != 4) {
                if (i == 5) {
                    this.f182195f.mo116941a(jcg0Var, t);
                    return;
                } else {
                    wtq0.m207906a("Unknown thread mode: ".concat(String.valueOf(jcg0Var.f120053d)));
                    return;
                }
            }
            if (z) {
                this.f182194e.mo116941a(jcg0Var, t);
            } else {
                m199269f(jcg0Var, t);
            }
        }

        /* JADX INFO: renamed from: b */
        public ExecutorService m199265b() {
            return v3f.this.f182185c;
        }

        /* JADX INFO: renamed from: c */
        public wzv m199266c() {
            return v3f.this.f182187e;
        }

        /* JADX INFO: renamed from: d */
        public String m199267d() {
            return this.f182190a;
        }

        /* JADX INFO: renamed from: e */
        public void m199268e(cr60<T> cr60Var) {
            T t = cr60Var.f83302a;
            jcg0<T> jcg0Var = cr60Var.f83303b;
            if (jcg0Var.f120057h) {
                m199269f(jcg0Var, t);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m199269f(jcg0<T> jcg0Var, T t) {
            jcg0Var.f120051b.onChanged(t);
        }

        /* JADX INFO: renamed from: g */
        public O m199270g() {
            return m199271h(ThreadMode.POSTING, 0, false);
        }

        /* JADX INFO: renamed from: h */
        public synchronized O m199271h(ThreadMode threadMode, int i, boolean z) {
            int i2;
            O o;
            try {
                jcg0<T> jcg0Var = new jcg0<>(this, this.f182190a, new ncg0(threadMode, i, z));
                if (this.f182191b == null) {
                    this.f182191b = new CopyOnWriteArrayList<>();
                }
                int size = this.f182191b.size();
                while (i2 <= size) {
                    i2 = (i2 != size && i <= this.f182191b.get(i2).f120054e) ? i2 + 1 : 0;
                    this.f182191b.add(i2, jcg0Var);
                    break;
                }
                o = (O) v3f.this.f182188f.mo102872a(jcg0Var, z);
                if (z) {
                    m199261a(jcg0Var, this.f182192c);
                }
            } catch (Throwable th) {
                throw th;
            }
            return o;
        }

        /* JADX INFO: renamed from: i */
        public O m199272i(boolean z) {
            return m199271h(ThreadMode.POSTING, 0, z);
        }

        /* JADX INFO: renamed from: j */
        public void mo199273j(T t) {
            C20737e<T> c20737e = this.f182196g.get();
            List<T> list = c20737e.f182201a;
            list.add(t);
            if (c20737e.f182202b) {
                return;
            }
            c20737e.f182203c = v3f.this.m199257g();
            c20737e.f182202b = true;
            if (c20737e.f182206f) {
                throw new EventBusException("Internal error. Abort state was not reset");
            }
            while (!list.isEmpty()) {
                try {
                    m199262k(list.remove(0), c20737e);
                } catch (Throwable th) {
                    c20737e.f182202b = false;
                    c20737e.f182203c = false;
                    throw th;
                }
            }
            c20737e.f182202b = false;
            c20737e.f182203c = false;
        }

        /* JADX INFO: renamed from: m */
        public void mo199274m(T t) {
            this.f182192c = t;
            mo199273j(t);
        }

        /* JADX INFO: renamed from: o */
        public synchronized void m199275o(jcg0<T> jcg0Var) {
            CopyOnWriteArrayList<jcg0<T>> copyOnWriteArrayList = this.f182191b;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                jcg0Var.f120057h = false;
                this.f182191b.remove(jcg0Var);
            }
        }
    }

    /* JADX INFO: renamed from: l.v3f$c */
    public class C20735c<O> extends C20734b<vxj0, O> {
        public C20735c(String str) {
            super(str);
        }

        /* JADX INFO: renamed from: p */
        public void m199277p() {
            mo199273j(vxj0.f186265a);
        }

        /* JADX INFO: renamed from: q */
        public void m199278q() {
            mo199274m(vxj0.f186265a);
        }
    }

    /* JADX INFO: renamed from: l.v3f$d */
    public class C20736d<T, O> extends C20734b<T, O> {
        public C20736d(String str) {
            super(str);
        }

        @Override // p153l.v3f.C20734b
        /* JADX INFO: renamed from: j */
        public void mo199273j(T t) {
            super.mo199273j(t);
        }

        @Override // p153l.v3f.C20734b
        /* JADX INFO: renamed from: m */
        public void mo199274m(T t) {
            super.mo199274m(t);
        }
    }

    /* JADX INFO: renamed from: l.v3f$e */
    public static final class C20737e<T> {

        /* JADX INFO: renamed from: a */
        final List<T> f182201a = new ArrayList();

        /* JADX INFO: renamed from: b */
        boolean f182202b;

        /* JADX INFO: renamed from: c */
        boolean f182203c;

        /* JADX INFO: renamed from: d */
        jcg0<T> f182204d;

        /* JADX INFO: renamed from: e */
        T f182205e;

        /* JADX INFO: renamed from: f */
        boolean f182206f;
    }

    public v3f(w3f w3fVar) {
        this.f182187e = w3fVar.m204765b();
        this.f182183a = new HashMap();
        this.f182184b = w3fVar.m204766c();
        this.f182186d = w3fVar.f187132a;
        this.f182185c = w3fVar.f187133b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public boolean m199257g() {
        qsw qswVar = this.f182184b;
        return qswVar == null || qswVar.mo177817a();
    }

    /* JADX INFO: renamed from: h */
    public synchronized <T, O> C20736d<T, O> m199258h(String str) {
        try {
            if (!this.f182183a.containsKey(str)) {
                this.f182183a.put(str, new C20736d(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C20736d) this.f182183a.get(str);
    }

    /* JADX INFO: renamed from: i */
    public synchronized <O> C20735c<O> m199259i(String str) {
        try {
            if (!this.f182183a.containsKey(str)) {
                this.f182183a.put(str, new C20735c(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C20735c) this.f182183a.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public <O> void m199260j(cu6<O> cu6Var) {
        this.f182188f = cu6Var;
    }

    public v3f() {
        this(f182182g);
    }
}
