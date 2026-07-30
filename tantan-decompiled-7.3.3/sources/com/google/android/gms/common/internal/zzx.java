package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;
import p153l.l9r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzx extends l9r0 implements ICancelToken {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws RemoteException {
        zzD(2, zza());
    }
}
