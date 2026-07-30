package com.tencent.cloud.p080ai.network.okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p153l.mnd0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.s */
/* JADX INFO: loaded from: classes12.dex */
public final class C13933s {

    /* JADX INFO: renamed from: a */
    public final C13858a f57790a;

    /* JADX INFO: renamed from: b */
    public final Proxy f57791b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f57792c;

    public C13933s(C13858a c13858a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c13858a == null) {
            mnd0.m159157a("address == null");
            throw null;
        }
        if (inetSocketAddress == null) {
            mnd0.m159157a("inetSocketAddress == null");
            throw null;
        }
        this.f57790a = c13858a;
        this.f57791b = proxy;
        this.f57792c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public boolean m83064a() {
        return this.f57790a.f57251i != null && this.f57791b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13933s)) {
            return false;
        }
        C13933s c13933s = (C13933s) obj;
        return c13933s.f57790a.equals(this.f57790a) && c13933s.f57791b.equals(this.f57791b) && c13933s.f57792c.equals(this.f57792c);
    }

    public int hashCode() {
        return ((((this.f57790a.hashCode() + 527) * 31) + this.f57791b.hashCode()) * 31) + this.f57792c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f57792c + "}";
    }
}
