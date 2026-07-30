package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
final class zas extends zaa {
    final /* synthetic */ sni0 zaa;

    public zas(zay zayVar, sni0 sni0Var) {
        this.zaa = sni0Var;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.zaa);
    }
}
