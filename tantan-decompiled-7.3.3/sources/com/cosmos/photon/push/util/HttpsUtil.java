package com.cosmos.photon.push.util;

import android.net.http.X509TrustManagerExtensions;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
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
import java.util.regex.Pattern;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p153l.gig0;

/* JADX INFO: loaded from: classes.dex */
public class HttpsUtil {

    public static class UnSafeTrustManager implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static X509TrustManager chooseTrustManager(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static SSLSocketFactory getSslSocketFactory(InputStream[] inputStreamArr) {
        try {
            KeyManager[] keyManagerArrPrepareKeyManager = prepareKeyManager(null, null);
            TrustManager[] trustManagerArrPrepareTrustManager = prepareTrustManager(inputStreamArr);
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerArrPrepareKeyManager, new TrustManager[]{trustManagerArrPrepareTrustManager != null ? new MyTrustManager(chooseTrustManager(trustManagerArrPrepareTrustManager)) : new UnSafeTrustManager()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException e) {
            gig0.m130323a(e);
            return null;
        } catch (KeyStoreException e2) {
            gig0.m130323a(e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            gig0.m130323a(e3);
            return null;
        }
    }

    public static boolean isIPHost(String str) {
        return Pattern.compile("(?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))").matcher(str).matches();
    }

    public static KeyManager[] prepareKeyManager(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (IOException e) {
                MDLog.printErrStackTrace(LogTag.API, e);
            } catch (KeyStoreException e2) {
                MDLog.printErrStackTrace(LogTag.API, e2);
            } catch (NoSuchAlgorithmException e3) {
                MDLog.printErrStackTrace(LogTag.API, e3);
            } catch (UnrecoverableKeyException e4) {
                MDLog.printErrStackTrace(LogTag.API, e4);
            } catch (CertificateException e5) {
                MDLog.printErrStackTrace(LogTag.API, e5);
            } catch (Exception e6) {
                MDLog.printErrStackTrace(LogTag.API, e6);
            }
        }
        return null;
    }

    public static TrustManager[] prepareTrustManager(InputStream... inputStreamArr) {
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
                            MDLog.printErrStackTrace(LogTag.API, e);
                        }
                    }
                    i++;
                    i2 = i3;
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                return trustManagerFactory.getTrustManagers();
            } catch (KeyStoreException e2) {
                MDLog.printErrStackTrace(LogTag.API, e2);
            } catch (NoSuchAlgorithmException e3) {
                MDLog.printErrStackTrace(LogTag.API, e3);
            } catch (CertificateException e4) {
                MDLog.printErrStackTrace(LogTag.API, e4);
            } catch (Exception e5) {
                MDLog.printErrStackTrace(LogTag.API, e5);
            }
        }
        return null;
    }

    public static class MyTrustManager implements X509TrustManager {
        private X509TrustManager defaultTrustManager;
        private X509TrustManager localTrustManager;

        public MyTrustManager(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyStoreException {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            this.defaultTrustManager = HttpsUtil.chooseTrustManager(trustManagerFactory.getTrustManagers());
            this.localTrustManager = x509TrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Keep
        @RequiresApi(api = 17)
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
            try {
                new X509TrustManagerExtensions(this.defaultTrustManager).checkServerTrusted(x509CertificateArr, str, str2);
            } catch (CertificateException unused) {
                new X509TrustManagerExtensions(this.localTrustManager).checkServerTrusted(x509CertificateArr, str, str2);
            }
            MDLog.m7446e("MyTrustManager", "checkServerTrusted success::%s", str2);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            try {
                this.defaultTrustManager.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException unused) {
                this.localTrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
    }
}
