package p153l;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vq4 {
    public static vq4 get(X509Certificate... x509CertificateArr) {
        return new ht2(new st2(x509CertificateArr));
    }

    public abstract List<Certificate> clean(List<Certificate> list, String str) throws SSLPeerUnverifiedException;

    public static vq4 get(X509TrustManager x509TrustManager) {
        return Platform.get().buildCertificateChainCleaner(x509TrustManager);
    }
}
