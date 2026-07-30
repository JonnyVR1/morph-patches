package p149l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class k7t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f121625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f121626b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f121627c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f121628d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f121629e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f121630f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f121631g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f121632h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f121633i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ o7t0 f121634j;

    public k7t0(o7t0 o7t0Var, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f121625a = str;
        this.f121626b = str2;
        this.f121627c = i;
        this.f121628d = i2;
        this.f121629e = j;
        this.f121630f = j2;
        this.f121631g = z;
        this.f121632h = i3;
        this.f121633i = i4;
        this.f121634j = o7t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f121625a);
        map.put("cachedSrc", this.f121626b);
        map.put("bytesLoaded", Integer.toString(this.f121627c));
        map.put("totalBytes", Integer.toString(this.f121628d));
        map.put("bufferedDuration", Long.toString(this.f121629e));
        map.put("totalDuration", Long.toString(this.f121630f));
        map.put("cacheReady", true != this.f121631g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f121632h));
        map.put("playerPreparedCount", Integer.toString(this.f121633i));
        o7t0.m163062f(this.f121634j, "onPrecacheEvent", map);
    }
}
