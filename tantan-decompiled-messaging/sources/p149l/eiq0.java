package p149l;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class eiq0 implements Runnable {

    /* JADX INFO: renamed from: a */
    private Handler f91625a;

    /* JADX INFO: renamed from: b */
    private final long f91626b;

    /* JADX INFO: renamed from: c */
    private final long f91627c;

    public eiq0(Handler handler, long j, long j2) {
        this.f91625a = handler;
        this.f91626b = j;
        this.f91627c = j2;
    }

    /* JADX INFO: renamed from: a */
    public void m116719a() {
        long jM116721c = m116721c();
        Handler handler = this.f91625a;
        if (jM116721c > 0) {
            handler.postDelayed(this, m116721c());
        } else {
            handler.post(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m116720b(long j) {
        Handler handler = this.f91625a;
        if (j > 0) {
            handler.postDelayed(this, j);
        } else {
            handler.post(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public long m116721c() {
        return this.f91626b;
    }

    /* JADX INFO: renamed from: d */
    public long m116722d() {
        return this.f91627c;
    }
}
