package p149l;

import com.facebook.datasource.AbstractDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class prm<T> implements syg0<c5c<T>> {

    /* JADX INFO: renamed from: a */
    public final List<syg0<c5c<T>>> f150924a;

    /* JADX INFO: renamed from: b */
    public final boolean f150925b;

    public prm(List<syg0<c5c<T>>> list, boolean z) {
        rf80.m179112c(!list.isEmpty(), "List of suppliers is empty!");
        this.f150924a = list;
        this.f150925b = z;
    }

    /* JADX INFO: renamed from: c */
    public static <T> prm<T> m171025c(List<syg0<c5c<T>>> list, boolean z) {
        return new prm<>(list, z);
    }

    @Override // p149l.syg0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c5c<T> get() {
        return new C19320a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof prm) {
            return t050.m186814a(this.f150924a, ((prm) obj).f150924a);
        }
        return false;
    }

    public int hashCode() {
        return this.f150924a.hashCode();
    }

    public String toString() {
        return t050.m186815b(this).m186817b("list", this.f150924a).toString();
    }

    /* JADX INFO: renamed from: l.prm$a */
    public class C19320a extends AbstractDataSource<T> {

        /* JADX INFO: renamed from: h */
        public ArrayList<c5c<T>> f150926h;

        /* JADX INFO: renamed from: i */
        public int f150927i;

        /* JADX INFO: renamed from: j */
        public int f150928j;

        /* JADX INFO: renamed from: k */
        public AtomicInteger f150929k;

        /* JADX INFO: renamed from: l */
        public Throwable f150930l;

        /* JADX INFO: renamed from: m */
        public Map<String, Object> f150931m;

        public C19320a() {
            if (prm.this.f150925b) {
                return;
            }
            m171031A();
        }

        /* JADX INFO: renamed from: D */
        private synchronized c5c<T> m171027D() {
            return m171033C(this.f150927i);
        }

        /* JADX INFO: renamed from: z */
        private void m171030z(c5c<T> c5cVar) {
            if (c5cVar != null) {
                c5cVar.close();
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m171031A() {
            if (this.f150929k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f150929k == null) {
                        this.f150929k = new AtomicInteger(0);
                        int size = prm.this.f150924a.size();
                        this.f150928j = size;
                        this.f150927i = size;
                        this.f150926h = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            c5c<T> c5cVar = (c5c) ((syg0) prm.this.f150924a.get(i)).get();
                            this.f150926h.add(c5cVar);
                            c5cVar.mo8183f(new a(i), g84.m124744k());
                            if (c5cVar.mo8178a()) {
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
        public final synchronized c5c<T> m171032B(int i) {
            c5c<T> c5cVar;
            ArrayList<c5c<T>> arrayList = this.f150926h;
            c5cVar = null;
            if (arrayList != null && i < arrayList.size()) {
                c5cVar = this.f150926h.set(i, null);
            }
            return c5cVar;
        }

        /* JADX INFO: renamed from: C */
        public final synchronized c5c<T> m171033C(int i) {
            ArrayList<c5c<T>> arrayList;
            arrayList = this.f150926h;
            return (arrayList == null || i >= arrayList.size()) ? null : this.f150926h.get(i);
        }

        /* JADX INFO: renamed from: E */
        public final void m171034E() {
            Throwable th;
            if (this.f150929k.incrementAndGet() != this.f150928j || (th = this.f150930l) == null) {
                return;
            }
            m8192p(th, this.f150931m);
        }

        /* JADX INFO: renamed from: F */
        public final void m171035F(int i, c5c<T> c5cVar, boolean z) {
            synchronized (this) {
                try {
                    int i2 = this.f150927i;
                    if (c5cVar == m171033C(i) && i != this.f150927i) {
                        if (m171027D() == null || (z && i < this.f150927i)) {
                            this.f150927i = i;
                        } else {
                            i = i2;
                        }
                        while (i2 > i) {
                            m171030z(m171032B(i2));
                            i2--;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m171036G(int i, c5c<T> c5cVar) {
            m171030z(m171038I(i, c5cVar));
            if (i == 0) {
                this.f150930l = c5cVar.mo8179b();
                this.f150931m = c5cVar.getExtras();
            }
            m171034E();
        }

        /* JADX INFO: renamed from: H */
        public final void m171037H(int i, c5c<T> c5cVar) {
            m171035F(i, c5cVar, c5cVar.mo8182e());
            if (c5cVar == m171027D()) {
                mo8197u(null, i == 0 && c5cVar.mo8182e(), c5cVar.getExtras());
            }
            m171034E();
        }

        /* JADX INFO: renamed from: I */
        public final synchronized c5c<T> m171038I(int i, c5c<T> c5cVar) {
            if (c5cVar == m171027D()) {
                return null;
            }
            if (c5cVar != m171033C(i)) {
                return c5cVar;
            }
            return m171032B(i);
        }

        @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
        /* JADX INFO: renamed from: a */
        public synchronized boolean mo8178a() {
            c5c<T> c5cVarM171027D;
            try {
                if (prm.this.f150925b) {
                    m171031A();
                }
                c5cVarM171027D = m171027D();
            } catch (Throwable th) {
                throw th;
            }
            return c5cVarM171027D != null && c5cVarM171027D.mo8178a();
        }

        @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
        public boolean close() {
            if (prm.this.f150925b) {
                m171031A();
            }
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<c5c<T>> arrayList = this.f150926h;
                    this.f150926h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        m171030z(arrayList.get(i));
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
        public synchronized T getResult() {
            c5c<T> c5cVarM171027D;
            try {
                if (prm.this.f150925b) {
                    m171031A();
                }
                c5cVarM171027D = m171027D();
            } catch (Throwable th) {
                throw th;
            }
            return c5cVarM171027D != null ? c5cVarM171027D.getResult() : null;
        }

        /* JADX INFO: renamed from: l.prm$a$a */
        public class a implements m5c<T> {

            /* JADX INFO: renamed from: a */
            public int f150933a;

            public a(int i) {
                this.f150933a = i;
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: a */
            public void mo129617a(c5c<T> c5cVar) {
                if (this.f150933a == 0) {
                    C19320a.this.m8194r(c5cVar.mo8180c());
                }
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: b */
            public void mo153133b(c5c<T> c5cVar) {
                if (c5cVar.mo8178a()) {
                    C19320a.this.m171037H(this.f150933a, c5cVar);
                } else if (c5cVar.mo8182e()) {
                    C19320a.this.m171036G(this.f150933a, c5cVar);
                }
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: d */
            public void mo153135d(c5c<T> c5cVar) {
                C19320a.this.m171036G(this.f150933a, c5cVar);
            }

            @Override // p149l.m5c
            /* JADX INFO: renamed from: c */
            public void mo153134c(c5c<T> c5cVar) {
            }
        }
    }
}
