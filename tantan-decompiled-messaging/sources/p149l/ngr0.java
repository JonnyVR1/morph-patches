package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class ngr0 implements rfr0 {

    /* JADX INFO: renamed from: h */
    public static final byte[] f138894h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f138895i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f138896j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f138897a;

    /* JADX INFO: renamed from: b */
    public final Paint f138898b;

    /* JADX INFO: renamed from: c */
    public final Canvas f138899c;

    /* JADX INFO: renamed from: d */
    public final wfr0 f138900d;

    /* JADX INFO: renamed from: e */
    public final vfr0 f138901e;

    /* JADX INFO: renamed from: f */
    public final mgr0 f138902f;

    /* JADX INFO: renamed from: g */
    public Bitmap f138903g;

    public ngr0(List list) {
        v6w0 v6w0Var = new v6w0((byte[]) list.get(0));
        int iM197242F = v6w0Var.m197242F();
        int iM197242F2 = v6w0Var.m197242F();
        Paint paint = new Paint();
        this.f138897a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f138898b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f138899c = new Canvas();
        this.f138900d = new wfr0(719, 575, 0, 719, 0, 575);
        this.f138901e = new vfr0(0, m159350g(), m159351h(), m159352i());
        this.f138902f = new mgr0(iM197242F, iM197242F2);
    }

    /* JADX INFO: renamed from: b */
    public static int m159345b(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX INFO: renamed from: c */
    public static vfr0 m159346c(x5w0 x5w0Var, int i) {
        int[] iArr;
        int iM207150d;
        int iM207150d2;
        int iM207150d3;
        int iM207150d4;
        int i2 = 8;
        int iM207150d5 = x5w0Var.m207150d(8);
        x5w0Var.m207159m(8);
        int[] iArrM159350g = m159350g();
        int[] iArrM159351h = m159351h();
        int[] iArrM159352i = m159352i();
        int i3 = i - 2;
        while (i3 > 0) {
            int iM207150d6 = x5w0Var.m207150d(i2);
            int iM207150d7 = x5w0Var.m207150d(i2);
            if ((iM207150d7 & 128) != 0) {
                iArr = iArrM159350g;
            } else {
                iArr = (iM207150d7 & 64) != 0 ? iArrM159351h : iArrM159352i;
            }
            if ((iM207150d7 & 1) != 0) {
                iM207150d3 = x5w0Var.m207150d(i2);
                iM207150d4 = x5w0Var.m207150d(i2);
                iM207150d = x5w0Var.m207150d(i2);
                iM207150d2 = x5w0Var.m207150d(i2);
                i3 -= 6;
            } else {
                int iM207150d8 = x5w0Var.m207150d(6) << 2;
                int iM207150d9 = x5w0Var.m207150d(4) << 4;
                i3 -= 4;
                iM207150d = x5w0Var.m207150d(4) << 4;
                iM207150d2 = x5w0Var.m207150d(2) << 6;
                iM207150d3 = iM207150d8;
                iM207150d4 = iM207150d9;
            }
            if (iM207150d3 == 0) {
                iM207150d2 = 255;
            }
            if (iM207150d3 == 0) {
                iM207150d = 0;
            }
            if (iM207150d3 == 0) {
                iM207150d4 = 0;
            }
            double d = iM207150d3;
            double d2 = iM207150d4 - 128;
            double d3 = iM207150d - 128;
            iArr[iM207150d6] = m159345b((byte) (255 - (iM207150d2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            iM207150d5 = iM207150d5;
            i2 = 8;
        }
        return new vfr0(iM207150d5, iArrM159350g, iArrM159351h, iArrM159352i);
    }

    /* JADX INFO: renamed from: d */
    public static xfr0 m159347d(x5w0 x5w0Var) {
        byte[] bArr;
        int iM207150d = x5w0Var.m207150d(16);
        x5w0Var.m207159m(4);
        int iM207150d2 = x5w0Var.m207150d(2);
        boolean zM207161o = x5w0Var.m207161o();
        x5w0Var.m207159m(1);
        byte[] bArr2 = ggw0.f102573f;
        if (iM207150d2 != 1) {
            if (iM207150d2 == 0) {
                int iM207150d3 = x5w0Var.m207150d(16);
                int iM207150d4 = x5w0Var.m207150d(16);
                if (iM207150d3 > 0) {
                    bArr2 = new byte[iM207150d3];
                    x5w0Var.m207154h(bArr2, 0, iM207150d3);
                }
                if (iM207150d4 > 0) {
                    bArr = new byte[iM207150d4];
                    x5w0Var.m207154h(bArr, 0, iM207150d4);
                }
            }
            return new xfr0(iM207150d, zM207161o, bArr2, bArr);
        }
        x5w0Var.m207159m(x5w0Var.m207150d(8) * 16);
        bArr = bArr2;
        return new xfr0(iM207150d, zM207161o, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m159348e(byte[] bArr, int[] iArr, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        int iM207150d;
        int iM207150d2;
        int iM207150d3;
        int i4;
        int iM207150d4;
        int iM207150d5;
        int i5;
        int i6;
        int iM207150d6;
        int i7;
        Paint paint2 = paint;
        x5w0 x5w0Var = new x5w0(bArr, bArr.length);
        int i8 = i2;
        int i9 = i3;
        byte[] bArrM159349f = null;
        byte[] bArrM159349f2 = null;
        byte[] bArrM159349f3 = null;
        while (x5w0Var.m207147a() != 0) {
            int iM207150d7 = x5w0Var.m207150d(8);
            if (iM207150d7 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iM207150d7) {
                    case 16:
                        int i13 = 1;
                        if (i == 3) {
                            if (bArrM159349f == null) {
                                bArr3 = f138895i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrM159349f;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrM159349f3 == null) {
                            bArr3 = f138894h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrM159349f3;
                        }
                        int i14 = 0;
                        while (true) {
                            int iM207150d8 = x5w0Var.m207150d(2);
                            if (iM207150d8 != 0) {
                                iM207150d2 = i13;
                                iM207150d = iM207150d8;
                            } else {
                                if (x5w0Var.m207161o()) {
                                    iM207150d3 = x5w0Var.m207150d(3) + 3;
                                    iM207150d = x5w0Var.m207150d(2);
                                } else {
                                    if (x5w0Var.m207161o()) {
                                        iM207150d2 = i13;
                                        iM207150d = 0;
                                    } else {
                                        int iM207150d9 = x5w0Var.m207150d(2);
                                        if (iM207150d9 == 0) {
                                            c = 4;
                                            i14 = i13;
                                            iM207150d = 0;
                                            iM207150d2 = 0;
                                        } else if (iM207150d9 == i13) {
                                            c = 4;
                                            i14 = i14;
                                            iM207150d2 = 2;
                                            iM207150d = 0;
                                        } else if (iM207150d9 == 2) {
                                            c = 4;
                                            i14 = i14;
                                            iM207150d2 = x5w0Var.m207150d(4) + 12;
                                            iM207150d = x5w0Var.m207150d(2);
                                        } else if (iM207150d9 != 3) {
                                            iM207150d = 0;
                                            iM207150d2 = 0;
                                        } else {
                                            iM207150d3 = x5w0Var.m207150d(8) + 29;
                                            iM207150d = x5w0Var.m207150d(2);
                                        }
                                        if (iM207150d2 == 0 && paint2 != null) {
                                            int i15 = i9 + 1;
                                            float f = i9;
                                            if (bArr2 != 0) {
                                                iM207150d = bArr2[iM207150d];
                                            }
                                            paint2.setColor(iArr[iM207150d]);
                                            canvas.drawRect(i8, f, i8 + iM207150d2, i15, paint2);
                                        }
                                        i8 += iM207150d2;
                                        if (i14 != 0) {
                                            x5w0Var.m207151e();
                                        } else {
                                            paint2 = paint;
                                            i14 = i14;
                                            i13 = 1;
                                        }
                                    }
                                    c = 4;
                                    if (iM207150d2 == 0) {
                                    }
                                    i8 += iM207150d2;
                                    if (i14 != 0) {
                                        x5w0Var.m207151e();
                                    } else {
                                        paint2 = paint;
                                        i14 = i14;
                                        i13 = 1;
                                    }
                                }
                                iM207150d2 = iM207150d3;
                            }
                            c = 4;
                            if (iM207150d2 == 0) {
                            }
                            i8 += iM207150d2;
                            if (i14 != 0) {
                                x5w0Var.m207151e();
                            } else {
                                paint2 = paint;
                                i14 = i14;
                                i13 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrM159349f2 == null ? f138896j : bArrM159349f2 : null;
                        boolean z = false;
                        while (true) {
                            int iM207150d10 = x5w0Var.m207150d(i10);
                            if (iM207150d10 != 0) {
                                i4 = 1;
                                z = z;
                            } else if (x5w0Var.m207161o()) {
                                if (x5w0Var.m207161o()) {
                                    int iM207150d11 = x5w0Var.m207150d(i12);
                                    if (iM207150d11 == 0) {
                                        i4 = 1;
                                    } else if (iM207150d11 == 1) {
                                        i4 = i12;
                                    } else if (iM207150d11 == i12) {
                                        iM207150d4 = x5w0Var.m207150d(i10) + 9;
                                        iM207150d5 = x5w0Var.m207150d(i10);
                                    } else if (iM207150d11 != 3) {
                                        z = z;
                                        iM207150d10 = 0;
                                        i4 = 0;
                                    } else {
                                        iM207150d4 = x5w0Var.m207150d(8) + 25;
                                        iM207150d5 = x5w0Var.m207150d(i10);
                                    }
                                    iM207150d10 = 0;
                                } else {
                                    iM207150d4 = x5w0Var.m207150d(i12) + i10;
                                    iM207150d5 = x5w0Var.m207150d(i10);
                                }
                                i4 = iM207150d4;
                                z = z;
                                iM207150d10 = iM207150d5;
                            } else {
                                int iM207150d12 = x5w0Var.m207150d(3);
                                if (iM207150d12 != 0) {
                                    i4 = iM207150d12 + 2;
                                    iM207150d10 = 0;
                                } else {
                                    z = true;
                                    iM207150d10 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint2 == null) {
                                i5 = i12;
                            } else {
                                int i16 = i9 + 1;
                                float f2 = i9;
                                if (bArr4 != 0) {
                                    iM207150d10 = bArr4[iM207150d10];
                                }
                                paint2.setColor(iArr[iM207150d10]);
                                i5 = 2;
                                canvas.drawRect(i8, f2, i8 + i4, i16, paint2);
                            }
                            i8 += i4;
                            if (z) {
                                x5w0Var.m207151e();
                                continue;
                            } else {
                                i12 = i5;
                                z = z;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i17 = i8;
                        int i18 = 0;
                        while (true) {
                            int iM207150d13 = x5w0Var.m207150d(8);
                            if (iM207150d13 != 0) {
                                i6 = i18;
                                iM207150d6 = i11;
                            } else if (x5w0Var.m207161o()) {
                                i6 = i18;
                                iM207150d6 = x5w0Var.m207150d(7);
                                iM207150d13 = x5w0Var.m207150d(8);
                            } else {
                                int iM207150d14 = x5w0Var.m207150d(7);
                                if (iM207150d14 != 0) {
                                    i6 = i18;
                                    iM207150d6 = iM207150d14;
                                    iM207150d13 = 0;
                                } else {
                                    i6 = i11;
                                    iM207150d13 = 0;
                                    iM207150d6 = 0;
                                }
                            }
                            if (iM207150d6 == 0 || paint2 == null) {
                                i7 = i11;
                            } else {
                                paint2.setColor(iArr[iM207150d13]);
                                i7 = i11;
                                canvas.drawRect(i17, i9, i17 + iM207150d6, i9 + 1, paint2);
                            }
                            i17 += iM207150d6;
                            if (i6 != 0) {
                                i8 = i17;
                                continue;
                            } else {
                                i11 = i7;
                                i18 = i6;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM207150d7) {
                            case 32:
                                bArrM159349f3 = m159349f(4, 4, x5w0Var);
                                break;
                            case 33:
                                bArrM159349f = m159349f(4, 8, x5w0Var);
                                break;
                            case 34:
                                bArrM159349f2 = m159349f(16, 8, x5w0Var);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
            } else {
                i9 += 2;
                i8 = i2;
            }
            paint2 = paint;
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m159349f(int i, int i2, x5w0 x5w0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) x5w0Var.m207150d(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m159350g() {
        return new int[]{0, -1, RoundedDrawable.DEFAULT_BORDER_COLOR, -8421505};
    }

    /* JADX INFO: renamed from: h */
    public static int[] m159351h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = m159345b(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = m159345b(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public static int[] m159352i() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = m159345b(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
                int i4 = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                if (i3 == 0) {
                    int i5 = i2 & 16;
                    int i6 = i2 & 32;
                    int i7 = i2 & 2;
                    int i8 = i2 & 64;
                    int i9 = i2 & 4;
                    int i10 = 1 != (i2 & 1) ? 0 : 85;
                    int i11 = i5 != 0 ? 170 : 0;
                    int i12 = i7 != 0 ? 85 : 0;
                    int i13 = i6 != 0 ? 170 : 0;
                    i = i9 == 0 ? 0 : 85;
                    if (i8 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = m159345b(255, i10 + i11, i12 + i13, i + i4);
                } else if (i3 == 8) {
                    int i14 = i2 & 16;
                    int i15 = i2 & 32;
                    int i16 = i2 & 2;
                    int i17 = i2 & 64;
                    int i18 = i2 & 4;
                    int i19 = 1 != (i2 & 1) ? 0 : 85;
                    int i20 = i14 != 0 ? 170 : 0;
                    int i21 = i16 != 0 ? 85 : 0;
                    int i22 = i15 != 0 ? 170 : 0;
                    i = i18 == 0 ? 0 : 85;
                    if (i17 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = m159345b(127, i19 + i20, i21 + i22, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = m159345b(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = m159345b(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        boolean z;
        kfr0 kfr0Var;
        float f;
        float f2;
        char c;
        int i3;
        kgr0 kgr0Var;
        int iM207150d;
        int iM207150d2;
        int iM207150d3;
        int iM207150d4;
        int i4;
        int iM207150d5;
        x5w0 x5w0Var = new x5w0(bArr, i + i2);
        x5w0Var.m207157k(i);
        while (true) {
            z = true;
            if (x5w0Var.m207147a() >= 48 && x5w0Var.m207150d(8) == 15) {
                mgr0 mgr0Var = this.f138902f;
                int iM207150d6 = x5w0Var.m207150d(8);
                int iM207150d7 = x5w0Var.m207150d(16);
                int iM207150d8 = x5w0Var.m207150d(16);
                int iM207148b = x5w0Var.m207148b() + iM207150d8;
                if (iM207150d8 * 8 > x5w0Var.m207147a()) {
                    svv0.m186111f("DvbParser", "Data field length exceeds limit");
                    x5w0Var.m207159m(x5w0Var.m207147a());
                } else {
                    switch (iM207150d6) {
                        case 16:
                            if (iM207150d7 == mgr0Var.f133714a) {
                                yfr0 yfr0Var = mgr0Var.f133722i;
                                int iM207150d9 = x5w0Var.m207150d(8);
                                int iM207150d10 = x5w0Var.m207150d(4);
                                int iM207150d11 = x5w0Var.m207150d(2);
                                x5w0Var.m207159m(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i5 = iM207150d8 - 2; i5 > 0; i5 -= 6) {
                                    int iM207150d12 = x5w0Var.m207150d(8);
                                    x5w0Var.m207159m(8);
                                    sparseArray.put(iM207150d12, new zfr0(x5w0Var.m207150d(16), x5w0Var.m207150d(16)));
                                }
                                yfr0 yfr0Var2 = new yfr0(iM207150d9, iM207150d10, iM207150d11, sparseArray);
                                if (yfr0Var2.f198082b != 0) {
                                    mgr0Var.f133722i = yfr0Var2;
                                    mgr0Var.f133716c.clear();
                                    mgr0Var.f133717d.clear();
                                    mgr0Var.f133718e.clear();
                                } else if (yfr0Var != null) {
                                    if (yfr0Var.f198081a != yfr0Var2.f198081a) {
                                        mgr0Var.f133722i = yfr0Var2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            yfr0 yfr0Var3 = mgr0Var.f133722i;
                            if (iM207150d7 == mgr0Var.f133714a && yfr0Var3 != null) {
                                int iM207150d13 = x5w0Var.m207150d(8);
                                x5w0Var.m207159m(4);
                                boolean zM207161o = x5w0Var.m207161o();
                                x5w0Var.m207159m(3);
                                int iM207150d14 = x5w0Var.m207150d(16);
                                int iM207150d15 = x5w0Var.m207150d(16);
                                int iM207150d16 = x5w0Var.m207150d(3);
                                int iM207150d17 = x5w0Var.m207150d(3);
                                x5w0Var.m207159m(2);
                                int iM207150d18 = x5w0Var.m207150d(8);
                                int iM207150d19 = x5w0Var.m207150d(8);
                                int iM207150d20 = x5w0Var.m207150d(4);
                                int iM207150d21 = x5w0Var.m207150d(2);
                                x5w0Var.m207159m(2);
                                int i6 = iM207150d8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i6 > 0) {
                                    int iM207150d22 = x5w0Var.m207150d(16);
                                    int iM207150d23 = x5w0Var.m207150d(2);
                                    int iM207150d24 = x5w0Var.m207150d(2);
                                    int iM207150d25 = x5w0Var.m207150d(12);
                                    x5w0Var.m207159m(4);
                                    int iM207150d26 = x5w0Var.m207150d(12);
                                    int i7 = i6 - 6;
                                    if (iM207150d23 == 1) {
                                        i6 -= 8;
                                        iM207150d = x5w0Var.m207150d(8);
                                        iM207150d2 = x5w0Var.m207150d(8);
                                    } else if (iM207150d23 == 2) {
                                        iM207150d23 = 2;
                                        i6 -= 8;
                                        iM207150d = x5w0Var.m207150d(8);
                                        iM207150d2 = x5w0Var.m207150d(8);
                                    } else {
                                        i6 = i7;
                                        iM207150d = 0;
                                        iM207150d2 = 0;
                                    }
                                    sparseArray2.put(iM207150d22, new lgr0(iM207150d23, iM207150d24, iM207150d25, iM207150d26, iM207150d, iM207150d2));
                                }
                                kgr0 kgr0Var2 = new kgr0(iM207150d13, zM207161o, iM207150d14, iM207150d15, iM207150d16, iM207150d17, iM207150d18, iM207150d19, iM207150d20, iM207150d21, sparseArray2);
                                if (yfr0Var3.f198082b == 0 && (kgr0Var = (kgr0) mgr0Var.f133716c.get(kgr0Var2.f123058a)) != null) {
                                    int i8 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = kgr0Var.f123067j;
                                        if (i8 < sparseArray3.size()) {
                                            kgr0Var2.f123067j.put(sparseArray3.keyAt(i8), (lgr0) sparseArray3.valueAt(i8));
                                            i8++;
                                        }
                                    }
                                }
                                mgr0Var.f133716c.put(kgr0Var2.f123058a, kgr0Var2);
                            }
                            break;
                        case 18:
                            if (iM207150d7 == mgr0Var.f133714a) {
                                vfr0 vfr0VarM159346c = m159346c(x5w0Var, iM207150d8);
                                mgr0Var.f133717d.put(vfr0VarM159346c.f181294a, vfr0VarM159346c);
                            } else if (iM207150d7 == mgr0Var.f133715b) {
                                vfr0 vfr0VarM159346c2 = m159346c(x5w0Var, iM207150d8);
                                mgr0Var.f133719f.put(vfr0VarM159346c2.f181294a, vfr0VarM159346c2);
                            }
                            break;
                        case 19:
                            if (iM207150d7 == mgr0Var.f133714a) {
                                xfr0 xfr0VarM159347d = m159347d(x5w0Var);
                                mgr0Var.f133718e.put(xfr0VarM159347d.f192710a, xfr0VarM159347d);
                            } else if (iM207150d7 == mgr0Var.f133715b) {
                                xfr0 xfr0VarM159347d2 = m159347d(x5w0Var);
                                mgr0Var.f133720g.put(xfr0VarM159347d2.f192710a, xfr0VarM159347d2);
                            }
                            break;
                        case 20:
                            if (iM207150d7 == mgr0Var.f133714a) {
                                x5w0Var.m207159m(4);
                                boolean zM207161o2 = x5w0Var.m207161o();
                                x5w0Var.m207159m(3);
                                int iM207150d27 = x5w0Var.m207150d(16);
                                int iM207150d28 = x5w0Var.m207150d(16);
                                if (zM207161o2) {
                                    int iM207150d29 = x5w0Var.m207150d(16);
                                    iM207150d3 = x5w0Var.m207150d(16);
                                    iM207150d5 = x5w0Var.m207150d(16);
                                    iM207150d4 = x5w0Var.m207150d(16);
                                    i4 = iM207150d29;
                                } else {
                                    iM207150d3 = iM207150d27;
                                    iM207150d4 = iM207150d28;
                                    i4 = 0;
                                    iM207150d5 = 0;
                                }
                                mgr0Var.f133721h = new wfr0(iM207150d27, iM207150d28, i4, iM207150d3, iM207150d5, iM207150d4);
                            }
                            break;
                    }
                    x5w0Var.m207160n(iM207148b - x5w0Var.m207148b());
                }
            }
        }
        mgr0 mgr0Var2 = this.f138902f;
        yfr0 yfr0Var4 = mgr0Var2.f133722i;
        if (yfr0Var4 == null) {
            kfr0Var = new kfr0(zzgaa.zzl(), -9223372036854775807L, -9223372036854775807L);
        } else {
            wfr0 wfr0Var = mgr0Var2.f133721h;
            if (wfr0Var == null) {
                wfr0Var = this.f138900d;
            }
            Bitmap bitmap = this.f138903g;
            if (bitmap == null || wfr0Var.f186105a + 1 != bitmap.getWidth() || wfr0Var.f186106b + 1 != this.f138903g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(wfr0Var.f186105a + 1, wfr0Var.f186106b + 1, Bitmap.Config.ARGB_8888);
                this.f138903g = bitmapCreateBitmap;
                this.f138899c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = yfr0Var4.f198083c;
            int i9 = 0;
            while (i9 < sparseArray4.size()) {
                this.f138899c.save();
                zfr0 zfr0Var = (zfr0) sparseArray4.valueAt(i9);
                kgr0 kgr0Var3 = (kgr0) this.f138902f.f133716c.get(sparseArray4.keyAt(i9));
                int i10 = zfr0Var.f202975a + wfr0Var.f186107c;
                int i11 = zfr0Var.f202976b + wfr0Var.f186109e;
                this.f138899c.clipRect(i10, i11, Math.min(kgr0Var3.f123060c + i10, wfr0Var.f186108d), Math.min(kgr0Var3.f123061d + i11, wfr0Var.f186110f));
                vfr0 vfr0Var = (vfr0) this.f138902f.f133717d.get(kgr0Var3.f123063f);
                if (vfr0Var == null) {
                    vfr0Var = (vfr0) this.f138902f.f133719f.get(kgr0Var3.f123063f);
                    if (vfr0Var == null) {
                        vfr0Var = this.f138901e;
                    }
                }
                SparseArray sparseArray5 = kgr0Var3.f123067j;
                int i12 = 0;
                while (i12 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i12);
                    boolean z2 = z;
                    lgr0 lgr0Var = (lgr0) sparseArray5.valueAt(i12);
                    xfr0 xfr0Var = (xfr0) this.f138902f.f133718e.get(iKeyAt);
                    if (xfr0Var == null) {
                        xfr0Var = (xfr0) this.f138902f.f133720g.get(iKeyAt);
                    }
                    if (xfr0Var != null) {
                        Paint paint = xfr0Var.f192711b ? null : this.f138897a;
                        int i13 = kgr0Var3.f123062e;
                        int i14 = i10 + lgr0Var.f128008a;
                        int i15 = i11 + lgr0Var.f128009b;
                        Canvas canvas = this.f138899c;
                        int[] iArr = i13 == 3 ? vfr0Var.f181297d : i13 == 2 ? vfr0Var.f181296c : vfr0Var.f181295b;
                        m159348e(xfr0Var.f192712c, iArr, i13, i14, i15, paint, canvas);
                        m159348e(xfr0Var.f192713d, iArr, i13, i14, i15 + 1, paint, canvas);
                    }
                    i12++;
                    z = z2;
                }
                boolean z3 = z;
                float f3 = i11;
                float f4 = i10;
                if (kgr0Var3.f123059b) {
                    int i16 = kgr0Var3.f123062e;
                    if (i16 == 3) {
                        i3 = vfr0Var.f181297d[kgr0Var3.f123064g];
                        c = 2;
                    } else {
                        c = 2;
                        i3 = i16 == 2 ? vfr0Var.f181296c[kgr0Var3.f123065h] : vfr0Var.f181295b[kgr0Var3.f123066i];
                    }
                    this.f138898b.setColor(i3);
                    f = f3;
                    f2 = f4;
                    this.f138899c.drawRect(f2, f, kgr0Var3.f123060c + i10, kgr0Var3.f123061d + i11, this.f138898b);
                } else {
                    f = f3;
                    f2 = f4;
                    c = 2;
                }
                dtu0 dtu0Var = new dtu0();
                dtu0Var.m113585c(Bitmap.createBitmap(this.f138903g, i10, i11, kgr0Var3.f123060c, kgr0Var3.f123061d));
                dtu0Var.m113590h(f2 / wfr0Var.f186105a);
                dtu0Var.m113591i(0);
                dtu0Var.m113587e(f / wfr0Var.f186106b, 0);
                dtu0Var.m113588f(0);
                dtu0Var.m113593k(kgr0Var3.f123060c / wfr0Var.f186105a);
                dtu0Var.m113586d(kgr0Var3.f123061d / wfr0Var.f186106b);
                arrayList.add(dtu0Var.m113598p());
                this.f138899c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f138899c.restore();
                i9++;
                z = z3;
            }
            kfr0Var = new kfr0(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        bbv0Var.zza(kfr0Var);
    }
}
