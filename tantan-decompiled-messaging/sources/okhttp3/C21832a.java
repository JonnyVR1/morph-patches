package okhttp3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p149l.ig3;
import p149l.qkq0;
import p149l.tck0;
import p149l.v35;

/* JADX INFO: renamed from: okhttp3.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C21832a {

    /* JADX INFO: renamed from: e */
    public static final v35[] f205838e;

    /* JADX INFO: renamed from: f */
    public static final v35[] f205839f;

    /* JADX INFO: renamed from: g */
    public static final C21832a f205840g;

    /* JADX INFO: renamed from: h */
    public static final C21832a f205841h;

    /* JADX INFO: renamed from: i */
    public static final C21832a f205842i;

    /* JADX INFO: renamed from: j */
    public static final C21832a f205843j;

    /* JADX INFO: renamed from: a */
    public final boolean f205844a;

    /* JADX INFO: renamed from: b */
    public final boolean f205845b;

    /* JADX INFO: renamed from: c */
    public final String[] f205846c;

    /* JADX INFO: renamed from: d */
    public final String[] f205847d;

    static {
        v35 v35Var = v35.f179717n1;
        v35 v35Var2 = v35.f179720o1;
        v35 v35Var3 = v35.f179723p1;
        v35 v35Var4 = v35.f179676Z0;
        v35 v35Var5 = v35.f179687d1;
        v35 v35Var6 = v35.f179678a1;
        v35 v35Var7 = v35.f179690e1;
        v35 v35Var8 = v35.f179708k1;
        v35 v35Var9 = v35.f179705j1;
        v35[] v35VarArr = {v35Var, v35Var2, v35Var3, v35Var4, v35Var5, v35Var6, v35Var7, v35Var8, v35Var9};
        f205838e = v35VarArr;
        v35[] v35VarArr2 = {v35Var, v35Var2, v35Var3, v35Var4, v35Var5, v35Var6, v35Var7, v35Var8, v35Var9, v35.f179646K0, v35.f179648L0, v35.f179701i0, v35.f179704j0, v35.f179637G, v35.f179645K, v35.f179706k};
        f205839f = v35VarArr2;
        a aVarM221039c = new a(true).m221039c(v35VarArr);
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f205840g = aVarM221039c.m221042f(tlsVersion, tlsVersion2).m221040d(true).m221037a();
        f205841h = new a(true).m221039c(v35VarArr2).m221042f(tlsVersion, tlsVersion2).m221040d(true).m221037a();
        f205842i = new a(true).m221039c(v35VarArr2).m221042f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m221040d(true).m221037a();
        f205843j = new a(false).m221037a();
    }

    public C21832a(a aVar) {
        this.f205844a = aVar.f205848a;
        this.f205846c = aVar.f205849b;
        this.f205847d = aVar.f205850c;
        this.f205845b = aVar.f205851d;
    }

    /* JADX INFO: renamed from: a */
    public void m221030a(SSLSocket sSLSocket, boolean z) {
        C21832a c21832aM221034e = m221034e(sSLSocket, z);
        String[] strArr = c21832aM221034e.f205847d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c21832aM221034e.f205846c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<v35> m221031b() {
        String[] strArr = this.f205846c;
        if (strArr != null) {
            return v35.m196827c(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m221032c(SSLSocket sSLSocket) {
        if (!this.f205844a) {
            return false;
        }
        String[] strArr = this.f205847d;
        if (strArr != null && !tck0.m187989B(tck0.f169459j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f205846c;
        return strArr2 == null || tck0.m187989B(v35.f179679b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* JADX INFO: renamed from: d */
    public boolean m221033d() {
        return this.f205844a;
    }

    /* JADX INFO: renamed from: e */
    public final C21832a m221034e(SSLSocket sSLSocket, boolean z) {
        String[] strArrM188025z = this.f205846c != null ? tck0.m188025z(v35.f179679b, sSLSocket.getEnabledCipherSuites(), this.f205846c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM188025z2 = this.f205847d != null ? tck0.m188025z(tck0.f169459j, sSLSocket.getEnabledProtocols(), this.f205847d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM188022w = tck0.m188022w(v35.f179679b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iM188022w != -1) {
            strArrM188025z = tck0.m188008i(strArrM188025z, supportedCipherSuites[iM188022w]);
        }
        return new a(this).m221038b(strArrM188025z).m221041e(strArrM188025z2).m221037a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C21832a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C21832a c21832a = (C21832a) obj;
        boolean z = this.f205844a;
        if (z != c21832a.f205844a) {
            return false;
        }
        return !z || (Arrays.equals(this.f205846c, c21832a.f205846c) && Arrays.equals(this.f205847d, c21832a.f205847d) && this.f205845b == c21832a.f205845b);
    }

    /* JADX INFO: renamed from: f */
    public boolean m221035f() {
        return this.f205845b;
    }

    /* JADX INFO: renamed from: g */
    public List<TlsVersion> m221036g() {
        String[] strArr = this.f205847d;
        if (strArr != null) {
            return TlsVersion.forJavaNames(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f205844a) {
            return ((((527 + Arrays.hashCode(this.f205846c)) * 31) + Arrays.hashCode(this.f205847d)) * 31) + (!this.f205845b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f205844a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m221031b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m221036g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f205845b + ")";
    }

    /* JADX INFO: renamed from: okhttp3.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f205848a;

        /* JADX INFO: renamed from: b */
        public String[] f205849b;

        /* JADX INFO: renamed from: c */
        public String[] f205850c;

        /* JADX INFO: renamed from: d */
        public boolean f205851d;

        public a(C21832a c21832a) {
            this.f205848a = c21832a.f205844a;
            this.f205849b = c21832a.f205846c;
            this.f205850c = c21832a.f205847d;
            this.f205851d = c21832a.f205845b;
        }

        /* JADX INFO: renamed from: a */
        public C21832a m221037a() {
            return new C21832a(this);
        }

        /* JADX INFO: renamed from: b */
        public a m221038b(String... strArr) {
            if (!this.f205848a) {
                qkq0.m175383a("no cipher suites for cleartext connections");
                return null;
            }
            if (strArr.length != 0) {
                this.f205849b = (String[]) strArr.clone();
                return this;
            }
            ig3.m135964a("At least one cipher suite is required");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public a m221039c(v35... v35VarArr) {
            if (!this.f205848a) {
                qkq0.m175383a("no cipher suites for cleartext connections");
                return null;
            }
            String[] strArr = new String[v35VarArr.length];
            for (int i = 0; i < v35VarArr.length; i++) {
                strArr[i] = v35VarArr[i].f179746a;
            }
            return m221038b(strArr);
        }

        /* JADX INFO: renamed from: d */
        public a m221040d(boolean z) {
            if (this.f205848a) {
                this.f205851d = z;
                return this;
            }
            qkq0.m175383a("no TLS extensions for cleartext connections");
            return null;
        }

        /* JADX INFO: renamed from: e */
        public a m221041e(String... strArr) {
            if (!this.f205848a) {
                qkq0.m175383a("no TLS versions for cleartext connections");
                return null;
            }
            if (strArr.length != 0) {
                this.f205850c = (String[]) strArr.clone();
                return this;
            }
            ig3.m135964a("At least one TLS version is required");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public a m221042f(TlsVersion... tlsVersionArr) {
            if (!this.f205848a) {
                qkq0.m175383a("no TLS versions for cleartext connections");
                return null;
            }
            String[] strArr = new String[tlsVersionArr.length];
            for (int i = 0; i < tlsVersionArr.length; i++) {
                strArr[i] = tlsVersionArr[i].javaName;
            }
            return m221041e(strArr);
        }

        public a(boolean z) {
            this.f205848a = z;
        }
    }
}
