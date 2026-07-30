package com.facebook.common.time;

import p149l.cy00;
import p149l.i5e;

/* JADX INFO: loaded from: classes.dex */
@i5e
public class AwakeTimeSinceBootClock implements cy00 {

    @i5e
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @i5e
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p149l.cy00, p149l.by00
    @i5e
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // p149l.cy00, p149l.by00
    @i5e
    public long nowNanos() {
        return System.nanoTime();
    }
}
