package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p153l.q4t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "NonagonRequestParcelCreator")
public final class zzbze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbze> CREATOR = new q4t0();

    @SafeParcelable.Field(m12517id = 1)
    public final Bundle zza;

    @SafeParcelable.Field(m12517id = 2)
    public final zzcei zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final ApplicationInfo zzc;

    @SafeParcelable.Field(m12517id = 4)
    public final String zzd;

    @SafeParcelable.Field(m12517id = 5)
    public final List zze;

    @Nullable
    @SafeParcelable.Field(m12517id = 6)
    public final PackageInfo zzf;

    @SafeParcelable.Field(m12517id = 7)
    public final String zzg;

    @SafeParcelable.Field(m12517id = 9)
    public final String zzh;

    @Nullable
    @SafeParcelable.Field(m12517id = 10)
    public zzfjc zzi;

    @Nullable
    @SafeParcelable.Field(m12517id = 11)
    public String zzj;

    @SafeParcelable.Field(m12517id = 12)
    public final boolean zzk;

    @SafeParcelable.Field(m12517id = 13)
    public final boolean zzl;

    @SafeParcelable.Constructor
    public zzbze(@SafeParcelable.Param(m12518id = 1) Bundle bundle, @SafeParcelable.Param(m12518id = 2) zzcei zzceiVar, @SafeParcelable.Param(m12518id = 3) ApplicationInfo applicationInfo, @SafeParcelable.Param(m12518id = 4) String str, @SafeParcelable.Param(m12518id = 5) List list, @Nullable @SafeParcelable.Param(m12518id = 6) PackageInfo packageInfo, @SafeParcelable.Param(m12518id = 7) String str2, @SafeParcelable.Param(m12518id = 9) String str3, @SafeParcelable.Param(m12518id = 10) zzfjc zzfjcVar, @SafeParcelable.Param(m12518id = 11) String str4, @SafeParcelable.Param(m12518id = 12) boolean z, @SafeParcelable.Param(m12518id = 13) boolean z2) {
        this.zza = bundle;
        this.zzb = zzceiVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfjcVar;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
