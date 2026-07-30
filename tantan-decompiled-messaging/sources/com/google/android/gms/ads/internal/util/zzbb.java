package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.j3s0;
import p149l.pzv0;
import p149l.yfw0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new j3s0();

    @SafeParcelable.Field(m12463id = 1)
    public final String zza;

    @SafeParcelable.Field(m12463id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbb(@Nullable @SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    /* JADX INFO: renamed from: H */
    public static zzbb m12344H(Throwable th) {
        zze zzeVarM172253a = pzv0.m172253a(th);
        return new zzbb(yfw0.m214596d(th.getMessage()) ? zzeVarM172253a.zzb : th.getMessage(), zzeVarM172253a.zza);
    }

    /* JADX INFO: renamed from: F */
    public final zzba m12345F() {
        return new zzba(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
