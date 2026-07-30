package com.p051p1.mobile.android.p053ui.bubble;

import android.content.Context;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import com.p051p1.mobile.android.app.App;
import java.lang.ref.WeakReference;
import p153l.al80;
import p153l.d3m;
import p153l.f3m;
import p153l.qa00;
import p153l.z2m;
import p153l.z8c0;

/* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4496a implements f3m, d3m {

    /* JADX INFO: renamed from: N */
    public static int f16399N = 1;

    /* JADX INFO: renamed from: O */
    public static int f16400O = 16;

    /* JADX INFO: renamed from: P */
    public static int f16401P = 256;

    /* JADX INFO: renamed from: Q */
    public static int f16402Q = 4096;

    /* JADX INFO: renamed from: R */
    public static int f16403R = 1048576;

    /* JADX INFO: renamed from: A */
    public boolean f16404A;

    /* JADX INFO: renamed from: B */
    @ColorInt
    public int f16405B;

    /* JADX INFO: renamed from: C */
    public int f16406C;

    /* JADX INFO: renamed from: E */
    public boolean f16408E;

    /* JADX INFO: renamed from: F */
    public Integer f16409F;

    /* JADX INFO: renamed from: G */
    public a f16410G;

    /* JADX INFO: renamed from: H */
    public int f16411H;

    /* JADX INFO: renamed from: I */
    public int f16412I;

    /* JADX INFO: renamed from: J */
    public boolean f16413J;

    /* JADX INFO: renamed from: K */
    public z2m f16414K;

    /* JADX INFO: renamed from: M */
    public WeakReference<View> f16416M;

    /* JADX INFO: renamed from: a */
    public int[] f16417a;

    /* JADX INFO: renamed from: c */
    public int f16419c;

    /* JADX INFO: renamed from: d */
    public int f16420d;

    /* JADX INFO: renamed from: k */
    public b f16427k;

    /* JADX INFO: renamed from: l */
    public c f16428l;

    /* JADX INFO: renamed from: m */
    public d f16429m;

    /* JADX INFO: renamed from: q */
    public String f16433q;

    /* JADX INFO: renamed from: r */
    public CharSequence f16434r;

    /* JADX INFO: renamed from: t */
    public int f16436t;

    /* JADX INFO: renamed from: u */
    public Integer f16437u;

    /* JADX INFO: renamed from: w */
    public View f16439w;

    /* JADX INFO: renamed from: y */
    public View f16441y;

    /* JADX INFO: renamed from: z */
    public boolean f16442z;

    /* JADX INFO: renamed from: v */
    public int f16438v = -1;

    /* JADX INFO: renamed from: D */
    public boolean f16407D = false;

    /* JADX INFO: renamed from: L */
    public String f16415L = null;

    /* JADX INFO: renamed from: b */
    public int f16418b = f16399N | f16403R;

    /* JADX INFO: renamed from: g */
    public int f16423g = qa00.m175859d(7.0f);

    /* JADX INFO: renamed from: i */
    public int f16425i = qa00.f156322i;

    /* JADX INFO: renamed from: e */
    public int f16421e = 0;

    /* JADX INFO: renamed from: f */
    public int f16422f = 0;

    /* JADX INFO: renamed from: h */
    public int f16424h = 75;

    /* JADX INFO: renamed from: j */
    public long f16426j = -1;

    /* JADX INFO: renamed from: n */
    public boolean f16430n = false;

    /* JADX INFO: renamed from: s */
    public float f16435s = 16.0f;

    /* JADX INFO: renamed from: o */
    public boolean f16431o = false;

    /* JADX INFO: renamed from: p */
    @ColorInt
    public int f16432p = -1;

    /* JADX INFO: renamed from: x */
    public boolean f16440x = true;

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f16443a;

        /* JADX INFO: renamed from: b */
        public int f16444b;

        /* JADX INFO: renamed from: c */
        public int f16445c;

        /* JADX INFO: renamed from: d */
        public int f16446d;

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo21884a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo21885a(String str);
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.ui.bubble.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo21886a(View view);
    }

    public C4496a(Context context) {
        this.f16417a = new int[]{context.getResources().getColor(z8c0.f203359t)};
        this.f16405B = context.getResources().getColor(z8c0.f203350k);
    }

    /* JADX INFO: renamed from: A */
    public C4496a m21845A(View view) {
        this.f16441y = view;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C4496a m21846B(int i) {
        this.f16421e = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public C4496a m21847C(int i) {
        this.f16406C = i;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public C4496a m21848D(CharSequence charSequence) {
        this.f16434r = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public C4496a m21849E(boolean z) {
        this.f16431o = z;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public C4496a m21850F(boolean z) {
        this.f16413J = z;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public C4496a m21851G(@ColorRes int i) {
        this.f16432p = App.f16088e.getResources().getColor(i);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public C4496a m21852H(int i, int i2, int i3, int i4) {
        a aVar = new a();
        this.f16410G = aVar;
        aVar.f16443a = i;
        aVar.f16444b = i2;
        aVar.f16445c = i3;
        aVar.f16446d = i4;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public C4496a m21853I(int i) {
        this.f16436t = i;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public C4496a m21854J(float f) {
        this.f16435s = f;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public C4496a m21855K(int i) {
        this.f16409F = Integer.valueOf(i);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public C4496a m21856L(@ColorRes int i) {
        this.f16405B = App.f16088e.getResources().getColor(i);
        return this;
    }

    /* JADX INFO: renamed from: M */
    public C4496a m21857M(boolean z) {
        this.f16442z = z;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public C4496a m21858N(d dVar) {
        this.f16429m = dVar;
        return this;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: a */
    public boolean mo21859a() {
        WeakReference<View> weakReference = this.f16416M;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        C4499d.m21895l().m21906s(this, this.f16416M.get(), this.f16415L);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C4496a m21860b(long j) {
        if (j <= 0) {
            return this;
        }
        this.f16426j = j;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m21861c(String str, View view) {
        this.f16415L = str;
        this.f16416M = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: d */
    public C4496a m21862d(b bVar) {
        this.f16427k = bVar;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C4496a m21863e(boolean z) {
        this.f16430n = z;
        return this;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
        if (z) {
            return;
        }
        C4499d.m21895l().m21899k(this.f16415L);
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: g */
    public void mo21865g(al80 al80Var) {
        C4499d.m21895l().m21899k(al80Var.m98643f());
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: h */
    public boolean mo21866h(al80 al80Var) {
        if (!(al80Var.m98644g() instanceof C4496a) || al80Var.m98646i() == null) {
            return false;
        }
        C4499d.m21895l().m21906s((C4496a) al80Var.m98644g(), al80Var.m98646i().get(), al80Var.m98643f());
        return true;
    }

    @Override // p153l.a3m
    /* JADX INFO: renamed from: i */
    public void mo21867i(z2m z2mVar) {
        this.f16414K = z2mVar;
    }

    /* JADX INFO: renamed from: j */
    public C4496a m21868j(c cVar) {
        this.f16428l = cVar;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C4496a m21869k(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f16417a = iArr;
        }
        return this;
    }

    /* JADX INFO: renamed from: l */
    public C4496a m21870l(int i) {
        this.f16423g = i;
        return this;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        C4499d.m21895l().m21899k(this.f16415L);
    }

    /* JADX INFO: renamed from: o */
    public C4496a m21872o(int i, int i2) {
        if ((i != f16400O && i != f16401P) || i2 <= 0) {
            return this;
        }
        this.f16418b = i | this.f16418b;
        this.f16438v = i2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C4496a m21873p(int i) {
        this.f16424h = i;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C4496a m21874q(int i) {
        this.f16418b = i;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C4496a m21875r(String str) {
        this.f16433q = str;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C4496a m21876s(View view) {
        this.f16439w = view;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C4496a m21877t(boolean z) {
        this.f16440x = z;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public C4496a m21878u(int i) {
        this.f16419c = i;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C4496a m21879v(int i) {
        this.f16411H = i;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C4496a m21880w(int i) {
        this.f16412I = i;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C4496a m21881x(int i) {
        this.f16420d = i;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public C4496a m21882y(boolean z) {
        this.f16404A = z;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C4496a m21883z(int i) {
        this.f16425i = i;
        return this;
    }
}
