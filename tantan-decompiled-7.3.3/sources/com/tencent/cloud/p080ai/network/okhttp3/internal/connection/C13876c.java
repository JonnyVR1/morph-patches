package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.okhttp3.AbstractC13927m;
import com.tencent.cloud.p080ai.network.okhttp3.C13858a;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.C13933s;
import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
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
import p153l.aqg0;
import p153l.mor;
import p153l.yg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.c */
/* JADX INFO: loaded from: classes12.dex */
public final class C13876c {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ boolean f57341k = true;

    /* JADX INFO: renamed from: a */
    public final C13883j f57342a;

    /* JADX INFO: renamed from: b */
    public final C13858a f57343b;

    /* JADX INFO: renamed from: c */
    public final C13879f f57344c;

    /* JADX INFO: renamed from: d */
    public final Call f57345d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13927m f57346e;

    /* JADX INFO: renamed from: f */
    public C13882i.a f57347f;

    /* JADX INFO: renamed from: g */
    public final C13882i f57348g;

    /* JADX INFO: renamed from: h */
    public C13878e f57349h;

    /* JADX INFO: renamed from: i */
    public boolean f57350i;

    /* JADX INFO: renamed from: j */
    public C13933s f57351j;

    public C13876c(C13883j c13883j, C13879f c13879f, C13858a c13858a, Call call, AbstractC13927m abstractC13927m) {
        this.f57342a = c13883j;
        this.f57344c = c13879f;
        this.f57343b = c13858a;
        this.f57345d = call;
        this.f57346e = abstractC13927m;
        this.f57348g = new C13882i(c13858a, c13879f.f57376e, call, abstractC13927m);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX INFO: renamed from: a */
    public final C13878e m82833a(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C13878e c13878e;
        Socket socket;
        Socket socketM82867e;
        C13878e c13878e2;
        int i5;
        boolean z2;
        C13933s c13933s;
        boolean z3;
        ArrayList arrayList;
        C13878e c13878e3;
        C13878e c13878e4;
        C13882i.a aVar;
        String hostName;
        int port;
        boolean zContains;
        synchronized (this.f57344c) {
            try {
                if (this.f57342a.m82866d()) {
                    throw new IOException("Canceled");
                }
                this.f57350i = false;
                C13883j c13883j = this.f57342a;
                c13878e = c13883j.f57400i;
                socket = null;
                socketM82867e = (c13878e == null || !c13878e.f57363k) ? null : c13883j.m82867e();
                C13883j c13883j2 = this.f57342a;
                c13878e2 = c13883j2.f57400i;
                if (c13878e2 != null) {
                    c13878e = null;
                } else {
                    c13878e2 = null;
                }
                i5 = 1;
                if (c13878e2 != null) {
                    z2 = false;
                    c13933s = null;
                } else if (this.f57344c.m82854a(this.f57343b, c13883j2, null, false)) {
                    c13878e2 = this.f57342a.f57400i;
                    c13933s = null;
                    z2 = true;
                } else {
                    c13933s = this.f57351j;
                    if (c13933s != null) {
                        this.f57351j = null;
                    } else if (m82836c()) {
                        c13933s = this.f57342a.f57400i.f57355c;
                    } else {
                        z2 = false;
                        c13933s = null;
                    }
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C13869c.m82799a(socketM82867e);
        if (c13878e != null) {
            this.f57346e.getClass();
        }
        if (z2) {
            this.f57346e.getClass();
        }
        if (c13878e2 != null) {
            return c13878e2;
        }
        if (c13933s != null || ((aVar = this.f57347f) != null && aVar.m82858a())) {
            z3 = false;
        } else {
            C13882i c13882i = this.f57348g;
            if (!c13882i.m82857a() && c13882i.f57388h.isEmpty()) {
                mor.m159308a();
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            while (c13882i.m82857a()) {
                if (!c13882i.m82857a()) {
                    throw new SocketException("No route to " + c13882i.f57381a.f57243a.f57760d + "; exhausted proxy configurations: " + c13882i.f57385e);
                }
                List<Proxy> list = c13882i.f57385e;
                int i6 = c13882i.f57386f;
                c13882i.f57386f = i6 + 1;
                Proxy proxy = list.get(i6);
                c13882i.f57387g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    C13930p c13930p = c13882i.f57381a.f57243a;
                    hostName = c13930p.f57760d;
                    port = c13930p.f57761e;
                } else {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (!(socketAddressAddress instanceof InetSocketAddress)) {
                        yg3.m215829a("Proxy.address() is not an InetSocketAddress: ", socketAddressAddress.getClass());
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
                    c13882i.f57387g.add(InetSocketAddress.createUnresolved(hostName, port));
                } else {
                    c13882i.f57384d.getClass();
                    List<InetAddress> listLookup = c13882i.f57381a.f57244b.lookup(hostName);
                    if (listLookup.isEmpty()) {
                        throw new UnknownHostException(c13882i.f57381a.f57244b + " returned no addresses for " + hostName);
                    }
                    c13882i.f57384d.getClass();
                    int size = listLookup.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        c13882i.f57387g.add(new InetSocketAddress(listLookup.get(i7), port));
                    }
                }
                int size2 = c13882i.f57387g.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    C13933s c13933s2 = new C13933s(c13882i.f57381a, proxy, c13882i.f57387g.get(i8));
                    C13880g c13880g = c13882i.f57382b;
                    synchronized (c13880g) {
                        zContains = c13880g.f57378a.contains(c13933s2);
                    }
                    if (zContains) {
                        c13882i.f57388h.add(c13933s2);
                    } else {
                        arrayList2.add(c13933s2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    break;
                }
                i5 = 1;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(c13882i.f57388h);
                c13882i.f57388h.clear();
            }
            this.f57347f = new C13882i.a(arrayList2);
            z3 = true;
        }
        synchronized (this.f57344c) {
            try {
                if (this.f57342a.m82866d()) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    C13882i.a aVar2 = this.f57347f;
                    if (aVar2 == null) {
                        throw null;
                    }
                    arrayList = new ArrayList(aVar2.f57389a);
                    if (this.f57344c.m82854a(this.f57343b, this.f57342a, arrayList, false)) {
                        c13878e2 = this.f57342a.f57400i;
                        z2 = true;
                    }
                } else {
                    arrayList = null;
                }
                if (!z2) {
                    if (c13933s == null) {
                        C13882i.a aVar3 = this.f57347f;
                        if (!aVar3.m82858a()) {
                            throw new NoSuchElementException();
                        }
                        List<C13933s> list2 = aVar3.f57389a;
                        int i9 = aVar3.f57390b;
                        aVar3.f57390b = i9 + 1;
                        c13933s = list2.get(i9);
                    }
                    c13878e2 = new C13878e(this.f57344c, c13933s);
                    this.f57349h = c13878e2;
                }
                c13878e3 = c13878e2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            this.f57346e.getClass();
            return c13878e3;
        }
        c13878e3.m82840a(i, i2, i3, i4, z, this.f57345d, this.f57346e);
        this.f57344c.f57376e.m82855a(c13878e3.f57355c);
        synchronized (this.f57344c) {
            try {
                this.f57349h = null;
                if (this.f57344c.m82854a(this.f57343b, this.f57342a, arrayList, true)) {
                    c13878e3.f57363k = true;
                    socket = c13878e3.f57357e;
                    C13878e c13878e5 = this.f57342a.f57400i;
                    this.f57351j = c13933s;
                    c13878e4 = c13878e5;
                } else {
                    C13879f c13879f = this.f57344c;
                    if (c13879f == null) {
                        throw null;
                    }
                    if (!C13879f.f57371h && !Thread.holdsLock(c13879f)) {
                        throw new AssertionError();
                    }
                    if (!c13879f.f57377f) {
                        c13879f.f57377f = true;
                        C13879f.f57370g.execute(c13879f.f57374c);
                    }
                    c13879f.f57375d.add(c13878e3);
                    this.f57342a.m82863a(c13878e3);
                    c13878e4 = c13878e3;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C13869c.m82799a(socket);
        this.f57346e.getClass();
        return c13878e4;
    }

    /* JADX INFO: renamed from: b */
    public boolean m82835b() {
        synchronized (this.f57344c) {
            try {
                boolean z = true;
                if (this.f57351j != null) {
                    return true;
                }
                if (m82836c()) {
                    this.f57351j = this.f57342a.f57400i.f57355c;
                    return true;
                }
                C13882i.a aVar = this.f57347f;
                if (aVar == null || !aVar.m82858a()) {
                    C13882i c13882i = this.f57348g;
                    if (!c13882i.m82857a() && c13882i.f57388h.isEmpty()) {
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
    public final boolean m82836c() {
        C13878e c13878e = this.f57342a.f57400i;
        return c13878e != null && c13878e.f57364l == 0 && C13869c.m82800a(c13878e.f57355c.f57790a.f57243a, this.f57343b.f57243a);
    }

    /* JADX INFO: renamed from: d */
    public void m82837d() {
        if (!f57341k && Thread.holdsLock(this.f57344c)) {
            aqg0.m99478a();
            return;
        }
        synchronized (this.f57344c) {
            this.f57350i = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C13878e m82834a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C13878e c13878eM82833a = m82833a(i, i2, i3, i4, z);
            synchronized (this.f57344c) {
                try {
                    if (c13878eM82833a.f57365m == 0 && !c13878eM82833a.m82846a()) {
                        return c13878eM82833a;
                    }
                    if (c13878eM82833a.m82848a(z2)) {
                        return c13878eM82833a;
                    }
                    c13878eM82833a.m82849b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C13878e m82832a() {
        if (f57341k || Thread.holdsLock(this.f57344c)) {
            return this.f57349h;
        }
        aqg0.m99478a();
        return null;
    }
}
