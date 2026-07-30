package p149l;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.C0919e;
import com.android.volley.ClientError;
import com.android.volley.InterfaceC0915a;
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
final class id20 {

    /* JADX INFO: renamed from: l.id20$b */
    public static class C17523b {

        /* JADX INFO: renamed from: a */
        private final String f112514a;

        /* JADX INFO: renamed from: b */
        private final VolleyError f112515b;

        private C17523b(String str, VolleyError volleyError) {
            this.f112514a = str;
            this.f112515b = volleyError;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m135385a(Request<?> request, C17523b c17523b) throws VolleyError {
        gyc0 retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.mo127565b(c17523b.f112515b);
            request.addMarker(String.format("%s-retry [timeout=%s]", c17523b.f112514a, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", c17523b.f112514a, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static sc20 m135386b(Request<?> request, long j, List<ixk> list) {
        InterfaceC0915a.a cacheEntry = request.getCacheEntry();
        if (cacheEntry == null) {
            return new sc20(HttpStatus.NOT_MODIFIED_304, (byte[]) null, true, j, list);
        }
        return new sc20(HttpStatus.NOT_MODIFIED_304, cacheEntry.f4144a, true, j, jkl.m141884a(list, cacheEntry));
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m135387c(InputStream inputStream, int i, vp3 vp3Var) throws Throwable {
        byte[] bArrM199217a;
        db80 db80Var = new db80(vp3Var, i);
        try {
            bArrM199217a = vp3Var.m199217a(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrM199217a);
                    if (i2 == -1) {
                        break;
                    }
                    db80Var.write(bArrM199217a, 0, i2);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            C0919e.m5102e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    vp3Var.m199218b(bArrM199217a);
                    db80Var.close();
                    throw th;
                }
            }
            byte[] byteArray = db80Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                C0919e.m5102e("Error occurred when closing InputStream", new Object[0]);
            }
            vp3Var.m199218b(bArrM199217a);
            db80Var.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrM199217a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m135388d(long j, Request<?> request, byte[] bArr, int i) {
        if (C0919e.f4171b || j > 3000) {
            C0919e.m5099b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", request, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i), Integer.valueOf(request.getRetryPolicy().mo127564a()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static C17523b m135389e(Request<?> request, IOException iOException, long j, @Nullable okl oklVar, @Nullable byte[] bArr) throws VolleyError {
        if (iOException instanceof SocketTimeoutException) {
            return new C17523b("socket", new TimeoutError());
        }
        if (iOException instanceof MalformedURLException) {
            zmc0.m219321a("Bad URL ", request.getUrl(), iOException);
            return null;
        }
        if (oklVar == null) {
            if (!request.shouldRetryConnectionErrors()) {
                throw new NoConnectionError(iOException);
            }
            return new C17523b("connection", new NoConnectionError());
        }
        int iM164864d = oklVar.m164864d();
        C0919e.m5100c("Unexpected response code %d for %s", Integer.valueOf(iM164864d), request.getUrl());
        if (bArr == null) {
            return new C17523b("network", new NetworkError());
        }
        sc20 sc20Var = new sc20(iM164864d, bArr, false, SystemClock.elapsedRealtime() - j, oklVar.m164863c());
        if (iM164864d == 401 || iM164864d == 403) {
            return new C17523b("auth", new AuthFailureError(sc20Var));
        }
        if (iM164864d >= 400 && iM164864d <= 499) {
            throw new ClientError(sc20Var);
        }
        if (iM164864d < 500 || iM164864d > 599 || !request.shouldRetryServerErrors()) {
            throw new ServerError(sc20Var);
        }
        return new C17523b("server", new ServerError(sc20Var));
    }
}
