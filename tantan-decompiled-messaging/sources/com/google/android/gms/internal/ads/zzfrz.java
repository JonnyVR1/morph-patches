package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.caw0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GassRequestParcelCreator")
public final class zzfrz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfrz> CREATOR = new caw0();

    @SafeParcelable.VersionField(m12466id = 1)
    public final int zza;

    @SafeParcelable.Field(m12463id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final String zzc;

    @SafeParcelable.Constructor
    public zzfrz(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) String str, @SafeParcelable.Param(m12464id = 3) String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfrz(String str, String str2) {
        this(1, str, str2);
    }
}
