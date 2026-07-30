package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.kus0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
public final class zzbym extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbym> CREATOR = new kus0();

    @SafeParcelable.Field(m12463id = 1)
    public final String zza;

    @SafeParcelable.Field(m12463id = 2)
    public final int zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final Bundle zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final byte[] zzd;

    @SafeParcelable.Field(m12463id = 5)
    public final boolean zze;

    @SafeParcelable.Field(m12463id = 6)
    public final String zzf;

    @SafeParcelable.Field(m12463id = 7)
    public final String zzg;

    @SafeParcelable.Constructor
    public zzbym(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) int i, @SafeParcelable.Param(m12464id = 3) Bundle bundle, @SafeParcelable.Param(m12464id = 4) byte[] bArr, @SafeParcelable.Param(m12464id = 5) boolean z, @SafeParcelable.Param(m12464id = 6) String str2, @SafeParcelable.Param(m12464id = 7) String str3) {
        this.zza = str;
        this.zzb = i;
        this.zzc = bundle;
        this.zzd = bArr;
        this.zze = z;
        this.zzf = str2;
        this.zzg = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
