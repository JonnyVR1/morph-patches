package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import java.util.Arrays;
import p149l.far0;
import p149l.ggw0;
import p149l.uns0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagc extends zzagr {
    public static final Parcelable.Creator<zzagc> CREATOR = new far0();
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzagc(Parcel parcel) {
        super(ApicFrame.f7926ID);
        String string = parcel.readString();
        int i = ggw0.f102568a;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzagr, com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: Z */
    public final void mo13538Z(uns0 uns0Var) {
        uns0Var.m194517s(this.zzd, this.zzc);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagc.class == obj.getClass()) {
            zzagc zzagcVar = (zzagc) obj;
            if (this.zzc == zzagcVar.zzc && ggw0.m126064f(this.zza, zzagcVar.zza) && ggw0.m126064f(this.zzb, zzagcVar.zzb) && Arrays.equals(this.zzd, zzagcVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzagr
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzagc(String str, @Nullable String str2, int i, byte[] bArr) {
        super(ApicFrame.f7926ID);
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
