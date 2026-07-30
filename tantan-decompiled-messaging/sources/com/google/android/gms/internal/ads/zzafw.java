package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p149l.ggw0;
import p149l.r9r0;
import p149l.uns0;
import p149l.uys0;
import p149l.v6w0;
import p149l.wew0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzafw implements zzbx {
    public static final Parcelable.Creator<zzafw> CREATOR = new r9r0();
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
        int i = ggw0.f102568a;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static zzafw m13539a(v6w0 v6w0Var) {
        int iM197273v = v6w0Var.m197273v();
        String strM196368e = uys0.m196368e(v6w0Var.m197252a(v6w0Var.m197273v(), wew0.f185988a));
        String strM197252a = v6w0Var.m197252a(v6w0Var.m197273v(), wew0.f185990c);
        int iM197273v2 = v6w0Var.m197273v();
        int iM197273v3 = v6w0Var.m197273v();
        int iM197273v4 = v6w0Var.m197273v();
        int iM197273v5 = v6w0Var.m197273v();
        int iM197273v6 = v6w0Var.m197273v();
        byte[] bArr = new byte[iM197273v6];
        v6w0Var.m197258g(bArr, 0, iM197273v6);
        return new zzafw(iM197273v, strM196368e, strM197252a, iM197273v2, iM197273v3, iM197273v4, iM197273v5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: Z */
    public final void mo13538Z(uns0 uns0Var) {
        uns0Var.m194517s(this.zzh, this.zza);
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
