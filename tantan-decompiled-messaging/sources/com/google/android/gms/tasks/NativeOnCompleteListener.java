package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    private final long zza;

    @KeepForSdk
    public native void nativeOnComplete(long j, @Nullable Object obj, boolean z, boolean z2, @Nullable String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task<Object> task) {
        Object objMo15373l;
        String message;
        Exception excMo15372k;
        if (task.mo15377p()) {
            objMo15373l = task.mo15373l();
            message = null;
        } else if (task.mo15375n() || (excMo15372k = task.mo15372k()) == null) {
            objMo15373l = null;
            message = null;
        } else {
            message = excMo15372k.getMessage();
            objMo15373l = null;
        }
        nativeOnComplete(this.zza, objMo15373l, task.mo15377p(), task.mo15375n(), message);
    }
}
