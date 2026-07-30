package p149l;

import com.p046p1.mobile.putong.data.SignInGrantType;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public class eld0 {
    /* JADX INFO: renamed from: a */
    public static Object[] m117116a(InputStream inputStream) {
        try {
            X509TrustManager x509TrustManagerM117118c = m117118c(inputStream);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{x509TrustManagerM117118c}, null);
            return new Object[]{sSLContext.getSocketFactory(), x509TrustManagerM117118c};
        } catch (GeneralSecurityException e) {
            aag0.m95543a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static KeyStore m117117b(char[] cArr) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, cArr);
            return keyStore;
        } catch (IOException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    private static X509TrustManager m117118c(InputStream inputStream) throws GeneralSecurityException {
        Collection<? extends Certificate> collectionGenerateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(inputStream);
        if (collectionGenerateCertificates.isEmpty()) {
            ig3.m135964a("expected non-empty set of trusted certificates");
            return null;
        }
        char[] charArray = SignInGrantType.password.toCharArray();
        KeyStore keyStoreM117117b = m117117b(charArray);
        Iterator<? extends Certificate> it = collectionGenerateCertificates.iterator();
        int i = 0;
        while (it.hasNext()) {
            keyStoreM117117b.setCertificateEntry(Integer.toString(i), it.next());
            i++;
        }
        KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm()).init(keyStoreM117117b, charArray);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStoreM117117b);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        j850.m140190a("Unexpected default trust managers:", Arrays.toString(trustManagers));
        return null;
    }
}
