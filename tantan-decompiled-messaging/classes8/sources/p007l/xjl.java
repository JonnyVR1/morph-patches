package p007l;

import com.momosec.mmuid.network.exception.HttpTimeoutException;
import com.momosec.mmuid.network.exception.HttpsCertificateException;
import com.momosec.mmuid.network.exception.NetworkBaseException;
import java.io.InterruptedIOException;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.security.cert.CertificateException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xjl {

    /* JADX INFO: renamed from: a */
    private static final String f5344a = ijw.m9418a(new byte[]{120, 18, 69, 71, 34, 10, 89, 3, 95, 67});

    /* JADX INFO: renamed from: a */
    public static String m11835a(String str, String str2, Map<String, String> map) throws Exception {
        try {
            return new String(pll.m10265d(str, str2, map));
        } catch (NetworkBaseException e) {
            throw e;
        } catch (InterruptedIOException unused) {
            throw new HttpTimeoutException();
        } catch (SSLHandshakeException e2) {
            throw new HttpsCertificateException(e2);
        } catch (SSLException e3) {
            throw new HttpsCertificateException(e3);
        } catch (CertificateException e4) {
            throw new HttpsCertificateException(e4);
        } catch (Exception e5) {
            throw new NetworkBaseException(e5);
        }
    }
}
