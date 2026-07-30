package com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.nsh0;
import p153l.psd0;
import p153l.qcj;
import p153l.vxk;
import p153l.zpg0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.a */
/* JADX INFO: loaded from: classes5.dex */
public class C13052a {

    /* JADX INFO: renamed from: a */
    public final vxk f52073a;

    /* JADX INFO: renamed from: b */
    public final C13054c f52074b;

    public C13052a(vxk vxkVar, C13054c c13054c) {
        this.f52073a = vxkVar;
        this.f52074b = c13054c;
    }

    /* JADX INFO: renamed from: d */
    public Socket m76706d(List<AddressRecord> list) throws Exception {
        if (list == null || list.isEmpty()) {
            zpg0.m220844a("No addresses provided");
            return null;
        }
        m76713k("connecting with " + list.size() + " resolved addresses");
        return m76707e(list);
    }

    /* JADX INFO: renamed from: e */
    public final Socket m76707e(List<AddressRecord> list) throws Exception {
        TimeUnit timeUnit;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AddressRecord addressRecord : list) {
            if (addressRecord.m76702f() == AddressRecord.AddressType.IPV6) {
                arrayList.add(addressRecord);
            } else {
                arrayList2.add(addressRecord);
            }
        }
        m76713k("IPv6 addresses=" + arrayList.size() + ", IPv4 addresses=" + arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(m76708f((AddressRecord) it.next(), this.f52073a.m203850c()));
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            timeUnit = TimeUnit.MILLISECONDS;
            if (!zHasNext) {
                break;
            }
            final AddressRecord addressRecord2 = (AddressRecord) it2.next();
            arrayList3.add(C22421c.timer(this.f52073a.m203849b(), timeUnit).flatMap(new qcj() { // from class: l.cx5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f84173a.m76710h(addressRecord2, (Long) obj);
                }
            }));
        }
        m76713k("starting " + arrayList3.size() + " connection attempts (IPv6: " + arrayList.size() + ", IPv4: " + arrayList2.size() + ")");
        try {
            Socket socket = (Socket) C22421c.amb(arrayList3).timeout(Math.max(this.f52073a.m203848a(), this.f52073a.m203850c()) + this.f52073a.m203849b() + 1000, timeUnit).toBlocking().m165965e();
            if (this.f52073a.m203851d()) {
                for (AddressRecord addressRecord3 : list) {
                    String hostAddress = addressRecord3.m76698b().getHostAddress();
                    if (socket.isConnected() && socket.getInetAddress().getHostAddress().equals(hostAddress)) {
                        AddressRecord.AddressType addressTypeM76702f = addressRecord3.m76702f();
                        this.f52074b.m76720c(addressTypeM76702f);
                        m76713k("connection successful via " + addressTypeM76702f);
                        break;
                    }
                }
            }
            socket.setSoTimeout(0);
            m76713k("connection successful");
            return socket;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m76713k("all connection attempts failed: " + e.getMessage());
            throw new IOException("All connection attempts failed", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C22421c<Socket> m76708f(final AddressRecord addressRecord, final int i) {
        final String strM76709g = m76709g(addressRecord);
        final int iM76701e = addressRecord.m76701e();
        m76713k("starting attempt to " + strM76709g + " (" + addressRecord.m76702f() + ")");
        return C22421c.fromCallable(new Callable() { // from class: l.dx5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f91061a.m76711i(addressRecord, iM76701e, i, strM76709g);
            }
        }).compose(psd0.m173606Q()).timeout(i, TimeUnit.MILLISECONDS).onErrorResumeNext(new qcj() { // from class: l.ex5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96237a.m76712j(strM76709g, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final String m76709g(AddressRecord addressRecord) {
        String strM76699c = addressRecord.m76699c();
        int iM76701e = addressRecord.m76701e();
        if (addressRecord.m76702f() == AddressRecord.AddressType.IPV6) {
            return "[" + strM76699c + "]:" + iM76701e;
        }
        return strM76699c + ":" + iM76701e;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C22421c m76710h(AddressRecord addressRecord, Long l2) {
        return m76708f(addressRecord, this.f52073a.m203848a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Socket m76711i(AddressRecord addressRecord, int i, int i2, String str) throws Exception {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(addressRecord.m76698b(), i), i2);
        m76713k("attempt to " + str + " succeeded via " + addressRecord.m76702f());
        return socket;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C22421c m76712j(String str, Throwable th) {
        m76713k("attempt to " + str + " failed - " + th.getMessage());
        return C22421c.never();
    }

    /* JADX INFO: renamed from: k */
    public final void m76713k(String str) {
        nsh0.m164608j("[live][longlink]", "ConnectionController: " + str);
    }
}
