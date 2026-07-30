package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import p149l.j7x0;
import p149l.yfq0;

/* JADX INFO: loaded from: classes7.dex */
class zzash extends zzasg {
    protected final byte[] zza;

    public zzash(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzask) || zzd() != ((zzask) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzash)) {
            return obj.equals(this);
        }
        zzash zzashVar = (zzash) obj;
        int iZzk = zzk();
        int iZzk2 = zzashVar.zzk();
        if (iZzk != 0 && iZzk2 != 0 && iZzk != iZzk2) {
            return false;
        }
        int iZzd = zzd();
        if (iZzd > zzashVar.zzd()) {
            j7x0.m140122a(iZzd, zzd());
            return false;
        }
        if (iZzd > zzashVar.zzd()) {
            yfq0.m214580a("Ran off end of other: 0, ", iZzd, ", ", zzashVar.zzd());
            return false;
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzashVar.zza;
        zzashVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < iZzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public final int zze(int i, int i2, int i3) {
        return zzaud.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public final zzask zzf(int i, int i2) {
        int iZzj = zzask.zzj(0, i2, zzd());
        return iZzj == 0 ? zzask.zzb : new zzasd(this.zza, 0, iZzj);
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public final void zzh(zzarz zzarzVar) throws IOException {
        zzarzVar.zza(this.zza, 0, zzd());
    }

    @Override // com.google.android.libraries.places.internal.zzask
    public final boolean zzi() {
        return zzaxc.zzf(this.zza, 0, zzd());
    }
}
