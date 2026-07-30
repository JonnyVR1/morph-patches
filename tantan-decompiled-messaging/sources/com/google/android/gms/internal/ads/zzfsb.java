package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.d8x0;
import p149l.daw0;
import p149l.phg0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
public final class zzfsb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfsb> CREATOR = new daw0();

    @SafeParcelable.VersionField(m12466id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", m12463id = 2, type = "byte[]")
    private C2200n zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfsb(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        C2200n c2200n = this.zzb;
        if (c2200n != null || this.zzc == null) {
            if (c2200n == null || this.zzc != null) {
                if (c2200n != null && this.zzc != null) {
                    qkq0.m175383a("Invalid internal representation - full");
                } else if (c2200n == null && this.zzc == null) {
                    qkq0.m175383a("Invalid internal representation - empty");
                } else {
                    qkq0.m175383a("Impossible");
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final C2200n m13749F() {
        if (this.zzb == null) {
            try {
                this.zzb = C2200n.m12938H0(this.zzc, d8x0.m110397a());
                this.zzc = null;
            } catch (zzhag | NullPointerException e) {
                phg0.m168968a(e);
                return null;
            }
        }
        zzb();
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArrM12744h = this.zzc;
        if (bArrM12744h == null) {
            bArrM12744h = this.zzb.m12744h();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrM12744h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
