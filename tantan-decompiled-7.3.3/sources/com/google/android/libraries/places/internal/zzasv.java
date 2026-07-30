package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzasv extends zzass {
    private final OutputStream zzg;

    public zzasv(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.zzg = outputStream;
        } else {
            mnd0.m159157a("out");
            throw null;
        }
    }

    private final void zzH() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzI(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzH();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzJ() throws IOException {
        if (this.zzc > 0) {
            zzH();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzK(byte b) throws IOException {
        if (this.zzc == this.zzb) {
            zzH();
        }
        zzc(b);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzL(int i, boolean z) throws IOException {
        zzI(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzM(int i, zzask zzaskVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzaskVar.zzd());
        zzaskVar.zzh(this);
    }

    @Override // com.google.android.libraries.places.internal.zzasx, com.google.android.libraries.places.internal.zzarz
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzr(bArr, 0, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzh(int i, int i2) throws IOException {
        zzI(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzi(int i) throws IOException {
        zzI(4);
        zzd(i);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzj(int i, long j) throws IOException {
        zzI(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzk(long j) throws IOException {
        zzI(8);
        zze(j);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzl(int i, int i2) throws IOException {
        zzI(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg(i2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzn(int i, zzavf zzavfVar, zzavt zzavtVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zzart) zzavfVar).zzak(zzavtVar));
        zzavtVar.zzj(zzavfVar, this.zze);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzo(int i, zzavf zzavfVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzavfVar.zzaq());
        zzavfVar.zzaK(this);
        zzu(12);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzp(int i, zzask zzaskVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzM(3, zzaskVar);
        zzu(12);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        byte[] bArr2 = this.zza;
        if (i5 >= i2) {
            System.arraycopy(bArr, 0, bArr2, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i4, i5);
        this.zzc = this.zzb;
        this.zzd += i5;
        zzH();
        int i6 = i2 - i5;
        if (i6 <= this.zzb) {
            System.arraycopy(bArr, i5, this.zza, 0, i6);
            this.zzc = i6;
        } else {
            this.zzg.write(bArr, i5, i6);
        }
        this.zzd += i6;
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzt(int i, int i2) throws IOException {
        zzI(20);
        zzf(i << 3);
        zzf(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzu(int i) throws IOException {
        zzI(5);
        zzf(i);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzv(int i, long j) throws IOException {
        zzI(20);
        zzf(i << 3);
        zzg(j);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzw(long j) throws IOException {
        zzI(10);
        zzg(j);
    }

    public final void zzx(String str) throws IOException {
        int iZzc;
        try {
            int length = str.length() * 3;
            int iZzB = zzasx.zzB(length);
            int i = iZzB + length;
            int i2 = this.zzb;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int iZzb = zzaxc.zzb(str, bArr, 0, length);
                zzu(iZzb);
                zzr(bArr, 0, iZzb);
                return;
            }
            if (i > i2 - this.zzc) {
                zzH();
            }
            int iZzB2 = zzasx.zzB(str.length());
            int i3 = this.zzc;
            try {
                if (iZzB2 == iZzB) {
                    int i4 = i3 + iZzB2;
                    this.zzc = i4;
                    int iZzb2 = zzaxc.zzb(str, this.zza, i4, this.zzb - i4);
                    this.zzc = i3;
                    iZzc = (iZzb2 - i3) - iZzB2;
                    zzf(iZzc);
                    this.zzc = iZzb2;
                } else {
                    iZzc = zzaxc.zzc(str);
                    zzf(iZzc);
                    this.zzc = zzaxc.zzb(str, this.zza, this.zzc, iZzc);
                }
                this.zzd += iZzc;
            } catch (zzaxb e) {
                this.zzd -= this.zzc - i3;
                this.zzc = i3;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new zzasu(e2);
            }
        } catch (zzaxb e3) {
            zzF(str, e3);
        }
    }
}
