package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.y9s0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "OfflineNotificationParcelCreator")
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new y9s0();

    @SafeParcelable.Field(m12517id = 1)
    public final String zza;

    @SafeParcelable.Field(m12517id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final String zzc;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(m12518id = 1) String str, @SafeParcelable.Param(m12518id = 2) String str2, @SafeParcelable.Param(m12518id = 3) String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
