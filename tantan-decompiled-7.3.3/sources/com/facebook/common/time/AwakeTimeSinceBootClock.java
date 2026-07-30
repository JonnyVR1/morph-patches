package com.facebook.common.time;

import p153l.m610;
import p153l.w6e;

/* JADX INFO: loaded from: classes.dex */
@w6e
public class AwakeTimeSinceBootClock implements m610 {

    @w6e
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @w6e
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // p153l.m610, p153l.l610
    @w6e
    public /* bridge */ /* synthetic */ long now() {
        return super.now();
    }

    @Override // p153l.m610, p153l.l610
    @w6e
    public long nowNanos() {
        return System.nanoTime();
    }
}
