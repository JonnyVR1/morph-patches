package p153l;

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
public final class tpr0 implements xor0 {

    /* JADX INFO: renamed from: h */
    public static final byte[] f175637h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f175638i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f175639j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f175640a;

    /* JADX INFO: renamed from: b */
    public final Paint f175641b;

    /* JADX INFO: renamed from: c */
    public final Canvas f175642c;

    /* JADX INFO: renamed from: d */
    public final cpr0 f175643d;

    /* JADX INFO: renamed from: e */
    public final bpr0 f175644e;

    /* JADX INFO: renamed from: f */
    public final spr0 f175645f;

    /* JADX INFO: renamed from: g */
    public Bitmap f175646g;

    public tpr0(List list) {
        bgw0 bgw0Var = new bgw0((byte[]) list.get(0));
        int iM104249F = bgw0Var.m104249F();
        int iM104249F2 = bgw0Var.m104249F();
        Paint paint = new Paint();
        this.f175640a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f175641b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f175642c = new Canvas();
        this.f175643d = new cpr0(719, 575, 0, 719, 0, 575);
        this.f175644e = new bpr0(0, m192209g(), m192210h(), m192211i());
        this.f175645f = new spr0(iM104249F, iM104249F2);
    }

    /* JADX INFO: renamed from: b */
    public static int m192204b(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX INFO: renamed from: c */
    public static bpr0 m192205c(dfw0 dfw0Var, int i) {
        int[] iArr;
        int iM115552d;
        int iM115552d2;
        int iM115552d3;
        int iM115552d4;
        int i2 = 8;
        int iM115552d5 = dfw0Var.m115552d(8);
        dfw0Var.m115561m(8);
        int[] iArrM192209g = m192209g();
        int[] iArrM192210h = m192210h();
        int[] iArrM192211i = m192211i();
        int i3 = i - 2;
        while (i3 > 0) {
            int iM115552d6 = dfw0Var.m115552d(i2);
            int iM115552d7 = dfw0Var.m115552d(i2);
            if ((iM115552d7 & 128) != 0) {
                iArr = iArrM192209g;
            } else {
                iArr = (iM115552d7 & 64) != 0 ? iArrM192210h : iArrM192211i;
            }
            if ((iM115552d7 & 1) != 0) {
                iM115552d3 = dfw0Var.m115552d(i2);
                iM115552d4 = dfw0Var.m115552d(i2);
                iM115552d = dfw0Var.m115552d(i2);
                iM115552d2 = dfw0Var.m115552d(i2);
                i3 -= 6;
            } else {
                int iM115552d8 = dfw0Var.m115552d(6) << 2;
                int iM115552d9 = dfw0Var.m115552d(4) << 4;
                i3 -= 4;
                iM115552d = dfw0Var.m115552d(4) << 4;
                iM115552d2 = dfw0Var.m115552d(2) << 6;
                iM115552d3 = iM115552d8;
                iM115552d4 = iM115552d9;
            }
            if (iM115552d3 == 0) {
                iM115552d2 = 255;
            }
            if (iM115552d3 == 0) {
                iM115552d = 0;
            }
            if (iM115552d3 == 0) {
                iM115552d4 = 0;
            }
            double d = iM115552d3;
            double d2 = iM115552d4 - 128;
            double d3 = iM115552d - 128;
            iArr[iM115552d6] = m192204b((byte) (255 - (iM115552d2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            iM115552d5 = iM115552d5;
            i2 = 8;
        }
        return new bpr0(iM115552d5, iArrM192209g, iArrM192210h, iArrM192211i);
    }

    /* JADX INFO: renamed from: d */
    public static dpr0 m192206d(dfw0 dfw0Var) {
        byte[] bArr;
        int iM115552d = dfw0Var.m115552d(16);
        dfw0Var.m115561m(4);
        int iM115552d2 = dfw0Var.m115552d(2);
        boolean zM115563o = dfw0Var.m115563o();
        dfw0Var.m115561m(1);
        byte[] bArr2 = mpw0.f137962f;
        if (iM115552d2 != 1) {
            if (iM115552d2 == 0) {
                int iM115552d3 = dfw0Var.m115552d(16);
                int iM115552d4 = dfw0Var.m115552d(16);
                if (iM115552d3 > 0) {
                    bArr2 = new byte[iM115552d3];
                    dfw0Var.m115556h(bArr2, 0, iM115552d3);
                }
                if (iM115552d4 > 0) {
                    bArr = new byte[iM115552d4];
                    dfw0Var.m115556h(bArr, 0, iM115552d4);
                }
            }
            return new dpr0(iM115552d, zM115563o, bArr2, bArr);
        }
        dfw0Var.m115561m(dfw0Var.m115552d(8) * 16);
        bArr = bArr2;
        return new dpr0(iM115552d, zM115563o, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static void m192207e(byte[] bArr, int[] iArr, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        char c;
        int iM115552d;
        int iM115552d2;
        int iM115552d3;
        int i4;
        int iM115552d4;
        int iM115552d5;
        int i5;
        int i6;
        int iM115552d6;
        int i7;
        Paint paint2 = paint;
        dfw0 dfw0Var = new dfw0(bArr, bArr.length);
        int i8 = i2;
        int i9 = i3;
        byte[] bArrM192208f = null;
        byte[] bArrM192208f2 = null;
        byte[] bArrM192208f3 = null;
        while (dfw0Var.m115549a() != 0) {
            int iM115552d7 = dfw0Var.m115552d(8);
            if (iM115552d7 != 240) {
                int i10 = 4;
                int i11 = 1;
                int i12 = 2;
                switch (iM115552d7) {
                    case 16:
                        int i13 = 1;
                        if (i == 3) {
                            if (bArrM192208f == null) {
                                bArr3 = f175638i;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrM192208f;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrM192208f3 == null) {
                            bArr3 = f175637h;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrM192208f3;
                        }
                        int i14 = 0;
                        while (true) {
                            int iM115552d8 = dfw0Var.m115552d(2);
                            if (iM115552d8 != 0) {
                                iM115552d2 = i13;
                                iM115552d = iM115552d8;
                            } else {
                                if (dfw0Var.m115563o()) {
                                    iM115552d3 = dfw0Var.m115552d(3) + 3;
                                    iM115552d = dfw0Var.m115552d(2);
                                } else {
                                    if (dfw0Var.m115563o()) {
                                        iM115552d2 = i13;
                                        iM115552d = 0;
                                    } else {
                                        int iM115552d9 = dfw0Var.m115552d(2);
                                        if (iM115552d9 == 0) {
                                            c = 4;
                                            i14 = i13;
                                            iM115552d = 0;
                                            iM115552d2 = 0;
                                        } else if (iM115552d9 == i13) {
                                            c = 4;
                                            i14 = i14;
                                            iM115552d2 = 2;
                                            iM115552d = 0;
                                        } else if (iM115552d9 == 2) {
                                            c = 4;
                                            i14 = i14;
                                            iM115552d2 = dfw0Var.m115552d(4) + 12;
                                            iM115552d = dfw0Var.m115552d(2);
                                        } else if (iM115552d9 != 3) {
                                            iM115552d = 0;
                                            iM115552d2 = 0;
                                        } else {
                                            iM115552d3 = dfw0Var.m115552d(8) + 29;
                                            iM115552d = dfw0Var.m115552d(2);
                                        }
                                        if (iM115552d2 == 0 && paint2 != null) {
                                            int i15 = i9 + 1;
                                            float f = i9;
                                            if (bArr2 != 0) {
                                                iM115552d = bArr2[iM115552d];
                                            }
                                            paint2.setColor(iArr[iM115552d]);
                                            canvas.drawRect(i8, f, i8 + iM115552d2, i15, paint2);
                                        }
                                        i8 += iM115552d2;
                                        if (i14 != 0) {
                                            dfw0Var.m115553e();
                                        } else {
                                            paint2 = paint;
                                            i14 = i14;
                                            i13 = 1;
                                        }
                                    }
                                    c = 4;
                                    if (iM115552d2 == 0) {
                                    }
                                    i8 += iM115552d2;
                                    if (i14 != 0) {
                                        dfw0Var.m115553e();
                                    } else {
                                        paint2 = paint;
                                        i14 = i14;
                                        i13 = 1;
                                    }
                                }
                                iM115552d2 = iM115552d3;
                            }
                            c = 4;
                            if (iM115552d2 == 0) {
                            }
                            i8 += iM115552d2;
                            if (i14 != 0) {
                                dfw0Var.m115553e();
                            } else {
                                paint2 = paint;
                                i14 = i14;
                                i13 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrM192208f2 == null ? f175639j : bArrM192208f2 : null;
                        boolean z = false;
                        while (true) {
                            int iM115552d10 = dfw0Var.m115552d(i10);
                            if (iM115552d10 != 0) {
                                i4 = 1;
                                z = z;
                            } else if (dfw0Var.m115563o()) {
                                if (dfw0Var.m115563o()) {
                                    int iM115552d11 = dfw0Var.m115552d(i12);
                                    if (iM115552d11 == 0) {
                                        i4 = 1;
                                    } else if (iM115552d11 == 1) {
                                        i4 = i12;
                                    } else if (iM115552d11 == i12) {
                                        iM115552d4 = dfw0Var.m115552d(i10) + 9;
                                        iM115552d5 = dfw0Var.m115552d(i10);
                                    } else if (iM115552d11 != 3) {
                                        z = z;
                                        iM115552d10 = 0;
                                        i4 = 0;
                                    } else {
                                        iM115552d4 = dfw0Var.m115552d(8) + 25;
                                        iM115552d5 = dfw0Var.m115552d(i10);
                                    }
                                    iM115552d10 = 0;
                                } else {
                                    iM115552d4 = dfw0Var.m115552d(i12) + i10;
                                    iM115552d5 = dfw0Var.m115552d(i10);
                                }
                                i4 = iM115552d4;
                                z = z;
                                iM115552d10 = iM115552d5;
                            } else {
                                int iM115552d12 = dfw0Var.m115552d(3);
                                if (iM115552d12 != 0) {
                                    i4 = iM115552d12 + 2;
                                    iM115552d10 = 0;
                                } else {
                                    z = true;
                                    iM115552d10 = 0;
                                    i4 = 0;
                                }
                            }
                            if (i4 == 0 || paint2 == null) {
                                i5 = i12;
                            } else {
                                int i16 = i9 + 1;
                                float f2 = i9;
                                if (bArr4 != 0) {
                                    iM115552d10 = bArr4[iM115552d10];
                                }
                                paint2.setColor(iArr[iM115552d10]);
                                i5 = 2;
                                canvas.drawRect(i8, f2, i8 + i4, i16, paint2);
                            }
                            i8 += i4;
                            if (z) {
                                dfw0Var.m115553e();
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
                            int iM115552d13 = dfw0Var.m115552d(8);
                            if (iM115552d13 != 0) {
                                i6 = i18;
                                iM115552d6 = i11;
                            } else if (dfw0Var.m115563o()) {
                                i6 = i18;
                                iM115552d6 = dfw0Var.m115552d(7);
                                iM115552d13 = dfw0Var.m115552d(8);
                            } else {
                                int iM115552d14 = dfw0Var.m115552d(7);
                                if (iM115552d14 != 0) {
                                    i6 = i18;
                                    iM115552d6 = iM115552d14;
                                    iM115552d13 = 0;
                                } else {
                                    i6 = i11;
                                    iM115552d13 = 0;
                                    iM115552d6 = 0;
                                }
                            }
                            if (iM115552d6 == 0 || paint2 == null) {
                                i7 = i11;
                            } else {
                                paint2.setColor(iArr[iM115552d13]);
                                i7 = i11;
                                canvas.drawRect(i17, i9, i17 + iM115552d6, i9 + 1, paint2);
                            }
                            i17 += iM115552d6;
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
                        switch (iM115552d7) {
                            case 32:
                                bArrM192208f3 = m192208f(4, 4, dfw0Var);
                                break;
                            case 33:
                                bArrM192208f = m192208f(4, 8, dfw0Var);
                                break;
                            case 34:
                                bArrM192208f2 = m192208f(16, 8, dfw0Var);
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
    public static byte[] m192208f(int i, int i2, dfw0 dfw0Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) dfw0Var.m115552d(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m192209g() {
        return new int[]{0, -1, RoundedDrawable.DEFAULT_BORDER_COLOR, -8421505};
    }

    /* JADX INFO: renamed from: h */
    public static int[] m192210h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = m192204b(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = m192204b(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: i */
    public static int[] m192211i() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = m192204b(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
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
                    iArr[i2] = m192204b(255, i10 + i11, i12 + i13, i + i4);
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
                    iArr[i2] = m192204b(127, i19 + i20, i21 + i22, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = m192204b(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = m192204b(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        boolean z;
        qor0 qor0Var;
        float f;
        float f2;
        char c;
        int i3;
        qpr0 qpr0Var;
        int iM115552d;
        int iM115552d2;
        int iM115552d3;
        int iM115552d4;
        int i4;
        int iM115552d5;
        dfw0 dfw0Var = new dfw0(bArr, i + i2);
        dfw0Var.m115559k(i);
        while (true) {
            z = true;
            if (dfw0Var.m115549a() >= 48 && dfw0Var.m115552d(8) == 15) {
                spr0 spr0Var = this.f175645f;
                int iM115552d6 = dfw0Var.m115552d(8);
                int iM115552d7 = dfw0Var.m115552d(16);
                int iM115552d8 = dfw0Var.m115552d(16);
                int iM115550b = dfw0Var.m115550b() + iM115552d8;
                if (iM115552d8 * 8 > dfw0Var.m115549a()) {
                    y4w0.m214278f("DvbParser", "Data field length exceeds limit");
                    dfw0Var.m115561m(dfw0Var.m115549a());
                } else {
                    switch (iM115552d6) {
                        case 16:
                            if (iM115552d7 == spr0Var.f170085a) {
                                epr0 epr0Var = spr0Var.f170093i;
                                int iM115552d9 = dfw0Var.m115552d(8);
                                int iM115552d10 = dfw0Var.m115552d(4);
                                int iM115552d11 = dfw0Var.m115552d(2);
                                dfw0Var.m115561m(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i5 = iM115552d8 - 2; i5 > 0; i5 -= 6) {
                                    int iM115552d12 = dfw0Var.m115552d(8);
                                    dfw0Var.m115561m(8);
                                    sparseArray.put(iM115552d12, new fpr0(dfw0Var.m115552d(16), dfw0Var.m115552d(16)));
                                }
                                epr0 epr0Var2 = new epr0(iM115552d9, iM115552d10, iM115552d11, sparseArray);
                                if (epr0Var2.f95263b != 0) {
                                    spr0Var.f170093i = epr0Var2;
                                    spr0Var.f170087c.clear();
                                    spr0Var.f170088d.clear();
                                    spr0Var.f170089e.clear();
                                } else if (epr0Var != null) {
                                    if (epr0Var.f95262a != epr0Var2.f95262a) {
                                        spr0Var.f170093i = epr0Var2;
                                    }
                                }
                            }
                            break;
                        case 17:
                            epr0 epr0Var3 = spr0Var.f170093i;
                            if (iM115552d7 == spr0Var.f170085a && epr0Var3 != null) {
                                int iM115552d13 = dfw0Var.m115552d(8);
                                dfw0Var.m115561m(4);
                                boolean zM115563o = dfw0Var.m115563o();
                                dfw0Var.m115561m(3);
                                int iM115552d14 = dfw0Var.m115552d(16);
                                int iM115552d15 = dfw0Var.m115552d(16);
                                int iM115552d16 = dfw0Var.m115552d(3);
                                int iM115552d17 = dfw0Var.m115552d(3);
                                dfw0Var.m115561m(2);
                                int iM115552d18 = dfw0Var.m115552d(8);
                                int iM115552d19 = dfw0Var.m115552d(8);
                                int iM115552d20 = dfw0Var.m115552d(4);
                                int iM115552d21 = dfw0Var.m115552d(2);
                                dfw0Var.m115561m(2);
                                int i6 = iM115552d8 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i6 > 0) {
                                    int iM115552d22 = dfw0Var.m115552d(16);
                                    int iM115552d23 = dfw0Var.m115552d(2);
                                    int iM115552d24 = dfw0Var.m115552d(2);
                                    int iM115552d25 = dfw0Var.m115552d(12);
                                    dfw0Var.m115561m(4);
                                    int iM115552d26 = dfw0Var.m115552d(12);
                                    int i7 = i6 - 6;
                                    if (iM115552d23 == 1) {
                                        i6 -= 8;
                                        iM115552d = dfw0Var.m115552d(8);
                                        iM115552d2 = dfw0Var.m115552d(8);
                                    } else if (iM115552d23 == 2) {
                                        iM115552d23 = 2;
                                        i6 -= 8;
                                        iM115552d = dfw0Var.m115552d(8);
                                        iM115552d2 = dfw0Var.m115552d(8);
                                    } else {
                                        i6 = i7;
                                        iM115552d = 0;
                                        iM115552d2 = 0;
                                    }
                                    sparseArray2.put(iM115552d22, new rpr0(iM115552d23, iM115552d24, iM115552d25, iM115552d26, iM115552d, iM115552d2));
                                }
                                qpr0 qpr0Var2 = new qpr0(iM115552d13, zM115563o, iM115552d14, iM115552d15, iM115552d16, iM115552d17, iM115552d18, iM115552d19, iM115552d20, iM115552d21, sparseArray2);
                                if (epr0Var3.f95263b == 0 && (qpr0Var = (qpr0) spr0Var.f170087c.get(qpr0Var2.f158893a)) != null) {
                                    int i8 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = qpr0Var.f158902j;
                                        if (i8 < sparseArray3.size()) {
                                            qpr0Var2.f158902j.put(sparseArray3.keyAt(i8), (rpr0) sparseArray3.valueAt(i8));
                                            i8++;
                                        }
                                    }
                                }
                                spr0Var.f170087c.put(qpr0Var2.f158893a, qpr0Var2);
                            }
                            break;
                        case 18:
                            if (iM115552d7 == spr0Var.f170085a) {
                                bpr0 bpr0VarM192205c = m192205c(dfw0Var, iM115552d8);
                                spr0Var.f170088d.put(bpr0VarM192205c.f77803a, bpr0VarM192205c);
                            } else if (iM115552d7 == spr0Var.f170086b) {
                                bpr0 bpr0VarM192205c2 = m192205c(dfw0Var, iM115552d8);
                                spr0Var.f170090f.put(bpr0VarM192205c2.f77803a, bpr0VarM192205c2);
                            }
                            break;
                        case 19:
                            if (iM115552d7 == spr0Var.f170085a) {
                                dpr0 dpr0VarM192206d = m192206d(dfw0Var);
                                spr0Var.f170089e.put(dpr0VarM192206d.f90083a, dpr0VarM192206d);
                            } else if (iM115552d7 == spr0Var.f170086b) {
                                dpr0 dpr0VarM192206d2 = m192206d(dfw0Var);
                                spr0Var.f170091g.put(dpr0VarM192206d2.f90083a, dpr0VarM192206d2);
                            }
                            break;
                        case 20:
                            if (iM115552d7 == spr0Var.f170085a) {
                                dfw0Var.m115561m(4);
                                boolean zM115563o2 = dfw0Var.m115563o();
                                dfw0Var.m115561m(3);
                                int iM115552d27 = dfw0Var.m115552d(16);
                                int iM115552d28 = dfw0Var.m115552d(16);
                                if (zM115563o2) {
                                    int iM115552d29 = dfw0Var.m115552d(16);
                                    iM115552d3 = dfw0Var.m115552d(16);
                                    iM115552d5 = dfw0Var.m115552d(16);
                                    iM115552d4 = dfw0Var.m115552d(16);
                                    i4 = iM115552d29;
                                } else {
                                    iM115552d3 = iM115552d27;
                                    iM115552d4 = iM115552d28;
                                    i4 = 0;
                                    iM115552d5 = 0;
                                }
                                spr0Var.f170092h = new cpr0(iM115552d27, iM115552d28, i4, iM115552d3, iM115552d5, iM115552d4);
                            }
                            break;
                    }
                    dfw0Var.m115562n(iM115550b - dfw0Var.m115550b());
                }
            }
        }
        spr0 spr0Var2 = this.f175645f;
        epr0 epr0Var4 = spr0Var2.f170093i;
        if (epr0Var4 == null) {
            qor0Var = new qor0(zzgaa.zzl(), -9223372036854775807L, -9223372036854775807L);
        } else {
            cpr0 cpr0Var = spr0Var2.f170092h;
            if (cpr0Var == null) {
                cpr0Var = this.f175643d;
            }
            Bitmap bitmap = this.f175646g;
            if (bitmap == null || cpr0Var.f83017a + 1 != bitmap.getWidth() || cpr0Var.f83018b + 1 != this.f175646g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(cpr0Var.f83017a + 1, cpr0Var.f83018b + 1, Bitmap.Config.ARGB_8888);
                this.f175646g = bitmapCreateBitmap;
                this.f175642c.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = epr0Var4.f95264c;
            int i9 = 0;
            while (i9 < sparseArray4.size()) {
                this.f175642c.save();
                fpr0 fpr0Var = (fpr0) sparseArray4.valueAt(i9);
                qpr0 qpr0Var3 = (qpr0) this.f175645f.f170087c.get(sparseArray4.keyAt(i9));
                int i10 = fpr0Var.f100218a + cpr0Var.f83019c;
                int i11 = fpr0Var.f100219b + cpr0Var.f83021e;
                this.f175642c.clipRect(i10, i11, Math.min(qpr0Var3.f158895c + i10, cpr0Var.f83020d), Math.min(qpr0Var3.f158896d + i11, cpr0Var.f83022f));
                bpr0 bpr0Var = (bpr0) this.f175645f.f170088d.get(qpr0Var3.f158898f);
                if (bpr0Var == null) {
                    bpr0Var = (bpr0) this.f175645f.f170090f.get(qpr0Var3.f158898f);
                    if (bpr0Var == null) {
                        bpr0Var = this.f175644e;
                    }
                }
                SparseArray sparseArray5 = qpr0Var3.f158902j;
                int i12 = 0;
                while (i12 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i12);
                    boolean z2 = z;
                    rpr0 rpr0Var = (rpr0) sparseArray5.valueAt(i12);
                    dpr0 dpr0Var = (dpr0) this.f175645f.f170089e.get(iKeyAt);
                    if (dpr0Var == null) {
                        dpr0Var = (dpr0) this.f175645f.f170091g.get(iKeyAt);
                    }
                    if (dpr0Var != null) {
                        Paint paint = dpr0Var.f90084b ? null : this.f175640a;
                        int i13 = qpr0Var3.f158897e;
                        int i14 = i10 + rpr0Var.f164391a;
                        int i15 = i11 + rpr0Var.f164392b;
                        Canvas canvas = this.f175642c;
                        int[] iArr = i13 == 3 ? bpr0Var.f77806d : i13 == 2 ? bpr0Var.f77805c : bpr0Var.f77804b;
                        m192207e(dpr0Var.f90085c, iArr, i13, i14, i15, paint, canvas);
                        m192207e(dpr0Var.f90086d, iArr, i13, i14, i15 + 1, paint, canvas);
                    }
                    i12++;
                    z = z2;
                }
                boolean z3 = z;
                float f3 = i11;
                float f4 = i10;
                if (qpr0Var3.f158894b) {
                    int i16 = qpr0Var3.f158897e;
                    if (i16 == 3) {
                        i3 = bpr0Var.f77806d[qpr0Var3.f158899g];
                        c = 2;
                    } else {
                        c = 2;
                        i3 = i16 == 2 ? bpr0Var.f77805c[qpr0Var3.f158900h] : bpr0Var.f77804b[qpr0Var3.f158901i];
                    }
                    this.f175641b.setColor(i3);
                    f = f3;
                    f2 = f4;
                    this.f175642c.drawRect(f2, f, qpr0Var3.f158895c + i10, qpr0Var3.f158896d + i11, this.f175641b);
                } else {
                    f = f3;
                    f2 = f4;
                    c = 2;
                }
                j2v0 j2v0Var = new j2v0();
                j2v0Var.m143268c(Bitmap.createBitmap(this.f175646g, i10, i11, qpr0Var3.f158895c, qpr0Var3.f158896d));
                j2v0Var.m143273h(f2 / cpr0Var.f83017a);
                j2v0Var.m143274i(0);
                j2v0Var.m143270e(f / cpr0Var.f83018b, 0);
                j2v0Var.m143271f(0);
                j2v0Var.m143276k(qpr0Var3.f158895c / cpr0Var.f83017a);
                j2v0Var.m143269d(qpr0Var3.f158896d / cpr0Var.f83018b);
                arrayList.add(j2v0Var.m143281p());
                this.f175642c.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f175642c.restore();
                i9++;
                z = z3;
            }
            qor0Var = new qor0(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        hkv0Var.zza(qor0Var);
    }
}
