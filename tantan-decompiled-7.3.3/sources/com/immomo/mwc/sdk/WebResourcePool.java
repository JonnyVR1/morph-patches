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
import p153l.d2j0;

/* JADX INFO: loaded from: classes7.dex */
public final class WebResourcePool {

    /* JADX INFO: renamed from: a */
    private static LruCache<String, WorkerResourceHashMap> f14703a;

    public enum WebResourceLifecycle {
        ONCE,
        WORKER
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.WebResourcePool$a */
    public static class C4068a extends LruCache<String, WorkerResourceHashMap> {
        public C4068a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, WorkerResourceHashMap workerResourceHashMap) {
            return workerResourceHashMap.sizeOf();
        }
    }

    /* JADX INFO: renamed from: com.immomo.mwc.sdk.WebResourcePool$b */
    public static abstract class AbstractC4069b<T> {

        /* JADX INFO: renamed from: a */
        private String f14704a;

        /* JADX INFO: renamed from: b */
        private T f14705b;

        /* JADX INFO: renamed from: c */
        private final String f14706c;

        /* JADX INFO: renamed from: d */
        private int f14707d = 0;

        /* JADX INFO: renamed from: e */
        private WebResourceLifecycle f14708e = WebResourceLifecycle.ONCE;

        /* JADX INFO: renamed from: f */
        private int f14709f = 0;

        public AbstractC4069b(String str, String str2, String str3, JSONObject jSONObject) {
            this.f14704a = str;
            this.f14706c = WebResourcePool.m20386f(str2, str3, jSONObject);
        }

        /* JADX INFO: renamed from: e */
        private int m20394e() {
            return this.f14709f + 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: m */
        public int m20395m() {
            if (WebResourcePool.m20382b(MWCConstants$WebResourceCache.LRUCacheMode.RESOURCE)) {
                return 1;
            }
            return m20394e();
        }

        /* JADX INFO: renamed from: n */
        private void m20396n() {
            this.f14709f = mo20397d(this.f14705b) + this.f14706c.getBytes(StandardCharsets.UTF_8).length;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo20397d(T t);

        /* JADX INFO: renamed from: f */
        public String m20398f() {
            return this.f14706c;
        }

        /* JADX INFO: renamed from: g */
        public T m20399g() {
            return this.f14705b;
        }

        /* JADX INFO: renamed from: h */
        public int m20400h() {
            return this.f14707d;
        }

        /* JADX INFO: renamed from: i */
        public String m20401i() {
            return this.f14704a;
        }

        /* JADX INFO: renamed from: j */
        public void m20402j(WebResourceLifecycle webResourceLifecycle) {
            this.f14708e = webResourceLifecycle;
        }

        /* JADX INFO: renamed from: k */
        public void m20403k(T t) {
            this.f14705b = t;
            if (WebResourcePool.m20382b(MWCConstants$WebResourceCache.LRUCacheMode.MEMORY)) {
                m20396n();
            }
        }

        /* JADX INFO: renamed from: l */
        public void m20404l(int i) {
            this.f14707d = i;
        }
    }

    static {
        m20385e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m20382b(MWCConstants$WebResourceCache.LRUCacheMode lRUCacheMode) {
        return MWCConstants$WebResourceCache.f14688a == lRUCacheMode;
    }

    /* JADX INFO: renamed from: c */
    public static <T> boolean m20383c(String str, String str2) {
        WorkerResourceHashMap workerResourceHashMap;
        if (f14703a == null || TextUtils.isEmpty(str) || (workerResourceHashMap = f14703a.get(str)) == null) {
            return false;
        }
        return workerResourceHashMap.containsInKey(str2);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static <T> AbstractC4069b<T> m20384d(String str, String str2) {
        WorkerResourceHashMap workerResourceHashMap;
        AbstractC4069b<T> abstractC4069b;
        if (f14703a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (workerResourceHashMap = f14703a.get(str)) == null || (abstractC4069b = workerResourceHashMap.get(str2)) == null) {
            return null;
        }
        synchronized (abstractC4069b) {
            if (((AbstractC4069b) abstractC4069b).f14707d == 0) {
                try {
                    MWCEngine.m20360k("WebResourcePool", str, "getWebResource::wait @workerId=%s, @key=%s", str, str2);
                    abstractC4069b.wait(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                } catch (InterruptedException e) {
                    MWCEngine.m20362m("WebResourcePool", str, "getWebResource::wait InterruptedException @error=%s", e);
                }
            }
        }
        if (WebResourceLifecycle.ONCE == ((AbstractC4069b) abstractC4069b).f14708e) {
            m20388h(str, str2);
        }
        return abstractC4069b;
    }

    /* JADX INFO: renamed from: e */
    private static synchronized void m20385e() {
        try {
            f14703a = m20382b(MWCConstants$WebResourceCache.LRUCacheMode.MEMORY) ? new C4068a(16777216) : new LruCache<>(64);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m20386f(String str, String str2, JSONObject jSONObject) {
        return str2 + "@" + str + "@" + d2j0.m113702a(jSONObject).toString();
    }

    /* JADX INFO: renamed from: g */
    public static void m20387g(String str) {
        m20388h(str, null);
    }

    /* JADX INFO: renamed from: h */
    public static <T> void m20388h(String str, @Nullable String str2) {
        if (f14703a == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            synchronized (f14703a) {
                f14703a.remove(str);
            }
            MWCEngine.m20341D("WebResourcePool", str, "[移除Web容器中指定Worker下的所有缓存]remove::workerResources @workerId=%s, @available=%s", str, f14703a);
            return;
        }
        WorkerResourceHashMap workerResourceHashMap = f14703a.get(str);
        if (workerResourceHashMap != null) {
            workerResourceHashMap.remove(str2);
            MWCEngine.m20341D("WebResourcePool", str, "[移除Web容器中指定Key的单个缓存]remove::webResource @key=%s, @available=%s", str2, workerResourceHashMap.keySet());
        }
    }

    /* JADX INFO: renamed from: i */
    public static <T> boolean m20389i(AbstractC4069b<T> abstractC4069b) {
        if (f14703a == null || abstractC4069b == null) {
            return false;
        }
        String strM20398f = abstractC4069b.m20398f();
        String strM20401i = abstractC4069b.m20401i();
        if (TextUtils.isEmpty(strM20398f) || TextUtils.isEmpty(strM20401i)) {
            return false;
        }
        synchronized (f14703a) {
            try {
                WorkerResourceHashMap workerResourceHashMap = f14703a.get(strM20401i);
                if (workerResourceHashMap == null) {
                    WorkerResourceHashMap workerResourceHashMap2 = new WorkerResourceHashMap(null);
                    workerResourceHashMap2.put(strM20398f, abstractC4069b);
                    f14703a.put(strM20401i, workerResourceHashMap2);
                } else {
                    workerResourceHashMap.put(strM20398f, abstractC4069b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        MWCEngine.m20360k("WebResourcePool", strM20401i, "set:empty:response:WebResource @key=%s, @webResource=%s", strM20398f, abstractC4069b);
        return true;
    }

    public static class WorkerResourceHashMap<T> extends ConcurrentHashMap<String, AbstractC4069b<T>> {
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
            Iterator<Map.Entry<String, AbstractC4069b<T>>> it = entrySet().iterator();
            int iM20395m = 0;
            while (it.hasNext()) {
                AbstractC4069b<T> value = it.next().getValue();
                if (value != null && value.m20399g() != null) {
                    iM20395m += value.m20395m();
                }
            }
            return iM20395m;
        }

        public /* synthetic */ WorkerResourceHashMap(C4068a c4068a) {
            this();
        }
    }
}
