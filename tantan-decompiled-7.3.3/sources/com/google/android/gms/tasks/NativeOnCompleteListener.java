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
        Object objMo15427l;
        String message;
        Exception excMo15426k;
        if (task.mo15431p()) {
            objMo15427l = task.mo15427l();
            message = null;
        } else if (task.mo15429n() || (excMo15426k = task.mo15426k()) == null) {
            objMo15427l = null;
            message = null;
        } else {
            message = excMo15426k.getMessage();
            objMo15427l = null;
        }
        nativeOnComplete(this.zza, objMo15427l, task.mo15431p(), task.mo15429n(), message);
    }
}
