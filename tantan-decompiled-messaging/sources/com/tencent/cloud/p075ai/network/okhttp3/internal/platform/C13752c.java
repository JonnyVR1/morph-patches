package com.tencent.cloud.p075ai.network.okhttp3.internal.platform;

import android.os.Build;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.AbstractC13757c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13755a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13756b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.InterfaceC13759e;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p149l.byv;
import p149l.dxc0;
import p149l.jfd0;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.c */
/* JADX INFO: loaded from: classes13.dex */
public class C13752c {

    /* JADX INFO: renamed from: a */
    public static final C13752c f56801a;

    /* JADX INFO: renamed from: b */
    public static final Logger f56802b;

    static {
        C13752c c13752c;
        if (m81802d()) {
            c13752c = C13750a.m81782e();
            if (c13752c == null) {
                if (m81802d()) {
                    try {
                        Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                        try {
                            c13752c = new C13751b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", null), cls2.getMethod("setAlpnProtocols", byte[].class));
                        } catch (NoSuchMethodException unused) {
                            dxc0.m114002a("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT);
                            return;
                        }
                    } catch (ClassNotFoundException unused2) {
                        c13752c = null;
                    }
                } else {
                    c13752c = null;
                }
                if (c13752c == null) {
                    jfd0.m141176a("No platform found on Android");
                    return;
                }
            }
        } else {
            c13752c = new C13752c();
        }
        f56801a = c13752c;
        f56802b = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m81799a(Object obj, Class<T> cls, String str) {
        Object objM81799a;
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                shg0.m184191a();
                return null;
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (objM81799a = m81799a(obj, (Class<Object>) Object.class, "delegate")) == null) {
            return null;
        }
        return (T) m81799a(objM81799a, cls, str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m81802d() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC13759e mo81792b(X509TrustManager x509TrustManager) {
        return new C13756b(x509TrustManager.getAcceptedIssuers());
    }

    /* JADX INFO: renamed from: c */
    public SSLContext mo81794c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            byv.m104511a("No TLS provider", e);
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public static C13752c m81801b() {
        return f56801a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo81793b(String str) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m81803a() {
    }

    /* JADX INFO: renamed from: a */
    public void mo81784a(SSLSocket sSLSocket, String str, List<EnumC13768q> list) {
    }

    /* JADX INFO: renamed from: a */
    public X509TrustManager mo81787a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objM81799a = m81799a(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objM81799a == null) {
                return null;
            }
            return (X509TrustManager) m81799a(objM81799a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo81790a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo81788a(int i, String str, Throwable th) {
        f56802b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: a */
    public Object mo81786a(String str) {
        if (f56802b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo81789a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo81788a(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC13757c mo81785a(X509TrustManager x509TrustManager) {
        return new C13755a(mo81792b(x509TrustManager));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m81800a(List<EnumC13768q> list) {
        C13776e c13776e = new C13776e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC13768q enumC13768q = list.get(i);
            if (enumC13768q != EnumC13768q.HTTP_1_0) {
                c13776e.mo81923c(enumC13768q.f56932a.length());
                c13776e.mo81909a(enumC13768q.f56932a);
            }
        }
        return c13776e.mo81939h();
    }

    /* JADX INFO: renamed from: a */
    public String mo81783a(SSLSocket sSLSocket) {
        return null;
    }
}
