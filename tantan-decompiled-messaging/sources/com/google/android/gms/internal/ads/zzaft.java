package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p149l.ggw0;
import p149l.mhr0;
import p149l.p9r0;
import p149l.ter0;
import p149l.uns0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzaft implements zzbx {
    public static final Parcelable.Creator<zzaft> CREATOR;
    private static final mhr0 zzf;
    private static final mhr0 zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        ter0 ter0Var = new ter0();
        ter0Var.m188618w("application/id3");
        zzf = ter0Var.m188591D();
        ter0 ter0Var2 = new ter0();
        ter0Var2.m188618w("application/x-scte35");
        zzg = ter0Var2.m188591D();
        CREATOR = new p9r0();
    }

    public zzaft(Parcel parcel) {
        String string = parcel.readString();
        int i = ggw0.f102568a;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaft.class == obj.getClass()) {
            zzaft zzaftVar = (zzaft) obj;
            if (this.zzc == zzaftVar.zzc && this.zzd == zzaftVar.zzd && ggw0.m126064f(this.zza, zzaftVar.zza) && ggw0.m126064f(this.zzb, zzaftVar.zzb) && Arrays.equals(this.zze, zzaftVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13538Z(uns0 uns0Var) {
    }

    public zzaft(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
    }
}
