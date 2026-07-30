package p153l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class qgt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f157460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f157461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f157462c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f157463d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f157464e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f157465f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f157466g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f157467h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f157468i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ugt0 f157469j;

    public qgt0(ugt0 ugt0Var, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f157460a = str;
        this.f157461b = str2;
        this.f157462c = i;
        this.f157463d = i2;
        this.f157464e = j;
        this.f157465f = j2;
        this.f157466g = z;
        this.f157467h = i3;
        this.f157468i = i4;
        this.f157469j = ugt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f157460a);
        map.put("cachedSrc", this.f157461b);
        map.put("bytesLoaded", Integer.toString(this.f157462c));
        map.put("totalBytes", Integer.toString(this.f157463d));
        map.put("bufferedDuration", Long.toString(this.f157464e));
        map.put("totalDuration", Long.toString(this.f157465f));
        map.put("cacheReady", true != this.f157466g ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f157467h));
        map.put("playerPreparedCount", Integer.toString(this.f157468i));
        ugt0.m195941f(this.f157469j, "onPrecacheEvent", map);
    }
}
