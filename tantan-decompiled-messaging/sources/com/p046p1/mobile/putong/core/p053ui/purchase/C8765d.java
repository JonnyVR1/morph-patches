package com.p046p1.mobile.putong.core.p053ui.purchase;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p149l.n5c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d */
/* JADX INFO: loaded from: classes4.dex */
public class C8765d {

    /* JADX INFO: renamed from: c */
    public a f34521c;

    /* JADX INFO: renamed from: d */
    public a f34522d;

    /* JADX INFO: renamed from: e */
    public boolean f34523e;

    /* JADX INFO: renamed from: f */
    public boolean f34524f;

    /* JADX INFO: renamed from: a */
    public boolean f34519a = false;

    /* JADX INFO: renamed from: b */
    public boolean f34520b = false;

    /* JADX INFO: renamed from: g */
    public boolean f34525g = true;

    /* JADX INFO: renamed from: h */
    public boolean f34526h = false;

    /* JADX INFO: renamed from: i */
    public String f34527i = "";

    /* JADX INFO: renamed from: j */
    public String f34528j = "unknown";

    /* JADX INFO: renamed from: k */
    public boolean f34529k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public int f34530A;

        /* JADX INFO: renamed from: B */
        public String f34531B;

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Merchandise f34536a;

        /* JADX INFO: renamed from: b */
        public double f34537b;

        /* JADX INFO: renamed from: c */
        public double f34538c;

        /* JADX INFO: renamed from: d */
        public String f34539d;

        /* JADX INFO: renamed from: e */
        public String f34540e;

        /* JADX INFO: renamed from: f */
        public String f34541f;

        /* JADX INFO: renamed from: g */
        public String f34542g;

        /* JADX INFO: renamed from: h */
        public String f34543h;

        /* JADX INFO: renamed from: i */
        public String f34544i;

        /* JADX INFO: renamed from: j */
        public double f34545j;

        /* JADX INFO: renamed from: k */
        public boolean f34546k;

        /* JADX INFO: renamed from: l */
        public boolean f34547l;

        /* JADX INFO: renamed from: m */
        public boolean f34548m;

        /* JADX INFO: renamed from: n */
        public boolean f34549n;

        /* JADX INFO: renamed from: w */
        public ProductCategory f34558w;

        /* JADX INFO: renamed from: x */
        public n5c f34559x;

        /* JADX INFO: renamed from: y */
        public SummarizedPrivilegePrice f34560y;

        /* JADX INFO: renamed from: o */
        public String f34550o = "";

        /* JADX INFO: renamed from: p */
        public int f34551p = 0;

        /* JADX INFO: renamed from: q */
        public String f34552q = "";

        /* JADX INFO: renamed from: r */
        public String f34553r = "";

        /* JADX INFO: renamed from: s */
        public String f34554s = "";

        /* JADX INFO: renamed from: t */
        public String f34555t = "";

        /* JADX INFO: renamed from: u */
        public String f34556u = "";

        /* JADX INFO: renamed from: v */
        public String f34557v = "";

        /* JADX INFO: renamed from: z */
        public boolean f34561z = false;

        /* JADX INFO: renamed from: C */
        public boolean f34532C = false;

        /* JADX INFO: renamed from: D */
        public String f34533D = "";

        /* JADX INFO: renamed from: E */
        public String f34534E = "";

        /* JADX INFO: renamed from: F */
        public String f34535F = "";

        public a(@NonNull Merchandise merchandise) {
            this.f34536a = merchandise;
        }

        /* JADX INFO: renamed from: A */
        public String m53545A() {
            return this.f34534E;
        }

        /* JADX INFO: renamed from: B */
        public String m53546B() {
            return this.f34533D;
        }

        /* JADX INFO: renamed from: C */
        public boolean m53547C() {
            return this.f34536a.autoRenewable();
        }

        /* JADX INFO: renamed from: D */
        public boolean m53548D() {
            return this.f34532C;
        }

        /* JADX INFO: renamed from: E */
        public boolean m53549E() {
            return this.f34549n;
        }

        /* JADX INFO: renamed from: F */
        public boolean m53550F() {
            return this.f34547l;
        }

        /* JADX INFO: renamed from: G */
        public boolean m53551G() {
            return this.f34548m;
        }

        /* JADX INFO: renamed from: H */
        public boolean m53552H() {
            return this.f34561z;
        }

        /* JADX INFO: renamed from: I */
        public boolean m53553I() {
            return this.f34546k;
        }

        /* JADX INFO: renamed from: J */
        public void m53554J(String str) {
            this.f34535F = str;
        }

        /* JADX INFO: renamed from: K */
        public void m53555K(double d) {
            this.f34538c = d;
        }

        /* JADX INFO: renamed from: L */
        public void m53556L(boolean z) {
            this.f34532C = z;
        }

        /* JADX INFO: renamed from: M */
        public void m53557M(String str) {
            this.f34555t = str;
        }

        /* JADX INFO: renamed from: N */
        public void m53558N(ProductCategory productCategory) {
            this.f34558w = productCategory;
        }

        /* JADX INFO: renamed from: O */
        public void m53559O(String str) {
            this.f34554s = str;
        }

        /* JADX INFO: renamed from: P */
        public void m53560P(boolean z) {
            this.f34549n = z;
        }

        /* JADX INFO: renamed from: Q */
        public void m53561Q(boolean z) {
            this.f34547l = z;
        }

        /* JADX INFO: renamed from: R */
        public void m53562R(String str) {
            this.f34539d = str;
        }

        /* JADX INFO: renamed from: S */
        public void m53563S(boolean z) {
            this.f34548m = z;
        }

        /* JADX INFO: renamed from: T */
        public void m53564T(n5c n5cVar) {
            this.f34559x = n5cVar;
        }

        /* JADX INFO: renamed from: U */
        public void m53565U(String str) {
            this.f34542g = str;
        }

        /* JADX INFO: renamed from: V */
        public void m53566V(String str) {
            this.f34543h = str;
        }

        /* JADX INFO: renamed from: W */
        public void m53567W(String str) {
            this.f34540e = str;
        }

        /* JADX INFO: renamed from: X */
        public void m53568X(String str) {
            this.f34541f = str;
        }

        /* JADX INFO: renamed from: Y */
        public void m53569Y(String str) {
            this.f34531B = str;
        }

        /* JADX INFO: renamed from: Z */
        public void m53570Z(String str) {
            this.f34557v = str;
        }

        /* JADX INFO: renamed from: a0 */
        public void m53571a0(int i) {
            this.f34530A = i;
        }

        /* JADX INFO: renamed from: b0 */
        public void m53572b0(String str) {
            this.f34556u = str;
        }

        /* JADX INFO: renamed from: c */
        public String m53573c() {
            return this.f34535F;
        }

        /* JADX INFO: renamed from: c0 */
        public void m53574c0(boolean z) {
            this.f34561z = z;
        }

        /* JADX INFO: renamed from: d */
        public double m53575d() {
            return this.f34538c;
        }

        /* JADX INFO: renamed from: d0 */
        public void m53576d0(boolean z) {
            this.f34546k = z;
        }

        /* JADX INFO: renamed from: e */
        public String m53577e() {
            return this.f34555t;
        }

        /* JADX INFO: renamed from: e0 */
        public void m53578e0(String str) {
            this.f34550o = str;
        }

        /* JADX INFO: renamed from: f */
        public ProductCategory m53579f() {
            return this.f34558w;
        }

        /* JADX INFO: renamed from: f0 */
        public void m53580f0(double d) {
            this.f34537b = d;
        }

        /* JADX INFO: renamed from: g */
        public String m53581g() {
            return this.f34554s;
        }

        /* JADX INFO: renamed from: g0 */
        public void m53582g0(String str) {
            this.f34544i = str;
        }

        /* JADX INFO: renamed from: h */
        public String m53583h() {
            return this.f34539d;
        }

        /* JADX INFO: renamed from: h0 */
        public void m53584h0(double d) {
            this.f34545j = d;
        }

        /* JADX INFO: renamed from: i */
        public n5c m53585i() {
            return this.f34559x;
        }

        /* JADX INFO: renamed from: i0 */
        public void m53586i0(int i) {
            this.f34551p = i;
        }

        /* JADX INFO: renamed from: j */
        public String m53587j() {
            return this.f34542g;
        }

        /* JADX INFO: renamed from: j0 */
        public void m53588j0(String str) {
            this.f34552q = str;
        }

        /* JADX INFO: renamed from: k */
        public String m53589k() {
            return this.f34543h;
        }

        /* JADX INFO: renamed from: k0 */
        public void m53590k0(SummarizedPrivilegePrice summarizedPrivilegePrice) {
            this.f34560y = summarizedPrivilegePrice;
        }

        /* JADX INFO: renamed from: l */
        public String m53591l() {
            return this.f34540e;
        }

        /* JADX INFO: renamed from: l0 */
        public void m53592l0(String str) {
            this.f34553r = str;
        }

        /* JADX INFO: renamed from: m */
        public String m53593m() {
            return this.f34541f;
        }

        /* JADX INFO: renamed from: m0 */
        public void m53594m0(String str) {
            this.f34534E = str;
        }

        /* JADX INFO: renamed from: n */
        public String m53595n() {
            return this.f34531B;
        }

        /* JADX INFO: renamed from: n0 */
        public void m53596n0(String str) {
            this.f34533D = str;
        }

        /* JADX INFO: renamed from: o */
        public String m53597o() {
            return this.f34557v;
        }

        /* JADX INFO: renamed from: p */
        public int m53598p() {
            return this.f34530A;
        }

        /* JADX INFO: renamed from: q */
        public String m53599q() {
            return this.f34556u;
        }

        /* JADX INFO: renamed from: r */
        public String m53600r() {
            return this.f34550o;
        }

        /* JADX INFO: renamed from: s */
        public Merchandise m53601s() {
            return this.f34536a;
        }

        /* JADX INFO: renamed from: t */
        public double m53602t() {
            return this.f34537b;
        }

        /* JADX INFO: renamed from: u */
        public String m53603u() {
            return this.f34544i;
        }

        /* JADX INFO: renamed from: v */
        public double m53604v() {
            return this.f34545j;
        }

        /* JADX INFO: renamed from: w */
        public int m53605w() {
            return this.f34551p;
        }

        /* JADX INFO: renamed from: x */
        public String m53606x() {
            return this.f34552q;
        }

        /* JADX INFO: renamed from: y */
        public SummarizedPrivilegePrice m53607y() {
            return this.f34560y;
        }

        /* JADX INFO: renamed from: z */
        public String m53608z() {
            return this.f34553r;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d$b */
    public static class b {

        /* JADX INFO: renamed from: r */
        public static b f34562r;

        /* JADX INFO: renamed from: a */
        public Merchandise f34563a;

        /* JADX INFO: renamed from: j */
        public ProductCategory f34572j;

        /* JADX INFO: renamed from: k */
        public n5c f34573k;

        /* JADX INFO: renamed from: l */
        public SummarizedPrivilegePrice f34574l;

        /* JADX INFO: renamed from: m */
        public double f34575m;

        /* JADX INFO: renamed from: n */
        public String f34576n;

        /* JADX INFO: renamed from: o */
        public String f34577o;

        /* JADX INFO: renamed from: q */
        public int f34579q;

        /* JADX INFO: renamed from: b */
        public String f34564b = "";

        /* JADX INFO: renamed from: c */
        public int f34565c = 0;

        /* JADX INFO: renamed from: d */
        public String f34566d = "";

        /* JADX INFO: renamed from: e */
        public String f34567e = "";

        /* JADX INFO: renamed from: f */
        public String f34568f = "";

        /* JADX INFO: renamed from: g */
        public String f34569g = "";

        /* JADX INFO: renamed from: h */
        public String f34570h = "";

        /* JADX INFO: renamed from: i */
        public String f34571i = "";

        /* JADX INFO: renamed from: p */
        public boolean f34578p = false;

        /* JADX INFO: renamed from: b */
        public static b m53609b() {
            if (f34562r == null) {
                synchronized (b.class) {
                    try {
                        if (f34562r == null) {
                            f34562r = new b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            f34562r.m53611c();
            return f34562r;
        }

        /* JADX INFO: renamed from: a */
        public a m53610a() {
            a aVar = new a(this.f34563a);
            aVar.m53578e0(this.f34564b);
            aVar.m53586i0(this.f34565c);
            aVar.m53588j0(this.f34566d);
            aVar.m53592l0(this.f34567e);
            aVar.m53559O(this.f34568f);
            aVar.m53557M(this.f34569g);
            aVar.m53572b0(this.f34570h);
            aVar.m53570Z(this.f34571i);
            aVar.m53558N(this.f34572j);
            aVar.m53564T(this.f34573k);
            aVar.m53590k0(this.f34574l);
            aVar.m53574c0(this.f34578p);
            aVar.m53571a0(this.f34579q);
            aVar.m53580f0(this.f34575m);
            aVar.m53562R(this.f34576n);
            aVar.m53566V(this.f34577o);
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public final void m53611c() {
            this.f34563a = null;
            this.f34564b = "";
            this.f34565c = 0;
            this.f34566d = "";
            this.f34567e = "";
            this.f34568f = "";
            this.f34569g = "";
            this.f34570h = "";
            this.f34571i = "";
            this.f34572j = null;
            this.f34573k = null;
            this.f34574l = null;
            this.f34578p = false;
            this.f34579q = 0;
            this.f34575m = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.f34576n = "";
        }

        /* JADX INFO: renamed from: d */
        public b m53612d(String str) {
            this.f34569g = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m53613e(String str) {
            this.f34568f = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m53614f(String str) {
            this.f34576n = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m53615g(n5c n5cVar) {
            this.f34573k = n5cVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m53616h(String str) {
            this.f34577o = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m53617i(String str) {
            this.f34571i = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m53618j(int i) {
            this.f34579q = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m53619k(String str) {
            this.f34570h = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public b m53620l(String str) {
            this.f34564b = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public b m53621m(Merchandise merchandise) {
            this.f34563a = merchandise;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public b m53622n(double d) {
            this.f34575m = d;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public b m53623o(ProductCategory productCategory) {
            this.f34572j = productCategory;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public b m53624p(int i) {
            this.f34565c = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public b m53625q(String str) {
            this.f34566d = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public b m53626r(String str) {
            this.f34567e = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C8765d m53519a(a aVar, a aVar2, boolean z) {
        C8765d c8765d = new C8765d();
        c8765d.m53539u(aVar);
        c8765d.m53533o(aVar2);
        c8765d.m53541w(z);
        c8765d.m53534p("initAutoRenew:" + z);
        c8765d.m53523e();
        return c8765d;
    }

    /* JADX INFO: renamed from: b */
    public a m53520b() {
        return this.f34522d;
    }

    /* JADX INFO: renamed from: c */
    public Merchandise m53521c() {
        if (m53531m()) {
            return this.f34522d.f34536a;
        }
        if (NullChecker.m81303a(this.f34521c)) {
            return this.f34521c.f34536a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public a m53522d() {
        return this.f34521c;
    }

    /* JADX INFO: renamed from: e */
    public void m53523e() {
        if (NullChecker.m81303a(this.f34521c) && NullChecker.m81303a(this.f34522d)) {
            m53542x("both");
            return;
        }
        if (NullChecker.m81303a(this.f34521c)) {
            m53542x("none");
        } else if (NullChecker.m81303a(this.f34522d)) {
            m53542x("auto");
        } else {
            m53542x("empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m53524f() {
        return this.f34525g;
    }

    /* JADX INFO: renamed from: g */
    public boolean m53525g() {
        return this.f34526h;
    }

    /* JADX INFO: renamed from: h */
    public boolean m53526h() {
        return this.f34524f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m53527i() {
        return this.f34523e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m53528j() {
        return this.f34524f || this.f34523e;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m53529k(a aVar) {
        return aVar.m53605w() == 12 && TEnum.equals(aVar.f34558w, "oDiamond");
    }

    /* JADX INFO: renamed from: l */
    public boolean m53530l() {
        return this.f34520b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m53531m() {
        return this.f34519a && NullChecker.m81303a(this.f34522d);
    }

    /* JADX INFO: renamed from: n */
    public boolean m53532n() {
        return this.f34519a && NullChecker.m81303a(this.f34522d) && !m53529k(this.f34522d);
    }

    /* JADX INFO: renamed from: o */
    public void m53533o(a aVar) {
        this.f34522d = aVar;
    }

    /* JADX INFO: renamed from: p */
    public void m53534p(String str) {
        this.f34528j = str;
    }

    /* JADX INFO: renamed from: q */
    public void m53535q(boolean z) {
        this.f34525g = z;
    }

    /* JADX INFO: renamed from: r */
    public void m53536r(boolean z) {
        this.f34526h = z;
    }

    /* JADX INFO: renamed from: s */
    public void m53537s(boolean z) {
        this.f34524f = z;
    }

    /* JADX INFO: renamed from: t */
    public void m53538t(boolean z) {
        this.f34523e = z;
    }

    /* JADX INFO: renamed from: u */
    public void m53539u(a aVar) {
        this.f34521c = aVar;
    }

    /* JADX INFO: renamed from: v */
    public void m53540v(boolean z) {
        this.f34520b = z;
    }

    /* JADX INFO: renamed from: w */
    public void m53541w(boolean z) {
        this.f34519a = z;
    }

    /* JADX INFO: renamed from: x */
    public void m53542x(String str) {
        this.f34527i = str;
    }
}
