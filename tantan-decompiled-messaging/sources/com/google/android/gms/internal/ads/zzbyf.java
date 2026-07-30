package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.gus0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
public final class zzbyf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyf> CREATOR = new gus0();

    @SafeParcelable.Field(m12463id = 31)
    public final long zzA;

    @SafeParcelable.Field(m12463id = 33)
    public final String zzB;

    @SafeParcelable.Field(m12463id = 34)
    public final float zzC;

    @SafeParcelable.Field(m12463id = 35)
    public final int zzD;

    @SafeParcelable.Field(m12463id = 36)
    public final int zzE;

    @SafeParcelable.Field(m12463id = 37)
    public final boolean zzF;

    @SafeParcelable.Field(m12463id = 39)
    public final String zzG;

    @SafeParcelable.Field(m12463id = 40)
    public final boolean zzH;

    @SafeParcelable.Field(m12463id = 41)
    public final String zzI;

    @SafeParcelable.Field(m12463id = 42)
    public final boolean zzJ;

    @SafeParcelable.Field(m12463id = 43)
    public final int zzK;

    @SafeParcelable.Field(m12463id = 44)
    public final Bundle zzL;

    @SafeParcelable.Field(m12463id = 45)
    public final String zzM;

    @Nullable
    @SafeParcelable.Field(m12463id = 46)
    public final zzdu zzN;

    @SafeParcelable.Field(m12463id = 47)
    public final boolean zzO;

    @SafeParcelable.Field(m12463id = 48)
    public final Bundle zzP;

    @Nullable
    @SafeParcelable.Field(m12463id = 49)
    public final String zzQ;

    @Nullable
    @SafeParcelable.Field(m12463id = 50)
    public final String zzR;

    @Nullable
    @SafeParcelable.Field(m12463id = 51)
    public final String zzS;

    @SafeParcelable.Field(m12463id = 52)
    public final boolean zzT;

    @SafeParcelable.Field(m12463id = 53)
    public final List zzU;

    @SafeParcelable.Field(m12463id = 54)
    public final String zzV;

    @SafeParcelable.Field(m12463id = 55)
    public final List zzW;

    @SafeParcelable.Field(m12463id = 56)
    public final int zzX;

    @SafeParcelable.Field(m12463id = 57)
    public final boolean zzY;

    @SafeParcelable.Field(m12463id = 58)
    public final boolean zzZ;

    @SafeParcelable.Field(m12463id = 1)
    public final int zza;

    @SafeParcelable.Field(m12463id = 59)
    public final boolean zzaa;

    @SafeParcelable.Field(m12463id = 60)
    public final ArrayList zzab;

    @SafeParcelable.Field(m12463id = 61)
    public final String zzac;

    @SafeParcelable.Field(m12463id = 63)
    public final zzbpp zzad;

    @Nullable
    @SafeParcelable.Field(m12463id = 64)
    public final String zzae;

    @SafeParcelable.Field(m12463id = 65)
    public final Bundle zzaf;

    @Nullable
    @SafeParcelable.Field(m12463id = 2)
    public final Bundle zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final zzl zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final zzq zzd;

    @SafeParcelable.Field(m12463id = 5)
    public final String zze;

    @SafeParcelable.Field(m12463id = 6)
    public final ApplicationInfo zzf;

    @Nullable
    @SafeParcelable.Field(m12463id = 7)
    public final PackageInfo zzg;

    @SafeParcelable.Field(m12463id = 8)
    public final String zzh;

    @SafeParcelable.Field(m12463id = 9)
    public final String zzi;

    @SafeParcelable.Field(m12463id = 10)
    public final String zzj;

    @SafeParcelable.Field(m12463id = 11)
    public final zzcei zzk;

    @SafeParcelable.Field(m12463id = 12)
    public final Bundle zzl;

    @SafeParcelable.Field(m12463id = 13)
    public final int zzm;

    @SafeParcelable.Field(m12463id = 14)
    public final List zzn;

    @SafeParcelable.Field(m12463id = 15)
    public final Bundle zzo;

    @SafeParcelable.Field(m12463id = 16)
    public final boolean zzp;

    @SafeParcelable.Field(m12463id = 18)
    public final int zzq;

    @SafeParcelable.Field(m12463id = 19)
    public final int zzr;

    @SafeParcelable.Field(m12463id = 20)
    public final float zzs;

    @SafeParcelable.Field(m12463id = 21)
    public final String zzt;

    @SafeParcelable.Field(m12463id = 25)
    public final long zzu;

    @SafeParcelable.Field(m12463id = 26)
    public final String zzv;

    @Nullable
    @SafeParcelable.Field(m12463id = 27)
    public final List zzw;

    @SafeParcelable.Field(m12463id = 28)
    public final String zzx;

    @SafeParcelable.Field(m12463id = 29)
    public final zzbjb zzy;

    @SafeParcelable.Field(m12463id = 30)
    public final List zzz;

    @SafeParcelable.Constructor
    public zzbyf(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) Bundle bundle, @SafeParcelable.Param(m12464id = 3) zzl zzlVar, @SafeParcelable.Param(m12464id = 4) zzq zzqVar, @SafeParcelable.Param(m12464id = 5) String str, @SafeParcelable.Param(m12464id = 6) ApplicationInfo applicationInfo, @SafeParcelable.Param(m12464id = 7) PackageInfo packageInfo, @SafeParcelable.Param(m12464id = 8) String str2, @SafeParcelable.Param(m12464id = 9) String str3, @SafeParcelable.Param(m12464id = 10) String str4, @SafeParcelable.Param(m12464id = 11) zzcei zzceiVar, @SafeParcelable.Param(m12464id = 12) Bundle bundle2, @SafeParcelable.Param(m12464id = 13) int i2, @SafeParcelable.Param(m12464id = 14) List list, @SafeParcelable.Param(m12464id = 15) Bundle bundle3, @SafeParcelable.Param(m12464id = 16) boolean z, @SafeParcelable.Param(m12464id = 18) int i3, @SafeParcelable.Param(m12464id = 19) int i4, @SafeParcelable.Param(m12464id = 20) float f, @SafeParcelable.Param(m12464id = 21) String str5, @SafeParcelable.Param(m12464id = 25) long j, @SafeParcelable.Param(m12464id = 26) String str6, @SafeParcelable.Param(m12464id = 27) List list2, @SafeParcelable.Param(m12464id = 28) String str7, @SafeParcelable.Param(m12464id = 29) zzbjb zzbjbVar, @SafeParcelable.Param(m12464id = 30) List list3, @SafeParcelable.Param(m12464id = 31) long j2, @SafeParcelable.Param(m12464id = 33) String str8, @SafeParcelable.Param(m12464id = 34) float f2, @SafeParcelable.Param(m12464id = 40) boolean z2, @SafeParcelable.Param(m12464id = 35) int i5, @SafeParcelable.Param(m12464id = 36) int i6, @SafeParcelable.Param(m12464id = 37) boolean z3, @SafeParcelable.Param(m12464id = 39) String str9, @SafeParcelable.Param(m12464id = 41) String str10, @SafeParcelable.Param(m12464id = 42) boolean z4, @SafeParcelable.Param(m12464id = 43) int i7, @SafeParcelable.Param(m12464id = 44) Bundle bundle4, @SafeParcelable.Param(m12464id = 45) String str11, @SafeParcelable.Param(m12464id = 46) zzdu zzduVar, @SafeParcelable.Param(m12464id = 47) boolean z5, @SafeParcelable.Param(m12464id = 48) Bundle bundle5, @Nullable @SafeParcelable.Param(m12464id = 49) String str12, @Nullable @SafeParcelable.Param(m12464id = 50) String str13, @Nullable @SafeParcelable.Param(m12464id = 51) String str14, @SafeParcelable.Param(m12464id = 52) boolean z6, @SafeParcelable.Param(m12464id = 53) List list4, @SafeParcelable.Param(m12464id = 54) String str15, @SafeParcelable.Param(m12464id = 55) List list5, @SafeParcelable.Param(m12464id = 56) int i8, @SafeParcelable.Param(m12464id = 57) boolean z7, @SafeParcelable.Param(m12464id = 58) boolean z8, @SafeParcelable.Param(m12464id = 59) boolean z9, @SafeParcelable.Param(m12464id = 60) ArrayList arrayList, @SafeParcelable.Param(m12464id = 61) String str16, @SafeParcelable.Param(m12464id = 63) zzbpp zzbppVar, @Nullable @SafeParcelable.Param(m12464id = 64) String str17, @SafeParcelable.Param(m12464id = 65) Bundle bundle6) {
        this.zza = i;
        this.zzb = bundle;
        this.zzc = zzlVar;
        this.zzd = zzqVar;
        this.zze = str;
        this.zzf = applicationInfo;
        this.zzg = packageInfo;
        this.zzh = str2;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = zzceiVar;
        this.zzl = bundle2;
        this.zzm = i2;
        this.zzn = list;
        this.zzz = list3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list3);
        this.zzo = bundle3;
        this.zzp = z;
        this.zzq = i3;
        this.zzr = i4;
        this.zzs = f;
        this.zzt = str5;
        this.zzu = j;
        this.zzv = str6;
        this.zzw = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.zzx = str7;
        this.zzy = zzbjbVar;
        this.zzA = j2;
        this.zzB = str8;
        this.zzC = f2;
        this.zzH = z2;
        this.zzD = i5;
        this.zzE = i6;
        this.zzF = z3;
        this.zzG = str9;
        this.zzI = str10;
        this.zzJ = z4;
        this.zzK = i7;
        this.zzL = bundle4;
        this.zzM = str11;
        this.zzN = zzduVar;
        this.zzO = z5;
        this.zzP = bundle5;
        this.zzQ = str12;
        this.zzR = str13;
        this.zzS = str14;
        this.zzT = z6;
        this.zzU = list4;
        this.zzV = str15;
        this.zzW = list5;
        this.zzX = i8;
        this.zzY = z7;
        this.zzZ = z8;
        this.zzaa = z9;
        this.zzab = arrayList;
        this.zzac = str16;
        this.zzad = zzbppVar;
        this.zzae = str17;
        this.zzaf = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel, 19, this.zzr);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzs);
        SafeParcelWriter.writeString(parcel, 21, this.zzt, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzu);
        SafeParcelWriter.writeString(parcel, 26, this.zzv, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzw, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzx, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzy, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzz, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzA);
        SafeParcelWriter.writeString(parcel, 33, this.zzB, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzC);
        SafeParcelWriter.writeInt(parcel, 35, this.zzD);
        SafeParcelWriter.writeInt(parcel, 36, this.zzE);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzF);
        SafeParcelWriter.writeString(parcel, 39, this.zzG, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzH);
        SafeParcelWriter.writeString(parcel, 41, this.zzI, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzJ);
        SafeParcelWriter.writeInt(parcel, 43, this.zzK);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzL, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzM, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzN, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzO);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzP, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzQ, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzR, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzS, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzT);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzU, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzV, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzW, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzX);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzY);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzZ);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzaa);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzab, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzac, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzad, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzae, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzaf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
