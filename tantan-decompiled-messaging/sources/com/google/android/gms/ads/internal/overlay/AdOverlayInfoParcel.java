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
import p149l.a7u0;
import p149l.b1r0;
import p149l.d1s0;
import p149l.dfy0;
import p149l.ess0;
import p149l.l1r0;
import p149l.m7s0;
import p149l.q9t0;
import p149l.rby0;
import p149l.s050;
import p149l.ses0;
import p149l.ues0;
import p149l.uyl;
import p149l.wxt0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new rby0();

    @SafeParcelable.Field(m12463id = 2)
    public final zzc zza;

    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", m12463id = 3, type = "android.os.IBinder")
    public final b1r0 zzb;

    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", m12463id = 4, type = "android.os.IBinder")
    public final dfy0 zzc;

    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", m12463id = 5, type = "android.os.IBinder")
    public final q9t0 zzd;

    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", m12463id = 6, type = "android.os.IBinder")
    public final ues0 zze;

    @NonNull
    @SafeParcelable.Field(m12463id = 7)
    public final String zzf;

    @SafeParcelable.Field(m12463id = 8)
    public final boolean zzg;

    @NonNull
    @SafeParcelable.Field(m12463id = 9)
    public final String zzh;

    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", m12463id = 10, type = "android.os.IBinder")
    public final l1r0 zzi;

    @SafeParcelable.Field(m12463id = 11)
    public final int zzj;

    @SafeParcelable.Field(m12463id = 12)
    public final int zzk;

    @NonNull
    @SafeParcelable.Field(m12463id = 13)
    public final String zzl;

    @SafeParcelable.Field(m12463id = 14)
    public final zzcei zzm;

    @NonNull
    @SafeParcelable.Field(m12463id = 16)
    public final String zzn;

    @SafeParcelable.Field(m12463id = 17)
    public final zzj zzo;

    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", m12463id = 18, type = "android.os.IBinder")
    public final ses0 zzp;

    @NonNull
    @SafeParcelable.Field(m12463id = 19)
    public final String zzq;

    @NonNull
    @SafeParcelable.Field(m12463id = 24)
    public final String zzr;

    @NonNull
    @SafeParcelable.Field(m12463id = 25)
    public final String zzs;

    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", m12463id = 26, type = "android.os.IBinder")
    public final wxt0 zzt;

    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", m12463id = 27, type = "android.os.IBinder")
    public final a7u0 zzu;

    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", m12463id = 28, type = "android.os.IBinder")
    public final ess0 zzv;

    @SafeParcelable.Field(m12463id = 29)
    public final boolean zzw;

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(m12464id = 2) zzc zzcVar, @SafeParcelable.Param(m12464id = 3) IBinder iBinder, @SafeParcelable.Param(m12464id = 4) IBinder iBinder2, @SafeParcelable.Param(m12464id = 5) IBinder iBinder3, @SafeParcelable.Param(m12464id = 6) IBinder iBinder4, @SafeParcelable.Param(m12464id = 7) String str, @SafeParcelable.Param(m12464id = 8) boolean z, @SafeParcelable.Param(m12464id = 9) String str2, @SafeParcelable.Param(m12464id = 10) IBinder iBinder5, @SafeParcelable.Param(m12464id = 11) int i, @SafeParcelable.Param(m12464id = 12) int i2, @SafeParcelable.Param(m12464id = 13) String str3, @SafeParcelable.Param(m12464id = 14) zzcei zzceiVar, @SafeParcelable.Param(m12464id = 16) String str4, @SafeParcelable.Param(m12464id = 17) zzj zzjVar, @SafeParcelable.Param(m12464id = 18) IBinder iBinder6, @SafeParcelable.Param(m12464id = 19) String str5, @SafeParcelable.Param(m12464id = 24) String str6, @SafeParcelable.Param(m12464id = 25) String str7, @SafeParcelable.Param(m12464id = 26) IBinder iBinder7, @SafeParcelable.Param(m12464id = 27) IBinder iBinder8, @SafeParcelable.Param(m12464id = 28) IBinder iBinder9, @SafeParcelable.Param(m12464id = 29) boolean z2) {
        this.zza = zzcVar;
        this.zzb = (b1r0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder));
        this.zzc = (dfy0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder2));
        this.zzd = (q9t0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder3));
        this.zzp = (ses0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder6));
        this.zze = (ues0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (l1r0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzceiVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzt = (wxt0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder7));
        this.zzu = (a7u0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder8));
        this.zzv = (ess0) s050.m181847P2(uyl.AbstractBinderC20541a.m196295O(iBinder9));
        this.zzw = z2;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static AdOverlayInfoParcel m12259g(@NonNull Intent intent) {
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
        SafeParcelWriter.writeIBinder(parcel, 3, s050.m181848Y2(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, s050.m181848Y2(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, s050.m181848Y2(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, s050.m181848Y2(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, s050.m181848Y2(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, s050.m181848Y2(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeIBinder(parcel, 26, s050.m181848Y2(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, s050.m181848Y2(this.zzu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 28, s050.m181848Y2(this.zzv).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AdOverlayInfoParcel(b1r0 b1r0Var, dfy0 dfy0Var, ses0 ses0Var, ues0 ues0Var, l1r0 l1r0Var, q9t0 q9t0Var, boolean z, int i, String str, String str2, zzcei zzceiVar, a7u0 a7u0Var, ess0 ess0Var) {
        this.zza = null;
        this.zzb = b1r0Var;
        this.zzc = dfy0Var;
        this.zzd = q9t0Var;
        this.zzp = ses0Var;
        this.zze = ues0Var;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = l1r0Var;
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
        this.zzu = a7u0Var;
        this.zzv = ess0Var;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(b1r0 b1r0Var, dfy0 dfy0Var, l1r0 l1r0Var, q9t0 q9t0Var, int i, zzcei zzceiVar, String str, zzj zzjVar, String str2, String str3, String str4, wxt0 wxt0Var, ess0 ess0Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = dfy0Var;
        this.zzd = q9t0Var;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131941I0)).booleanValue()) {
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
        this.zzt = wxt0Var;
        this.zzu = null;
        this.zzv = ess0Var;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(b1r0 b1r0Var, dfy0 dfy0Var, l1r0 l1r0Var, q9t0 q9t0Var, boolean z, int i, zzcei zzceiVar, a7u0 a7u0Var, ess0 ess0Var) {
        this.zza = null;
        this.zzb = b1r0Var;
        this.zzc = dfy0Var;
        this.zzd = q9t0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = l1r0Var;
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
        this.zzu = a7u0Var;
        this.zzv = ess0Var;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(b1r0 b1r0Var, dfy0 dfy0Var, ses0 ses0Var, ues0 ues0Var, l1r0 l1r0Var, q9t0 q9t0Var, boolean z, int i, String str, zzcei zzceiVar, a7u0 a7u0Var, ess0 ess0Var, boolean z2) {
        this.zza = null;
        this.zzb = b1r0Var;
        this.zzc = dfy0Var;
        this.zzd = q9t0Var;
        this.zzp = ses0Var;
        this.zze = ues0Var;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = l1r0Var;
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
        this.zzu = a7u0Var;
        this.zzv = ess0Var;
        this.zzw = z2;
    }

    public AdOverlayInfoParcel(zzc zzcVar, b1r0 b1r0Var, dfy0 dfy0Var, l1r0 l1r0Var, zzcei zzceiVar, q9t0 q9t0Var, a7u0 a7u0Var) {
        this.zza = zzcVar;
        this.zzb = b1r0Var;
        this.zzc = dfy0Var;
        this.zzd = q9t0Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = l1r0Var;
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
        this.zzu = a7u0Var;
        this.zzv = null;
        this.zzw = false;
    }

    public AdOverlayInfoParcel(dfy0 dfy0Var, q9t0 q9t0Var, int i, zzcei zzceiVar) {
        this.zzc = dfy0Var;
        this.zzd = q9t0Var;
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

    public AdOverlayInfoParcel(q9t0 q9t0Var, zzcei zzceiVar, String str, String str2, int i, ess0 ess0Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = q9t0Var;
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
        this.zzv = ess0Var;
        this.zzw = false;
    }
}
