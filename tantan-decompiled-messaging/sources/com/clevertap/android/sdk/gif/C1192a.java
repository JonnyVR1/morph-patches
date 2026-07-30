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
class C1192a {

    /* JADX INFO: renamed from: y */
    private static final String f4936y = "a";

    /* JADX INFO: renamed from: a */
    private int[] f4937a;

    /* JADX INFO: renamed from: b */
    private final a f4938b;

    /* JADX INFO: renamed from: c */
    private byte[] f4939c;

    /* JADX INFO: renamed from: d */
    private int f4940d;

    /* JADX INFO: renamed from: e */
    private int f4941e;

    /* JADX INFO: renamed from: f */
    private int f4942f;

    /* JADX INFO: renamed from: g */
    private C1194c f4943g;

    /* JADX INFO: renamed from: h */
    private boolean f4944h;

    /* JADX INFO: renamed from: i */
    private int f4945i;

    /* JADX INFO: renamed from: j */
    private byte[] f4946j;

    /* JADX INFO: renamed from: k */
    private int[] f4947k;

    /* JADX INFO: renamed from: l */
    private C1195d f4948l;

    /* JADX INFO: renamed from: m */
    private final int[] f4949m;

    /* JADX INFO: renamed from: n */
    private byte[] f4950n;

    /* JADX INFO: renamed from: o */
    private short[] f4951o;

    /* JADX INFO: renamed from: p */
    private Bitmap f4952p;

    /* JADX INFO: renamed from: q */
    private ByteBuffer f4953q;

    /* JADX INFO: renamed from: r */
    private int f4954r;

    /* JADX INFO: renamed from: s */
    private boolean f4955s;

    /* JADX INFO: renamed from: t */
    private int f4956t;

    /* JADX INFO: renamed from: u */
    private byte[] f4957u;

    /* JADX INFO: renamed from: v */
    @Nullable
    private byte[] f4958v;

    /* JADX INFO: renamed from: w */
    private int f4959w;

    /* JADX INFO: renamed from: x */
    private int f4960x;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        byte[] mo6076a(int i);

        @NonNull
        /* JADX INFO: renamed from: b */
        Bitmap mo6077b(int i, int i2, Bitmap.Config config);

        /* JADX INFO: renamed from: c */
        int[] mo6078c(int i);
    }

    public C1192a(a aVar) {
        this.f4949m = new int[256];
        this.f4959w = 0;
        this.f4960x = 0;
        this.f4938b = aVar;
        this.f4943g = new C1194c();
    }

    /* JADX INFO: renamed from: b */
    private int m6052b(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f4954r + i; i9++) {
            byte[] bArr = this.f4946j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f4937a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f4954r + i11; i12++) {
            byte[] bArr2 = this.f4946j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f4937a[bArr2[i12] & 255];
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
    private void m6053c(C1193b c1193b) {
        int i;
        int i2;
        short s;
        byte b = 0;
        this.f4960x = 0;
        this.f4959w = 0;
        if (c1193b != null) {
            this.f4953q.position(c1193b.f4961a);
        }
        if (c1193b == null) {
            C1194c c1194c = this.f4943g;
            i = c1194c.f4984m;
            i2 = c1194c.f4980i;
        } else {
            i = c1193b.f4967g;
            i2 = c1193b.f4968h;
        }
        int i3 = i * i2;
        byte[] bArr = this.f4946j;
        if (bArr == null || bArr.length < i3) {
            this.f4946j = this.f4938b.mo6076a(i3);
        }
        if (this.f4951o == null) {
            this.f4951o = new short[4096];
        }
        if (this.f4957u == null) {
            this.f4957u = new byte[4096];
        }
        if (this.f4950n == null) {
            this.f4950n = new byte[4097];
        }
        int iM6058p = m6058p();
        boolean z = true;
        int i4 = 1 << iM6058p;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iM6058p + 1;
        int i8 = (1 << i7) - 1;
        for (int i9 = 0; i9 < i4; i9++) {
            this.f4951o[i9] = 0;
            this.f4957u[i9] = (byte) i9;
        }
        int i10 = -1;
        int i11 = i7;
        int i12 = 0;
        int iM6057o = 0;
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
            if (iM6057o == 0) {
                iM6057o = m6057o();
                if (iM6057o <= 0) {
                    this.f4956t = 3;
                    break;
                }
                i15 = b;
            }
            boolean z2 = z;
            i14 += (this.f4939c[i15] & 255) << i13;
            i13 += 8;
            i15++;
            iM6057o += i10;
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
                        this.f4956t = 3;
                    } else {
                        i7 = i7;
                        if (i23 != i5) {
                            if (i21 == -1) {
                                this.f4950n[i17] = this.f4957u[i23];
                                i21 = i23;
                                i22 = i21;
                                i17++;
                            } else {
                                if (i23 >= i19) {
                                    this.f4950n[i17] = (byte) i22;
                                    s = i21;
                                    i17++;
                                } else {
                                    s = i23;
                                }
                                while (s >= i4) {
                                    ?? r18 = s;
                                    this.f4950n[i17] = this.f4957u[r18 == true ? 1 : 0];
                                    s = this.f4951o[r18 == true ? 1 : 0];
                                    i17++;
                                }
                                ?? r19 = s;
                                byte[] bArr2 = this.f4957u;
                                int i24 = bArr2[r19 == true ? 1 : 0] & 255;
                                int i25 = i17 + 1;
                                byte b2 = (byte) i24;
                                this.f4950n[i17] = b2;
                                if (i19 < 4096) {
                                    this.f4951o[i19] = (short) i21;
                                    bArr2[i19] = b2;
                                    i19++;
                                    if ((i19 & i20) == 0 && i19 < 4096) {
                                        i11++;
                                        i20 += i19;
                                    }
                                }
                                while (i25 > 0) {
                                    i25--;
                                    this.f4946j[i16] = this.f4950n[i25];
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
            this.f4946j[i26] = b;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m6054d(int[] iArr, C1193b c1193b, int i) {
        int i2 = c1193b.f4968h;
        int i3 = this.f4954r;
        int i4 = i2 / i3;
        int i5 = c1193b.f4966f / i3;
        int i6 = c1193b.f4967g / i3;
        int i7 = c1193b.f4965e / i3;
        int i8 = this.f4941e;
        int i9 = (i5 * i8) + i7;
        int i10 = (i4 * i8) + i9;
        while (i9 < i10) {
            int i11 = i9 + i6;
            for (int i12 = i9; i12 < i11; i12++) {
                iArr[i12] = i;
            }
            i9 += this.f4941e;
        }
    }

    /* JADX INFO: renamed from: h */
    private C1195d m6055h() {
        if (this.f4948l == null) {
            this.f4948l = new C1195d();
        }
        return this.f4948l;
    }

    /* JADX INFO: renamed from: j */
    private Bitmap m6056j() {
        Bitmap bitmapMo6077b = this.f4938b.mo6077b(this.f4941e, this.f4940d, this.f4944h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        m6060s(bitmapMo6077b);
        return bitmapMo6077b;
    }

    /* JADX INFO: renamed from: o */
    private int m6057o() {
        int iM6058p = m6058p();
        if (iM6058p > 0) {
            try {
                if (this.f4939c == null) {
                    this.f4939c = this.f4938b.mo6076a(255);
                }
                int i = this.f4960x;
                int i2 = this.f4959w;
                int i3 = i - i2;
                if (i3 >= iM6058p) {
                    System.arraycopy(this.f4958v, i2, this.f4939c, 0, iM6058p);
                    this.f4959w += iM6058p;
                    return iM6058p;
                }
                if (this.f4953q.remaining() + i3 < iM6058p) {
                    this.f4956t = 1;
                    return iM6058p;
                }
                System.arraycopy(this.f4958v, this.f4959w, this.f4939c, 0, i3);
                this.f4959w = this.f4960x;
                m6059q();
                int i4 = iM6058p - i3;
                System.arraycopy(this.f4958v, 0, this.f4939c, i3, i4);
                this.f4959w += i4;
                return iM6058p;
            } catch (Exception e) {
                Logger.m5867d(f4936y, "Error Reading Block", e);
                this.f4956t = 1;
            }
        }
        return iM6058p;
    }

    /* JADX INFO: renamed from: p */
    private int m6058p() {
        try {
            m6059q();
            byte[] bArr = this.f4958v;
            int i = this.f4959w;
            this.f4959w = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.f4956t = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m6059q() {
        if (this.f4960x > this.f4959w) {
            return;
        }
        if (this.f4958v == null) {
            this.f4958v = this.f4938b.mo6076a(16384);
        }
        this.f4959w = 0;
        int iMin = Math.min(this.f4953q.remaining(), 16384);
        this.f4960x = iMin;
        this.f4953q.get(this.f4958v, 0, iMin);
    }

    @TargetApi(12)
    /* JADX INFO: renamed from: s */
    private static void m6060s(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    /* JADX INFO: renamed from: x */
    private Bitmap m6061x(C1193b c1193b, C1193b c1193b2) {
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr2 = this.f4947k;
        int i5 = 0;
        if (c1193b2 == null) {
            Arrays.fill(iArr2, 0);
        }
        int i6 = 3;
        int i7 = 2;
        int i8 = 1;
        if (c1193b2 != null && (i3 = c1193b2.f4963c) > 0) {
            if (i3 == 2) {
                if (!c1193b.f4971k) {
                    C1194c c1194c = this.f4943g;
                    i4 = c1194c.f4972a;
                    if (c1193b.f4969i != null && c1194c.f4973b == c1193b.f4970j) {
                    }
                    m6054d(iArr2, c1193b2, i4);
                } else if (this.f4942f == 0) {
                    this.f4944h = true;
                }
                i4 = 0;
                m6054d(iArr2, c1193b2, i4);
            } else if (i3 == 3) {
                Bitmap bitmap = this.f4952p;
                if (bitmap == null) {
                    m6054d(iArr2, c1193b2, 0);
                } else {
                    int i9 = c1193b2.f4968h;
                    int i10 = this.f4954r;
                    int i11 = i9 / i10;
                    int i12 = c1193b2.f4966f / i10;
                    int i13 = c1193b2.f4967g / i10;
                    int i14 = c1193b2.f4965e / i10;
                    int i15 = this.f4941e;
                    bitmap.getPixels(iArr2, (i12 * i15) + i14, i15, i14, i12, i13, i11);
                }
            }
        }
        int[] iArr3 = iArr2;
        m6053c(c1193b);
        int i16 = c1193b.f4968h;
        int i17 = this.f4954r;
        int i18 = i16 / i17;
        int i19 = c1193b.f4966f / i17;
        int i20 = c1193b.f4967g / i17;
        int i21 = c1193b.f4965e / i17;
        boolean z = this.f4942f == 0;
        int i22 = 8;
        int i23 = 0;
        int i24 = 1;
        while (i5 < i18) {
            if (c1193b.f4964d) {
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
            if (i25 < this.f4940d) {
                int i26 = this.f4941e;
                int i27 = i25 * i26;
                int i28 = i27 + i21;
                int i29 = i28 + i20;
                if (i27 + i26 < i29) {
                    i29 = i27 + i26;
                }
                int i30 = this.f4954r;
                int i31 = i5 * i30 * c1193b.f4967g;
                int i32 = ((i29 - i28) * i30) + i31;
                int i33 = i28;
                while (i33 < i29) {
                    int[] iArr4 = iArr3;
                    int i34 = i18;
                    int iM6052b = this.f4954r == 1 ? this.f4937a[this.f4946j[i31] & 255] : m6052b(i31, i32, c1193b.f4967g);
                    if (iM6052b != 0) {
                        iArr4[i33] = iM6052b;
                    } else if (!this.f4944h && z) {
                        this.f4944h = true;
                    }
                    i31 += this.f4954r;
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
        if (this.f4955s && ((i = c1193b.f4963c) == 0 || i == 1)) {
            if (this.f4952p == null) {
                this.f4952p = m6056j();
            }
            Bitmap bitmap2 = this.f4952p;
            int i35 = this.f4941e;
            iArr = iArr5;
            bitmap2.setPixels(iArr, 0, i35, 0, 0, i35, this.f4940d);
        } else {
            iArr = iArr5;
        }
        Bitmap bitmapM6056j = m6056j();
        int i36 = this.f4941e;
        bitmapM6056j.setPixels(iArr, 0, i36, 0, 0, i36, this.f4940d);
        return bitmapM6056j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m6062a() {
        if (this.f4943g.f4975d <= 0) {
            return false;
        }
        if (this.f4942f == m6065g() - 1) {
            this.f4945i++;
        }
        C1194c c1194c = this.f4943g;
        int i = c1194c.f4981j;
        if (i != -1 && this.f4945i > i) {
            return false;
        }
        this.f4942f = (this.f4942f + 1) % c1194c.f4975d;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public int m6063e() {
        return this.f4942f;
    }

    /* JADX INFO: renamed from: f */
    public int m6064f(int i) {
        if (i < 0) {
            return -1;
        }
        C1194c c1194c = this.f4943g;
        if (i < c1194c.f4975d) {
            return c1194c.f4976e.get(i).f4962b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m6065g() {
        return this.f4943g.f4975d;
    }

    /* JADX INFO: renamed from: i */
    public int m6066i() {
        return this.f4943g.f4980i;
    }

    /* JADX INFO: renamed from: k */
    public int m6067k() {
        int i;
        if (this.f4943g.f4975d <= 0 || (i = this.f4942f) < 0) {
            return 0;
        }
        return m6064f(i);
    }

    /* JADX INFO: renamed from: l */
    public synchronized Bitmap m6068l() {
        try {
            if (this.f4943g.f4975d <= 0 || this.f4942f < 0) {
                Logger.m5866d(f4936y, "unable to decode frame, frameCount=" + this.f4943g.f4975d + " framePointer=" + this.f4942f);
                this.f4956t = 1;
            }
            int i = this.f4956t;
            if (i != 1 && i != 2) {
                this.f4956t = 0;
                C1193b c1193b = this.f4943g.f4976e.get(this.f4942f);
                int i2 = this.f4942f - 1;
                C1193b c1193b2 = i2 >= 0 ? this.f4943g.f4976e.get(i2) : null;
                int[] iArr = c1193b.f4969i;
                if (iArr == null) {
                    iArr = this.f4943g.f4977f;
                }
                this.f4937a = iArr;
                if (iArr == null) {
                    Logger.m5866d(f4936y, "No Valid Color Table for frame #" + this.f4942f);
                    this.f4956t = 1;
                    return null;
                }
                if (c1193b.f4971k) {
                    System.arraycopy(iArr, 0, this.f4949m, 0, iArr.length);
                    int[] iArr2 = this.f4949m;
                    this.f4937a = iArr2;
                    iArr2[c1193b.f4970j] = 0;
                }
                return m6061x(c1193b, c1193b2);
            }
            Logger.m5866d(f4936y, "Unable to decode frame, status=" + this.f4956t);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m6069m() {
        return this.f4943g.f4984m;
    }

    /* JADX INFO: renamed from: n */
    public synchronized int m6070n(byte[] bArr) {
        try {
            C1194c c1194cM6094b = m6055h().m6096p(bArr).m6094b();
            this.f4943g = c1194cM6094b;
            if (bArr != null) {
                m6074v(c1194cM6094b, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4956t;
    }

    /* JADX INFO: renamed from: r */
    public void m6071r() {
        this.f4945i = 0;
    }

    /* JADX INFO: renamed from: t */
    public synchronized void m6072t(C1194c c1194c, ByteBuffer byteBuffer) {
        m6073u(c1194c, byteBuffer, 1);
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m6073u(C1194c c1194c, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.f4956t = 0;
            this.f4943g = c1194c;
            this.f4944h = false;
            this.f4942f = -1;
            m6071r();
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f4953q = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f4953q.order(ByteOrder.LITTLE_ENDIAN);
            this.f4955s = false;
            Iterator<C1193b> it = c1194c.f4976e.iterator();
            while (it.hasNext()) {
                if (it.next().f4963c == 3) {
                    this.f4955s = true;
                    break;
                }
            }
            this.f4954r = iHighestOneBit;
            int i2 = c1194c.f4984m;
            this.f4941e = i2 / iHighestOneBit;
            int i3 = c1194c.f4980i;
            this.f4940d = i3 / iHighestOneBit;
            this.f4946j = this.f4938b.mo6076a(i2 * i3);
            this.f4947k = this.f4938b.mo6078c(this.f4941e * this.f4940d);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m6074v(C1194c c1194c, byte[] bArr) {
        m6072t(c1194c, ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: w */
    public boolean m6075w(int i) {
        if (i < -1 || i >= m6065g()) {
            return false;
        }
        this.f4942f = i;
        return true;
    }

    public C1192a() {
        this(new C1196e());
    }
}
