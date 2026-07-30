package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;
import p153l.axs0;
import p153l.kkr0;
import p153l.lev0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzahj implements zzbx {
    public static final Parcelable.Creator<zzahj> CREATOR = new kkr0();
    public final List zza;

    public zzahj(List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzahi) list.get(0)).zzc;
            for (int i = 1; i < list.size(); i++) {
                if (((zzahi) list.get(i)).zzb < j) {
                    z = true;
                    break;
                }
                j = ((zzahi) list.get(i)).zzc;
            }
        }
        lev0.m153956d(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahj.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzahj) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void mo13592a0(axs0 axs0Var) {
    }
}
