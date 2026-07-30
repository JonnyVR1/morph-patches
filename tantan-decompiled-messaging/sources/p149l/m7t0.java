package p149l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class m7t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f132486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f132487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f132488c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ o7t0 f132489d;

    public m7t0(o7t0 o7t0Var, String str, String str2, long j) {
        this.f132486a = str;
        this.f132487b = str2;
        this.f132488c = j;
        this.f132489d = o7t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f132486a);
        map.put("cachedSrc", this.f132487b);
        map.put("totalDuration", Long.toString(this.f132488c));
        o7t0.m163062f(this.f132489d, "onPrecacheEvent", map);
    }
}
