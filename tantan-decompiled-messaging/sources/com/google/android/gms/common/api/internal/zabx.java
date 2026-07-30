package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class zabx extends BroadcastReceiver {

    @Nullable
    Context zaa;
    private final zabw zab;

    public zabx(zabw zabwVar) {
        this.zab = zabwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.zab.zaa();
            zab();
        }
    }

    public final void zaa(Context context) {
        this.zaa = context;
    }

    public final synchronized void zab() {
        try {
            Context context = this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
