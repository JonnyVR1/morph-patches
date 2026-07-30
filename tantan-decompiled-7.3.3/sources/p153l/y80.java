package p153l;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C21953a;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class y80 {

    /* JADX INFO: renamed from: a */
    public final rnl f197921a;

    /* JADX INFO: renamed from: b */
    public final o6e f197922b;

    /* JADX INFO: renamed from: c */
    public final SocketFactory f197923c;

    /* JADX INFO: renamed from: d */
    public final ce1 f197924d;

    /* JADX INFO: renamed from: e */
    public final List<Protocol> f197925e;

    /* JADX INFO: renamed from: f */
    public final List<C21953a> f197926f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f197927g;

    /* JADX INFO: renamed from: h */
    public final Proxy f197928h;

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory f197929i;

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier f197930j;

    /* JADX INFO: renamed from: k */
    public final xq4 f197931k;

    public y80(String str, int i, o6e o6eVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, xq4 xq4Var, ce1 ce1Var, Proxy proxy, List<Protocol> list, List<C21953a> list2, ProxySelector proxySelector) {
        this.f197921a = new rnl.C19886a().m182316v(sSLSocketFactory != null ? "https" : "http").m182304h(str).m182310o(i).m182301d();
        if (o6eVar == null) {
            mnd0.m159157a("dns == null");
            throw null;
        }
        this.f197922b = o6eVar;
        if (socketFactory == null) {
            mnd0.m159157a("socketFactory == null");
            throw null;
        }
        this.f197923c = socketFactory;
        if (ce1Var == null) {
            mnd0.m159157a("proxyAuthenticator == null");
            throw null;
        }
        this.f197924d = ce1Var;
        if (list == null) {
            mnd0.m159157a("protocols == null");
            throw null;
        }
        this.f197925e = zlk0.m220258t(list);
        if (list2 == null) {
            mnd0.m159157a("connectionSpecs == null");
            throw null;
        }
        this.f197926f = zlk0.m220258t(list2);
        if (proxySelector == null) {
            mnd0.m159157a("proxySelector == null");
            throw null;
        }
        this.f197927g = proxySelector;
        this.f197928h = proxy;
        this.f197929i = sSLSocketFactory;
        this.f197930j = hostnameVerifier;
        this.f197931k = xq4Var;
    }

    /* JADX INFO: renamed from: a */
    public xq4 m214710a() {
        return this.f197931k;
    }

    /* JADX INFO: renamed from: b */
    public List<C21953a> m214711b() {
        return this.f197926f;
    }

    /* JADX INFO: renamed from: c */
    public o6e m214712c() {
        return this.f197922b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m214713d(y80 y80Var) {
        return this.f197922b.equals(y80Var.f197922b) && this.f197924d.equals(y80Var.f197924d) && this.f197925e.equals(y80Var.f197925e) && this.f197926f.equals(y80Var.f197926f) && this.f197927g.equals(y80Var.f197927g) && Objects.equals(this.f197928h, y80Var.f197928h) && Objects.equals(this.f197929i, y80Var.f197929i) && Objects.equals(this.f197930j, y80Var.f197930j) && Objects.equals(this.f197931k, y80Var.f197931k) && m214721l().m182291y() == y80Var.m214721l().m182291y();
    }

    /* JADX INFO: renamed from: e */
    public HostnameVerifier m214714e() {
        return this.f197930j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y80)) {
            return false;
        }
        y80 y80Var = (y80) obj;
        return this.f197921a.equals(y80Var.f197921a) && m214713d(y80Var);
    }

    /* JADX INFO: renamed from: f */
    public List<Protocol> m214715f() {
        return this.f197925e;
    }

    /* JADX INFO: renamed from: g */
    public Proxy m214716g() {
        return this.f197928h;
    }

    /* JADX INFO: renamed from: h */
    public ce1 m214717h() {
        return this.f197924d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f197921a.hashCode()) * 31) + this.f197922b.hashCode()) * 31) + this.f197924d.hashCode()) * 31) + this.f197925e.hashCode()) * 31) + this.f197926f.hashCode()) * 31) + this.f197927g.hashCode()) * 31) + Objects.hashCode(this.f197928h)) * 31) + Objects.hashCode(this.f197929i)) * 31) + Objects.hashCode(this.f197930j)) * 31) + Objects.hashCode(this.f197931k);
    }

    /* JADX INFO: renamed from: i */
    public ProxySelector m214718i() {
        return this.f197927g;
    }

    /* JADX INFO: renamed from: j */
    public SocketFactory m214719j() {
        return this.f197923c;
    }

    /* JADX INFO: renamed from: k */
    public SSLSocketFactory m214720k() {
        return this.f197929i;
    }

    /* JADX INFO: renamed from: l */
    public rnl m214721l() {
        return this.f197921a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f197921a.m182286m());
        sb.append(":");
        sb.append(this.f197921a.m182291y());
        if (this.f197928h != null) {
            sb.append(", proxy=");
            sb.append(this.f197928h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f197927g);
        }
        sb.append("}");
        return sb.toString();
    }
}
