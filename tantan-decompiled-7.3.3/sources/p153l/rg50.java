package p153l;

import com.p051p1.mobile.putong.data.BannerFrequencyType;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.C21953a;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public class rg50 implements Cloneable, ry3.InterfaceC19935a {

    /* JADX INFO: renamed from: C */
    public static final List<Protocol> f162906C = zlk0.m220259u(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: D */
    public static final List<C21953a> f162907D = zlk0.m220259u(C21953a.f206770h, C21953a.f206772j);

    /* JADX INFO: renamed from: A */
    public final int f162908A;

    /* JADX INFO: renamed from: B */
    public final int f162909B;

    /* JADX INFO: renamed from: a */
    public final o5e f162910a;

    /* JADX INFO: renamed from: b */
    public final Proxy f162911b;

    /* JADX INFO: renamed from: c */
    public final List<Protocol> f162912c;

    /* JADX INFO: renamed from: d */
    public final List<C21953a> f162913d;

    /* JADX INFO: renamed from: e */
    public final List<azm> f162914e;

    /* JADX INFO: renamed from: f */
    public final List<azm> f162915f;

    /* JADX INFO: renamed from: g */
    public final t4f.InterfaceC20235b f162916g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f162917h;

    /* JADX INFO: renamed from: i */
    public final eu6 f162918i;

    /* JADX INFO: renamed from: j */
    public final tx3 f162919j;

    /* JADX INFO: renamed from: k */
    public final lzm f162920k;

    /* JADX INFO: renamed from: l */
    public final SocketFactory f162921l;

    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory f162922m;

    /* JADX INFO: renamed from: n */
    public final vq4 f162923n;

    /* JADX INFO: renamed from: o */
    public final HostnameVerifier f162924o;

    /* JADX INFO: renamed from: p */
    public final xq4 f162925p;

    /* JADX INFO: renamed from: q */
    public final ce1 f162926q;

    /* JADX INFO: renamed from: r */
    public final ce1 f162927r;

    /* JADX INFO: renamed from: s */
    public final lx5 f162928s;

    /* JADX INFO: renamed from: t */
    public final o6e f162929t;

    /* JADX INFO: renamed from: u */
    public final boolean f162930u;

    /* JADX INFO: renamed from: v */
    public final boolean f162931v;

    /* JADX INFO: renamed from: w */
    public final boolean f162932w;

    /* JADX INFO: renamed from: x */
    public final int f162933x;

    /* JADX INFO: renamed from: y */
    public final int f162934y;

    /* JADX INFO: renamed from: z */
    public final int f162935z;

    /* JADX INFO: renamed from: l.rg50$a */
    public static class C19836a extends kzm {
        @Override // p153l.kzm
        /* JADX INFO: renamed from: a */
        public void mo152192a(e0l.C16674a c16674a, String str) {
            c16674a.m118883b(str);
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: b */
        public void mo152193b(e0l.C16674a c16674a, String str, String str2) {
            c16674a.m118884c(str, str2);
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: c */
        public void mo152194c(C21953a c21953a, SSLSocket sSLSocket, boolean z) {
            c21953a.m222297a(sSLSocket, z);
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: d */
        public int mo152195d(i5d0.C17653a c17653a) {
            return c17653a.f113047c;
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: e */
        public boolean mo152196e(y80 y80Var, y80 y80Var2) {
            return y80Var.m214713d(y80Var2);
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: f */
        public n6f mo152197f(i5d0 i5d0Var) {
            return i5d0Var.f113043m;
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: g */
        public void mo152198g(i5d0.C17653a c17653a, n6f n6fVar) {
            c17653a.m138687k(n6fVar);
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: h */
        public ry3 mo152199h(rg50 rg50Var, x1d0 x1d0Var) {
            return hmc0.m135835d(rg50Var, x1d0Var, true);
        }

        @Override // p153l.kzm
        /* JADX INFO: renamed from: i */
        public kmc0 mo152200i(lx5 lx5Var) {
            return lx5Var.f133903a;
        }
    }

    static {
        kzm.f129436a = new C19836a();
    }

    public rg50(C19837b c19837b) {
        boolean z;
        this.f162910a = c19837b.f162938a;
        this.f162911b = c19837b.f162939b;
        this.f162912c = c19837b.f162940c;
        List<C21953a> list = c19837b.f162941d;
        this.f162913d = list;
        this.f162914e = zlk0.m220258t(c19837b.f162942e);
        this.f162915f = zlk0.m220258t(c19837b.f162943f);
        this.f162916g = c19837b.f162944g;
        this.f162917h = c19837b.f162945h;
        this.f162918i = c19837b.f162946i;
        this.f162919j = c19837b.f162947j;
        this.f162920k = c19837b.f162948k;
        this.f162921l = c19837b.f162949l;
        Iterator<C21953a> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = (z || it.next().m222300d()) ? true : z;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = c19837b.f162950m;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM220229C = zlk0.m220229C();
            this.f162922m = m181332w(x509TrustManagerM220229C);
            this.f162923n = vq4.get(x509TrustManagerM220229C);
        } else {
            this.f162922m = sSLSocketFactory;
            this.f162923n = c19837b.f162951n;
        }
        if (this.f162922m != null) {
            Platform.get().configureSslSocketFactory(this.f162922m);
        }
        this.f162924o = c19837b.f162952o;
        this.f162925p = c19837b.f162953p.m212714f(this.f162923n);
        this.f162926q = c19837b.f162954q;
        this.f162927r = c19837b.f162955r;
        this.f162928s = c19837b.f162956s;
        this.f162929t = c19837b.f162957t;
        this.f162930u = c19837b.f162958u;
        this.f162931v = c19837b.f162959v;
        this.f162932w = c19837b.f162960w;
        this.f162933x = c19837b.f162961x;
        this.f162934y = c19837b.f162962y;
        this.f162935z = c19837b.f162963z;
        this.f162908A = c19837b.f162936A;
        this.f162909B = c19837b.f162937B;
        if (this.f162914e.contains(null)) {
            qg50.m176437a("Null interceptor: ", this.f162914e);
            throw null;
        }
        if (this.f162915f.contains(null)) {
            qg50.m176437a("Null network interceptor: ", this.f162915f);
            throw null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static SSLSocketFactory m181332w(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = Platform.get().getSSLContext();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public Proxy m181333A() {
        return this.f162911b;
    }

    /* JADX INFO: renamed from: B */
    public ce1 m181334B() {
        return this.f162926q;
    }

    /* JADX INFO: renamed from: C */
    public ProxySelector m181335C() {
        return this.f162917h;
    }

    /* JADX INFO: renamed from: D */
    public int m181336D() {
        return this.f162935z;
    }

    /* JADX INFO: renamed from: E */
    public boolean m181337E() {
        return this.f162932w;
    }

    /* JADX INFO: renamed from: G */
    public SocketFactory m181338G() {
        return this.f162921l;
    }

    /* JADX INFO: renamed from: K */
    public SSLSocketFactory m181339K() {
        return this.f162922m;
    }

    /* JADX INFO: renamed from: L */
    public int m181340L() {
        return this.f162908A;
    }

    @Override // p153l.ry3.InterfaceC19935a
    /* JADX INFO: renamed from: a */
    public ry3 mo181341a(x1d0 x1d0Var) {
        return hmc0.m135835d(this, x1d0Var, false);
    }

    /* JADX INFO: renamed from: b */
    public ce1 m181342b() {
        return this.f162927r;
    }

    /* JADX INFO: renamed from: c */
    public tx3 m181343c() {
        return this.f162919j;
    }

    /* JADX INFO: renamed from: d */
    public int m181344d() {
        return this.f162933x;
    }

    /* JADX INFO: renamed from: e */
    public xq4 m181345e() {
        return this.f162925p;
    }

    /* JADX INFO: renamed from: f */
    public int m181346f() {
        return this.f162934y;
    }

    /* JADX INFO: renamed from: j */
    public lx5 m181347j() {
        return this.f162928s;
    }

    /* JADX INFO: renamed from: k */
    public List<C21953a> m181348k() {
        return this.f162913d;
    }

    /* JADX INFO: renamed from: l */
    public eu6 m181349l() {
        return this.f162918i;
    }

    /* JADX INFO: renamed from: m */
    public o5e m181350m() {
        return this.f162910a;
    }

    /* JADX INFO: renamed from: n */
    public o6e m181351n() {
        return this.f162929t;
    }

    /* JADX INFO: renamed from: o */
    public t4f.InterfaceC20235b m181352o() {
        return this.f162916g;
    }

    /* JADX INFO: renamed from: p */
    public boolean m181353p() {
        return this.f162931v;
    }

    /* JADX INFO: renamed from: q */
    public boolean m181354q() {
        return this.f162930u;
    }

    /* JADX INFO: renamed from: r */
    public HostnameVerifier m181355r() {
        return this.f162924o;
    }

    /* JADX INFO: renamed from: s */
    public List<azm> m181356s() {
        return this.f162914e;
    }

    /* JADX INFO: renamed from: t */
    public lzm m181357t() {
        tx3 tx3Var = this.f162919j;
        return tx3Var != null ? tx3Var.f176490a : this.f162920k;
    }

    /* JADX INFO: renamed from: u */
    public List<azm> m181358u() {
        return this.f162915f;
    }

    /* JADX INFO: renamed from: v */
    public C19837b m181359v() {
        return new C19837b(this);
    }

    /* JADX INFO: renamed from: x */
    public hsp0 m181360x(x1d0 x1d0Var, ksp0 ksp0Var) {
        jnc0 jnc0Var = new jnc0(x1d0Var, ksp0Var, new Random(), this.f162909B);
        jnc0Var.m146226i(this);
        return jnc0Var;
    }

    /* JADX INFO: renamed from: y */
    public int m181361y() {
        return this.f162909B;
    }

    /* JADX INFO: renamed from: z */
    public List<Protocol> m181362z() {
        return this.f162912c;
    }

    /* JADX INFO: renamed from: l.rg50$b */
    public static final class C19837b {

        /* JADX INFO: renamed from: A */
        public int f162936A;

        /* JADX INFO: renamed from: B */
        public int f162937B;

        /* JADX INFO: renamed from: a */
        public o5e f162938a;

        /* JADX INFO: renamed from: b */
        public Proxy f162939b;

        /* JADX INFO: renamed from: c */
        public List<Protocol> f162940c;

        /* JADX INFO: renamed from: d */
        public List<C21953a> f162941d;

        /* JADX INFO: renamed from: e */
        public final List<azm> f162942e;

        /* JADX INFO: renamed from: f */
        public final List<azm> f162943f;

        /* JADX INFO: renamed from: g */
        public t4f.InterfaceC20235b f162944g;

        /* JADX INFO: renamed from: h */
        public ProxySelector f162945h;

        /* JADX INFO: renamed from: i */
        public eu6 f162946i;

        /* JADX INFO: renamed from: j */
        public tx3 f162947j;

        /* JADX INFO: renamed from: k */
        public lzm f162948k;

        /* JADX INFO: renamed from: l */
        public SocketFactory f162949l;

        /* JADX INFO: renamed from: m */
        public SSLSocketFactory f162950m;

        /* JADX INFO: renamed from: n */
        public vq4 f162951n;

        /* JADX INFO: renamed from: o */
        public HostnameVerifier f162952o;

        /* JADX INFO: renamed from: p */
        public xq4 f162953p;

        /* JADX INFO: renamed from: q */
        public ce1 f162954q;

        /* JADX INFO: renamed from: r */
        public ce1 f162955r;

        /* JADX INFO: renamed from: s */
        public lx5 f162956s;

        /* JADX INFO: renamed from: t */
        public o6e f162957t;

        /* JADX INFO: renamed from: u */
        public boolean f162958u;

        /* JADX INFO: renamed from: v */
        public boolean f162959v;

        /* JADX INFO: renamed from: w */
        public boolean f162960w;

        /* JADX INFO: renamed from: x */
        public int f162961x;

        /* JADX INFO: renamed from: y */
        public int f162962y;

        /* JADX INFO: renamed from: z */
        public int f162963z;

        public C19837b(rg50 rg50Var) {
            ArrayList arrayList = new ArrayList();
            this.f162942e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f162943f = arrayList2;
            this.f162938a = rg50Var.f162910a;
            this.f162939b = rg50Var.f162911b;
            this.f162940c = rg50Var.f162912c;
            this.f162941d = rg50Var.f162913d;
            arrayList.addAll(rg50Var.f162914e);
            arrayList2.addAll(rg50Var.f162915f);
            this.f162944g = rg50Var.f162916g;
            this.f162945h = rg50Var.f162917h;
            this.f162946i = rg50Var.f162918i;
            this.f162948k = rg50Var.f162920k;
            this.f162947j = rg50Var.f162919j;
            this.f162949l = rg50Var.f162921l;
            this.f162950m = rg50Var.f162922m;
            this.f162951n = rg50Var.f162923n;
            this.f162952o = rg50Var.f162924o;
            this.f162953p = rg50Var.f162925p;
            this.f162954q = rg50Var.f162926q;
            this.f162955r = rg50Var.f162927r;
            this.f162956s = rg50Var.f162928s;
            this.f162957t = rg50Var.f162929t;
            this.f162958u = rg50Var.f162930u;
            this.f162959v = rg50Var.f162931v;
            this.f162960w = rg50Var.f162932w;
            this.f162961x = rg50Var.f162933x;
            this.f162962y = rg50Var.f162934y;
            this.f162963z = rg50Var.f162935z;
            this.f162936A = rg50Var.f162908A;
            this.f162937B = rg50Var.f162909B;
        }

        /* JADX INFO: renamed from: a */
        public C19837b m181363a(azm azmVar) {
            if (azmVar != null) {
                this.f162942e.add(azmVar);
                return this;
            }
            wg3.m206174a("interceptor == null");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public C19837b m181364b(azm azmVar) {
            if (azmVar != null) {
                this.f162943f.add(azmVar);
                return this;
            }
            wg3.m206174a("interceptor == null");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public rg50 m181365c() {
            return new rg50(this);
        }

        /* JADX INFO: renamed from: d */
        public C19837b m181366d(tx3 tx3Var) {
            this.f162947j = tx3Var;
            this.f162948k = null;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19837b m181367e(xq4 xq4Var) {
            if (xq4Var != null) {
                this.f162953p = xq4Var;
                return this;
            }
            mnd0.m159157a("certificatePinner == null");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C19837b m181368f(long j, TimeUnit timeUnit) {
            this.f162962y = zlk0.m220243e("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C19837b m181369g(lx5 lx5Var) {
            if (lx5Var != null) {
                this.f162956s = lx5Var;
                return this;
            }
            mnd0.m159157a("connectionPool == null");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public C19837b m181370h(List<C21953a> list) {
            this.f162941d = zlk0.m220258t(list);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19837b m181371i(o5e o5eVar) {
            if (o5eVar != null) {
                this.f162938a = o5eVar;
                return this;
            }
            wg3.m206174a("dispatcher == null");
            return null;
        }

        /* JADX INFO: renamed from: j */
        public C19837b m181372j(o6e o6eVar) {
            if (o6eVar != null) {
                this.f162957t = o6eVar;
                return this;
            }
            mnd0.m159157a("dns == null");
            return null;
        }

        /* JADX INFO: renamed from: k */
        public C19837b m181373k(t4f t4fVar) {
            if (t4fVar != null) {
                this.f162944g = t4f.factory(t4fVar);
                return this;
            }
            mnd0.m159157a("eventListener == null");
            return null;
        }

        /* JADX INFO: renamed from: l */
        public C19837b m181374l(t4f.InterfaceC20235b interfaceC20235b) {
            if (interfaceC20235b != null) {
                this.f162944g = interfaceC20235b;
                return this;
            }
            mnd0.m159157a("eventListenerFactory == null");
            return null;
        }

        /* JADX INFO: renamed from: m */
        public C19837b m181375m(boolean z) {
            this.f162959v = z;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19837b m181376n(boolean z) {
            this.f162958u = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C19837b m181377o(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f162952o = hostnameVerifier;
                return this;
            }
            mnd0.m159157a("hostnameVerifier == null");
            return null;
        }

        /* JADX INFO: renamed from: p */
        public List<azm> m181378p() {
            return this.f162942e;
        }

        /* JADX INFO: renamed from: q */
        public C19837b m181379q(long j, TimeUnit timeUnit) {
            this.f162937B = zlk0.m220243e(BannerFrequencyType.interval, j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C19837b m181380r(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                ypg0.m217021a("protocols must contain h2_prior_knowledge or http/1.1: ", arrayList);
                return null;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                ypg0.m217021a("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayList);
                return null;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                ypg0.m217021a("protocols must not contain http/1.0: ", arrayList);
                return null;
            }
            if (arrayList.contains(null)) {
                wg3.m206174a("protocols must not contain null");
                return null;
            }
            arrayList.remove(Protocol.SPDY_3);
            this.f162940c = Collections.unmodifiableList(arrayList);
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C19837b m181381s(Proxy proxy) {
            this.f162939b = proxy;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C19837b m181382t(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f162945h = proxySelector;
                return this;
            }
            mnd0.m159157a("proxySelector == null");
            return null;
        }

        /* JADX INFO: renamed from: u */
        public C19837b m181383u(long j, TimeUnit timeUnit) {
            this.f162963z = zlk0.m220243e("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C19837b m181384v(boolean z) {
            this.f162960w = z;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C19837b m181385w(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                mnd0.m159157a("sslSocketFactory == null");
                return null;
            }
            this.f162950m = sSLSocketFactory;
            this.f162951n = Platform.get().buildCertificateChainCleaner(sSLSocketFactory);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C19837b m181386x(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                mnd0.m159157a("sslSocketFactory == null");
                return null;
            }
            if (x509TrustManager == null) {
                mnd0.m159157a("trustManager == null");
                return null;
            }
            this.f162950m = sSLSocketFactory;
            this.f162951n = vq4.get(x509TrustManager);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C19837b m181387y(long j, TimeUnit timeUnit) {
            this.f162936A = zlk0.m220243e("timeout", j, timeUnit);
            return this;
        }

        public C19837b() {
            this.f162942e = new ArrayList();
            this.f162943f = new ArrayList();
            this.f162938a = new o5e();
            this.f162940c = rg50.f162906C;
            this.f162941d = rg50.f162907D;
            this.f162944g = t4f.factory(t4f.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f162945h = proxySelector;
            if (proxySelector == null) {
                this.f162945h = new g350();
            }
            this.f162946i = eu6.f95844a;
            this.f162949l = SocketFactory.getDefault();
            this.f162952o = pg50.INSTANCE;
            this.f162953p = xq4.f195773c;
            ce1 ce1Var = ce1.f81307a;
            this.f162954q = ce1Var;
            this.f162955r = ce1Var;
            this.f162956s = new lx5();
            this.f162957t = o6e.f145159a;
            this.f162958u = true;
            this.f162959v = true;
            this.f162960w = true;
            this.f162961x = 0;
            this.f162962y = 10000;
            this.f162963z = 10000;
            this.f162936A = 10000;
            this.f162937B = 0;
        }
    }

    public rg50() {
        this(new C19837b());
    }
}
