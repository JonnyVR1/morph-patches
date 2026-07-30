package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import p149l.by00;
import p149l.i5e;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class RealtimeSinceBootClock implements by00 {
    private static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @i5e
    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p149l.by00
    public long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p149l.by00
    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }
}
