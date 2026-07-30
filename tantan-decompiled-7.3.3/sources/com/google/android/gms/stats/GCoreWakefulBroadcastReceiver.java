package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
