package com.sina.weibo.sdk.net;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes11.dex */
public final class HttpsHelper {
    private SSLSocketFactory mSSLSocketFactory;

    public static class CustomX509TrustManager implements X509TrustManager {
        private List<X509TrustManager> mTrustManagers = new ArrayList();

        public CustomX509TrustManager(KeyStore... keyStoreArr) {
            ArrayList arrayList = new ArrayList();
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                arrayList.add(trustManagerFactory);
                for (KeyStore keyStore : keyStoreArr) {
                    TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory2.init(keyStore);
                    arrayList.add(trustManagerFactory2);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    for (TrustManager trustManager : ((TrustManagerFactory) it.next()).getTrustManagers()) {
                        if (trustManager instanceof X509TrustManager) {
                            this.mTrustManagers.add((X509TrustManager) trustManager);
                        }
                    }
                }
                if (this.mTrustManagers.size() == 0) {
                    throw new RuntimeException("Couldn't find any X509TrustManagers");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.mTrustManagers.get(0).checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            Iterator<X509TrustManager> it = this.mTrustManagers.iterator();
            while (it.hasNext()) {
                it.next().checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.mTrustManagers.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        }
    }

    private SSLSocketFactory getSSLSocketFactory(Context context) {
        if (this.mSSLSocketFactory == null) {
            try {
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry("get_global_ca", loadCertificate(context));
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{new CustomX509TrustManager(keyStore)}, null);
                this.mSSLSocketFactory = sSLContext.getSocketFactory();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (KeyManagementException e2) {
                e2.printStackTrace();
            } catch (KeyStoreException e3) {
                e3.printStackTrace();
            } catch (NoSuchAlgorithmException e4) {
                e4.printStackTrace();
            } catch (CertificateException e5) {
                e5.printStackTrace();
            }
        }
        return this.mSSLSocketFactory;
    }

    private Certificate loadCertificate(Context context) throws IOException, CertificateException {
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open("weibocn.cer"));
        try {
            return certificateFactory.generateCertificate(bufferedInputStream);
        } finally {
            bufferedInputStream.close();
        }
    }
}
