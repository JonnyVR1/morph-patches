package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeAutoView;
import com.p046p1.mobile.putong.core.p053ui.alifree.AliFreeUtils;
import com.p046p1.mobile.putong.core.p053ui.view.VPagerInPurchaseDialog;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VLinear;
import p149l.d30;
import p149l.d3c0;
import p149l.e1b0;
import p149l.e30;
import p149l.f30;
import p149l.g30;
import p149l.hmb;
import p149l.hsh0;
import p149l.ish0;
import p149l.m6c0;
import p149l.s4e;
import p149l.sab0;
import p149l.u740;
import p149l.vwb;
import p149l.xdl0;
import p149l.y7c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f */
/* JADX INFO: loaded from: classes4.dex */
public class C8767f {

    /* JADX INFO: renamed from: D */
    public static boolean f34581D = hmb.m131712q1();

    /* JADX INFO: renamed from: E */
    public static boolean f34582E = hmb.m131711p1();

    /* JADX INFO: renamed from: A */
    public e30<PurchaseType> f34583A;

    /* JADX INFO: renamed from: a */
    public FrameLayout f34586a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f34587b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f34588c;

    /* JADX INFO: renamed from: d */
    public AliFreeAutoView f34589d;

    /* JADX INFO: renamed from: e */
    public VLinear f34590e;

    /* JADX INFO: renamed from: f */
    public PurchaseTabViewContainer f34591f;

    /* JADX INFO: renamed from: g */
    public VPagerInPurchaseDialog f34592g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f34593h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f34594i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f34595j;

    /* JADX INFO: renamed from: k */
    public PurchaseTabViewContainer f34596k;

    /* JADX INFO: renamed from: l */
    public VPagerInPurchaseDialog f34597l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f34598m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f34599n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f34600o;

    /* JADX INFO: renamed from: p */
    public final Act f34601p;

    /* JADX INFO: renamed from: r */
    public List<Privilege> f34603r;

    /* JADX INFO: renamed from: s */
    public String f34604s;

    /* JADX INFO: renamed from: t */
    public d30 f34605t;

    /* JADX INFO: renamed from: u */
    public int f34606u;

    /* JADX INFO: renamed from: v */
    public Dialog f34607v;

    /* JADX INFO: renamed from: w */
    public g30<PurchaseType, Act, String> f34608w;

    /* JADX INFO: renamed from: y */
    public e30<PurchaseType> f34610y;

    /* JADX INFO: renamed from: z */
    public e30<PurchaseType> f34611z;

    /* JADX INFO: renamed from: q */
    public final List<PurchaseType> f34602q = new ArrayList();

    /* JADX INFO: renamed from: x */
    public u740 f34609x = new u740();

    /* JADX INFO: renamed from: B */
    public boolean f34584B = true;

    /* JADX INFO: renamed from: C */
    public e30<Integer> f34585C = new e30() { // from class: l.ash0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f71455a.m53679G((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$a */
    public class a implements ViewPager.InterfaceC0716j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            C8767f.this.f34596k.m53125f(i, f);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (CoreModule.m29935P().m94651a().mo158371f()) {
                C8767f.this.f34596k.m53127h((vwb.m200296J(C8767f.this.f34602q) || i >= C8767f.this.f34602q.size()) ? false : sab0.m182891i((PurchaseType) C8767f.this.f34602q.get(i)));
            }
            if (!CoreModule.m29935P().m94651a().mo33442Xi() || vwb.m200296J(C8767f.this.f34602q) || i >= C8767f.this.f34602q.size()) {
                return;
            }
            C8767f.this.f34596k.m53128i(sab0.m182899q((PurchaseType) C8767f.this.f34602q.get(i)));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$b */
    public class b extends ViewPager.C0719m {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C8767f.this.m53683K(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$c */
    public class c implements PurchaseTabViewContainer.InterfaceC8756a {
        public c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer.InterfaceC8756a
        /* JADX INFO: renamed from: a */
        public void mo53129a(int i) {
            C8767f.this.f34609x.m192088K(i);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseTabViewContainer.InterfaceC8756a
        /* JADX INFO: renamed from: b */
        public void mo53130b(int i) {
            C8767f.this.f34597l.setCurrentItem(i);
            C8767f.this.f34609x.m192080C(i);
            if (CoreModule.m29935P().m94651a().mo33525jh()) {
                C8767f c8767f = C8767f.this;
                if (c8767f.f34589d != null) {
                    c8767f.m53681I((PurchaseType) c8767f.f34602q.get(i));
                }
            }
            if (NullChecker.m81303a(C8767f.this.f34586a)) {
                C8767f.this.m53682J(i);
            }
            e1b0.INSTANCE.m114403a((PurchaseType) C8767f.this.f34602q.get(i));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final Act f34615a;

        /* JADX INFO: renamed from: b */
        public List<PurchaseType> f34616b;

        /* JADX INFO: renamed from: c */
        public List<Privilege> f34617c;

        /* JADX INFO: renamed from: d */
        public String f34618d;

        /* JADX INFO: renamed from: e */
        public d30 f34619e;

        /* JADX INFO: renamed from: f */
        public int f34620f = 0;

        /* JADX INFO: renamed from: g */
        public g30<PurchaseType, Act, String> f34621g;

        /* JADX INFO: renamed from: h */
        public e30<PurchaseType> f34622h;

        /* JADX INFO: renamed from: i */
        public e30<PurchaseType> f34623i;

        /* JADX INFO: renamed from: j */
        public e30<PurchaseType> f34624j;

        public d(Act act) {
            this.f34615a = act;
        }

        /* JADX INFO: renamed from: a */
        public d m53701a(List<Privilege> list) {
            this.f34617c = list;
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public d m53702b(String str) {
            this.f34618d = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public d m53703c(e30<PurchaseType> e30Var) {
            this.f34622h = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public d m53704d(d30 d30Var) {
            this.f34619e = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public d m53705e(e30<PurchaseType> e30Var) {
            this.f34623i = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public d m53706f(g30<PurchaseType, Act, String> g30Var) {
            this.f34621g = g30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public d m53707g(e30<PurchaseType> e30Var) {
            this.f34624j = e30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public d m53708h(List<PurchaseType> list) {
            this.f34616b = list;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public d m53709i(int i) {
            this.f34620f = i;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C8767f m53710j() {
            C8767f c8767f = new C8767f(this.f34615a);
            c8767f.m53692T(this.f34616b);
            c8767f.m53684L(this.f34617c);
            c8767f.m53688P(this.f34619e);
            c8767f.m53685M(this.f34618d);
            c8767f.m53693U(this.f34620f);
            c8767f.m53690R(this.f34621g);
            c8767f.m53689Q(this.f34623i);
            c8767f.m53687O(this.f34622h);
            c8767f.m53691S(this.f34624j);
            c8767f.m53694V();
            return c8767f;
        }
    }

    public C8767f(Act act) {
        this.f34601p = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m53673A() {
        this.f34609x.m192086I(this.f34602q, this.f34603r, this.f34585C);
        this.f34609x.m192083F(this.f34604s);
        this.f34609x.m192085H(this.f34608w);
        this.f34609x.m192084G(this.f34610y);
        this.f34609x.m192082E(this.f34606u);
        this.f34609x.m192087J(this.f34606u);
        if (NullChecker.m81303a(this.f34586a)) {
            this.f34609x.m192081D(new f30() { // from class: l.fsh0
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f99078a.m53678F((PurchaseType) obj, (View) obj2);
                }
            });
        }
        this.f34597l.setAdapter(this.f34609x);
        this.f34597l.setOffscreenPageLimit(2);
        this.f34597l.m4185d(new a());
        this.f34597l.m4185d(new b());
        this.f34596k.m53122c(this.f34602q);
        this.f34596k.m53121b(new c());
        this.f34596k.setSelectTabPosition(this.f34606u);
        if (CoreModule.m29935P().m94651a().mo33442Xi()) {
            this.f34595j.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IjVGUFFFU08yUzdYUFdNVVhITU5HR1paNjJHVVhTVzExIiwidyI6MTA3NywiaCI6ODY0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODgxMzQ5MTQ1Nzc5OX0.png");
        }
        m53683K(this.f34606u);
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m53674B() {
        m53681I(this.f34602q.get(this.f34606u));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m53675C(DialogInterface dialogInterface) {
        CoreModule.m29935P().m94651a().mo33308E9();
        this.f34609x.m192090w(this.f34596k.getSelectedTabPosition());
        if (NullChecker.m81303a(this.f34605t) && this.f34584B) {
            this.f34605t.call();
        }
        if (NullChecker.m81303a(this.f34607v)) {
            this.f34607v.dismiss();
        }
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ boolean m53676D(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        m53696X();
        if (NullChecker.m81303a(this.f34611z)) {
            this.f34611z.call(this.f34602q.get(this.f34597l.getCurrentItem()));
        }
        dialogInterface.dismiss();
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m53677E(Dialog dialog) {
        this.f34607v.dismiss();
        m53696X();
        if (NullChecker.m81303a(this.f34583A)) {
            this.f34583A.call(this.f34602q.get(this.f34597l.getCurrentItem()));
        }
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m53678F(PurchaseType purchaseType, View view) {
        if (this.f34602q.indexOf(purchaseType) == 0) {
            this.f34587b.addView(view);
        } else {
            this.f34588c.addView(view);
        }
        m53682J(this.f34606u);
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m53679G(Integer num) {
        if (NullChecker.m81303a(this.f34607v)) {
            if (num.intValue() == -1) {
                this.f34607v.hide();
                return;
            }
            if (num.intValue() != 0 && num.intValue() != 2 && num.intValue() != 4) {
                if (num.intValue() == 1) {
                    this.f34607v.show();
                }
            } else {
                if (num.intValue() == 2) {
                    this.f34584B = false;
                }
                if (num.intValue() == 4) {
                    m53696X();
                }
                this.f34607v.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m53681I(PurchaseType purchaseType) {
        final List<String> listM44318d = AliFreeUtils.m44318d(purchaseType);
        this.f34589d.m44314g();
        this.f34589d.post(new Runnable() { // from class: l.gsh0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104178a.m53680H(listM44318d);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final void m53682J(int i) {
        xdl0.m208344M(this.f34587b, i == 0);
        xdl0.m208344M(this.f34588c, i != 0);
    }

    /* JADX INFO: renamed from: K */
    public final void m53683K(int i) {
        m53686N(i);
    }

    /* JADX INFO: renamed from: L */
    public final void m53684L(List<Privilege> list) {
        this.f34603r = list;
    }

    /* JADX INFO: renamed from: M */
    public final void m53685M(String str) {
        this.f34604s = str;
    }

    /* JADX INFO: renamed from: N */
    public final void m53686N(int i) {
        int i2 = d3c0.f83698P0;
        if (!vwb.m200296J(this.f34602q) && i < this.f34602q.size()) {
            boolean zM182899q = sab0.m182899q(this.f34602q.get(i));
            AutoVDraweeView autoVDraweeView = this.f34595j;
            if (zM182899q) {
                i2 = d3c0.f83684O0;
                xdl0.m208344M(autoVDraweeView, true);
            } else {
                xdl0.m208344M(autoVDraweeView, false);
            }
        }
        if (NullChecker.m81303a(this.f34594i)) {
            this.f34594i.setBackgroundResource(i2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m53687O(e30<PurchaseType> e30Var) {
        this.f34610y = e30Var;
    }

    /* JADX INFO: renamed from: P */
    public final void m53688P(d30 d30Var) {
        this.f34605t = d30Var;
    }

    /* JADX INFO: renamed from: Q */
    public final void m53689Q(e30<PurchaseType> e30Var) {
        this.f34611z = e30Var;
    }

    /* JADX INFO: renamed from: R */
    public final void m53690R(g30<PurchaseType, Act, String> g30Var) {
        this.f34608w = g30Var;
    }

    /* JADX INFO: renamed from: S */
    public final void m53691S(e30<PurchaseType> e30Var) {
        this.f34583A = e30Var;
    }

    /* JADX INFO: renamed from: T */
    public final void m53692T(List<PurchaseType> list) {
        this.f34602q.clear();
        this.f34602q.addAll(list);
    }

    /* JADX INFO: renamed from: U */
    public final void m53693U(int i) {
        this.f34606u = i;
    }

    /* JADX INFO: renamed from: V */
    public final void m53694V() {
        m53700z();
        m53673A();
        this.f34607v.show();
        if (CoreModule.m29935P().m94651a().mo33525jh() && NullChecker.m81303a(this.f34607v.getWindow())) {
            this.f34607v.getWindow().setBackgroundDrawableResource(d3c0.f83693O9);
            m53699y();
        }
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final void m53680H(List<String> list) {
        this.f34589d.setTextList(list);
        this.f34589d.setTextStillTime(1500L);
        this.f34589d.setAnimTime(1000L);
        this.f34589d.m44313f();
    }

    /* JADX INFO: renamed from: X */
    public final void m53696X() {
        if (CoreModule.f17545c.f19654j0.m30574B4() || CoreModule.f17545c.f19654j0.m30643y4()) {
            Intent intentM80165a2 = WebViewAct.m80165a2(this.f34601p, CoreModule.f17545c.f19654j0.m30576C4().titleText, CoreModule.f17545c.f19654j0.m30576C4().promotionUrl, true);
            intentM80165a2.putExtra("hideNavigationBar", true);
            this.f34601p.startActivity(intentM80165a2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m53697w(View view) {
        hsh0.m132782a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public final void m53698x(View view) {
        ish0.m137982a(this, view);
    }

    /* JADX INFO: renamed from: y */
    public final void m53699y() {
        List<String> listM44318d = AliFreeUtils.m44318d(this.f34602q.get(this.f34606u));
        m53680H(listM44318d);
        if (listM44318d.size() == 1) {
            this.f34589d.postDelayed(new Runnable() { // from class: l.esh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93010a.m53674B();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m53700z() {
        int i = m6c0.f131563a1;
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            i = m6c0.f131568b1;
        }
        Dialog dialogM20567z = this.f34601p.dialog().m20517M(i).m20516L(y7c0.f196697g).m20559v().m20566y0(s4e.f162376b).m20526V(new DialogInterface.OnDismissListener() { // from class: l.bsh0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f77087a.m53675C(dialogInterface);
            }
        }).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.csh0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return this.f82355a.m53676D(dialogInterface, i2, keyEvent);
            }
        }).m20515K0(new Dialog.InterfaceC4313i() { // from class: l.dsh0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4313i
            /* JADX INFO: renamed from: a */
            public final void mo20570a(Dialog dialog) {
                this.f87768a.m53677E(dialog);
            }
        }).m20567z();
        this.f34607v = dialogM20567z;
        View viewM20458P = dialogM20567z.m20458P();
        if (CoreModule.m29935P().m94651a().mo33525jh()) {
            m53698x(viewM20458P);
            this.f34596k = this.f34591f;
            this.f34597l = this.f34592g;
        } else {
            m53697w(viewM20458P);
            this.f34586a = this.f34598m;
            this.f34587b = this.f34599n;
            this.f34588c = this.f34600o;
        }
    }
}
