package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1xSDK extends TimerTask {
    private final Thread getRevenue;

    public AFf1xSDK(Thread thread) {
        this.getRevenue = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.getRevenue.interrupt();
    }
}
