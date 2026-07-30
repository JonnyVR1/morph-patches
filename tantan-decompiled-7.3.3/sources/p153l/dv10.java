package p153l;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv10<K, T extends Closeable> implements wk90<T> {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map<K, dv10<K, T>.C16638a> f90889a;

    /* JADX INFO: renamed from: b */
    public final wk90<T> f90890b;

    /* JADX INFO: renamed from: c */
    public final boolean f90891c;

    /* JADX INFO: renamed from: d */
    public final String f90892d;

    /* JADX INFO: renamed from: e */
    public final String f90893e;

    /* JADX INFO: renamed from: l.dv10$a */
    @VisibleForTesting
    public class C16638a {

        /* JADX INFO: renamed from: a */
        public final K f90894a;

        /* JADX INFO: renamed from: b */
        public final CopyOnWriteArraySet<Pair<z06<T>, yk90>> f90895b = bve0.m106563a();

        /* JADX INFO: renamed from: c */
        public T f90896c;

        /* JADX INFO: renamed from: d */
        public float f90897d;

        /* JADX INFO: renamed from: e */
        public int f90898e;

        /* JADX INFO: renamed from: f */
        public dr2 f90899f;

        /* JADX INFO: renamed from: g */
        public dv10<K, T>.C16638a.b f90900g;

        /* JADX INFO: renamed from: l.dv10$a$a */
        public class a extends er2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Pair f90902a;

            public a(Pair pair) {
                this.f90902a = pair;
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: a */
            public void mo8584a() {
                dr2.m117661c(C16638a.this.m118258r());
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: b */
            public void mo8551b() {
                boolean zRemove;
                List list;
                dr2 dr2Var;
                List listM118260t;
                List listM118258r;
                synchronized (C16638a.this) {
                    try {
                        zRemove = C16638a.this.f90895b.remove(this.f90902a);
                        list = null;
                        if (zRemove) {
                            boolean zIsEmpty = C16638a.this.f90895b.isEmpty();
                            C16638a c16638a = C16638a.this;
                            if (zIsEmpty) {
                                dr2Var = c16638a.f90899f;
                                listM118260t = null;
                            } else {
                                List listM118259s = c16638a.m118259s();
                                listM118260t = C16638a.this.m118260t();
                                listM118258r = C16638a.this.m118258r();
                                dr2Var = null;
                                list = listM118259s;
                            }
                        } else {
                            dr2Var = null;
                            listM118260t = null;
                        }
                        listM118258r = listM118260t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                dr2.m117662f(list);
                dr2.m117663g(listM118260t);
                dr2.m117661c(listM118258r);
                if (dr2Var != null) {
                    if (!dv10.this.f90891c || dr2Var.mo117666H()) {
                        dr2Var.m117669h();
                    } else {
                        dr2.m117663g(dr2Var.m117676o(Priority.LOW));
                    }
                }
                if (zRemove) {
                    ((z06) this.f90902a.first).mo144953a();
                }
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: c */
            public void mo118261c() {
                dr2.m117662f(C16638a.this.m118259s());
            }

            @Override // p153l.er2, p153l.zk90
            /* JADX INFO: renamed from: d */
            public void mo118262d() {
                dr2.m117663g(C16638a.this.m118260t());
            }
        }

        /* JADX INFO: renamed from: l.dv10$a$b */
        public class b extends ji2<T> {
            public b() {
            }

            @Override // p153l.ji2
            /* JADX INFO: renamed from: f */
            public void mo8575f() {
                try {
                    if (i9j.m139099d()) {
                        i9j.m139097a("MultiplexProducer#onCancellation");
                    }
                    C16638a.this.m118253m(this);
                } finally {
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                    }
                }
            }

            @Override // p153l.ji2
            /* JADX INFO: renamed from: g */
            public void mo8576g(Throwable th) {
                try {
                    if (i9j.m139099d()) {
                        i9j.m139097a("MultiplexProducer#onFailure");
                    }
                    C16638a.this.m118254n(this, th);
                } finally {
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                    }
                }
            }

            @Override // p153l.ji2
            /* JADX INFO: renamed from: i */
            public void mo8578i(float f) {
                try {
                    if (i9j.m139099d()) {
                        i9j.m139097a("MultiplexProducer#onProgressUpdate");
                    }
                    C16638a.this.m118256p(this, f);
                } finally {
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                    }
                }
            }

            @Override // p153l.ji2
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void mo8577h(T t, int i) {
                try {
                    if (i9j.m139099d()) {
                        i9j.m139097a("MultiplexProducer#onNewResult");
                    }
                    C16638a.this.m118255o(this, t, i);
                } finally {
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                    }
                }
            }
        }

        public C16638a(K k) {
            this.f90894a = k;
        }

        /* JADX INFO: renamed from: g */
        public final void m118247g(Pair<z06<T>, yk90> pair, yk90 yk90Var) {
            yk90Var.mo117677q(new a(pair));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public boolean m118248h(z06<T> z06Var, yk90 yk90Var) {
            Pair<z06<T>, yk90> pairCreate = Pair.create(z06Var, yk90Var);
            synchronized (this) {
                try {
                    if (dv10.this.m118238i(this.f90894a) != this) {
                        return false;
                    }
                    this.f90895b.add(pairCreate);
                    List<zk90> listM118259s = m118259s();
                    List<zk90> listM118260t = m118260t();
                    List<zk90> listM118258r = m118258r();
                    Closeable closeableMo118236g = this.f90896c;
                    float f = this.f90897d;
                    int i = this.f90898e;
                    dr2.m117662f(listM118259s);
                    dr2.m117663g(listM118260t);
                    dr2.m117661c(listM118258r);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                try {
                                    if (closeableMo118236g != this.f90896c) {
                                        closeableMo118236g = null;
                                    } else if (closeableMo118236g != null) {
                                        closeableMo118236g = dv10.this.mo118236g(closeableMo118236g);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (closeableMo118236g != null) {
                                if (f > 0.0f) {
                                    z06Var.mo144955c(f);
                                }
                                z06Var.mo144954b(closeableMo118236g, i);
                                m118249i(closeableMo118236g);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    m118247g(pairCreate, yk90Var);
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m118249i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    iig0.m140070a(e);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public final synchronized boolean m118250j() {
            Iterator<Pair<z06<T>, yk90>> it = this.f90895b.iterator();
            while (it.hasNext()) {
                if (((yk90) it.next().second).mo117665F()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public final synchronized boolean m118251k() {
            Iterator<Pair<z06<T>, yk90>> it = this.f90895b.iterator();
            while (it.hasNext()) {
                if (!((yk90) it.next().second).mo117666H()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final synchronized Priority m118252l() {
            Priority higherPriority;
            higherPriority = Priority.LOW;
            Iterator<Pair<z06<T>, yk90>> it = this.f90895b.iterator();
            while (it.hasNext()) {
                higherPriority = Priority.getHigherPriority(higherPriority, ((yk90) it.next().second).getPriority());
            }
            return higherPriority;
        }

        /* JADX INFO: renamed from: m */
        public void m118253m(dv10<K, T>.C16638a.b bVar) {
            synchronized (this) {
                try {
                    if (this.f90900g != bVar) {
                        return;
                    }
                    this.f90900g = null;
                    this.f90899f = null;
                    m118249i(this.f90896c);
                    this.f90896c = null;
                    m118257q(TriState.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m118254n(dv10<K, T>.C16638a.b bVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f90900g != bVar) {
                        return;
                    }
                    this.f90895b.clear();
                    dv10.this.m118240k(this.f90894a, this);
                    m118249i(this.f90896c);
                    this.f90896c = null;
                    for (Pair<z06<T>, yk90> pair : this.f90895b) {
                        synchronized (pair) {
                            try {
                                ((yk90) pair.second).mo117675n().mo110447i((yk90) pair.second, dv10.this.f90892d, th, null);
                                dr2 dr2Var = this.f90899f;
                                if (dr2Var != null) {
                                    ((yk90) pair.second).mo97950d(dr2Var.getExtras());
                                }
                                ((z06) pair.first).onFailure(th);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public void m118255o(dv10<K, T>.C16638a.b bVar, T t, int i) {
            synchronized (this) {
                try {
                    if (this.f90900g != bVar) {
                        return;
                    }
                    m118249i(this.f90896c);
                    this.f90896c = null;
                    int size = this.f90895b.size();
                    if (ji2.m144948e(i)) {
                        this.f90896c = (T) dv10.this.mo118236g(t);
                        this.f90898e = i;
                    } else {
                        this.f90895b.clear();
                        dv10.this.m118240k(this.f90894a, this);
                    }
                    for (Pair<z06<T>, yk90> pair : this.f90895b) {
                        synchronized (pair) {
                            try {
                                if (ji2.m144947d(i)) {
                                    ((yk90) pair.second).mo117675n().mo110446f((yk90) pair.second, dv10.this.f90892d, null);
                                    dr2 dr2Var = this.f90899f;
                                    if (dr2Var != null) {
                                        ((yk90) pair.second).mo97950d(dr2Var.getExtras());
                                    }
                                    ((yk90) pair.second).mo97949b(dv10.this.f90893e, Integer.valueOf(size));
                                }
                                ((z06) pair.first).mo144954b(t, i);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m118256p(dv10<K, T>.C16638a.b bVar, float f) {
            synchronized (this) {
                try {
                    if (this.f90900g != bVar) {
                        return;
                    }
                    this.f90897d = f;
                    for (Pair<z06<T>, yk90> pair : this.f90895b) {
                        synchronized (pair) {
                            ((z06) pair.first).mo144955c(f);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m118257q(TriState triState) {
            synchronized (this) {
                try {
                    wn80.m207177b(Boolean.valueOf(this.f90899f == null));
                    wn80.m207177b(Boolean.valueOf(this.f90900g == null));
                    if (this.f90895b.isEmpty()) {
                        dv10.this.m118240k(this.f90894a, this);
                        return;
                    }
                    yk90 yk90Var = (yk90) this.f90895b.iterator().next().second;
                    dr2 dr2Var = new dr2(yk90Var.mo117678t(), yk90Var.getId(), yk90Var.mo117675n(), yk90Var.mo117672k(), yk90Var.mo117667I(), m118251k(), m118250j(), m118252l(), yk90Var.mo117674m());
                    this.f90899f = dr2Var;
                    dr2Var.mo97950d(yk90Var.getExtras());
                    if (triState.isSet()) {
                        this.f90899f.mo97949b("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
                    }
                    dv10<K, T>.C16638a.b bVar = new b();
                    this.f90900g = bVar;
                    dv10.this.f90890b.mo8539b(bVar, this.f90899f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: r */
        public final synchronized List<zk90> m118258r() {
            dr2 dr2Var = this.f90899f;
            if (dr2Var == null) {
                return null;
            }
            return dr2Var.m117671j(m118250j());
        }

        /* JADX INFO: renamed from: s */
        public final synchronized List<zk90> m118259s() {
            dr2 dr2Var = this.f90899f;
            if (dr2Var == null) {
                return null;
            }
            return dr2Var.m117673l(m118251k());
        }

        /* JADX INFO: renamed from: t */
        public final synchronized List<zk90> m118260t() {
            dr2 dr2Var = this.f90899f;
            if (dr2Var == null) {
                return null;
            }
            return dr2Var.m117676o(m118252l());
        }
    }

    public dv10(wk90<T> wk90Var, String str, String str2, boolean z) {
        this.f90890b = wk90Var;
        this.f90889a = new HashMap();
        this.f90891c = z;
        this.f90892d = str;
        this.f90893e = str2;
    }

    @Override // p153l.wk90
    /* JADX INFO: renamed from: b */
    public void mo8539b(z06<T> z06Var, yk90 yk90Var) {
        dv10<K, T>.C16638a c16638aM118238i;
        boolean z;
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("MultiplexProducer#produceResults");
            }
            yk90Var.mo117675n().mo110444d(yk90Var, this.f90892d);
            K kMo118239j = mo118239j(yk90Var);
            do {
                synchronized (this) {
                    try {
                        c16638aM118238i = m118238i(kMo118239j);
                        if (c16638aM118238i == null) {
                            c16638aM118238i = m118237h(kMo118239j);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (!c16638aM118238i.m118248h(z06Var, yk90Var));
            if (z) {
                c16638aM118238i.m118257q(TriState.valueOf(yk90Var.mo117666H()));
            }
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
        } catch (Throwable th2) {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract T mo118236g(T t);

    /* JADX INFO: renamed from: h */
    public final synchronized dv10<K, T>.C16638a m118237h(K k) {
        dv10<K, T>.C16638a c16638a;
        c16638a = new C16638a(k);
        this.f90889a.put(k, c16638a);
        return c16638a;
    }

    /* JADX INFO: renamed from: i */
    public synchronized dv10<K, T>.C16638a m118238i(K k) {
        return this.f90889a.get(k);
    }

    /* JADX INFO: renamed from: j */
    public abstract K mo118239j(yk90 yk90Var);

    /* JADX INFO: renamed from: k */
    public synchronized void m118240k(K k, dv10<K, T>.C16638a c16638a) {
        if (this.f90889a.get(k) == c16638a) {
            this.f90889a.remove(k);
        }
    }

    public dv10(wk90<T> wk90Var, String str, String str2) {
        this(wk90Var, str, str2, false);
    }
}
