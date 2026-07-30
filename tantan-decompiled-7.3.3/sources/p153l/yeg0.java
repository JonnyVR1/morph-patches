package p153l;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class yeg0 {

    /* JADX INFO: renamed from: a */
    public long f199346a;

    /* JADX INFO: renamed from: a */
    public final synchronized void m215411a(long j) {
        if (this.f199346a == 0) {
            this.f199346a = SystemClock.uptimeMillis();
        }
    }
}
