package p149l;

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
import okhttp3.C21832a;
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
public final class bec0 extends mjl.AbstractC18478j implements wv5 {

    /* JADX INFO: renamed from: b */
    public final dec0 f75134b;

    /* JADX INFO: renamed from: c */
    public final kfd0 f75135c;

    /* JADX INFO: renamed from: d */
    public Socket f75136d;

    /* JADX INFO: renamed from: e */
    public Socket f75137e;

    /* JADX INFO: renamed from: f */
    public dvk f75138f;

    /* JADX INFO: renamed from: g */
    public Protocol f75139g;

    /* JADX INFO: renamed from: h */
    public mjl f75140h;

    /* JADX INFO: renamed from: i */
    public BufferedSource f75141i;

    /* JADX INFO: renamed from: j */
    public BufferedSink f75142j;

    /* JADX INFO: renamed from: k */
    public boolean f75143k;

    /* JADX INFO: renamed from: l */
    public int f75144l;

    /* JADX INFO: renamed from: m */
    public int f75145m;

    /* JADX INFO: renamed from: n */
    public int f75146n;

    /* JADX INFO: renamed from: o */
    public int f75147o = 1;

    /* JADX INFO: renamed from: p */
    public final List<Reference<k9j0>> f75148p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public long f75149q = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l.bec0$a */
    public class C15841a extends cfc0.AbstractC16122f {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ j5f f75150d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15841a(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, j5f j5fVar) {
            super(z, bufferedSource, bufferedSink);
            this.f75150d = j5fVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f75150d.m139844a(-1L, true, true, null);
        }
    }

    public bec0(dec0 dec0Var, kfd0 kfd0Var) {
        this.f75134b = dec0Var;
        this.f75135c = kfd0Var;
    }

    @Override // p149l.wv5
    /* JADX INFO: renamed from: a */
    public Protocol mo101329a() {
        return this.f75139g;
    }

    @Override // p149l.wv5
    /* JADX INFO: renamed from: b */
    public kfd0 mo101330b() {
        return this.f75135c;
    }

    @Override // p149l.wv5
    /* JADX INFO: renamed from: c */
    public dvk mo101331c() {
        return this.f75138f;
    }

    @Override // p149l.wv5
    /* JADX INFO: renamed from: d */
    public Socket mo101332d() {
        return this.f75137e;
    }

    @Override // p149l.mjl.AbstractC18478j
    /* JADX INFO: renamed from: e */
    public void mo101333e(mjl mjlVar) {
        synchronized (this.f75134b) {
            this.f75147o = mjlVar.m154858F();
        }
    }

    @Override // p149l.mjl.AbstractC18478j
    /* JADX INFO: renamed from: f */
    public void mo101334f(pjl pjlVar) throws IOException {
        pjlVar.m169889d(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX INFO: renamed from: g */
    public void m101335g() {
        ii5.m136332b(this.f75136d);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:81:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:0: B:73:0x007f->B:85:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public void m101336h(int i, int i2, int i3, int i4, boolean z, sx3 sx3Var, o3f o3fVar) throws Throwable {
        sx3 sx3Var2;
        o3f o3fVar2;
        IOException iOException;
        if (this.f75139g != null) {
            qkq0.m175383a("already connected");
            return;
        }
        List<C21832a> listM105827b = this.f75135c.m145831a().m105827b();
        hw5 hw5Var = new hw5(listM105827b);
        if (this.f75135c.m145831a().m105836k() == null) {
            if (!listM105827b.contains(C21832a.f205843j)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM107522m = this.f75135c.m145831a().m105837l().m107522m();
            if (!Platform.get().isCleartextTrafficPermitted(strM107522m)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication to " + strM107522m + " not permitted by network security policy"));
            }
        } else if (this.f75135c.m145831a().m105831f().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                if (this.f75135c.m145833c()) {
                    try {
                        m101339k(i, i2, i3, sx3Var, o3fVar);
                        sx3Var2 = sx3Var;
                        o3fVar2 = o3fVar;
                        try {
                            if (this.f75136d != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e) {
                            e = e;
                            iOException = e;
                            ii5.m136332b(this.f75137e);
                            ii5.m136332b(this.f75136d);
                            this.f75137e = null;
                            this.f75136d = null;
                            this.f75141i = null;
                            this.f75142j = null;
                            this.f75138f = null;
                            this.f75139g = null;
                            this.f75140h = null;
                            o3fVar2.connectFailed(sx3Var2, this.f75135c.m145834d(), this.f75135c.m145832b(), null, iOException);
                            if (routeException == null) {
                                routeException = new RouteException(iOException);
                            } else {
                                routeException.addConnectException(iOException);
                            }
                            if (z) {
                                throw routeException;
                            }
                            if (hw5Var.m133235b(iOException)) {
                                throw routeException;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        sx3Var2 = sx3Var;
                        o3fVar2 = o3fVar;
                    }
                } else {
                    sx3Var2 = sx3Var;
                    o3fVar2 = o3fVar;
                    m101337i(i, i2, sx3Var2, o3fVar2);
                }
                try {
                    m101342n(hw5Var, i4, sx3Var2, o3fVar2);
                    o3fVar2.connectEnd(sx3Var2, this.f75135c.m145834d(), this.f75135c.m145832b(), this.f75139g);
                    break;
                } catch (IOException e3) {
                    e = e3;
                    iOException = e;
                    ii5.m136332b(this.f75137e);
                    ii5.m136332b(this.f75136d);
                    this.f75137e = null;
                    this.f75136d = null;
                    this.f75141i = null;
                    this.f75142j = null;
                    this.f75138f = null;
                    this.f75139g = null;
                    this.f75140h = null;
                    o3fVar2.connectFailed(sx3Var2, this.f75135c.m145834d(), this.f75135c.m145832b(), null, iOException);
                    if (routeException == null) {
                        routeException = new RouteException(iOException);
                    } else {
                        routeException.addConnectException(iOException);
                    }
                    if (z) {
                        throw routeException;
                    }
                    if (hw5Var.m133235b(iOException)) {
                        throw routeException;
                    }
                }
            } catch (IOException e4) {
                e = e4;
                sx3Var2 = sx3Var;
                o3fVar2 = o3fVar;
            }
        }
        if (this.f75135c.m145833c() && this.f75136d == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f75140h != null) {
            synchronized (this.f75134b) {
                this.f75147o = this.f75140h.m154858F();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m101337i(int i, int i2, sx3 sx3Var, o3f o3fVar) throws IOException {
        Proxy proxyM145832b = this.f75135c.m145832b();
        this.f75136d = (proxyM145832b.type() == Proxy.Type.DIRECT || proxyM145832b.type() == Proxy.Type.HTTP) ? this.f75135c.m145831a().m105835j().createSocket() : new Socket(proxyM145832b);
        o3fVar.connectStart(sx3Var, this.f75135c.m145834d(), proxyM145832b);
        this.f75136d.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.f75136d, this.f75135c.m145834d(), i);
            try {
                this.f75141i = Okio.buffer(Okio.source(this.f75136d));
                this.f75142j = Okio.buffer(Okio.sink(this.f75136d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f75135c.m145834d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m101338j(hw5 hw5Var) throws Throwable {
        c90 c90VarM145831a = this.f75135c.m145831a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) c90VarM145831a.m105836k().createSocket(this.f75136d, c90VarM145831a.m105837l().m107522m(), c90VarM145831a.m105837l().m107527y(), true);
                try {
                    C21832a c21832aM133234a = hw5Var.m133234a(sSLSocket2);
                    if (c21832aM133234a.m221035f()) {
                        Platform.get().configureTlsExtensions(sSLSocket2, c90VarM145831a.m105837l().m107522m(), c90VarM145831a.m105831f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    dvk dvkVarM113782b = dvk.m113782b(session);
                    if (c90VarM145831a.m105830e().verify(c90VarM145831a.m105837l().m107522m(), session)) {
                        c90VarM145831a.m105826a().m215571a(c90VarM145831a.m105837l().m107522m(), dvkVarM113782b.m113787f());
                        String selectedProtocol = c21832aM133234a.m221035f() ? Platform.get().getSelectedProtocol(sSLSocket2) : null;
                        this.f75137e = sSLSocket2;
                        this.f75141i = Okio.buffer(Okio.source(sSLSocket2));
                        this.f75142j = Okio.buffer(Okio.sink(this.f75137e));
                        this.f75138f = dvkVarM113782b;
                        this.f75139g = selectedProtocol != null ? Protocol.get(selectedProtocol) : Protocol.HTTP_1_1;
                        Platform.get().afterHandshake(sSLSocket2);
                        return;
                    }
                    List<Certificate> listM113787f = dvkVarM113782b.m113787f();
                    if (listM113787f.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c90VarM145831a.m105837l().m107522m() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listM113787f.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + c90VarM145831a.m105837l().m107522m() + " not verified:\n    certificate: " + yp4.m215568c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + i850.m134954a(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!tck0.m187988A(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        Platform.get().afterHandshake(sSLSocket);
                    }
                    ii5.m136332b(sSLSocket);
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
    public final void m101339k(int i, int i2, int i3, sx3 sx3Var, o3f o3fVar) throws IOException {
        stc0 stc0VarM101341m = m101341m();
        cll cllVarM185881k = stc0VarM101341m.m185881k();
        for (int i4 = 0; i4 < 21; i4++) {
            m101337i(i, i2, sx3Var, o3fVar);
            stc0VarM101341m = m101340l(i2, i3, stc0VarM101341m, cllVarM185881k);
            if (stc0VarM101341m == null) {
                return;
            }
            ii5.m136332b(this.f75136d);
            this.f75136d = null;
            this.f75142j = null;
            this.f75141i = null;
            o3fVar.connectEnd(sx3Var, this.f75135c.m145834d(), this.f75135c.m145832b(), null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final stc0 m101340l(int i, int i2, stc0 stc0Var, cll cllVar) throws IOException {
        String str = "CONNECT " + tck0.m188018s(cllVar, true) + " HTTP/1.1";
        while (true) {
            kjl kjlVar = new kjl(null, null, this.f75141i, this.f75142j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f75141i.getThis$0().timeout(i, timeUnit);
            this.f75142j.getThis$0().timeout(i2, timeUnit);
            kjlVar.m146248A(stc0Var.m185875e(), str);
            kjlVar.mo144536e();
            exc0 exc0VarM118615c = kjlVar.mo144537f(false).m118629q(stc0Var).m118615c();
            kjlVar.m146257z(exc0VarM118615c);
            int iM118609q = exc0VarM118615c.m118609q();
            if (iM118609q == 200) {
                if (this.f75141i.getBuffer().exhausted() && this.f75142j.getBufferField().exhausted()) {
                    return null;
                }
                rhg0.m179353a("TLS tunnel buffered too many bytes!");
                return null;
            }
            if (iM118609q != 407) {
                hjl.m131386a("Unexpected response code for CONNECT: ", exc0VarM118615c.m118609q());
                return null;
            }
            stc0 stc0VarMo193113b = this.f75135c.m145831a().m105833h().mo193113b(this.f75135c, exc0VarM118615c);
            if (stc0VarMo193113b == null) {
                rhg0.m179353a("Failed to authenticate with proxy");
                return null;
            }
            if ("close".equalsIgnoreCase(exc0VarM118615c.m118611u("Connection"))) {
                return stc0VarMo193113b;
            }
            stc0Var = stc0VarMo193113b;
        }
    }

    /* JADX INFO: renamed from: m */
    public final stc0 m101341m() throws IOException {
        stc0 stc0VarM185883b = new stc0.C20027a().m185900s(this.f75135c.m145831a().m105837l()).m185891j(HttpMethods.CONNECT, null).m185889h("Host", tck0.m188018s(this.f75135c.m145831a().m105837l(), true)).m185889h(HttpHeaders.PROXY_CONNECTION, HttpHeaders.KEEP_ALIVE).m185889h("User-Agent", l0l0.m148099a()).m185883b();
        stc0 stc0VarMo193113b = this.f75135c.m145831a().m105833h().mo193113b(this.f75135c, new exc0.C16708a().m118629q(stc0VarM185883b).m118627o(Protocol.HTTP_1_1).m118619g(HttpStatus.PROXY_AUTHENTICATION_REQUIRED_407).m118624l("Preemptive Authenticate").m118614b(tck0.f169453d).m118630r(-1L).m118628p(-1L).m118621i(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").m118615c());
        return stc0VarMo193113b != null ? stc0VarMo193113b : stc0VarM185883b;
    }

    /* JADX INFO: renamed from: n */
    public final void m101342n(hw5 hw5Var, int i, sx3 sx3Var, o3f o3fVar) throws Throwable {
        if (this.f75135c.m145831a().m105836k() != null) {
            o3fVar.secureConnectStart(sx3Var);
            m101338j(hw5Var);
            o3fVar.secureConnectEnd(sx3Var, this.f75138f);
            if (this.f75139g == Protocol.HTTP_2) {
                m101350v(i);
                return;
            }
            return;
        }
        List<Protocol> listM105831f = this.f75135c.m145831a().m105831f();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        boolean zContains = listM105831f.contains(protocol);
        Socket socket = this.f75136d;
        if (!zContains) {
            this.f75137e = socket;
            this.f75139g = Protocol.HTTP_1_1;
        } else {
            this.f75137e = socket;
            this.f75139g = protocol;
            m101350v(i);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m101343o(c90 c90Var, List<kfd0> list) {
        if (this.f75148p.size() >= this.f75147o || this.f75143k || !kxm.f125142a.mo144875e(this.f75135c.m145831a(), c90Var)) {
            return false;
        }
        if (c90Var.m105837l().m107522m().equals(mo101330b().m145831a().m105837l().m107522m())) {
            return true;
        }
        if (this.f75140h == null || list == null || !m101349u(list) || c90Var.m105830e() != i850.INSTANCE || !m101351w(c90Var.m105837l())) {
            return false;
        }
        try {
            c90Var.m105826a().m215571a(c90Var.m105837l().m107522m(), mo101331c().m113787f());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m101344p(boolean z) {
        if (this.f75137e.isClosed() || this.f75137e.isInputShutdown() || this.f75137e.isOutputShutdown()) {
            return false;
        }
        mjl mjlVar = this.f75140h;
        if (mjlVar != null) {
            return mjlVar.m154857B(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f75137e.getSoTimeout();
                try {
                    this.f75137e.setSoTimeout(1);
                    boolean zExhausted = this.f75141i.exhausted();
                    Socket socket = this.f75137e;
                    if (zExhausted) {
                        socket.setSoTimeout(soTimeout);
                        return false;
                    }
                    socket.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f75137e.setSoTimeout(soTimeout);
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
    public boolean m101345q() {
        return this.f75140h != null;
    }

    /* JADX INFO: renamed from: r */
    public k5f m101346r(k850 k850Var, axm.InterfaceC15754a interfaceC15754a) throws SocketException {
        if (this.f75140h != null) {
            return new njl(k850Var, this, interfaceC15754a, this.f75140h);
        }
        this.f75137e.setSoTimeout(interfaceC15754a.readTimeoutMillis());
        Timeout timeout = this.f75141i.getThis$0();
        long timeoutMillis = interfaceC15754a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(timeoutMillis, timeUnit);
        this.f75142j.getThis$0().timeout(interfaceC15754a.writeTimeoutMillis(), timeUnit);
        return new kjl(k850Var, this, this.f75141i, this.f75142j);
    }

    /* JADX INFO: renamed from: s */
    public cfc0.AbstractC16122f m101347s(j5f j5fVar) throws SocketException {
        this.f75137e.setSoTimeout(0);
        m101348t();
        return new C15841a(true, this.f75141i, this.f75142j, j5fVar);
    }

    /* JADX INFO: renamed from: t */
    public void m101348t() {
        synchronized (this.f75134b) {
            this.f75143k = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f75135c.m145831a().m105837l().m107522m());
        sb.append(":");
        sb.append(this.f75135c.m145831a().m105837l().m107527y());
        sb.append(", proxy=");
        sb.append(this.f75135c.m145832b());
        sb.append(" hostAddress=");
        sb.append(this.f75135c.m145834d());
        sb.append(" cipherSuite=");
        dvk dvkVar = this.f75138f;
        sb.append(dvkVar != null ? dvkVar.m113784a() : "none");
        sb.append(" protocol=");
        sb.append(this.f75139g);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m101349u(List<kfd0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kfd0 kfd0Var = list.get(i);
            Proxy.Type type = kfd0Var.m145832b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f75135c.m145832b().type() == type2 && this.f75135c.m145834d().equals(kfd0Var.m145834d())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m101350v(int i) throws IOException {
        this.f75137e.setSoTimeout(0);
        mjl mjlVarM154882a = new mjl.C18476h(true).m154885d(this.f75137e, this.f75135c.m145831a().m105837l().m107522m(), this.f75141i, this.f75142j).m154883b(this).m154884c(i).m154882a();
        this.f75140h = mjlVarM154882a;
        mjlVarM154882a.m154870d0();
    }

    /* JADX INFO: renamed from: w */
    public boolean m101351w(cll cllVar) {
        if (cllVar.m107527y() != this.f75135c.m145831a().m105837l().m107527y()) {
            return false;
        }
        if (cllVar.m107522m().equals(this.f75135c.m145831a().m105837l().m107522m())) {
            return true;
        }
        return this.f75138f != null && i850.INSTANCE.m134956c(cllVar.m107522m(), (X509Certificate) this.f75138f.m113787f().get(0));
    }

    /* JADX INFO: renamed from: x */
    public void m101352x(IOException iOException) {
        synchronized (this.f75134b) {
            try {
                if (iOException instanceof StreamResetException) {
                    ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                    if (errorCode == ErrorCode.REFUSED_STREAM) {
                        int i = this.f75146n + 1;
                        this.f75146n = i;
                        if (i > 1) {
                            this.f75143k = true;
                            this.f75144l++;
                        }
                    } else if (errorCode != ErrorCode.CANCEL) {
                        this.f75143k = true;
                        this.f75144l++;
                    }
                } else if (!m101345q() || (iOException instanceof ConnectionShutdownException)) {
                    this.f75143k = true;
                    if (this.f75145m == 0) {
                        if (iOException != null) {
                            this.f75134b.m111195c(this.f75135c, iOException);
                        }
                        this.f75144l++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
