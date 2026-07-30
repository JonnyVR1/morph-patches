package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p153l.mjr0;
import p153l.mpw0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzage extends zzagr {
    public static final Parcelable.Creator<zzage> CREATOR = new mjr0();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzage(Parcel parcel) {
        String string = parcel.readString();
        int i = mpw0.f137957a;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzage.class == obj.getClass()) {
            zzage zzageVar = (zzage) obj;
            if (this.zzf.equals(zzageVar.zzf) && Arrays.equals(this.zza, zzageVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzage(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
