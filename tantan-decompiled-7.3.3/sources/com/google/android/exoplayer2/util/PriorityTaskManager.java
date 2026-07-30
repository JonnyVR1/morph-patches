package com.google.android.exoplayer2.util;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a */
    public final Object f9578a = new Object();

    /* JADX INFO: renamed from: b */
    public final PriorityQueue<Integer> f9579b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c */
    public int f9580c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + Constants.AES_SUFFIX);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12204a(int i) {
        synchronized (this.f9578a) {
            this.f9579b.add(Integer.valueOf(i));
            this.f9580c = Math.max(this.f9580c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12205b(int i) {
        synchronized (this.f9578a) {
            this.f9579b.remove(Integer.valueOf(i));
            this.f9580c = this.f9579b.isEmpty() ? Integer.MIN_VALUE : ((Integer) bmk0.m105144j(this.f9579b.peek())).intValue();
            this.f9578a.notifyAll();
        }
    }
}
