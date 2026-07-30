package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.alifree.AliFreeAutoView;
import com.p1.mobile.putong.core.ui.alifree.AliFreeUtils;
import com.p1.mobile.putong.core.ui.view.VPagerInPurchaseDialog;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.d3c0;
import l.e30;
import l.f30;
import l.g30;
import l.hmb;
import l.hsh0;
import l.ish0;
import l.m6c0;
import l.s4e;
import l.sab0;
import l.vwb;
import l.xdl0;
import l.y7c0;
import p002l.e1b0;
import p002l.u740;
import v.AutoVDraweeView;
import v.VLinear;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0192f {

    /* JADX INFO: renamed from: D */
    public static boolean f2403D = hmb.q1();

    /* JADX INFO: renamed from: E */
    public static boolean f2404E = hmb.p1();

    /* JADX INFO: renamed from: A */
    public e30<PurchaseType> f2405A;

    /* JADX INFO: renamed from: a */
    public FrameLayout f2408a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f2409b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f2410c;

    /* JADX INFO: renamed from: d */
    public AliFreeAutoView f2411d;

    /* JADX INFO: renamed from: e */
    public VLinear f2412e;

    /* JADX INFO: renamed from: f */
    public PurchaseTabViewContainer f2413f;

    /* JADX INFO: renamed from: g */
    public VPagerInPurchaseDialog f2414g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f2415h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f2416i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f2417j;

    /* JADX INFO: renamed from: k */
    public PurchaseTabViewContainer f2418k;

    /* JADX INFO: renamed from: l */
    public VPagerInPurchaseDialog f2419l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f2420m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f2421n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f2422o;

    /* JADX INFO: renamed from: p */
    public final Act f2423p;

    /* JADX INFO: renamed from: r */
    public List<Privilege> f2425r;

    /* JADX INFO: renamed from: s */
    public String f2426s;

    /* JADX INFO: renamed from: t */
    public d30 f2427t;

    /* JADX INFO: renamed from: u */
    public int f2428u;

    /* JADX INFO: renamed from: v */
    public Dialog f2429v;

    /* JADX INFO: renamed from: w */
    public g30<PurchaseType, Act, String> f2430w;

    /* JADX INFO: renamed from: y */
    public e30<PurchaseType> f2432y;

    /* JADX INFO: renamed from: z */
    public e30<PurchaseType> f2433z;

    /* JADX INFO: renamed from: q */
    public final List<PurchaseType> f2424q = new ArrayList();

    /* JADX INFO: renamed from: x */
    public u740 f2431x = new u740();

    /* JADX INFO: renamed from: B */
    public boolean f2406B = true;

    /* JADX INFO: renamed from: C */
    public e30<Integer> f2407C = new e30() { // from class: l.ash0
        public final void call(Object obj) {
            this.f7875a.m4245G((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$a */
    public class a implements ViewPager.j {
        public a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
            C0192f.this.f2418k.m3691f(i, f);
        }

        public void onPageSelected(int i) {
            if (CoreModule.P().a().f()) {
                C0192f.this.f2418k.m3693h((vwb.J(C0192f.this.f2424q) || i >= C0192f.this.f2424q.size()) ? false : sab0.i((PurchaseType) C0192f.this.f2424q.get(i)));
            }
            if (!CoreModule.P().a().Xi() || vwb.J(C0192f.this.f2424q) || i >= C0192f.this.f2424q.size()) {
                return;
            }
            C0192f.this.f2418k.m3694i(sab0.q((PurchaseType) C0192f.this.f2424q.get(i)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$b */
    public class b extends ViewPager.m {
        public b() {
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C0192f.this.m4249K(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$c */
    public class c implements PurchaseTabViewContainer.InterfaceC0181a {
        public c() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.purchase.PurchaseTabViewContainer.InterfaceC0181a
        /* JADX INFO: renamed from: a */
        public void mo3695a(int i) {
            C0192f.this.f2431x.m23316K(i);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.purchase.PurchaseTabViewContainer.InterfaceC0181a
        /* JADX INFO: renamed from: b */
        public void mo3696b(int i) {
            C0192f.this.f2419l.setCurrentItem(i);
            C0192f.this.f2431x.m23308C(i);
            if (CoreModule.P().a().jh()) {
                C0192f c0192f = C0192f.this;
                if (c0192f.f2411d != null) {
                    c0192f.m4247I((PurchaseType) c0192f.f2424q.get(i));
                }
            }
            if (NullChecker.a(C0192f.this.f2408a)) {
                C0192f.this.m4248J(i);
            }
            e1b0.INSTANCE.m12105a((PurchaseType) C0192f.this.f2424q.get(i));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final Act f2437a;

        /* JADX INFO: renamed from: b */
        public List<PurchaseType> f2438b;

        /* JADX INFO: renamed from: c */
        public List<Privilege> f2439c;

        /* JADX INFO: renamed from: d */
        public String f2440d;

        /* JADX INFO: renamed from: e */
        public d30 f2441e;

        /* JADX INFO: renamed from: f */
        public int f2442f = 0;

        /* JADX INFO: renamed from: g */
        public g30<PurchaseType, Act, String> f2443g;

        /* JADX INFO: renamed from: h */
        public e30<PurchaseType> f2444h;

        /* JADX INFO: renamed from: i */
        public e30<PurchaseType> f2445i;

        /* JADX INFO: renamed from: j */
        public e30<PurchaseType> f2446j;

        public d(Act act) {
            this.f2437a = act;
        }

        /* JADX INFO: renamed from: a */
        public d m4267a(List<Privilege> list) {
            this.f2439c = list;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public d m4268b(String str) {
            this.f2440d = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public d m4269c(e30<PurchaseType> e30Var) {
            this.f2444h = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m4270d(d30 d30Var) {
            this.f2441e = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public d m4271e(e30<PurchaseType> e30Var) {
            this.f2445i = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public d m4272f(g30<PurchaseType, Act, String> g30Var) {
            this.f2443g = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public d m4273g(e30<PurchaseType> e30Var) {
            this.f2446j = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public d m4274h(List<PurchaseType> list) {
            this.f2438b = list;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public d m4275i(int i) {
            this.f2442f = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0192f m4276j() {
            C0192f c0192f = new C0192f(this.f2437a);
            c0192f.m4258T(this.f2438b);
            c0192f.m4250L(this.f2439c);
            c0192f.m4254P(this.f2441e);
            c0192f.m4251M(this.f2440d);
            c0192f.m4259U(this.f2442f);
            c0192f.m4256R(this.f2443g);
            c0192f.m4255Q(this.f2445i);
            c0192f.m4253O(this.f2444h);
            c0192f.m4257S(this.f2446j);
            c0192f.m4260V();
            return c0192f;
        }
    }

    public C0192f(Act act) {
        this.f2423p = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m4239A() {
        this.f2431x.m23314I(this.f2424q, this.f2425r, this.f2407C);
        this.f2431x.m23311F(this.f2426s);
        this.f2431x.m23313H(this.f2430w);
        this.f2431x.m23312G(this.f2432y);
        this.f2431x.m23310E(this.f2428u);
        this.f2431x.m23315J(this.f2428u);
        if (NullChecker.a(this.f2408a)) {
            this.f2431x.m23309D(new f30() { // from class: l.fsh0
                public final void call(Object obj, Object obj2) {
                    this.f10624a.m4244F((PurchaseType) obj, (View) obj2);
                }
            });
        }
        this.f2419l.setAdapter(this.f2431x);
        this.f2419l.setOffscreenPageLimit(2);
        this.f2419l.d(new a());
        this.f2419l.d(new b());
        this.f2418k.m3688c(this.f2424q);
        this.f2418k.m3687b(new c());
        this.f2418k.setSelectTabPosition(this.f2428u);
        if (CoreModule.P().a().Xi()) {
            this.f2417j.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjVGUFFFU08yUzdYUFdNVVhITU5HR1paNjJHVVhTVzExIiwidyI6MTA3NywiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODgxMzQ5MTQ1Nzc5OX0.png");
        }
        m4249K(this.f2428u);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m4240B() {
        m4247I(this.f2424q.get(this.f2428u));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m4241C(DialogInterface dialogInterface) {
        CoreModule.P().a().E9();
        this.f2431x.m23321w(this.f2418k.getSelectedTabPosition());
        if (NullChecker.a(this.f2427t) && this.f2406B) {
            this.f2427t.call();
        }
        if (NullChecker.a(this.f2429v)) {
            this.f2429v.dismiss();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ boolean m4242D(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        m4262X();
        if (NullChecker.a(this.f2433z)) {
            this.f2433z.call(this.f2424q.get(this.f2419l.getCurrentItem()));
        }
        dialogInterface.dismiss();
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m4243E(Dialog dialog) {
        this.f2429v.dismiss();
        m4262X();
        if (NullChecker.a(this.f2405A)) {
            this.f2405A.call(this.f2424q.get(this.f2419l.getCurrentItem()));
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m4244F(PurchaseType purchaseType, View view) {
        if (this.f2424q.indexOf(purchaseType) == 0) {
            this.f2409b.addView(view);
        } else {
            this.f2410c.addView(view);
        }
        m4248J(this.f2428u);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m4245G(Integer num) {
        if (NullChecker.a(this.f2429v)) {
            if (num.intValue() == -1) {
                this.f2429v.hide();
                return;
            }
            if (num.intValue() != 0 && num.intValue() != 2 && num.intValue() != 4) {
                if (num.intValue() == 1) {
                    this.f2429v.show();
                }
            } else {
                if (num.intValue() == 2) {
                    this.f2406B = false;
                }
                if (num.intValue() == 4) {
                    m4262X();
                }
                this.f2429v.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4247I(PurchaseType purchaseType) {
        final List listD = AliFreeUtils.d(purchaseType);
        this.f2411d.g();
        this.f2411d.post(new Runnable() { // from class: l.gsh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11607a.m4246H(listD);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m4248J(int i) {
        xdl0.M(this.f2409b, i == 0);
        xdl0.M(this.f2410c, i != 0);
    }

    /* JADX INFO: renamed from: K */
    public final void m4249K(int i) {
        m4252N(i);
    }

    /* JADX INFO: renamed from: L */
    public final void m4250L(List<Privilege> list) {
        this.f2425r = list;
    }

    /* JADX INFO: renamed from: M */
    public final void m4251M(String str) {
        this.f2426s = str;
    }

    /* JADX INFO: renamed from: N */
    public final void m4252N(int i) {
        int i2 = d3c0.P0;
        if (!vwb.J(this.f2424q) && i < this.f2424q.size()) {
            boolean zQ = sab0.q(this.f2424q.get(i));
            AutoVDraweeView autoVDraweeView = this.f2417j;
            if (zQ) {
                i2 = d3c0.O0;
                xdl0.M(autoVDraweeView, true);
            } else {
                xdl0.M(autoVDraweeView, false);
            }
        }
        if (NullChecker.a(this.f2416i)) {
            this.f2416i.setBackgroundResource(i2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m4253O(e30<PurchaseType> e30Var) {
        this.f2432y = e30Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m4254P(d30 d30Var) {
        this.f2427t = d30Var;
    }

    /* JADX INFO: renamed from: Q */
    public final void m4255Q(e30<PurchaseType> e30Var) {
        this.f2433z = e30Var;
    }

    /* JADX INFO: renamed from: R */
    public final void m4256R(g30<PurchaseType, Act, String> g30Var) {
        this.f2430w = g30Var;
    }

    /* JADX INFO: renamed from: S */
    public final void m4257S(e30<PurchaseType> e30Var) {
        this.f2405A = e30Var;
    }

    /* JADX INFO: renamed from: T */
    public final void m4258T(List<PurchaseType> list) {
        this.f2424q.clear();
        this.f2424q.addAll(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m4259U(int i) {
        this.f2428u = i;
    }

    /* JADX INFO: renamed from: V */
    public final void m4260V() {
        m4266z();
        m4239A();
        this.f2429v.show();
        if (CoreModule.P().a().jh() && NullChecker.a(this.f2429v.getWindow())) {
            this.f2429v.getWindow().setBackgroundDrawableResource(d3c0.O9);
            m4265y();
        }
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void m4246H(List<String> list) {
        this.f2411d.setTextList(list);
        this.f2411d.setTextStillTime(1500L);
        this.f2411d.setAnimTime(1000L);
        this.f2411d.f();
    }

    /* JADX INFO: renamed from: X */
    public final void m4262X() {
        if (CoreModule.c.j0.B4() || CoreModule.c.j0.y4()) {
            Intent intentA2 = WebViewAct.a2(this.f2423p, CoreModule.c.j0.C4().titleText, CoreModule.c.j0.C4().promotionUrl, true);
            intentA2.putExtra("hideNavigationBar", true);
            this.f2423p.startActivity(intentA2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m4263w(View view) {
        hsh0.a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public final void m4264x(View view) {
        ish0.a(this, view);
    }

    /* JADX INFO: renamed from: y */
    public final void m4265y() {
        List<String> listD = AliFreeUtils.d(this.f2424q.get(this.f2428u));
        m4246H(listD);
        if (listD.size() == 1) {
            this.f2411d.postDelayed(new Runnable() { // from class: l.esh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9957a.m4240B();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m4266z() {
        int i = m6c0.a1;
        if (CoreModule.P().a().jh()) {
            i = m6c0.b1;
        }
        Dialog dialogZ = this.f2423p.dialog().M(i).L(y7c0.g).v().y0(s4e.b).V(new DialogInterface.OnDismissListener() { // from class: l.bsh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8327a.m4241C(dialogInterface);
            }
        }).i0(new DialogInterface.OnKeyListener() { // from class: l.csh0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return this.f8930a.m4242D(dialogInterface, i2, keyEvent);
            }
        }).K0(new Dialog.i() { // from class: l.dsh0
            /* JADX INFO: renamed from: a */
            public final void m12015a(Dialog dialog) {
                this.f9414a.m4243E(dialog);
            }
        }).z();
        this.f2429v = dialogZ;
        View viewP = dialogZ.P();
        if (CoreModule.P().a().jh()) {
            m4264x(viewP);
            this.f2418k = this.f2413f;
            this.f2419l = this.f2414g;
        } else {
            m4263w(viewP);
            this.f2408a = this.f2420m;
            this.f2409b = this.f2421n;
            this.f2410c = this.f2422o;
        }
    }
}
