package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.zis0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdapterStatusParcelCreator")
public final class zzbpd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbpd> CREATOR = new zis0();

    @SafeParcelable.Field(m12463id = 1)
    public final String zza;

    @SafeParcelable.Field(m12463id = 2)
    public final boolean zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final int zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final String zzd;

    @SafeParcelable.Constructor
    public zzbpd(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) boolean z, @SafeParcelable.Param(m12464id = 3) int i, @SafeParcelable.Param(m12464id = 4) String str2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
