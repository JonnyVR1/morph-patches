package p149l;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class kfd0 {

    /* JADX INFO: renamed from: a */
    public final c90 f122916a;

    /* JADX INFO: renamed from: b */
    public final Proxy f122917b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f122918c;

    public kfd0(c90 c90Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c90Var == null) {
            jfd0.m141176a("address == null");
            throw null;
        }
        if (proxy == null) {
            jfd0.m141176a("proxy == null");
            throw null;
        }
        if (inetSocketAddress == null) {
            jfd0.m141176a("inetSocketAddress == null");
            throw null;
        }
        this.f122916a = c90Var;
        this.f122917b = proxy;
        this.f122918c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public c90 m145831a() {
        return this.f122916a;
    }

    /* JADX INFO: renamed from: b */
    public Proxy m145832b() {
        return this.f122917b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m145833c() {
        return this.f122916a.f79845i != null && this.f122917b.type() == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: d */
    public InetSocketAddress m145834d() {
        return this.f122918c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kfd0)) {
            return false;
        }
        kfd0 kfd0Var = (kfd0) obj;
        return kfd0Var.f122916a.equals(this.f122916a) && kfd0Var.f122917b.equals(this.f122917b) && kfd0Var.f122918c.equals(this.f122918c);
    }

    public int hashCode() {
        return ((((527 + this.f122916a.hashCode()) * 31) + this.f122917b.hashCode()) * 31) + this.f122918c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f122918c + "}";
    }
}
