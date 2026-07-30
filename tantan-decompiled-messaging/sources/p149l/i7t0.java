package p149l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class i7t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f111940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f111941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f111942c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f111943d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ o7t0 f111944e;

    public i7t0(o7t0 o7t0Var, String str, String str2, int i, int i2, boolean z) {
        this.f111940a = str;
        this.f111941b = str2;
        this.f111942c = i;
        this.f111943d = i2;
        this.f111944e = o7t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f111940a);
        map.put("cachedSrc", this.f111941b);
        map.put("bytesLoaded", Integer.toString(this.f111942c));
        map.put("totalBytes", Integer.toString(this.f111943d));
        map.put("cacheReady", "0");
        o7t0.m163062f(this.f111944e, "onPrecacheEvent", map);
    }
}
