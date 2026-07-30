package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p153l.cly0;
import p153l.fcr0;
import p153l.mpw0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzae implements Comparator<zzad>, Parcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new fcr0();

    @Nullable
    public final String zza;
    public final int zzb;
    private final zzad[] zzc;
    private int zzd;

    public zzae(Parcel parcel) {
        this.zza = parcel.readString();
        zzad[] zzadVarArr = (zzad[]) parcel.createTypedArray(zzad.CREATOR);
        int i = mpw0.f137957a;
        this.zzc = zzadVarArr;
        this.zzb = zzadVarArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final zzad m13590a(int i) {
        return this.zzc[i];
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public final zzae m13591b(@Nullable String str) {
        return mpw0.m159408f(this.zza, str) ? this : new zzae(str, false, this.zzc);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzad zzadVar, zzad zzadVar2) {
        zzad zzadVar3 = zzadVar;
        zzad zzadVar4 = zzadVar2;
        UUID uuid = cly0.f82438a;
        if (uuid.equals(zzadVar3.zza)) {
            return !uuid.equals(zzadVar4.zza) ? 1 : 0;
        }
        return zzadVar3.zza.compareTo(zzadVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzae.class == obj.getClass()) {
            zzae zzaeVar = (zzae) obj;
            if (mpw0.m159408f(this.zza, zzaeVar.zza) && Arrays.equals(this.zzc, zzaeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public zzae(@Nullable String str, boolean z, zzad... zzadVarArr) {
        this.zza = str;
        zzadVarArr = z ? (zzad[]) zzadVarArr.clone() : zzadVarArr;
        this.zzc = zzadVarArr;
        this.zzb = zzadVarArr.length;
        Arrays.sort(zzadVarArr, this);
    }

    public zzae(@Nullable String str, zzad... zzadVarArr) {
        this(null, true, zzadVarArr);
    }

    public zzae(List list) {
        this(null, false, (zzad[]) list.toArray(new zzad[0]));
    }
}
