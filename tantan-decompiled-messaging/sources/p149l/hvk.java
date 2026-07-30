package p149l;

import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.AddressRecord;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C12889a;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C12890b;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C12891c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public class hvk extends SocketFactory implements kwt {

    /* JADX INFO: renamed from: a */
    public final fvk f109659a;

    /* JADX INFO: renamed from: b */
    public final C12889a f109660b;

    /* JADX INFO: renamed from: c */
    public final C12890b f109661c;

    /* JADX INFO: renamed from: d */
    public final o90 f109662d;

    /* JADX INFO: renamed from: e */
    public final C12891c f109663e;

    /* JADX INFO: renamed from: f */
    public final mar f109664f;

    /* JADX INFO: renamed from: g */
    public final boolean f109665g;

    public hvk(boolean z, fvk fvkVar) {
        this.f109665g = z;
        if (!z) {
            this.f109659a = null;
            this.f109663e = null;
            this.f109661c = null;
            this.f109662d = null;
            this.f109660b = null;
            this.f109664f = new mar();
            m133187c("using legacy implementation");
            return;
        }
        fvkVar = fvkVar == null ? m133185b() : fvkVar;
        this.f109659a = fvkVar;
        C12891c c12891c = new C12891c();
        this.f109663e = c12891c;
        this.f109661c = new C12890b(fvkVar, c12891c);
        this.f109662d = new o90();
        this.f109660b = new C12889a(fvkVar, c12891c);
        this.f109664f = null;
        m133187c("Happy Eyeballs enabled");
    }

    /* JADX INFO: renamed from: b */
    public static fvk m133185b() {
        return new fvk.C16929a().m123337k(300).m123335i(10000).m123336j(50).m123334h(true).m123333g(5000).m123332f();
    }

    @Override // p149l.kwt
    /* JADX INFO: renamed from: a */
    public Socket mo133186a(String str) throws IOException {
        try {
            List<String> listM133189e = m133189e(str);
            if (listM133189e.isEmpty()) {
                throw new IllegalArgumentException("No valid URL found in: " + str);
            }
            m133187c("Step 1: split into " + listM133189e.size() + " URLs");
            if (!this.f109665g) {
                URI uri = new URI(listM133189e.get(0));
                m133187c("using legacy mode: " + uri.getHost() + ":" + uri.getPort());
                return this.f109664f.createSocket(uri.getHost(), uri.getPort());
            }
            List<AddressRecord> listM133188d = m133188d(listM133189e);
            if (listM133188d.isEmpty()) {
                throw new IOException("No addresses resolved from: " + str);
            }
            m133187c("Step 2: resolved to " + listM133188d.size() + " IP addresses");
            Socket socketM75523d = this.f109660b.m75523d(listM133188d);
            socketM75523d.setSoTimeout(0);
            m133187c("Step 3: connection successful");
            return socketM75523d;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m133187c("connection failed - " + e.getMessage());
            throw new IOException("Socket creation failed", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m133187c(String str) {
        gkh0.m126627j("[live][longlink]", "HappyEyeballsSocketFactoryImpl: " + str);
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(String str, int i) throws IOException {
        if (str != null && (str.contains("://") || str.contains(Constants.PACKNAME_END))) {
            return mo133186a(str);
        }
        return mo133186a("tcp://" + str + ":" + i);
    }

    /* JADX INFO: renamed from: d */
    public final List<AddressRecord> m133188d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                URI uri = new URI(str);
                String host = uri.getHost();
                int port = uri.getPort();
                if (host == null || host.isEmpty() || port <= 0) {
                    m133187c("invalid URL: " + str);
                } else {
                    List<AddressRecord> listM163195c = this.f109662d.m163195c(host);
                    if (!listM163195c.isEmpty()) {
                        for (AddressRecord addressRecord : listM163195c) {
                            arrayList.add(new AddressRecord(addressRecord.m75515b(), addressRecord.m75517d(), port));
                        }
                        m133187c("IP " + host + " -> " + listM163195c.size() + " address(es), port=" + port);
                    } else if (o90.m163192a(host)) {
                        List<AddressRecord> listM75532b = this.f109661c.m75532b(host);
                        for (AddressRecord addressRecord2 : listM75532b) {
                            arrayList.add(new AddressRecord(addressRecord2.m75515b(), addressRecord2.m75517d(), port));
                        }
                        m133187c("domain " + host + " -> " + listM75532b.size() + " address(es), port=" + port);
                    } else {
                        m133187c("unknown address type: " + host);
                    }
                }
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                m133187c("failed to parse URL: " + str + ", error: " + e.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m133189e(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(Constants.PACKNAME_END)) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.contains("://")) {
                        strTrim = "tcp://".concat(strTrim);
                    }
                    arrayList.add(strTrim);
                }
            }
        }
        return arrayList;
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        throw new IOException("unsupported");
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        throw new IOException("unsupported");
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        throw new IOException("unsupported");
    }

    public hvk(boolean z) {
        this(z, null);
    }

    public hvk() {
        this(true, null);
    }
}
