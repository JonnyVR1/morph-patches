package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p153l.d7r0;
import p153l.x6r0;

/* JADX INFO: loaded from: classes6.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends x6r0 implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @NonNull
        public static IStatusCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof IStatusCallback ? (IStatusCallback) iInterfaceQueryLocalInterface : new zaby(iBinder);
        }

        @Override // p153l.x6r0
        public final boolean zaa(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Status status = (Status) d7r0.m114755a(parcel, Status.CREATOR);
            d7r0.m114756b(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(@NonNull Status status) throws RemoteException;
}
