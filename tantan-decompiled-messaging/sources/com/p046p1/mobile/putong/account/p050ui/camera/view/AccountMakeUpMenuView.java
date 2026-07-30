package com.p046p1.mobile.putong.account.p050ui.camera.view;

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
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.data.CameraBeautyMode;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountCameraEffectMgr;
import com.p046p1.mobile.putong.account.p050ui.camera.AccountMakeupSharedViewModel;
import com.p046p1.mobile.putong.account.p050ui.camera.adapter.AccountMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.C19563qs;
import p149l.C21482yr;
import p149l.InterfaceC17833jp;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.n250;
import p149l.t100;
import p149l.tpd0;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeUpMenuView extends LinearLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: A */
    public int f16812A;

    /* JADX INFO: renamed from: B */
    public int f16813B;

    /* JADX INFO: renamed from: C */
    public MakeupCategory f16814C;

    /* JADX INFO: renamed from: D */
    public AccountMakeupPageAdapter.MakeupItem f16815D;

    /* JADX INFO: renamed from: E */
    public int f16816E;

    /* JADX INFO: renamed from: F */
    public int f16817F;

    /* JADX INFO: renamed from: G */
    public float f16818G;

    /* JADX INFO: renamed from: H */
    public float f16819H;

    /* JADX INFO: renamed from: I */
    public boolean f16820I;

    /* JADX INFO: renamed from: J */
    public e30<Boolean> f16821J;

    /* JADX INFO: renamed from: K */
    public ViewPager2.AbstractC0740i f16822K;

    /* JADX INFO: renamed from: a */
    public View f16823a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f16824b;

    /* JADX INFO: renamed from: c */
    public TabLayout f16825c;

    /* JADX INFO: renamed from: d */
    public ImageView f16826d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f16827e;

    /* JADX INFO: renamed from: f */
    public boolean f16828f;

    /* JADX INFO: renamed from: g */
    public boolean f16829g;

    /* JADX INFO: renamed from: h */
    public boolean f16830h;

    /* JADX INFO: renamed from: i */
    public InterfaceC17833jp f16831i;

    /* JADX INFO: renamed from: j */
    public AccountMakeupPageAdapter f16832j;

    /* JADX INFO: renamed from: k */
    public C19563qs f16833k;

    /* JADX INFO: renamed from: l */
    public C4670a f16834l;

    /* JADX INFO: renamed from: m */
    public d30 f16835m;

    /* JADX INFO: renamed from: n */
    public int f16836n;

    /* JADX INFO: renamed from: o */
    public AccountMakeupPageAdapter.MakeupItem f16837o;

    /* JADX INFO: renamed from: p */
    public float f16838p;

    /* JADX INFO: renamed from: q */
    public float f16839q;

    /* JADX INFO: renamed from: r */
    public List<MakeupCategory> f16840r;

    /* JADX INFO: renamed from: s */
    public List<C19563qs.b> f16841s;

    /* JADX INFO: renamed from: t */
    public tpd0 f16842t;

    /* JADX INFO: renamed from: u */
    public HashMap<Integer, tpd0> f16843u;

    /* JADX INFO: renamed from: v */
    public Map<Integer, Integer> f16844v;

    /* JADX INFO: renamed from: w */
    public AccountMakeupSharedViewModel f16845w;

    /* JADX INFO: renamed from: x */
    public int f16846x;

    /* JADX INFO: renamed from: y */
    public int f16847y;

    /* JADX INFO: renamed from: z */
    public int f16848z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeUpMenuView$a */
    public class C4660a implements e30<Boolean> {
        public C4660a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (NullChecker.m81303a(AccountMakeUpMenuView.this.f16831i)) {
                AccountMakeUpMenuView.this.f16831i.mo142539C(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeUpMenuView$b */
    public class C4661b extends ViewPager2.AbstractC0740i {
        public C4661b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            AccountMakeUpMenuView.this.m29040j0(i);
        }
    }

    public AccountMakeUpMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16828f = false;
        this.f16829g = false;
        this.f16830h = false;
        this.f16836n = 0;
        this.f16838p = 0.0f;
        this.f16839q = 0.0f;
        this.f16842t = new tpd0("account_camera_makeup_tab_index", -1);
        this.f16843u = new HashMap<>();
        this.f16844v = new HashMap();
        this.f16846x = 1;
        this.f16847y = 0;
        this.f16848z = 0;
        this.f16812A = 0;
        this.f16813B = 0;
        this.f16820I = false;
        this.f16821J = new C4660a();
        this.f16822K = new C4661b();
    }

    /* JADX INFO: renamed from: C */
    private void m28988C() {
        xdl0.m208344M(this.f16827e, true);
        this.f16832j = new AccountMakeupPageAdapter(m29045r());
        C19563qs c19563qs = new C19563qs(m29045r());
        this.f16833k = c19563qs;
        c19563qs.m176142C(this.f16821J);
        this.f16824b.setUserInputEnabled(false);
        this.f16824b.setAdapter(this.f16833k);
        this.f16824b.setOffscreenPageLimit(5);
        this.f16827e.setUserInputEnabled(false);
        this.f16827e.setAdapter(this.f16832j);
        this.f16827e.setOffscreenPageLimit(5);
        this.f16825c.setSelectedTabIndicatorHeight(0);
        this.f16825c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        C4670a c4670a = new C4670a(this.f16825c, this.f16827e, true, false, new C4670a.b() { // from class: l.pr
            @Override // com.p046p1.mobile.putong.account.p050ui.camera.view.C4670a.b
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f150824a.m29021P(tab, i);
            }
        });
        this.f16834l = c4670a;
        c4670a.m29162a();
    }

    /* JADX INFO: renamed from: a0 */
    private void m28990a0() {
        m29032b0(this.f16836n);
    }

    private AccountBeautyMakeupPageView getBeautyMakeupPage() {
        return (AccountBeautyMakeupPageView) this.f16827e.findViewWithTag(4);
    }

    private AccountMakeupPageView getCurrentPageView() {
        return (AccountMakeupPageView) this.f16827e.findViewWithTag(Integer.valueOf(this.f16836n));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: z */
    private void m29006z() {
        this.f16833k.m176143y(this.f16841s);
        this.f16832j.m28811N(this.f16840r);
        AccountCameraEffectMgr.m28698V().m28724X().m28777l().m2983i(m29045r(), new n250() { // from class: l.qr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f155953a.m29010E((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28767b().m2983i(m29045r(), new n250() { // from class: l.rr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f160706a.m29013H((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28771f().m2983i(m29045r(), new n250() { // from class: l.sr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f166032a.m29014I((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28774i().m2983i(m29045r(), new n250() { // from class: l.tr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f171779a.m29016K((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28768c().m2983i(m29045r(), new n250() { // from class: l.ur
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f177797a.m29017L((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28769d().m2983i(m29045r(), new n250() { // from class: l.vr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f182688a.m29018M((xaj0) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28770e().m2983i(m29045r(), new n250() { // from class: l.wr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f187747a.m29019N((Pair) obj);
            }
        });
        AccountCameraEffectMgr.m28698V().m28724X().m28766a().m2983i(m29045r(), new n250() { // from class: l.xr
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f194063a.m29020O((Pair) obj);
            }
        });
        this.f16827e.m4247g(this.f16822K);
        this.f16823a.setOnClickListener(new View.OnClickListener() { // from class: l.lr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129454a.m29011F(view);
            }
        });
        this.f16826d.setOnClickListener(new View.OnClickListener() { // from class: l.mr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135319a.m29012G(view);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m29007A(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        m29051x(list, list2);
        m28988C();
        m29006z();
    }

    /* JADX INFO: renamed from: B */
    public void m29008B(InterfaceC17833jp interfaceC17833jp) {
        this.f16831i = interfaceC17833jp;
        AccountCameraEffectMgr.m28698V().m28721T(interfaceC17833jp);
    }

    /* JADX INFO: renamed from: D */
    public void m29009D() {
        AccountCameraEffectMgr.m28698V().m28722U(m29045r());
        this.f16845w = AccountCameraEffectMgr.m28698V().m28724X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m29010E(xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        this.f16815D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f16816E = ((Integer) xaj0Var.f191752b).intValue();
        ((Boolean) xaj0Var.f191753c).getClass();
        m29027V(0);
        this.f16831i.mo142554v(this.f16815D.beautyParameterMap);
        AccountCameraEffectMgr.m28698V().m28760r0(this.f16815D.beautyParameterMap);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m29011F(View view) {
        m29039i0();
        if (NullChecker.m81303a(this.f16835m)) {
            this.f16835m.call();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m29012G(View view) {
        m28990a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m29013H(xaj0 xaj0Var) {
        this.f16815D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f16816E = ((Integer) xaj0Var.f191752b).intValue();
        boolean zBooleanValue = ((Boolean) xaj0Var.f191753c).booleanValue();
        boolean z = this.f16815D.hasNeg;
        float fM28765y = AccountCameraEffectMgr.m28698V().m28765y(this.f16815D.type);
        this.f16818G = fM28765y;
        if (zBooleanValue) {
            this.f16831i.setFaceBeautyValue(this.f16815D.type, fM28765y);
        }
        AccountCameraEffectMgr.m28698V().m28724X().m28785t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f16819H), Float.valueOf(this.f16818G)));
        AccountCameraEffectMgr.m28698V().m28758q0(this.f16815D.type, this.f16818G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m29014I(xaj0 xaj0Var) {
        this.f16815D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f16816E = ((Integer) xaj0Var.f191752b).intValue();
        boolean z = this.f16815D.hasNeg;
        float fM28713K = AccountCameraEffectMgr.m28698V().m28713K(this.f16815D.type);
        this.f16818G = fM28713K;
        this.f16831i.setFaceBeautyValue(this.f16815D.type, fM28713K);
        AccountCameraEffectMgr.m28698V().m28724X().m28785t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f16819H), Float.valueOf(this.f16818G)));
        AccountCameraEffectMgr.m28698V().m28758q0(this.f16815D.type, this.f16818G);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m29015J() {
        InterfaceC17833jp interfaceC17833jp = this.f16831i;
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f16815D;
        interfaceC17833jp.mo142542M(makeupItem.type, makeupItem.modelFilePath);
        this.f16831i.mo142550o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f16815D.lut);
        this.f16831i.mo142550o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f16815D.all);
        AccountCameraEffectMgr accountCameraEffectMgrM28698V = AccountCameraEffectMgr.m28698V();
        AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f16815D;
        accountCameraEffectMgrM28698V.m28726a(makeupItem2.type, makeupItem2.modelFilePath);
        AccountCameraEffectMgr.m28698V().m28761s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f16815D.lut);
        AccountCameraEffectMgr.m28698V().m28761s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f16815D.all);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m29016K(xaj0 xaj0Var) {
        this.f16815D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f16816E = ((Integer) xaj0Var.f191752b).intValue();
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f16815D;
        this.f16818G = makeupItem.all;
        this.f16819H = makeupItem.lut;
        boolean zBooleanValue = ((Boolean) xaj0Var.f191753c).booleanValue();
        AccountCameraEffectMgr.m28698V().m28724X().m28785t(new xaj0<>(Boolean.valueOf(this.f16815D.hasNeg), Float.valueOf(this.f16815D.lut), Float.valueOf(this.f16815D.all)));
        if (this.f16815D.isNone()) {
            if (zBooleanValue) {
                m29025T();
            }
            m29027V(0);
        } else {
            m29027V(2);
            m29036f0();
            e51.m114763n(new Runnable() { // from class: l.or
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145210a.m29015J();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m29017L(xaj0 xaj0Var) {
        this.f16814C = (MakeupCategory) xaj0Var.f191751a;
        this.f16816E = ((Integer) xaj0Var.f191752b).intValue();
        this.f16817F = ((Integer) xaj0Var.f191752b).intValue();
        if (this.f16814C.isNone()) {
            m29035e0(false);
            if (NullChecker.m81303a(getBeautyMakeupPage())) {
                getBeautyMakeupPage().m28902x();
            }
        } else {
            this.f16816E = AccountCameraEffectMgr.m28698V().m28708D(this.f16814C.type);
        }
        AccountCameraEffectMgr.m28698V().m28741h0(this.f16817F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m29018M(xaj0 xaj0Var) {
        this.f16815D = (AccountMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f16816E = ((Integer) xaj0Var.f191752b).intValue();
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f16815D;
        this.f16819H = makeupItem.lut;
        this.f16818G = makeupItem.all;
        if (!makeupItem.isNone()) {
            m29031Z();
            m29027V(1);
            InterfaceC17833jp interfaceC17833jp = this.f16831i;
            AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f16815D;
            interfaceC17833jp.mo142542M(makeupItem2.type, makeupItem2.modelFilePath);
            InterfaceC17833jp interfaceC17833jp2 = this.f16831i;
            AccountMakeupPageAdapter.MakeupItem makeupItem3 = this.f16815D;
            interfaceC17833jp2.mo142550o(makeupItem3.type, makeupItem3.all);
            AccountCameraEffectMgr.m28698V().m28724X().m28785t(new xaj0<>(Boolean.FALSE, Float.valueOf(this.f16815D.lut), Float.valueOf(this.f16815D.all)));
            AccountCameraEffectMgr accountCameraEffectMgrM28698V = AccountCameraEffectMgr.m28698V();
            AccountMakeupPageAdapter.MakeupItem makeupItem4 = this.f16815D;
            accountCameraEffectMgrM28698V.m28726a(makeupItem4.type, makeupItem4.modelFilePath);
            m29041k0();
        }
        if (((Boolean) xaj0Var.f191753c).booleanValue()) {
            if (this.f16815D.isNone()) {
                m29030Y();
                m29027V(0);
            }
            AccountCameraEffectMgr.m28698V().m28750m0(this.f16814C.type, this.f16816E);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m29019N(Pair pair) {
        this.f16819H = ((Float) pair.first).floatValue();
        this.f16815D.lut = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            this.f16831i.mo142550o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f16819H);
            m29041k0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m29020O(Pair pair) {
        this.f16818G = ((Float) pair.first).floatValue();
        this.f16815D.all = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            int i = this.f16836n;
            if (i == 4) {
                this.f16831i.mo142550o(this.f16815D.type, this.f16818G);
            } else {
                InterfaceC17833jp interfaceC17833jp = this.f16831i;
                if (i == 3) {
                    interfaceC17833jp.mo142550o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f16818G);
                } else {
                    interfaceC17833jp.setFaceBeautyValue(this.f16815D.type, this.f16818G);
                }
            }
            m29041k0();
            m29048u();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m29021P(TabLayout.Tab tab, int i) {
        tab.setCustomView(m29046s(i));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m29022Q() {
        this.f16831i.mo142554v(this.f16837o.beautyParameterMap);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m29023R() {
        if (this.f16830h) {
            return;
        }
        m29043m0(this.f16836n);
        AccountCameraEffectMgr.m28698V().m28735e0();
        this.f16830h = true;
    }

    /* JADX INFO: renamed from: S */
    public void m29024S() {
        this.f16830h = false;
        if (this.f16829g) {
            AccountCameraEffectMgr.m28698V().m28723W();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m29025T() {
        this.f16831i.mo142552t();
        AccountCameraEffectMgr.m28698V().m28734e();
        AccountCameraEffectMgr.m28698V().m28732d();
        AccountCameraEffectMgr.m28698V().m28745j0(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX INFO: renamed from: U */
    public final void m29026U() {
        int i;
        int selectedTabPosition = this.f16825c.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            i = 0;
        } else {
            i = 1;
            if (selectedTabPosition != 1 && selectedTabPosition != 2) {
                if (selectedTabPosition != 3 || this.f16815D.isNone()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        }
        AccountCameraEffectMgr.m28698V().m28724X().m28784s(new Pair<>(Integer.valueOf(selectedTabPosition), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: V */
    public final void m29027V(int i) {
        AccountCameraEffectMgr.m28698V().m28724X().m28784s(new Pair<>(Integer.valueOf(this.f16836n), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: W */
    public final void m29028W() {
        int selectedTabPosition = this.f16825c.getSelectedTabPosition();
        this.f16836n = selectedTabPosition;
        this.f16845w.m28787v(selectedTabPosition);
    }

    /* JADX INFO: renamed from: X */
    public final void m29029X(TabLayout.Tab tab, int i) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m29030Y() {
        MakeupCategory makeupCategory = this.f16814C;
        if (makeupCategory == null || makeupCategory.type == null) {
            return;
        }
        makeupCategory.all = 0.0f;
        AccountCameraEffectMgr.m28698V().m28756p0(this.f16814C.type, 0.0f);
        this.f16831i.mo142551p(this.f16814C.type);
    }

    /* JADX INFO: renamed from: Z */
    public final void m29031Z() {
        if (this.f16820I) {
            return;
        }
        m29025T();
        this.f16820I = true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m29032b0(int i) {
        if (i == 0) {
            m29033c0((AccountMakeupPageView) this.f16827e.findViewWithTag(Integer.valueOf(this.f16836n)));
            return;
        }
        if (i == 1) {
            m29034d0((AccountMakeupPageView) this.f16827e.findViewWithTag(Integer.valueOf(this.f16836n)));
            return;
        }
        if (i == 2) {
            m29037g0((AccountMakeupPageView) this.f16827e.findViewWithTag(Integer.valueOf(this.f16836n)));
        } else if (i == 3) {
            m29038h0((AccountMakeupPageView) this.f16827e.findViewWithTag(Integer.valueOf(this.f16836n)));
        } else if (i == 4) {
            m29035e0(true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m29033c0(AccountMakeupPageView accountMakeupPageView) {
        accountMakeupPageView.m29076o(1, 0);
        e51.m114763n(new Runnable() { // from class: l.nr
            @Override // java.lang.Runnable
            public final void run() {
                this.f140127a.m29022Q();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m29034d0(AccountMakeupPageView accountMakeupPageView) {
        this.f16831i.setFaceBeautyValue("skin_smooth", m29049v("skin_smooth"));
        this.f16831i.setFaceBeautyValue("skin_whitening", m29049v("skin_whitening"));
        this.f16831i.setFaceBeautyValue("skin_ruddy", m29049v("skin_ruddy"));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.BIG_EYE, m29049v(FaceBeautyID.BIG_EYE));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.THIN_FACE, m29049v(FaceBeautyID.THIN_FACE));
        this.f16831i.setFaceBeautyValue("skin_sharpen", m29049v("skin_sharpen"));
        AccountCameraEffectMgr.m28698V().m28725Z();
        AccountCameraEffectMgr.m28698V().m28727a0();
        accountMakeupPageView.m29073l();
        accountMakeupPageView.m29076o(0, 0);
        m29047t(m29050w(0));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m29035e0(boolean z) {
        if (AccountCameraEffectMgr.m28698V().m28709E() != 0 && this.f16814C != null && AccountCameraEffectMgr.m28698V().m28719R()) {
            this.f16831i.mo142552t();
        }
        AccountBeautyMakeupPageView beautyMakeupPage = getBeautyMakeupPage();
        if (beautyMakeupPage != null) {
            beautyMakeupPage.m28903y();
            beautyMakeupPage.m28902x();
        }
        AccountCameraEffectMgr.m28698V().m28734e();
        AccountCameraEffectMgr.m28698V().m28732d();
        AccountCameraEffectMgr.m28698V().m28730c();
        AccountCameraEffectMgr.m28698V().m28728b();
        if (z) {
            AccountCameraEffectMgr.m28698V().m28729b0();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m29036f0() {
        this.f16820I = false;
        this.f16831i.mo142552t();
        AccountCameraEffectMgr.m28698V().m28734e();
        AccountCameraEffectMgr.m28698V().m28728b();
        if (NullChecker.m81303a(getBeautyMakeupPage())) {
            getBeautyMakeupPage().m28902x();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m29037g0(AccountMakeupPageView accountMakeupPageView) {
        this.f16831i.setFaceBeautyValue(FaceBeautyID.FACE_WIDTH, m29049v(FaceBeautyID.FACE_WIDTH));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.JAW_SHAPE, m29049v(FaceBeautyID.JAW_SHAPE));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.SHORTEN_FACE, m29049v(FaceBeautyID.SHORTEN_FACE));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.FOREHEAD, m29049v(FaceBeautyID.FOREHEAD));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.CHIN_LENGTH, m29049v(FaceBeautyID.CHIN_LENGTH));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.CHEEKBONE_WIDTH, m29049v(FaceBeautyID.CHEEKBONE_WIDTH));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.JAW_WIDTH, m29049v(FaceBeautyID.JAW_WIDTH));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, m29049v(FaceBeautyID.NOSE_WIDTH));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.NOSE_SIZE, m29049v(FaceBeautyID.NOSE_SIZE));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.NOSE_LIFT, m29049v(FaceBeautyID.NOSE_LIFT));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.NOSE_RIDGE_WIDTH, m29049v(FaceBeautyID.NOSE_RIDGE_WIDTH));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.NOSE_TIP_SIZE, m29049v(FaceBeautyID.NOSE_TIP_SIZE));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.EYE_TILT, m29049v(FaceBeautyID.EYE_TILT));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.EYE_DISTANCE, m29049v(FaceBeautyID.EYE_DISTANCE));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.LIP_THICKNESS, m29049v(FaceBeautyID.LIP_THICKNESS));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.MOUTH_SIZE, m29049v(FaceBeautyID.MOUTH_SIZE));
        this.f16831i.setFaceBeautyValue("remove_pouch", m29049v("remove_pouch"));
        this.f16831i.setFaceBeautyValue("remove_nasolabial_floads", m29049v("remove_nasolabial_floads"));
        this.f16831i.setFaceBeautyValue("eye_brighten", m29049v("eye_brighten"));
        this.f16831i.setFaceBeautyValue("teeth_whiten", m29049v("teeth_whiten"));
        this.f16831i.setFaceBeautyValue(FaceBeautyID.EYE_HEIGHT, m29049v(FaceBeautyID.EYE_HEIGHT));
        AccountCameraEffectMgr.m28698V().m28731c0();
        AccountCameraEffectMgr.m28698V().m28727a0();
        accountMakeupPageView.m29073l();
        accountMakeupPageView.m29076o(0, 0);
        m29047t(m29050w(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m29038h0(AccountMakeupPageView accountMakeupPageView) {
        if (AccountCameraEffectMgr.m28698V().m28716O() != 0) {
            this.f16831i.mo142552t();
        }
        accountMakeupPageView.m29076o(0, 0);
        AccountCameraEffectMgr.m28698V().m28733d0();
        AccountCameraEffectMgr.m28698V().m28738g();
        AccountCameraEffectMgr.m28698V().m28734e();
        AccountCameraEffectMgr.m28698V().m28732d();
        AccountCameraEffectMgr.m28698V().m28736f();
    }

    /* JADX INFO: renamed from: i0 */
    public void m29039i0() {
        e51.m114774y(new Runnable() { // from class: l.kr
            @Override // java.lang.Runnable
            public final void run() {
                this.f124316a.m29023R();
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m29040j0(int i) {
        m29042l0(i);
        m29043m0(i);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m29041k0() {
        int i = this.f16836n;
        if (i == 1 || i == 2) {
            getCurrentPageView().m29072k(this.f16816E);
            AccountCameraEffectMgr.m28698V().m28758q0(this.f16815D.type, this.f16818G);
            AccountCameraEffectMgr.m28698V().m28754o0(this.f16815D.type, this.f16818G);
            return;
        }
        if (i == 3) {
            AccountCameraEffectMgr.m28698V().m28762t0(this.f16815D.modelFilePath, this.f16819H, this.f16818G);
            AccountCameraEffectMgr.m28698V().m28761s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f16815D.lut);
            AccountCameraEffectMgr.m28698V().m28761s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f16815D.all);
        } else {
            if (i != 4) {
                return;
            }
            this.f16814C.all = this.f16818G;
            getBeautyMakeupPage().m28899u(this.f16817F);
            getBeautyMakeupPage().m28900v(this.f16816E);
            AccountCameraEffectMgr.m28698V().m28756p0(this.f16814C.type, this.f16818G);
            AccountCameraEffectMgr.m28698V().m28750m0(this.f16814C.type, this.f16816E);
            AccountCameraEffectMgr.m28698V().m28748l0(this.f16814C.type, this.f16818G);
            AccountCameraEffectMgr.m28698V().m28761s0(this.f16815D.type, this.f16818G);
            AccountCameraEffectMgr.m28698V().m28752n0(this.f16815D.modelFilePath, Float.valueOf(this.f16818G));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m29042l0(int i) {
        this.f16824b.m4250j(i, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m29043m0(int i) {
        if (i != -1) {
            this.f16836n = i;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29044q(this);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        m29029X(tab, Color.parseColor("#ffffff"));
        m29028W();
        m29026U();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        m29029X(tab, Color.parseColor("#80ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m29044q(View view) {
        C21482yr.m215766a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m29045r() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: s */
    public TextView m29046s(int i) {
        String str = AccountCameraEffectMgr.m28698V().m28712J().get(i).name;
        TextView textView = new TextView(m29045r());
        textView.setText(str);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.getLayoutParams();
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#ffffff"));
        } else {
            textView.setTextColor(Color.parseColor("#80ffffff"));
        }
        textView.setPadding(t100.m186890d(10.0f), t100.m186890d(6.0f), t100.m186890d(10.0f), t100.m186890d(6.0f));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public void setMenuDismissListener(d30 d30Var) {
        this.f16835m = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m29047t(AccountMakeupPageView accountMakeupPageView) {
        accountMakeupPageView.m29076o(-1, 0);
        AccountCameraEffectMgr.m28698V().m28737f0(-1);
    }

    /* JADX INFO: renamed from: u */
    public final void m29048u() {
        int i = this.f16836n;
        if (i == 1 || i == 2) {
            AccountCameraEffectMgr.m28698V().m28737f0(-1);
            m29047t((AccountMakeupPageView) this.f16827e.findViewWithTag(0));
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m29049v(String str) {
        return AccountCameraEffectMgr.m28695H(str);
    }

    /* JADX INFO: renamed from: w */
    public final AccountMakeupPageView m29050w(int i) {
        return (AccountMakeupPageView) this.f16827e.findViewWithTag(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x */
    public final void m29051x(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        this.f16840r = AccountCameraEffectMgr.m28698V().m28747l(list);
        this.f16841s = AccountCameraEffectMgr.m28698V().m28740h();
        AccountCameraEffectMgr.m28698V().m28742i(list2);
        this.f16829g = true;
    }

    /* JADX INFO: renamed from: y */
    public void m29052y() {
        if (this.f16828f) {
            return;
        }
        AccountCameraEffectMgr.m28698V().m28720S();
        this.f16828f = true;
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
            this.f16342id = cameraCategory.f16342id;
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
            this(cameraCategory, 1004);
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
