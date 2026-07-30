package p153l;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes2.dex */
public final class nnd0 {

    /* JADX INFO: renamed from: a */
    public final y80 f142778a;

    /* JADX INFO: renamed from: b */
    public final Proxy f142779b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f142780c;

    public nnd0(y80 y80Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (y80Var == null) {
            mnd0.m159157a("address == null");
            throw null;
        }
        if (proxy == null) {
            mnd0.m159157a("proxy == null");
            throw null;
        }
        if (inetSocketAddress == null) {
            mnd0.m159157a("inetSocketAddress == null");
            throw null;
        }
        this.f142778a = y80Var;
        this.f142779b = proxy;
        this.f142780c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public y80 m163861a() {
        return this.f142778a;
    }

    /* JADX INFO: renamed from: b */
    public Proxy m163862b() {
        return this.f142779b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m163863c() {
        return this.f142778a.f197929i != null && this.f142779b.type() == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: d */
    public InetSocketAddress m163864d() {
        return this.f142780c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof nnd0)) {
            return false;
        }
        nnd0 nnd0Var = (nnd0) obj;
        return nnd0Var.f142778a.equals(this.f142778a) && nnd0Var.f142779b.equals(this.f142779b) && nnd0Var.f142780c.equals(this.f142780c);
    }

    public int hashCode() {
        return ((((527 + this.f142778a.hashCode()) * 31) + this.f142779b.hashCode()) * 31) + this.f142780c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f142780c + "}";
    }
}
