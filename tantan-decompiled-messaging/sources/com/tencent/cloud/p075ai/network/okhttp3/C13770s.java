package com.tencent.cloud.p075ai.network.okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p149l.jfd0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.s */
/* JADX INFO: loaded from: classes13.dex */
public final class C13770s {

    /* JADX INFO: renamed from: a */
    public final C13695a f56942a;

    /* JADX INFO: renamed from: b */
    public final Proxy f56943b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f56944c;

    public C13770s(C13695a c13695a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c13695a == null) {
            jfd0.m141176a("address == null");
            throw null;
        }
        if (inetSocketAddress == null) {
            jfd0.m141176a("inetSocketAddress == null");
            throw null;
        }
        this.f56942a = c13695a;
        this.f56943b = proxy;
        this.f56944c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public boolean m81881a() {
        return this.f56942a.f56403i != null && this.f56943b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13770s)) {
            return false;
        }
        C13770s c13770s = (C13770s) obj;
        return c13770s.f56942a.equals(this.f56942a) && c13770s.f56943b.equals(this.f56943b) && c13770s.f56944c.equals(this.f56944c);
    }

    public int hashCode() {
        return ((((this.f56942a.hashCode() + 527) * 31) + this.f56943b.hashCode()) * 31) + this.f56944c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f56944c + "}";
    }
}
