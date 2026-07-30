package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p153l.ect0;
import p153l.ehy0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdRequestParcelCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new ehy0();

    @SafeParcelable.Field(m12517id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    @Deprecated
    public final long zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final Bundle zzc;

    @SafeParcelable.Field(m12517id = 4)
    @Deprecated
    public final int zzd;

    @SafeParcelable.Field(m12517id = 5)
    public final List zze;

    @SafeParcelable.Field(m12517id = 6)
    public final boolean zzf;

    @SafeParcelable.Field(m12517id = 7)
    public final int zzg;

    @SafeParcelable.Field(m12517id = 8)
    public final boolean zzh;

    @SafeParcelable.Field(m12517id = 9)
    public final String zzi;

    @SafeParcelable.Field(m12517id = 10)
    public final zzfh zzj;

    @SafeParcelable.Field(m12517id = 11)
    public final Location zzk;

    @SafeParcelable.Field(m12517id = 12)
    public final String zzl;

    @SafeParcelable.Field(m12517id = 13)
    public final Bundle zzm;

    @SafeParcelable.Field(m12517id = 14)
    public final Bundle zzn;

    @SafeParcelable.Field(m12517id = 15)
    public final List zzo;

    @SafeParcelable.Field(m12517id = 16)
    public final String zzp;

    @SafeParcelable.Field(m12517id = 17)
    public final String zzq;

    @SafeParcelable.Field(m12517id = 18)
    @Deprecated
    public final boolean zzr;

    @Nullable
    @SafeParcelable.Field(m12517id = 19)
    public final zzc zzs;

    @SafeParcelable.Field(m12517id = 20)
    public final int zzt;

    @Nullable
    @SafeParcelable.Field(m12517id = 21)
    public final String zzu;

    @SafeParcelable.Field(m12517id = 22)
    public final List zzv;

    @SafeParcelable.Field(m12517id = 23)
    public final int zzw;

    @Nullable
    @SafeParcelable.Field(m12517id = 24)
    public final String zzx;

    @SafeParcelable.Field(m12517id = 25)
    public final int zzy;

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) long j, @SafeParcelable.Param(m12518id = 3) Bundle bundle, @SafeParcelable.Param(m12518id = 4) int i2, @SafeParcelable.Param(m12518id = 5) List list, @SafeParcelable.Param(m12518id = 6) boolean z, @SafeParcelable.Param(m12518id = 7) int i3, @SafeParcelable.Param(m12518id = 8) boolean z2, @SafeParcelable.Param(m12518id = 9) String str, @SafeParcelable.Param(m12518id = 10) zzfh zzfhVar, @SafeParcelable.Param(m12518id = 11) Location location, @SafeParcelable.Param(m12518id = 12) String str2, @SafeParcelable.Param(m12518id = 13) Bundle bundle2, @SafeParcelable.Param(m12518id = 14) Bundle bundle3, @SafeParcelable.Param(m12518id = 15) List list2, @SafeParcelable.Param(m12518id = 16) String str3, @SafeParcelable.Param(m12518id = 17) String str4, @SafeParcelable.Param(m12518id = 18) boolean z3, @SafeParcelable.Param(m12518id = 19) zzc zzcVar, @SafeParcelable.Param(m12518id = 20) int i4, @Nullable @SafeParcelable.Param(m12518id = 21) String str5, @SafeParcelable.Param(m12518id = 22) List list3, @SafeParcelable.Param(m12518id = 23) int i5, @SafeParcelable.Param(m12518id = 24) String str6, @SafeParcelable.Param(m12518id = 25) int i6) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfhVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzl)) {
            return false;
        }
        zzl zzlVar = (zzl) obj;
        return this.zza == zzlVar.zza && this.zzb == zzlVar.zzb && ect0.m120403a(this.zzc, zzlVar.zzc) && this.zzd == zzlVar.zzd && Objects.equal(this.zze, zzlVar.zze) && this.zzf == zzlVar.zzf && this.zzg == zzlVar.zzg && this.zzh == zzlVar.zzh && Objects.equal(this.zzi, zzlVar.zzi) && Objects.equal(this.zzj, zzlVar.zzj) && Objects.equal(this.zzk, zzlVar.zzk) && Objects.equal(this.zzl, zzlVar.zzl) && ect0.m120403a(this.zzm, zzlVar.zzm) && ect0.m120403a(this.zzn, zzlVar.zzn) && Objects.equal(this.zzo, zzlVar.zzo) && Objects.equal(this.zzp, zzlVar.zzp) && Objects.equal(this.zzq, zzlVar.zzq) && this.zzr == zzlVar.zzr && this.zzt == zzlVar.zzt && Objects.equal(this.zzu, zzlVar.zzu) && Objects.equal(this.zzv, zzlVar.zzv) && this.zzw == zzlVar.zzw && Objects.equal(this.zzx, zzlVar.zzx) && this.zzy == zzlVar.zzy;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzr);
        SafeParcelWriter.writeParcelable(parcel, 19, this.zzs, i, false);
        SafeParcelWriter.writeInt(parcel, 20, this.zzt);
        SafeParcelWriter.writeString(parcel, 21, this.zzu, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.zzv, false);
        SafeParcelWriter.writeInt(parcel, 23, this.zzw);
        SafeParcelWriter.writeString(parcel, 24, this.zzx, false);
        SafeParcelWriter.writeInt(parcel, 25, this.zzy);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
