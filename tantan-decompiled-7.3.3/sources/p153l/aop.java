package p153l;

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
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeSVipContent;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeSeeContent;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeUltraPremiumContent;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.IntlPrivilegeVipContent;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.IntlBounceBackViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.IntlTopCardLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.view.bottom.IntlAlphaTransformerViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.HelperManagerAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.AutoVDraweeView;
import p151v.VIcon;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class aop implements iam<gnp> {

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f72483b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f72484c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f72485d;

    /* JADX INFO: renamed from: e */
    public IntlTopCardLayout f72486e;

    /* JADX INFO: renamed from: f */
    public IntlAlphaTransformerViewPager f72487f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f72488g;

    /* JADX INFO: renamed from: h */
    public View f72489h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f72490i;

    /* JADX INFO: renamed from: j */
    public VText f72491j;

    /* JADX INFO: renamed from: k */
    public VText f72492k;

    /* JADX INFO: renamed from: l */
    public PutongFrag f72493l;

    /* JADX INFO: renamed from: m */
    public gnp f72494m;

    /* JADX INFO: renamed from: n */
    public C8928d.a f72495n;

    /* JADX INFO: renamed from: o */
    public PurchaseType f72496o;

    /* JADX INFO: renamed from: p */
    public d5n f72497p;

    /* JADX INFO: renamed from: q */
    public View f72498q;

    /* JADX INFO: renamed from: v */
    public PurchaseType f72503v;

    /* JADX INFO: renamed from: x */
    public kcg0 f72505x;

    /* JADX INFO: renamed from: a */
    public PurchaseType f72482a = null;

    /* JADX INFO: renamed from: r */
    public ArrayList<ViewGroup> f72499r = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    public String f72500s = "";

    /* JADX INFO: renamed from: t */
    public boolean f72501t = false;

    /* JADX INFO: renamed from: u */
    public final Runnable f72502u = new RunnableC15757a();

    /* JADX INFO: renamed from: w */
    public Interpolator f72504w = new LinearInterpolator();

    /* JADX INFO: renamed from: y */
    public y20<Integer> f72506y = new C15760d();

    /* JADX INFO: renamed from: l.aop$a */
    public class RunnableC15757a implements Runnable {
        public RunnableC15757a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zM114668a0 = d79.m114668a0();
            aop aopVar = aop.this;
            if (zM114668a0) {
                bnl0.m105524M(aopVar.f72491j, true);
                bnl0.m105524M(aop.this.f72492k, false);
                bnl0.m105524M(aop.this.f72490i, false);
                aop aopVar2 = aop.this;
                int iM99197j0 = aopVar2.m99197j0(aopVar2.f72496o);
                aop aopVar3 = aop.this;
                String strM99199k0 = aopVar3.m99199k0(aopVar3.f72496o);
                aop aopVar4 = aop.this;
                aopVar2.m99192f1(iM99197j0, strM99199k0, aopVar4.m99204n0(aopVar4.f72496o));
                return;
            }
            String strM54826q = C8929e.m54826q(aopVar.f72495n);
            String strM54832w = C8929e.m54832w(aop.this.f72495n);
            aop aopVar5 = aop.this;
            int iM99197j1 = aopVar5.m99197j0(aopVar5.f72496o);
            aop aopVar6 = aop.this;
            String strM99199k1 = aopVar6.m99199k0(aopVar6.f72496o);
            boolean zM99210u0 = aop.this.m99210u0();
            aop.this.m99202l1();
            bnl0.m105524M(aop.this.f72490i, false);
            bnl0.m105524M(aop.this.f72492k, false);
            bnl0.m105524M(aop.this.f72491j, true);
            int i = C15761e.f72511a[aop.this.f72496o.ordinal()];
            if (i == 1) {
                aop.this.m99190e1(iM99197j1, strM99199k1);
                if (!CoreModule.f18264c.f20381e0.m116600p9().isVIP() && CoreModule.f18264c.f20396j0.m31577B4() && zM99210u0) {
                    aop aopVar7 = aop.this;
                    aopVar7.m99183W0(aopVar7.f72500s);
                    return;
                }
                aop.this.m99186a1(strM54832w);
                boolean zIsVIP = CoreModule.f18264c.f20381e0.m116600p9().isVIP();
                boolean zIsVIPExpired = CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired();
                if (zIsVIP || zIsVIPExpired) {
                    aop.this.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f18263b.getText(R$string.f19260ft)));
                    return;
                }
                aop.this.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f18263b.getText(R$string.f19198dt)));
                return;
            }
            if (i == 2) {
                aop.this.m99190e1(iM99197j1, strM99199k1);
                if (CoreModule.f18264c.f20396j0.m31575A4() && zM99210u0) {
                    aop aopVar8 = aop.this;
                    aopVar8.m99183W0(aopVar8.f72500s);
                    return;
                }
                aop.this.m99186a1(strM54832w);
                long jM180735g = rbb0.m180735g();
                aop aopVar9 = aop.this;
                if (jM180735g != 0) {
                    aopVar9.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f19045Ys));
                    return;
                }
                aopVar9.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + CoreModule.f18263b.getString(R$string.f18865Ss));
                return;
            }
            if (i == 3) {
                aop.this.m99190e1(iM99197j1, strM99199k1);
                if (CoreModule.f18264c.f20396j0.m31646y4() && aop.this.m99210u0()) {
                    aop aopVar10 = aop.this;
                    aopVar10.m99183W0(aopVar10.f72500s);
                    return;
                }
                aop.this.m99186a1(strM54832w);
                if (aop.this.f72495n != null && (TEnum.equals(aop.this.f72495n.m54762f(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(aop.this.f72495n.m54762f(), ProductCategory.tttSeeUpgradeToPremium))) {
                    aop.this.f72491j.setText(String.format(aop.this.getAct().getString(R$string.f19094ah), aop.this.f72495n.m54764g()));
                    bnl0.m105524M(aop.this.f72490i, true);
                    aop.this.m99198j1();
                    return;
                } else {
                    aop.this.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f18263b.getText(R$string.f19120bc)));
                    return;
                }
            }
            if (i != 4) {
                return;
            }
            aop.this.m99190e1(iM99197j1, strM99199k1);
            aop.this.m99188d1(strM54832w, Color.parseColor("#80F9E7FF"));
            if (aop.this.f72495n != null && (TEnum.equals(aop.this.f72495n.m54762f(), ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(aop.this.f72495n.m54762f(), ProductCategory.Promo_premiumUpgradeToUltra))) {
                aop.this.f72491j.setText(String.format(aop.this.getAct().getString(R$string.f19094ah), aop.this.f72495n.m54764g()));
                bnl0.m105524M(aop.this.f72490i, true);
                aop.this.m99198j1();
                return;
            }
            boolean zM146398l4 = joa.m146398l4();
            aop aopVar11 = aop.this;
            if (zM146398l4) {
                aopVar11.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f18263b.getText(R$string.f18581Jg)));
                return;
            }
            aopVar11.f72491j.setText(strM54826q + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((Object) CoreModule.f18263b.getText(R$string.f18550Ig)));
        }
    }

    /* JADX INFO: renamed from: l.aop$d */
    public class C15760d implements y20<Integer> {
        public C15760d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            if (num.intValue() == 5) {
                aop aopVar = aop.this;
                aopVar.m99196h1(true, aopVar.f72496o == PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        }
    }

    /* JADX INFO: renamed from: l.aop$e */
    public static /* synthetic */ class C15761e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f72511a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f72511a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72511a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72511a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72511a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.aop$f */
    public static class C15762f {
        /* JADX INFO: renamed from: b */
        public static void m99218b(aop aopVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            aopVar.f72483b = (AutoVDraweeView) viewGroup.getChildAt(0);
            aopVar.f72484c = (VNavigationBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            aopVar.f72485d = (ConstraintLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            aopVar.f72486e = (IntlTopCardLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
            aopVar.f72487f = (IntlAlphaTransformerViewPager) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
            aopVar.f72488g = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
            aopVar.f72489h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            aopVar.f72490i = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            aopVar.f72491j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2)).getChildAt(0);
            aopVar.f72492k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m99219c(aop aopVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125911k5, viewGroup, false);
            m99218b(aopVar, viewInflate);
            return viewInflate;
        }
    }

    public aop(PutongFrag putongFrag) {
        this.f72493l = putongFrag;
    }

    /* JADX INFO: renamed from: Y0 */
    private void m99135Y0() {
        this.f72488g.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC15758b());
        this.f72486e.m57718e(this.f72493l, new C15759c());
        bnl0.m105509E0(this.f72488g, new View.OnClickListener() { // from class: l.hnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110813a.m99165D0(view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m99143d(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    private void m99147i0() {
        getAct().duringCreated(bpc0.m105791c()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.pnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153321a.m99212w0((RecentContractInfosEnvelope) obj);
            }
        }, new y20() { // from class: l.qnp
            @Override // p153l.y20
            public final void call(Object obj) {
                aop.m99154q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m99148j() {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m99154q(Throwable th) {
    }

    /* JADX INFO: renamed from: s0 */
    private void m99156s0() {
        this.f72497p = new d5n((IntlVipNewUiFrag) this.f72493l);
        this.f72487f.mo4182X(true, new a5n());
        this.f72487f.setOffscreenPageLimit(3);
        this.f72487f.setAdapter(this.f72497p);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m99163A0(View view) {
        if (m99194g1()) {
            return;
        }
        getAct().m68056e2();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m99164B0(View view) {
        rj90.m181694d();
        if (this.f72493l.act() != null) {
            this.f72493l.act().startActivity(new Intent(this.f72493l.act(), (Class<?>) HelperManagerAct.class));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f72493l.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m99165D0(View view) {
        m99175O0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m99166E0(boolean z, User user) {
        m99185Z0(user, z);
        ubp.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m99167G0(boolean z, User user) {
        m99185Z0(user, z);
        ubp.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m99168H0(boolean z, User user) {
        m99185Z0(user, z);
        ubp.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m99169I0(boolean z) {
        m99185Z0(null, z);
        ubp.payFromSalvageAction = "";
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m99170J0(boolean z, User user) {
        m99185Z0(user, z);
        ubp.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m99171K0(boolean z, User user) {
        m99185Z0(user, z);
        ubp.payFromSalvageAction = "liked";
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m99172L0(boolean z, User user) {
        m99185Z0(user, z);
        ubp.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m99174N0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f72490i;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public void m99175O0() {
        if (!d79.m114668a0()) {
            if (((CoreModule.f18264c.f20396j0.m31575A4() && this.f72496o == PurchaseType.TYPE_GET_LIKERS) || ((CoreModule.f18264c.f20396j0.m31577B4() && this.f72496o == PurchaseType.TYPE_GET_VIP) || (CoreModule.f18264c.f20396j0.m31646y4() && this.f72496o == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE))) && m99210u0()) {
                m99177Q0(CoreModule.f18264c.f20396j0.m31579C4().skuId);
                return;
            } else {
                if (NullChecker.m82486a(this.f72495n) && NullChecker.m82486a(this.f72495n.m54784s())) {
                    m99177Q0(this.f72495n.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId());
                    return;
                }
                return;
            }
        }
        PutongFrag putongFrag = this.f72493l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C15761e.f72511a[this.f72496o.ordinal()];
        if (i == 1) {
            C8927c.m54589K1(this.f72493l.act(), "p_privileges_view,e_buy_privilege_button,click", null, null, null);
            return;
        }
        if (i == 2) {
            C8927c.m54559A1(this.f72493l.act(), "p_privileges_view,e_buy_privilege_button,click");
        } else if (i == 3) {
            C8927c.m54687x0(this.f72493l.act(), "p_privileges_view,e_buy_privilege_button,click", null);
        } else {
            if (i != 4) {
                return;
            }
            C8927c.m54588K0(this.f72493l.act(), "p_privileges_view,e_buy_privilege_button,click", null, null, null);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m99176P0() {
        PurchaseType purchaseType;
        C8928d.a aVarM130957p0;
        PutongFrag putongFrag = this.f72493l;
        if (putongFrag == null || putongFrag.act() == null || this.f72494m == null) {
            return;
        }
        int iM99203m0 = m99203m0();
        ArrayList<PurchaseType> arrayListM130951q0 = gnp.m130951q0();
        if (iM99203m0 < 0 || iM99203m0 >= arrayListM130951q0.size() || (aVarM130957p0 = this.f72494m.m130957p0((purchaseType = arrayListM130951q0.get(iM99203m0)))) == null || !NullChecker.m82486a(aVarM130957p0.m54784s())) {
            return;
        }
        String productId = aVarM130957p0.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId();
        if (TextUtils.isEmpty(productId)) {
            return;
        }
        PutongFrag putongFrag2 = this.f72493l;
        if (putongFrag2 instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) putongFrag2).getFrom();
        }
        rk60.m181780b(this.f72493l.act(), purchaseType, aVarM130957p0.m54730C(), productId, ijj.m140191c().m140192a(purchaseType), new fhj.C16976a(this.f72493l.act(), purchaseType, aVarM130957p0, productId), this.f72506y);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m99177Q0(String str) {
        PutongFrag putongFrag = this.f72493l;
        gul0.m132336a(this.f72496o, !"MINE_SUB_ITEM".equals(putongFrag instanceof IntlVipNewUiFrag ? ((IntlVipNewUiFrag) putongFrag).getFrom() : null));
        if (NullChecker.m82486a(this.f72495n) && NullChecker.m82486a(this.f72495n.m54784s())) {
            rk60.m181780b(this.f72493l.act(), this.f72496o, this.f72495n.m54730C(), str, ijj.m140191c().m140192a(this.f72496o), new fhj.C16976a(this.f72493l.act(), this.f72496o, this.f72495n, str), this.f72506y);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m99178R0(int i) {
        if (gnp.m130951q0().size() > i) {
            PurchaseType purchaseType = gnp.m130951q0().get(i);
            if (d79.m114668a0()) {
                m99179S0(purchaseType, null);
                return;
            }
            C8928d.a aVarM130957p0 = this.f72494m.m130957p0(purchaseType);
            gul0.m132344i(purchaseType);
            gul0.m132341f(purchaseType);
            if (aVarM130957p0 != null) {
                m99179S0(purchaseType, aVarM130957p0);
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m99179S0(PurchaseType purchaseType, C8928d.a aVar) {
        if (!d79.m114668a0()) {
            this.f72494m.m130956G0(purchaseType, aVar);
        }
        if (gnp.m130951q0().size() <= m99203m0() || gnp.m130951q0().get(m99203m0()) != purchaseType) {
            return;
        }
        this.f72495n = aVar;
        this.f72496o = purchaseType;
        this.f72488g.removeCallbacks(this.f72502u);
        this.f72488g.post(this.f72502u);
    }

    /* JADX INFO: renamed from: T0 */
    public void m99180T0() {
        nfp nfpVar;
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f72486e;
        if (intlTopCardLayout == null || (nfpVar = intlTopCardLayout.adapter) == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        nfpVar.m162933s(intlBounceBackViewPager);
    }

    /* JADX INFO: renamed from: U0 */
    public void m99181U0() {
        PurchaseType purchaseTypeM115091b;
        PurchaseType purchaseTypeM99201l0 = this.f72482a;
        if (purchaseTypeM99201l0 == null) {
            purchaseTypeM99201l0 = m99201l0();
        }
        gnp.m130938E0();
        gnp.m130952r0();
        ArrayList<PurchaseType> arrayListM130951q0 = gnp.m130951q0();
        int iIndexOf = (purchaseTypeM99201l0 == null || arrayListM130951q0 == null || !arrayListM130951q0.contains(purchaseTypeM99201l0)) ? -1 : arrayListM130951q0.indexOf(purchaseTypeM99201l0);
        if (iIndexOf < 0 && (purchaseTypeM115091b = d9r.m115091b()) != null && arrayListM130951q0 != null && arrayListM130951q0.contains(purchaseTypeM115091b)) {
            iIndexOf = arrayListM130951q0.indexOf(purchaseTypeM115091b);
        }
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        this.f72482a = null;
        this.f72501t = true;
        m99207q0(true);
        m99211v0(iIndexOf);
        IntlTopCardLayout intlTopCardLayout = this.f72486e;
        if (intlTopCardLayout != null) {
            intlTopCardLayout.post(new Runnable() { // from class: l.vnp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184905a.m99215z0();
                }
            });
        } else {
            this.f72501t = false;
        }
        m99147i0();
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: V0 */
    public final void m99182V0() {
        this.f72484c.setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f72484c.getRightIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f72484c.getLeftIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        if (this.f72484c.getLeftIconContainer().getChildCount() > 0 && (this.f72484c.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
            ((VIcon) this.f72484c.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#1F1F1F"));
        }
        if (this.f72484c.getTitleContainer().getChildCount() > 0 && (this.f72484c.getTitleContainer().getChildAt(0) instanceof TextView)) {
            ((TextView) this.f72484c.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#CC000000"));
        }
        this.f72484c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.rnp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164092a.m99163A0(view);
            }
        });
        VIcon vIcon = new VIcon(this.f72493l.act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(dbc0.f86318Kl);
        vIcon.setColorFilter(Color.parseColor("#1F1F1F"));
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.snp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169749a.m99164B0(view);
            }
        });
        this.f72484c.setRightIconViews(vIcon);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: W0 */
    public void m99183W0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f72500s = str;
        if (this.f72486e.getCurrentItem() >= gnp.m130951q0().size() || !m99210u0()) {
            return;
        }
        if ((wib0.m206579w(this.f72496o) && CoreModule.f18264c.f20396j0.m31577B4()) || ((wib0.m206575s(this.f72496o) && CoreModule.f18264c.f20396j0.m31575A4()) || (wib0.m206573q(this.f72496o) && CoreModule.f18264c.f20396j0.m31646y4()))) {
            bnl0.m105524M(this.f72492k, false);
            bnl0.m105524M(this.f72491j, true);
            String strM148007c = k3d0.m148007c(CoreModule.f18264c.f20396j0.m31648z4() ? R$string.f19582qc : R$string.f18353C5);
            this.f72491j.setText(strM148007c + SignParameters.NEW_LINE + str);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m99184X0(PurchaseType purchaseType) {
        this.f72482a = purchaseType;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m99185Z0(User user, boolean z) {
        m99175O0();
        ubp ubpVar = ubp.INSTANCE;
        ubpVar.m195273A(user);
        ubpVar.m195290y(true);
    }

    /* JADX INFO: renamed from: a1 */
    public final void m99186a1(String str) {
        m99188d1(str, Color.parseColor("#66000000"));
    }

    /* JADX INFO: renamed from: d0 */
    public View m99187d0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15762f.m99219c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m99188d1(String str, int i) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f72492k;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            return;
        }
        bnl0.m105524M(vText, true);
        this.f72492k.setTextColor(i);
        this.f72492k.setText(CoreModule.f18263b.getString(R$string.f18577Jc, str));
    }

    @Override // p153l.iam
    public void destroy() {
        if (!jyb.m147479J(this.f72499r)) {
            for (ViewGroup viewGroup : this.f72499r) {
                if (viewGroup instanceof IntlPrivilegeSVipContent) {
                    ((IntlPrivilegeSVipContent) viewGroup).m57587w0();
                    break;
                }
            }
        }
        m99202l1();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(gnp gnpVar) {
        this.f72494m = gnpVar;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m99190e1(int i, String str) {
        View view = this.f72489h;
        if (view != null) {
            view.setBackgroundResource(i);
        }
        this.f72491j.setTextColor(Color.parseColor(str));
        this.f72491j.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: f0 */
    public void m99191f0(int i) {
        PutongFrag putongFrag = this.f72493l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        ArrayList<PurchaseType> arrayListM130951q0 = gnp.m130951q0();
        if (i < 0 || i >= arrayListM130951q0.size()) {
            return;
        }
        PurchaseType purchaseType = arrayListM130951q0.get(i);
        PurchaseType purchaseType2 = this.f72503v;
        if (wib0.m206579w(purchaseType)) {
            this.f72486e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f72486e._indicator.setFillColor(Color.parseColor("#EEC873"));
            this.f72483b.setBackgroundResource(dbc0.f87541wb);
            this.f72483b.setController(null);
            m99193g0(PurchaseType.TYPE_GET_VIP);
            FrameLayout frameLayout = this.f72488g;
            if (frameLayout != null) {
                frameLayout.setBackgroundResource(dbc0.f86083Da);
            }
        } else if (wib0.m206575s(purchaseType)) {
            this.f72486e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f72486e._indicator.setFillColor(Color.parseColor("#FF8817"));
            this.f72483b.setBackgroundResource(dbc0.f86919db);
            this.f72483b.setController(null);
            m99193g0(PurchaseType.TYPE_GET_LIKERS);
            FrameLayout frameLayout2 = this.f72488g;
            if (frameLayout2 != null) {
                frameLayout2.setBackgroundResource(dbc0.f86083Da);
            }
        } else if (wib0.m206573q(purchaseType)) {
            this.f72486e._indicator.setPageColor(Color.parseColor("#14000000"));
            this.f72486e._indicator.setFillColor(Color.parseColor("#DD9E2C"));
            m99193g0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            this.f72483b.setBackground(null);
            this.f72483b.setImageUrl("https://auto.tancdn.com/v1/raw/2a8de5d3-d063-4df3-ae1f-d37c96725580.webp");
            FrameLayout frameLayout3 = this.f72488g;
            if (frameLayout3 != null) {
                frameLayout3.setBackgroundResource(dbc0.f86083Da);
            }
        } else if (wib0.m206578v(purchaseType)) {
            this.f72486e._indicator.setPageColor(Color.parseColor("#33705E44"));
            this.f72486e._indicator.setFillColor(Color.parseColor("#9569AC"));
            m99193g0(PurchaseType.TYPE_ULTRA_PREMIUM);
            this.f72483b.setBackground(null);
            this.f72483b.setImageUrl("https://auto.tancdn.com/v1/raw/aa62ad72-c2bc-45e5-8f82-6add0b4ca249.webp");
            FrameLayout frameLayout4 = this.f72488g;
            if (frameLayout4 != null) {
                frameLayout4.setBackgroundResource(dbc0.f86051Ca);
            }
        }
        m99178R0(i);
        if (this.f72487f.getCurrentItem() != i) {
            this.f72487f.m4178T(i, false);
        }
        ArrayList<ViewGroup> arrayList = this.f72499r;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        ViewParent viewParent = (ViewGroup) this.f72499r.get(i);
        if (viewParent instanceof hzo) {
            ((hzo) viewParent).mo57571f(purchaseType2, purchaseType);
            this.f72503v = purchaseType;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m99192f1(int i, String str, String str2) {
        View view = this.f72489h;
        if (view != null) {
            view.setBackgroundResource(i);
        }
        this.f72491j.setTextColor(Color.parseColor(str));
        this.f72491j.setTypeface(Typeface.defaultFromStyle(1));
        this.f72491j.setText(str2);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m99193g0(PurchaseType purchaseType) {
        PutongFrag putongFrag = this.f72493l;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C15761e.f72511a[purchaseType.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            this.f72493l.act().setStatusBarColor(this.f72493l.act().getResources().getColor(c9c0.f80383V1));
            this.f72493l.act().getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            this.f72493l.act().getWindow().addFlags(Integer.MIN_VALUE);
            PutongAct.setLightStatusBar(this.f72493l.act().getWindow(), 16);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public boolean m99194g1() {
        PurchaseType purchaseType = this.f72496o;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m99196h1(false, purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public final ViewGroup m99195h0(PurchaseType purchaseType) {
        int i = C15761e.f72511a[purchaseType.ordinal()];
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
    public final boolean m99196h1(boolean z, final boolean z2) {
        if (NullChecker.m82486a(this.f72495n)) {
            ubp.INSTANCE.m195291z(this.f72495n);
        }
        PutongFrag putongFrag = this.f72493l;
        String from = putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : "";
        return z2 ? ubp.INSTANCE.m195276D(getAct(), new y20() { // from class: l.xnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195461a.m99166E0(z2, (User) obj);
            }
        }, new y20() { // from class: l.ynp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200898a.m99167G0(z2, (User) obj);
            }
        }, new y20() { // from class: l.znp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205215a.m99168H0(z2, (User) obj);
            }
        }, z, from, null, getAct()) : ubp.INSTANCE.m195275C(getAct(), new Runnable() { // from class: l.inp
            @Override // java.lang.Runnable
            public final void run() {
                this.f115991a.m99169I0(z2);
            }
        }, new y20() { // from class: l.jnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121879a.m99170J0(z2, (User) obj);
            }
        }, new y20() { // from class: l.knp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127613a.m99171K0(z2, (User) obj);
            }
        }, new y20() { // from class: l.lnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132832a.m99172L0(z2, (User) obj);
            }
        }, z, from, null, getAct());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM99187d0 = m99187d0(layoutInflater, viewGroup);
        this.f72498q = viewM99187d0;
        return viewM99187d0;
    }

    /* JADX INFO: renamed from: j0 */
    public final int m99197j0(PurchaseType purchaseType) {
        int i = C15761e.f72511a[purchaseType.ordinal()];
        if (i == 1) {
            return dbc0.f87509vb;
        }
        if (i == 2) {
            return dbc0.f86886cb;
        }
        if (i != 3) {
            return i != 4 ? dbc0.f87509vb : dbc0.f87147kb;
        }
        return dbc0.f86339La;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m99198j1() {
        Animator animatorM132168n = gt0.m132168n(this.f72488g, gt0.f106354i, 1.0f, 1.0f);
        Animator animatorM132168n2 = gt0.m132168n(this.f72488g, gt0.f106354i, 1.0f, 0.96f);
        Animator animatorM132168n3 = gt0.m132168n(this.f72488g, gt0.f106354i, 0.96f, 1.03f);
        Animator animatorM132168n4 = gt0.m132168n(this.f72488g, gt0.f106354i, 1.03f, 1.0f);
        animatorM132168n.setDuration(500L);
        animatorM132168n2.setDuration(333L);
        animatorM132168n3.setDuration(333L);
        animatorM132168n4.setDuration(333L);
        animatorM132168n.setInterpolator(this.f72504w);
        animatorM132168n2.setInterpolator(this.f72504w);
        animatorM132168n3.setInterpolator(this.f72504w);
        animatorM132168n4.setInterpolator(this.f72504w);
        gt0.m132160f(gt0.m132175u(false, null, -1L, animatorM132168n, animatorM132168n2, animatorM132168n3, animatorM132168n4), new Runnable() { // from class: l.mnp
            @Override // java.lang.Runnable
            public final void run() {
                this.f137718a.m99173M0();
            }
        }).start();
    }

    /* JADX INFO: renamed from: k0 */
    public final String m99199k0(PurchaseType purchaseType) {
        int i = C15761e.f72511a[purchaseType.ordinal()];
        if (i != 2) {
            return i != 4 ? "#CC000000" : "#F9E7FF";
        }
        return "#FFFFFF";
    }

    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final void m99173M0() {
        psd0.m173633z(this.f72505x);
        this.f72505x = this.f72493l.duringCreated(C22421c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.nnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142816a.m99174N0((Long) obj);
            }
        }, new y20() { // from class: l.onp
            @Override // p153l.y20
            public final void call(Object obj) {
                aop.m99143d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public PurchaseType m99201l0() {
        int iM99203m0 = m99203m0();
        ArrayList<PurchaseType> arrayListM130951q0 = gnp.m130951q0();
        if (iM99203m0 >= 0 && iM99203m0 < arrayListM130951q0.size()) {
            return arrayListM130951q0.get(iM99203m0);
        }
        PurchaseType purchaseType = this.f72496o;
        if (purchaseType != null) {
            return purchaseType;
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m99202l1() {
        psd0.m173633z(this.f72505x);
    }

    /* JADX INFO: renamed from: m0 */
    public int m99203m0() {
        IntlTopCardLayout intlTopCardLayout = this.f72486e;
        if (intlTopCardLayout != null) {
            return intlTopCardLayout.getCurrentItem();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final String m99204n0(PurchaseType purchaseType) {
        int i = C15761e.f72511a[purchaseType.ordinal()];
        if (i == 1) {
            return getAct().getString(R$string.f19775wj);
        }
        if (i == 2) {
            return getAct().getString(R$string.f18426Eg);
        }
        if (i != 3) {
            return i != 4 ? "" : getAct().getString(R$string.f18550Ig);
        }
        return getAct().getString(R$string.f18758Pb);
    }

    /* JADX INFO: renamed from: o0 */
    public void m99205o0() {
        this.f72492k.postDelayed(new Runnable() { // from class: l.wnp
            @Override // java.lang.Runnable
            public final void run() {
                this.f189971a.m99213x0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: p0 */
    public void m99206p0() {
        m99207q0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m99207q0(boolean z) {
        ViewGroup next;
        ArrayList<PurchaseType> arrayListM130951q0 = gnp.m130951q0();
        if (jyb.m147479J(arrayListM130951q0)) {
            return;
        }
        this.f72486e.m57717d(arrayListM130951q0);
        if (z && !jyb.m147479J(this.f72499r)) {
            ArrayList<ViewGroup> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (PurchaseType purchaseType : arrayListM130951q0) {
                Iterator<ViewGroup> it = this.f72499r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!arrayList2.contains(next) && (next instanceof hzo) && purchaseType.equals(((hzo) next).getPurchaseType())) {
                        arrayList2.add(next);
                        break;
                    }
                }
                if (next != null) {
                    arrayList.add(next);
                } else {
                    ViewGroup viewGroupM99195h0 = m99195h0(purchaseType);
                    if (NullChecker.m82486a(viewGroupM99195h0)) {
                        arrayList.add(viewGroupM99195h0);
                    }
                }
            }
            if (arrayList.size() == arrayListM130951q0.size()) {
                this.f72499r = arrayList;
                if (NullChecker.m82486a(this.f72497p)) {
                    this.f72497p.m114316r(this.f72499r);
                    this.f72487f.setCurrentItem(0);
                }
                if (arrayListM130951q0.isEmpty()) {
                    return;
                }
                this.f72503v = arrayListM130951q0.get(0);
                return;
            }
        }
        this.f72499r = new ArrayList<>();
        Iterator<PurchaseType> it2 = arrayListM130951q0.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroupM99195h1 = m99195h0(it2.next());
            if (NullChecker.m82486a(viewGroupM99195h1)) {
                this.f72499r.add(viewGroupM99195h1);
            }
        }
        if (!jyb.m147479J(this.f72499r) && NullChecker.m82486a(this.f72497p)) {
            this.f72497p.m114316r(this.f72499r);
            this.f72487f.setCurrentItem(0);
            if (!arrayListM130951q0.isEmpty()) {
                this.f72503v = arrayListM130951q0.get(0);
            }
        }
        qnp0.m177261d1(this.f72490i, qa00.f156322i);
        this.f72490i.setAlpha(153);
        SVGALoader.with(this.f72493l.act()).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f72490i);
    }

    /* JADX INFO: renamed from: r0 */
    public void m99208r0(Bundle bundle) {
        m99182V0();
        m99135Y0();
        m99156s0();
        gnp.m130952r0();
        m99206p0();
        m99209t0();
        this.f72494m.m130958s0();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m99209t0() {
        this.f72494m.creates(new y20() { // from class: l.tnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175301a.m99214y0((Bundle) obj);
            }
        }, new x20() { // from class: l.unp
            @Override // p153l.x20
            public final void call() {
                aop.m99148j();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m99210u0() {
        if (NullChecker.m82486a(this.f72495n) && NullChecker.m82486a(this.f72495n.m54784s())) {
            if (this.f72495n.m54784s().quantity == (CoreModule.f18264c.f20396j0.m31648z4() ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v0 */
    public void m99211v0(int i) {
        IntlTopCardLayout intlTopCardLayout = this.f72486e;
        if (intlTopCardLayout == null || intlTopCardLayout.getCurrentItem() == i) {
            return;
        }
        this.f72486e.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m99212w0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        m99180T0();
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m99213x0() {
        if (m99210u0()) {
            this.f72488g.removeCallbacks(this.f72502u);
            this.f72488g.post(this.f72502u);
        }
        if (jyb.m147479J(this.f72499r)) {
            return;
        }
        for (ViewParent viewParent : this.f72499r) {
            if (viewParent instanceof hzo) {
                ((hzo) viewParent).mo57570b(2);
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m99214y0(Bundle bundle) {
        Bundle arguments = this.f72493l.getArguments();
        if (!NullChecker.m82486a(arguments) || this.f72486e == null) {
            return;
        }
        String string = arguments.getString("vip_selected_purchase_type");
        PurchaseType purchaseTypeValueOf = !TextUtils.isEmpty(string) ? PurchaseType.valueOf(string) : null;
        int i = arguments.getInt("vip_selected_page", -1);
        if (i >= 0) {
            this.f72486e.setCurrentItem(i);
            m99191f0(this.f72486e._viewpager.getCurrentItem());
        } else {
            this.f72486e.setCurrentItem(ge90.m129967a(purchaseTypeValueOf, !d79.m114668a0(), new j0p()));
            m99191f0(this.f72486e._viewpager.getCurrentItem());
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m99215z0() {
        IntlTopCardLayout intlTopCardLayout = this.f72486e;
        if (intlTopCardLayout != null) {
            m99191f0(intlTopCardLayout.getCurrentItem());
            this.f72501t = false;
        }
    }

    /* JADX INFO: renamed from: l.aop$b */
    public class ViewOnAttachStateChangeListenerC15758b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC15758b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            aop.this.f72488g.removeCallbacks(aop.this.f72502u);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: l.aop$c */
    public class C15759c implements ViewPager.InterfaceC0718j {
        public C15759c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (aop.this.f72501t) {
                return;
            }
            aop.this.m99191f0(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
