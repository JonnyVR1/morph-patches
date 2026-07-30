package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
final class zacl extends UnregisterListenerMethod {
    final /* synthetic */ RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacl(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    public final void unregisterListener(Api.AnyClient anyClient, sni0<Boolean> sni0Var) throws RemoteException {
        this.zaa.zab.accept(anyClient, sni0Var);
    }
}
