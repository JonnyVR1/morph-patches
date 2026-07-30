package com.tencent.liteav.basic.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p149l.whq0;

/* JADX INFO: loaded from: classes2.dex */
public class TXHttpRequest {
    private static final int CON_TIMEOUT = 5000;
    private static final int READ_TIMEOUT = 5000;
    private static final String TAG = "TXHttpRequest";
    private long mNativeHttps;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.TXHttpRequest$b */
    public static class C14044b {

        /* JADX INFO: renamed from: a */
        public int f58481a = 1;

        /* JADX INFO: renamed from: b */
        public String f58482b = "";

        /* JADX INFO: renamed from: c */
        public byte[] f58483c = "".getBytes();
    }

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.TXHttpRequest$d */
    public static class C14046d implements X509TrustManager {

        /* JADX INFO: renamed from: a */
        X509TrustManager f58487a;

        public C14046d() throws Exception {
            KeyStore keyStore;
            TrustManager[] trustManagers;
            FileInputStream fileInputStream;
            try {
                keyStore = KeyStore.getInstance("JKS");
            } catch (Exception unused) {
                keyStore = null;
            }
            if (keyStore != null) {
                fileInputStream = new FileInputStream("trustedCerts");
                keyStore.load(fileInputStream, "passphrase".toCharArray());
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509", "SunJSSE");
                trustManagerFactory.init(keyStore);
                trustManagers = trustManagerFactory.getTrustManagers();
            } else {
                TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory2.init((KeyStore) null);
                trustManagers = trustManagerFactory2.getTrustManagers();
                fileInputStream = null;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    this.f58487a = (X509TrustManager) trustManager;
                    return;
                }
            }
            whq0.m203241a("Couldn't initialize");
            throw null;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f58487a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            this.f58487a.checkServerTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return this.f58487a.getAcceptedIssuers();
        }
    }

    public TXHttpRequest(long j) {
        this.mNativeHttps = j;
    }

    public static SSLSocketFactory createSSLSocketFactory() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new C14046d()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            TXCLog.m82969i(TAG, "createSSLSocketFactory failed : " + e.getMessage());
            return null;
        }
    }

    public static byte[] getHttpPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.m82969i(TAG, "getHttpPostRsp->request: " + str);
        TXCLog.m82969i(TAG, "getHttpPostRsp->data size: " + bArr.length);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "%20")).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            TXCLog.m82969i(TAG, "getHttpPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr, 0, bArr.length);
            if (i == -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                httpURLConnection.disconnect();
                TXCLog.m82969i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static byte[] getHttpsPostRsp(Map<String, String> map, String str, byte[] bArr) throws Exception {
        TXCLog.m82969i(TAG, "getHttpsPostRsp->request: " + str);
        TXCLog.m82969i(TAG, "getHttpsPostRsp->data: " + bArr.length);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str.replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "%20")).openConnection();
        httpsURLConnection.setSSLSocketFactory(createSSLSocketFactory());
        httpsURLConnection.setHostnameVerifier(C14045c.f58484a);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setConnectTimeout(5000);
        httpsURLConnection.setReadTimeout(5000);
        httpsURLConnection.setRequestMethod("POST");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        dataOutputStream.close();
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode != 200) {
            TXCLog.m82969i(TAG, "getHttpsPostRsp->response code: " + responseCode);
            throw new Exception("response: " + responseCode);
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr, 0, bArr.length);
            if (i == -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                httpsURLConnection.disconnect();
                TXCLog.m82969i(TAG, "getHttpsPostRsp->rsp size: " + byteArrayOutputStream.size());
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeOnRecvMessage(long j, int i, byte[] bArr);

    public void asyncPostRequest(Map<String, String> map, byte[] bArr, byte[] bArr2) {
        new AsyncTaskC14043a(this, map).execute(bArr, bArr2);
    }

    public int sendHttpsRequest(String str, byte[] bArr) {
        TXCLog.m82969i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(null, str.getBytes(), bArr);
        return 0;
    }

    public int sendHttpsRequest(Map<String, String> map, String str, byte[] bArr) {
        TXCLog.m82969i(TAG, "sendHttpsRequest->enter action: " + str + ", data size: " + bArr.length);
        asyncPostRequest(map, str.getBytes(), bArr);
        return 0;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.TXHttpRequest$a */
    public static class AsyncTaskC14043a extends AsyncTask<byte[], Void, C14044b> {

        /* JADX INFO: renamed from: a */
        private WeakReference<TXHttpRequest> f58475a;

        /* JADX INFO: renamed from: b */
        private Handler f58476b;

        /* JADX INFO: renamed from: c */
        private Map<String, String> f58477c;

        public AsyncTaskC14043a(TXHttpRequest tXHttpRequest, Map<String, String> map) {
            this.f58476b = null;
            this.f58477c = map;
            this.f58475a = new WeakReference<>(tXHttpRequest);
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                this.f58476b = new Handler(looperMyLooper);
            } else {
                this.f58476b = null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C14044b doInBackground(byte[]... bArr) {
            C14044b c14044b = new C14044b();
            try {
                boolean zStartsWith = new String(bArr[0]).startsWith("https");
                Map<String, String> map = this.f58477c;
                if (zStartsWith) {
                    c14044b.f58483c = TXHttpRequest.getHttpsPostRsp(map, new String(bArr[0]), bArr[1]);
                } else {
                    c14044b.f58483c = TXHttpRequest.getHttpPostRsp(map, new String(bArr[0]), bArr[1]);
                }
                c14044b.f58481a = 0;
            } catch (Exception e) {
                c14044b.f58482b = e.toString();
                c14044b.f58481a = 1;
            }
            TXCLog.m82969i(TXHttpRequest.TAG, "TXPostRequest->result: " + c14044b.f58481a + "|" + c14044b.f58482b);
            return c14044b;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(final C14044b c14044b) {
            super.onPostExecute(c14044b);
            final TXHttpRequest tXHttpRequest = this.f58475a.get();
            if (tXHttpRequest == null || tXHttpRequest.mNativeHttps == 0) {
                return;
            }
            Handler handler = this.f58476b;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.tencent.liteav.basic.util.TXHttpRequest.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TXCLog.m82969i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + c14044b.f58481a + "|" + c14044b.f58482b);
                        TXHttpRequest tXHttpRequest2 = tXHttpRequest;
                        long j = tXHttpRequest2.mNativeHttps;
                        C14044b c14044b2 = c14044b;
                        tXHttpRequest2.nativeOnRecvMessage(j, c14044b2.f58481a, c14044b2.f58483c);
                    }
                });
                return;
            }
            TXCLog.m82969i(TXHttpRequest.TAG, "TXPostRequest->recvMsg: " + c14044b.f58481a + "|" + c14044b.f58482b);
            tXHttpRequest.nativeOnRecvMessage(tXHttpRequest.mNativeHttps, c14044b.f58481a, c14044b.f58483c);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.TXHttpRequest$c */
    public static class C14045c implements HostnameVerifier {

        /* JADX INFO: renamed from: a */
        public static final C14045c f58484a = new C14045c(false);

        /* JADX INFO: renamed from: b */
        private static final Pattern f58485b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

        /* JADX INFO: renamed from: c */
        private final boolean f58486c;

        private C14045c(boolean z) {
            this.f58486c = z;
        }

        /* JADX INFO: renamed from: a */
        private boolean m83007a(String str, String str2) {
            if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                if (!str.endsWith(".")) {
                    str = str.concat(".");
                }
                if (!str2.endsWith(".")) {
                    str2 = str2.concat(".");
                }
                String lowerCase = str2.toLowerCase(Locale.US);
                if (!lowerCase.contains("*")) {
                    return str.equals(lowerCase);
                }
                if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                    return false;
                }
                if (this.f58486c && lowerCase.substring(2, lowerCase.length() - 1).indexOf(46) < 0) {
                    return false;
                }
                String strSubstring = lowerCase.substring(1);
                if (!str.endsWith(strSubstring)) {
                    return false;
                }
                int length = str.length() - strSubstring.length();
                return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        private boolean m83008b(String str, X509Certificate x509Certificate) {
            List<String> listM83005a = m83005a(x509Certificate, 7);
            int size = listM83005a.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase(listM83005a.get(i))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        private boolean m83009c(String str, X509Certificate x509Certificate) {
            String lowerCase = str.toLowerCase(Locale.US);
            List<String> listM83005a = m83005a(x509Certificate, 2);
            int size = listM83005a.size();
            for (int i = 0; i < size; i++) {
                if (m83007a(lowerCase, listM83005a.get(i))) {
                    return true;
                }
            }
            return false;
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            try {
                return m83010a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        public static boolean m83006a(String str) {
            return f58485b.matcher(str).matches();
        }

        /* JADX INFO: renamed from: a */
        private static List<String> m83005a(X509Certificate x509Certificate, int i) {
            Integer num;
            String str;
            ArrayList arrayList = new ArrayList();
            try {
                Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
                if (subjectAlternativeNames == null) {
                    return Collections.EMPTY_LIST;
                }
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            } catch (CertificateParsingException unused) {
                return Collections.EMPTY_LIST;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m83010a(String str, X509Certificate x509Certificate) {
            if (m83006a(str)) {
                return m83008b(str, x509Certificate);
            }
            return m83009c(str, x509Certificate);
        }
    }
}
