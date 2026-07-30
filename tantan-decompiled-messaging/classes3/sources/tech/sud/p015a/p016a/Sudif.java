package tech.sud.p015a.p016a;

import Sudthrow.Sudbyte;
import Sudthrow.Sudfor;
import Sudthrow.Sudnew;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import l.aag0;
import l.acg0;
import l.ajg0;
import l.ebg0;
import l.eog0;
import l.gcg0;
import l.gng0;
import l.h9g0;
import l.ig3;
import l.jjg0;
import l.kog0;
import l.ljg0;
import l.m6g0;
import l.ojg0;
import l.qcg0;
import l.qkq0;
import l.rfg0;
import l.shg0;
import l.ulg0;
import l.vbg0;
import l.vdg0;
import l.yqg0;
import l.zfg0;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.util.StringUtil;
import org.java_websocket.WebSocket;
import org.java_websocket.framing.CloseFrame;
import p003l.qhg0;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.component.websocket.C1234a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class Sudif extends ljg0 implements Runnable, zfg0 {

    /* JADX INFO: renamed from: a */
    public final String f11133a;

    /* JADX INFO: renamed from: b */
    protected C1234a f11134b;

    /* JADX INFO: renamed from: c */
    private kog0 f11135c;

    /* JADX INFO: renamed from: d */
    private Socket f11136d;

    /* JADX INFO: renamed from: e */
    private OutputStream f11137e;

    /* JADX INFO: renamed from: f */
    private Proxy f11138f;

    /* JADX INFO: renamed from: g */
    private Thread f11139g;

    /* JADX INFO: renamed from: h */
    private Thread f11140h;

    /* JADX INFO: renamed from: i */
    private gcg0 f11141i;

    /* JADX INFO: renamed from: j */
    private Map<String, String> f11142j;

    /* JADX INFO: renamed from: k */
    private CountDownLatch f11143k;

    /* JADX INFO: renamed from: l */
    private CountDownLatch f11144l;

    /* JADX INFO: renamed from: m */
    private int f11145m;

    public Sudif(C1234a c1234a) {
        ojg0 ojg0Var = new ojg0(Collections.EMPTY_LIST, Collections.singletonList(new vbg0()));
        this.f11133a = "SudNative WebSocketClient";
        this.f11134b = null;
        this.f11135c = null;
        this.f11136d = null;
        this.f11138f = Proxy.NO_PROXY;
        this.f11143k = new CountDownLatch(1);
        this.f11144l = new CountDownLatch(1);
        this.f11134b = c1234a;
        this.f11141i = ojg0Var;
        this.f11142j = null;
        this.f11145m = 15000;
        a(false);
        b(false);
        this.f11135c = new kog0(this, ojg0Var);
        C1228f.m10329c("SudNative WebSocketClient", "created WebSocketClient");
    }

    /* JADX INFO: renamed from: c */
    public static void m9990c(Sudif sudif) {
        sudif.getClass();
        try {
            Socket socket = sudif.f11136d;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            sudif.m10001a((zfg0) sudif, (Exception) e);
        }
    }

    public final int Suddo() {
        int iM10387e = this.f11134b.m10387e();
        if (iM10387e != -1) {
            return iM10387e;
        }
        String strM10383a = this.f11134b.m10383a();
        if ("wss".equals(strM10383a)) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        if ("ws".equals(strM10383a)) {
            return 80;
        }
        qhg0.m7021a("unknown scheme: ", strM10383a);
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sudthrow.Sudnew */
    public final void Sudif() throws Sudnew {
        String strM10385c = this.f11134b.m10385c();
        String strM10386d = this.f11134b.m10386d();
        if (strM10385c == null || strM10385c.length() == 0) {
            strM10385c = "/";
        }
        if (strM10386d != null) {
            strM10385c = strM10385c + '?' + strM10386d;
        }
        int iSuddo = Suddo();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11134b.m10384b());
        sb.append((iSuddo == 80 || iSuddo == 443) ? "" : vdg0.a(iSuddo, ":"));
        String string = sb.toString();
        ajg0 ajg0Var = new ajg0();
        ajg0Var.b = strM10385c;
        ((eog0) ajg0Var).a.put(HttpHeaders.HOST, string);
        Map<String, String> map = this.f11142j;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ((eog0) ajg0Var).a.put(entry.getKey(), entry.getValue());
            }
        }
        kog0 kog0Var = this.f11135c;
        ojg0 ojg0Var = kog0Var.e;
        ojg0Var.getClass();
        ((eog0) ajg0Var).a.put("Upgrade", "websocket");
        ((eog0) ajg0Var).a.put(HttpHeaders.CONNECTION, "Upgrade");
        byte[] bArr = new byte[16];
        ojg0Var.i.nextBytes(bArr);
        ((eog0) ajg0Var).a.put("Sec-WebSocket-Key", acg0.a(bArr));
        ((eog0) ajg0Var).a.put("Sec-WebSocket-Version", "13");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = ojg0Var.c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((qcg0) obj).getClass();
        }
        if (sb2.length() != 0) {
            ((eog0) ajg0Var).a.put("Sec-WebSocket-Extensions", sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = ojg0Var.e;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((vbg0) obj2).getClass();
        }
        if (sb3.length() != 0) {
            ((eog0) ajg0Var).a.put("Sec-WebSocket-Protocol", sb3.toString());
        }
        kog0Var.h = ajg0Var;
        String str = ajg0Var.b;
        if (!kog0.o && str == null) {
            shg0.a();
            return;
        }
        try {
            kog0Var.b.a(kog0Var, ajg0Var);
            ojg0 ojg0Var2 = kog0Var.e;
            rfg0 rfg0Var = kog0Var.h;
            ojg0Var2.getClass();
            StringBuilder sb4 = new StringBuilder(100);
            if (rfg0Var != null) {
                sb4.append("GET ");
                sb4.append(((ajg0) rfg0Var).b);
                sb4.append(" HTTP/1.1");
            } else if (!(rfg0Var instanceof yqg0)) {
                ig3.a("unknown role");
                return;
            } else {
                sb4.append("HTTP/1.1 101 ");
                sb4.append(((yqg0) rfg0Var).b);
            }
            sb4.append("\r\n");
            for (String str2 : Collections.unmodifiableSet(((eog0) rfg0Var).a.keySet())) {
                String strA = rfg0Var.a(str2);
                sb4.append(str2);
                sb4.append(": ");
                sb4.append(strA);
                sb4.append("\r\n");
            }
            sb4.append("\r\n");
            String string2 = sb4.toString();
            CodingErrorAction codingErrorAction = jjg0.a;
            try {
                byte[] bytes = string2.getBytes("ASCII");
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
                byteBufferAllocate.put(bytes);
                byteBufferAllocate.flip();
                kog0Var.g(Collections.singletonList(byteBufferAllocate));
            } catch (UnsupportedEncodingException e) {
                aag0.a(e);
            }
        } catch (RuntimeException e2) {
            kog0Var.b.a(kog0Var, e2);
            throw new Sudnew("rejected because of" + e2);
        } catch (Sudfor unused) {
            throw new Sudnew("Handshake data rejected by client.");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9993a(Exception exc);

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sudthrow.Sudbyte */
    /* JADX INFO: renamed from: a */
    public void m9994a(String str) throws Sudbyte {
        kog0 kog0Var = this.f11135c;
        if (str == null) {
            kog0Var.getClass();
            ig3.a("Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        ojg0 ojg0Var = kog0Var.e;
        boolean z = kog0Var.f == 1;
        ojg0Var.getClass();
        gng0 gng0Var = new gng0();
        CodingErrorAction codingErrorAction = jjg0.a;
        try {
            ((h9g0) gng0Var).c = ByteBuffer.wrap(str.getBytes(StringUtil.__UTF8Alt));
            ((h9g0) gng0Var).d = z;
            try {
                gng0Var.a();
                kog0Var.c(Collections.singletonList(gng0Var));
            } catch (Sudfor e) {
                throw new Sudbyte(e);
            }
        } catch (UnsupportedEncodingException e2) {
            aag0.a(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9995a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: a */
    public abstract void mo9997a(yqg0 yqg0Var);

    /* JADX INFO: renamed from: b */
    public InetAddress m10006b(String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        InetAddress inetAddress = null;
        if (allByName != null && allByName.length > 0) {
            for (int i = 0; i < allByName.length; i++) {
                InetAddress inetAddress2 = allByName[i];
                if (i == 0) {
                    StringBuilder sb = new StringBuilder("getInetAddressPriorityIpv4 原本应该连接的第一位InetAddress:");
                    sb.append(inetAddress2 == null ? "null" : inetAddress2.toString());
                    C1228f.m10329c("SudNative WebSocketClient", sb.toString());
                }
                if (inetAddress2 instanceof Inet4Address) {
                    inetAddress = inetAddress2;
                    break;
                }
            }
            if (inetAddress == null) {
                inetAddress = allByName[0];
            }
        }
        StringBuilder sb2 = new StringBuilder("getInetAddressPriorityIpv4 调整后连接的InetAddress:");
        sb2.append(inetAddress != null ? inetAddress.toString() : "null");
        C1228f.m10329c("SudNative WebSocketClient", sb2.toString());
        return inetAddress;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10007b(int i, String str, boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo10010c(String str);

    /* JADX INFO: renamed from: f */
    public void m10011f() {
        if (this.f11140h != null) {
            qkq0.a("WebSocketClient objects are not reuseable");
            return;
        }
        Thread thread = new Thread(this);
        this.f11140h = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f11140h.getId());
        this.f11140h.start();
    }

    /* JADX INFO: renamed from: g */
    public void m10012g() {
        if (this.f11139g != null) {
            this.f11135c.a(1000, "", false);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m10013h() {
        return this.f11135c.d == 5;
    }

    /* JADX INFO: renamed from: i */
    public boolean m10014i() {
        return this.f11135c.d == 4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sudthrow.Sudnew */
    @Override // java.lang.Runnable
    public void run() throws Sudnew {
        boolean z;
        int i;
        try {
            Socket socket = this.f11136d;
            if (socket == null) {
                this.f11136d = new Socket(this.f11138f);
                z = true;
            } else {
                if (socket.isClosed()) {
                    throw new IOException();
                }
                z = false;
            }
            this.f11136d.setTcpNoDelay(d());
            this.f11136d.setReuseAddress(e());
            if (!this.f11136d.isBound()) {
                C1228f.m10329c("SudNative WebSocketClient", "connect start host:" + this.f11134b.m10384b() + " port:" + Suddo());
                InetAddress inetAddressM10006b = m10006b(this.f11134b.m10384b());
                this.f11136d.connect(inetAddressM10006b == null ? new InetSocketAddress(this.f11134b.m10384b(), Suddo()) : new InetSocketAddress(inetAddressM10006b, Suddo()), this.f11145m);
                C1228f.m10329c("SudNative WebSocketClient", "connect end host:" + this.f11134b.m10384b() + " port:" + Suddo());
            }
            if (z && "wss".equals(this.f11134b.m10383a())) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                Socket socketCreateSocket = sSLContext.getSocketFactory().createSocket(this.f11136d, this.f11134b.m10384b(), Suddo(), true);
                this.f11136d = socketCreateSocket;
                if (socketCreateSocket instanceof SSLSocket) {
                    SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(this.f11134b.m10384b())));
                    sSLSocket.setSSLParameters(sSLParameters);
                }
            }
            InputStream inputStream = this.f11136d.getInputStream();
            this.f11137e = this.f11136d.getOutputStream();
            Sudif();
            Thread thread = new Thread(new Suddo(this));
            this.f11139g = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!m10014i() && !m10013h() && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.f11135c.b(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    if (e instanceof SSLException) {
                        mo9993a(e);
                    }
                    kog0 kog0Var = this.f11135c;
                    if (kog0Var.d == 1) {
                        kog0Var.e(-1, "", true);
                    } else if (kog0Var.c) {
                        kog0Var.e(kog0Var.j.intValue(), kog0Var.i, kog0Var.k.booleanValue());
                    } else {
                        kog0Var.e.getClass();
                        kog0Var.e.getClass();
                        kog0Var.e(CloseFrame.ABNORMAL_CLOSE, "", true);
                    }
                } catch (RuntimeException e2) {
                    mo9993a(e2);
                    this.f11135c.e(CloseFrame.ABNORMAL_CLOSE, e2.getMessage(), false);
                }
            }
            kog0 kog0Var2 = this.f11135c;
            if (kog0Var2.d == 1) {
                kog0Var2.e(-1, "", true);
            } else if (kog0Var2.c) {
                kog0Var2.e(kog0Var2.j.intValue(), kog0Var2.i, kog0Var2.k.booleanValue());
            } else {
                kog0Var2.e.getClass();
                kog0Var2.e.getClass();
                kog0Var2.e(CloseFrame.ABNORMAL_CLOSE, "", true);
            }
            this.f11140h = null;
        } catch (Exception e3) {
            m10001a((zfg0) this.f11135c, e3);
            this.f11135c.e(-1, e3.getMessage(), false);
        }
    }

    /* JADX INFO: renamed from: c */
    public Collection<zfg0> m10009c() {
        return Collections.singletonList(this.f11135c);
    }

    /* JADX INFO: renamed from: a */
    public void m9992a(int i, String str, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void m9991a(int i, String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m10005a(byte[] bArr) {
        kog0 kog0Var = this.f11135c;
        kog0Var.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap != null) {
            ojg0 ojg0Var = kog0Var.e;
            boolean z = kog0Var.f == 1;
            ojg0Var.getClass();
            ebg0 ebg0Var = new ebg0();
            ((h9g0) ebg0Var).c = byteBufferWrap;
            ((h9g0) ebg0Var).d = z;
            kog0Var.c(Collections.singletonList(ebg0Var));
            return;
        }
        ig3.a("Cannot send 'null' data to a WebSocketImpl.");
    }

    /* JADX INFO: renamed from: a */
    public final void m10002a(zfg0 zfg0Var, String str) {
        mo10010c(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m10003a(zfg0 zfg0Var, ByteBuffer byteBuffer) {
        mo9995a(byteBuffer);
    }

    /* JADX INFO: renamed from: a */
    public final void m10004a(zfg0 zfg0Var, ulg0 ulg0Var) {
        b();
        mo9997a((yqg0) ulg0Var);
        this.f11143k.countDown();
    }

    /* JADX INFO: renamed from: a */
    public final void m10000a(zfg0 zfg0Var, int i, String str, boolean z) {
        a();
        Thread thread = this.f11139g;
        if (thread != null) {
            thread.interrupt();
        }
        mo10007b(i, str, z);
        this.f11143k.countDown();
        this.f11144l.countDown();
    }

    /* JADX INFO: renamed from: b */
    public void m10008b(zfg0 zfg0Var, int i, String str, boolean z) {
        m9992a(i, str, z);
    }

    /* JADX INFO: renamed from: a */
    public final void m10001a(zfg0 zfg0Var, Exception exc) {
        mo9993a(exc);
    }

    /* JADX INFO: renamed from: a */
    public final void m9998a(zfg0 zfg0Var) {
    }

    /* JADX INFO: renamed from: a */
    public void m9999a(zfg0 zfg0Var, int i, String str) {
        m9991a(i, str);
    }

    /* JADX INFO: renamed from: a */
    public void m9996a(m6g0 m6g0Var) {
        kog0 kog0Var = this.f11135c;
        kog0Var.getClass();
        kog0Var.c(Collections.singletonList(m6g0Var));
    }

    /* JADX INFO: renamed from: a */
    public static void m9988a(Sudif sudif, IOException iOException) {
        if (iOException instanceof SSLException) {
            sudif.mo9993a(iOException);
        }
        kog0 kog0Var = sudif.f11135c;
        if (kog0Var.d == 1) {
            kog0Var.e(-1, "", true);
        } else {
            if (kog0Var.c) {
                kog0Var.e(kog0Var.j.intValue(), kog0Var.i, kog0Var.k.booleanValue());
                return;
            }
            kog0Var.e.getClass();
            kog0Var.e.getClass();
            kog0Var.e(CloseFrame.ABNORMAL_CLOSE, "", true);
        }
    }
}
