package p153l;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class snl extends oq2<C20121c> {

    /* JADX INFO: renamed from: a */
    public int f169722a;

    /* JADX INFO: renamed from: b */
    public String f169723b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f169724c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f169725d;

    /* JADX INFO: renamed from: e */
    public final l610 f169726e;

    /* JADX INFO: renamed from: l.snl$a */
    public class RunnableC20119a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C20121c f169727a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vj20.InterfaceC20847a f169728b;

        public RunnableC20119a(C20121c c20121c, vj20.InterfaceC20847a interfaceC20847a) {
            this.f169727a = c20121c;
            this.f169728b = interfaceC20847a;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            snl.this.m186976j(this.f169727a, this.f169728b);
        }
    }

    /* JADX INFO: renamed from: l.snl$b */
    public class C20120b extends er2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Future f169730a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vj20.InterfaceC20847a f169731b;

        public C20120b(Future future, vj20.InterfaceC20847a interfaceC20847a) {
            this.f169730a = future;
            this.f169731b = interfaceC20847a;
        }

        @Override // p153l.er2, p153l.zk90
        /* JADX INFO: renamed from: b */
        public void mo8551b() {
            if (this.f169730a.cancel(false)) {
                this.f169731b.mo196314a();
            }
        }
    }

    /* JADX INFO: renamed from: l.snl$c */
    public static class C20121c extends vhi {

        /* JADX INFO: renamed from: f */
        public long f169733f;

        /* JADX INFO: renamed from: g */
        public long f169734g;

        /* JADX INFO: renamed from: h */
        public long f169735h;

        public C20121c(z06<n0f> z06Var, yk90 yk90Var) {
            super(z06Var, yk90Var);
        }
    }

    @VisibleForTesting
    public snl(String str, Map<String, String> map, l610 l610Var) {
        this.f169725d = Executors.newFixedThreadPool(3);
        this.f169726e = l610Var;
        this.f169724c = map;
        this.f169723b = str;
    }

    /* JADX INFO: renamed from: h */
    public static String m186967h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m186968l(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m186969m(int i) {
        return i >= 200 && i < 300;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public static HttpURLConnection m186970o(Uri uri) throws IOException {
        return (HttpURLConnection) i4k0.m138568q(uri).openConnection();
    }

    @Override // p153l.vj20
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C20121c mo186972d(z06<n0f> z06Var, yk90 yk90Var) {
        return new C20121c(z06Var, yk90Var);
    }

    /* JADX INFO: renamed from: g */
    public final HttpURLConnection m186974g(Uri uri, int i) throws IOException {
        HttpURLConnection httpURLConnectionM186970o = m186970o(uri);
        String str = this.f169723b;
        if (str != null) {
            httpURLConnectionM186970o.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f169724c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionM186970o.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnectionM186970o.setConnectTimeout(this.f169722a);
        int responseCode = httpURLConnectionM186970o.getResponseCode();
        if (m186969m(responseCode)) {
            return httpURLConnectionM186970o;
        }
        if (!m186968l(responseCode)) {
            httpURLConnectionM186970o.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionM186970o.getHeaderField("Location");
        httpURLConnectionM186970o.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i > 0 && uri2 != null && !i950.m139074a(uri2.getScheme(), scheme)) {
            return m186974g(uri2, i - 1);
        }
        zpg0.m220844a(i == 0 ? m186967h("URL %s follows too many redirects", uri.toString()) : m186967h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        return null;
    }

    @Override // p153l.vj20
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo186971a(C20121c c20121c, vj20.InterfaceC20847a interfaceC20847a) {
        c20121c.f169733f = this.f169726e.now();
        c20121c.m201290b().mo117677q(new C20120b(this.f169725d.submit(new RunnableC20119a(c20121c, interfaceC20847a)), interfaceC20847a));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m186976j(C20121c c20121c, vj20.InterfaceC20847a interfaceC20847a) throws Throwable {
        HttpURLConnection httpURLConnectionM186974g;
        InputStream inputStream = null;
        try {
            httpURLConnectionM186974g = m186974g(c20121c.m201295g(), 5);
            try {
                try {
                    c20121c.f169734g = this.f169726e.now();
                    if (httpURLConnectionM186974g != null) {
                        inputStream = httpURLConnectionM186974g.getInputStream();
                        interfaceC20847a.mo196315b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionM186974g == null) {
                        return;
                    }
                } catch (IOException e) {
                    e = e;
                    interfaceC20847a.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionM186974g == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (httpURLConnectionM186974g != null) {
                    throw th;
                }
                httpURLConnectionM186974g.disconnect();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnectionM186974g = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionM186974g = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionM186974g != null) {
                throw th;
            }
            httpURLConnectionM186974g.disconnect();
            throw th;
        }
        httpURLConnectionM186974g.disconnect();
    }

    @Override // p153l.oq2, p153l.vj20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> mo168785c(C20121c c20121c, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c20121c.f169734g - c20121c.f169733f));
        map.put("fetch_time", Long.toString(c20121c.f169735h - c20121c.f169734g));
        map.put("total_time", Long.toString(c20121c.f169735h - c20121c.f169733f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // p153l.oq2, p153l.vj20
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo168786e(C20121c c20121c, int i) {
        c20121c.f169735h = this.f169726e.now();
    }

    public snl(int i) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f169722a = i;
    }

    public snl() {
        this(null, null, RealtimeSinceBootClock.get());
    }
}
