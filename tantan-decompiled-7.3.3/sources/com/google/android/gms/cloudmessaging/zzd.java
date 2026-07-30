package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import p153l.nzl;
import p153l.u8s0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new u8s0();
    Messenger zza;
    nzl zzb;

    public zzd(IBinder iBinder) {
        this.zza = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: a */
    public final IBinder m12504a() {
        Messenger messenger = this.zza;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* JADX INFO: renamed from: b */
    public final void m12505b(Message message) throws RemoteException {
        Messenger messenger = this.zza;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m12504a().equals(((zzd) obj).m12504a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m12504a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.zza;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
