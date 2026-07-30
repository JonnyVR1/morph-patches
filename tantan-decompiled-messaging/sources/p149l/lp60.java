package p149l;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lp60 extends phf0 {

    /* JADX INFO: renamed from: o */
    public final d860 f129168o;

    /* JADX INFO: renamed from: p */
    public final d860 f129169p;

    /* JADX INFO: renamed from: q */
    public final C18276a f129170q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Inflater f129171r;

    /* JADX INFO: renamed from: l.lp60$a */
    public static final class C18276a {

        /* JADX INFO: renamed from: a */
        public final d860 f129172a = new d860();

        /* JADX INFO: renamed from: b */
        public final int[] f129173b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f129174c;

        /* JADX INFO: renamed from: d */
        public int f129175d;

        /* JADX INFO: renamed from: e */
        public int f129176e;

        /* JADX INFO: renamed from: f */
        public int f129177f;

        /* JADX INFO: renamed from: g */
        public int f129178g;

        /* JADX INFO: renamed from: h */
        public int f129179h;

        /* JADX INFO: renamed from: i */
        public int f129180i;

        @Nullable
        /* JADX INFO: renamed from: d */
        public ywb m150829d() {
            int iM110279H;
            if (this.f129175d == 0 || this.f129176e == 0 || this.f129179h == 0 || this.f129180i == 0 || this.f129172a.m110301g() == 0 || this.f129172a.m110300f() != this.f129172a.m110301g() || !this.f129174c) {
                return null;
            }
            this.f129172a.m110292U(0);
            int i = this.f129179h * this.f129180i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iM110279H2 = this.f129172a.m110279H();
                if (iM110279H2 != 0) {
                    iM110279H = i2 + 1;
                    iArr[i2] = this.f129173b[iM110279H2];
                } else {
                    int iM110279H3 = this.f129172a.m110279H();
                    if (iM110279H3 != 0) {
                        iM110279H = ((iM110279H3 & 64) == 0 ? iM110279H3 & 63 : ((iM110279H3 & 63) << 8) | this.f129172a.m110279H()) + i2;
                        Arrays.fill(iArr, i2, iM110279H, (iM110279H3 & 128) == 0 ? 0 : this.f129173b[this.f129172a.m110279H()]);
                    }
                }
                i2 = iM110279H;
            }
            return new ywb.C21557b().m216316f(Bitmap.createBitmap(iArr, this.f129179h, this.f129180i, Bitmap.Config.ARGB_8888)).m216321k(this.f129177f / this.f129175d).m216322l(0).m216318h(this.f129178g / this.f129176e, 0).m216319i(0).m216324n(this.f129179h / this.f129175d).m216317g(this.f129180i / this.f129176e).m216311a();
        }

        /* JADX INFO: renamed from: e */
        public final void m150830e(d860 d860Var, int i) {
            int iM110282K;
            if (i < 4) {
                return;
            }
            d860Var.m110293V(3);
            int i2 = i - 4;
            if ((d860Var.m110279H() & 128) != 0) {
                if (i2 < 7 || (iM110282K = d860Var.m110282K()) < 4) {
                    return;
                }
                this.f129179h = d860Var.m110285N();
                this.f129180i = d860Var.m110285N();
                this.f129172a.m110288Q(iM110282K - 4);
                i2 = i - 11;
            }
            int iM110300f = this.f129172a.m110300f();
            int iM110301g = this.f129172a.m110301g();
            if (iM110300f >= iM110301g || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iM110301g - iM110300f);
            d860Var.m110306l(this.f129172a.m110299e(), iM110300f, iMin);
            this.f129172a.m110292U(iM110300f + iMin);
        }

        /* JADX INFO: renamed from: f */
        public final void m150831f(d860 d860Var, int i) {
            if (i < 19) {
                return;
            }
            this.f129175d = d860Var.m110285N();
            this.f129176e = d860Var.m110285N();
            d860Var.m110293V(11);
            this.f129177f = d860Var.m110285N();
            this.f129178g = d860Var.m110285N();
        }

        /* JADX INFO: renamed from: g */
        public final void m150832g(d860 d860Var, int i) {
            if (i % 5 != 2) {
                return;
            }
            d860Var.m110293V(2);
            Arrays.fill(this.f129173b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iM110279H = d860Var.m110279H();
                int iM110279H2 = d860Var.m110279H();
                int iM110279H3 = d860Var.m110279H();
                int iM110279H4 = d860Var.m110279H();
                double d = iM110279H2;
                double d2 = iM110279H3 - 128;
                double d3 = iM110279H4 - 128;
                this.f129173b[iM110279H] = (vck0.m197884q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (d860Var.m110279H() << 24) | (vck0.m197884q((int) ((1.402d * d2) + d), 0, 255) << 16) | vck0.m197884q((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f129174c = true;
        }

        /* JADX INFO: renamed from: h */
        public void m150833h() {
            this.f129175d = 0;
            this.f129176e = 0;
            this.f129177f = 0;
            this.f129178g = 0;
            this.f129179h = 0;
            this.f129180i = 0;
            this.f129172a.m110288Q(0);
            this.f129174c = false;
        }
    }

    public lp60() {
        super("PgsDecoder");
        this.f129168o = new d860();
        this.f129169p = new d860();
        this.f129170q = new C18276a();
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public static ywb m150824C(d860 d860Var, C18276a c18276a) {
        int iM110301g = d860Var.m110301g();
        int iM110279H = d860Var.m110279H();
        int iM110285N = d860Var.m110285N();
        int iM110300f = d860Var.m110300f() + iM110285N;
        ywb ywbVarM150829d = null;
        if (iM110300f > iM110301g) {
            d860Var.m110292U(iM110301g);
            return null;
        }
        if (iM110279H != 128) {
            switch (iM110279H) {
                case 20:
                    c18276a.m150832g(d860Var, iM110285N);
                    break;
                case 21:
                    c18276a.m150830e(d860Var, iM110285N);
                    break;
                case 22:
                    c18276a.m150831f(d860Var, iM110285N);
                    break;
            }
        } else {
            ywbVarM150829d = c18276a.m150829d();
            c18276a.m150833h();
        }
        d860Var.m110292U(iM110300f);
        return ywbVarM150829d;
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f129168o.m110290S(bArr, i);
        m150825B(this.f129168o);
        this.f129170q.m150833h();
        ArrayList arrayList = new ArrayList();
        while (this.f129168o.m110295a() >= 3) {
            ywb ywbVarM150824C = m150824C(this.f129168o, this.f129170q);
            if (ywbVarM150824C != null) {
                arrayList.add(ywbVarM150824C);
            }
        }
        return new mp60(Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: B */
    public final void m150825B(d860 d860Var) {
        if (d860Var.m110295a() <= 0 || d860Var.m110304j() != 120) {
            return;
        }
        if (this.f129171r == null) {
            this.f129171r = new Inflater();
        }
        if (vck0.m197901y0(d860Var, this.f129169p, this.f129171r)) {
            d860Var.m110290S(this.f129169p.m110299e(), this.f129169p.m110301g());
        }
    }
}
