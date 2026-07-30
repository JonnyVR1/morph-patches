package p153l;

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
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegePaymentView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerFemaleVIPView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerODiamondView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerPlatinumView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerSVIPView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerSupremePartnerView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerVIPView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegeRecyclerYouthVipView;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.behavior.TabLayoutScrollBehavior;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.TopCardLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view.bottom.AlphaTransformerViewPager;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VIcon;
import p151v.VSegmentBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class mql0 implements iam<eql0> {

    /* JADX INFO: renamed from: C */
    public fql0 f138076C;

    /* JADX INFO: renamed from: E */
    public lib0 f138078E;

    /* JADX INFO: renamed from: a */
    public FrameLayout f138080a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f138081b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f138082c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f138083d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f138084e;

    /* JADX INFO: renamed from: f */
    public CoordinatorLayout f138085f;

    /* JADX INFO: renamed from: g */
    public TopCardLayout f138086g;

    /* JADX INFO: renamed from: h */
    public AlphaTransformerViewPager f138087h;

    /* JADX INFO: renamed from: i */
    public VSegmentBar f138088i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f138089j;

    /* JADX INFO: renamed from: k */
    public PrivilegePaymentView f138090k;

    /* JADX INFO: renamed from: l */
    public PrivilegePaymentView f138091l;

    /* JADX INFO: renamed from: m */
    public PrivilegePaymentView f138092m;

    /* JADX INFO: renamed from: n */
    public PrivilegePaymentView f138093n;

    /* JADX INFO: renamed from: o */
    public PrivilegePaymentView f138094o;

    /* JADX INFO: renamed from: p */
    public PrivilegePaymentView f138095p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f138096q;

    /* JADX INFO: renamed from: r */
    public VText f138097r;

    /* JADX INFO: renamed from: s */
    public View f138098s;

    /* JADX INFO: renamed from: t */
    public VIcon f138099t;

    /* JADX INFO: renamed from: u */
    public VipFrag f138100u;

    /* JADX INFO: renamed from: v */
    public eql0 f138101v;

    /* JADX INFO: renamed from: w */
    public ub3 f138102w;

    /* JADX INFO: renamed from: x */
    public LinkedHashMap<PurchaseType, ViewGroup> f138103x = new LinkedHashMap<>();

    /* JADX INFO: renamed from: y */
    public boolean f138104y = false;

    /* JADX INFO: renamed from: z */
    public String f138105z = null;

    /* JADX INFO: renamed from: A */
    public PurchaseType f138074A = null;

    /* JADX INFO: renamed from: B */
    public boolean f138075B = false;

    /* JADX INFO: renamed from: D */
    public vc0 f138077D = new vc0();

    /* JADX INFO: renamed from: F */
    public pf60<String, ProductCategory> f138079F = null;

    /* JADX INFO: renamed from: l.mql0$c */
    public class RunnableC18676c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PurchaseType f138108a;

        public RunnableC18676c(PurchaseType purchaseType) {
            this.f138108a = purchaseType;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
            mql0.this.f138086g._viewpager.setCurrentItem(arrayListM121938q0.indexOf(this.f138108a) == -1 ? 0 : arrayListM121938q0.indexOf(this.f138108a));
            if (this.f138108a == PurchaseType.TYPE_GET_VIP && !CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
                mql0.this.m159534J();
            } else {
                if (this.f138108a != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
                    return;
                }
                mql0.this.m159534J();
            }
        }
    }

    /* JADX INFO: renamed from: l.mql0$d */
    public static /* synthetic */ class C18677d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f138110a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f138110a = iArr;
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138110a[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138110a[PurchaseType.TYPE_GET_VIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138110a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f138110a[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138110a[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f138110a[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public mql0(VipFrag vipFrag) {
        this.f138100u = vipFrag;
    }

    /* JADX INFO: renamed from: I */
    private void m159515I() {
        this.f138099t.setIconStyle(4);
        this.f138099t.setImageResource(dbc0.f86318Kl);
        this.f138084e.setRightIconViews(this.f138099t);
        this.f138099t.setOnClickListener(new View.OnClickListener() { // from class: l.kql0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128257a.m159529C(view);
            }
        });
        this.f138084e.setLeftIconOnClick(new View.OnClickListener() { // from class: l.lql0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133229a.m159530E(view);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m159516a(View view) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m159527A(int i) {
        VSegmentBar vSegmentBar = this.f138088i;
        vSegmentBar.selectTab(vSegmentBar.getTabAt(i));
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m159528B() {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        if (eql0.m121940t0(purchaseType, this.f138087h.getCurrentItem())) {
            this.f138100u.f38660C.onNext(purchaseType);
            m159537M(purchaseType);
        } else {
            PurchaseType purchaseType2 = PurchaseType.TYPE_FEMALE_VIP;
            if (eql0.m121940t0(purchaseType2, this.f138087h.getCurrentItem())) {
                this.f138100u.f38660C.onNext(purchaseType2);
                m159537M(purchaseType2);
            } else {
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
                if (eql0.m121940t0(purchaseType3, this.f138087h.getCurrentItem())) {
                    this.f138100u.f38660C.onNext(purchaseType3);
                    m159537M(purchaseType3);
                } else {
                    PurchaseType purchaseType4 = PurchaseType.TYPE_O_PLATINUM;
                    if (eql0.m121940t0(purchaseType4, this.f138087h.getCurrentItem())) {
                        this.f138100u.f38660C.onNext(purchaseType4);
                        m159537M(purchaseType4);
                    } else {
                        PurchaseType purchaseType5 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                        if (eql0.m121940t0(purchaseType5, this.f138087h.getCurrentItem())) {
                            this.f138100u.f38660C.onNext(purchaseType5);
                            m159537M(purchaseType5);
                        } else {
                            PurchaseType purchaseType6 = PurchaseType.TYPE_O_DIAMOND;
                            if (eql0.m121940t0(purchaseType6, this.f138087h.getCurrentItem())) {
                                this.f138100u.f38660C.onNext(purchaseType6);
                                m159537M(purchaseType6);
                            } else {
                                PurchaseType purchaseType7 = PurchaseType.TYPE_SUPREME_PARTNER;
                                if (eql0.m121940t0(purchaseType7, this.f138087h.getCurrentItem())) {
                                    this.f138100u.f38660C.onNext(purchaseType7);
                                    m159537M(purchaseType7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (NullChecker.m82486a(this.f138076C)) {
            this.f138076C.m126777d(eql0.m121936o0(this.f138087h.getCurrentItem()));
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m159529C(View view) {
        rj90.m181694d();
        this.f138101v.m121945n0();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f138100u.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m159530E(View view) {
        getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: F */
    public void m159531F(PurchaseType purchaseType) {
        this.f138086g._viewpager.post(new RunnableC18676c(purchaseType));
    }

    /* JADX INFO: renamed from: G */
    public void m159532G() {
        m159515I();
        m159533H();
        Bundle arguments = this.f138100u.getArguments();
        if (NullChecker.m82486a(arguments)) {
            boolean z = false;
            final int i = arguments.getInt("vip_selected_page", 0);
            beb0 beb0Var = new beb0(eql0.m121938q0().get(i).productCategory(), PurchaseTrackPageType.page_privilege, arguments.getString("vip_selected_from", ""));
            this.f138078E = beb0Var;
            beb0Var.m154339p(OMSDialogPositon.p_privileges_view);
            this.f138086g._viewpager.setCurrentItem(i);
            getAct().post(new Runnable() { // from class: l.iql0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116421a.m159527A(i);
                }
            });
            bnl0.m105524M(this.f138090k, eql0.m121940t0(PurchaseType.TYPE_YOUTH_VIP, i));
            bnl0.m105524M(this.f138091l, eql0.m121940t0(PurchaseType.TYPE_FEMALE_VIP, i));
            bnl0.m105524M(this.f138092m, eql0.m121940t0(PurchaseType.TYPE_GET_VIP, i));
            bnl0.m105524M(this.f138093n, eql0.m121940t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, i));
            PrivilegePaymentView privilegePaymentView = this.f138095p;
            PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
            bnl0.m105524M(privilegePaymentView, eql0.m121940t0(purchaseType, i));
            bnl0.m105524M(this.f138094o, eql0.m121940t0(PurchaseType.TYPE_O_PLATINUM, i));
            FrameLayout frameLayout = this.f138096q;
            PurchaseType purchaseType2 = PurchaseType.TYPE_SUPREME_PARTNER;
            if (eql0.m121940t0(purchaseType2, i) && !joa.m146363O3()) {
                z = true;
            }
            bnl0.m105524M(frameLayout, z);
            if (eql0.m121940t0(purchaseType2, i)) {
                bnl0.m105524M(this.f138082c, true);
                if (NullChecker.m82486a(this.f138076C)) {
                    this.f138076C.m126780g(purchaseType2);
                }
            } else if (eql0.m121940t0(purchaseType, i) && s7a.m184986o()) {
                bnl0.m105524M(this.f138082c, true);
                if (NullChecker.m82486a(this.f138076C)) {
                    this.f138076C.m126780g(purchaseType);
                }
            }
        }
        this.f138080a.post(new Runnable() { // from class: l.jql0
            @Override // java.lang.Runnable
            public final void run() {
                this.f122227a.m159528B();
            }
        });
        m159539O();
    }

    /* JADX INFO: renamed from: H */
    public void m159533H() {
        ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
        this.f138086g.m58631f(arrayListM121938q0);
        ArrayList<ViewGroup> arrayList = new ArrayList<>();
        Iterator<PurchaseType> it = arrayListM121938q0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f138103x.get(it.next()));
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f138102w.m195209s(arrayList);
    }

    /* JADX INFO: renamed from: J */
    public void m159534J() {
        TopCardLayout topCardLayout = this.f138086g;
        topCardLayout.setTranslationY((-(topCardLayout.getHeight() - Math.abs(this.f138088i.getHeight()))) + TabLayoutScrollBehavior.INSTANCE.m58620a());
        Iterator<Map.Entry<PurchaseType, ViewGroup>> it = this.f138103x.entrySet().iterator();
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
    public void m159535K() {
        this.f138086g.setTranslationY(0.0f);
        Iterator<Map.Entry<PurchaseType, ViewGroup>> it = this.f138103x.entrySet().iterator();
        while (it.hasNext()) {
            ViewGroup value = it.next().getValue();
            if (value instanceof RecyclerView) {
                ((RecyclerView) value).scrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m159536L(PurchaseType purchaseType, Privilege privilege, String str) {
        ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
        this.f138086g._viewpager.setCurrentItem(arrayListM121938q0.indexOf(purchaseType) == -1 ? 0 : arrayListM121938q0.indexOf(purchaseType));
        m159542q(purchaseType, privilege, str);
    }

    /* JADX INFO: renamed from: M */
    public final void m159537M(PurchaseType purchaseType) {
        this.f138090k.setCurrentPurchaseType(purchaseType);
        this.f138091l.setCurrentPurchaseType(purchaseType);
        this.f138092m.setCurrentPurchaseType(purchaseType);
        this.f138093n.setCurrentPurchaseType(purchaseType);
        this.f138095p.setCurrentPurchaseType(purchaseType);
        this.f138094o.setCurrentPurchaseType(purchaseType);
    }

    /* JADX INFO: renamed from: N */
    public final void m159538N(PurchaseType purchaseType, Privilege privilege, String str) {
        String str2 = cok0.f82895a;
        switch (C18677d.f138110a[purchaseType.ordinal()]) {
            case 1:
                if (s7a.m184997z()) {
                    if (!joa.m146364P3()) {
                        C8927c.m54603P0(getAct(), str2);
                    } else {
                        o1j0.m165652z(getAct().string(R$string.f19511o3), getAct().getWindow().getDecorView());
                    }
                }
                break;
            case 2:
                if (s7a.m184982k() && joa.m146353C3()) {
                    o1j0.m165652z(getAct().string(R$string.f19511o3), getAct().getWindow().getDecorView());
                } else {
                    C8927c.m54612U(getAct(), str2);
                }
                break;
            case 3:
                if (privilege != Privilege.intl_no_ad) {
                    C8927c.m54586J1(getAct(), str, Privilege.vip_unlimited_likes);
                } else {
                    CoreModule.m30933P().m143405a().mo34524i6(getAct(), str, privilege);
                }
                break;
            case 4:
                if (t450.m189175j() && joa.m146361M3()) {
                    o1j0.m165652z(getAct().string(R$string.f19511o3), getAct().getWindow().getDecorView());
                } else if (privilege != Privilege.intl_no_ad) {
                    CoreModule.m30933P().m143405a().mo34568pr(getAct(), str2, Privilege.see_who_likes_me);
                } else {
                    CoreModule.m30933P().m143405a().mo34524i6(getAct(), str, privilege);
                }
                break;
            case 5:
                C8927c.m54622a0(getAct(), str2, null, null, null, Privilege.immediately_match);
                break;
            case 6:
                C8927c.m54658n0(getAct(), str2);
                break;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m159539O() {
        int currentItem = this.f138087h.getCurrentItem();
        ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
        if (currentItem < arrayListM121938q0.size()) {
            PurchaseType purchaseType = arrayListM121938q0.get(currentItem);
            for (Map.Entry<PurchaseType, ViewGroup> entry : this.f138103x.entrySet()) {
                if (entry.getValue() instanceof o290) {
                    if (entry.getKey() == purchaseType) {
                        ((o290) entry.getValue()).mo58113q();
                    } else {
                        ((o290) entry.getValue()).mo58111c();
                    }
                }
            }
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m159540n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m159540n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nql0.m164335b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eql0 eql0Var) {
        this.f138101v = eql0Var;
    }

    /* JADX INFO: renamed from: q */
    public void m159542q(PurchaseType purchaseType, Privilege privilege, String str) {
        if (purchaseType == PurchaseType.TYPE_YOUTH_VIP && !joa.m146364P3()) {
            m159534J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_FEMALE_VIP && !joa.m146353C3()) {
            m159534J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_VIP && !CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            m159534J();
            return;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            m159534J();
            return;
        }
        if (wib0.m206565i(purchaseType) && !joa.m146357G3()) {
            m159534J();
        } else if (!wib0.m206571o(purchaseType) || joa.m146359I3()) {
            m159538N(purchaseType, privilege, str);
        } else {
            m159534J();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m159543s() {
        int currentItem = this.f138087h.getCurrentItem();
        ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
        if (currentItem < arrayListM121938q0.size()) {
            rj90.m181691a(arrayListM121938q0.get(currentItem));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m159544u() {
        pf60<String, ProductCategory> pf60Var = this.f138079F;
        if (pf60Var == null || TextUtils.isEmpty(pf60Var.f152156a)) {
            return;
        }
        C4499d.m21895l().m21899k(this.f138079F.f152156a);
        this.f138079F = null;
    }

    /* JADX INFO: renamed from: v */
    public lib0 m159545v() {
        return this.f138078E;
    }

    /* JADX INFO: renamed from: w */
    public void m159546w() {
        this.f138075B = false;
        ArrayList<PurchaseType> arrayListM121938q0 = eql0.m121938q0();
        Bundle arguments = this.f138100u.getArguments();
        if (this.f138075B) {
            int i = arguments.getInt("vip_selected_page", 0);
            boolean z = arguments.getBoolean("frag_args_section_select", false);
            this.f138104y = z;
            if (z) {
                String string = arguments.getString("frag_args_section_promotion");
                this.f138105z = string;
                if (!TextUtils.isEmpty(string) && eql0.m121938q0().size() > i) {
                    this.f138074A = eql0.m121938q0().get(i);
                }
            }
        }
        this.f138099t = new VIcon(getContext());
        if (s7a.m184986o()) {
            this.f138084e.setBackground(null);
            fql0 fql0Var = new fql0(this);
            this.f138076C = fql0Var;
            fql0Var.m126780g(this.f138074A);
            this.f138076C.m126776c();
        }
        if (s7a.m184997z() && eql0.m121938q0().size() * fql0.f100310b > bnl0.m105592y0()) {
            this.f138088i.setTabMode(0);
        }
        m159547x(arrayListM121938q0);
        ub3 ub3Var = new ub3(this.f138100u);
        this.f138102w = ub3Var;
        this.f138087h.setAdapter(ub3Var);
        this.f138087h.setOffscreenPageLimit(arrayListM121938q0.size());
        this.f138087h.mo4182X(true, new ya3());
        this.f138087h.m4187d(new C18674a());
        this.f138086g.setBottomContentInterface(new tb3() { // from class: l.gql0
            @Override // p153l.tb3
            /* JADX INFO: renamed from: a */
            public final void mo131377a(int i2) {
                this.f105689a.m159549z(i2);
            }
        });
        this.f138086g.m58632g(this.f138100u, this.f138088i);
        this.f138088i.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18675b());
        this.f138089j.setOnClickListener(new View.OnClickListener() { // from class: l.hql0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mql0.m159516a(view);
            }
        });
        pta.m173704A(false);
        pta.m173732y(new WeakReference(this.f138077D));
        if (s7a.m184986o()) {
            this.f138095p.setBackgroundColor(Color.parseColor("#150701"));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m159547x(ArrayList<PurchaseType> arrayList) {
        PrivilegeRecyclerVIPView privilegeRecyclerVIPView;
        PrivilegeRecyclerSVIPView privilegeRecyclerSVIPView;
        ViewGroup privilegeRecyclerYouthVipView;
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f138103x.clear();
        for (PurchaseType purchaseType : arrayList) {
            switch (C18677d.f138110a[purchaseType.ordinal()]) {
                case 1:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerYouthVipView(getContext());
                    break;
                case 2:
                    privilegeRecyclerYouthVipView = new PrivilegeRecyclerFemaleVIPView(getContext());
                    break;
                case 3:
                    privilegeRecyclerVIPView = new PrivilegeRecyclerVIPView(getContext());
                    privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                    if (this.f138075B && NullChecker.m82486a(this.f138074A) && this.f138074A == PurchaseType.TYPE_GET_VIP) {
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                        privilegeRecyclerVIPView.setSelectCouponId(this.f138105z);
                        privilegeRecyclerYouthVipView = privilegeRecyclerVIPView;
                    }
                    break;
                case 4:
                    privilegeRecyclerSVIPView = new PrivilegeRecyclerSVIPView(getContext());
                    privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                    if (this.f138075B && NullChecker.m82486a(this.f138074A) && this.f138074A == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                        privilegeRecyclerYouthVipView = privilegeRecyclerSVIPView;
                        privilegeRecyclerSVIPView.setSelectCouponId(this.f138105z);
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
            if (NullChecker.m82486a(privilegeRecyclerYouthVipView)) {
                this.f138103x.put(purchaseType, privilegeRecyclerYouthVipView);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m159548y(Bundle bundle) {
        eql0.m121939r0();
        m159546w();
        m159532G();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m159549z(int i) {
        this.f138087h.setCurrentItem(i);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.mql0$a */
    public class C18674a implements ViewPager.InterfaceC0718j {
        public C18674a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            boolean z = false;
            if (i != 0) {
                if (i == 2) {
                    mql0.this.m159544u();
                    mql0 mql0Var = mql0.this;
                    bnl0.m105524M(mql0Var.f138090k, eql0.m121940t0(PurchaseType.TYPE_YOUTH_VIP, mql0Var.f138087h.getCurrentItem()));
                    mql0 mql0Var2 = mql0.this;
                    bnl0.m105524M(mql0Var2.f138091l, eql0.m121940t0(PurchaseType.TYPE_FEMALE_VIP, mql0Var2.f138087h.getCurrentItem()));
                    mql0 mql0Var3 = mql0.this;
                    bnl0.m105524M(mql0Var3.f138092m, eql0.m121940t0(PurchaseType.TYPE_GET_VIP, mql0Var3.f138087h.getCurrentItem()));
                    mql0 mql0Var4 = mql0.this;
                    bnl0.m105524M(mql0Var4.f138093n, eql0.m121940t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, mql0Var4.f138087h.getCurrentItem()));
                    mql0 mql0Var5 = mql0.this;
                    bnl0.m105524M(mql0Var5.f138095p, eql0.m121940t0(PurchaseType.TYPE_O_DIAMOND, mql0Var5.f138087h.getCurrentItem()));
                    mql0 mql0Var6 = mql0.this;
                    bnl0.m105524M(mql0Var6.f138094o, eql0.m121940t0(PurchaseType.TYPE_O_PLATINUM, mql0Var6.f138087h.getCurrentItem()));
                    mql0 mql0Var7 = mql0.this;
                    FrameLayout frameLayout = mql0Var7.f138096q;
                    if (eql0.m121940t0(PurchaseType.TYPE_SUPREME_PARTNER, mql0Var7.f138087h.getCurrentItem()) && !joa.m146363O3()) {
                        z = true;
                    }
                    bnl0.m105524M(frameLayout, z);
                    if (NullChecker.m82486a(mql0.this.f138076C)) {
                        mql0.this.f138076C.m126779f(eql0.m121936o0(mql0.this.f138087h.getCurrentItem()));
                        return;
                    }
                    return;
                }
                return;
            }
            mql0 mql0Var8 = mql0.this;
            PrivilegePaymentView privilegePaymentView = mql0Var8.f138090k;
            PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
            bnl0.m105524M(privilegePaymentView, eql0.m121940t0(purchaseType, mql0Var8.f138087h.getCurrentItem()));
            mql0 mql0Var9 = mql0.this;
            PrivilegePaymentView privilegePaymentView2 = mql0Var9.f138091l;
            PurchaseType purchaseType2 = PurchaseType.TYPE_FEMALE_VIP;
            bnl0.m105524M(privilegePaymentView2, eql0.m121940t0(purchaseType2, mql0Var9.f138087h.getCurrentItem()));
            mql0 mql0Var10 = mql0.this;
            PrivilegePaymentView privilegePaymentView3 = mql0Var10.f138092m;
            PurchaseType purchaseType3 = PurchaseType.TYPE_GET_VIP;
            bnl0.m105524M(privilegePaymentView3, eql0.m121940t0(purchaseType3, mql0Var10.f138087h.getCurrentItem()));
            mql0 mql0Var11 = mql0.this;
            PrivilegePaymentView privilegePaymentView4 = mql0Var11.f138093n;
            PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            bnl0.m105524M(privilegePaymentView4, eql0.m121940t0(purchaseType4, mql0Var11.f138087h.getCurrentItem()));
            mql0 mql0Var12 = mql0.this;
            PrivilegePaymentView privilegePaymentView5 = mql0Var12.f138095p;
            PurchaseType purchaseType5 = PurchaseType.TYPE_O_DIAMOND;
            bnl0.m105524M(privilegePaymentView5, eql0.m121940t0(purchaseType5, mql0Var12.f138087h.getCurrentItem()));
            mql0 mql0Var13 = mql0.this;
            PrivilegePaymentView privilegePaymentView6 = mql0Var13.f138094o;
            PurchaseType purchaseType6 = PurchaseType.TYPE_O_PLATINUM;
            bnl0.m105524M(privilegePaymentView6, eql0.m121940t0(purchaseType6, mql0Var13.f138087h.getCurrentItem()));
            mql0 mql0Var14 = mql0.this;
            FrameLayout frameLayout2 = mql0Var14.f138096q;
            PurchaseType purchaseType7 = PurchaseType.TYPE_SUPREME_PARTNER;
            if (eql0.m121940t0(purchaseType7, mql0Var14.f138087h.getCurrentItem()) && !joa.m146363O3()) {
                z = true;
            }
            bnl0.m105524M(frameLayout2, z);
            boolean zM121940t0 = eql0.m121940t0(purchaseType, mql0.this.f138087h.getCurrentItem());
            mql0 mql0Var15 = mql0.this;
            if (zM121940t0) {
                mql0Var15.f138100u.f38660C.onNext(purchaseType);
                mql0.this.m159537M(purchaseType);
            } else {
                boolean zM121940t1 = eql0.m121940t0(purchaseType2, mql0Var15.f138087h.getCurrentItem());
                mql0 mql0Var16 = mql0.this;
                if (zM121940t1) {
                    mql0Var16.f138100u.f38660C.onNext(purchaseType2);
                    mql0.this.m159537M(purchaseType2);
                } else {
                    boolean zM121940t2 = eql0.m121940t0(purchaseType3, mql0Var16.f138087h.getCurrentItem());
                    mql0 mql0Var17 = mql0.this;
                    if (zM121940t2) {
                        mql0Var17.f138100u.f38660C.onNext(purchaseType3);
                        mql0.this.m159537M(purchaseType3);
                    } else {
                        boolean zM121940t3 = eql0.m121940t0(purchaseType4, mql0Var17.f138087h.getCurrentItem());
                        mql0 mql0Var18 = mql0.this;
                        if (zM121940t3) {
                            mql0Var18.f138100u.f38660C.onNext(purchaseType4);
                            mql0.this.m159537M(purchaseType4);
                        } else {
                            boolean zM121940t4 = eql0.m121940t0(purchaseType5, mql0Var18.f138087h.getCurrentItem());
                            mql0 mql0Var19 = mql0.this;
                            if (zM121940t4) {
                                mql0Var19.f138100u.f38660C.onNext(purchaseType5);
                                mql0.this.m159537M(purchaseType5);
                            } else {
                                boolean zM121940t5 = eql0.m121940t0(purchaseType6, mql0Var19.f138087h.getCurrentItem());
                                mql0 mql0Var20 = mql0.this;
                                if (zM121940t5) {
                                    mql0Var20.f138100u.f38660C.onNext(purchaseType6);
                                    mql0.this.m159537M(purchaseType6);
                                } else if (eql0.m121940t0(purchaseType7, mql0Var20.f138087h.getCurrentItem())) {
                                    mql0.this.f138100u.f38660C.onNext(purchaseType7);
                                    mql0.this.m159537M(purchaseType7);
                                }
                            }
                        }
                    }
                }
            }
            mql0.this.m159543s();
            mql0.this.m159539O();
            if (NullChecker.m82486a(mql0.this.f138076C)) {
                mql0.this.f138076C.m126777d(eql0.m121936o0(mql0.this.f138087h.getCurrentItem()));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            if (f == 0.0f && i2 == 0) {
                mql0.this.f138078E.m154344v(eql0.m121938q0().get(Math.min(i, eql0.m121938q0().size() - 1)).productCategory());
            }
            if (eql0.m121940t0(PurchaseType.TYPE_YOUTH_VIP, i)) {
                mql0.this.f138090k.setViewsAlpha(1.0f - f);
                mql0.this.f138091l.setViewsAlpha(f);
                mql0.this.f138092m.setViewsAlpha(f);
                mql0.this.f138093n.setViewsAlpha(f);
                mql0.this.f138095p.setViewsAlpha(f);
                mql0.this.f138094o.setViewsAlpha(f);
                mql0.this.f138096q.setAlpha(f);
            } else if (eql0.m121940t0(PurchaseType.TYPE_FEMALE_VIP, i)) {
                mql0.this.f138091l.setViewsAlpha(1.0f - f);
                mql0.this.f138092m.setViewsAlpha(f);
                mql0.this.f138093n.setViewsAlpha(f);
                mql0.this.f138095p.setViewsAlpha(f);
                mql0.this.f138094o.setViewsAlpha(f);
                mql0.this.f138096q.setAlpha(f);
            } else if (eql0.m121940t0(PurchaseType.TYPE_GET_VIP, i)) {
                mql0.this.f138090k.setViewsAlpha(f);
                mql0.this.f138091l.setViewsAlpha(f);
                mql0.this.f138092m.setViewsAlpha(1.0f - f);
                mql0.this.f138093n.setViewsAlpha(f);
                mql0.this.f138095p.setViewsAlpha(f);
                mql0.this.f138094o.setViewsAlpha(f);
                mql0.this.f138096q.setAlpha(f);
            } else if (eql0.m121940t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, i)) {
                mql0.this.f138090k.setViewsAlpha(f);
                mql0.this.f138091l.setViewsAlpha(f);
                mql0.this.f138092m.setViewsAlpha(f);
                mql0.this.f138093n.setViewsAlpha(1.0f - f);
                mql0.this.f138095p.setViewsAlpha(f);
                mql0.this.f138094o.setViewsAlpha(f);
                mql0.this.f138096q.setAlpha(f);
            } else if (eql0.m121940t0(PurchaseType.TYPE_O_DIAMOND, i)) {
                mql0.this.f138090k.setViewsAlpha(f);
                mql0.this.f138091l.setViewsAlpha(f);
                mql0.this.f138092m.setViewsAlpha(f);
                mql0.this.f138093n.setViewsAlpha(f);
                mql0.this.f138095p.setViewsAlpha(1.0f - f);
                mql0.this.f138094o.setViewsAlpha(f);
                mql0.this.f138096q.setAlpha(f);
            } else if (eql0.m121940t0(PurchaseType.TYPE_O_PLATINUM, i)) {
                mql0.this.f138090k.setViewsAlpha(f);
                mql0.this.f138091l.setViewsAlpha(f);
                mql0.this.f138092m.setViewsAlpha(f);
                mql0.this.f138093n.setViewsAlpha(f);
                mql0.this.f138095p.setViewsAlpha(f);
                mql0.this.f138094o.setViewsAlpha(1.0f - f);
                mql0.this.f138096q.setAlpha(f);
            } else if (eql0.m121940t0(PurchaseType.TYPE_SUPREME_PARTNER, i)) {
                mql0.this.f138090k.setViewsAlpha(f);
                mql0.this.f138091l.setViewsAlpha(f);
                mql0.this.f138092m.setViewsAlpha(f);
                mql0.this.f138093n.setViewsAlpha(f);
                mql0.this.f138095p.setViewsAlpha(f);
                mql0.this.f138094o.setViewsAlpha(f);
                mql0.this.f138096q.setAlpha(1.0f - f);
            }
            if (NullChecker.m82486a(mql0.this.f138076C)) {
                mql0.this.f138076C.m126778e(eql0.m121936o0(i), f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
        }
    }

    /* JADX INFO: renamed from: l.mql0$b */
    public class C18675b implements TabLayout.OnTabSelectedListener {
        public C18675b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            mql0.this.m159535K();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
