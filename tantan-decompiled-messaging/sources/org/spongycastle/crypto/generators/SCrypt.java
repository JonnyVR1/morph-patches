package org.spongycastle.crypto.generators;

import com.google.android.gms.common.api.Api;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.engines.Salsa20Engine;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;
import p149l.ig3;
import p149l.skd0;

/* JADX INFO: loaded from: classes3.dex */
public class SCrypt {
    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            Xor(iArr2, iArr, i2, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
        System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] bArrSingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = bArrSingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(bArrSingleIterationPBKDF2, 0, iArr);
            int i6 = i5 >>> 2;
            for (int i7 = 0; i7 < length; i7 += i6) {
                SMix(iArr, i7, i, i2);
            }
            Pack.intToLittleEndian(iArr, bArrSingleIterationPBKDF2, 0);
            return SingleIterationPBKDF2(bArr, bArrSingleIterationPBKDF2, i4);
        } finally {
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
        }
    }

    private static void SMix(int[] iArr, int i, int i2, int i3) {
        int i4 = i3 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[][] iArr6 = new int[i2][];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i4);
            for (int i5 = 0; i5 < i2; i5++) {
                iArr6[i5] = Arrays.clone(iArr5);
                BlockMix(iArr5, iArr2, iArr3, iArr4, i3);
            }
            int i6 = i2 - 1;
            for (int i7 = 0; i7 < i2; i7++) {
                Xor(iArr5, iArr6[iArr5[i4 - 16] & i6], 0, iArr5);
                BlockMix(iArr5, iArr2, iArr3, iArr4, i3);
            }
            System.arraycopy(iArr5, 0, iArr, i, i4);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA256Digest());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            ig3.m135964a("Passphrase P must be provided.");
            return null;
        }
        if (bArr2 == null) {
            ig3.m135964a("Salt S must be provided.");
            return null;
        }
        if (i <= 1) {
            ig3.m135964a("Cost parameter N must be > 1.");
            return null;
        }
        if (i2 == 1 && i > 65536) {
            ig3.m135964a("Cost parameter N must be > 1 and < 65536.");
            return null;
        }
        if (i2 < 1) {
            ig3.m135964a("Block size r must be >= 1.");
            return null;
        }
        int i5 = Api.BaseClientBuilder.API_PRIORITY_OTHER / (i2 * 1024);
        if (i3 < 1 || i3 > i5) {
            skd0.m184586a("Parallelisation parameter p must be >= 1 and <= ", i5, " (based on block size r of ", i2, ")");
            return null;
        }
        if (i4 >= 1) {
            return MFcrypt(bArr, bArr2, i, i2, i3, i4);
        }
        ig3.m135964a("Generated key length dkLen must be >= 1.");
        return null;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
