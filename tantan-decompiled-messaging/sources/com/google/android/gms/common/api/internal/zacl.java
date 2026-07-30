package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import p149l.sei0;

/* JADX INFO: loaded from: classes6.dex */
final class zacl extends UnregisterListenerMethod {
    final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacl(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(Api.AnyClient anyClient, sei0<Boolean> sei0Var) throws RemoteException {
        this.zaa.zab.accept(anyClient, sei0Var);
    }
}
