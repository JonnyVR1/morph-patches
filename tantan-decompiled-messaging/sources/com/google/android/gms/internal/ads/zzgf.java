package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import p149l.f5v0;
import p149l.uns0;
import p149l.xkw0;
import p149l.zlw0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzgf implements zzbx {
    public static final Parcelable.Creator<zzgf> CREATOR = new xkw0();
    public final float zza;
    public final float zzb;

    public zzgf(@FloatRange(from = -90.0d, to = 90.0d) float f, @FloatRange(from = -180.0d, to = 180.0d) float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        f5v0.m119534e(z, "Invalid latitude or longitude");
        this.zza = f;
        this.zzb = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgf.class == obj.getClass()) {
            zzgf zzgfVar = (zzgf) obj;
            if (this.zza == zzgfVar.zza && this.zzb == zzgfVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13538Z(uns0 uns0Var) {
    }

    public /* synthetic */ zzgf(Parcel parcel, zlw0 zlw0Var) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
