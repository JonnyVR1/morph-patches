package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p149l.ggw0;
import p149l.qew0;
import p149l.s9r0;
import p149l.uns0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class zzafy implements zzbx {
    public static final Parcelable.Creator<zzafy> CREATOR = new s9r0();
    public final String zza;
    public final String zzb;

    public zzafy(Parcel parcel) {
        String string = parcel.readString();
        int i = ggw0.f102568a;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbx
    /* JADX INFO: renamed from: Z */
    public final void mo13538Z(uns0 uns0Var) {
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    uns0Var.m194520v(this.zzb);
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    uns0Var.m194512I(this.zzb);
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    uns0Var.m194524z(this.zzb);
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    uns0Var.m194519u(this.zzb);
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    uns0Var.m194521w(this.zzb);
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
        this.zza = qew0.m174258b(str);
        this.zzb = str2;
    }
}
