package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.fis0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "HttpResponseParcelCreator")
public final class zzbos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbos> CREATOR = new fis0();

    @SafeParcelable.Field(m12463id = 1)
    public final boolean zza;

    @SafeParcelable.Field(m12463id = 2)
    public final String zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final int zzc;

    @SafeParcelable.Field(m12463id = 4)
    public final byte[] zzd;

    @SafeParcelable.Field(m12463id = 5)
    public final String[] zze;

    @SafeParcelable.Field(m12463id = 6)
    public final String[] zzf;

    @SafeParcelable.Field(m12463id = 7)
    public final boolean zzg;

    @SafeParcelable.Field(m12463id = 8)
    public final long zzh;

    @SafeParcelable.Constructor
    public zzbos(@SafeParcelable.Param(m12464id = 1) boolean z, @SafeParcelable.Param(m12464id = 2) String str, @SafeParcelable.Param(m12464id = 3) int i, @SafeParcelable.Param(m12464id = 4) byte[] bArr, @SafeParcelable.Param(m12464id = 5) String[] strArr, @SafeParcelable.Param(m12464id = 6) String[] strArr2, @SafeParcelable.Param(m12464id = 7) boolean z2, @SafeParcelable.Param(m12464id = 8) long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = i;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z2;
        this.zzh = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.zze, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
