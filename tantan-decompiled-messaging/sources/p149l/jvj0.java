package p149l;

import android.net.TrafficStats;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.tencent.open.SocialConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.p118io.CloseableKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0003\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b#\u0010\u0011¨\u0006&"}, m87232d2 = {"Ll/jvj0;", "Ll/qwb;", "", "isSslPinningEnabled", "Lcom/clevertap/android/sdk/Logger;", "logger", "", "logTag", "<init>", "(ZLcom/clevertap/android/sdk/Logger;Ljava/lang/String;)V", "Ll/rtc0;", SocialConstants.TYPE_REQUEST, "Ljavax/net/ssl/HttpsURLConnection;", "h", "(Ll/rtc0;)Ljavax/net/ssl/HttpsURLConnection;", "Ljavax/net/ssl/SSLContext;", "e", "()Ljavax/net/ssl/SSLContext;", "Ll/fxc0;", "a", "(Ll/rtc0;)Ll/fxc0;", "Z", "()Z", "setSslPinningEnabled", "(Z)V", "b", "Lcom/clevertap/android/sdk/Logger;", "c", "Ljava/lang/String;", "Ljavax/net/ssl/SSLSocketFactory;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "f", "()Ljavax/net/ssl/SSLSocketFactory;", "socketFactory", "g", "sslContext", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class jvj0 implements qwb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isSslPinningEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String logTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy socketFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy sslContext;

    public jvj0(boolean z, @NotNull Logger logger, @NotNull String str) {
        logger.getClass();
        str.getClass();
        this.isSslPinningEnabled = z;
        this.logger = logger;
        this.logTag = str;
        this.socketFactory = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.gvj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jvj0.m143516d(this.f104578a);
            }
        });
        this.sslContext = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.hvj0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jvj0.m143515c(this.f109658a);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Unit m143514b(Ref.ObjectRef objectRef) {
        objectRef.getClass();
        ((HttpsURLConnection) objectRef.element).disconnect();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static SSLContext m143515c(jvj0 jvj0Var) {
        jvj0Var.getClass();
        return jvj0Var.m143517e();
    }

    /* JADX INFO: renamed from: d */
    public static SSLSocketFactory m143516d(jvj0 jvj0Var) {
        jvj0Var.getClass();
        try {
            Logger.m5865d("Pinning SSL session to DigiCertGlobalRoot CA certificate");
            SSLContext sSLContextM143519g = jvj0Var.m143519g();
            if (sSLContextM143519g != null) {
                return sSLContextM143519g.getSocketFactory();
            }
            return null;
        } catch (Exception e) {
            Logger.m5868d("Issue in pinning SSL,", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final SSLContext m143517e() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            ClassLoader classLoader = keyStore.getClass().getClassLoader();
            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new BufferedInputStream(classLoader != null ? classLoader.getResourceAsStream("com/clevertap/android/sdk/certificates/AmazonRootCA1.cer") : null));
            certificateGenerateCertificate.getClass();
            keyStore.setCertificateEntry("AmazonRootCA1", (X509Certificate) certificateGenerateCertificate);
            trustManagerFactory.init(keyStore);
            sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
            Logger.m5865d("SSL Context built");
            return sSLContext;
        } catch (Exception e) {
            Logger.m5872i("Error building SSL Context", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private final SSLSocketFactory m143518f() {
        return (SSLSocketFactory) this.socketFactory.getValue();
    }

    /* JADX INFO: renamed from: g */
    private final SSLContext m143519g() {
        return (SSLContext) this.sslContext.getValue();
    }

    /* JADX INFO: renamed from: h */
    private final HttpsURLConnection m143520h(rtc0 request) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(request.getUrl().toString()).openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        for (Map.Entry<String, String> entry : request.m180780b().entrySet()) {
            httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpsURLConnection.setInstanceFollowRedirects(false);
        if (this.isSslPinningEnabled && m143519g() != null) {
            httpsURLConnection.setSSLSocketFactory(m143518f());
        }
        if (request.getBody() == null) {
            return httpsURLConnection;
        }
        httpsURLConnection.setDoOutput(true);
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            byte[] bytes = request.getBody().getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStream.write(bytes);
            Unit unit = Unit.INSTANCE;
            CloseableKt.m87404a(outputStream, null);
            return httpsURLConnection;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(outputStream, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, javax.net.ssl.HttpsURLConnection] */
    @Override // p149l.qwb
    @NotNull
    /* JADX INFO: renamed from: a */
    public fxc0 mo143521a(@NotNull rtc0 request) {
        fxc0 fxc0Var;
        request.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            try {
                TrafficStats.setThreadStatsTag(17);
                objectRef.element = m143520h(request);
                this.logger.debug(this.logTag, "Sending request to: " + request.getUrl());
                int responseCode = ((HttpsURLConnection) objectRef.element).getResponseCode();
                Map<String, List<String>> headerFields = ((HttpsURLConnection) objectRef.element).getHeaderFields();
                Function0 function0 = new Function0() { // from class: l.ivj0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return jvj0.m143514b(objectRef);
                    }
                };
                if (responseCode == 200) {
                    headerFields.getClass();
                    fxc0Var = new fxc0(request, responseCode, headerFields, ((HttpsURLConnection) objectRef.element).getInputStream(), function0);
                } else {
                    headerFields.getClass();
                    fxc0Var = new fxc0(request, responseCode, headerFields, ((HttpsURLConnection) objectRef.element).getErrorStream(), function0);
                }
                TrafficStats.clearThreadStatsTag();
                return fxc0Var;
            } catch (Exception e) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) objectRef.element;
                if (httpsURLConnection == null) {
                    throw e;
                }
                httpsURLConnection.disconnect();
                throw e;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }
}
