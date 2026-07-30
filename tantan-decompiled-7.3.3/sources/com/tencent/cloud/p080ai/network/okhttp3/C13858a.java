package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p153l.mnd0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.a */
/* JADX INFO: loaded from: classes12.dex */
public final class C13858a {

    /* JADX INFO: renamed from: a */
    public final C13930p f57243a;

    /* JADX INFO: renamed from: b */
    public final Dns f57244b;

    /* JADX INFO: renamed from: c */
    public final SocketFactory f57245c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13859b f57246d;

    /* JADX INFO: renamed from: e */
    public final List<EnumC13931q> f57247e;

    /* JADX INFO: renamed from: f */
    public final List<C13924j> f57248f;

    /* JADX INFO: renamed from: g */
    public final ProxySelector f57249g;

    /* JADX INFO: renamed from: h */
    public final Proxy f57250h;

    /* JADX INFO: renamed from: i */
    public final SSLSocketFactory f57251i;

    /* JADX INFO: renamed from: j */
    public final HostnameVerifier f57252j;

    /* JADX INFO: renamed from: k */
    public final C13862e f57253k;

    public C13858a(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C13862e c13862e, InterfaceC13859b interfaceC13859b, Proxy proxy, List<EnumC13931q> list, List<C13924j> list2, ProxySelector proxySelector) {
        this.f57243a = new C13930p.a().m83058c(sSLSocketFactory != null ? "https" : "http").m83057b(str).m83052a(i).m83055a();
        if (dns == null) {
            mnd0.m159157a("dns == null");
            throw null;
        }
        this.f57244b = dns;
        if (socketFactory == null) {
            mnd0.m159157a("socketFactory == null");
            throw null;
        }
        this.f57245c = socketFactory;
        if (interfaceC13859b == null) {
            mnd0.m159157a("proxyAuthenticator == null");
            throw null;
        }
        this.f57246d = interfaceC13859b;
        if (list == null) {
            mnd0.m159157a("protocols == null");
            throw null;
        }
        this.f57247e = C13869c.m82792a(list);
        if (list2 == null) {
            mnd0.m159157a("connectionSpecs == null");
            throw null;
        }
        this.f57248f = C13869c.m82792a(list2);
        if (proxySelector == null) {
            mnd0.m159157a("proxySelector == null");
            throw null;
        }
        this.f57249g = proxySelector;
        this.f57250h = proxy;
        this.f57251i = sSLSocketFactory;
        this.f57252j = hostnameVerifier;
        this.f57253k = c13862e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m82769a(C13858a c13858a) {
        return this.f57244b.equals(c13858a.f57244b) && this.f57246d.equals(c13858a.f57246d) && this.f57247e.equals(c13858a.f57247e) && this.f57248f.equals(c13858a.f57248f) && this.f57249g.equals(c13858a.f57249g) && Objects.equals(this.f57250h, c13858a.f57250h) && Objects.equals(this.f57251i, c13858a.f57251i) && Objects.equals(this.f57252j, c13858a.f57252j) && Objects.equals(this.f57253k, c13858a.f57253k) && this.f57243a.f57761e == c13858a.f57243a.f57761e;
    }

    /* JADX INFO: renamed from: b */
    public C13930p m82770b() {
        return this.f57243a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13858a)) {
            return false;
        }
        C13858a c13858a = (C13858a) obj;
        return this.f57243a.equals(c13858a.f57243a) && m82769a(c13858a);
    }

    public int hashCode() {
        return ((((((((((((((((((this.f57243a.f57764h.hashCode() + 527) * 31) + this.f57244b.hashCode()) * 31) + this.f57246d.hashCode()) * 31) + this.f57247e.hashCode()) * 31) + this.f57248f.hashCode()) * 31) + this.f57249g.hashCode()) * 31) + Objects.hashCode(this.f57250h)) * 31) + Objects.hashCode(this.f57251i)) * 31) + Objects.hashCode(this.f57252j)) * 31) + Objects.hashCode(this.f57253k);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f57243a.f57760d);
        sb.append(":");
        sb.append(this.f57243a.f57761e);
        if (this.f57250h != null) {
            sb.append(", proxy=");
            sb.append(this.f57250h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f57249g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public Proxy m82768a() {
        return this.f57250h;
    }
}
