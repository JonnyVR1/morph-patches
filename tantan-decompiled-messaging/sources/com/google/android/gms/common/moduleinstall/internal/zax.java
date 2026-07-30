package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
final class zax extends IStatusCallback.Stub {
    final /* synthetic */ sei0 zaa;

    public zax(zay zayVar, sei0 sei0Var) {
        this.zaa = sei0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.zaa);
    }
}
