package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
final class zau extends zaa {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ sei0 zab;
    final /* synthetic */ InstallStatusListener zac;
    final /* synthetic */ zay zad;

    public zau(zay zayVar, AtomicReference atomicReference, sei0 sei0Var, InstallStatusListener installStatusListener) {
        this.zad = zayVar;
        this.zaa = atomicReference;
        this.zab = sei0Var;
        this.zac = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.zaa.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.zab);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.zad.doUnregisterEventListener(ListenerHolders.createListenerKey(this.zac, InstallStatusListener.class.getSimpleName()), 27306);
        }
    }
}
