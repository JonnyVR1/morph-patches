package okhttp3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p153l.w45;
import p153l.wg3;
import p153l.wtq0;
import p153l.zlk0;

/* JADX INFO: renamed from: okhttp3.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C21953a {

    /* JADX INFO: renamed from: e */
    public static final w45[] f206767e;

    /* JADX INFO: renamed from: f */
    public static final w45[] f206768f;

    /* JADX INFO: renamed from: g */
    public static final C21953a f206769g;

    /* JADX INFO: renamed from: h */
    public static final C21953a f206770h;

    /* JADX INFO: renamed from: i */
    public static final C21953a f206771i;

    /* JADX INFO: renamed from: j */
    public static final C21953a f206772j;

    /* JADX INFO: renamed from: a */
    public final boolean f206773a;

    /* JADX INFO: renamed from: b */
    public final boolean f206774b;

    /* JADX INFO: renamed from: c */
    public final String[] f206775c;

    /* JADX INFO: renamed from: d */
    public final String[] f206776d;

    static {
        w45 w45Var = w45.f187319n1;
        w45 w45Var2 = w45.f187322o1;
        w45 w45Var3 = w45.f187325p1;
        w45 w45Var4 = w45.f187278Z0;
        w45 w45Var5 = w45.f187289d1;
        w45 w45Var6 = w45.f187280a1;
        w45 w45Var7 = w45.f187292e1;
        w45 w45Var8 = w45.f187310k1;
        w45 w45Var9 = w45.f187307j1;
        w45[] w45VarArr = {w45Var, w45Var2, w45Var3, w45Var4, w45Var5, w45Var6, w45Var7, w45Var8, w45Var9};
        f206767e = w45VarArr;
        w45[] w45VarArr2 = {w45Var, w45Var2, w45Var3, w45Var4, w45Var5, w45Var6, w45Var7, w45Var8, w45Var9, w45.f187248K0, w45.f187250L0, w45.f187303i0, w45.f187306j0, w45.f187239G, w45.f187247K, w45.f187308k};
        f206768f = w45VarArr2;
        a aVarM222306c = new a(true).m222306c(w45VarArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f206769g = aVarM222306c.m222309f(tlsVersion, tlsVersion2).m222307d(true).m222304a();
        f206770h = new a(true).m222306c(w45VarArr2).m222309f(tlsVersion, tlsVersion2).m222307d(true).m222304a();
        f206771i = new a(true).m222306c(w45VarArr2).m222309f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m222307d(true).m222304a();
        f206772j = new a(false).m222304a();
    }

    public C21953a(a aVar) {
        this.f206773a = aVar.f206777a;
        this.f206775c = aVar.f206778b;
        this.f206776d = aVar.f206779c;
        this.f206774b = aVar.f206780d;
    }

    /* JADX INFO: renamed from: a */
    public void m222297a(SSLSocket sSLSocket, boolean z) {
        C21953a c21953aM222301e = m222301e(sSLSocket, z);
        String[] strArr = c21953aM222301e.f206776d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c21953aM222301e.f206775c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<w45> m222298b() {
        String[] strArr = this.f206775c;
        if (strArr != null) {
            return w45.m204820c(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m222299c(SSLSocket sSLSocket) {
        if (!this.f206773a) {
            return false;
        }
        String[] strArr = this.f206776d;
        if (strArr != null && !zlk0.m220228B(zlk0.f204955j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f206775c;
        return strArr2 == null || zlk0.m220228B(w45.f187281b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* JADX INFO: renamed from: d */
    public boolean m222300d() {
        return this.f206773a;
    }

    /* JADX INFO: renamed from: e */
    public final C21953a m222301e(SSLSocket sSLSocket, boolean z) {
        String[] strArrM220264z = this.f206775c != null ? zlk0.m220264z(w45.f187281b, sSLSocket.getEnabledCipherSuites(), this.f206775c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM220264z2 = this.f206776d != null ? zlk0.m220264z(zlk0.f204955j, sSLSocket.getEnabledProtocols(), this.f206776d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM220261w = zlk0.m220261w(w45.f187281b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iM220261w != -1) {
            strArrM220264z = zlk0.m220247i(strArrM220264z, supportedCipherSuites[iM220261w]);
        }
        return new a(this).m222305b(strArrM220264z).m222308e(strArrM220264z2).m222304a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C21953a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C21953a c21953a = (C21953a) obj;
        boolean z = this.f206773a;
        if (z != c21953a.f206773a) {
            return false;
        }
        return !z || (Arrays.equals(this.f206775c, c21953a.f206775c) && Arrays.equals(this.f206776d, c21953a.f206776d) && this.f206774b == c21953a.f206774b);
    }

    /* JADX INFO: renamed from: f */
    public boolean m222302f() {
        return this.f206774b;
    }

    /* JADX INFO: renamed from: g */
    public List<TlsVersion> m222303g() {
        String[] strArr = this.f206776d;
        if (strArr != null) {
            return TlsVersion.forJavaNames(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f206773a) {
            return ((((527 + Arrays.hashCode(this.f206775c)) * 31) + Arrays.hashCode(this.f206776d)) * 31) + (!this.f206774b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f206773a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m222298b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m222303g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f206774b + ")";
    }

    /* JADX INFO: renamed from: okhttp3.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f206777a;

        /* JADX INFO: renamed from: b */
        public String[] f206778b;

        /* JADX INFO: renamed from: c */
        public String[] f206779c;

        /* JADX INFO: renamed from: d */
        public boolean f206780d;

        public a(C21953a c21953a) {
            this.f206777a = c21953a.f206773a;
            this.f206778b = c21953a.f206775c;
            this.f206779c = c21953a.f206776d;
            this.f206780d = c21953a.f206774b;
        }

        /* JADX INFO: renamed from: a */
        public C21953a m222304a() {
            return new C21953a(this);
        }

        /* JADX INFO: renamed from: b */
        public a m222305b(String... strArr) {
            if (!this.f206777a) {
                wtq0.m207906a("no cipher suites for cleartext connections");
                return null;
            }
            if (strArr.length != 0) {
                this.f206778b = (String[]) strArr.clone();
                return this;
            }
            wg3.m206174a("At least one cipher suite is required");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public a m222306c(w45... w45VarArr) {
            if (!this.f206777a) {
                wtq0.m207906a("no cipher suites for cleartext connections");
                return null;
            }
            String[] strArr = new String[w45VarArr.length];
            for (int i = 0; i < w45VarArr.length; i++) {
                strArr[i] = w45VarArr[i].f187348a;
            }
            return m222305b(strArr);
        }

        /* JADX INFO: renamed from: d */
        public a m222307d(boolean z) {
            if (this.f206777a) {
                this.f206780d = z;
                return this;
            }
            wtq0.m207906a("no TLS extensions for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public a m222308e(String... strArr) {
            if (!this.f206777a) {
                wtq0.m207906a("no TLS versions for cleartext connections");
                return null;
            }
            if (strArr.length != 0) {
                this.f206779c = (String[]) strArr.clone();
                return this;
            }
            wg3.m206174a("At least one TLS version is required");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public a m222309f(TlsVersion... tlsVersionArr) {
            if (!this.f206777a) {
                wtq0.m207906a("no TLS versions for cleartext connections");
                return null;
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            return m222308e(strArr);
        }

        public a(boolean z) {
            this.f206777a = z;
        }
    }
}
