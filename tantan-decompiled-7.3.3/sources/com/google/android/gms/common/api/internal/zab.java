package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import p153l.wtq0;

/* JADX INFO: loaded from: classes6.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    @VisibleForTesting(otherwise = 2)
    public zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar != null) {
            zaaVar.zac(runnable);
            return this;
        }
        wtq0.m207906a("The target activity has already been GC'd");
        return null;
    }
}
