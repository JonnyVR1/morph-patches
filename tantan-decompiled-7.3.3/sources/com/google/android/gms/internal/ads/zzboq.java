package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.krs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
public final class zzboq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzboq> CREATOR = new krs0();

    @SafeParcelable.Field(m12517id = 1)
    public final String zza;

    @SafeParcelable.Field(m12517id = 2)
    public final String[] zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final String[] zzc;

    @SafeParcelable.Constructor
    public zzboq(@SafeParcelable.Param(m12518id = 1) String str, @SafeParcelable.Param(m12518id = 2) String[] strArr, @SafeParcelable.Param(m12518id = 3) String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
