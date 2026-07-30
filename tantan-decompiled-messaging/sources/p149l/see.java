package p149l;

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
public final class see {

    /* JADX INFO: renamed from: h */
    public static final byte[] f163944h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f163945i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f163946j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f163947a;

    /* JADX INFO: renamed from: b */
    public final Paint f163948b;

    /* JADX INFO: renamed from: c */
    public final Canvas f163949c;

    /* JADX INFO: renamed from: d */
    public final C19917b f163950d;

    /* JADX INFO: renamed from: e */
    public final C19916a f163951e;

    /* JADX INFO: renamed from: f */
    public final C19923h f163952f;

    /* JADX INFO: renamed from: g */
    public Bitmap f163953g;

    /* JADX INFO: renamed from: l.see$a */
    public static final class C19916a {

        /* JADX INFO: renamed from: a */
        public final int f163954a;

        /* JADX INFO: renamed from: b */
        public final int[] f163955b;

        /* JADX INFO: renamed from: c */
        public final int[] f163956c;

        /* JADX INFO: renamed from: d */
        public final int[] f163957d;

        public C19916a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f163954a = i;
            this.f163955b = iArr;
            this.f163956c = iArr2;
            this.f163957d = iArr3;
        }
    }

    /* JADX INFO: renamed from: l.see$b */
    public static final class C19917b {

        /* JADX INFO: renamed from: a */
        public final int f163958a;

        /* JADX INFO: renamed from: b */
        public final int f163959b;

        /* JADX INFO: renamed from: c */
        public final int f163960c;

        /* JADX INFO: renamed from: d */
        public final int f163961d;

        /* JADX INFO: renamed from: e */
        public final int f163962e;

        /* JADX INFO: renamed from: f */
        public final int f163963f;

        public C19917b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f163958a = i;
            this.f163959b = i2;
            this.f163960c = i3;
            this.f163961d = i4;
            this.f163962e = i5;
            this.f163963f = i6;
        }
    }

    /* JADX INFO: renamed from: l.see$c */
    public static final class C19918c {

        /* JADX INFO: renamed from: a */
        public final int f163964a;

        /* JADX INFO: renamed from: b */
        public final boolean f163965b;

        /* JADX INFO: renamed from: c */
        public final byte[] f163966c;

        /* JADX INFO: renamed from: d */
        public final byte[] f163967d;

        public C19918c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f163964a = i;
            this.f163965b = z;
            this.f163966c = bArr;
            this.f163967d = bArr2;
        }
    }

    /* JADX INFO: renamed from: l.see$d */
    public static final class C19919d {

        /* JADX INFO: renamed from: a */
        public final int f163968a;

        /* JADX INFO: renamed from: b */
        public final int f163969b;

        /* JADX INFO: renamed from: c */
        public final int f163970c;

        /* JADX INFO: renamed from: d */
        public final SparseArray<C19920e> f163971d;

        public C19919d(int i, int i2, int i3, SparseArray<C19920e> sparseArray) {
            this.f163968a = i;
            this.f163969b = i2;
            this.f163970c = i3;
            this.f163971d = sparseArray;
        }
    }

    /* JADX INFO: renamed from: l.see$e */
    public static final class C19920e {

        /* JADX INFO: renamed from: a */
        public final int f163972a;

        /* JADX INFO: renamed from: b */
        public final int f163973b;

        public C19920e(int i, int i2) {
            this.f163972a = i;
            this.f163973b = i2;
        }
    }

    /* JADX INFO: renamed from: l.see$f */
    public static final class C19921f {

        /* JADX INFO: renamed from: a */
        public final int f163974a;

        /* JADX INFO: renamed from: b */
        public final boolean f163975b;

        /* JADX INFO: renamed from: c */
        public final int f163976c;

        /* JADX INFO: renamed from: d */
        public final int f163977d;

        /* JADX INFO: renamed from: e */
        public final int f163978e;

        /* JADX INFO: renamed from: f */
        public final int f163979f;

        /* JADX INFO: renamed from: g */
        public final int f163980g;

        /* JADX INFO: renamed from: h */
        public final int f163981h;

        /* JADX INFO: renamed from: i */
        public final int f163982i;

        /* JADX INFO: renamed from: j */
        public final int f163983j;

        /* JADX INFO: renamed from: k */
        public final SparseArray<C19922g> f163984k;

        public C19921f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C19922g> sparseArray) {
            this.f163974a = i;
            this.f163975b = z;
            this.f163976c = i2;
            this.f163977d = i3;
            this.f163978e = i4;
            this.f163979f = i5;
            this.f163980g = i6;
            this.f163981h = i7;
            this.f163982i = i8;
            this.f163983j = i9;
            this.f163984k = sparseArray;
        }

        /* JADX INFO: renamed from: a */
        public void m183631a(C19921f c19921f) {
            SparseArray<C19922g> sparseArray = c19921f.f163984k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f163984k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: l.see$g */
    public static final class C19922g {

        /* JADX INFO: renamed from: a */
        public final int f163985a;

        /* JADX INFO: renamed from: b */
        public final int f163986b;

        /* JADX INFO: renamed from: c */
        public final int f163987c;

        /* JADX INFO: renamed from: d */
        public final int f163988d;

        /* JADX INFO: renamed from: e */
        public final int f163989e;

        /* JADX INFO: renamed from: f */
        public final int f163990f;

        public C19922g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f163985a = i;
            this.f163986b = i2;
            this.f163987c = i3;
            this.f163988d = i4;
            this.f163989e = i5;
            this.f163990f = i6;
        }
    }

    /* JADX INFO: renamed from: l.see$h */
    public static final class C19923h {

        /* JADX INFO: renamed from: a */
        public final int f163991a;

        /* JADX INFO: renamed from: b */
        public final int f163992b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<C19921f> f163993c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public final SparseArray<C19916a> f163994d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<C19918c> f163995e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final SparseArray<C19916a> f163996f = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<C19918c> f163997g = new SparseArray<>();

        /* JADX INFO: renamed from: h */
        @Nullable
        public C19917b f163998h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public C19919d f163999i;

        public C19923h(int i, int i2) {
            this.f163991a = i;
            this.f163992b = i2;
        }

        /* JADX INFO: renamed from: a */
        public void m183632a() {
            this.f163993c.clear();
            this.f163994d.clear();
            this.f163995e.clear();
            this.f163996f.clear();
            this.f163997g.clear();
            this.f163998h = null;
            this.f163999i = null;
        }
    }

    public see(int i, int i2) {
        Paint paint = new Paint();
        this.f163947a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f163948b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f163949c = new Canvas();
        this.f163950d = new C19917b(719, 575, 0, 719, 0, 575);
        this.f163951e = new C19916a(0, m183614c(), m183615d(), m183616e());
        this.f163952f = new C19923h(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m183613a(int i, int i2, c860 c860Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c860Var.m105664h(i2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m183614c() {
        return new int[]{0, -1, RoundedDrawable.DEFAULT_BORDER_COLOR, -8421505};
    }

    /* JADX INFO: renamed from: d */
    public static int[] m183615d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m183617f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m183617f(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m183616e() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = m183617f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
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
                    iArr[i2] = m183617f(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = m183617f(127, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = m183617f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = m183617f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: f */
    public static int m183617f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX INFO: renamed from: g */
    public static int m183618g(c860 c860Var, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        int i3;
        int iM105664h;
        int iM105664h2;
        boolean z = false;
        while (true) {
            int iM105664h3 = c860Var.m105664h(2);
            if (iM105664h3 != 0) {
                z = z;
                i3 = 1;
            } else {
                if (c860Var.m105663g()) {
                    iM105664h = c860Var.m105664h(3) + 3;
                    iM105664h2 = c860Var.m105664h(2);
                } else {
                    if (c860Var.m105663g()) {
                        i3 = 1;
                    } else {
                        int iM105664h4 = c860Var.m105664h(2);
                        if (iM105664h4 == 0) {
                            z = true;
                        } else if (iM105664h4 == 1) {
                            i3 = 2;
                        } else if (iM105664h4 == 2) {
                            iM105664h = c860Var.m105664h(4) + 12;
                            iM105664h2 = c860Var.m105664h(2);
                        } else if (iM105664h4 != 3) {
                            z = z;
                        } else {
                            iM105664h = c860Var.m105664h(8) + 29;
                            iM105664h2 = c860Var.m105664h(2);
                        }
                        iM105664h3 = 0;
                        i3 = 0;
                    }
                    iM105664h3 = 0;
                }
                z = z;
                i3 = iM105664h;
                iM105664h3 = iM105664h2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iM105664h3 = bArr[iM105664h3];
                }
                paint.setColor(iArr[iM105664h3]);
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
    public static int m183619h(c860 c860Var, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        int i3;
        int iM105664h;
        int iM105664h2;
        boolean z = false;
        while (true) {
            int iM105664h3 = c860Var.m105664h(4);
            if (iM105664h3 != 0) {
                z = z;
                i3 = 1;
            } else if (c860Var.m105663g()) {
                if (c860Var.m105663g()) {
                    int iM105664h4 = c860Var.m105664h(2);
                    if (iM105664h4 == 0) {
                        i3 = 1;
                        iM105664h3 = 0;
                    } else if (iM105664h4 == 1) {
                        iM105664h3 = 0;
                        i3 = 2;
                        z = z;
                    } else if (iM105664h4 == 2) {
                        iM105664h = c860Var.m105664h(4) + 9;
                        iM105664h2 = c860Var.m105664h(4);
                    } else if (iM105664h4 != 3) {
                        z = z;
                        iM105664h3 = 0;
                        i3 = 0;
                    } else {
                        iM105664h = c860Var.m105664h(8) + 25;
                        iM105664h2 = c860Var.m105664h(4);
                    }
                } else {
                    iM105664h = c860Var.m105664h(2) + 4;
                    iM105664h2 = c860Var.m105664h(4);
                }
                z = z;
                i3 = iM105664h;
                iM105664h3 = iM105664h2;
            } else {
                int iM105664h5 = c860Var.m105664h(3);
                if (iM105664h5 != 0) {
                    i3 = iM105664h5 + 2;
                    iM105664h3 = 0;
                } else {
                    z = true;
                    iM105664h3 = 0;
                    i3 = 0;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    iM105664h3 = bArr[iM105664h3];
                }
                paint.setColor(iArr[iM105664h3]);
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
    public static int m183620i(c860 c860Var, int[] iArr, @Nullable byte[] bArr, int i, int i2, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int iM105664h;
        boolean z2 = false;
        while (true) {
            int iM105664h2 = c860Var.m105664h(8);
            if (iM105664h2 != 0) {
                z = z2;
                iM105664h = 1;
            } else if (c860Var.m105663g()) {
                z = z2;
                iM105664h = c860Var.m105664h(7);
                iM105664h2 = c860Var.m105664h(8);
            } else {
                int iM105664h3 = c860Var.m105664h(7);
                if (iM105664h3 != 0) {
                    z = z2;
                    iM105664h = iM105664h3;
                    iM105664h2 = 0;
                } else {
                    z = true;
                    iM105664h2 = 0;
                    iM105664h = 0;
                }
            }
            if (iM105664h != 0 && paint != null) {
                if (bArr != null) {
                    iM105664h2 = bArr[iM105664h2];
                }
                paint.setColor(iArr[iM105664h2]);
                canvas.drawRect(i, i2, i + iM105664h, 1 + i2, paint);
            }
            i += iM105664h;
            if (z) {
                return i;
            }
            z2 = z;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m183621j(byte[] bArr, int[] iArr, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        c860 c860Var = new c860(bArr);
        byte[] bArrM183613a = null;
        byte[] bArrM183613a2 = null;
        int iM183618g = i2;
        int i4 = i3;
        byte[] bArrM183613a3 = null;
        while (c860Var.m105658b() != 0) {
            int iM105664h = c860Var.m105664h(8);
            if (iM105664h != 240) {
                switch (iM105664h) {
                    case 16:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        if (i != 3) {
                            if (i == 2) {
                                bArr3 = bArrM183613a2 == null ? f163944h : bArrM183613a2;
                            } else {
                                bArr2 = null;
                            }
                            iM183618g = m183618g(c860Var, iArr2, bArr2, iM183618g, i4, paint2, canvas2);
                            c860Var.m105659c();
                        } else {
                            bArr3 = bArrM183613a3 == null ? f163945i : bArrM183613a3;
                        }
                        bArr2 = bArr3;
                        iM183618g = m183618g(c860Var, iArr2, bArr2, iM183618g, i4, paint2, canvas2);
                        c860Var.m105659c();
                        break;
                    case 17:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        paint2 = paint3;
                        iM183618g = m183619h(c860Var, iArr2, i == 3 ? bArrM183613a == null ? f163946j : bArrM183613a : null, iM183618g, i4, paint2, canvas2);
                        c860Var.m105659c();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iM183618g = m183620i(c860Var, iArr2, null, iM183618g, i4, paint2, canvas2);
                        break;
                    default:
                        switch (iM105664h) {
                            case 32:
                                bArrM183613a2 = m183613a(4, 4, c860Var);
                                break;
                            case 33:
                                bArrM183613a3 = m183613a(4, 8, c860Var);
                                break;
                            case 34:
                                bArrM183613a = m183613a(16, 8, c860Var);
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
                iM183618g = i2;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m183622k(C19918c c19918c, C19916a c19916a, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c19916a.f163957d;
        } else {
            iArr = i == 2 ? c19916a.f163956c : c19916a.f163955b;
        }
        int[] iArr2 = iArr;
        m183621j(c19918c.f163966c, iArr2, i, i2, i3, paint, canvas);
        m183621j(c19918c.f163967d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    /* JADX INFO: renamed from: l */
    public static C19916a m183623l(c860 c860Var, int i) {
        int[] iArr;
        int iM105664h;
        int i2;
        int iM105664h2;
        int iM105664h3;
        int iM105664h4;
        int i3 = 8;
        int iM105664h5 = c860Var.m105664h(8);
        c860Var.m105674r(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrM183614c = m183614c();
        int[] iArrM183615d = m183615d();
        int[] iArrM183616e = m183616e();
        while (i5 > 0) {
            int iM105664h6 = c860Var.m105664h(i3);
            int iM105664h7 = c860Var.m105664h(i3);
            if ((iM105664h7 & 128) != 0) {
                iArr = iArrM183614c;
            } else {
                iArr = (iM105664h7 & 64) != 0 ? iArrM183615d : iArrM183616e;
            }
            if ((iM105664h7 & 1) != 0) {
                iM105664h3 = c860Var.m105664h(i3);
                iM105664h4 = c860Var.m105664h(i3);
                iM105664h = c860Var.m105664h(i3);
                iM105664h2 = c860Var.m105664h(i3);
                i2 = i5 - 6;
            } else {
                int iM105664h8 = c860Var.m105664h(6) << i4;
                int iM105664h9 = c860Var.m105664h(4) << 4;
                iM105664h = c860Var.m105664h(4) << 4;
                i2 = i5 - 4;
                iM105664h2 = c860Var.m105664h(i4) << 6;
                iM105664h3 = iM105664h8;
                iM105664h4 = iM105664h9;
            }
            if (iM105664h3 == 0) {
                iM105664h2 = 255;
                iM105664h4 = 0;
                iM105664h = 0;
            }
            double d = iM105664h3;
            double d2 = iM105664h4 - 128;
            double d3 = iM105664h - 128;
            iArr[iM105664h6] = m183617f((byte) (255 - (iM105664h2 & 255)), vck0.m197884q((int) (d + (1.402d * d2)), 0, 255), vck0.m197884q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), vck0.m197884q((int) (d + (d3 * 1.772d)), 0, 255));
            i5 = i2;
            iM105664h5 = iM105664h5;
            i3 = 8;
            i4 = 2;
        }
        return new C19916a(iM105664h5, iArrM183614c, iArrM183615d, iArrM183616e);
    }

    /* JADX INFO: renamed from: m */
    public static C19917b m183624m(c860 c860Var) {
        int i;
        int i2;
        int i3;
        int iM105664h;
        c860Var.m105674r(4);
        boolean zM105663g = c860Var.m105663g();
        c860Var.m105674r(3);
        int iM105664h2 = c860Var.m105664h(16);
        int iM105664h3 = c860Var.m105664h(16);
        if (zM105663g) {
            int iM105664h4 = c860Var.m105664h(16);
            int iM105664h5 = c860Var.m105664h(16);
            int iM105664h6 = c860Var.m105664h(16);
            iM105664h = c860Var.m105664h(16);
            i3 = iM105664h5;
            i2 = iM105664h6;
            i = iM105664h4;
        } else {
            i = 0;
            i2 = 0;
            i3 = iM105664h2;
            iM105664h = iM105664h3;
        }
        return new C19917b(iM105664h2, iM105664h3, i, i3, i2, iM105664h);
    }

    /* JADX INFO: renamed from: n */
    public static C19918c m183625n(c860 c860Var) {
        byte[] bArr;
        int iM105664h = c860Var.m105664h(16);
        c860Var.m105674r(4);
        int iM105664h2 = c860Var.m105664h(2);
        boolean zM105663g = c860Var.m105663g();
        c860Var.m105674r(1);
        byte[] bArr2 = vck0.f180953f;
        if (iM105664h2 != 1) {
            if (iM105664h2 == 0) {
                int iM105664h3 = c860Var.m105664h(16);
                int iM105664h4 = c860Var.m105664h(16);
                if (iM105664h3 > 0) {
                    bArr2 = new byte[iM105664h3];
                    c860Var.m105667k(bArr2, 0, iM105664h3);
                }
                if (iM105664h4 > 0) {
                    bArr = new byte[iM105664h4];
                    c860Var.m105667k(bArr, 0, iM105664h4);
                }
            }
            return new C19918c(iM105664h, zM105663g, bArr2, bArr);
        }
        c860Var.m105674r(c860Var.m105664h(8) * 16);
        bArr = bArr2;
        return new C19918c(iM105664h, zM105663g, bArr2, bArr);
    }

    /* JADX INFO: renamed from: o */
    public static C19919d m183626o(c860 c860Var, int i) {
        int iM105664h = c860Var.m105664h(8);
        int iM105664h2 = c860Var.m105664h(4);
        int iM105664h3 = c860Var.m105664h(2);
        c860Var.m105674r(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int iM105664h4 = c860Var.m105664h(8);
            c860Var.m105674r(8);
            i2 -= 6;
            sparseArray.put(iM105664h4, new C19920e(c860Var.m105664h(16), c860Var.m105664h(16)));
        }
        return new C19919d(iM105664h, iM105664h2, iM105664h3, sparseArray);
    }

    /* JADX INFO: renamed from: p */
    public static C19921f m183627p(c860 c860Var, int i) {
        int i2;
        int iM105664h;
        int iM105664h2;
        char c;
        int iM105664h3 = c860Var.m105664h(8);
        int i3 = 4;
        c860Var.m105674r(4);
        boolean zM105663g = c860Var.m105663g();
        c860Var.m105674r(3);
        int i4 = 16;
        int iM105664h4 = c860Var.m105664h(16);
        int iM105664h5 = c860Var.m105664h(16);
        int iM105664h6 = c860Var.m105664h(3);
        int iM105664h7 = c860Var.m105664h(3);
        int i5 = 2;
        c860Var.m105674r(2);
        int iM105664h8 = c860Var.m105664h(8);
        int iM105664h9 = c860Var.m105664h(8);
        int iM105664h10 = c860Var.m105664h(4);
        int iM105664h11 = c860Var.m105664h(2);
        c860Var.m105674r(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int iM105664h12 = c860Var.m105664h(i4);
            int iM105664h13 = c860Var.m105664h(i5);
            int iM105664h14 = c860Var.m105664h(i5);
            int iM105664h15 = c860Var.m105664h(12);
            c860Var.m105674r(i3);
            int iM105664h16 = c860Var.m105664h(12);
            int i7 = i6 - 6;
            if (iM105664h13 != 1) {
                i2 = 2;
                if (iM105664h13 != 2) {
                    iM105664h2 = 0;
                    iM105664h = 0;
                    i6 = i7;
                    c = '\b';
                }
                sparseArray.put(iM105664h12, new C19922g(iM105664h13, iM105664h14, iM105664h15, iM105664h16, iM105664h2, iM105664h));
                i4 = 16;
                i5 = i2;
                i3 = 4;
            } else {
                i2 = 2;
            }
            c = '\b';
            i6 -= 8;
            iM105664h2 = c860Var.m105664h(8);
            iM105664h = c860Var.m105664h(8);
            sparseArray.put(iM105664h12, new C19922g(iM105664h13, iM105664h14, iM105664h15, iM105664h16, iM105664h2, iM105664h));
            i4 = 16;
            i5 = i2;
            i3 = 4;
        }
        return new C19921f(iM105664h3, zM105663g, iM105664h4, iM105664h5, iM105664h6, iM105664h7, iM105664h8, iM105664h9, iM105664h10, iM105664h11, sparseArray);
    }

    /* JADX INFO: renamed from: q */
    public static void m183628q(c860 c860Var, C19923h c19923h) {
        C19921f c19921f;
        int iM105664h = c860Var.m105664h(8);
        int iM105664h2 = c860Var.m105664h(16);
        int iM105664h3 = c860Var.m105664h(16);
        int iM105660d = c860Var.m105660d() + iM105664h3;
        if (iM105664h3 * 8 > c860Var.m105658b()) {
            jwv.m143689i("DvbParser", "Data field length exceeds limit");
            c860Var.m105674r(c860Var.m105658b());
            return;
        }
        switch (iM105664h) {
            case 16:
                if (iM105664h2 == c19923h.f163991a) {
                    C19919d c19919d = c19923h.f163999i;
                    C19919d c19919dM183626o = m183626o(c860Var, iM105664h3);
                    if (c19919dM183626o.f163970c != 0) {
                        c19923h.f163999i = c19919dM183626o;
                        c19923h.f163993c.clear();
                        c19923h.f163994d.clear();
                        c19923h.f163995e.clear();
                    } else if (c19919d != null && c19919d.f163969b != c19919dM183626o.f163969b) {
                        c19923h.f163999i = c19919dM183626o;
                    }
                }
                break;
            case 17:
                C19919d c19919d2 = c19923h.f163999i;
                if (iM105664h2 == c19923h.f163991a && c19919d2 != null) {
                    C19921f c19921fM183627p = m183627p(c860Var, iM105664h3);
                    if (c19919d2.f163970c == 0 && (c19921f = c19923h.f163993c.get(c19921fM183627p.f163974a)) != null) {
                        c19921fM183627p.m183631a(c19921f);
                    }
                    c19923h.f163993c.put(c19921fM183627p.f163974a, c19921fM183627p);
                }
                break;
            case 18:
                if (iM105664h2 == c19923h.f163991a) {
                    C19916a c19916aM183623l = m183623l(c860Var, iM105664h3);
                    c19923h.f163994d.put(c19916aM183623l.f163954a, c19916aM183623l);
                } else if (iM105664h2 == c19923h.f163992b) {
                    C19916a c19916aM183623l2 = m183623l(c860Var, iM105664h3);
                    c19923h.f163996f.put(c19916aM183623l2.f163954a, c19916aM183623l2);
                }
                break;
            case 19:
                if (iM105664h2 == c19923h.f163991a) {
                    C19918c c19918cM183625n = m183625n(c860Var);
                    c19923h.f163995e.put(c19918cM183625n.f163964a, c19918cM183625n);
                } else if (iM105664h2 == c19923h.f163992b) {
                    C19918c c19918cM183625n2 = m183625n(c860Var);
                    c19923h.f163997g.put(c19918cM183625n2.f163964a, c19918cM183625n2);
                }
                break;
            case 20:
                if (iM105664h2 == c19923h.f163991a) {
                    c19923h.f163998h = m183624m(c860Var);
                }
                break;
        }
        c860Var.m105675s(iM105660d - c860Var.m105660d());
    }

    /* JADX INFO: renamed from: b */
    public List<ywb> m183629b(byte[] bArr, int i) {
        int i2;
        c860 c860Var = new c860(bArr, i);
        while (c860Var.m105658b() >= 48 && c860Var.m105664h(8) == 15) {
            m183628q(c860Var, this.f163952f);
        }
        C19923h c19923h = this.f163952f;
        C19919d c19919d = c19923h.f163999i;
        if (c19919d == null) {
            return Collections.EMPTY_LIST;
        }
        C19917b c19917b = c19923h.f163998h;
        if (c19917b == null) {
            c19917b = this.f163950d;
        }
        Bitmap bitmap = this.f163953g;
        if (bitmap == null || c19917b.f163958a + 1 != bitmap.getWidth() || c19917b.f163959b + 1 != this.f163953g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c19917b.f163958a + 1, c19917b.f163959b + 1, Bitmap.Config.ARGB_8888);
            this.f163953g = bitmapCreateBitmap;
            this.f163949c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C19920e> sparseArray = c19919d.f163971d;
        int i3 = 0;
        while (i3 < sparseArray.size()) {
            this.f163949c.save();
            C19920e c19920eValueAt = sparseArray.valueAt(i3);
            C19921f c19921f = this.f163952f.f163993c.get(sparseArray.keyAt(i3));
            int i4 = c19920eValueAt.f163972a + c19917b.f163960c;
            int i5 = c19920eValueAt.f163973b + c19917b.f163962e;
            this.f163949c.clipRect(i4, i5, Math.min(c19921f.f163976c + i4, c19917b.f163961d), Math.min(c19921f.f163977d + i5, c19917b.f163963f));
            C19916a c19916a = this.f163952f.f163994d.get(c19921f.f163980g);
            if (c19916a == null && (c19916a = this.f163952f.f163996f.get(c19921f.f163980g)) == null) {
                c19916a = this.f163951e;
            }
            C19916a c19916a2 = c19916a;
            SparseArray<C19922g> sparseArray2 = c19921f.f163984k;
            int i6 = 0;
            while (i6 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i6);
                C19922g c19922gValueAt = sparseArray2.valueAt(i6);
                C19918c c19918c = this.f163952f.f163995e.get(iKeyAt);
                if (c19918c == null) {
                    c19918c = this.f163952f.f163997g.get(iKeyAt);
                }
                if (c19918c != null) {
                    m183622k(c19918c, c19916a2, c19921f.f163979f, c19922gValueAt.f163987c + i4, c19922gValueAt.f163988d + i5, c19918c.f163965b ? null : this.f163947a, this.f163949c);
                }
                i6++;
                sparseArray = sparseArray;
            }
            SparseArray<C19920e> sparseArray3 = sparseArray;
            if (c19921f.f163975b) {
                int i7 = c19921f.f163979f;
                if (i7 == 3) {
                    i2 = c19916a2.f163957d[c19921f.f163981h];
                } else {
                    i2 = i7 == 2 ? c19916a2.f163956c[c19921f.f163982i] : c19916a2.f163955b[c19921f.f163983j];
                }
                this.f163948b.setColor(i2);
                this.f163949c.drawRect(i4, i5, c19921f.f163976c + i4, c19921f.f163977d + i5, this.f163948b);
            }
            arrayList.add(new ywb.C21557b().m216316f(Bitmap.createBitmap(this.f163953g, i4, i5, c19921f.f163976c, c19921f.f163977d)).m216321k(i4 / c19917b.f163958a).m216322l(0).m216318h(i5 / c19917b.f163959b, 0).m216319i(0).m216324n(c19921f.f163976c / c19917b.f163958a).m216317g(c19921f.f163977d / c19917b.f163959b).m216311a());
            this.f163949c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f163949c.restore();
            i3++;
            sparseArray = sparseArray3;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public void m183630r() {
        this.f163952f.m183632a();
    }
}
