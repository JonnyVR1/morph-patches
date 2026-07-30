package com.google.android.libraries.places.internal;

import java.io.IOException;
import p153l.gzi0;
import p153l.mnd0;

/* JADX INFO: loaded from: classes7.dex */
final class zzast extends zzasx {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzast(byte[] bArr, int i, int i2) {
        super(null);
        if (bArr == null) {
            mnd0.m159157a("buffer");
            throw null;
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            gzi0.m133102a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)});
            throw null;
        }
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzJ() {
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzK(byte b) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            this.zzc = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzL(int i, boolean z) throws IOException {
        zzu(i << 3);
        zzK(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzM(int i, zzask zzaskVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzaskVar.zzd());
        zzaskVar.zzh(this);
    }

    @Override // com.google.android.libraries.places.internal.zzasx, com.google.android.libraries.places.internal.zzarz
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, 0, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzh(int i, int i2) throws IOException {
        zzu((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzi(int i) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i2 = this.zzc;
            int i3 = i2 + 1;
            this.zzc = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.zzc = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.zzc = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zzc = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzj(int i, long j) throws IOException {
        zzu((i << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzk(long j) throws IOException {
        try {
            byte[] bArr = this.zza;
            int i = this.zzc;
            int i2 = i + 1;
            this.zzc = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.zzc = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.zzc = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.zzc = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.zzc = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.zzc = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.zzc = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zzc = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzl(int i, int i2) throws IOException {
        zzu(i << 3);
        zzm(i2);
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
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzB = zzasx.zzB(str.length() * 3);
            int iZzB2 = zzasx.zzB(str.length());
            if (iZzB2 != iZzB) {
                zzu(zzaxc.zzc(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzaxc.zzb(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + iZzB2;
            this.zzc = i3;
            int iZzb = zzaxc.zzb(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzu((iZzb - i) - iZzB2);
            this.zzc = iZzb;
        } catch (zzaxb e) {
            this.zzc = i;
            zzF(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzasu(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzt(int i, int i2) throws IOException {
        zzu(i << 3);
        zzu(i2);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzu(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.zza;
            if (i2 == 0) {
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.zzc;
                    this.zzc = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
                }
            }
            throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzv(int i, long j) throws IOException {
        zzu(i << 3);
        zzw(j);
    }

    @Override // com.google.android.libraries.places.internal.zzasx
    public final void zzw(long j) throws IOException {
        if (!zzasx.zzb || this.zzb - this.zzc < 10) {
            while (true) {
                long j2 = j & (-128);
                byte[] bArr = this.zza;
                if (j2 == 0) {
                    int i = this.zzc;
                    this.zzc = i + 1;
                    bArr[i] = (byte) j;
                    return;
                } else {
                    try {
                        int i2 = this.zzc;
                        this.zzc = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) | 128) & 255);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
                    }
                }
                throw new zzasu(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzc), Integer.valueOf(this.zzb), 1), e);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = (int) j;
            byte[] bArr2 = this.zza;
            if (j3 == 0) {
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                zzawx.zzn(bArr2, i4, (byte) i3);
                return;
            } else {
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                zzawx.zzn(bArr2, i5, (byte) ((i3 | 128) & 255));
                j >>>= 7;
            }
        }
    }
}
