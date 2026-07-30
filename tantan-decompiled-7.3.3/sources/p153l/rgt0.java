package p153l;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class rgt0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f163043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f163044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f163045c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ugt0 f163046d;

    public rgt0(ugt0 ugt0Var, String str, String str2, int i) {
        this.f163043a = str;
        this.f163044b = str2;
        this.f163045c = i;
        this.f163046d = ugt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f163043a);
        map.put("cachedSrc", this.f163044b);
        map.put("totalBytes", Integer.toString(this.f163045c));
        ugt0.m195941f(this.f163046d, "onPrecacheEvent", map);
    }
}
