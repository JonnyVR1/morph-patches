package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
public final class zzf extends zza {

    @Nullable
    public final IBinder zze;
    final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @BinderThread
    public zzf(BaseGmsClient baseGmsClient, @Nullable int i, @Nullable IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        if (this.zzf.zzx != null) {
            this.zzf.zzx.onConnectionFailed(connectionResult);
        }
        this.zzf.onConnectionFailed(connectionResult);
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zzd() {
        try {
            IBinder iBinder = this.zze;
            Preconditions.checkNotNull(iBinder);
            boolean zEquals = this.zzf.getServiceDescriptor().equals(iBinder.getInterfaceDescriptor());
            BaseGmsClient baseGmsClient = this.zzf;
            if (!zEquals) {
                baseGmsClient.getServiceDescriptor();
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = baseGmsClient.createServiceInterface(this.zze);
            if (iInterfaceCreateServiceInterface != null && (BaseGmsClient.zzn(this.zzf, 2, 4, iInterfaceCreateServiceInterface) || BaseGmsClient.zzn(this.zzf, 3, 4, iInterfaceCreateServiceInterface))) {
                this.zzf.zzB = null;
                BaseGmsClient baseGmsClient2 = this.zzf;
                Bundle connectionHint = baseGmsClient2.getConnectionHint();
                if (baseGmsClient2.zzw == null) {
                    return true;
                }
                this.zzf.zzw.onConnected(connectionHint);
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }
}
