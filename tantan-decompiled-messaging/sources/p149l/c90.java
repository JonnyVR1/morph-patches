package p149l;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C21832a;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class c90 {

    /* JADX INFO: renamed from: a */
    public final cll f79837a;

    /* JADX INFO: renamed from: b */
    public final a5e f79838b;

    /* JADX INFO: renamed from: c */
    public final SocketFactory f79839c;

    /* JADX INFO: renamed from: d */
    public final vd1 f79840d;

    /* JADX INFO: renamed from: e */
    public final List<Protocol> f79841e;

    /* JADX INFO: renamed from: f */
    public final List<C21832a> f79842f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f79843g;

    /* JADX INFO: renamed from: h */
    public final Proxy f79844h;

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory f79845i;

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier f79846j;

    /* JADX INFO: renamed from: k */
    public final yp4 f79847k;

    public c90(String str, int i, a5e a5eVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, yp4 yp4Var, vd1 vd1Var, Proxy proxy, List<Protocol> list, List<C21832a> list2, ProxySelector proxySelector) {
        this.f79837a = new cll.C16188a().m107552v(sSLSocketFactory != null ? "https" : "http").m107540h(str).m107546o(i).m107537d();
        if (a5eVar == null) {
            jfd0.m141176a("dns == null");
            throw null;
        }
        this.f79838b = a5eVar;
        if (socketFactory == null) {
            jfd0.m141176a("socketFactory == null");
            throw null;
        }
        this.f79839c = socketFactory;
        if (vd1Var == null) {
            jfd0.m141176a("proxyAuthenticator == null");
            throw null;
        }
        this.f79840d = vd1Var;
        if (list == null) {
            jfd0.m141176a("protocols == null");
            throw null;
        }
        this.f79841e = tck0.m188019t(list);
        if (list2 == null) {
            jfd0.m141176a("connectionSpecs == null");
            throw null;
        }
        this.f79842f = tck0.m188019t(list2);
        if (proxySelector == null) {
            jfd0.m141176a("proxySelector == null");
            throw null;
        }
        this.f79843g = proxySelector;
        this.f79844h = proxy;
        this.f79845i = sSLSocketFactory;
        this.f79846j = hostnameVerifier;
        this.f79847k = yp4Var;
    }

    /* JADX INFO: renamed from: a */
    public yp4 m105826a() {
        return this.f79847k;
    }

    /* JADX INFO: renamed from: b */
    public List<C21832a> m105827b() {
        return this.f79842f;
    }

    /* JADX INFO: renamed from: c */
    public a5e m105828c() {
        return this.f79838b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m105829d(c90 c90Var) {
        return this.f79838b.equals(c90Var.f79838b) && this.f79840d.equals(c90Var.f79840d) && this.f79841e.equals(c90Var.f79841e) && this.f79842f.equals(c90Var.f79842f) && this.f79843g.equals(c90Var.f79843g) && Objects.equals(this.f79844h, c90Var.f79844h) && Objects.equals(this.f79845i, c90Var.f79845i) && Objects.equals(this.f79846j, c90Var.f79846j) && Objects.equals(this.f79847k, c90Var.f79847k) && m105837l().m107527y() == c90Var.m105837l().m107527y();
    }

    /* JADX INFO: renamed from: e */
    public HostnameVerifier m105830e() {
        return this.f79846j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return this.f79837a.equals(c90Var.f79837a) && m105829d(c90Var);
    }

    /* JADX INFO: renamed from: f */
    public List<Protocol> m105831f() {
        return this.f79841e;
    }

    /* JADX INFO: renamed from: g */
    public Proxy m105832g() {
        return this.f79844h;
    }

    /* JADX INFO: renamed from: h */
    public vd1 m105833h() {
        return this.f79840d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f79837a.hashCode()) * 31) + this.f79838b.hashCode()) * 31) + this.f79840d.hashCode()) * 31) + this.f79841e.hashCode()) * 31) + this.f79842f.hashCode()) * 31) + this.f79843g.hashCode()) * 31) + Objects.hashCode(this.f79844h)) * 31) + Objects.hashCode(this.f79845i)) * 31) + Objects.hashCode(this.f79846j)) * 31) + Objects.hashCode(this.f79847k);
    }

    /* JADX INFO: renamed from: i */
    public ProxySelector m105834i() {
        return this.f79843g;
    }

    /* JADX INFO: renamed from: j */
    public SocketFactory m105835j() {
        return this.f79839c;
    }

    /* JADX INFO: renamed from: k */
    public SSLSocketFactory m105836k() {
        return this.f79845i;
    }

    /* JADX INFO: renamed from: l */
    public cll m105837l() {
        return this.f79837a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f79837a.m107522m());
        sb.append(":");
        sb.append(this.f79837a.m107527y());
        if (this.f79844h != null) {
            sb.append(", proxy=");
            sb.append(this.f79844h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f79843g);
        }
        sb.append("}");
        return sb.toString();
    }
}
