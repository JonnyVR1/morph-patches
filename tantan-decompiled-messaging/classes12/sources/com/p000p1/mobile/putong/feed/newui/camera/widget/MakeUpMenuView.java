package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import com.p000p1.mobile.putong.feed.data.CameraBeautyMode;
import com.p000p1.mobile.putong.feed.data.CameraCategory;
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.widget.viewmodel.MakeupSharedViewModel;
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
import p007l.hqw;
import p007l.ixl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MakeUpMenuView extends LinearLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: A */
    public int f1186A;

    /* JADX INFO: renamed from: B */
    public int f1187B;

    /* JADX INFO: renamed from: C */
    public MakeupCategory f1188C;

    /* JADX INFO: renamed from: D */
    public FeedMakeupPageAdapter.MakeupItem f1189D;

    /* JADX INFO: renamed from: E */
    public int f1190E;

    /* JADX INFO: renamed from: F */
    public int f1191F;

    /* JADX INFO: renamed from: G */
    public float f1192G;

    /* JADX INFO: renamed from: H */
    public float f1193H;

    /* JADX INFO: renamed from: I */
    public boolean f1194I;

    /* JADX INFO: renamed from: J */
    public e30<Boolean> f1195J;

    /* JADX INFO: renamed from: K */
    public ViewPager2.i f1196K;

    /* JADX INFO: renamed from: a */
    public View f1197a;

    /* JADX INFO: renamed from: b */
    public ViewPager2 f1198b;

    /* JADX INFO: renamed from: c */
    public TabLayout f1199c;

    /* JADX INFO: renamed from: d */
    public ImageView f1200d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f1201e;

    /* JADX INFO: renamed from: f */
    public boolean f1202f;

    /* JADX INFO: renamed from: g */
    public boolean f1203g;

    /* JADX INFO: renamed from: h */
    public boolean f1204h;

    /* JADX INFO: renamed from: i */
    public ixl f1205i;

    /* JADX INFO: renamed from: j */
    public FeedMakeupPageAdapter f1206j;

    /* JADX INFO: renamed from: k */
    public C2033f f1207k;

    /* JADX INFO: renamed from: l */
    public C2036i f1208l;

    /* JADX INFO: renamed from: m */
    public d30 f1209m;

    /* JADX INFO: renamed from: n */
    public int f1210n;

    /* JADX INFO: renamed from: o */
    public FeedMakeupPageAdapter.MakeupItem f1211o;

    /* JADX INFO: renamed from: p */
    public float f1212p;

    /* JADX INFO: renamed from: q */
    public float f1213q;

    /* JADX INFO: renamed from: r */
    public List<MakeupCategory> f1214r;

    /* JADX INFO: renamed from: s */
    public List<C2033f.b> f1215s;

    /* JADX INFO: renamed from: t */
    public tpd0 f1216t;

    /* JADX INFO: renamed from: u */
    public HashMap<Integer, tpd0> f1217u;

    /* JADX INFO: renamed from: v */
    public Map<Integer, Integer> f1218v;

    /* JADX INFO: renamed from: w */
    public MakeupSharedViewModel f1219w;

    /* JADX INFO: renamed from: x */
    public int f1220x;

    /* JADX INFO: renamed from: y */
    public int f1221y;

    /* JADX INFO: renamed from: z */
    public int f1222z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView$a */
    public class C2021a implements e30<Boolean> {
        public C2021a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            if (NullChecker.a(MakeUpMenuView.this.f1205i)) {
                MakeUpMenuView.this.f1205i.mo11039C(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView$b */
    public class C2022b extends ViewPager2.i {
        public C2022b() {
        }

        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
        }

        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
        }

        public void onPageSelected(int i) {
            MakeUpMenuView.this.m2600j0(i);
        }
    }

    public MakeUpMenuView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1202f = false;
        this.f1203g = false;
        this.f1204h = false;
        this.f1210n = 0;
        this.f1212p = 0.0f;
        this.f1213q = 0.0f;
        this.f1216t = new tpd0("feed_camera_makeup_tab_index", -1);
        this.f1217u = new HashMap<>();
        this.f1218v = new HashMap();
        this.f1220x = 1;
        this.f1221y = 0;
        this.f1222z = 0;
        this.f1186A = 0;
        this.f1187B = 0;
        this.f1194I = false;
        this.f1195J = new C2021a();
        this.f1196K = new C2022b();
    }

    /* JADX INFO: renamed from: C */
    private void m2564C() {
        xdl0.M(this.f1201e, true);
        this.f1206j = new FeedMakeupPageAdapter(m2624r());
        C2033f c2033f = new C2033f(m2624r());
        this.f1207k = c2033f;
        c2033f.m2774C(this.f1195J);
        this.f1198b.setUserInputEnabled(false);
        this.f1198b.setAdapter(this.f1207k);
        this.f1198b.setOffscreenPageLimit(5);
        this.f1201e.setUserInputEnabled(false);
        this.f1201e.setAdapter(this.f1206j);
        this.f1201e.setOffscreenPageLimit(5);
        this.f1199c.setSelectedTabIndicatorHeight(0);
        this.f1199c.addOnTabSelectedListener(this);
        C2036i c2036i = new C2036i(this.f1199c, this.f1201e, true, false, new C2036i.b() { // from class: l.ypw
            @Override // com.p000p1.mobile.putong.feed.newui.camera.widget.C2036i.b
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f15488a.m2576P(tab, i);
            }
        });
        this.f1208l = c2036i;
        c2036i.m2806a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m2565E(xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return;
        }
        this.f1189D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f1190E = ((Integer) xaj0Var.b).intValue();
        ((Boolean) xaj0Var.c).getClass();
        m2581V(0);
        this.f1205i.mo11056v(this.f1189D.beautyParameterMap);
        CameraEffectMgr.m2289V().m2351r0(this.f1189D.beautyParameterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m2566F(View view) {
        m2621i0();
        if (NullChecker.a(this.f1209m)) {
            this.f1209m.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m2567G(View view) {
        m2587a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m2568H(xaj0 xaj0Var) {
        this.f1189D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f1190E = ((Integer) xaj0Var.b).intValue();
        boolean zBooleanValue = ((Boolean) xaj0Var.c).booleanValue();
        boolean z = this.f1189D.hasNeg;
        float fM2356y = CameraEffectMgr.m2289V().m2356y(this.f1189D.type);
        this.f1192G = fM2356y;
        if (zBooleanValue) {
            this.f1205i.setFaceBeautyValue(this.f1189D.type, fM2356y);
        }
        CameraEffectMgr.m2289V().m2315X().m2827t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f1193H), Float.valueOf(this.f1192G)));
        CameraEffectMgr.m2289V().m2349q0(this.f1189D.type, this.f1192G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m2569I(xaj0 xaj0Var) {
        this.f1189D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f1190E = ((Integer) xaj0Var.b).intValue();
        boolean z = this.f1189D.hasNeg;
        float fM2304K = CameraEffectMgr.m2289V().m2304K(this.f1189D.type);
        this.f1192G = fM2304K;
        this.f1205i.setFaceBeautyValue(this.f1189D.type, fM2304K);
        CameraEffectMgr.m2289V().m2315X().m2827t(new xaj0<>(Boolean.valueOf(z), Float.valueOf(this.f1193H), Float.valueOf(this.f1192G)));
        CameraEffectMgr.m2289V().m2349q0(this.f1189D.type, this.f1192G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m2570J() {
        ixl ixlVar = this.f1205i;
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f1189D;
        ixlVar.mo11042M(makeupItem.type, makeupItem.modelFilePath);
        this.f1205i.mo11052o("makeup_lut", this.f1189D.lut);
        this.f1205i.mo11052o("makeup_all", this.f1189D.all);
        CameraEffectMgr cameraEffectMgrM2289V = CameraEffectMgr.m2289V();
        FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f1189D;
        cameraEffectMgrM2289V.m2317a(makeupItem2.type, makeupItem2.modelFilePath);
        CameraEffectMgr.m2289V().m2352s0("makeup_lut", this.f1189D.lut);
        CameraEffectMgr.m2289V().m2352s0("makeup_all", this.f1189D.all);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m2571K(xaj0 xaj0Var) {
        this.f1189D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f1190E = ((Integer) xaj0Var.b).intValue();
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f1189D;
        this.f1192G = makeupItem.all;
        this.f1193H = makeupItem.lut;
        boolean zBooleanValue = ((Boolean) xaj0Var.c).booleanValue();
        CameraEffectMgr.m2289V().m2315X().m2827t(new xaj0<>(Boolean.valueOf(this.f1189D.hasNeg), Float.valueOf(this.f1189D.lut), Float.valueOf(this.f1189D.all)));
        if (this.f1189D.isNone()) {
            if (zBooleanValue) {
                m2579T();
            }
            m2581V(0);
        } else {
            m2581V(2);
            m2595f0();
            e51.n(new Runnable() { // from class: l.wpw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14659a.m2570J();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m2572L(xaj0 xaj0Var) {
        this.f1188C = (MakeupCategory) xaj0Var.a;
        this.f1190E = ((Integer) xaj0Var.b).intValue();
        this.f1191F = ((Integer) xaj0Var.b).intValue();
        if (this.f1188C.isNone()) {
            m2593e0(false);
            getBeautyMakeupPage().m2445x();
        } else {
            this.f1190E = CameraEffectMgr.m2289V().m2299D(this.f1188C.type);
        }
        CameraEffectMgr.m2289V().m2332h0(this.f1191F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m2573M(xaj0 xaj0Var) {
        this.f1189D = (FeedMakeupPageAdapter.MakeupItem) xaj0Var.a;
        this.f1190E = ((Integer) xaj0Var.b).intValue();
        FeedMakeupPageAdapter.MakeupItem makeupItem = this.f1189D;
        this.f1193H = makeupItem.lut;
        this.f1192G = makeupItem.all;
        if (!makeupItem.isNone()) {
            m2585Z();
            m2581V(1);
            ixl ixlVar = this.f1205i;
            FeedMakeupPageAdapter.MakeupItem makeupItem2 = this.f1189D;
            ixlVar.mo11042M(makeupItem2.type, makeupItem2.modelFilePath);
            ixl ixlVar2 = this.f1205i;
            FeedMakeupPageAdapter.MakeupItem makeupItem3 = this.f1189D;
            ixlVar2.mo11052o(makeupItem3.type, makeupItem3.all);
            CameraEffectMgr.m2289V().m2315X().m2827t(new xaj0<>(Boolean.FALSE, Float.valueOf(this.f1189D.lut), Float.valueOf(this.f1189D.all)));
            CameraEffectMgr cameraEffectMgrM2289V = CameraEffectMgr.m2289V();
            FeedMakeupPageAdapter.MakeupItem makeupItem4 = this.f1189D;
            cameraEffectMgrM2289V.m2317a(makeupItem4.type, makeupItem4.modelFilePath);
            m2602k0();
        }
        if (((Boolean) xaj0Var.c).booleanValue()) {
            if (this.f1189D.isNone()) {
                m2584Y();
                m2581V(0);
            }
            CameraEffectMgr.m2289V().m2341m0(this.f1188C.type, this.f1190E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m2574N(Pair pair) {
        this.f1193H = ((Float) pair.first).floatValue();
        this.f1189D.lut = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            this.f1205i.mo11052o("makeup_lut", this.f1193H);
            m2602k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m2575O(Pair pair) {
        this.f1192G = ((Float) pair.first).floatValue();
        this.f1189D.all = ((Float) pair.first).floatValue();
        if (((Boolean) pair.second).booleanValue()) {
            int i = this.f1210n;
            if (i == 4) {
                this.f1205i.mo11052o(this.f1189D.type, this.f1192G);
            } else {
                ixl ixlVar = this.f1205i;
                if (i == 3) {
                    ixlVar.mo11052o("makeup_all", this.f1192G);
                } else {
                    ixlVar.setFaceBeautyValue(this.f1189D.type, this.f1192G);
                }
            }
            m2602k0();
            m2609u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m2576P(TabLayout.Tab tab, int i) {
        tab.setCustomView(m2625s(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m2577Q() {
        this.f1205i.mo11056v(this.f1211o.beautyParameterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m2578R() {
        if (this.f1204h) {
            return;
        }
        m2605m0(this.f1210n);
        CameraEffectMgr.m2289V().m2326e0();
        this.f1204h = true;
    }

    /* JADX INFO: renamed from: T */
    private void m2579T() {
        this.f1205i.mo11054t();
        CameraEffectMgr.m2289V().m2325e();
        CameraEffectMgr.m2289V().m2323d();
        CameraEffectMgr.m2289V().m2336j0(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    /* JADX INFO: renamed from: U */
    private void m2580U() {
        int i;
        int selectedTabPosition = this.f1199c.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            i = 0;
        } else {
            i = 1;
            if (selectedTabPosition != 1 && selectedTabPosition != 2) {
                if (selectedTabPosition != 3 || this.f1189D.isNone()) {
                    i = 0;
                } else {
                    i = 2;
                }
            }
        }
        CameraEffectMgr.m2289V().m2315X().m2826s(new Pair<>(Integer.valueOf(selectedTabPosition), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: V */
    private void m2581V(int i) {
        CameraEffectMgr.m2289V().m2315X().m2826s(new Pair<>(Integer.valueOf(this.f1210n), Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: W */
    private void m2582W() {
        int selectedTabPosition = this.f1199c.getSelectedTabPosition();
        this.f1210n = selectedTabPosition;
        this.f1219w.m2829v(selectedTabPosition);
    }

    /* JADX INFO: renamed from: X */
    private void m2583X(TabLayout.Tab tab, int i) {
        TextView textView = (TextView) tab.getCustomView();
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m2584Y() {
        MakeupCategory makeupCategory = this.f1188C;
        if (makeupCategory == null || makeupCategory.type == null) {
            return;
        }
        makeupCategory.all = 0.0f;
        CameraEffectMgr.m2289V().m2347p0(this.f1188C.type, 0.0f);
        this.f1205i.mo11053p(this.f1188C.type);
    }

    /* JADX INFO: renamed from: Z */
    private void m2585Z() {
        if (this.f1194I) {
            return;
        }
        m2579T();
        this.f1194I = true;
    }

    /* JADX INFO: renamed from: a0 */
    private void m2587a0() {
        m2589b0(this.f1210n);
    }

    /* JADX INFO: renamed from: b0 */
    private void m2589b0(int i) {
        if (i == 0) {
            m2617c0((FeedMakeupPageView) this.f1201e.findViewWithTag(Integer.valueOf(this.f1210n)));
            return;
        }
        if (i == 1) {
            m2618d0((FeedMakeupPageView) this.f1201e.findViewWithTag(Integer.valueOf(this.f1210n)));
            return;
        }
        if (i == 2) {
            m2619g0((FeedMakeupPageView) this.f1201e.findViewWithTag(Integer.valueOf(this.f1210n)));
        } else if (i == 3) {
            m2620h0((FeedMakeupPageView) this.f1201e.findViewWithTag(Integer.valueOf(this.f1210n)));
        } else if (i == 4) {
            m2593e0(true);
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m2593e0(boolean z) {
        if (CameraEffectMgr.m2289V().m2300E() != 0 && this.f1188C != null && CameraEffectMgr.m2289V().m2310R()) {
            this.f1205i.mo11054t();
        }
        FeedBeautyMakeupPageView beautyMakeupPage = getBeautyMakeupPage();
        if (beautyMakeupPage != null) {
            beautyMakeupPage.m2446y();
            beautyMakeupPage.m2445x();
        }
        CameraEffectMgr.m2289V().m2325e();
        CameraEffectMgr.m2289V().m2323d();
        CameraEffectMgr.m2289V().m2321c();
        CameraEffectMgr.m2289V().m2319b();
        if (z) {
            CameraEffectMgr.m2289V().m2320b0();
        }
    }

    /* JADX INFO: renamed from: f0 */
    private void m2595f0() {
        this.f1194I = false;
        this.f1205i.mo11054t();
        CameraEffectMgr.m2289V().m2325e();
        CameraEffectMgr.m2289V().m2319b();
        getBeautyMakeupPage().m2445x();
    }

    private FeedBeautyMakeupPageView getBeautyMakeupPage() {
        return (FeedBeautyMakeupPageView) this.f1201e.findViewWithTag(4);
    }

    private FeedMakeupPageView getCurrentPageView() {
        return (FeedMakeupPageView) this.f1201e.findViewWithTag(Integer.valueOf(this.f1210n));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public void m2600j0(int i) {
        m2622l0(i);
        m2605m0(i);
    }

    /* JADX INFO: renamed from: k0 */
    private void m2602k0() {
        int i = this.f1210n;
        if (i == 1 || i == 2) {
            getCurrentPageView().m2484k(this.f1190E);
            CameraEffectMgr.m2289V().m2349q0(this.f1189D.type, this.f1192G);
            CameraEffectMgr.m2289V().m2345o0(this.f1189D.type, this.f1192G);
            return;
        }
        if (i == 3) {
            CameraEffectMgr.m2289V().m2353t0(this.f1189D.modelFilePath, this.f1193H, this.f1192G);
            CameraEffectMgr.m2289V().m2352s0("makeup_lut", this.f1189D.lut);
            CameraEffectMgr.m2289V().m2352s0("makeup_all", this.f1189D.all);
        } else {
            if (i != 4) {
                return;
            }
            this.f1188C.all = this.f1192G;
            getBeautyMakeupPage().m2442u(this.f1191F);
            getBeautyMakeupPage().m2443v(this.f1190E);
            CameraEffectMgr.m2289V().m2347p0(this.f1188C.type, this.f1192G);
            CameraEffectMgr.m2289V().m2341m0(this.f1188C.type, this.f1190E);
            CameraEffectMgr.m2289V().m2339l0(this.f1188C.type, this.f1192G);
            CameraEffectMgr.m2289V().m2352s0(this.f1189D.type, this.f1192G);
            CameraEffectMgr.m2289V().m2343n0(this.f1189D.modelFilePath, Float.valueOf(this.f1192G));
        }
    }

    /* JADX INFO: renamed from: m0 */
    private void m2605m0(int i) {
        if (i != -1) {
            this.f1210n = i;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m2609u() {
        int i = this.f1210n;
        if (i == 1 || i == 2) {
            CameraEffectMgr.m2289V().m2328f0(-1);
            m2626t((FeedMakeupPageView) this.f1201e.findViewWithTag(0));
        }
    }

    /* JADX INFO: renamed from: v */
    private float m2610v(String str) {
        return CameraEffectMgr.m2286H(str);
    }

    /* JADX INFO: renamed from: x */
    private void m2611x(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        this.f1214r = CameraEffectMgr.m2289V().m2338l(list);
        this.f1215s = CameraEffectMgr.m2289V().m2331h();
        CameraEffectMgr.m2289V().m2333i(list2);
        this.f1203g = true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: z */
    private void m2612z() {
        this.f1207k.m2775y(this.f1215s);
        this.f1206j.m2467N(this.f1214r);
        CameraEffectMgr.m2289V().m2315X().m2819l().i(m2624r(), new n250() { // from class: l.zpw
            public final void onChanged(Object obj) {
                this.f15826a.m2565E((xaj0) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2809b().i(m2624r(), new n250() { // from class: l.aqw
            public final void onChanged(Object obj) {
                this.f5805a.m2568H((xaj0) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2813f().i(m2624r(), new n250() { // from class: l.bqw
            public final void onChanged(Object obj) {
                this.f6414a.m2569I((xaj0) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2816i().i(m2624r(), new n250() { // from class: l.cqw
            public final void onChanged(Object obj) {
                this.f6714a.m2571K((xaj0) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2810c().i(m2624r(), new n250() { // from class: l.dqw
            public final void onChanged(Object obj) {
                this.f7037a.m2572L((xaj0) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2811d().i(m2624r(), new n250() { // from class: l.eqw
            public final void onChanged(Object obj) {
                this.f7459a.m2573M((xaj0) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2812e().i(m2624r(), new n250() { // from class: l.fqw
            public final void onChanged(Object obj) {
                this.f8192a.m2574N((Pair) obj);
            }
        });
        CameraEffectMgr.m2289V().m2315X().m2808a().i(m2624r(), new n250() { // from class: l.gqw
            public final void onChanged(Object obj) {
                this.f8501a.m2575O((Pair) obj);
            }
        });
        this.f1201e.g(this.f1196K);
        this.f1197a.setOnClickListener(new View.OnClickListener() { // from class: l.upw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13911a.m2566F(view);
            }
        });
        this.f1200d.setOnClickListener(new View.OnClickListener() { // from class: l.vpw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14262a.m2567G(view);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public void m2613A(List<CameraCategory> list, List<List<CameraBeautyMode>> list2) {
        m2611x(list, list2);
        m2564C();
        m2612z();
    }

    /* JADX INFO: renamed from: B */
    public void m2614B(ixl ixlVar) {
        this.f1205i = ixlVar;
        CameraEffectMgr.m2289V().m2312T(ixlVar);
    }

    /* JADX INFO: renamed from: D */
    public void m2615D() {
        CameraEffectMgr.m2289V().m2313U(m2624r());
        this.f1219w = CameraEffectMgr.m2289V().m2315X();
    }

    /* JADX INFO: renamed from: S */
    public void m2616S() {
        this.f1204h = false;
        if (this.f1203g) {
            CameraEffectMgr.m2289V().m2314W();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m2617c0(FeedMakeupPageView feedMakeupPageView) {
        feedMakeupPageView.m2488o(1, 0);
        e51.n(new Runnable() { // from class: l.xpw
            @Override // java.lang.Runnable
            public final void run() {
                this.f15066a.m2577Q();
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final void m2618d0(FeedMakeupPageView feedMakeupPageView) {
        this.f1205i.setFaceBeautyValue("skin_smooth", m2610v("skin_smooth"));
        this.f1205i.setFaceBeautyValue("skin_whitening", m2610v("skin_whitening"));
        this.f1205i.setFaceBeautyValue("skin_ruddy", m2610v("skin_ruddy"));
        this.f1205i.setFaceBeautyValue("big_eye", m2610v("big_eye"));
        this.f1205i.setFaceBeautyValue("thin_face", m2610v("thin_face"));
        this.f1205i.setFaceBeautyValue("skin_sharpen", m2610v("skin_sharpen"));
        CameraEffectMgr.m2289V().m2316Z();
        CameraEffectMgr.m2289V().m2318a0();
        feedMakeupPageView.m2485l();
        feedMakeupPageView.m2488o(0, 0);
        m2626t(m2627w(0));
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2619g0(FeedMakeupPageView feedMakeupPageView) {
        this.f1205i.setFaceBeautyValue("face_width", m2610v("face_width"));
        this.f1205i.setFaceBeautyValue("jaw_shape", m2610v("jaw_shape"));
        this.f1205i.setFaceBeautyValue("shorten_face", m2610v("shorten_face"));
        this.f1205i.setFaceBeautyValue("forehead", m2610v("forehead"));
        this.f1205i.setFaceBeautyValue("chin_length", m2610v("chin_length"));
        this.f1205i.setFaceBeautyValue("cheekbone_width", m2610v("cheekbone_width"));
        this.f1205i.setFaceBeautyValue("jaw_width", m2610v("jaw_width"));
        this.f1205i.setFaceBeautyValue("nose_width", m2610v("nose_width"));
        this.f1205i.setFaceBeautyValue("nose_size", m2610v("nose_size"));
        this.f1205i.setFaceBeautyValue("nose_lift", m2610v("nose_lift"));
        this.f1205i.setFaceBeautyValue("nose_ridge_width", m2610v("nose_ridge_width"));
        this.f1205i.setFaceBeautyValue("nose_tip_size", m2610v("nose_tip_size"));
        this.f1205i.setFaceBeautyValue("eye_tilt", m2610v("eye_tilt"));
        this.f1205i.setFaceBeautyValue("eye_distance", m2610v("eye_distance"));
        this.f1205i.setFaceBeautyValue("lip_thickness", m2610v("lip_thickness"));
        this.f1205i.setFaceBeautyValue("mouth_size", m2610v("mouth_size"));
        this.f1205i.setFaceBeautyValue("remove_pouch", m2610v("remove_pouch"));
        this.f1205i.setFaceBeautyValue("remove_nasolabial_floads", m2610v("remove_nasolabial_floads"));
        this.f1205i.setFaceBeautyValue("eye_brighten", m2610v("eye_brighten"));
        this.f1205i.setFaceBeautyValue("teeth_whiten", m2610v("teeth_whiten"));
        this.f1205i.setFaceBeautyValue("eye_height", m2610v("eye_height"));
        CameraEffectMgr.m2289V().m2322c0();
        CameraEffectMgr.m2289V().m2318a0();
        feedMakeupPageView.m2485l();
        feedMakeupPageView.m2488o(0, 0);
        m2626t(m2627w(0));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m2620h0(FeedMakeupPageView feedMakeupPageView) {
        if (CameraEffectMgr.m2289V().m2307O() != 0) {
            this.f1205i.mo11054t();
        }
        feedMakeupPageView.m2488o(0, 0);
        CameraEffectMgr.m2289V().m2324d0();
        CameraEffectMgr.m2289V().m2329g();
        CameraEffectMgr.m2289V().m2325e();
        CameraEffectMgr.m2289V().m2323d();
        CameraEffectMgr.m2289V().m2327f();
    }

    /* JADX INFO: renamed from: i0 */
    public void m2621i0() {
        e51.y(new Runnable() { // from class: l.tpw
            @Override // java.lang.Runnable
            public final void run() {
                this.f13374a.m2578R();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m2622l0(int i) {
        this.f1198b.j(i, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2623q(this);
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        m2583X(tab, Color.parseColor("#ffffff"));
        m2582W();
        m2580U();
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        m2583X(tab, Color.parseColor("#80ffffff"));
    }

    /* JADX INFO: renamed from: q */
    public final void m2623q(View view) {
        hqw.m10683a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public Act m2624r() {
        return getContext();
    }

    /* JADX INFO: renamed from: s */
    public TextView m2625s(int i) {
        String str = CameraEffectMgr.m2289V().m2303J().get(i).name;
        TextView textView = new TextView(m2624r());
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
        this.f1209m = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final void m2626t(FeedMakeupPageView feedMakeupPageView) {
        feedMakeupPageView.m2488o(-1, 0);
        CameraEffectMgr.m2289V().m2328f0(-1);
    }

    /* JADX INFO: renamed from: w */
    public final FeedMakeupPageView m2627w(int i) {
        return (FeedMakeupPageView) this.f1201e.findViewWithTag(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: y */
    public void m2628y() {
        if (this.f1202f) {
            return;
        }
        CameraEffectMgr.m2289V().m2311S();
        this.f1202f = true;
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
            this.f678id = cameraCategory.f678id;
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
