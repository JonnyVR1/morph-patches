package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzq;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzt;
import com.google.android.gms.location.zzu;
import p149l.bux0;
import p149l.ckx0;
import p149l.o3u0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationRequestUpdateDataCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public final class zzdf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdf> CREATOR = new o3u0();

    @SafeParcelable.Field(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", getter = "getOperation", m12463id = 1)
    private final int zza;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationRequest", m12463id = 2)
    private final zzdd zzb;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationListenerAsBinder", m12463id = 3, type = "android.os.IBinder")
    private final zzu zzc;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getLocationCallbackAsBinder", m12463id = 5, type = "android.os.IBinder")
    private final zzr zzd;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getPendingIntent", m12463id = 4)
    private final PendingIntent zze;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackAsBinder", m12463id = 6, type = "android.os.IBinder")
    private final bux0 zzf;

    @Nullable
    @SafeParcelable.Field(defaultValueUnchecked = "null", getter = "getListenerId", m12463id = 8)
    private final String zzg;

    @SafeParcelable.Constructor
    public zzdf(@SafeParcelable.Param(m12464id = 1) int i, @Nullable @SafeParcelable.Param(m12464id = 2) zzdd zzddVar, @Nullable @SafeParcelable.Param(m12464id = 3) IBinder iBinder, @Nullable @SafeParcelable.Param(m12464id = 5) IBinder iBinder2, @Nullable @SafeParcelable.Param(m12464id = 4) PendingIntent pendingIntent, @Nullable @SafeParcelable.Param(m12464id = 6) IBinder iBinder3, @Nullable @SafeParcelable.Param(m12464id = 8) String str) {
        this.zza = i;
        this.zzb = zzddVar;
        bux0 ckx0Var = null;
        this.zzc = iBinder != null ? zzt.zzb(iBinder) : null;
        this.zze = pendingIntent;
        this.zzd = iBinder2 != null ? zzq.zzb(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            ckx0Var = iInterfaceQueryLocalInterface instanceof bux0 ? (bux0) iInterfaceQueryLocalInterface : new ckx0(iBinder3);
        }
        this.zzf = ckx0Var;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        zzu zzuVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzuVar == null ? null : zzuVar.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zze, i, false);
        zzr zzrVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, zzrVar == null ? null : zzrVar.asBinder(), false);
        bux0 bux0Var = this.zzf;
        SafeParcelWriter.writeIBinder(parcel, 6, bux0Var != null ? bux0Var.asBinder() : null, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
