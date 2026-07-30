package com.p000p1.mobile.putong.core.p001ui.purchase;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.SummarizedPrivilegePrice;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.n5c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0190d {

    /* JADX INFO: renamed from: c */
    public a f2343c;

    /* JADX INFO: renamed from: d */
    public a f2344d;

    /* JADX INFO: renamed from: e */
    public boolean f2345e;

    /* JADX INFO: renamed from: f */
    public boolean f2346f;

    /* JADX INFO: renamed from: a */
    public boolean f2341a = false;

    /* JADX INFO: renamed from: b */
    public boolean f2342b = false;

    /* JADX INFO: renamed from: g */
    public boolean f2347g = true;

    /* JADX INFO: renamed from: h */
    public boolean f2348h = false;

    /* JADX INFO: renamed from: i */
    public String f2349i = "";

    /* JADX INFO: renamed from: j */
    public String f2350j = "unknown";

    /* JADX INFO: renamed from: k */
    public boolean f2351k = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public int f2352A;

        /* JADX INFO: renamed from: B */
        public String f2353B;

        /* JADX INFO: renamed from: a */
        @NonNull
        public final Merchandise f2358a;

        /* JADX INFO: renamed from: b */
        public double f2359b;

        /* JADX INFO: renamed from: c */
        public double f2360c;

        /* JADX INFO: renamed from: d */
        public String f2361d;

        /* JADX INFO: renamed from: e */
        public String f2362e;

        /* JADX INFO: renamed from: f */
        public String f2363f;

        /* JADX INFO: renamed from: g */
        public String f2364g;

        /* JADX INFO: renamed from: h */
        public String f2365h;

        /* JADX INFO: renamed from: i */
        public String f2366i;

        /* JADX INFO: renamed from: j */
        public double f2367j;

        /* JADX INFO: renamed from: k */
        public boolean f2368k;

        /* JADX INFO: renamed from: l */
        public boolean f2369l;

        /* JADX INFO: renamed from: m */
        public boolean f2370m;

        /* JADX INFO: renamed from: n */
        public boolean f2371n;

        /* JADX INFO: renamed from: w */
        public ProductCategory f2380w;

        /* JADX INFO: renamed from: x */
        public n5c f2381x;

        /* JADX INFO: renamed from: y */
        public SummarizedPrivilegePrice f2382y;

        /* JADX INFO: renamed from: o */
        public String f2372o = "";

        /* JADX INFO: renamed from: p */
        public int f2373p = 0;

        /* JADX INFO: renamed from: q */
        public String f2374q = "";

        /* JADX INFO: renamed from: r */
        public String f2375r = "";

        /* JADX INFO: renamed from: s */
        public String f2376s = "";

        /* JADX INFO: renamed from: t */
        public String f2377t = "";

        /* JADX INFO: renamed from: u */
        public String f2378u = "";

        /* JADX INFO: renamed from: v */
        public String f2379v = "";

        /* JADX INFO: renamed from: z */
        public boolean f2383z = false;

        /* JADX INFO: renamed from: C */
        public boolean f2354C = false;

        /* JADX INFO: renamed from: D */
        public String f2355D = "";

        /* JADX INFO: renamed from: E */
        public String f2356E = "";

        /* JADX INFO: renamed from: F */
        public String f2357F = "";

        public a(@NonNull Merchandise merchandise) {
            this.f2358a = merchandise;
        }

        /* JADX INFO: renamed from: A */
        public String m4111A() {
            return this.f2356E;
        }

        /* JADX INFO: renamed from: B */
        public String m4112B() {
            return this.f2355D;
        }

        /* JADX INFO: renamed from: C */
        public boolean m4113C() {
            return this.f2358a.autoRenewable();
        }

        /* JADX INFO: renamed from: D */
        public boolean m4114D() {
            return this.f2354C;
        }

        /* JADX INFO: renamed from: E */
        public boolean m4115E() {
            return this.f2371n;
        }

        /* JADX INFO: renamed from: F */
        public boolean m4116F() {
            return this.f2369l;
        }

        /* JADX INFO: renamed from: G */
        public boolean m4117G() {
            return this.f2370m;
        }

        /* JADX INFO: renamed from: H */
        public boolean m4118H() {
            return this.f2383z;
        }

        /* JADX INFO: renamed from: I */
        public boolean m4119I() {
            return this.f2368k;
        }

        /* JADX INFO: renamed from: J */
        public void m4120J(String str) {
            this.f2357F = str;
        }

        /* JADX INFO: renamed from: K */
        public void m4121K(double d) {
            this.f2360c = d;
        }

        /* JADX INFO: renamed from: L */
        public void m4122L(boolean z) {
            this.f2354C = z;
        }

        /* JADX INFO: renamed from: M */
        public void m4123M(String str) {
            this.f2377t = str;
        }

        /* JADX INFO: renamed from: N */
        public void m4124N(ProductCategory productCategory) {
            this.f2380w = productCategory;
        }

        /* JADX INFO: renamed from: O */
        public void m4125O(String str) {
            this.f2376s = str;
        }

        /* JADX INFO: renamed from: P */
        public void m4126P(boolean z) {
            this.f2371n = z;
        }

        /* JADX INFO: renamed from: Q */
        public void m4127Q(boolean z) {
            this.f2369l = z;
        }

        /* JADX INFO: renamed from: R */
        public void m4128R(String str) {
            this.f2361d = str;
        }

        /* JADX INFO: renamed from: S */
        public void m4129S(boolean z) {
            this.f2370m = z;
        }

        /* JADX INFO: renamed from: T */
        public void m4130T(n5c n5cVar) {
            this.f2381x = n5cVar;
        }

        /* JADX INFO: renamed from: U */
        public void m4131U(String str) {
            this.f2364g = str;
        }

        /* JADX INFO: renamed from: V */
        public void m4132V(String str) {
            this.f2365h = str;
        }

        /* JADX INFO: renamed from: W */
        public void m4133W(String str) {
            this.f2362e = str;
        }

        /* JADX INFO: renamed from: X */
        public void m4134X(String str) {
            this.f2363f = str;
        }

        /* JADX INFO: renamed from: Y */
        public void m4135Y(String str) {
            this.f2353B = str;
        }

        /* JADX INFO: renamed from: Z */
        public void m4136Z(String str) {
            this.f2379v = str;
        }

        /* JADX INFO: renamed from: a0 */
        public void m4137a0(int i) {
            this.f2352A = i;
        }

        /* JADX INFO: renamed from: b0 */
        public void m4138b0(String str) {
            this.f2378u = str;
        }

        /* JADX INFO: renamed from: c */
        public String m4139c() {
            return this.f2357F;
        }

        /* JADX INFO: renamed from: c0 */
        public void m4140c0(boolean z) {
            this.f2383z = z;
        }

        /* JADX INFO: renamed from: d */
        public double m4141d() {
            return this.f2360c;
        }

        /* JADX INFO: renamed from: d0 */
        public void m4142d0(boolean z) {
            this.f2368k = z;
        }

        /* JADX INFO: renamed from: e */
        public String m4143e() {
            return this.f2377t;
        }

        /* JADX INFO: renamed from: e0 */
        public void m4144e0(String str) {
            this.f2372o = str;
        }

        /* JADX INFO: renamed from: f */
        public ProductCategory m4145f() {
            return this.f2380w;
        }

        /* JADX INFO: renamed from: f0 */
        public void m4146f0(double d) {
            this.f2359b = d;
        }

        /* JADX INFO: renamed from: g */
        public String m4147g() {
            return this.f2376s;
        }

        /* JADX INFO: renamed from: g0 */
        public void m4148g0(String str) {
            this.f2366i = str;
        }

        /* JADX INFO: renamed from: h */
        public String m4149h() {
            return this.f2361d;
        }

        /* JADX INFO: renamed from: h0 */
        public void m4150h0(double d) {
            this.f2367j = d;
        }

        /* JADX INFO: renamed from: i */
        public n5c m4151i() {
            return this.f2381x;
        }

        /* JADX INFO: renamed from: i0 */
        public void m4152i0(int i) {
            this.f2373p = i;
        }

        /* JADX INFO: renamed from: j */
        public String m4153j() {
            return this.f2364g;
        }

        /* JADX INFO: renamed from: j0 */
        public void m4154j0(String str) {
            this.f2374q = str;
        }

        /* JADX INFO: renamed from: k */
        public String m4155k() {
            return this.f2365h;
        }

        /* JADX INFO: renamed from: k0 */
        public void m4156k0(SummarizedPrivilegePrice summarizedPrivilegePrice) {
            this.f2382y = summarizedPrivilegePrice;
        }

        /* JADX INFO: renamed from: l */
        public String m4157l() {
            return this.f2362e;
        }

        /* JADX INFO: renamed from: l0 */
        public void m4158l0(String str) {
            this.f2375r = str;
        }

        /* JADX INFO: renamed from: m */
        public String m4159m() {
            return this.f2363f;
        }

        /* JADX INFO: renamed from: m0 */
        public void m4160m0(String str) {
            this.f2356E = str;
        }

        /* JADX INFO: renamed from: n */
        public String m4161n() {
            return this.f2353B;
        }

        /* JADX INFO: renamed from: n0 */
        public void m4162n0(String str) {
            this.f2355D = str;
        }

        /* JADX INFO: renamed from: o */
        public String m4163o() {
            return this.f2379v;
        }

        /* JADX INFO: renamed from: p */
        public int m4164p() {
            return this.f2352A;
        }

        /* JADX INFO: renamed from: q */
        public String m4165q() {
            return this.f2378u;
        }

        /* JADX INFO: renamed from: r */
        public String m4166r() {
            return this.f2372o;
        }

        /* JADX INFO: renamed from: s */
        public Merchandise m4167s() {
            return this.f2358a;
        }

        /* JADX INFO: renamed from: t */
        public double m4168t() {
            return this.f2359b;
        }

        /* JADX INFO: renamed from: u */
        public String m4169u() {
            return this.f2366i;
        }

        /* JADX INFO: renamed from: v */
        public double m4170v() {
            return this.f2367j;
        }

        /* JADX INFO: renamed from: w */
        public int m4171w() {
            return this.f2373p;
        }

        /* JADX INFO: renamed from: x */
        public String m4172x() {
            return this.f2374q;
        }

        /* JADX INFO: renamed from: y */
        public SummarizedPrivilegePrice m4173y() {
            return this.f2382y;
        }

        /* JADX INFO: renamed from: z */
        public String m4174z() {
            return this.f2375r;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.d$b */
    public static class b {

        /* JADX INFO: renamed from: r */
        public static b f2384r;

        /* JADX INFO: renamed from: a */
        public Merchandise f2385a;

        /* JADX INFO: renamed from: j */
        public ProductCategory f2394j;

        /* JADX INFO: renamed from: k */
        public n5c f2395k;

        /* JADX INFO: renamed from: l */
        public SummarizedPrivilegePrice f2396l;

        /* JADX INFO: renamed from: m */
        public double f2397m;

        /* JADX INFO: renamed from: n */
        public String f2398n;

        /* JADX INFO: renamed from: o */
        public String f2399o;

        /* JADX INFO: renamed from: q */
        public int f2401q;

        /* JADX INFO: renamed from: b */
        public String f2386b = "";

        /* JADX INFO: renamed from: c */
        public int f2387c = 0;

        /* JADX INFO: renamed from: d */
        public String f2388d = "";

        /* JADX INFO: renamed from: e */
        public String f2389e = "";

        /* JADX INFO: renamed from: f */
        public String f2390f = "";

        /* JADX INFO: renamed from: g */
        public String f2391g = "";

        /* JADX INFO: renamed from: h */
        public String f2392h = "";

        /* JADX INFO: renamed from: i */
        public String f2393i = "";

        /* JADX INFO: renamed from: p */
        public boolean f2400p = false;

        /* JADX INFO: renamed from: b */
        public static b m4175b() {
            if (f2384r == null) {
                synchronized (b.class) {
                    try {
                        if (f2384r == null) {
                            f2384r = new b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            f2384r.m4177c();
            return f2384r;
        }

        /* JADX INFO: renamed from: a */
        public a m4176a() {
            a aVar = new a(this.f2385a);
            aVar.m4144e0(this.f2386b);
            aVar.m4152i0(this.f2387c);
            aVar.m4154j0(this.f2388d);
            aVar.m4158l0(this.f2389e);
            aVar.m4125O(this.f2390f);
            aVar.m4123M(this.f2391g);
            aVar.m4138b0(this.f2392h);
            aVar.m4136Z(this.f2393i);
            aVar.m4124N(this.f2394j);
            aVar.m4130T(this.f2395k);
            aVar.m4156k0(this.f2396l);
            aVar.m4140c0(this.f2400p);
            aVar.m4137a0(this.f2401q);
            aVar.m4146f0(this.f2397m);
            aVar.m4128R(this.f2398n);
            aVar.m4132V(this.f2399o);
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public final void m4177c() {
            this.f2385a = null;
            this.f2386b = "";
            this.f2387c = 0;
            this.f2388d = "";
            this.f2389e = "";
            this.f2390f = "";
            this.f2391g = "";
            this.f2392h = "";
            this.f2393i = "";
            this.f2394j = null;
            this.f2395k = null;
            this.f2396l = null;
            this.f2400p = false;
            this.f2401q = 0;
            this.f2397m = 0.0d;
            this.f2398n = "";
        }

        /* JADX INFO: renamed from: d */
        public b m4178d(String str) {
            this.f2391g = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m4179e(String str) {
            this.f2390f = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public b m4180f(String str) {
            this.f2398n = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m4181g(n5c n5cVar) {
            this.f2395k = n5cVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m4182h(String str) {
            this.f2399o = str;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public b m4183i(String str) {
            this.f2393i = str;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public b m4184j(int i) {
            this.f2401q = i;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public b m4185k(String str) {
            this.f2392h = str;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public b m4186l(String str) {
            this.f2386b = str;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public b m4187m(Merchandise merchandise) {
            this.f2385a = merchandise;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public b m4188n(double d) {
            this.f2397m = d;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public b m4189o(ProductCategory productCategory) {
            this.f2394j = productCategory;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public b m4190p(int i) {
            this.f2387c = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public b m4191q(String str) {
            this.f2388d = str;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public b m4192r(String str) {
            this.f2389e = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0190d m4085a(a aVar, a aVar2, boolean z) {
        C0190d c0190d = new C0190d();
        c0190d.m4105u(aVar);
        c0190d.m4099o(aVar2);
        c0190d.m4107w(z);
        c0190d.m4100p("initAutoRenew:" + z);
        c0190d.m4089e();
        return c0190d;
    }

    /* JADX INFO: renamed from: b */
    public a m4086b() {
        return this.f2344d;
    }

    /* JADX INFO: renamed from: c */
    public Merchandise m4087c() {
        if (m4097m()) {
            return this.f2344d.f2358a;
        }
        if (NullChecker.a(this.f2343c)) {
            return this.f2343c.f2358a;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public a m4088d() {
        return this.f2343c;
    }

    /* JADX INFO: renamed from: e */
    public void m4089e() {
        if (NullChecker.a(this.f2343c) && NullChecker.a(this.f2344d)) {
            m4108x("both");
            return;
        }
        if (NullChecker.a(this.f2343c)) {
            m4108x("none");
        } else if (NullChecker.a(this.f2344d)) {
            m4108x("auto");
        } else {
            m4108x("empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m4090f() {
        return this.f2347g;
    }

    /* JADX INFO: renamed from: g */
    public boolean m4091g() {
        return this.f2348h;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4092h() {
        return this.f2346f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m4093i() {
        return this.f2345e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m4094j() {
        return this.f2346f || this.f2345e;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4095k(a aVar) {
        return aVar.m4171w() == 12 && TEnum.equals(aVar.f2380w, "oDiamond");
    }

    /* JADX INFO: renamed from: l */
    public boolean m4096l() {
        return this.f2342b;
    }

    /* JADX INFO: renamed from: m */
    public boolean m4097m() {
        return this.f2341a && NullChecker.a(this.f2344d);
    }

    /* JADX INFO: renamed from: n */
    public boolean m4098n() {
        return this.f2341a && NullChecker.a(this.f2344d) && !m4095k(this.f2344d);
    }

    /* JADX INFO: renamed from: o */
    public void m4099o(a aVar) {
        this.f2344d = aVar;
    }

    /* JADX INFO: renamed from: p */
    public void m4100p(String str) {
        this.f2350j = str;
    }

    /* JADX INFO: renamed from: q */
    public void m4101q(boolean z) {
        this.f2347g = z;
    }

    /* JADX INFO: renamed from: r */
    public void m4102r(boolean z) {
        this.f2348h = z;
    }

    /* JADX INFO: renamed from: s */
    public void m4103s(boolean z) {
        this.f2346f = z;
    }

    /* JADX INFO: renamed from: t */
    public void m4104t(boolean z) {
        this.f2345e = z;
    }

    /* JADX INFO: renamed from: u */
    public void m4105u(a aVar) {
        this.f2343c = aVar;
    }

    /* JADX INFO: renamed from: v */
    public void m4106v(boolean z) {
        this.f2342b = z;
    }

    /* JADX INFO: renamed from: w */
    public void m4107w(boolean z) {
        this.f2341a = z;
    }

    /* JADX INFO: renamed from: x */
    public void m4108x(String str) {
        this.f2349i = str;
    }
}
