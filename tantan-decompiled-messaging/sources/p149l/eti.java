package p149l;

import com.google.android.exoplayer2.extractor.flv.C1864a;
import com.google.android.exoplayer2.extractor.flv.C1865b;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class eti implements sqf {

    /* JADX INFO: renamed from: q */
    public static final xqf f93126q = new xqf() { // from class: l.dti
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return eti.m118110c();
        }
    };

    /* JADX INFO: renamed from: f */
    public uqf f93132f;

    /* JADX INFO: renamed from: h */
    public boolean f93134h;

    /* JADX INFO: renamed from: i */
    public long f93135i;

    /* JADX INFO: renamed from: j */
    public int f93136j;

    /* JADX INFO: renamed from: k */
    public int f93137k;

    /* JADX INFO: renamed from: l */
    public int f93138l;

    /* JADX INFO: renamed from: m */
    public long f93139m;

    /* JADX INFO: renamed from: n */
    public boolean f93140n;

    /* JADX INFO: renamed from: o */
    public C1864a f93141o;

    /* JADX INFO: renamed from: p */
    public C1865b f93142p;

    /* JADX INFO: renamed from: a */
    public final d860 f93127a = new d860(4);

    /* JADX INFO: renamed from: b */
    public final d860 f93128b = new d860(9);

    /* JADX INFO: renamed from: c */
    public final d860 f93129c = new d860(11);

    /* JADX INFO: renamed from: d */
    public final d860 f93130d = new d860();

    /* JADX INFO: renamed from: e */
    public final r5e0 f93131e = new r5e0();

    /* JADX INFO: renamed from: g */
    public int f93133g = 1;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m118110c() {
        return new sqf[]{new eti()};
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        if (j == 0) {
            this.f93133g = 1;
            this.f93134h = false;
        } else {
            this.f93133g = 3;
        }
        this.f93136j = 0;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f93132f = uqfVar;
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: d */
    public final void m118111d() {
        if (this.f93140n) {
            return;
        }
        this.f93132f.mo11370k(new hce0.C17275b(-9223372036854775807L));
        this.f93140n = true;
    }

    /* JADX INFO: renamed from: e */
    public final long m118112e() {
        if (this.f93134h) {
            return this.f93135i + this.f93139m;
        }
        if (this.f93131e.m177940d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f93139m;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        tqfVar.mo150655f(this.f93127a.m110299e(), 0, 3);
        this.f93127a.m110292U(0);
        if (this.f93127a.m110282K() != 4607062) {
            return false;
        }
        tqfVar.mo150655f(this.f93127a.m110299e(), 0, 2);
        this.f93127a.m110292U(0);
        if ((this.f93127a.m110285N() & 250) != 0) {
            return false;
        }
        tqfVar.mo150655f(this.f93127a.m110299e(), 0, 4);
        this.f93127a.m110292U(0);
        int iM110311q = this.f93127a.m110311q();
        tqfVar.mo150657h();
        tqfVar.mo150660m(iM110311q);
        tqfVar.mo150655f(this.f93127a.m110299e(), 0, 4);
        this.f93127a.m110292U(0);
        return this.f93127a.m110311q() == 0;
    }

    /* JADX INFO: renamed from: g */
    public final d860 m118113g(tqf tqfVar) throws IOException {
        int i = this.f93138l;
        int iM110296b = this.f93130d.m110296b();
        d860 d860Var = this.f93130d;
        if (i > iM110296b) {
            d860Var.m110290S(new byte[Math.max(d860Var.m110296b() * 2, this.f93138l)], 0);
        } else {
            d860Var.m110292U(0);
        }
        this.f93130d.m110291T(this.f93138l);
        tqfVar.readFully(this.f93130d.m110299e(), 0, this.f93138l);
        return this.f93130d;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        p11.m167015i(this.f93132f);
        while (true) {
            int i = this.f93133g;
            if (i != 1) {
                if (i == 2) {
                    m118117l(tqfVar);
                } else if (i != 3) {
                    if (i != 4) {
                        ohg0.m164364a();
                        return 0;
                    }
                    if (m118115j(tqfVar)) {
                        return 0;
                    }
                } else if (!m118116k(tqfVar)) {
                    return -1;
                }
            } else if (!m118114i(tqfVar)) {
                return -1;
            }
        }
    }

    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: i */
    public final boolean m118114i(tqf tqfVar) throws IOException {
        if (!tqfVar.mo150653c(this.f93128b.m110299e(), 0, 9, true)) {
            return false;
        }
        this.f93128b.m110292U(0);
        this.f93128b.m110293V(4);
        int iM110279H = this.f93128b.m110279H();
        boolean z = (iM110279H & 4) != 0;
        boolean z2 = (iM110279H & 1) != 0;
        if (z && this.f93141o == null) {
            this.f93141o = new C1864a(this.f93132f.mo11362b(8, 1));
        }
        if (z2 && this.f93142p == null) {
            this.f93142p = new C1865b(this.f93132f.mo11362b(9, 2));
        }
        this.f93132f.mo11371l();
        this.f93136j = this.f93128b.m110311q() - 5;
        this.f93133g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @RequiresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: j */
    public final boolean m118115j(tqf tqfVar) throws IOException {
        boolean zM9981a;
        boolean z;
        long j;
        long jM118112e = m118112e();
        int i = this.f93137k;
        if (i == 8 && this.f93141o != null) {
            m118111d();
            zM9981a = this.f93141o.m9981a(m118113g(tqfVar), jM118112e);
        } else {
            if (i != 9 || this.f93142p == null) {
                if (i != 18 || this.f93140n) {
                    tqfVar.mo150661o(this.f93138l);
                    zM9981a = false;
                    z = false;
                } else {
                    zM9981a = this.f93131e.m9981a(m118113g(tqfVar), jM118112e);
                    long jM177940d = this.f93131e.m177940d();
                    if (jM177940d != -9223372036854775807L) {
                        this.f93132f.mo11370k(new wrm(this.f93131e.m177941e(), this.f93131e.m177942f(), jM177940d));
                        this.f93140n = true;
                    }
                }
                if (!this.f93134h && zM9981a) {
                    this.f93134h = true;
                    if (this.f93131e.m177940d() == -9223372036854775807L) {
                        j = -this.f93139m;
                    } else {
                        j = 0;
                    }
                    this.f93135i = j;
                }
                this.f93136j = 4;
                this.f93133g = 2;
                return z;
            }
            m118111d();
            zM9981a = this.f93142p.m9981a(m118113g(tqfVar), jM118112e);
        }
        z = true;
        if (!this.f93134h) {
            this.f93134h = true;
            if (this.f93131e.m177940d() == -9223372036854775807L) {
                j = -this.f93139m;
            } else {
                j = 0;
            }
            this.f93135i = j;
        }
        this.f93136j = 4;
        this.f93133g = 2;
        return z;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m118116k(tqf tqfVar) throws IOException {
        if (!tqfVar.mo150653c(this.f93129c.m110299e(), 0, 11, true)) {
            return false;
        }
        this.f93129c.m110292U(0);
        this.f93137k = this.f93129c.m110279H();
        this.f93138l = this.f93129c.m110282K();
        this.f93139m = this.f93129c.m110282K();
        this.f93139m = (((long) (this.f93129c.m110279H() << 24)) | this.f93139m) * 1000;
        this.f93129c.m110293V(3);
        this.f93133g = 4;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m118117l(tqf tqfVar) throws IOException {
        tqfVar.mo150661o(this.f93136j);
        this.f93136j = 0;
        this.f93133g = 3;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
