package p153l;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.C0923e;
import com.android.volley.ClientError;
import com.android.volley.InterfaceC0919a;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
final class sl20 {

    /* JADX INFO: renamed from: l.sl20$b */
    public static class C20092b {

        /* JADX INFO: renamed from: a */
        private final String f169347a;

        /* JADX INFO: renamed from: b */
        private final VolleyError f169348b;

        private C20092b(String str, VolleyError volleyError) {
            this.f169347a = str;
            this.f169348b = volleyError;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m186552a(Request<?> request, C20092b c20092b) throws VolleyError {
        j6d0 retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.mo143657b(c20092b.f169348b);
            request.addMarker(String.format("%s-retry [timeout=%s]", c20092b.f169347a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", c20092b.f169347a, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static cl20 m186553b(Request<?> request, long j, List<yzk> list) {
        InterfaceC0919a.a cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new cl20(HttpStatus.NOT_MODIFIED_304, (byte[]) null, true, j, list);
        }
        return new cl20(HttpStatus.NOT_MODIFIED_304, cacheEntry.f4144a, true, j, xml.m211732a(list, cacheEntry));
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m186554c(InputStream inputStream, int i, vq3 vq3Var) throws Throwable {
        byte[] bArrM202354a;
        jj80 jj80Var = new jj80(vq3Var, i);
        try {
            bArrM202354a = vq3Var.m202354a(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrM202354a);
                    if (i2 == -1) {
                        break;
                    }
                    jj80Var.write(bArrM202354a, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            C0923e.m5112e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    vq3Var.m202355b(bArrM202354a);
                    jj80Var.close();
                    throw th;
                }
            }
            byte[] byteArray = jj80Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                C0923e.m5112e("Error occurred when closing InputStream", new Object[0]);
            }
            vq3Var.m202355b(bArrM202354a);
            jj80Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrM202354a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m186555d(long j, Request<?> request, byte[] bArr, int i) {
        if (C0923e.f4171b || j > 3000) {
            C0923e.m5109b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(request.getRetryPolicy().mo143656a()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static C20092b m186556e(Request<?> request, IOException iOException, long j, @Nullable bnl bnlVar, @Nullable byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new C20092b("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            evc0.m122777a("Bad URL ", request.getUrl(), iOException);
            return null;
        }
        if (bnlVar == null) {
            if (!request.shouldRetryConnectionErrors()) {
                throw new NoConnectionError(iOException);
            }
            return new C20092b("connection", new NoConnectionError());
        }
        int iM105499d = bnlVar.m105499d();
        C0923e.m5110c("Unexpected response code %d for %s", Integer.valueOf(iM105499d), request.getUrl());
        if (bArr == null) {
            return new C20092b("network", new NetworkError());
        }
        cl20 cl20Var = new cl20(iM105499d, bArr, false, SystemClock.elapsedRealtime() - j, bnlVar.m105498c());
        if (iM105499d == 401 || iM105499d == 403) {
            return new C20092b("auth", new AuthFailureError(cl20Var));
        }
        if (iM105499d >= 400 && iM105499d <= 499) {
            throw new ClientError(cl20Var);
        }
        if (iM105499d < 500 || iM105499d > 599 || !request.shouldRetryServerErrors()) {
            throw new ServerError(cl20Var);
        }
        return new C20092b("server", new ServerError(cl20Var));
    }
}
