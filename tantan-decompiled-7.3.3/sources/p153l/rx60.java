package p153l;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class rx60 extends xpf0 {

    /* JADX INFO: renamed from: o */
    public final ig60 f165299o;

    /* JADX INFO: renamed from: p */
    public final ig60 f165300p;

    /* JADX INFO: renamed from: q */
    public final C19929a f165301q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Inflater f165302r;

    /* JADX INFO: renamed from: l.rx60$a */
    public static final class C19929a {

        /* JADX INFO: renamed from: a */
        public final ig60 f165303a = new ig60();

        /* JADX INFO: renamed from: b */
        public final int[] f165304b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f165305c;

        /* JADX INFO: renamed from: d */
        public int f165306d;

        /* JADX INFO: renamed from: e */
        public int f165307e;

        /* JADX INFO: renamed from: f */
        public int f165308f;

        /* JADX INFO: renamed from: g */
        public int f165309g;

        /* JADX INFO: renamed from: h */
        public int f165310h;

        /* JADX INFO: renamed from: i */
        public int f165311i;

        @Nullable
        /* JADX INFO: renamed from: d */
        public myb m183534d() {
            int iM139795H;
            if (this.f165306d == 0 || this.f165307e == 0 || this.f165310h == 0 || this.f165311i == 0 || this.f165303a.m139817g() == 0 || this.f165303a.m139816f() != this.f165303a.m139817g() || !this.f165305c) {
                return null;
            }
            this.f165303a.m139808U(0);
            int i = this.f165310h * this.f165311i;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int iM139795H2 = this.f165303a.m139795H();
                if (iM139795H2 != 0) {
                    iM139795H = i2 + 1;
                    iArr[i2] = this.f165304b[iM139795H2];
                } else {
                    int iM139795H3 = this.f165303a.m139795H();
                    if (iM139795H3 != 0) {
                        iM139795H = ((iM139795H3 & 64) == 0 ? iM139795H3 & 63 : ((iM139795H3 & 63) << 8) | this.f165303a.m139795H()) + i2;
                        Arrays.fill(iArr, i2, iM139795H, (iM139795H3 & 128) == 0 ? 0 : this.f165304b[this.f165303a.m139795H()]);
                    }
                }
                i2 = iM139795H;
            }
            return new myb.C18746b().m160759f(Bitmap.createBitmap(iArr, this.f165310h, this.f165311i, Bitmap.Config.ARGB_8888)).m160764k(this.f165308f / this.f165306d).m160765l(0).m160761h(this.f165309g / this.f165307e, 0).m160762i(0).m160767n(this.f165310h / this.f165306d).m160760g(this.f165311i / this.f165307e).m160754a();
        }

        /* JADX INFO: renamed from: e */
        public final void m183535e(ig60 ig60Var, int i) {
            int iM139798K;
            if (i < 4) {
                return;
            }
            ig60Var.m139809V(3);
            int i2 = i - 4;
            if ((ig60Var.m139795H() & 128) != 0) {
                if (i2 < 7 || (iM139798K = ig60Var.m139798K()) < 4) {
                    return;
                }
                this.f165310h = ig60Var.m139801N();
                this.f165311i = ig60Var.m139801N();
                this.f165303a.m139804Q(iM139798K - 4);
                i2 = i - 11;
            }
            int iM139816f = this.f165303a.m139816f();
            int iM139817g = this.f165303a.m139817g();
            if (iM139816f >= iM139817g || i2 <= 0) {
                return;
            }
            int iMin = Math.min(i2, iM139817g - iM139816f);
            ig60Var.m139822l(this.f165303a.m139815e(), iM139816f, iMin);
            this.f165303a.m139808U(iM139816f + iMin);
        }

        /* JADX INFO: renamed from: f */
        public final void m183536f(ig60 ig60Var, int i) {
            if (i < 19) {
                return;
            }
            this.f165306d = ig60Var.m139801N();
            this.f165307e = ig60Var.m139801N();
            ig60Var.m139809V(11);
            this.f165308f = ig60Var.m139801N();
            this.f165309g = ig60Var.m139801N();
        }

        /* JADX INFO: renamed from: g */
        public final void m183537g(ig60 ig60Var, int i) {
            if (i % 5 != 2) {
                return;
            }
            ig60Var.m139809V(2);
            Arrays.fill(this.f165304b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int iM139795H = ig60Var.m139795H();
                int iM139795H2 = ig60Var.m139795H();
                int iM139795H3 = ig60Var.m139795H();
                int iM139795H4 = ig60Var.m139795H();
                double d = iM139795H2;
                double d2 = iM139795H3 - 128;
                double d3 = iM139795H4 - 128;
                this.f165304b[iM139795H] = (bmk0.m105162q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (ig60Var.m139795H() << 24) | (bmk0.m105162q((int) ((1.402d * d2) + d), 0, 255) << 16) | bmk0.m105162q((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f165305c = true;
        }

        /* JADX INFO: renamed from: h */
        public void m183538h() {
            this.f165306d = 0;
            this.f165307e = 0;
            this.f165308f = 0;
            this.f165309g = 0;
            this.f165310h = 0;
            this.f165311i = 0;
            this.f165303a.m139804Q(0);
            this.f165305c = false;
        }
    }

    public rx60() {
        super("PgsDecoder");
        this.f165299o = new ig60();
        this.f165300p = new ig60();
        this.f165301q = new C19929a();
    }

    @Nullable
    /* JADX INFO: renamed from: C */
    public static myb m183529C(ig60 ig60Var, C19929a c19929a) {
        int iM139817g = ig60Var.m139817g();
        int iM139795H = ig60Var.m139795H();
        int iM139801N = ig60Var.m139801N();
        int iM139816f = ig60Var.m139816f() + iM139801N;
        myb mybVarM183534d = null;
        if (iM139816f > iM139817g) {
            ig60Var.m139808U(iM139817g);
            return null;
        }
        if (iM139795H != 128) {
            switch (iM139795H) {
                case 20:
                    c19929a.m183537g(ig60Var, iM139801N);
                    break;
                case 21:
                    c19929a.m183535e(ig60Var, iM139801N);
                    break;
                case 22:
                    c19929a.m183536f(ig60Var, iM139801N);
                    break;
            }
        } else {
            mybVarM183534d = c19929a.m183534d();
            c19929a.m183538h();
        }
        ig60Var.m139808U(iM139816f);
        return mybVarM183534d;
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f165299o.m139806S(bArr, i);
        m183530B(this.f165299o);
        this.f165301q.m183538h();
        ArrayList arrayList = new ArrayList();
        while (this.f165299o.m139811a() >= 3) {
            myb mybVarM183529C = m183529C(this.f165299o, this.f165301q);
            if (mybVarM183529C != null) {
                arrayList.add(mybVarM183529C);
            }
        }
        return new sx60(Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: B */
    public final void m183530B(ig60 ig60Var) {
        if (ig60Var.m139811a() <= 0 || ig60Var.m139820j() != 120) {
            return;
        }
        if (this.f165302r == null) {
            this.f165302r = new Inflater();
        }
        if (bmk0.m105179y0(ig60Var, this.f165300p, this.f165302r)) {
            ig60Var.m139806S(this.f165300p.m139815e(), this.f165300p.m139817g());
        }
    }
}
