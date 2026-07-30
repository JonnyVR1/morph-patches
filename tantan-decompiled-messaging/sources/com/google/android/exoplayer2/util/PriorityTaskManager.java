package com.google.android.exoplayer2.util;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a */
    public final Object f9541a = new Object();

    /* JADX INFO: renamed from: b */
    public final PriorityQueue<Integer> f9542b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c */
    public int f9543c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + Constants.AES_SUFFIX);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12150a(int i) {
        synchronized (this.f9541a) {
            this.f9542b.add(Integer.valueOf(i));
            this.f9543c = Math.max(this.f9543c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12151b(int i) {
        synchronized (this.f9541a) {
            this.f9542b.remove(Integer.valueOf(i));
            this.f9543c = this.f9542b.isEmpty() ? Integer.MIN_VALUE : ((Integer) vck0.m197866j(this.f9542b.peek())).intValue();
            this.f9541a.notifyAll();
        }
    }
}
