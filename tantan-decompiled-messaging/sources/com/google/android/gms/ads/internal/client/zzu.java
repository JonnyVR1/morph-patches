package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.ery0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdapterResponseInfoParcelCreator")
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new ery0();

    @SafeParcelable.Field(m12463id = 1)
    public final String zza;

    @SafeParcelable.Field(m12463id = 2)
    public long zzb;

    @Nullable
    @SafeParcelable.Field(m12463id = 3)
    public zze zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final Bundle zzd;

    @SafeParcelable.Field(m12463id = 5)
    public final String zze;

    @SafeParcelable.Field(m12463id = 6)
    public final String zzf;

    @SafeParcelable.Field(m12463id = 7)
    public final String zzg;

    @SafeParcelable.Field(m12463id = 8)
    public final String zzh;

    @SafeParcelable.Constructor
    public zzu(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) long j, @Nullable @SafeParcelable.Param(m12464id = 3) zze zzeVar, @SafeParcelable.Param(m12464id = 4) Bundle bundle, @SafeParcelable.Param(m12464id = 5) String str2, @SafeParcelable.Param(m12464id = 6) String str3, @SafeParcelable.Param(m12464id = 7) String str4, @SafeParcelable.Param(m12464id = 8) String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
