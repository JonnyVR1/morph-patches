package com.p051p1.mobile.putong.core.p058ui.purchase;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p153l.t6c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d */
/* JADX INFO: loaded from: classes4.dex */
public class C8928d {

    /* JADX INFO: renamed from: c */
    public a f35369c;

    /* JADX INFO: renamed from: d */
    public a f35370d;

    /* JADX INFO: renamed from: e */
    public boolean f35371e;

    /* JADX INFO: renamed from: f */
    public boolean f35372f;

    /* JADX INFO: renamed from: a */
    public boolean f35367a = false;

    /* JADX INFO: renamed from: b */
    public boolean f35368b = false;

    /* JADX INFO: renamed from: g */
    public boolean f35373g = true;

    /* JADX INFO: renamed from: h */
    public boolean f35374h = false;

    /* JADX INFO: renamed from: i */
    public String f35375i = "";

    /* JADX INFO: renamed from: j */
    public String f35376j = "unknown";

    /* JADX INFO: renamed from: k */
    public boolean f35377k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public int f35378A;

        /* JADX INFO: renamed from: B */
        public String f35379B;

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Merchandise f35384a;

        /* JADX INFO: renamed from: b */
        public double f35385b;

        /* JADX INFO: renamed from: c */
        public double f35386c;

        /* JADX INFO: renamed from: d */
        public String f35387d;

        /* JADX INFO: renamed from: e */
        public String f35388e;

        /* JADX INFO: renamed from: f */
        public String f35389f;

        /* JADX INFO: renamed from: g */
        public String f35390g;

        /* JADX INFO: renamed from: h */
        public String f35391h;

        /* JADX INFO: renamed from: i */
        public String f35392i;

        /* JADX INFO: renamed from: j */
        public double f35393j;

        /* JADX INFO: renamed from: k */
        public boolean f35394k;

        /* JADX INFO: renamed from: l */
        public boolean f35395l;

        /* JADX INFO: renamed from: m */
        public boolean f35396m;

        /* JADX INFO: renamed from: n */
        public boolean f35397n;

        /* JADX INFO: renamed from: w */
        public ProductCategory f35406w;

        /* JADX INFO: renamed from: x */
        public t6c f35407x;

        /* JADX INFO: renamed from: y */
        public SummarizedPrivilegePrice f35408y;

        /* JADX INFO: renamed from: o */
        public String f35398o = "";

        /* JADX INFO: renamed from: p */
        public int f35399p = 0;

        /* JADX INFO: renamed from: q */
        public String f35400q = "";

        /* JADX INFO: renamed from: r */
        public String f35401r = "";

        /* JADX INFO: renamed from: s */
        public String f35402s = "";

        /* JADX INFO: renamed from: t */
        public String f35403t = "";

        /* JADX INFO: renamed from: u */
        public String f35404u = "";

        /* JADX INFO: renamed from: v */
        public String f35405v = "";

        /* JADX INFO: renamed from: z */
        public boolean f35409z = false;

        /* JADX INFO: renamed from: C */
        public boolean f35380C = false;

        /* JADX INFO: renamed from: D */
        public String f35381D = "";

        /* JADX INFO: renamed from: E */
        public String f35382E = "";

        /* JADX INFO: renamed from: F */
        public String f35383F = "";

        public a(@NonNull Merchandise merchandise) {
            this.f35384a = merchandise;
        }

        /* JADX INFO: renamed from: A */
        public String m54728A() {
            return this.f35382E;
        }

        /* JADX INFO: renamed from: B */
        public String m54729B() {
            return this.f35381D;
        }

        /* JADX INFO: renamed from: C */
        public boolean m54730C() {
            return this.f35384a.autoRenewable();
        }

        /* JADX INFO: renamed from: D */
        public boolean m54731D() {
            return this.f35380C;
        }

        /* JADX INFO: renamed from: E */
        public boolean m54732E() {
            return this.f35397n;
        }

        /* JADX INFO: renamed from: F */
        public boolean m54733F() {
            return this.f35395l;
        }

        /* JADX INFO: renamed from: G */
        public boolean m54734G() {
            return this.f35396m;
        }

        /* JADX INFO: renamed from: H */
        public boolean m54735H() {
            return this.f35409z;
        }

        /* JADX INFO: renamed from: I */
        public boolean m54736I() {
            return this.f35394k;
        }

        /* JADX INFO: renamed from: J */
        public void m54737J(String str) {
            this.f35383F = str;
        }

        /* JADX INFO: renamed from: K */
        public void m54738K(double d) {
            this.f35386c = d;
        }

        /* JADX INFO: renamed from: L */
        public void m54739L(boolean z) {
            this.f35380C = z;
        }

        /* JADX INFO: renamed from: M */
        public void m54740M(String str) {
            this.f35403t = str;
        }

        /* JADX INFO: renamed from: N */
        public void m54741N(ProductCategory productCategory) {
            this.f35406w = productCategory;
        }

        /* JADX INFO: renamed from: O */
        public void m54742O(String str) {
            this.f35402s = str;
        }

        /* JADX INFO: renamed from: P */
        public void m54743P(boolean z) {
            this.f35397n = z;
        }

        /* JADX INFO: renamed from: Q */
        public void m54744Q(boolean z) {
            this.f35395l = z;
        }

        /* JADX INFO: renamed from: R */
        public void m54745R(String str) {
            this.f35387d = str;
        }

        /* JADX INFO: renamed from: S */
        public void m54746S(boolean z) {
            this.f35396m = z;
        }

        /* JADX INFO: renamed from: T */
        public void m54747T(t6c t6cVar) {
            this.f35407x = t6cVar;
        }

        /* JADX INFO: renamed from: U */
        public void m54748U(String str) {
            this.f35390g = str;
        }

        /* JADX INFO: renamed from: V */
        public void m54749V(String str) {
            this.f35391h = str;
        }

        /* JADX INFO: renamed from: W */
        public void m54750W(String str) {
            this.f35388e = str;
        }

        /* JADX INFO: renamed from: X */
        public void m54751X(String str) {
            this.f35389f = str;
        }

        /* JADX INFO: renamed from: Y */
        public void m54752Y(String str) {
            this.f35379B = str;
        }

        /* JADX INFO: renamed from: Z */
        public void m54753Z(String str) {
            this.f35405v = str;
        }

        /* JADX INFO: renamed from: a0 */
        public void m54754a0(int i) {
            this.f35378A = i;
        }

        /* JADX INFO: renamed from: b0 */
        public void m54755b0(String str) {
            this.f35404u = str;
        }

        /* JADX INFO: renamed from: c */
        public String m54756c() {
            return this.f35383F;
        }

        /* JADX INFO: renamed from: c0 */
        public void m54757c0(boolean z) {
            this.f35409z = z;
        }

        /* JADX INFO: renamed from: d */
        public double m54758d() {
            return this.f35386c;
        }

        /* JADX INFO: renamed from: d0 */
        public void m54759d0(boolean z) {
            this.f35394k = z;
        }

        /* JADX INFO: renamed from: e */
        public String m54760e() {
            return this.f35403t;
        }

        /* JADX INFO: renamed from: e0 */
        public void m54761e0(String str) {
            this.f35398o = str;
        }

        /* JADX INFO: renamed from: f */
        public ProductCategory m54762f() {
            return this.f35406w;
        }

        /* JADX INFO: renamed from: f0 */
        public void m54763f0(double d) {
            this.f35385b = d;
        }

        /* JADX INFO: renamed from: g */
        public String m54764g() {
            return this.f35402s;
        }

        /* JADX INFO: renamed from: g0 */
        public void m54765g0(String str) {
            this.f35392i = str;
        }

        /* JADX INFO: renamed from: h */
        public String m54766h() {
            return this.f35387d;
        }

        /* JADX INFO: renamed from: h0 */
        public void m54767h0(double d) {
            this.f35393j = d;
        }

        /* JADX INFO: renamed from: i */
        public t6c m54768i() {
            return this.f35407x;
        }

        /* JADX INFO: renamed from: i0 */
        public void m54769i0(int i) {
            this.f35399p = i;
        }

        /* JADX INFO: renamed from: j */
        public String m54770j() {
            return this.f35390g;
        }

        /* JADX INFO: renamed from: j0 */
        public void m54771j0(String str) {
            this.f35400q = str;
        }

        /* JADX INFO: renamed from: k */
        public String m54772k() {
            return this.f35391h;
        }

        /* JADX INFO: renamed from: k0 */
        public void m54773k0(SummarizedPrivilegePrice summarizedPrivilegePrice) {
            this.f35408y = summarizedPrivilegePrice;
        }

        /* JADX INFO: renamed from: l */
        public String m54774l() {
            return this.f35388e;
        }

        /* JADX INFO: renamed from: l0 */
        public void m54775l0(String str) {
            this.f35401r = str;
        }

        /* JADX INFO: renamed from: m */
        public String m54776m() {
            return this.f35389f;
        }

        /* JADX INFO: renamed from: m0 */
        public void m54777m0(String str) {
            this.f35382E = str;
        }

        /* JADX INFO: renamed from: n */
        public String m54778n() {
            return this.f35379B;
        }

        /* JADX INFO: renamed from: n0 */
        public void m54779n0(String str) {
            this.f35381D = str;
        }

        /* JADX INFO: renamed from: o */
        public String m54780o() {
            return this.f35405v;
        }

        /* JADX INFO: renamed from: p */
        public int m54781p() {
            return this.f35378A;
        }

        /* JADX INFO: renamed from: q */
        public String m54782q() {
            return this.f35404u;
        }

        /* JADX INFO: renamed from: r */
        public String m54783r() {
            return this.f35398o;
        }

        /* JADX INFO: renamed from: s */
        public Merchandise m54784s() {
            return this.f35384a;
        }

        /* JADX INFO: renamed from: t */
        public double m54785t() {
            return this.f35385b;
        }

        /* JADX INFO: renamed from: u */
        public String m54786u() {
            return this.f35392i;
        }

        /* JADX INFO: renamed from: v */
        public double m54787v() {
            return this.f35393j;
        }

        /* JADX INFO: renamed from: w */
        public int m54788w() {
            return this.f35399p;
        }

        /* JADX INFO: renamed from: x */
        public String m54789x() {
            return this.f35400q;
        }

        /* JADX INFO: renamed from: y */
        public SummarizedPrivilegePrice m54790y() {
            return this.f35408y;
        }

        /* JADX INFO: renamed from: z */
        public String m54791z() {
            return this.f35401r;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d$b */
    public static class b {

        /* JADX INFO: renamed from: r */
        public static b f35410r;

        /* JADX INFO: renamed from: a */
        public Merchandise f35411a;

        /* JADX INFO: renamed from: j */
        public ProductCategory f35420j;

        /* JADX INFO: renamed from: k */
        public t6c f35421k;

        /* JADX INFO: renamed from: l */
        public SummarizedPrivilegePrice f35422l;

        /* JADX INFO: renamed from: m */
        public double f35423m;

        /* JADX INFO: renamed from: n */
        public String f35424n;

        /* JADX INFO: renamed from: o */
        public String f35425o;

        /* JADX INFO: renamed from: q */
        public int f35427q;

        /* JADX INFO: renamed from: b */
        public String f35412b = "";

        /* JADX INFO: renamed from: c */
        public int f35413c = 0;

        /* JADX INFO: renamed from: d */
        public String f35414d = "";

        /* JADX INFO: renamed from: e */
        public String f35415e = "";

        /* JADX INFO: renamed from: f */
        public String f35416f = "";

        /* JADX INFO: renamed from: g */
        public String f35417g = "";

        /* JADX INFO: renamed from: h */
        public String f35418h = "";

        /* JADX INFO: renamed from: i */
        public String f35419i = "";

        /* JADX INFO: renamed from: p */
        public boolean f35426p = false;

        /* JADX INFO: renamed from: b */
        public static b m54792b() {
            if (f35410r == null) {
                synchronized (b.class) {
                    try {
                        if (f35410r == null) {
                            f35410r = new b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            f35410r.m54794c();
            return f35410r;
        }

        /* JADX INFO: renamed from: a */
        public a m54793a() {
            a aVar = new a(this.f35411a);
            aVar.m54761e0(this.f35412b);
            aVar.m54769i0(this.f35413c);
            aVar.m54771j0(this.f35414d);
            aVar.m54775l0(this.f35415e);
            aVar.m54742O(this.f35416f);
            aVar.m54740M(this.f35417g);
            aVar.m54755b0(this.f35418h);
            aVar.m54753Z(this.f35419i);
            aVar.m54741N(this.f35420j);
            aVar.m54747T(this.f35421k);
            aVar.m54773k0(this.f35422l);
            aVar.m54757c0(this.f35426p);
            aVar.m54754a0(this.f35427q);
            aVar.m54763f0(this.f35423m);
            aVar.m54745R(this.f35424n);
            aVar.m54749V(this.f35425o);
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public final void m54794c() {
            this.f35411a = null;
            this.f35412b = "";
            this.f35413c = 0;
            this.f35414d = "";
            this.f35415e = "";
            this.f35416f = "";
            this.f35417g = "";
            this.f35418h = "";
            this.f35419i = "";
            this.f35420j = null;
            this.f35421k = null;
            this.f35422l = null;
            this.f35426p = false;
            this.f35427q = 0;
            this.f35423m = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.f35424n = "";
        }

        /* JADX INFO: renamed from: d */
        public b m54795d(String str) {
            this.f35417g = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m54796e(String str) {
            this.f35416f = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m54797f(String str) {
            this.f35424n = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m54798g(t6c t6cVar) {
            this.f35421k = t6cVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m54799h(String str) {
            this.f35425o = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m54800i(String str) {
            this.f35419i = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m54801j(int i) {
            this.f35427q = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m54802k(String str) {
            this.f35418h = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public b m54803l(String str) {
            this.f35412b = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public b m54804m(Merchandise merchandise) {
            this.f35411a = merchandise;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public b m54805n(double d) {
            this.f35423m = d;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public b m54806o(ProductCategory productCategory) {
            this.f35420j = productCategory;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public b m54807p(int i) {
            this.f35413c = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public b m54808q(String str) {
            this.f35414d = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public b m54809r(String str) {
            this.f35415e = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C8928d m54702a(a aVar, a aVar2, boolean z) {
        C8928d c8928d = new C8928d();
        c8928d.m54722u(aVar);
        c8928d.m54716o(aVar2);
        c8928d.m54724w(z);
        c8928d.m54717p("initAutoRenew:" + z);
        c8928d.m54706e();
        return c8928d;
    }

    /* JADX INFO: renamed from: b */
    public a m54703b() {
        return this.f35370d;
    }

    /* JADX INFO: renamed from: c */
    public Merchandise m54704c() {
        if (m54714m()) {
            return this.f35370d.f35384a;
        }
        if (NullChecker.m82486a(this.f35369c)) {
            return this.f35369c.f35384a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public a m54705d() {
        return this.f35369c;
    }

    /* JADX INFO: renamed from: e */
    public void m54706e() {
        if (NullChecker.m82486a(this.f35369c) && NullChecker.m82486a(this.f35370d)) {
            m54725x("both");
            return;
        }
        if (NullChecker.m82486a(this.f35369c)) {
            m54725x("none");
        } else if (NullChecker.m82486a(this.f35370d)) {
            m54725x("auto");
        } else {
            m54725x("empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m54707f() {
        return this.f35373g;
    }

    /* JADX INFO: renamed from: g */
    public boolean m54708g() {
        return this.f35374h;
    }

    /* JADX INFO: renamed from: h */
    public boolean m54709h() {
        return this.f35372f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m54710i() {
        return this.f35371e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m54711j() {
        return this.f35372f || this.f35371e;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m54712k(a aVar) {
        return aVar.m54788w() == 12 && TEnum.equals(aVar.f35406w, "oDiamond");
    }

    /* JADX INFO: renamed from: l */
    public boolean m54713l() {
        return this.f35368b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m54714m() {
        return this.f35367a && NullChecker.m82486a(this.f35370d);
    }

    /* JADX INFO: renamed from: n */
    public boolean m54715n() {
        return this.f35367a && NullChecker.m82486a(this.f35370d) && !m54712k(this.f35370d);
    }

    /* JADX INFO: renamed from: o */
    public void m54716o(a aVar) {
        this.f35370d = aVar;
    }

    /* JADX INFO: renamed from: p */
    public void m54717p(String str) {
        this.f35376j = str;
    }

    /* JADX INFO: renamed from: q */
    public void m54718q(boolean z) {
        this.f35373g = z;
    }

    /* JADX INFO: renamed from: r */
    public void m54719r(boolean z) {
        this.f35374h = z;
    }

    /* JADX INFO: renamed from: s */
    public void m54720s(boolean z) {
        this.f35372f = z;
    }

    /* JADX INFO: renamed from: t */
    public void m54721t(boolean z) {
        this.f35371e = z;
    }

    /* JADX INFO: renamed from: u */
    public void m54722u(a aVar) {
        this.f35369c = aVar;
    }

    /* JADX INFO: renamed from: v */
    public void m54723v(boolean z) {
        this.f35368b = z;
    }

    /* JADX INFO: renamed from: w */
    public void m54724w(boolean z) {
        this.f35367a = z;
    }

    /* JADX INFO: renamed from: x */
    public void m54725x(String str) {
        this.f35375i = str;
    }
}
