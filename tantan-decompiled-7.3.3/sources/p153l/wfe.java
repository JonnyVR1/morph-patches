package p153l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wfe {

    /* JADX INFO: renamed from: h */
    public static final byte[] f188785h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f188786i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f188787j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f188788a;

    /* JADX INFO: renamed from: b */
    public final Paint f188789b;

    /* JADX INFO: renamed from: c */
    public final Canvas f188790c;

    /* JADX INFO: renamed from: d */
    public final C21096b f188791d;

    /* JADX INFO: renamed from: e */
    public final C21095a f188792e;

    /* JADX INFO: renamed from: f */
    public final C21102h f188793f;

    /* JADX INFO: renamed from: g */
    public Bitmap f188794g;

    /* JADX INFO: renamed from: l.wfe$a */
    public static final class C21095a {

        /* JADX INFO: renamed from: a */
        public final int f188795a;

        /* JADX INFO: renamed from: b */
        public final int[] f188796b;

        /* JADX INFO: renamed from: c */
        public final int[] f188797c;

        /* JADX INFO: renamed from: d */
        public final int[] f188798d;

        public C21095a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f188795a = i;
            this.f188796b = iArr;
            this.f188797c = iArr2;
            this.f188798d = iArr3;
        }
    }

    /* JADX INFO: renamed from: l.wfe$b */
    public static final class C21096b {

        /* JADX INFO: renamed from: a */
        public final int f188799a;

        /* JADX INFO: renamed from: b */
        public final int f188800b;

        /* JADX INFO: renamed from: c */
        public final int f188801c;

        /* JADX INFO: renamed from: d */
        public final int f188802d;

        /* JADX INFO: renamed from: e */
        public final int f188803e;

        /* JADX INFO: renamed from: f */
        public final int f188804f;

        public C21096b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f188799a = i;
            this.f188800b = i2;
            this.f188801c = i3;
            this.f188802d = i4;
            this.f188803e = i5;
            this.f188804f = i6;
        }
    }

    /* JADX INFO: renamed from: l.wfe$c */
    public static final class C21097c {

        /* JADX INFO: renamed from: a */
        public final int f188805a;

        /* JADX INFO: renamed from: b */
        public final boolean f188806b;

        /* JADX INFO: renamed from: c */
        public final byte[] f188807c;

        /* JADX INFO: renamed from: d */
        public final byte[] f188808d;

        public C21097c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f188805a = i;
            this.f188806b = z;
            this.f188807c = bArr;
            this.f188808d = bArr2;
        }
    }

    /* JADX INFO: renamed from: l.wfe$d */
    public static final class C21098d {

        /* JADX INFO: renamed from: a */
        public final int f188809a;

        /* JADX INFO: renamed from: b */
        public final int f188810b;

        /* JADX INFO: renamed from: c */
        public final int f188811c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<C21099e> f188812d;

        public C21098d(int i, int i2, int i3, SparseArray<C21099e> sparseArray) {
            this.f188809a = i;
            this.f188810b = i2;
            this.f188811c = i3;
            this.f188812d = sparseArray;
        }
    }

    /* JADX INFO: renamed from: l.wfe$e */
    public static final class C21099e {

        /* JADX INFO: renamed from: a */
        public final int f188813a;

        /* JADX INFO: renamed from: b */
        public final int f188814b;

        public C21099e(int i, int i2) {
            this.f188813a = i;
            this.f188814b = i2;
        }
    }

    /* JADX INFO: renamed from: l.wfe$f */
    public static final class C21100f {

        /* JADX INFO: renamed from: a */
        public final int f188815a;

        /* JADX INFO: renamed from: b */
        public final boolean f188816b;

        /* JADX INFO: renamed from: c */
        public final int f188817c;

        /* JADX INFO: renamed from: d */
        public final int f188818d;

        /* JADX INFO: renamed from: e */
        public final int f188819e;

        /* JADX INFO: renamed from: f */
        public final int f188820f;

        /* JADX INFO: renamed from: g */
        public final int f188821g;

        /* JADX INFO: renamed from: h */
        public final int f188822h;

        /* JADX INFO: renamed from: i */
        public final int f188823i;

        /* JADX INFO: renamed from: j */
        public final int f188824j;

        /* JADX INFO: renamed from: k */
        public final SparseArray<C21101g> f188825k;

        public C21100f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C21101g> sparseArray) {
            this.f188815a = i;
            this.f188816b = z;
            this.f188817c = i2;
            this.f188818d = i3;
            this.f188819e = i4;
            this.f188820f = i5;
            this.f188821g = i6;
            this.f188822h = i7;
            this.f188823i = i8;
            this.f188824j = i9;
            this.f188825k = sparseArray;
        }

        /* JADX INFO: renamed from: a */
        public void m206116a(C21100f c21100f) {
            SparseArray<C21101g> sparseArray = c21100f.f188825k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f188825k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: l.wfe$g */
    public static final class C21101g {

        /* JADX INFO: renamed from: a */
        public final int f188826a;

        /* JADX INFO: renamed from: b */
        public final int f188827b;

        /* JADX INFO: renamed from: c */
        public final int f188828c;

        /* JADX INFO: renamed from: d */
        public final int f188829d;

        /* JADX INFO: renamed from: e */
        public final int f188830e;

        /* JADX INFO: renamed from: f */
        public final int f188831f;

        public C21101g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f188826a = i;
            this.f188827b = i2;
            this.f188828c = i3;
            this.f188829d = i4;
            this.f188830e = i5;
            this.f188831f = i6;
        }
    }

    /* JADX INFO: renamed from: l.wfe$h */
    public static final class C21102h {

        /* JADX INFO: renamed from: a */
        public final int f188832a;

        /* JADX INFO: renamed from: b */
        public final int f188833b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<C21100f> f188834c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public final SparseArray<C21095a> f188835d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<C21097c> f188836e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final SparseArray<C21095a> f188837f = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<C21097c> f188838g = new SparseArray<>();

        /* JADX INFO: renamed from: h */
        @Nullable
        public C21096b f188839h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public C21098d f188840i;

        public C21102h(int i, int i2) {
            this.f188832a = i;
            this.f188833b = i2;
        }

        /* JADX INFO: renamed from: a */
        public void m206117a() {
            this.f188834c.clear();
            this.f188835d.clear();
            this.f188836e.clear();
            this.f188837f.clear();
            this.f188838g.clear();
            this.f188839h = null;
            this.f188840i = null;
        }
    }

    public wfe(int i, int i2) {
        Paint paint = new Paint();
        this.f188788a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f188789b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f188790c = new Canvas();
        this.f188791d = new C21096b(719, 575, 0, 719, 0, 575);
        this.f188792e = new C21095a(0, m206099c(), m206100d(), m206101e());
        this.f188793f = new C21102h(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m206098a(int i, int i2, hg60 hg60Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) hg60Var.m134905h(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m206099c() {
        return new int[]{0, -1, RoundedDrawable.DEFAULT_BORDER_COLOR, -8421505};
    }

    /* JADX INFO: renamed from: d */
    public static int[] m206100d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m206102f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m206102f(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m206101e() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = m206102f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
                int i4 = CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = m206102f(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = m206102f(127, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = m206102f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = m206102f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public static int m206102f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX INFO: renamed from: g */
    public static int m206103g(hg60 hg60Var, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        int i3;
        int iM134905h;
        int iM134905h2;
        boolean z = false;
        while (true) {
            int iM134905h3 = hg60Var.m134905h(2);
            if (iM134905h3 != 0) {
                z = z;
                i3 = 1;
            } else {
                if (hg60Var.m134904g()) {
                    iM134905h = hg60Var.m134905h(3) + 3;
                    iM134905h2 = hg60Var.m134905h(2);
                } else {
                    if (hg60Var.m134904g()) {
                        i3 = 1;
                    } else {
                        int iM134905h4 = hg60Var.m134905h(2);
                        if (iM134905h4 == 0) {
                            z = true;
                        } else if (iM134905h4 == 1) {
                            i3 = 2;
                        } else if (iM134905h4 == 2) {
                            iM134905h = hg60Var.m134905h(4) + 12;
                            iM134905h2 = hg60Var.m134905h(2);
                        } else if (iM134905h4 != 3) {
                            z = z;
                        } else {
                            iM134905h = hg60Var.m134905h(8) + 29;
                            iM134905h2 = hg60Var.m134905h(2);
                        }
                        iM134905h3 = 0;
                        i3 = 0;
                    }
                    iM134905h3 = 0;
                }
                z = z;
                i3 = iM134905h;
                iM134905h3 = iM134905h2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iM134905h3 = bArr[iM134905h3];
                }
                paint.setColor(iArr[iM134905h3]);
                canvas.drawRect(i, i2, i + i3, 1 + i2, paint);
            }
            i += i3;
            if (z) {
                return i;
            }
            z = z;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m206104h(hg60 hg60Var, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        int i3;
        int iM134905h;
        int iM134905h2;
        boolean z = false;
        while (true) {
            int iM134905h3 = hg60Var.m134905h(4);
            if (iM134905h3 != 0) {
                z = z;
                i3 = 1;
            } else if (hg60Var.m134904g()) {
                if (hg60Var.m134904g()) {
                    int iM134905h4 = hg60Var.m134905h(2);
                    if (iM134905h4 == 0) {
                        i3 = 1;
                        iM134905h3 = 0;
                    } else if (iM134905h4 == 1) {
                        iM134905h3 = 0;
                        i3 = 2;
                        z = z;
                    } else if (iM134905h4 == 2) {
                        iM134905h = hg60Var.m134905h(4) + 9;
                        iM134905h2 = hg60Var.m134905h(4);
                    } else if (iM134905h4 != 3) {
                        z = z;
                        iM134905h3 = 0;
                        i3 = 0;
                    } else {
                        iM134905h = hg60Var.m134905h(8) + 25;
                        iM134905h2 = hg60Var.m134905h(4);
                    }
                } else {
                    iM134905h = hg60Var.m134905h(2) + 4;
                    iM134905h2 = hg60Var.m134905h(4);
                }
                z = z;
                i3 = iM134905h;
                iM134905h3 = iM134905h2;
            } else {
                int iM134905h5 = hg60Var.m134905h(3);
                if (iM134905h5 != 0) {
                    i3 = iM134905h5 + 2;
                    iM134905h3 = 0;
                } else {
                    z = true;
                    iM134905h3 = 0;
                    i3 = 0;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iM134905h3 = bArr[iM134905h3];
                }
                paint.setColor(iArr[iM134905h3]);
                canvas.drawRect(i, i2, i + i3, 1 + i2, paint);
            }
            i += i3;
            if (z) {
                return i;
            }
            z = z;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m206105i(hg60 hg60Var, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int iM134905h;
        boolean z2 = false;
        while (true) {
            int iM134905h2 = hg60Var.m134905h(8);
            if (iM134905h2 != 0) {
                z = z2;
                iM134905h = 1;
            } else if (hg60Var.m134904g()) {
                z = z2;
                iM134905h = hg60Var.m134905h(7);
                iM134905h2 = hg60Var.m134905h(8);
            } else {
                int iM134905h3 = hg60Var.m134905h(7);
                if (iM134905h3 != 0) {
                    z = z2;
                    iM134905h = iM134905h3;
                    iM134905h2 = 0;
                } else {
                    z = true;
                    iM134905h2 = 0;
                    iM134905h = 0;
                }
            }
            if (iM134905h != 0 && paint != null) {
                if (bArr != null) {
                    iM134905h2 = bArr[iM134905h2];
                }
                paint.setColor(iArr[iM134905h2]);
                canvas.drawRect(i, i2, i + iM134905h, 1 + i2, paint);
            }
            i += iM134905h;
            if (z) {
                return i;
            }
            z2 = z;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m206106j(byte[] bArr, int[] iArr, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        hg60 hg60Var = new hg60(bArr);
        byte[] bArrM206098a = null;
        byte[] bArrM206098a2 = null;
        int iM206103g = i2;
        int i4 = i3;
        byte[] bArrM206098a3 = null;
        while (hg60Var.m134899b() != 0) {
            int iM134905h = hg60Var.m134905h(8);
            if (iM134905h != 240) {
                switch (iM134905h) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i != 3) {
                            if (i == 2) {
                                bArr3 = bArrM206098a2 == null ? f188785h : bArrM206098a2;
                            } else {
                                bArr2 = null;
                            }
                            iM206103g = m206103g(hg60Var, iArr2, bArr2, iM206103g, i4, paint2, canvas2);
                            hg60Var.m134900c();
                        } else {
                            bArr3 = bArrM206098a3 == null ? f188786i : bArrM206098a3;
                        }
                        bArr2 = bArr3;
                        iM206103g = m206103g(hg60Var, iArr2, bArr2, iM206103g, i4, paint2, canvas2);
                        hg60Var.m134900c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iM206103g = m206104h(hg60Var, iArr2, i == 3 ? bArrM206098a == null ? f188787j : bArrM206098a : null, iM206103g, i4, paint2, canvas2);
                        hg60Var.m134900c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iM206103g = m206105i(hg60Var, iArr2, null, iM206103g, i4, paint2, canvas2);
                        break;
                    default:
                        switch (iM134905h) {
                            case 32:
                                bArrM206098a2 = m206098a(4, 4, hg60Var);
                                break;
                            case 33:
                                bArrM206098a3 = m206098a(4, 8, hg60Var);
                                break;
                            case 34:
                                bArrM206098a = m206098a(16, 8, hg60Var);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i4 += 2;
                iM206103g = i2;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m206107k(C21097c c21097c, C21095a c21095a, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c21095a.f188798d;
        } else {
            iArr = i == 2 ? c21095a.f188797c : c21095a.f188796b;
        }
        int[] iArr2 = iArr;
        m206106j(c21097c.f188807c, iArr2, i, i2, i3, paint, canvas);
        m206106j(c21097c.f188808d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    /* JADX INFO: renamed from: l */
    public static C21095a m206108l(hg60 hg60Var, int i) {
        int[] iArr;
        int iM134905h;
        int i2;
        int iM134905h2;
        int iM134905h3;
        int iM134905h4;
        int i3 = 8;
        int iM134905h5 = hg60Var.m134905h(8);
        hg60Var.m134915r(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrM206099c = m206099c();
        int[] iArrM206100d = m206100d();
        int[] iArrM206101e = m206101e();
        while (i5 > 0) {
            int iM134905h6 = hg60Var.m134905h(i3);
            int iM134905h7 = hg60Var.m134905h(i3);
            if ((iM134905h7 & 128) != 0) {
                iArr = iArrM206099c;
            } else {
                iArr = (iM134905h7 & 64) != 0 ? iArrM206100d : iArrM206101e;
            }
            if ((iM134905h7 & 1) != 0) {
                iM134905h3 = hg60Var.m134905h(i3);
                iM134905h4 = hg60Var.m134905h(i3);
                iM134905h = hg60Var.m134905h(i3);
                iM134905h2 = hg60Var.m134905h(i3);
                i2 = i5 - 6;
            } else {
                int iM134905h8 = hg60Var.m134905h(6) << i4;
                int iM134905h9 = hg60Var.m134905h(4) << 4;
                iM134905h = hg60Var.m134905h(4) << 4;
                i2 = i5 - 4;
                iM134905h2 = hg60Var.m134905h(i4) << 6;
                iM134905h3 = iM134905h8;
                iM134905h4 = iM134905h9;
            }
            if (iM134905h3 == 0) {
                iM134905h2 = 255;
                iM134905h4 = 0;
                iM134905h = 0;
            }
            double d = iM134905h3;
            double d2 = iM134905h4 - 128;
            double d3 = iM134905h - 128;
            iArr[iM134905h6] = m206102f((byte) (255 - (iM134905h2 & 255)), bmk0.m105162q((int) (d + (1.402d * d2)), 0, 255), bmk0.m105162q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), bmk0.m105162q((int) (d + (d3 * 1.772d)), 0, 255));
            i5 = i2;
            iM134905h5 = iM134905h5;
            i3 = 8;
            i4 = 2;
        }
        return new C21095a(iM134905h5, iArrM206099c, iArrM206100d, iArrM206101e);
    }

    /* JADX INFO: renamed from: m */
    public static C21096b m206109m(hg60 hg60Var) {
        int i;
        int i2;
        int i3;
        int iM134905h;
        hg60Var.m134915r(4);
        boolean zM134904g = hg60Var.m134904g();
        hg60Var.m134915r(3);
        int iM134905h2 = hg60Var.m134905h(16);
        int iM134905h3 = hg60Var.m134905h(16);
        if (zM134904g) {
            int iM134905h4 = hg60Var.m134905h(16);
            int iM134905h5 = hg60Var.m134905h(16);
            int iM134905h6 = hg60Var.m134905h(16);
            iM134905h = hg60Var.m134905h(16);
            i3 = iM134905h5;
            i2 = iM134905h6;
            i = iM134905h4;
        } else {
            i = 0;
            i2 = 0;
            i3 = iM134905h2;
            iM134905h = iM134905h3;
        }
        return new C21096b(iM134905h2, iM134905h3, i, i3, i2, iM134905h);
    }

    /* JADX INFO: renamed from: n */
    public static C21097c m206110n(hg60 hg60Var) {
        byte[] bArr;
        int iM134905h = hg60Var.m134905h(16);
        hg60Var.m134915r(4);
        int iM134905h2 = hg60Var.m134905h(2);
        boolean zM134904g = hg60Var.m134904g();
        hg60Var.m134915r(1);
        byte[] bArr2 = bmk0.f77318f;
        if (iM134905h2 != 1) {
            if (iM134905h2 == 0) {
                int iM134905h3 = hg60Var.m134905h(16);
                int iM134905h4 = hg60Var.m134905h(16);
                if (iM134905h3 > 0) {
                    bArr2 = new byte[iM134905h3];
                    hg60Var.m134908k(bArr2, 0, iM134905h3);
                }
                if (iM134905h4 > 0) {
                    bArr = new byte[iM134905h4];
                    hg60Var.m134908k(bArr, 0, iM134905h4);
                }
            }
            return new C21097c(iM134905h, zM134904g, bArr2, bArr);
        }
        hg60Var.m134915r(hg60Var.m134905h(8) * 16);
        bArr = bArr2;
        return new C21097c(iM134905h, zM134904g, bArr2, bArr);
    }

    /* JADX INFO: renamed from: o */
    public static C21098d m206111o(hg60 hg60Var, int i) {
        int iM134905h = hg60Var.m134905h(8);
        int iM134905h2 = hg60Var.m134905h(4);
        int iM134905h3 = hg60Var.m134905h(2);
        hg60Var.m134915r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int iM134905h4 = hg60Var.m134905h(8);
            hg60Var.m134915r(8);
            i2 -= 6;
            sparseArray.put(iM134905h4, new C21099e(hg60Var.m134905h(16), hg60Var.m134905h(16)));
        }
        return new C21098d(iM134905h, iM134905h2, iM134905h3, sparseArray);
    }

    /* JADX INFO: renamed from: p */
    public static C21100f m206112p(hg60 hg60Var, int i) {
        int i2;
        int iM134905h;
        int iM134905h2;
        char c;
        int iM134905h3 = hg60Var.m134905h(8);
        int i3 = 4;
        hg60Var.m134915r(4);
        boolean zM134904g = hg60Var.m134904g();
        hg60Var.m134915r(3);
        int i4 = 16;
        int iM134905h4 = hg60Var.m134905h(16);
        int iM134905h5 = hg60Var.m134905h(16);
        int iM134905h6 = hg60Var.m134905h(3);
        int iM134905h7 = hg60Var.m134905h(3);
        int i5 = 2;
        hg60Var.m134915r(2);
        int iM134905h8 = hg60Var.m134905h(8);
        int iM134905h9 = hg60Var.m134905h(8);
        int iM134905h10 = hg60Var.m134905h(4);
        int iM134905h11 = hg60Var.m134905h(2);
        hg60Var.m134915r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int iM134905h12 = hg60Var.m134905h(i4);
            int iM134905h13 = hg60Var.m134905h(i5);
            int iM134905h14 = hg60Var.m134905h(i5);
            int iM134905h15 = hg60Var.m134905h(12);
            hg60Var.m134915r(i3);
            int iM134905h16 = hg60Var.m134905h(12);
            int i7 = i6 - 6;
            if (iM134905h13 != 1) {
                i2 = 2;
                if (iM134905h13 != 2) {
                    iM134905h2 = 0;
                    iM134905h = 0;
                    i6 = i7;
                    c = '\b';
                }
                sparseArray.put(iM134905h12, new C21101g(iM134905h13, iM134905h14, iM134905h15, iM134905h16, iM134905h2, iM134905h));
                i4 = 16;
                i5 = i2;
                i3 = 4;
            } else {
                i2 = 2;
            }
            c = '\b';
            i6 -= 8;
            iM134905h2 = hg60Var.m134905h(8);
            iM134905h = hg60Var.m134905h(8);
            sparseArray.put(iM134905h12, new C21101g(iM134905h13, iM134905h14, iM134905h15, iM134905h16, iM134905h2, iM134905h));
            i4 = 16;
            i5 = i2;
            i3 = 4;
        }
        return new C21100f(iM134905h3, zM134904g, iM134905h4, iM134905h5, iM134905h6, iM134905h7, iM134905h8, iM134905h9, iM134905h10, iM134905h11, sparseArray);
    }

    /* JADX INFO: renamed from: q */
    public static void m206113q(hg60 hg60Var, C21102h c21102h) {
        C21100f c21100f;
        int iM134905h = hg60Var.m134905h(8);
        int iM134905h2 = hg60Var.m134905h(16);
        int iM134905h3 = hg60Var.m134905h(16);
        int iM134901d = hg60Var.m134901d() + iM134905h3;
        if (iM134905h3 * 8 > hg60Var.m134899b()) {
            kyv.m152151i("DvbParser", "Data field length exceeds limit");
            hg60Var.m134915r(hg60Var.m134899b());
            return;
        }
        switch (iM134905h) {
            case 16:
                if (iM134905h2 == c21102h.f188832a) {
                    C21098d c21098d = c21102h.f188840i;
                    C21098d c21098dM206111o = m206111o(hg60Var, iM134905h3);
                    if (c21098dM206111o.f188811c != 0) {
                        c21102h.f188840i = c21098dM206111o;
                        c21102h.f188834c.clear();
                        c21102h.f188835d.clear();
                        c21102h.f188836e.clear();
                    } else if (c21098d != null && c21098d.f188810b != c21098dM206111o.f188810b) {
                        c21102h.f188840i = c21098dM206111o;
                    }
                }
                break;
            case 17:
                C21098d c21098d2 = c21102h.f188840i;
                if (iM134905h2 == c21102h.f188832a && c21098d2 != null) {
                    C21100f c21100fM206112p = m206112p(hg60Var, iM134905h3);
                    if (c21098d2.f188811c == 0 && (c21100f = c21102h.f188834c.get(c21100fM206112p.f188815a)) != null) {
                        c21100fM206112p.m206116a(c21100f);
                    }
                    c21102h.f188834c.put(c21100fM206112p.f188815a, c21100fM206112p);
                }
                break;
            case 18:
                if (iM134905h2 == c21102h.f188832a) {
                    C21095a c21095aM206108l = m206108l(hg60Var, iM134905h3);
                    c21102h.f188835d.put(c21095aM206108l.f188795a, c21095aM206108l);
                } else if (iM134905h2 == c21102h.f188833b) {
                    C21095a c21095aM206108l2 = m206108l(hg60Var, iM134905h3);
                    c21102h.f188837f.put(c21095aM206108l2.f188795a, c21095aM206108l2);
                }
                break;
            case 19:
                if (iM134905h2 == c21102h.f188832a) {
                    C21097c c21097cM206110n = m206110n(hg60Var);
                    c21102h.f188836e.put(c21097cM206110n.f188805a, c21097cM206110n);
                } else if (iM134905h2 == c21102h.f188833b) {
                    C21097c c21097cM206110n2 = m206110n(hg60Var);
                    c21102h.f188838g.put(c21097cM206110n2.f188805a, c21097cM206110n2);
                }
                break;
            case 20:
                if (iM134905h2 == c21102h.f188832a) {
                    c21102h.f188839h = m206109m(hg60Var);
                }
                break;
        }
        hg60Var.m134916s(iM134901d - hg60Var.m134901d());
    }

    /* JADX INFO: renamed from: b */
    public List<myb> m206114b(byte[] bArr, int i) {
        int i2;
        hg60 hg60Var = new hg60(bArr, i);
        while (hg60Var.m134899b() >= 48 && hg60Var.m134905h(8) == 15) {
            m206113q(hg60Var, this.f188793f);
        }
        C21102h c21102h = this.f188793f;
        C21098d c21098d = c21102h.f188840i;
        if (c21098d == null) {
            return Collections.EMPTY_LIST;
        }
        C21096b c21096b = c21102h.f188839h;
        if (c21096b == null) {
            c21096b = this.f188791d;
        }
        Bitmap bitmap = this.f188794g;
        if (bitmap == null || c21096b.f188799a + 1 != bitmap.getWidth() || c21096b.f188800b + 1 != this.f188794g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c21096b.f188799a + 1, c21096b.f188800b + 1, Bitmap.Config.ARGB_8888);
            this.f188794g = bitmapCreateBitmap;
            this.f188790c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C21099e> sparseArray = c21098d.f188812d;
        int i3 = 0;
        while (i3 < sparseArray.size()) {
            this.f188790c.save();
            C21099e c21099eValueAt = sparseArray.valueAt(i3);
            C21100f c21100f = this.f188793f.f188834c.get(sparseArray.keyAt(i3));
            int i4 = c21099eValueAt.f188813a + c21096b.f188801c;
            int i5 = c21099eValueAt.f188814b + c21096b.f188803e;
            this.f188790c.clipRect(i4, i5, Math.min(c21100f.f188817c + i4, c21096b.f188802d), Math.min(c21100f.f188818d + i5, c21096b.f188804f));
            C21095a c21095a = this.f188793f.f188835d.get(c21100f.f188821g);
            if (c21095a == null && (c21095a = this.f188793f.f188837f.get(c21100f.f188821g)) == null) {
                c21095a = this.f188792e;
            }
            C21095a c21095a2 = c21095a;
            SparseArray<C21101g> sparseArray2 = c21100f.f188825k;
            int i6 = 0;
            while (i6 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i6);
                C21101g c21101gValueAt = sparseArray2.valueAt(i6);
                C21097c c21097c = this.f188793f.f188836e.get(iKeyAt);
                if (c21097c == null) {
                    c21097c = this.f188793f.f188838g.get(iKeyAt);
                }
                if (c21097c != null) {
                    m206107k(c21097c, c21095a2, c21100f.f188820f, c21101gValueAt.f188828c + i4, c21101gValueAt.f188829d + i5, c21097c.f188806b ? null : this.f188788a, this.f188790c);
                }
                i6++;
                sparseArray = sparseArray;
            }
            SparseArray<C21099e> sparseArray3 = sparseArray;
            if (c21100f.f188816b) {
                int i7 = c21100f.f188820f;
                if (i7 == 3) {
                    i2 = c21095a2.f188798d[c21100f.f188822h];
                } else {
                    i2 = i7 == 2 ? c21095a2.f188797c[c21100f.f188823i] : c21095a2.f188796b[c21100f.f188824j];
                }
                this.f188789b.setColor(i2);
                this.f188790c.drawRect(i4, i5, c21100f.f188817c + i4, c21100f.f188818d + i5, this.f188789b);
            }
            arrayList.add(new myb.C18746b().m160759f(Bitmap.createBitmap(this.f188794g, i4, i5, c21100f.f188817c, c21100f.f188818d)).m160764k(i4 / c21096b.f188799a).m160765l(0).m160761h(i5 / c21096b.f188800b, 0).m160762i(0).m160767n(c21100f.f188817c / c21096b.f188799a).m160760g(c21100f.f188818d / c21096b.f188800b).m160754a());
            this.f188790c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f188790c.restore();
            i3++;
            sparseArray = sparseArray3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public void m206115r() {
        this.f188793f.m206117a();
    }
}
