package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p149l.n16;

/* JADX INFO: loaded from: classes6.dex */
final class zacx implements n16 {
    @Override // p149l.n16
    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        if (((Boolean) task.mo15373l()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
