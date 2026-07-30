package p153l;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p1g0 implements anj {

    /* JADX INFO: renamed from: u */
    private static final String f150151u = "p1g0";

    /* JADX INFO: renamed from: a */
    @ColorInt
    private int[] f150152a;

    /* JADX INFO: renamed from: b */
    @ColorInt
    private final int[] f150153b;

    /* JADX INFO: renamed from: c */
    private final anj.InterfaceC15750a f150154c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f150155d;

    /* JADX INFO: renamed from: e */
    private byte[] f150156e;

    /* JADX INFO: renamed from: f */
    private short[] f150157f;

    /* JADX INFO: renamed from: g */
    private byte[] f150158g;

    /* JADX INFO: renamed from: h */
    private byte[] f150159h;

    /* JADX INFO: renamed from: i */
    private byte[] f150160i;

    /* JADX INFO: renamed from: j */
    @ColorInt
    private int[] f150161j;

    /* JADX INFO: renamed from: k */
    private int f150162k;

    /* JADX INFO: renamed from: l */
    private jnj f150163l;

    /* JADX INFO: renamed from: m */
    private Bitmap f150164m;

    /* JADX INFO: renamed from: n */
    private boolean f150165n;

    /* JADX INFO: renamed from: o */
    private int f150166o;

    /* JADX INFO: renamed from: p */
    private int f150167p;

    /* JADX INFO: renamed from: q */
    private int f150168q;

    /* JADX INFO: renamed from: r */
    private int f150169r;

    /* JADX INFO: renamed from: s */
    @Nullable
    private Boolean f150170s;

    /* JADX INFO: renamed from: t */
    @NonNull
    private Bitmap.Config f150171t;

    public p1g0(@NonNull anj.InterfaceC15750a interfaceC15750a) {
        this.f150153b = new int[256];
        this.f150171t = Bitmap.Config.ARGB_8888;
        this.f150154c = interfaceC15750a;
        this.f150163l = new jnj();
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    private int m170196f(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f150167p + i; i9++) {
            byte[] bArr = this.f150160i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f150152a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f150167p + i11; i12++) {
            byte[] bArr2 = this.f150160i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f150152a[bArr2[i12] & 255];
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

    /* JADX INFO: renamed from: g */
    private void m170197g(gnj gnjVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.f150161j;
        int i5 = gnjVar.f105092d;
        int i6 = this.f150167p;
        int i7 = i5 / i6;
        int i8 = gnjVar.f105090b / i6;
        int i9 = gnjVar.f105091c / i6;
        int i10 = gnjVar.f105089a / i6;
        boolean z = this.f150162k == 0;
        int i11 = this.f150169r;
        int i12 = this.f150168q;
        byte[] bArr = this.f150160i;
        int[] iArr2 = this.f150152a;
        Boolean bool = this.f150170s;
        int i13 = 8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i15 < i7) {
            int[] iArr3 = iArr;
            if (gnjVar.f105093e) {
                if (i14 >= i7) {
                    int i17 = i16 + 1;
                    i = i7;
                    if (i17 == 2) {
                        i16 = i17;
                        i14 = 4;
                    } else if (i17 == 3) {
                        i16 = i17;
                        i13 = 4;
                        i14 = 2;
                    } else if (i17 != 4) {
                        i16 = i17;
                    } else {
                        i16 = i17;
                        i14 = 1;
                        i13 = 2;
                    }
                } else {
                    i = i7;
                }
                i2 = i14 + i13;
            } else {
                i = i7;
                i2 = i14;
                i14 = i15;
            }
            int i18 = i14 + i8;
            boolean z2 = i6 == 1;
            if (i18 < i12) {
                int i19 = i18 * i11;
                int i20 = i19 + i10;
                int i21 = i20 + i9;
                int i22 = i19 + i11;
                if (i22 < i21) {
                    i21 = i22;
                }
                i3 = i2;
                int i23 = i15 * i6 * gnjVar.f105091c;
                if (z2) {
                    int i24 = i20;
                    while (i24 < i21) {
                        int i25 = i24;
                        int i26 = iArr2[bArr[i23] & 255];
                        if (i26 != 0) {
                            iArr3[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i6;
                        i24 = i25 + 1;
                    }
                } else {
                    int i27 = ((i21 - i20) * i6) + i23;
                    i4 = i6;
                    int i28 = i20;
                    while (i28 < i21) {
                        int i29 = i21;
                        int iM170196f = m170196f(i23, i27, gnjVar.f105091c);
                        if (iM170196f != 0) {
                            iArr3[i28] = iM170196f;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i23 += i4;
                        i28++;
                        i21 = i29;
                    }
                }
                i15++;
                i6 = i4;
                iArr = iArr3;
                i7 = i;
                i14 = i3;
            } else {
                i3 = i2;
            }
            i4 = i6;
            i15++;
            i6 = i4;
            iArr = iArr3;
            i7 = i;
            i14 = i3;
        }
        if (this.f150170s == null) {
            this.f150170s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: h */
    private void m170198h(gnj gnjVar) {
        gnj gnjVar2 = gnjVar;
        int[] iArr = this.f150161j;
        int i = gnjVar2.f105092d;
        int i2 = gnjVar2.f105090b;
        int i3 = gnjVar2.f105091c;
        int i4 = gnjVar2.f105089a;
        boolean z = this.f150162k == 0;
        int i5 = this.f150169r;
        byte[] bArr = this.f150160i;
        int[] iArr2 = this.f150152a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = gnjVar2.f105091c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int[] iArr3 = iArr;
                int i13 = b2 & 255;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr3[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                iArr = iArr3;
            }
            i6++;
            gnjVar2 = gnjVar;
        }
        Boolean bool = this.f150170s;
        this.f150170s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f150170s == null && z && b != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15, types: [short] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX INFO: renamed from: i */
    private void m170199i(gnj gnjVar) {
        int i;
        int i2;
        short s;
        p1g0 p1g0Var = this;
        if (gnjVar != null) {
            p1g0Var.f150155d.position(gnjVar.f105098j);
        }
        if (gnjVar == null) {
            jnj jnjVar = p1g0Var.f150163l;
            i = jnjVar.f121863f;
            i2 = jnjVar.f121864g;
        } else {
            i = gnjVar.f105091c;
            i2 = gnjVar.f105092d;
        }
        int i3 = i * i2;
        byte[] bArr = p1g0Var.f150160i;
        if (bArr == null || bArr.length < i3) {
            p1g0Var.f150160i = p1g0Var.f150154c.mo98989a(i3);
        }
        byte[] bArr2 = p1g0Var.f150160i;
        if (p1g0Var.f150157f == null) {
            p1g0Var.f150157f = new short[4096];
        }
        short[] sArr = p1g0Var.f150157f;
        if (p1g0Var.f150158g == null) {
            p1g0Var.f150158g = new byte[4096];
        }
        byte[] bArr3 = p1g0Var.f150158g;
        if (p1g0Var.f150159h == null) {
            p1g0Var.f150159h = new byte[4097];
        }
        byte[] bArr4 = p1g0Var.f150159h;
        int iM170202m = p1g0Var.m170202m();
        int i4 = 1 << iM170202m;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iM170202m + 1;
        int i8 = (1 << i7) - 1;
        byte b = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            sArr[i9] = 0;
            bArr3[i9] = (byte) i9;
        }
        byte[] bArr5 = p1g0Var.f150156e;
        int i10 = i7;
        int i11 = i6;
        int i12 = i8;
        int i13 = 0;
        int iM170201l = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (i13 < i3) {
            if (iM170201l == 0) {
                iM170201l = p1g0Var.m170201l();
                if (iM170201l <= 0) {
                    p1g0Var.f150166o = 3;
                    break;
                }
                i14 = b;
            }
            i16 += (bArr5[i14] & 255) << i15;
            i14++;
            iM170201l--;
            int i21 = i15 + 8;
            i11 = i11;
            int i22 = i20;
            int i23 = i10;
            short[] sArr2 = sArr;
            int i24 = i19;
            while (true) {
                bArr3 = bArr3;
                if (i21 < i23) {
                    i19 = i24;
                    break;
                }
                int i25 = i16 & i12;
                i16 >>= i23;
                i21 -= i23;
                if (i25 == i4) {
                    i23 = i7;
                    i11 = i6;
                    i12 = i8;
                    i22 = -1;
                } else {
                    if (i25 == i5) {
                        i19 = i24;
                        break;
                    }
                    byte[] bArr6 = bArr4;
                    if (i22 == -1) {
                        bArr2[i17] = bArr3[i25];
                        i17++;
                        i13++;
                        i22 = i25;
                        i24 = i22;
                        bArr4 = bArr6;
                    } else {
                        if (i25 >= i11) {
                            bArr6[i18] = (byte) i24;
                            i18++;
                            s = i22;
                        } else {
                            s = i25;
                        }
                        while (s >= i4) {
                            bArr6[i18] = bArr3[s];
                            i18++;
                            s = sArr2[s];
                        }
                        int i26 = bArr3[s] & 255;
                        byte b2 = (byte) i26;
                        bArr2[i17] = b2;
                        while (true) {
                            i17++;
                            i13++;
                            if (i18 <= 0) {
                                break;
                            }
                            i18--;
                            bArr2[i17] = bArr6[i18];
                        }
                        if (i11 < 4096) {
                            sArr2[i11] = (short) i22;
                            bArr3[i11] = b2;
                            i11++;
                            if ((i11 & i12) == 0 && i11 < 4096) {
                                i23++;
                                i12 += i11;
                            }
                        }
                        i22 = i25;
                        bArr4 = bArr6;
                        i24 = i26;
                    }
                }
            }
            i15 = i21;
            sArr = sArr2;
            bArr3 = bArr3;
            b = 0;
            i20 = i22;
            i10 = i23;
            p1g0Var = this;
        }
        Arrays.fill(bArr2, i17, i3, b);
    }

    /* JADX INFO: renamed from: k */
    private Bitmap m170200k() {
        Boolean bool = this.f150170s;
        Bitmap bitmapMo98990b = this.f150154c.mo98990b(this.f150169r, this.f150168q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f150171t);
        bitmapMo98990b.setHasAlpha(true);
        return bitmapMo98990b;
    }

    /* JADX INFO: renamed from: l */
    private int m170201l() {
        int iM170202m = m170202m();
        if (iM170202m <= 0) {
            return iM170202m;
        }
        ByteBuffer byteBuffer = this.f150155d;
        byteBuffer.get(this.f150156e, 0, Math.min(iM170202m, byteBuffer.remaining()));
        return iM170202m;
    }

    /* JADX INFO: renamed from: m */
    private int m170202m() {
        return this.f150155d.get() & 255;
    }

    /* JADX INFO: renamed from: o */
    private Bitmap m170203o(gnj gnjVar, gnj gnjVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f150161j;
        int i3 = 0;
        if (gnjVar2 == null) {
            Bitmap bitmap2 = this.f150164m;
            if (bitmap2 != null) {
                this.f150154c.mo98992d(bitmap2);
            }
            this.f150164m = null;
            Arrays.fill(iArr, 0);
        }
        if (gnjVar2 != null && gnjVar2.f105095g == 3 && this.f150164m == null) {
            Arrays.fill(iArr, 0);
        }
        if (gnjVar2 != null && (i2 = gnjVar2.f105095g) > 0) {
            if (i2 == 2) {
                if (!gnjVar.f105094f) {
                    jnj jnjVar = this.f150163l;
                    int i4 = jnjVar.f121869l;
                    if (gnjVar.f105099k == null || jnjVar.f121867j != gnjVar.f105096h) {
                        i3 = i4;
                    }
                }
                int i5 = gnjVar2.f105092d;
                int i6 = this.f150167p;
                int i7 = i5 / i6;
                int i8 = gnjVar2.f105090b / i6;
                int i9 = gnjVar2.f105091c / i6;
                int i10 = gnjVar2.f105089a / i6;
                int i11 = this.f150169r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f150169r;
                }
            } else if (i2 == 3 && (bitmap = this.f150164m) != null) {
                int i16 = this.f150169r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f150168q);
            }
        }
        m170199i(gnjVar);
        if (gnjVar.f105093e || this.f150167p != 1) {
            m170197g(gnjVar);
        } else {
            m170198h(gnjVar);
        }
        if (this.f150165n && ((i = gnjVar.f105095g) == 0 || i == 1)) {
            if (this.f150164m == null) {
                this.f150164m = m170200k();
            }
            Bitmap bitmap3 = this.f150164m;
            int i17 = this.f150169r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f150168q);
        }
        Bitmap bitmapM170200k = m170200k();
        int i18 = this.f150169r;
        bitmapM170200k.setPixels(iArr, 0, i18, 0, 0, i18, this.f150168q);
        return bitmapM170200k;
    }

    @Override // p153l.anj
    /* JADX INFO: renamed from: a */
    public void mo98984a(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f150171t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    @Override // p153l.anj
    public void advance() {
        this.f150162k = (this.f150162k + 1) % this.f150163l.f121860c;
    }

    @Override // p153l.anj
    /* JADX INFO: renamed from: b */
    public void mo98985b() {
        this.f150162k = -1;
    }

    @Override // p153l.anj
    /* JADX INFO: renamed from: c */
    public int mo98986c() {
        return this.f150162k;
    }

    @Override // p153l.anj
    public void clear() {
        this.f150163l = null;
        byte[] bArr = this.f150160i;
        if (bArr != null) {
            this.f150154c.mo98993e(bArr);
        }
        int[] iArr = this.f150161j;
        if (iArr != null) {
            this.f150154c.mo98994f(iArr);
        }
        Bitmap bitmap = this.f150164m;
        if (bitmap != null) {
            this.f150154c.mo98992d(bitmap);
        }
        this.f150164m = null;
        this.f150155d = null;
        this.f150170s = null;
        byte[] bArr2 = this.f150156e;
        if (bArr2 != null) {
            this.f150154c.mo98993e(bArr2);
        }
    }

    @Override // p153l.anj
    /* JADX INFO: renamed from: d */
    public int mo98987d() {
        return this.f150155d.limit() + this.f150160i.length + (this.f150161j.length * 4);
    }

    @Override // p153l.anj
    /* JADX INFO: renamed from: e */
    public int mo98988e() {
        int i;
        if (this.f150163l.f121860c <= 0 || (i = this.f150162k) < 0) {
            return 0;
        }
        return m170204j(i);
    }

    @Override // p153l.anj
    @NonNull
    public ByteBuffer getData() {
        return this.f150155d;
    }

    @Override // p153l.anj
    public int getFrameCount() {
        return this.f150163l.f121860c;
    }

    @Override // p153l.anj
    @Nullable
    public synchronized Bitmap getNextFrame() {
        try {
            if (this.f150163l.f121860c <= 0 || this.f150162k < 0) {
                if (Log.isLoggable(f150151u, 3)) {
                    int i = this.f150163l.f121860c;
                }
                this.f150166o = 1;
            }
            int i2 = this.f150166o;
            if (i2 != 1 && i2 != 2) {
                this.f150166o = 0;
                if (this.f150156e == null) {
                    this.f150156e = this.f150154c.mo98989a(255);
                }
                gnj gnjVar = this.f150163l.f121862e.get(this.f150162k);
                int i3 = this.f150162k - 1;
                gnj gnjVar2 = i3 >= 0 ? this.f150163l.f121862e.get(i3) : null;
                int[] iArr = gnjVar.f105099k;
                if (iArr == null) {
                    iArr = this.f150163l.f121858a;
                }
                this.f150152a = iArr;
                if (iArr == null) {
                    Log.isLoggable(f150151u, 3);
                    this.f150166o = 1;
                    return null;
                }
                if (gnjVar.f105094f) {
                    System.arraycopy(iArr, 0, this.f150153b, 0, iArr.length);
                    int[] iArr2 = this.f150153b;
                    this.f150152a = iArr2;
                    iArr2[gnjVar.f105096h] = 0;
                    if (gnjVar.f105095g == 2 && this.f150162k == 0) {
                        this.f150170s = Boolean.TRUE;
                    }
                }
                return m170203o(gnjVar, gnjVar2);
            }
            Log.isLoggable(f150151u, 3);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public int m170204j(int i) {
        if (i < 0) {
            return -1;
        }
        jnj jnjVar = this.f150163l;
        if (i < jnjVar.f121860c) {
            return jnjVar.f121862e.get(i).f105097i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m170205n(@NonNull jnj jnjVar, @NonNull ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.f150166o = 0;
            this.f150163l = jnjVar;
            this.f150162k = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f150155d = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f150155d.order(ByteOrder.LITTLE_ENDIAN);
            this.f150165n = false;
            Iterator<gnj> it = jnjVar.f121862e.iterator();
            while (it.hasNext()) {
                if (it.next().f105095g == 3) {
                    this.f150165n = true;
                    break;
                }
            }
            this.f150167p = iHighestOneBit;
            int i2 = jnjVar.f121863f;
            this.f150169r = i2 / iHighestOneBit;
            int i3 = jnjVar.f121864g;
            this.f150168q = i3 / iHighestOneBit;
            this.f150160i = this.f150154c.mo98989a(i2 * i3);
            this.f150161j = this.f150154c.mo98991c(this.f150169r * this.f150168q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public p1g0(@NonNull anj.InterfaceC15750a interfaceC15750a, jnj jnjVar, ByteBuffer byteBuffer, int i) {
        this(interfaceC15750a);
        m170205n(jnjVar, byteBuffer, i);
    }
}
