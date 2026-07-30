package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import p149l.ggw0;
import p149l.qrs0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzby implements Parcelable {
    public static final Parcelable.Creator<zzby> CREATOR = new qrs0();
    public final long zza;
    private final zzbx[] zzb;

    public zzby(Parcel parcel) {
        this.zzb = new zzbx[parcel.readInt()];
        int i = 0;
        while (true) {
            zzbx[] zzbxVarArr = this.zzb;
            if (i >= zzbxVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzbxVarArr[i] = (zzbx) parcel.readParcelable(zzbx.class.getClassLoader());
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m13551a() {
        return this.zzb.length;
    }

    /* JADX INFO: renamed from: b */
    public final zzbx m13552b(int i) {
        return this.zzb[i];
    }

    /* JADX INFO: renamed from: c */
    public final zzby m13553c(zzbx... zzbxVarArr) {
        int length = zzbxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        zzbx[] zzbxVarArr2 = this.zzb;
        int i = ggw0.f102568a;
        int length2 = zzbxVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzbxVarArr2, length2 + length);
        System.arraycopy(zzbxVarArr, 0, objArrCopyOf, length2, length);
        return new zzby(j, (zzbx[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: d */
    public final zzby m13554d(@Nullable zzby zzbyVar) {
        return zzbyVar == null ? this : m13553c(zzbyVar.zzb);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzby.class == obj.getClass()) {
            zzby zzbyVar = (zzby) obj;
            if (Arrays.equals(this.zzb, zzbyVar.zzb) && this.zza == zzbyVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        long j = this.zza;
        String string = Arrays.toString(this.zzb);
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (zzbx zzbxVar : this.zzb) {
            parcel.writeParcelable(zzbxVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public zzby(long j, zzbx... zzbxVarArr) {
        this.zza = j;
        this.zzb = zzbxVarArr;
    }

    public zzby(List list) {
        this(-9223372036854775807L, (zzbx[]) list.toArray(new zzbx[0]));
    }
}
