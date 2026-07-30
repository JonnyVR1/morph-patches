package p149l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class q6g0 {

    /* JADX INFO: renamed from: a */
    public long f152907a;

    /* JADX INFO: renamed from: a */
    public final synchronized void m173129a(long j) {
        if (this.f152907a == 0) {
            this.f152907a = SystemClock.uptimeMillis();
        }
    }
}
