package p153l;

import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class oeg0 {
    /* JADX INFO: renamed from: a */
    public static int m167366a(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return -10402;
        }
        if ((th instanceof InterruptedIOException) || (th instanceof SocketException)) {
            return -10403;
        }
        if (th instanceof SSLHandshakeException) {
            return -10404;
        }
        if (th instanceof UnknownHostException) {
            return -10405;
        }
        return ((th instanceof ConnectException) || (th instanceof SSLException)) ? -10406 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static String m167367b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("retCode", -1);
            jSONObject.put("retMsg", str);
            return jSONObject.toString();
        } catch (Exception e) {
            return e.toString();
        }
    }
}
