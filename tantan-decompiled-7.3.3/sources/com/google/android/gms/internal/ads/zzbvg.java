package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import p153l.e0t0;
import p153l.r9l0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "RtbVersionInfoParcelCreator")
public final class zzbvg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvg> CREATOR = new e0t0();

    @SafeParcelable.Field(m12517id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    public final int zzb;

    @SafeParcelable.Field(m12517id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzbvg(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) int i2, @SafeParcelable.Param(m12518id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX INFO: renamed from: g */
    public static zzbvg m13602g(r9l0 r9l0Var) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvg)) {
            zzbvg zzbvgVar = (zzbvg) obj;
            if (zzbvgVar.zzc == this.zzc && zzbvgVar.zzb == this.zzb && zzbvgVar.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
