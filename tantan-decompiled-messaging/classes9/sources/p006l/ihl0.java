package p006l;

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
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegePaymentView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerFemaleVIPView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerODiamondView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerPlatinumView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerSVIPView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerSupremePartnerView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerVIPView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegeRecyclerYouthVipView;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.view.TopCardLayout;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.view.bottom.AlphaTransformerViewPager;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l.d30;
import l.e30;
import l.ew40;
import l.j760;
import l.jhl0;
import l.lsi0;
import l.s7m;
import l.sab0;
import l.vwb;
import l.wek0;
import l.xdl0;
import l.zc0;
import v.VDraweeView;
import v.VIcon;
import v.VSegmentBar;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ihl0 implements s7m<ahl0> {

    /* JADX INFO: renamed from: C */
    public bhl0 f14449C;

    /* JADX INFO: renamed from: E */
    public hab0 f14451E;

    /* JADX INFO: renamed from: a */
    public FrameLayout f14453a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f14454b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f14455c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f14456d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f14457e;

    /* JADX INFO: renamed from: f */
    public CoordinatorLayout f14458f;

    /* JADX INFO: renamed from: g */
    public TopCardLayout f14459g;

    /* JADX INFO: renamed from: h */
    public AlphaTransformerViewPager f14460h;

    /* JADX INFO: renamed from: i */
    public VSegmentBar f14461i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f14462j;

    /* JADX INFO: renamed from: k */
    public PrivilegePaymentView f14463k;

    /* JADX INFO: renamed from: l */
    public PrivilegePaymentView f14464l;

    /* JADX INFO: renamed from: m */
    public PrivilegePaymentView f14465m;

    /* JADX INFO: renamed from: n */
    public PrivilegePaymentView f14466n;

    /* JADX INFO: renamed from: o */
    public PrivilegePaymentView f14467o;

    /* JADX INFO: renamed from: p */
    public PrivilegePaymentView f14468p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f14469q;

    /* JADX INFO: renamed from: r */
    public VText f14470r;

    /* JADX INFO: renamed from: s */
    public View f14471s;

    /* JADX INFO: renamed from: t */
    public VIcon f14472t;

    /* JADX INFO: renamed from: u */
    public VipFrag f14473u;

    /* JADX INFO: renamed from: v */
    public ahl0 f14474v;

    /* JADX INFO: renamed from: w */
    public fb3 f14475w;

    /* JADX INFO: renamed from: x */
    public LinkedHashMap<PurchaseType, ViewGroup> f14476x = new LinkedHashMap<>();

    /* JADX INFO: renamed from: y */
    public boolean f14477y = false;

    /* JADX INFO: renamed from: z */
    public String f14478z = null;

    /* JADX INFO: renamed from: A */
    public PurchaseType f14447A = null;

    /* JADX INFO: renamed from: B */
    public boolean f14448B = false;

    /* JADX INFO: renamed from: D */
    public zc0 f14450D = new zc0();

    /* JADX INFO: renamed from: F */
    public j760<String, ProductCategory> f14452F = null;

    /* JADX INFO: renamed from: l.ihl0$c */
    public class RunnableC0840c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PurchaseType f14481a;

        public RunnableC0840c(PurchaseType purchaseType) {
            this.f14481a = purchaseType;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
            ihl0.this.f14459g._viewpager.setCurrentItem(arrayListM11840q0.indexOf(this.f14481a) == -1 ? 0 : arrayListM11840q0.indexOf(this.f14481a));
            if (this.f14481a == PurchaseType.TYPE_GET_VIP && !CoreModule.f1534c.f3628e0.m21490p9().isVIP()) {
                ihl0.this.m16675J();
            } else {
                if (this.f14481a != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
                    return;
                }
                ihl0.this.m16675J();
            }
        }
    }

    /* JADX INFO: renamed from: l.ihl0$d */
    public static /* synthetic */ class C0841d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14483a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f14483a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14483a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14483a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14483a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14483a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14483a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14483a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ihl0(VipFrag vipFrag) {
        this.f14473u = vipFrag;
    }

    /* JADX INFO: renamed from: I */
    private void m16655I() {
        this.f14472t.setIconStyle(4);
        this.f14472t.setImageResource(x2c0.f26398Wk);
        this.f14457e.setRightIconViews(new View[]{this.f14472t});
        this.f14472t.setOnClickListener(new View.OnClickListener() { // from class: l.ghl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13316a.m16669C(view);
            }
        });
        this.f14457e.setLeftIconOnClick(new View.OnClickListener() { // from class: l.hhl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13881a.m16671E(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16656a(View view) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m16667A(int i) {
        VSegmentBar vSegmentBar = this.f14461i;
        vSegmentBar.selectTab(vSegmentBar.getTabAt(i));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m16668B() {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        if (ahl0.m11842t0(purchaseType, this.f14460h.getCurrentItem())) {
            this.f14473u.f7593C.onNext(purchaseType);
            m16678M(purchaseType);
        } else {
            PurchaseType purchaseType2 = PurchaseType.TYPE_FEMALE_VIP;
            if (ahl0.m11842t0(purchaseType2, this.f14460h.getCurrentItem())) {
                this.f14473u.f7593C.onNext(purchaseType2);
                m16678M(purchaseType2);
            } else {
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
                if (ahl0.m11842t0(purchaseType3, this.f14460h.getCurrentItem())) {
                    this.f14473u.f7593C.onNext(purchaseType3);
                    m16678M(purchaseType3);
                } else {
                    PurchaseType purchaseType4 = PurchaseType.TYPE_O_PLATINUM;
                    if (ahl0.m11842t0(purchaseType4, this.f14460h.getCurrentItem())) {
                        this.f14473u.f7593C.onNext(purchaseType4);
                        m16678M(purchaseType4);
                    } else {
                        PurchaseType purchaseType5 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                        if (ahl0.m11842t0(purchaseType5, this.f14460h.getCurrentItem())) {
                            this.f14473u.f7593C.onNext(purchaseType5);
                            m16678M(purchaseType5);
                        } else {
                            PurchaseType purchaseType6 = PurchaseType.TYPE_O_DIAMOND;
                            if (ahl0.m11842t0(purchaseType6, this.f14460h.getCurrentItem())) {
                                this.f14473u.f7593C.onNext(purchaseType6);
                                m16678M(purchaseType6);
                            } else {
                                PurchaseType purchaseType7 = PurchaseType.TYPE_SUPREME_PARTNER;
                                if (ahl0.m11842t0(purchaseType7, this.f14460h.getCurrentItem())) {
                                    this.f14473u.f7593C.onNext(purchaseType7);
                                    m16678M(purchaseType7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (NullChecker.a(this.f14449C)) {
            this.f14449C.m12682d(ahl0.m11838o0(this.f14460h.getCurrentItem()));
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m16669C(View view) {
        nb90.m20000d();
        this.f14474v.m11849n0();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16670C0() {
        return this.f14473u.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m16671E(View view) {
        act().finish();
    }

    /* JADX INFO: renamed from: F */
    public void m16672F(PurchaseType purchaseType) {
        this.f14459g._viewpager.post(new RunnableC0840c(purchaseType));
    }

    /* JADX INFO: renamed from: G */
    public void m16673G() {
        m16655I();
        m16674H();
        Bundle arguments = this.f14473u.getArguments();
        if (NullChecker.a(arguments)) {
            boolean z = false;
            final int i = arguments.getInt("vip_selected_page", 0);
            x5b0 x5b0Var = new x5b0(ahl0.m11840q0().get(i).productCategory(), PurchaseTrackPageType.page_privilege, arguments.getString("vip_selected_from", ""));
            this.f14451E = x5b0Var;
            x5b0Var.m16124p("p_privileges_view");
            this.f14459g._viewpager.setCurrentItem(i);
            act().post(new Runnable() { // from class: l.ehl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11148a.m16667A(i);
                }
            });
            xdl0.M(this.f14463k, ahl0.m11842t0(PurchaseType.TYPE_YOUTH_VIP, i));
            xdl0.M(this.f14464l, ahl0.m11842t0(PurchaseType.TYPE_FEMALE_VIP, i));
            xdl0.M(this.f14465m, ahl0.m11842t0(PurchaseType.TYPE_GET_VIP, i));
            xdl0.M(this.f14466n, ahl0.m11842t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, i));
            PrivilegePaymentView privilegePaymentView = this.f14468p;
            PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
            xdl0.M(privilegePaymentView, ahl0.m11842t0(purchaseType, i));
            xdl0.M(this.f14467o, ahl0.m11842t0(PurchaseType.TYPE_O_PLATINUM, i));
            FrameLayout frameLayout = this.f14469q;
            PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
            if (ahl0.m11842t0(purchaseType2, i) && !xma.m27357N3()) {
                z = true;
            }
            xdl0.M(frameLayout, z);
            if (ahl0.m11842t0(purchaseType2, i)) {
                xdl0.M(this.f14455c, true);
                if (NullChecker.a(this.f14449C)) {
                    this.f14449C.m12685g(purchaseType2);
                }
            } else if (ahl0.m11842t0(purchaseType, i) && g6a.m15592o()) {
                xdl0.M(this.f14455c, true);
                if (NullChecker.a(this.f14449C)) {
                    this.f14449C.m12685g(purchaseType);
                }
            }
        }
        this.f14453a.post(new Runnable() { // from class: l.fhl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12716a.m16668B();
            }
        });
        m16680O();
    }

    /* JADX INFO: renamed from: H */
    public void m16674H() {
        ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
        this.f14459g.m10935f(arrayListM11840q0);
        ArrayList<ViewGroup> arrayList = new ArrayList<>();
        Iterator<PurchaseType> it = arrayListM11840q0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f14476x.get(it.next()));
        }
        if (vwb.J(arrayList)) {
            return;
        }
        this.f14475w.m15300s(arrayList);
    }

    /* JADX INFO: renamed from: J */
    public void m16675J() {
        TopCardLayout topCardLayout = this.f14459g;
        topCardLayout.setTranslationY((-(topCardLayout.getHeight() - Math.abs(this.f14461i.getHeight()))) + TabLayoutScrollBehavior.INSTANCE.m10924a());
        Iterator<Map.Entry<PurchaseType, ViewGroup>> it = this.f14476x.entrySet().iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (ViewGroup) it.next().getValue();
            if (recyclerView instanceof RecyclerView) {
                RecyclerView recyclerView2 = recyclerView;
                recyclerView2.scrollToPosition(0);
                recyclerView2.stopScroll();
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m16676K() {
        this.f14459g.setTranslationY(0.0f);
        Iterator<Map.Entry<PurchaseType, ViewGroup>> it = this.f14476x.entrySet().iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (ViewGroup) it.next().getValue();
            if (recyclerView instanceof RecyclerView) {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m16677L(PurchaseType purchaseType, Privilege privilege, String str) {
        ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
        this.f14459g._viewpager.setCurrentItem(arrayListM11840q0.indexOf(purchaseType) == -1 ? 0 : arrayListM11840q0.indexOf(purchaseType));
        m16684q(purchaseType, privilege, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m16678M(PurchaseType purchaseType) {
        this.f14463k.setCurrentPurchaseType(purchaseType);
        this.f14464l.setCurrentPurchaseType(purchaseType);
        this.f14465m.setCurrentPurchaseType(purchaseType);
        this.f14466n.setCurrentPurchaseType(purchaseType);
        this.f14468p.setCurrentPurchaseType(purchaseType);
        this.f14467o.setCurrentPurchaseType(purchaseType);
    }

    /* JADX INFO: renamed from: N */
    public final void m16679N(PurchaseType purchaseType, Privilege privilege, String str) {
        String str2 = wek0.a;
        switch (C0841d.f14483a[purchaseType.ordinal()]) {
            case 1:
                if (g6a.m15603z()) {
                    if (!xma.m27358O3()) {
                        c.P0(act(), str2);
                    } else {
                        lsi0.z(act().string(R$string.f2708m3), act().getWindow().getDecorView());
                    }
                }
                break;
            case 2:
                if (g6a.m15588k() && xma.m27347B3()) {
                    lsi0.z(act().string(R$string.f2708m3), act().getWindow().getDecorView());
                } else {
                    c.U(act(), str2);
                }
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                if (privilege != Privilege.intl_no_ad) {
                    c.J1(act(), str, Privilege.vip_unlimited_likes);
                } else {
                    CoreModule.m1854P().m11706a().m5458i6(act(), str, privilege);
                }
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                if (ew40.j() && xma.m27355L3()) {
                    lsi0.z(act().string(R$string.f2708m3), act().getWindow().getDecorView());
                } else if (privilege != Privilege.intl_no_ad) {
                    CoreModule.m1854P().m11706a().m5502pr(act(), str2, Privilege.see_who_likes_me);
                } else {
                    CoreModule.m1854P().m11706a().m5458i6(act(), str, privilege);
                }
                break;
            case 5:
                c.a0(act(), str2, (e30) null, (d30) null, (d30) null, Privilege.immediately_match);
                break;
            case 6:
                c.n0(act(), str2);
                break;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m16680O() {
        int currentItem = this.f14460h.getCurrentItem();
        ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
        if (currentItem < arrayListM11840q0.size()) {
            PurchaseType purchaseType = arrayListM11840q0.get(currentItem);
            for (Map.Entry<PurchaseType, ViewGroup> entry : this.f14476x.entrySet()) {
                if (entry.getValue() instanceof ku80) {
                    if (entry.getKey() == purchaseType) {
                        ((ku80) entry.getValue()).mo10401q();
                    } else {
                        ((ku80) entry.getValue()).mo10399c();
                    }
                }
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16682n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m16682n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jhl0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m16681i1(ahl0 ahl0Var) {
        this.f14474v = ahl0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m16684q(PurchaseType purchaseType, Privilege privilege, String str) {
        if (purchaseType == PurchaseType.TYPE_YOUTH_VIP && !xma.m27358O3()) {
            m16675J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_FEMALE_VIP && !xma.m27347B3()) {
            m16675J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_VIP && !CoreModule.f1534c.f3628e0.m21490p9().isVIP()) {
            m16675J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
            m16675J();
            return;
        }
        if (sab0.i(purchaseType) && !xma.m27351F3()) {
            m16675J();
        } else if (!sab0.o(purchaseType) || xma.m27353H3()) {
            m16679N(purchaseType, privilege, str);
        } else {
            m16675J();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m16685s() {
        int currentItem = this.f14460h.getCurrentItem();
        ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
        if (currentItem < arrayListM11840q0.size()) {
            nb90.m19997a(arrayListM11840q0.get(currentItem));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m16686u() {
        j760<String, ProductCategory> j760Var = this.f14452F;
        if (j760Var == null || TextUtils.isEmpty((CharSequence) j760Var.a)) {
            return;
        }
        d.l().k((String) this.f14452F.a);
        this.f14452F = null;
    }

    /* JADX INFO: renamed from: v */
    public hab0 m16687v() {
        return this.f14451E;
    }

    /* JADX INFO: renamed from: w */
    public void m16688w() {
        this.f14448B = false;
        ArrayList<PurchaseType> arrayListM11840q0 = ahl0.m11840q0();
        Bundle arguments = this.f14473u.getArguments();
        if (this.f14448B) {
            int i = arguments.getInt("vip_selected_page", 0);
            boolean z = arguments.getBoolean("frag_args_section_select", false);
            this.f14477y = z;
            if (z) {
                String string = arguments.getString("frag_args_section_promotion");
                this.f14478z = string;
                if (!TextUtils.isEmpty(string) && ahl0.m11840q0().size() > i) {
                    this.f14447A = ahl0.m11840q0().get(i);
                }
            }
        }
        this.f14472t = new VIcon(m16670C0());
        if (g6a.m15592o()) {
            this.f14457e.setBackground(null);
            bhl0 bhl0Var = new bhl0(this);
            this.f14449C = bhl0Var;
            bhl0Var.m12685g(this.f14447A);
            this.f14449C.m12681c();
        }
        if (g6a.m15603z() && ahl0.m11840q0().size() * bhl0.f8907b > xdl0.y0()) {
            this.f14461i.setTabMode(0);
        }
        m16689x(arrayListM11840q0);
        fb3 fb3Var = new fb3(this.f14473u);
        this.f14475w = fb3Var;
        this.f14460h.setAdapter(fb3Var);
        this.f14460h.setOffscreenPageLimit(arrayListM11840q0.size());
        this.f14460h.X(true, new ja3());
        this.f14460h.d(new C0838a());
        this.f14459g.setBottomContentInterface(new eb3() { // from class: l.chl0
            @Override // p006l.eb3
            /* JADX INFO: renamed from: a */
            public final void mo13455a(int i2) {
                this.f9662a.m16691z(i2);
            }
        });
        this.f14459g.m10936g(this.f14473u, this.f14461i);
        this.f14461i.addOnTabSelectedListener(new C0839b());
        this.f14462j.setOnClickListener(new View.OnClickListener() { // from class: l.dhl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ihl0.m16656a(view);
            }
        });
        dsa.m14189A(false);
        dsa.m14217y(new WeakReference(this.f14450D));
        if (g6a.m15592o()) {
            this.f14468p.setBackgroundColor(Color.parseColor("#150701"));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m16689x(ArrayList<PurchaseType> arrayList) {
        PrivilegeRecyclerVIPView privilegeRecyclerVIPView;
        PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView;
        Object privilegeRecyclerYouthVipView;
        if (vwb.J(arrayList)) {
            return;
        }
        this.f14476x.clear();
        for (PurchaseType purchaseType : arrayList) {
            switch (C0841d.f14483a[purchaseType.ordinal()]) {
                case 1:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerYouthVipView(m16670C0());
                    break;
                case 2:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerFemaleVIPView(m16670C0());
                    break;
                case CameraSticker.STATE_COMPLETE /* 3 */:
                    privilegeRecyclerVIPView = new PrivilegeRecyclerVIPView(m16670C0());
                    privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                    if (this.f14448B && NullChecker.a(this.f14447A) && this.f14447A == PurchaseType.TYPE_GET_VIP) {
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                        privilegeRecyclerVIPView.setSelectCouponId(this.f14478z);
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                    }
                    break;
                case CameraSticker.STATE_ERROR /* 4 */:
                    privilegeRecyclerSVIPView = new PrivilegeRecyclerSVIPView(m16670C0());
                    privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                    if (this.f14448B && NullChecker.a(this.f14447A) && this.f14447A == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                        privilegeRecyclerSVIPView.setSelectCouponId(this.f14478z);
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                    }
                    break;
                case 5:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerODiamondView(m16670C0());
                    break;
                case 6:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerPlatinumView(m16670C0());
                    break;
                case 7:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerSupremePartnerView(m16670C0());
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
            if (NullChecker.a(privilegeRecyclerYouthVipView)) {
                this.f14476x.put(purchaseType, (ViewGroup) privilegeRecyclerYouthVipView);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m16690y(Bundle bundle) {
        ahl0.m11841r0();
        m16688w();
        m16673G();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m16691z(int i) {
        this.f14460h.setCurrentItem(i);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ihl0$a */
    public class C0838a implements ViewPager.j {
        public C0838a() {
        }

        public void onPageScrollStateChanged(int i) {
            boolean z = false;
            if (i != 0) {
                if (i == 2) {
                    ihl0.this.m16686u();
                    ihl0 ihl0Var = ihl0.this;
                    xdl0.M(ihl0Var.f14463k, ahl0.m11842t0(PurchaseType.TYPE_YOUTH_VIP, ihl0Var.f14460h.getCurrentItem()));
                    ihl0 ihl0Var2 = ihl0.this;
                    xdl0.M(ihl0Var2.f14464l, ahl0.m11842t0(PurchaseType.TYPE_FEMALE_VIP, ihl0Var2.f14460h.getCurrentItem()));
                    ihl0 ihl0Var3 = ihl0.this;
                    xdl0.M(ihl0Var3.f14465m, ahl0.m11842t0(PurchaseType.TYPE_GET_VIP, ihl0Var3.f14460h.getCurrentItem()));
                    ihl0 ihl0Var4 = ihl0.this;
                    xdl0.M(ihl0Var4.f14466n, ahl0.m11842t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, ihl0Var4.f14460h.getCurrentItem()));
                    ihl0 ihl0Var5 = ihl0.this;
                    xdl0.M(ihl0Var5.f14468p, ahl0.m11842t0(PurchaseType.TYPE_O_DIAMOND, ihl0Var5.f14460h.getCurrentItem()));
                    ihl0 ihl0Var6 = ihl0.this;
                    xdl0.M(ihl0Var6.f14467o, ahl0.m11842t0(PurchaseType.TYPE_O_PLATINUM, ihl0Var6.f14460h.getCurrentItem()));
                    ihl0 ihl0Var7 = ihl0.this;
                    FrameLayout frameLayout = ihl0Var7.f14469q;
                    if (ahl0.m11842t0(PurchaseType.TYPE_SUPREME_PARTNER, ihl0Var7.f14460h.getCurrentItem()) && !xma.m27357N3()) {
                        z = true;
                    }
                    xdl0.M(frameLayout, z);
                    if (NullChecker.a(ihl0.this.f14449C)) {
                        ihl0.this.f14449C.m12684f(ahl0.m11838o0(ihl0.this.f14460h.getCurrentItem()));
                        return;
                    }
                    return;
                }
                return;
            }
            ihl0 ihl0Var8 = ihl0.this;
            PrivilegePaymentView privilegePaymentView = ihl0Var8.f14463k;
            PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
            xdl0.M(privilegePaymentView, ahl0.m11842t0(purchaseType, ihl0Var8.f14460h.getCurrentItem()));
            ihl0 ihl0Var9 = ihl0.this;
            PrivilegePaymentView privilegePaymentView2 = ihl0Var9.f14464l;
            PurchaseType purchaseType2 = PurchaseType.TYPE_FEMALE_VIP;
            xdl0.M(privilegePaymentView2, ahl0.m11842t0(purchaseType2, ihl0Var9.f14460h.getCurrentItem()));
            ihl0 ihl0Var10 = ihl0.this;
            PrivilegePaymentView privilegePaymentView3 = ihl0Var10.f14465m;
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
            xdl0.M(privilegePaymentView3, ahl0.m11842t0(purchaseType3, ihl0Var10.f14460h.getCurrentItem()));
            ihl0 ihl0Var11 = ihl0.this;
            PrivilegePaymentView privilegePaymentView4 = ihl0Var11.f14466n;
            PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            xdl0.M(privilegePaymentView4, ahl0.m11842t0(purchaseType4, ihl0Var11.f14460h.getCurrentItem()));
            ihl0 ihl0Var12 = ihl0.this;
            PrivilegePaymentView privilegePaymentView5 = ihl0Var12.f14468p;
            PurchaseType purchaseType5 = PurchaseType.TYPE_O_DIAMOND;
            xdl0.M(privilegePaymentView5, ahl0.m11842t0(purchaseType5, ihl0Var12.f14460h.getCurrentItem()));
            ihl0 ihl0Var13 = ihl0.this;
            PrivilegePaymentView privilegePaymentView6 = ihl0Var13.f14467o;
            PurchaseType purchaseType6 = PurchaseType.TYPE_O_PLATINUM;
            xdl0.M(privilegePaymentView6, ahl0.m11842t0(purchaseType6, ihl0Var13.f14460h.getCurrentItem()));
            ihl0 ihl0Var14 = ihl0.this;
            FrameLayout frameLayout2 = ihl0Var14.f14469q;
            PurchaseType purchaseType7 = PurchaseType.TYPE_SUPREME_PARTNER;
            if (ahl0.m11842t0(purchaseType7, ihl0Var14.f14460h.getCurrentItem()) && !xma.m27357N3()) {
                z = true;
            }
            xdl0.M(frameLayout2, z);
            boolean zM11842t0 = ahl0.m11842t0(purchaseType, ihl0.this.f14460h.getCurrentItem());
            ihl0 ihl0Var15 = ihl0.this;
            if (zM11842t0) {
                ihl0Var15.f14473u.f7593C.onNext(purchaseType);
                ihl0.this.m16678M(purchaseType);
            } else {
                boolean zM11842t1 = ahl0.m11842t0(purchaseType2, ihl0Var15.f14460h.getCurrentItem());
                ihl0 ihl0Var16 = ihl0.this;
                if (zM11842t1) {
                    ihl0Var16.f14473u.f7593C.onNext(purchaseType2);
                    ihl0.this.m16678M(purchaseType2);
                } else {
                    boolean zM11842t2 = ahl0.m11842t0(purchaseType3, ihl0Var16.f14460h.getCurrentItem());
                    ihl0 ihl0Var17 = ihl0.this;
                    if (zM11842t2) {
                        ihl0Var17.f14473u.f7593C.onNext(purchaseType3);
                        ihl0.this.m16678M(purchaseType3);
                    } else {
                        boolean zM11842t3 = ahl0.m11842t0(purchaseType4, ihl0Var17.f14460h.getCurrentItem());
                        ihl0 ihl0Var18 = ihl0.this;
                        if (zM11842t3) {
                            ihl0Var18.f14473u.f7593C.onNext(purchaseType4);
                            ihl0.this.m16678M(purchaseType4);
                        } else {
                            boolean zM11842t4 = ahl0.m11842t0(purchaseType5, ihl0Var18.f14460h.getCurrentItem());
                            ihl0 ihl0Var19 = ihl0.this;
                            if (zM11842t4) {
                                ihl0Var19.f14473u.f7593C.onNext(purchaseType5);
                                ihl0.this.m16678M(purchaseType5);
                            } else {
                                boolean zM11842t5 = ahl0.m11842t0(purchaseType6, ihl0Var19.f14460h.getCurrentItem());
                                ihl0 ihl0Var20 = ihl0.this;
                                if (zM11842t5) {
                                    ihl0Var20.f14473u.f7593C.onNext(purchaseType6);
                                    ihl0.this.m16678M(purchaseType6);
                                } else if (ahl0.m11842t0(purchaseType7, ihl0Var20.f14460h.getCurrentItem())) {
                                    ihl0.this.f14473u.f7593C.onNext(purchaseType7);
                                    ihl0.this.m16678M(purchaseType7);
                                }
                            }
                        }
                    }
                }
            }
            ihl0.this.m16685s();
            ihl0.this.m16680O();
            if (NullChecker.a(ihl0.this.f14449C)) {
                ihl0.this.f14449C.m12682d(ahl0.m11838o0(ihl0.this.f14460h.getCurrentItem()));
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (f == 0.0f && i2 == 0) {
                ihl0.this.f14451E.m16129v(ahl0.m11840q0().get(Math.min(i, ahl0.m11840q0().size() - 1)).productCategory());
            }
            if (ahl0.m11842t0(PurchaseType.TYPE_YOUTH_VIP, i)) {
                ihl0.this.f14463k.setViewsAlpha(1.0f - f);
                ihl0.this.f14464l.setViewsAlpha(f);
                ihl0.this.f14465m.setViewsAlpha(f);
                ihl0.this.f14466n.setViewsAlpha(f);
                ihl0.this.f14468p.setViewsAlpha(f);
                ihl0.this.f14467o.setViewsAlpha(f);
                ihl0.this.f14469q.setAlpha(f);
            } else if (ahl0.m11842t0(PurchaseType.TYPE_FEMALE_VIP, i)) {
                ihl0.this.f14464l.setViewsAlpha(1.0f - f);
                ihl0.this.f14465m.setViewsAlpha(f);
                ihl0.this.f14466n.setViewsAlpha(f);
                ihl0.this.f14468p.setViewsAlpha(f);
                ihl0.this.f14467o.setViewsAlpha(f);
                ihl0.this.f14469q.setAlpha(f);
            } else if (ahl0.m11842t0(PurchaseType.TYPE_GET_VIP, i)) {
                ihl0.this.f14463k.setViewsAlpha(f);
                ihl0.this.f14464l.setViewsAlpha(f);
                ihl0.this.f14465m.setViewsAlpha(1.0f - f);
                ihl0.this.f14466n.setViewsAlpha(f);
                ihl0.this.f14468p.setViewsAlpha(f);
                ihl0.this.f14467o.setViewsAlpha(f);
                ihl0.this.f14469q.setAlpha(f);
            } else if (ahl0.m11842t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, i)) {
                ihl0.this.f14463k.setViewsAlpha(f);
                ihl0.this.f14464l.setViewsAlpha(f);
                ihl0.this.f14465m.setViewsAlpha(f);
                ihl0.this.f14466n.setViewsAlpha(1.0f - f);
                ihl0.this.f14468p.setViewsAlpha(f);
                ihl0.this.f14467o.setViewsAlpha(f);
                ihl0.this.f14469q.setAlpha(f);
            } else if (ahl0.m11842t0(PurchaseType.TYPE_O_DIAMOND, i)) {
                ihl0.this.f14463k.setViewsAlpha(f);
                ihl0.this.f14464l.setViewsAlpha(f);
                ihl0.this.f14465m.setViewsAlpha(f);
                ihl0.this.f14466n.setViewsAlpha(f);
                ihl0.this.f14468p.setViewsAlpha(1.0f - f);
                ihl0.this.f14467o.setViewsAlpha(f);
                ihl0.this.f14469q.setAlpha(f);
            } else if (ahl0.m11842t0(PurchaseType.TYPE_O_PLATINUM, i)) {
                ihl0.this.f14463k.setViewsAlpha(f);
                ihl0.this.f14464l.setViewsAlpha(f);
                ihl0.this.f14465m.setViewsAlpha(f);
                ihl0.this.f14466n.setViewsAlpha(f);
                ihl0.this.f14468p.setViewsAlpha(f);
                ihl0.this.f14467o.setViewsAlpha(1.0f - f);
                ihl0.this.f14469q.setAlpha(f);
            } else if (ahl0.m11842t0(PurchaseType.TYPE_SUPREME_PARTNER, i)) {
                ihl0.this.f14463k.setViewsAlpha(f);
                ihl0.this.f14464l.setViewsAlpha(f);
                ihl0.this.f14465m.setViewsAlpha(f);
                ihl0.this.f14466n.setViewsAlpha(f);
                ihl0.this.f14468p.setViewsAlpha(f);
                ihl0.this.f14467o.setViewsAlpha(f);
                ihl0.this.f14469q.setAlpha(1.0f - f);
            }
            if (NullChecker.a(ihl0.this.f14449C)) {
                ihl0.this.f14449C.m12683e(ahl0.m11838o0(i), f, i2);
            }
        }

        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: l.ihl0$b */
    public class C0839b implements TabLayout.OnTabSelectedListener {
        public C0839b() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            ihl0.this.m16676K();
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
