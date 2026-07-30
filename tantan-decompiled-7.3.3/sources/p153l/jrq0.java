package p153l;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class jrq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Handler f122399a;

    /* JADX INFO: renamed from: b */
    private final long f122400b;

    /* JADX INFO: renamed from: c */
    private final long f122401c;

    public jrq0(Handler handler, long j, long j2) {
        this.f122399a = handler;
        this.f122400b = j;
        this.f122401c = j2;
    }

    /* JADX INFO: renamed from: a */
    public void m146814a() {
        long jM146816c = m146816c();
        Handler handler = this.f122399a;
        if (jM146816c > 0) {
            handler.postDelayed(this, m146816c());
        } else {
            handler.post(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m146815b(long j) {
        Handler handler = this.f122399a;
        if (j > 0) {
            handler.postDelayed(this, j);
        } else {
            handler.post(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public long m146816c() {
        return this.f122400b;
    }

    /* JADX INFO: renamed from: d */
    public long m146817d() {
        return this.f122401c;
    }
}
