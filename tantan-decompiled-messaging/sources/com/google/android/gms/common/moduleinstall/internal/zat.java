package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
final class zat extends zaa {
    final /* synthetic */ sei0 zaa;

    public zat(zay zayVar, sei0 sei0Var) {
        this.zaa = sei0Var;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.zaa);
    }
}
