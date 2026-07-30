package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
abstract class zaav implements Runnable {
    final /* synthetic */ zaaw zab;

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        this.zab.zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e) {
                this.zab.zaa.zam(e);
            }
        } finally {
            this.zab.zab.unlock();
        }
    }

    @WorkerThread
    public abstract void zaa();
}
