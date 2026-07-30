package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.h950;
import p153l.p1m;
import p153l.v4z0;
import p153l.z9s0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdLauncherIntentInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new z9s0();

    @SafeParcelable.Field(m12517id = 2)
    public final String zza;

    @SafeParcelable.Field(m12517id = 3)
    public final String zzb;

    @SafeParcelable.Field(m12517id = 4)
    public final String zzc;

    @SafeParcelable.Field(m12517id = 5)
    public final String zzd;

    @SafeParcelable.Field(m12517id = 6)
    public final String zze;

    @SafeParcelable.Field(m12517id = 7)
    public final String zzf;

    @SafeParcelable.Field(m12517id = 8)
    public final String zzg;

    @SafeParcelable.Field(m12517id = 9)
    public final Intent zzh;

    @SafeParcelable.Field(getter = "getLaunchIntentListenerAsBinder", m12517id = 10, type = "android.os.IBinder")
    public final v4z0 zzi;

    @SafeParcelable.Field(m12517id = 11)
    public final boolean zzj;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) String str2, @SafeParcelable.Param(m12518id = 4) String str3, @SafeParcelable.Param(m12518id = 5) String str4, @SafeParcelable.Param(m12518id = 6) String str5, @SafeParcelable.Param(m12518id = 7) String str6, @SafeParcelable.Param(m12518id = 8) String str7, @SafeParcelable.Param(m12518id = 9) Intent intent, @SafeParcelable.Param(m12518id = 10) IBinder iBinder, @SafeParcelable.Param(m12518id = 11) boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (v4z0) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder));
        this.zzj = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeIBinder(parcel, 10, h950.m134038Y2(this.zzi).asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzc(Intent intent, v4z0 v4z0Var) {
        this(null, null, null, null, null, null, null, intent, h950.m134038Y2(v4z0Var).asBinder(), false);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, v4z0 v4z0Var) {
        this(str, str2, str3, str4, str5, str6, str7, null, h950.m134038Y2(v4z0Var).asBinder(), false);
    }
}
