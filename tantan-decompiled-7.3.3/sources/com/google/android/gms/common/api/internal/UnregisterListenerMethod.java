package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import p153l.sni0;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    private final ListenerHolder.ListenerKey zaa;

    @KeepForSdk
    public UnregisterListenerMethod(@NonNull ListenerHolder.ListenerKey<L> listenerKey) {
        this.zaa = listenerKey;
    }

    @NonNull
    @KeepForSdk
    public ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaa;
    }

    @KeepForSdk
    public abstract void unregisterListener(@NonNull A a, @NonNull sni0<Boolean> sni0Var) throws RemoteException;
}
