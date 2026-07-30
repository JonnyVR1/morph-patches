package p153l;

import android.webkit.WebSettings;
import com.momosec.mmuid.R$string;
import com.momosec.mmuid.network.exception.HttpBaseException;
import com.momosec.mmuid.network.exception.HttpResponseStatusErrorException;
import com.momosec.mmuid.network.exception.NetworkUnavailableException;
import com.tencent.could.component.common.p084ai.eventreport.entry.NetWorkParam;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ssl.AbstractVerifier;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes8.dex */
public class dol {

    /* JADX INFO: renamed from: a */
    private static final String f89968a = hmw.m136007a(new byte[]{120, 18, 69, 71, 52, 18, 89, 10, 66});

    /* JADX INFO: renamed from: l.dol$b */
    public static class C16593b extends AbstractVerifier {
        private C16593b() {
        }

        @Override // org.apache.http.conn.ssl.X509HostnameVerifier
        public void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
            verify(str, strArr, strArr2, true);
        }
    }

    static {
        HttpsURLConnection.setDefaultHostnameVerifier(new C16593b());
    }

    /* JADX INFO: renamed from: a */
    public static HttpURLConnection m117305a(String str) throws Exception {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = url.getProtocol().equals(hmw.m136007a(new byte[]{88, 18, 69, 71, 18})) ? (HttpsURLConnection) url.openConnection(Proxy.NO_PROXY) : (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
        httpURLConnection.setRequestProperty(hmw.m136007a(new byte[]{101, 21, 84, 69, 76, 39, 87, 3, 95, 67}), m117306b());
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: b */
    public static String m117306b() {
        String property;
        try {
            property = WebSettings.getDefaultUserAgent(fiw.m125761a());
        } catch (Exception unused) {
            property = System.getProperty(hmw.m136007a(new byte[]{88, 18, 69, 71, 79, 7, 87, 3, 95, 67}));
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = property.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = property.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                stringBuffer.append(String.format(hmw.m136007a(new byte[]{108, 19, 20, 7, 85, 30}), Integer.valueOf(cCharAt)));
            } else {
                stringBuffer.append(cCharAt);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m117307c(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey());
            stringBuffer.append(hmw.m136007a(new byte[]{HttpTokens.CARRIAGE_RETURN}));
            stringBuffer.append(entry.getValue());
            stringBuffer.append(hmw.m136007a(new byte[]{22}));
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 1).getBytes();
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m117308d(String str, String str2, Map<String, String> map) throws Exception {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 3) {
                throw new HttpBaseException(fiw.m125761a().getString(R$string.f15493b));
            }
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection httpURLConnectionM117309e = m117309e(str, str2, map);
                int responseCode = httpURLConnectionM117309e.getResponseCode();
                if (responseCode < 200 || responseCode >= 299) {
                    throw new HttpResponseStatusErrorException(responseCode);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnectionM117309e.getInputStream());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
                byte[] bArr = new byte[2048];
                while (true) {
                    int i4 = bufferedInputStream.read(bArr);
                    if (i4 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        httpURLConnectionM117309e.disconnect();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i4);
                }
            } catch (NetworkUnavailableException e) {
                throw e;
            } catch (Exception e2) {
                try {
                    if ((e2 instanceof HttpResponseStatusErrorException) && (i = ((HttpResponseStatusErrorException) e2).statusCode) > 0 && i < 500) {
                        throw e2;
                    }
                    if (i3 >= 3 || System.currentTimeMillis() - jCurrentTimeMillis > 20000) {
                        throw e2;
                    }
                    if (!tl20.m191603b()) {
                        throw e2;
                    }
                    Thread.sleep(500L);
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static HttpURLConnection m117309e(String str, String str2, Map<String, String> map) throws Exception {
        if (!tl20.m191603b()) {
            throw new NetworkUnavailableException();
        }
        byte[] bArrM117307c = m117307c(map);
        long length = bArrM117307c.length;
        HttpURLConnection httpURLConnectionM117305a = m117305a(str);
        httpURLConnectionM117305a.setDoInput(true);
        httpURLConnectionM117305a.setDoOutput(true);
        httpURLConnectionM117305a.setConnectTimeout(5000);
        httpURLConnectionM117305a.setReadTimeout(NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
        httpURLConnectionM117305a.setRequestMethod(hmw.m136007a(new byte[]{96, 41, 98, 99}));
        httpURLConnectionM117305a.setRequestProperty(hmw.m136007a(new byte[]{115, 14, 80, 69, 18, 3, 68}), hmw.m136007a(new byte[]{101, 50, 119, 26, 89}));
        httpURLConnectionM117305a.setRequestProperty(hmw.m136007a(new byte[]{115, 9, 95, 89, 4, 5, 68, 15, 94, 89}), hmw.m136007a(new byte[]{83, 10, 94, 68, 4}));
        httpURLConnectionM117305a.setRequestProperty(hmw.m136007a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 125, 82, 15, 1, 68, 14}), length + "");
        httpURLConnectionM117305a.setRequestProperty(hmw.m136007a(new byte[]{113, 5, 82, 82, 17, 18, 29, 42, 80, 89, 6, 19, 81, 1, 84}), hmw.m136007a(new byte[]{74, 14, 28, 116, 47}));
        httpURLConnectionM117305a.setRequestProperty(hmw.m136007a(new byte[]{115, 9, 95, 67, 4, 8, 68, 75, 101, 78, 17, 3}), hmw.m136007a(new byte[]{81, 22, 65, 91, 8, 5, 81, 18, 88, 88, 15, 73, 72, 75, 70, 64, 22, 75, 86, 9, 67, 90, 76, 19, 66, 10, 84, 89, 2, 9, 84, 3, 85}));
        httpURLConnectionM117305a.setRequestProperty(hmw.m136007a(new byte[]{83, 9, 94, 92, 8, 3}), hmw.m136007a(new byte[]{99, 35, 98, 100, 40, 41, 126, 47, 117, 10}) + str2);
        if (map == null || map.isEmpty()) {
            return httpURLConnectionM117305a;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnectionM117305a.getOutputStream());
                try {
                    bufferedOutputStream2.write(bArrM117307c);
                    bufferedOutputStream2.flush();
                    bufferedOutputStream2.close();
                    return httpURLConnectionM117305a;
                } catch (Exception e) {
                    e = e;
                    if (e.getMessage().contains(hmw.m136007a(new byte[]{71, 7, 66, 23, 15, 9, 68, 70, 71, 82, 19, 15, 86, 15, 84, 83}))) {
                        throw new SSLException(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
