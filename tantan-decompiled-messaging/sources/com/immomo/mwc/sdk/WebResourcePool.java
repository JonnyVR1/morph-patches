package com.immomo.mwc.sdk;

import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p149l.zsi0;

/* JADX INFO: loaded from: classes7.dex */
public final class WebResourcePool {

    /* JADX INFO: renamed from: a */
    private static LruCache<String, WorkerResourceHashMap> f14009a;

    public enum WebResourceLifecycle {
        ONCE,
        WORKER
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.WebResourcePool$a */
    public static class C3925a extends LruCache<String, WorkerResourceHashMap> {
        public C3925a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, WorkerResourceHashMap workerResourceHashMap) {
            return workerResourceHashMap.sizeOf();
        }
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.WebResourcePool$b */
    public static abstract class AbstractC3926b<T> {

        /* JADX INFO: renamed from: a */
        private String f14010a;

        /* JADX INFO: renamed from: b */
        private T f14011b;

        /* JADX INFO: renamed from: c */
        private final String f14012c;

        /* JADX INFO: renamed from: d */
        private int f14013d = 0;

        /* JADX INFO: renamed from: e */
        private WebResourceLifecycle f14014e = WebResourceLifecycle.ONCE;

        /* JADX INFO: renamed from: f */
        private int f14015f = 0;

        public AbstractC3926b(String str, String str2, String str3, JSONObject jSONObject) {
            this.f14010a = str;
            this.f14012c = WebResourcePool.m19406f(str2, str3, jSONObject);
        }

        /* JADX INFO: renamed from: e */
        private int m19414e() {
            return this.f14015f + 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public int m19415m() {
            if (WebResourcePool.m19402b(MWCConstants$WebResourceCache.LRUCacheMode.RESOURCE)) {
                return 1;
            }
            return m19414e();
        }

        /* JADX INFO: renamed from: n */
        private void m19416n() {
            this.f14015f = mo19417d(this.f14011b) + this.f14012c.getBytes(StandardCharsets.UTF_8).length;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo19417d(T t);

        /* JADX INFO: renamed from: f */
        public String m19418f() {
            return this.f14012c;
        }

        /* JADX INFO: renamed from: g */
        public T m19419g() {
            return this.f14011b;
        }

        /* JADX INFO: renamed from: h */
        public int m19420h() {
            return this.f14013d;
        }

        /* JADX INFO: renamed from: i */
        public String m19421i() {
            return this.f14010a;
        }

        /* JADX INFO: renamed from: j */
        public void m19422j(WebResourceLifecycle webResourceLifecycle) {
            this.f14014e = webResourceLifecycle;
        }

        /* JADX INFO: renamed from: k */
        public void m19423k(T t) {
            this.f14011b = t;
            if (WebResourcePool.m19402b(MWCConstants$WebResourceCache.LRUCacheMode.MEMORY)) {
                m19416n();
            }
        }

        /* JADX INFO: renamed from: l */
        public void m19424l(int i) {
            this.f14013d = i;
        }
    }

    static {
        m19405e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m19402b(MWCConstants$WebResourceCache.LRUCacheMode lRUCacheMode) {
        return MWCConstants$WebResourceCache.f13994a == lRUCacheMode;
    }

    /* JADX INFO: renamed from: c */
    public static <T> boolean m19403c(String str, String str2) {
        WorkerResourceHashMap workerResourceHashMap;
        if (f14009a == null || TextUtils.isEmpty(str) || (workerResourceHashMap = f14009a.get(str)) == null) {
            return false;
        }
        return workerResourceHashMap.containsInKey(str2);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <T> AbstractC3926b<T> m19404d(String str, String str2) {
        WorkerResourceHashMap workerResourceHashMap;
        AbstractC3926b<T> abstractC3926b;
        if (f14009a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (workerResourceHashMap = f14009a.get(str)) == null || (abstractC3926b = workerResourceHashMap.get(str2)) == null) {
            return null;
        }
        synchronized (abstractC3926b) {
            if (((AbstractC3926b) abstractC3926b).f14013d == 0) {
                try {
                    MWCEngine.m19380k("WebResourcePool", str, "getWebResource::wait @workerId=%s, @key=%s", str, str2);
                    abstractC3926b.wait(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                } catch (InterruptedException e) {
                    MWCEngine.m19382m("WebResourcePool", str, "getWebResource::wait InterruptedException @error=%s", e);
                }
            }
        }
        if (WebResourceLifecycle.ONCE == ((AbstractC3926b) abstractC3926b).f14014e) {
            m19408h(str, str2);
        }
        return abstractC3926b;
    }

    /* JADX INFO: renamed from: e */
    private static synchronized void m19405e() {
        try {
            f14009a = m19402b(MWCConstants$WebResourceCache.LRUCacheMode.MEMORY) ? new C3925a(16777216) : new LruCache<>(64);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m19406f(String str, String str2, JSONObject jSONObject) {
        return str2 + "@" + str + "@" + zsi0.m220034a(jSONObject).toString();
    }

    /* JADX INFO: renamed from: g */
    public static void m19407g(String str) {
        m19408h(str, null);
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m19408h(String str, @Nullable String str2) {
        if (f14009a == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            synchronized (f14009a) {
                f14009a.remove(str);
            }
            MWCEngine.m19361D("WebResourcePool", str, "[移除Web容器中指定Worker下的所有缓存]remove::workerResources @workerId=%s, @available=%s", str, f14009a);
            return;
        }
        WorkerResourceHashMap workerResourceHashMap = f14009a.get(str);
        if (workerResourceHashMap != null) {
            workerResourceHashMap.remove(str2);
            MWCEngine.m19361D("WebResourcePool", str, "[移除Web容器中指定Key的单个缓存]remove::webResource @key=%s, @available=%s", str2, workerResourceHashMap.keySet());
        }
    }

    /* JADX INFO: renamed from: i */
    public static <T> boolean m19409i(AbstractC3926b<T> abstractC3926b) {
        if (f14009a == null || abstractC3926b == null) {
            return false;
        }
        String strM19418f = abstractC3926b.m19418f();
        String strM19421i = abstractC3926b.m19421i();
        if (TextUtils.isEmpty(strM19418f) || TextUtils.isEmpty(strM19421i)) {
            return false;
        }
        synchronized (f14009a) {
            try {
                WorkerResourceHashMap workerResourceHashMap = f14009a.get(strM19421i);
                if (workerResourceHashMap == null) {
                    WorkerResourceHashMap workerResourceHashMap2 = new WorkerResourceHashMap(null);
                    workerResourceHashMap2.put(strM19418f, abstractC3926b);
                    f14009a.put(strM19421i, workerResourceHashMap2);
                } else {
                    workerResourceHashMap.put(strM19418f, abstractC3926b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MWCEngine.m19380k("WebResourcePool", strM19421i, "set:empty:response:WebResource @key=%s, @webResource=%s", strM19418f, abstractC3926b);
        return true;
    }

    public static class WorkerResourceHashMap<T> extends ConcurrentHashMap<String, AbstractC3926b<T>> {
        private WorkerResourceHashMap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean containsInKey(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.indexOf(str) > 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int sizeOf() {
            Iterator<Map.Entry<String, AbstractC3926b<T>>> it = entrySet().iterator();
            int iM19415m = 0;
            while (it.hasNext()) {
                AbstractC3926b<T> value = it.next().getValue();
                if (value != null && value.m19419g() != null) {
                    iM19415m += value.m19415m();
                }
            }
            return iM19415m;
        }

        public /* synthetic */ WorkerResourceHashMap(C3925a c3925a) {
            this();
        }
    }
}
