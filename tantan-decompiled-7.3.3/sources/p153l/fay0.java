package p153l;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@WorkerThread
public final class fay0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f98020a;

    /* JADX INFO: renamed from: b */
    public final t9y0 f98021b;

    /* JADX INFO: renamed from: c */
    public final String f98022c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f98023d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ y9y0 f98024e;

    public fay0(y9y0 y9y0Var, String str, URL url, byte[] bArr, Map<String, String> map, t9y0 t9y0Var) {
        this.f98024e = y9y0Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(t9y0Var);
        this.f98020a = url;
        this.f98021b = t9y0Var;
        this.f98022c = str;
        this.f98023d = null;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m124800a(int i, Exception exc, byte[] bArr, Map map) {
        this.f98021b.mo100408a(this.f98022c, i, exc, bArr, map);
    }

    /* JADX INFO: renamed from: b */
    public final void m124801b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f98024e.zzl().m177841w(new Runnable() { // from class: l.bay0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75758a.m124800a(i, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        this.f98024e.mo15144f();
        int responseCode = 0;
        try {
            URLConnection uRLConnectionMo123516a = n1u0.m161145b().mo123516a(this.f98020a, "client-measurement");
            if (!(uRLConnectionMo123516a instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionMo123516a;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(HuiYanResultSender.TIMEOUT_MS);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                try {
                    y9y0 y9y0Var = this.f98024e;
                    byte[] bArrM214852o = y9y0.m214852o(httpURLConnection);
                    httpURLConnection.disconnect();
                    m124801b(responseCode, null, bArrM214852o, headerFields);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m124801b(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m124801b(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                headerFields = null;
            } catch (Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            headerFields = null;
        }
    }
}
