package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
final class zacv extends TaskApiCall {
    final /* synthetic */ TaskApiCall.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final void doExecute(Api.AnyClient anyClient, sni0 sni0Var) throws RemoteException {
        this.zaa.zaa.accept(anyClient, sni0Var);
    }
}
