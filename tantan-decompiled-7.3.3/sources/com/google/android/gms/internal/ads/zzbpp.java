package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.pss0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
public final class zzbpp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbpp> CREATOR = new pss0();

    @SafeParcelable.VersionField(m12520id = 1000)
    public final int zza;

    @SafeParcelable.Field(m12517id = 1)
    public final int zzb;

    @SafeParcelable.Field(m12517id = 2)
    public final String zzc;

    @SafeParcelable.Field(m12517id = 3)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzbpp(@SafeParcelable.Param(m12518id = 1000) int i, @SafeParcelable.Param(m12518id = 1) int i2, @SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
