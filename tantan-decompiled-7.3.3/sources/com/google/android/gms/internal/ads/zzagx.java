package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Arrays;
import p153l.mpw0;
import p153l.xjr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagx extends zzagr {
    public static final Parcelable.Creator<zzagx> CREATOR = new xjr0();
    public final String zza;
    public final byte[] zzb;

    public zzagx(Parcel parcel) {
        super(PrivFrame.f7971ID);
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zza = string;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagx.class == obj.getClass()) {
            zzagx zzagxVar = (zzagx) obj;
            if (mpw0.m159408f(this.zza, zzagxVar.zza) && Arrays.equals(this.zzb, zzagxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzagx(String str, byte[] bArr) {
        super(PrivFrame.f7971ID);
        this.zza = str;
        this.zzb = bArr;
    }
}
