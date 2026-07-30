package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dpq0;
import p153l.gig0;
import p153l.mlk0;
import p153l.vg3;
import p153l.vic0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbwb implements Cloneable, ByteChannel, zzbwd, zzbwc {

    @JvmField
    @Nullable
    public zzbwn zza;
    private long zzb;

    public final /* synthetic */ Object clone() {
        zzbwb zzbwbVar = new zzbwb();
        if (this.zzb == 0) {
            return zzbwbVar;
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        zzbwn zzbwnVarZzc = zzbwnVar.zzc();
        zzbwbVar.zza = zzbwnVarZzc;
        zzbwnVarZzc.zzh = zzbwnVarZzc;
        zzbwnVarZzc.zzg = zzbwnVarZzc;
        for (zzbwn zzbwnVar2 = zzbwnVar.zzg; zzbwnVar2 != zzbwnVar; zzbwnVar2 = zzbwnVar2.zzg) {
            zzbwn zzbwnVar3 = zzbwnVarZzc.zzh;
            zzbwnVar3.getClass();
            zzbwnVar2.getClass();
            zzbwnVar3.zzb(zzbwnVar2.zzc());
        }
        zzbwbVar.zzb = this.zzb;
        return zzbwbVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbws
    public final void close() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbwb)) {
            return false;
        }
        long j = this.zzb;
        zzbwb zzbwbVar = (zzbwb) obj;
        if (j != zzbwbVar.zzb) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        zzbwn zzbwnVar2 = zzbwbVar.zza;
        zzbwnVar2.getClass();
        int i = zzbwnVar.zzc;
        int i2 = zzbwnVar2.zzc;
        long j2 = 0;
        while (j2 < this.zzb) {
            long jMin = Math.min(zzbwnVar.zzd - i, zzbwnVar2.zzd - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (zzbwnVar.zzb[i] != zzbwnVar2.zzb[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == zzbwnVar.zzd) {
                zzbwnVar = zzbwnVar.zzg;
                zzbwnVar.getClass();
                i = zzbwnVar.zzc;
            }
            if (i2 == zzbwnVar2.zzd) {
                zzbwnVar2 = zzbwnVar2.zzg;
                zzbwnVar2.getClass();
                i2 = zzbwnVar2.zzc;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc, com.google.android.libraries.places.internal.zzbwq, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zzbwnVar.zzd;
            for (int i3 = zzbwnVar.zzc; i3 < i2; i3++) {
                i = (i * 31) + zzbwnVar.zzb[i3];
            }
            zzbwnVar = zzbwnVar.zzg;
            zzbwnVar.getClass();
        } while (zzbwnVar != this.zza);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        byteBuffer.getClass();
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zzbwnVar.zzd - zzbwnVar.zzc);
        byteBuffer.put(zzbwnVar.zzb, zzbwnVar.zzc, iMin);
        int i = zzbwnVar.zzc + iMin;
        zzbwnVar.zzc = i;
        this.zzb -= (long) iMin;
        if (i == zzbwnVar.zzd) {
            this.zza = zzbwnVar.zza();
            zzbwo.zzb(zzbwnVar);
        }
        return iMin;
    }

    @NotNull
    public final String toString() {
        return zzz().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            zzbwn zzbwnVarZzB = zzB(1);
            int iMin = Math.min(i, 8192 - zzbwnVarZzB.zzd);
            byteBuffer.get(zzbwnVarZzB.zzb, zzbwnVarZzB.zzd, iMin);
            i -= iMin;
            zzbwnVarZzB.zzd += iMin;
        }
        this.zzb += (long) iRemaining;
        return iRemaining;
    }

    @NotNull
    public final zzbwf zzA(int i) {
        if (i == 0) {
            return zzbwf.zzb;
        }
        zzbvv.zzb(this.zzb, 0L, i);
        zzbwn zzbwnVar = this.zza;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            zzbwnVar.getClass();
            int i5 = zzbwnVar.zzd;
            int i6 = zzbwnVar.zzc;
            if (i5 == i6) {
                gig0.m130323a("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            zzbwnVar = zzbwnVar.zzg;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 + i4];
        zzbwn zzbwnVar2 = this.zza;
        int i7 = 0;
        while (i2 < i) {
            zzbwnVar2.getClass();
            bArr[i7] = zzbwnVar2.zzb;
            i2 += zzbwnVar2.zzd - zzbwnVar2.zzc;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = zzbwnVar2.zzc;
            zzbwnVar2.zze = true;
            i7++;
            zzbwnVar2 = zzbwnVar2.zzg;
        }
        return new zzbwp(bArr, iArr);
    }

    @NotNull
    public final zzbwn zzB(int i) {
        if (i <= 0) {
            wg3.m206174a("unexpected capacity");
            return null;
        }
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar == null) {
            zzbwn zzbwnVarZza = zzbwo.zza();
            this.zza = zzbwnVarZza;
            zzbwnVarZza.zzh = zzbwnVarZza;
            zzbwnVarZza.zzg = zzbwnVarZza;
            return zzbwnVarZza;
        }
        zzbwn zzbwnVar2 = zzbwnVar.zzh;
        zzbwnVar2.getClass();
        if (zzbwnVar2.zzd + i <= 8192 && zzbwnVar2.zzf) {
            return zzbwnVar2;
        }
        zzbwn zzbwnVarZza2 = zzbwo.zza();
        zzbwnVar2.zzb(zzbwnVarZza2);
        return zzbwnVarZza2;
    }

    public final short zzC() throws EOFException {
        int iZzc;
        if (this.zzb < 2) {
            throw new EOFException(null);
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        int i = zzbwnVar.zzc;
        int i2 = zzbwnVar.zzd;
        if (i2 - i < 2) {
            iZzc = (zzc() & 255) | ((zzc() & 255) << 8);
        } else {
            byte[] bArr = zzbwnVar.zzb;
            int i3 = (bArr[i] & 255) << 8;
            int i4 = bArr[i + 1] & 255;
            this.zzb -= 2;
            int i5 = i + 2;
            if (i5 == i2) {
                this.zza = zzbwnVar.zza();
                zzbwo.zzb(zzbwnVar);
            } else {
                zzbwnVar.zzc = i5;
            }
            iZzc = i3 | i4;
        }
        return (short) iZzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zzD(long j) throws EOFException {
        throw null;
    }

    public final void zzE(long j) {
        this.zzb = j;
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final void zzF(long j) throws EOFException {
        while (j > 0) {
            zzbwn zzbwnVar = this.zza;
            if (zzbwnVar == null) {
                throw new EOFException(null);
            }
            int iMin = (int) Math.min(j, zzbwnVar.zzd - zzbwnVar.zzc);
            long j2 = iMin;
            this.zzb -= j2;
            j -= j2;
            int i = zzbwnVar.zzc + iMin;
            zzbwnVar.zzc = i;
            if (i == zzbwnVar.zzd) {
                this.zza = zzbwnVar.zza();
                zzbwo.zzb(zzbwnVar);
            }
        }
    }

    public final boolean zzG() {
        return this.zzb == 0;
    }

    @NotNull
    public final byte[] zzH(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            mlk0.m158922a("byteCount: ", j);
            return null;
        }
        if (this.zzb < j) {
            throw new EOFException(null);
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iZzd = zzd(bArr, i2, i - i2);
            if (iZzd == -1) {
                throw new EOFException(null);
            }
            i2 += iZzd;
        }
        return bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbws
    public final long zza(@NotNull zzbwb zzbwbVar, long j) {
        zzbwbVar.getClass();
        if (j < 0) {
            mlk0.m158922a("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.zzb;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        zzbwbVar.zzn(this, j);
        return j;
    }

    @JvmName
    public final byte zzb(long j) {
        zzbvv.zzb(this.zzb, j, 1L);
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        long j2 = this.zzb;
        if (j2 - j < j) {
            while (j2 > j) {
                zzbwnVar = zzbwnVar.zzh;
                zzbwnVar.getClass();
                j2 -= (long) (zzbwnVar.zzd - zzbwnVar.zzc);
            }
            return zzbwnVar.zzb[(int) ((((long) zzbwnVar.zzc) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = zzbwnVar.zzd;
            int i2 = zzbwnVar.zzc;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return zzbwnVar.zzb[(int) ((((long) i2) + j) - j3)];
            }
            zzbwnVar = zzbwnVar.zzg;
            zzbwnVar.getClass();
            j3 = j4;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final byte zzc() throws EOFException {
        if (this.zzb == 0) {
            throw new EOFException(null);
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        int i = zzbwnVar.zzc;
        int i2 = zzbwnVar.zzd;
        int i3 = i + 1;
        byte b = zzbwnVar.zzb[i];
        this.zzb--;
        if (i3 != i2) {
            zzbwnVar.zzc = i3;
            return b;
        }
        this.zza = zzbwnVar.zza();
        zzbwo.zzb(zzbwnVar);
        return b;
    }

    public final int zzd(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        zzbvv.zzb(bArr.length, i, i2);
        zzbwn zzbwnVar = this.zza;
        if (zzbwnVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, zzbwnVar.zzd - zzbwnVar.zzc);
        int i3 = zzbwnVar.zzc;
        ArraysKt.copyInto(zzbwnVar.zzb, bArr, i, i3, i3 + iMin);
        int i4 = zzbwnVar.zzc + iMin;
        zzbwnVar.zzc = i4;
        this.zzb -= (long) iMin;
        if (i4 != zzbwnVar.zzd) {
            return iMin;
        }
        this.zza = zzbwnVar.zza();
        zzbwo.zzb(zzbwnVar);
        return iMin;
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    public final int zze() throws EOFException {
        if (this.zzb < 4) {
            throw new EOFException(null);
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        int i = zzbwnVar.zzc;
        int i2 = zzbwnVar.zzd;
        if (i2 - i < 4) {
            return (zzc() & 255) | ((zzc() & 255) << 24) | ((zzc() & 255) << 16) | ((zzc() & 255) << 8);
        }
        byte[] bArr = zzbwnVar.zzb;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = (bArr[i + 1] & 255) << 16;
        int i5 = (bArr[i + 2] & 255) << 8;
        int i6 = bArr[i + 3] & 255;
        this.zzb -= 4;
        int i7 = i6 | i4 | i3 | i5;
        int i8 = i + 4;
        if (i8 != i2) {
            zzbwnVar.zzc = i8;
            return i7;
        }
        this.zza = zzbwnVar.zza();
        zzbwo.zzb(zzbwnVar);
        return i7;
    }

    public final long zzf() {
        long j = this.zzb;
        if (j == 0) {
            return 0L;
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        zzbwn zzbwnVar2 = zzbwnVar.zzh;
        zzbwnVar2.getClass();
        int i = zzbwnVar2.zzd;
        return (i >= 8192 || !zzbwnVar2.zzf) ? j : j - ((long) (i - zzbwnVar2.zzc));
    }

    @JvmName
    public final long zzg() {
        return this.zzb;
    }

    @NotNull
    public final String zzh(long j, @NotNull Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            mlk0.m158922a("byteCount: ", j);
            return null;
        }
        if (this.zzb < j) {
            vg3.m201207a();
            return null;
        }
        if (j == 0) {
            return "";
        }
        zzbwn zzbwnVar = this.zza;
        zzbwnVar.getClass();
        int i = zzbwnVar.zzc;
        int i2 = zzbwnVar.zzd;
        if (((long) i) + j > i2) {
            return new String(zzH(j), charset);
        }
        int i3 = (int) j;
        String str = new String(zzbwnVar.zzb, i, i3, charset);
        int i4 = i + i3;
        zzbwnVar.zzc = i4;
        this.zzb -= j;
        if (i4 == i2) {
            this.zza = zzbwnVar.zza();
            zzbwo.zzb(zzbwnVar);
        }
        return str;
    }

    @NotNull
    public final String zzi() {
        return zzh(this.zzb, Charsets.UTF_8);
    }

    @NotNull
    public final String zzj(long j) throws EOFException {
        zzbwn zzbwnVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = this.zzb;
        long j7 = j6 < Long.MAX_VALUE ? j6 : Long.MAX_VALUE;
        long j8 = 0;
        if (j7 == 0 || (zzbwnVar = this.zza) == null) {
            j2 = 0;
            j5 = -1;
            j3 = -1;
        } else if (j6 < 0) {
            while (j6 > 0) {
                zzbwnVar = zzbwnVar.zzh;
                zzbwnVar.getClass();
                j6 -= (long) (zzbwnVar.zzd - zzbwnVar.zzc);
            }
            long j9 = 0;
            while (true) {
                if (j6 < j7) {
                    byte[] bArr = zzbwnVar.zzb;
                    j2 = j8;
                    j3 = -1;
                    int iMin = (int) Math.min(zzbwnVar.zzd, (((long) zzbwnVar.zzc) + j7) - j6);
                    int i = (int) ((((long) zzbwnVar.zzc) + j9) - j6);
                    while (true) {
                        if (i >= iMin) {
                            j9 = j6 + ((long) (zzbwnVar.zzd - zzbwnVar.zzc));
                            zzbwnVar = zzbwnVar.zzg;
                            zzbwnVar.getClass();
                            j8 = j2;
                            j6 = j9;
                        } else if (bArr[i] == 10) {
                            j4 = i - zzbwnVar.zzc;
                            j5 = j4 + j6;
                        } else {
                            i++;
                        }
                    }
                } else {
                    j2 = j8;
                    j3 = -1;
                    j5 = j3;
                }
            }
        } else {
            j2 = 0;
            j3 = -1;
            j6 = 0;
            while (true) {
                long j10 = ((long) (zzbwnVar.zzd - zzbwnVar.zzc)) + j6;
                if (j10 > 0) {
                    break;
                }
                zzbwnVar = zzbwnVar.zzg;
                zzbwnVar.getClass();
                j6 = j10;
            }
            long j11 = 0;
            while (true) {
                if (j6 < j7) {
                    byte[] bArr2 = zzbwnVar.zzb;
                    int iMin2 = (int) Math.min(zzbwnVar.zzd, (((long) zzbwnVar.zzc) + j7) - j6);
                    int i2 = (int) ((((long) zzbwnVar.zzc) + j11) - j6);
                    while (true) {
                        if (i2 >= iMin2) {
                            j11 = ((long) (zzbwnVar.zzd - zzbwnVar.zzc)) + j6;
                            zzbwnVar = zzbwnVar.zzg;
                            zzbwnVar.getClass();
                            j6 = j11;
                        } else if (bArr2[i2] == 10) {
                            j4 = i2 - zzbwnVar.zzc;
                            j5 = j4 + j6;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    j5 = j3;
                }
            }
        }
        if (j5 != j3) {
            int i3 = zzbwx.zza;
            if (j5 > j2) {
                long j12 = j5 + j3;
                if (zzb(j12) == 13) {
                    String strZzh = zzh(j12, Charsets.UTF_8);
                    zzF(2L);
                    return strZzh;
                }
            }
            String strZzh2 = zzh(j5, Charsets.UTF_8);
            zzF(1L);
            return strZzh2;
        }
        zzbwb zzbwbVar = new zzbwb();
        long jMin = Math.min(32L, this.zzb);
        zzbvv.zzb(this.zzb, 0L, jMin);
        if (jMin != j2) {
            zzbwbVar.zzb += jMin;
            zzbwn zzbwnVar2 = this.zza;
            long j13 = j2;
            while (true) {
                zzbwnVar2.getClass();
                long j14 = zzbwnVar2.zzd - zzbwnVar2.zzc;
                if (j13 < j14) {
                    break;
                }
                zzbwnVar2 = zzbwnVar2.zzg;
                j13 -= j14;
            }
            while (jMin > j2) {
                zzbwnVar2.getClass();
                zzbwn zzbwnVarZzc = zzbwnVar2.zzc();
                int i4 = zzbwnVarZzc.zzc + ((int) j13);
                zzbwnVarZzc.zzc = i4;
                zzbwnVarZzc.zzd = Math.min(i4 + ((int) jMin), zzbwnVarZzc.zzd);
                zzbwn zzbwnVar3 = zzbwbVar.zza;
                if (zzbwnVar3 == null) {
                    zzbwnVarZzc.zzh = zzbwnVarZzc;
                    zzbwnVarZzc.zzg = zzbwnVarZzc;
                    zzbwbVar.zza = zzbwnVarZzc;
                } else {
                    zzbwn zzbwnVar4 = zzbwnVar3.zzh;
                    zzbwnVar4.getClass();
                    zzbwnVar4.zzb(zzbwnVarZzc);
                }
                jMin -= (long) (zzbwnVarZzc.zzd - zzbwnVarZzc.zzc);
                zzbwnVar2 = zzbwnVar2.zzg;
                j13 = j2;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(this.zzb, Long.MAX_VALUE) + " content=" + zzbwbVar.zzy(zzbwbVar.zzb).zze() + "…");
    }

    @NotNull
    public final zzbwb zzk(@NotNull zzbwf zzbwfVar) {
        zzbwfVar.getClass();
        zzbwfVar.zzj(this, 0, zzbwfVar.zzc());
        return this;
    }

    @NotNull
    public final zzbwb zzl(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        zzbvv.zzb(bArr.length, i, j);
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            if (i3 >= i4) {
                this.zzb += j;
                return this;
            }
            zzbwn zzbwnVarZzB = zzB(1);
            int iMin = Math.min(i4 - i3, 8192 - zzbwnVarZzB.zzd);
            int i5 = i3 + iMin;
            ArraysKt.copyInto(bArr, zzbwnVarZzB.zzb, zzbwnVarZzB.zzd, i3, i5);
            zzbwnVarZzB.zzd += iMin;
            i3 = i5;
        }
    }

    @NotNull
    public final zzbwb zzm(int i) {
        zzbwn zzbwnVarZzB = zzB(1);
        byte[] bArr = zzbwnVarZzB.zzb;
        int i2 = zzbwnVarZzB.zzd;
        zzbwnVarZzB.zzd = i2 + 1;
        bArr[i2] = (byte) i;
        this.zzb++;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzn(@NotNull zzbwb zzbwbVar, long j) {
        zzbwbVar.getClass();
        if (zzbwbVar == this) {
            wg3.m206174a("source == this");
            return;
        }
        zzbvv.zzb(zzbwbVar.zzb, 0L, j);
        while (j > 0) {
            zzbwn zzbwnVar = zzbwbVar.zza;
            zzbwnVar.getClass();
            int i = zzbwnVar.zzd;
            zzbwn zzbwnVar2 = zzbwbVar.zza;
            zzbwnVar2.getClass();
            long j2 = i - zzbwnVar2.zzc;
            int i2 = 0;
            if (j < j2) {
                zzbwn zzbwnVar3 = this.zza;
                zzbwn zzbwnVar4 = zzbwnVar3 != null ? zzbwnVar3.zzh : null;
                int i3 = (int) j;
                if (zzbwnVar4 != null && zzbwnVar4.zzf) {
                    if ((((long) zzbwnVar4.zzd) + j) - ((long) (zzbwnVar4.zze ? 0 : zzbwnVar4.zzc)) <= 8192) {
                        zzbwn zzbwnVar5 = zzbwbVar.zza;
                        zzbwnVar5.getClass();
                        zzbwnVar5.zze(zzbwnVar4, i3);
                        zzbwbVar.zzb -= j;
                        this.zzb += j;
                        return;
                    }
                }
                zzbwn zzbwnVar6 = zzbwbVar.zza;
                zzbwnVar6.getClass();
                zzbwbVar.zza = zzbwnVar6.zzd(i3);
            }
            zzbwn zzbwnVar7 = zzbwbVar.zza;
            zzbwnVar7.getClass();
            int i4 = zzbwnVar7.zzd - zzbwnVar7.zzc;
            zzbwbVar.zza = zzbwnVar7.zza();
            zzbwn zzbwnVar8 = this.zza;
            if (zzbwnVar8 == null) {
                this.zza = zzbwnVar7;
                zzbwnVar7.zzh = zzbwnVar7;
                zzbwnVar7.zzg = zzbwnVar7;
            } else {
                zzbwn zzbwnVar9 = zzbwnVar8.zzh;
                zzbwnVar9.getClass();
                zzbwnVar9.zzb(zzbwnVar7);
                zzbwn zzbwnVar10 = zzbwnVar7.zzh;
                if (zzbwnVar10 == zzbwnVar7) {
                    wtq0.m207906a("cannot compact");
                    return;
                }
                zzbwnVar10.getClass();
                if (zzbwnVar10.zzf) {
                    int i5 = zzbwnVar7.zzd - zzbwnVar7.zzc;
                    zzbwn zzbwnVar11 = zzbwnVar7.zzh;
                    zzbwnVar11.getClass();
                    int i6 = 8192 - zzbwnVar11.zzd;
                    zzbwn zzbwnVar12 = zzbwnVar7.zzh;
                    zzbwnVar12.getClass();
                    if (!zzbwnVar12.zze) {
                        zzbwn zzbwnVar13 = zzbwnVar7.zzh;
                        zzbwnVar13.getClass();
                        i2 = zzbwnVar13.zzc;
                    }
                    if (i5 <= i6 + i2) {
                        zzbwn zzbwnVar14 = zzbwnVar7.zzh;
                        zzbwnVar14.getClass();
                        zzbwnVar7.zze(zzbwnVar14, i5);
                        zzbwnVar7.zza();
                        zzbwo.zzb(zzbwnVar7);
                    }
                }
            }
            long j3 = i4;
            zzbwbVar.zzb -= j3;
            this.zzb += j3;
            j -= j3;
        }
    }

    @NotNull
    public final zzbwb zzo(long j) {
        if (j == 0) {
            zzm(48);
            return this;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 - ((j5 >>> 1) & 6148914691236517205L);
        long j7 = ((j6 >>> 2) & 3689348814741910323L) + (j6 & 3689348814741910323L);
        long j8 = ((j7 >>> 4) + j7) & 1085102592571150095L;
        long j9 = j8 + (j8 >>> 8);
        long j10 = j9 + (j9 >>> 16);
        int i = (int) ((((j10 & 63) + ((j10 >>> 32) & 63)) + 3) >> 2);
        zzbwn zzbwnVarZzB = zzB(i);
        byte[] bArr = zzbwnVarZzB.zzb;
        int i2 = zzbwnVarZzB.zzd;
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i2) {
                zzbwnVarZzB.zzd += i;
                this.zzb += (long) i;
                return this;
            }
            bArr[i3] = zzbwx.zza()[(int) (15 & j)];
            j >>>= 4;
        }
    }

    @NotNull
    public final zzbwb zzp(int i) {
        zzbwn zzbwnVarZzB = zzB(4);
        byte[] bArr = zzbwnVarZzB.zzb;
        int i2 = zzbwnVarZzB.zzd;
        bArr[i2] = (byte) (i >> 24);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zzbwnVarZzB.zzd = i2 + 4;
        this.zzb += 4;
        return this;
    }

    @NotNull
    public final zzbwb zzq(int i) {
        zzbwn zzbwnVarZzB = zzB(2);
        byte[] bArr = zzbwnVarZzB.zzb;
        int i2 = zzbwnVarZzB.zzd;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        zzbwnVarZzB.zzd = i2 + 2;
        this.zzb += 2;
        return this;
    }

    @JvmOverloads
    @NotNull
    public final zzbwb zzr(@NotNull OutputStream outputStream, long j) throws IOException {
        outputStream.getClass();
        zzbvv.zzb(this.zzb, 0L, j);
        zzbwn zzbwnVar = this.zza;
        long j2 = j;
        while (j2 > 0) {
            zzbwnVar.getClass();
            int iMin = (int) Math.min(j2, zzbwnVar.zzd - zzbwnVar.zzc);
            outputStream.write(zzbwnVar.zzb, zzbwnVar.zzc, iMin);
            int i = zzbwnVar.zzc + iMin;
            zzbwnVar.zzc = i;
            long j3 = iMin;
            this.zzb -= j3;
            j2 -= j3;
            if (i == zzbwnVar.zzd) {
                zzbwn zzbwnVarZza = zzbwnVar.zza();
                this.zza = zzbwnVarZza;
                zzbwo.zzb(zzbwnVar);
                zzbwnVar = zzbwnVarZza;
            }
        }
        return this;
    }

    @NotNull
    public final zzbwb zzs(@NotNull String str) {
        str.getClass();
        zzt(str, 0, str.length());
        return this;
    }

    @NotNull
    public final zzbwb zzt(@NotNull String str, int i, int i2) {
        str.getClass();
        if (i2 < 0) {
            vic0.m201333a("endIndex < beginIndex: ", i2, " < 0");
            return null;
        }
        if (i2 > str.length()) {
            dpq0.m117417a("endIndex > string.length: ", i2, " > ", str.length());
            return null;
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                zzbwn zzbwnVarZzB = zzB(1);
                byte[] bArr = zzbwnVarZzB.zzb;
                int i5 = zzbwnVarZzB.zzd - i3;
                int iMin = Math.min(i2, 8192 - i5);
                bArr[i3 + i5] = (byte) cCharAt;
                i3 = i4;
                while (i3 < iMin) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i3 + i5] = (byte) cCharAt2;
                    i3++;
                }
                int i6 = zzbwnVarZzB.zzd;
                int i7 = (i5 + i3) - i6;
                zzbwnVarZzB.zzd = i6 + i7;
                this.zzb += (long) i7;
            } else {
                if (cCharAt < 2048) {
                    zzbwn zzbwnVarZzB2 = zzB(2);
                    byte[] bArr2 = zzbwnVarZzB2.zzb;
                    int i8 = zzbwnVarZzB2.zzd;
                    bArr2[i8] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt & '?') | 128);
                    zzbwnVarZzB2.zzd = i8 + 2;
                    this.zzb += 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    zzbwn zzbwnVarZzB3 = zzB(3);
                    byte[] bArr3 = zzbwnVarZzB3.zzb;
                    int i9 = zzbwnVarZzB3.zzd;
                    bArr3[i9] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt & '?') | 128);
                    zzbwnVarZzB3.zzd = i9 + 3;
                    this.zzb += 3;
                } else {
                    char cCharAt3 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 >= 57344) {
                        zzm(63);
                    } else {
                        zzbwn zzbwnVarZzB4 = zzB(4);
                        byte[] bArr4 = zzbwnVarZzB4.zzb;
                        int i10 = zzbwnVarZzB4.zzd;
                        int i11 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        bArr4[i10] = (byte) ((i11 >> 18) | 240);
                        bArr4[i10 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i10 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i10 + 3] = (byte) ((i11 & 63) | 128);
                        zzbwnVarZzB4.zzd = i10 + 4;
                        this.zzb += 4;
                        i3 += 2;
                    }
                }
                i3 = i4;
            }
        }
        return this;
    }

    @NotNull
    public final zzbwb zzu(int i) {
        if (i < 128) {
            zzm(i);
            return this;
        }
        if (i < 2048) {
            zzbwn zzbwnVarZzB = zzB(2);
            byte[] bArr = zzbwnVarZzB.zzb;
            int i2 = zzbwnVarZzB.zzd;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            zzbwnVarZzB.zzd = i2 + 2;
            this.zzb += 2;
            return this;
        }
        if (i >= 55296 && i < 57344) {
            zzm(63);
            return this;
        }
        if (i < 65536) {
            zzbwn zzbwnVarZzB2 = zzB(3);
            byte[] bArr2 = zzbwnVarZzB2.zzb;
            int i3 = zzbwnVarZzB2.zzd;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            zzbwnVarZzB2.zzd = i3 + 3;
            this.zzb += 3;
            return this;
        }
        if (i > 1114111) {
            wg3.m206174a("Unexpected code point: 0x".concat(String.valueOf(zzbvv.zza(i))));
            return null;
        }
        zzbwn zzbwnVarZzB3 = zzB(4);
        byte[] bArr3 = zzbwnVarZzB3.zzb;
        int i4 = zzbwnVarZzB3.zzd;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        zzbwnVarZzB3.zzd = i4 + 4;
        this.zzb += 4;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final /* bridge */ /* synthetic */ zzbwc zzv(int i) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final /* bridge */ /* synthetic */ zzbwc zzw(int i) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    public final /* bridge */ /* synthetic */ zzbwc zzx(String str) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbwd
    @NotNull
    public final zzbwf zzy(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            mlk0.m158922a("byteCount: ", j);
            return null;
        }
        if (this.zzb < j) {
            throw new EOFException(null);
        }
        if (j < 4096) {
            return new zzbwf(zzH(j));
        }
        zzbwf zzbwfVarZzA = zzA((int) j);
        zzF(j);
        return zzbwfVarZzA;
    }

    @NotNull
    public final zzbwf zzz() {
        long j = this.zzb;
        if (j <= 2147483647L) {
            return zzA((int) j);
        }
        throw new IllegalStateException("size > Int.MAX_VALUE: " + j);
    }
}
