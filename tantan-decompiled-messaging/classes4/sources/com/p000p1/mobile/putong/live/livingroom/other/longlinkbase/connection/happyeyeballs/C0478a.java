package com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.gkh0;
import l.mkd0;
import l.rhg0;
import l.w9j;
import p002l.fvk;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0478a {

    /* JADX INFO: renamed from: a */
    public final fvk f7267a;

    /* JADX INFO: renamed from: b */
    public final C0480c f7268b;

    public C0478a(fvk fvkVar, C0480c c0480c) {
        this.f7267a = fvkVar;
        this.f7268b = c0480c;
    }

    /* JADX INFO: renamed from: d */
    public Socket m9158d(List<AddressRecord> list) throws Exception {
        if (list == null || list.isEmpty()) {
            rhg0.a("No addresses provided");
            return null;
        }
        m9165k("connecting with " + list.size() + " resolved addresses");
        return m9159e(list);
    }

    /* JADX INFO: renamed from: e */
    public final Socket m9159e(List<AddressRecord> list) throws Exception {
        TimeUnit timeUnit;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AddressRecord addressRecord : list) {
            if (addressRecord.m9154f() == AddressRecord.AddressType.IPV6) {
                arrayList.add(addressRecord);
            } else {
                arrayList2.add(addressRecord);
            }
        }
        m9165k("IPv6 addresses=" + arrayList.size() + ", IPv4 addresses=" + arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(m9160f((AddressRecord) it.next(), this.f7267a.m13488c()));
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            timeUnit = TimeUnit.MILLISECONDS;
            if (!zHasNext) {
                break;
            }
            final AddressRecord addressRecord2 = (AddressRecord) it2.next();
            arrayList3.add(c.timer(this.f7267a.m13487b(), timeUnit).flatMap(new w9j() { // from class: l.xv5
                public final Object call(Object obj) {
                    return this.f22478a.m9162h(addressRecord2, (Long) obj);
                }
            }));
        }
        m9165k("starting " + arrayList3.size() + " connection attempts (IPv6: " + arrayList.size() + ", IPv4: " + arrayList2.size() + ")");
        try {
            Socket socket = (Socket) c.amb(arrayList3).timeout(Math.max(this.f7267a.m13486a(), this.f7267a.m13488c()) + this.f7267a.m13487b() + 1000, timeUnit).toBlocking().e();
            if (this.f7267a.m13489d()) {
                for (AddressRecord addressRecord3 : list) {
                    String hostAddress = addressRecord3.m9150b().getHostAddress();
                    if (socket.isConnected() && socket.getInetAddress().getHostAddress().equals(hostAddress)) {
                        AddressRecord.AddressType addressTypeM9154f = addressRecord3.m9154f();
                        this.f7268b.m9172c(addressTypeM9154f);
                        m9165k("connection successful via " + addressTypeM9154f);
                        break;
                    }
                }
            }
            socket.setSoTimeout(0);
            m9165k("connection successful");
            return socket;
        } catch (Exception e) {
            CrashHelper.c(e);
            m9165k("all connection attempts failed: " + e.getMessage());
            throw new IOException("All connection attempts failed", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final c<Socket> m9160f(final AddressRecord addressRecord, final int i) {
        final String strM9161g = m9161g(addressRecord);
        final int iM9153e = addressRecord.m9153e();
        m9165k("starting attempt to " + strM9161g + " (" + addressRecord.m9154f() + ")");
        return c.fromCallable(new Callable() { // from class: l.yv5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f23112a.m9163i(addressRecord, iM9153e, i, strM9161g);
            }
        }).compose(mkd0.Q()).timeout(i, TimeUnit.MILLISECONDS).onErrorResumeNext(new w9j() { // from class: l.zv5
            public final Object call(Object obj) {
                return this.f23599a.m9164j(strM9161g, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final String m9161g(AddressRecord addressRecord) {
        String strM9151c = addressRecord.m9151c();
        int iM9153e = addressRecord.m9153e();
        if (addressRecord.m9154f() == AddressRecord.AddressType.IPV6) {
            return "[" + strM9151c + "]:" + iM9153e;
        }
        return strM9151c + ":" + iM9153e;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ c m9162h(AddressRecord addressRecord, Long l2) {
        return m9160f(addressRecord, this.f7267a.m13486a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Socket m9163i(AddressRecord addressRecord, int i, int i2, String str) throws Exception {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(addressRecord.m9150b(), i), i2);
        m9165k("attempt to " + str + " succeeded via " + addressRecord.m9154f());
        return socket;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ c m9164j(String str, Throwable th) {
        m9165k("attempt to " + str + " failed - " + th.getMessage());
        return c.never();
    }

    /* JADX INFO: renamed from: k */
    public final void m9165k(String str) {
        gkh0.j("[live][longlink]", "ConnectionController: " + str);
    }
}
