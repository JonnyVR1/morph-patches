package com.immomo.mmdns;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
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
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
public class SSLFactoryUtils {

    public static class MyTrustManager implements X509TrustManager {
        private X509TrustManager defaultTrustManager;
        private X509TrustManager localTrustManager;

        public MyTrustManager(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyStoreException {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            this.defaultTrustManager = SSLFactoryUtils.chooseTrustManager(trustManagerFactory.getTrustManagers());
            this.localTrustManager = x509TrustManager;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            try {
                this.defaultTrustManager.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException unused) {
                this.localTrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static class UnSafeTrustManager implements X509TrustManager {
        private UnSafeTrustManager() {
        }

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

    /* JADX INFO: Access modifiers changed from: private */
    public static X509TrustManager chooseTrustManager(TrustManager[] trustManagerArr) {
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static SSLSocketFactory getSslSocketFactory(InputStream inputStream, String str, String str2, String str3, InputStream... inputStreamArr) {
        MDLog.m7395i(LogTag.DNS, "getSslSocketFactory " + str2 + " - " + str3 + " - ");
        try {
            KeyManager[] keyManagerArrPrepareKeyManager = prepareKeyManager(inputStream, str);
            TrustManager[] trustManagerArrPrepareTrustManager = prepareTrustManager(inputStreamArr);
            TrustManager myTrustManager = trustManagerArrPrepareTrustManager != null ? new MyTrustManager(chooseTrustManager(trustManagerArrPrepareTrustManager)) : new UnSafeTrustManager();
            if (!TextUtils.isEmpty(str2) && DNSUtils.isIPHost(str2) && MDDNSEntrance.getInstance().useDNS(str3)) {
                return new SNISocketFactory(str3, new TrustManager[]{myTrustManager}, keyManagerArrPrepareKeyManager);
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerArrPrepareKeyManager, new TrustManager[]{myTrustManager}, new SecureRandom());
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

    public static Object[] getSslSocketFactoryAndTrustManager(InputStream inputStream, String str, String str2, String str3, InputStream... inputStreamArr) {
        MDLog.m7395i(LogTag.DNS, "getSslSocketFactoryAndTrustManager " + str2 + " - " + str3 + " - ");
        try {
            KeyManager[] keyManagerArrPrepareKeyManager = prepareKeyManager(inputStream, str);
            TrustManager[] trustManagerArrPrepareTrustManager = prepareTrustManager(inputStreamArr);
            TrustManager myTrustManager = trustManagerArrPrepareTrustManager != null ? new MyTrustManager(chooseTrustManager(trustManagerArrPrepareTrustManager)) : new UnSafeTrustManager();
            if (!TextUtils.isEmpty(str2) && DNSUtils.isIPHost(str2) && MDDNSEntrance.getInstance().useDNS(str3)) {
                return new Object[]{new SNISocketFactory(str3, new TrustManager[]{myTrustManager}, keyManagerArrPrepareKeyManager), myTrustManager};
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(keyManagerArrPrepareKeyManager, new TrustManager[]{myTrustManager}, new SecureRandom());
            return new Object[]{sSLContext.getSocketFactory(), myTrustManager};
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

    private static KeyManager[] prepareKeyManager(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                keyStore.load(inputStream, str.toCharArray());
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, str.toCharArray());
                return keyManagerFactory.getKeyManagers();
            } catch (IOException e) {
                MDLog.printErrStackTrace(LogTag.DNS, e);
            } catch (KeyStoreException e2) {
                MDLog.printErrStackTrace(LogTag.DNS, e2);
            } catch (NoSuchAlgorithmException e3) {
                MDLog.printErrStackTrace(LogTag.DNS, e3);
            } catch (UnrecoverableKeyException e4) {
                MDLog.printErrStackTrace(LogTag.DNS, e4);
            } catch (CertificateException e5) {
                MDLog.printErrStackTrace(LogTag.DNS, e5);
            } catch (Exception e6) {
                MDLog.printErrStackTrace(LogTag.DNS, e6);
            }
        }
        return null;
    }

    private static TrustManager[] prepareTrustManager(InputStream... inputStreamArr) {
        KeyStore keyStore;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            if (inputStreamArr == null || inputStreamArr.length <= 0) {
                keyStore = null;
            } else {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
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
                            MDLog.printErrStackTrace(LogTag.DNS, e);
                        }
                    }
                    i++;
                    i2 = i3;
                }
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory.getTrustManagers();
        } catch (KeyStoreException e2) {
            MDLog.printErrStackTrace(LogTag.DNS, e2);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            MDLog.printErrStackTrace(LogTag.DNS, e3);
            return null;
        } catch (CertificateException e4) {
            MDLog.printErrStackTrace(LogTag.DNS, e4);
            return null;
        } catch (Exception e5) {
            MDLog.printErrStackTrace(LogTag.DNS, e5);
            return null;
        }
    }
}
