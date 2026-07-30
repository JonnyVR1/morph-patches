package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.account.data.CameraBeautyMode;
import com.p000p1.mobile.putong.account.data.CameraCategory;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountCameraEffectMgr;
import com.p000p1.mobile.putong.account.p002ui.camera.AccountMakeupSharedViewModel;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.e51;
import l.n250;
import l.t100;
import l.tpd0;
import l.xaj0;
import l.xdl0;
import p006l.C1188qs;
import p006l.C1493yr;
import p006l.InterfaceC0898jp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeUpMenuView extends LinearLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: A */
    public int f801A;

    /* JADX INFO: renamed from: B */
    public int f802B;

    /* JADX INFO: renamed from: C */
    public MakeupCategory f803C;

    /* JADX INFO: renamed from: D */
    public AccountMakeupPageAdapter.MakeupItem f804D;

    /* JADX INFO: renamed from: E */
    public int f805E;

    /* JADX INFO: renamed from: F */
    public int f806F;

    /* JADX INFO: renamed from: G */
    public float f807G;

    /* JADX INFO: renamed from: H */
    public float f808H;

    /* JADX INFO: renamed from: I */
    public boolean f809I;

    /* JADX INFO: renamed from: J */
    public e30<Boolean> f810J;

    /* JADX INFO: renamed from: K */
    public ViewPager2.i f811K;

    /* JADX INFO: renamed from: a */
    public View f812a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f813b;

    /* JADX INFO: renamed from: c */
    public TabLayout f814c;

    /* JADX INFO: renamed from: d */
    public ImageView f815d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f816e;

    /* JADX INFO: renamed from: f */
    public boolean f817f;

    /* JADX INFO: renamed from: g */
    public boolean f818g;

    /* JADX INFO: renamed from: h */
    public boolean f819h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0898jp f820i;

    /* JADX INFO: renamed from: j */
    public AccountMakeupPageAdapter f821j;

    /* JADX INFO: renamed from: k */
    public C1188qs f822k;

    /* JADX INFO: renamed from: l */
    public C0096a f823l;

    /* JADX INFO: renamed from: m */
    public d30 f824m;

    /* JADX INFO: renamed from: n */
    public int f825n;

    /* JADX INFO: renamed from: o */
    public AccountMakeupPageAdapter.MakeupItem f826o;

    /* JADX INFO: renamed from: p */
    public float f827p;

    /* JADX INFO: renamed from: q */
    public float f828q;

    /* JADX INFO: renamed from: r */
    public List<MakeupCategory> f829r;

    /* JADX INFO: renamed from: s */
    public List<C1188qs.b> f830s;

    /* JADX INFO: renamed from: t */
    public tpd0 f831t;

    /* JADX INFO: renamed from: u */
    public HashMap<Integer, tpd0> f832u;

    /* JADX INFO: renamed from: v */
    public Map<Integer, Integer> f833v;

    /* JADX INFO: renamed from: w */
    public AccountMakeupSharedViewModel f834w;

    /* JADX INFO: renamed from: x */
    public int f835x;

    /* JADX INFO: renamed from: y */
    public int f836y;

    /* JADX INFO: renamed from: z */
    public int f837z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeUpMenuView$a */
    public class C0086a implements e30<Boolean> {
        public C0086a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (NullChecker.a(AccountMakeUpMenuView.this.f820i)) {
                AccountMakeUpMenuView.this.f820i.mo17708C(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeUpMenuView$b */
    public class C0087b extends ViewPager2.i {
        public C0087b() {
        }

        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
        }

        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
        }

        public void onPageSelected(int i) {
            AccountMakeUpMenuView.this.m946j0(i);
        }
    }

    public AccountMakeUpMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f817f = false;
        this.f818g = false;
        this.f819h = false;
        this.f825n = 0;
        this.f827p = 0.0f;
        this.f828q = 0.0f;
        this.f831t = new tpd0("account_camera_makeup_tab_index", -1);
        this.f832u = new HashMap<>();
        this.f833v = new HashMap();
        this.f835x = 1;
        this.f836y = 0;
        this.f837z = 0;
        this.f801A = 0;
        this.f802B = 0;
        this.f809I = false;
        this.f810J = new C0086a();
        this.f811K = new C0087b();
    }

    /* JADX INFO: renamed from: C */
    private void m894C() {
        xdl0.M(this.f816e, true);
        this.f821j = new AccountMakeupPageAdapter(m951r());
        C1188qs c1188qs = new C1188qs(m951r());
        this.f822k = c1188qs;
        c1188qs.m22332C(this.f810J);
        this.f813b.setUserInputEnabled(false);
        this.f813b.setAdapter(this.f822k);
        this.f813b.setOffscreenPageLimit(5);
        this.f816e.setUserInputEnabled(false);
        this.f816e.setAdapter(this.f821j);
        this.f816e.setOffscreenPageLimit(5);
        this.f814c.setSelectedTabIndicatorHeight(0);
        this.f814c.addOnTabSelectedListener(this);
        C0096a c0096a = new C0096a(this.f814c, this.f816e, true, false, new C0096a.b() { // from class: l.pr
            @Override // com.p000p1.mobile.putong.account.p002ui.camera.view.C0096a.b
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f19267a.m927P(tab, i);
            }
        });
        this.f823l = c0096a;
        c0096a.m1068a();
    }

    /* JADX INFO: renamed from: a0 */
    private void m896a0() {
        m938b0(this.f825n);
    }

    private AccountBeautyMakeupPageView getBeautyMakeupPage() {
        return (AccountBeautyMakeupPageView) this.f816e.findViewWithTag(4);
    }

    private AccountMakeupPageView getCurrentPageView() {
        return (AccountMakeupPageView) this.f816e.findViewWithTag(Integer.valueOf(this.f825n));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: z */
    private void m912z() {
        this.f822k.m22333y(this.f830s);
        this.f821j.m711N(this.f829r);
        AccountCameraEffectMgr.m597V().m623X().m676l().i(m951r(), new n250() { // from class: l.qr
            public final void onChanged(Object obj) {
                this.f19982a.m916E((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m666b().i(m951r(), new n250() { // from class: l.rr
            public final void onChanged(Object obj) {
                this.f20682a.m919H((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m670f().i(m951r(), new n250() { // from class: l.sr
            public final void onChanged(Object obj) {
                this.f21600a.m920I((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m673i().i(m951r(), new n250() { // from class: l.tr
            public final void onChanged(Object obj) {
                this.f22239a.m922K((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m667c().i(m951r(), new n250() { // from class: l.ur
            public final void onChanged(Object obj) {
                this.f23713a.m923L((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m668d().i(m951r(), new n250() { // from class: l.vr
            public final void onChanged(Object obj) {
                this.f24423a.m924M((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m669e().i(m951r(), new n250() { // from class: l.wr
            public final void onChanged(Object obj) {
                this.f25320a.m925N((Pair) obj);
            }
        });
        AccountCameraEffectMgr.m597V().m623X().m665a().i(m951r(), new n250() { // from class: l.xr
            public final void onChanged(Object obj) {
                this.f27684a.m926O((Pair) obj);
            }
        });
        this.f816e.g(this.f811K);
        this.f812a.setOnClickListener(new View.OnClickListener() { // from class: l.lr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16582a.m917F(view);
            }
        });
        this.f815d.setOnClickListener(new View.OnClickListener() { // from class: l.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17190a.m918G(view);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m913A(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        m957x(list, list2);
        m894C();
        m912z();
    }

    /* JADX INFO: renamed from: B */
    public void m914B(InterfaceC0898jp interfaceC0898jp) {
        this.f820i = interfaceC0898jp;
        AccountCameraEffectMgr.m597V().m620T(interfaceC0898jp);
    }

    /* JADX INFO: renamed from: D */
    public void m915D() {
        AccountCameraEffectMgr.m597V().m621U(m951r());
        this.f834w = AccountCameraEffectMgr.m597V().m623X();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m916E(xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        this.f804D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f805E = ((Integer) xaj0Var.b).intValue();
        ((Boolean) xaj0Var.c).getClass();
        m933V(0);
        this.f820i.mo17723v(this.f804D.beautyParameterMap);
        AccountCameraEffectMgr.m597V().m659r0(this.f804D.beautyParameterMap);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m917F(View view) {
        m945i0();
        if (NullChecker.a(this.f824m)) {
            this.f824m.call();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m918G(View view) {
        m896a0();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m919H(xaj0 xaj0Var) {
        this.f804D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f805E = ((Integer) xaj0Var.b).intValue();
        boolean zBooleanValue = ((Boolean) xaj0Var.c).booleanValue();
        boolean z = this.f804D.hasNeg;
        float fM664y = AccountCameraEffectMgr.m597V().m664y(this.f804D.type);
        this.f807G = fM664y;
        if (zBooleanValue) {
            this.f820i.setFaceBeautyValue(this.f804D.type, fM664y);
        }
        AccountCameraEffectMgr.m597V().m623X().m684t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f808H), Float.valueOf(this.f807G)));
        AccountCameraEffectMgr.m597V().m657q0(this.f804D.type, this.f807G);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m920I(xaj0 xaj0Var) {
        this.f804D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f805E = ((Integer) xaj0Var.b).intValue();
        boolean z = this.f804D.hasNeg;
        float fM612K = AccountCameraEffectMgr.m597V().m612K(this.f804D.type);
        this.f807G = fM612K;
        this.f820i.setFaceBeautyValue(this.f804D.type, fM612K);
        AccountCameraEffectMgr.m597V().m623X().m684t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f808H), Float.valueOf(this.f807G)));
        AccountCameraEffectMgr.m597V().m657q0(this.f804D.type, this.f807G);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m921J() {
        InterfaceC0898jp interfaceC0898jp = this.f820i;
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f804D;
        interfaceC0898jp.mo17711M(makeupItem.type, makeupItem.modelFilePath);
        this.f820i.mo17719o("makeup_lut", this.f804D.lut);
        this.f820i.mo17719o("makeup_all", this.f804D.all);
        AccountCameraEffectMgr accountCameraEffectMgrM597V = AccountCameraEffectMgr.m597V();
        AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f804D;
        accountCameraEffectMgrM597V.m625a(makeupItem2.type, makeupItem2.modelFilePath);
        AccountCameraEffectMgr.m597V().m660s0("makeup_lut", this.f804D.lut);
        AccountCameraEffectMgr.m597V().m660s0("makeup_all", this.f804D.all);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m922K(xaj0 xaj0Var) {
        this.f804D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f805E = ((Integer) xaj0Var.b).intValue();
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f804D;
        this.f807G = makeupItem.all;
        this.f808H = makeupItem.lut;
        boolean zBooleanValue = ((Boolean) xaj0Var.c).booleanValue();
        AccountCameraEffectMgr.m597V().m623X().m684t(new xaj0<>(Boolean.valueOf(this.f804D.hasNeg), Float.valueOf(this.f804D.lut), Float.valueOf(this.f804D.all)));
        if (this.f804D.isNone()) {
            if (zBooleanValue) {
                m931T();
            }
            m933V(0);
        } else {
            m933V(2);
            m942f0();
            e51.n(new Runnable() { // from class: l.or
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18334a.m921J();
                }
            });
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m923L(xaj0 xaj0Var) {
        this.f803C = (MakeupCategory) xaj0Var.a;
        this.f805E = ((Integer) xaj0Var.b).intValue();
        this.f806F = ((Integer) xaj0Var.b).intValue();
        if (this.f803C.isNone()) {
            m941e0(false);
            if (NullChecker.a(getBeautyMakeupPage())) {
                getBeautyMakeupPage().m808x();
            }
        } else {
            this.f805E = AccountCameraEffectMgr.m597V().m607D(this.f803C.type);
        }
        AccountCameraEffectMgr.m597V().m640h0(this.f806F);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m924M(xaj0 xaj0Var) {
        this.f804D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f805E = ((Integer) xaj0Var.b).intValue();
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f804D;
        this.f808H = makeupItem.lut;
        this.f807G = makeupItem.all;
        if (!makeupItem.isNone()) {
            m937Z();
            m933V(1);
            InterfaceC0898jp interfaceC0898jp = this.f820i;
            AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f804D;
            interfaceC0898jp.mo17711M(makeupItem2.type, makeupItem2.modelFilePath);
            InterfaceC0898jp interfaceC0898jp2 = this.f820i;
            AccountMakeupPageAdapter.MakeupItem makeupItem3 = this.f804D;
            interfaceC0898jp2.mo17719o(makeupItem3.type, makeupItem3.all);
            AccountCameraEffectMgr.m597V().m623X().m684t(new xaj0<>(Boolean.FALSE, Float.valueOf(this.f804D.lut), Float.valueOf(this.f804D.all)));
            AccountCameraEffectMgr accountCameraEffectMgrM597V = AccountCameraEffectMgr.m597V();
            AccountMakeupPageAdapter.MakeupItem makeupItem4 = this.f804D;
            accountCameraEffectMgrM597V.m625a(makeupItem4.type, makeupItem4.modelFilePath);
            m947k0();
        }
        if (((Boolean) xaj0Var.c).booleanValue()) {
            if (this.f804D.isNone()) {
                m936Y();
                m933V(0);
            }
            AccountCameraEffectMgr.m597V().m649m0(this.f803C.type, this.f805E);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m925N(Pair pair) {
        this.f808H = ((Float) pair.first).floatValue();
        this.f804D.lut = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            this.f820i.mo17719o("makeup_lut", this.f808H);
            m947k0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m926O(Pair pair) {
        this.f807G = ((Float) pair.first).floatValue();
        this.f804D.all = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            int i = this.f825n;
            if (i == 4) {
                this.f820i.mo17719o(this.f804D.type, this.f807G);
            } else {
                InterfaceC0898jp interfaceC0898jp = this.f820i;
                if (i == 3) {
                    interfaceC0898jp.mo17719o("makeup_all", this.f807G);
                } else {
                    interfaceC0898jp.setFaceBeautyValue(this.f804D.type, this.f807G);
                }
            }
            m947k0();
            m954u();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m927P(TabLayout.Tab tab, int i) {
        tab.setCustomView(m952s(i));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m928Q() {
        this.f820i.mo17723v(this.f826o.beautyParameterMap);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m929R() {
        if (this.f819h) {
            return;
        }
        m949m0(this.f825n);
        AccountCameraEffectMgr.m597V().m634e0();
        this.f819h = true;
    }

    /* JADX INFO: renamed from: S */
    public void m930S() {
        this.f819h = false;
        if (this.f818g) {
            AccountCameraEffectMgr.m597V().m622W();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m931T() {
        this.f820i.mo17721t();
        AccountCameraEffectMgr.m597V().m633e();
        AccountCameraEffectMgr.m597V().m631d();
        AccountCameraEffectMgr.m597V().m644j0(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX INFO: renamed from: U */
    public final void m932U() {
        int i;
        int selectedTabPosition = this.f814c.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            i = 0;
        } else {
            i = 1;
            if (selectedTabPosition != 1 && selectedTabPosition != 2) {
                if (selectedTabPosition != 3 || this.f804D.isNone()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        }
        AccountCameraEffectMgr.m597V().m623X().m683s(new Pair<>(Integer.valueOf(selectedTabPosition), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: V */
    public final void m933V(int i) {
        AccountCameraEffectMgr.m597V().m623X().m683s(new Pair<>(Integer.valueOf(this.f825n), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: W */
    public final void m934W() {
        int selectedTabPosition = this.f814c.getSelectedTabPosition();
        this.f825n = selectedTabPosition;
        this.f834w.m686v(selectedTabPosition);
    }

    /* JADX INFO: renamed from: X */
    public final void m935X(TabLayout.Tab tab, int i) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m936Y() {
        MakeupCategory makeupCategory = this.f803C;
        if (makeupCategory == null || makeupCategory.type == null) {
            return;
        }
        makeupCategory.all = 0.0f;
        AccountCameraEffectMgr.m597V().m655p0(this.f803C.type, 0.0f);
        this.f820i.mo17720p(this.f803C.type);
    }

    /* JADX INFO: renamed from: Z */
    public final void m937Z() {
        if (this.f809I) {
            return;
        }
        m931T();
        this.f809I = true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m938b0(int i) {
        if (i == 0) {
            m939c0((AccountMakeupPageView) this.f816e.findViewWithTag(Integer.valueOf(this.f825n)));
            return;
        }
        if (i == 1) {
            m940d0((AccountMakeupPageView) this.f816e.findViewWithTag(Integer.valueOf(this.f825n)));
            return;
        }
        if (i == 2) {
            m943g0((AccountMakeupPageView) this.f816e.findViewWithTag(Integer.valueOf(this.f825n)));
        } else if (i == 3) {
            m944h0((AccountMakeupPageView) this.f816e.findViewWithTag(Integer.valueOf(this.f825n)));
        } else if (i == 4) {
            m941e0(true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m939c0(AccountMakeupPageView accountMakeupPageView) {
        accountMakeupPageView.m982o(1, 0);
        e51.n(new Runnable() { // from class: l.nr
            @Override // java.lang.Runnable
            public final void run() {
                this.f17811a.m928Q();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m940d0(AccountMakeupPageView accountMakeupPageView) {
        this.f820i.setFaceBeautyValue("skin_smooth", m955v("skin_smooth"));
        this.f820i.setFaceBeautyValue("skin_whitening", m955v("skin_whitening"));
        this.f820i.setFaceBeautyValue("skin_ruddy", m955v("skin_ruddy"));
        this.f820i.setFaceBeautyValue("big_eye", m955v("big_eye"));
        this.f820i.setFaceBeautyValue("thin_face", m955v("thin_face"));
        this.f820i.setFaceBeautyValue("skin_sharpen", m955v("skin_sharpen"));
        AccountCameraEffectMgr.m597V().m624Z();
        AccountCameraEffectMgr.m597V().m626a0();
        accountMakeupPageView.m979l();
        accountMakeupPageView.m982o(0, 0);
        m953t(m956w(0));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m941e0(boolean z) {
        if (AccountCameraEffectMgr.m597V().m608E() != 0 && this.f803C != null && AccountCameraEffectMgr.m597V().m618R()) {
            this.f820i.mo17721t();
        }
        AccountBeautyMakeupPageView beautyMakeupPage = getBeautyMakeupPage();
        if (beautyMakeupPage != null) {
            beautyMakeupPage.m809y();
            beautyMakeupPage.m808x();
        }
        AccountCameraEffectMgr.m597V().m633e();
        AccountCameraEffectMgr.m597V().m631d();
        AccountCameraEffectMgr.m597V().m629c();
        AccountCameraEffectMgr.m597V().m627b();
        if (z) {
            AccountCameraEffectMgr.m597V().m628b0();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m942f0() {
        this.f809I = false;
        this.f820i.mo17721t();
        AccountCameraEffectMgr.m597V().m633e();
        AccountCameraEffectMgr.m597V().m627b();
        if (NullChecker.a(getBeautyMakeupPage())) {
            getBeautyMakeupPage().m808x();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m943g0(AccountMakeupPageView accountMakeupPageView) {
        this.f820i.setFaceBeautyValue("face_width", m955v("face_width"));
        this.f820i.setFaceBeautyValue("jaw_shape", m955v("jaw_shape"));
        this.f820i.setFaceBeautyValue("shorten_face", m955v("shorten_face"));
        this.f820i.setFaceBeautyValue("forehead", m955v("forehead"));
        this.f820i.setFaceBeautyValue("chin_length", m955v("chin_length"));
        this.f820i.setFaceBeautyValue("cheekbone_width", m955v("cheekbone_width"));
        this.f820i.setFaceBeautyValue("jaw_width", m955v("jaw_width"));
        this.f820i.setFaceBeautyValue("nose_width", m955v("nose_width"));
        this.f820i.setFaceBeautyValue("nose_size", m955v("nose_size"));
        this.f820i.setFaceBeautyValue("nose_lift", m955v("nose_lift"));
        this.f820i.setFaceBeautyValue("nose_ridge_width", m955v("nose_ridge_width"));
        this.f820i.setFaceBeautyValue("nose_tip_size", m955v("nose_tip_size"));
        this.f820i.setFaceBeautyValue("eye_tilt", m955v("eye_tilt"));
        this.f820i.setFaceBeautyValue("eye_distance", m955v("eye_distance"));
        this.f820i.setFaceBeautyValue("lip_thickness", m955v("lip_thickness"));
        this.f820i.setFaceBeautyValue("mouth_size", m955v("mouth_size"));
        this.f820i.setFaceBeautyValue("remove_pouch", m955v("remove_pouch"));
        this.f820i.setFaceBeautyValue("remove_nasolabial_floads", m955v("remove_nasolabial_floads"));
        this.f820i.setFaceBeautyValue("eye_brighten", m955v("eye_brighten"));
        this.f820i.setFaceBeautyValue("teeth_whiten", m955v("teeth_whiten"));
        this.f820i.setFaceBeautyValue("eye_height", m955v("eye_height"));
        AccountCameraEffectMgr.m597V().m630c0();
        AccountCameraEffectMgr.m597V().m626a0();
        accountMakeupPageView.m979l();
        accountMakeupPageView.m982o(0, 0);
        m953t(m956w(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m944h0(AccountMakeupPageView accountMakeupPageView) {
        if (AccountCameraEffectMgr.m597V().m615O() != 0) {
            this.f820i.mo17721t();
        }
        accountMakeupPageView.m982o(0, 0);
        AccountCameraEffectMgr.m597V().m632d0();
        AccountCameraEffectMgr.m597V().m637g();
        AccountCameraEffectMgr.m597V().m633e();
        AccountCameraEffectMgr.m597V().m631d();
        AccountCameraEffectMgr.m597V().m635f();
    }

    /* JADX INFO: renamed from: i0 */
    public void m945i0() {
        e51.y(new Runnable() { // from class: l.kr
            @Override // java.lang.Runnable
            public final void run() {
                this.f15965a.m929R();
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m946j0(int i) {
        m948l0(i);
        m949m0(i);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m947k0() {
        int i = this.f825n;
        if (i == 1 || i == 2) {
            getCurrentPageView().m978k(this.f805E);
            AccountCameraEffectMgr.m597V().m657q0(this.f804D.type, this.f807G);
            AccountCameraEffectMgr.m597V().m653o0(this.f804D.type, this.f807G);
            return;
        }
        if (i == 3) {
            AccountCameraEffectMgr.m597V().m661t0(this.f804D.modelFilePath, this.f808H, this.f807G);
            AccountCameraEffectMgr.m597V().m660s0("makeup_lut", this.f804D.lut);
            AccountCameraEffectMgr.m597V().m660s0("makeup_all", this.f804D.all);
        } else {
            if (i != 4) {
                return;
            }
            this.f803C.all = this.f807G;
            getBeautyMakeupPage().m805u(this.f806F);
            getBeautyMakeupPage().m806v(this.f805E);
            AccountCameraEffectMgr.m597V().m655p0(this.f803C.type, this.f807G);
            AccountCameraEffectMgr.m597V().m649m0(this.f803C.type, this.f805E);
            AccountCameraEffectMgr.m597V().m647l0(this.f803C.type, this.f807G);
            AccountCameraEffectMgr.m597V().m660s0(this.f804D.type, this.f807G);
            AccountCameraEffectMgr.m597V().m651n0(this.f804D.modelFilePath, Float.valueOf(this.f807G));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m948l0(int i) {
        this.f813b.j(i, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m949m0(int i) {
        if (i != -1) {
            this.f825n = i;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m950q(this);
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        m935X(tab, Color.parseColor("#ffffff"));
        m934W();
        m932U();
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        m935X(tab, Color.parseColor("#80ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m950q(View view) {
        C1493yr.m28324a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m951r() {
        return getContext();
    }

    /* JADX INFO: renamed from: s */
    public TextView m952s(int i) {
        String str = AccountCameraEffectMgr.m597V().m611J().get(i).name;
        TextView textView = new TextView(m951r());
        textView.setText(str);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.getLayoutParams();
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#ffffff"));
        } else {
            textView.setTextColor(Color.parseColor("#80ffffff"));
        }
        textView.setPadding(t100.d(10.0f), t100.d(6.0f), t100.d(10.0f), t100.d(6.0f));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f824m = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m953t(AccountMakeupPageView accountMakeupPageView) {
        accountMakeupPageView.m982o(-1, 0);
        AccountCameraEffectMgr.m597V().m636f0(-1);
    }

    /* JADX INFO: renamed from: u */
    public final void m954u() {
        int i = this.f825n;
        if (i == 1 || i == 2) {
            AccountCameraEffectMgr.m597V().m636f0(-1);
            m953t((AccountMakeupPageView) this.f816e.findViewWithTag(0));
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m955v(String str) {
        return AccountCameraEffectMgr.m594H(str);
    }

    /* JADX INFO: renamed from: w */
    public final AccountMakeupPageView m956w(int i) {
        return (AccountMakeupPageView) this.f816e.findViewWithTag(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x */
    public final void m957x(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        this.f829r = AccountCameraEffectMgr.m597V().m646l(list);
        this.f830s = AccountCameraEffectMgr.m597V().m639h();
        AccountCameraEffectMgr.m597V().m641i(list2);
        this.f818g = true;
    }

    /* JADX INFO: renamed from: y */
    public void m958y() {
        if (this.f817f) {
            return;
        }
        AccountCameraEffectMgr.m597V().m619S();
        this.f817f = true;
    }

    public static class MakeupCategory extends CameraCategory {
        public static final String MAKEUP_BLUSH = "腮红";
        public static final String MAKEUP_EYEBROW = "眉毛";
        public static final String MAKEUP_EYESHADOW = "眼妆";
        public static final String MAKEUP_FACIAL = "修容";
        public static final String MAKEUP_LIP = "口红";
        public static final String MAKEUP_PUPIL = "美瞳";
        public static final int NONE = -1;
        public static final int TYPE_MAKEUP_ALL_MAKEUP = 1004;
        public static final int TYPE_MAKEUP_BEAUTYAUTO = 1000;
        public static final int TYPE_MAKEUP_BEAUTYFACE = 1001;
        public static final int TYPE_MAKEUP_MICROPLASTIC = 1002;
        public static final int TYPE_MAKEUP_STYLE_MAKEUP = 1003;
        public float all;
        public int extType;
        public int normalImgId;
        public int selectedImgId;
        public List<MakeupCategory> subMenu;

        public MakeupCategory(CameraCategory cameraCategory, int i) {
            this.extType = -1;
            this.subMenu = new ArrayList();
            this.normalImgId = -1;
            this.selectedImgId = -1;
            this.name = cameraCategory.name;
            this.f331id = cameraCategory.f331id;
            this.category = cameraCategory.category;
            this.cameraUpdateTime = cameraCategory.cameraUpdateTime;
            this.type = cameraCategory.type;
            this.status = cameraCategory.status;
            this.extType = i;
        }

        public boolean isNone() {
            return -1 == this.extType;
        }

        public MakeupCategory(String str, int i, int i2, int i3) {
            this.extType = -1;
            this.subMenu = new ArrayList();
            this.name = str;
            this.extType = i;
            this.normalImgId = i2;
            this.selectedImgId = i3;
        }

        public MakeupCategory(String str, int i) {
            this.extType = -1;
            this.subMenu = new ArrayList();
            this.normalImgId = -1;
            this.selectedImgId = -1;
            this.name = str;
            this.extType = i;
        }

        public MakeupCategory(CameraCategory cameraCategory, String str, int i, int i2) {
            this(cameraCategory, TYPE_MAKEUP_ALL_MAKEUP);
            this.type = str;
            this.normalImgId = i;
            this.selectedImgId = i2;
        }
    }

    public AccountMakeUpMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountMakeUpMenuView(Context context) {
        this(context, null);
    }
}
