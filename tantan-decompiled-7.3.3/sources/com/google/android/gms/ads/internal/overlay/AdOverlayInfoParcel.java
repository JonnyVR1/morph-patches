package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzcei;
import p153l.aos0;
import p153l.c7u0;
import p153l.ggu0;
import p153l.h950;
import p153l.har0;
import p153l.jas0;
import p153l.joy0;
import p153l.k1t0;
import p153l.p1m;
import p153l.rar0;
import p153l.sgs0;
import p153l.wit0;
import p153l.xky0;
import p153l.yns0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new xky0();

    @SafeParcelable.Field(m12517id = 2)
    public final zzc zza;

    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", m12517id = 3, type = "android.os.IBinder")
    public final har0 zzb;

    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", m12517id = 4, type = "android.os.IBinder")
    public final joy0 zzc;

    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", m12517id = 5, type = "android.os.IBinder")
    public final wit0 zzd;

    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", m12517id = 6, type = "android.os.IBinder")
    public final aos0 zze;

    @NonNull
    @SafeParcelable.Field(m12517id = 7)
    public final String zzf;

    @SafeParcelable.Field(m12517id = 8)
    public final boolean zzg;

    @NonNull
    @SafeParcelable.Field(m12517id = 9)
    public final String zzh;

    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", m12517id = 10, type = "android.os.IBinder")
    public final rar0 zzi;

    @SafeParcelable.Field(m12517id = 11)
    public final int zzj;

    @SafeParcelable.Field(m12517id = 12)
    public final int zzk;

    @NonNull
    @SafeParcelable.Field(m12517id = 13)
    public final String zzl;

    @SafeParcelable.Field(m12517id = 14)
    public final zzcei zzm;

    @NonNull
    @SafeParcelable.Field(m12517id = 16)
    public final String zzn;

    @SafeParcelable.Field(m12517id = 17)
    public final zzj zzo;

    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", m12517id = 18, type = "android.os.IBinder")
    public final yns0 zzp;

    @NonNull
    @SafeParcelable.Field(m12517id = 19)
    public final String zzq;

    @NonNull
    @SafeParcelable.Field(m12517id = 24)
    public final String zzr;

    @NonNull
    @SafeParcelable.Field(m12517id = 25)
    public final String zzs;

    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", m12517id = 26, type = "android.os.IBinder")
    public final c7u0 zzt;

    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", m12517id = 27, type = "android.os.IBinder")
    public final ggu0 zzu;

    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", m12517id = 28, type = "android.os.IBinder")
    public final k1t0 zzv;

    @SafeParcelable.Field(m12517id = 29)
    public final boolean zzw;

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(m12518id = 2) zzc zzcVar, @SafeParcelable.Param(m12518id = 3) IBinder iBinder, @SafeParcelable.Param(m12518id = 4) IBinder iBinder2, @SafeParcelable.Param(m12518id = 5) IBinder iBinder3, @SafeParcelable.Param(m12518id = 6) IBinder iBinder4, @SafeParcelable.Param(m12518id = 7) String str, @SafeParcelable.Param(m12518id = 8) boolean z, @SafeParcelable.Param(m12518id = 9) String str2, @SafeParcelable.Param(m12518id = 10) IBinder iBinder5, @SafeParcelable.Param(m12518id = 11) int i, @SafeParcelable.Param(m12518id = 12) int i2, @SafeParcelable.Param(m12518id = 13) String str3, @SafeParcelable.Param(m12518id = 14) zzcei zzceiVar, @SafeParcelable.Param(m12518id = 16) String str4, @SafeParcelable.Param(m12518id = 17) zzj zzjVar, @SafeParcelable.Param(m12518id = 18) IBinder iBinder6, @SafeParcelable.Param(m12518id = 19) String str5, @SafeParcelable.Param(m12518id = 24) String str6, @SafeParcelable.Param(m12518id = 25) String str7, @SafeParcelable.Param(m12518id = 26) IBinder iBinder7, @SafeParcelable.Param(m12518id = 27) IBinder iBinder8, @SafeParcelable.Param(m12518id = 28) IBinder iBinder9, @SafeParcelable.Param(m12518id = 29) boolean z2) {
        this.zza = zzcVar;
        this.zzb = (har0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder));
        this.zzc = (joy0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder2));
        this.zzd = (wit0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder3));
        this.zzp = (yns0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder6));
        this.zze = (aos0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (rar0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzceiVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (c7u0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder7));
        this.zzu = (ggu0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder8));
        this.zzv = (k1t0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder9));
        this.zzw = z2;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static AdOverlayInfoParcel m12313g(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        zzc zzcVar = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzcVar, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, h950.m134038Y2(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, h950.m134038Y2(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, h950.m134038Y2(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, h950.m134038Y2(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, h950.m134038Y2(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, h950.m134038Y2(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, h950.m134038Y2(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, h950.m134038Y2(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 28, h950.m134038Y2(this.zzv).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AdOverlayInfoParcel(har0 har0Var, joy0 joy0Var, yns0 yns0Var, aos0 aos0Var, rar0 rar0Var, wit0 wit0Var, boolean z, int i, String str, String str2, zzcei zzceiVar, ggu0 ggu0Var, k1t0 k1t0Var) {
        this.zza = null;
        this.zzb = har0Var;
        this.zzc = joy0Var;
        this.zzd = wit0Var;
        this.zzp = yns0Var;
        this.zze = aos0Var;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = rar0Var;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = ggu0Var;
        this.zzv = k1t0Var;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(har0 har0Var, joy0 joy0Var, rar0 rar0Var, wit0 wit0Var, int i, zzcei zzceiVar, String str, zzj zzjVar, String str2, String str3, String str4, c7u0 c7u0Var, k1t0 k1t0Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = joy0Var;
        this.zzd = wit0Var;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168012I0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = c7u0Var;
        this.zzu = null;
        this.zzv = k1t0Var;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(har0 har0Var, joy0 joy0Var, rar0 rar0Var, wit0 wit0Var, boolean z, int i, zzcei zzceiVar, ggu0 ggu0Var, k1t0 k1t0Var) {
        this.zza = null;
        this.zzb = har0Var;
        this.zzc = joy0Var;
        this.zzd = wit0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = rar0Var;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = ggu0Var;
        this.zzv = k1t0Var;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(har0 har0Var, joy0 joy0Var, yns0 yns0Var, aos0 aos0Var, rar0 rar0Var, wit0 wit0Var, boolean z, int i, String str, zzcei zzceiVar, ggu0 ggu0Var, k1t0 k1t0Var, boolean z2) {
        this.zza = null;
        this.zzb = har0Var;
        this.zzc = joy0Var;
        this.zzd = wit0Var;
        this.zzp = yns0Var;
        this.zze = aos0Var;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = rar0Var;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = ggu0Var;
        this.zzv = k1t0Var;
        this.zzw = z2;
    }

    public AdOverlayInfoParcel(zzc zzcVar, har0 har0Var, joy0 joy0Var, rar0 rar0Var, zzcei zzceiVar, wit0 wit0Var, ggu0 ggu0Var) {
        this.zza = zzcVar;
        this.zzb = har0Var;
        this.zzc = joy0Var;
        this.zzd = wit0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = rar0Var;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = ggu0Var;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(joy0 joy0Var, wit0 wit0Var, int i, zzcei zzceiVar) {
        this.zzc = joy0Var;
        this.zzd = wit0Var;
        this.zzj = 1;
        this.zzm = zzceiVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(wit0 wit0Var, zzcei zzceiVar, String str, String str2, int i, k1t0 k1t0Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = wit0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzceiVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = k1t0Var;
        this.zzw = false;
    }
}
