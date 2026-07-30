package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.AbstractC13927m;
import com.tencent.cloud.p080ai.network.okhttp3.C13858a;
import com.tencent.cloud.p080ai.network.okhttp3.C13862e;
import com.tencent.cloud.p080ai.network.okhttp3.C13924j;
import com.tencent.cloud.p080ai.network.okhttp3.C13928n;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.C13933s;
import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import com.tencent.cloud.p080ai.network.okhttp3.Interceptor;
import com.tencent.cloud.p080ai.network.okhttp3.InterfaceC13865h;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.Request;
import com.tencent.cloud.p080ai.network.okhttp3.Response;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.C13887c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http.InterfaceC13885a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http1.C13890a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13895e;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13896f;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13905o;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13907q;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13908r;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13911u;
import com.tencent.cloud.p080ai.network.okhttp3.internal.http2.EnumC13892b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13921d;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.C13951q;
import com.tencent.cloud.p080ai.network.okio.C13952r;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
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
import p153l.aqg0;
import p153l.p7f;
import p153l.wtq0;
import p153l.yll;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.e */
/* JADX INFO: loaded from: classes12.dex */
public final class C13878e extends C13896f.e implements InterfaceC13865h {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ boolean f57353r = true;

    /* JADX INFO: renamed from: b */
    public final C13879f f57354b;

    /* JADX INFO: renamed from: c */
    public final C13933s f57355c;

    /* JADX INFO: renamed from: d */
    public Socket f57356d;

    /* JADX INFO: renamed from: e */
    public Socket f57357e;

    /* JADX INFO: renamed from: f */
    public C13928n f57358f;

    /* JADX INFO: renamed from: g */
    public EnumC13931q f57359g;

    /* JADX INFO: renamed from: h */
    public C13896f f57360h;

    /* JADX INFO: renamed from: i */
    public InterfaceC13941g f57361i;

    /* JADX INFO: renamed from: j */
    public InterfaceC13940f f57362j;

    /* JADX INFO: renamed from: k */
    public boolean f57363k;

    /* JADX INFO: renamed from: l */
    public int f57364l;

    /* JADX INFO: renamed from: m */
    public int f57365m;

    /* JADX INFO: renamed from: n */
    public int f57366n;

    /* JADX INFO: renamed from: o */
    public int f57367o = 1;

    /* JADX INFO: renamed from: p */
    public final List<Reference<C13883j>> f57368p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public long f57369q = Long.MAX_VALUE;

    public C13878e(C13879f c13879f, C13933s c13933s) {
        this.f57354b = c13879f;
        this.f57355c = c13933s;
    }

    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.tencent.cloud.ai.network.okhttp3.OkHttpClient, com.tencent.cloud.ai.network.okhttp3.internal.connection.e] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: a */
    public final void m82841a(int i, int i2, int i3, Call call, AbstractC13927m abstractC13927m) throws IOException {
        long j;
        int i4;
        boolean z = false;
        boolean z2 = true;
        Request requestBuild = new Request.Builder().url(this.f57355c.f57790a.f57243a).method(HttpMethods.CONNECT, null).header("Host", C13869c.m82786a(this.f57355c.f57790a.f57243a, true)).header(HttpHeaders.PROXY_CONNECTION, HttpHeaders.KEEP_ALIVE).header("User-Agent", "okhttp/3.14.0").build();
        long j2 = -1;
        Response responseBuild = new Response.Builder().request(requestBuild).protocol(EnumC13931q.HTTP_1_1).code(HttpStatus.PROXY_AUTHENTICATION_REQUIRED_407).message("Preemptive Authenticate").body(C13869c.f57305c).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").build();
        C13933s c13933s = this.f57355c;
        Request requestMo82772a = c13933s.f57790a.f57246d.mo82772a(c13933s, responseBuild);
        if (requestMo82772a != null) {
            requestBuild = requestMo82772a;
        }
        C13930p c13930pUrl = requestBuild.url();
        int i5 = 0;
        while (i5 < 21) {
            m82842a(i, i2, call, abstractC13927m);
            String str = "CONNECT " + C13869c.m82786a(c13930pUrl, z2) + " HTTP/1.1";
            ?? r4 = z;
            while (true) {
                j = j2;
                C13890a c13890a = new C13890a(r4, r4, this.f57361i, this.f57362j);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f57361i.timeout().mo83134a(i2, timeUnit);
                i4 = i5;
                this.f57362j.timeout().mo83134a(i3, timeUnit);
                c13890a.m82896a(requestBuild.headers(), str);
                c13890a.f57436d.flush();
                Response responseBuild2 = c13890a.mo82874a(false).request(requestBuild).build();
                long jM82885a = C13887c.m82885a(responseBuild2);
                if (jM82885a != j) {
                    InterfaceC13957w interfaceC13957wM82895a = c13890a.m82895a(jM82885a);
                    C13869c.m82807b(interfaceC13957wM82895a, Api.BaseClientBuilder.API_PRIORITY_OTHER, timeUnit);
                    ((C13890a.e) interfaceC13957wM82895a).close();
                }
                int iCode = responseBuild2.code();
                if (iCode == 200) {
                    if (this.f57361i.mo83087a().mo83118g() && this.f57362j.mo83087a().mo83118g()) {
                        requestBuild = null;
                        break;
                    } else {
                        zpg0.m220844a("TLS tunnel buffered too many bytes!");
                        return;
                    }
                }
                if (iCode != 407) {
                    yll.m216601a("Unexpected response code for CONNECT: ", responseBuild2.code());
                    return;
                }
                C13933s c13933s2 = this.f57355c;
                Request requestMo82772a2 = c13933s2.f57790a.f57246d.mo82772a(c13933s2, responseBuild2);
                if (requestMo82772a2 == null) {
                    zpg0.m220844a("Failed to authenticate with proxy");
                    return;
                } else {
                    if ("close".equalsIgnoreCase(responseBuild2.header(HttpHeaders.CONNECTION))) {
                        requestBuild = requestMo82772a2;
                        break;
                    }
                    requestBuild = requestMo82772a2;
                    j2 = j;
                    i5 = i4;
                    r4 = 0;
                }
            }
            if (requestBuild == null) {
                return;
            }
            C13869c.m82799a(this.f57356d);
            z = false;
            this.f57356d = null;
            this.f57362j = null;
            this.f57361i = null;
            InetSocketAddress inetSocketAddress = this.f57355c.f57792c;
            i5 = i4 + 1;
            j2 = j;
            z2 = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82849b() {
        if (!f57353r && Thread.holdsLock(this.f57354b)) {
            aqg0.m99478a();
            return;
        }
        synchronized (this.f57354b) {
            this.f57363k = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f57355c.f57790a.f57243a.f57760d);
        sb.append(":");
        sb.append(this.f57355c.f57790a.f57243a.f57761e);
        sb.append(", proxy=");
        sb.append(this.f57355c.f57791b);
        sb.append(" hostAddress=");
        sb.append(this.f57355c.f57792c);
        sb.append(" cipherSuite=");
        C13928n c13928n = this.f57358f;
        sb.append(c13928n != null ? c13928n.f57751b : "none");
        sb.append(" protocol=");
        sb.append(this.f57359g);
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final void m82842a(int i, int i2, Call call, AbstractC13927m abstractC13927m) throws IOException {
        Socket socketCreateSocket;
        C13933s c13933s = this.f57355c;
        Proxy proxy = c13933s.f57791b;
        C13858a c13858a = c13933s.f57790a;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            socketCreateSocket = new Socket(proxy);
        } else {
            socketCreateSocket = c13858a.f57245c.createSocket();
        }
        this.f57356d = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f57355c.f57792c;
        abstractC13927m.getClass();
        socketCreateSocket.setSoTimeout(i2);
        try {
            C13915c.f57649a.mo82973a(this.f57356d, this.f57355c.f57792c, i);
            try {
                this.f57361i = new C13952r(C13948n.m83149b(this.f57356d));
                this.f57362j = new C13951q(C13948n.m83145a(this.f57356d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f57355c.f57792c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m82843a(C13874a c13874a, int i, Call call, AbstractC13927m abstractC13927m) throws Throwable {
        EnumC13931q enumC13931qM83059a;
        C13858a c13858a = this.f57355c.f57790a;
        SSLSocketFactory sSLSocketFactory = c13858a.f57251i;
        if (sSLSocketFactory == null) {
            List<EnumC13931q> list = c13858a.f57247e;
            EnumC13931q enumC13931q = EnumC13931q.H2_PRIOR_KNOWLEDGE;
            boolean zContains = list.contains(enumC13931q);
            Socket socket = this.f57356d;
            if (zContains) {
                this.f57357e = socket;
                this.f57359g = enumC13931q;
                m82839a(i);
                return;
            } else {
                this.f57357e = socket;
                this.f57359g = EnumC13931q.HTTP_1_1;
                return;
            }
        }
        abstractC13927m.getClass();
        SSLSocket sSLSocket = null;
        try {
            try {
                Socket socket2 = this.f57356d;
                C13930p c13930p = c13858a.f57243a;
                SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket2, c13930p.f57760d, c13930p.f57761e, true);
                try {
                    C13924j c13924jM82824a = c13874a.m82824a(sSLSocket2);
                    if (c13924jM82824a.f57728b) {
                        C13915c.f57649a.mo82967a(sSLSocket2, c13858a.f57243a.f57760d, c13858a.f57247e);
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C13928n c13928nM83022a = C13928n.m83022a(session);
                    if (!c13858a.f57252j.verify(c13858a.f57243a.f57760d, session)) {
                        List<Certificate> list2 = c13928nM83022a.f57752c;
                        if (!list2.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + c13858a.f57243a.f57760d + " not verified:\n    certificate: " + C13862e.m82774a(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C13921d.m82991a(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c13858a.f57243a.f57760d + " not verified (no certificates)");
                    }
                    c13858a.f57253k.m82776a(c13858a.f57243a.f57760d, c13928nM83022a.f57752c);
                    String strMo82966a = c13924jM82824a.f57728b ? C13915c.f57649a.mo82966a(sSLSocket2) : null;
                    this.f57357e = sSLSocket2;
                    this.f57361i = new C13952r(C13948n.m83149b(sSLSocket2));
                    this.f57362j = new C13951q(C13948n.m83145a(this.f57357e));
                    this.f57358f = c13928nM83022a;
                    if (strMo82966a != null) {
                        enumC13931qM83059a = EnumC13931q.m83059a(strMo82966a);
                    } else {
                        enumC13931qM83059a = EnumC13931q.HTTP_1_1;
                    }
                    this.f57359g = enumC13931qM83059a;
                    C13915c.f57649a.getClass();
                    if (enumC13931qM83059a == EnumC13931q.HTTP_2) {
                        m82839a(i);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!C13869c.m82802a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C13915c.f57649a.getClass();
                    }
                    C13869c.m82799a((Socket) sSLSocket);
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
    public final void m82839a(int i) throws SocketException {
        int i2;
        this.f57357e.setSoTimeout(0);
        C13896f.c cVar = new C13896f.c(true);
        Socket socket = this.f57357e;
        String str = this.f57355c.f57790a.f57243a.f57760d;
        InterfaceC13941g interfaceC13941g = this.f57361i;
        InterfaceC13940f interfaceC13940f = this.f57362j;
        cVar.f57533a = socket;
        cVar.f57534b = str;
        cVar.f57535c = interfaceC13941g;
        cVar.f57536d = interfaceC13940f;
        cVar.f57537e = this;
        cVar.f57540h = i;
        C13896f c13896f = new C13896f(cVar);
        this.f57360h = c13896f;
        C13908r c13908r = c13896f.f57524v;
        synchronized (c13908r) {
            try {
                if (!c13908r.f57622e) {
                    if (c13908r.f57619b) {
                        Logger logger = C13908r.f57617g;
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(C13869c.m82788a(">> CONNECTION %s", C13895e.f57497a.hex()));
                        }
                        c13908r.f57618a.mo83093a(C13895e.f57497a.toByteArray());
                        c13908r.f57618a.flush();
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C13908r c13908r2 = c13896f.f57524v;
        C13911u c13911u = c13896f.f57521s;
        synchronized (c13908r2) {
            try {
                if (!c13908r2.f57622e) {
                    c13908r2.m82953a(0, Integer.bitCount(c13911u.f57632a) * 6, (byte) 4, (byte) 0);
                    int i3 = 0;
                    while (i3 < 10) {
                        if (((1 << i3) & c13911u.f57632a) != 0) {
                            if (i3 == 4) {
                                i2 = 3;
                            } else {
                                i2 = i3 == 7 ? 4 : i3;
                            }
                            c13908r2.f57618a.mo83091a(i2);
                            c13908r2.f57618a.mo83102b(c13911u.f57633b[i3]);
                        }
                        i3++;
                    }
                    c13908r2.f57618a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iM82963a = c13896f.f57521s.m82963a();
        if (iM82963a != 65535) {
            c13896f.f57524v.m82954a(0, iM82963a - p7f.COLOR_SPACE_UNCALIBRATED);
        }
        new Thread(c13896f.f57525w).start();
    }

    /* JADX INFO: renamed from: a */
    public void m82840a(int i, int i2, int i3, int i4, boolean z, Call call, AbstractC13927m abstractC13927m) throws Throwable {
        AbstractC13927m abstractC13927m2;
        Call call2;
        int i5;
        if (this.f57359g == null) {
            List<C13924j> list = this.f57355c.f57790a.f57248f;
            C13874a c13874a = new C13874a(list);
            C13858a c13858a = this.f57355c.f57790a;
            if (c13858a.f57251i == null) {
                if (list.contains(C13924j.f57726h)) {
                    String str = this.f57355c.f57790a.f57243a.f57760d;
                    if (!C13915c.f57649a.mo82976b(str)) {
                        throw new C13881h(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
                    }
                } else {
                    throw new C13881h(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c13858a.f57247e.contains(EnumC13931q.H2_PRIOR_KNOWLEDGE)) {
                throw new C13881h(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            C13881h c13881h = null;
            while (true) {
                try {
                    try {
                        if (this.f57355c.m83064a()) {
                            call2 = call;
                            abstractC13927m2 = abstractC13927m;
                            m82841a(i, i2, i3, call2, abstractC13927m2);
                            if (this.f57356d != null) {
                                break;
                            } else {
                                break;
                            }
                        }
                        call2 = call;
                        abstractC13927m2 = abstractC13927m;
                        m82842a(i, i2, call2, abstractC13927m2);
                        try {
                            m82843a(c13874a, i4, call2, abstractC13927m2);
                            C13933s c13933s = this.f57355c;
                            InetSocketAddress inetSocketAddress = c13933s.f57792c;
                            Proxy proxy = c13933s.f57791b;
                            if (abstractC13927m2 != null) {
                                break;
                            } else {
                                throw null;
                            }
                        } catch (IOException e) {
                            e = e;
                            C13869c.m82799a(this.f57357e);
                            C13869c.m82799a(this.f57356d);
                            this.f57357e = null;
                            this.f57356d = null;
                            this.f57361i = null;
                            this.f57362j = null;
                            this.f57358f = null;
                            this.f57359g = null;
                            this.f57360h = null;
                            InetSocketAddress inetSocketAddress2 = this.f57355c.f57792c;
                            abstractC13927m2.getClass();
                            if (c13881h == null) {
                                c13881h = new C13881h(e);
                            } else {
                                IOException iOException = c13881h.f57379a;
                                Method method = C13869c.f57312j;
                                if (method != null) {
                                    try {
                                        method.invoke(iOException, e);
                                    } catch (IllegalAccessException | InvocationTargetException unused) {
                                    }
                                }
                                c13881h.f57380b = e;
                            }
                            if (z) {
                                c13874a.f57324d = true;
                                if (!((!c13874a.f57323c || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) ? false : e instanceof SSLException)) {
                                    throw c13881h;
                                }
                            } else {
                                throw c13881h;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    abstractC13927m2 = abstractC13927m;
                }
            }
            if (this.f57355c.m83064a() && this.f57356d == null) {
                throw new C13881h(new ProtocolException("Too many tunnel connections attempted: 21"));
            }
            if (this.f57360h != null) {
                synchronized (this.f57354b) {
                    try {
                        C13896f c13896f = this.f57360h;
                        synchronized (c13896f) {
                            C13911u c13911u = c13896f.f57522t;
                            i5 = (c13911u.f57632a & 16) != 0 ? c13911u.f57633b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                        this.f57367o = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        wtq0.m207906a("already connected");
    }

    /* JADX INFO: renamed from: a */
    public boolean m82847a(C13930p c13930p) {
        int i = c13930p.f57761e;
        C13930p c13930p2 = this.f57355c.f57790a.f57243a;
        if (i != c13930p2.f57761e) {
            return false;
        }
        if (c13930p.f57760d.equals(c13930p2.f57760d)) {
            return true;
        }
        C13928n c13928n = this.f57358f;
        return c13928n != null && C13921d.f57661a.m82993a(c13930p.f57760d, (X509Certificate) c13928n.f57752c.get(0));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13885a m82838a(OkHttpClient okHttpClient, Interceptor.Chain chain) throws SocketException {
        if (this.f57360h != null) {
            return new C13905o(okHttpClient, this, chain, this.f57360h);
        }
        this.f57357e.setSoTimeout(chain.readTimeoutMillis());
        C13958x c13958xTimeout = this.f57361i.timeout();
        long timeoutMillis = chain.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c13958xTimeout.mo83134a(timeoutMillis, timeUnit);
        this.f57362j.timeout().mo83134a(chain.writeTimeoutMillis(), timeUnit);
        return new C13890a(okHttpClient, this, this.f57361i, this.f57362j);
    }

    /* JADX INFO: renamed from: a */
    public boolean m82848a(boolean z) {
        if (this.f57357e.isClosed() || this.f57357e.isInputShutdown() || this.f57357e.isOutputShutdown()) {
            return false;
        }
        C13896f c13896f = this.f57360h;
        if (c13896f != null) {
            long jNanoTime = System.nanoTime();
            synchronized (c13896f) {
                if (!c13896f.f57509g && (c13896f.f57516n >= c13896f.f57515m || jNanoTime < c13896f.f57518p)) {
                    return true;
                }
                return false;
            }
        }
        if (z) {
            try {
                int soTimeout = this.f57357e.getSoTimeout();
                try {
                    this.f57357e.setSoTimeout(1);
                    boolean zMo83118g = this.f57361i.mo83118g();
                    Socket socket = this.f57357e;
                    if (zMo83118g) {
                        socket.setSoTimeout(soTimeout);
                        return false;
                    }
                    socket.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f57357e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13896f.e
    /* JADX INFO: renamed from: a */
    public void mo82845a(C13907q c13907q) {
        c13907q.m82941a(EnumC13892b.REFUSED_STREAM, (IOException) null);
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13896f.e
    /* JADX INFO: renamed from: a */
    public void mo82844a(C13896f c13896f) {
        int i;
        synchronized (this.f57354b) {
            try {
                synchronized (c13896f) {
                    C13911u c13911u = c13896f.f57522t;
                    i = (c13911u.f57632a & 16) != 0 ? c13911u.f57633b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
                this.f57367o = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m82846a() {
        return this.f57360h != null;
    }
}
