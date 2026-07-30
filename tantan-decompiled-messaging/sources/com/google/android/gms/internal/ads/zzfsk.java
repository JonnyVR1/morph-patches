package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import p149l.kaw0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ProgramResponseCreator")
public final class zzfsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfsk> CREATOR = new kaw0();

    @SafeParcelable.VersionField(m12466id = 1)
    public final int zza;

    @SafeParcelable.Field(m12463id = 2)
    public final byte[] zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzfsk(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) byte[] bArr, @SafeParcelable.Param(m12464id = 3) int i2) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfsk(byte[] bArr, int i) {
        this(1, null, 1);
    }
}
