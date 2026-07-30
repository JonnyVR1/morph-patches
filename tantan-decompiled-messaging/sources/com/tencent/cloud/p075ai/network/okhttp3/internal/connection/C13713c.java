package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.okhttp3.AbstractC13764m;
import com.tencent.cloud.p075ai.network.okhttp3.C13695a;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.C13770s;
import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p149l.kg3;
import p149l.lmr;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.c */
/* JADX INFO: loaded from: classes13.dex */
public final class C13713c {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ boolean f56493k = true;

    /* JADX INFO: renamed from: a */
    public final C13720j f56494a;

    /* JADX INFO: renamed from: b */
    public final C13695a f56495b;

    /* JADX INFO: renamed from: c */
    public final C13716f f56496c;

    /* JADX INFO: renamed from: d */
    public final Call f56497d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13764m f56498e;

    /* JADX INFO: renamed from: f */
    public C13719i.a f56499f;

    /* JADX INFO: renamed from: g */
    public final C13719i f56500g;

    /* JADX INFO: renamed from: h */
    public C13715e f56501h;

    /* JADX INFO: renamed from: i */
    public boolean f56502i;

    /* JADX INFO: renamed from: j */
    public C13770s f56503j;

    public C13713c(C13720j c13720j, C13716f c13716f, C13695a c13695a, Call call, AbstractC13764m abstractC13764m) {
        this.f56494a = c13720j;
        this.f56496c = c13716f;
        this.f56495b = c13695a;
        this.f56497d = call;
        this.f56498e = abstractC13764m;
        this.f56500g = new C13719i(c13695a, c13716f.f56528e, call, abstractC13764m);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX INFO: renamed from: a */
    public final C13715e m81650a(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C13715e c13715e;
        Socket socket;
        Socket socketM81684e;
        C13715e c13715e2;
        int i5;
        boolean z2;
        C13770s c13770s;
        boolean z3;
        ArrayList arrayList;
        C13715e c13715e3;
        C13715e c13715e4;
        C13719i.a aVar;
        String hostName;
        int port;
        boolean zContains;
        synchronized (this.f56496c) {
            try {
                if (this.f56494a.m81683d()) {
                    throw new IOException("Canceled");
                }
                this.f56502i = false;
                C13720j c13720j = this.f56494a;
                c13715e = c13720j.f56552i;
                socket = null;
                socketM81684e = (c13715e == null || !c13715e.f56515k) ? null : c13720j.m81684e();
                C13720j c13720j2 = this.f56494a;
                c13715e2 = c13720j2.f56552i;
                if (c13715e2 != null) {
                    c13715e = null;
                } else {
                    c13715e2 = null;
                }
                i5 = 1;
                if (c13715e2 != null) {
                    z2 = false;
                    c13770s = null;
                } else if (this.f56496c.m81671a(this.f56495b, c13720j2, null, false)) {
                    c13715e2 = this.f56494a.f56552i;
                    c13770s = null;
                    z2 = true;
                } else {
                    c13770s = this.f56503j;
                    if (c13770s != null) {
                        this.f56503j = null;
                    } else if (m81653c()) {
                        c13770s = this.f56494a.f56552i.f56507c;
                    } else {
                        z2 = false;
                        c13770s = null;
                    }
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C13706c.m81616a(socketM81684e);
        if (c13715e != null) {
            this.f56498e.getClass();
        }
        if (z2) {
            this.f56498e.getClass();
        }
        if (c13715e2 != null) {
            return c13715e2;
        }
        if (c13770s != null || ((aVar = this.f56499f) != null && aVar.m81675a())) {
            z3 = false;
        } else {
            C13719i c13719i = this.f56500g;
            if (!c13719i.m81674a() && c13719i.f56540h.isEmpty()) {
                lmr.m150601a();
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            while (c13719i.m81674a()) {
                if (!c13719i.m81674a()) {
                    throw new SocketException("No route to " + c13719i.f56533a.f56395a.f56912d + "; exhausted proxy configurations: " + c13719i.f56537e);
                }
                List<Proxy> list = c13719i.f56537e;
                int i6 = c13719i.f56538f;
                c13719i.f56538f = i6 + 1;
                Proxy proxy = list.get(i6);
                c13719i.f56539g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    C13767p c13767p = c13719i.f56533a.f56395a;
                    hostName = c13767p.f56912d;
                    port = c13767p.f56913e;
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        kg3.m145878a("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
                        return null;
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    InetAddress address = inetSocketAddress.getAddress();
                    hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                    port = inetSocketAddress.getPort();
                }
                if (port < i5 || port > 65535) {
                    throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    c13719i.f56539g.add(InetSocketAddress.createUnresolved(hostName, port));
                } else {
                    c13719i.f56536d.getClass();
                    List<InetAddress> listLookup = c13719i.f56533a.f56396b.lookup(hostName);
                    if (listLookup.isEmpty()) {
                        throw new UnknownHostException(c13719i.f56533a.f56396b + " returned no addresses for " + hostName);
                    }
                    c13719i.f56536d.getClass();
                    int size = listLookup.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        c13719i.f56539g.add(new InetSocketAddress(listLookup.get(i7), port));
                    }
                }
                int size2 = c13719i.f56539g.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    C13770s c13770s2 = new C13770s(c13719i.f56533a, proxy, c13719i.f56539g.get(i8));
                    C13717g c13717g = c13719i.f56534b;
                    synchronized (c13717g) {
                        zContains = c13717g.f56530a.contains(c13770s2);
                    }
                    if (zContains) {
                        c13719i.f56540h.add(c13770s2);
                    } else {
                        arrayList2.add(c13770s2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    break;
                }
                i5 = 1;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(c13719i.f56540h);
                c13719i.f56540h.clear();
            }
            this.f56499f = new C13719i.a(arrayList2);
            z3 = true;
        }
        synchronized (this.f56496c) {
            try {
                if (this.f56494a.m81683d()) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    C13719i.a aVar2 = this.f56499f;
                    if (aVar2 == null) {
                        throw null;
                    }
                    arrayList = new ArrayList(aVar2.f56541a);
                    if (this.f56496c.m81671a(this.f56495b, this.f56494a, arrayList, false)) {
                        c13715e2 = this.f56494a.f56552i;
                        z2 = true;
                    }
                } else {
                    arrayList = null;
                }
                if (!z2) {
                    if (c13770s == null) {
                        C13719i.a aVar3 = this.f56499f;
                        if (!aVar3.m81675a()) {
                            throw new NoSuchElementException();
                        }
                        List<C13770s> list2 = aVar3.f56541a;
                        int i9 = aVar3.f56542b;
                        aVar3.f56542b = i9 + 1;
                        c13770s = list2.get(i9);
                    }
                    c13715e2 = new C13715e(this.f56496c, c13770s);
                    this.f56501h = c13715e2;
                }
                c13715e3 = c13715e2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            this.f56498e.getClass();
            return c13715e3;
        }
        c13715e3.m81657a(i, i2, i3, i4, z, this.f56497d, this.f56498e);
        this.f56496c.f56528e.m81672a(c13715e3.f56507c);
        synchronized (this.f56496c) {
            try {
                this.f56501h = null;
                if (this.f56496c.m81671a(this.f56495b, this.f56494a, arrayList, true)) {
                    c13715e3.f56515k = true;
                    socket = c13715e3.f56509e;
                    C13715e c13715e5 = this.f56494a.f56552i;
                    this.f56503j = c13770s;
                    c13715e4 = c13715e5;
                } else {
                    C13716f c13716f = this.f56496c;
                    if (c13716f == null) {
                        throw null;
                    }
                    if (!C13716f.f56523h && !Thread.holdsLock(c13716f)) {
                        throw new AssertionError();
                    }
                    if (!c13716f.f56529f) {
                        c13716f.f56529f = true;
                        C13716f.f56522g.execute(c13716f.f56526c);
                    }
                    c13716f.f56527d.add(c13715e3);
                    this.f56494a.m81680a(c13715e3);
                    c13715e4 = c13715e3;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C13706c.m81616a(socket);
        this.f56498e.getClass();
        return c13715e4;
    }

    /* JADX INFO: renamed from: b */
    public boolean m81652b() {
        synchronized (this.f56496c) {
            try {
                boolean z = true;
                if (this.f56503j != null) {
                    return true;
                }
                if (m81653c()) {
                    this.f56503j = this.f56494a.f56552i.f56507c;
                    return true;
                }
                C13719i.a aVar = this.f56499f;
                if (aVar == null || !aVar.m81675a()) {
                    C13719i c13719i = this.f56500g;
                    if (!c13719i.m81674a() && c13719i.f56540h.isEmpty()) {
                        z = false;
                    }
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81653c() {
        C13715e c13715e = this.f56494a.f56552i;
        return c13715e != null && c13715e.f56516l == 0 && C13706c.m81617a(c13715e.f56507c.f56942a.f56395a, this.f56495b.f56395a);
    }

    /* JADX INFO: renamed from: d */
    public void m81654d() {
        if (!f56493k && Thread.holdsLock(this.f56496c)) {
            shg0.m184191a();
            return;
        }
        synchronized (this.f56496c) {
            this.f56502i = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C13715e m81651a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C13715e c13715eM81650a = m81650a(i, i2, i3, i4, z);
            synchronized (this.f56496c) {
                try {
                    if (c13715eM81650a.f56517m == 0 && !c13715eM81650a.m81663a()) {
                        return c13715eM81650a;
                    }
                    if (c13715eM81650a.m81665a(z2)) {
                        return c13715eM81650a;
                    }
                    c13715eM81650a.m81666b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C13715e m81649a() {
        if (f56493k || Thread.holdsLock(this.f56496c)) {
            return this.f56501h;
        }
        shg0.m184191a();
        return null;
    }
}
