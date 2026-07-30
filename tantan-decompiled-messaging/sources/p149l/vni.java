package p149l;

import com.facebook.datasource.AbstractDataSource;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vni<T> implements syg0<c5c<T>> {

    /* JADX INFO: renamed from: a */
    public final List<syg0<c5c<T>>> f182247a;

    public vni(List<syg0<c5c<T>>> list) {
        rf80.m179112c(!list.isEmpty(), "List of suppliers is empty!");
        this.f182247a = list;
    }

    /* JADX INFO: renamed from: b */
    public static <T> vni<T> m199017b(List<syg0<c5c<T>>> list) {
        return new vni<>(list);
    }

    @Override // p149l.syg0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c5c<T> get() {
        return new C20669a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vni) {
            return t050.m186814a(this.f182247a, ((vni) obj).f182247a);
        }
        return false;
    }

    public int hashCode() {
        return this.f182247a.hashCode();
    }

    public String toString() {
        return t050.m186815b(this).m186817b("list", this.f182247a).toString();
    }

    /* JADX INFO: renamed from: l.vni$a */
    public class C20669a extends AbstractDataSource<T> {

        /* JADX INFO: renamed from: h */
        public int f182248h = 0;

        /* JADX INFO: renamed from: i */
        public c5c<T> f182249i = null;

        /* JADX INFO: renamed from: j */
        public c5c<T> f182250j = null;

        public C20669a() {
            if (m199028H()) {
                return;
            }
            mo8191o(new RuntimeException("No data source supplier or supplier returned null."));
        }

        /* JADX INFO: renamed from: A */
        public final void m199021A(c5c<T> c5cVar) {
            if (c5cVar != null) {
                c5cVar.close();
            }
        }

        /* JADX INFO: renamed from: B */
        public final synchronized c5c<T> m199022B() {
            return this.f182250j;
        }

        /* JADX INFO: renamed from: C */
        public final synchronized syg0<c5c<T>> m199023C() {
            if (m8186j() || this.f182248h >= vni.this.f182247a.size()) {
                return null;
            }
            List list = vni.this.f182247a;
            int i = this.f182248h;
            this.f182248h = i + 1;
            return (syg0) list.get(i);
        }

        /* JADX INFO: renamed from: D */
        public final void m199024D(c5c<T> c5cVar, boolean z) {
            c5c<T> c5cVar2;
            synchronized (this) {
                if (c5cVar == this.f182249i && c5cVar != (c5cVar2 = this.f182250j)) {
                    if (c5cVar2 == null || z) {
                        this.f182250j = c5cVar;
                    } else {
                        c5cVar2 = null;
                    }
                    m199021A(c5cVar2);
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final void m199025E(c5c<T> c5cVar) {
            if (m199029z(c5cVar)) {
                if (c5cVar != m199022B()) {
                    m199021A(c5cVar);
                }
                if (m199028H()) {
                    return;
                }
                m8192p(c5cVar.mo8179b(), c5cVar.getExtras());
            }
        }

        /* JADX INFO: renamed from: F */
        public final void m199026F(c5c<T> c5cVar) {
            m199024D(c5cVar, c5cVar.mo8182e());
            if (c5cVar == m199022B()) {
                mo8197u(null, c5cVar.mo8182e(), c5cVar.getExtras());
            }
        }

        /* JADX INFO: renamed from: G */
        public final synchronized boolean m199027G(c5c<T> c5cVar) {
            if (m8186j()) {
                return false;
            }
            this.f182249i = c5cVar;
            return true;
        }

        /* JADX INFO: renamed from: H */
        public final boolean m199028H() {
            syg0<c5c<T>> syg0VarM199023C = m199023C();
            c5c<T> c5cVar = syg0VarM199023C != null ? syg0VarM199023C.get() : null;
            if (!m199027G(c5cVar) || c5cVar == null) {
                m199021A(c5cVar);
                return false;
            }
            c5cVar.mo8183f(new a(), g84.m124744k());
            return true;
        }

        @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
        /* JADX INFO: renamed from: a */
        public synchronized boolean mo8178a() {
            c5c<T> c5cVarM199022B;
            c5cVarM199022B = m199022B();
            return c5cVarM199022B != null && c5cVarM199022B.mo8178a();
        }

        @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    c5c<T> c5cVar = this.f182249i;
                    this.f182249i = null;
                    c5c<T> c5cVar2 = this.f182250j;
                    this.f182250j = null;
                    m199021A(c5cVar2);
                    m199021A(c5cVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
        public synchronized T getResult() {
            c5c<T> c5cVarM199022B;
            c5cVarM199022B = m199022B();
            return c5cVarM199022B != null ? c5cVarM199022B.getResult() : null;
        }

        /* JADX INFO: renamed from: z */
        public final synchronized boolean m199029z(c5c<T> c5cVar) {
            if (!m8186j() && c5cVar == this.f182249i) {
                this.f182249i = null;
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: l.vni$a$a */
        public class a implements m5c<T> {
            public a() {
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: a */
            public void mo129617a(c5c<T> c5cVar) {
                C20669a.this.m8194r(Math.max(C20669a.this.mo8180c(), c5cVar.mo8180c()));
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: b */
            public void mo153133b(c5c<T> c5cVar) {
                if (c5cVar.mo8178a()) {
                    C20669a.this.m199026F(c5cVar);
                } else if (c5cVar.mo8182e()) {
                    C20669a.this.m199025E(c5cVar);
                }
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: d */
            public void mo153135d(c5c<T> c5cVar) {
                C20669a.this.m199025E(c5cVar);
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: c */
            public void mo153134c(c5c<T> c5cVar) {
            }
        }
    }
}
