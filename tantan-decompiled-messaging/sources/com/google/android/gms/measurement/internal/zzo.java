package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import p149l.qhy0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AppMetadataCreator")
@SafeParcelable.Reserved({1, 17, 20, 33})
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new qhy0();

    @Nullable
    @SafeParcelable.Field(m12463id = 2)
    public final String zza;

    @SafeParcelable.Field(m12463id = 32)
    public final int zzaa;

    @SafeParcelable.Field(m12463id = 34)
    public final long zzab;

    @Nullable
    @SafeParcelable.Field(m12463id = 35)
    public final String zzac;

    @SafeParcelable.Field(defaultValue = "", m12463id = 36)
    public final String zzad;

    @SafeParcelable.Field(m12463id = 13)
    @Deprecated
    private final long zzae;

    @Nullable
    @SafeParcelable.Field(m12463id = 24)
    private final String zzaf;

    @Nullable
    @SafeParcelable.Field(m12463id = 3)
    public final String zzb;

    @Nullable
    @SafeParcelable.Field(m12463id = 4)
    public final String zzc;

    @Nullable
    @SafeParcelable.Field(m12463id = 5)
    public final String zzd;

    @SafeParcelable.Field(m12463id = 6)
    public final long zze;

    @SafeParcelable.Field(m12463id = 7)
    public final long zzf;

    @Nullable
    @SafeParcelable.Field(m12463id = 8)
    public final String zzg;

    @SafeParcelable.Field(defaultValue = "true", m12463id = 9)
    public final boolean zzh;

    @SafeParcelable.Field(m12463id = 10)
    public final boolean zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MIN_VALUE", m12463id = 11)
    public final long zzj;

    @Nullable
    @SafeParcelable.Field(m12463id = 12)
    public final String zzk;

    @SafeParcelable.Field(m12463id = 14)
    public final long zzl;

    @SafeParcelable.Field(m12463id = 15)
    public final int zzm;

    @SafeParcelable.Field(defaultValue = "true", m12463id = 16)
    public final boolean zzn;

    @SafeParcelable.Field(m12463id = 18)
    public final boolean zzo;

    @Nullable
    @SafeParcelable.Field(m12463id = 19)
    public final String zzp;

    @Nullable
    @SafeParcelable.Field(m12463id = 21)
    public final Boolean zzq;

    @SafeParcelable.Field(m12463id = 22)
    public final long zzr;

    @Nullable
    @SafeParcelable.Field(m12463id = 23)
    public final List<String> zzs;

    @SafeParcelable.Field(defaultValue = "", m12463id = 25)
    public final String zzt;

    @SafeParcelable.Field(defaultValue = "", m12463id = 26)
    public final String zzu;

    @Nullable
    @SafeParcelable.Field(m12463id = 27)
    public final String zzv;

    @SafeParcelable.Field(defaultValue = "false", m12463id = 28)
    public final boolean zzw;

    @SafeParcelable.Field(m12463id = 29)
    public final long zzx;

    @SafeParcelable.Field(defaultValue = "100", m12463id = 30)
    public final int zzy;

    @SafeParcelable.Field(defaultValue = "", m12463id = 31)
    public final String zzz;

    public zzo(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List<String> list, @Nullable String str8, String str9, String str10, @Nullable String str11, boolean z5, long j7, int i2, String str12, int i3, long j8, @Nullable String str13, String str14) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzae = j4;
        this.zzl = j5;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j6;
        this.zzs = list;
        this.zzaf = null;
        this.zzt = str9;
        this.zzu = str10;
        this.zzv = str11;
        this.zzw = z5;
        this.zzx = j7;
        this.zzy = i2;
        this.zzz = str12;
        this.zzaa = i3;
        this.zzab = j8;
        this.zzac = str13;
        this.zzad = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 13, this.zzae);
        SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.writeString(parcel, 19, this.zzp, false);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzq, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzr);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzaf, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzu, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzv, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzw);
        SafeParcelWriter.writeLong(parcel, 29, this.zzx);
        SafeParcelWriter.writeInt(parcel, 30, this.zzy);
        SafeParcelWriter.writeString(parcel, 31, this.zzz, false);
        SafeParcelWriter.writeInt(parcel, 32, this.zzaa);
        SafeParcelWriter.writeLong(parcel, 34, this.zzab);
        SafeParcelWriter.writeString(parcel, 35, this.zzac, false);
        SafeParcelWriter.writeString(parcel, 36, this.zzad, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@Nullable @SafeParcelable.Param(m12464id = 2) String str, @Nullable @SafeParcelable.Param(m12464id = 3) String str2, @Nullable @SafeParcelable.Param(m12464id = 4) String str3, @Nullable @SafeParcelable.Param(m12464id = 5) String str4, @SafeParcelable.Param(m12464id = 6) long j, @SafeParcelable.Param(m12464id = 7) long j2, @Nullable @SafeParcelable.Param(m12464id = 8) String str5, @SafeParcelable.Param(m12464id = 9) boolean z, @SafeParcelable.Param(m12464id = 10) boolean z2, @SafeParcelable.Param(m12464id = 11) long j3, @Nullable @SafeParcelable.Param(m12464id = 12) String str6, @SafeParcelable.Param(m12464id = 13) long j4, @SafeParcelable.Param(m12464id = 14) long j5, @SafeParcelable.Param(m12464id = 15) int i, @SafeParcelable.Param(m12464id = 16) boolean z3, @SafeParcelable.Param(m12464id = 18) boolean z4, @Nullable @SafeParcelable.Param(m12464id = 19) String str7, @Nullable @SafeParcelable.Param(m12464id = 21) Boolean bool, @SafeParcelable.Param(m12464id = 22) long j6, @Nullable @SafeParcelable.Param(m12464id = 23) List<String> list, @Nullable @SafeParcelable.Param(m12464id = 24) String str8, @SafeParcelable.Param(m12464id = 25) String str9, @SafeParcelable.Param(m12464id = 26) String str10, @SafeParcelable.Param(m12464id = 27) String str11, @SafeParcelable.Param(m12464id = 28) boolean z5, @SafeParcelable.Param(m12464id = 29) long j7, @SafeParcelable.Param(m12464id = 30) int i2, @SafeParcelable.Param(m12464id = 31) String str12, @SafeParcelable.Param(m12464id = 32) int i3, @SafeParcelable.Param(m12464id = 34) long j8, @Nullable @SafeParcelable.Param(m12464id = 35) String str13, @SafeParcelable.Param(m12464id = 36) String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzae = j4;
        this.zzl = j5;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j6;
        this.zzs = list;
        this.zzaf = str8;
        this.zzt = str9;
        this.zzu = str10;
        this.zzv = str11;
        this.zzw = z5;
        this.zzx = j7;
        this.zzy = i2;
        this.zzz = str12;
        this.zzaa = i3;
        this.zzab = j8;
        this.zzac = str13;
        this.zzad = str14;
    }
}
