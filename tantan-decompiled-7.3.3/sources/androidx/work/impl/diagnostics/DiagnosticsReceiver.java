package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.C0765c;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;
import p153l.qzv;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String TAG = qzv.m178831i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        qzv.m178829e().mo178832a(TAG, "Requesting diagnostics");
        try {
            WorkManager.m4349h(context).m4353c(C0765c.m4421e(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            qzv.m178829e().mo178835d(TAG, "WorkManager is not initialized", e);
        }
    }
}
