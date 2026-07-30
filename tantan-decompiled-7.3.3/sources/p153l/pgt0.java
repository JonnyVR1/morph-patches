package p153l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class pgt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f152327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f152328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f152329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f152330d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f152331e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f152332f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f152333g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f152334h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f152335i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f152336j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ugt0 f152337k;

    public pgt0(ugt0 ugt0Var, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f152327a = str;
        this.f152328b = str2;
        this.f152329c = j;
        this.f152330d = j2;
        this.f152331e = j3;
        this.f152332f = j4;
        this.f152333g = j5;
        this.f152334h = z;
        this.f152335i = i;
        this.f152336j = i2;
        this.f152337k = ugt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f152327a);
        map.put("cachedSrc", this.f152328b);
        map.put("bufferedDuration", Long.toString(this.f152329c));
        map.put("totalDuration", Long.toString(this.f152330d));
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f152331e));
            map.put("qoeCachedBytes", Long.toString(this.f152332f));
            map.put("totalBytes", Long.toString(this.f152333g));
            map.put("reportTime", Long.toString(bxy0.m106918b().currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f152334h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f152335i));
        map.put("playerPreparedCount", Integer.toString(this.f152336j));
        ugt0.m195941f(this.f152337k, "onPrecacheEvent", map);
    }
}
