package tech.sud.p138a.p139a;

import Sudthrow.Sudbyte;
import Sudthrow.Sudfor;
import Sudthrow.Sudnew;
import com.tencent.connect.common.Constants;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
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
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.util.StringUtil;
import org.java_websocket.WebSocket;
import p153l.aqg0;
import p153l.cug0;
import p153l.dkg0;
import p153l.dmg0;
import p153l.gzg0;
import p153l.hog0;
import p153l.iig0;
import p153l.ikg0;
import p153l.irg0;
import p153l.mjg0;
import p153l.okg0;
import p153l.ovg0;
import p153l.rrg0;
import p153l.swg0;
import p153l.trg0;
import p153l.ueg0;
import p153l.wg3;
import p153l.wrg0;
import p153l.wtq0;
import p153l.xjg0;
import p153l.ykg0;
import p153l.ypg0;
import p153l.zng0;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.component.websocket.C22556a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sudif extends trg0 implements Runnable, hog0 {

    /* JADX INFO: renamed from: a */
    public final String f208430a;

    /* JADX INFO: renamed from: b */
    protected C22556a f208431b;

    /* JADX INFO: renamed from: c */
    private swg0 f208432c;

    /* JADX INFO: renamed from: d */
    private Socket f208433d;

    /* JADX INFO: renamed from: e */
    private OutputStream f208434e;

    /* JADX INFO: renamed from: f */
    private Proxy f208435f;

    /* JADX INFO: renamed from: g */
    private Thread f208436g;

    /* JADX INFO: renamed from: h */
    private Thread f208437h;

    /* JADX INFO: renamed from: i */
    private okg0 f208438i;

    /* JADX INFO: renamed from: j */
    private Map<String, String> f208439j;

    /* JADX INFO: renamed from: k */
    private CountDownLatch f208440k;

    /* JADX INFO: renamed from: l */
    private CountDownLatch f208441l;

    /* JADX INFO: renamed from: m */
    private int f208442m;

    public Sudif(C22556a c22556a) {
        wrg0 wrg0Var = new wrg0(Collections.EMPTY_LIST, Collections.singletonList(new dkg0()));
        this.f208430a = "SudNative WebSocketClient";
        this.f208431b = null;
        this.f208432c = null;
        this.f208433d = null;
        this.f208435f = Proxy.NO_PROXY;
        this.f208440k = new CountDownLatch(1);
        this.f208441l = new CountDownLatch(1);
        this.f208431b = c22556a;
        this.f208438i = wrg0Var;
        this.f208439j = null;
        this.f208442m = NetWorkParam.DEFAULT_CONNECT_TIME_OUT;
        m192494a(false);
        m192496b(false);
        this.f208432c = new swg0(this, wrg0Var);
        C22550f.m223104c("SudNative WebSocketClient", "created WebSocketClient");
    }

    /* JADX INFO: renamed from: c */
    public static void m222779c(Sudif sudif) {
        sudif.getClass();
        try {
            Socket socket = sudif.f208433d;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            sudif.mo151529a((hog0) sudif, (Exception) e);
        }
    }

    public final int Suddo() {
        int iM223162e = this.f208431b.m223162e();
        if (iM223162e != -1) {
            return iM223162e;
        }
        String strM223158a = this.f208431b.m223158a();
        if ("wss".equals(strM223158a)) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        if ("ws".equals(strM223158a)) {
            return 80;
        }
        ypg0.m217021a("unknown scheme: ", strM223158a);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Sudif() throws Sudnew {
        String strM223160c = this.f208431b.m223160c();
        String strM223161d = this.f208431b.m223161d();
        if (strM223160c == null || strM223160c.length() == 0) {
            strM223160c = "/";
        }
        if (strM223161d != null) {
            strM223160c = strM223160c + '?' + strM223161d;
        }
        int iSuddo = Suddo();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f208431b.m223159b());
        sb.append((iSuddo == 80 || iSuddo == 443) ? "" : dmg0.m116959a(iSuddo, ":"));
        String string = sb.toString();
        irg0 irg0Var = new irg0();
        irg0Var.f116559b = strM223160c;
        irg0Var.f139094a.put("Host", string);
        Map<String, String> map = this.f208439j;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                irg0Var.f139094a.put(entry.getKey(), entry.getValue());
            }
        }
        swg0 swg0Var = this.f208432c;
        wrg0 wrg0Var = swg0Var.f170967e;
        wrg0Var.getClass();
        irg0Var.f139094a.put("Upgrade", "websocket");
        irg0Var.f139094a.put(HttpHeaders.CONNECTION, "Upgrade");
        byte[] bArr = new byte[16];
        wrg0Var.f190521i.nextBytes(bArr);
        irg0Var.f139094a.put("Sec-WebSocket-Key", ikg0.m140290a(bArr));
        irg0Var.f139094a.put("Sec-WebSocket-Version", Constants.VIA_REPORT_TYPE_JOININ_GROUP);
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = wrg0Var.f190515c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((ykg0) obj).getClass();
        }
        if (sb2.length() != 0) {
            irg0Var.f139094a.put("Sec-WebSocket-Extensions", sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = wrg0Var.f190517e;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((dkg0) obj2).getClass();
        }
        if (sb3.length() != 0) {
            irg0Var.f139094a.put("Sec-WebSocket-Protocol", sb3.toString());
        }
        swg0Var.f170970h = irg0Var;
        String str = irg0Var.f116559b;
        if (!swg0.f170962o && str == null) {
            aqg0.m99478a();
            return;
        }
        try {
            swg0Var.f170964b.m151534a((hog0) swg0Var, (xjg0) irg0Var);
            wrg0 wrg0Var2 = swg0Var.f170967e;
            irg0 irg0Var2 = swg0Var.f170970h;
            wrg0Var2.getClass();
            StringBuilder sb4 = new StringBuilder(100);
            if (irg0Var2 != 0) {
                sb4.append("GET ");
                sb4.append(irg0Var2.f116559b);
                sb4.append(" HTTP/1.1");
            } else if (!(irg0Var2 instanceof gzg0)) {
                wg3.m206174a("unknown role");
                return;
            } else {
                sb4.append("HTTP/1.1 101 ");
                sb4.append(((zng0) ((gzg0) irg0Var2)).f205197b);
            }
            sb4.append("\r\n");
            for (String str2 : Collections.unmodifiableSet(irg0Var2.f139094a.keySet())) {
                String strM160551a = irg0Var2.m160551a(str2);
                sb4.append(str2);
                sb4.append(": ");
                sb4.append(strM160551a);
                sb4.append("\r\n");
            }
            sb4.append("\r\n");
            String string2 = sb4.toString();
            CodingErrorAction codingErrorAction = rrg0.f164578a;
            try {
                byte[] bytes = string2.getBytes("ASCII");
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length);
                byteBufferAllocate.put(bytes);
                byteBufferAllocate.flip();
                swg0Var.m188323g(Collections.singletonList(byteBufferAllocate));
            } catch (UnsupportedEncodingException e) {
                iig0.m140070a(e);
            }
        } catch (Sudfor unused) {
            throw new Sudnew("Handshake data rejected by client.");
        } catch (RuntimeException e2) {
            swg0Var.f170964b.mo151529a(swg0Var, e2);
            throw new Sudnew("rejected because of" + e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo222782a(Exception exc);

    /* JADX INFO: renamed from: a */
    public void m222783a(String str) {
        swg0 swg0Var = this.f208432c;
        if (str == null) {
            swg0Var.getClass();
            wg3.m206174a("Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        wrg0 wrg0Var = swg0Var.f170967e;
        boolean z = swg0Var.f170968f == 1;
        wrg0Var.getClass();
        ovg0 ovg0Var = new ovg0();
        CodingErrorAction codingErrorAction = rrg0.f164578a;
        try {
            ovg0Var.f152434c = ByteBuffer.wrap(str.getBytes(StringUtil.__UTF8Alt));
            ovg0Var.f152435d = z;
            try {
                ovg0Var.mo122951a();
                swg0Var.m188319c(Collections.singletonList(ovg0Var));
            } catch (Sudfor e) {
                throw new Sudbyte(e);
            }
        } catch (UnsupportedEncodingException e2) {
            iig0.m140070a(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo222784a(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: a */
    public abstract void mo222785a(gzg0 gzg0Var);

    /* JADX INFO: renamed from: b */
    public InetAddress m222787b(String str) throws UnknownHostException {
        InetAddress[] allByName = InetAddress.getAllByName(str);
        InetAddress inetAddress = null;
        if (allByName != null && allByName.length > 0) {
            for (int i = 0; i < allByName.length; i++) {
                InetAddress inetAddress2 = allByName[i];
                if (i == 0) {
                    StringBuilder sb = new StringBuilder("getInetAddressPriorityIpv4 原本应该连接的第一位InetAddress:");
                    sb.append(inetAddress2 == null ? "null" : inetAddress2.toString());
                    C22550f.m223104c("SudNative WebSocketClient", sb.toString());
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
        C22550f.m223104c("SudNative WebSocketClient", sb2.toString());
        return inetAddress;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo222788b(int i, String str, boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo222789c(String str);

    /* JADX INFO: renamed from: f */
    public void m222790f() {
        if (this.f208437h != null) {
            wtq0.m207906a("WebSocketClient objects are not reuseable");
            return;
        }
        Thread thread = new Thread(this);
        this.f208437h = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f208437h.getId());
        this.f208437h.start();
    }

    /* JADX INFO: renamed from: g */
    public void m222791g() {
        if (this.f208436g != null) {
            this.f208432c.m188317a(1000, "", false);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m222792h() {
        return this.f208432c.f170966d == 5;
    }

    /* JADX INFO: renamed from: i */
    public boolean m222793i() {
        return this.f208432c.f170966d == 4;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        int i;
        try {
            Socket socket = this.f208433d;
            if (socket == null) {
                this.f208433d = new Socket(this.f208435f);
                z = true;
            } else {
                if (socket.isClosed()) {
                    throw new IOException();
                }
                z = false;
            }
            this.f208433d.setTcpNoDelay(m192498d());
            this.f208433d.setReuseAddress(m192499e());
            if (!this.f208433d.isBound()) {
                C22550f.m223104c("SudNative WebSocketClient", "connect start host:" + this.f208431b.m223159b() + " port:" + Suddo());
                InetAddress inetAddressM222787b = m222787b(this.f208431b.m223159b());
                this.f208433d.connect(inetAddressM222787b == null ? new InetSocketAddress(this.f208431b.m223159b(), Suddo()) : new InetSocketAddress(inetAddressM222787b, Suddo()), this.f208442m);
                C22550f.m223104c("SudNative WebSocketClient", "connect end host:" + this.f208431b.m223159b() + " port:" + Suddo());
            }
            if (z && "wss".equals(this.f208431b.m223158a())) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                Socket socketCreateSocket = sSLContext.getSocketFactory().createSocket(this.f208433d, this.f208431b.m223159b(), Suddo(), true);
                this.f208433d = socketCreateSocket;
                if (socketCreateSocket instanceof SSLSocket) {
                    SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    sSLParameters.setServerNames(Collections.singletonList(new SNIHostName(this.f208431b.m223159b())));
                    sSLSocket.setSSLParameters(sSLParameters);
                }
            }
            InputStream inputStream = this.f208433d.getInputStream();
            this.f208434e = this.f208433d.getOutputStream();
            Sudif();
            Thread thread = new Thread(new Suddo(this));
            this.f208436g = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!m222793i() && !m222792h() && (i = inputStream.read(bArr)) != -1) {
                try {
                    this.f208432c.m188318b(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e) {
                    if (e instanceof SSLException) {
                        mo222782a(e);
                    }
                    swg0 swg0Var = this.f208432c;
                    if (swg0Var.f170966d == 1) {
                        swg0Var.m188321e(-1, "", true);
                    } else if (swg0Var.f170965c) {
                        swg0Var.m188321e(swg0Var.f170972j.intValue(), swg0Var.f170971i, swg0Var.f170973k.booleanValue());
                    } else {
                        swg0Var.f170967e.getClass();
                        swg0Var.f170967e.getClass();
                        swg0Var.m188321e(1006, "", true);
                    }
                } catch (RuntimeException e2) {
                    mo222782a(e2);
                    this.f208432c.m188321e(1006, e2.getMessage(), false);
                }
            }
            swg0 swg0Var2 = this.f208432c;
            if (swg0Var2.f170966d == 1) {
                swg0Var2.m188321e(-1, "", true);
            } else if (swg0Var2.f170965c) {
                swg0Var2.m188321e(swg0Var2.f170972j.intValue(), swg0Var2.f170971i, swg0Var2.f170973k.booleanValue());
            } else {
                swg0Var2.f170967e.getClass();
                swg0Var2.f170967e.getClass();
                swg0Var2.m188321e(1006, "", true);
            }
            this.f208437h = null;
        } catch (Exception e3) {
            mo151529a(this.f208432c, e3);
            this.f208432c.m188321e(-1, e3.getMessage(), false);
        }
    }

    @Override // p153l.trg0
    /* JADX INFO: renamed from: c */
    public Collection<hog0> mo192497c() {
        return Collections.singletonList(this.f208432c);
    }

    /* JADX INFO: renamed from: a */
    public void m222781a(int i, String str, boolean z) {
    }

    /* JADX INFO: renamed from: a */
    public void m222780a(int i, String str) {
    }

    /* JADX INFO: renamed from: a */
    public void m222786a(byte[] bArr) {
        swg0 swg0Var = this.f208432c;
        swg0Var.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap != null) {
            wrg0 wrg0Var = swg0Var.f170967e;
            boolean z = swg0Var.f170968f == 1;
            wrg0Var.getClass();
            mjg0 mjg0Var = new mjg0();
            mjg0Var.f152434c = byteBufferWrap;
            mjg0Var.f152435d = z;
            swg0Var.m188319c(Collections.singletonList(mjg0Var));
            return;
        }
        wg3.m206174a("Cannot send 'null' data to a WebSocketImpl.");
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public final void mo151530a(hog0 hog0Var, String str) {
        mo222789c(str);
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public final void mo151531a(hog0 hog0Var, ByteBuffer byteBuffer) {
        mo222784a(byteBuffer);
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public final void mo151532a(hog0 hog0Var, cug0 cug0Var) {
        m192495b();
        mo222785a((gzg0) cug0Var);
        this.f208440k.countDown();
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public final void mo151528a(hog0 hog0Var, int i, String str, boolean z) {
        m192493a();
        Thread thread = this.f208436g;
        if (thread != null) {
            thread.interrupt();
        }
        mo222788b(i, str, z);
        this.f208440k.countDown();
        this.f208441l.countDown();
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: b */
    public void mo151536b(hog0 hog0Var, int i, String str, boolean z) {
        m222781a(i, str, z);
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public final void mo151529a(hog0 hog0Var, Exception exc) {
        mo222782a(exc);
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public final void mo151526a(hog0 hog0Var) {
    }

    @Override // p153l.kug0
    /* JADX INFO: renamed from: a */
    public void mo151527a(hog0 hog0Var, int i, String str) {
        m222780a(i, str);
    }

    @Override // p153l.hog0
    /* JADX INFO: renamed from: a */
    public void mo136419a(ueg0 ueg0Var) {
        swg0 swg0Var = this.f208432c;
        swg0Var.getClass();
        swg0Var.m188319c(Collections.singletonList(ueg0Var));
    }

    /* JADX INFO: renamed from: a */
    public static void m222777a(Sudif sudif, IOException iOException) {
        if (iOException instanceof SSLException) {
            sudif.mo222782a(iOException);
        }
        swg0 swg0Var = sudif.f208432c;
        if (swg0Var.f170966d == 1) {
            swg0Var.m188321e(-1, "", true);
        } else {
            if (swg0Var.f170965c) {
                swg0Var.m188321e(swg0Var.f170972j.intValue(), swg0Var.f170971i, swg0Var.f170973k.booleanValue());
                return;
            }
            swg0Var.f170967e.getClass();
            swg0Var.f170967e.getClass();
            swg0Var.m188321e(1006, "", true);
        }
    }
}
