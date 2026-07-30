package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p153l.hkr0;
import p153l.mpw0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzahb extends zzagr {
    public static final Parcelable.Creator<zzahb> CREATOR = new hkr0();

    @Nullable
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzahb(Parcel parcel) {
        String string = parcel.readString();
        int i = mpw0.f137957a;
        super(string);
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahb.class == obj.getClass()) {
            zzahb zzahbVar = (zzahb) obj;
            if (this.zzf.equals(zzahbVar.zzf) && mpw0.m159408f(this.zza, zzahbVar.zza) && mpw0.m159408f(this.zzb, zzahbVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int i = iHashCode * 31;
        String str2 = this.zzb;
        return ((i + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": url=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzahb(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}
