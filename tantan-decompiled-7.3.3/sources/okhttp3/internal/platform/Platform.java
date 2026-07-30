package okhttp3.internal.platform;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okio.Buffer;
import p153l.aqg0;
import p153l.dkj0;
import p153l.ht2;
import p153l.l5j;
import p153l.mnd0;
import p153l.rg50;
import p153l.st2;
import p153l.vq4;
import p153l.yzv;
import p153l.zlk0;

/* JADX INFO: loaded from: classes2.dex */
public class Platform {
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Platform PLATFORM = findPlatform();
    private static final Logger logger = Logger.getLogger(rg50.class.getName());

    public static List<String> alpnProtocolNames(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public static byte[] concatLengthPrefixed(List<Protocol> list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                buffer.writeByte(protocol.toString().length());
                buffer.writeUtf8(protocol.toString());
            }
        }
        return buffer.readByteArray();
    }

    private static Platform findAndroidPlatform() {
        Platform platformBuildIfSupported = Android10Platform.buildIfSupported();
        if (platformBuildIfSupported != null) {
            return platformBuildIfSupported;
        }
        Platform platformBuildIfSupported2 = AndroidPlatform.buildIfSupported();
        if (platformBuildIfSupported2 != null) {
            return platformBuildIfSupported2;
        }
        mnd0.m159157a("No platform found on Android");
        return null;
    }

    private static Platform findJvmPlatform() {
        ConscryptPlatform conscryptPlatformBuildIfSupported;
        if (isConscryptPreferred() && (conscryptPlatformBuildIfSupported = ConscryptPlatform.buildIfSupported()) != null) {
            return conscryptPlatformBuildIfSupported;
        }
        Jdk9Platform jdk9PlatformBuildIfSupported = Jdk9Platform.buildIfSupported();
        if (jdk9PlatformBuildIfSupported != null) {
            return jdk9PlatformBuildIfSupported;
        }
        Platform platformBuildIfSupported = Jdk8WithJettyBootPlatform.buildIfSupported();
        return platformBuildIfSupported != null ? platformBuildIfSupported : new Platform();
    }

    private static Platform findPlatform() {
        return isAndroid() ? findAndroidPlatform() : findJvmPlatform();
    }

    public static Platform get() {
        return PLATFORM;
    }

    public static boolean isAndroid() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean isConscryptPreferred() {
        if ("conscrypt".equals(zlk0.m220256r("okhttp.platform", null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public static <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object fieldOrNull;
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
        if (str.equals("delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
            return null;
        }
        return (T) readFieldOrNull(fieldOrNull, cls, str);
    }

    public void afterHandshake(SSLSocket sSLSocket) {
    }

    public vq4 buildCertificateChainCleaner(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager x509TrustManagerTrustManager = trustManager(sSLSocketFactory);
        if (x509TrustManagerTrustManager != null) {
            return buildCertificateChainCleaner(x509TrustManagerTrustManager);
        }
        StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
        sb.append(get());
        l5j.m152955a(sb, ", sslSocketFactory is ", sSLSocketFactory.getClass());
        return null;
    }

    public dkj0 buildTrustRootIndex(X509TrustManager x509TrustManager) {
        return new st2(x509TrustManager.getAcceptedIssuers());
    }

    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public String getPrefix() {
        return "OkHttp";
    }

    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            yzv.m218057a("No TLS provider", e);
            return null;
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        return null;
    }

    public Object getStackTraceForCloseable(String str) {
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String str) {
        return true;
    }

    public void log(int i, String str, Throwable th) {
        logger.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void logCloseableLeak(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        log(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        try {
            Object fieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (fieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public vq4 buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        return new ht2(buildTrustRootIndex(x509TrustManager));
    }
}
