package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class RequirementsWatcher {

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.m10912a(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10912a(RequirementsWatcher requirementsWatcher) {
        throw null;
    }
}
