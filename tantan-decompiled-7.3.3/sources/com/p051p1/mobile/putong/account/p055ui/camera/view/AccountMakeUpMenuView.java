package com.p051p1.mobile.putong.account.p055ui.camera.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.data.CameraBeautyMode;
import com.p051p1.mobile.putong.account.data.CameraCategory;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountCameraEffectMgr;
import com.p051p1.mobile.putong.account.p055ui.camera.AccountMakeupSharedViewModel;
import com.p051p1.mobile.putong.account.p055ui.camera.adapter.AccountMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.C18249ks;
import p153l.C20135sr;
import p153l.InterfaceC16801ep;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cb50;
import p153l.l51;
import p153l.qa00;
import p153l.vxd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMakeUpMenuView extends LinearLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: A */
    public int f17531A;

    /* JADX INFO: renamed from: B */
    public int f17532B;

    /* JADX INFO: renamed from: C */
    public MakeupCategory f17533C;

    /* JADX INFO: renamed from: D */
    public AccountMakeupPageAdapter.MakeupItem f17534D;

    /* JADX INFO: renamed from: E */
    public int f17535E;

    /* JADX INFO: renamed from: F */
    public int f17536F;

    /* JADX INFO: renamed from: G */
    public float f17537G;

    /* JADX INFO: renamed from: H */
    public float f17538H;

    /* JADX INFO: renamed from: I */
    public boolean f17539I;

    /* JADX INFO: renamed from: J */
    public y20<Boolean> f17540J;

    /* JADX INFO: renamed from: K */
    public ViewPager2.AbstractC0742i f17541K;

    /* JADX INFO: renamed from: a */
    public View f17542a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f17543b;

    /* JADX INFO: renamed from: c */
    public TabLayout f17544c;

    /* JADX INFO: renamed from: d */
    public ImageView f17545d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f17546e;

    /* JADX INFO: renamed from: f */
    public boolean f17547f;

    /* JADX INFO: renamed from: g */
    public boolean f17548g;

    /* JADX INFO: renamed from: h */
    public boolean f17549h;

    /* JADX INFO: renamed from: i */
    public InterfaceC16801ep f17550i;

    /* JADX INFO: renamed from: j */
    public AccountMakeupPageAdapter f17551j;

    /* JADX INFO: renamed from: k */
    public C18249ks f17552k;

    /* JADX INFO: renamed from: l */
    public C4821a f17553l;

    /* JADX INFO: renamed from: m */
    public x20 f17554m;

    /* JADX INFO: renamed from: n */
    public int f17555n;

    /* JADX INFO: renamed from: o */
    public AccountMakeupPageAdapter.MakeupItem f17556o;

    /* JADX INFO: renamed from: p */
    public float f17557p;

    /* JADX INFO: renamed from: q */
    public float f17558q;

    /* JADX INFO: renamed from: r */
    public List<MakeupCategory> f17559r;

    /* JADX INFO: renamed from: s */
    public List<C18249ks.b> f17560s;

    /* JADX INFO: renamed from: t */
    public vxd0 f17561t;

    /* JADX INFO: renamed from: u */
    public HashMap<Integer, vxd0> f17562u;

    /* JADX INFO: renamed from: v */
    public Map<Integer, Integer> f17563v;

    /* JADX INFO: renamed from: w */
    public AccountMakeupSharedViewModel f17564w;

    /* JADX INFO: renamed from: x */
    public int f17565x;

    /* JADX INFO: renamed from: y */
    public int f17566y;

    /* JADX INFO: renamed from: z */
    public int f17567z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeUpMenuView$a */
    public class C4811a implements y20<Boolean> {
        public C4811a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (NullChecker.m82486a(AccountMakeUpMenuView.this.f17550i)) {
                AccountMakeUpMenuView.this.f17550i.mo117608C(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountMakeUpMenuView$b */
    public class C4812b extends ViewPager2.AbstractC0742i {
        public C4812b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            AccountMakeUpMenuView.this.m30039j0(i);
        }
    }

    public AccountMakeUpMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17547f = false;
        this.f17548g = false;
        this.f17549h = false;
        this.f17555n = 0;
        this.f17557p = 0.0f;
        this.f17558q = 0.0f;
        this.f17561t = new vxd0("account_camera_makeup_tab_index", -1);
        this.f17562u = new HashMap<>();
        this.f17563v = new HashMap();
        this.f17565x = 1;
        this.f17566y = 0;
        this.f17567z = 0;
        this.f17531A = 0;
        this.f17532B = 0;
        this.f17539I = false;
        this.f17540J = new C4811a();
        this.f17541K = new C4812b();
    }

    /* JADX INFO: renamed from: C */
    private void m29987C() {
        bnl0.m105524M(this.f17546e, true);
        this.f17551j = new AccountMakeupPageAdapter(m30044r());
        C18249ks c18249ks = new C18249ks(m30044r());
        this.f17552k = c18249ks;
        c18249ks.m151130C(this.f17540J);
        this.f17543b.setUserInputEnabled(false);
        this.f17543b.setAdapter(this.f17552k);
        this.f17543b.setOffscreenPageLimit(5);
        this.f17546e.setUserInputEnabled(false);
        this.f17546e.setAdapter(this.f17551j);
        this.f17546e.setOffscreenPageLimit(5);
        this.f17544c.setSelectedTabIndicatorHeight(0);
        this.f17544c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        C4821a c4821a = new C4821a(this.f17544c, this.f17546e, true, false, new C4821a.b() { // from class: l.jr
            @Override // com.p051p1.mobile.putong.account.p055ui.camera.view.C4821a.b
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f122264a.m30020P(tab, i);
            }
        });
        this.f17553l = c4821a;
        c4821a.m30160a();
    }

    /* JADX INFO: renamed from: a0 */
    private void m29989a0() {
        m30031b0(this.f17555n);
    }

    private AccountBeautyMakeupPageView getBeautyMakeupPage() {
        return (AccountBeautyMakeupPageView) this.f17546e.findViewWithTag(4);
    }

    private AccountMakeupPageView getCurrentPageView() {
        return (AccountMakeupPageView) this.f17546e.findViewWithTag(Integer.valueOf(this.f17555n));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: z */
    private void m30005z() {
        this.f17552k.m151131y(this.f17560s);
        this.f17551j.m29810N(this.f17559r);
        AccountCameraEffectMgr.m29697V().m29723X().m29776l().m2984i(m30044r(), new cb50() { // from class: l.kr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f128409a.m30009E((bkj0) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29766b().m2984i(m30044r(), new cb50() { // from class: l.lr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f133255a.m30012H((bkj0) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29770f().m2984i(m30044r(), new cb50() { // from class: l.mr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f138285a.m30013I((bkj0) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29773i().m2984i(m30044r(), new cb50() { // from class: l.nr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f143355a.m30015K((bkj0) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29767c().m2984i(m30044r(), new cb50() { // from class: l.or
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f148660a.m30016L((bkj0) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29768d().m2984i(m30044r(), new cb50() { // from class: l.pr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f153716a.m30017M((bkj0) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29769e().m2984i(m30044r(), new cb50() { // from class: l.qr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f159059a.m30018N((Pair) obj);
            }
        });
        AccountCameraEffectMgr.m29697V().m29723X().m29765a().m2984i(m30044r(), new cb50() { // from class: l.rr
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f164533a.m30019O((Pair) obj);
            }
        });
        this.f17546e.m4249g(this.f17541K);
        this.f17542a.setOnClickListener(new View.OnClickListener() { // from class: l.fr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100357a.m30010F(view);
            }
        });
        this.f17545d.setOnClickListener(new View.OnClickListener() { // from class: l.gr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105980a.m30011G(view);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m30006A(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        m30050x(list, list2);
        m29987C();
        m30005z();
    }

    /* JADX INFO: renamed from: B */
    public void m30007B(InterfaceC16801ep interfaceC16801ep) {
        this.f17550i = interfaceC16801ep;
        AccountCameraEffectMgr.m29697V().m29720T(interfaceC16801ep);
    }

    /* JADX INFO: renamed from: D */
    public void m30008D() {
        AccountCameraEffectMgr.m29697V().m29721U(m30044r());
        this.f17564w = AccountCameraEffectMgr.m29697V().m29723X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m30009E(bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return;
        }
        this.f17534D = (AccountMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f17535E = ((Integer) bkj0Var.f77082b).intValue();
        ((Boolean) bkj0Var.f77083c).getClass();
        m30026V(0);
        this.f17550i.mo117647v(this.f17534D.beautyParameterMap);
        AccountCameraEffectMgr.m29697V().m29759r0(this.f17534D.beautyParameterMap);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m30010F(View view) {
        m30038i0();
        if (NullChecker.m82486a(this.f17554m)) {
            this.f17554m.call();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m30011G(View view) {
        m29989a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m30012H(bkj0 bkj0Var) {
        this.f17534D = (AccountMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f17535E = ((Integer) bkj0Var.f77082b).intValue();
        boolean zBooleanValue = ((Boolean) bkj0Var.f77083c).booleanValue();
        boolean z = this.f17534D.hasNeg;
        float fM29764y = AccountCameraEffectMgr.m29697V().m29764y(this.f17534D.type);
        this.f17537G = fM29764y;
        if (zBooleanValue) {
            this.f17550i.setFaceBeautyValue(this.f17534D.type, fM29764y);
        }
        AccountCameraEffectMgr.m29697V().m29723X().m29784t(new bkj0<>(Boolean.valueOf(z), Float.valueOf(this.f17538H), Float.valueOf(this.f17537G)));
        AccountCameraEffectMgr.m29697V().m29757q0(this.f17534D.type, this.f17537G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m30013I(bkj0 bkj0Var) {
        this.f17534D = (AccountMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f17535E = ((Integer) bkj0Var.f77082b).intValue();
        boolean z = this.f17534D.hasNeg;
        float fM29712K = AccountCameraEffectMgr.m29697V().m29712K(this.f17534D.type);
        this.f17537G = fM29712K;
        this.f17550i.setFaceBeautyValue(this.f17534D.type, fM29712K);
        AccountCameraEffectMgr.m29697V().m29723X().m29784t(new bkj0<>(Boolean.valueOf(z), Float.valueOf(this.f17538H), Float.valueOf(this.f17537G)));
        AccountCameraEffectMgr.m29697V().m29757q0(this.f17534D.type, this.f17537G);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m30014J() {
        InterfaceC16801ep interfaceC16801ep = this.f17550i;
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f17534D;
        interfaceC16801ep.mo117618M(makeupItem.type, makeupItem.modelFilePath);
        this.f17550i.mo117641o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f17534D.lut);
        this.f17550i.mo117641o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f17534D.all);
        AccountCameraEffectMgr accountCameraEffectMgrM29697V = AccountCameraEffectMgr.m29697V();
        AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f17534D;
        accountCameraEffectMgrM29697V.m29725a(makeupItem2.type, makeupItem2.modelFilePath);
        AccountCameraEffectMgr.m29697V().m29760s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f17534D.lut);
        AccountCameraEffectMgr.m29697V().m29760s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f17534D.all);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m30015K(bkj0 bkj0Var) {
        this.f17534D = (AccountMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f17535E = ((Integer) bkj0Var.f77082b).intValue();
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f17534D;
        this.f17537G = makeupItem.all;
        this.f17538H = makeupItem.lut;
        boolean zBooleanValue = ((Boolean) bkj0Var.f77083c).booleanValue();
        AccountCameraEffectMgr.m29697V().m29723X().m29784t(new bkj0<>(Boolean.valueOf(this.f17534D.hasNeg), Float.valueOf(this.f17534D.lut), Float.valueOf(this.f17534D.all)));
        if (this.f17534D.isNone()) {
            if (zBooleanValue) {
                m30024T();
            }
            m30026V(0);
        } else {
            m30026V(2);
            m30035f0();
            l51.m152908n(new Runnable() { // from class: l.ir
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116481a.m30014J();
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m30016L(bkj0 bkj0Var) {
        this.f17533C = (MakeupCategory) bkj0Var.f77081a;
        this.f17535E = ((Integer) bkj0Var.f77082b).intValue();
        this.f17536F = ((Integer) bkj0Var.f77082b).intValue();
        if (this.f17533C.isNone()) {
            m30034e0(false);
            if (NullChecker.m82486a(getBeautyMakeupPage())) {
                getBeautyMakeupPage().m29901x();
            }
        } else {
            this.f17535E = AccountCameraEffectMgr.m29697V().m29707D(this.f17533C.type);
        }
        AccountCameraEffectMgr.m29697V().m29740h0(this.f17536F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m30017M(bkj0 bkj0Var) {
        this.f17534D = (AccountMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f17535E = ((Integer) bkj0Var.f77082b).intValue();
        AccountMakeupPageAdapter.MakeupItem makeupItem = this.f17534D;
        this.f17538H = makeupItem.lut;
        this.f17537G = makeupItem.all;
        if (!makeupItem.isNone()) {
            m30030Z();
            m30026V(1);
            InterfaceC16801ep interfaceC16801ep = this.f17550i;
            AccountMakeupPageAdapter.MakeupItem makeupItem2 = this.f17534D;
            interfaceC16801ep.mo117618M(makeupItem2.type, makeupItem2.modelFilePath);
            InterfaceC16801ep interfaceC16801ep2 = this.f17550i;
            AccountMakeupPageAdapter.MakeupItem makeupItem3 = this.f17534D;
            interfaceC16801ep2.mo117641o(makeupItem3.type, makeupItem3.all);
            AccountCameraEffectMgr.m29697V().m29723X().m29784t(new bkj0<>(Boolean.FALSE, Float.valueOf(this.f17534D.lut), Float.valueOf(this.f17534D.all)));
            AccountCameraEffectMgr accountCameraEffectMgrM29697V = AccountCameraEffectMgr.m29697V();
            AccountMakeupPageAdapter.MakeupItem makeupItem4 = this.f17534D;
            accountCameraEffectMgrM29697V.m29725a(makeupItem4.type, makeupItem4.modelFilePath);
            m30040k0();
        }
        if (((Boolean) bkj0Var.f77083c).booleanValue()) {
            if (this.f17534D.isNone()) {
                m30029Y();
                m30026V(0);
            }
            AccountCameraEffectMgr.m29697V().m29749m0(this.f17533C.type, this.f17535E);
        }
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m30018N(Pair pair) {
        this.f17538H = ((Float) pair.first).floatValue();
        this.f17534D.lut = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            this.f17550i.mo117641o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f17538H);
            m30040k0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m30019O(Pair pair) {
        this.f17537G = ((Float) pair.first).floatValue();
        this.f17534D.all = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            int i = this.f17555n;
            if (i == 4) {
                this.f17550i.mo117641o(this.f17534D.type, this.f17537G);
            } else {
                InterfaceC16801ep interfaceC16801ep = this.f17550i;
                if (i == 3) {
                    interfaceC16801ep.mo117641o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f17537G);
                } else {
                    interfaceC16801ep.setFaceBeautyValue(this.f17534D.type, this.f17537G);
                }
            }
            m30040k0();
            m30047u();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m30020P(TabLayout.Tab tab, int i) {
        tab.setCustomView(m30045s(i));
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m30021Q() {
        this.f17550i.mo117647v(this.f17556o.beautyParameterMap);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m30022R() {
        if (this.f17549h) {
            return;
        }
        m30042m0(this.f17555n);
        AccountCameraEffectMgr.m29697V().m29734e0();
        this.f17549h = true;
    }

    /* JADX INFO: renamed from: S */
    public void m30023S() {
        this.f17549h = false;
        if (this.f17548g) {
            AccountCameraEffectMgr.m29697V().m29722W();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m30024T() {
        this.f17550i.mo117645t();
        AccountCameraEffectMgr.m29697V().m29733e();
        AccountCameraEffectMgr.m29697V().m29731d();
        AccountCameraEffectMgr.m29697V().m29744j0(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX INFO: renamed from: U */
    public final void m30025U() {
        int i;
        int selectedTabPosition = this.f17544c.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            i = 0;
        } else {
            i = 1;
            if (selectedTabPosition != 1 && selectedTabPosition != 2) {
                if (selectedTabPosition != 3 || this.f17534D.isNone()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        }
        AccountCameraEffectMgr.m29697V().m29723X().m29783s(new Pair<>(Integer.valueOf(selectedTabPosition), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: V */
    public final void m30026V(int i) {
        AccountCameraEffectMgr.m29697V().m29723X().m29783s(new Pair<>(Integer.valueOf(this.f17555n), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: W */
    public final void m30027W() {
        int selectedTabPosition = this.f17544c.getSelectedTabPosition();
        this.f17555n = selectedTabPosition;
        this.f17564w.m29786v(selectedTabPosition);
    }

    /* JADX INFO: renamed from: X */
    public final void m30028X(TabLayout.Tab tab, int i) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m30029Y() {
        MakeupCategory makeupCategory = this.f17533C;
        if (makeupCategory == null || makeupCategory.type == null) {
            return;
        }
        makeupCategory.all = 0.0f;
        AccountCameraEffectMgr.m29697V().m29755p0(this.f17533C.type, 0.0f);
        this.f17550i.mo117642p(this.f17533C.type);
    }

    /* JADX INFO: renamed from: Z */
    public final void m30030Z() {
        if (this.f17539I) {
            return;
        }
        m30024T();
        this.f17539I = true;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m30031b0(int i) {
        if (i == 0) {
            m30032c0((AccountMakeupPageView) this.f17546e.findViewWithTag(Integer.valueOf(this.f17555n)));
            return;
        }
        if (i == 1) {
            m30033d0((AccountMakeupPageView) this.f17546e.findViewWithTag(Integer.valueOf(this.f17555n)));
            return;
        }
        if (i == 2) {
            m30036g0((AccountMakeupPageView) this.f17546e.findViewWithTag(Integer.valueOf(this.f17555n)));
        } else if (i == 3) {
            m30037h0((AccountMakeupPageView) this.f17546e.findViewWithTag(Integer.valueOf(this.f17555n)));
        } else if (i == 4) {
            m30034e0(true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m30032c0(AccountMakeupPageView accountMakeupPageView) {
        accountMakeupPageView.m30075o(1, 0);
        l51.m152908n(new Runnable() { // from class: l.hr
            @Override // java.lang.Runnable
            public final void run() {
                this.f111203a.m30021Q();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m30033d0(AccountMakeupPageView accountMakeupPageView) {
        this.f17550i.setFaceBeautyValue("skin_smooth", m30048v("skin_smooth"));
        this.f17550i.setFaceBeautyValue("skin_whitening", m30048v("skin_whitening"));
        this.f17550i.setFaceBeautyValue("skin_ruddy", m30048v("skin_ruddy"));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.BIG_EYE, m30048v(FaceBeautyID.BIG_EYE));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.THIN_FACE, m30048v(FaceBeautyID.THIN_FACE));
        this.f17550i.setFaceBeautyValue("skin_sharpen", m30048v("skin_sharpen"));
        AccountCameraEffectMgr.m29697V().m29724Z();
        AccountCameraEffectMgr.m29697V().m29726a0();
        accountMakeupPageView.m30072l();
        accountMakeupPageView.m30075o(0, 0);
        m30046t(m30049w(0));
    }

    /* JADX INFO: renamed from: e0 */
    public final void m30034e0(boolean z) {
        if (AccountCameraEffectMgr.m29697V().m29708E() != 0 && this.f17533C != null && AccountCameraEffectMgr.m29697V().m29718R()) {
            this.f17550i.mo117645t();
        }
        AccountBeautyMakeupPageView beautyMakeupPage = getBeautyMakeupPage();
        if (beautyMakeupPage != null) {
            beautyMakeupPage.m29902y();
            beautyMakeupPage.m29901x();
        }
        AccountCameraEffectMgr.m29697V().m29733e();
        AccountCameraEffectMgr.m29697V().m29731d();
        AccountCameraEffectMgr.m29697V().m29729c();
        AccountCameraEffectMgr.m29697V().m29727b();
        if (z) {
            AccountCameraEffectMgr.m29697V().m29728b0();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m30035f0() {
        this.f17539I = false;
        this.f17550i.mo117645t();
        AccountCameraEffectMgr.m29697V().m29733e();
        AccountCameraEffectMgr.m29697V().m29727b();
        if (NullChecker.m82486a(getBeautyMakeupPage())) {
            getBeautyMakeupPage().m29901x();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m30036g0(AccountMakeupPageView accountMakeupPageView) {
        this.f17550i.setFaceBeautyValue(FaceBeautyID.FACE_WIDTH, m30048v(FaceBeautyID.FACE_WIDTH));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.JAW_SHAPE, m30048v(FaceBeautyID.JAW_SHAPE));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.SHORTEN_FACE, m30048v(FaceBeautyID.SHORTEN_FACE));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.FOREHEAD, m30048v(FaceBeautyID.FOREHEAD));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.CHIN_LENGTH, m30048v(FaceBeautyID.CHIN_LENGTH));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.CHEEKBONE_WIDTH, m30048v(FaceBeautyID.CHEEKBONE_WIDTH));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.JAW_WIDTH, m30048v(FaceBeautyID.JAW_WIDTH));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, m30048v(FaceBeautyID.NOSE_WIDTH));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.NOSE_SIZE, m30048v(FaceBeautyID.NOSE_SIZE));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.NOSE_LIFT, m30048v(FaceBeautyID.NOSE_LIFT));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.NOSE_RIDGE_WIDTH, m30048v(FaceBeautyID.NOSE_RIDGE_WIDTH));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.NOSE_TIP_SIZE, m30048v(FaceBeautyID.NOSE_TIP_SIZE));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.EYE_TILT, m30048v(FaceBeautyID.EYE_TILT));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.EYE_DISTANCE, m30048v(FaceBeautyID.EYE_DISTANCE));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.LIP_THICKNESS, m30048v(FaceBeautyID.LIP_THICKNESS));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.MOUTH_SIZE, m30048v(FaceBeautyID.MOUTH_SIZE));
        this.f17550i.setFaceBeautyValue("remove_pouch", m30048v("remove_pouch"));
        this.f17550i.setFaceBeautyValue("remove_nasolabial_floads", m30048v("remove_nasolabial_floads"));
        this.f17550i.setFaceBeautyValue("eye_brighten", m30048v("eye_brighten"));
        this.f17550i.setFaceBeautyValue("teeth_whiten", m30048v("teeth_whiten"));
        this.f17550i.setFaceBeautyValue(FaceBeautyID.EYE_HEIGHT, m30048v(FaceBeautyID.EYE_HEIGHT));
        AccountCameraEffectMgr.m29697V().m29730c0();
        AccountCameraEffectMgr.m29697V().m29726a0();
        accountMakeupPageView.m30072l();
        accountMakeupPageView.m30075o(0, 0);
        m30046t(m30049w(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m30037h0(AccountMakeupPageView accountMakeupPageView) {
        if (AccountCameraEffectMgr.m29697V().m29715O() != 0) {
            this.f17550i.mo117645t();
        }
        accountMakeupPageView.m30075o(0, 0);
        AccountCameraEffectMgr.m29697V().m29732d0();
        AccountCameraEffectMgr.m29697V().m29737g();
        AccountCameraEffectMgr.m29697V().m29733e();
        AccountCameraEffectMgr.m29697V().m29731d();
        AccountCameraEffectMgr.m29697V().m29735f();
    }

    /* JADX INFO: renamed from: i0 */
    public void m30038i0() {
        l51.m152919y(new Runnable() { // from class: l.er
            @Override // java.lang.Runnable
            public final void run() {
                this.f95433a.m30022R();
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m30039j0(int i) {
        m30041l0(i);
        m30042m0(i);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m30040k0() {
        int i = this.f17555n;
        if (i == 1 || i == 2) {
            getCurrentPageView().m30071k(this.f17535E);
            AccountCameraEffectMgr.m29697V().m29757q0(this.f17534D.type, this.f17537G);
            AccountCameraEffectMgr.m29697V().m29753o0(this.f17534D.type, this.f17537G);
            return;
        }
        if (i == 3) {
            AccountCameraEffectMgr.m29697V().m29761t0(this.f17534D.modelFilePath, this.f17538H, this.f17537G);
            AccountCameraEffectMgr.m29697V().m29760s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f17534D.lut);
            AccountCameraEffectMgr.m29697V().m29760s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f17534D.all);
        } else {
            if (i != 4) {
                return;
            }
            this.f17533C.all = this.f17537G;
            getBeautyMakeupPage().m29898u(this.f17536F);
            getBeautyMakeupPage().m29899v(this.f17535E);
            AccountCameraEffectMgr.m29697V().m29755p0(this.f17533C.type, this.f17537G);
            AccountCameraEffectMgr.m29697V().m29749m0(this.f17533C.type, this.f17535E);
            AccountCameraEffectMgr.m29697V().m29747l0(this.f17533C.type, this.f17537G);
            AccountCameraEffectMgr.m29697V().m29760s0(this.f17534D.type, this.f17537G);
            AccountCameraEffectMgr.m29697V().m29751n0(this.f17534D.modelFilePath, Float.valueOf(this.f17537G));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m30041l0(int i) {
        this.f17543b.m4252j(i, false);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m30042m0(int i) {
        if (i != -1) {
            this.f17555n = i;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30043q(this);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        m30028X(tab, Color.parseColor("#ffffff"));
        m30027W();
        m30025U();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        m30028X(tab, Color.parseColor("#80ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m30043q(View view) {
        C20135sr.m187580a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m30044r() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: s */
    public TextView m30045s(int i) {
        String str = AccountCameraEffectMgr.m29697V().m29711J().get(i).name;
        TextView textView = new TextView(m30044r());
        textView.setText(str);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.getLayoutParams();
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#ffffff"));
        } else {
            textView.setTextColor(Color.parseColor("#80ffffff"));
        }
        textView.setPadding(qa00.m175859d(10.0f), qa00.m175859d(6.0f), qa00.m175859d(10.0f), qa00.m175859d(6.0f));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public void setMenuDismissListener(x20 x20Var) {
        this.f17554m = x20Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m30046t(AccountMakeupPageView accountMakeupPageView) {
        accountMakeupPageView.m30075o(-1, 0);
        AccountCameraEffectMgr.m29697V().m29736f0(-1);
    }

    /* JADX INFO: renamed from: u */
    public final void m30047u() {
        int i = this.f17555n;
        if (i == 1 || i == 2) {
            AccountCameraEffectMgr.m29697V().m29736f0(-1);
            m30046t((AccountMakeupPageView) this.f17546e.findViewWithTag(0));
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m30048v(String str) {
        return AccountCameraEffectMgr.m29694H(str);
    }

    /* JADX INFO: renamed from: w */
    public final AccountMakeupPageView m30049w(int i) {
        return (AccountMakeupPageView) this.f17546e.findViewWithTag(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: x */
    public final void m30050x(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        this.f17559r = AccountCameraEffectMgr.m29697V().m29746l(list);
        this.f17560s = AccountCameraEffectMgr.m29697V().m29739h();
        AccountCameraEffectMgr.m29697V().m29741i(list2);
        this.f17548g = true;
    }

    /* JADX INFO: renamed from: y */
    public void m30051y() {
        if (this.f17547f) {
            return;
        }
        AccountCameraEffectMgr.m29697V().m29719S();
        this.f17547f = true;
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
            this.f17061id = cameraCategory.f17061id;
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
