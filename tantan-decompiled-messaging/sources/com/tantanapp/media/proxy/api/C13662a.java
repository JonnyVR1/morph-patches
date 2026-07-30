package com.tantanapp.media.proxy.api;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ald0;
import p149l.hza0;
import p149l.lpi0;

/* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13662a {

    /* JADX INFO: renamed from: i */
    public static int f56140i = 2;

    /* JADX INFO: renamed from: j */
    public static long f56141j = 0;

    /* JADX INFO: renamed from: k */
    public static long f56142k = 500;

    /* JADX INFO: renamed from: l */
    public static long f56143l = 614400;

    /* JADX INFO: renamed from: m */
    public static boolean f56144m = true;

    /* JADX INFO: renamed from: n */
    public static String f56145n;

    /* JADX INFO: renamed from: o */
    public static volatile C13662a f56146o;

    /* JADX INFO: renamed from: b */
    public boolean f56148b;

    /* JADX INFO: renamed from: c */
    public long f56149c;

    /* JADX INFO: renamed from: d */
    public TTMediaProxy f56150d;

    /* JADX INFO: renamed from: a */
    public String f56147a = "TTMediaPreLoader";

    /* JADX INFO: renamed from: e */
    public Map<Uri, Integer> f56151e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public LinkedList<Uri> f56152f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public List<e> f56153g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public Runnable f56154h = new d();

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ald0.m97278a(C13662a.this.f56147a, "ijk begin clean cache :" + C13662a.f56142k);
                C13662a.this.f56150d.proxyClearCache();
                ald0.m97278a(C13662a.this.f56147a, "ijk end clean cache");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$b */
    public class b implements TTMediaProxy.InterfaceC13660a {
        public b() {
        }

        @Override // com.tantanapp.media.proxy.api.TTMediaProxy.InterfaceC13660a
        /* JADX INFO: renamed from: a */
        public void mo81357a(int i, int i2, String str, String str2, String str3, long j, PreloadTaskInfo preloadTaskInfo) {
            if (str != null) {
                C13662a.this.f56151e.remove(Uri.parse(str));
                C13662a.this.m81385y(preloadTaskInfo);
                C13662a.this.m81382v(i2, str, str2, j, preloadTaskInfo);
            }
        }

        @Override // com.tantanapp.media.proxy.api.TTMediaProxy.InterfaceC13660a
        /* JADX INFO: renamed from: b */
        public void mo81358b(int i, String str, String str2, String str3, long j, PreloadTaskInfo preloadTaskInfo) {
            if (str != null) {
                Uri uri = Uri.parse(str);
                if (preloadTaskInfo.mEndReasonCode != 6) {
                    C13662a.this.f56151e.remove(uri);
                }
                C13662a.this.m81385y(preloadTaskInfo);
                C13662a.this.m81381u(i, str, str2, j, preloadTaskInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$c */
    public class c implements TTMediaProxy.InterfaceC13661b {
        public c() {
        }

        @Override // com.tantanapp.media.proxy.api.TTMediaProxy.InterfaceC13661b
        /* JADX INFO: renamed from: a */
        public void mo81359a(String str) {
            String unused = C13662a.this.f56147a;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hza0.m133664a(C13662a.this.f56147a);
            if (C13662a.this.f56152f.isEmpty()) {
                return;
            }
            if (C13662a.this.f56151e.size() < C13662a.f56140i) {
                int size = C13662a.f56140i - C13662a.this.f56151e.size();
                synchronized (C13662a.this.f56152f) {
                    try {
                        int size2 = C13662a.this.f56152f.size();
                        for (int i = 0; i < Math.min(size, size2); i++) {
                            Uri uri = (Uri) C13662a.this.f56152f.remove();
                            if (uri != null) {
                                C13662a.this.m81372A(uri, C13662a.f56143l);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (C13662a.this.f56152f.isEmpty()) {
                return;
            }
            hza0.m133666c(C13662a.this.f56147a, this, 500L);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo81387a(String str, long j, PreloadTaskInfo preloadTaskInfo);

        /* JADX INFO: renamed from: b */
        void mo81388b(String str, long j, PreloadTaskInfo preloadTaskInfo);
    }

    public C13662a() {
        m81378r();
        this.f56148b = f56144m;
        long j = f56141j;
        this.f56149c = j;
        if (j > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f56149c = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m81370n(int i, long j, long j2, long j3, boolean z) {
        if (i >= 0) {
            f56140i = i;
        }
        if (j >= 0) {
            f56141j = j;
        }
        if (j2 >= 0) {
            f56143l = j2;
        }
        if (j3 >= 0) {
            f56142k = j3;
        }
        f56144m = z;
    }

    /* JADX INFO: renamed from: p */
    public static C13662a m81371p() {
        if (f56146o == null) {
            synchronized (C13662a.class) {
                try {
                    if (f56146o == null) {
                        f56146o = new C13662a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f56146o;
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m81372A(Uri uri, long j) {
        int iProxyAddPreloadTaskWithPreloadDuration;
        if (m81379s(uri) > 0) {
            return;
        }
        if (!this.f56151e.containsKey(uri) && !this.f56152f.contains(uri)) {
            if (this.f56151e.size() >= f56140i) {
                synchronized (this.f56152f) {
                    this.f56152f.add(uri);
                }
                hza0.m133666c(this.f56147a, this.f56154h, 500L);
                return;
            }
            String path = uri.getPath();
            if (path == null) {
                try {
                    path = uri.toString();
                } catch (Throwable th) {
                    th.printStackTrace();
                    iProxyAddPreloadTaskWithPreloadDuration = 0;
                }
            }
            String str = path;
            iProxyAddPreloadTaskWithPreloadDuration = this.f56150d.proxyAddPreloadTaskWithPreloadDuration(uri.toString(), str, 0L, j, this.f56149c, null, 2, 5000000L, this.f56150d.proxyGenerateSession());
            if (iProxyAddPreloadTaskWithPreloadDuration > 0) {
                this.f56151e.put(uri, Integer.valueOf(iProxyAddPreloadTaskWithPreloadDuration));
            }
            return;
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m81373k(e eVar) {
        if (eVar != null) {
            this.f56153g.add(eVar);
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m81374l() {
        try {
            if (this.f56148b) {
                if (this.f56151e.keySet() == null) {
                    return;
                }
                TTMediaProxy tTMediaProxy = this.f56150d;
                if (tTMediaProxy != null) {
                    tTMediaProxy.proxyClearAllPreloadTask();
                }
                this.f56152f.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m81375m() {
        if (this.f56150d != null) {
            m81380t();
            this.f56150d.proxyClearAllCache();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m81376o(String str) {
        if (this.f56150d != null) {
            m81380t();
            this.f56150d.proxyClearCacheWithKey(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public String m81377q(String str) {
        if (this.f56150d == null) {
            return str;
        }
        return this.f56150d.proxySwitchPlayURL(str, Uri.parse(str).getPath(), null);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m81378r() {
        if (this.f56150d == null && f56145n != null) {
            TTMediaProxy tTMediaProxy = new TTMediaProxy();
            this.f56150d = tTMediaProxy;
            tTMediaProxy.proxyInit(f56145n, StringUtil.ALL_INTERFACES, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, 5, 5);
            this.f56150d.proxyUpdatePlayerPreloadSize(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
            this.f56150d.proxyHttpServerStart();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cache_max_limit_size", f56142k);
                this.f56150d.proxySetConfig(jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            lpi0.m150872b(2, new a());
            try {
                this.f56150d.setOnPreloadTaskCompleteListener(new b());
                this.f56150d.setProxyServerResultListener(new c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public int m81379s(Uri uri) {
        try {
            return this.f56150d.proxyCheckCacheExist(uri.getPath());
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m81380t() {
        if (this.f56148b) {
            for (Map.Entry<Uri, Integer> entry : this.f56151e.entrySet()) {
                entry.getKey();
                entry.getValue().getClass();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m81381u(int i, String str, String str2, long j, PreloadTaskInfo preloadTaskInfo) {
        Iterator<e> it = this.f56153g.iterator();
        while (it.hasNext()) {
            it.next().mo81388b(str, j, preloadTaskInfo);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m81382v(int i, String str, String str2, long j, PreloadTaskInfo preloadTaskInfo) {
        Iterator<e> it = this.f56153g.iterator();
        while (it.hasNext()) {
            it.next().mo81387a(str, j, preloadTaskInfo);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m81383w(Uri uri, long j) {
        synchronized (this.f56152f) {
            this.f56152f.clear();
        }
        try {
            m81372A(uri, j);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m81384x(List<String> list) {
        synchronized (this.f56152f) {
            this.f56152f.clear();
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                m81372A(Uri.parse(it.next()), f56143l);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m81385y(PreloadTaskInfo preloadTaskInfo) {
        ald0.m97278a(this.f56147a, preloadTaskInfo.toJsonString());
        ald0.m97278a(this.f56147a, "Session = " + preloadTaskInfo.mSessionID);
        ald0.m97278a(this.f56147a, "TaskEndReasonCode = " + preloadTaskInfo.mEndReasonCode);
        ald0.m97278a(this.f56147a, "TaskEndReason = " + preloadTaskInfo.mEndReasonStr);
        ald0.m97278a(this.f56147a, "TaskId = " + preloadTaskInfo.mTaskId);
        ald0.m97278a(this.f56147a, "URL = " + preloadTaskInfo.mUrl);
        ald0.m97278a(this.f56147a, "Key = " + preloadTaskInfo.mKey);
        ald0.m97278a(this.f56147a, "Header = " + preloadTaskInfo.mHttpHeader);
        ald0.m97278a(this.f56147a, "DNS Cost = " + preloadTaskInfo.mDnsUsedTime);
        ald0.m97278a(this.f56147a, "Tcp connect Cost = " + preloadTaskInfo.mTcpConnectTime);
        ald0.m97278a(this.f56147a, "Http header Cost = " + preloadTaskInfo.mHttpHeaderTime);
        ald0.m97278a(this.f56147a, "First Packet Cost = " + preloadTaskInfo.mHttpBodyTime);
        ald0.m97278a(this.f56147a, "Http Code = " + preloadTaskInfo.mHttpCode);
        ald0.m97278a(this.f56147a, "CDN IP = " + preloadTaskInfo.mCdnIp);
        ald0.m97278a(this.f56147a, "DNS Servers = " + preloadTaskInfo.mDNSServers);
        ald0.m97278a(this.f56147a, "Range size = " + preloadTaskInfo.mDnsUsedTime);
        ald0.m97278a(this.f56147a, "Downloaded Size = " + preloadTaskInfo.mDownloadedSize);
        ald0.m97278a(this.f56147a, "Downloaded Duration = " + preloadTaskInfo.mDownloadedDuration);
        ald0.m97278a(this.f56147a, "Task add timestamp = " + preloadTaskInfo.mAddTimestamp);
        ald0.m97278a(this.f56147a, "Task wait time = " + preloadTaskInfo.mWaitTime);
        ald0.m97278a(this.f56147a, "Task use cost = " + preloadTaskInfo.mUsedTime);
        ald0.m97278a(this.f56147a, "Download ByteRate = " + preloadTaskInfo.mAverageRate);
    }

    /* JADX INFO: renamed from: z */
    public void m81386z(String str, long j) {
        f56142k = j;
        f56145n = str;
        m81378r();
    }
}
