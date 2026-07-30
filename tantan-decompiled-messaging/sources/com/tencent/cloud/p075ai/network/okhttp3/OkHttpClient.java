package com.tencent.cloud.p075ai.network.okhttp3;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.data.BannerFrequencyType;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.cache.InterfaceC13710d;
import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13716f;
import com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws.RealWebSocket;
import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.proxy.C13753a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.AbstractC13757c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13758d;
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
import p149l.ig3;
import p149l.j850;
import p149l.jfd0;
import p149l.q2j;
import p149l.qhg0;

/* JADX INFO: loaded from: classes13.dex */
public class OkHttpClient implements Cloneable {

    /* JADX INFO: renamed from: C */
    public static final List<EnumC13768q> f56329C = C13706c.m81610a(EnumC13768q.HTTP_2, EnumC13768q.HTTP_1_1);

    /* JADX INFO: renamed from: D */
    public static final List<C13761j> f56330D = Collections.unmodifiableList(Arrays.asList((Object[]) new C13761j[]{C13761j.f56877g, C13761j.f56878h}.clone()));

    /* JADX INFO: renamed from: A */
    public final int f56331A;

    /* JADX INFO: renamed from: B */
    public final int f56332B;

    /* JADX INFO: renamed from: a */
    public final Dispatcher f56333a;

    /* JADX INFO: renamed from: b */
    public final Proxy f56334b;

    /* JADX INFO: renamed from: c */
    public final List<EnumC13768q> f56335c;

    /* JADX INFO: renamed from: d */
    public final List<C13761j> f56336d;

    /* JADX INFO: renamed from: e */
    public final List<Interceptor> f56337e;

    /* JADX INFO: renamed from: f */
    public final List<Interceptor> f56338f;

    /* JADX INFO: renamed from: g */
    public final AbstractC13764m.b f56339g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f56340h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC13763l f56341i;

    /* JADX INFO: renamed from: j */
    public final C13697c f56342j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC13710d f56343k;

    /* JADX INFO: renamed from: l */
    public final SocketFactory f56344l;

    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory f56345m;

    /* JADX INFO: renamed from: n */
    public final AbstractC13757c f56346n;

    /* JADX INFO: renamed from: o */
    public final HostnameVerifier f56347o;

    /* JADX INFO: renamed from: p */
    public final C13699e f56348p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC13696b f56349q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC13696b f56350r;

    /* JADX INFO: renamed from: s */
    public final C13703i f56351s;

    /* JADX INFO: renamed from: t */
    public final Dns f56352t;

    /* JADX INFO: renamed from: u */
    public final boolean f56353u;

    /* JADX INFO: renamed from: v */
    public final boolean f56354v;

    /* JADX INFO: renamed from: w */
    public final boolean f56355w;

    /* JADX INFO: renamed from: x */
    public final int f56356x;

    /* JADX INFO: renamed from: y */
    public final int f56357y;

    /* JADX INFO: renamed from: z */
    public final int f56358z;

    static {
        AbstractC13704a.f56453a = new C13689a();
    }

    public OkHttpClient(Builder builder) {
        boolean z;
        this.f56333a = builder.dispatcher;
        this.f56334b = builder.proxy;
        this.f56335c = builder.protocols;
        List<C13761j> list = builder.connectionSpecs;
        this.f56336d = list;
        this.f56337e = C13706c.m81609a(builder.interceptors);
        this.f56338f = C13706c.m81609a(builder.networkInterceptors);
        this.f56339g = builder.eventListenerFactory;
        this.f56340h = builder.proxySelector;
        this.f56341i = builder.cookieJar;
        this.f56342j = null;
        this.f56343k = builder.internalCache;
        this.f56344l = builder.socketFactory;
        Iterator<C13761j> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = (z || it.next().m81824a()) ? true : z;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = builder.sslSocketFactory;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM81613a = C13706c.m81613a();
            this.f56345m = m81582a(x509TrustManagerM81613a);
            this.f56346n = AbstractC13757c.m81807a(x509TrustManagerM81613a);
        } else {
            this.f56345m = sSLSocketFactory;
            this.f56346n = builder.certificateChainCleaner;
        }
        if (this.f56345m != null) {
            C13752c.m81801b().m81803a();
        }
        this.f56347o = builder.hostnameVerifier;
        this.f56348p = builder.certificatePinner.m81592a(this.f56346n);
        this.f56349q = builder.proxyAuthenticator;
        this.f56350r = builder.authenticator;
        this.f56351s = builder.connectionPool;
        this.f56352t = builder.dns;
        this.f56353u = builder.followSslRedirects;
        this.f56354v = builder.followRedirects;
        this.f56355w = builder.retryOnConnectionFailure;
        this.f56356x = builder.callTimeout;
        this.f56357y = builder.connectTimeout;
        this.f56358z = builder.readTimeout;
        this.f56331A = builder.writeTimeout;
        this.f56332B = builder.pingInterval;
        if (this.f56337e.contains(null)) {
            j850.m140190a("Null interceptor: ", this.f56337e);
            throw null;
        }
        if (this.f56338f.contains(null)) {
            j850.m140190a("Null network interceptor: ", this.f56338f);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static SSLSocketFactory m81582a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo81794c = C13752c.f56801a.mo81794c();
            sSLContextMo81794c.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo81794c.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    public InterfaceC13696b authenticator() {
        return this.f56350r;
    }

    public C13697c cache() {
        return null;
    }

    public int callTimeoutMillis() {
        return this.f56356x;
    }

    public C13699e certificatePinner() {
        return this.f56348p;
    }

    public int connectTimeoutMillis() {
        return this.f56357y;
    }

    public C13703i connectionPool() {
        return this.f56351s;
    }

    public List<C13761j> connectionSpecs() {
        return this.f56336d;
    }

    public InterfaceC13763l cookieJar() {
        return this.f56341i;
    }

    public Dispatcher dispatcher() {
        return this.f56333a;
    }

    public Dns dns() {
        return this.f56352t;
    }

    public AbstractC13764m.b eventListenerFactory() {
        return this.f56339g;
    }

    public boolean followRedirects() {
        return this.f56354v;
    }

    public boolean followSslRedirects() {
        return this.f56353u;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.f56347o;
    }

    public List<Interceptor> interceptors() {
        return this.f56337e;
    }

    public List<Interceptor> networkInterceptors() {
        return this.f56338f;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Call newCall(Request request) {
        return C13769r.m81877a(this, request, false);
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), this.f56332B);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public int pingIntervalMillis() {
        return this.f56332B;
    }

    public List<EnumC13768q> protocols() {
        return this.f56335c;
    }

    public Proxy proxy() {
        return this.f56334b;
    }

    public InterfaceC13696b proxyAuthenticator() {
        return this.f56349q;
    }

    public ProxySelector proxySelector() {
        return this.f56340h;
    }

    public int readTimeoutMillis() {
        return this.f56358z;
    }

    public boolean retryOnConnectionFailure() {
        return this.f56355w;
    }

    public SocketFactory socketFactory() {
        return this.f56344l;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.f56345m;
    }

    public int writeTimeoutMillis() {
        return this.f56331A;
    }

    public static final class Builder {
        public InterfaceC13696b authenticator;
        public C13697c cache;
        public int callTimeout;
        public AbstractC13757c certificateChainCleaner;
        public C13699e certificatePinner;
        public int connectTimeout;
        public C13703i connectionPool;
        public List<C13761j> connectionSpecs;
        public InterfaceC13763l cookieJar;
        public Dispatcher dispatcher;
        public Dns dns;
        public AbstractC13764m.b eventListenerFactory;
        public boolean followRedirects;
        public boolean followSslRedirects;
        public HostnameVerifier hostnameVerifier;
        public final List<Interceptor> interceptors;
        public InterfaceC13710d internalCache;
        public final List<Interceptor> networkInterceptors;
        public int pingInterval;
        public List<EnumC13768q> protocols;
        public Proxy proxy;
        public InterfaceC13696b proxyAuthenticator;
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
            this.dispatcher = okHttpClient.f56333a;
            this.proxy = okHttpClient.f56334b;
            this.protocols = okHttpClient.f56335c;
            this.connectionSpecs = okHttpClient.f56336d;
            arrayList.addAll(okHttpClient.f56337e);
            arrayList2.addAll(okHttpClient.f56338f);
            this.eventListenerFactory = okHttpClient.f56339g;
            this.proxySelector = okHttpClient.f56340h;
            this.cookieJar = okHttpClient.f56341i;
            this.internalCache = okHttpClient.f56343k;
            this.cache = null;
            this.socketFactory = okHttpClient.f56344l;
            this.sslSocketFactory = okHttpClient.f56345m;
            this.certificateChainCleaner = okHttpClient.f56346n;
            this.hostnameVerifier = okHttpClient.f56347o;
            this.certificatePinner = okHttpClient.f56348p;
            this.proxyAuthenticator = okHttpClient.f56349q;
            this.authenticator = okHttpClient.f56350r;
            this.connectionPool = okHttpClient.f56351s;
            this.dns = okHttpClient.f56352t;
            this.followSslRedirects = okHttpClient.f56353u;
            this.followRedirects = okHttpClient.f56354v;
            this.retryOnConnectionFailure = okHttpClient.f56355w;
            this.callTimeout = okHttpClient.f56356x;
            this.connectTimeout = okHttpClient.f56357y;
            this.readTimeout = okHttpClient.f56358z;
            this.writeTimeout = okHttpClient.f56331A;
            this.pingInterval = okHttpClient.f56332B;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.interceptors.add(interceptor);
                return this;
            }
            ig3.m135964a("interceptor == null");
            return null;
        }

        public Builder addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.networkInterceptors.add(interceptor);
                return this;
            }
            ig3.m135964a("interceptor == null");
            return null;
        }

        public Builder authenticator(InterfaceC13696b interfaceC13696b) {
            if (interfaceC13696b != null) {
                this.authenticator = interfaceC13696b;
                return this;
            }
            jfd0.m141176a("authenticator == null");
            return null;
        }

        public OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public Builder cache(C13697c c13697c) {
            this.cache = c13697c;
            this.internalCache = null;
            return this;
        }

        @IgnoreJRERequirement
        public Builder callTimeout(Duration duration) {
            this.callTimeout = C13706c.m81601a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder certificatePinner(C13699e c13699e) {
            if (c13699e != null) {
                this.certificatePinner = c13699e;
                return this;
            }
            jfd0.m141176a("certificatePinner == null");
            return null;
        }

        @SuppressLint({"NewApi"})
        @IgnoreJRERequirement
        public Builder connectTimeout(Duration duration) {
            this.connectTimeout = C13706c.m81601a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder connectionPool(C13703i c13703i) {
            if (c13703i != null) {
                this.connectionPool = c13703i;
                return this;
            }
            jfd0.m141176a("connectionPool == null");
            return null;
        }

        public Builder connectionSpecs(List<C13761j> list) {
            this.connectionSpecs = C13706c.m81609a(list);
            return this;
        }

        public Builder cookieJar(InterfaceC13763l interfaceC13763l) {
            if (interfaceC13763l != null) {
                this.cookieJar = interfaceC13763l;
                return this;
            }
            jfd0.m141176a("cookieJar == null");
            return null;
        }

        public Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher != null) {
                this.dispatcher = dispatcher;
                return this;
            }
            ig3.m135964a("dispatcher == null");
            return null;
        }

        public Builder dns(Dns dns) {
            if (dns != null) {
                this.dns = dns;
                return this;
            }
            jfd0.m141176a("dns == null");
            return null;
        }

        public Builder eventListener(AbstractC13764m abstractC13764m) {
            if (abstractC13764m != null) {
                this.eventListenerFactory = AbstractC13764m.m81836a(abstractC13764m);
                return this;
            }
            jfd0.m141176a("eventListener == null");
            return null;
        }

        public Builder eventListenerFactory(AbstractC13764m.b bVar) {
            if (bVar != null) {
                this.eventListenerFactory = bVar;
                return this;
            }
            jfd0.m141176a("eventListenerFactory == null");
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
            jfd0.m141176a("hostnameVerifier == null");
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
            this.pingInterval = C13706c.m81601a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder protocols(List<EnumC13768q> list) {
            ArrayList arrayList = new ArrayList(list);
            EnumC13768q enumC13768q = EnumC13768q.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(enumC13768q) && !arrayList.contains(EnumC13768q.HTTP_1_1)) {
                qhg0.m174539a("protocols must contain h2_prior_knowledge or http/1.1: ", arrayList);
                return null;
            }
            if (arrayList.contains(enumC13768q) && arrayList.size() > 1) {
                qhg0.m174539a("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayList);
                return null;
            }
            if (arrayList.contains(EnumC13768q.HTTP_1_0)) {
                qhg0.m174539a("protocols must not contain http/1.0: ", arrayList);
                return null;
            }
            if (arrayList.contains(null)) {
                ig3.m135964a("protocols must not contain null");
                return null;
            }
            arrayList.remove(EnumC13768q.SPDY_3);
            this.protocols = Collections.unmodifiableList(arrayList);
            return this;
        }

        public Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder proxyAuthenticator(InterfaceC13696b interfaceC13696b) {
            if (interfaceC13696b != null) {
                this.proxyAuthenticator = interfaceC13696b;
                return this;
            }
            jfd0.m141176a("proxyAuthenticator == null");
            return null;
        }

        public Builder proxySelector(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.proxySelector = proxySelector;
                return this;
            }
            jfd0.m141176a("proxySelector == null");
            return null;
        }

        @IgnoreJRERequirement
        public Builder readTimeout(Duration duration) {
            this.readTimeout = C13706c.m81601a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public Builder socketFactory(SocketFactory socketFactory) {
            if (socketFactory == null) {
                jfd0.m141176a("socketFactory == null");
                return null;
            }
            if (socketFactory instanceof SSLSocketFactory) {
                ig3.m135964a("socketFactory instanceof SSLSocketFactory");
                return null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                jfd0.m141176a("sslSocketFactory == null");
                return null;
            }
            this.sslSocketFactory = sSLSocketFactory;
            C13752c c13752c = C13752c.f56801a;
            X509TrustManager x509TrustManagerMo81787a = c13752c.mo81787a(sSLSocketFactory);
            if (x509TrustManagerMo81787a != null) {
                this.certificateChainCleaner = c13752c.mo81785a(x509TrustManagerMo81787a);
                return this;
            }
            StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
            sb.append(c13752c);
            q2j.m172469a(sb, ", sslSocketFactory is ", sSLSocketFactory.getClass());
            return null;
        }

        @IgnoreJRERequirement
        public Builder writeTimeout(Duration duration) {
            this.writeTimeout = C13706c.m81601a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public Builder callTimeout(long j, TimeUnit timeUnit) {
            this.callTimeout = C13706c.m81601a("timeout", j, timeUnit);
            return this;
        }

        public Builder connectTimeout(long j, TimeUnit timeUnit) {
            this.connectTimeout = C13706c.m81601a("timeout", j, timeUnit);
            return this;
        }

        public Builder pingInterval(long j, TimeUnit timeUnit) {
            this.pingInterval = C13706c.m81601a(BannerFrequencyType.interval, j, timeUnit);
            return this;
        }

        public Builder readTimeout(long j, TimeUnit timeUnit) {
            this.readTimeout = C13706c.m81601a("timeout", j, timeUnit);
            return this;
        }

        public Builder writeTimeout(long j, TimeUnit timeUnit) {
            this.writeTimeout = C13706c.m81601a("timeout", j, timeUnit);
            return this;
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                jfd0.m141176a("sslSocketFactory == null");
                return null;
            }
            if (x509TrustManager != null) {
                this.sslSocketFactory = sSLSocketFactory;
                this.certificateChainCleaner = C13752c.f56801a.mo81785a(x509TrustManager);
                return this;
            }
            jfd0.m141176a("trustManager == null");
            return null;
        }

        public Builder() {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.dispatcher = new Dispatcher();
            this.protocols = OkHttpClient.f56329C;
            this.connectionSpecs = OkHttpClient.f56330D;
            this.eventListenerFactory = AbstractC13764m.m81836a(AbstractC13764m.f56901a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.proxySelector = proxySelector;
            if (proxySelector == null) {
                this.proxySelector = new C13753a();
            }
            this.cookieJar = InterfaceC13763l.f56900a;
            this.socketFactory = SocketFactory.getDefault();
            this.hostnameVerifier = C13758d.f56813a;
            this.certificatePinner = C13699e.f56425c;
            InterfaceC13696b interfaceC13696b = InterfaceC13696b.f56406a;
            this.proxyAuthenticator = interfaceC13696b;
            this.authenticator = interfaceC13696b;
            this.connectionPool = new C13703i();
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
    public class C13689a extends AbstractC13704a {
        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a
        /* JADX INFO: renamed from: a */
        public void mo81584a(C13766o.a aVar, String str, String str2) {
            aVar.f56907a.add(str);
            aVar.f56907a.add(str2.trim());
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a
        /* JADX INFO: renamed from: a */
        public C13716f mo81583a(C13703i c13703i) {
            return c13703i.f56452a;
        }
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
