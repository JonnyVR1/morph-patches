package p153l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class sgt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f168558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f168559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f168560c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ugt0 f168561d;

    public sgt0(ugt0 ugt0Var, String str, String str2, long j) {
        this.f168558a = str;
        this.f168559b = str2;
        this.f168560c = j;
        this.f168561d = ugt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f168558a);
        map.put("cachedSrc", this.f168559b);
        map.put("totalDuration", Long.toString(this.f168560c));
        ugt0.m195941f(this.f168561d, "onPrecacheEvent", map);
    }
}
