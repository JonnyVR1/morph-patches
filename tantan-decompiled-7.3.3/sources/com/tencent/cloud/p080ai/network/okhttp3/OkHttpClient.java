package com.tencent.cloud.p080ai.network.okhttp3;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.data.BannerFrequencyType;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.cache.InterfaceC13873d;
import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13879f;
import com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws.RealWebSocket;
import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.proxy.C13916a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.AbstractC13920c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13921d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p153l.l5j;
import p153l.mnd0;
import p153l.qg50;
import p153l.wg3;
import p153l.ypg0;

/* JADX INFO: loaded from: classes12.dex */
public class OkHttpClient implements Cloneable {

    /* JADX INFO: renamed from: C */
    public static final List<EnumC13931q> f57177C = C13869c.m82793a(EnumC13931q.HTTP_2, EnumC13931q.HTTP_1_1);

    /* JADX INFO: renamed from: D */
    public static final List<C13924j> f57178D = Collections.unmodifiableList(Arrays.asList((Object[]) new C13924j[]{C13924j.f57725g, C13924j.f57726h}.clone()));

    /* JADX INFO: renamed from: A */
    public final int f57179A;

    /* JADX INFO: renamed from: B */
    public final int f57180B;

    /* JADX INFO: renamed from: a */
    public final Dispatcher f57181a;

    /* JADX INFO: renamed from: b */
    public final Proxy f57182b;

    /* JADX INFO: renamed from: c */
    public final List<EnumC13931q> f57183c;

    /* JADX INFO: renamed from: d */
    public final List<C13924j> f57184d;

    /* JADX INFO: renamed from: e */
    public final List<Interceptor> f57185e;

    /* JADX INFO: renamed from: f */
    public final List<Interceptor> f57186f;

    /* JADX INFO: renamed from: g */
    public final AbstractC13927m.b f57187g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f57188h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC13926l f57189i;

    /* JADX INFO: renamed from: j */
    public final C13860c f57190j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC13873d f57191k;

    /* JADX INFO: renamed from: l */
    public final SocketFactory f57192l;

    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory f57193m;

    /* JADX INFO: renamed from: n */
    public final AbstractC13920c f57194n;

    /* JADX INFO: renamed from: o */
    public final HostnameVerifier f57195o;

    /* JADX INFO: renamed from: p */
    public final C13862e f57196p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC13859b f57197q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC13859b f57198r;

    /* JADX INFO: renamed from: s */
    public final C13866i f57199s;

    /* JADX INFO: renamed from: t */
    public final Dns f57200t;

    /* JADX INFO: renamed from: u */
    public final boolean f57201u;

    /* JADX INFO: renamed from: v */
    public final boolean f57202v;

    /* JADX INFO: renamed from: w */
    public final boolean f57203w;

    /* JADX INFO: renamed from: x */
    public final int f57204x;

    /* JADX INFO: renamed from: y */
    public final int f57205y;

    /* JADX INFO: renamed from: z */
    public final int f57206z;

    static {
        AbstractC13867a.f57301a = new C13852a();
    }

    public OkHttpClient(Builder builder) {
        boolean z;
        this.f57181a = builder.dispatcher;
        this.f57182b = builder.proxy;
        this.f57183c = builder.protocols;
        List<C13924j> list = builder.connectionSpecs;
        this.f57184d = list;
        this.f57185e = C13869c.m82792a(builder.interceptors);
        this.f57186f = C13869c.m82792a(builder.networkInterceptors);
        this.f57187g = builder.eventListenerFactory;
        this.f57188h = builder.proxySelector;
        this.f57189i = builder.cookieJar;
        this.f57190j = null;
        this.f57191k = builder.internalCache;
        this.f57192l = builder.socketFactory;
        Iterator<C13924j> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = (z || it.next().m83007a()) ? true : z;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = builder.sslSocketFactory;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM82796a = C13869c.m82796a();
            this.f57193m = m82765a(x509TrustManagerM82796a);
            this.f57194n = AbstractC13920c.m82990a(x509TrustManagerM82796a);
        } else {
            this.f57193m = sSLSocketFactory;
            this.f57194n = builder.certificateChainCleaner;
        }
        if (this.f57193m != null) {
            C13915c.m82984b().m82986a();
        }
        this.f57195o = builder.hostnameVerifier;
        this.f57196p = builder.certificatePinner.m82775a(this.f57194n);
        this.f57197q = builder.proxyAuthenticator;
        this.f57198r = builder.authenticator;
        this.f57199s = builder.connectionPool;
        this.f57200t = builder.dns;
        this.f57201u = builder.followSslRedirects;
        this.f57202v = builder.followRedirects;
        this.f57203w = builder.retryOnConnectionFailure;
        this.f57204x = builder.callTimeout;
        this.f57205y = builder.connectTimeout;
        this.f57206z = builder.readTimeout;
        this.f57179A = builder.writeTimeout;
        this.f57180B = builder.pingInterval;
        if (this.f57185e.contains(null)) {
            qg50.m176437a("Null interceptor: ", this.f57185e);
            throw null;
        }
        if (this.f57186f.contains(null)) {
            qg50.m176437a("Null network interceptor: ", this.f57186f);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static SSLSocketFactory m82765a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo82977c = C13915c.f57649a.mo82977c();
            sSLContextMo82977c.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo82977c.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    public InterfaceC13859b authenticator() {
        return this.f57198r;
    }

    public C13860c cache() {
        return null;
    }

    public int callTimeoutMillis() {
        return this.f57204x;
    }

    public C13862e certificatePinner() {
        return this.f57196p;
    }

    public int connectTimeoutMillis() {
        return this.f57205y;
    }

    public C13866i connectionPool() {
        return this.f57199s;
    }

    public List<C13924j> connectionSpecs() {
        return this.f57184d;
    }

    public InterfaceC13926l cookieJar() {
        return this.f57189i;
    }

    public Dispatcher dispatcher() {
        return this.f57181a;
    }

    public Dns dns() {
        return this.f57200t;
    }

    public AbstractC13927m.b eventListenerFactory() {
        return this.f57187g;
    }

    public boolean followRedirects() {
        return this.f57202v;
    }

    public boolean followSslRedirects() {
        return this.f57201u;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.f57195o;
    }

    public List<Interceptor> interceptors() {
        return this.f57185e;
    }

    public List<Interceptor> networkInterceptors() {
        return this.f57186f;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Call newCall(Request request) {
        return C13932r.m83060a(this, request, false);
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), this.f57180B);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public int pingIntervalMillis() {
        return this.f57180B;
    }

    public List<EnumC13931q> protocols() {
        return this.f57183c;
    }

    public Proxy proxy() {
        return this.f57182b;
    }

    public InterfaceC13859b proxyAuthenticator() {
        return this.f57197q;
    }

    public ProxySelector proxySelector() {
        return this.f57188h;
    }

    public int readTimeoutMillis() {
        return this.f57206z;
    }

    public boolean retryOnConnectionFailure() {
        return this.f57203w;
    }

    public SocketFactory socketFactory() {
        return this.f57192l;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.f57193m;
    }

    public int writeTimeoutMillis() {
        return this.f57179A;
    }

    public static final class Builder {
        public InterfaceC13859b authenticator;
        public C13860c cache;
        public int callTimeout;
        public AbstractC13920c certificateChainCleaner;
        public C13862e certificatePinner;
        public int connectTimeout;
        public C13866i connectionPool;
        public List<C13924j> connectionSpecs;
        public InterfaceC13926l cookieJar;
        public Dispatcher dispatcher;
        public Dns dns;
        public AbstractC13927m.b eventListenerFactory;
        public boolean followRedirects;
        public boolean followSslRedirects;
        public HostnameVerifier hostnameVerifier;
        public final List<Interceptor> interceptors;
        public InterfaceC13873d internalCache;
        public final List<Interceptor> networkInterceptors;
        public int pingInterval;
        public List<EnumC13931q> protocols;
        public Proxy proxy;
        public InterfaceC13859b proxyAuthenticator;
        public ProxySelector proxySelector;
        public int readTimeout;
        public boolean retryOnConnectionFailure;
        public SocketFactory socketFactory;
        public SSLSocketFactory sslSocketFactory;
        public int writeTimeout;

        public Builder(OkHttpClient okHttpClient) {
            ArrayList arrayList = new ArrayList();
            this.interceptors = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.networkInterceptors = arrayList2;
            this.dispatcher = okHttpClient.f57181a;
            this.proxy = okHttpClient.f57182b;
            this.protocols = okHttpClient.f57183c;
            this.connectionSpecs = okHttpClient.f57184d;
            arrayList.addAll(okHttpClient.f57185e);
            arrayList2.addAll(okHttpClient.f57186f);
            this.eventListenerFactory = okHttpClient.f57187g;
            this.proxySelector = okHttpClient.f57188h;
            this.cookieJar = okHttpClient.f57189i;
            this.internalCache = okHttpClient.f57191k;
            this.cache = null;
            this.socketFactory = okHttpClient.f57192l;
            this.sslSocketFactory = okHttpClient.f57193m;
            this.certificateChainCleaner = okHttpClient.f57194n;
            this.hostnameVerifier = okHttpClient.f57195o;
            this.certificatePinner = okHttpClient.f57196p;
            this.proxyAuthenticator = okHttpClient.f57197q;
            this.authenticator = okHttpClient.f57198r;
            this.connectionPool = okHttpClient.f57199s;
            this.dns = okHttpClient.f57200t;
            this.followSslRedirects = okHttpClient.f57201u;
            this.followRedirects = okHttpClient.f57202v;
            this.retryOnConnectionFailure = okHttpClient.f57203w;
            this.callTimeout = okHttpClient.f57204x;
            this.connectTimeout = okHttpClient.f57205y;
            this.readTimeout = okHttpClient.f57206z;
            this.writeTimeout = okHttpClient.f57179A;
            this.pingInterval = okHttpClient.f57180B;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.interceptors.add(interceptor);
                return this;
            }
            wg3.m206174a("interceptor == null");
            return null;
        }

        public Builder addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.networkInterceptors.add(interceptor);
                return this;
            }
            wg3.m206174a("interceptor == null");
            return null;
        }

        public Builder authenticator(InterfaceC13859b interfaceC13859b) {
            if (interfaceC13859b != null) {
                this.authenticator = interfaceC13859b;
                return this;
            }
            mnd0.m159157a("authenticator == null");
            return null;
        }

        public OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public Builder cache(C13860c c13860c) {
            this.cache = c13860c;
            this.internalCache = null;
            return this;
        }

        @IgnoreJRERequirement
        public Builder callTimeout(Duration duration) {
            this.callTimeout = C13869c.m82784a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder certificatePinner(C13862e c13862e) {
            if (c13862e != null) {
                this.certificatePinner = c13862e;
                return this;
            }
            mnd0.m159157a("certificatePinner == null");
            return null;
        }

        @SuppressLint({"NewApi"})
        @IgnoreJRERequirement
        public Builder connectTimeout(Duration duration) {
            this.connectTimeout = C13869c.m82784a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder connectionPool(C13866i c13866i) {
            if (c13866i != null) {
                this.connectionPool = c13866i;
                return this;
            }
            mnd0.m159157a("connectionPool == null");
            return null;
        }

        public Builder connectionSpecs(List<C13924j> list) {
            this.connectionSpecs = C13869c.m82792a(list);
            return this;
        }

        public Builder cookieJar(InterfaceC13926l interfaceC13926l) {
            if (interfaceC13926l != null) {
                this.cookieJar = interfaceC13926l;
                return this;
            }
            mnd0.m159157a("cookieJar == null");
            return null;
        }

        public Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher != null) {
                this.dispatcher = dispatcher;
                return this;
            }
            wg3.m206174a("dispatcher == null");
            return null;
        }

        public Builder dns(Dns dns) {
            if (dns != null) {
                this.dns = dns;
                return this;
            }
            mnd0.m159157a("dns == null");
            return null;
        }

        public Builder eventListener(AbstractC13927m abstractC13927m) {
            if (abstractC13927m != null) {
                this.eventListenerFactory = AbstractC13927m.m83019a(abstractC13927m);
                return this;
            }
            mnd0.m159157a("eventListener == null");
            return null;
        }

        public Builder eventListenerFactory(AbstractC13927m.b bVar) {
            if (bVar != null) {
                this.eventListenerFactory = bVar;
                return this;
            }
            mnd0.m159157a("eventListenerFactory == null");
            return null;
        }

        public Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        public Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.hostnameVerifier = hostnameVerifier;
                return this;
            }
            mnd0.m159157a("hostnameVerifier == null");
            return null;
        }

        public List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @IgnoreJRERequirement
        public Builder pingInterval(Duration duration) {
            this.pingInterval = C13869c.m82784a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder protocols(List<EnumC13931q> list) {
            ArrayList arrayList = new ArrayList(list);
            EnumC13931q enumC13931q = EnumC13931q.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(enumC13931q) && !arrayList.contains(EnumC13931q.HTTP_1_1)) {
                ypg0.m217021a("protocols must contain h2_prior_knowledge or http/1.1: ", arrayList);
                return null;
            }
            if (arrayList.contains(enumC13931q) && arrayList.size() > 1) {
                ypg0.m217021a("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayList);
                return null;
            }
            if (arrayList.contains(EnumC13931q.HTTP_1_0)) {
                ypg0.m217021a("protocols must not contain http/1.0: ", arrayList);
                return null;
            }
            if (arrayList.contains(null)) {
                wg3.m206174a("protocols must not contain null");
                return null;
            }
            arrayList.remove(EnumC13931q.SPDY_3);
            this.protocols = Collections.unmodifiableList(arrayList);
            return this;
        }

        public Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder proxyAuthenticator(InterfaceC13859b interfaceC13859b) {
            if (interfaceC13859b != null) {
                this.proxyAuthenticator = interfaceC13859b;
                return this;
            }
            mnd0.m159157a("proxyAuthenticator == null");
            return null;
        }

        public Builder proxySelector(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.proxySelector = proxySelector;
                return this;
            }
            mnd0.m159157a("proxySelector == null");
            return null;
        }

        @IgnoreJRERequirement
        public Builder readTimeout(Duration duration) {
            this.readTimeout = C13869c.m82784a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public Builder socketFactory(SocketFactory socketFactory) {
            if (socketFactory == null) {
                mnd0.m159157a("socketFactory == null");
                return null;
            }
            if (socketFactory instanceof SSLSocketFactory) {
                wg3.m206174a("socketFactory instanceof SSLSocketFactory");
                return null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                mnd0.m159157a("sslSocketFactory == null");
                return null;
            }
            this.sslSocketFactory = sSLSocketFactory;
            C13915c c13915c = C13915c.f57649a;
            X509TrustManager x509TrustManagerMo82970a = c13915c.mo82970a(sSLSocketFactory);
            if (x509TrustManagerMo82970a != null) {
                this.certificateChainCleaner = c13915c.mo82968a(x509TrustManagerMo82970a);
                return this;
            }
            StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
            sb.append(c13915c);
            l5j.m152955a(sb, ", sslSocketFactory is ", sSLSocketFactory.getClass());
            return null;
        }

        @IgnoreJRERequirement
        public Builder writeTimeout(Duration duration) {
            this.writeTimeout = C13869c.m82784a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder callTimeout(long j, TimeUnit timeUnit) {
            this.callTimeout = C13869c.m82784a("timeout", j, timeUnit);
            return this;
        }

        public Builder connectTimeout(long j, TimeUnit timeUnit) {
            this.connectTimeout = C13869c.m82784a("timeout", j, timeUnit);
            return this;
        }

        public Builder pingInterval(long j, TimeUnit timeUnit) {
            this.pingInterval = C13869c.m82784a(BannerFrequencyType.interval, j, timeUnit);
            return this;
        }

        public Builder readTimeout(long j, TimeUnit timeUnit) {
            this.readTimeout = C13869c.m82784a("timeout", j, timeUnit);
            return this;
        }

        public Builder writeTimeout(long j, TimeUnit timeUnit) {
            this.writeTimeout = C13869c.m82784a("timeout", j, timeUnit);
            return this;
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                mnd0.m159157a("sslSocketFactory == null");
                return null;
            }
            if (x509TrustManager != null) {
                this.sslSocketFactory = sSLSocketFactory;
                this.certificateChainCleaner = C13915c.f57649a.mo82968a(x509TrustManager);
                return this;
            }
            mnd0.m159157a("trustManager == null");
            return null;
        }

        public Builder() {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.dispatcher = new Dispatcher();
            this.protocols = OkHttpClient.f57177C;
            this.connectionSpecs = OkHttpClient.f57178D;
            this.eventListenerFactory = AbstractC13927m.m83019a(AbstractC13927m.f57749a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.proxySelector = proxySelector;
            if (proxySelector == null) {
                this.proxySelector = new C13916a();
            }
            this.cookieJar = InterfaceC13926l.f57748a;
            this.socketFactory = SocketFactory.getDefault();
            this.hostnameVerifier = C13921d.f57661a;
            this.certificatePinner = C13862e.f57273c;
            InterfaceC13859b interfaceC13859b = InterfaceC13859b.f57254a;
            this.proxyAuthenticator = interfaceC13859b;
            this.authenticator = interfaceC13859b;
            this.connectionPool = new C13866i();
            this.dns = Dns.SYSTEM;
            this.followSslRedirects = true;
            this.followRedirects = true;
            this.retryOnConnectionFailure = true;
            this.callTimeout = 0;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.pingInterval = 0;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.OkHttpClient$a */
    public class C13852a extends AbstractC13867a {
        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a
        /* JADX INFO: renamed from: a */
        public void mo82767a(C13929o.a aVar, String str, String str2) {
            aVar.f57755a.add(str);
            aVar.f57755a.add(str2.trim());
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a
        /* JADX INFO: renamed from: a */
        public C13879f mo82766a(C13866i c13866i) {
            return c13866i.f57300a;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
