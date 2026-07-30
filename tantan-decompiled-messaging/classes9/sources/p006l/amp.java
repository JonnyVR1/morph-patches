package p006l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeSVipContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeSeeContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeUltraPremiumContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.IntlPrivilegeVipContent;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.IntlBounceBackViewPager;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.IntlTopCardLayout;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view.bottom.IntlAlphaTransformerViewPager;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.HelperManagerAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l.bt0;
import l.c4g0;
import l.d30;
import l.e30;
import l.hce;
import l.hvc0;
import l.jo0;
import l.mep0;
import l.mkd0;
import l.n3b0;
import l.ogj;
import l.s7m;
import l.sab0;
import l.t100;
import l.vwb;
import l.xdl0;
import v.AutoVDraweeView;
import v.VIcon;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class amp implements s7m<glp> {

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f8371b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f8372c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f8373d;

    /* JADX INFO: renamed from: e */
    public IntlTopCardLayout f8374e;

    /* JADX INFO: renamed from: f */
    public IntlAlphaTransformerViewPager f8375f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f8376g;

    /* JADX INFO: renamed from: h */
    public View f8377h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f8378i;

    /* JADX INFO: renamed from: j */
    public VText f8379j;

    /* JADX INFO: renamed from: k */
    public VText f8380k;

    /* JADX INFO: renamed from: l */
    public PutongFrag f8381l;

    /* JADX INFO: renamed from: m */
    public glp f8382m;

    /* JADX INFO: renamed from: n */
    public d.a f8383n;

    /* JADX INFO: renamed from: o */
    public PurchaseType f8384o;

    /* JADX INFO: renamed from: p */
    public d3n f8385p;

    /* JADX INFO: renamed from: q */
    public View f8386q;

    /* JADX INFO: renamed from: v */
    public PurchaseType f8391v;

    /* JADX INFO: renamed from: x */
    public c4g0 f8393x;

    /* JADX INFO: renamed from: a */
    public PurchaseType f8370a = null;

    /* JADX INFO: renamed from: r */
    public ArrayList<ViewGroup> f8387r = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    public String f8388s = "";

    /* JADX INFO: renamed from: t */
    public boolean f8389t = false;

    /* JADX INFO: renamed from: u */
    public final Runnable f8390u = new RunnableC0518a();

    /* JADX INFO: renamed from: w */
    public Interpolator f8392w = new LinearInterpolator();

    /* JADX INFO: renamed from: y */
    public e30<Integer> f8394y = new C0521d();

    /* JADX INFO: renamed from: l.amp$a */
    public class RunnableC0518a implements Runnable {
        public RunnableC0518a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM24988Z = u59.m24988Z();
            amp ampVar = amp.this;
            if (zM24988Z) {
                xdl0.M(ampVar.f8379j, true);
                xdl0.M(amp.this.f8380k, false);
                xdl0.M(amp.this.f8378i, false);
                amp ampVar2 = amp.this;
                int iM12109j0 = ampVar2.m12109j0(ampVar2.f8384o);
                amp ampVar3 = amp.this;
                String strM12111k0 = ampVar3.m12111k0(ampVar3.f8384o);
                amp ampVar4 = amp.this;
                ampVar2.m12103f1(iM12109j0, strM12111k0, ampVar4.m12116n0(ampVar4.f8384o));
                return;
            }
            String strQ = e.q(ampVar.f8383n);
            String strW = e.w(amp.this.f8383n);
            amp ampVar5 = amp.this;
            int iM12109j1 = ampVar5.m12109j0(ampVar5.f8384o);
            amp ampVar6 = amp.this;
            String strM12111k1 = ampVar6.m12111k0(ampVar6.f8384o);
            boolean zM12122u0 = amp.this.m12122u0();
            amp.this.m12114l1();
            xdl0.M(amp.this.f8378i, false);
            xdl0.M(amp.this.f8380k, false);
            xdl0.M(amp.this.f8379j, true);
            int i = C0522e.f8399a[amp.this.f8384o.ordinal()];
            if (i == 1) {
                amp.this.m12101e1(iM12109j1, strM12111k1);
                if (!CoreModule.f1534c.f3628e0.m21490p9().isVIP() && CoreModule.f1534c.f3643j0.m2502B4() && zM12122u0) {
                    amp ampVar7 = amp.this;
                    ampVar7.m12094W0(ampVar7.f8388s);
                    return;
                }
                amp.this.m12097a1(strW);
                boolean zIsVIP = CoreModule.f1534c.f3628e0.m21490p9().isVIP();
                boolean zIsVIPExpired = CoreModule.f1534c.f3628e0.m21490p9().isVIPExpired();
                if (zIsVIP || zIsVIPExpired) {
                    amp.this.f8379j.setText(strQ + " " + ((Object) CoreModule.f1533b.getText(R$string.f1854Js)));
                    return;
                }
                amp.this.f8379j.setText(strQ + " " + ((Object) CoreModule.f1533b.getText(R$string.f1794Hs)));
                return;
            }
            if (i == 2) {
                amp.this.m12101e1(iM12109j1, strM12111k1);
                if (CoreModule.f1534c.f3643j0.m2500A4() && zM12122u0) {
                    amp ampVar8 = amp.this;
                    ampVar8.m12094W0(ampVar8.f8388s);
                    return;
                }
                amp.this.m12097a1(strW);
                long jG = n3b0.g();
                amp ampVar9 = amp.this;
                if (jG != 0) {
                    ampVar9.f8379j.setText(strQ + " " + CoreModule.f1533b.getString(R$string.f1644Cs));
                    return;
                }
                ampVar9.f8379j.setText(strQ + " " + CoreModule.f1533b.getString(R$string.f3036ws));
                return;
            }
            if (i == 3) {
                amp.this.m12101e1(iM12109j1, strM12111k1);
                if (CoreModule.f1534c.f3643j0.m2571y4() && amp.this.m12122u0()) {
                    amp ampVar10 = amp.this;
                    ampVar10.m12094W0(ampVar10.f8388s);
                    return;
                }
                amp.this.m12097a1(strW);
                if (amp.this.f8383n != null && (TEnum.equals(amp.this.f8383n.f(), "tttVipUpgradeToPremium") || TEnum.equals(amp.this.f8383n.f(), "tttSeeUpgradeToPremium"))) {
                    amp.this.f8379j.setText(String.format(amp.this.act().getString(R$string.f1752Gg), amp.this.f8383n.g()));
                    xdl0.M(amp.this.f8378i, true);
                    amp.this.m12110j1();
                    return;
                } else {
                    amp.this.f8379j.setText(strQ + " " + ((Object) CoreModule.f1533b.getText(R$string.f1927Mb)));
                    return;
                }
            }
            if (i != 4) {
                return;
            }
            amp.this.m12101e1(iM12109j1, strM12111k1);
            amp.this.m12099d1(strW, Color.parseColor("#80F9E7FF"));
            if (amp.this.f8383n != null && (TEnum.equals(amp.this.f8383n.f(), "tttPremiumUpgradeToUltra") || TEnum.equals(amp.this.f8383n.f(), "Promo_premiumUpgradeToUltra"))) {
                amp.this.f8379j.setText(String.format(amp.this.act().getString(R$string.f1752Gg), amp.this.f8383n.g()));
                xdl0.M(amp.this.f8378i, true);
                amp.this.m12110j1();
                return;
            }
            boolean zM27391k4 = xma.m27391k4();
            amp ampVar11 = amp.this;
            if (zM27391k4) {
                ampVar11.f8379j.setText(strQ + " " + ((Object) CoreModule.f1533b.getText(R$string.f2844qg)));
                return;
            }
            ampVar11.f8379j.setText(strQ + " " + ((Object) CoreModule.f1533b.getText(R$string.f2814pg)));
        }
    }

    /* JADX INFO: renamed from: l.amp$d */
    public class C0521d implements e30<Integer> {
        public C0521d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            if (num.intValue() == 5) {
                amp ampVar = amp.this;
                ampVar.m12107h1(true, ampVar.f8384o == PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        }
    }

    /* JADX INFO: renamed from: l.amp$e */
    public static /* synthetic */ class C0522e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8399a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f8399a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8399a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8399a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8399a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.amp$f */
    public static class C0523f {
        /* JADX INFO: renamed from: b */
        public static void m12130b(amp ampVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            ampVar.f8371b = viewGroup.getChildAt(0);
            ampVar.f8372c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            ampVar.f8373d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            ampVar.f8374e = (IntlTopCardLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
            ampVar.f8375f = (IntlAlphaTransformerViewPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
            ampVar.f8376g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
            ampVar.f8377h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            ampVar.f8378i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            ampVar.f8379j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2)).getChildAt(0);
            ampVar.f8380k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m12131c(amp ampVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f12254j5, viewGroup, false);
            m12130b(ampVar, viewInflate);
            return viewInflate;
        }
    }

    public amp(PutongFrag putongFrag) {
        this.f8381l = putongFrag;
    }

    /* JADX INFO: renamed from: Y0 */
    private void m12045Y0() {
        this.f8376g.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0519b());
        this.f8374e.m9976e(this.f8381l, new C0520c());
        xdl0.E0(this.f8376g, new View.OnClickListener() { // from class: l.hlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13937a.m12076D0(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12053d(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    private void m12057i0() {
        act().duringCreated(ugc0.m25207c()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.plp
            public final void call(Object obj) {
                this.f19193a.m12124w0((RecentContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.qlp
            public final void call(Object obj) {
                amp.m12064q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m12058j() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m12064q(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    private void m12066s0() {
        this.f8385p = new d3n((IntlVipNewUiFrag) this.f8381l);
        this.f8375f.X(true, new a3n());
        this.f8375f.setOffscreenPageLimit(3);
        this.f8375f.setAdapter(this.f8385p);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m12073A0(View view) {
        if (m12105g1()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m12074B0(View view) {
        nb90.m20000d();
        if (this.f8381l.act() != null) {
            this.f8381l.act().startActivity(new Intent((Context) this.f8381l.act(), (Class<?>) HelperManagerAct.class));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12075C0() {
        return this.f8381l.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m12076D0(View view) {
        m12086O0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m12077E0(boolean z, User user) {
        m12096Z0(user, z);
        u9p.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m12078G0(boolean z, User user) {
        m12096Z0(user, z);
        u9p.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m12079H0(boolean z, User user) {
        m12096Z0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m12080I0(boolean z) {
        m12096Z0(null, z);
        u9p.payFromSalvageAction = "";
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m12081J0(boolean z, User user) {
        m12096Z0(user, z);
        u9p.payFromSalvageAction = "superLiked";
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m12082K0(boolean z, User user) {
        m12096Z0(user, z);
        u9p.payFromSalvageAction = "liked";
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m12083L0(boolean z, User user) {
        m12096Z0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m12085N0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f8378i;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m12086O0() {
        if (!u59.m24988Z()) {
            if (((CoreModule.f1534c.f3643j0.m2500A4() && this.f8384o == PurchaseType.TYPE_GET_LIKERS) || ((CoreModule.f1534c.f3643j0.m2502B4() && this.f8384o == PurchaseType.TYPE_GET_VIP) || (CoreModule.f1534c.f3643j0.m2571y4() && this.f8384o == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE))) && m12122u0()) {
                m12088Q0(CoreModule.f1534c.f3643j0.m2504C4().skuId);
                return;
            } else {
                if (NullChecker.a(this.f8383n) && NullChecker.a(this.f8383n.s())) {
                    m12088Q0(this.f8383n.s().defaultStockKeepUnit.affiliateProducts.getProductId());
                    return;
                }
                return;
            }
        }
        PutongFrag putongFrag = this.f8381l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C0522e.f8399a[this.f8384o.ordinal()];
        if (i == 1) {
            c.K1(this.f8381l.act(), "p_privileges_view,e_buy_privilege_button,click", (Privilege) null, (d30) null, (d30) null);
            return;
        }
        if (i == 2) {
            c.A1(this.f8381l.act(), "p_privileges_view,e_buy_privilege_button,click");
        } else if (i == 3) {
            c.x0(this.f8381l.act(), "p_privileges_view,e_buy_privilege_button,click", (Privilege) null);
        } else {
            if (i != 4) {
                return;
            }
            c.K0(this.f8381l.act(), "p_privileges_view,e_buy_privilege_button,click", (e30) null, (d30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m12087P0() {
        PurchaseType purchaseType;
        d.a aVarM15885p0;
        PutongFrag putongFrag = this.f8381l;
        if (putongFrag == null || putongFrag.act() == null || this.f8382m == null) {
            return;
        }
        int iM12115m0 = m12115m0();
        ArrayList<PurchaseType> arrayListM15879q0 = glp.m15879q0();
        if (iM12115m0 < 0 || iM12115m0 >= arrayListM15879q0.size() || (aVarM15885p0 = this.f8382m.m15885p0((purchaseType = arrayListM15879q0.get(iM12115m0)))) == null || !NullChecker.a(aVarM15885p0.s())) {
            return;
        }
        String productId = aVarM15885p0.s().defaultStockKeepUnit.affiliateProducts.getProductId();
        if (TextUtils.isEmpty(productId)) {
            return;
        }
        PutongFrag putongFrag2 = this.f8381l;
        if (putongFrag2 instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) putongFrag2).getFrom();
        }
        mc60.m19205b(this.f8381l.act(), purchaseType, aVarM15885p0.C(), productId, ogj.c().a(purchaseType), new lej.C0973a(this.f8381l.act(), purchaseType, aVarM15885p0, productId), this.f8394y);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m12088Q0(String str) {
        PutongFrag putongFrag = this.f8381l;
        cll0.m13519a(this.f8384o, !"MINE_SUB_ITEM".equals(putongFrag instanceof IntlVipNewUiFrag ? ((IntlVipNewUiFrag) putongFrag).getFrom() : null));
        if (NullChecker.a(this.f8383n) && NullChecker.a(this.f8383n.s())) {
            mc60.m19205b(this.f8381l.act(), this.f8384o, this.f8383n.C(), str, ogj.c().a(this.f8384o), new lej.C0973a(this.f8381l.act(), this.f8384o, this.f8383n, str), this.f8394y);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m12089R0(int i) {
        if (glp.m15879q0().size() > i) {
            PurchaseType purchaseType = glp.m15879q0().get(i);
            if (u59.m24988Z()) {
                m12090S0(purchaseType, null);
                return;
            }
            d.a aVarM15885p0 = this.f8382m.m15885p0(purchaseType);
            cll0.m13527i(purchaseType);
            cll0.m13524f(purchaseType);
            if (aVarM15885p0 != null) {
                m12090S0(purchaseType, aVarM15885p0);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m12090S0(PurchaseType purchaseType, d.a aVar) {
        if (!u59.m24988Z()) {
            this.f8382m.m15884G0(purchaseType, aVar);
        }
        if (glp.m15879q0().size() <= m12115m0() || glp.m15879q0().get(m12115m0()) != purchaseType) {
            return;
        }
        this.f8383n = aVar;
        this.f8384o = purchaseType;
        this.f8376g.removeCallbacks(this.f8390u);
        this.f8376g.post(this.f8390u);
    }

    /* JADX INFO: renamed from: T0 */
    public void m12091T0() {
        ndp ndpVar;
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f8374e;
        if (intlTopCardLayout == null || (ndpVar = intlTopCardLayout.adapter) == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        ndpVar.m20073s(intlBounceBackViewPager);
    }

    /* JADX INFO: renamed from: U0 */
    public void m12092U0() {
        PurchaseType purchaseTypeM13274b;
        PurchaseType purchaseTypeM12113l0 = this.f8370a;
        if (purchaseTypeM12113l0 == null) {
            purchaseTypeM12113l0 = m12113l0();
        }
        glp.m15866E0();
        glp.m15880r0();
        ArrayList<PurchaseType> arrayListM15879q0 = glp.m15879q0();
        int iIndexOf = (purchaseTypeM12113l0 == null || arrayListM15879q0 == null || !arrayListM15879q0.contains(purchaseTypeM12113l0)) ? -1 : arrayListM15879q0.indexOf(purchaseTypeM12113l0);
        if (iIndexOf < 0 && (purchaseTypeM13274b = c7r.m13274b()) != null && arrayListM15879q0 != null && arrayListM15879q0.contains(purchaseTypeM13274b)) {
            iIndexOf = arrayListM15879q0.indexOf(purchaseTypeM13274b);
        }
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        this.f8370a = null;
        this.f8389t = true;
        m12119q0(true);
        m12123v0(iIndexOf);
        IntlTopCardLayout intlTopCardLayout = this.f8374e;
        if (intlTopCardLayout != null) {
            intlTopCardLayout.post(new Runnable() { // from class: l.vlp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24378a.m12127z0();
                }
            });
        } else {
            this.f8389t = false;
        }
        m12057i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: V0 */
    public final void m12093V0() {
        this.f8372c.setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f8372c.getRightIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f8372c.getLeftIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        if (this.f8372c.getLeftIconContainer().getChildCount() > 0 && (this.f8372c.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
            this.f8372c.getLeftIconContainer().getChildAt(0).setColorFilter(Color.parseColor("#1F1F1F"));
        }
        if (this.f8372c.getTitleContainer().getChildCount() > 0 && (this.f8372c.getTitleContainer().getChildAt(0) instanceof TextView)) {
            ((TextView) this.f8372c.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#CC000000"));
        }
        this.f8372c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20622a.m12073A0(view);
            }
        });
        VIcon vIcon = new VIcon(this.f8381l.act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(x2c0.f26398Wk);
        vIcon.setColorFilter(Color.parseColor("#1F1F1F"));
        xdl0.E0(vIcon, new View.OnClickListener() { // from class: l.slp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21423a.m12074B0(view);
            }
        });
        this.f8372c.setRightIconViews(new View[]{vIcon});
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: W0 */
    public void m12094W0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8388s = str;
        if (this.f8374e.getCurrentItem() >= glp.m15879q0().size() || !m12122u0()) {
            return;
        }
        if ((sab0.w(this.f8384o) && CoreModule.f1534c.f3643j0.m2502B4()) || ((sab0.s(this.f8384o) && CoreModule.f1534c.f3643j0.m2500A4()) || (sab0.q(this.f8384o) && CoreModule.f1534c.f3643j0.m2571y4()))) {
            xdl0.M(this.f8380k, false);
            xdl0.M(this.f8379j, true);
            String strC = hvc0.c(CoreModule.f1534c.f3643j0.m2573z4() ? R$string.f2379bc : R$string.f1561A5);
            this.f8379j.setText(strC + "\n" + str);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m12095X0(PurchaseType purchaseType) {
        this.f8370a = purchaseType;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m12096Z0(User user, boolean z) {
        m12086O0();
        u9p u9pVar = u9p.INSTANCE;
        u9pVar.m25147A(user);
        u9pVar.m25164y(true);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m12097a1(String str) {
        m12099d1(str, Color.parseColor("#66000000"));
    }

    /* JADX INFO: renamed from: d0 */
    public View m12098d0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0523f.m12131c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m12099d1(String str, int i) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f8380k;
        if (zIsEmpty) {
            xdl0.M(vText, false);
            return;
        }
        xdl0.M(vText, true);
        this.f8380k.setTextColor(i);
        this.f8380k.setText(CoreModule.f1533b.getString(R$string.f2960uc, str));
    }

    public void destroy() {
        if (!vwb.J(this.f8387r)) {
            for (Object obj : this.f8387r) {
                if (obj instanceof IntlPrivilegeSVipContent) {
                    ((IntlPrivilegeSVipContent) obj).m9842w0();
                    break;
                }
            }
        }
        m12114l1();
    }

    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void m12108i1(glp glpVar) {
        this.f8382m = glpVar;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m12101e1(int i, String str) {
        View view = this.f8377h;
        if (view != null) {
            view.setBackgroundResource(i);
        }
        this.f8379j.setTextColor(Color.parseColor(str));
        this.f8379j.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: f0 */
    public void m12102f0(int i) {
        PutongFrag putongFrag = this.f8381l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        ArrayList<PurchaseType> arrayListM15879q0 = glp.m15879q0();
        if (i < 0 || i >= arrayListM15879q0.size()) {
            return;
        }
        PurchaseType purchaseType = arrayListM15879q0.get(i);
        PurchaseType purchaseType2 = this.f8391v;
        if (sab0.w(purchaseType)) {
            this.f8374e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f8374e._indicator.setFillColor(Color.parseColor("#EEC873"));
            this.f8371b.setBackgroundResource(x2c0.f27182vb);
            this.f8371b.setController((hce) null);
            m12104g0(PurchaseType.TYPE_GET_VIP);
            FrameLayout frameLayout = this.f8376g;
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(x2c0.f25764Ca);
            }
        } else if (sab0.s(purchaseType)) {
            this.f8374e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f8374e._indicator.setFillColor(Color.parseColor("#FF8817"));
            this.f8371b.setBackgroundResource(x2c0.f26577cb);
            this.f8371b.setController((hce) null);
            m12104g0(PurchaseType.TYPE_GET_LIKERS);
            FrameLayout frameLayout2 = this.f8376g;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundResource(x2c0.f25764Ca);
            }
        } else if (sab0.q(purchaseType)) {
            this.f8374e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f8374e._indicator.setFillColor(Color.parseColor("#DD9E2C"));
            m12104g0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            this.f8371b.setBackground(null);
            this.f8371b.setImageUrl("https://auto.tancdn.com/v1/raw/2a8de5d3-d063-4df3-ae1f-d37c96725580.webp");
            FrameLayout frameLayout3 = this.f8376g;
            if (frameLayout3 != null) {
                frameLayout3.setBackgroundResource(x2c0.f25764Ca);
            }
        } else if (sab0.v(purchaseType)) {
            this.f8374e._indicator.setPageColor(Color.parseColor("#33705E44"));
            this.f8374e._indicator.setFillColor(Color.parseColor("#9569AC"));
            m12104g0(PurchaseType.TYPE_ULTRA_PREMIUM);
            this.f8371b.setBackground(null);
            this.f8371b.setImageUrl("https://auto.tancdn.com/v1/raw/aa62ad72-c2bc-45e5-8f82-6add0b4ca249.webp");
            FrameLayout frameLayout4 = this.f8376g;
            if (frameLayout4 != null) {
                frameLayout4.setBackgroundResource(x2c0.f25732Ba);
            }
        }
        m12089R0(i);
        if (this.f8375f.getCurrentItem() != i) {
            this.f8375f.T(i, false);
        }
        ArrayList<ViewGroup> arrayList = this.f8387r;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        ViewParent viewParent = (ViewGroup) this.f8387r.get(i);
        if (viewParent instanceof hxo) {
            ((hxo) viewParent).mo9826f(purchaseType2, purchaseType);
            this.f8391v = purchaseType;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m12103f1(int i, String str, String str2) {
        View view = this.f8377h;
        if (view != null) {
            view.setBackgroundResource(i);
        }
        this.f8379j.setTextColor(Color.parseColor(str));
        this.f8379j.setTypeface(Typeface.defaultFromStyle(1));
        this.f8379j.setText(str2);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m12104g0(PurchaseType purchaseType) {
        PutongFrag putongFrag = this.f8381l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C0522e.f8399a[purchaseType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            this.f8381l.act().setStatusBarColor(this.f8381l.act().getResources().getColor(w0c0.f24651U1));
            this.f8381l.act().getWindow().getDecorView().setSystemUiVisibility(1280);
            this.f8381l.act().getWindow().addFlags(Integer.MIN_VALUE);
            PutongAct.setLightStatusBar(this.f8381l.act().getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m12105g1() {
        PurchaseType purchaseType = this.f8384o;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m12107h1(false, purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final ViewGroup m12106h0(PurchaseType purchaseType) {
        int i = C0522e.f8399a[purchaseType.ordinal()];
        if (i == 1) {
            return new IntlPrivilegeVipContent(m12075C0());
        }
        if (i == 2) {
            return new IntlPrivilegeSeeContent(m12075C0());
        }
        if (i == 3) {
            return new IntlPrivilegeSVipContent(m12075C0());
        }
        if (i != 4) {
            return null;
        }
        return new IntlPrivilegeUltraPremiumContent(m12075C0());
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m12107h1(boolean z, final boolean z2) {
        if (NullChecker.a(this.f8383n)) {
            u9p.INSTANCE.m25165z(this.f8383n);
        }
        PutongFrag putongFrag = this.f8381l;
        String from = putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : "";
        return z2 ? u9p.INSTANCE.m25150D(act(), new e30() { // from class: l.xlp
            public final void call(Object obj) {
                this.f27589a.m12077E0(z2, (User) obj);
            }
        }, new e30() { // from class: l.ylp
            public final void call(Object obj) {
                this.f28293a.m12078G0(z2, (User) obj);
            }
        }, new e30() { // from class: l.zlp
            public final void call(Object obj) {
                this.f28816a.m12079H0(z2, (User) obj);
            }
        }, z, from, null, act()) : u9p.INSTANCE.m25149C(act(), new Runnable() { // from class: l.ilp
            @Override // java.lang.Runnable
            public final void run() {
                this.f14552a.m12080I0(z2);
            }
        }, new e30() { // from class: l.jlp
            public final void call(Object obj) {
                this.f15257a.m12081J0(z2, (User) obj);
            }
        }, new e30() { // from class: l.klp
            public final void call(Object obj) {
                this.f15893a.m12082K0(z2, (User) obj);
            }
        }, new e30() { // from class: l.llp
            public final void call(Object obj) {
                this.f16512a.m12083L0(z2, (User) obj);
            }
        }, z, from, null, act());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12098d0 = m12098d0(layoutInflater, viewGroup);
        this.f8386q = viewM12098d0;
        return viewM12098d0;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m12109j0(PurchaseType purchaseType) {
        int i = C0522e.f8399a[purchaseType.ordinal()];
        if (i == 1) {
            return x2c0.f27150ub;
        }
        if (i == 2) {
            return x2c0.f26545bb;
        }
        if (i != 3) {
            return i != 4 ? x2c0.f27150ub : x2c0.f26798jb;
        }
        return x2c0.f26016Ka;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m12110j1() {
        Animator animatorN = bt0.n(this.f8376g, bt0.i, new float[]{1.0f, 1.0f});
        Animator animatorN2 = bt0.n(this.f8376g, bt0.i, new float[]{1.0f, 0.96f});
        Animator animatorN3 = bt0.n(this.f8376g, bt0.i, new float[]{0.96f, 1.03f});
        Animator animatorN4 = bt0.n(this.f8376g, bt0.i, new float[]{1.03f, 1.0f});
        animatorN.setDuration(500L);
        animatorN2.setDuration(333L);
        animatorN3.setDuration(333L);
        animatorN4.setDuration(333L);
        animatorN.setInterpolator(this.f8392w);
        animatorN2.setInterpolator(this.f8392w);
        animatorN3.setInterpolator(this.f8392w);
        animatorN4.setInterpolator(this.f8392w);
        bt0.f(bt0.u(false, (Interpolator) null, -1L, new Animator[]{animatorN, animatorN2, animatorN3, animatorN4}), new Runnable() { // from class: l.mlp
            @Override // java.lang.Runnable
            public final void run() {
                this.f17032a.m12084M0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: k0 */
    public final String m12111k0(PurchaseType purchaseType) {
        int i = C0522e.f8399a[purchaseType.ordinal()];
        if (i != 2) {
            return i != 4 ? "#CC000000" : "#F9E7FF";
        }
        return "#FFFFFF";
    }

    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final void m12084M0() {
        mkd0.z(this.f8393x);
        this.f8393x = this.f8381l.duringCreated(rx.c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.nlp
            public final void call(Object obj) {
                this.f17744a.m12085N0((Long) obj);
            }
        }, new e30() { // from class: l.olp
            public final void call(Object obj) {
                amp.m12053d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public PurchaseType m12113l0() {
        int iM12115m0 = m12115m0();
        ArrayList<PurchaseType> arrayListM15879q0 = glp.m15879q0();
        if (iM12115m0 >= 0 && iM12115m0 < arrayListM15879q0.size()) {
            return arrayListM15879q0.get(iM12115m0);
        }
        PurchaseType purchaseType = this.f8384o;
        if (purchaseType != null) {
            return purchaseType;
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m12114l1() {
        mkd0.z(this.f8393x);
    }

    /* JADX INFO: renamed from: m0 */
    public int m12115m0() {
        IntlTopCardLayout intlTopCardLayout = this.f8374e;
        if (intlTopCardLayout != null) {
            return intlTopCardLayout.getCurrentItem();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m12116n0(PurchaseType purchaseType) {
        int i = C0522e.f8399a[purchaseType.ordinal()];
        if (i == 1) {
            return act().getString(R$string.f2355aj);
        }
        if (i == 2) {
            return act().getString(R$string.f2690lg);
        }
        if (i != 3) {
            return i != 4 ? "" : act().getString(R$string.f2814pg);
        }
        return act().getString(R$string.f1567Ab);
    }

    /* JADX INFO: renamed from: o0 */
    public void m12117o0() {
        this.f8380k.postDelayed(new Runnable() { // from class: l.wlp
            @Override // java.lang.Runnable
            public final void run() {
                this.f25227a.m12125x0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: p0 */
    public void m12118p0() {
        m12119q0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m12119q0(boolean z) {
        ViewGroup next;
        ArrayList<PurchaseType> arrayListM15879q0 = glp.m15879q0();
        if (vwb.J(arrayListM15879q0)) {
            return;
        }
        this.f8374e.m9975d(arrayListM15879q0);
        if (z && !vwb.J(this.f8387r)) {
            ArrayList<ViewGroup> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (PurchaseType purchaseType : arrayListM15879q0) {
                Iterator<ViewGroup> it = this.f8387r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!arrayList2.contains(next) && (next instanceof hxo) && purchaseType.equals(((hxo) next).getPurchaseType())) {
                        arrayList2.add(next);
                        break;
                    }
                }
                if (next != null) {
                    arrayList.add(next);
                } else {
                    ViewGroup viewGroupM12106h0 = m12106h0(purchaseType);
                    if (NullChecker.a(viewGroupM12106h0)) {
                        arrayList.add(viewGroupM12106h0);
                    }
                }
            }
            if (arrayList.size() == arrayListM15879q0.size()) {
                this.f8387r = arrayList;
                if (NullChecker.a(this.f8385p)) {
                    this.f8385p.m13775r(this.f8387r);
                    this.f8375f.setCurrentItem(0);
                }
                if (arrayListM15879q0.isEmpty()) {
                    return;
                }
                this.f8391v = arrayListM15879q0.get(0);
                return;
            }
        }
        this.f8387r = new ArrayList<>();
        Iterator<PurchaseType> it2 = arrayListM15879q0.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroupM12106h1 = m12106h0(it2.next());
            if (NullChecker.a(viewGroupM12106h1)) {
                this.f8387r.add(viewGroupM12106h1);
            }
        }
        if (!vwb.J(this.f8387r) && NullChecker.a(this.f8385p)) {
            this.f8385p.m13775r(this.f8387r);
            this.f8375f.setCurrentItem(0);
            if (!arrayListM15879q0.isEmpty()) {
                this.f8391v = arrayListM15879q0.get(0);
            }
        }
        mep0.d1(this.f8378i, t100.i);
        this.f8378i.setAlpha(153);
        SVGALoader.with(this.f8381l.act()).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f8378i);
    }

    /* JADX INFO: renamed from: r0 */
    public void m12120r0(Bundle bundle) {
        m12093V0();
        m12045Y0();
        m12066s0();
        glp.m15880r0();
        m12118p0();
        m12121t0();
        this.f8382m.m15886s0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m12121t0() {
        this.f8382m.creates(new e30() { // from class: l.tlp
            public final void call(Object obj) {
                this.f22180a.m12126y0((Bundle) obj);
            }
        }, new d30() { // from class: l.ulp
            public final void call() {
                amp.m12058j();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m12122u0() {
        if (NullChecker.a(this.f8383n) && NullChecker.a(this.f8383n.s())) {
            if (this.f8383n.s().quantity == (CoreModule.f1534c.f3643j0.m2573z4() ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public void m12123v0(int i) {
        IntlTopCardLayout intlTopCardLayout = this.f8374e;
        if (intlTopCardLayout == null || intlTopCardLayout.getCurrentItem() == i) {
            return;
        }
        this.f8374e.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m12124w0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        m12091T0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m12125x0() {
        if (m12122u0()) {
            this.f8376g.removeCallbacks(this.f8390u);
            this.f8376g.post(this.f8390u);
        }
        if (vwb.J(this.f8387r)) {
            return;
        }
        for (ViewParent viewParent : this.f8387r) {
            if (viewParent instanceof hxo) {
                ((hxo) viewParent).mo9825b(2);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m12126y0(Bundle bundle) {
        Bundle arguments = this.f8381l.getArguments();
        if (!NullChecker.a(arguments) || this.f8374e == null) {
            return;
        }
        String string = arguments.getString("vip_selected_purchase_type");
        PurchaseType purchaseTypeValueOf = !TextUtils.isEmpty(string) ? PurchaseType.valueOf(string) : null;
        int i = arguments.getInt("vip_selected_page", -1);
        if (i >= 0) {
            this.f8374e.setCurrentItem(i);
            m12102f0(this.f8374e._viewpager.getCurrentItem());
        } else {
            this.f8374e.setCurrentItem(c690.m13201a(purchaseTypeValueOf, !u59.m24988Z(), new jyo()));
            m12102f0(this.f8374e._viewpager.getCurrentItem());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m12127z0() {
        IntlTopCardLayout intlTopCardLayout = this.f8374e;
        if (intlTopCardLayout != null) {
            m12102f0(intlTopCardLayout.getCurrentItem());
            this.f8389t = false;
        }
    }

    /* JADX INFO: renamed from: l.amp$b */
    public class ViewOnAttachStateChangeListenerC0519b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0519b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            amp.this.f8376g.removeCallbacks(amp.this.f8390u);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: l.amp$c */
    public class C0520c implements ViewPager.j {
        public C0520c() {
        }

        public void onPageSelected(int i) {
            if (amp.this.f8389t) {
                return;
            }
            amp.this.m12102f0(i);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
