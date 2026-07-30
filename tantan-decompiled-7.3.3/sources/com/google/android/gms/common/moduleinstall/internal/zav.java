package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
final class zav extends IStatusCallback.Stub {
    final /* synthetic */ sni0 zaa;

    public zav(zay zayVar, sni0 sni0Var) {
        this.zaa = sni0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, Boolean.TRUE, this.zaa);
    }
}
