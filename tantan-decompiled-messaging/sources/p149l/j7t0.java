package p149l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class j7t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f116632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f116633b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f116634c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f116635d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f116636e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f116637f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f116638g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f116639h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f116640i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f116641j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ o7t0 f116642k;

    public j7t0(o7t0 o7t0Var, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f116632a = str;
        this.f116633b = str2;
        this.f116634c = j;
        this.f116635d = j2;
        this.f116636e = j3;
        this.f116637f = j4;
        this.f116638g = j5;
        this.f116639h = z;
        this.f116640i = i;
        this.f116641j = i2;
        this.f116642k = o7t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f116632a);
        map.put("cachedSrc", this.f116633b);
        map.put("bufferedDuration", Long.toString(this.f116634c));
        map.put("totalDuration", Long.toString(this.f116635d));
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f116636e));
            map.put("qoeCachedBytes", Long.toString(this.f116637f));
            map.put("totalBytes", Long.toString(this.f116638g));
            map.put("reportTime", Long.toString(vny0.m199064b().currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f116639h ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f116640i));
        map.put("playerPreparedCount", Integer.toString(this.f116641j));
        o7t0.m163062f(this.f116642k, "onPrecacheEvent", map);
    }
}
