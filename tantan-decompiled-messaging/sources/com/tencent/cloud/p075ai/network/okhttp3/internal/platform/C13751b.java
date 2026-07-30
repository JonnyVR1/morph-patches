package com.tencent.cloud.p075ai.network.okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.AbstractC13757c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13755a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13756b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.InterfaceC13759e;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p149l.byv;
import p149l.y9g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b */
/* JADX INFO: loaded from: classes13.dex */
public class C13751b extends C13752c {

    /* JADX INFO: renamed from: c */
    public final Class<?> f56787c;

    /* JADX INFO: renamed from: d */
    public final Class<?> f56788d;

    /* JADX INFO: renamed from: e */
    public final Method f56789e;

    /* JADX INFO: renamed from: f */
    public final Method f56790f;

    /* JADX INFO: renamed from: g */
    public final Method f56791g;

    /* JADX INFO: renamed from: h */
    public final Method f56792h;

    /* JADX INFO: renamed from: i */
    public final b f56793i = b.m81796a();

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b$a */
    public static final class a extends AbstractC13757c {

        /* JADX INFO: renamed from: a */
        public final Object f56794a;

        /* JADX INFO: renamed from: b */
        public final Method f56795b;

        public a(Object obj, Method method) {
            this.f56794a = obj;
            this.f56795b = method;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.tls.AbstractC13757c
        /* JADX INFO: renamed from: a */
        public List<Certificate> mo81795a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f56795b.invoke(this.f56794a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                y9g0.m213537a(e);
                return null;
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b$c */
    public static final class c implements InterfaceC13759e {

        /* JADX INFO: renamed from: a */
        public final X509TrustManager f56799a;

        /* JADX INFO: renamed from: b */
        public final Method f56800b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f56800b = method;
            this.f56799a = x509TrustManager;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.tls.InterfaceC13759e
        /* JADX INFO: renamed from: a */
        public X509Certificate mo81798a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f56800b.invoke(this.f56799a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f56799a.equals(cVar.f56799a) && this.f56800b.equals(cVar.f56800b);
        }

        public int hashCode() {
            return this.f56799a.hashCode() + (this.f56800b.hashCode() * 31);
        }
    }

    public C13751b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f56787c = cls;
        this.f56788d = cls2;
        this.f56789e = method;
        this.f56790f = method2;
        this.f56791g = method3;
        this.f56792h = method4;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public void mo81788a(int i, String str, Throwable th) {
        int iMin;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int iIndexOf = str.indexOf(10, i3);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i3 + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
                Log.println(i2, "OkHttp", str.substring(i3, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i3 = iMin;
                }
            }
            i3 = iMin + 1;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: b */
    public boolean mo81793b(String str) {
        try {
            try {
                Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                return m81791a(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: c */
    public SSLContext mo81794c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            byv.m104511a("No TLS provider", e);
            return null;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: b */
    public InterfaceC13759e mo81792b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C13756b(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Method f56796a;

        /* JADX INFO: renamed from: b */
        public final Method f56797b;

        /* JADX INFO: renamed from: c */
        public final Method f56798c;

        public b(Method method, Method method2, Method method3) {
            this.f56796a = method;
            this.f56797b = method2;
            this.f56798c = method3;
        }

        /* JADX INFO: renamed from: a */
        public static b m81796a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new b(method3, method2, method);
        }

        /* JADX INFO: renamed from: a */
        public boolean m81797a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f56798c.invoke(obj, null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public X509TrustManager mo81787a(SSLSocketFactory sSLSocketFactory) {
        Object objM81799a = C13752c.m81799a(sSLSocketFactory, this.f56787c, "sslParameters");
        if (objM81799a == null) {
            try {
                objM81799a = C13752c.m81799a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo81787a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C13752c.m81799a(objM81799a, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) C13752c.m81799a(objM81799a, X509TrustManager.class, "trustManager");
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public void mo81784a(SSLSocket sSLSocket, String str, List<EnumC13768q> list) {
        if (this.f56788d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f56789e.invoke(sSLSocket, Boolean.TRUE);
                    this.f56790f.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    y9g0.m213537a(e);
                    return;
                }
            }
            this.f56792h.invoke(sSLSocket, C13752c.m81800a(list));
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public String mo81783a(SSLSocket sSLSocket) {
        if (!this.f56788d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f56791g.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public void mo81790a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C13706c.m81619a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public Object mo81786a(String str) {
        b bVar = this.f56793i;
        Method method = bVar.f56796a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                bVar.f56797b.invoke(objInvoke, str);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public void mo81789a(String str, Object obj) {
        if (this.f56793i.m81797a(obj)) {
            return;
        }
        mo81788a(5, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81791a(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    /* JADX INFO: renamed from: a */
    public AbstractC13757c mo81785a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new C13755a(mo81792b(x509TrustManager));
        }
    }
}
