package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p149l.wzr0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzaf extends wzr0 implements zzag {
    public static zzag zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof zzag ? (zzag) iInterfaceQueryLocalInterface : new zzae(iBinder);
    }
}
