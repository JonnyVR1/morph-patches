package com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs;

import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.fvk;
import p149l.gkh0;
import p149l.mkd0;
import p149l.rhg0;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12889a {

    /* JADX INFO: renamed from: a */
    public final fvk f51225a;

    /* JADX INFO: renamed from: b */
    public final C12891c f51226b;

    public C12889a(fvk fvkVar, C12891c c12891c) {
        this.f51225a = fvkVar;
        this.f51226b = c12891c;
    }

    /* JADX INFO: renamed from: d */
    public Socket m75523d(List<AddressRecord> list) throws Exception {
        if (list == null || list.isEmpty()) {
            rhg0.m179353a("No addresses provided");
            return null;
        }
        m75530k("connecting with " + list.size() + " resolved addresses");
        return m75524e(list);
    }

    /* JADX INFO: renamed from: e */
    public final Socket m75524e(List<AddressRecord> list) throws Exception {
        TimeUnit timeUnit;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AddressRecord addressRecord : list) {
            if (addressRecord.m75519f() == AddressRecord.AddressType.IPV6) {
                arrayList.add(addressRecord);
            } else {
                arrayList2.add(addressRecord);
            }
        }
        m75530k("IPv6 addresses=" + arrayList.size() + ", IPv4 addresses=" + arrayList2.size());
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(m75525f((AddressRecord) it.next(), this.f51225a.m123325c()));
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            timeUnit = TimeUnit.MILLISECONDS;
            if (!zHasNext) {
                break;
            }
            final AddressRecord addressRecord2 = (AddressRecord) it2.next();
            arrayList3.add(C22306c.timer(this.f51225a.m123324b(), timeUnit).flatMap(new w9j() { // from class: l.xv5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f194577a.m75527h(addressRecord2, (Long) obj);
                }
            }));
        }
        m75530k("starting " + arrayList3.size() + " connection attempts (IPv6: " + arrayList.size() + ", IPv4: " + arrayList2.size() + ")");
        try {
            Socket socket = (Socket) C22306c.amb(arrayList3).timeout(Math.max(this.f51225a.m123323a(), this.f51225a.m123325c()) + this.f51225a.m123324b() + 1000, timeUnit).toBlocking().m212772e();
            if (this.f51225a.m123326d()) {
                for (AddressRecord addressRecord3 : list) {
                    String hostAddress = addressRecord3.m75515b().getHostAddress();
                    if (socket.isConnected() && socket.getInetAddress().getHostAddress().equals(hostAddress)) {
                        AddressRecord.AddressType addressTypeM75519f = addressRecord3.m75519f();
                        this.f51226b.m75537c(addressTypeM75519f);
                        m75530k("connection successful via " + addressTypeM75519f);
                        break;
                    }
                }
            }
            socket.setSoTimeout(0);
            m75530k("connection successful");
            return socket;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m75530k("all connection attempts failed: " + e.getMessage());
            throw new IOException("All connection attempts failed", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final C22306c<Socket> m75525f(final AddressRecord addressRecord, final int i) {
        final String strM75526g = m75526g(addressRecord);
        final int iM75518e = addressRecord.m75518e();
        m75530k("starting attempt to " + strM75526g + " (" + addressRecord.m75519f() + ")");
        return C22306c.fromCallable(new Callable() { // from class: l.yv5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f200220a.m75528i(addressRecord, iM75518e, i, strM75526g);
            }
        }).compose(mkd0.m154965Q()).timeout(i, TimeUnit.MILLISECONDS).onErrorResumeNext(new w9j() { // from class: l.zv5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204963a.m75529j(strM75526g, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final String m75526g(AddressRecord addressRecord) {
        String strM75516c = addressRecord.m75516c();
        int iM75518e = addressRecord.m75518e();
        if (addressRecord.m75519f() == AddressRecord.AddressType.IPV6) {
            return "[" + strM75516c + "]:" + iM75518e;
        }
        return strM75516c + ":" + iM75518e;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C22306c m75527h(AddressRecord addressRecord, Long l2) {
        return m75525f(addressRecord, this.f51225a.m123323a());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Socket m75528i(AddressRecord addressRecord, int i, int i2, String str) throws Exception {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(addressRecord.m75515b(), i), i2);
        m75530k("attempt to " + str + " succeeded via " + addressRecord.m75519f());
        return socket;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C22306c m75529j(String str, Throwable th) {
        m75530k("attempt to " + str + " failed - " + th.getMessage());
        return C22306c.never();
    }

    /* JADX INFO: renamed from: k */
    public final void m75530k(String str) {
        gkh0.m126627j("[live][longlink]", "ConnectionController: " + str);
    }
}
