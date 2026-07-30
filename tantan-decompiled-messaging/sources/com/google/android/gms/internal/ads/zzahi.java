package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzahi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import p149l.f5v0;
import p149l.gbr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzahi implements Parcelable {
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public static final Comparator zza = new Comparator() { // from class: l.fbr0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            zzahi zzahiVar = (zzahi) obj;
            zzahi zzahiVar2 = (zzahi) obj2;
            return ahw0.m96742j().mo96745c(zzahiVar.zzb, zzahiVar2.zzb).mo96745c(zzahiVar.zzc, zzahiVar2.zzc).mo96744b(zzahiVar.zzd, zzahiVar2.zzd).mo96743a();
        }
    };
    public static final Parcelable.Creator<zzahi> CREATOR = new gbr0();

    public zzahi(long j, long j2, int i) {
        f5v0.m119533d(j < j2);
        this.zzb = j;
        this.zzc = j2;
        this.zzd = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahi.class == obj.getClass()) {
            zzahi zzahiVar = (zzahi) obj;
            if (this.zzb == zzahiVar.zzb && this.zzc == zzahiVar.zzc && this.zzd == zzahiVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeInt(this.zzd);
    }
}
