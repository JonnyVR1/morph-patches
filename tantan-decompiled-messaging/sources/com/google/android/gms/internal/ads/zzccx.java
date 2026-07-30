package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.c1t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "SignalConfigurationParcelCreator")
public final class zzccx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzccx> CREATOR = new c1t0();

    @SafeParcelable.Field(m12463id = 1)
    public final String zza;

    @SafeParcelable.Field(m12463id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12463id = 3)
    @Deprecated
    public final zzq zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final zzl zzd;

    @SafeParcelable.Constructor
    public zzccx(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) String str2, @SafeParcelable.Param(m12464id = 3) zzq zzqVar, @SafeParcelable.Param(m12464id = 4) zzl zzlVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
