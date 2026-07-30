package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p149l.hbr0;
import p149l.ibr0;
import p149l.uns0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzahm implements zzbx {
    public static final Parcelable.Creator<zzahm> CREATOR = new hbr0();
    public final float zza;
    public final int zzb;

    public /* synthetic */ zzahm(Parcel parcel, ibr0 ibr0Var) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahm.class == obj.getClass()) {
            zzahm zzahmVar = (zzahm) obj;
            if (this.zza == zzahmVar.zza && this.zzb == zzahmVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public zzahm(float f, int i) {
        this.zza = f;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13538Z(uns0 uns0Var) {
    }
}
