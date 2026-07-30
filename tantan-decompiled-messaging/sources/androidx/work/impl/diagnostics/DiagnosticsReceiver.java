package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.C0763c;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String TAG = txv.m190978i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        txv.m190976e().mo190979a(TAG, "Requesting diagnostics");
        try {
            WorkManager.m4347h(context).m4351c(C0763c.m4419e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            txv.m190976e().mo190982d(TAG, "WorkManager is not initialized", e);
        }
    }
}
