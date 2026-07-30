package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p149l.n16;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
final class zzek implements n16 {
    final /* synthetic */ zzel zza;

    public zzek(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // p149l.n16
    public final /* synthetic */ Object then(Task task) throws Exception {
        sei0 sei0Var = new sei0();
        if (task.mo15375n()) {
            sei0Var.m183660d(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (task.mo15372k() == null && task.mo15373l() == null) {
            sei0Var.m183660d(new ApiException(new Status(8, "Location unavailable.")));
        }
        return sei0Var.m183657a().mo15372k() != null ? sei0Var.m183657a() : task;
    }
}
