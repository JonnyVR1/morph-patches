package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.axs0;
import p153l.jsw0;
import p153l.lev0;
import p153l.mpw0;
import p153l.rrw0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzgc implements zzbx {
    public static final Parcelable.Creator<zzgc> CREATOR = new rrw0();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ zzgc(Parcel parcel, jsw0 jsw0Var) {
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zza = string;
        this.zzb = parcel.createByteArray();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgc.class == obj.getClass()) {
            zzgc zzgcVar = (zzgc) obj;
            if (this.zza.equals(zzgcVar.zza) && Arrays.equals(this.zzb, zzgcVar.zzb) && this.zzc == zzgcVar.zzc && this.zzd == zzgcVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + 527) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    public final String toString() {
        String strM159402O;
        int i = this.zzd;
        if (i != 1) {
            if (i != 23) {
                byte[] bArr = this.zzb;
                if (i != 67) {
                    int length = bArr.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        sb.append(Character.forDigit((bArr[i2] >> 4) & 15, 16));
                        sb.append(Character.forDigit(bArr[i2] & 15, 16));
                    }
                    strM159402O = sb.toString();
                } else {
                    int i3 = mpw0.f137957a;
                    lev0.m153956d(bArr.length == 4);
                    strM159402O = String.valueOf((bArr[0] << 24) | (bArr[1] << Tnaf.POW_2_WIDTH) | (bArr[2] << 8) | bArr[3]);
                }
            } else {
                byte[] bArr2 = this.zzb;
                int i4 = mpw0.f137957a;
                lev0.m153956d(bArr2.length == 4);
                strM159402O = String.valueOf(Float.intBitsToFloat((bArr2[3] & 255) | ((bArr2[1] & 255) << 16) | (bArr2[0] << 24) | ((bArr2[2] & 255) << 8)));
            }
        } else {
            strM159402O = mpw0.m159402O(this.zzb);
        }
        return "mdta: key=" + this.zza + ", value=" + strM159402O;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void mo13592a0(axs0 axs0Var) {
    }

    public zzgc(String str, byte[] bArr, int i, int i2) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }
}
