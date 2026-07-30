package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;
import p149l.bkx0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper) {
        this.zza = new bkx0(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.zza.post(runnable);
    }
}
