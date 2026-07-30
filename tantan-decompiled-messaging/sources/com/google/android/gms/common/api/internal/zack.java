package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
final class zack extends RegisterListenerMethod {
    final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zack(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    public final void registerListener(Api.AnyClient anyClient, sei0<Void> sei0Var) throws RemoteException {
        this.zaa.zaa.accept(anyClient, sei0Var);
    }
}
