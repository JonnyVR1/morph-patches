package p149l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class l7t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f126747a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f126748b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f126749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o7t0 f126750d;

    public l7t0(o7t0 o7t0Var, String str, String str2, int i) {
        this.f126747a = str;
        this.f126748b = str2;
        this.f126749c = i;
        this.f126750d = o7t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f126747a);
        map.put("cachedSrc", this.f126748b);
        map.put("totalBytes", Integer.toString(this.f126749c));
        o7t0.m163062f(this.f126750d, "onPrecacheEvent", map);
    }
}
