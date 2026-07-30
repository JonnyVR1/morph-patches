package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import p153l.c9s0;

/* JADX INFO: loaded from: classes6.dex */
public interface ICancelToken extends IInterface {

    public static abstract class Stub extends c9s0 implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @NonNull
        public static ICancelToken asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof ICancelToken ? (ICancelToken) iInterfaceQueryLocalInterface : new zzx(iBinder);
        }

        @Override // p153l.c9s0
        public final boolean zza(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}
