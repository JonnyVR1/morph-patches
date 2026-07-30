package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p149l.jfd0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.a */
/* JADX INFO: loaded from: classes13.dex */
public final class C13695a {

    /* JADX INFO: renamed from: a */
    public final C13767p f56395a;

    /* JADX INFO: renamed from: b */
    public final Dns f56396b;

    /* JADX INFO: renamed from: c */
    public final SocketFactory f56397c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13696b f56398d;

    /* JADX INFO: renamed from: e */
    public final List<EnumC13768q> f56399e;

    /* JADX INFO: renamed from: f */
    public final List<C13761j> f56400f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f56401g;

    /* JADX INFO: renamed from: h */
    public final Proxy f56402h;

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory f56403i;

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier f56404j;

    /* JADX INFO: renamed from: k */
    public final C13699e f56405k;

    public C13695a(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C13699e c13699e, InterfaceC13696b interfaceC13696b, Proxy proxy, List<EnumC13768q> list, List<C13761j> list2, ProxySelector proxySelector) {
        this.f56395a = new C13767p.a().m81875c(sSLSocketFactory != null ? "https" : "http").m81874b(str).m81869a(i).m81872a();
        if (dns == null) {
            jfd0.m141176a("dns == null");
            throw null;
        }
        this.f56396b = dns;
        if (socketFactory == null) {
            jfd0.m141176a("socketFactory == null");
            throw null;
        }
        this.f56397c = socketFactory;
        if (interfaceC13696b == null) {
            jfd0.m141176a("proxyAuthenticator == null");
            throw null;
        }
        this.f56398d = interfaceC13696b;
        if (list == null) {
            jfd0.m141176a("protocols == null");
            throw null;
        }
        this.f56399e = C13706c.m81609a(list);
        if (list2 == null) {
            jfd0.m141176a("connectionSpecs == null");
            throw null;
        }
        this.f56400f = C13706c.m81609a(list2);
        if (proxySelector == null) {
            jfd0.m141176a("proxySelector == null");
            throw null;
        }
        this.f56401g = proxySelector;
        this.f56402h = proxy;
        this.f56403i = sSLSocketFactory;
        this.f56404j = hostnameVerifier;
        this.f56405k = c13699e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m81586a(C13695a c13695a) {
        return this.f56396b.equals(c13695a.f56396b) && this.f56398d.equals(c13695a.f56398d) && this.f56399e.equals(c13695a.f56399e) && this.f56400f.equals(c13695a.f56400f) && this.f56401g.equals(c13695a.f56401g) && Objects.equals(this.f56402h, c13695a.f56402h) && Objects.equals(this.f56403i, c13695a.f56403i) && Objects.equals(this.f56404j, c13695a.f56404j) && Objects.equals(this.f56405k, c13695a.f56405k) && this.f56395a.f56913e == c13695a.f56395a.f56913e;
    }

    /* JADX INFO: renamed from: b */
    public C13767p m81587b() {
        return this.f56395a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13695a)) {
            return false;
        }
        C13695a c13695a = (C13695a) obj;
        return this.f56395a.equals(c13695a.f56395a) && m81586a(c13695a);
    }

    public int hashCode() {
        return ((((((((((((((((((this.f56395a.f56916h.hashCode() + 527) * 31) + this.f56396b.hashCode()) * 31) + this.f56398d.hashCode()) * 31) + this.f56399e.hashCode()) * 31) + this.f56400f.hashCode()) * 31) + this.f56401g.hashCode()) * 31) + Objects.hashCode(this.f56402h)) * 31) + Objects.hashCode(this.f56403i)) * 31) + Objects.hashCode(this.f56404j)) * 31) + Objects.hashCode(this.f56405k);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f56395a.f56912d);
        sb.append(":");
        sb.append(this.f56395a.f56913e);
        if (this.f56402h != null) {
            sb.append(", proxy=");
            sb.append(this.f56402h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f56401g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public Proxy m81585a() {
        return this.f56402h;
    }
}
