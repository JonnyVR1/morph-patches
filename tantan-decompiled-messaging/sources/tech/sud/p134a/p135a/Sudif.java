package tech.sud.p134a.p135a;

import Sudthrow.Sudbyte;
import Sudthrow.Sudfor;
import Sudthrow.Sudnew;
import com.tencent.connect.common.Constants;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
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
import org.eclipse.jetty.util.StringUtil;
import org.java_websocket.WebSocket;
import p149l.aag0;
import p149l.acg0;
import p149l.ajg0;
import p149l.ebg0;
import p149l.gcg0;
import p149l.gng0;
import p149l.ig3;
import p149l.jjg0;
import p149l.kog0;
import p149l.ljg0;
import p149l.m6g0;
import p149l.ojg0;
import p149l.pbg0;
import p149l.qcg0;
import p149l.qhg0;
import p149l.qkq0;
import p149l.rfg0;
import p149l.shg0;
import p149l.ulg0;
import p149l.vbg0;
import p149l.vdg0;
import p149l.yqg0;
import p149l.zfg0;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.component.websocket.C22441a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sudif extends ljg0 implements Runnable, zfg0 {

    /* JADX INFO: renamed from: a */
    public final String f207508a;

    /* JADX INFO: renamed from: b */
    protected C22441a f207509b;

    /* JADX INFO: renamed from: c */
    private kog0 f207510c;

    /* JADX INFO: renamed from: d */
    private Socket f207511d;

    /* JADX INFO: renamed from: e */
    private OutputStream f207512e;

    /* JADX INFO: renamed from: f */
    private Proxy f207513f;

    /* JADX INFO: renamed from: g */
    private Thread f207514g;

    /* JADX INFO: renamed from: h */
    private Thread f207515h;

    /* JADX INFO: renamed from: i */
    private gcg0 f207516i;

    /* JADX INFO: renamed from: j */
    private Map<String, String> f207517j;

    /* JADX INFO: renamed from: k */
    private CountDownLatch f207518k;

    /* JADX INFO: renamed from: l */
    private CountDownLatch f207519l;

    /* JADX INFO: renamed from: m */
    private int f207520m;

    public Sudif(C22441a c22441a) {
        ojg0 ojg0Var = new ojg0(Collections.EMPTY_LIST, Collections.singletonList(new vbg0()));
        this.f207508a = "SudNative WebSocketClient";
        this.f207509b = null;
        this.f207510c = null;
        this.f207511d = null;
        this.f207513f = Proxy.NO_PROXY;
        this.f207518k = new CountDownLatch(1);
        this.f207519l = new CountDownLatch(1);
        this.f207509b = c22441a;
        this.f207516i = ojg0Var;
        this.f207517j = null;
        this.f207520m = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        m149974a(false);
        m149976b(false);
        this.f207510c = new kog0(this, ojg0Var);
        C22435f.m221858c("SudNative WebSocketClient", "created WebSocketClient");
    }

    /* JADX INFO: renamed from: c */
    public static void m221533c(Sudif sudif) {
        sudif.getClass();
        try {
            Socket socket = sudif.f207511d;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            sudif.mo107633a((zfg0) sudif, (Exception) e);
        }
    }

    public final int Suddo() {
        int iM221916e = this.f207509b.m221916e();
        if (iM221916e != -1) {
            return iM221916e;
        }
        String strM221912a = this.f207509b.m221912a();
        if ("wss".equals(strM221912a)) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        if ("ws".equals(strM221912a)) {
            return 80;
        }
        qhg0.m174539a("unknown scheme: ", strM221912a);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Sudif() throws Sudnew {
        String strM221914c = this.f207509b.m221914c();
        String strM221915d = this.f207509b.m221915d();
        if (strM221914c == null || strM221914c.length() == 0) {
            strM221914c = "/";
        }
        if (strM221915d != null) {
            strM221914c = strM221914c + '?' + strM221915d;
        }
        int iSuddo = Suddo();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f207509b.m221913b());
        sb.append((iSuddo == 80 || iSuddo == 443) ? "" : vdg0.m197997a(iSuddo, ":"));
        String string = sb.toString();
        ajg0 ajg0Var = new ajg0();
        ajg0Var.f70114b = strM221914c;
        ajg0Var.f92442a.put("Host", string);
        Map<String, String> map = this.f207517j;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                ajg0Var.f92442a.put(entry.getKey(), entry.getValue());
            }
        }
        kog0 kog0Var = this.f207510c;
        ojg0 ojg0Var = kog0Var.f124005e;
        ojg0Var.getClass();
        ajg0Var.f92442a.put("Upgrade", "websocket");
        ajg0Var.f92442a.put("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        ojg0Var.f144284i.nextBytes(bArr);
        ajg0Var.f92442a.put("Sec-WebSocket-Key", acg0.m95722a(bArr));
        ajg0Var.f92442a.put("Sec-WebSocket-Version", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = ojg0Var.f144278c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((qcg0) obj).getClass();
        }
        if (sb2.length() != 0) {
            ajg0Var.f92442a.put("Sec-WebSocket-Extensions", sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = ojg0Var.f144280e;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((vbg0) obj2).getClass();
        }
        if (sb3.length() != 0) {
            ajg0Var.f92442a.put("Sec-WebSocket-Protocol", sb3.toString());
        }
        kog0Var.f124008h = ajg0Var;
        String str = ajg0Var.f70114b;
        if (!kog0.f124000o && str == null) {
            shg0.m184191a();
            return;
        }
        try {
            kog0Var.f124002b.m107637a((zfg0) kog0Var, (pbg0) ajg0Var);
            ojg0 ojg0Var2 = kog0Var.f124005e;
            ajg0 ajg0Var2 = kog0Var.f124008h;
            ojg0Var2.getClass();
            StringBuilder sb4 = new StringBuilder(100);
            if (ajg0Var2 != 0) {
                sb4.append("GET ");
                sb4.append(ajg0Var2.f70114b);
                sb4.append(" HTTP/1.1");
            } else if (!(ajg0Var2 instanceof yqg0)) {
                ig3.m135964a("unknown role");
                return;
            } else {
                sb4.append("HTTP/1.1 101 ");
                sb4.append(((rfg0) ((yqg0) ajg0Var2)).f159148b);
            }
            sb4.append("\r\n");
            for (String str2 : Collections.unmodifiableSet(ajg0Var2.f92442a.keySet())) {
                String strM117339a = ajg0Var2.m117339a(str2);
                sb4.append(str2);
                sb4.append(": ");
                sb4.append(strM117339a);
                sb4.append("\r\n");
            }
            sb4.append("\r\n");
            String string2 = sb4.toString();
            CodingErrorAction codingErrorAction = jjg0.f118294a;
            try {
                byte[] bytes = string2.getBytes("ASCII");
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
                byteBufferAllocate.put(bytes);
                byteBufferAllocate.flip();
                kog0Var.m146713g(Collections.singletonList(byteBufferAllocate));
            } catch (UnsupportedEncodingException e) {
                aag0.m95543a(e);
            }
        } catch (Sudfor unused) {
            throw new Sudnew("Handshake data rejected by client.");
        } catch (RuntimeException e2) {
            kog0Var.f124002b.mo107633a(kog0Var, e2);
            throw new Sudnew("rejected because of" + e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo221536a(Exception exc);

    /* JADX INFO: renamed from: a */
    public void m221537a(String str) {
        kog0 kog0Var = this.f207510c;
        if (str == null) {
            kog0Var.getClass();
            ig3.m135964a("Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        ojg0 ojg0Var = kog0Var.f124005e;
        boolean z = kog0Var.f124006f == 1;
        ojg0Var.getClass();
        gng0 gng0Var = new gng0();
        CodingErrorAction codingErrorAction = jjg0.f118294a;
        try {
            gng0Var.f106582c = ByteBuffer.wrap(str.getBytes(StringUtil.__UTF8Alt));
            gng0Var.f106583d = z;
            try {
                gng0Var.mo127138a();
                kog0Var.m146709c(Collections.singletonList(gng0Var));
            } catch (Sudfor e) {
                throw new Sudbyte(e);
            }
        } catch (UnsupportedEncodingException e2) {
            aag0.m95543a(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo221538a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: a */
    public abstract void mo221539a(yqg0 yqg0Var);

    /* JADX INFO: renamed from: b */
    public InetAddress m221541b(String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        InetAddress inetAddress = null;
        if (allByName != null && allByName.length > 0) {
            for (int i = 0; i < allByName.length; i++) {
                InetAddress inetAddress2 = allByName[i];
                if (i == 0) {
                    StringBuilder sb = new StringBuilder("getInetAddressPriorityIpv4 原本应该连接的第一位InetAddress:");
                    sb.append(inetAddress2 == null ? "null" : inetAddress2.toString());
                    C22435f.m221858c("SudNative WebSocketClient", sb.toString());
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
        C22435f.m221858c("SudNative WebSocketClient", sb2.toString());
        return inetAddress;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo221542b(int i, String str, boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo221543c(String str);

    /* JADX INFO: renamed from: f */
    public void m221544f() {
        if (this.f207515h != null) {
            qkq0.m175383a("WebSocketClient objects are not reuseable");
            return;
        }
        Thread thread = new Thread(this);
        this.f207515h = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f207515h.getId());
        this.f207515h.start();
    }

    /* JADX INFO: renamed from: g */
    public void m221545g() {
        if (this.f207514g != null) {
            this.f207510c.m146706a(1000, "", false);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m221546h() {
        return this.f207510c.f124004d == 5;
    }

    /* JADX INFO: renamed from: i */
    public boolean m221547i() {
        return this.f207510c.f124004d == 4;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        int i;
        try {
            Socket socket = this.f207511d;
            if (socket == null) {
                this.f207511d = new Socket(this.f207513f);
                z = true;
            } else {
                if (socket.isClosed()) {
                    throw new IOException();
                }
                z = false;
            }
            this.f207511d.setTcpNoDelay(m149978d());
            this.f207511d.setReuseAddress(m149979e());
            if (!this.f207511d.isBound()) {
                C22435f.m221858c("SudNative WebSocketClient", "connect start host:" + this.f207509b.m221913b() + " port:" + Suddo());
                InetAddress inetAddressM221541b = m221541b(this.f207509b.m221913b());
                this.f207511d.connect(inetAddressM221541b == null ? new InetSocketAddress(this.f207509b.m221913b(), Suddo()) : new InetSocketAddress(inetAddressM221541b, Suddo()), this.f207520m);
                C22435f.m221858c("SudNative WebSocketClient", "connect end host:" + this.f207509b.m221913b() + " port:" + Suddo());
            }
            if (z && "wss".equals(this.f207509b.m221912a())) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                Socket socketCreateSocket = sSLContext.getSocketFactory().createSocket(this.f207511d, this.f207509b.m221913b(), Suddo(), true);
                this.f207511d = socketCreateSocket;
                if (socketCreateSocket instanceof SSLSocket) {
                    SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(this.f207509b.m221913b())));
                    sSLSocket.setSSLParameters(sSLParameters);
                }
            }
            InputStream inputStream = this.f207511d.getInputStream();
            this.f207512e = this.f207511d.getOutputStream();
            Sudif();
            Thread thread = new Thread(new Suddo(this));
            this.f207514g = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!m221547i() && !m221546h() && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.f207510c.m146708b(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    if (e instanceof SSLException) {
                        mo221536a(e);
                    }
                    kog0 kog0Var = this.f207510c;
                    if (kog0Var.f124004d == 1) {
                        kog0Var.m146711e(-1, "", true);
                    } else if (kog0Var.f124003c) {
                        kog0Var.m146711e(kog0Var.f124010j.intValue(), kog0Var.f124009i, kog0Var.f124011k.booleanValue());
                    } else {
                        kog0Var.f124005e.getClass();
                        kog0Var.f124005e.getClass();
                        kog0Var.m146711e(1006, "", true);
                    }
                } catch (RuntimeException e2) {
                    mo221536a(e2);
                    this.f207510c.m146711e(1006, e2.getMessage(), false);
                }
            }
            kog0 kog0Var2 = this.f207510c;
            if (kog0Var2.f124004d == 1) {
                kog0Var2.m146711e(-1, "", true);
            } else if (kog0Var2.f124003c) {
                kog0Var2.m146711e(kog0Var2.f124010j.intValue(), kog0Var2.f124009i, kog0Var2.f124011k.booleanValue());
            } else {
                kog0Var2.f124005e.getClass();
                kog0Var2.f124005e.getClass();
                kog0Var2.m146711e(1006, "", true);
            }
            this.f207515h = null;
        } catch (Exception e3) {
            mo107633a(this.f207510c, e3);
            this.f207510c.m146711e(-1, e3.getMessage(), false);
        }
    }

    @Override // p149l.ljg0
    /* JADX INFO: renamed from: c */
    public Collection<zfg0> mo149977c() {
        return Collections.singletonList(this.f207510c);
    }

    /* JADX INFO: renamed from: a */
    public void m221535a(int i, String str, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void m221534a(int i, String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m221540a(byte[] bArr) {
        kog0 kog0Var = this.f207510c;
        kog0Var.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap != null) {
            ojg0 ojg0Var = kog0Var.f124005e;
            boolean z = kog0Var.f124006f == 1;
            ojg0Var.getClass();
            ebg0 ebg0Var = new ebg0();
            ebg0Var.f106582c = byteBufferWrap;
            ebg0Var.f106583d = z;
            kog0Var.m146709c(Collections.singletonList(ebg0Var));
            return;
        }
        ig3.m135964a("Cannot send 'null' data to a WebSocketImpl.");
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public final void mo107634a(zfg0 zfg0Var, String str) {
        mo221543c(str);
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public final void mo107635a(zfg0 zfg0Var, ByteBuffer byteBuffer) {
        mo221538a(byteBuffer);
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public final void mo107639a(zfg0 zfg0Var, ulg0 ulg0Var) {
        m149975b();
        mo221539a((yqg0) ulg0Var);
        this.f207518k.countDown();
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public final void mo107632a(zfg0 zfg0Var, int i, String str, boolean z) {
        m149973a();
        Thread thread = this.f207514g;
        if (thread != null) {
            thread.interrupt();
        }
        mo221542b(i, str, z);
        this.f207518k.countDown();
        this.f207519l.countDown();
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: b */
    public void mo107640b(zfg0 zfg0Var, int i, String str, boolean z) {
        m221535a(i, str, z);
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public final void mo107633a(zfg0 zfg0Var, Exception exc) {
        mo221536a(exc);
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public final void mo107630a(zfg0 zfg0Var) {
    }

    @Override // p149l.cmg0
    /* JADX INFO: renamed from: a */
    public void mo107631a(zfg0 zfg0Var, int i, String str) {
        m221534a(i, str);
    }

    @Override // p149l.zfg0
    /* JADX INFO: renamed from: a */
    public void mo146707a(m6g0 m6g0Var) {
        kog0 kog0Var = this.f207510c;
        kog0Var.getClass();
        kog0Var.m146709c(Collections.singletonList(m6g0Var));
    }

    /* JADX INFO: renamed from: a */
    public static void m221531a(Sudif sudif, IOException iOException) {
        if (iOException instanceof SSLException) {
            sudif.mo221536a(iOException);
        }
        kog0 kog0Var = sudif.f207510c;
        if (kog0Var.f124004d == 1) {
            kog0Var.m146711e(-1, "", true);
        } else {
            if (kog0Var.f124003c) {
                kog0Var.m146711e(kog0Var.f124010j.intValue(), kog0Var.f124009i, kog0Var.f124011k.booleanValue());
                return;
            }
            kog0Var.f124005e.getClass();
            kog0Var.f124005e.getClass();
            kog0Var.m146711e(1006, "", true);
        }
    }
}
