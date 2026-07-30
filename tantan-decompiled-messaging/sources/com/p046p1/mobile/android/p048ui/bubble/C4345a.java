package com.p046p1.mobile.android.p048ui.bubble;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import com.p046p1.mobile.android.app.App;
import java.lang.ref.WeakReference;
import p149l.f0m;
import p149l.j0m;
import p149l.l0m;
import p149l.t0c0;
import p149l.t100;
import p149l.uc80;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4345a implements l0m, j0m {

    /* JADX INFO: renamed from: N */
    public static int f15680N = 1;

    /* JADX INFO: renamed from: O */
    public static int f15681O = 16;

    /* JADX INFO: renamed from: P */
    public static int f15682P = 256;

    /* JADX INFO: renamed from: Q */
    public static int f15683Q = 4096;

    /* JADX INFO: renamed from: R */
    public static int f15684R = 1048576;

    /* JADX INFO: renamed from: A */
    public boolean f15685A;

    /* JADX INFO: renamed from: B */
    @ColorInt
    public int f15686B;

    /* JADX INFO: renamed from: C */
    public int f15687C;

    /* JADX INFO: renamed from: E */
    public boolean f15689E;

    /* JADX INFO: renamed from: F */
    public Integer f15690F;

    /* JADX INFO: renamed from: G */
    public a f15691G;

    /* JADX INFO: renamed from: H */
    public int f15692H;

    /* JADX INFO: renamed from: I */
    public int f15693I;

    /* JADX INFO: renamed from: J */
    public boolean f15694J;

    /* JADX INFO: renamed from: K */
    public f0m f15695K;

    /* JADX INFO: renamed from: M */
    public WeakReference<View> f15697M;

    /* JADX INFO: renamed from: a */
    public int[] f15698a;

    /* JADX INFO: renamed from: c */
    public int f15700c;

    /* JADX INFO: renamed from: d */
    public int f15701d;

    /* JADX INFO: renamed from: k */
    public b f15708k;

    /* JADX INFO: renamed from: l */
    public c f15709l;

    /* JADX INFO: renamed from: m */
    public d f15710m;

    /* JADX INFO: renamed from: q */
    public String f15714q;

    /* JADX INFO: renamed from: r */
    public CharSequence f15715r;

    /* JADX INFO: renamed from: t */
    public int f15717t;

    /* JADX INFO: renamed from: u */
    public Integer f15718u;

    /* JADX INFO: renamed from: w */
    public View f15720w;

    /* JADX INFO: renamed from: y */
    public View f15722y;

    /* JADX INFO: renamed from: z */
    public boolean f15723z;

    /* JADX INFO: renamed from: v */
    public int f15719v = -1;

    /* JADX INFO: renamed from: D */
    public boolean f15688D = false;

    /* JADX INFO: renamed from: L */
    public String f15696L = null;

    /* JADX INFO: renamed from: b */
    public int f15699b = f15680N | f15684R;

    /* JADX INFO: renamed from: g */
    public int f15704g = t100.m186890d(7.0f);

    /* JADX INFO: renamed from: i */
    public int f15706i = t100.f167260i;

    /* JADX INFO: renamed from: e */
    public int f15702e = 0;

    /* JADX INFO: renamed from: f */
    public int f15703f = 0;

    /* JADX INFO: renamed from: h */
    public int f15705h = 75;

    /* JADX INFO: renamed from: j */
    public long f15707j = -1;

    /* JADX INFO: renamed from: n */
    public boolean f15711n = false;

    /* JADX INFO: renamed from: s */
    public float f15716s = 16.0f;

    /* JADX INFO: renamed from: o */
    public boolean f15712o = false;

    /* JADX INFO: renamed from: p */
    @ColorInt
    public int f15713p = -1;

    /* JADX INFO: renamed from: x */
    public boolean f15721x = true;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f15724a;

        /* JADX INFO: renamed from: b */
        public int f15725b;

        /* JADX INFO: renamed from: c */
        public int f15726c;

        /* JADX INFO: renamed from: d */
        public int f15727d;

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo20885a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo20886a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo20887a(View view);
    }

    public C4345a(Context context) {
        this.f15698a = new int[]{context.getResources().getColor(t0c0.f167168t)};
        this.f15686B = context.getResources().getColor(t0c0.f167159k);
    }

    /* JADX INFO: renamed from: A */
    public C4345a m20846A(View view) {
        this.f15722y = view;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C4345a m20847B(int i) {
        this.f15702e = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public C4345a m20848C(int i) {
        this.f15687C = i;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public C4345a m20849D(CharSequence charSequence) {
        this.f15715r = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public C4345a m20850E(boolean z) {
        this.f15712o = z;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public C4345a m20851F(boolean z) {
        this.f15694J = z;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public C4345a m20852G(@ColorRes int i) {
        this.f15713p = App.f15369e.getResources().getColor(i);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public C4345a m20853H(int i, int i2, int i3, int i4) {
        a aVar = new a();
        this.f15691G = aVar;
        aVar.f15724a = i;
        aVar.f15725b = i2;
        aVar.f15726c = i3;
        aVar.f15727d = i4;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public C4345a m20854I(int i) {
        this.f15717t = i;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public C4345a m20855J(float f) {
        this.f15716s = f;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public C4345a m20856K(int i) {
        this.f15690F = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public C4345a m20857L(@ColorRes int i) {
        this.f15686B = App.f15369e.getResources().getColor(i);
        return this;
    }

    /* JADX INFO: renamed from: M */
    public C4345a m20858M(boolean z) {
        this.f15723z = z;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public C4345a m20859N(d dVar) {
        this.f15710m = dVar;
        return this;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo20860a() {
        WeakReference<View> weakReference = this.f15697M;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        C4348d.m20896l().m20907s(this, this.f15697M.get(), this.f15696L);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C4345a m20861b(long j) {
        if (j <= 0) {
            return this;
        }
        this.f15707j = j;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m20862c(String str, View view) {
        this.f15696L = str;
        this.f15697M = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: d */
    public C4345a m20863d(b bVar) {
        this.f15708k = bVar;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C4345a m20864e(boolean z) {
        this.f15711n = z;
        return this;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
        if (z) {
            return;
        }
        C4348d.m20896l().m20900k(this.f15696L);
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: g */
    public void mo20866g(uc80 uc80Var) {
        C4348d.m20896l().m20900k(uc80Var.m192997f());
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo20867h(uc80 uc80Var) {
        if (!(uc80Var.m192998g() instanceof C4345a) || uc80Var.m193000i() == null) {
            return false;
        }
        C4348d.m20896l().m20907s((C4345a) uc80Var.m192998g(), uc80Var.m193000i().get(), uc80Var.m192997f());
        return true;
    }

    @Override // p149l.g0m
    /* JADX INFO: renamed from: i */
    public void mo20868i(f0m f0mVar) {
        this.f15695K = f0mVar;
    }

    /* JADX INFO: renamed from: j */
    public C4345a m20869j(c cVar) {
        this.f15709l = cVar;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C4345a m20870k(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f15698a = iArr;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C4345a m20871l(int i) {
        this.f15704g = i;
        return this;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        C4348d.m20896l().m20900k(this.f15696L);
    }

    /* JADX INFO: renamed from: o */
    public C4345a m20873o(int i, int i2) {
        if ((i != f15681O && i != f15682P) || i2 <= 0) {
            return this;
        }
        this.f15699b = i | this.f15699b;
        this.f15719v = i2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C4345a m20874p(int i) {
        this.f15705h = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C4345a m20875q(int i) {
        this.f15699b = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C4345a m20876r(String str) {
        this.f15714q = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C4345a m20877s(View view) {
        this.f15720w = view;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C4345a m20878t(boolean z) {
        this.f15721x = z;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public C4345a m20879u(int i) {
        this.f15700c = i;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C4345a m20880v(int i) {
        this.f15692H = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C4345a m20881w(int i) {
        this.f15693I = i;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C4345a m20882x(int i) {
        this.f15701d = i;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public C4345a m20883y(boolean z) {
        this.f15685A = z;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C4345a m20884z(int i) {
        this.f15706i = i;
        return this;
    }
}
