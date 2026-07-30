package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p153l.s26;

/* JADX INFO: loaded from: classes6.dex */
final class zacx implements s26 {
    @Override // p153l.s26
    public final /* bridge */ /* synthetic */ Object then(@NonNull Task task) throws Exception {
        if (((Boolean) task.mo15427l()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
