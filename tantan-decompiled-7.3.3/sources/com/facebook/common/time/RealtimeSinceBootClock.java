package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p153l.l610;
import p153l.w6e;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class RealtimeSinceBootClock implements l610 {
    private static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @w6e
    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p153l.l610
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p153l.l610
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
