package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.AbstractC13764m;
import com.tencent.cloud.p075ai.network.okhttp3.C13695a;
import com.tencent.cloud.p075ai.network.okhttp3.C13699e;
import com.tencent.cloud.p075ai.network.okhttp3.C13761j;
import com.tencent.cloud.p075ai.network.okhttp3.C13765n;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.C13770s;
import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import com.tencent.cloud.p075ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p075ai.network.okhttp3.InterfaceC13702h;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.Request;
import com.tencent.cloud.p075ai.network.okhttp3.Response;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.C13724c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http.InterfaceC13722a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http1.C13727a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13732e;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13733f;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13742o;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13744q;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13745r;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13748u;
import com.tencent.cloud.p075ai.network.okhttp3.internal.http2.EnumC13729b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13758d;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.C13788q;
import com.tencent.cloud.p075ai.network.okio.C13789r;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpStatus;
import p149l.hjl;
import p149l.j6f;
import p149l.qkq0;
import p149l.rhg0;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.e */
/* JADX INFO: loaded from: classes13.dex */
public final class C13715e extends C13733f.e implements InterfaceC13702h {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ boolean f56505r = true;

    /* JADX INFO: renamed from: b */
    public final C13716f f56506b;

    /* JADX INFO: renamed from: c */
    public final C13770s f56507c;

    /* JADX INFO: renamed from: d */
    public Socket f56508d;

    /* JADX INFO: renamed from: e */
    public Socket f56509e;

    /* JADX INFO: renamed from: f */
    public C13765n f56510f;

    /* JADX INFO: renamed from: g */
    public EnumC13768q f56511g;

    /* JADX INFO: renamed from: h */
    public C13733f f56512h;

    /* JADX INFO: renamed from: i */
    public InterfaceC13778g f56513i;

    /* JADX INFO: renamed from: j */
    public InterfaceC13777f f56514j;

    /* JADX INFO: renamed from: k */
    public boolean f56515k;

    /* JADX INFO: renamed from: l */
    public int f56516l;

    /* JADX INFO: renamed from: m */
    public int f56517m;

    /* JADX INFO: renamed from: n */
    public int f56518n;

    /* JADX INFO: renamed from: o */
    public int f56519o = 1;

    /* JADX INFO: renamed from: p */
    public final List<Reference<C13720j>> f56520p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public long f56521q = Long.MAX_VALUE;

    public C13715e(C13716f c13716f, C13770s c13770s) {
        this.f56506b = c13716f;
        this.f56507c = c13770s;
    }

    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.tencent.cloud.ai.network.okhttp3.OkHttpClient, com.tencent.cloud.ai.network.okhttp3.internal.connection.e] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: a */
    public final void m81658a(int i, int i2, int i3, Call call, AbstractC13764m abstractC13764m) throws IOException {
        long j;
        int i4;
        boolean z = false;
        boolean z2 = true;
        Request requestBuild = new Request.Builder().url(this.f56507c.f56942a.f56395a).method(HttpMethods.CONNECT, null).header("Host", C13706c.m81603a(this.f56507c.f56942a.f56395a, true)).header(HttpHeaders.PROXY_CONNECTION, HttpHeaders.KEEP_ALIVE).header("User-Agent", "okhttp/3.14.0").build();
        long j2 = -1;
        Response responseBuild = new Response.Builder().request(requestBuild).protocol(EnumC13768q.HTTP_1_1).code(HttpStatus.PROXY_AUTHENTICATION_REQUIRED_407).message("Preemptive Authenticate").body(C13706c.f56457c).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").build();
        C13770s c13770s = this.f56507c;
        Request requestMo81589a = c13770s.f56942a.f56398d.mo81589a(c13770s, responseBuild);
        if (requestMo81589a != null) {
            requestBuild = requestMo81589a;
        }
        C13767p c13767pUrl = requestBuild.url();
        int i5 = 0;
        while (i5 < 21) {
            m81659a(i, i2, call, abstractC13764m);
            String str = "CONNECT " + C13706c.m81603a(c13767pUrl, z2) + " HTTP/1.1";
            ?? r4 = z;
            while (true) {
                j = j2;
                C13727a c13727a = new C13727a(r4, r4, this.f56513i, this.f56514j);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f56513i.timeout().mo81951a(i2, timeUnit);
                i4 = i5;
                this.f56514j.timeout().mo81951a(i3, timeUnit);
                c13727a.m81713a(requestBuild.headers(), str);
                c13727a.f56588d.flush();
                Response responseBuild2 = c13727a.mo81691a(false).request(requestBuild).build();
                long jM81702a = C13724c.m81702a(responseBuild2);
                if (jM81702a != j) {
                    InterfaceC13794w interfaceC13794wM81712a = c13727a.m81712a(jM81702a);
                    C13706c.m81624b(interfaceC13794wM81712a, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
                    ((C13727a.e) interfaceC13794wM81712a).close();
                }
                int iCode = responseBuild2.code();
                if (iCode == 200) {
                    if (this.f56513i.mo81904a().mo81935g() && this.f56514j.mo81904a().mo81935g()) {
                        requestBuild = null;
                        break;
                    } else {
                        rhg0.m179353a("TLS tunnel buffered too many bytes!");
                        return;
                    }
                }
                if (iCode != 407) {
                    hjl.m131386a("Unexpected response code for CONNECT: ", responseBuild2.code());
                    return;
                }
                C13770s c13770s2 = this.f56507c;
                Request requestMo81589a2 = c13770s2.f56942a.f56398d.mo81589a(c13770s2, responseBuild2);
                if (requestMo81589a2 == null) {
                    rhg0.m179353a("Failed to authenticate with proxy");
                    return;
                } else {
                    if ("close".equalsIgnoreCase(responseBuild2.header("Connection"))) {
                        requestBuild = requestMo81589a2;
                        break;
                    }
                    requestBuild = requestMo81589a2;
                    j2 = j;
                    i5 = i4;
                    r4 = 0;
                }
            }
            if (requestBuild == null) {
                return;
            }
            C13706c.m81616a(this.f56508d);
            z = false;
            this.f56508d = null;
            this.f56514j = null;
            this.f56513i = null;
            InetSocketAddress inetSocketAddress = this.f56507c.f56944c;
            i5 = i4 + 1;
            j2 = j;
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m81666b() {
        if (!f56505r && Thread.holdsLock(this.f56506b)) {
            shg0.m184191a();
            return;
        }
        synchronized (this.f56506b) {
            this.f56515k = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f56507c.f56942a.f56395a.f56912d);
        sb.append(":");
        sb.append(this.f56507c.f56942a.f56395a.f56913e);
        sb.append(", proxy=");
        sb.append(this.f56507c.f56943b);
        sb.append(" hostAddress=");
        sb.append(this.f56507c.f56944c);
        sb.append(" cipherSuite=");
        C13765n c13765n = this.f56510f;
        sb.append(c13765n != null ? c13765n.f56903b : "none");
        sb.append(" protocol=");
        sb.append(this.f56511g);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m81659a(int i, int i2, Call call, AbstractC13764m abstractC13764m) throws IOException {
        Socket socketCreateSocket;
        C13770s c13770s = this.f56507c;
        Proxy proxy = c13770s.f56943b;
        C13695a c13695a = c13770s.f56942a;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            socketCreateSocket = new Socket(proxy);
        } else {
            socketCreateSocket = c13695a.f56397c.createSocket();
        }
        this.f56508d = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f56507c.f56944c;
        abstractC13764m.getClass();
        socketCreateSocket.setSoTimeout(i2);
        try {
            C13752c.f56801a.mo81790a(this.f56508d, this.f56507c.f56944c, i);
            try {
                this.f56513i = new C13789r(C13785n.m81966b(this.f56508d));
                this.f56514j = new C13788q(C13785n.m81962a(this.f56508d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f56507c.f56944c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m81660a(C13711a c13711a, int i, Call call, AbstractC13764m abstractC13764m) throws Throwable {
        EnumC13768q enumC13768qM81876a;
        C13695a c13695a = this.f56507c.f56942a;
        SSLSocketFactory sSLSocketFactory = c13695a.f56403i;
        if (sSLSocketFactory == null) {
            List<EnumC13768q> list = c13695a.f56399e;
            EnumC13768q enumC13768q = EnumC13768q.H2_PRIOR_KNOWLEDGE;
            boolean zContains = list.contains(enumC13768q);
            Socket socket = this.f56508d;
            if (zContains) {
                this.f56509e = socket;
                this.f56511g = enumC13768q;
                m81656a(i);
                return;
            } else {
                this.f56509e = socket;
                this.f56511g = EnumC13768q.HTTP_1_1;
                return;
            }
        }
        abstractC13764m.getClass();
        SSLSocket sSLSocket = null;
        try {
            try {
                Socket socket2 = this.f56508d;
                C13767p c13767p = c13695a.f56395a;
                SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket2, c13767p.f56912d, c13767p.f56913e, true);
                try {
                    C13761j c13761jM81641a = c13711a.m81641a(sSLSocket2);
                    if (c13761jM81641a.f56880b) {
                        C13752c.f56801a.mo81784a(sSLSocket2, c13695a.f56395a.f56912d, c13695a.f56399e);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C13765n c13765nM81839a = C13765n.m81839a(session);
                    if (!c13695a.f56404j.verify(c13695a.f56395a.f56912d, session)) {
                        List<Certificate> list2 = c13765nM81839a.f56904c;
                        if (!list2.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + c13695a.f56395a.f56912d + " not verified:\n    certificate: " + C13699e.m81591a(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C13758d.m81808a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c13695a.f56395a.f56912d + " not verified (no certificates)");
                    }
                    c13695a.f56405k.m81593a(c13695a.f56395a.f56912d, c13765nM81839a.f56904c);
                    String strMo81783a = c13761jM81641a.f56880b ? C13752c.f56801a.mo81783a(sSLSocket2) : null;
                    this.f56509e = sSLSocket2;
                    this.f56513i = new C13789r(C13785n.m81966b(sSLSocket2));
                    this.f56514j = new C13788q(C13785n.m81962a(this.f56509e));
                    this.f56510f = c13765nM81839a;
                    if (strMo81783a != null) {
                        enumC13768qM81876a = EnumC13768q.m81876a(strMo81783a);
                    } else {
                        enumC13768qM81876a = EnumC13768q.HTTP_1_1;
                    }
                    this.f56511g = enumC13768qM81876a;
                    C13752c.f56801a.getClass();
                    if (enumC13768qM81876a == EnumC13768q.HTTP_2) {
                        m81656a(i);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!C13706c.m81619a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C13752c.f56801a.getClass();
                    }
                    C13706c.m81616a((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m81656a(int i) throws SocketException {
        int i2;
        this.f56509e.setSoTimeout(0);
        C13733f.c cVar = new C13733f.c(true);
        Socket socket = this.f56509e;
        String str = this.f56507c.f56942a.f56395a.f56912d;
        InterfaceC13778g interfaceC13778g = this.f56513i;
        InterfaceC13777f interfaceC13777f = this.f56514j;
        cVar.f56685a = socket;
        cVar.f56686b = str;
        cVar.f56687c = interfaceC13778g;
        cVar.f56688d = interfaceC13777f;
        cVar.f56689e = this;
        cVar.f56692h = i;
        C13733f c13733f = new C13733f(cVar);
        this.f56512h = c13733f;
        C13745r c13745r = c13733f.f56676v;
        synchronized (c13745r) {
            try {
                if (!c13745r.f56774e) {
                    if (c13745r.f56771b) {
                        Logger logger = C13745r.f56769g;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(C13706c.m81605a(">> CONNECTION %s", C13732e.f56649a.hex()));
                        }
                        c13745r.f56770a.mo81910a(C13732e.f56649a.toByteArray());
                        c13745r.f56770a.flush();
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C13745r c13745r2 = c13733f.f56676v;
        C13748u c13748u = c13733f.f56673s;
        synchronized (c13745r2) {
            try {
                if (!c13745r2.f56774e) {
                    c13745r2.m81770a(0, Integer.bitCount(c13748u.f56784a) * 6, (byte) 4, (byte) 0);
                    int i3 = 0;
                    while (i3 < 10) {
                        if (((1 << i3) & c13748u.f56784a) != 0) {
                            if (i3 == 4) {
                                i2 = 3;
                            } else {
                                i2 = i3 == 7 ? 4 : i3;
                            }
                            c13745r2.f56770a.mo81908a(i2);
                            c13745r2.f56770a.mo81919b(c13748u.f56785b[i3]);
                        }
                        i3++;
                    }
                    c13745r2.f56770a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iM81780a = c13733f.f56673s.m81780a();
        if (iM81780a != 65535) {
            c13733f.f56676v.m81771a(0, iM81780a - j6f.COLOR_SPACE_UNCALIBRATED);
        }
        new Thread(c13733f.f56677w).start();
    }

    /* JADX INFO: renamed from: a */
    public void m81657a(int i, int i2, int i3, int i4, boolean z, Call call, AbstractC13764m abstractC13764m) throws Throwable {
        AbstractC13764m abstractC13764m2;
        Call call2;
        int i5;
        if (this.f56511g == null) {
            List<C13761j> list = this.f56507c.f56942a.f56400f;
            C13711a c13711a = new C13711a(list);
            C13695a c13695a = this.f56507c.f56942a;
            if (c13695a.f56403i == null) {
                if (list.contains(C13761j.f56878h)) {
                    String str = this.f56507c.f56942a.f56395a.f56912d;
                    if (!C13752c.f56801a.mo81793b(str)) {
                        throw new C13718h(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
                    }
                } else {
                    throw new C13718h(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c13695a.f56399e.contains(EnumC13768q.H2_PRIOR_KNOWLEDGE)) {
                throw new C13718h(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            C13718h c13718h = null;
            while (true) {
                try {
                    try {
                        if (this.f56507c.m81881a()) {
                            call2 = call;
                            abstractC13764m2 = abstractC13764m;
                            m81658a(i, i2, i3, call2, abstractC13764m2);
                            if (this.f56508d != null) {
                                break;
                            } else {
                                break;
                            }
                        }
                        call2 = call;
                        abstractC13764m2 = abstractC13764m;
                        m81659a(i, i2, call2, abstractC13764m2);
                        try {
                            m81660a(c13711a, i4, call2, abstractC13764m2);
                            C13770s c13770s = this.f56507c;
                            InetSocketAddress inetSocketAddress = c13770s.f56944c;
                            Proxy proxy = c13770s.f56943b;
                            if (abstractC13764m2 != null) {
                                break;
                            } else {
                                throw null;
                            }
                        } catch (IOException e) {
                            e = e;
                            C13706c.m81616a(this.f56509e);
                            C13706c.m81616a(this.f56508d);
                            this.f56509e = null;
                            this.f56508d = null;
                            this.f56513i = null;
                            this.f56514j = null;
                            this.f56510f = null;
                            this.f56511g = null;
                            this.f56512h = null;
                            InetSocketAddress inetSocketAddress2 = this.f56507c.f56944c;
                            abstractC13764m2.getClass();
                            if (c13718h == null) {
                                c13718h = new C13718h(e);
                            } else {
                                IOException iOException = c13718h.f56531a;
                                Method method = C13706c.f56464j;
                                if (method != null) {
                                    try {
                                        method.invoke(iOException, e);
                                    } catch (IllegalAccessException | InvocationTargetException unused) {
                                    }
                                }
                                c13718h.f56532b = e;
                            }
                            if (z) {
                                c13711a.f56476d = true;
                                if (!((!c13711a.f56475c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : e instanceof SSLException)) {
                                    throw c13718h;
                                }
                            } else {
                                throw c13718h;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    abstractC13764m2 = abstractC13764m;
                }
            }
            if (this.f56507c.m81881a() && this.f56508d == null) {
                throw new C13718h(new ProtocolException("Too many tunnel connections attempted: 21"));
            }
            if (this.f56512h != null) {
                synchronized (this.f56506b) {
                    try {
                        C13733f c13733f = this.f56512h;
                        synchronized (c13733f) {
                            C13748u c13748u = c13733f.f56674t;
                            i5 = (c13748u.f56784a & 16) != 0 ? c13748u.f56785b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                        this.f56519o = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        qkq0.m175383a("already connected");
    }

    /* JADX INFO: renamed from: a */
    public boolean m81664a(C13767p c13767p) {
        int i = c13767p.f56913e;
        C13767p c13767p2 = this.f56507c.f56942a.f56395a;
        if (i != c13767p2.f56913e) {
            return false;
        }
        if (c13767p.f56912d.equals(c13767p2.f56912d)) {
            return true;
        }
        C13765n c13765n = this.f56510f;
        return c13765n != null && C13758d.f56813a.m81810a(c13767p.f56912d, (X509Certificate) c13765n.f56904c.get(0));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13722a m81655a(OkHttpClient okHttpClient, Interceptor.Chain chain) throws SocketException {
        if (this.f56512h != null) {
            return new C13742o(okHttpClient, this, chain, this.f56512h);
        }
        this.f56509e.setSoTimeout(chain.readTimeoutMillis());
        C13795x c13795xTimeout = this.f56513i.timeout();
        long timeoutMillis = chain.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c13795xTimeout.mo81951a(timeoutMillis, timeUnit);
        this.f56514j.timeout().mo81951a(chain.writeTimeoutMillis(), timeUnit);
        return new C13727a(okHttpClient, this, this.f56513i, this.f56514j);
    }

    /* JADX INFO: renamed from: a */
    public boolean m81665a(boolean z) {
        if (this.f56509e.isClosed() || this.f56509e.isInputShutdown() || this.f56509e.isOutputShutdown()) {
            return false;
        }
        C13733f c13733f = this.f56512h;
        if (c13733f != null) {
            long jNanoTime = System.nanoTime();
            synchronized (c13733f) {
                if (!c13733f.f56661g && (c13733f.f56668n >= c13733f.f56667m || jNanoTime < c13733f.f56670p)) {
                    return true;
                }
                return false;
            }
        }
        if (z) {
            try {
                int soTimeout = this.f56509e.getSoTimeout();
                try {
                    this.f56509e.setSoTimeout(1);
                    boolean zMo81935g = this.f56513i.mo81935g();
                    Socket socket = this.f56509e;
                    if (zMo81935g) {
                        socket.setSoTimeout(soTimeout);
                        return false;
                    }
                    socket.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f56509e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13733f.e
    /* JADX INFO: renamed from: a */
    public void mo81662a(C13744q c13744q) {
        c13744q.m81758a(EnumC13729b.REFUSED_STREAM, (IOException) null);
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13733f.e
    /* JADX INFO: renamed from: a */
    public void mo81661a(C13733f c13733f) {
        int i;
        synchronized (this.f56506b) {
            try {
                synchronized (c13733f) {
                    C13748u c13748u = c13733f.f56674t;
                    i = (c13748u.f56784a & 16) != 0 ? c13748u.f56785b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                this.f56519o = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m81663a() {
        return this.f56512h != null;
    }
}
