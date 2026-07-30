package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeAutoView;
import com.p051p1.mobile.putong.core.p058ui.alifree.AliFreeUtils;
import com.p051p1.mobile.putong.core.p058ui.view.VPagerInPurchaseDialog;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VLinear;
import p153l.a30;
import p153l.bnl0;
import p153l.dgc0;
import p153l.g6e;
import p153l.i9b0;
import p153l.ig40;
import p153l.jbc0;
import p153l.jyb;
import p153l.p0i0;
import p153l.q0i0;
import p153l.rec0;
import p153l.vnb;
import p153l.wib0;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f */
/* JADX INFO: loaded from: classes4.dex */
public class C8930f {

    /* JADX INFO: renamed from: D */
    public static boolean f35429D = vnb.m201957q1();

    /* JADX INFO: renamed from: E */
    public static boolean f35430E = vnb.m201956p1();

    /* JADX INFO: renamed from: A */
    public y20<PurchaseType> f35431A;

    /* JADX INFO: renamed from: a */
    public FrameLayout f35434a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f35435b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f35436c;

    /* JADX INFO: renamed from: d */
    public AliFreeAutoView f35437d;

    /* JADX INFO: renamed from: e */
    public VLinear f35438e;

    /* JADX INFO: renamed from: f */
    public PurchaseTabViewContainer f35439f;

    /* JADX INFO: renamed from: g */
    public VPagerInPurchaseDialog f35440g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f35441h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f35442i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f35443j;

    /* JADX INFO: renamed from: k */
    public PurchaseTabViewContainer f35444k;

    /* JADX INFO: renamed from: l */
    public VPagerInPurchaseDialog f35445l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f35446m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f35447n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f35448o;

    /* JADX INFO: renamed from: p */
    public final Act f35449p;

    /* JADX INFO: renamed from: r */
    public List<Privilege> f35451r;

    /* JADX INFO: renamed from: s */
    public String f35452s;

    /* JADX INFO: renamed from: t */
    public x20 f35453t;

    /* JADX INFO: renamed from: u */
    public int f35454u;

    /* JADX INFO: renamed from: v */
    public Dialog f35455v;

    /* JADX INFO: renamed from: w */
    public a30<PurchaseType, Act, String> f35456w;

    /* JADX INFO: renamed from: y */
    public y20<PurchaseType> f35458y;

    /* JADX INFO: renamed from: z */
    public y20<PurchaseType> f35459z;

    /* JADX INFO: renamed from: q */
    public final List<PurchaseType> f35450q = new ArrayList();

    /* JADX INFO: renamed from: x */
    public ig40 f35457x = new ig40();

    /* JADX INFO: renamed from: B */
    public boolean f35432B = true;

    /* JADX INFO: renamed from: C */
    public y20<Integer> f35433C = new y20() { // from class: l.i0i0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f112374a.m54862G((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$a */
    public class a implements ViewPager.InterfaceC0718j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            C8930f.this.f35444k.m54308f(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (CoreModule.m30933P().m143405a().mo180463f()) {
                C8930f.this.f35444k.m54310h((jyb.m147479J(C8930f.this.f35450q) || i >= C8930f.this.f35450q.size()) ? false : wib0.m206565i((PurchaseType) C8930f.this.f35450q.get(i)));
            }
            if (!CoreModule.m30933P().m143405a().mo34445Xi() || jyb.m147479J(C8930f.this.f35450q) || i >= C8930f.this.f35450q.size()) {
                return;
            }
            C8930f.this.f35444k.m54311i(wib0.m206573q((PurchaseType) C8930f.this.f35450q.get(i)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$b */
    public class b extends ViewPager.C0721m {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C8930f.this.m54866K(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$c */
    public class c implements PurchaseTabViewContainer.InterfaceC8919a {
        public c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer.InterfaceC8919a
        /* JADX INFO: renamed from: a */
        public void mo54312a(int i) {
            C8930f.this.f35457x.m139779K(i);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseTabViewContainer.InterfaceC8919a
        /* JADX INFO: renamed from: b */
        public void mo54313b(int i) {
            C8930f.this.f35445l.setCurrentItem(i);
            C8930f.this.f35457x.m139771C(i);
            if (CoreModule.m30933P().m143405a().mo34528jh()) {
                C8930f c8930f = C8930f.this;
                if (c8930f.f35437d != null) {
                    c8930f.m54864I((PurchaseType) c8930f.f35450q.get(i));
                }
            }
            if (NullChecker.m82486a(C8930f.this.f35434a)) {
                C8930f.this.m54865J(i);
            }
            i9b0.INSTANCE.m139092a((PurchaseType) C8930f.this.f35450q.get(i));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final Act f35463a;

        /* JADX INFO: renamed from: b */
        public List<PurchaseType> f35464b;

        /* JADX INFO: renamed from: c */
        public List<Privilege> f35465c;

        /* JADX INFO: renamed from: d */
        public String f35466d;

        /* JADX INFO: renamed from: e */
        public x20 f35467e;

        /* JADX INFO: renamed from: f */
        public int f35468f = 0;

        /* JADX INFO: renamed from: g */
        public a30<PurchaseType, Act, String> f35469g;

        /* JADX INFO: renamed from: h */
        public y20<PurchaseType> f35470h;

        /* JADX INFO: renamed from: i */
        public y20<PurchaseType> f35471i;

        /* JADX INFO: renamed from: j */
        public y20<PurchaseType> f35472j;

        public d(Act act) {
            this.f35463a = act;
        }

        /* JADX INFO: renamed from: a */
        public d m54884a(List<Privilege> list) {
            this.f35465c = list;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public d m54885b(String str) {
            this.f35466d = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public d m54886c(y20<PurchaseType> y20Var) {
            this.f35470h = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m54887d(x20 x20Var) {
            this.f35467e = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public d m54888e(y20<PurchaseType> y20Var) {
            this.f35471i = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public d m54889f(a30<PurchaseType, Act, String> a30Var) {
            this.f35469g = a30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public d m54890g(y20<PurchaseType> y20Var) {
            this.f35472j = y20Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public d m54891h(List<PurchaseType> list) {
            this.f35464b = list;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public d m54892i(int i) {
            this.f35468f = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C8930f m54893j() {
            C8930f c8930f = new C8930f(this.f35463a);
            c8930f.m54875T(this.f35464b);
            c8930f.m54867L(this.f35465c);
            c8930f.m54871P(this.f35467e);
            c8930f.m54868M(this.f35466d);
            c8930f.m54876U(this.f35468f);
            c8930f.m54873R(this.f35469g);
            c8930f.m54872Q(this.f35471i);
            c8930f.m54870O(this.f35470h);
            c8930f.m54874S(this.f35472j);
            c8930f.m54877V();
            return c8930f;
        }
    }

    public C8930f(Act act) {
        this.f35449p = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m54856A() {
        this.f35457x.m139777I(this.f35450q, this.f35451r, this.f35433C);
        this.f35457x.m139774F(this.f35452s);
        this.f35457x.m139776H(this.f35456w);
        this.f35457x.m139775G(this.f35458y);
        this.f35457x.m139773E(this.f35454u);
        this.f35457x.m139778J(this.f35454u);
        if (NullChecker.m82486a(this.f35434a)) {
            this.f35457x.m139772D(new z20() { // from class: l.n0i0
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f139630a.m54861F((PurchaseType) obj, (View) obj2);
                }
            });
        }
        this.f35445l.setAdapter(this.f35457x);
        this.f35445l.setOffscreenPageLimit(2);
        this.f35445l.m4187d(new a());
        this.f35445l.m4187d(new b());
        this.f35444k.m54305c(this.f35450q);
        this.f35444k.m54304b(new c());
        this.f35444k.setSelectTabPosition(this.f35454u);
        if (CoreModule.m30933P().m143405a().mo34445Xi()) {
            this.f35443j.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjVGUFFFU08yUzdYUFdNVVhITU5HR1paNjJHVVhTVzExIiwidyI6MTA3NywiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODgxMzQ5MTQ1Nzc5OX0.png");
        }
        m54866K(this.f35454u);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m54857B() {
        m54864I(this.f35450q.get(this.f35454u));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m54858C(DialogInterface dialogInterface) {
        CoreModule.m30933P().m143405a().mo34311E9();
        this.f35457x.m139781w(this.f35444k.getSelectedTabPosition());
        if (NullChecker.m82486a(this.f35453t) && this.f35432B) {
            this.f35453t.call();
        }
        if (NullChecker.m82486a(this.f35455v)) {
            this.f35455v.dismiss();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ boolean m54859D(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        m54879X();
        if (NullChecker.m82486a(this.f35459z)) {
            this.f35459z.call(this.f35450q.get(this.f35445l.getCurrentItem()));
        }
        dialogInterface.dismiss();
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m54860E(Dialog dialog) {
        this.f35455v.dismiss();
        m54879X();
        if (NullChecker.m82486a(this.f35431A)) {
            this.f35431A.call(this.f35450q.get(this.f35445l.getCurrentItem()));
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m54861F(PurchaseType purchaseType, View view) {
        if (this.f35450q.indexOf(purchaseType) == 0) {
            this.f35435b.addView(view);
        } else {
            this.f35436c.addView(view);
        }
        m54865J(this.f35454u);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m54862G(Integer num) {
        if (NullChecker.m82486a(this.f35455v)) {
            if (num.intValue() == -1) {
                this.f35455v.hide();
                return;
            }
            if (num.intValue() != 0 && num.intValue() != 2 && num.intValue() != 4) {
                if (num.intValue() == 1) {
                    this.f35455v.show();
                }
            } else {
                if (num.intValue() == 2) {
                    this.f35432B = false;
                }
                if (num.intValue() == 4) {
                    m54879X();
                }
                this.f35455v.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m54864I(PurchaseType purchaseType) {
        final List<String> listM45501d = AliFreeUtils.m45501d(purchaseType);
        this.f35437d.m45497g();
        this.f35437d.post(new Runnable() { // from class: l.o0i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144547a.m54863H(listM45501d);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m54865J(int i) {
        bnl0.m105524M(this.f35435b, i == 0);
        bnl0.m105524M(this.f35436c, i != 0);
    }

    /* JADX INFO: renamed from: K */
    public final void m54866K(int i) {
        m54869N(i);
    }

    /* JADX INFO: renamed from: L */
    public final void m54867L(List<Privilege> list) {
        this.f35451r = list;
    }

    /* JADX INFO: renamed from: M */
    public final void m54868M(String str) {
        this.f35452s = str;
    }

    /* JADX INFO: renamed from: N */
    public final void m54869N(int i) {
        int i2 = jbc0.f119353P0;
        if (!jyb.m147479J(this.f35450q) && i < this.f35450q.size()) {
            boolean zM206573q = wib0.m206573q(this.f35450q.get(i));
            AutoVDraweeView autoVDraweeView = this.f35443j;
            if (zM206573q) {
                i2 = jbc0.f119339O0;
                bnl0.m105524M(autoVDraweeView, true);
            } else {
                bnl0.m105524M(autoVDraweeView, false);
            }
        }
        if (NullChecker.m82486a(this.f35442i)) {
            this.f35442i.setBackgroundResource(i2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m54870O(y20<PurchaseType> y20Var) {
        this.f35458y = y20Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m54871P(x20 x20Var) {
        this.f35453t = x20Var;
    }

    /* JADX INFO: renamed from: Q */
    public final void m54872Q(y20<PurchaseType> y20Var) {
        this.f35459z = y20Var;
    }

    /* JADX INFO: renamed from: R */
    public final void m54873R(a30<PurchaseType, Act, String> a30Var) {
        this.f35456w = a30Var;
    }

    /* JADX INFO: renamed from: S */
    public final void m54874S(y20<PurchaseType> y20Var) {
        this.f35431A = y20Var;
    }

    /* JADX INFO: renamed from: T */
    public final void m54875T(List<PurchaseType> list) {
        this.f35450q.clear();
        this.f35450q.addAll(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m54876U(int i) {
        this.f35454u = i;
    }

    /* JADX INFO: renamed from: V */
    public final void m54877V() {
        m54883z();
        m54856A();
        this.f35455v.show();
        if (CoreModule.m30933P().m143405a().mo34528jh() && NullChecker.m82486a(this.f35455v.getWindow())) {
            this.f35455v.getWindow().setBackgroundDrawableResource(jbc0.f119348O9);
            m54882y();
        }
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void m54863H(List<String> list) {
        this.f35437d.setTextList(list);
        this.f35437d.setTextStillTime(1500L);
        this.f35437d.setAnimTime(1000L);
        this.f35437d.m45496f();
    }

    /* JADX INFO: renamed from: X */
    public final void m54879X() {
        if (CoreModule.f18264c.f20396j0.m31577B4() || CoreModule.f18264c.f20396j0.m31646y4()) {
            Intent intentM81348b2 = WebViewAct.m81348b2(this.f35449p, CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true);
            intentM81348b2.putExtra("hideNavigationBar", true);
            this.f35449p.startActivity(intentM81348b2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m54880w(View view) {
        p0i0.m170056a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public final void m54881x(View view) {
        q0i0.m174709a(this, view);
    }

    /* JADX INFO: renamed from: y */
    public final void m54882y() {
        List<String> listM45501d = AliFreeUtils.m45501d(this.f35450q.get(this.f35454u));
        m54863H(listM45501d);
        if (listM45501d.size() == 1) {
            this.f35437d.postDelayed(new Runnable() { // from class: l.m0i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134314a.m54857B();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m54883z() {
        int i = rec0.f162523a1;
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            i = rec0.f162528b1;
        }
        Dialog dialogM21566z = this.f35449p.dialog().m21516M(i).m21515L(dgc0.f88283h).m21558v().m21565y0(g6e.f102428b).m21525V(new DialogInterface.OnDismissListener() { // from class: l.j0i0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f117827a.m54858C(dialogInterface);
            }
        }).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.k0i0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return this.f123400a.m54859D(dialogInterface, i2, keyEvent);
            }
        }).m21514K0(new Dialog.InterfaceC4464i() { // from class: l.l0i0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4464i
            /* JADX INFO: renamed from: a */
            public final void mo21569a(Dialog dialog) {
                this.f129566a.m54860E(dialog);
            }
        }).m21566z();
        this.f35455v = dialogM21566z;
        View viewM21457P = dialogM21566z.m21457P();
        if (CoreModule.m30933P().m143405a().mo34528jh()) {
            m54881x(viewM21457P);
            this.f35444k = this.f35439f;
            this.f35445l = this.f35440g;
        } else {
            m54880w(viewM21457P);
            this.f35434a = this.f35446m;
            this.f35435b = this.f35447n;
            this.f35436c = this.f35448o;
        }
    }
}
