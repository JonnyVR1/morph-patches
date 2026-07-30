package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p153l.a8t0;
import p153l.axs0;
import p153l.bgw0;
import p153l.cow0;
import p153l.mpw0;
import p153l.xir0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzafw implements zzbx {
    public static final Parcelable.Creator<zzafw> CREATOR = new xir0();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafw(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static zzafw m13593a(bgw0 bgw0Var) {
        int iM104280v = bgw0Var.m104280v();
        String strM96493e = a8t0.m96493e(bgw0Var.m104259a(bgw0Var.m104280v(), cow0.f82929a));
        String strM104259a = bgw0Var.m104259a(bgw0Var.m104280v(), cow0.f82931c);
        int iM104280v2 = bgw0Var.m104280v();
        int iM104280v3 = bgw0Var.m104280v();
        int iM104280v4 = bgw0Var.m104280v();
        int iM104280v5 = bgw0Var.m104280v();
        int iM104280v6 = bgw0Var.m104280v();
        byte[] bArr = new byte[iM104280v6];
        bgw0Var.m104265g(bArr, 0, iM104280v6);
        return new zzafw(iM104280v, strM96493e, strM104259a, iM104280v2, iM104280v3, iM104280v4, iM104280v5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: a0 */
    public final void mo13592a0(axs0 axs0Var) {
        axs0Var.m100824s(this.zzh, this.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza == zzafwVar.zza && this.zzb.equals(zzafwVar.zzb) && this.zzc.equals(zzafwVar.zzc) && this.zzd == zzafwVar.zzd && this.zze == zzafwVar.zze && this.zzf == zzafwVar.zzf && this.zzg == zzafwVar.zzg && Arrays.equals(this.zzh, zzafwVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    public zzafw(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }
}
