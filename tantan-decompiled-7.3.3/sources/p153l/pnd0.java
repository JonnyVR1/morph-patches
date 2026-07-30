package p153l;

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
public final class pnd0 {

    /* JADX INFO: renamed from: a */
    public final y80 f153286a;

    /* JADX INFO: renamed from: b */
    public final ond0 f153287b;

    /* JADX INFO: renamed from: c */
    public final ry3 f153288c;

    /* JADX INFO: renamed from: d */
    public final t4f f153289d;

    /* JADX INFO: renamed from: e */
    public List<Proxy> f153290e;

    /* JADX INFO: renamed from: f */
    public int f153291f;

    /* JADX INFO: renamed from: g */
    public List<InetSocketAddress> f153292g;

    /* JADX INFO: renamed from: h */
    public final List<nnd0> f153293h;

    /* JADX INFO: renamed from: l.pnd0$a */
    public static final class C19408a {

        /* JADX INFO: renamed from: a */
        public final List<nnd0> f153294a;

        /* JADX INFO: renamed from: b */
        public int f153295b = 0;

        public C19408a(List<nnd0> list) {
            this.f153294a = list;
        }

        /* JADX INFO: renamed from: a */
        public List<nnd0> m173067a() {
            return new ArrayList(this.f153294a);
        }

        /* JADX INFO: renamed from: b */
        public boolean m173068b() {
            return this.f153295b < this.f153294a.size();
        }

        /* JADX INFO: renamed from: c */
        public nnd0 m173069c() throws IOException {
            if (!m173068b()) {
                mor.m159308a();
                return null;
            }
            List<nnd0> list = this.f153294a;
            int i = this.f153295b;
            this.f153295b = i + 1;
            return list.get(i);
        }
    }

    public pnd0(y80 y80Var, ond0 ond0Var, ry3 ry3Var, t4f t4fVar) {
        List list = Collections.EMPTY_LIST;
        this.f153290e = list;
        this.f153292g = list;
        this.f153293h = new ArrayList();
        this.f153286a = y80Var;
        this.f153287b = ond0Var;
        this.f153288c = ry3Var;
        this.f153289d = t4fVar;
        m173066g(y80Var.m214721l(), y80Var.m214716g());
    }

    /* JADX INFO: renamed from: a */
    public static String m173060a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* JADX INFO: renamed from: b */
    public boolean m173061b() {
        return m173062c() || !this.f153293h.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m173062c() {
        return this.f153291f < this.f153290e.size();
    }

    /* JADX INFO: renamed from: d */
    public C19408a m173063d() throws IOException {
        if (!m173061b()) {
            mor.m159308a();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (m173062c()) {
            Proxy proxyM173064e = m173064e();
            int size = this.f153292g.size();
            for (int i = 0; i < size; i++) {
                nnd0 nnd0Var = new nnd0(this.f153286a, proxyM173064e, this.f153292g.get(i));
                if (this.f153287b.m168332c(nnd0Var)) {
                    this.f153293h.add(nnd0Var);
                } else {
                    arrayList.add(nnd0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f153293h);
            this.f153293h.clear();
        }
        return new C19408a(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final Proxy m173064e() throws IOException {
        if (m173062c()) {
            List<Proxy> list = this.f153290e;
            int i = this.f153291f;
            this.f153291f = i + 1;
            Proxy proxy = list.get(i);
            m173065f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f153286a.m214721l().m182286m() + "; exhausted proxy configurations: " + this.f153290e);
    }

    /* JADX INFO: renamed from: f */
    public final void m173065f(Proxy proxy) throws IOException {
        String strM182286m;
        int iM182291y;
        this.f153292g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM182286m = this.f153286a.m214721l().m182286m();
            iM182291y = this.f153286a.m214721l().m182291y();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                yg3.m215829a("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
                return;
            } else {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                strM182286m = m173060a(inetSocketAddress);
                iM182291y = inetSocketAddress.getPort();
            }
        }
        if (iM182291y < 1 || iM182291y > 65535) {
            throw new SocketException("No route to " + strM182286m + ":" + iM182291y + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f153292g.add(InetSocketAddress.createUnresolved(strM182286m, iM182291y));
            return;
        }
        this.f153289d.dnsStart(this.f153288c, strM182286m);
        List<InetAddress> listLookup = this.f153286a.m214712c().lookup(strM182286m);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.f153286a.m214712c() + " returned no addresses for " + strM182286m);
        }
        this.f153289d.dnsEnd(this.f153288c, strM182286m, listLookup);
        int size = listLookup.size();
        for (int i = 0; i < size; i++) {
            this.f153292g.add(new InetSocketAddress(listLookup.get(i), iM182291y));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m173066g(rnl rnlVar, Proxy proxy) {
        if (proxy != null) {
            this.f153290e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f153286a.m214718i().select(rnlVar.m182279J());
            this.f153290e = (listSelect == null || listSelect.isEmpty()) ? zlk0.m220259u(Proxy.NO_PROXY) : zlk0.m220258t(listSelect);
        }
        this.f153291f = 0;
    }
}
