package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;
import p149l.ig3;

/* JADX INFO: loaded from: classes6.dex */
public class TestClock implements Clock {
    private final AtomicLong timestamp;

    public TestClock(long j) {
        this.timestamp = new AtomicLong(j);
    }

    public void advance(long j) {
        if (j >= 0) {
            this.timestamp.addAndGet(j);
        } else {
            ig3.m135964a("cannot advance time backwards.");
        }
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.timestamp.get();
    }

    public void tick() {
        advance(1L);
    }
}
