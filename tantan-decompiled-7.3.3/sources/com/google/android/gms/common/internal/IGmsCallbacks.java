package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;

    void zzb(int i, @NonNull Bundle bundle) throws RemoteException;

    void zzc(int i, IBinder iBinder, zzk zzkVar) throws RemoteException;
}
