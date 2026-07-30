package p149l;

import com.p046p1.mobile.putong.data.BannerFrequencyType;
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
import okhttp3.C21832a;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public class k850 implements Cloneable, sx3.InterfaceC20060a {

    /* JADX INFO: renamed from: C */
    public static final List<Protocol> f121722C = tck0.m188020u(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: D */
    public static final List<C21832a> f121723D = tck0.m188020u(C21832a.f205841h, C21832a.f205843j);

    /* JADX INFO: renamed from: A */
    public final int f121724A;

    /* JADX INFO: renamed from: B */
    public final int f121725B;

    /* JADX INFO: renamed from: a */
    public final a4e f121726a;

    /* JADX INFO: renamed from: b */
    public final Proxy f121727b;

    /* JADX INFO: renamed from: c */
    public final List<Protocol> f121728c;

    /* JADX INFO: renamed from: d */
    public final List<C21832a> f121729d;

    /* JADX INFO: renamed from: e */
    public final List<axm> f121730e;

    /* JADX INFO: renamed from: f */
    public final List<axm> f121731f;

    /* JADX INFO: renamed from: g */
    public final o3f.InterfaceC18833b f121732g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f121733h;

    /* JADX INFO: renamed from: i */
    public final bt6 f121734i;

    /* JADX INFO: renamed from: j */
    public final uw3 f121735j;

    /* JADX INFO: renamed from: k */
    public final lxm f121736k;

    /* JADX INFO: renamed from: l */
    public final SocketFactory f121737l;

    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory f121738m;

    /* JADX INFO: renamed from: n */
    public final wp4 f121739n;

    /* JADX INFO: renamed from: o */
    public final HostnameVerifier f121740o;

    /* JADX INFO: renamed from: p */
    public final yp4 f121741p;

    /* JADX INFO: renamed from: q */
    public final vd1 f121742q;

    /* JADX INFO: renamed from: r */
    public final vd1 f121743r;

    /* JADX INFO: renamed from: s */
    public final gw5 f121744s;

    /* JADX INFO: renamed from: t */
    public final a5e f121745t;

    /* JADX INFO: renamed from: u */
    public final boolean f121746u;

    /* JADX INFO: renamed from: v */
    public final boolean f121747v;

    /* JADX INFO: renamed from: w */
    public final boolean f121748w;

    /* JADX INFO: renamed from: x */
    public final int f121749x;

    /* JADX INFO: renamed from: y */
    public final int f121750y;

    /* JADX INFO: renamed from: z */
    public final int f121751z;

    /* JADX INFO: renamed from: l.k850$a */
    public static class C17953a extends kxm {
        @Override // p149l.kxm
        /* JADX INFO: renamed from: a */
        public void mo144871a(oxk.C19066a c19066a, String str) {
            c19066a.m166564b(str);
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: b */
        public void mo144872b(oxk.C19066a c19066a, String str, String str2) {
            c19066a.m166565c(str, str2);
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: c */
        public void mo144873c(C21832a c21832a, SSLSocket sSLSocket, boolean z) {
            c21832a.m221030a(sSLSocket, z);
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: d */
        public int mo144874d(exc0.C16708a c16708a) {
            return c16708a.f93612c;
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: e */
        public boolean mo144875e(c90 c90Var, c90 c90Var2) {
            return c90Var.m105829d(c90Var2);
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: f */
        public j5f mo144876f(exc0 exc0Var) {
            return exc0Var.f93608m;
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: g */
        public void mo144877g(exc0.C16708a c16708a, j5f j5fVar) {
            c16708a.m118623k(j5fVar);
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: h */
        public sx3 mo144878h(k850 k850Var, stc0 stc0Var) {
            return aec0.m96072d(k850Var, stc0Var, true);
        }

        @Override // p149l.kxm
        /* JADX INFO: renamed from: i */
        public dec0 mo144879i(gw5 gw5Var) {
            return gw5Var.f104660a;
        }
    }

    static {
        kxm.f125142a = new C17953a();
    }

    public k850(C17954b c17954b) {
        boolean z;
        this.f121726a = c17954b.f121754a;
        this.f121727b = c17954b.f121755b;
        this.f121728c = c17954b.f121756c;
        List<C21832a> list = c17954b.f121757d;
        this.f121729d = list;
        this.f121730e = tck0.m188019t(c17954b.f121758e);
        this.f121731f = tck0.m188019t(c17954b.f121759f);
        this.f121732g = c17954b.f121760g;
        this.f121733h = c17954b.f121761h;
        this.f121734i = c17954b.f121762i;
        this.f121735j = c17954b.f121763j;
        this.f121736k = c17954b.f121764k;
        this.f121737l = c17954b.f121765l;
        Iterator<C21832a> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = (z || it.next().m221033d()) ? true : z;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = c17954b.f121766m;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM187990C = tck0.m187990C();
            this.f121738m = m144840w(x509TrustManagerM187990C);
            this.f121739n = wp4.get(x509TrustManagerM187990C);
        } else {
            this.f121738m = sSLSocketFactory;
            this.f121739n = c17954b.f121767n;
        }
        if (this.f121738m != null) {
            Platform.get().configureSslSocketFactory(this.f121738m);
        }
        this.f121740o = c17954b.f121768o;
        this.f121741p = c17954b.f121769p.m215573f(this.f121739n);
        this.f121742q = c17954b.f121770q;
        this.f121743r = c17954b.f121771r;
        this.f121744s = c17954b.f121772s;
        this.f121745t = c17954b.f121773t;
        this.f121746u = c17954b.f121774u;
        this.f121747v = c17954b.f121775v;
        this.f121748w = c17954b.f121776w;
        this.f121749x = c17954b.f121777x;
        this.f121750y = c17954b.f121778y;
        this.f121751z = c17954b.f121779z;
        this.f121724A = c17954b.f121752A;
        this.f121725B = c17954b.f121753B;
        if (this.f121730e.contains(null)) {
            j850.m140190a("Null interceptor: ", this.f121730e);
            throw null;
        }
        if (this.f121731f.contains(null)) {
            j850.m140190a("Null network interceptor: ", this.f121731f);
            throw null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static SSLSocketFactory m144840w(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = Platform.get().getSSLContext();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public Proxy m144841A() {
        return this.f121727b;
    }

    /* JADX INFO: renamed from: B */
    public vd1 m144842B() {
        return this.f121742q;
    }

    /* JADX INFO: renamed from: C */
    public ProxySelector m144843C() {
        return this.f121733h;
    }

    /* JADX INFO: renamed from: D */
    public int m144844D() {
        return this.f121751z;
    }

    /* JADX INFO: renamed from: E */
    public boolean m144845E() {
        return this.f121748w;
    }

    /* JADX INFO: renamed from: G */
    public SocketFactory m144846G() {
        return this.f121737l;
    }

    /* JADX INFO: renamed from: K */
    public SSLSocketFactory m144847K() {
        return this.f121738m;
    }

    /* JADX INFO: renamed from: L */
    public int m144848L() {
        return this.f121724A;
    }

    @Override // p149l.sx3.InterfaceC20060a
    /* JADX INFO: renamed from: a */
    public sx3 mo144849a(stc0 stc0Var) {
        return aec0.m96072d(this, stc0Var, false);
    }

    /* JADX INFO: renamed from: b */
    public vd1 m144850b() {
        return this.f121743r;
    }

    /* JADX INFO: renamed from: c */
    public uw3 m144851c() {
        return this.f121735j;
    }

    /* JADX INFO: renamed from: d */
    public int m144852d() {
        return this.f121749x;
    }

    /* JADX INFO: renamed from: e */
    public yp4 m144853e() {
        return this.f121741p;
    }

    /* JADX INFO: renamed from: f */
    public int m144854f() {
        return this.f121750y;
    }

    /* JADX INFO: renamed from: j */
    public gw5 m144855j() {
        return this.f121744s;
    }

    /* JADX INFO: renamed from: k */
    public List<C21832a> m144856k() {
        return this.f121729d;
    }

    /* JADX INFO: renamed from: l */
    public bt6 m144857l() {
        return this.f121734i;
    }

    /* JADX INFO: renamed from: m */
    public a4e m144858m() {
        return this.f121726a;
    }

    /* JADX INFO: renamed from: n */
    public a5e m144859n() {
        return this.f121745t;
    }

    /* JADX INFO: renamed from: o */
    public o3f.InterfaceC18833b m144860o() {
        return this.f121732g;
    }

    /* JADX INFO: renamed from: p */
    public boolean m144861p() {
        return this.f121747v;
    }

    /* JADX INFO: renamed from: q */
    public boolean m144862q() {
        return this.f121746u;
    }

    /* JADX INFO: renamed from: r */
    public HostnameVerifier m144863r() {
        return this.f121740o;
    }

    /* JADX INFO: renamed from: s */
    public List<axm> m144864s() {
        return this.f121730e;
    }

    /* JADX INFO: renamed from: t */
    public lxm m144865t() {
        uw3 uw3Var = this.f121735j;
        return uw3Var != null ? uw3Var.f178583a : this.f121736k;
    }

    /* JADX INFO: renamed from: u */
    public List<axm> m144866u() {
        return this.f121731f;
    }

    /* JADX INFO: renamed from: v */
    public C17954b m144867v() {
        return new C17954b(this);
    }

    /* JADX INFO: renamed from: x */
    public cjp0 m144868x(stc0 stc0Var, gjp0 gjp0Var) {
        cfc0 cfc0Var = new cfc0(stc0Var, gjp0Var, new Random(), this.f121725B);
        cfc0Var.m106497i(this);
        return cfc0Var;
    }

    /* JADX INFO: renamed from: y */
    public int m144869y() {
        return this.f121725B;
    }

    /* JADX INFO: renamed from: z */
    public List<Protocol> m144870z() {
        return this.f121728c;
    }

    /* JADX INFO: renamed from: l.k850$b */
    public static final class C17954b {

        /* JADX INFO: renamed from: A */
        public int f121752A;

        /* JADX INFO: renamed from: B */
        public int f121753B;

        /* JADX INFO: renamed from: a */
        public a4e f121754a;

        /* JADX INFO: renamed from: b */
        public Proxy f121755b;

        /* JADX INFO: renamed from: c */
        public List<Protocol> f121756c;

        /* JADX INFO: renamed from: d */
        public List<C21832a> f121757d;

        /* JADX INFO: renamed from: e */
        public final List<axm> f121758e;

        /* JADX INFO: renamed from: f */
        public final List<axm> f121759f;

        /* JADX INFO: renamed from: g */
        public o3f.InterfaceC18833b f121760g;

        /* JADX INFO: renamed from: h */
        public ProxySelector f121761h;

        /* JADX INFO: renamed from: i */
        public bt6 f121762i;

        /* JADX INFO: renamed from: j */
        public uw3 f121763j;

        /* JADX INFO: renamed from: k */
        public lxm f121764k;

        /* JADX INFO: renamed from: l */
        public SocketFactory f121765l;

        /* JADX INFO: renamed from: m */
        public SSLSocketFactory f121766m;

        /* JADX INFO: renamed from: n */
        public wp4 f121767n;

        /* JADX INFO: renamed from: o */
        public HostnameVerifier f121768o;

        /* JADX INFO: renamed from: p */
        public yp4 f121769p;

        /* JADX INFO: renamed from: q */
        public vd1 f121770q;

        /* JADX INFO: renamed from: r */
        public vd1 f121771r;

        /* JADX INFO: renamed from: s */
        public gw5 f121772s;

        /* JADX INFO: renamed from: t */
        public a5e f121773t;

        /* JADX INFO: renamed from: u */
        public boolean f121774u;

        /* JADX INFO: renamed from: v */
        public boolean f121775v;

        /* JADX INFO: renamed from: w */
        public boolean f121776w;

        /* JADX INFO: renamed from: x */
        public int f121777x;

        /* JADX INFO: renamed from: y */
        public int f121778y;

        /* JADX INFO: renamed from: z */
        public int f121779z;

        public C17954b(k850 k850Var) {
            ArrayList arrayList = new ArrayList();
            this.f121758e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f121759f = arrayList2;
            this.f121754a = k850Var.f121726a;
            this.f121755b = k850Var.f121727b;
            this.f121756c = k850Var.f121728c;
            this.f121757d = k850Var.f121729d;
            arrayList.addAll(k850Var.f121730e);
            arrayList2.addAll(k850Var.f121731f);
            this.f121760g = k850Var.f121732g;
            this.f121761h = k850Var.f121733h;
            this.f121762i = k850Var.f121734i;
            this.f121764k = k850Var.f121736k;
            this.f121763j = k850Var.f121735j;
            this.f121765l = k850Var.f121737l;
            this.f121766m = k850Var.f121738m;
            this.f121767n = k850Var.f121739n;
            this.f121768o = k850Var.f121740o;
            this.f121769p = k850Var.f121741p;
            this.f121770q = k850Var.f121742q;
            this.f121771r = k850Var.f121743r;
            this.f121772s = k850Var.f121744s;
            this.f121773t = k850Var.f121745t;
            this.f121774u = k850Var.f121746u;
            this.f121775v = k850Var.f121747v;
            this.f121776w = k850Var.f121748w;
            this.f121777x = k850Var.f121749x;
            this.f121778y = k850Var.f121750y;
            this.f121779z = k850Var.f121751z;
            this.f121752A = k850Var.f121724A;
            this.f121753B = k850Var.f121725B;
        }

        /* JADX INFO: renamed from: a */
        public C17954b m144880a(axm axmVar) {
            if (axmVar != null) {
                this.f121758e.add(axmVar);
                return this;
            }
            ig3.m135964a("interceptor == null");
            return null;
        }

        /* JADX INFO: renamed from: b */
        public C17954b m144881b(axm axmVar) {
            if (axmVar != null) {
                this.f121759f.add(axmVar);
                return this;
            }
            ig3.m135964a("interceptor == null");
            return null;
        }

        /* JADX INFO: renamed from: c */
        public k850 m144882c() {
            return new k850(this);
        }

        /* JADX INFO: renamed from: d */
        public C17954b m144883d(uw3 uw3Var) {
            this.f121763j = uw3Var;
            this.f121764k = null;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17954b m144884e(yp4 yp4Var) {
            if (yp4Var != null) {
                this.f121769p = yp4Var;
                return this;
            }
            jfd0.m141176a("certificatePinner == null");
            return null;
        }

        /* JADX INFO: renamed from: f */
        public C17954b m144885f(long j, TimeUnit timeUnit) {
            this.f121778y = tck0.m188004e("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C17954b m144886g(gw5 gw5Var) {
            if (gw5Var != null) {
                this.f121772s = gw5Var;
                return this;
            }
            jfd0.m141176a("connectionPool == null");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public C17954b m144887h(List<C21832a> list) {
            this.f121757d = tck0.m188019t(list);
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C17954b m144888i(a4e a4eVar) {
            if (a4eVar != null) {
                this.f121754a = a4eVar;
                return this;
            }
            ig3.m135964a("dispatcher == null");
            return null;
        }

        /* JADX INFO: renamed from: j */
        public C17954b m144889j(a5e a5eVar) {
            if (a5eVar != null) {
                this.f121773t = a5eVar;
                return this;
            }
            jfd0.m141176a("dns == null");
            return null;
        }

        /* JADX INFO: renamed from: k */
        public C17954b m144890k(o3f o3fVar) {
            if (o3fVar != null) {
                this.f121760g = o3f.factory(o3fVar);
                return this;
            }
            jfd0.m141176a("eventListener == null");
            return null;
        }

        /* JADX INFO: renamed from: l */
        public C17954b m144891l(o3f.InterfaceC18833b interfaceC18833b) {
            if (interfaceC18833b != null) {
                this.f121760g = interfaceC18833b;
                return this;
            }
            jfd0.m141176a("eventListenerFactory == null");
            return null;
        }

        /* JADX INFO: renamed from: m */
        public C17954b m144892m(boolean z) {
            this.f121775v = z;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C17954b m144893n(boolean z) {
            this.f121774u = z;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C17954b m144894o(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f121768o = hostnameVerifier;
                return this;
            }
            jfd0.m141176a("hostnameVerifier == null");
            return null;
        }

        /* JADX INFO: renamed from: p */
        public C17954b m144895p(long j, TimeUnit timeUnit) {
            this.f121753B = tck0.m188004e(BannerFrequencyType.interval, j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C17954b m144896q(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                qhg0.m174539a("protocols must contain h2_prior_knowledge or http/1.1: ", arrayList);
                return null;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                qhg0.m174539a("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayList);
                return null;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                qhg0.m174539a("protocols must not contain http/1.0: ", arrayList);
                return null;
            }
            if (arrayList.contains(null)) {
                ig3.m135964a("protocols must not contain null");
                return null;
            }
            arrayList.remove(Protocol.SPDY_3);
            this.f121756c = Collections.unmodifiableList(arrayList);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C17954b m144897r(Proxy proxy) {
            this.f121755b = proxy;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C17954b m144898s(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f121761h = proxySelector;
                return this;
            }
            jfd0.m141176a("proxySelector == null");
            return null;
        }

        /* JADX INFO: renamed from: t */
        public C17954b m144899t(long j, TimeUnit timeUnit) {
            this.f121779z = tck0.m188004e("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C17954b m144900u(boolean z) {
            this.f121776w = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C17954b m144901v(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                jfd0.m141176a("sslSocketFactory == null");
                return null;
            }
            this.f121766m = sSLSocketFactory;
            this.f121767n = Platform.get().buildCertificateChainCleaner(sSLSocketFactory);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C17954b m144902w(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                jfd0.m141176a("sslSocketFactory == null");
                return null;
            }
            if (x509TrustManager == null) {
                jfd0.m141176a("trustManager == null");
                return null;
            }
            this.f121766m = sSLSocketFactory;
            this.f121767n = wp4.get(x509TrustManager);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C17954b m144903x(long j, TimeUnit timeUnit) {
            this.f121752A = tck0.m188004e("timeout", j, timeUnit);
            return this;
        }

        public C17954b() {
            this.f121758e = new ArrayList();
            this.f121759f = new ArrayList();
            this.f121754a = new a4e();
            this.f121756c = k850.f121722C;
            this.f121757d = k850.f121723D;
            this.f121760g = o3f.factory(o3f.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f121761h = proxySelector;
            if (proxySelector == null) {
                this.f121761h = new ru40();
            }
            this.f121762i = bt6.f77182a;
            this.f121765l = SocketFactory.getDefault();
            this.f121768o = i850.INSTANCE;
            this.f121769p = yp4.f199387c;
            vd1 vd1Var = vd1.f181008a;
            this.f121770q = vd1Var;
            this.f121771r = vd1Var;
            this.f121772s = new gw5();
            this.f121773t = a5e.f67705a;
            this.f121774u = true;
            this.f121775v = true;
            this.f121776w = true;
            this.f121777x = 0;
            this.f121778y = 10000;
            this.f121779z = 10000;
            this.f121752A = 10000;
            this.f121753B = 0;
        }
    }

    public k850() {
        this(new C17954b());
    }
}
