package p006l;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
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
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.HelperManagerAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeSVipContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeSeeContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeUltraPremiumContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.IntlPrivilegeVipContent;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.view.IntlBounceBackViewPager;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.view.IntlTopCardLayout;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.view.bottom.IntlAlphaTransformerViewPager;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p1.mobile.putong.core.pay.R;
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
import rx.c;
import v.VIcon;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class all0 implements s7m<gkl0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f8319a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f8320b;

    /* JADX INFO: renamed from: c */
    public IntlTopCardLayout f8321c;

    /* JADX INFO: renamed from: d */
    public IntlAlphaTransformerViewPager f8322d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f8323e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f8324f;

    /* JADX INFO: renamed from: g */
    public VText f8325g;

    /* JADX INFO: renamed from: h */
    public VText f8326h;

    /* JADX INFO: renamed from: i */
    public PutongFrag f8327i;

    /* JADX INFO: renamed from: j */
    public gkl0 f8328j;

    /* JADX INFO: renamed from: k */
    public d.a f8329k;

    /* JADX INFO: renamed from: l */
    public PurchaseType f8330l;

    /* JADX INFO: renamed from: n */
    public c3n f8332n;

    /* JADX INFO: renamed from: o */
    public View f8333o;

    /* JADX INFO: renamed from: u */
    public c4g0 f8339u;

    /* JADX INFO: renamed from: m */
    public PurchaseType f8331m = null;

    /* JADX INFO: renamed from: p */
    public ArrayList<ViewGroup> f8334p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public String f8335q = "";

    /* JADX INFO: renamed from: r */
    public boolean f8336r = false;

    /* JADX INFO: renamed from: s */
    public final Runnable f8337s = new RunnableC0511a();

    /* JADX INFO: renamed from: t */
    public Interpolator f8338t = new LinearInterpolator();

    /* JADX INFO: renamed from: v */
    public e30<Integer> f8340v = new C0514d();

    /* JADX INFO: renamed from: l.all0$a */
    public class RunnableC0511a implements Runnable {
        public RunnableC0511a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strQ = e.q(all0.this.f8329k);
            String strW = e.w(all0.this.f8329k);
            all0.this.f8325g.setTextColor(Color.parseColor("#CC000000"));
            all0.this.f8326h.setTextColor(Color.parseColor("#66000000"));
            all0.this.m11917U0();
            xdl0.M(all0.this.f8324f, false);
            int i = C0515e.f8345a[all0.this.f8330l.ordinal()];
            if (i == 1) {
                all0.this.f8323e.setBackgroundResource(x2c0.f27150ub);
                xdl0.M(all0.this.f8325g, true);
                if (!CoreModule.f1534c.f3628e0.m21490p9().isVIP() && CoreModule.f1534c.f3643j0.m2502B4() && all0.this.m11935k0()) {
                    all0 all0Var = all0.this;
                    all0Var.m11968L0(all0Var.f8335q);
                    return;
                }
                all0.this.m11908P0(strW);
                if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || CoreModule.f1534c.f3628e0.m21490p9().isVIPExpired()) {
                    all0.this.f8325g.setText(strQ + ((Object) CoreModule.f1533b.getText(R$string.f1854Js)));
                    return;
                }
                all0.this.f8325g.setText(strQ + ((Object) CoreModule.f1533b.getText(R$string.f1794Hs)));
                return;
            }
            if (i == 2) {
                all0.this.f8323e.setBackgroundResource(x2c0.f26513ab);
                xdl0.M(all0.this.f8325g, true);
                if (CoreModule.f1534c.f3643j0.m2500A4() && all0.this.m11935k0()) {
                    all0 all0Var2 = all0.this;
                    all0Var2.m11968L0(all0Var2.f8335q);
                    return;
                }
                all0.this.m11908P0(strW);
                int i2 = R$string.f1644Cs;
                int i3 = R$string.f3036ws;
                long jG = n3b0.g();
                all0 all0Var3 = all0.this;
                if (jG != 0) {
                    all0Var3.f8325g.setText(strQ + CoreModule.f1533b.getString(i2));
                    return;
                }
                all0Var3.f8325g.setText(strQ + CoreModule.f1533b.getString(i3));
                return;
            }
            if (i == 3) {
                xdl0.M(all0.this.f8325g, true);
                all0.this.f8323e.setBackgroundResource(x2c0.f26016Ka);
                if (CoreModule.f1534c.f3643j0.m2571y4() && all0.this.m11935k0()) {
                    all0 all0Var4 = all0.this;
                    all0Var4.m11968L0(all0Var4.f8335q);
                    return;
                }
                all0.this.m11908P0(strW);
                if (all0.this.f8329k != null && (TEnum.equals(all0.this.f8329k.f(), "tttVipUpgradeToPremium") || TEnum.equals(all0.this.f8329k.f(), "tttSeeUpgradeToPremium"))) {
                    xdl0.M(all0.this.f8324f, true);
                    all0.this.m11913S0();
                    all0.this.f8325g.setText(String.format(all0.this.act().getString(R.string.i6), all0.this.f8329k.g()));
                    return;
                } else {
                    all0.this.f8325g.setText(strQ + ((Object) CoreModule.f1533b.getText(R$string.f1927Mb)));
                    return;
                }
            }
            if (i != 4) {
                return;
            }
            xdl0.M(all0.this.f8325g, true);
            all0.this.m11908P0(strW);
            all0.this.f8323e.setBackgroundResource(x2c0.f26798jb);
            all0.this.f8325g.setTextColor(Color.parseColor("#F9E7FF"));
            all0.this.f8325g.setTypeface(Typeface.defaultFromStyle(1));
            all0.this.f8326h.setTextColor(Color.parseColor("#80F9E7FF"));
            if (all0.this.f8329k != null && (TEnum.equals(all0.this.f8329k.f(), "tttPremiumUpgradeToUltra") || TEnum.equals(all0.this.f8329k.f(), "Promo_premiumUpgradeToUltra"))) {
                xdl0.M(all0.this.f8324f, true);
                all0.this.m11913S0();
                all0.this.f8325g.setText(String.format(all0.this.act().getString(R.string.i6), all0.this.f8329k.g()));
                return;
            }
            boolean zM27391k4 = xma.m27391k4();
            all0 all0Var5 = all0.this;
            if (zM27391k4) {
                all0Var5.f8325g.setText(strQ + ((Object) CoreModule.f1533b.getText(R$string.f2844qg)));
                return;
            }
            all0Var5.f8325g.setText(strQ + ((Object) CoreModule.f1533b.getText(R$string.f2814pg)));
        }
    }

    /* JADX INFO: renamed from: l.all0$d */
    public class C0514d implements e30<Integer> {
        public C0514d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            if (num.intValue() == 5) {
                all0 all0Var = all0.this;
                all0Var.m11911R0(true, all0Var.f8330l == PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        }
    }

    /* JADX INFO: renamed from: l.all0$e */
    public static /* synthetic */ class C0515e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8345a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f8345a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8345a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8345a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8345a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.all0$f */
    public static class C0516f {
        /* JADX INFO: renamed from: b */
        public static void m11982b(all0 all0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            all0Var.f8319a = viewGroup.getChildAt(0);
            all0Var.f8320b = viewGroup.getChildAt(1);
            all0Var.f8321c = (IntlTopCardLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            all0Var.f8322d = (IntlAlphaTransformerViewPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            all0Var.f8323e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            all0Var.f8324f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
            all0Var.f8325g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            all0Var.f8326h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m11983c(all0 all0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f12417sf, viewGroup, false);
            m11982b(all0Var, viewInflate);
            return viewInflate;
        }
    }

    public all0(PutongFrag putongFrag) {
        this.f8327i = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m11890B0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f8324f;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m11893E0(String str) {
        PutongFrag putongFrag = this.f8327i;
        cll0.m13519a(this.f8330l, !"MINE_SUB_ITEM".equals(putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : null));
        if (NullChecker.a(this.f8329k) && NullChecker.a(this.f8329k.s())) {
            mc60.m19205b(this.f8327i.act(), this.f8330l, this.f8329k.C(), str, ogj.c().a(this.f8330l), new lej.C0973a(this.f8327i.act(), this.f8330l, this.f8329k, str), this.f8340v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: K0 */
    private void m11900K0() {
        this.f8319a.setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f8319a.getRightIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f8319a.getLeftIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f8319a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ikl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14534a.m11945q0(view);
            }
        });
        VIcon vIcon = new VIcon(this.f8327i.act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(x2c0.f26398Wk);
        vIcon.setColorFilter(Color.parseColor("#1F1F1F"));
        xdl0.E0(vIcon, new View.OnClickListener() { // from class: l.jkl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15203a.m11946r0(view);
            }
        });
        this.f8319a.setRightIconViews(new View[]{vIcon});
    }

    /* JADX INFO: renamed from: N0 */
    private void m11904N0() {
        this.f8323e.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0512b());
        this.f8321c.m11172e(this.f8327i, new C0513c());
        xdl0.E0(this.f8323e, new View.OnClickListener() { // from class: l.zkl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28794a.m11948s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    private void m11906O0(User user, boolean z) {
        m11963D0();
        u9p u9pVar = u9p.INSTANCE;
        u9pVar.m25147A(user);
        u9pVar.m25164y(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public void m11908P0(String str) {
        xdl0.M(this.f8326h, !TextUtils.isEmpty(str));
        this.f8326h.setText(CoreModule.f1533b.getString(R$string.f2960uc, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public boolean m11911R0(boolean z, final boolean z2) {
        if (NullChecker.a(this.f8329k)) {
            u9p.INSTANCE.m25165z(this.f8329k);
        }
        PutongFrag putongFrag = this.f8327i;
        String from = putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : "";
        return z2 ? u9p.INSTANCE.m25150D(act(), new e30() { // from class: l.skl0
            public final void call(Object obj) {
                this.f21398a.m11949t0(z2, (User) obj);
            }
        }, new e30() { // from class: l.tkl0
            public final void call(Object obj) {
                this.f22154a.m11951u0(z2, (User) obj);
            }
        }, new e30() { // from class: l.ukl0
            public final void call(Object obj) {
                this.f23589a.m11953v0(z2, (User) obj);
            }
        }, z, from, null, act()) : u9p.INSTANCE.m25149C(act(), new Runnable() { // from class: l.vkl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24358a.m11955w0(z2);
            }
        }, new e30() { // from class: l.wkl0
            public final void call(Object obj) {
                this.f25199a.m11957x0(z2, (User) obj);
            }
        }, new e30() { // from class: l.xkl0
            public final void call(Object obj) {
                this.f27567a.m11959y0(z2, (User) obj);
            }
        }, new e30() { // from class: l.ykl0
            public final void call(Object obj) {
                this.f28269a.m11961z0(z2, (User) obj);
            }
        }, z, from, null, act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m11913S0() {
        Animator animatorN = bt0.n(this.f8323e, bt0.i, new float[]{1.0f, 1.0f});
        Animator animatorN2 = bt0.n(this.f8323e, bt0.i, new float[]{1.0f, 0.96f});
        Animator animatorN3 = bt0.n(this.f8323e, bt0.i, new float[]{0.96f, 1.03f});
        Animator animatorN4 = bt0.n(this.f8323e, bt0.i, new float[]{1.03f, 1.0f});
        animatorN.setDuration(500L);
        animatorN2.setDuration(333L);
        animatorN3.setDuration(333L);
        animatorN4.setDuration(333L);
        animatorN.setInterpolator(this.f8338t);
        animatorN2.setInterpolator(this.f8338t);
        animatorN3.setInterpolator(this.f8338t);
        animatorN4.setInterpolator(this.f8338t);
        bt0.f(bt0.u(false, (Interpolator) null, -1L, new Animator[]{animatorN, animatorN2, animatorN3, animatorN4}), new Runnable() { // from class: l.mkl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17014a.m11888A0();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void m11888A0() {
        mkd0.z(this.f8339u);
        this.f8339u = this.f8327i.duringCreated(c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.pkl0
            public final void call(Object obj) {
                this.f19175a.m11890B0((Long) obj);
            }
        }, new e30() { // from class: l.qkl0
            public final void call(Object obj) {
                all0.m11954w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m11917U0() {
        mkd0.z(this.f8339u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m11919Y(int i) {
        PurchaseType purchaseType = gkl0.m15838t0().get(i);
        if (sab0.w(purchaseType)) {
            if (this.f8319a.getLeftIconContainer().getChildCount() > 0 && (this.f8319a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                this.f8319a.getLeftIconContainer().getChildAt(0).setColorFilter(Color.parseColor("#80000000"));
            }
            if (this.f8319a.getTitleContainer().getChildCount() > 0 && (this.f8319a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f8319a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#b8000000"));
            }
            this.f8319a.getLeftIconContainer().getChildAt(0);
            this.f8321c._indicator.setPageColor(Color.parseColor("#26ffcf48"));
            this.f8321c._indicator.setFillColor(Color.parseColor("#ffcf48"));
            this.f8333o.setBackground(this.f8327i.act().getDrawable(x2c0.f27118tb));
            m11920Z(PurchaseType.TYPE_GET_VIP);
        } else if (sab0.s(purchaseType)) {
            if (this.f8319a.getLeftIconContainer().getChildCount() > 0 && (this.f8319a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                this.f8319a.getLeftIconContainer().getChildAt(0).setColorFilter(Color.parseColor("#80000000"));
            }
            if (this.f8319a.getTitleContainer().getChildCount() > 0 && (this.f8319a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f8319a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#b8000000"));
            }
            this.f8321c._indicator.setPageColor(Color.parseColor("#26ffcf48"));
            this.f8321c._indicator.setFillColor(Color.parseColor("#ff932b"));
            this.f8333o.setBackground(this.f8327i.act().getDrawable(x2c0.f26481Za));
            m11920Z(PurchaseType.TYPE_GET_LIKERS);
        } else if (sab0.q(purchaseType)) {
            if (this.f8319a.getLeftIconContainer().getChildCount() > 0 && (this.f8319a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                this.f8319a.getLeftIconContainer().getChildAt(0).setColorFilter(Color.parseColor("#cce8ca8a"));
            }
            if (this.f8319a.getTitleContainer().getChildCount() > 0 && (this.f8319a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f8319a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#cce8ca8a"));
            }
            this.f8321c._indicator.setPageColor(Color.parseColor("#26ffdea2"));
            this.f8321c._indicator.setFillColor(Color.parseColor("#ffdea2"));
            m11920Z(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            this.f8333o.setBackground(this.f8327i.act().getDrawable(x2c0.f25985Ja));
        } else if (sab0.v(purchaseType)) {
            if (this.f8319a.getLeftIconContainer().getChildCount() > 0 && (this.f8319a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                this.f8319a.getLeftIconContainer().getChildAt(0).setColorFilter(Color.parseColor("#3D2747"));
            }
            if (this.f8319a.getTitleContainer().getChildCount() > 0 && (this.f8319a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f8319a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#3D2747"));
            }
            this.f8321c._indicator.setPageColor(Color.parseColor("#33705E44"));
            this.f8321c._indicator.setFillColor(Color.parseColor("#705E44"));
            m11920Z(PurchaseType.TYPE_ULTRA_PREMIUM);
            qib0.f19782G.m12727D(this.f8333o, "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1QUNBVEJDNE5PTVY3TjdRUUtIVFRRM0Y3TFNBNzE0IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE5OTAyMzI1NTU1Mn0.png");
        }
        m11964G0(i);
        this.f8322d.setCurrentItem(i);
        if (this.f8334p.get(i) instanceof gxo) {
            ((gxo) this.f8334p.get(i)).mo11045i();
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m11920Z(PurchaseType purchaseType) {
        int i = C0515e.f8345a[purchaseType.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.f8327i.act().setStatusBarColor(this.f8327i.act().getResources().getColor(w0c0.f24651U1));
                int systemUiVisibility = this.f8327i.act().getWindow().getDecorView().getSystemUiVisibility();
                int i2 = systemUiVisibility & (-8193);
                if (Build.VERSION.SDK_INT >= 26) {
                    i2 = systemUiVisibility & (-8209);
                }
                this.f8327i.act().getWindow().getDecorView().setSystemUiVisibility(i2);
                return;
            }
            if (i != 4) {
                return;
            }
        }
        this.f8327i.act().setStatusBarColor(this.f8327i.act().getResources().getColor(w0c0.f24651U1));
        PutongAct.setLightStatusBar(this.f8327i.act().getWindow(), 16);
    }

    /* JADX INFO: renamed from: a0 */
    private ViewGroup m11922a0(PurchaseType purchaseType) {
        int i = C0515e.f8345a[purchaseType.ordinal()];
        if (i == 1) {
            return new IntlPrivilegeVipContent(m11962C0());
        }
        if (i == 2) {
            return new IntlPrivilegeSeeContent(m11962C0());
        }
        if (i == 3) {
            return new IntlPrivilegeSVipContent(m11962C0());
        }
        if (i != 4) {
            return null;
        }
        return new IntlPrivilegeUltraPremiumContent(m11962C0());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m11924c() {
    }

    /* JADX INFO: renamed from: f0 */
    private void m11928f0() {
        m11929g0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private void m11929g0(boolean z) {
        ViewGroup next;
        ArrayList<PurchaseType> arrayListM15838t0 = gkl0.m15838t0();
        if (vwb.J(arrayListM15838t0)) {
            return;
        }
        this.f8321c.m11171d(arrayListM15838t0);
        if (z && !vwb.J(this.f8334p)) {
            ArrayList<ViewGroup> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (PurchaseType purchaseType : arrayListM15838t0) {
                Iterator<ViewGroup> it = this.f8334p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!arrayList2.contains(next) && (next instanceof gxo) && purchaseType.equals(((gxo) next).getPurchaseType())) {
                        arrayList2.add(next);
                        break;
                    }
                }
                if (next != null) {
                    arrayList.add(next);
                } else {
                    ViewGroup viewGroupM11922a0 = m11922a0(purchaseType);
                    if (NullChecker.a(viewGroupM11922a0)) {
                        arrayList.add(viewGroupM11922a0);
                    }
                }
            }
            if (arrayList.size() == arrayListM15838t0.size()) {
                this.f8334p = arrayList;
                if (NullChecker.a(this.f8332n)) {
                    this.f8332n.m13106s(this.f8334p);
                    this.f8322d.setCurrentItem(0);
                    return;
                }
                return;
            }
        }
        this.f8334p = new ArrayList<>();
        Iterator<PurchaseType> it2 = arrayListM15838t0.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroupM11922a1 = m11922a0(it2.next());
            if (NullChecker.a(viewGroupM11922a1)) {
                this.f8334p.add(viewGroupM11922a1);
            }
        }
        if (!vwb.J(this.f8334p) && NullChecker.a(this.f8332n)) {
            this.f8332n.m13106s(this.f8334p);
            this.f8322d.setCurrentItem(0);
        }
        mep0.d1(this.f8324f, t100.i);
        this.f8324f.setAlpha(153);
        SVGALoader.with(this.f8327i.act()).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f8324f);
    }

    /* JADX INFO: renamed from: i0 */
    private void m11931i0() {
        this.f8332n = new c3n((VipNewUiFrag) this.f8327i);
        this.f8322d.X(true, new z2n());
        this.f8322d.setOffscreenPageLimit(3);
        this.f8322d.setAdapter(this.f8332n);
    }

    /* JADX INFO: renamed from: j0 */
    private void m11933j0() {
        this.f8328j.creates(new e30() { // from class: l.hkl0
            public final void call(Object obj) {
                this.f13928a.m11941o0((Bundle) obj);
            }
        }, new d30() { // from class: l.rkl0
            public final void call() {
                all0.m11924c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public boolean m11935k0() {
        if (NullChecker.a(this.f8329k) && NullChecker.a(this.f8329k.s())) {
            if (this.f8329k.s().quantity == (CoreModule.f1534c.f3643j0.m2573z4() ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m11938m0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        m11966I0();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m11939n(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m11940n0() {
        if (m11935k0()) {
            this.f8323e.removeCallbacks(this.f8337s);
            this.f8323e.post(this.f8337s);
        }
        if (vwb.J(this.f8334p)) {
            return;
        }
        for (ViewParent viewParent : this.f8334p) {
            if (viewParent instanceof gxo) {
                ((gxo) viewParent).mo11043b(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m11941o0(Bundle bundle) {
        Bundle arguments = this.f8327i.getArguments();
        if (NullChecker.a(arguments)) {
            String string = arguments.getString("vip_selected_purchase_type");
            PurchaseType purchaseTypeValueOf = !TextUtils.isEmpty(string) ? PurchaseType.valueOf(string) : null;
            int i = arguments.getInt("vip_selected_page", -1);
            if (i >= 0) {
                this.f8321c._viewpager.setCurrentItem(i);
                m11919Y(this.f8321c._viewpager.getCurrentItem());
            } else {
                this.f8321c._viewpager.setCurrentItem(c690.m13201a(purchaseTypeValueOf, true, new bll0()));
                m11919Y(this.f8321c._viewpager.getCurrentItem());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m11943p0() {
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f8321c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        m11919Y(intlBounceBackViewPager.getCurrentItem());
        this.f8336r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m11945q0(View view) {
        if (m11970Q0()) {
            return;
        }
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m11946r0(View view) {
        nb90.m20000d();
        if (this.f8327i.act() != null) {
            this.f8327i.act().startActivity(new Intent((Context) this.f8327i.act(), (Class<?>) HelperManagerAct.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m11948s0(View view) {
        m11963D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m11949t0(boolean z, User user) {
        m11906O0(user, z);
        u9p.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m11951u0(boolean z, User user) {
        m11906O0(user, z);
        u9p.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m11953v0(boolean z, User user) {
        m11906O0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m11954w(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m11955w0(boolean z) {
        m11906O0(null, z);
        u9p.payFromSalvageAction = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m11957x0(boolean z, User user) {
        m11906O0(user, z);
        u9p.payFromSalvageAction = "superLiked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m11959y0(boolean z, User user) {
        m11906O0(user, z);
        u9p.payFromSalvageAction = "liked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m11961z0(boolean z, User user) {
        m11906O0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11962C0() {
        return this.f8327i.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public void m11963D0() {
        if (((CoreModule.f1534c.f3643j0.m2500A4() && this.f8330l == PurchaseType.TYPE_GET_LIKERS) || ((CoreModule.f1534c.f3643j0.m2502B4() && this.f8330l == PurchaseType.TYPE_GET_VIP) || (CoreModule.f1534c.f3643j0.m2571y4() && this.f8330l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE))) && m11935k0()) {
            m11893E0(CoreModule.f1534c.f3643j0.m2504C4().skuId);
        } else if (NullChecker.a(this.f8329k) && NullChecker.a(this.f8329k.s())) {
            m11893E0(this.f8329k.s().defaultStockKeepUnit.affiliateProducts.getProductId());
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m11964G0(int i) {
        if (gkl0.m15838t0().size() > i) {
            PurchaseType purchaseType = gkl0.m15838t0().get(i);
            d.a aVarM15844r0 = this.f8328j.m15844r0(purchaseType);
            cll0.m13527i(purchaseType);
            cll0.m13524f(purchaseType);
            m11965H0(purchaseType, aVarM15844r0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m11965H0(PurchaseType purchaseType, d.a aVar) {
        this.f8328j.m15843L0(purchaseType, aVar);
        if (gkl0.m15838t0().size() <= m11975d0() || gkl0.m15838t0().get(m11975d0()) != purchaseType) {
            return;
        }
        this.f8329k = aVar;
        this.f8330l = purchaseType;
        this.f8323e.removeCallbacks(this.f8337s);
        this.f8323e.post(this.f8337s);
    }

    /* JADX INFO: renamed from: I0 */
    public void m11966I0() {
        odp odpVar;
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f8321c;
        if (intlTopCardLayout == null || (odpVar = intlTopCardLayout.adapter) == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        odpVar.m20533s(intlBounceBackViewPager);
    }

    /* JADX INFO: renamed from: J0 */
    public void m11967J0() {
        ViewPager viewPager;
        PurchaseType purchaseTypeM13274b;
        PurchaseType purchaseTypeM11974c0 = this.f8331m;
        if (purchaseTypeM11974c0 == null) {
            purchaseTypeM11974c0 = m11974c0();
        }
        gkl0.m15822I0();
        gkl0.m15839u0();
        ArrayList<PurchaseType> arrayListM15838t0 = gkl0.m15838t0();
        int iIndexOf = (purchaseTypeM11974c0 == null || arrayListM15838t0 == null || !arrayListM15838t0.contains(purchaseTypeM11974c0)) ? -1 : arrayListM15838t0.indexOf(purchaseTypeM11974c0);
        if (iIndexOf < 0 && (purchaseTypeM13274b = c7r.m13274b()) != null && arrayListM15838t0 != null && arrayListM15838t0.contains(purchaseTypeM13274b)) {
            iIndexOf = arrayListM15838t0.indexOf(purchaseTypeM13274b);
        }
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        this.f8331m = null;
        this.f8336r = true;
        m11929g0(true);
        m11979l0(iIndexOf);
        IntlTopCardLayout intlTopCardLayout = this.f8321c;
        if (intlTopCardLayout == null || (viewPager = intlTopCardLayout._viewpager) == null) {
            this.f8336r = false;
        } else {
            viewPager.post(new Runnable() { // from class: l.okl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18268a.m11943p0();
                }
            });
        }
        m11973b0();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L0 */
    public void m11968L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f8335q = str;
        if (this.f8321c._viewpager.getCurrentItem() >= gkl0.m15838t0().size() || !m11935k0()) {
            return;
        }
        if ((sab0.w(this.f8330l) && CoreModule.f1534c.f3643j0.m2502B4()) || ((sab0.s(this.f8330l) && CoreModule.f1534c.f3643j0.m2500A4()) || (sab0.q(this.f8330l) && CoreModule.f1534c.f3643j0.m2571y4()))) {
            xdl0.M(this.f8326h, false);
            xdl0.M(this.f8325g, true);
            String strC = hvc0.c(CoreModule.f1534c.f3643j0.m2573z4() ? R$string.f2379bc : R$string.f1561A5);
            this.f8325g.setText(strC + "\n" + str);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m11969M0(PurchaseType purchaseType) {
        this.f8331m = purchaseType;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m11970Q0() {
        PurchaseType purchaseType = this.f8330l;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m11911R0(false, purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public View m11971W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0516f.m11983c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void m11978i1(gkl0 gkl0Var) {
        this.f8328j = gkl0Var;
    }

    /* JADX INFO: renamed from: b0 */
    public void m11973b0() {
        act().duringCreated(ugc0.m25207c()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.kkl0
            public final void call(Object obj) {
                this.f15867a.m11938m0((RecentContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.lkl0
            public final void call(Object obj) {
                all0.m11939n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public PurchaseType m11974c0() {
        int iM11975d0 = m11975d0();
        ArrayList<PurchaseType> arrayListM15838t0 = gkl0.m15838t0();
        if (iM11975d0 >= 0 && iM11975d0 < arrayListM15838t0.size()) {
            return arrayListM15838t0.get(iM11975d0);
        }
        PurchaseType purchaseType = this.f8330l;
        if (purchaseType != null) {
            return purchaseType;
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public int m11975d0() {
        return this.f8321c._viewpager.getCurrentItem();
    }

    public void destroy() {
        if (!vwb.J(this.f8334p)) {
            for (Object obj : this.f8334p) {
                if (obj instanceof IntlPrivilegeSVipContent) {
                    ((IntlPrivilegeSVipContent) obj).m11057v0();
                    break;
                }
            }
        }
        m11917U0();
    }

    /* JADX INFO: renamed from: e0 */
    public void m11976e0() {
        this.f8326h.postDelayed(new Runnable() { // from class: l.nkl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17735a.m11940n0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: h0 */
    public void m11977h0(Bundle bundle) {
        m11900K0();
        m11904N0();
        m11931i0();
        gkl0.m15839u0();
        m11928f0();
        m11933j0();
        this.f8328j.m15845x0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM11971W = m11971W(layoutInflater, viewGroup);
        this.f8333o = viewM11971W;
        return viewM11971W;
    }

    /* JADX INFO: renamed from: l0 */
    public void m11979l0(int i) {
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f8321c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null || intlBounceBackViewPager.getCurrentItem() == i) {
            return;
        }
        this.f8321c._viewpager.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: l.all0$b */
    public class ViewOnAttachStateChangeListenerC0512b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0512b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            all0.this.f8323e.removeCallbacks(all0.this.f8337s);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: l.all0$c */
    public class C0513c implements ViewPager.j {
        public C0513c() {
        }

        public void onPageSelected(int i) {
            if (all0.this.f8336r) {
                return;
            }
            all0.this.m11919Y(i);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
