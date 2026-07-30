package p153l;

import com.facebook.datasource.AbstractDataSource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rqi<T> implements a7h0<i6c<T>> {

    /* JADX INFO: renamed from: a */
    public final List<a7h0<i6c<T>>> f164489a;

    public rqi(List<a7h0<i6c<T>>> list) {
        wn80.m207178c(!list.isEmpty(), "List of suppliers is empty!");
        this.f164489a = list;
    }

    /* JADX INFO: renamed from: b */
    public static <T> rqi<T> m182625b(List<a7h0<i6c<T>>> list) {
        return new rqi<>(list);
    }

    @Override // p153l.a7h0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i6c<T> get() {
        return new C19899a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqi) {
            return i950.m139074a(this.f164489a, ((rqi) obj).f164489a);
        }
        return false;
    }

    public int hashCode() {
        return this.f164489a.hashCode();
    }

    public String toString() {
        return i950.m139075b(this).m139077b("list", this.f164489a).toString();
    }

    /* JADX INFO: renamed from: l.rqi$a */
    public class C19899a extends AbstractDataSource<T> {

        /* JADX INFO: renamed from: h */
        public int f164490h = 0;

        /* JADX INFO: renamed from: i */
        public i6c<T> f164491i = null;

        /* JADX INFO: renamed from: j */
        public i6c<T> f164492j = null;

        public C19899a() {
            if (m182636H()) {
                return;
            }
            mo8245o(new RuntimeException("No data source supplier or supplier returned null."));
        }

        /* JADX INFO: renamed from: A */
        public final void m182629A(i6c<T> i6cVar) {
            if (i6cVar != null) {
                i6cVar.close();
            }
        }

        /* JADX INFO: renamed from: B */
        public final synchronized i6c<T> m182630B() {
            return this.f164492j;
        }

        /* JADX INFO: renamed from: C */
        public final synchronized a7h0<i6c<T>> m182631C() {
            if (m8240j() || this.f164490h >= rqi.this.f164489a.size()) {
                return null;
            }
            List list = rqi.this.f164489a;
            int i = this.f164490h;
            this.f164490h = i + 1;
            return (a7h0) list.get(i);
        }

        /* JADX INFO: renamed from: D */
        public final void m182632D(i6c<T> i6cVar, boolean z) {
            i6c<T> i6cVar2;
            synchronized (this) {
                if (i6cVar == this.f164491i && i6cVar != (i6cVar2 = this.f164492j)) {
                    if (i6cVar2 == null || z) {
                        this.f164492j = i6cVar;
                    } else {
                        i6cVar2 = null;
                    }
                    m182629A(i6cVar2);
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final void m182633E(i6c<T> i6cVar) {
            if (m182637z(i6cVar)) {
                if (i6cVar != m182630B()) {
                    m182629A(i6cVar);
                }
                if (m182636H()) {
                    return;
                }
                m8246p(i6cVar.mo8233b(), i6cVar.getExtras());
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m182634F(i6c<T> i6cVar) {
            m182632D(i6cVar, i6cVar.mo8236e());
            if (i6cVar == m182630B()) {
                mo8251u(null, i6cVar.mo8236e(), i6cVar.getExtras());
            }
        }

        /* JADX INFO: renamed from: G */
        public final synchronized boolean m182635G(i6c<T> i6cVar) {
            if (m8240j()) {
                return false;
            }
            this.f164491i = i6cVar;
            return true;
        }

        /* JADX INFO: renamed from: H */
        public final boolean m182636H() {
            a7h0<i6c<T>> a7h0VarM182631C = m182631C();
            i6c<T> i6cVar = a7h0VarM182631C != null ? a7h0VarM182631C.get() : null;
            if (!m182635G(i6cVar) || i6cVar == null) {
                m182629A(i6cVar);
                return false;
            }
            i6cVar.mo8237f(new a(), f94.m124626k());
            return true;
        }

        @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
        /* JADX INFO: renamed from: a */
        public synchronized boolean mo8232a() {
            i6c<T> i6cVarM182630B;
            i6cVarM182630B = m182630B();
            return i6cVarM182630B != null && i6cVarM182630B.mo8232a();
        }

        @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    i6c<T> i6cVar = this.f164491i;
                    this.f164491i = null;
                    i6c<T> i6cVar2 = this.f164492j;
                    this.f164492j = null;
                    m182629A(i6cVar2);
                    m182629A(i6cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
        public synchronized T getResult() {
            i6c<T> i6cVarM182630B;
            i6cVarM182630B = m182630B();
            return i6cVarM182630B != null ? i6cVarM182630B.getResult() : null;
        }

        /* JADX INFO: renamed from: z */
        public final synchronized boolean m182637z(i6c<T> i6cVar) {
            if (!m8240j() && i6cVar == this.f164491i) {
                this.f164491i = null;
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: l.rqi$a$a */
        public class a implements s6c<T> {
            public a() {
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: a */
            public void mo98342a(i6c<T> i6cVar) {
                C19899a.this.m8248r(Math.max(C19899a.this.mo8234c(), i6cVar.mo8234c()));
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: b */
            public void mo98343b(i6c<T> i6cVar) {
                if (i6cVar.mo8232a()) {
                    C19899a.this.m182634F(i6cVar);
                } else if (i6cVar.mo8236e()) {
                    C19899a.this.m182633E(i6cVar);
                }
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: d */
            public void mo98345d(i6c<T> i6cVar) {
                C19899a.this.m182633E(i6cVar);
            }

            @Override // p153l.s6c
            /* JADX INFO: renamed from: c */
            public void mo98344c(i6c<T> i6cVar) {
            }
        }
    }
}
