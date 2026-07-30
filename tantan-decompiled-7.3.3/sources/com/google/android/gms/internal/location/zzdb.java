package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzu;
import p153l.u7u0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationReceiverCreator")
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new u7u0();

    @SafeParcelable.Field(getter = "getType", m12517id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(getter = "getOldBinderReceiver", m12517id = 2)
    private final IBinder zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getBinderReceiver", m12517id = 3)
    private final IBinder zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getPendingIntentReceiver", m12517id = 4)
    private final PendingIntent zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getModuleId", m12517id = 5)
    private final String zze;

    @Nullable
    @SafeParcelable.Field(getter = "getListenerId", m12517id = 6)
    private final String zzf;

    @SafeParcelable.Constructor
    public zzdb(@SafeParcelable.Param(m12518id = 1) int i, @Nullable @SafeParcelable.Param(m12518id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(m12518id = 3) IBinder iBinder2, @Nullable @SafeParcelable.Param(m12518id = 4) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(m12518id = 5) String str, @Nullable @SafeParcelable.Param(m12518id = 6) String str2) {
        this.zza = i;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.zzf = str2;
    }

    /* JADX INFO: renamed from: g */
    public static zzdb m13819g(PendingIntent pendingIntent, @Nullable String str, @Nullable String str2) {
        return new zzdb(3, null, null, pendingIntent, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzr] */
    /* JADX INFO: renamed from: h */
    public static zzdb m13820h(@Nullable IInterface iInterface, zzr zzrVar, @Nullable String str, @Nullable String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(2, iInterface, zzrVar, null, null, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.os.IBinder, com.google.android.gms.location.zzu] */
    /* JADX INFO: renamed from: i */
    public static zzdb m13821i(@Nullable IInterface iInterface, zzu zzuVar, @Nullable String str, @Nullable String str2) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzdb(1, iInterface, zzuVar, null, null, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
