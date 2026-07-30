package p002l;

import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.AddressRecord;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C0478a;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C0479b;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C0480c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import l.gkh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hvk extends SocketFactory implements kwt {

    /* JADX INFO: renamed from: a */
    public final fvk f12290a;

    /* JADX INFO: renamed from: b */
    public final C0478a f12291b;

    /* JADX INFO: renamed from: c */
    public final C0479b f12292c;

    /* JADX INFO: renamed from: d */
    public final o90 f12293d;

    /* JADX INFO: renamed from: e */
    public final C0480c f12294e;

    /* JADX INFO: renamed from: f */
    public final mar f12295f;

    /* JADX INFO: renamed from: g */
    public final boolean f12296g;

    public hvk(boolean z, fvk fvkVar) {
        this.f12296g = z;
        if (!z) {
            this.f12290a = null;
            this.f12294e = null;
            this.f12292c = null;
            this.f12293d = null;
            this.f12291b = null;
            this.f12295f = new mar();
            m14855c("using legacy implementation");
            return;
        }
        fvkVar = fvkVar == null ? m14853b() : fvkVar;
        this.f12290a = fvkVar;
        C0480c c0480c = new C0480c();
        this.f12294e = c0480c;
        this.f12292c = new C0479b(fvkVar, c0480c);
        this.f12293d = new o90();
        this.f12291b = new C0478a(fvkVar, c0480c);
        this.f12295f = null;
        m14855c("Happy Eyeballs enabled");
    }

    /* JADX INFO: renamed from: b */
    public static fvk m14853b() {
        return new fvk.C0579a().m13500k(300).m13498i(10000).m13499j(50).m13497h(true).m13496g(5000).m13495f();
    }

    @Override // p002l.kwt
    /* JADX INFO: renamed from: a */
    public Socket mo14854a(String str) throws IOException {
        try {
            List<String> listM14857e = m14857e(str);
            if (listM14857e.isEmpty()) {
                throw new IllegalArgumentException("No valid URL found in: " + str);
            }
            m14855c("Step 1: split into " + listM14857e.size() + " URLs");
            if (!this.f12296g) {
                URI uri = new URI(listM14857e.get(0));
                m14855c("using legacy mode: " + uri.getHost() + ":" + uri.getPort());
                return this.f12295f.createSocket(uri.getHost(), uri.getPort());
            }
            List<AddressRecord> listM14856d = m14856d(listM14857e);
            if (listM14856d.isEmpty()) {
                throw new IOException("No addresses resolved from: " + str);
            }
            m14855c("Step 2: resolved to " + listM14856d.size() + " IP addresses");
            Socket socketM9158d = this.f12291b.m9158d(listM14856d);
            socketM9158d.setSoTimeout(0);
            m14855c("Step 3: connection successful");
            return socketM9158d;
        } catch (Exception e) {
            CrashHelper.c(e);
            m14855c("connection failed - " + e.getMessage());
            throw new IOException("Socket creation failed", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14855c(String str) {
        gkh0.j("[live][longlink]", "HappyEyeballsSocketFactoryImpl: " + str);
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(String str, int i) throws IOException {
        if (str != null && (str.contains("://") || str.contains(";"))) {
            return mo14854a(str);
        }
        return mo14854a("tcp://" + str + ":" + i);
    }

    /* JADX INFO: renamed from: d */
    public final List<AddressRecord> m14856d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                URI uri = new URI(str);
                String host = uri.getHost();
                int port = uri.getPort();
                if (host == null || host.isEmpty() || port <= 0) {
                    m14855c("invalid URL: " + str);
                } else {
                    List<AddressRecord> listM19328c = this.f12293d.m19328c(host);
                    if (!listM19328c.isEmpty()) {
                        for (AddressRecord addressRecord : listM19328c) {
                            arrayList.add(new AddressRecord(addressRecord.m9150b(), addressRecord.m9152d(), port));
                        }
                        m14855c("IP " + host + " -> " + listM19328c.size() + " address(es), port=" + port);
                    } else if (o90.m19325a(host)) {
                        List<AddressRecord> listM9167b = this.f12292c.m9167b(host);
                        for (AddressRecord addressRecord2 : listM9167b) {
                            arrayList.add(new AddressRecord(addressRecord2.m9150b(), addressRecord2.m9152d(), port));
                        }
                        m14855c("domain " + host + " -> " + listM9167b.size() + " address(es), port=" + port);
                    } else {
                        m14855c("unknown address type: " + host);
                    }
                }
            } catch (Exception e) {
                CrashHelper.c(e);
                m14855c("failed to parse URL: " + str + ", error: " + e.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m14857e(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split(";")) {
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
