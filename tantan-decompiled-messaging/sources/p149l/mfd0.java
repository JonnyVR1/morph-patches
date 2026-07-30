package p149l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mfd0 {

    /* JADX INFO: renamed from: a */
    public final c90 f133577a;

    /* JADX INFO: renamed from: b */
    public final lfd0 f133578b;

    /* JADX INFO: renamed from: c */
    public final sx3 f133579c;

    /* JADX INFO: renamed from: d */
    public final o3f f133580d;

    /* JADX INFO: renamed from: e */
    public List<Proxy> f133581e;

    /* JADX INFO: renamed from: f */
    public int f133582f;

    /* JADX INFO: renamed from: g */
    public List<InetSocketAddress> f133583g;

    /* JADX INFO: renamed from: h */
    public final List<kfd0> f133584h;

    /* JADX INFO: renamed from: l.mfd0$a */
    public static final class C18451a {

        /* JADX INFO: renamed from: a */
        public final List<kfd0> f133585a;

        /* JADX INFO: renamed from: b */
        public int f133586b = 0;

        public C18451a(List<kfd0> list) {
            this.f133585a = list;
        }

        /* JADX INFO: renamed from: a */
        public List<kfd0> m154378a() {
            return new ArrayList(this.f133585a);
        }

        /* JADX INFO: renamed from: b */
        public boolean m154379b() {
            return this.f133586b < this.f133585a.size();
        }

        /* JADX INFO: renamed from: c */
        public kfd0 m154380c() throws IOException {
            if (!m154379b()) {
                lmr.m150601a();
                return null;
            }
            List<kfd0> list = this.f133585a;
            int i = this.f133586b;
            this.f133586b = i + 1;
            return list.get(i);
        }
    }

    public mfd0(c90 c90Var, lfd0 lfd0Var, sx3 sx3Var, o3f o3fVar) {
        List list = Collections.EMPTY_LIST;
        this.f133581e = list;
        this.f133583g = list;
        this.f133584h = new ArrayList();
        this.f133577a = c90Var;
        this.f133578b = lfd0Var;
        this.f133579c = sx3Var;
        this.f133580d = o3fVar;
        m154377g(c90Var.m105837l(), c90Var.m105832g());
    }

    /* JADX INFO: renamed from: a */
    public static String m154371a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* JADX INFO: renamed from: b */
    public boolean m154372b() {
        return m154373c() || !this.f133584h.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m154373c() {
        return this.f133582f < this.f133581e.size();
    }

    /* JADX INFO: renamed from: d */
    public C18451a m154374d() throws IOException {
        if (!m154372b()) {
            lmr.m150601a();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (m154373c()) {
            Proxy proxyM154375e = m154375e();
            int size = this.f133583g.size();
            for (int i = 0; i < size; i++) {
                kfd0 kfd0Var = new kfd0(this.f133577a, proxyM154375e, this.f133583g.get(i));
                if (this.f133578b.m149675c(kfd0Var)) {
                    this.f133584h.add(kfd0Var);
                } else {
                    arrayList.add(kfd0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f133584h);
            this.f133584h.clear();
        }
        return new C18451a(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final Proxy m154375e() throws IOException {
        if (m154373c()) {
            List<Proxy> list = this.f133581e;
            int i = this.f133582f;
            this.f133582f = i + 1;
            Proxy proxy = list.get(i);
            m154376f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f133577a.m105837l().m107522m() + "; exhausted proxy configurations: " + this.f133581e);
    }

    /* JADX INFO: renamed from: f */
    public final void m154376f(Proxy proxy) throws IOException {
        String strM107522m;
        int iM107527y;
        this.f133583g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM107522m = this.f133577a.m105837l().m107522m();
            iM107527y = this.f133577a.m105837l().m107527y();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                kg3.m145878a("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
                return;
            } else {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strM107522m = m154371a(inetSocketAddress);
                iM107527y = inetSocketAddress.getPort();
            }
        }
        if (iM107527y < 1 || iM107527y > 65535) {
            throw new SocketException("No route to " + strM107522m + ":" + iM107527y + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f133583g.add(InetSocketAddress.createUnresolved(strM107522m, iM107527y));
            return;
        }
        this.f133580d.dnsStart(this.f133579c, strM107522m);
        List<InetAddress> listLookup = this.f133577a.m105828c().lookup(strM107522m);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.f133577a.m105828c() + " returned no addresses for " + strM107522m);
        }
        this.f133580d.dnsEnd(this.f133579c, strM107522m, listLookup);
        int size = listLookup.size();
        for (int i = 0; i < size; i++) {
            this.f133583g.add(new InetSocketAddress(listLookup.get(i), iM107527y));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m154377g(cll cllVar, Proxy proxy) {
        if (proxy != null) {
            this.f133581e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f133577a.m105834i().select(cllVar.m107515J());
            this.f133581e = (listSelect == null || listSelect.isEmpty()) ? tck0.m188020u(Proxy.NO_PROXY) : tck0.m188019t(listSelect);
        }
        this.f133582f = 0;
    }
}
