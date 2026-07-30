package org.spongycastle.pqc.crypto.gmss.util;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;

/* JADX INFO: loaded from: classes3.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* JADX INFO: renamed from: w */
    private int f206903w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i) {
        this.f206903w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d = i;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d);
        this.messagesize = iCeil;
        int log = getLog((iCeil << i) + 1);
        this.checksumsize = log;
        int iCeil2 = this.messagesize + ((int) Math.ceil(((double) log) / d));
        this.keysize = iCeil2;
        this.privateKeyOTS = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, iCeil2, this.mdsize);
        int i2 = this.mdsize;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (int i3 = 0; i3 < this.keysize; i3++) {
            this.privateKeyOTS[i3] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i = this.keysize;
        int i2 = this.mdsize;
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        byte[] bArr2 = new byte[i2];
        int i4 = 1 << this.f206903w;
        int i5 = 0;
        while (true) {
            int i6 = this.keysize;
            Digest digest = this.messDigestOTS;
            if (i5 >= i6) {
                digest.update(bArr, 0, i3);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr3, 0);
                return bArr3;
            }
            byte[] bArr4 = this.privateKeyOTS[i5];
            digest.update(bArr4, 0, bArr4.length);
            byte[] bArr5 = new byte[this.messDigestOTS.getDigestSize()];
            this.messDigestOTS.doFinal(bArr5, 0);
            for (int i7 = 2; i7 < i4; i7++) {
                this.messDigestOTS.update(bArr5, 0, bArr5.length);
                bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                this.messDigestOTS.doFinal(bArr5, 0);
            }
            int i8 = this.mdsize;
            System.arraycopy(bArr5, 0, bArr, i8 * i5, i8);
            i5++;
        }
    }

    public byte[] getSignature(byte[] bArr) {
        int i;
        int i2 = this.keysize;
        int i3 = this.mdsize;
        byte[] bArr2 = new byte[i2 * i3];
        byte[] bArr3 = new byte[i3];
        this.messDigestOTS.update(bArr, 0, bArr.length);
        int digestSize = this.messDigestOTS.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        this.messDigestOTS.doFinal(bArr4, 0);
        int i4 = this.f206903w;
        char c = '\b';
        boolean z = true;
        if (8 % i4 == 0) {
            int i5 = 8 / i4;
            int i6 = (1 << i4) - 1;
            byte[] bArr5 = new byte[this.mdsize];
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < digestSize; i9++) {
                for (int i10 = 0; i10 < i5; i10++) {
                    int i11 = bArr4[i9] & i6;
                    i7 += i11;
                    System.arraycopy(this.privateKeyOTS[i8], 0, bArr5, 0, this.mdsize);
                    while (i11 > 0) {
                        this.messDigestOTS.update(bArr5, 0, bArr5.length);
                        bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr5, 0);
                        i11--;
                    }
                    int i12 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr2, i8 * i12, i12);
                    bArr4[i9] = (byte) (bArr4[i9] >>> this.f206903w);
                    i8++;
                }
            }
            int i13 = (this.messagesize << this.f206903w) - i7;
            int i14 = 0;
            while (i14 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i8], 0, bArr5, 0, this.mdsize);
                for (int i15 = i13 & i6; i15 > 0; i15--) {
                    this.messDigestOTS.update(bArr5, 0, bArr5.length);
                    bArr5 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i16 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr2, i8 * i16, i16);
                int i17 = this.f206903w;
                i13 >>>= i17;
                i8++;
                i14 += i17;
            }
        } else if (i4 < 8) {
            int i18 = this.mdsize;
            int i19 = i18 / i4;
            int i20 = (1 << i4) - 1;
            byte[] bArr6 = new byte[i18];
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i21 < i19) {
                boolean z2 = z;
                long j = 0;
                for (int i25 = 0; i25 < this.f206903w; i25++) {
                    j ^= (long) ((bArr4[i22] & 255) << (i25 << 3));
                    i22++;
                }
                for (int i26 = 0; i26 < 8; i26++) {
                    int i27 = (int) (j & ((long) i20));
                    i24 += i27;
                    System.arraycopy(this.privateKeyOTS[i23], 0, bArr6, 0, this.mdsize);
                    while (i27 > 0) {
                        this.messDigestOTS.update(bArr6, 0, bArr6.length);
                        bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                        this.messDigestOTS.doFinal(bArr6, 0);
                        i27--;
                    }
                    int i28 = this.mdsize;
                    System.arraycopy(bArr6, 0, bArr2, i23 * i28, i28);
                    j >>>= this.f206903w;
                    i23++;
                }
                i21++;
                z = z2;
            }
            int i29 = this.mdsize % this.f206903w;
            int i30 = 0;
            long j2 = 0;
            while (i30 < i29) {
                j2 ^= (long) ((bArr4[i22] & 255) << (i30 << 3));
                i22++;
                i30++;
                i29 = i29;
            }
            int i31 = i29 << 3;
            int i32 = 0;
            while (i32 < i31) {
                int i33 = (int) (((long) i20) & j2);
                i24 += i33;
                System.arraycopy(this.privateKeyOTS[i23], 0, bArr6, 0, this.mdsize);
                while (i33 > 0) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                    i33--;
                }
                int i34 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i23 * i34, i34);
                int i35 = this.f206903w;
                j2 >>>= i35;
                i23++;
                i32 += i35;
            }
            int i36 = (this.messagesize << this.f206903w) - i24;
            int i37 = 0;
            while (i37 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i23], 0, bArr6, 0, this.mdsize);
                for (int i38 = i36 & i20; i38 > 0; i38--) {
                    this.messDigestOTS.update(bArr6, 0, bArr6.length);
                    bArr6 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr6, 0);
                }
                int i39 = this.mdsize;
                System.arraycopy(bArr6, 0, bArr2, i23 * i39, i39);
                int i40 = this.f206903w;
                i36 >>>= i40;
                i23++;
                i37 += i40;
            }
        } else if (i4 < 57) {
            int i41 = this.mdsize;
            int i42 = (i41 << 3) - i4;
            int i43 = (1 << i4) - 1;
            byte[] bArr7 = new byte[i41];
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            while (i44 <= i42) {
                int i47 = i44 >>> 3;
                int i48 = i44 % 8;
                i44 += this.f206903w;
                int i49 = (i44 + 7) >>> 3;
                long j3 = 0;
                int i50 = 0;
                while (i47 < i49) {
                    j3 ^= (long) ((bArr4[i47] & 255) << (i50 << 3));
                    i50++;
                    i47++;
                    c = c;
                }
                char c2 = c;
                long j4 = (j3 >>> i48) & ((long) i43);
                i46 = (int) (((long) i46) + j4);
                System.arraycopy(this.privateKeyOTS[i45], 0, bArr7, 0, this.mdsize);
                while (j4 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j4--;
                }
                int i51 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i45 * i51, i51);
                i45++;
                c = c2;
            }
            int i52 = i44 >>> 3;
            if (i52 < this.mdsize) {
                int i53 = i44 % 8;
                long j5 = 0;
                int i54 = 0;
                while (true) {
                    i = this.mdsize;
                    if (i52 >= i) {
                        break;
                    }
                    j5 ^= (long) ((bArr4[i52] & 255) << (i54 << 3));
                    i54++;
                    i52++;
                }
                long j6 = (j5 >>> i53) & ((long) i43);
                i46 = (int) (((long) i46) + j6);
                System.arraycopy(this.privateKeyOTS[i45], 0, bArr7, 0, i);
                while (j6 > 0) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                    j6--;
                }
                int i55 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i45 * i55, i55);
                i45++;
            }
            int i56 = (this.messagesize << this.f206903w) - i46;
            int i57 = 0;
            while (i57 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i45], 0, bArr7, 0, this.mdsize);
                for (long j7 = i56 & i43; j7 > 0; j7--) {
                    this.messDigestOTS.update(bArr7, 0, bArr7.length);
                    bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.messDigestOTS.doFinal(bArr7, 0);
                }
                int i58 = this.mdsize;
                System.arraycopy(bArr7, 0, bArr2, i45 * i58, i58);
                int i59 = this.f206903w;
                i56 >>>= i59;
                i45++;
                i57 += i59;
            }
        }
        return bArr2;
    }
}
