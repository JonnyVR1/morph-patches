package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import p149l.ggw0;
import p149l.iar0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzagi extends zzagr {
    public static final Parcelable.Creator<zzagi> CREATOR = new iar0();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagr[] zze;

    public zzagi(Parcel parcel) {
        super(ChapterTocFrame.f7928ID);
        String string = parcel.readString();
        int i = ggw0.f102568a;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.zze = new zzagr[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (zzagr) parcel.readParcelable(zzagr.class.getClassLoader());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagi.class == obj.getClass()) {
            zzagi zzagiVar = (zzagi) obj;
            if (this.zzb == zzagiVar.zzb && this.zzc == zzagiVar.zzc && ggw0.m126064f(this.zza, zzagiVar.zza) && Arrays.equals(this.zzd, zzagiVar.zzd) && Arrays.equals(this.zze, zzagiVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzagr zzagrVar : this.zze) {
            parcel.writeParcelable(zzagrVar, 0);
        }
    }

    public zzagi(String str, boolean z, boolean z2, String[] strArr, zzagr[] zzagrVarArr) {
        super(ChapterTocFrame.f7928ID);
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzagrVarArr;
    }
}
