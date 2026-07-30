package p153l;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ffg0 {

    /* JADX INFO: renamed from: a */
    public final long f98765a;

    /* JADX INFO: renamed from: b */
    public long f98766b;

    /* JADX INFO: renamed from: c */
    public final kzg0 f98767c;

    /* JADX INFO: renamed from: e */
    public boolean f98769e;

    /* JADX INFO: renamed from: d */
    public final Handler f98768d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f */
    public final long f98770f = 100;

    /* JADX INFO: renamed from: g */
    public final qwg0 f98771g = new qwg0(this);

    public ffg0(long j, dhg0 dhg0Var) {
        this.f98765a = j;
        this.f98767c = dhg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m125371a() {
        this.f98768d.removeCallbacks(this.f98771g);
        this.f98768d.postDelayed(this.f98771g, this.f98770f);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m125372b() {
        this.f98769e = true;
        this.f98766b = this.f98765a;
        m125371a();
    }
}
