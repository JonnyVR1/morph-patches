package com.tencent.cloud.p080ai.network.okhttp3.internal.platform;

import android.os.Build;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.AbstractC13920c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13918a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13919b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.InterfaceC13922e;
import com.tencent.cloud.p080ai.network.okio.C13939e;
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
import p153l.aqg0;
import p153l.h5d0;
import p153l.mnd0;
import p153l.yzv;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.c */
/* JADX INFO: loaded from: classes12.dex */
public class C13915c {

    /* JADX INFO: renamed from: a */
    public static final C13915c f57649a;

    /* JADX INFO: renamed from: b */
    public static final Logger f57650b;

    static {
        C13915c c13915c;
        if (m82985d()) {
            c13915c = C13913a.m82965e();
            if (c13915c == null) {
                if (m82985d()) {
                    try {
                        Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                        try {
                            c13915c = new C13914b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", null), cls2.getMethod("setAlpnProtocols", byte[].class));
                        } catch (NoSuchMethodException unused) {
                            h5d0.m133654a("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT);
                            return;
                        }
                    } catch (ClassNotFoundException unused2) {
                        c13915c = null;
                    }
                } else {
                    c13915c = null;
                }
                if (c13915c == null) {
                    mnd0.m159157a("No platform found on Android");
                    return;
                }
            }
        } else {
            c13915c = new C13915c();
        }
        f57649a = c13915c;
        f57650b = Logger.getLogger(OkHttpClient.class.getName());
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m82982a(Object obj, Class<T> cls, String str) {
        Object objM82982a;
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
                aqg0.m99478a();
                return null;
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (objM82982a = m82982a(obj, (Class<Object>) Object.class, "delegate")) == null) {
            return null;
        }
        return (T) m82982a(objM82982a, cls, str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m82985d() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC13922e mo82975b(X509TrustManager x509TrustManager) {
        return new C13919b(x509TrustManager.getAcceptedIssuers());
    }

    /* JADX INFO: renamed from: c */
    public SSLContext mo82977c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            yzv.m218057a("No TLS provider", e);
            return null;
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public static C13915c m82984b() {
        return f57649a;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo82976b(String str) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m82986a() {
    }

    /* JADX INFO: renamed from: a */
    public void mo82967a(SSLSocket sSLSocket, String str, List<EnumC13931q> list) {
    }

    /* JADX INFO: renamed from: a */
    public X509TrustManager mo82970a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objM82982a = m82982a(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objM82982a == null) {
                return null;
            }
            return (X509TrustManager) m82982a(objM82982a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo82973a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: a */
    public void mo82971a(int i, String str, Throwable th) {
        f57650b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* JADX INFO: renamed from: a */
    public Object mo82969a(String str) {
        if (f57650b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void mo82972a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo82971a(5, str, (Throwable) obj);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC13920c mo82968a(X509TrustManager x509TrustManager) {
        return new C13918a(mo82975b(x509TrustManager));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m82983a(List<EnumC13931q> list) {
        C13939e c13939e = new C13939e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC13931q enumC13931q = list.get(i);
            if (enumC13931q != EnumC13931q.HTTP_1_0) {
                c13939e.mo83106c(enumC13931q.f57780a.length());
                c13939e.mo83092a(enumC13931q.f57780a);
            }
        }
        return c13939e.mo83122h();
    }

    /* JADX INFO: renamed from: a */
    public String mo82966a(SSLSocket sSLSocket) {
        return null;
    }
}
