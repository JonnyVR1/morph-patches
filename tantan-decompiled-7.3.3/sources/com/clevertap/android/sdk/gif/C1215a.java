package com.clevertap.android.sdk.gif;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Logger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.clevertap.android.sdk.gif.a */
/* JADX INFO: loaded from: classes.dex */
class C1215a {

    /* JADX INFO: renamed from: y */
    private static final String f4973y = "a";

    /* JADX INFO: renamed from: a */
    private int[] f4974a;

    /* JADX INFO: renamed from: b */
    private final a f4975b;

    /* JADX INFO: renamed from: c */
    private byte[] f4976c;

    /* JADX INFO: renamed from: d */
    private int f4977d;

    /* JADX INFO: renamed from: e */
    private int f4978e;

    /* JADX INFO: renamed from: f */
    private int f4979f;

    /* JADX INFO: renamed from: g */
    private C1217c f4980g;

    /* JADX INFO: renamed from: h */
    private boolean f4981h;

    /* JADX INFO: renamed from: i */
    private int f4982i;

    /* JADX INFO: renamed from: j */
    private byte[] f4983j;

    /* JADX INFO: renamed from: k */
    private int[] f4984k;

    /* JADX INFO: renamed from: l */
    private C1218d f4985l;

    /* JADX INFO: renamed from: m */
    private final int[] f4986m;

    /* JADX INFO: renamed from: n */
    private byte[] f4987n;

    /* JADX INFO: renamed from: o */
    private short[] f4988o;

    /* JADX INFO: renamed from: p */
    private Bitmap f4989p;

    /* JADX INFO: renamed from: q */
    private ByteBuffer f4990q;

    /* JADX INFO: renamed from: r */
    private int f4991r;

    /* JADX INFO: renamed from: s */
    private boolean f4992s;

    /* JADX INFO: renamed from: t */
    private int f4993t;

    /* JADX INFO: renamed from: u */
    private byte[] f4994u;

    /* JADX INFO: renamed from: v */
    @Nullable
    private byte[] f4995v;

    /* JADX INFO: renamed from: w */
    private int f4996w;

    /* JADX INFO: renamed from: x */
    private int f4997x;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        byte[] mo6130a(int i);

        @NonNull
        /* JADX INFO: renamed from: b */
        Bitmap mo6131b(int i, int i2, Bitmap.Config config);

        /* JADX INFO: renamed from: c */
        int[] mo6132c(int i);
    }

    public C1215a(a aVar) {
        this.f4986m = new int[256];
        this.f4996w = 0;
        this.f4997x = 0;
        this.f4975b = aVar;
        this.f4980g = new C1217c();
    }

    /* JADX INFO: renamed from: b */
    private int m6106b(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f4991r + i; i9++) {
            byte[] bArr = this.f4983j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f4974a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f4991r + i11; i12++) {
            byte[] bArr2 = this.f4983j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f4974a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v43, types: [short] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX INFO: renamed from: c */
    private void m6107c(C1216b c1216b) {
        int i;
        int i2;
        short s;
        byte b = 0;
        this.f4997x = 0;
        this.f4996w = 0;
        if (c1216b != null) {
            this.f4990q.position(c1216b.f4998a);
        }
        if (c1216b == null) {
            C1217c c1217c = this.f4980g;
            i = c1217c.f5021m;
            i2 = c1217c.f5017i;
        } else {
            i = c1216b.f5004g;
            i2 = c1216b.f5005h;
        }
        int i3 = i * i2;
        byte[] bArr = this.f4983j;
        if (bArr == null || bArr.length < i3) {
            this.f4983j = this.f4975b.mo6130a(i3);
        }
        if (this.f4988o == null) {
            this.f4988o = new short[4096];
        }
        if (this.f4994u == null) {
            this.f4994u = new byte[4096];
        }
        if (this.f4987n == null) {
            this.f4987n = new byte[4097];
        }
        int iM6112p = m6112p();
        boolean z = true;
        int i4 = 1 << iM6112p;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iM6112p + 1;
        int i8 = (1 << i7) - 1;
        for (int i9 = 0; i9 < i4; i9++) {
            this.f4988o[i9] = 0;
            this.f4994u[i9] = (byte) i9;
        }
        int i10 = -1;
        int i11 = i7;
        int i12 = 0;
        int iM6111o = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = i6;
        int i20 = i8;
        int i21 = -1;
        while (true) {
            b = b;
            if (i12 >= i3) {
                break;
            }
            if (iM6111o == 0) {
                iM6111o = m6111o();
                if (iM6111o <= 0) {
                    this.f4993t = 3;
                    break;
                }
                i15 = b;
            }
            boolean z2 = z;
            i14 += (this.f4976c[i15] & 255) << i13;
            i13 += 8;
            i15++;
            iM6111o += i10;
            i19 = i19;
            i21 = i21;
            i11 = i11;
            int i22 = i18;
            while (true) {
                if (i13 < i11) {
                    i18 = i22;
                    i7 = i7;
                    break;
                }
                int i23 = i14 & i20;
                i14 >>= i11;
                i13 -= i11;
                if (i23 != i4) {
                    if (i23 > i19) {
                        i7 = i7;
                        this.f4993t = 3;
                    } else {
                        i7 = i7;
                        if (i23 != i5) {
                            if (i21 == -1) {
                                this.f4987n[i17] = this.f4994u[i23];
                                i21 = i23;
                                i22 = i21;
                                i17++;
                            } else {
                                if (i23 >= i19) {
                                    this.f4987n[i17] = (byte) i22;
                                    s = i21;
                                    i17++;
                                } else {
                                    s = i23;
                                }
                                while (s >= i4) {
                                    ?? r18 = s;
                                    this.f4987n[i17] = this.f4994u[r18 == true ? 1 : 0];
                                    s = this.f4988o[r18 == true ? 1 : 0];
                                    i17++;
                                }
                                ?? r19 = s;
                                byte[] bArr2 = this.f4994u;
                                int i24 = bArr2[r19 == true ? 1 : 0] & 255;
                                int i25 = i17 + 1;
                                byte b2 = (byte) i24;
                                this.f4987n[i17] = b2;
                                if (i19 < 4096) {
                                    this.f4988o[i19] = (short) i21;
                                    bArr2[i19] = b2;
                                    i19++;
                                    if ((i19 & i20) == 0 && i19 < 4096) {
                                        i11++;
                                        i20 += i19;
                                    }
                                }
                                while (i25 > 0) {
                                    i25--;
                                    this.f4983j[i16] = this.f4987n[i25];
                                    i12++;
                                    i16++;
                                }
                                i21 = i23;
                                i22 = i24;
                                i17 = i25;
                            }
                        }
                    }
                    i7 = i7;
                    i18 = i22;
                    break;
                }
                i11 = i7;
                i19 = i6;
                i20 = i8;
                i21 = -1;
            }
            i10 = -1;
            z = z2;
        }
        for (int i26 = i16; i26 < i3; i26++) {
            this.f4983j[i26] = b;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6108d(int[] iArr, C1216b c1216b, int i) {
        int i2 = c1216b.f5005h;
        int i3 = this.f4991r;
        int i4 = i2 / i3;
        int i5 = c1216b.f5003f / i3;
        int i6 = c1216b.f5004g / i3;
        int i7 = c1216b.f5002e / i3;
        int i8 = this.f4978e;
        int i9 = (i5 * i8) + i7;
        int i10 = (i4 * i8) + i9;
        while (i9 < i10) {
            int i11 = i9 + i6;
            for (int i12 = i9; i12 < i11; i12++) {
                iArr[i12] = i;
            }
            i9 += this.f4978e;
        }
    }

    /* JADX INFO: renamed from: h */
    private C1218d m6109h() {
        if (this.f4985l == null) {
            this.f4985l = new C1218d();
        }
        return this.f4985l;
    }

    /* JADX INFO: renamed from: j */
    private Bitmap m6110j() {
        Bitmap bitmapMo6131b = this.f4975b.mo6131b(this.f4978e, this.f4977d, this.f4981h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        m6114s(bitmapMo6131b);
        return bitmapMo6131b;
    }

    /* JADX INFO: renamed from: o */
    private int m6111o() {
        int iM6112p = m6112p();
        if (iM6112p > 0) {
            try {
                if (this.f4976c == null) {
                    this.f4976c = this.f4975b.mo6130a(255);
                }
                int i = this.f4997x;
                int i2 = this.f4996w;
                int i3 = i - i2;
                if (i3 >= iM6112p) {
                    System.arraycopy(this.f4995v, i2, this.f4976c, 0, iM6112p);
                    this.f4996w += iM6112p;
                    return iM6112p;
                }
                if (this.f4990q.remaining() + i3 < iM6112p) {
                    this.f4993t = 1;
                    return iM6112p;
                }
                System.arraycopy(this.f4995v, this.f4996w, this.f4976c, 0, i3);
                this.f4996w = this.f4997x;
                m6113q();
                int i4 = iM6112p - i3;
                System.arraycopy(this.f4995v, 0, this.f4976c, i3, i4);
                this.f4996w += i4;
                return iM6112p;
            } catch (Exception e) {
                Logger.m5921d(f4973y, "Error Reading Block", e);
                this.f4993t = 1;
            }
        }
        return iM6112p;
    }

    /* JADX INFO: renamed from: p */
    private int m6112p() {
        try {
            m6113q();
            byte[] bArr = this.f4995v;
            int i = this.f4996w;
            this.f4996w = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f4993t = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m6113q() {
        if (this.f4997x > this.f4996w) {
            return;
        }
        if (this.f4995v == null) {
            this.f4995v = this.f4975b.mo6130a(16384);
        }
        this.f4996w = 0;
        int iMin = Math.min(this.f4990q.remaining(), 16384);
        this.f4997x = iMin;
        this.f4990q.get(this.f4995v, 0, iMin);
    }

    @TargetApi(12)
    /* JADX INFO: renamed from: s */
    private static void m6114s(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    /* JADX INFO: renamed from: x */
    private Bitmap m6115x(C1216b c1216b, C1216b c1216b2) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2 = this.f4984k;
        int i5 = 0;
        if (c1216b2 == null) {
            Arrays.fill(iArr2, 0);
        }
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        if (c1216b2 != null && (i3 = c1216b2.f5000c) > 0) {
            if (i3 == 2) {
                if (!c1216b.f5008k) {
                    C1217c c1217c = this.f4980g;
                    i4 = c1217c.f5009a;
                    if (c1216b.f5006i != null && c1217c.f5010b == c1216b.f5007j) {
                    }
                    m6108d(iArr2, c1216b2, i4);
                } else if (this.f4979f == 0) {
                    this.f4981h = true;
                }
                i4 = 0;
                m6108d(iArr2, c1216b2, i4);
            } else if (i3 == 3) {
                Bitmap bitmap = this.f4989p;
                if (bitmap == null) {
                    m6108d(iArr2, c1216b2, 0);
                } else {
                    int i9 = c1216b2.f5005h;
                    int i10 = this.f4991r;
                    int i11 = i9 / i10;
                    int i12 = c1216b2.f5003f / i10;
                    int i13 = c1216b2.f5004g / i10;
                    int i14 = c1216b2.f5002e / i10;
                    int i15 = this.f4978e;
                    bitmap.getPixels(iArr2, (i12 * i15) + i14, i15, i14, i12, i13, i11);
                }
            }
        }
        int[] iArr3 = iArr2;
        m6107c(c1216b);
        int i16 = c1216b.f5005h;
        int i17 = this.f4991r;
        int i18 = i16 / i17;
        int i19 = c1216b.f5003f / i17;
        int i20 = c1216b.f5004g / i17;
        int i21 = c1216b.f5002e / i17;
        boolean z = this.f4979f == 0;
        int i22 = 8;
        int i23 = 0;
        int i24 = 1;
        while (i5 < i18) {
            if (c1216b.f5001d) {
                if (i23 >= i18) {
                    i24++;
                    if (i24 == i7) {
                        i23 = 4;
                    } else if (i24 == i6) {
                        i23 = i7;
                        i22 = 4;
                    } else if (i24 == 4) {
                        i22 = i7;
                        i23 = i8;
                    }
                }
                i2 = i23 + i22;
            } else {
                i2 = i23;
                i23 = i5;
            }
            int i25 = i23 + i19;
            if (i25 < this.f4977d) {
                int i26 = this.f4978e;
                int i27 = i25 * i26;
                int i28 = i27 + i21;
                int i29 = i28 + i20;
                if (i27 + i26 < i29) {
                    i29 = i27 + i26;
                }
                int i30 = this.f4991r;
                int i31 = i5 * i30 * c1216b.f5004g;
                int i32 = ((i29 - i28) * i30) + i31;
                int i33 = i28;
                while (i33 < i29) {
                    int[] iArr4 = iArr3;
                    int i34 = i18;
                    int iM6106b = this.f4991r == 1 ? this.f4974a[this.f4983j[i31] & 255] : m6106b(i31, i32, c1216b.f5004g);
                    if (iM6106b != 0) {
                        iArr4[i33] = iM6106b;
                    } else if (!this.f4981h && z) {
                        this.f4981h = true;
                    }
                    i31 += this.f4991r;
                    i33++;
                    iArr3 = iArr4;
                    i18 = i34;
                }
            }
            i5++;
            iArr3 = iArr3;
            i23 = i2;
            i18 = i18;
            i6 = 3;
            i7 = 2;
            i8 = 1;
        }
        int[] iArr5 = iArr3;
        if (this.f4992s && ((i = c1216b.f5000c) == 0 || i == 1)) {
            if (this.f4989p == null) {
                this.f4989p = m6110j();
            }
            Bitmap bitmap2 = this.f4989p;
            int i35 = this.f4978e;
            iArr = iArr5;
            bitmap2.setPixels(iArr, 0, i35, 0, 0, i35, this.f4977d);
        } else {
            iArr = iArr5;
        }
        Bitmap bitmapM6110j = m6110j();
        int i36 = this.f4978e;
        bitmapM6110j.setPixels(iArr, 0, i36, 0, 0, i36, this.f4977d);
        return bitmapM6110j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m6116a() {
        if (this.f4980g.f5012d <= 0) {
            return false;
        }
        if (this.f4979f == m6119g() - 1) {
            this.f4982i++;
        }
        C1217c c1217c = this.f4980g;
        int i = c1217c.f5018j;
        if (i != -1 && this.f4982i > i) {
            return false;
        }
        this.f4979f = (this.f4979f + 1) % c1217c.f5012d;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public int m6117e() {
        return this.f4979f;
    }

    /* JADX INFO: renamed from: f */
    public int m6118f(int i) {
        if (i < 0) {
            return -1;
        }
        C1217c c1217c = this.f4980g;
        if (i < c1217c.f5012d) {
            return c1217c.f5013e.get(i).f4999b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m6119g() {
        return this.f4980g.f5012d;
    }

    /* JADX INFO: renamed from: i */
    public int m6120i() {
        return this.f4980g.f5017i;
    }

    /* JADX INFO: renamed from: k */
    public int m6121k() {
        int i;
        if (this.f4980g.f5012d <= 0 || (i = this.f4979f) < 0) {
            return 0;
        }
        return m6118f(i);
    }

    /* JADX INFO: renamed from: l */
    public synchronized Bitmap m6122l() {
        try {
            if (this.f4980g.f5012d <= 0 || this.f4979f < 0) {
                Logger.m5920d(f4973y, "unable to decode frame, frameCount=" + this.f4980g.f5012d + " framePointer=" + this.f4979f);
                this.f4993t = 1;
            }
            int i = this.f4993t;
            if (i != 1 && i != 2) {
                this.f4993t = 0;
                C1216b c1216b = this.f4980g.f5013e.get(this.f4979f);
                int i2 = this.f4979f - 1;
                C1216b c1216b2 = i2 >= 0 ? this.f4980g.f5013e.get(i2) : null;
                int[] iArr = c1216b.f5006i;
                if (iArr == null) {
                    iArr = this.f4980g.f5014f;
                }
                this.f4974a = iArr;
                if (iArr == null) {
                    Logger.m5920d(f4973y, "No Valid Color Table for frame #" + this.f4979f);
                    this.f4993t = 1;
                    return null;
                }
                if (c1216b.f5008k) {
                    System.arraycopy(iArr, 0, this.f4986m, 0, iArr.length);
                    int[] iArr2 = this.f4986m;
                    this.f4974a = iArr2;
                    iArr2[c1216b.f5007j] = 0;
                }
                return m6115x(c1216b, c1216b2);
            }
            Logger.m5920d(f4973y, "Unable to decode frame, status=" + this.f4993t);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m6123m() {
        return this.f4980g.f5021m;
    }

    /* JADX INFO: renamed from: n */
    public synchronized int m6124n(byte[] bArr) {
        try {
            C1217c c1217cM6148b = m6109h().m6150p(bArr).m6148b();
            this.f4980g = c1217cM6148b;
            if (bArr != null) {
                m6128v(c1217cM6148b, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4993t;
    }

    /* JADX INFO: renamed from: r */
    public void m6125r() {
        this.f4982i = 0;
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m6126t(C1217c c1217c, ByteBuffer byteBuffer) {
        m6127u(c1217c, byteBuffer, 1);
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m6127u(C1217c c1217c, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.f4993t = 0;
            this.f4980g = c1217c;
            this.f4981h = false;
            this.f4979f = -1;
            m6125r();
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4990q = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f4990q.order(ByteOrder.LITTLE_ENDIAN);
            this.f4992s = false;
            Iterator<C1216b> it = c1217c.f5013e.iterator();
            while (it.hasNext()) {
                if (it.next().f5000c == 3) {
                    this.f4992s = true;
                    break;
                }
            }
            this.f4991r = iHighestOneBit;
            int i2 = c1217c.f5021m;
            this.f4978e = i2 / iHighestOneBit;
            int i3 = c1217c.f5017i;
            this.f4977d = i3 / iHighestOneBit;
            this.f4983j = this.f4975b.mo6130a(i2 * i3);
            this.f4984k = this.f4975b.mo6132c(this.f4978e * this.f4977d);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m6128v(C1217c c1217c, byte[] bArr) {
        m6126t(c1217c, ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: w */
    public boolean m6129w(int i) {
        if (i < -1 || i >= m6119g()) {
            return false;
        }
        this.f4979f = i;
        return true;
    }

    public C1215a() {
        this(new C1219e());
    }
}
