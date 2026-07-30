package p153l;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class rtm<T> implements a7h0<i6c<T>> {

    /* JADX INFO: renamed from: a */
    public final List<a7h0<i6c<T>>> f164825a;

    /* JADX INFO: renamed from: b */
    public final boolean f164826b;

    public rtm(List<a7h0<i6c<T>>> list, boolean z) {
        wn80.m207178c(!list.isEmpty(), "List of suppliers is empty!");
        this.f164825a = list;
        this.f164826b = z;
    }

    /* JADX INFO: renamed from: c */
    public static <T> rtm<T> m183126c(List<a7h0<i6c<T>>> list, boolean z) {
        return new rtm<>(list, z);
    }

    @Override // p153l.a7h0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public i6c<T> get() {
        return new C19911a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rtm) {
            return i950.m139074a(this.f164825a, ((rtm) obj).f164825a);
        }
        return false;
    }

    public int hashCode() {
        return this.f164825a.hashCode();
    }

    public String toString() {
        return i950.m139075b(this).m139077b("list", this.f164825a).toString();
    }

    /* JADX INFO: renamed from: l.rtm$a */
    public class C19911a extends AbstractDataSource<T> {

        /* JADX INFO: renamed from: h */
        public ArrayList<i6c<T>> f164827h;

        /* JADX INFO: renamed from: i */
        public int f164828i;

        /* JADX INFO: renamed from: j */
        public int f164829j;

        /* JADX INFO: renamed from: k */
        public AtomicInteger f164830k;

        /* JADX INFO: renamed from: l */
        public Throwable f164831l;

        /* JADX INFO: renamed from: m */
        public Map<String, Object> f164832m;

        public C19911a() {
            if (rtm.this.f164826b) {
                return;
            }
            m183132A();
        }

        /* JADX INFO: renamed from: D */
        private synchronized i6c<T> m183128D() {
            return m183134C(this.f164828i);
        }

        /* JADX INFO: renamed from: z */
        private void m183131z(i6c<T> i6cVar) {
            if (i6cVar != null) {
                i6cVar.close();
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m183132A() {
            if (this.f164830k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f164830k == null) {
                        this.f164830k = new AtomicInteger(0);
                        int size = rtm.this.f164825a.size();
                        this.f164829j = size;
                        this.f164828i = size;
                        this.f164827h = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            i6c<T> i6cVar = (i6c) ((a7h0) rtm.this.f164825a.get(i)).get();
                            this.f164827h.add(i6cVar);
                            i6cVar.mo8237f(new a(i), f94.m124626k());
                            if (i6cVar.mo8232a()) {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: B */
        public final synchronized i6c<T> m183133B(int i) {
            i6c<T> i6cVar;
            ArrayList<i6c<T>> arrayList = this.f164827h;
            i6cVar = null;
            if (arrayList != null && i < arrayList.size()) {
                i6cVar = this.f164827h.set(i, null);
            }
            return i6cVar;
        }

        /* JADX INFO: renamed from: C */
        public final synchronized i6c<T> m183134C(int i) {
            ArrayList<i6c<T>> arrayList;
            arrayList = this.f164827h;
            return (arrayList == null || i >= arrayList.size()) ? null : this.f164827h.get(i);
        }

        /* JADX INFO: renamed from: E */
        public final void m183135E() {
            Throwable th;
            if (this.f164830k.incrementAndGet() != this.f164829j || (th = this.f164831l) == null) {
                return;
            }
            m8246p(th, this.f164832m);
        }

        /* JADX INFO: renamed from: F */
        public final void m183136F(int i, i6c<T> i6cVar, boolean z) {
            synchronized (this) {
                try {
                    int i2 = this.f164828i;
                    if (i6cVar == m183134C(i) && i != this.f164828i) {
                        if (m183128D() == null || (z && i < this.f164828i)) {
                            this.f164828i = i;
                        } else {
                            i = i2;
                        }
                        while (i2 > i) {
                            m183131z(m183133B(i2));
                            i2--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m183137G(int i, i6c<T> i6cVar) {
            m183131z(m183139I(i, i6cVar));
            if (i == 0) {
                this.f164831l = i6cVar.mo8233b();
                this.f164832m = i6cVar.getExtras();
            }
            m183135E();
        }

        /* JADX INFO: renamed from: H */
        public final void m183138H(int i, i6c<T> i6cVar) {
            m183136F(i, i6cVar, i6cVar.mo8236e());
            if (i6cVar == m183128D()) {
                mo8251u(null, i == 0 && i6cVar.mo8236e(), i6cVar.getExtras());
            }
            m183135E();
        }

        /* JADX INFO: renamed from: I */
        public final synchronized i6c<T> m183139I(int i, i6c<T> i6cVar) {
            if (i6cVar == m183128D()) {
                return null;
            }
            if (i6cVar != m183134C(i)) {
                return i6cVar;
            }
            return m183133B(i);
        }

        @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
        /* JADX INFO: renamed from: a */
        public synchronized boolean mo8232a() {
            i6c<T> i6cVarM183128D;
            try {
                if (rtm.this.f164826b) {
                    m183132A();
                }
                i6cVarM183128D = m183128D();
            } catch (Throwable th) {
                throw th;
            }
            return i6cVarM183128D != null && i6cVarM183128D.mo8232a();
        }

        @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
        public boolean close() {
            if (rtm.this.f164826b) {
                m183132A();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<i6c<T>> arrayList = this.f164827h;
                    this.f164827h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        m183131z(arrayList.get(i));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
        public synchronized T getResult() {
            i6c<T> i6cVarM183128D;
            try {
                if (rtm.this.f164826b) {
                    m183132A();
                }
                i6cVarM183128D = m183128D();
            } catch (Throwable th) {
                throw th;
            }
            return i6cVarM183128D != null ? i6cVarM183128D.getResult() : null;
        }

        /* JADX INFO: renamed from: l.rtm$a$a */
        public class a implements s6c<T> {

            /* JADX INFO: renamed from: a */
            public int f164834a;

            public a(int i) {
                this.f164834a = i;
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: a */
            public void mo98342a(i6c<T> i6cVar) {
                if (this.f164834a == 0) {
                    C19911a.this.m8248r(i6cVar.mo8234c());
                }
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: b */
            public void mo98343b(i6c<T> i6cVar) {
                if (i6cVar.mo8232a()) {
                    C19911a.this.m183138H(this.f164834a, i6cVar);
                } else if (i6cVar.mo8236e()) {
                    C19911a.this.m183137G(this.f164834a, i6cVar);
                }
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: d */
            public void mo98345d(i6c<T> i6cVar) {
                C19911a.this.m183137G(this.f164834a, i6cVar);
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: c */
            public void mo98344c(i6c<T> i6cVar) {
            }
        }
    }
}
