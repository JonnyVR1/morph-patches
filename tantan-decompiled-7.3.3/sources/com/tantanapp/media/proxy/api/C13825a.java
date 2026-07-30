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
import p153l.dtd0;
import p153l.l7b0;
import p153l.oyi0;

/* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13825a {

    /* JADX INFO: renamed from: i */
    public static int f56988i = 2;

    /* JADX INFO: renamed from: j */
    public static long f56989j = 0;

    /* JADX INFO: renamed from: k */
    public static long f56990k = 500;

    /* JADX INFO: renamed from: l */
    public static long f56991l = 614400;

    /* JADX INFO: renamed from: m */
    public static boolean f56992m = true;

    /* JADX INFO: renamed from: n */
    public static String f56993n;

    /* JADX INFO: renamed from: o */
    public static volatile C13825a f56994o;

    /* JADX INFO: renamed from: b */
    public boolean f56996b;

    /* JADX INFO: renamed from: c */
    public long f56997c;

    /* JADX INFO: renamed from: d */
    public TTMediaProxy f56998d;

    /* JADX INFO: renamed from: a */
    public String f56995a = "TTMediaPreLoader";

    /* JADX INFO: renamed from: e */
    public Map<Uri, Integer> f56999e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public LinkedList<Uri> f57000f = new LinkedList<>();

    /* JADX INFO: renamed from: g */
    public List<e> f57001g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public Runnable f57002h = new d();

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                dtd0.m117850a(C13825a.this.f56995a, "ijk begin clean cache :" + C13825a.f56990k);
                C13825a.this.f56998d.proxyClearCache();
                dtd0.m117850a(C13825a.this.f56995a, "ijk end clean cache");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$b */
    public class b implements TTMediaProxy.InterfaceC13823a {
        public b() {
        }

        @Override // com.tantanapp.media.proxy.api.TTMediaProxy.InterfaceC13823a
        /* JADX INFO: renamed from: a */
        public void mo82540a(int i, int i2, String str, String str2, String str3, long j, PreloadTaskInfo preloadTaskInfo) {
            if (str != null) {
                C13825a.this.f56999e.remove(Uri.parse(str));
                C13825a.this.m82568y(preloadTaskInfo);
                C13825a.this.m82565v(i2, str, str2, j, preloadTaskInfo);
            }
        }

        @Override // com.tantanapp.media.proxy.api.TTMediaProxy.InterfaceC13823a
        /* JADX INFO: renamed from: b */
        public void mo82541b(int i, String str, String str2, String str3, long j, PreloadTaskInfo preloadTaskInfo) {
            if (str != null) {
                Uri uri = Uri.parse(str);
                if (preloadTaskInfo.mEndReasonCode != 6) {
                    C13825a.this.f56999e.remove(uri);
                }
                C13825a.this.m82568y(preloadTaskInfo);
                C13825a.this.m82564u(i, str, str2, j, preloadTaskInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$c */
    public class c implements TTMediaProxy.InterfaceC13824b {
        public c() {
        }

        @Override // com.tantanapp.media.proxy.api.TTMediaProxy.InterfaceC13824b
        /* JADX INFO: renamed from: a */
        public void mo82542a(String str) {
            String unused = C13825a.this.f56995a;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l7b0.m153114a(C13825a.this.f56995a);
            if (C13825a.this.f57000f.isEmpty()) {
                return;
            }
            if (C13825a.this.f56999e.size() < C13825a.f56988i) {
                int size = C13825a.f56988i - C13825a.this.f56999e.size();
                synchronized (C13825a.this.f57000f) {
                    try {
                        int size2 = C13825a.this.f57000f.size();
                        for (int i = 0; i < Math.min(size, size2); i++) {
                            Uri uri = (Uri) C13825a.this.f57000f.remove();
                            if (uri != null) {
                                C13825a.this.m82555A(uri, C13825a.f56991l);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (C13825a.this.f57000f.isEmpty()) {
                return;
            }
            l7b0.m153116c(C13825a.this.f56995a, this, 500L);
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.media.proxy.api.a$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo82570a(String str, long j, PreloadTaskInfo preloadTaskInfo);

        /* JADX INFO: renamed from: b */
        void mo82571b(String str, long j, PreloadTaskInfo preloadTaskInfo);
    }

    public C13825a() {
        m82561r();
        this.f56996b = f56992m;
        long j = f56989j;
        this.f56997c = j;
        if (j > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            this.f56997c = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m82553n(int i, long j, long j2, long j3, boolean z) {
        if (i >= 0) {
            f56988i = i;
        }
        if (j >= 0) {
            f56989j = j;
        }
        if (j2 >= 0) {
            f56991l = j2;
        }
        if (j3 >= 0) {
            f56990k = j3;
        }
        f56992m = z;
    }

    /* JADX INFO: renamed from: p */
    public static C13825a m82554p() {
        if (f56994o == null) {
            synchronized (C13825a.class) {
                try {
                    if (f56994o == null) {
                        f56994o = new C13825a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f56994o;
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m82555A(Uri uri, long j) {
        int iProxyAddPreloadTaskWithPreloadDuration;
        if (m82562s(uri) > 0) {
            return;
        }
        if (!this.f56999e.containsKey(uri) && !this.f57000f.contains(uri)) {
            if (this.f56999e.size() >= f56988i) {
                synchronized (this.f57000f) {
                    this.f57000f.add(uri);
                }
                l7b0.m153116c(this.f56995a, this.f57002h, 500L);
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
            iProxyAddPreloadTaskWithPreloadDuration = this.f56998d.proxyAddPreloadTaskWithPreloadDuration(uri.toString(), str, 0L, j, this.f56997c, null, 2, 5000000L, this.f56998d.proxyGenerateSession());
            if (iProxyAddPreloadTaskWithPreloadDuration > 0) {
                this.f56999e.put(uri, Integer.valueOf(iProxyAddPreloadTaskWithPreloadDuration));
            }
            return;
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m82556k(e eVar) {
        if (eVar != null) {
            this.f57001g.add(eVar);
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m82557l() {
        try {
            if (this.f56996b) {
                if (this.f56999e.keySet() == null) {
                    return;
                }
                TTMediaProxy tTMediaProxy = this.f56998d;
                if (tTMediaProxy != null) {
                    tTMediaProxy.proxyClearAllPreloadTask();
                }
                this.f57000f.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m82558m() {
        if (this.f56998d != null) {
            m82563t();
            this.f56998d.proxyClearAllCache();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m82559o(String str) {
        if (this.f56998d != null) {
            m82563t();
            this.f56998d.proxyClearCacheWithKey(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public String m82560q(String str) {
        if (this.f56998d == null) {
            return str;
        }
        return this.f56998d.proxySwitchPlayURL(str, Uri.parse(str).getPath(), null);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m82561r() {
        if (this.f56998d == null && f56993n != null) {
            TTMediaProxy tTMediaProxy = new TTMediaProxy();
            this.f56998d = tTMediaProxy;
            tTMediaProxy.proxyInit(f56993n, StringUtil.ALL_INTERFACES, ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED, 5, 5);
            this.f56998d.proxyUpdatePlayerPreloadSize(PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
            this.f56998d.proxyHttpServerStart();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cache_max_limit_size", f56990k);
                this.f56998d.proxySetConfig(jSONObject.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            oyi0.m169869b(2, new a());
            try {
                this.f56998d.setOnPreloadTaskCompleteListener(new b());
                this.f56998d.setProxyServerResultListener(new c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public int m82562s(Uri uri) {
        try {
            return this.f56998d.proxyCheckCacheExist(uri.getPath());
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m82563t() {
        if (this.f56996b) {
            for (Map.Entry<Uri, Integer> entry : this.f56999e.entrySet()) {
                entry.getKey();
                entry.getValue().getClass();
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m82564u(int i, String str, String str2, long j, PreloadTaskInfo preloadTaskInfo) {
        Iterator<e> it = this.f57001g.iterator();
        while (it.hasNext()) {
            it.next().mo82571b(str, j, preloadTaskInfo);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m82565v(int i, String str, String str2, long j, PreloadTaskInfo preloadTaskInfo) {
        Iterator<e> it = this.f57001g.iterator();
        while (it.hasNext()) {
            it.next().mo82570a(str, j, preloadTaskInfo);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m82566w(Uri uri, long j) {
        synchronized (this.f57000f) {
            this.f57000f.clear();
        }
        try {
            m82555A(uri, j);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: x */
    public void m82567x(List<String> list) {
        synchronized (this.f57000f) {
            this.f57000f.clear();
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                m82555A(Uri.parse(it.next()), f56991l);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m82568y(PreloadTaskInfo preloadTaskInfo) {
        dtd0.m117850a(this.f56995a, preloadTaskInfo.toJsonString());
        dtd0.m117850a(this.f56995a, "Session = " + preloadTaskInfo.mSessionID);
        dtd0.m117850a(this.f56995a, "TaskEndReasonCode = " + preloadTaskInfo.mEndReasonCode);
        dtd0.m117850a(this.f56995a, "TaskEndReason = " + preloadTaskInfo.mEndReasonStr);
        dtd0.m117850a(this.f56995a, "TaskId = " + preloadTaskInfo.mTaskId);
        dtd0.m117850a(this.f56995a, "URL = " + preloadTaskInfo.mUrl);
        dtd0.m117850a(this.f56995a, "Key = " + preloadTaskInfo.mKey);
        dtd0.m117850a(this.f56995a, "Header = " + preloadTaskInfo.mHttpHeader);
        dtd0.m117850a(this.f56995a, "DNS Cost = " + preloadTaskInfo.mDnsUsedTime);
        dtd0.m117850a(this.f56995a, "Tcp connect Cost = " + preloadTaskInfo.mTcpConnectTime);
        dtd0.m117850a(this.f56995a, "Http header Cost = " + preloadTaskInfo.mHttpHeaderTime);
        dtd0.m117850a(this.f56995a, "First Packet Cost = " + preloadTaskInfo.mHttpBodyTime);
        dtd0.m117850a(this.f56995a, "Http Code = " + preloadTaskInfo.mHttpCode);
        dtd0.m117850a(this.f56995a, "CDN IP = " + preloadTaskInfo.mCdnIp);
        dtd0.m117850a(this.f56995a, "DNS Servers = " + preloadTaskInfo.mDNSServers);
        dtd0.m117850a(this.f56995a, "Range size = " + preloadTaskInfo.mDnsUsedTime);
        dtd0.m117850a(this.f56995a, "Downloaded Size = " + preloadTaskInfo.mDownloadedSize);
        dtd0.m117850a(this.f56995a, "Downloaded Duration = " + preloadTaskInfo.mDownloadedDuration);
        dtd0.m117850a(this.f56995a, "Task add timestamp = " + preloadTaskInfo.mAddTimestamp);
        dtd0.m117850a(this.f56995a, "Task wait time = " + preloadTaskInfo.mWaitTime);
        dtd0.m117850a(this.f56995a, "Task use cost = " + preloadTaskInfo.mUsedTime);
        dtd0.m117850a(this.f56995a, "Download ByteRate = " + preloadTaskInfo.mAverageRate);
    }

    /* JADX INFO: renamed from: z */
    public void m82569z(String str, long j) {
        f56990k = j;
        f56993n = str;
        m82561r();
    }
}
