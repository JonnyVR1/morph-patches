package com.tencent.cloud.p080ai.network.okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.AbstractC13920c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13918a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13919b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.InterfaceC13922e;
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
import p153l.gig0;
import p153l.yzv;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b */
/* JADX INFO: loaded from: classes12.dex */
public class C13914b extends C13915c {

    /* JADX INFO: renamed from: c */
    public final Class<?> f57635c;

    /* JADX INFO: renamed from: d */
    public final Class<?> f57636d;

    /* JADX INFO: renamed from: e */
    public final Method f57637e;

    /* JADX INFO: renamed from: f */
    public final Method f57638f;

    /* JADX INFO: renamed from: g */
    public final Method f57639g;

    /* JADX INFO: renamed from: h */
    public final Method f57640h;

    /* JADX INFO: renamed from: i */
    public final b f57641i = b.m82979a();

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b$a */
    public static final class a extends AbstractC13920c {

        /* JADX INFO: renamed from: a */
        public final Object f57642a;

        /* JADX INFO: renamed from: b */
        public final Method f57643b;

        public a(Object obj, Method method) {
            this.f57642a = obj;
            this.f57643b = method;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.tls.AbstractC13920c
        /* JADX INFO: renamed from: a */
        public List<Certificate> mo82978a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f57643b.invoke(this.f57642a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                gig0.m130323a(e);
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
    public static final class c implements InterfaceC13922e {

        /* JADX INFO: renamed from: a */
        public final X509TrustManager f57647a;

        /* JADX INFO: renamed from: b */
        public final Method f57648b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f57648b = method;
            this.f57647a = x509TrustManager;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.tls.InterfaceC13922e
        /* JADX INFO: renamed from: a */
        public X509Certificate mo82981a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f57648b.invoke(this.f57647a, x509Certificate);
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
            return this.f57647a.equals(cVar.f57647a) && this.f57648b.equals(cVar.f57648b);
        }

        public int hashCode() {
            return this.f57647a.hashCode() + (this.f57648b.hashCode() * 31);
        }
    }

    public C13914b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f57635c = cls;
        this.f57636d = cls2;
        this.f57637e = method;
        this.f57638f = method2;
        this.f57639g = method3;
        this.f57640h = method4;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public void mo82971a(int i, String str, Throwable th) {
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

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: b */
    public boolean mo82976b(String str) {
        try {
            try {
                Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                return m82974a(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: c */
    public SSLContext mo82977c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            yzv.m218057a("No TLS provider", e);
            return null;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: b */
    public InterfaceC13922e mo82975b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new C13919b(x509TrustManager.getAcceptedIssuers());
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Method f57644a;

        /* JADX INFO: renamed from: b */
        public final Method f57645b;

        /* JADX INFO: renamed from: c */
        public final Method f57646c;

        public b(Method method, Method method2, Method method3) {
            this.f57644a = method;
            this.f57645b = method2;
            this.f57646c = method3;
        }

        /* JADX INFO: renamed from: a */
        public static b m82979a() throws NoSuchMethodException {
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
        public boolean m82980a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f57646c.invoke(obj, null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public X509TrustManager mo82970a(SSLSocketFactory sSLSocketFactory) {
        Object objM82982a = C13915c.m82982a(sSLSocketFactory, this.f57635c, "sslParameters");
        if (objM82982a == null) {
            try {
                objM82982a = C13915c.m82982a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.mo82970a(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) C13915c.m82982a(objM82982a, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) C13915c.m82982a(objM82982a, X509TrustManager.class, "trustManager");
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public void mo82967a(SSLSocket sSLSocket, String str, List<EnumC13931q> list) {
        if (this.f57636d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f57637e.invoke(sSLSocket, Boolean.TRUE);
                    this.f57638f.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    gig0.m130323a(e);
                    return;
                }
            }
            this.f57640h.invoke(sSLSocket, C13915c.m82983a(list));
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public String mo82966a(SSLSocket sSLSocket) {
        if (!this.f57636d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f57639g.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            gig0.m130323a(e);
            return null;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public void mo82973a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!C13869c.m82802a(e)) {
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

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public Object mo82969a(String str) {
        b bVar = this.f57641i;
        Method method = bVar.f57644a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                bVar.f57645b.invoke(objInvoke, str);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public void mo82972a(String str, Object obj) {
        if (this.f57641i.m82980a(obj)) {
            return;
        }
        mo82971a(5, str, (Throwable) null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82974a(String str, Class<?> cls, Object obj) {
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

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    /* JADX INFO: renamed from: a */
    public AbstractC13920c mo82968a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new C13918a(mo82975b(x509TrustManager));
        }
    }
}
