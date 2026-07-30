package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p153l.axs0;
import p153l.mpw0;
import p153l.wnw0;
import p153l.yir0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class zzafy implements zzbx {
    public static final Parcelable.Creator<zzafy> CREATOR = new yir0();
    public final String zza;
    public final String zzb;

    public zzafy(Parcel parcel) {
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: a0 */
    public final void mo13592a0(axs0 axs0Var) {
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    axs0Var.m100827v(this.zzb);
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    axs0Var.m100819I(this.zzb);
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    axs0Var.m100831z(this.zzb);
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    axs0Var.m100826u(this.zzb);
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    axs0Var.m100828w(this.zzb);
                }
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafy zzafyVar = (zzafy) obj;
            if (this.zza.equals(zzafyVar.zza) && this.zzb.equals(zzafyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzafy(String str, String str2) {
        this.zza = wnw0.m207229b(str);
        this.zzb = str2;
    }
}
