package p149l;

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
public class dll extends xp2<C16409c> {

    /* JADX INFO: renamed from: a */
    public int f86829a;

    /* JADX INFO: renamed from: b */
    public String f86830b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f86831c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f86832d;

    /* JADX INFO: renamed from: e */
    public final by00 f86833e;

    /* JADX INFO: renamed from: l.dll$a */
    public class RunnableC16407a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C16409c f86834a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mb20.InterfaceC18431a f86835b;

        public RunnableC16407a(C16409c c16409c, mb20.InterfaceC18431a interfaceC18431a) {
            this.f86834a = c16409c;
            this.f86835b = interfaceC18431a;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            dll.this.m112397j(this.f86834a, this.f86835b);
        }
    }

    /* JADX INFO: renamed from: l.dll$b */
    public class C16408b extends nq2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Future f86837a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ mb20.InterfaceC18431a f86838b;

        public C16408b(Future future, mb20.InterfaceC18431a interfaceC18431a) {
            this.f86837a = future;
            this.f86838b = interfaceC18431a;
        }

        @Override // p149l.nq2, p149l.vc90
        /* JADX INFO: renamed from: b */
        public void mo8497b() {
            if (this.f86837a.cancel(false)) {
                this.f86838b.mo149197a();
            }
        }
    }

    /* JADX INFO: renamed from: l.dll$c */
    public static class C16409c extends zei {

        /* JADX INFO: renamed from: f */
        public long f86840f;

        /* JADX INFO: renamed from: g */
        public long f86841g;

        /* JADX INFO: renamed from: h */
        public long f86842h;

        public C16409c(uz5<jze> uz5Var, uc90 uc90Var) {
            super(uz5Var, uc90Var);
        }
    }

    @VisibleForTesting
    public dll(String str, Map<String, String> map, by00 by00Var) {
        this.f86832d = Executors.newFixedThreadPool(3);
        this.f86833e = by00Var;
        this.f86831c = map;
        this.f86830b = str;
    }

    /* JADX INFO: renamed from: h */
    public static String m112386h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m112387l(int i) {
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
    public static boolean m112388m(int i) {
        return i >= 200 && i < 300;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public static HttpURLConnection m112389o(Uri uri) throws IOException {
        return (HttpURLConnection) fvj0.m123322q(uri).openConnection();
    }

    @Override // p149l.mb20
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C16409c mo112392d(uz5<jze> uz5Var, uc90 uc90Var) {
        return new C16409c(uz5Var, uc90Var);
    }

    /* JADX INFO: renamed from: g */
    public final HttpURLConnection m112395g(Uri uri, int i) throws IOException {
        HttpURLConnection httpURLConnectionM112389o = m112389o(uri);
        String str = this.f86830b;
        if (str != null) {
            httpURLConnectionM112389o.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f86831c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionM112389o.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        httpURLConnectionM112389o.setConnectTimeout(this.f86829a);
        int responseCode = httpURLConnectionM112389o.getResponseCode();
        if (m112388m(responseCode)) {
            return httpURLConnectionM112389o;
        }
        if (!m112387l(responseCode)) {
            httpURLConnectionM112389o.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = httpURLConnectionM112389o.getHeaderField("Location");
        httpURLConnectionM112389o.disconnect();
        Uri uri2 = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i > 0 && uri2 != null && !t050.m186814a(uri2.getScheme(), scheme)) {
            return m112395g(uri2, i - 1);
        }
        rhg0.m179353a(i == 0 ? m112386h("URL %s follows too many redirects", uri.toString()) : m112386h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        return null;
    }

    @Override // p149l.mb20
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo112390a(C16409c c16409c, mb20.InterfaceC18431a interfaceC18431a) {
        c16409c.f86840f = this.f86833e.now();
        c16409c.m218335b().mo155872q(new C16408b(this.f86832d.submit(new RunnableC16407a(c16409c, interfaceC18431a)), interfaceC18431a));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0045  */
    /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[SYNTHETIC] */
    @VisibleForTesting
    /* JADX INFO: renamed from: j */
    public void m112397j(C16409c c16409c, mb20.InterfaceC18431a interfaceC18431a) throws Throwable {
        HttpURLConnection httpURLConnectionM112395g;
        InputStream inputStream = null;
        try {
            httpURLConnectionM112395g = m112395g(c16409c.m218340g(), 5);
            try {
                try {
                    c16409c.f86841g = this.f86833e.now();
                    if (httpURLConnectionM112395g != null) {
                        inputStream = httpURLConnectionM112395g.getInputStream();
                        interfaceC18431a.mo149198b(inputStream, -1);
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionM112395g == null) {
                        return;
                    }
                } catch (IOException e) {
                    e = e;
                    interfaceC18431a.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (httpURLConnectionM112395g == null) {
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
                if (httpURLConnectionM112395g != null) {
                    throw th;
                }
                httpURLConnectionM112395g.disconnect();
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnectionM112395g = null;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnectionM112395g = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (httpURLConnectionM112395g != null) {
                throw th;
            }
            httpURLConnectionM112395g.disconnect();
            throw th;
        }
        httpURLConnectionM112395g.disconnect();
    }

    @Override // p149l.xp2, p149l.mb20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Map<String, String> mo112391c(C16409c c16409c, int i) {
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c16409c.f86841g - c16409c.f86840f));
        map.put("fetch_time", Long.toString(c16409c.f86842h - c16409c.f86841g));
        map.put("total_time", Long.toString(c16409c.f86842h - c16409c.f86840f));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // p149l.xp2, p149l.mb20
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo112393e(C16409c c16409c, int i) {
        c16409c.f86842h = this.f86833e.now();
    }

    public dll(int i) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f86829a = i;
    }

    public dll() {
        this(null, null, RealtimeSinceBootClock.get());
    }
}
