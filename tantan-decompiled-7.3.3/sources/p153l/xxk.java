package p153l;

import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.AddressRecord;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C13052a;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C13053b;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.connection.happyeyeballs.C13054c;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes5.dex */
public class xxk extends SocketFactory implements lyt {

    /* JADX INFO: renamed from: a */
    public final vxk f196652a;

    /* JADX INFO: renamed from: b */
    public final C13052a f196653b;

    /* JADX INFO: renamed from: c */
    public final C13053b f196654c;

    /* JADX INFO: renamed from: d */
    public final k90 f196655d;

    /* JADX INFO: renamed from: e */
    public final C13054c f196656e;

    /* JADX INFO: renamed from: f */
    public final ocr f196657f;

    /* JADX INFO: renamed from: g */
    public final boolean f196658g;

    public xxk(boolean z, vxk vxkVar) {
        this.f196658g = z;
        if (!z) {
            this.f196652a = null;
            this.f196656e = null;
            this.f196654c = null;
            this.f196655d = null;
            this.f196653b = null;
            this.f196657f = new ocr();
            m213547c("using legacy implementation");
            return;
        }
        vxkVar = vxkVar == null ? m213546b() : vxkVar;
        this.f196652a = vxkVar;
        C13054c c13054c = new C13054c();
        this.f196656e = c13054c;
        this.f196654c = new C13053b(vxkVar, c13054c);
        this.f196655d = new k90();
        this.f196653b = new C13052a(vxkVar, c13054c);
        this.f196657f = null;
        m213547c("Happy Eyeballs enabled");
    }

    /* JADX INFO: renamed from: b */
    public static vxk m213546b() {
        return new vxk.C20953a().m203862k(300).m203860i(10000).m203861j(50).m203859h(true).m203858g(5000).m203857f();
    }

    @Override // p153l.lyt
    /* JADX INFO: renamed from: a */
    public Socket mo156386a(String str) throws IOException {
        try {
            List<String> listM213549e = m213549e(str);
            if (listM213549e.isEmpty()) {
                throw new IllegalArgumentException("No valid URL found in: " + str);
            }
            m213547c("Step 1: split into " + listM213549e.size() + " URLs");
            if (!this.f196658g) {
                URI uri = new URI(listM213549e.get(0));
                m213547c("using legacy mode: " + uri.getHost() + ":" + uri.getPort());
                return this.f196657f.createSocket(uri.getHost(), uri.getPort());
            }
            List<AddressRecord> listM213548d = m213548d(listM213549e);
            if (listM213548d.isEmpty()) {
                throw new IOException("No addresses resolved from: " + str);
            }
            m213547c("Step 2: resolved to " + listM213548d.size() + " IP addresses");
            Socket socketM76706d = this.f196653b.m76706d(listM213548d);
            socketM76706d.setSoTimeout(0);
            m213547c("Step 3: connection successful");
            return socketM76706d;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m213547c("connection failed - " + e.getMessage());
            throw new IOException("Socket creation failed", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m213547c(String str) {
        nsh0.m164608j("[live][longlink]", "HappyEyeballsSocketFactoryImpl: " + str);
    }

    @Override // javax.net.SocketFactory
    @Deprecated
    public Socket createSocket(String str, int i) throws IOException {
        if (str != null && (str.contains("://") || str.contains(Constants.PACKNAME_END))) {
            return mo156386a(str);
        }
        return mo156386a("tcp://" + str + ":" + i);
    }

    /* JADX INFO: renamed from: d */
    public final List<AddressRecord> m213548d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                URI uri = new URI(str);
                String host = uri.getHost();
                int port = uri.getPort();
                if (host == null || host.isEmpty() || port <= 0) {
                    m213547c("invalid URL: " + str);
                } else {
                    List<AddressRecord> listM148788c = this.f196655d.m148788c(host);
                    if (!listM148788c.isEmpty()) {
                        for (AddressRecord addressRecord : listM148788c) {
                            arrayList.add(new AddressRecord(addressRecord.m76698b(), addressRecord.m76700d(), port));
                        }
                        m213547c("IP " + host + " -> " + listM148788c.size() + " address(es), port=" + port);
                    } else if (k90.m148785a(host)) {
                        List<AddressRecord> listM76715b = this.f196654c.m76715b(host);
                        for (AddressRecord addressRecord2 : listM76715b) {
                            arrayList.add(new AddressRecord(addressRecord2.m76698b(), addressRecord2.m76700d(), port));
                        }
                        m213547c("domain " + host + " -> " + listM76715b.size() + " address(es), port=" + port);
                    } else {
                        m213547c("unknown address type: " + host);
                    }
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                m213547c("failed to parse URL: " + str + ", error: " + e.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m213549e(String str) {
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

    public xxk(boolean z) {
        this(z, null);
    }

    public xxk() {
        this(true, null);
    }
}
