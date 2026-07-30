package p153l;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class izv {

    /* JADX INFO: renamed from: a */
    private static final double f117761a = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: a */
    public static double m142878a(long j) {
        return (m142879b() - j) * f117761a;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public static long m142879b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
