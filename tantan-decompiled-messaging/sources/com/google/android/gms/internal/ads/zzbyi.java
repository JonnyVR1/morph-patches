package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p149l.ius0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdsServiceInputParcelCreator")
public final class zzbyi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyi> CREATOR = new ius0();

    @SafeParcelable.Field(m12463id = 1)
    public final ApplicationInfo zza;

    @SafeParcelable.Field(m12463id = 2)
    public final String zzb;

    @Nullable
    @SafeParcelable.Field(m12463id = 3)
    public final PackageInfo zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final String zzd;

    @SafeParcelable.Field(m12463id = 5)
    public final int zze;

    @SafeParcelable.Field(m12463id = 6)
    public final String zzf;

    @SafeParcelable.Field(m12463id = 7)
    public final List zzg;

    @SafeParcelable.Field(m12463id = 8)
    public final boolean zzh;

    @SafeParcelable.Field(m12463id = 9)
    public final boolean zzi;

    @SafeParcelable.Constructor
    public zzbyi(@SafeParcelable.Param(m12464id = 1) ApplicationInfo applicationInfo, @SafeParcelable.Param(m12464id = 2) String str, @Nullable @SafeParcelable.Param(m12464id = 3) PackageInfo packageInfo, @SafeParcelable.Param(m12464id = 4) String str2, @SafeParcelable.Param(m12464id = 5) int i, @SafeParcelable.Param(m12464id = 6) String str3, @SafeParcelable.Param(m12464id = 7) List list, @SafeParcelable.Param(m12464id = 8) boolean z, @SafeParcelable.Param(m12464id = 9) boolean z2) {
        this.zzb = str;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = str2;
        this.zze = i;
        this.zzf = str3;
        this.zzg = list;
        this.zzh = z;
        this.zzi = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ApplicationInfo applicationInfo = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, applicationInfo, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
