package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p153l.s26;
import p153l.sni0;

/* JADX INFO: loaded from: classes7.dex */
final class zzek implements s26 {
    final /* synthetic */ zzel zza;

    public zzek(zzel zzelVar) {
        this.zza = zzelVar;
    }

    @Override // p153l.s26
    public final /* synthetic */ Object then(Task task) throws Exception {
        sni0 sni0Var = new sni0();
        if (task.mo15429n()) {
            sni0Var.m186942d(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (task.mo15426k() == null && task.mo15427l() == null) {
            sni0Var.m186942d(new ApiException(new Status(8, "Location unavailable.")));
        }
        return sni0Var.m186939a().mo15426k() != null ? sni0Var.m186939a() : task;
    }
}
