package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.jhx0;
import p153l.jjw0;
import p153l.wtq0;
import p153l.xpg0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
public final class zzfsb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfsb> CREATOR = new jjw0();

    @SafeParcelable.VersionField(m12520id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", m12517id = 2, type = "byte[]")
    private C2223n zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfsb(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        C2223n c2223n = this.zzb;
        if (c2223n != null || this.zzc == null) {
            if (c2223n == null || this.zzc != null) {
                if (c2223n != null && this.zzc != null) {
                    wtq0.m207906a("Invalid internal representation - full");
                } else if (c2223n == null && this.zzc == null) {
                    wtq0.m207906a("Invalid internal representation - empty");
                } else {
                    wtq0.m207906a("Impossible");
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final C2223n m13803F() {
        if (this.zzb == null) {
            try {
                this.zzb = C2223n.m12992H0(this.zzc, jhx0.m144944a());
                this.zzc = null;
            } catch (zzhag | NullPointerException e) {
                xpg0.m212648a(e);
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
        byte[] bArrM12798h = this.zzc;
        if (bArrM12798h == null) {
            bArrM12798h = this.zzb.m12798h();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrM12798h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
