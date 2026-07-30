package p149l;

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
public final class z0y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final URL f201026a;

    /* JADX INFO: renamed from: b */
    public final n0y0 f201027b;

    /* JADX INFO: renamed from: c */
    public final String f201028c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f201029d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s0y0 f201030e;

    public z0y0(s0y0 s0y0Var, String str, URL url, byte[] bArr, Map<String, String> map, n0y0 n0y0Var) {
        this.f201030e = s0y0Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(n0y0Var);
        this.f201026a = url;
        this.f201027b = n0y0Var;
        this.f201028c = str;
        this.f201029d = null;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m216771a(int i, Exception exc, byte[] bArr, Map map) {
        this.f201027b.mo157302a(this.f201028c, i, exc, bArr, map);
    }

    /* JADX INFO: renamed from: b */
    public final void m216772b(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f201030e.zzl().m146305w(new Runnable() { // from class: l.v0y0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179182a.m216771a(i, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        this.f201030e.mo15090f();
        int responseCode = 0;
        try {
            URLConnection uRLConnectionMo132804a = hst0.m132803b().mo132804a(this.f201026a, "client-measurement");
            if (!(uRLConnectionMo132804a instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionMo132804a;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(HuiYanResultSender.TIMEOUT_MS);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                try {
                    s0y0 s0y0Var = this.f201030e;
                    byte[] bArrM181892o = s0y0.m181892o(httpURLConnection);
                    httpURLConnection.disconnect();
                    m216772b(responseCode, null, bArrM181892o, headerFields);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m216772b(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    m216772b(responseCode, null, null, headerFields);
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
