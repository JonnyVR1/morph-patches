package p149l;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegePaymentView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerFemaleVIPView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerODiamondView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerPlatinumView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerSVIPView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerSupremePartnerView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerVIPView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.PrivilegeRecyclerYouthVipView;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.TopCardLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view.bottom.AlphaTransformerViewPager;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VIcon;
import p147v.VSegmentBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ihl0 implements s7m<ahl0> {

    /* JADX INFO: renamed from: C */
    public bhl0 f113263C;

    /* JADX INFO: renamed from: E */
    public hab0 f113265E;

    /* JADX INFO: renamed from: a */
    public FrameLayout f113267a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f113268b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f113269c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f113270d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f113271e;

    /* JADX INFO: renamed from: f */
    public CoordinatorLayout f113272f;

    /* JADX INFO: renamed from: g */
    public TopCardLayout f113273g;

    /* JADX INFO: renamed from: h */
    public AlphaTransformerViewPager f113274h;

    /* JADX INFO: renamed from: i */
    public VSegmentBar f113275i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f113276j;

    /* JADX INFO: renamed from: k */
    public PrivilegePaymentView f113277k;

    /* JADX INFO: renamed from: l */
    public PrivilegePaymentView f113278l;

    /* JADX INFO: renamed from: m */
    public PrivilegePaymentView f113279m;

    /* JADX INFO: renamed from: n */
    public PrivilegePaymentView f113280n;

    /* JADX INFO: renamed from: o */
    public PrivilegePaymentView f113281o;

    /* JADX INFO: renamed from: p */
    public PrivilegePaymentView f113282p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f113283q;

    /* JADX INFO: renamed from: r */
    public VText f113284r;

    /* JADX INFO: renamed from: s */
    public View f113285s;

    /* JADX INFO: renamed from: t */
    public VIcon f113286t;

    /* JADX INFO: renamed from: u */
    public VipFrag f113287u;

    /* JADX INFO: renamed from: v */
    public ahl0 f113288v;

    /* JADX INFO: renamed from: w */
    public fb3 f113289w;

    /* JADX INFO: renamed from: x */
    public LinkedHashMap<PurchaseType, ViewGroup> f113290x = new LinkedHashMap<>();

    /* JADX INFO: renamed from: y */
    public boolean f113291y = false;

    /* JADX INFO: renamed from: z */
    public String f113292z = null;

    /* JADX INFO: renamed from: A */
    public PurchaseType f113261A = null;

    /* JADX INFO: renamed from: B */
    public boolean f113262B = false;

    /* JADX INFO: renamed from: D */
    public zc0 f113264D = new zc0();

    /* JADX INFO: renamed from: F */
    public j760<String, ProductCategory> f113266F = null;

    /* JADX INFO: renamed from: l.ihl0$c */
    public class RunnableC17551c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PurchaseType f113295a;

        public RunnableC17551c(PurchaseType purchaseType) {
            this.f113295a = purchaseType;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
            ihl0.this.f113273g._viewpager.setCurrentItem(arrayListM96502q0.indexOf(this.f113295a) == -1 ? 0 : arrayListM96502q0.indexOf(this.f113295a));
            if (this.f113295a == PurchaseType.TYPE_GET_VIP && !CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
                ihl0.this.m136227J();
            } else {
                if (this.f113295a != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
                    return;
                }
                ihl0.this.m136227J();
            }
        }
    }

    /* JADX INFO: renamed from: l.ihl0$d */
    public static /* synthetic */ class C17552d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113297a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f113297a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113297a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113297a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113297a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113297a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f113297a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f113297a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ihl0(VipFrag vipFrag) {
        this.f113287u = vipFrag;
    }

    /* JADX INFO: renamed from: I */
    private void m136208I() {
        this.f113286t.setIconStyle(4);
        this.f113286t.setImageResource(x2c0.f189862Wk);
        this.f113271e.setRightIconViews(this.f113286t);
        this.f113286t.setOnClickListener(new View.OnClickListener() { // from class: l.ghl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102669a.m136222C(view);
            }
        });
        this.f113271e.setLeftIconOnClick(new View.OnClickListener() { // from class: l.hhl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107730a.m136223E(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m136209a(View view) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m136220A(int i) {
        VSegmentBar vSegmentBar = this.f113275i;
        vSegmentBar.selectTab(vSegmentBar.getTabAt(i));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m136221B() {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        if (ahl0.m96504t0(purchaseType, this.f113274h.getCurrentItem())) {
            this.f113287u.f37812C.onNext(purchaseType);
            m136230M(purchaseType);
        } else {
            PurchaseType purchaseType2 = PurchaseType.TYPE_FEMALE_VIP;
            if (ahl0.m96504t0(purchaseType2, this.f113274h.getCurrentItem())) {
                this.f113287u.f37812C.onNext(purchaseType2);
                m136230M(purchaseType2);
            } else {
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
                if (ahl0.m96504t0(purchaseType3, this.f113274h.getCurrentItem())) {
                    this.f113287u.f37812C.onNext(purchaseType3);
                    m136230M(purchaseType3);
                } else {
                    PurchaseType purchaseType4 = PurchaseType.TYPE_O_PLATINUM;
                    if (ahl0.m96504t0(purchaseType4, this.f113274h.getCurrentItem())) {
                        this.f113287u.f37812C.onNext(purchaseType4);
                        m136230M(purchaseType4);
                    } else {
                        PurchaseType purchaseType5 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                        if (ahl0.m96504t0(purchaseType5, this.f113274h.getCurrentItem())) {
                            this.f113287u.f37812C.onNext(purchaseType5);
                            m136230M(purchaseType5);
                        } else {
                            PurchaseType purchaseType6 = PurchaseType.TYPE_O_DIAMOND;
                            if (ahl0.m96504t0(purchaseType6, this.f113274h.getCurrentItem())) {
                                this.f113287u.f37812C.onNext(purchaseType6);
                                m136230M(purchaseType6);
                            } else {
                                PurchaseType purchaseType7 = PurchaseType.TYPE_SUPREME_PARTNER;
                                if (ahl0.m96504t0(purchaseType7, this.f113274h.getCurrentItem())) {
                                    this.f113287u.f37812C.onNext(purchaseType7);
                                    m136230M(purchaseType7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (NullChecker.m81303a(this.f113263C)) {
            this.f113263C.m101901d(ahl0.m96500o0(this.f113274h.getCurrentItem()));
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m136222C(View view) {
        nb90.m158766d();
        this.f113288v.m96509n0();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113287u.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m136223E(View view) {
        getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: F */
    public void m136224F(PurchaseType purchaseType) {
        this.f113273g._viewpager.post(new RunnableC17551c(purchaseType));
    }

    /* JADX INFO: renamed from: G */
    public void m136225G() {
        m136208I();
        m136226H();
        Bundle arguments = this.f113287u.getArguments();
        if (NullChecker.m81303a(arguments)) {
            boolean z = false;
            final int i = arguments.getInt("vip_selected_page", 0);
            x5b0 x5b0Var = new x5b0(ahl0.m96502q0().get(i).productCategory(), PurchaseTrackPageType.page_privilege, arguments.getString("vip_selected_from", ""));
            this.f113265E = x5b0Var;
            x5b0Var.m130117p(OMSDialogPositon.p_privileges_view);
            this.f113273g._viewpager.setCurrentItem(i);
            getAct().post(new Runnable() { // from class: l.ehl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91339a.m136220A(i);
                }
            });
            xdl0.m208344M(this.f113277k, ahl0.m96504t0(PurchaseType.TYPE_YOUTH_VIP, i));
            xdl0.m208344M(this.f113278l, ahl0.m96504t0(PurchaseType.TYPE_FEMALE_VIP, i));
            xdl0.m208344M(this.f113279m, ahl0.m96504t0(PurchaseType.TYPE_GET_VIP, i));
            xdl0.m208344M(this.f113280n, ahl0.m96504t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, i));
            PrivilegePaymentView privilegePaymentView = this.f113282p;
            PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
            xdl0.m208344M(privilegePaymentView, ahl0.m96504t0(purchaseType, i));
            xdl0.m208344M(this.f113281o, ahl0.m96504t0(PurchaseType.TYPE_O_PLATINUM, i));
            FrameLayout frameLayout = this.f113283q;
            PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
            if (ahl0.m96504t0(purchaseType2, i) && !xma.m210049N3()) {
                z = true;
            }
            xdl0.m208344M(frameLayout, z);
            if (ahl0.m96504t0(purchaseType2, i)) {
                xdl0.m208344M(this.f113269c, true);
                if (NullChecker.m81303a(this.f113263C)) {
                    this.f113263C.m101904g(purchaseType2);
                }
            } else if (ahl0.m96504t0(purchaseType, i) && g6a.m124566o()) {
                xdl0.m208344M(this.f113269c, true);
                if (NullChecker.m81303a(this.f113263C)) {
                    this.f113263C.m101904g(purchaseType);
                }
            }
        }
        this.f113267a.post(new Runnable() { // from class: l.fhl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f97512a.m136221B();
            }
        });
        m136232O();
    }

    /* JADX INFO: renamed from: H */
    public void m136226H() {
        ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
        this.f113273g.m57448f(arrayListM96502q0);
        ArrayList<ViewGroup> arrayList = new ArrayList<>();
        Iterator<PurchaseType> it = arrayListM96502q0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f113290x.get(it.next()));
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f113289w.m120345s(arrayList);
    }

    /* JADX INFO: renamed from: J */
    public void m136227J() {
        TopCardLayout topCardLayout = this.f113273g;
        topCardLayout.setTranslationY((-(topCardLayout.getHeight() - Math.abs(this.f113275i.getHeight()))) + TabLayoutScrollBehavior.INSTANCE.m57437a());
        Iterator<Map.Entry<PurchaseType, ViewGroup>> it = this.f113290x.entrySet().iterator();
        while (it.hasNext()) {
            ViewGroup value = it.next().getValue();
            if (value instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) value;
                recyclerView.scrollToPosition(0);
                recyclerView.stopScroll();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m136228K() {
        this.f113273g.setTranslationY(0.0f);
        Iterator<Map.Entry<PurchaseType, ViewGroup>> it = this.f113290x.entrySet().iterator();
        while (it.hasNext()) {
            ViewGroup value = it.next().getValue();
            if (value instanceof RecyclerView) {
                ((RecyclerView) value).scrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m136229L(PurchaseType purchaseType, Privilege privilege, String str) {
        ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
        this.f113273g._viewpager.setCurrentItem(arrayListM96502q0.indexOf(purchaseType) == -1 ? 0 : arrayListM96502q0.indexOf(purchaseType));
        m136235q(purchaseType, privilege, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m136230M(PurchaseType purchaseType) {
        this.f113277k.setCurrentPurchaseType(purchaseType);
        this.f113278l.setCurrentPurchaseType(purchaseType);
        this.f113279m.setCurrentPurchaseType(purchaseType);
        this.f113280n.setCurrentPurchaseType(purchaseType);
        this.f113282p.setCurrentPurchaseType(purchaseType);
        this.f113281o.setCurrentPurchaseType(purchaseType);
    }

    /* JADX INFO: renamed from: N */
    public final void m136231N(PurchaseType purchaseType, Privilege privilege, String str) {
        String str2 = wek0.f185947a;
        switch (C17552d.f113297a[purchaseType.ordinal()]) {
            case 1:
                if (g6a.m124577z()) {
                    if (!xma.m210050O3()) {
                        C8764c.m53420P0(getAct(), str2);
                    } else {
                        lsi0.m151596z(getAct().string(R$string.f18719m3), getAct().getWindow().getDecorView());
                    }
                }
                break;
            case 2:
                if (g6a.m124562k() && xma.m210039B3()) {
                    lsi0.m151596z(getAct().string(R$string.f18719m3), getAct().getWindow().getDecorView());
                } else {
                    C8764c.m53429U(getAct(), str2);
                }
                break;
            case 3:
                if (privilege != Privilege.intl_no_ad) {
                    C8764c.m53403J1(getAct(), str, Privilege.vip_unlimited_likes);
                } else {
                    CoreModule.m29935P().m94651a().mo33521i6(getAct(), str, privilege);
                }
                break;
            case 4:
                if (ew40.m118398j() && xma.m210047L3()) {
                    lsi0.m151596z(getAct().string(R$string.f18719m3), getAct().getWindow().getDecorView());
                } else if (privilege != Privilege.intl_no_ad) {
                    CoreModule.m29935P().m94651a().mo33565pr(getAct(), str2, Privilege.see_who_likes_me);
                } else {
                    CoreModule.m29935P().m94651a().mo33521i6(getAct(), str, privilege);
                }
                break;
            case 5:
                C8764c.m53439a0(getAct(), str2, null, null, null, Privilege.immediately_match);
                break;
            case 6:
                C8764c.m53475n0(getAct(), str2);
                break;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m136232O() {
        int currentItem = this.f113274h.getCurrentItem();
        ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
        if (currentItem < arrayListM96502q0.size()) {
            PurchaseType purchaseType = arrayListM96502q0.get(currentItem);
            for (Map.Entry<PurchaseType, ViewGroup> entry : this.f113290x.entrySet()) {
                if (entry.getValue() instanceof ku80) {
                    if (entry.getKey() == purchaseType) {
                        ((ku80) entry.getValue()).mo56930q();
                    } else {
                        ((ku80) entry.getValue()).mo56928c();
                    }
                }
            }
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m136233n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m136233n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jhl0.m141532b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ahl0 ahl0Var) {
        this.f113288v = ahl0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m136235q(PurchaseType purchaseType, Privilege privilege, String str) {
        if (purchaseType == PurchaseType.TYPE_YOUTH_VIP && !xma.m210050O3()) {
            m136227J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_FEMALE_VIP && !xma.m210039B3()) {
            m136227J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_VIP && !CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            m136227J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            m136227J();
            return;
        }
        if (sab0.m182891i(purchaseType) && !xma.m210043F3()) {
            m136227J();
        } else if (!sab0.m182897o(purchaseType) || xma.m210045H3()) {
            m136231N(purchaseType, privilege, str);
        } else {
            m136227J();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m136236s() {
        int currentItem = this.f113274h.getCurrentItem();
        ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
        if (currentItem < arrayListM96502q0.size()) {
            nb90.m158763a(arrayListM96502q0.get(currentItem));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m136237u() {
        j760<String, ProductCategory> j760Var = this.f113266F;
        if (j760Var == null || TextUtils.isEmpty(j760Var.f116564a)) {
            return;
        }
        C4348d.m20896l().m20900k(this.f113266F.f116564a);
        this.f113266F = null;
    }

    /* JADX INFO: renamed from: v */
    public hab0 m136238v() {
        return this.f113265E;
    }

    /* JADX INFO: renamed from: w */
    public void m136239w() {
        this.f113262B = false;
        ArrayList<PurchaseType> arrayListM96502q0 = ahl0.m96502q0();
        Bundle arguments = this.f113287u.getArguments();
        if (this.f113262B) {
            int i = arguments.getInt("vip_selected_page", 0);
            boolean z = arguments.getBoolean("frag_args_section_select", false);
            this.f113291y = z;
            if (z) {
                String string = arguments.getString("frag_args_section_promotion");
                this.f113292z = string;
                if (!TextUtils.isEmpty(string) && ahl0.m96502q0().size() > i) {
                    this.f113261A = ahl0.m96502q0().get(i);
                }
            }
        }
        this.f113286t = new VIcon(getContext());
        if (g6a.m124566o()) {
            this.f113271e.setBackground(null);
            bhl0 bhl0Var = new bhl0(this);
            this.f113263C = bhl0Var;
            bhl0Var.m101904g(this.f113261A);
            this.f113263C.m101900c();
        }
        if (g6a.m124577z() && ahl0.m96502q0().size() * bhl0.f75637b > xdl0.m208412y0()) {
            this.f113275i.setTabMode(0);
        }
        m136240x(arrayListM96502q0);
        fb3 fb3Var = new fb3(this.f113287u);
        this.f113289w = fb3Var;
        this.f113274h.setAdapter(fb3Var);
        this.f113274h.setOffscreenPageLimit(arrayListM96502q0.size());
        this.f113274h.mo4180X(true, new ja3());
        this.f113274h.m4185d(new C17549a());
        this.f113273g.setBottomContentInterface(new eb3() { // from class: l.chl0
            @Override // p149l.eb3
            /* JADX INFO: renamed from: a */
            public final void mo106968a(int i2) {
                this.f80944a.m136242z(i2);
            }
        });
        this.f113273g.m57449g(this.f113287u, this.f113275i);
        this.f113275i.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C17550b());
        this.f113276j.setOnClickListener(new View.OnClickListener() { // from class: l.dhl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ihl0.m136209a(view);
            }
        });
        dsa.m113424A(false);
        dsa.m113452y(new WeakReference(this.f113264D));
        if (g6a.m124566o()) {
            this.f113282p.setBackgroundColor(Color.parseColor("#150701"));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m136240x(ArrayList<PurchaseType> arrayList) {
        PrivilegeRecyclerVIPView privilegeRecyclerVIPView;
        PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView;
        ViewGroup privilegeRecyclerYouthVipView;
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f113290x.clear();
        for (PurchaseType purchaseType : arrayList) {
            switch (C17552d.f113297a[purchaseType.ordinal()]) {
                case 1:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerYouthVipView(getContext());
                    break;
                case 2:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerFemaleVIPView(getContext());
                    break;
                case 3:
                    privilegeRecyclerVIPView = new PrivilegeRecyclerVIPView(getContext());
                    privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                    if (this.f113262B && NullChecker.m81303a(this.f113261A) && this.f113261A == PurchaseType.TYPE_GET_VIP) {
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                        privilegeRecyclerVIPView.setSelectCouponId(this.f113292z);
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                    }
                    break;
                case 4:
                    privilegeRecyclerSVIPView = new PrivilegeRecyclerSVIPView(getContext());
                    privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                    if (this.f113262B && NullChecker.m81303a(this.f113261A) && this.f113261A == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                        privilegeRecyclerSVIPView.setSelectCouponId(this.f113292z);
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                    }
                    break;
                case 5:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerODiamondView(getContext());
                    break;
                case 6:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerPlatinumView(getContext());
                    break;
                case 7:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerSupremePartnerView(getContext());
                    break;
                default:
                    privilegeRecyclerYouthVipView = null;
                    break;
            }
            privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
            privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
            privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
            privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
            privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
            privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
            if (NullChecker.m81303a(privilegeRecyclerYouthVipView)) {
                this.f113290x.put(purchaseType, privilegeRecyclerYouthVipView);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m136241y(Bundle bundle) {
        ahl0.m96503r0();
        m136239w();
        m136225G();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m136242z(int i) {
        this.f113274h.setCurrentItem(i);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ihl0$a */
    public class C17549a implements ViewPager.InterfaceC0716j {
        public C17549a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            boolean z = false;
            if (i != 0) {
                if (i == 2) {
                    ihl0.this.m136237u();
                    ihl0 ihl0Var = ihl0.this;
                    xdl0.m208344M(ihl0Var.f113277k, ahl0.m96504t0(PurchaseType.TYPE_YOUTH_VIP, ihl0Var.f113274h.getCurrentItem()));
                    ihl0 ihl0Var2 = ihl0.this;
                    xdl0.m208344M(ihl0Var2.f113278l, ahl0.m96504t0(PurchaseType.TYPE_FEMALE_VIP, ihl0Var2.f113274h.getCurrentItem()));
                    ihl0 ihl0Var3 = ihl0.this;
                    xdl0.m208344M(ihl0Var3.f113279m, ahl0.m96504t0(PurchaseType.TYPE_GET_VIP, ihl0Var3.f113274h.getCurrentItem()));
                    ihl0 ihl0Var4 = ihl0.this;
                    xdl0.m208344M(ihl0Var4.f113280n, ahl0.m96504t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, ihl0Var4.f113274h.getCurrentItem()));
                    ihl0 ihl0Var5 = ihl0.this;
                    xdl0.m208344M(ihl0Var5.f113282p, ahl0.m96504t0(PurchaseType.TYPE_O_DIAMOND, ihl0Var5.f113274h.getCurrentItem()));
                    ihl0 ihl0Var6 = ihl0.this;
                    xdl0.m208344M(ihl0Var6.f113281o, ahl0.m96504t0(PurchaseType.TYPE_O_PLATINUM, ihl0Var6.f113274h.getCurrentItem()));
                    ihl0 ihl0Var7 = ihl0.this;
                    FrameLayout frameLayout = ihl0Var7.f113283q;
                    if (ahl0.m96504t0(PurchaseType.TYPE_SUPREME_PARTNER, ihl0Var7.f113274h.getCurrentItem()) && !xma.m210049N3()) {
                        z = true;
                    }
                    xdl0.m208344M(frameLayout, z);
                    if (NullChecker.m81303a(ihl0.this.f113263C)) {
                        ihl0.this.f113263C.m101903f(ahl0.m96500o0(ihl0.this.f113274h.getCurrentItem()));
                        return;
                    }
                    return;
                }
                return;
            }
            ihl0 ihl0Var8 = ihl0.this;
            PrivilegePaymentView privilegePaymentView = ihl0Var8.f113277k;
            PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
            xdl0.m208344M(privilegePaymentView, ahl0.m96504t0(purchaseType, ihl0Var8.f113274h.getCurrentItem()));
            ihl0 ihl0Var9 = ihl0.this;
            PrivilegePaymentView privilegePaymentView2 = ihl0Var9.f113278l;
            PurchaseType purchaseType2 = PurchaseType.TYPE_FEMALE_VIP;
            xdl0.m208344M(privilegePaymentView2, ahl0.m96504t0(purchaseType2, ihl0Var9.f113274h.getCurrentItem()));
            ihl0 ihl0Var10 = ihl0.this;
            PrivilegePaymentView privilegePaymentView3 = ihl0Var10.f113279m;
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
            xdl0.m208344M(privilegePaymentView3, ahl0.m96504t0(purchaseType3, ihl0Var10.f113274h.getCurrentItem()));
            ihl0 ihl0Var11 = ihl0.this;
            PrivilegePaymentView privilegePaymentView4 = ihl0Var11.f113280n;
            PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            xdl0.m208344M(privilegePaymentView4, ahl0.m96504t0(purchaseType4, ihl0Var11.f113274h.getCurrentItem()));
            ihl0 ihl0Var12 = ihl0.this;
            PrivilegePaymentView privilegePaymentView5 = ihl0Var12.f113282p;
            PurchaseType purchaseType5 = PurchaseType.TYPE_O_DIAMOND;
            xdl0.m208344M(privilegePaymentView5, ahl0.m96504t0(purchaseType5, ihl0Var12.f113274h.getCurrentItem()));
            ihl0 ihl0Var13 = ihl0.this;
            PrivilegePaymentView privilegePaymentView6 = ihl0Var13.f113281o;
            PurchaseType purchaseType6 = PurchaseType.TYPE_O_PLATINUM;
            xdl0.m208344M(privilegePaymentView6, ahl0.m96504t0(purchaseType6, ihl0Var13.f113274h.getCurrentItem()));
            ihl0 ihl0Var14 = ihl0.this;
            FrameLayout frameLayout2 = ihl0Var14.f113283q;
            PurchaseType purchaseType7 = PurchaseType.TYPE_SUPREME_PARTNER;
            if (ahl0.m96504t0(purchaseType7, ihl0Var14.f113274h.getCurrentItem()) && !xma.m210049N3()) {
                z = true;
            }
            xdl0.m208344M(frameLayout2, z);
            boolean zM96504t0 = ahl0.m96504t0(purchaseType, ihl0.this.f113274h.getCurrentItem());
            ihl0 ihl0Var15 = ihl0.this;
            if (zM96504t0) {
                ihl0Var15.f113287u.f37812C.onNext(purchaseType);
                ihl0.this.m136230M(purchaseType);
            } else {
                boolean zM96504t1 = ahl0.m96504t0(purchaseType2, ihl0Var15.f113274h.getCurrentItem());
                ihl0 ihl0Var16 = ihl0.this;
                if (zM96504t1) {
                    ihl0Var16.f113287u.f37812C.onNext(purchaseType2);
                    ihl0.this.m136230M(purchaseType2);
                } else {
                    boolean zM96504t2 = ahl0.m96504t0(purchaseType3, ihl0Var16.f113274h.getCurrentItem());
                    ihl0 ihl0Var17 = ihl0.this;
                    if (zM96504t2) {
                        ihl0Var17.f113287u.f37812C.onNext(purchaseType3);
                        ihl0.this.m136230M(purchaseType3);
                    } else {
                        boolean zM96504t3 = ahl0.m96504t0(purchaseType4, ihl0Var17.f113274h.getCurrentItem());
                        ihl0 ihl0Var18 = ihl0.this;
                        if (zM96504t3) {
                            ihl0Var18.f113287u.f37812C.onNext(purchaseType4);
                            ihl0.this.m136230M(purchaseType4);
                        } else {
                            boolean zM96504t4 = ahl0.m96504t0(purchaseType5, ihl0Var18.f113274h.getCurrentItem());
                            ihl0 ihl0Var19 = ihl0.this;
                            if (zM96504t4) {
                                ihl0Var19.f113287u.f37812C.onNext(purchaseType5);
                                ihl0.this.m136230M(purchaseType5);
                            } else {
                                boolean zM96504t5 = ahl0.m96504t0(purchaseType6, ihl0Var19.f113274h.getCurrentItem());
                                ihl0 ihl0Var20 = ihl0.this;
                                if (zM96504t5) {
                                    ihl0Var20.f113287u.f37812C.onNext(purchaseType6);
                                    ihl0.this.m136230M(purchaseType6);
                                } else if (ahl0.m96504t0(purchaseType7, ihl0Var20.f113274h.getCurrentItem())) {
                                    ihl0.this.f113287u.f37812C.onNext(purchaseType7);
                                    ihl0.this.m136230M(purchaseType7);
                                }
                            }
                        }
                    }
                }
            }
            ihl0.this.m136236s();
            ihl0.this.m136232O();
            if (NullChecker.m81303a(ihl0.this.f113263C)) {
                ihl0.this.f113263C.m101901d(ahl0.m96500o0(ihl0.this.f113274h.getCurrentItem()));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            if (f == 0.0f && i2 == 0) {
                ihl0.this.f113265E.m130122v(ahl0.m96502q0().get(Math.min(i, ahl0.m96502q0().size() - 1)).productCategory());
            }
            if (ahl0.m96504t0(PurchaseType.TYPE_YOUTH_VIP, i)) {
                ihl0.this.f113277k.setViewsAlpha(1.0f - f);
                ihl0.this.f113278l.setViewsAlpha(f);
                ihl0.this.f113279m.setViewsAlpha(f);
                ihl0.this.f113280n.setViewsAlpha(f);
                ihl0.this.f113282p.setViewsAlpha(f);
                ihl0.this.f113281o.setViewsAlpha(f);
                ihl0.this.f113283q.setAlpha(f);
            } else if (ahl0.m96504t0(PurchaseType.TYPE_FEMALE_VIP, i)) {
                ihl0.this.f113278l.setViewsAlpha(1.0f - f);
                ihl0.this.f113279m.setViewsAlpha(f);
                ihl0.this.f113280n.setViewsAlpha(f);
                ihl0.this.f113282p.setViewsAlpha(f);
                ihl0.this.f113281o.setViewsAlpha(f);
                ihl0.this.f113283q.setAlpha(f);
            } else if (ahl0.m96504t0(PurchaseType.TYPE_GET_VIP, i)) {
                ihl0.this.f113277k.setViewsAlpha(f);
                ihl0.this.f113278l.setViewsAlpha(f);
                ihl0.this.f113279m.setViewsAlpha(1.0f - f);
                ihl0.this.f113280n.setViewsAlpha(f);
                ihl0.this.f113282p.setViewsAlpha(f);
                ihl0.this.f113281o.setViewsAlpha(f);
                ihl0.this.f113283q.setAlpha(f);
            } else if (ahl0.m96504t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, i)) {
                ihl0.this.f113277k.setViewsAlpha(f);
                ihl0.this.f113278l.setViewsAlpha(f);
                ihl0.this.f113279m.setViewsAlpha(f);
                ihl0.this.f113280n.setViewsAlpha(1.0f - f);
                ihl0.this.f113282p.setViewsAlpha(f);
                ihl0.this.f113281o.setViewsAlpha(f);
                ihl0.this.f113283q.setAlpha(f);
            } else if (ahl0.m96504t0(PurchaseType.TYPE_O_DIAMOND, i)) {
                ihl0.this.f113277k.setViewsAlpha(f);
                ihl0.this.f113278l.setViewsAlpha(f);
                ihl0.this.f113279m.setViewsAlpha(f);
                ihl0.this.f113280n.setViewsAlpha(f);
                ihl0.this.f113282p.setViewsAlpha(1.0f - f);
                ihl0.this.f113281o.setViewsAlpha(f);
                ihl0.this.f113283q.setAlpha(f);
            } else if (ahl0.m96504t0(PurchaseType.TYPE_O_PLATINUM, i)) {
                ihl0.this.f113277k.setViewsAlpha(f);
                ihl0.this.f113278l.setViewsAlpha(f);
                ihl0.this.f113279m.setViewsAlpha(f);
                ihl0.this.f113280n.setViewsAlpha(f);
                ihl0.this.f113282p.setViewsAlpha(f);
                ihl0.this.f113281o.setViewsAlpha(1.0f - f);
                ihl0.this.f113283q.setAlpha(f);
            } else if (ahl0.m96504t0(PurchaseType.TYPE_SUPREME_PARTNER, i)) {
                ihl0.this.f113277k.setViewsAlpha(f);
                ihl0.this.f113278l.setViewsAlpha(f);
                ihl0.this.f113279m.setViewsAlpha(f);
                ihl0.this.f113280n.setViewsAlpha(f);
                ihl0.this.f113282p.setViewsAlpha(f);
                ihl0.this.f113281o.setViewsAlpha(f);
                ihl0.this.f113283q.setAlpha(1.0f - f);
            }
            if (NullChecker.m81303a(ihl0.this.f113263C)) {
                ihl0.this.f113263C.m101902e(ahl0.m96500o0(i), f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: l.ihl0$b */
    public class C17550b implements TabLayout.OnTabSelectedListener {
        public C17550b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ihl0.this.m136228K();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
