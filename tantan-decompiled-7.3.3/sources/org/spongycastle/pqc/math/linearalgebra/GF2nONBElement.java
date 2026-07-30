package org.spongycastle.pqc.math.linearalgebra;

import android.support.v4.media.session.PlaybackStateCompat;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.math.BigInteger;
import java.security.SecureRandom;
import p153l.azk0;
import p153l.olk0;

/* JADX INFO: loaded from: classes3.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, PlaybackStateCompat.ACTION_SET_REPEAT_MODE, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, 4294967295L, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i = this.mLength;
        long[] jArr = new long[i];
        this.mPol = jArr;
        if (i <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i2 = 0; i2 < this.mLength - 1; i2++) {
                this.mPol[i2] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i = 0;
        while (true) {
            int i2 = oNBLength - 1;
            if (i >= i2) {
                jArr[i2] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i] = -1;
            i++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i = 0; i < bArr.length; i++) {
            long[] jArr = this.mPol;
            int i2 = i >>> 3;
            jArr[i2] = jArr[i2] | ((((long) bArr[(bArr.length - 1) - i]) & 255) << ((i & 7) << 3));
        }
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i = 0;
        while (true) {
            int i2 = this.mDegree;
            if (i >= i2) {
                return jArr;
            }
            if (testBit((i2 - i) - 1)) {
                int i3 = i >>> 6;
                jArr[i3] = jArr[i3] | mBitmask[i & 63];
            }
            i++;
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nONBElement)) {
            olk0.m168132a();
            return;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            olk0.m168132a();
            return;
        }
        for (int i = 0; i < this.mLength; i++) {
            long[] jArr = this.mPol;
            jArr[i] = jArr[i] ^ gF2nONBElement.mPol[i];
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void assignOne() {
        int i = 0;
        while (true) {
            int i2 = this.mLength;
            int i3 = i2 - 1;
            long[] jArr = this.mPol;
            if (i >= i3) {
                jArr[i2 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                jArr[i] = -1;
                i++;
            }
        }
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement, org.spongycastle.pqc.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i = 0; i < this.mLength; i++) {
            if (this.mPol[i] != gF2nONBElement.mPol[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.mPol.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement increase() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement invert() throws ArithmeticException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() throws ArithmeticException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i = 31;
        boolean z = false;
        while (!z && i >= 0) {
            if ((((long) (this.mDegree - 1)) & mBitmask[i]) != 0) {
                z = true;
            }
            i--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i2 = 1;
        while (i >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i3 = 1; i3 <= i2; i3++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i2 <<= 1;
            if ((((long) (this.mDegree - 1)) & mBitmask[i]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i2++;
            }
            i--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        int i;
        boolean z = true;
        int i2 = 0;
        while (true) {
            i = this.mLength;
            if (i2 >= i - 1 || !z) {
                break;
            }
            z = z && this.mPol[i2] == -1;
            i2++;
        }
        if (!z) {
            return z;
        }
        if (z) {
            long j = this.mPol[i - 1];
            long[] jArr = mMaxmask;
            int i3 = this.mBit;
            if ((j & jArr[i3 - 1]) == jArr[i3 - 1]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z = true;
        for (int i = 0; i < this.mLength && z; i++) {
            z = z && this.mPol[i] == 0;
        }
        return z;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        char c;
        if (!(gFElement instanceof GF2nONBElement)) {
            azk0.m101074a("The elements have different representation: not yet implemented");
            return;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            olk0.m168132a();
            return;
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i = this.mLength;
        long[] jArr3 = new long[i];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i2 = i - 1;
        char c2 = 1;
        int i3 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j = jArr4[63];
        long j2 = jArr4[i3];
        int i4 = 0;
        while (i4 < this.mDegree) {
            int i5 = 0;
            boolean z = false;
            while (i5 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i6 = iArr2[i5];
                int[] iArr3 = iArr[i5];
                int i7 = iArr3[0];
                int i8 = iArr2[i7];
                int i9 = i7 & 63;
                long j3 = jArr[i6];
                long[] jArr5 = mBitmask;
                if ((j3 & jArr5[i5 & 63]) != 0) {
                    if ((jArr2[i8] & jArr5[i9]) != 0) {
                        z = !z;
                    }
                    int i10 = iArr3[c2];
                    if (i10 != -1 && (jArr2[iArr2[i10]] & jArr5[i10 & 63]) != 0) {
                        z = !z;
                    }
                }
                i5++;
                c2 = 1;
            }
            int i11 = mIBY64[i4];
            int i12 = i4 & 63;
            if (z) {
                jArr3[i11] = jArr3[i11] ^ mBitmask[i12];
            }
            if (this.mLength > 1) {
                boolean z2 = (jArr[i2] & 1) == 1;
                int i13 = i - 2;
                int i14 = i13;
                while (i14 >= 0) {
                    long j4 = jArr[i14];
                    boolean z3 = (j4 & 1) != 0;
                    long j5 = j4 >>> 1;
                    jArr[i14] = j5;
                    if (z2) {
                        jArr[i14] = j5 ^ j;
                    }
                    i14--;
                    z2 = z3;
                }
                long j6 = jArr[i2] >>> 1;
                jArr[i2] = j6;
                if (z2) {
                    jArr[i2] = j6 ^ j2;
                }
                boolean z4 = (jArr2[i2] & 1) == 1;
                while (i13 >= 0) {
                    long j7 = jArr2[i13];
                    boolean z5 = (j7 & 1) != 0;
                    long j8 = j7 >>> 1;
                    jArr2[i13] = j8;
                    if (z4) {
                        jArr2[i13] = j8 ^ j;
                    }
                    i13--;
                    z4 = z5;
                }
                long j9 = jArr2[i2] >>> 1;
                jArr2[i2] = j9;
                if (z4) {
                    jArr2[i2] = j9 ^ j2;
                }
                c = 1;
            } else {
                long j10 = jArr[0];
                boolean z6 = (j10 & 1) == 1;
                long j11 = j10 >>> 1;
                jArr[0] = j11;
                if (z6) {
                    jArr[0] = j11 ^ j2;
                }
                long j12 = jArr2[0];
                boolean z7 = (j12 & 1) == 1;
                c = 1;
                long j13 = j12 >>> 1;
                jArr2[0] = j13;
                if (z7) {
                    jArr2[0] = j13 ^ j2;
                }
            }
            i4++;
            c2 = c;
        }
        assign(jArr3);
    }

    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        int i;
        if (trace() == 1) {
            olk0.m168132a();
            return null;
        }
        long j = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i2 = 0;
        long j2 = 0;
        while (true) {
            i = this.mLength;
            if (i2 >= i - 1) {
                break;
            }
            for (int i3 = 1; i3 < 64; i3++) {
                long[] jArr2 = mBitmask;
                long j3 = jArr2[i3];
                long j4 = this.mPol[i2];
                if (((j3 & j4) == 0 || (j2 & jArr2[i3 - 1]) == 0) && ((j4 & j3) != 0 || (jArr2[i3 - 1] & j2) != 0)) {
                    j2 ^= j3;
                }
            }
            jArr[i2] = j2;
            long j5 = j2 & j;
            j2 = ((j5 == 0 || (1 & this.mPol[i2 + 1]) != 1) && !(j5 == 0 && (this.mPol[i2 + 1] & 1) == 0)) ? 1L : 0L;
            i2++;
        }
        int i4 = 63 & this.mDegree;
        long j6 = this.mPol[i - 1];
        for (int i5 = 1; i5 < i4; i5++) {
            long[] jArr3 = mBitmask;
            long j7 = jArr3[i5];
            if (((j7 & j6) == 0 || (jArr3[i5 - 1] & j2) == 0) && ((j7 & j6) != 0 || (jArr3[i5 - 1] & j2) != 0)) {
                j2 ^= j7;
            }
        }
        jArr[this.mLength - 1] = j2;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i = this.mLength - 1;
        int i2 = this.mBit - 1;
        long j = mBitmask[63];
        boolean z = (element[0] & 1) != 0;
        int i3 = i;
        while (i3 >= 0) {
            long j2 = element[i3];
            boolean z2 = (j2 & 1) != 0;
            long j3 = j2 >>> 1;
            element[i3] = j3;
            if (z) {
                if (i3 == i) {
                    element[i3] = j3 ^ mBitmask[i2];
                } else {
                    element[i3] = j3 ^ j;
                }
            }
            i3--;
            z = z2;
        }
        assign(element);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i = this.mLength - 1;
        int i2 = this.mBit;
        int i3 = i2 - 1;
        long[] jArr = mBitmask;
        long j = jArr[63];
        boolean z = (element[i] & jArr[i3]) != 0;
        int i4 = 0;
        while (i4 < i) {
            long j2 = element[i4];
            boolean z2 = (j2 & j) != 0;
            long j3 = j2 << 1;
            element[i4] = j3;
            if (z) {
                element[i4] = 1 ^ j3;
            }
            i4++;
            z = z2;
        }
        long j4 = element[i];
        long[] jArr2 = mBitmask;
        boolean z3 = (jArr2[i3] & j4) != 0;
        long j5 = j4 << 1;
        element[i] = j5;
        if (z) {
            element[i] = j5 ^ 1;
        }
        if (z3) {
            element[i] = jArr2[i2] ^ element[i];
        }
        assign(element);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testBit(int i) {
        return i >= 0 && i <= this.mDegree && (this.mPol[i >>> 6] & mBitmask[i & 63]) != 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (i2 & 7) << 3;
            bArr[(i - i2) - 1] = (byte) ((this.mPol[i2 >>> 3] & (255 << i3)) >>> i3);
        }
        return bArr;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString(int i) {
        long[] element = getElement();
        int i2 = this.mBit;
        String strConcat = "";
        if (i == 2) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                strConcat = (element[element.length + (-1)] & (1 << i2)) == 0 ? strConcat.concat("0") : strConcat.concat("1");
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i3 = 63; i3 >= 0; i3--) {
                    strConcat = (element[length] & mBitmask[i3]) == 0 ? strConcat + "0" : strConcat + "1";
                }
            }
            return strConcat;
        }
        if (i == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2 += -1) {
                strConcat = ((((((((((((((((strConcat + cArr[((int) (element[length2] >>> 60)) & 15]) + cArr[((int) (element[length2] >>> 56)) & 15]) + cArr[((int) (element[length2] >>> 52)) & 15]) + cArr[((int) (element[length2] >>> 48)) & 15]) + cArr[((int) (element[length2] >>> 44)) & 15]) + cArr[((int) (element[length2] >>> 40)) & 15]) + cArr[((int) (element[length2] >>> 36)) & 15]) + cArr[((int) (element[length2] >>> 32)) & 15]) + cArr[((int) (element[length2] >>> 28)) & 15]) + cArr[((int) (element[length2] >>> 24)) & 15]) + cArr[((int) (element[length2] >>> 20)) & 15]) + cArr[((int) (element[length2] >>> 16)) & 15]) + cArr[((int) (element[length2] >>> 12)) & 15]) + cArr[((int) (element[length2] >>> 8)) & 15]) + cArr[((int) (element[length2] >>> 4)) & 15]) + cArr[((int) element[length2]) & 15]).concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
        }
        return strConcat;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        int i = this.mLength - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < 64; i4++) {
                if ((this.mPol[i3] & mBitmask[i4]) != 0) {
                    i2 ^= 1;
                }
            }
        }
        int i5 = this.mBit;
        for (int i6 = 0; i6 < i5; i6++) {
            if ((this.mPol[i] & mBitmask[i6]) != 0) {
                i2 ^= 1;
            }
        }
        return i2;
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }
}
