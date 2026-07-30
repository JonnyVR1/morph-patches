package org.spongycastle.crypto.engines;

import l.ig3;
import l.qkq0;
import l.x9g0;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.TweakableBlockCipherParameters;
import p003l.npk0;
import p003l.pac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* JADX INFO: renamed from: kw */
    private long[] f10215kw;

    /* JADX INFO: renamed from: t */
    private long[] f10216t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f10217kw;
            long[] jArr4 = this.f10218t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                x9g0.a();
                return;
            }
            if (jArr4.length != 5) {
                x9g0.a();
                return;
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            int i2 = 9;
            long j10 = jArr[9];
            long j11 = jArr[10];
            long jXorRotr = jArr[11];
            long j12 = jArr[12];
            long j13 = jArr[13];
            long j14 = jArr[14];
            long jXorRotr2 = jArr[15];
            int i3 = 19;
            while (i3 >= i) {
                int i4 = iArr[i3];
                int i5 = iArr2[i3];
                int i6 = i4 + 1;
                long j15 = j - jArr3[i6];
                int i7 = i4 + 2;
                long j16 = j2 - jArr3[i7];
                int i8 = i4 + 3;
                long j17 = j3 - jArr3[i8];
                int i9 = i4 + 4;
                long j18 = j4 - jArr3[i9];
                int i10 = i4 + 5;
                int i11 = i;
                long j19 = j5 - jArr3[i10];
                int i12 = i4 + 6;
                long j20 = j6 - jArr3[i12];
                int i13 = i4 + 7;
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                long j21 = j7 - jArr3[i13];
                int i14 = i4 + 8;
                int[] iArr3 = iArr;
                long j22 = j8 - jArr6[i14];
                int i15 = i4 + 9;
                long j23 = j9 - jArr6[i15];
                int i16 = i4 + 10;
                long j24 = j10 - jArr6[i16];
                int i17 = i4 + 11;
                long j25 = j11 - jArr6[i17];
                int i18 = i4 + 12;
                long j26 = jXorRotr - jArr6[i18];
                int i19 = i4 + 13;
                long j27 = j12 - jArr6[i19];
                int i20 = i4 + 14;
                int i21 = i5 + 1;
                long j28 = j13 - (jArr6[i20] + jArr5[i21]);
                int i22 = i4 + 15;
                long j29 = j14 - (jArr6[i22] + jArr5[i5 + 2]);
                long j30 = i3;
                long jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr2 - ((jArr6[i4 + 16] + j30) + 1), i2, j15);
                long j31 = j15 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j26, 48, j17);
                long j32 = j17 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j28, 35, j21);
                long j33 = j21 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j24, 52, j19);
                long j34 = j19 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j16, 23, j29);
                long j35 = j29 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j20, 31, j23);
                long j36 = j23 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j18, 37, j25);
                long j37 = j25 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(j22, 20, j27);
                long j38 = j27 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr10, 31, j31);
                long j39 = j31 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 44, j32);
                long j40 = j32 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr9, 47, j34);
                long j41 = j34 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr7, 46, j33);
                long j42 = j33 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr3, 19, j38);
                long j43 = j38 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr5, 42, j35);
                long j44 = j35 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr4, 44, j36);
                long j45 = j36 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr6, 25, j37);
                long j46 = j37 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr18, 16, j39);
                long j47 = j39 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 34, j40);
                long j48 = j40 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr17, 56, j42);
                long j49 = j42 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr15, 51, j41);
                long j50 = j41 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr11, 4, j46);
                long j51 = j46 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr13, 53, j43);
                long j52 = j43 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr12, 42, j44);
                long j53 = j44 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr14, 41, j45);
                long j54 = j45 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr26, 41, j47);
                long j55 = j47 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 9, j48);
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr25, 37, j50);
                long j56 = j50 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr23, 31, j49);
                long j57 = j49 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr19, 12, j54);
                long j58 = j54 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr21, 47, j51);
                long j59 = j51 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr20, 44, j52);
                long j60 = j52 - jXorRotr33;
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr22, 30, j53);
                long j61 = j53 - jXorRotr34;
                long j62 = j55 - jArr6[i4];
                long j63 = jXorRotr27 - jArr6[i6];
                long j64 = (j48 - jXorRotr28) - jArr6[i7];
                long j65 = jXorRotr28 - jArr6[i8];
                long j66 = j56 - jArr6[i9];
                long j67 = jXorRotr29 - jArr6[i10];
                long j68 = j57 - jArr6[i12];
                long j69 = jXorRotr30 - jArr6[i13];
                long j70 = j58 - jArr6[i14];
                long j71 = jXorRotr31 - jArr6[i15];
                long j72 = j59 - jArr6[i16];
                long j73 = jXorRotr32 - jArr6[i17];
                long j74 = j60 - jArr6[i18];
                long j75 = jXorRotr33 - (jArr6[i19] + jArr5[i5]);
                long j76 = j61 - (jArr6[i20] + jArr5[i21]);
                long jXorRotr35 = ThreefishEngine.xorRotr(jXorRotr34 - (jArr6[i22] + j30), 5, j62);
                long j77 = j62 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j73, 20, j64);
                long j78 = j64 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j75, 48, j68);
                long j79 = j68 - jXorRotr37;
                int i23 = i3;
                long jXorRotr38 = ThreefishEngine.xorRotr(j71, 41, j66);
                long j80 = j66 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j63, 47, j76);
                long j81 = j76 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j67, 28, j70);
                long j82 = j70 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j65, 16, j72);
                long j83 = j72 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(j69, 25, j74);
                long j84 = j74 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr42, 33, j77);
                long j85 = j77 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 4, j78);
                long j86 = j78 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr41, 51, j80);
                long j87 = j80 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr39, 13, j79);
                long j88 = j79 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr35, 34, j84);
                long j89 = j84 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr37, 41, j81);
                long j90 = j81 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr36, 59, j82);
                long j91 = j82 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr38, 17, j83);
                long j92 = j83 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr50, 38, j85);
                long j93 = j85 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 19, j86);
                long j94 = j86 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr49, 10, j88);
                long j95 = j88 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr47, 55, j87);
                long j96 = j87 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr43, 49, j92);
                long j97 = j92 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr45, 18, j89);
                long j98 = j89 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr44, 23, j90);
                long j99 = j90 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr46, 52, j91);
                long j100 = j91 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr58, 24, j93);
                long j101 = j93 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 13, j94);
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr57, 8, j96);
                long j102 = j96 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr55, 47, j95);
                long j103 = j95 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr51, 8, j100);
                long j104 = j100 - jXorRotr63;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 17, j97);
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr52, 22, j98);
                j12 = j98 - jXorRotr64;
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr54, 37, j99);
                j14 = j99 - jXorRotr2;
                j13 = jXorRotr64;
                j8 = jXorRotr62;
                jArr3 = jArr6;
                jArr4 = jArr5;
                iArr2 = iArr2;
                j11 = j97 - jXorRotr;
                j9 = j104;
                j6 = jXorRotr61;
                i2 = 9;
                i3 = i23 - 2;
                j = j101;
                iArr = iArr3;
                j10 = jXorRotr63;
                j5 = j102;
                j4 = jXorRotr60;
                i = i11;
                j3 = j94 - jXorRotr60;
                j2 = jXorRotr59;
                j7 = j103;
            }
            long[] jArr7 = jArr4;
            long[] jArr8 = jArr3;
            int i24 = i;
            long j105 = j - jArr8[0];
            long j106 = j2 - jArr8[i24];
            long j107 = j3 - jArr8[2];
            long j108 = j4 - jArr8[3];
            long j109 = j5 - jArr8[4];
            long j110 = j6 - jArr8[5];
            long j111 = j7 - jArr8[6];
            long j112 = j8 - jArr8[7];
            long j113 = j9 - jArr8[8];
            long j114 = j10 - jArr8[9];
            long j115 = j11 - jArr8[10];
            long j116 = jXorRotr - jArr8[11];
            long j117 = j12 - jArr8[12];
            long j118 = j13 - (jArr8[13] + jArr7[0]);
            long j119 = j14 - (jArr8[14] + jArr7[i24]);
            long j120 = jXorRotr2 - jArr8[15];
            jArr2[0] = j105;
            jArr2[i24] = j106;
            jArr2[2] = j107;
            jArr2[3] = j108;
            jArr2[4] = j109;
            jArr2[5] = j110;
            jArr2[6] = j111;
            jArr2[7] = j112;
            jArr2[8] = j113;
            jArr2[9] = j114;
            jArr2[10] = j115;
            jArr2[11] = j116;
            jArr2[12] = j117;
            jArr2[13] = j118;
            jArr2[14] = j119;
            jArr2[15] = j120;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f10217kw;
            long[] jArr4 = this.f10218t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                x9g0.a();
                return;
            }
            if (jArr4.length != 5) {
                x9g0.a();
                return;
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            int i = 9;
            long j13 = jArr[12];
            int i2 = 12;
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = j + jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = j4 + jArr3[3];
            long j21 = j5 + jArr3[4];
            long j22 = j6 + jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = j8 + jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = j10 + jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = j12 + jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = j14 + jArr3[13] + jArr4[0];
            long j31 = j15 + jArr3[14] + jArr4[1];
            long j32 = j22;
            long j33 = j24;
            long j34 = j26;
            long j35 = j28;
            long j36 = j30;
            long j37 = j16 + jArr3[15];
            long j38 = j21;
            int i3 = 1;
            long j39 = j20;
            long j40 = j17;
            while (i3 < 20) {
                int i4 = iArr[i3];
                int i5 = iArr2[i3];
                long j41 = j40 + j18;
                long jRotlXor = ThreefishEngine.rotlXor(j18, 24, j41);
                long j42 = j19 + j39;
                long jRotlXor2 = ThreefishEngine.rotlXor(j39, 13, j42);
                long j43 = j38 + j32;
                long jRotlXor3 = ThreefishEngine.rotlXor(j32, 8, j43);
                long j44 = j33;
                long j45 = j23 + j44;
                long jRotlXor4 = ThreefishEngine.rotlXor(j44, 47, j45);
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                int[] iArr3 = iArr;
                long j46 = j34;
                long j47 = j25 + j46;
                long jRotlXor5 = ThreefishEngine.rotlXor(j46, 8, j47);
                long j48 = j35;
                long j49 = j27 + j48;
                long jRotlXor6 = ThreefishEngine.rotlXor(j48, 17, j49);
                long j50 = j36;
                long j51 = j29 + j50;
                long jRotlXor7 = ThreefishEngine.rotlXor(j50, 22, j51);
                long j52 = j37;
                long j53 = j31 + j52;
                long jRotlXor8 = ThreefishEngine.rotlXor(j52, 37, j53);
                long j54 = j41 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j54);
                long j55 = j42 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j55);
                long j56 = j45 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j56);
                long j57 = j43 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j57);
                long j58 = j49 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, 49, j58);
                long j59 = j51 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j59);
                long j60 = j53 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j60);
                long j61 = j47 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j61);
                long j62 = j54 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j62);
                long j63 = j55 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j63);
                long j64 = j57 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j64);
                long j65 = j56 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j65);
                long j66 = j59 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j66);
                long j67 = j60 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j67);
                long j68 = j61 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j68);
                long j69 = j58 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j69);
                long j70 = j62 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j70);
                long j71 = j63 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j71);
                long j72 = j65 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j72);
                long j73 = j64 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j73);
                long j74 = j67 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j74);
                long j75 = j68 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j75);
                long j76 = j69 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j76);
                long j77 = j66 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j77);
                long j78 = j70 + jArr6[i4];
                int i6 = i4 + 1;
                long j79 = jRotlXor29 + jArr6[i6];
                int i7 = i4 + 2;
                long j80 = j71 + jArr6[i7];
                int i8 = i4 + 3;
                long j81 = jRotlXor31 + jArr6[i8];
                int i9 = i4 + 4;
                long j82 = j73 + jArr6[i9];
                int i10 = i4 + 5;
                long j83 = jRotlXor30 + jArr6[i10];
                int i11 = i4 + 6;
                long j84 = j72 + jArr6[i11];
                int i12 = i4 + 7;
                long j85 = jRotlXor32 + jArr6[i12];
                int i13 = i4 + 8;
                long j86 = j75 + jArr6[i13];
                int i14 = i4 + 9;
                long j87 = jRotlXor28 + jArr6[i14];
                int i15 = i4 + 10;
                long j88 = j76 + jArr6[i15];
                int i16 = i4 + 11;
                long j89 = jRotlXor26 + jArr6[i16];
                int i17 = i4 + 12;
                long j90 = j77 + jArr6[i17];
                int i18 = i4 + 13;
                long j91 = jRotlXor27 + jArr6[i18] + jArr5[i5];
                int i19 = i4 + 14;
                int i20 = i5 + 1;
                long j92 = j74 + jArr6[i19] + jArr5[i20];
                int i21 = i4 + 15;
                long j93 = i3;
                long j94 = jRotlXor25 + jArr6[i21] + j93;
                long j95 = j78 + j79;
                long jRotlXor33 = ThreefishEngine.rotlXor(j79, 41, j95);
                long j96 = j80 + j81;
                long jRotlXor34 = ThreefishEngine.rotlXor(j81, i, j96);
                long j97 = j82 + j83;
                long jRotlXor35 = ThreefishEngine.rotlXor(j83, 37, j97);
                long j98 = j84 + j85;
                long jRotlXor36 = ThreefishEngine.rotlXor(j85, 31, j98);
                long j99 = j86 + j87;
                long jRotlXor37 = ThreefishEngine.rotlXor(j87, i2, j99);
                long j100 = j88 + j89;
                long jRotlXor38 = ThreefishEngine.rotlXor(j89, 47, j100);
                long j101 = j90 + j91;
                long jRotlXor39 = ThreefishEngine.rotlXor(j91, 44, j101);
                long j102 = j92 + j94;
                long jRotlXor40 = ThreefishEngine.rotlXor(j94, 30, j102);
                long j103 = j95 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j103);
                long j104 = j96 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j104);
                long j105 = j98 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j105);
                long j106 = j97 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j106);
                long j107 = j100 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j107);
                long j108 = j101 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j108);
                long j109 = j102 + jRotlXor35;
                int i22 = i3;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j109);
                long j110 = j99 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j110);
                long j111 = j103 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j111);
                long j112 = j104 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j112);
                long j113 = j106 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j113);
                long j114 = j105 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j114);
                long j115 = j108 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j115);
                long j116 = j109 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j116);
                long j117 = j110 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j117);
                long j118 = j107 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j118);
                long j119 = j111 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j119);
                long j120 = j112 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j120);
                long j121 = j114 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j121);
                long j122 = j113 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j122);
                long j123 = j116 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j123);
                long j124 = j117 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j124);
                long j125 = j118 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j125);
                long j126 = j115 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j126);
                long j127 = jArr6[i6] + j119;
                long j128 = jRotlXor61 + jArr6[i7];
                long j129 = j120 + jArr6[i8];
                long j130 = jRotlXor63 + jArr6[i9];
                long j131 = j122 + jArr6[i10];
                long j132 = jRotlXor62 + jArr6[i11];
                long j133 = j121 + jArr6[i12];
                long j134 = jRotlXor64 + jArr6[i13];
                long j135 = j124 + jArr6[i14];
                j34 = jRotlXor60 + jArr6[i15];
                long j136 = j125 + jArr6[i16];
                long j137 = jRotlXor58 + jArr6[i17];
                long j138 = j126 + jArr6[i18];
                j36 = jRotlXor59 + jArr6[i19] + jArr5[i20];
                j31 = j123 + jArr6[i21] + jArr5[i5 + 2];
                j37 = jRotlXor57 + jArr6[i4 + 16] + j93 + 1;
                j33 = j134;
                j23 = j133;
                j35 = j137;
                j39 = j130;
                jArr3 = jArr6;
                jArr4 = jArr5;
                i = 9;
                i2 = 12;
                j40 = j127;
                j25 = j135;
                j18 = j128;
                j32 = j132;
                j27 = j136;
                j19 = j129;
                i3 = i22 + 2;
                j38 = j131;
                j29 = j138;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j40;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j39;
            jArr2[4] = j38;
            jArr2[5] = j32;
            jArr2[6] = j23;
            jArr2[7] = j33;
            jArr2[8] = j25;
            jArr2[9] = j34;
            jArr2[10] = j27;
            jArr2[11] = j35;
            jArr2[12] = j29;
            jArr2[13] = j36;
            jArr2[14] = j31;
            jArr2[15] = j37;
        }
    }

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f10217kw;
            long[] jArr4 = this.f10218t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                x9g0.a();
                return;
            }
            if (jArr4.length != 5) {
                x9g0.a();
                return;
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            char c = 2;
            long j3 = jArr[2];
            char c2 = 3;
            long j4 = jArr[3];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j5 = j - jArr3[i5];
                int i6 = i3 + 2;
                int i7 = i4 + 1;
                long j6 = j2 - (jArr3[i6] + jArr4[i7]);
                int i8 = i3 + 3;
                long j7 = j3 - (jArr3[i8] + jArr4[i4 + 2]);
                char c3 = c2;
                long j8 = i2;
                int i9 = i;
                long jXorRotr = ThreefishEngine.xorRotr(j4 - ((jArr3[i3 + 4] + j8) + 1), 32, j5);
                long j9 = j5 - jXorRotr;
                long jXorRotr2 = ThreefishEngine.xorRotr(j6, 32, j7);
                long j10 = j7 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr2, 58, j9);
                long j11 = j9 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr, 22, j10);
                long j12 = j10 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr4, 46, j11);
                long j13 = j11 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr3, 12, j12);
                long j14 = j12 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr6, 25, j13);
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr5, 33, j14);
                long j15 = (j13 - jXorRotr7) - jArr3[i3];
                long j16 = jXorRotr7 - (jArr3[i5] + jArr4[i4]);
                long j17 = (j14 - jXorRotr8) - (jArr3[i6] + jArr4[i7]);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr8 - (jArr3[i8] + j8), 5, j15);
                long j18 = j15 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(j16, 37, j17);
                long j19 = j17 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr10, 23, j18);
                long j20 = j18 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr9, 40, j19);
                long j21 = j19 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr12, 52, j20);
                long j22 = j20 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr11, 57, j21);
                long j23 = j21 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr14, 14, j22);
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr13, 16, j23);
                j3 = j23 - jXorRotr16;
                i2 -= 2;
                i = i9;
                j4 = jXorRotr16;
                c = c;
                j = j22 - jXorRotr15;
                c2 = c3;
                j2 = jXorRotr15;
            }
            char c4 = c;
            char c5 = c2;
            int i10 = i;
            long j24 = j - jArr3[0];
            long j25 = j2 - (jArr3[i10] + jArr4[0]);
            long j26 = j3 - (jArr3[c4] + jArr4[i10]);
            long j27 = j4 - jArr3[c5];
            jArr2[0] = j24;
            jArr2[i10] = j25;
            jArr2[c4] = j26;
            jArr2[c5] = j27;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f10217kw;
            long[] jArr4 = this.f10218t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                x9g0.a();
                return;
            }
            int i = 5;
            if (jArr4.length != 5) {
                x9g0.a();
                return;
            }
            long j = jArr[0];
            boolean z = true;
            long j2 = jArr[1];
            long j3 = jArr[2];
            char c = 3;
            long j4 = jArr[3];
            long j5 = j + jArr3[0];
            long j6 = j2 + jArr3[1] + jArr4[0];
            long j7 = j3 + jArr3[2] + jArr4[1];
            int i2 = 1;
            long j8 = j4 + jArr3[3];
            long j9 = j7;
            while (i2 < 18) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                long j10 = j5 + j6;
                boolean z2 = z;
                long jRotlXor = ThreefishEngine.rotlXor(j6, 14, j10);
                char c2 = c;
                long j11 = j9 + j8;
                long jRotlXor2 = ThreefishEngine.rotlXor(j8, 16, j11);
                long j12 = j10 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j12);
                long j13 = j11 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j13);
                long j14 = j12 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j14);
                long j15 = j13 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j15);
                long j16 = j14 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, i, j16);
                long j17 = j15 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j17);
                long j18 = j16 + jArr3[i3];
                int i5 = i3 + 1;
                long j19 = jRotlXor8 + jArr3[i5] + jArr4[i4];
                int i6 = i3 + 2;
                int i7 = i4 + 1;
                long j20 = j17 + jArr3[i6] + jArr4[i7];
                int i8 = i3 + 3;
                long j21 = i2;
                long j22 = jRotlXor7 + jArr3[i8] + j21;
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                long j23 = j18 + j19;
                long jRotlXor9 = ThreefishEngine.rotlXor(j19, 25, j23);
                long j24 = j20 + j22;
                long jRotlXor10 = ThreefishEngine.rotlXor(j22, 33, j24);
                long j25 = j23 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j25);
                long j26 = j24 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j26);
                long j27 = j25 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j27);
                long j28 = j26 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j28);
                long j29 = j27 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j29);
                long j30 = j28 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j30);
                long j31 = j29 + jArr6[i5];
                long j32 = jRotlXor16 + jArr6[i6] + jArr5[i7];
                j9 = j30 + jArr6[i8] + jArr5[i4 + 2];
                j8 = jArr6[i3 + 4] + j21 + 1 + jRotlXor15;
                i2 += 2;
                j6 = j32;
                z = z2;
                c = c2;
                i = 5;
                j5 = j31;
                jArr3 = jArr6;
                jArr4 = jArr5;
            }
            jArr2[0] = j5;
            jArr2[z ? 1 : 0] = j6;
            jArr2[2] = j9;
            jArr2[c] = j8;
        }
    }

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f10217kw;
            long[] jArr4 = this.f10218t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                x9g0.a();
                return;
            }
            char c = 5;
            if (jArr4.length != 5) {
                x9g0.a();
                return;
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            char c2 = 2;
            long j3 = jArr[2];
            char c3 = 3;
            long jXorRotr = jArr[3];
            long j4 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j5 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i2 = 17;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j6 = j - jArr3[i5];
                int i6 = i3 + 2;
                long j7 = j2 - jArr3[i6];
                int i7 = i3 + 3;
                long j8 = j3 - jArr3[i7];
                int i8 = i3 + 4;
                char c4 = c;
                long j9 = jXorRotr - jArr3[i8];
                int i9 = i3 + 5;
                char c5 = c2;
                long j10 = j4 - jArr3[i9];
                int i10 = i3 + 6;
                int i11 = i4 + 1;
                int i12 = i;
                long j11 = jXorRotr2 - (jArr3[i10] + jArr4[i11]);
                int i13 = i3 + 7;
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                long j12 = j5 - (jArr3[i13] + jArr4[i4 + 2]);
                int[] iArr3 = iArr;
                long j13 = i2;
                long j14 = jXorRotr3 - ((jArr6[i3 + 8] + j13) + 1);
                int i14 = i2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j7, 8, j12);
                long j15 = j12 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j14, 35, j6);
                long j16 = j6 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j11, 56, j8);
                long j17 = j8 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j9, 22, j10);
                long j18 = j10 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j18);
                long j19 = j18 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j15);
                long j20 = j15 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j16);
                long j21 = j16 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, 43, j17);
                long j22 = j17 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j22);
                long j23 = j22 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j19);
                long j24 = j19 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j20);
                long j25 = j20 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j21);
                long j26 = j21 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j26);
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j23);
                long j27 = j23 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j24);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j25);
                long j28 = j25 - jXorRotr19;
                long j29 = (j26 - jXorRotr16) - jArr6[i3];
                long j30 = jXorRotr16 - jArr6[i5];
                long j31 = j27 - jArr6[i6];
                long j32 = jXorRotr17 - jArr6[i7];
                long j33 = (j24 - jXorRotr18) - jArr6[i8];
                long j34 = jXorRotr18 - (jArr6[i9] + jArr5[i4]);
                long j35 = j28 - (jArr6[i10] + jArr5[i11]);
                long j36 = jXorRotr19 - (jArr6[i13] + j13);
                long jXorRotr20 = ThreefishEngine.xorRotr(j30, 44, j35);
                long j37 = j35 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j36, 9, j29);
                long j38 = j29 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j34, 54, j31);
                long j39 = j31 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j32, 56, j33);
                long j40 = j33 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j40);
                long j41 = j40 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, 49, j37);
                long j42 = j37 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j38);
                long j43 = j38 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j39);
                long j44 = j39 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j44);
                long j45 = j44 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j41);
                long j46 = j41 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j42);
                long j47 = j42 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, 42, j43);
                long j48 = j43 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, 46, j48);
                long j49 = j48 - jXorRotr32;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j45);
                j3 = j45 - jXorRotr;
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j46);
                long j50 = j46 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, 37, j47);
                j5 = j47 - jXorRotr3;
                i2 = i14 - 2;
                j = j49;
                j2 = jXorRotr32;
                i = i12;
                c = c4;
                c2 = c5;
                iArr = iArr3;
                iArr2 = iArr2;
                c3 = c3;
                j4 = j50;
                jArr3 = jArr6;
                jArr4 = jArr5;
            }
            long[] jArr7 = jArr4;
            long[] jArr8 = jArr3;
            char c6 = c;
            int i15 = i;
            char c7 = c2;
            char c8 = c3;
            long j51 = j - jArr8[0];
            long j52 = j2 - jArr8[i15];
            long j53 = j3 - jArr8[c7];
            long j54 = jXorRotr - jArr8[c8];
            long j55 = j4 - jArr8[4];
            long j56 = jXorRotr2 - (jArr8[c6] + jArr7[0]);
            long j57 = j5 - (jArr8[6] + jArr7[i15]);
            long j58 = jXorRotr3 - jArr8[7];
            jArr2[0] = j51;
            jArr2[i15] = j52;
            jArr2[c7] = j53;
            jArr2[c8] = j54;
            jArr2[4] = j55;
            jArr2[c6] = j56;
            jArr2[6] = j57;
            jArr2[7] = j58;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f10217kw;
            long[] jArr4 = this.f10218t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                x9g0.a();
                return;
            }
            if (jArr4.length != 5) {
                x9g0.a();
                return;
            }
            long j = jArr[0];
            long j2 = jArr[1];
            long j3 = jArr[2];
            char c = 3;
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = j + jArr3[0];
            long j10 = j2 + jArr3[1];
            long j11 = j3 + jArr3[2];
            long j12 = j4 + jArr3[3];
            long j13 = j5 + jArr3[4];
            long j14 = j6 + jArr3[5] + jArr4[0];
            long j15 = j7 + jArr3[6] + jArr4[1];
            int i = 1;
            long j16 = j9;
            long j17 = j12;
            long j18 = j8 + jArr3[7];
            long j19 = j11;
            long j20 = j14;
            while (i < 18) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j21 = j17;
                long j22 = j16 + j10;
                long jRotlXor = ThreefishEngine.rotlXor(j10, 46, j22);
                long[] jArr5 = jArr4;
                long[] jArr6 = jArr3;
                long j23 = j19 + j21;
                char c2 = c;
                int[] iArr3 = iArr;
                long jRotlXor2 = ThreefishEngine.rotlXor(j21, 36, j23);
                long j24 = j13 + j20;
                long jRotlXor3 = ThreefishEngine.rotlXor(j20, 19, j24);
                long j25 = j15 + j18;
                long jRotlXor4 = ThreefishEngine.rotlXor(j18, 37, j25);
                long j26 = j23 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j26);
                long j27 = j24 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j27);
                long j28 = j25 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j28);
                long j29 = j22 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j29);
                long j30 = j27 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j30);
                long j31 = j28 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, 49, j31);
                long j32 = j29 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j32);
                long j33 = j26 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j33);
                long j34 = j31 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j34);
                long j35 = j32 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j35);
                long j36 = j33 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j36);
                long j37 = j30 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j37);
                long j38 = j35 + jArr6[i2];
                int i4 = i2 + 1;
                long j39 = jRotlXor13 + jArr6[i4];
                int i5 = i2 + 2;
                long j40 = j36 + jArr6[i5];
                int i6 = i2 + 3;
                long j41 = jRotlXor16 + jArr6[i6];
                int i7 = i2 + 4;
                long j42 = j37 + jArr6[i7];
                int i8 = i2 + 5;
                long j43 = jRotlXor15 + jArr6[i8] + jArr5[i3];
                int i9 = i2 + 6;
                int i10 = i3 + 1;
                long j44 = j34 + jArr6[i9] + jArr5[i10];
                int i11 = i2 + 7;
                long j45 = i;
                long j46 = jRotlXor14 + jArr6[i11] + j45;
                int i12 = i;
                long j47 = j38 + j39;
                long jRotlXor17 = ThreefishEngine.rotlXor(j39, 39, j47);
                long j48 = j40 + j41;
                long jRotlXor18 = ThreefishEngine.rotlXor(j41, 30, j48);
                long j49 = j42 + j43;
                long jRotlXor19 = ThreefishEngine.rotlXor(j43, 34, j49);
                long j50 = j44 + j46;
                long jRotlXor20 = ThreefishEngine.rotlXor(j46, 24, j50);
                long j51 = j48 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j51);
                long j52 = j49 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j52);
                long j53 = j50 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j53);
                long j54 = j47 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j54);
                long j55 = j52 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j55);
                long j56 = j53 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j56);
                long j57 = j54 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j57);
                long j58 = j51 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j58);
                long j59 = j56 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j59);
                long j60 = j57 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j60);
                long j61 = j58 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j61);
                long j62 = j55 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j62);
                long j63 = jArr6[i4] + j60;
                long j64 = jRotlXor29 + jArr6[i5];
                long j65 = j61 + jArr6[i6];
                long j66 = jRotlXor32 + jArr6[i7];
                j13 = j62 + jArr6[i8];
                j20 = jRotlXor31 + jArr6[i9] + jArr5[i10];
                j15 = j59 + jArr6[i11] + jArr5[i3 + 2];
                j19 = j65;
                i = i12 + 2;
                j16 = j63;
                c = c2;
                j17 = j66;
                j10 = j64;
                iArr = iArr3;
                iArr2 = iArr2;
                j18 = jRotlXor30 + jArr6[i2 + 8] + j45 + 1;
                jArr3 = jArr6;
                jArr4 = jArr5;
            }
            jArr2[0] = j16;
            jArr2[1] = j10;
            jArr2[2] = j19;
            jArr2[c] = j17;
            jArr2[4] = j13;
            jArr2[5] = j20;
            jArr2[6] = j15;
            jArr2[7] = j18;
        }
    }

    public static abstract class ThreefishCipher {

        /* JADX INFO: renamed from: kw */
        protected final long[] f10217kw;

        /* JADX INFO: renamed from: t */
        protected final long[] f10218t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f10217kw = jArr;
            this.f10218t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i >= iArr2.length) {
                return;
            }
            MOD17[i] = i % 17;
            iArr2[i] = i % 9;
            MOD5[i] = i % 5;
            MOD3[i] = i % 3;
            i++;
        }
    }

    public ThreefishEngine(int i) {
        long[] jArr = new long[5];
        this.f10216t = jArr;
        int i2 = i / 8;
        this.blocksizeBytes = i2;
        int i3 = i2 / 8;
        this.blocksizeWords = i3;
        this.currentBlock = new long[i3];
        long[] jArr2 = new long[(i3 * 2) + 1];
        this.f10215kw = jArr2;
        if (i == 256) {
            this.cipher = new Threefish256Cipher(jArr2, jArr);
            return;
        }
        if (i == 512) {
            this.cipher = new Threefish512Cipher(jArr2, jArr);
        } else if (i == 1024) {
            this.cipher = new Threefish1024Cipher(jArr2, jArr);
        } else {
            ig3.a("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            throw null;
        }
    }

    public static long bytesToWord(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            x9g0.a();
            return 0L;
        }
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return ((((long) bArr[i + 7]) & 255) << 56) | j | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static long rotlXor(long j, int i, long j2) {
        return ((j >>> (-i)) | (j << i)) ^ j2;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            pac0.m6817a("Threefish key must be same size as block (", this.blocksizeWords, " words)");
            return;
        }
        long j = C_240;
        int i = 0;
        while (true) {
            int i2 = this.blocksizeWords;
            long[] jArr2 = this.f10215kw;
            if (i >= i2) {
                jArr2[i2] = j;
                System.arraycopy(jArr2, 0, jArr2, i2 + 1, i2);
                return;
            } else {
                long j2 = jArr[i];
                jArr2[i] = j2;
                j ^= j2;
                i++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            ig3.a("Tweak must be 2 words.");
            return;
        }
        long[] jArr2 = this.f10216t;
        long j = jArr[0];
        jArr2[0] = j;
        long j2 = jArr[1];
        jArr2[1] = j2;
        jArr2[2] = j ^ j2;
        jArr2[3] = j;
        jArr2[4] = j2;
    }

    public static void wordToBytes(long j, byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            x9g0.a();
            return;
        }
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    public static long xorRotr(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 << (-i)) | (j3 >>> i);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else if (!(cipherParameters instanceof KeyParameter)) {
            ig3.a("Invalid parameter passed to Threefish init - ".concat(cipherParameters.getClass().getName()));
            return;
        } else {
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                pac0.m6817a("Threefish key must be same size as block (", this.blocksizeBytes, " bytes)");
                return;
            }
            int i = this.blocksizeWords;
            jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = bytesToWord(key, i2 * 8);
            }
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                ig3.a("Threefish tweak must be 16 bytes");
                return;
            }
            jArr2 = new long[]{bytesToWord(tweak, 0), bytesToWord(tweak, 8)};
        }
        init(z, jArr, jArr2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws IllegalStateException, DataLengthException {
        long[] jArr;
        int i3 = this.blocksizeBytes;
        int i4 = 0;
        if (i2 + i3 > bArr2.length) {
            npk0.m6558a("Output buffer too short");
            return 0;
        }
        if (i3 + i > bArr.length) {
            npk0.m6558a("Input buffer too short");
            return 0;
        }
        int i5 = 0;
        while (true) {
            int i6 = this.blocksizeBytes;
            jArr = this.currentBlock;
            if (i5 >= i6) {
                break;
            }
            jArr[i5 >> 3] = bytesToWord(bArr, i + i5);
            i5 += 8;
        }
        processBlock(jArr, jArr);
        while (true) {
            int i7 = this.blocksizeBytes;
            if (i4 >= i7) {
                return i7;
            }
            wordToBytes(this.currentBlock[i4 >> 3], bArr2, i2 + i4);
            i4 += 8;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public int processBlock(long[] jArr, long[] jArr2) throws IllegalStateException, DataLengthException {
        long[] jArr3 = this.f10215kw;
        int i = this.blocksizeWords;
        if (jArr3[i] != 0) {
            if (jArr.length == i) {
                if (jArr2.length == i) {
                    boolean z = this.forEncryption;
                    ThreefishCipher threefishCipher = this.cipher;
                    if (z) {
                        threefishCipher.encryptBlock(jArr, jArr2);
                    } else {
                        threefishCipher.decryptBlock(jArr, jArr2);
                    }
                    return this.blocksizeWords;
                }
                npk0.m6558a("Output buffer too short");
                return 0;
            }
            npk0.m6558a("Input buffer too short");
            return 0;
        }
        qkq0.a("Threefish engine not initialised");
        return 0;
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        this.forEncryption = z;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}
