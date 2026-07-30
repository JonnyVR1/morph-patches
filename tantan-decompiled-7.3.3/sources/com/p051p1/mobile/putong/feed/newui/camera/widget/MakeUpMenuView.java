package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import com.p051p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p051p1.mobile.putong.feed.data.CameraCategory;
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.b0m;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cb50;
import p153l.gtw;
import p153l.l51;
import p153l.qa00;
import p153l.vxd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MakeUpMenuView extends LinearLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: A */
    public int f40573A;

    /* JADX INFO: renamed from: B */
    public int f40574B;

    /* JADX INFO: renamed from: C */
    public MakeupCategory f40575C;

    /* JADX INFO: renamed from: D */
    public FeedMakeupPageAdapter.MakeupItem f40576D;

    /* JADX INFO: renamed from: E */
    public int f40577E;

    /* JADX INFO: renamed from: F */
    public int f40578F;

    /* JADX INFO: renamed from: G */
    public float f40579G;

    /* JADX INFO: renamed from: H */
    public float f40580H;

    /* JADX INFO: renamed from: I */
    public boolean f40581I;

    /* JADX INFO: renamed from: J */
    public y20<Boolean> f40582J;

    /* JADX INFO: renamed from: K */
    public ViewPager2.AbstractC0742i f40583K;

    /* JADX INFO: renamed from: a */
    public View f40584a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f40585b;

    /* JADX INFO: renamed from: c */
    public TabLayout f40586c;

    /* JADX INFO: renamed from: d */
    public ImageView f40587d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f40588e;

    /* JADX INFO: renamed from: f */
    public boolean f40589f;

    /* JADX INFO: renamed from: g */
    public boolean f40590g;

    /* JADX INFO: renamed from: h */
    public boolean f40591h;

    /* JADX INFO: renamed from: i */
    public b0m f40592i;

    /* JADX INFO: renamed from: j */
    public FeedMakeupPageAdapter f40593j;

    /* JADX INFO: renamed from: k */
    public C11352f f40594k;

    /* JADX INFO: renamed from: l */
    public C11355i f40595l;

    /* JADX INFO: renamed from: m */
    public x20 f40596m;

    /* JADX INFO: renamed from: n */
    public int f40597n;

    /* JADX INFO: renamed from: o */
    public FeedMakeupPageAdapter.MakeupItem f40598o;

    /* JADX INFO: renamed from: p */
    public float f40599p;

    /* JADX INFO: renamed from: q */
    public float f40600q;

    /* JADX INFO: renamed from: r */
    public List<MakeupCategory> f40601r;

    /* JADX INFO: renamed from: s */
    public List<C11352f.b> f40602s;

    /* JADX INFO: renamed from: t */
    public vxd0 f40603t;

    /* JADX INFO: renamed from: u */
    public HashMap<Integer, vxd0> f40604u;

    /* JADX INFO: renamed from: v */
    public Map<Integer, Integer> f40605v;

    /* JADX INFO: renamed from: w */
    public MakeupSharedViewModel f40606w;

    /* JADX INFO: renamed from: x */
    public int f40607x;

    /* JADX INFO: renamed from: y */
    public int f40608y;

    /* JADX INFO: renamed from: z */
    public int f40609z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView$a */
    public class C11340a implements y20<Boolean> {
        public C11340a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (NullChecker.m82486a(MakeUpMenuView.this.f40592i)) {
                MakeUpMenuView.this.f40592i.mo101308C(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView$b */
    public class C11341b extends ViewPager2.AbstractC0742i {
        public C11341b() {
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
            MakeUpMenuView.this.m62832j0(i);
        }
    }

    public MakeUpMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40589f = false;
        this.f40590g = false;
        this.f40591h = false;
        this.f40597n = 0;
        this.f40599p = 0.0f;
        this.f40600q = 0.0f;
        this.f40603t = new vxd0("feed_camera_makeup_tab_index", -1);
        this.f40604u = new HashMap<>();
        this.f40605v = new HashMap();
        this.f40607x = 1;
        this.f40608y = 0;
        this.f40609z = 0;
        this.f40573A = 0;
        this.f40574B = 0;
        this.f40581I = false;
        this.f40582J = new C11340a();
        this.f40583K = new C11341b();
    }

    /* JADX INFO: renamed from: C */
    private void m62796C() {
        bnl0.m105524M(this.f40588e, true);
        this.f40593j = new FeedMakeupPageAdapter(m62856r());
        C11352f c11352f = new C11352f(m62856r());
        this.f40594k = c11352f;
        c11352f.m62993C(this.f40582J);
        this.f40585b.setUserInputEnabled(false);
        this.f40585b.setAdapter(this.f40594k);
        this.f40585b.setOffscreenPageLimit(5);
        this.f40588e.setUserInputEnabled(false);
        this.f40588e.setAdapter(this.f40593j);
        this.f40588e.setOffscreenPageLimit(5);
        this.f40586c.setSelectedTabIndicatorHeight(0);
        this.f40586c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        C11355i c11355i = new C11355i(this.f40586c, this.f40588e, true, false, new C11355i.b() { // from class: l.xsw
            @Override // com.p051p1.mobile.putong.feed.newui.camera.widget.C11355i.b
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f196142a.m62808P(tab, i);
            }
        });
        this.f40595l = c11355i;
        c11355i.m63022a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m62797E(bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return;
        }
        this.f40576D = (FeedMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f40577E = ((Integer) bkj0Var.f77082b).intValue();
        ((Boolean) bkj0Var.f77083c).getClass();
        m62813V(0);
        this.f40592i.mo101325v(this.f40576D.beautyParameterMap);
        CameraEffectMgr.m62524V().m62586r0(this.f40576D.beautyParameterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m62798F(View view) {
        m62853i0();
        if (NullChecker.m82486a(this.f40596m)) {
            this.f40596m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m62799G(View view) {
        m62819a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m62800H(bkj0 bkj0Var) {
        this.f40576D = (FeedMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f40577E = ((Integer) bkj0Var.f77082b).intValue();
        boolean zBooleanValue = ((Boolean) bkj0Var.f77083c).booleanValue();
        boolean z = this.f40576D.hasNeg;
        float fM62591y = CameraEffectMgr.m62524V().m62591y(this.f40576D.type);
        this.f40579G = fM62591y;
        if (zBooleanValue) {
            this.f40592i.setFaceBeautyValue(this.f40576D.type, fM62591y);
        }
        CameraEffectMgr.m62524V().m62550X().m63043t(new bkj0<>(Boolean.valueOf(z), Float.valueOf(this.f40580H), Float.valueOf(this.f40579G)));
        CameraEffectMgr.m62524V().m62584q0(this.f40576D.type, this.f40579G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m62801I(bkj0 bkj0Var) {
        this.f40576D = (FeedMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f40577E = ((Integer) bkj0Var.f77082b).intValue();
        boolean z = this.f40576D.hasNeg;
        float fM62539K = CameraEffectMgr.m62524V().m62539K(this.f40576D.type);
        this.f40579G = fM62539K;
        this.f40592i.setFaceBeautyValue(this.f40576D.type, fM62539K);
        CameraEffectMgr.m62524V().m62550X().m63043t(new bkj0<>(Boolean.valueOf(z), Float.valueOf(this.f40580H), Float.valueOf(this.f40579G)));
        CameraEffectMgr.m62524V().m62584q0(this.f40576D.type, this.f40579G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m62802J() {
        b0m b0mVar = this.f40592i;
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f40576D;
        b0mVar.mo101311M(makeupItem.type, makeupItem.modelFilePath);
        this.f40592i.mo101321o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f40576D.lut);
        this.f40592i.mo101321o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f40576D.all);
        CameraEffectMgr cameraEffectMgrM62524V = CameraEffectMgr.m62524V();
        FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f40576D;
        cameraEffectMgrM62524V.m62552a(makeupItem2.type, makeupItem2.modelFilePath);
        CameraEffectMgr.m62524V().m62587s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f40576D.lut);
        CameraEffectMgr.m62524V().m62587s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f40576D.all);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m62803K(bkj0 bkj0Var) {
        this.f40576D = (FeedMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f40577E = ((Integer) bkj0Var.f77082b).intValue();
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f40576D;
        this.f40579G = makeupItem.all;
        this.f40580H = makeupItem.lut;
        boolean zBooleanValue = ((Boolean) bkj0Var.f77083c).booleanValue();
        CameraEffectMgr.m62524V().m62550X().m63043t(new bkj0<>(Boolean.valueOf(this.f40576D.hasNeg), Float.valueOf(this.f40576D.lut), Float.valueOf(this.f40576D.all)));
        if (this.f40576D.isNone()) {
            if (zBooleanValue) {
                m62811T();
            }
            m62813V(0);
        } else {
            m62813V(2);
            m62827f0();
            l51.m152908n(new Runnable() { // from class: l.vsw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185671a.m62802J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m62804L(bkj0 bkj0Var) {
        this.f40575C = (MakeupCategory) bkj0Var.f77081a;
        this.f40577E = ((Integer) bkj0Var.f77082b).intValue();
        this.f40578F = ((Integer) bkj0Var.f77082b).intValue();
        if (this.f40575C.isNone()) {
            m62825e0(false);
            getBeautyMakeupPage().m62677x();
        } else {
            this.f40577E = CameraEffectMgr.m62524V().m62534D(this.f40575C.type);
        }
        CameraEffectMgr.m62524V().m62567h0(this.f40578F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m62805M(bkj0 bkj0Var) {
        this.f40576D = (FeedMakeupPageAdapter.MakeupItem) bkj0Var.f77081a;
        this.f40577E = ((Integer) bkj0Var.f77082b).intValue();
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f40576D;
        this.f40580H = makeupItem.lut;
        this.f40579G = makeupItem.all;
        if (!makeupItem.isNone()) {
            m62817Z();
            m62813V(1);
            b0m b0mVar = this.f40592i;
            FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f40576D;
            b0mVar.mo101311M(makeupItem2.type, makeupItem2.modelFilePath);
            b0m b0mVar2 = this.f40592i;
            FeedMakeupPageAdapter.MakeupItem makeupItem3 = this.f40576D;
            b0mVar2.mo101321o(makeupItem3.type, makeupItem3.all);
            CameraEffectMgr.m62524V().m62550X().m63043t(new bkj0<>(Boolean.FALSE, Float.valueOf(this.f40576D.lut), Float.valueOf(this.f40576D.all)));
            CameraEffectMgr cameraEffectMgrM62524V = CameraEffectMgr.m62524V();
            FeedMakeupPageAdapter.MakeupItem makeupItem4 = this.f40576D;
            cameraEffectMgrM62524V.m62552a(makeupItem4.type, makeupItem4.modelFilePath);
            m62834k0();
        }
        if (((Boolean) bkj0Var.f77083c).booleanValue()) {
            if (this.f40576D.isNone()) {
                m62816Y();
                m62813V(0);
            }
            CameraEffectMgr.m62524V().m62576m0(this.f40575C.type, this.f40577E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m62806N(Pair pair) {
        this.f40580H = ((Float) pair.first).floatValue();
        this.f40576D.lut = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            this.f40592i.mo101321o(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f40580H);
            m62834k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m62807O(Pair pair) {
        this.f40579G = ((Float) pair.first).floatValue();
        this.f40576D.all = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            int i = this.f40597n;
            if (i == 4) {
                this.f40592i.mo101321o(this.f40576D.type, this.f40579G);
            } else {
                b0m b0mVar = this.f40592i;
                if (i == 3) {
                    b0mVar.mo101321o(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f40579G);
                } else {
                    b0mVar.setFaceBeautyValue(this.f40576D.type, this.f40579G);
                }
            }
            m62834k0();
            m62841u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m62808P(TabLayout.Tab tab, int i) {
        tab.setCustomView(m62857s(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m62809Q() {
        this.f40592i.mo101325v(this.f40598o.beautyParameterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m62810R() {
        if (this.f40591h) {
            return;
        }
        m62837m0(this.f40597n);
        CameraEffectMgr.m62524V().m62561e0();
        this.f40591h = true;
    }

    /* JADX INFO: renamed from: T */
    private void m62811T() {
        this.f40592i.mo101323t();
        CameraEffectMgr.m62524V().m62560e();
        CameraEffectMgr.m62524V().m62558d();
        CameraEffectMgr.m62524V().m62571j0(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX INFO: renamed from: U */
    private void m62812U() {
        int i;
        int selectedTabPosition = this.f40586c.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            i = 0;
        } else {
            i = 1;
            if (selectedTabPosition != 1 && selectedTabPosition != 2) {
                if (selectedTabPosition != 3 || this.f40576D.isNone()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        }
        CameraEffectMgr.m62524V().m62550X().m63042s(new Pair<>(Integer.valueOf(selectedTabPosition), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: V */
    private void m62813V(int i) {
        CameraEffectMgr.m62524V().m62550X().m63042s(new Pair<>(Integer.valueOf(this.f40597n), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: W */
    private void m62814W() {
        int selectedTabPosition = this.f40586c.getSelectedTabPosition();
        this.f40597n = selectedTabPosition;
        this.f40606w.m63045v(selectedTabPosition);
    }

    /* JADX INFO: renamed from: X */
    private void m62815X(TabLayout.Tab tab, int i) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m62816Y() {
        MakeupCategory makeupCategory = this.f40575C;
        if (makeupCategory == null || makeupCategory.type == null) {
            return;
        }
        makeupCategory.all = 0.0f;
        CameraEffectMgr.m62524V().m62582p0(this.f40575C.type, 0.0f);
        this.f40592i.mo101322p(this.f40575C.type);
    }

    /* JADX INFO: renamed from: Z */
    private void m62817Z() {
        if (this.f40581I) {
            return;
        }
        m62811T();
        this.f40581I = true;
    }

    /* JADX INFO: renamed from: a0 */
    private void m62819a0() {
        m62821b0(this.f40597n);
    }

    /* JADX INFO: renamed from: b0 */
    private void m62821b0(int i) {
        if (i == 0) {
            m62849c0((FeedMakeupPageView) this.f40588e.findViewWithTag(Integer.valueOf(this.f40597n)));
            return;
        }
        if (i == 1) {
            m62850d0((FeedMakeupPageView) this.f40588e.findViewWithTag(Integer.valueOf(this.f40597n)));
            return;
        }
        if (i == 2) {
            m62851g0((FeedMakeupPageView) this.f40588e.findViewWithTag(Integer.valueOf(this.f40597n)));
        } else if (i == 3) {
            m62852h0((FeedMakeupPageView) this.f40588e.findViewWithTag(Integer.valueOf(this.f40597n)));
        } else if (i == 4) {
            m62825e0(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m62825e0(boolean z) {
        if (CameraEffectMgr.m62524V().m62535E() != 0 && this.f40575C != null && CameraEffectMgr.m62524V().m62545R()) {
            this.f40592i.mo101323t();
        }
        FeedBeautyMakeupPageView beautyMakeupPage = getBeautyMakeupPage();
        if (beautyMakeupPage != null) {
            beautyMakeupPage.m62678y();
            beautyMakeupPage.m62677x();
        }
        CameraEffectMgr.m62524V().m62560e();
        CameraEffectMgr.m62524V().m62558d();
        CameraEffectMgr.m62524V().m62556c();
        CameraEffectMgr.m62524V().m62554b();
        if (z) {
            CameraEffectMgr.m62524V().m62555b0();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m62827f0() {
        this.f40581I = false;
        this.f40592i.mo101323t();
        CameraEffectMgr.m62524V().m62560e();
        CameraEffectMgr.m62524V().m62554b();
        getBeautyMakeupPage().m62677x();
    }

    private FeedBeautyMakeupPageView getBeautyMakeupPage() {
        return (FeedBeautyMakeupPageView) this.f40588e.findViewWithTag(4);
    }

    private FeedMakeupPageView getCurrentPageView() {
        return (FeedMakeupPageView) this.f40588e.findViewWithTag(Integer.valueOf(this.f40597n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m62832j0(int i) {
        m62854l0(i);
        m62837m0(i);
    }

    /* JADX INFO: renamed from: k0 */
    private void m62834k0() {
        int i = this.f40597n;
        if (i == 1 || i == 2) {
            getCurrentPageView().m62716k(this.f40577E);
            CameraEffectMgr.m62524V().m62584q0(this.f40576D.type, this.f40579G);
            CameraEffectMgr.m62524V().m62580o0(this.f40576D.type, this.f40579G);
            return;
        }
        if (i == 3) {
            CameraEffectMgr.m62524V().m62588t0(this.f40576D.modelFilePath, this.f40580H, this.f40579G);
            CameraEffectMgr.m62524V().m62587s0(ILightningRender.IMakeupLevel.MAKEUP_LUT, this.f40576D.lut);
            CameraEffectMgr.m62524V().m62587s0(ILightningRender.IMakeupLevel.MAKEUP_ALL, this.f40576D.all);
        } else {
            if (i != 4) {
                return;
            }
            this.f40575C.all = this.f40579G;
            getBeautyMakeupPage().m62674u(this.f40578F);
            getBeautyMakeupPage().m62675v(this.f40577E);
            CameraEffectMgr.m62524V().m62582p0(this.f40575C.type, this.f40579G);
            CameraEffectMgr.m62524V().m62576m0(this.f40575C.type, this.f40577E);
            CameraEffectMgr.m62524V().m62574l0(this.f40575C.type, this.f40579G);
            CameraEffectMgr.m62524V().m62587s0(this.f40576D.type, this.f40579G);
            CameraEffectMgr.m62524V().m62578n0(this.f40576D.modelFilePath, Float.valueOf(this.f40579G));
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m62837m0(int i) {
        if (i != -1) {
            this.f40597n = i;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m62841u() {
        int i = this.f40597n;
        if (i == 1 || i == 2) {
            CameraEffectMgr.m62524V().m62563f0(-1);
            m62858t((FeedMakeupPageView) this.f40588e.findViewWithTag(0));
        }
    }

    /* JADX INFO: renamed from: v */
    private float m62842v(String str) {
        return CameraEffectMgr.m62521H(str);
    }

    /* JADX INFO: renamed from: x */
    private void m62843x(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        this.f40601r = CameraEffectMgr.m62524V().m62573l(list);
        this.f40602s = CameraEffectMgr.m62524V().m62566h();
        CameraEffectMgr.m62524V().m62568i(list2);
        this.f40590g = true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: z */
    private void m62844z() {
        this.f40594k.m62994y(this.f40602s);
        this.f40593j.m62699N(this.f40601r);
        CameraEffectMgr.m62524V().m62550X().m63035l().m2984i(m62856r(), new cb50() { // from class: l.ysw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f201469a.m62797E((bkj0) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63025b().m2984i(m62856r(), new cb50() { // from class: l.zsw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f205899a.m62800H((bkj0) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63029f().m2984i(m62856r(), new cb50() { // from class: l.atw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f73416a.m62801I((bkj0) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63032i().m2984i(m62856r(), new cb50() { // from class: l.btw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f78414a.m62803K((bkj0) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63026c().m2984i(m62856r(), new cb50() { // from class: l.ctw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f83766a.m62804L((bkj0) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63027d().m2984i(m62856r(), new cb50() { // from class: l.dtw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f90631a.m62805M((bkj0) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63028e().m2984i(m62856r(), new cb50() { // from class: l.etw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f95819a.m62806N((Pair) obj);
            }
        });
        CameraEffectMgr.m62524V().m62550X().m63024a().m2984i(m62856r(), new cb50() { // from class: l.ftw
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f100814a.m62807O((Pair) obj);
            }
        });
        this.f40588e.m4249g(this.f40583K);
        this.f40584a.setOnClickListener(new View.OnClickListener() { // from class: l.tsw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176046a.m62798F(view);
            }
        });
        this.f40587d.setOnClickListener(new View.OnClickListener() { // from class: l.usw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180869a.m62799G(view);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m62845A(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        m62843x(list, list2);
        m62796C();
        m62844z();
    }

    /* JADX INFO: renamed from: B */
    public void m62846B(b0m b0mVar) {
        this.f40592i = b0mVar;
        CameraEffectMgr.m62524V().m62547T(b0mVar);
    }

    /* JADX INFO: renamed from: D */
    public void m62847D() {
        CameraEffectMgr.m62524V().m62548U(m62856r());
        this.f40606w = CameraEffectMgr.m62524V().m62550X();
    }

    /* JADX INFO: renamed from: S */
    public void m62848S() {
        this.f40591h = false;
        if (this.f40590g) {
            CameraEffectMgr.m62524V().m62549W();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m62849c0(FeedMakeupPageView feedMakeupPageView) {
        feedMakeupPageView.m62720o(1, 0);
        l51.m152908n(new Runnable() { // from class: l.wsw
            @Override // java.lang.Runnable
            public final void run() {
                this.f190702a.m62809Q();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m62850d0(FeedMakeupPageView feedMakeupPageView) {
        this.f40592i.setFaceBeautyValue("skin_smooth", m62842v("skin_smooth"));
        this.f40592i.setFaceBeautyValue("skin_whitening", m62842v("skin_whitening"));
        this.f40592i.setFaceBeautyValue("skin_ruddy", m62842v("skin_ruddy"));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.BIG_EYE, m62842v(FaceBeautyID.BIG_EYE));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.THIN_FACE, m62842v(FaceBeautyID.THIN_FACE));
        this.f40592i.setFaceBeautyValue("skin_sharpen", m62842v("skin_sharpen"));
        CameraEffectMgr.m62524V().m62551Z();
        CameraEffectMgr.m62524V().m62553a0();
        feedMakeupPageView.m62717l();
        feedMakeupPageView.m62720o(0, 0);
        m62858t(m62859w(0));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m62851g0(FeedMakeupPageView feedMakeupPageView) {
        this.f40592i.setFaceBeautyValue(FaceBeautyID.FACE_WIDTH, m62842v(FaceBeautyID.FACE_WIDTH));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.JAW_SHAPE, m62842v(FaceBeautyID.JAW_SHAPE));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.SHORTEN_FACE, m62842v(FaceBeautyID.SHORTEN_FACE));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.FOREHEAD, m62842v(FaceBeautyID.FOREHEAD));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.CHIN_LENGTH, m62842v(FaceBeautyID.CHIN_LENGTH));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.CHEEKBONE_WIDTH, m62842v(FaceBeautyID.CHEEKBONE_WIDTH));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.JAW_WIDTH, m62842v(FaceBeautyID.JAW_WIDTH));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.NOSE_WIDTH, m62842v(FaceBeautyID.NOSE_WIDTH));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.NOSE_SIZE, m62842v(FaceBeautyID.NOSE_SIZE));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.NOSE_LIFT, m62842v(FaceBeautyID.NOSE_LIFT));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.NOSE_RIDGE_WIDTH, m62842v(FaceBeautyID.NOSE_RIDGE_WIDTH));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.NOSE_TIP_SIZE, m62842v(FaceBeautyID.NOSE_TIP_SIZE));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.EYE_TILT, m62842v(FaceBeautyID.EYE_TILT));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.EYE_DISTANCE, m62842v(FaceBeautyID.EYE_DISTANCE));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.LIP_THICKNESS, m62842v(FaceBeautyID.LIP_THICKNESS));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.MOUTH_SIZE, m62842v(FaceBeautyID.MOUTH_SIZE));
        this.f40592i.setFaceBeautyValue("remove_pouch", m62842v("remove_pouch"));
        this.f40592i.setFaceBeautyValue("remove_nasolabial_floads", m62842v("remove_nasolabial_floads"));
        this.f40592i.setFaceBeautyValue("eye_brighten", m62842v("eye_brighten"));
        this.f40592i.setFaceBeautyValue("teeth_whiten", m62842v("teeth_whiten"));
        this.f40592i.setFaceBeautyValue(FaceBeautyID.EYE_HEIGHT, m62842v(FaceBeautyID.EYE_HEIGHT));
        CameraEffectMgr.m62524V().m62557c0();
        CameraEffectMgr.m62524V().m62553a0();
        feedMakeupPageView.m62717l();
        feedMakeupPageView.m62720o(0, 0);
        m62858t(m62859w(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m62852h0(FeedMakeupPageView feedMakeupPageView) {
        if (CameraEffectMgr.m62524V().m62542O() != 0) {
            this.f40592i.mo101323t();
        }
        feedMakeupPageView.m62720o(0, 0);
        CameraEffectMgr.m62524V().m62559d0();
        CameraEffectMgr.m62524V().m62564g();
        CameraEffectMgr.m62524V().m62560e();
        CameraEffectMgr.m62524V().m62558d();
        CameraEffectMgr.m62524V().m62562f();
    }

    /* JADX INFO: renamed from: i0 */
    public void m62853i0() {
        l51.m152919y(new Runnable() { // from class: l.ssw
            @Override // java.lang.Runnable
            public final void run() {
                this.f170524a.m62810R();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m62854l0(int i) {
        this.f40585b.m4252j(i, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62855q(this);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        m62815X(tab, Color.parseColor("#ffffff"));
        m62814W();
        m62812U();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        m62815X(tab, Color.parseColor("#80ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m62855q(View view) {
        gtw.m132258a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m62856r() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: s */
    public TextView m62857s(int i) {
        String str = CameraEffectMgr.m62524V().m62538J().get(i).name;
        TextView textView = new TextView(m62856r());
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
        this.f40596m = x20Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m62858t(FeedMakeupPageView feedMakeupPageView) {
        feedMakeupPageView.m62720o(-1, 0);
        CameraEffectMgr.m62524V().m62563f0(-1);
    }

    /* JADX INFO: renamed from: w */
    public final FeedMakeupPageView m62859w(int i) {
        return (FeedMakeupPageView) this.f40588e.findViewWithTag(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y */
    public void m62860y() {
        if (this.f40589f) {
            return;
        }
        CameraEffectMgr.m62524V().m62546S();
        this.f40589f = true;
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
            this.f40065id = cameraCategory.f40065id;
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
