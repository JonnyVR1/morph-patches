package p153l;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.C21953a;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Timeout;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class imc0 extends dml.AbstractC16582j implements bx5 {

    /* JADX INFO: renamed from: b */
    public final kmc0 f115753b;

    /* JADX INFO: renamed from: c */
    public final nnd0 f115754c;

    /* JADX INFO: renamed from: d */
    public Socket f115755d;

    /* JADX INFO: renamed from: e */
    public Socket f115756e;

    /* JADX INFO: renamed from: f */
    public txk f115757f;

    /* JADX INFO: renamed from: g */
    public Protocol f115758g;

    /* JADX INFO: renamed from: h */
    public dml f115759h;

    /* JADX INFO: renamed from: i */
    public BufferedSource f115760i;

    /* JADX INFO: renamed from: j */
    public BufferedSink f115761j;

    /* JADX INFO: renamed from: k */
    public boolean f115762k;

    /* JADX INFO: renamed from: l */
    public int f115763l;

    /* JADX INFO: renamed from: m */
    public int f115764m;

    /* JADX INFO: renamed from: n */
    public int f115765n;

    /* JADX INFO: renamed from: o */
    public int f115766o = 1;

    /* JADX INFO: renamed from: p */
    public final List<Reference<oij0>> f115767p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public long f115768q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l.imc0$a */
    public class C17742a extends jnc0.AbstractC17985f {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ n6f f115769d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17742a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, n6f n6fVar) {
            super(z, bufferedSource, bufferedSink);
            this.f115769d = n6fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f115769d.m161764a(-1L, true, true, null);
        }
    }

    public imc0(kmc0 kmc0Var, nnd0 nnd0Var) {
        this.f115753b = kmc0Var;
        this.f115754c = nnd0Var;
    }

    @Override // p153l.bx5
    /* JADX INFO: renamed from: a */
    public Protocol mo106824a() {
        return this.f115758g;
    }

    @Override // p153l.bx5
    /* JADX INFO: renamed from: b */
    public nnd0 mo106825b() {
        return this.f115754c;
    }

    @Override // p153l.bx5
    /* JADX INFO: renamed from: c */
    public txk mo106826c() {
        return this.f115757f;
    }

    @Override // p153l.bx5
    /* JADX INFO: renamed from: d */
    public Socket mo106827d() {
        return this.f115756e;
    }

    @Override // p153l.dml.AbstractC16582j
    /* JADX INFO: renamed from: e */
    public void mo117009e(dml dmlVar) {
        synchronized (this.f115753b) {
            this.f115766o = dmlVar.m116980F();
        }
    }

    @Override // p153l.dml.AbstractC16582j
    /* JADX INFO: renamed from: f */
    public void mo117010f(gml gmlVar) throws IOException {
        gmlVar.m130803d(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX INFO: renamed from: g */
    public void m140903g() {
        jj5.m145008b(this.f115755d);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:0: B:73:0x007f->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public void m140904h(int i, int i2, int i3, int i4, boolean z, ry3 ry3Var, t4f t4fVar) throws Throwable {
        ry3 ry3Var2;
        t4f t4fVar2;
        IOException iOException;
        if (this.f115758g != null) {
            wtq0.m207906a("already connected");
            return;
        }
        List<C21953a> listM214711b = this.f115754c.m163861a().m214711b();
        mx5 mx5Var = new mx5(listM214711b);
        if (this.f115754c.m163861a().m214720k() == null) {
            if (!listM214711b.contains(C21953a.f206772j)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM182286m = this.f115754c.m163861a().m214721l().m182286m();
            if (!Platform.get().isCleartextTrafficPermitted(strM182286m)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + strM182286m + " not permitted by network security policy"));
            }
        } else if (this.f115754c.m163861a().m214715f().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.f115754c.m163863c()) {
                    try {
                        m140907k(i, i2, i3, ry3Var, t4fVar);
                        ry3Var2 = ry3Var;
                        t4fVar2 = t4fVar;
                        try {
                            if (this.f115755d != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e) {
                            e = e;
                            iOException = e;
                            jj5.m145008b(this.f115756e);
                            jj5.m145008b(this.f115755d);
                            this.f115756e = null;
                            this.f115755d = null;
                            this.f115760i = null;
                            this.f115761j = null;
                            this.f115757f = null;
                            this.f115758g = null;
                            this.f115759h = null;
                            t4fVar2.connectFailed(ry3Var2, this.f115754c.m163864d(), this.f115754c.m163862b(), null, iOException);
                            if (routeException == null) {
                                routeException = new RouteException(iOException);
                            } else {
                                routeException.addConnectException(iOException);
                            }
                            if (z) {
                                throw routeException;
                            }
                            if (mx5Var.m160642b(iOException)) {
                                throw routeException;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        ry3Var2 = ry3Var;
                        t4fVar2 = t4fVar;
                    }
                } else {
                    ry3Var2 = ry3Var;
                    t4fVar2 = t4fVar;
                    m140905i(i, i2, ry3Var2, t4fVar2);
                }
                try {
                    m140910n(mx5Var, i4, ry3Var2, t4fVar2);
                    t4fVar2.connectEnd(ry3Var2, this.f115754c.m163864d(), this.f115754c.m163862b(), this.f115758g);
                    break;
                } catch (IOException e3) {
                    e = e3;
                    iOException = e;
                    jj5.m145008b(this.f115756e);
                    jj5.m145008b(this.f115755d);
                    this.f115756e = null;
                    this.f115755d = null;
                    this.f115760i = null;
                    this.f115761j = null;
                    this.f115757f = null;
                    this.f115758g = null;
                    this.f115759h = null;
                    t4fVar2.connectFailed(ry3Var2, this.f115754c.m163864d(), this.f115754c.m163862b(), null, iOException);
                    if (routeException == null) {
                        routeException = new RouteException(iOException);
                    } else {
                        routeException.addConnectException(iOException);
                    }
                    if (z) {
                        throw routeException;
                    }
                    if (mx5Var.m160642b(iOException)) {
                        throw routeException;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                ry3Var2 = ry3Var;
                t4fVar2 = t4fVar;
            }
        }
        if (this.f115754c.m163863c() && this.f115755d == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f115759h != null) {
            synchronized (this.f115753b) {
                this.f115766o = this.f115759h.m116980F();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m140905i(int i, int i2, ry3 ry3Var, t4f t4fVar) throws IOException {
        Proxy proxyM163862b = this.f115754c.m163862b();
        this.f115755d = (proxyM163862b.type() == Proxy.Type.DIRECT || proxyM163862b.type() == Proxy.Type.HTTP) ? this.f115754c.m163861a().m214719j().createSocket() : new Socket(proxyM163862b);
        t4fVar.connectStart(ry3Var, this.f115754c.m163864d(), proxyM163862b);
        this.f115755d.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.f115755d, this.f115754c.m163864d(), i);
            try {
                this.f115760i = Okio.buffer(Okio.source(this.f115755d));
                this.f115761j = Okio.buffer(Okio.sink(this.f115755d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f115754c.m163864d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m140906j(mx5 mx5Var) throws Throwable {
        y80 y80VarM163861a = this.f115754c.m163861a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) y80VarM163861a.m214720k().createSocket(this.f115755d, y80VarM163861a.m214721l().m182286m(), y80VarM163861a.m214721l().m182291y(), true);
                try {
                    C21953a c21953aM160641a = mx5Var.m160641a(sSLSocket2);
                    if (c21953aM160641a.m222302f()) {
                        Platform.get().configureTlsExtensions(sSLSocket2, y80VarM163861a.m214721l().m182286m(), y80VarM163861a.m214715f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    txk txkVarM193501b = txk.m193501b(session);
                    if (y80VarM163861a.m214714e().verify(y80VarM163861a.m214721l().m182286m(), session)) {
                        y80VarM163861a.m214710a().m212712a(y80VarM163861a.m214721l().m182286m(), txkVarM193501b.m193506f());
                        String selectedProtocol = c21953aM160641a.m222302f() ? Platform.get().getSelectedProtocol(sSLSocket2) : null;
                        this.f115756e = sSLSocket2;
                        this.f115760i = Okio.buffer(Okio.source(sSLSocket2));
                        this.f115761j = Okio.buffer(Okio.sink(this.f115756e));
                        this.f115757f = txkVarM193501b;
                        this.f115758g = selectedProtocol != null ? Protocol.get(selectedProtocol) : Protocol.HTTP_1_1;
                        Platform.get().afterHandshake(sSLSocket2);
                        return;
                    }
                    List<Certificate> listM193506f = txkVarM193501b.m193506f();
                    if (listM193506f.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + y80VarM163861a.m214721l().m182286m() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listM193506f.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + y80VarM163861a.m214721l().m182286m() + " not verified:\n    certificate: " + xq4.m212709c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + pg50.m172219a(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!zlk0.m220227A(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.get().afterHandshake(sSLSocket);
                    }
                    jj5.m145008b(sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m140907k(int i, int i2, int i3, ry3 ry3Var, t4f t4fVar) throws IOException {
        x1d0 x1d0VarM140909m = m140909m();
        rnl rnlVarM209026k = x1d0VarM140909m.m209026k();
        for (int i4 = 0; i4 < 21; i4++) {
            m140905i(i, i2, ry3Var, t4fVar);
            x1d0VarM140909m = m140908l(i2, i3, x1d0VarM140909m, rnlVarM209026k);
            if (x1d0VarM140909m == null) {
                return;
            }
            jj5.m145008b(this.f115755d);
            this.f115755d = null;
            this.f115761j = null;
            this.f115760i = null;
            t4fVar.connectEnd(ry3Var, this.f115754c.m163864d(), this.f115754c.m163862b(), null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final x1d0 m140908l(int i, int i2, x1d0 x1d0Var, rnl rnlVar) throws IOException {
        String str = "CONNECT " + zlk0.m220257s(rnlVar, true) + " HTTP/1.1";
        while (true) {
            bml bmlVar = new bml(null, null, this.f115760i, this.f115761j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f115760i.getThis$0().timeout(i, timeUnit);
            this.f115761j.getThis$0().timeout(i2, timeUnit);
            bmlVar.m105193A(x1d0Var.m209020e(), str);
            bmlVar.mo105198e();
            i5d0 i5d0VarM138679c = bmlVar.mo105199f(false).m138693q(x1d0Var).m138679c();
            bmlVar.m105209z(i5d0VarM138679c);
            int iM138673q = i5d0VarM138679c.m138673q();
            if (iM138673q == 200) {
                if (this.f115760i.getBuffer().exhausted() && this.f115761j.getBufferField().exhausted()) {
                    return null;
                }
                zpg0.m220844a("TLS tunnel buffered too many bytes!");
                return null;
            }
            if (iM138673q != 407) {
                yll.m216601a("Unexpected response code for CONNECT: ", i5d0VarM138679c.m138673q());
                return null;
            }
            x1d0 x1d0VarMo103679b = this.f115754c.m163861a().m214717h().mo103679b(this.f115754c, i5d0VarM138679c);
            if (x1d0VarMo103679b == null) {
                zpg0.m220844a("Failed to authenticate with proxy");
                return null;
            }
            if ("close".equalsIgnoreCase(i5d0VarM138679c.m138675u(HttpHeaders.CONNECTION))) {
                return x1d0VarMo103679b;
            }
            x1d0Var = x1d0VarMo103679b;
        }
    }

    /* JADX INFO: renamed from: m */
    public final x1d0 m140909m() throws IOException {
        x1d0 x1d0VarM209028b = new x1d0.C21228a().m209045s(this.f115754c.m163861a().m214721l()).m209036j(HttpMethods.CONNECT, null).m209034h("Host", zlk0.m220257s(this.f115754c.m163861a().m214721l(), true)).m209034h(HttpHeaders.PROXY_CONNECTION, HttpHeaders.KEEP_ALIVE).m209034h("User-Agent", q9l0.m175842a()).m209028b();
        x1d0 x1d0VarMo103679b = this.f115754c.m163861a().m214717h().mo103679b(this.f115754c, new i5d0.C17653a().m138693q(x1d0VarM209028b).m138691o(Protocol.HTTP_1_1).m138683g(HttpStatus.PROXY_AUTHENTICATION_REQUIRED_407).m138688l("Preemptive Authenticate").m138678b(zlk0.f204949d).m138694r(-1L).m138692p(-1L).m138685i(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").m138679c());
        return x1d0VarMo103679b != null ? x1d0VarMo103679b : x1d0VarM209028b;
    }

    /* JADX INFO: renamed from: n */
    public final void m140910n(mx5 mx5Var, int i, ry3 ry3Var, t4f t4fVar) throws Throwable {
        if (this.f115754c.m163861a().m214720k() != null) {
            t4fVar.secureConnectStart(ry3Var);
            m140906j(mx5Var);
            t4fVar.secureConnectEnd(ry3Var, this.f115757f);
            if (this.f115758g == Protocol.HTTP_2) {
                m140918v(i);
                return;
            }
            return;
        }
        List<Protocol> listM214715f = this.f115754c.m163861a().m214715f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        boolean zContains = listM214715f.contains(protocol);
        Socket socket = this.f115755d;
        if (!zContains) {
            this.f115756e = socket;
            this.f115758g = Protocol.HTTP_1_1;
        } else {
            this.f115756e = socket;
            this.f115758g = protocol;
            m140918v(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m140911o(y80 y80Var, List<nnd0> list) {
        if (this.f115767p.size() >= this.f115766o || this.f115762k || !kzm.f129436a.mo152196e(this.f115754c.m163861a(), y80Var)) {
            return false;
        }
        if (y80Var.m214721l().m182286m().equals(mo106825b().m163861a().m214721l().m182286m())) {
            return true;
        }
        if (this.f115759h == null || list == null || !m140917u(list) || y80Var.m214714e() != pg50.INSTANCE || !m140919w(y80Var.m214721l())) {
            return false;
        }
        try {
            y80Var.m214710a().m212712a(y80Var.m214721l().m182286m(), mo106826c().m193506f());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m140912p(boolean z) {
        if (this.f115756e.isClosed() || this.f115756e.isInputShutdown() || this.f115756e.isOutputShutdown()) {
            return false;
        }
        dml dmlVar = this.f115759h;
        if (dmlVar != null) {
            return dmlVar.m116979B(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f115756e.getSoTimeout();
                try {
                    this.f115756e.setSoTimeout(1);
                    boolean zExhausted = this.f115760i.exhausted();
                    Socket socket = this.f115756e;
                    if (zExhausted) {
                        socket.setSoTimeout(soTimeout);
                        return false;
                    }
                    socket.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f115756e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public boolean m140913q() {
        return this.f115759h != null;
    }

    /* JADX INFO: renamed from: r */
    public o6f m140914r(rg50 rg50Var, azm.InterfaceC15867a interfaceC15867a) throws SocketException {
        if (this.f115759h != null) {
            return new eml(rg50Var, this, interfaceC15867a, this.f115759h);
        }
        this.f115756e.setSoTimeout(interfaceC15867a.readTimeoutMillis());
        Timeout timeout = this.f115760i.getThis$0();
        long timeoutMillis = interfaceC15867a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(timeoutMillis, timeUnit);
        this.f115761j.getThis$0().timeout(interfaceC15867a.writeTimeoutMillis(), timeUnit);
        return new bml(rg50Var, this, this.f115760i, this.f115761j);
    }

    /* JADX INFO: renamed from: s */
    public jnc0.AbstractC17985f m140915s(n6f n6fVar) throws SocketException {
        this.f115756e.setSoTimeout(0);
        m140916t();
        return new C17742a(true, this.f115760i, this.f115761j, n6fVar);
    }

    /* JADX INFO: renamed from: t */
    public void m140916t() {
        synchronized (this.f115753b) {
            this.f115762k = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f115754c.m163861a().m214721l().m182286m());
        sb.append(":");
        sb.append(this.f115754c.m163861a().m214721l().m182291y());
        sb.append(", proxy=");
        sb.append(this.f115754c.m163862b());
        sb.append(" hostAddress=");
        sb.append(this.f115754c.m163864d());
        sb.append(" cipherSuite=");
        txk txkVar = this.f115757f;
        sb.append(txkVar != null ? txkVar.m193503a() : "none");
        sb.append(" protocol=");
        sb.append(this.f115758g);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m140917u(List<nnd0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            nnd0 nnd0Var = list.get(i);
            Proxy.Type type = nnd0Var.m163862b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f115754c.m163862b().type() == type2 && this.f115754c.m163864d().equals(nnd0Var.m163864d())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m140918v(int i) throws IOException {
        this.f115756e.setSoTimeout(0);
        dml dmlVarM117005a = new dml.C16580h(true).m117008d(this.f115756e, this.f115754c.m163861a().m214721l().m182286m(), this.f115760i, this.f115761j).m117006b(this).m117007c(i).m117005a();
        this.f115759h = dmlVarM117005a;
        dmlVarM117005a.m116992e0();
    }

    /* JADX INFO: renamed from: w */
    public boolean m140919w(rnl rnlVar) {
        if (rnlVar.m182291y() != this.f115754c.m163861a().m214721l().m182291y()) {
            return false;
        }
        if (rnlVar.m182286m().equals(this.f115754c.m163861a().m214721l().m182286m())) {
            return true;
        }
        return this.f115757f != null && pg50.INSTANCE.m172221c(rnlVar.m182286m(), (X509Certificate) this.f115757f.m193506f().get(0));
    }

    /* JADX INFO: renamed from: x */
    public void m140920x(IOException iOException) {
        synchronized (this.f115753b) {
            try {
                if (iOException instanceof StreamResetException) {
                    ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                    if (errorCode == ErrorCode.REFUSED_STREAM) {
                        int i = this.f115765n + 1;
                        this.f115765n = i;
                        if (i > 1) {
                            this.f115762k = true;
                            this.f115763l++;
                        }
                    } else if (errorCode != ErrorCode.CANCEL) {
                        this.f115762k = true;
                        this.f115763l++;
                    }
                } else if (!m140913q() || (iOException instanceof ConnectionShutdownException)) {
                    this.f115762k = true;
                    if (this.f115764m == 0) {
                        if (iOException != null) {
                            this.f115753b.m150423c(this.f115754c, iOException);
                        }
                        this.f115763l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
