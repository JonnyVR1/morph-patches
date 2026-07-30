package p149l;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class kxv {

    /* JADX INFO: renamed from: a */
    private static final double f125156a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: a */
    public static double m147807a(long j) {
        return (m147808b() - j) * f125156a;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public static long m147808b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
