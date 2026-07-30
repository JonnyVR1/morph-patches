package com.google.android.gms.internal.measurement;

import java.io.IOException;
import p149l.ctx0;
import p149l.j7x0;
import p149l.pmx0;
import p149l.yfq0;

/* JADX INFO: loaded from: classes6.dex */
class zziv extends zzis {
    protected final byte[] zzb;

    public zziv(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzik) || zzb() != ((zzik) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zziv)) {
            return obj.equals(this);
        }
        zziv zzivVar = (zziv) obj;
        int iZza = zza();
        int iZza2 = zzivVar.zza();
        if (iZza == 0 || iZza2 == 0 || iZza == iZza2) {
            return zza(zzivVar, 0, zzb());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final boolean zza(zzik zzikVar, int i, int i2) {
        if (i2 > zzikVar.zzb()) {
            j7x0.m140122a(i2, zzb());
            return false;
        }
        if (i2 > zzikVar.zzb()) {
            yfq0.m214580a("Ran off end of other: 0, ", i2, ", ", zzikVar.zzb());
            return false;
        }
        if (!(zzikVar instanceof zziv)) {
            return zzikVar.zza(0, i2).equals(zza(0, i2));
        }
        zziv zzivVar = (zziv) zzikVar;
        byte[] bArr = this.zzb;
        byte[] bArr2 = zzivVar.zzb;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzivVar.zzc();
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final int zzb(int i, int i2, int i3) {
        return ctx0.m108703a(i, this.zzb, zzc(), i3);
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final zzik zza(int i, int i2) {
        int iZza = zzik.zza(0, i2, zzb());
        if (iZza == 0) {
            return zzik.zza;
        }
        return new zzio(this.zzb, zzc(), iZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public final void zza(pmx0 pmx0Var) throws IOException {
        pmx0Var.mo14713a(this.zzb, zzc(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzik
    public byte zza(int i) {
        return this.zzb[i];
    }
}
