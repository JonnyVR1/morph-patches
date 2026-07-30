package p149l;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes7.dex */
public class rll {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static X509TrustManager m179812b(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static SSLSocketFactory m179813c(InputStream[] inputStreamArr, InputStream inputStream, String str) {
        try {
            KeyManager[] keyManagerArrM179814d = m179814d(inputStream, str);
            TrustManager[] trustManagerArrM179815e = m179815e(inputStreamArr);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerArrM179814d, new TrustManager[]{trustManagerArrM179815e != null ? new C19730b(m179812b(trustManagerArrM179815e)) : new C19731c()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e) {
            y9g0.m213537a(e);
            return null;
        } catch (KeyStoreException e2) {
            y9g0.m213537a(e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            y9g0.m213537a(e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static KeyManager[] m179814d(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (KeyStoreException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            } catch (UnrecoverableKeyException e4) {
                e4.printStackTrace();
            } catch (CertificateException e5) {
                e5.printStackTrace();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static TrustManager[] m179815e(InputStream... inputStreamArr) {
        if (inputStreamArr != null && inputStreamArr.length > 0) {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null);
                int length = inputStreamArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    InputStream inputStream = inputStreamArr[i];
                    int i3 = i2 + 1;
                    keyStore.setCertificateEntry(Integer.toString(i2), certificateFactory.generateCertificate(inputStream));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    i++;
                    i2 = i3;
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (KeyStoreException e2) {
                e2.printStackTrace();
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
            } catch (CertificateException e4) {
                e4.printStackTrace();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l.rll$b */
    public static class C19730b implements X509TrustManager {

        /* JADX INFO: renamed from: a */
        private X509TrustManager f159976a;

        /* JADX INFO: renamed from: b */
        private X509TrustManager f159977b;

        public C19730b(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyStoreException {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            this.f159976a = rll.m179812b(trustManagerFactory.getTrustManagers());
            this.f159977b = x509TrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            try {
                this.f159976a.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException unused) {
                this.f159977b.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }
    }

    /* JADX INFO: renamed from: l.rll$c */
    public static class C19731c implements X509TrustManager {
        private C19731c() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }
    }
}
