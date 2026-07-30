package p153l;

import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes.dex */
public class irq0 {
    /* JADX INFO: renamed from: a */
    public static void m141848a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, null, null);
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(new xuq0(sSLContext.getSocketFactory()));
            } catch (Throwable unused) {
            }
        }
    }
}
