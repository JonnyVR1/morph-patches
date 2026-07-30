package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import com.p046p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p046p1.mobile.putong.feed.data.CameraCategory;
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.hqw;
import p149l.ixl;
import p149l.n250;
import p149l.t100;
import p149l.tpd0;
import p149l.xaj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MakeUpMenuView extends LinearLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: A */
    public int f39725A;

    /* JADX INFO: renamed from: B */
    public int f39726B;

    /* JADX INFO: renamed from: C */
    public MakeupCategory f39727C;

    /* JADX INFO: renamed from: D */
    public FeedMakeupPageAdapter.MakeupItem f39728D;

    /* JADX INFO: renamed from: E */
    public int f39729E;

    /* JADX INFO: renamed from: F */
    public int f39730F;

    /* JADX INFO: renamed from: G */
    public float f39731G;

    /* JADX INFO: renamed from: H */
    public float f39732H;

    /* JADX INFO: renamed from: I */
    public boolean f39733I;

    /* JADX INFO: renamed from: J */
    public e30<Boolean> f39734J;

    /* JADX INFO: renamed from: K */
    public ViewPager2.AbstractC0740i f39735K;

    /* JADX INFO: renamed from: a */
    public View f39736a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f39737b;

    /* JADX INFO: renamed from: c */
    public TabLayout f39738c;

    /* JADX INFO: renamed from: d */
    public ImageView f39739d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f39740e;

    /* JADX INFO: renamed from: f */
    public boolean f39741f;

    /* JADX INFO: renamed from: g */
    public boolean f39742g;

    /* JADX INFO: renamed from: h */
    public boolean f39743h;

    /* JADX INFO: renamed from: i */
    public ixl f39744i;

    /* JADX INFO: renamed from: j */
    public FeedMakeupPageAdapter f39745j;

    /* JADX INFO: renamed from: k */
    public C11189f f39746k;

    /* JADX INFO: renamed from: l */
    public C11192i f39747l;

    /* JADX INFO: renamed from: m */
    public d30 f39748m;

    /* JADX INFO: renamed from: n */
    public int f39749n;

    /* JADX INFO: renamed from: o */
    public FeedMakeupPageAdapter.MakeupItem f39750o;

    /* JADX INFO: renamed from: p */
    public float f39751p;

    /* JADX INFO: renamed from: q */
    public float f39752q;

    /* JADX INFO: renamed from: r */
    public List<MakeupCategory> f39753r;

    /* JADX INFO: renamed from: s */
    public List<C11189f.b> f39754s;

    /* JADX INFO: renamed from: t */
    public tpd0 f39755t;

    /* JADX INFO: renamed from: u */
    public HashMap<Integer, tpd0> f39756u;

    /* JADX INFO: renamed from: v */
    public Map<Integer, Integer> f39757v;

    /* JADX INFO: renamed from: w */
    public MakeupSharedViewModel f39758w;

    /* JADX INFO: renamed from: x */
    public int f39759x;

    /* JADX INFO: renamed from: y */
    public int f39760y;

    /* JADX INFO: renamed from: z */
    public int f39761z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView$a */
    public class C11177a implements e30<Boolean> {
        public C11177a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (NullChecker.m81303a(MakeUpMenuView.this.f39744i)) {
                MakeUpMenuView.this.f39744i.mo138853C(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView$b */
    public class C11178b extends ViewPager2.AbstractC0740i {
        public C11178b() {
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
            MakeUpMenuView.this.m61648j0(i);
        }
    }

    public MakeUpMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39741f = false;
        this.f39742g = false;
        this.f39743h = false;
        this.f39749n = 0;
        this.f39751p = 0.0f;
        this.f39752q = 0.0f;
        this.f39755t = new tpd0("feed_camera_makeup_tab_index", -1);
        this.f39756u = new HashMap<>();
        this.f39757v = new HashMap();
        this.f39759x = 1;
        this.f39760y = 0;
        this.f39761z = 0;
        this.f39725A = 0;
        this.f39726B = 0;
        this.f39733I = false;
        this.f39734J = new C11177a();
        this.f39735K = new C11178b();
    }

    /* JADX INFO: renamed from: C */
    private void m61612C() {
        xdl0.m208344M(this.f39740e, true);
        this.f39745j = new FeedMakeupPageAdapter(m61672r());
        C11189f c11189f = new C11189f(m61672r());
        this.f39746k = c11189f;
        c11189f.m61810C(this.f39734J);
        this.f39737b.setUserInputEnabled(false);
        this.f39737b.setAdapter(this.f39746k);
        this.f39737b.setOffscreenPageLimit(5);
        this.f39740e.setUserInputEnabled(false);
        this.f39740e.setAdapter(this.f39745j);
        this.f39740e.setOffscreenPageLimit(5);
        this.f39738c.setSelectedTabIndicatorHeight(0);
        this.f39738c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        C11192i c11192i = new C11192i(this.f39738c, this.f39740e, true, false, new C11192i.b() { // from class: l.ypw
            @Override // com.p046p1.mobile.putong.feed.newui.camera.widget.C11192i.b
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f199505a.m61624P(tab, i);
            }
        });
        this.f39747l = c11192i;
        c11192i.m61839a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m61613E(xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        this.f39728D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f39729E = ((Integer) xaj0Var.f191752b).intValue();
        ((Boolean) xaj0Var.f191753c).getClass();
        m61629V(0);
        this.f39744i.mo138870v(this.f39728D.beautyParameterMap);
        CameraEffectMgr.m61340V().m61402r0(this.f39728D.beautyParameterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m61614F(View view) {
        m61669i0();
        if (NullChecker.m81303a(this.f39748m)) {
            this.f39748m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m61615G(View view) {
        m61635a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m61616H(xaj0 xaj0Var) {
        this.f39728D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f39729E = ((Integer) xaj0Var.f191752b).intValue();
        boolean zBooleanValue = ((Boolean) xaj0Var.f191753c).booleanValue();
        boolean z = this.f39728D.hasNeg;
        float fM61407y = CameraEffectMgr.m61340V().m61407y(this.f39728D.type);
        this.f39731G = fM61407y;
        if (zBooleanValue) {
            this.f39744i.setFaceBeautyValue(this.f39728D.type, fM61407y);
        }
        CameraEffectMgr.m61340V().m61366X().m61860t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f39732H), Float.valueOf(this.f39731G)));
        CameraEffectMgr.m61340V().m61400q0(this.f39728D.type, this.f39731G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m61617I(xaj0 xaj0Var) {
        this.f39728D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f39729E = ((Integer) xaj0Var.f191752b).intValue();
        boolean z = this.f39728D.hasNeg;
        float fM61355K = CameraEffectMgr.m61340V().m61355K(this.f39728D.type);
        this.f39731G = fM61355K;
        this.f39744i.setFaceBeautyValue(this.f39728D.type, fM61355K);
        CameraEffectMgr.m61340V().m61366X().m61860t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f39732H), Float.valueOf(this.f39731G)));
        CameraEffectMgr.m61340V().m61400q0(this.f39728D.type, this.f39731G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m61618J() {
        ixl ixlVar = this.f39744i;
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f39728D;
        ixlVar.mo138856M(makeupItem.type, makeupItem.modelFilePath);
        this.f39744i.mo138866o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f39728D.lut);
        this.f39744i.mo138866o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f39728D.all);
        CameraEffectMgr cameraEffectMgrM61340V = CameraEffectMgr.m61340V();
        FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f39728D;
        cameraEffectMgrM61340V.m61368a(makeupItem2.type, makeupItem2.modelFilePath);
        CameraEffectMgr.m61340V().m61403s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f39728D.lut);
        CameraEffectMgr.m61340V().m61403s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f39728D.all);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m61619K(xaj0 xaj0Var) {
        this.f39728D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f39729E = ((Integer) xaj0Var.f191752b).intValue();
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f39728D;
        this.f39731G = makeupItem.all;
        this.f39732H = makeupItem.lut;
        boolean zBooleanValue = ((Boolean) xaj0Var.f191753c).booleanValue();
        CameraEffectMgr.m61340V().m61366X().m61860t(new xaj0<>(Boolean.valueOf(this.f39728D.hasNeg), Float.valueOf(this.f39728D.lut), Float.valueOf(this.f39728D.all)));
        if (this.f39728D.isNone()) {
            if (zBooleanValue) {
                m61627T();
            }
            m61629V(0);
        } else {
            m61629V(2);
            m61643f0();
            e51.m114763n(new Runnable() { // from class: l.wpw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187582a.m61618J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m61620L(xaj0 xaj0Var) {
        this.f39727C = (MakeupCategory) xaj0Var.f191751a;
        this.f39729E = ((Integer) xaj0Var.f191752b).intValue();
        this.f39730F = ((Integer) xaj0Var.f191752b).intValue();
        if (this.f39727C.isNone()) {
            m61641e0(false);
            getBeautyMakeupPage().m61493x();
        } else {
            this.f39729E = CameraEffectMgr.m61340V().m61350D(this.f39727C.type);
        }
        CameraEffectMgr.m61340V().m61383h0(this.f39730F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m61621M(xaj0 xaj0Var) {
        this.f39728D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.f191751a;
        this.f39729E = ((Integer) xaj0Var.f191752b).intValue();
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f39728D;
        this.f39732H = makeupItem.lut;
        this.f39731G = makeupItem.all;
        if (!makeupItem.isNone()) {
            m61633Z();
            m61629V(1);
            ixl ixlVar = this.f39744i;
            FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f39728D;
            ixlVar.mo138856M(makeupItem2.type, makeupItem2.modelFilePath);
            ixl ixlVar2 = this.f39744i;
            FeedMakeupPageAdapter.MakeupItem makeupItem3 = this.f39728D;
            ixlVar2.mo138866o(makeupItem3.type, makeupItem3.all);
            CameraEffectMgr.m61340V().m61366X().m61860t(new xaj0<>(Boolean.FALSE, Float.valueOf(this.f39728D.lut), Float.valueOf(this.f39728D.all)));
            CameraEffectMgr cameraEffectMgrM61340V = CameraEffectMgr.m61340V();
            FeedMakeupPageAdapter.MakeupItem makeupItem4 = this.f39728D;
            cameraEffectMgrM61340V.m61368a(makeupItem4.type, makeupItem4.modelFilePath);
            m61650k0();
        }
        if (((Boolean) xaj0Var.f191753c).booleanValue()) {
            if (this.f39728D.isNone()) {
                m61632Y();
                m61629V(0);
            }
            CameraEffectMgr.m61340V().m61392m0(this.f39727C.type, this.f39729E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m61622N(Pair pair) {
        this.f39732H = ((Float) pair.first).floatValue();
        this.f39728D.lut = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            this.f39744i.mo138866o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f39732H);
            m61650k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m61623O(Pair pair) {
        this.f39731G = ((Float) pair.first).floatValue();
        this.f39728D.all = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            int i = this.f39749n;
            if (i == 4) {
                this.f39744i.mo138866o(this.f39728D.type, this.f39731G);
            } else {
                ixl ixlVar = this.f39744i;
                if (i == 3) {
                    ixlVar.mo138866o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f39731G);
                } else {
                    ixlVar.setFaceBeautyValue(this.f39728D.type, this.f39731G);
                }
            }
            m61650k0();
            m61657u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m61624P(TabLayout.Tab tab, int i) {
        tab.setCustomView(m61673s(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m61625Q() {
        this.f39744i.mo138870v(this.f39750o.beautyParameterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m61626R() {
        if (this.f39743h) {
            return;
        }
        m61653m0(this.f39749n);
        CameraEffectMgr.m61340V().m61377e0();
        this.f39743h = true;
    }

    /* JADX INFO: renamed from: T */
    private void m61627T() {
        this.f39744i.mo138868t();
        CameraEffectMgr.m61340V().m61376e();
        CameraEffectMgr.m61340V().m61374d();
        CameraEffectMgr.m61340V().m61387j0(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX INFO: renamed from: U */
    private void m61628U() {
        int i;
        int selectedTabPosition = this.f39738c.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            i = 0;
        } else {
            i = 1;
            if (selectedTabPosition != 1 && selectedTabPosition != 2) {
                if (selectedTabPosition != 3 || this.f39728D.isNone()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        }
        CameraEffectMgr.m61340V().m61366X().m61859s(new Pair<>(Integer.valueOf(selectedTabPosition), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: V */
    private void m61629V(int i) {
        CameraEffectMgr.m61340V().m61366X().m61859s(new Pair<>(Integer.valueOf(this.f39749n), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: W */
    private void m61630W() {
        int selectedTabPosition = this.f39738c.getSelectedTabPosition();
        this.f39749n = selectedTabPosition;
        this.f39758w.m61862v(selectedTabPosition);
    }

    /* JADX INFO: renamed from: X */
    private void m61631X(TabLayout.Tab tab, int i) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m61632Y() {
        MakeupCategory makeupCategory = this.f39727C;
        if (makeupCategory == null || makeupCategory.type == null) {
            return;
        }
        makeupCategory.all = 0.0f;
        CameraEffectMgr.m61340V().m61398p0(this.f39727C.type, 0.0f);
        this.f39744i.mo138867p(this.f39727C.type);
    }

    /* JADX INFO: renamed from: Z */
    private void m61633Z() {
        if (this.f39733I) {
            return;
        }
        m61627T();
        this.f39733I = true;
    }

    /* JADX INFO: renamed from: a0 */
    private void m61635a0() {
        m61637b0(this.f39749n);
    }

    /* JADX INFO: renamed from: b0 */
    private void m61637b0(int i) {
        if (i == 0) {
            m61665c0((FeedMakeupPageView) this.f39740e.findViewWithTag(Integer.valueOf(this.f39749n)));
            return;
        }
        if (i == 1) {
            m61666d0((FeedMakeupPageView) this.f39740e.findViewWithTag(Integer.valueOf(this.f39749n)));
            return;
        }
        if (i == 2) {
            m61667g0((FeedMakeupPageView) this.f39740e.findViewWithTag(Integer.valueOf(this.f39749n)));
        } else if (i == 3) {
            m61668h0((FeedMakeupPageView) this.f39740e.findViewWithTag(Integer.valueOf(this.f39749n)));
        } else if (i == 4) {
            m61641e0(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m61641e0(boolean z) {
        if (CameraEffectMgr.m61340V().m61351E() != 0 && this.f39727C != null && CameraEffectMgr.m61340V().m61361R()) {
            this.f39744i.mo138868t();
        }
        FeedBeautyMakeupPageView beautyMakeupPage = getBeautyMakeupPage();
        if (beautyMakeupPage != null) {
            beautyMakeupPage.m61494y();
            beautyMakeupPage.m61493x();
        }
        CameraEffectMgr.m61340V().m61376e();
        CameraEffectMgr.m61340V().m61374d();
        CameraEffectMgr.m61340V().m61372c();
        CameraEffectMgr.m61340V().m61370b();
        if (z) {
            CameraEffectMgr.m61340V().m61371b0();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m61643f0() {
        this.f39733I = false;
        this.f39744i.mo138868t();
        CameraEffectMgr.m61340V().m61376e();
        CameraEffectMgr.m61340V().m61370b();
        getBeautyMakeupPage().m61493x();
    }

    private FeedBeautyMakeupPageView getBeautyMakeupPage() {
        return (FeedBeautyMakeupPageView) this.f39740e.findViewWithTag(4);
    }

    private FeedMakeupPageView getCurrentPageView() {
        return (FeedMakeupPageView) this.f39740e.findViewWithTag(Integer.valueOf(this.f39749n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m61648j0(int i) {
        m61670l0(i);
        m61653m0(i);
    }

    /* JADX INFO: renamed from: k0 */
    private void m61650k0() {
        int i = this.f39749n;
        if (i == 1 || i == 2) {
            getCurrentPageView().m61532k(this.f39729E);
            CameraEffectMgr.m61340V().m61400q0(this.f39728D.type, this.f39731G);
            CameraEffectMgr.m61340V().m61396o0(this.f39728D.type, this.f39731G);
            return;
        }
        if (i == 3) {
            CameraEffectMgr.m61340V().m61404t0(this.f39728D.modelFilePath, this.f39732H, this.f39731G);
            CameraEffectMgr.m61340V().m61403s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f39728D.lut);
            CameraEffectMgr.m61340V().m61403s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f39728D.all);
        } else {
            if (i != 4) {
                return;
            }
            this.f39727C.all = this.f39731G;
            getBeautyMakeupPage().m61490u(this.f39730F);
            getBeautyMakeupPage().m61491v(this.f39729E);
            CameraEffectMgr.m61340V().m61398p0(this.f39727C.type, this.f39731G);
            CameraEffectMgr.m61340V().m61392m0(this.f39727C.type, this.f39729E);
            CameraEffectMgr.m61340V().m61390l0(this.f39727C.type, this.f39731G);
            CameraEffectMgr.m61340V().m61403s0(this.f39728D.type, this.f39731G);
            CameraEffectMgr.m61340V().m61394n0(this.f39728D.modelFilePath, Float.valueOf(this.f39731G));
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m61653m0(int i) {
        if (i != -1) {
            this.f39749n = i;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m61657u() {
        int i = this.f39749n;
        if (i == 1 || i == 2) {
            CameraEffectMgr.m61340V().m61379f0(-1);
            m61674t((FeedMakeupPageView) this.f39740e.findViewWithTag(0));
        }
    }

    /* JADX INFO: renamed from: v */
    private float m61658v(String str) {
        return CameraEffectMgr.m61337H(str);
    }

    /* JADX INFO: renamed from: x */
    private void m61659x(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        this.f39753r = CameraEffectMgr.m61340V().m61389l(list);
        this.f39754s = CameraEffectMgr.m61340V().m61382h();
        CameraEffectMgr.m61340V().m61384i(list2);
        this.f39742g = true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: z */
    private void m61660z() {
        this.f39746k.m61811y(this.f39754s);
        this.f39745j.m61515N(this.f39753r);
        CameraEffectMgr.m61340V().m61366X().m61852l().m2983i(m61672r(), new n250() { // from class: l.zpw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f204315a.m61613E((xaj0) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61842b().m2983i(m61672r(), new n250() { // from class: l.aqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f71213a.m61616H((xaj0) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61846f().m2983i(m61672r(), new n250() { // from class: l.bqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f76820a.m61617I((xaj0) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61849i().m2983i(m61672r(), new n250() { // from class: l.cqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f82123a.m61619K((xaj0) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61843c().m2983i(m61672r(), new n250() { // from class: l.dqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f87513a.m61620L((xaj0) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61844d().m2983i(m61672r(), new n250() { // from class: l.eqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f92861a.m61621M((xaj0) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61845e().m2983i(m61672r(), new n250() { // from class: l.fqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f98861a.m61622N((Pair) obj);
            }
        });
        CameraEffectMgr.m61340V().m61366X().m61841a().m2983i(m61672r(), new n250() { // from class: l.gqw
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f103995a.m61623O((Pair) obj);
            }
        });
        this.f39740e.m4247g(this.f39735K);
        this.f39736a.setOnClickListener(new View.OnClickListener() { // from class: l.upw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177679a.m61614F(view);
            }
        });
        this.f39739d.setOnClickListener(new View.OnClickListener() { // from class: l.vpw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182529a.m61615G(view);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m61661A(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        m61659x(list, list2);
        m61612C();
        m61660z();
    }

    /* JADX INFO: renamed from: B */
    public void m61662B(ixl ixlVar) {
        this.f39744i = ixlVar;
        CameraEffectMgr.m61340V().m61363T(ixlVar);
    }

    /* JADX INFO: renamed from: D */
    public void m61663D() {
        CameraEffectMgr.m61340V().m61364U(m61672r());
        this.f39758w = CameraEffectMgr.m61340V().m61366X();
    }

    /* JADX INFO: renamed from: S */
    public void m61664S() {
        this.f39743h = false;
        if (this.f39742g) {
            CameraEffectMgr.m61340V().m61365W();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m61665c0(FeedMakeupPageView feedMakeupPageView) {
        feedMakeupPageView.m61536o(1, 0);
        e51.m114763n(new Runnable() { // from class: l.xpw
            @Override // java.lang.Runnable
            public final void run() {
                this.f193962a.m61625Q();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m61666d0(FeedMakeupPageView feedMakeupPageView) {
        this.f39744i.setFaceBeautyValue("skin_smooth", m61658v("skin_smooth"));
        this.f39744i.setFaceBeautyValue("skin_whitening", m61658v("skin_whitening"));
        this.f39744i.setFaceBeautyValue("skin_ruddy", m61658v("skin_ruddy"));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.BIG_EYE, m61658v(FaceBeautyID.BIG_EYE));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.THIN_FACE, m61658v(FaceBeautyID.THIN_FACE));
        this.f39744i.setFaceBeautyValue("skin_sharpen", m61658v("skin_sharpen"));
        CameraEffectMgr.m61340V().m61367Z();
        CameraEffectMgr.m61340V().m61369a0();
        feedMakeupPageView.m61533l();
        feedMakeupPageView.m61536o(0, 0);
        m61674t(m61675w(0));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m61667g0(FeedMakeupPageView feedMakeupPageView) {
        this.f39744i.setFaceBeautyValue(FaceBeautyID.FACE_WIDTH, m61658v(FaceBeautyID.FACE_WIDTH));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.JAW_SHAPE, m61658v(FaceBeautyID.JAW_SHAPE));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.SHORTEN_FACE, m61658v(FaceBeautyID.SHORTEN_FACE));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.FOREHEAD, m61658v(FaceBeautyID.FOREHEAD));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.CHIN_LENGTH, m61658v(FaceBeautyID.CHIN_LENGTH));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.CHEEKBONE_WIDTH, m61658v(FaceBeautyID.CHEEKBONE_WIDTH));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.JAW_WIDTH, m61658v(FaceBeautyID.JAW_WIDTH));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, m61658v(FaceBeautyID.NOSE_WIDTH));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.NOSE_SIZE, m61658v(FaceBeautyID.NOSE_SIZE));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.NOSE_LIFT, m61658v(FaceBeautyID.NOSE_LIFT));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.NOSE_RIDGE_WIDTH, m61658v(FaceBeautyID.NOSE_RIDGE_WIDTH));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.NOSE_TIP_SIZE, m61658v(FaceBeautyID.NOSE_TIP_SIZE));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.EYE_TILT, m61658v(FaceBeautyID.EYE_TILT));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.EYE_DISTANCE, m61658v(FaceBeautyID.EYE_DISTANCE));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.LIP_THICKNESS, m61658v(FaceBeautyID.LIP_THICKNESS));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.MOUTH_SIZE, m61658v(FaceBeautyID.MOUTH_SIZE));
        this.f39744i.setFaceBeautyValue("remove_pouch", m61658v("remove_pouch"));
        this.f39744i.setFaceBeautyValue("remove_nasolabial_floads", m61658v("remove_nasolabial_floads"));
        this.f39744i.setFaceBeautyValue("eye_brighten", m61658v("eye_brighten"));
        this.f39744i.setFaceBeautyValue("teeth_whiten", m61658v("teeth_whiten"));
        this.f39744i.setFaceBeautyValue(FaceBeautyID.EYE_HEIGHT, m61658v(FaceBeautyID.EYE_HEIGHT));
        CameraEffectMgr.m61340V().m61373c0();
        CameraEffectMgr.m61340V().m61369a0();
        feedMakeupPageView.m61533l();
        feedMakeupPageView.m61536o(0, 0);
        m61674t(m61675w(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m61668h0(FeedMakeupPageView feedMakeupPageView) {
        if (CameraEffectMgr.m61340V().m61358O() != 0) {
            this.f39744i.mo138868t();
        }
        feedMakeupPageView.m61536o(0, 0);
        CameraEffectMgr.m61340V().m61375d0();
        CameraEffectMgr.m61340V().m61380g();
        CameraEffectMgr.m61340V().m61376e();
        CameraEffectMgr.m61340V().m61374d();
        CameraEffectMgr.m61340V().m61378f();
    }

    /* JADX INFO: renamed from: i0 */
    public void m61669i0() {
        e51.m114774y(new Runnable() { // from class: l.tpw
            @Override // java.lang.Runnable
            public final void run() {
                this.f171529a.m61626R();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m61670l0(int i) {
        this.f39737b.m4250j(i, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61671q(this);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        m61631X(tab, Color.parseColor("#ffffff"));
        m61630W();
        m61628U();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        m61631X(tab, Color.parseColor("#80ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m61671q(View view) {
        hqw.m132609a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m61672r() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: s */
    public TextView m61673s(int i) {
        String str = CameraEffectMgr.m61340V().m61354J().get(i).name;
        TextView textView = new TextView(m61672r());
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
        this.f39748m = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m61674t(FeedMakeupPageView feedMakeupPageView) {
        feedMakeupPageView.m61536o(-1, 0);
        CameraEffectMgr.m61340V().m61379f0(-1);
    }

    /* JADX INFO: renamed from: w */
    public final FeedMakeupPageView m61675w(int i) {
        return (FeedMakeupPageView) this.f39740e.findViewWithTag(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y */
    public void m61676y() {
        if (this.f39741f) {
            return;
        }
        CameraEffectMgr.m61340V().m61362S();
        this.f39741f = true;
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
            this.f39217id = cameraCategory.f39217id;
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

    public MakeUpMenuView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MakeUpMenuView(Context context) {
        this(context, null);
    }
}
