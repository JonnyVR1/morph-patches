package p149l;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeSVipContent;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeSeeContent;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeUltraPremiumContent;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.IntlPrivilegeVipContent;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.IntlBounceBackViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.IntlTopCardLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.view.bottom.IntlAlphaTransformerViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.HelperManagerAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.AutoVDraweeView;
import p147v.VIcon;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class amp implements s7m<glp> {

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f70638b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f70639c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f70640d;

    /* JADX INFO: renamed from: e */
    public IntlTopCardLayout f70641e;

    /* JADX INFO: renamed from: f */
    public IntlAlphaTransformerViewPager f70642f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f70643g;

    /* JADX INFO: renamed from: h */
    public View f70644h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f70645i;

    /* JADX INFO: renamed from: j */
    public VText f70646j;

    /* JADX INFO: renamed from: k */
    public VText f70647k;

    /* JADX INFO: renamed from: l */
    public PutongFrag f70648l;

    /* JADX INFO: renamed from: m */
    public glp f70649m;

    /* JADX INFO: renamed from: n */
    public C8765d.a f70650n;

    /* JADX INFO: renamed from: o */
    public PurchaseType f70651o;

    /* JADX INFO: renamed from: p */
    public d3n f70652p;

    /* JADX INFO: renamed from: q */
    public View f70653q;

    /* JADX INFO: renamed from: v */
    public PurchaseType f70658v;

    /* JADX INFO: renamed from: x */
    public c4g0 f70660x;

    /* JADX INFO: renamed from: a */
    public PurchaseType f70637a = null;

    /* JADX INFO: renamed from: r */
    public ArrayList<ViewGroup> f70654r = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    public String f70655s = "";

    /* JADX INFO: renamed from: t */
    public boolean f70656t = false;

    /* JADX INFO: renamed from: u */
    public final Runnable f70657u = new RunnableC15667a();

    /* JADX INFO: renamed from: w */
    public Interpolator f70659w = new LinearInterpolator();

    /* JADX INFO: renamed from: y */
    public e30<Integer> f70661y = new C15670d();

    /* JADX INFO: renamed from: l.amp$a */
    public class RunnableC15667a implements Runnable {
        public RunnableC15667a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM191817Z = u59.m191817Z();
            amp ampVar = amp.this;
            if (zM191817Z) {
                xdl0.m208344M(ampVar.f70646j, true);
                xdl0.m208344M(amp.this.f70647k, false);
                xdl0.m208344M(amp.this.f70645i, false);
                amp ampVar2 = amp.this;
                int iM97656j0 = ampVar2.m97656j0(ampVar2.f70651o);
                amp ampVar3 = amp.this;
                String strM97658k0 = ampVar3.m97658k0(ampVar3.f70651o);
                amp ampVar4 = amp.this;
                ampVar2.m97651f1(iM97656j0, strM97658k0, ampVar4.m97663n0(ampVar4.f70651o));
                return;
            }
            String strM53643q = C8766e.m53643q(ampVar.f70650n);
            String strM53649w = C8766e.m53649w(amp.this.f70650n);
            amp ampVar5 = amp.this;
            int iM97656j1 = ampVar5.m97656j0(ampVar5.f70651o);
            amp ampVar6 = amp.this;
            String strM97658k1 = ampVar6.m97658k0(ampVar6.f70651o);
            boolean zM97669u0 = amp.this.m97669u0();
            amp.this.m97661l1();
            xdl0.m208344M(amp.this.f70645i, false);
            xdl0.m208344M(amp.this.f70647k, false);
            xdl0.m208344M(amp.this.f70646j, true);
            int i = C15671e.f70666a[amp.this.f70651o.ordinal()];
            if (i == 1) {
                amp.this.m97649e1(iM97656j1, strM97658k1);
                if (!CoreModule.f17545c.f19639e0.m169527p9().isVIP() && CoreModule.f17545c.f19654j0.m30574B4() && zM97669u0) {
                    amp ampVar7 = amp.this;
                    ampVar7.m97642W0(ampVar7.f70655s);
                    return;
                }
                amp.this.m97645a1(strM53649w);
                boolean zIsVIP = CoreModule.f17545c.f19639e0.m169527p9().isVIP();
                boolean zIsVIPExpired = CoreModule.f17545c.f19639e0.m169527p9().isVIPExpired();
                if (zIsVIP || zIsVIPExpired) {
                    amp.this.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f17544b.getText(R$string.f17865Js)));
                    return;
                }
                amp.this.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f17544b.getText(R$string.f17805Hs)));
                return;
            }
            if (i == 2) {
                amp.this.m97649e1(iM97656j1, strM97658k1);
                if (CoreModule.f17545c.f19654j0.m30572A4() && zM97669u0) {
                    amp ampVar8 = amp.this;
                    ampVar8.m97642W0(ampVar8.f70655s);
                    return;
                }
                amp.this.m97645a1(strM53649w);
                long jM157733g = n3b0.m157733g();
                amp ampVar9 = amp.this;
                if (jM157733g != 0) {
                    ampVar9.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f17655Cs));
                    return;
                }
                ampVar9.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f17544b.getString(R$string.f19047ws));
                return;
            }
            if (i == 3) {
                amp.this.m97649e1(iM97656j1, strM97658k1);
                if (CoreModule.f17545c.f19654j0.m30643y4() && amp.this.m97669u0()) {
                    amp ampVar10 = amp.this;
                    ampVar10.m97642W0(ampVar10.f70655s);
                    return;
                }
                amp.this.m97645a1(strM53649w);
                if (amp.this.f70650n != null && (TEnum.equals(amp.this.f70650n.m53579f(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(amp.this.f70650n.m53579f(), ProductCategory.tttSeeUpgradeToPremium))) {
                    amp.this.f70646j.setText(String.format(amp.this.getAct().getString(R$string.f17763Gg), amp.this.f70650n.m53581g()));
                    xdl0.m208344M(amp.this.f70645i, true);
                    amp.this.m97657j1();
                    return;
                } else {
                    amp.this.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f17544b.getText(R$string.f17938Mb)));
                    return;
                }
            }
            if (i != 4) {
                return;
            }
            amp.this.m97649e1(iM97656j1, strM97658k1);
            amp.this.m97647d1(strM53649w, Color.parseColor("#80F9E7FF"));
            if (amp.this.f70650n != null && (TEnum.equals(amp.this.f70650n.m53579f(), ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(amp.this.f70650n.m53579f(), ProductCategory.Promo_premiumUpgradeToUltra))) {
                amp.this.f70646j.setText(String.format(amp.this.getAct().getString(R$string.f17763Gg), amp.this.f70650n.m53581g()));
                xdl0.m208344M(amp.this.f70645i, true);
                amp.this.m97657j1();
                return;
            }
            boolean zM210083k4 = xma.m210083k4();
            amp ampVar11 = amp.this;
            if (zM210083k4) {
                ampVar11.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f17544b.getText(R$string.f18855qg)));
                return;
            }
            ampVar11.f70646j.setText(strM53643q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f17544b.getText(R$string.f18825pg)));
        }
    }

    /* JADX INFO: renamed from: l.amp$d */
    public class C15670d implements e30<Integer> {
        public C15670d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            if (num.intValue() == 5) {
                amp ampVar = amp.this;
                ampVar.m97655h1(true, ampVar.f70651o == PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        }
    }

    /* JADX INFO: renamed from: l.amp$e */
    public static /* synthetic */ class C15671e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70666a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f70666a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70666a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70666a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70666a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.amp$f */
    public static class C15672f {
        /* JADX INFO: renamed from: b */
        public static void m97677b(amp ampVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            ampVar.f70638b = (AutoVDraweeView) viewGroup.getChildAt(0);
            ampVar.f70639c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            ampVar.f70640d = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            ampVar.f70641e = (IntlTopCardLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
            ampVar.f70642f = (IntlAlphaTransformerViewPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
            ampVar.f70643g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
            ampVar.f70644h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            ampVar.f70645i = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            ampVar.f70646j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2)).getChildAt(0);
            ampVar.f70647k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m97678c(amp ampVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95840j5, viewGroup, false);
            m97677b(ampVar, viewInflate);
            return viewInflate;
        }
    }

    public amp(PutongFrag putongFrag) {
        this.f70648l = putongFrag;
    }

    /* JADX INFO: renamed from: Y0 */
    private void m97594Y0() {
        this.f70643g.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC15668b());
        this.f70641e.m56535e(this.f70648l, new C15669c());
        xdl0.m208329E0(this.f70643g, new View.OnClickListener() { // from class: l.hlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108362a.m97624D0(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m97602d(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    private void m97606i0() {
        getAct().duringCreated(ugc0.m193536c()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.plp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150158a.m97671w0((RecentContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.qlp
            @Override // p149l.e30
            public final void call(Object obj) {
                amp.m97613q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m97607j() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m97613q(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    private void m97615s0() {
        this.f70652p = new d3n((IntlVipNewUiFrag) this.f70648l);
        this.f70642f.mo4180X(true, new a3n());
        this.f70642f.setOffscreenPageLimit(3);
        this.f70642f.setAdapter(this.f70652p);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m97622A0(View view) {
        if (m97653g1()) {
            return;
        }
        getAct().m66873d2();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m97623B0(View view) {
        nb90.m158766d();
        if (this.f70648l.act() != null) {
            this.f70648l.act().startActivity(new Intent(this.f70648l.act(), (Class<?>) HelperManagerAct.class));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f70648l.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m97624D0(View view) {
        m97634O0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m97625E0(boolean z, User user) {
        m97644Z0(user, z);
        u9p.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m97626G0(boolean z, User user) {
        m97644Z0(user, z);
        u9p.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m97627H0(boolean z, User user) {
        m97644Z0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m97628I0(boolean z) {
        m97644Z0(null, z);
        u9p.payFromSalvageAction = "";
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m97629J0(boolean z, User user) {
        m97644Z0(user, z);
        u9p.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m97630K0(boolean z, User user) {
        m97644Z0(user, z);
        u9p.payFromSalvageAction = "liked";
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m97631L0(boolean z, User user) {
        m97644Z0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m97633N0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f70645i;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m97634O0() {
        if (!u59.m191817Z()) {
            if (((CoreModule.f17545c.f19654j0.m30572A4() && this.f70651o == PurchaseType.TYPE_GET_LIKERS) || ((CoreModule.f17545c.f19654j0.m30574B4() && this.f70651o == PurchaseType.TYPE_GET_VIP) || (CoreModule.f17545c.f19654j0.m30643y4() && this.f70651o == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE))) && m97669u0()) {
                m97636Q0(CoreModule.f17545c.f19654j0.m30576C4().skuId);
                return;
            } else {
                if (NullChecker.m81303a(this.f70650n) && NullChecker.m81303a(this.f70650n.m53601s())) {
                    m97636Q0(this.f70650n.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId());
                    return;
                }
                return;
            }
        }
        PutongFrag putongFrag = this.f70648l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C15671e.f70666a[this.f70651o.ordinal()];
        if (i == 1) {
            C8764c.m53406K1(this.f70648l.act(), "p_privileges_view,e_buy_privilege_button,click", null, null, null);
            return;
        }
        if (i == 2) {
            C8764c.m53376A1(this.f70648l.act(), "p_privileges_view,e_buy_privilege_button,click");
        } else if (i == 3) {
            C8764c.m53504x0(this.f70648l.act(), "p_privileges_view,e_buy_privilege_button,click", null);
        } else {
            if (i != 4) {
                return;
            }
            C8764c.m53405K0(this.f70648l.act(), "p_privileges_view,e_buy_privilege_button,click", null, null, null);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m97635P0() {
        PurchaseType purchaseType;
        C8765d.a aVarM126908p0;
        PutongFrag putongFrag = this.f70648l;
        if (putongFrag == null || putongFrag.act() == null || this.f70649m == null) {
            return;
        }
        int iM97662m0 = m97662m0();
        ArrayList<PurchaseType> arrayListM126902q0 = glp.m126902q0();
        if (iM97662m0 < 0 || iM97662m0 >= arrayListM126902q0.size() || (aVarM126908p0 = this.f70649m.m126908p0((purchaseType = arrayListM126902q0.get(iM97662m0)))) == null || !NullChecker.m81303a(aVarM126908p0.m53601s())) {
            return;
        }
        String productId = aVarM126908p0.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId();
        if (TextUtils.isEmpty(productId)) {
            return;
        }
        PutongFrag putongFrag2 = this.f70648l;
        if (putongFrag2 instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) putongFrag2).getFrom();
        }
        mc60.m153988b(this.f70648l.act(), purchaseType, aVarM126908p0.m53547C(), productId, ogj.m164200c().m164201a(purchaseType), new lej.C18204a(this.f70648l.act(), purchaseType, aVarM126908p0, productId), this.f70661y);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m97636Q0(String str) {
        PutongFrag putongFrag = this.f70648l;
        cll0.m107554a(this.f70651o, !"MINE_SUB_ITEM".equals(putongFrag instanceof IntlVipNewUiFrag ? ((IntlVipNewUiFrag) putongFrag).getFrom() : null));
        if (NullChecker.m81303a(this.f70650n) && NullChecker.m81303a(this.f70650n.m53601s())) {
            mc60.m153988b(this.f70648l.act(), this.f70651o, this.f70650n.m53547C(), str, ogj.m164200c().m164201a(this.f70651o), new lej.C18204a(this.f70648l.act(), this.f70651o, this.f70650n, str), this.f70661y);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m97637R0(int i) {
        if (glp.m126902q0().size() > i) {
            PurchaseType purchaseType = glp.m126902q0().get(i);
            if (u59.m191817Z()) {
                m97638S0(purchaseType, null);
                return;
            }
            C8765d.a aVarM126908p0 = this.f70649m.m126908p0(purchaseType);
            cll0.m107562i(purchaseType);
            cll0.m107559f(purchaseType);
            if (aVarM126908p0 != null) {
                m97638S0(purchaseType, aVarM126908p0);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m97638S0(PurchaseType purchaseType, C8765d.a aVar) {
        if (!u59.m191817Z()) {
            this.f70649m.m126907G0(purchaseType, aVar);
        }
        if (glp.m126902q0().size() <= m97662m0() || glp.m126902q0().get(m97662m0()) != purchaseType) {
            return;
        }
        this.f70650n = aVar;
        this.f70651o = purchaseType;
        this.f70643g.removeCallbacks(this.f70657u);
        this.f70643g.post(this.f70657u);
    }

    /* JADX INFO: renamed from: T0 */
    public void m97639T0() {
        ndp ndpVar;
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f70641e;
        if (intlTopCardLayout == null || (ndpVar = intlTopCardLayout.adapter) == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        ndpVar.m158997s(intlBounceBackViewPager);
    }

    /* JADX INFO: renamed from: U0 */
    public void m97640U0() {
        PurchaseType purchaseTypeM105626b;
        PurchaseType purchaseTypeM97660l0 = this.f70637a;
        if (purchaseTypeM97660l0 == null) {
            purchaseTypeM97660l0 = m97660l0();
        }
        glp.m126889E0();
        glp.m126903r0();
        ArrayList<PurchaseType> arrayListM126902q0 = glp.m126902q0();
        int iIndexOf = (purchaseTypeM97660l0 == null || arrayListM126902q0 == null || !arrayListM126902q0.contains(purchaseTypeM97660l0)) ? -1 : arrayListM126902q0.indexOf(purchaseTypeM97660l0);
        if (iIndexOf < 0 && (purchaseTypeM105626b = c7r.m105626b()) != null && arrayListM126902q0 != null && arrayListM126902q0.contains(purchaseTypeM105626b)) {
            iIndexOf = arrayListM126902q0.indexOf(purchaseTypeM105626b);
        }
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        this.f70637a = null;
        this.f70656t = true;
        m97666q0(true);
        m97670v0(iIndexOf);
        IntlTopCardLayout intlTopCardLayout = this.f70641e;
        if (intlTopCardLayout != null) {
            intlTopCardLayout.post(new Runnable() { // from class: l.vlp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181972a.m97674z0();
                }
            });
        } else {
            this.f70656t = false;
        }
        m97606i0();
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: V0 */
    public final void m97641V0() {
        this.f70639c.setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f70639c.getRightIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f70639c.getLeftIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        if (this.f70639c.getLeftIconContainer().getChildCount() > 0 && (this.f70639c.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
            ((VIcon) this.f70639c.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#1F1F1F"));
        }
        if (this.f70639c.getTitleContainer().getChildCount() > 0 && (this.f70639c.getTitleContainer().getChildAt(0) instanceof TextView)) {
            ((TextView) this.f70639c.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#CC000000"));
        }
        this.f70639c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rlp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159986a.m97622A0(view);
            }
        });
        VIcon vIcon = new VIcon(this.f70648l.act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(x2c0.f189862Wk);
        vIcon.setColorFilter(Color.parseColor("#1F1F1F"));
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.slp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165255a.m97623B0(view);
            }
        });
        this.f70639c.setRightIconViews(vIcon);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: W0 */
    public void m97642W0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f70655s = str;
        if (this.f70641e.getCurrentItem() >= glp.m126902q0().size() || !m97669u0()) {
            return;
        }
        if ((sab0.m182905w(this.f70651o) && CoreModule.f17545c.f19654j0.m30574B4()) || ((sab0.m182901s(this.f70651o) && CoreModule.f17545c.f19654j0.m30572A4()) || (sab0.m182899q(this.f70651o) && CoreModule.f17545c.f19654j0.m30643y4()))) {
            xdl0.m208344M(this.f70647k, false);
            xdl0.m208344M(this.f70646j, true);
            String strM133156c = hvc0.m133156c(CoreModule.f17545c.f19654j0.m30645z4() ? R$string.f18390bc : R$string.f17572A5);
            this.f70646j.setText(strM133156c + SignParameters.NEW_LINE + str);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m97643X0(PurchaseType purchaseType) {
        this.f70637a = purchaseType;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m97644Z0(User user, boolean z) {
        m97634O0();
        u9p u9pVar = u9p.INSTANCE;
        u9pVar.m192605A(user);
        u9pVar.m192622y(true);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m97645a1(String str) {
        m97647d1(str, Color.parseColor("#66000000"));
    }

    /* JADX INFO: renamed from: d0 */
    public View m97646d0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15672f.m97678c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m97647d1(String str, int i) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f70647k;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            return;
        }
        xdl0.m208344M(vText, true);
        this.f70647k.setTextColor(i);
        this.f70647k.setText(CoreModule.f17544b.getString(R$string.f18971uc, str));
    }

    @Override // p149l.s7m
    public void destroy() {
        if (!vwb.m200296J(this.f70654r)) {
            for (ViewGroup viewGroup : this.f70654r) {
                if (viewGroup instanceof IntlPrivilegeSVipContent) {
                    ((IntlPrivilegeSVipContent) viewGroup).m56404w0();
                    break;
                }
            }
        }
        m97661l1();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(glp glpVar) {
        this.f70649m = glpVar;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m97649e1(int i, String str) {
        View view = this.f70644h;
        if (view != null) {
            view.setBackgroundResource(i);
        }
        this.f70646j.setTextColor(Color.parseColor(str));
        this.f70646j.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: f0 */
    public void m97650f0(int i) {
        PutongFrag putongFrag = this.f70648l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        ArrayList<PurchaseType> arrayListM126902q0 = glp.m126902q0();
        if (i < 0 || i >= arrayListM126902q0.size()) {
            return;
        }
        PurchaseType purchaseType = arrayListM126902q0.get(i);
        PurchaseType purchaseType2 = this.f70658v;
        if (sab0.m182905w(purchaseType)) {
            this.f70641e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f70641e._indicator.setFillColor(Color.parseColor("#EEC873"));
            this.f70638b.setBackgroundResource(x2c0.f190646vb);
            this.f70638b.setController(null);
            m97652g0(PurchaseType.TYPE_GET_VIP);
            FrameLayout frameLayout = this.f70643g;
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(x2c0.f189228Ca);
            }
        } else if (sab0.m182901s(purchaseType)) {
            this.f70641e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f70641e._indicator.setFillColor(Color.parseColor("#FF8817"));
            this.f70638b.setBackgroundResource(x2c0.f190041cb);
            this.f70638b.setController(null);
            m97652g0(PurchaseType.TYPE_GET_LIKERS);
            FrameLayout frameLayout2 = this.f70643g;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundResource(x2c0.f189228Ca);
            }
        } else if (sab0.m182899q(purchaseType)) {
            this.f70641e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f70641e._indicator.setFillColor(Color.parseColor("#DD9E2C"));
            m97652g0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            this.f70638b.setBackground(null);
            this.f70638b.setImageUrl("https://auto.tancdn.com/v1/raw/2a8de5d3-d063-4df3-ae1f-d37c96725580.webp");
            FrameLayout frameLayout3 = this.f70643g;
            if (frameLayout3 != null) {
                frameLayout3.setBackgroundResource(x2c0.f189228Ca);
            }
        } else if (sab0.m182904v(purchaseType)) {
            this.f70641e._indicator.setPageColor(Color.parseColor("#33705E44"));
            this.f70641e._indicator.setFillColor(Color.parseColor("#9569AC"));
            m97652g0(PurchaseType.TYPE_ULTRA_PREMIUM);
            this.f70638b.setBackground(null);
            this.f70638b.setImageUrl("https://auto.tancdn.com/v1/raw/aa62ad72-c2bc-45e5-8f82-6add0b4ca249.webp");
            FrameLayout frameLayout4 = this.f70643g;
            if (frameLayout4 != null) {
                frameLayout4.setBackgroundResource(x2c0.f189196Ba);
            }
        }
        m97637R0(i);
        if (this.f70642f.getCurrentItem() != i) {
            this.f70642f.m4176T(i, false);
        }
        ArrayList<ViewGroup> arrayList = this.f70654r;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        ViewParent viewParent = (ViewGroup) this.f70654r.get(i);
        if (viewParent instanceof hxo) {
            ((hxo) viewParent).mo56388f(purchaseType2, purchaseType);
            this.f70658v = purchaseType;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m97651f1(int i, String str, String str2) {
        View view = this.f70644h;
        if (view != null) {
            view.setBackgroundResource(i);
        }
        this.f70646j.setTextColor(Color.parseColor(str));
        this.f70646j.setTypeface(Typeface.defaultFromStyle(1));
        this.f70646j.setText(str2);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m97652g0(PurchaseType purchaseType) {
        PutongFrag putongFrag = this.f70648l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C15671e.f70666a[purchaseType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            this.f70648l.act().setStatusBarColor(this.f70648l.act().getResources().getColor(w0c0.f183811U1));
            this.f70648l.act().getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            this.f70648l.act().getWindow().addFlags(Integer.MIN_VALUE);
            PutongAct.setLightStatusBar(this.f70648l.act().getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m97653g1() {
        PurchaseType purchaseType = this.f70651o;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m97655h1(false, purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final ViewGroup m97654h0(PurchaseType purchaseType) {
        int i = C15671e.f70666a[purchaseType.ordinal()];
        if (i == 1) {
            return new IntlPrivilegeVipContent(getContext());
        }
        if (i == 2) {
            return new IntlPrivilegeSeeContent(getContext());
        }
        if (i == 3) {
            return new IntlPrivilegeSVipContent(getContext());
        }
        if (i != 4) {
            return null;
        }
        return new IntlPrivilegeUltraPremiumContent(getContext());
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m97655h1(boolean z, final boolean z2) {
        if (NullChecker.m81303a(this.f70650n)) {
            u9p.INSTANCE.m192623z(this.f70650n);
        }
        PutongFrag putongFrag = this.f70648l;
        String from = putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : "";
        return z2 ? u9p.INSTANCE.m192608D(getAct(), new e30() { // from class: l.xlp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193476a.m97625E0(z2, (User) obj);
            }
        }, new e30() { // from class: l.ylp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198906a.m97626G0(z2, (User) obj);
            }
        }, new e30() { // from class: l.zlp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203650a.m97627H0(z2, (User) obj);
            }
        }, z, from, null, getAct()) : u9p.INSTANCE.m192607C(getAct(), new Runnable() { // from class: l.ilp
            @Override // java.lang.Runnable
            public final void run() {
                this.f113852a.m97628I0(z2);
            }
        }, new e30() { // from class: l.jlp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118552a.m97629J0(z2, (User) obj);
            }
        }, new e30() { // from class: l.klp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123678a.m97630K0(z2, (User) obj);
            }
        }, new e30() { // from class: l.llp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128739a.m97631L0(z2, (User) obj);
            }
        }, z, from, null, getAct());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM97646d0 = m97646d0(layoutInflater, viewGroup);
        this.f70653q = viewM97646d0;
        return viewM97646d0;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m97656j0(PurchaseType purchaseType) {
        int i = C15671e.f70666a[purchaseType.ordinal()];
        if (i == 1) {
            return x2c0.f190614ub;
        }
        if (i == 2) {
            return x2c0.f190009bb;
        }
        if (i != 3) {
            return i != 4 ? x2c0.f190614ub : x2c0.f190262jb;
        }
        return x2c0.f189480Ka;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m97657j1() {
        Animator animatorM103741n = bt0.m103741n(this.f70643g, bt0.f77162i, 1.0f, 1.0f);
        Animator animatorM103741n2 = bt0.m103741n(this.f70643g, bt0.f77162i, 1.0f, 0.96f);
        Animator animatorM103741n3 = bt0.m103741n(this.f70643g, bt0.f77162i, 0.96f, 1.03f);
        Animator animatorM103741n4 = bt0.m103741n(this.f70643g, bt0.f77162i, 1.03f, 1.0f);
        animatorM103741n.setDuration(500L);
        animatorM103741n2.setDuration(333L);
        animatorM103741n3.setDuration(333L);
        animatorM103741n4.setDuration(333L);
        animatorM103741n.setInterpolator(this.f70659w);
        animatorM103741n2.setInterpolator(this.f70659w);
        animatorM103741n3.setInterpolator(this.f70659w);
        animatorM103741n4.setInterpolator(this.f70659w);
        bt0.m103733f(bt0.m103748u(false, null, -1L, animatorM103741n, animatorM103741n2, animatorM103741n3, animatorM103741n4), new Runnable() { // from class: l.mlp
            @Override // java.lang.Runnable
            public final void run() {
                this.f134459a.m97632M0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: k0 */
    public final String m97658k0(PurchaseType purchaseType) {
        int i = C15671e.f70666a[purchaseType.ordinal()];
        if (i != 2) {
            return i != 4 ? "#CC000000" : "#F9E7FF";
        }
        return "#FFFFFF";
    }

    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final void m97632M0() {
        mkd0.m154992z(this.f70660x);
        this.f70660x = this.f70648l.duringCreated(C22306c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.nlp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139577a.m97633N0((Long) obj);
            }
        }, new e30() { // from class: l.olp
            @Override // p149l.e30
            public final void call(Object obj) {
                amp.m97602d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public PurchaseType m97660l0() {
        int iM97662m0 = m97662m0();
        ArrayList<PurchaseType> arrayListM126902q0 = glp.m126902q0();
        if (iM97662m0 >= 0 && iM97662m0 < arrayListM126902q0.size()) {
            return arrayListM126902q0.get(iM97662m0);
        }
        PurchaseType purchaseType = this.f70651o;
        if (purchaseType != null) {
            return purchaseType;
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m97661l1() {
        mkd0.m154992z(this.f70660x);
    }

    /* JADX INFO: renamed from: m0 */
    public int m97662m0() {
        IntlTopCardLayout intlTopCardLayout = this.f70641e;
        if (intlTopCardLayout != null) {
            return intlTopCardLayout.getCurrentItem();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m97663n0(PurchaseType purchaseType) {
        int i = C15671e.f70666a[purchaseType.ordinal()];
        if (i == 1) {
            return getAct().getString(R$string.f18366aj);
        }
        if (i == 2) {
            return getAct().getString(R$string.f18701lg);
        }
        if (i != 3) {
            return i != 4 ? "" : getAct().getString(R$string.f18825pg);
        }
        return getAct().getString(R$string.f17578Ab);
    }

    /* JADX INFO: renamed from: o0 */
    public void m97664o0() {
        this.f70647k.postDelayed(new Runnable() { // from class: l.wlp
            @Override // java.lang.Runnable
            public final void run() {
                this.f186966a.m97672x0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: p0 */
    public void m97665p0() {
        m97666q0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m97666q0(boolean z) {
        ViewGroup next;
        ArrayList<PurchaseType> arrayListM126902q0 = glp.m126902q0();
        if (vwb.m200296J(arrayListM126902q0)) {
            return;
        }
        this.f70641e.m56534d(arrayListM126902q0);
        if (z && !vwb.m200296J(this.f70654r)) {
            ArrayList<ViewGroup> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (PurchaseType purchaseType : arrayListM126902q0) {
                Iterator<ViewGroup> it = this.f70654r.iterator();
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
                    ViewGroup viewGroupM97654h0 = m97654h0(purchaseType);
                    if (NullChecker.m81303a(viewGroupM97654h0)) {
                        arrayList.add(viewGroupM97654h0);
                    }
                }
            }
            if (arrayList.size() == arrayListM126902q0.size()) {
                this.f70654r = arrayList;
                if (NullChecker.m81303a(this.f70652p)) {
                    this.f70652p.m109943r(this.f70654r);
                    this.f70642f.setCurrentItem(0);
                }
                if (arrayListM126902q0.isEmpty()) {
                    return;
                }
                this.f70658v = arrayListM126902q0.get(0);
                return;
            }
        }
        this.f70654r = new ArrayList<>();
        Iterator<PurchaseType> it2 = arrayListM126902q0.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroupM97654h1 = m97654h0(it2.next());
            if (NullChecker.m81303a(viewGroupM97654h1)) {
                this.f70654r.add(viewGroupM97654h1);
            }
        }
        if (!vwb.m200296J(this.f70654r) && NullChecker.m81303a(this.f70652p)) {
            this.f70652p.m109943r(this.f70654r);
            this.f70642f.setCurrentItem(0);
            if (!arrayListM126902q0.isEmpty()) {
                this.f70658v = arrayListM126902q0.get(0);
            }
        }
        mep0.m154302d1(this.f70645i, t100.f167260i);
        this.f70645i.setAlpha(153);
        SVGALoader.with(this.f70648l.act()).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f70645i);
    }

    /* JADX INFO: renamed from: r0 */
    public void m97667r0(Bundle bundle) {
        m97641V0();
        m97594Y0();
        m97615s0();
        glp.m126903r0();
        m97665p0();
        m97668t0();
        this.f70649m.m126909s0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m97668t0() {
        this.f70649m.creates(new e30() { // from class: l.tlp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171039a.m97673y0((Bundle) obj);
            }
        }, new d30() { // from class: l.ulp
            @Override // p149l.d30
            public final void call() {
                amp.m97607j();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m97669u0() {
        if (NullChecker.m81303a(this.f70650n) && NullChecker.m81303a(this.f70650n.m53601s())) {
            if (this.f70650n.m53601s().quantity == (CoreModule.f17545c.f19654j0.m30645z4() ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public void m97670v0(int i) {
        IntlTopCardLayout intlTopCardLayout = this.f70641e;
        if (intlTopCardLayout == null || intlTopCardLayout.getCurrentItem() == i) {
            return;
        }
        this.f70641e.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m97671w0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        m97639T0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m97672x0() {
        if (m97669u0()) {
            this.f70643g.removeCallbacks(this.f70657u);
            this.f70643g.post(this.f70657u);
        }
        if (vwb.m200296J(this.f70654r)) {
            return;
        }
        for (ViewParent viewParent : this.f70654r) {
            if (viewParent instanceof hxo) {
                ((hxo) viewParent).mo56387b(2);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m97673y0(Bundle bundle) {
        Bundle arguments = this.f70648l.getArguments();
        if (!NullChecker.m81303a(arguments) || this.f70641e == null) {
            return;
        }
        String string = arguments.getString("vip_selected_purchase_type");
        PurchaseType purchaseTypeValueOf = !TextUtils.isEmpty(string) ? PurchaseType.valueOf(string) : null;
        int i = arguments.getInt("vip_selected_page", -1);
        if (i >= 0) {
            this.f70641e.setCurrentItem(i);
            m97650f0(this.f70641e._viewpager.getCurrentItem());
        } else {
            this.f70641e.setCurrentItem(c690.m105372a(purchaseTypeValueOf, !u59.m191817Z(), new jyo()));
            m97650f0(this.f70641e._viewpager.getCurrentItem());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m97674z0() {
        IntlTopCardLayout intlTopCardLayout = this.f70641e;
        if (intlTopCardLayout != null) {
            m97650f0(intlTopCardLayout.getCurrentItem());
            this.f70656t = false;
        }
    }

    /* JADX INFO: renamed from: l.amp$b */
    public class ViewOnAttachStateChangeListenerC15668b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC15668b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            amp.this.f70643g.removeCallbacks(amp.this.f70657u);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: l.amp$c */
    public class C15669c implements ViewPager.InterfaceC0716j {
        public C15669c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (amp.this.f70656t) {
                return;
            }
            amp.this.m97650f0(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
