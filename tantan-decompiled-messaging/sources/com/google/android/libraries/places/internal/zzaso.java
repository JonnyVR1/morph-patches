package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p149l.ob5;

/* JADX INFO: loaded from: classes7.dex */
final class zzaso extends zzasq {
    private final InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzaso(InputStream inputStream, int i, zzasn zzasnVar) {
        super(null);
        this.zzm = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        byte[] bArr = zzaud.zzd;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final List zzL(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.zzf.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw zzauf.zzj();
                }
                this.zzl += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzM() {
        int i = this.zzh + this.zzi;
        this.zzh = i;
        int i2 = this.zzl + i;
        int i3 = this.zzm;
        if (i2 <= i3) {
            this.zzi = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzi = i4;
        this.zzh = i - i4;
    }

    private final void zzN(int i) throws IOException {
        if (zzO(i)) {
            return;
        }
        if (i <= (this.zzc - this.zzl) - this.zzj) {
            throw zzauf.zzj();
        }
        throw zzauf.zzi();
    }

    private final boolean zzO(int i) throws IOException {
        int i2 = this.zzj;
        int i3 = i2 + i;
        int i4 = this.zzh;
        if (i3 <= i4) {
            ob5.m163410a("refillBuffer() called when ", i, " bytes were already available in buffer");
            return false;
        }
        int i5 = this.zzc;
        int i6 = this.zzl;
        if (i > (i5 - i6) - i2 || i6 + i2 + i > this.zzm) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i6 = this.zzl + i2;
            this.zzl = i6;
            i4 = this.zzh - i2;
            this.zzh = i4;
            this.zzj = 0;
        }
        try {
            int i7 = this.zzf.read(this.zzg, i4, Math.min(4096 - i4, (this.zzc - i6) - i4));
            if (i7 == 0 || i7 < -1 || i7 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 <= 0) {
                return false;
            }
            this.zzh += i7;
            zzM();
            if (this.zzh >= i) {
                return true;
            }
            return zzO(i);
        } catch (zzauf e) {
            e.zzk();
            throw e;
        }
    }

    private final byte[] zzP(int i, boolean z) throws IOException {
        byte[] bArrZzQ = zzQ(i);
        if (bArrZzQ != null) {
            return bArrZzQ;
        }
        int i2 = this.zzj;
        int i3 = this.zzh;
        int i4 = i3 - i2;
        this.zzl += i3;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzL = zzL(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzg, i2, bArr, 0, i4);
        for (byte[] bArr2 : listZzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzQ(int i) throws IOException {
        if (i == 0) {
            return zzaud.zzd;
        }
        int i2 = this.zzl;
        int i3 = this.zzj;
        int i4 = i2 + i3 + i;
        if (i4 - this.zzc > 0) {
            throw zzauf.zzi();
        }
        int i5 = this.zzm;
        if (i4 > i5) {
            zzB((i5 - i2) - i3);
            throw zzauf.zzj();
        }
        int i6 = this.zzh - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.zzf.available()) {
                    return null;
                }
            } catch (zzauf e) {
                e.zzk();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i6);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i6 < i) {
            try {
                int i8 = this.zzf.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw zzauf.zzj();
                }
                this.zzl += i8;
                i6 += i8;
            } catch (zzauf e2) {
                e2.zzk();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final void zzA(int i) {
        this.zzm = i;
        zzM();
    }

    public final void zzB(int i) throws IOException {
        int i2 = this.zzh;
        int i3 = this.zzj;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzj = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzauf.zzf();
        }
        int i5 = this.zzl;
        int i6 = i5 + i3;
        int i7 = this.zzm;
        if (i6 + i > i7) {
            zzB((i7 - i5) - i3);
            throw zzauf.zzj();
        }
        this.zzl = i6;
        this.zzh = 0;
        this.zzj = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long jSkip = this.zzf.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.zzf.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (zzauf e) {
                    e.zzk();
                    throw e;
                }
            } catch (Throwable th) {
                this.zzl += i4;
                zzM();
                throw th;
            }
        }
        this.zzl += i4;
        zzM();
        if (i4 >= i) {
            return;
        }
        int i8 = this.zzh;
        int i9 = i8 - this.zzj;
        this.zzj = i8;
        zzN(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzh;
            if (i10 <= i11) {
                this.zzj = i10;
                return;
            } else {
                i9 += i11;
                this.zzj = i11;
                zzN(1);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final boolean zzC() throws IOException {
        return this.zzj == this.zzh && !zzO(1);
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final boolean zzD() throws IOException {
        return zzr() != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final boolean zzE(int i) throws IOException {
        int iZzm;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i3 < 10) {
                    if (zza() < 0) {
                        i3++;
                    }
                }
                throw zzauf.zze();
            }
            while (i3 < 10) {
                byte[] bArr = this.zzg;
                int i4 = this.zzj;
                this.zzj = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzauf.zze();
            return true;
        }
        if (i2 == 1) {
            zzB(8);
            return true;
        }
        if (i2 == 2) {
            zzB(zzj());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzauf.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws IOException {
        if (this.zzj == this.zzh) {
            zzN(1);
        }
        byte[] bArr = this.zzg;
        int i = this.zzj;
        this.zzj = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzd() {
        return this.zzl + this.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zze(int i) throws zzauf {
        if (i < 0) {
            throw zzauf.zzf();
        }
        int i2 = this.zzl + this.zzj;
        int i3 = this.zzm;
        int i4 = i + i2;
        if (i4 > i3) {
            throw zzauf.zzj();
        }
        this.zzm = i4;
        zzM();
        return i3;
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzf() throws IOException {
        return zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzg() throws IOException {
        return zzi();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzh() throws IOException {
        return zzj();
    }

    public final int zzi() throws IOException {
        int i = this.zzj;
        if (this.zzh - i < 4) {
            zzN(4);
            i = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final int zzj() throws IOException {
        int i;
        int i2 = this.zzj;
        int i3 = this.zzh;
        if (i3 != i2) {
            byte[] bArr = this.zzg;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzj = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzj = i5;
                return i;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzk() throws IOException {
        return zzi();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzl() throws IOException {
        return zzasq.zzF(zzj());
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzm() throws IOException {
        if (zzC()) {
            this.zzk = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzk = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzauf.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final int zzn() throws IOException {
        return zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final long zzo() throws IOException {
        return zzq();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final long zzp() throws IOException {
        return zzr();
    }

    public final long zzq() throws IOException {
        int i = this.zzj;
        if (this.zzh - i < 8) {
            zzN(8);
            i = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long zzr() throws IOException {
        long j;
        long j2;
        int i = this.zzj;
        int i2 = this.zzh;
        if (i2 != i) {
            byte[] bArr = this.zzg;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzj = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (((long) bArr[i6]) << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i10]) << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.zzj = i4;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZza = zza();
            j |= ((long) (bZza & 127)) << i;
            if ((bZza & 128) == 0) {
                return j;
            }
        }
        throw zzauf.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final long zzt() throws IOException {
        return zzq();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final long zzu() throws IOException {
        return zzasq.zzH(zzr());
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final long zzv() throws IOException {
        return zzr();
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final zzask zzw() throws IOException {
        int iZzj = zzj();
        int i = this.zzh;
        int i2 = this.zzj;
        if (iZzj <= i - i2 && iZzj > 0) {
            zzask zzaskVarZzl = zzask.zzl(this.zzg, i2, iZzj);
            this.zzj += iZzj;
            return zzaskVarZzl;
        }
        if (iZzj == 0) {
            return zzask.zzb;
        }
        if (iZzj < 0) {
            throw zzauf.zzf();
        }
        byte[] bArrZzQ = zzQ(iZzj);
        if (bArrZzQ != null) {
            return zzask.zzl(bArrZzQ, 0, bArrZzQ.length);
        }
        int i3 = this.zzj;
        int i4 = this.zzh;
        int i5 = i4 - i3;
        this.zzl += i4;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzL = zzL(iZzj - i5);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzg, i3, bArr, 0, i5);
        for (byte[] bArr2 : listZzL) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new zzash(bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final String zzx() throws IOException {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i = this.zzh;
            int i2 = this.zzj;
            if (iZzj <= i - i2) {
                String str = new String(this.zzg, i2, iZzj, zzaud.zzb);
                this.zzj += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzauf.zzf();
        }
        if (iZzj > this.zzh) {
            return new String(zzP(iZzj, false), zzaud.zzb);
        }
        zzN(iZzj);
        String str2 = new String(this.zzg, this.zzj, iZzj, zzaud.zzb);
        this.zzj += iZzj;
        return str2;
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final String zzy() throws IOException {
        byte[] bArrZzP;
        int iZzj = zzj();
        int i = this.zzj;
        int i2 = this.zzh;
        if (iZzj <= i2 - i && iZzj > 0) {
            bArrZzP = this.zzg;
            this.zzj = i + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw zzauf.zzf();
            }
            i = 0;
            if (iZzj <= i2) {
                zzN(iZzj);
                bArrZzP = this.zzg;
                this.zzj = iZzj;
            } else {
                bArrZzP = zzP(iZzj, false);
            }
        }
        return zzaxc.zzd(bArrZzP, i, iZzj);
    }

    @Override // com.google.android.libraries.places.internal.zzasq
    public final void zzz(int i) throws zzauf {
        if (this.zzk != i) {
            throw zzauf.zzb();
        }
    }
}
