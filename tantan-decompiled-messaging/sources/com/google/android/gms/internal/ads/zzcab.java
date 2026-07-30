package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.vxs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzcab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcab> CREATOR = new vxs0();

    @SafeParcelable.Field(m12463id = 2)
    public final zzl zza;

    @SafeParcelable.Field(m12463id = 3)
    public final String zzb;

    @SafeParcelable.Constructor
    public zzcab(@SafeParcelable.Param(m12464id = 2) zzl zzlVar, @SafeParcelable.Param(m12464id = 3) String str) {
        this.zza = zzlVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzl zzlVar = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzlVar, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
