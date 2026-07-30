package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes7.dex */
@WorkerThread
final class zzc extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final long f11539a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getLongExtra("extra_download_id", -1L) == this.f11539a) {
            throw null;
        }
    }
}
