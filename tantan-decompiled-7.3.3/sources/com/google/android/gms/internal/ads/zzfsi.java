package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.pjw0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ProgramRequestCreator")
public final class zzfsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfsi> CREATOR = new pjw0();

    @SafeParcelable.VersionField(m12520id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    public final int zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final String zzc;

    @SafeParcelable.Field(m12517id = 4)
    public final String zzd;

    @SafeParcelable.Field(m12517id = 5)
    public final int zze;

    @SafeParcelable.Constructor
    public zzfsi(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) int i2, @SafeParcelable.Param(m12518id = 5) int i3, @SafeParcelable.Param(m12518id = 3) String str, @SafeParcelable.Param(m12518id = 4) String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfsi(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
