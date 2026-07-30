package p153l;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.HelperManagerAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeSVipContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeSeeContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeUltraPremiumContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.IntlPrivilegeVipContent;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.IntlBounceBackViewPager;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.IntlTopCardLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view.bottom.IntlAlphaTransformerViewPager;
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
import p151v.VIcon;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class eul0 implements iam<ktl0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f95883a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f95884b;

    /* JADX INFO: renamed from: c */
    public IntlTopCardLayout f95885c;

    /* JADX INFO: renamed from: d */
    public IntlAlphaTransformerViewPager f95886d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f95887e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f95888f;

    /* JADX INFO: renamed from: g */
    public VText f95889g;

    /* JADX INFO: renamed from: h */
    public VText f95890h;

    /* JADX INFO: renamed from: i */
    public PutongFrag f95891i;

    /* JADX INFO: renamed from: j */
    public ktl0 f95892j;

    /* JADX INFO: renamed from: k */
    public C8928d.a f95893k;

    /* JADX INFO: renamed from: l */
    public PurchaseType f95894l;

    /* JADX INFO: renamed from: n */
    public c5n f95896n;

    /* JADX INFO: renamed from: o */
    public View f95897o;

    /* JADX INFO: renamed from: u */
    public kcg0 f95903u;

    /* JADX INFO: renamed from: m */
    public PurchaseType f95895m = null;

    /* JADX INFO: renamed from: p */
    public ArrayList<ViewGroup> f95898p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public String f95899q = "";

    /* JADX INFO: renamed from: r */
    public boolean f95900r = false;

    /* JADX INFO: renamed from: s */
    public final Runnable f95901s = new RunnableC16834a();

    /* JADX INFO: renamed from: t */
    public Interpolator f95902t = new LinearInterpolator();

    /* JADX INFO: renamed from: v */
    public y20<Integer> f95904v = new C16837d();

    /* JADX INFO: renamed from: l.eul0$a */
    public class RunnableC16834a implements Runnable {
        public RunnableC16834a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM54826q = C8929e.m54826q(eul0.this.f95893k);
            String strM54832w = C8929e.m54832w(eul0.this.f95893k);
            eul0.this.f95889g.setTextColor(Color.parseColor("#CC000000"));
            eul0.this.f95890h.setTextColor(Color.parseColor("#66000000"));
            eul0.this.m122610U0();
            bnl0.m105524M(eul0.this.f95888f, false);
            int i = C16838e.f95909a[eul0.this.f95894l.ordinal()];
            if (i == 1) {
                eul0.this.f95887e.setBackgroundResource(dbc0.f87509vb);
                bnl0.m105524M(eul0.this.f95889g, true);
                if (!CoreModule.f18264c.f20381e0.m116600p9().isVIP() && CoreModule.f18264c.f20396j0.m31577B4() && eul0.this.m122628k0()) {
                    eul0 eul0Var = eul0.this;
                    eul0Var.m122660L0(eul0Var.f95899q);
                    return;
                }
                eul0.this.m122601P0(strM54832w);
                if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20381e0.m116600p9().isVIPExpired()) {
                    eul0.this.f95889g.setText(strM54826q + ((Object) CoreModule.f18263b.getText(R$string.f19260ft)));
                    return;
                }
                eul0.this.f95889g.setText(strM54826q + ((Object) CoreModule.f18263b.getText(R$string.f19198dt)));
                return;
            }
            if (i == 2) {
                eul0.this.f95887e.setBackgroundResource(dbc0.f86853bb);
                bnl0.m105524M(eul0.this.f95889g, true);
                if (CoreModule.f18264c.f20396j0.m31575A4() && eul0.this.m122628k0()) {
                    eul0 eul0Var2 = eul0.this;
                    eul0Var2.m122660L0(eul0Var2.f95899q);
                    return;
                }
                eul0.this.m122601P0(strM54832w);
                int i2 = R$string.f19045Ys;
                int i3 = R$string.f18865Ss;
                long jM180735g = rbb0.m180735g();
                eul0 eul0Var3 = eul0.this;
                if (jM180735g != 0) {
                    eul0Var3.f95889g.setText(strM54826q + CoreModule.f18263b.getString(i2));
                    return;
                }
                eul0Var3.f95889g.setText(strM54826q + CoreModule.f18263b.getString(i3));
                return;
            }
            if (i == 3) {
                bnl0.m105524M(eul0.this.f95889g, true);
                eul0.this.f95887e.setBackgroundResource(dbc0.f86339La);
                if (CoreModule.f18264c.f20396j0.m31646y4() && eul0.this.m122628k0()) {
                    eul0 eul0Var4 = eul0.this;
                    eul0Var4.m122660L0(eul0Var4.f95899q);
                    return;
                }
                eul0.this.m122601P0(strM54832w);
                if (eul0.this.f95893k != null && (TEnum.equals(eul0.this.f95893k.m54762f(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(eul0.this.f95893k.m54762f(), ProductCategory.tttSeeUpgradeToPremium))) {
                    bnl0.m105524M(eul0.this.f95888f, true);
                    eul0.this.m122606S0();
                    eul0.this.f95889g.setText(String.format(eul0.this.getAct().getString(com.p051p1.mobile.putong.core.pay.R$string.f28327i6), eul0.this.f95893k.m54764g()));
                    return;
                } else {
                    eul0.this.f95889g.setText(strM54826q + ((Object) CoreModule.f18263b.getText(R$string.f19120bc)));
                    return;
                }
            }
            if (i != 4) {
                return;
            }
            bnl0.m105524M(eul0.this.f95889g, true);
            eul0.this.m122601P0(strM54832w);
            eul0.this.f95887e.setBackgroundResource(dbc0.f87147kb);
            eul0.this.f95889g.setTextColor(Color.parseColor("#F9E7FF"));
            eul0.this.f95889g.setTypeface(Typeface.defaultFromStyle(1));
            eul0.this.f95890h.setTextColor(Color.parseColor("#80F9E7FF"));
            if (eul0.this.f95893k != null && (TEnum.equals(eul0.this.f95893k.m54762f(), ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(eul0.this.f95893k.m54762f(), ProductCategory.Promo_premiumUpgradeToUltra))) {
                bnl0.m105524M(eul0.this.f95888f, true);
                eul0.this.m122606S0();
                eul0.this.f95889g.setText(String.format(eul0.this.getAct().getString(com.p051p1.mobile.putong.core.pay.R$string.f28327i6), eul0.this.f95893k.m54764g()));
                return;
            }
            boolean zM146398l4 = joa.m146398l4();
            eul0 eul0Var5 = eul0.this;
            if (zM146398l4) {
                eul0Var5.f95889g.setText(strM54826q + ((Object) CoreModule.f18263b.getText(R$string.f18581Jg)));
                return;
            }
            eul0Var5.f95889g.setText(strM54826q + ((Object) CoreModule.f18263b.getText(R$string.f18550Ig)));
        }
    }

    /* JADX INFO: renamed from: l.eul0$d */
    public class C16837d implements y20<Integer> {
        public C16837d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            if (num.intValue() == 5) {
                eul0 eul0Var = eul0.this;
                eul0Var.m122604R0(true, eul0Var.f95894l == PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        }
    }

    /* JADX INFO: renamed from: l.eul0$e */
    public static /* synthetic */ class C16838e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95909a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f95909a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95909a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95909a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95909a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.eul0$f */
    public static class C16839f {
        /* JADX INFO: renamed from: b */
        public static void m122673b(eul0 eul0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            eul0Var.f95883a = (VNavigationBar) viewGroup.getChildAt(0);
            eul0Var.f95884b = (ConstraintLayout) viewGroup.getChildAt(1);
            eul0Var.f95885c = (IntlTopCardLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            eul0Var.f95886d = (IntlAlphaTransformerViewPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            eul0Var.f95887e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            eul0Var.f95888f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
            eul0Var.f95889g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            eul0Var.f95890h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m122674c(eul0 eul0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f126176zf, viewGroup, false);
            m122673b(eul0Var, viewInflate);
            return viewInflate;
        }
    }

    public eul0(PutongFrag putongFrag) {
        this.f95891i = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m122583B0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f95888f;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m122586E0(String str) {
        PutongFrag putongFrag = this.f95891i;
        gul0.m132336a(this.f95894l, !"MINE_SUB_ITEM".equals(putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : null));
        if (NullChecker.m82486a(this.f95893k) && NullChecker.m82486a(this.f95893k.m54784s())) {
            rk60.m181780b(this.f95891i.act(), this.f95894l, this.f95893k.m54730C(), str, ijj.m140191c().m140192a(this.f95894l), new fhj.C16976a(this.f95891i.act(), this.f95894l, this.f95893k, str), this.f95904v);
        }
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: K0 */
    private void m122593K0() {
        this.f95883a.setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f95883a.getRightIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f95883a.getLeftIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f95883a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.mtl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138638a.m122638q0(view);
            }
        });
        VIcon vIcon = new VIcon(this.f95891i.act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(dbc0.f86318Kl);
        vIcon.setColorFilter(Color.parseColor("#1F1F1F"));
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.ntl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143611a.m122639r0(view);
            }
        });
        this.f95883a.setRightIconViews(vIcon);
    }

    /* JADX INFO: renamed from: N0 */
    private void m122597N0() {
        this.f95887e.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC16835b());
        this.f95885c.m58863e(this.f95891i, new C16836c());
        bnl0.m105509E0(this.f95887e, new View.OnClickListener() { // from class: l.dul0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90814a.m122641s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    private void m122599O0(User user, boolean z) {
        m122655D0();
        ubp ubpVar = ubp.INSTANCE;
        ubpVar.m195273A(user);
        ubpVar.m195290y(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public void m122601P0(String str) {
        bnl0.m105524M(this.f95890h, !TextUtils.isEmpty(str));
        this.f95890h.setText(CoreModule.f18263b.getString(R$string.f18577Jc, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public boolean m122604R0(boolean z, final boolean z2) {
        if (NullChecker.m82486a(this.f95893k)) {
            ubp.INSTANCE.m195291z(this.f95893k);
        }
        PutongFrag putongFrag = this.f95891i;
        String from = putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : "";
        return z2 ? ubp.INSTANCE.m195276D(getAct(), new y20() { // from class: l.wtl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190793a.m122642t0(z2, (User) obj);
            }
        }, new y20() { // from class: l.xtl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196233a.m122644u0(z2, (User) obj);
            }
        }, new y20() { // from class: l.ytl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201520a.m122646v0(z2, (User) obj);
            }
        }, z, from, null, getAct()) : ubp.INSTANCE.m195275C(getAct(), new Runnable() { // from class: l.ztl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f206022a.m122648w0(z2);
            }
        }, new y20() { // from class: l.aul0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73528a.m122650x0(z2, (User) obj);
            }
        }, new y20() { // from class: l.bul0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78527a.m122652y0(z2, (User) obj);
            }
        }, new y20() { // from class: l.cul0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83853a.m122654z0(z2, (User) obj);
            }
        }, z, from, null, getAct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m122606S0() {
        Animator animatorM132168n = gt0.m132168n(this.f95887e, gt0.f106354i, 1.0f, 1.0f);
        Animator animatorM132168n2 = gt0.m132168n(this.f95887e, gt0.f106354i, 1.0f, 0.96f);
        Animator animatorM132168n3 = gt0.m132168n(this.f95887e, gt0.f106354i, 0.96f, 1.03f);
        Animator animatorM132168n4 = gt0.m132168n(this.f95887e, gt0.f106354i, 1.03f, 1.0f);
        animatorM132168n.setDuration(500L);
        animatorM132168n2.setDuration(333L);
        animatorM132168n3.setDuration(333L);
        animatorM132168n4.setDuration(333L);
        animatorM132168n.setInterpolator(this.f95902t);
        animatorM132168n2.setInterpolator(this.f95902t);
        animatorM132168n3.setInterpolator(this.f95902t);
        animatorM132168n4.setInterpolator(this.f95902t);
        gt0.m132160f(gt0.m132175u(false, null, -1L, animatorM132168n, animatorM132168n2, animatorM132168n3, animatorM132168n4), new Runnable() { // from class: l.qtl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159465a.m122581A0();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void m122581A0() {
        psd0.m173633z(this.f95903u);
        this.f95903u = this.f95891i.duringCreated(C22421c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.ttl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176081a.m122583B0((Long) obj);
            }
        }, new y20() { // from class: l.utl0
            @Override // p153l.y20
            public final void call(Object obj) {
                eul0.m122647w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m122610U0() {
        psd0.m173633z(this.f95903u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m122612Y(int i) {
        PurchaseType purchaseType = ktl0.m151381t0().get(i);
        if (wib0.m206579w(purchaseType)) {
            if (this.f95883a.getLeftIconContainer().getChildCount() > 0 && (this.f95883a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f95883a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#80000000"));
            }
            if (this.f95883a.getTitleContainer().getChildCount() > 0 && (this.f95883a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f95883a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#b8000000"));
            }
            this.f95883a.getLeftIconContainer().getChildAt(0);
            this.f95885c._indicator.setPageColor(Color.parseColor("#26ffcf48"));
            this.f95885c._indicator.setFillColor(Color.parseColor("#ffcf48"));
            this.f95897o.setBackground(this.f95891i.act().getDrawable(dbc0.f87477ub));
            m122613Z(PurchaseType.TYPE_GET_VIP);
        } else if (wib0.m206575s(purchaseType)) {
            if (this.f95883a.getLeftIconContainer().getChildCount() > 0 && (this.f95883a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f95883a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#80000000"));
            }
            if (this.f95883a.getTitleContainer().getChildCount() > 0 && (this.f95883a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f95883a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#b8000000"));
            }
            this.f95885c._indicator.setPageColor(Color.parseColor("#26ffcf48"));
            this.f95885c._indicator.setFillColor(Color.parseColor("#ff932b"));
            this.f95897o.setBackground(this.f95891i.act().getDrawable(dbc0.f86820ab));
            m122613Z(PurchaseType.TYPE_GET_LIKERS);
        } else if (wib0.m206573q(purchaseType)) {
            if (this.f95883a.getLeftIconContainer().getChildCount() > 0 && (this.f95883a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f95883a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#cce8ca8a"));
            }
            if (this.f95883a.getTitleContainer().getChildCount() > 0 && (this.f95883a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f95883a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#cce8ca8a"));
            }
            this.f95885c._indicator.setPageColor(Color.parseColor("#26ffdea2"));
            this.f95885c._indicator.setFillColor(Color.parseColor("#ffdea2"));
            m122613Z(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            this.f95897o.setBackground(this.f95891i.act().getDrawable(dbc0.f86307Ka));
        } else if (wib0.m206578v(purchaseType)) {
            if (this.f95883a.getLeftIconContainer().getChildCount() > 0 && (this.f95883a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f95883a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#3D2747"));
            }
            if (this.f95883a.getTitleContainer().getChildCount() > 0 && (this.f95883a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f95883a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#3D2747"));
            }
            this.f95885c._indicator.setPageColor(Color.parseColor("#33705E44"));
            this.f95885c._indicator.setFillColor(Color.parseColor("#705E44"));
            m122613Z(PurchaseType.TYPE_ULTRA_PREMIUM);
            uqb0.f180374G.m127098D(this.f95897o, "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1QUNBVEJDNE5PTVY3TjdRUUtIVFRRM0Y3TFNBNzE0IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE5OTAyMzI1NTU1Mn0.png");
        }
        m122656G0(i);
        this.f95886d.setCurrentItem(i);
        if (this.f95898p.get(i) instanceof gzo) {
            ((gzo) this.f95898p.get(i)).mo58736i();
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m122613Z(PurchaseType purchaseType) {
        int i = C16838e.f95909a[purchaseType.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.f95891i.act().setStatusBarColor(this.f95891i.act().getResources().getColor(c9c0.f80383V1));
                int systemUiVisibility = this.f95891i.act().getWindow().getDecorView().getSystemUiVisibility();
                int i2 = systemUiVisibility & (-8193);
                if (Build.VERSION.SDK_INT >= 26) {
                    i2 = systemUiVisibility & (-8209);
                }
                this.f95891i.act().getWindow().getDecorView().setSystemUiVisibility(i2);
                return;
            }
            if (i != 4) {
                return;
            }
        }
        this.f95891i.act().setStatusBarColor(this.f95891i.act().getResources().getColor(c9c0.f80383V1));
        PutongAct.setLightStatusBar(this.f95891i.act().getWindow(), 16);
    }

    /* JADX INFO: renamed from: a0 */
    private ViewGroup m122615a0(PurchaseType purchaseType) {
        int i = C16838e.f95909a[purchaseType.ordinal()];
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

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m122617c() {
    }

    /* JADX INFO: renamed from: f0 */
    private void m122621f0() {
        m122622g0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private void m122622g0(boolean z) {
        ViewGroup next;
        ArrayList<PurchaseType> arrayListM151381t0 = ktl0.m151381t0();
        if (jyb.m147479J(arrayListM151381t0)) {
            return;
        }
        this.f95885c.m58862d(arrayListM151381t0);
        if (z && !jyb.m147479J(this.f95898p)) {
            ArrayList<ViewGroup> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (PurchaseType purchaseType : arrayListM151381t0) {
                Iterator<ViewGroup> it = this.f95898p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!arrayList2.contains(next) && (next instanceof gzo) && purchaseType.equals(((gzo) next).getPurchaseType())) {
                        arrayList2.add(next);
                        break;
                    }
                }
                if (next != null) {
                    arrayList.add(next);
                } else {
                    ViewGroup viewGroupM122615a0 = m122615a0(purchaseType);
                    if (NullChecker.m82486a(viewGroupM122615a0)) {
                        arrayList.add(viewGroupM122615a0);
                    }
                }
            }
            if (arrayList.size() == arrayListM151381t0.size()) {
                this.f95898p = arrayList;
                if (NullChecker.m82486a(this.f95896n)) {
                    this.f95896n.m108067s(this.f95898p);
                    this.f95886d.setCurrentItem(0);
                    return;
                }
                return;
            }
        }
        this.f95898p = new ArrayList<>();
        Iterator<PurchaseType> it2 = arrayListM151381t0.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroupM122615a1 = m122615a0(it2.next());
            if (NullChecker.m82486a(viewGroupM122615a1)) {
                this.f95898p.add(viewGroupM122615a1);
            }
        }
        if (!jyb.m147479J(this.f95898p) && NullChecker.m82486a(this.f95896n)) {
            this.f95896n.m108067s(this.f95898p);
            this.f95886d.setCurrentItem(0);
        }
        qnp0.m177261d1(this.f95888f, qa00.f156322i);
        this.f95888f.setAlpha(153);
        SVGALoader.with(this.f95891i.act()).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f95888f);
    }

    /* JADX INFO: renamed from: i0 */
    private void m122624i0() {
        this.f95896n = new c5n((VipNewUiFrag) this.f95891i);
        this.f95886d.mo4182X(true, new z4n());
        this.f95886d.setOffscreenPageLimit(3);
        this.f95886d.setAdapter(this.f95896n);
    }

    /* JADX INFO: renamed from: j0 */
    private void m122626j0() {
        this.f95892j.creates(new y20() { // from class: l.ltl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133553a.m122634o0((Bundle) obj);
            }
        }, new x20() { // from class: l.vtl0
            @Override // p153l.x20
            public final void call() {
                eul0.m122617c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public boolean m122628k0() {
        if (NullChecker.m82486a(this.f95893k) && NullChecker.m82486a(this.f95893k.m54784s())) {
            if (this.f95893k.m54784s().quantity == (CoreModule.f18264c.f20396j0.m31648z4() ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m122631m0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        m122658I0();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m122632n(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m122633n0() {
        if (m122628k0()) {
            this.f95887e.removeCallbacks(this.f95901s);
            this.f95887e.post(this.f95901s);
        }
        if (jyb.m147479J(this.f95898p)) {
            return;
        }
        for (ViewParent viewParent : this.f95898p) {
            if (viewParent instanceof gzo) {
                ((gzo) viewParent).mo58734b(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m122634o0(Bundle bundle) {
        Bundle arguments = this.f95891i.getArguments();
        if (NullChecker.m82486a(arguments)) {
            String string = arguments.getString("vip_selected_purchase_type");
            PurchaseType purchaseTypeValueOf = !TextUtils.isEmpty(string) ? PurchaseType.valueOf(string) : null;
            int i = arguments.getInt("vip_selected_page", -1);
            if (i >= 0) {
                this.f95885c._viewpager.setCurrentItem(i);
                m122612Y(this.f95885c._viewpager.getCurrentItem());
            } else {
                this.f95885c._viewpager.setCurrentItem(ge90.m129967a(purchaseTypeValueOf, true, new ful0()));
                m122612Y(this.f95885c._viewpager.getCurrentItem());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m122636p0() {
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f95885c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        m122612Y(intlBounceBackViewPager.getCurrentItem());
        this.f95900r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m122638q0(View view) {
        if (m122662Q0()) {
            return;
        }
        getAct().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m122639r0(View view) {
        rj90.m181694d();
        if (this.f95891i.act() != null) {
            this.f95891i.act().startActivity(new Intent(this.f95891i.act(), (Class<?>) HelperManagerAct.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m122641s0(View view) {
        m122655D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m122642t0(boolean z, User user) {
        m122599O0(user, z);
        ubp.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m122644u0(boolean z, User user) {
        m122599O0(user, z);
        ubp.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m122646v0(boolean z, User user) {
        m122599O0(user, z);
        ubp.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m122647w(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m122648w0(boolean z) {
        m122599O0(null, z);
        ubp.payFromSalvageAction = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m122650x0(boolean z, User user) {
        m122599O0(user, z);
        ubp.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m122652y0(boolean z, User user) {
        m122599O0(user, z);
        ubp.payFromSalvageAction = "liked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m122654z0(boolean z, User user) {
        m122599O0(user, z);
        ubp.payFromSalvageAction = "seeProfile";
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f95891i.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public void m122655D0() {
        if (((CoreModule.f18264c.f20396j0.m31575A4() && this.f95894l == PurchaseType.TYPE_GET_LIKERS) || ((CoreModule.f18264c.f20396j0.m31577B4() && this.f95894l == PurchaseType.TYPE_GET_VIP) || (CoreModule.f18264c.f20396j0.m31646y4() && this.f95894l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE))) && m122628k0()) {
            m122586E0(CoreModule.f18264c.f20396j0.m31579C4().skuId);
        } else if (NullChecker.m82486a(this.f95893k) && NullChecker.m82486a(this.f95893k.m54784s())) {
            m122586E0(this.f95893k.m54784s().defaultStockKeepUnit.affiliateProducts.getProductId());
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m122656G0(int i) {
        if (ktl0.m151381t0().size() > i) {
            PurchaseType purchaseType = ktl0.m151381t0().get(i);
            C8928d.a aVarM151387r0 = this.f95892j.m151387r0(purchaseType);
            gul0.m132344i(purchaseType);
            gul0.m132341f(purchaseType);
            m122657H0(purchaseType, aVarM151387r0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m122657H0(PurchaseType purchaseType, C8928d.a aVar) {
        this.f95892j.m151386L0(purchaseType, aVar);
        if (ktl0.m151381t0().size() <= m122667d0() || ktl0.m151381t0().get(m122667d0()) != purchaseType) {
            return;
        }
        this.f95893k = aVar;
        this.f95894l = purchaseType;
        this.f95887e.removeCallbacks(this.f95901s);
        this.f95887e.post(this.f95901s);
    }

    /* JADX INFO: renamed from: I0 */
    public void m122658I0() {
        ofp ofpVar;
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f95885c;
        if (intlTopCardLayout == null || (ofpVar = intlTopCardLayout.adapter) == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        ofpVar.m167470s(intlBounceBackViewPager);
    }

    /* JADX INFO: renamed from: J0 */
    public void m122659J0() {
        IntlBounceBackViewPager intlBounceBackViewPager;
        PurchaseType purchaseTypeM115091b;
        PurchaseType purchaseTypeM122666c0 = this.f95895m;
        if (purchaseTypeM122666c0 == null) {
            purchaseTypeM122666c0 = m122666c0();
        }
        ktl0.m151365I0();
        ktl0.m151382u0();
        ArrayList<PurchaseType> arrayListM151381t0 = ktl0.m151381t0();
        int iIndexOf = (purchaseTypeM122666c0 == null || arrayListM151381t0 == null || !arrayListM151381t0.contains(purchaseTypeM122666c0)) ? -1 : arrayListM151381t0.indexOf(purchaseTypeM122666c0);
        if (iIndexOf < 0 && (purchaseTypeM115091b = d9r.m115091b()) != null && arrayListM151381t0 != null && arrayListM151381t0.contains(purchaseTypeM115091b)) {
            iIndexOf = arrayListM151381t0.indexOf(purchaseTypeM115091b);
        }
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        this.f95895m = null;
        this.f95900r = true;
        m122622g0(true);
        m122670l0(iIndexOf);
        IntlTopCardLayout intlTopCardLayout = this.f95885c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            this.f95900r = false;
        } else {
            intlBounceBackViewPager.post(new Runnable() { // from class: l.stl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170588a.m122636p0();
                }
            });
        }
        m122665b0();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L0 */
    public void m122660L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f95899q = str;
        if (this.f95885c._viewpager.getCurrentItem() >= ktl0.m151381t0().size() || !m122628k0()) {
            return;
        }
        if ((wib0.m206579w(this.f95894l) && CoreModule.f18264c.f20396j0.m31577B4()) || ((wib0.m206575s(this.f95894l) && CoreModule.f18264c.f20396j0.m31575A4()) || (wib0.m206573q(this.f95894l) && CoreModule.f18264c.f20396j0.m31646y4()))) {
            bnl0.m105524M(this.f95890h, false);
            bnl0.m105524M(this.f95889g, true);
            String strM148007c = k3d0.m148007c(CoreModule.f18264c.f20396j0.m31648z4() ? R$string.f19582qc : R$string.f18353C5);
            this.f95889g.setText(strM148007c + SignParameters.NEW_LINE + str);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m122661M0(PurchaseType purchaseType) {
        this.f95895m = purchaseType;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m122662Q0() {
        PurchaseType purchaseType = this.f95894l;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m122604R0(false, purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public View m122663W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C16839f.m122674c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ktl0 ktl0Var) {
        this.f95892j = ktl0Var;
    }

    /* JADX INFO: renamed from: b0 */
    public void m122665b0() {
        getAct().duringCreated(bpc0.m105791c()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.otl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148974a.m122631m0((RecentContractInfosEnvelope) obj);
            }
        }, new y20() { // from class: l.ptl0
            @Override // p153l.y20
            public final void call(Object obj) {
                eul0.m122632n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public PurchaseType m122666c0() {
        int iM122667d0 = m122667d0();
        ArrayList<PurchaseType> arrayListM151381t0 = ktl0.m151381t0();
        if (iM122667d0 >= 0 && iM122667d0 < arrayListM151381t0.size()) {
            return arrayListM151381t0.get(iM122667d0);
        }
        PurchaseType purchaseType = this.f95894l;
        if (purchaseType != null) {
            return purchaseType;
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public int m122667d0() {
        return this.f95885c._viewpager.getCurrentItem();
    }

    @Override // p153l.iam
    public void destroy() {
        if (!jyb.m147479J(this.f95898p)) {
            for (ViewGroup viewGroup : this.f95898p) {
                if (viewGroup instanceof IntlPrivilegeSVipContent) {
                    ((IntlPrivilegeSVipContent) viewGroup).m58748v0();
                    break;
                }
            }
        }
        m122610U0();
    }

    /* JADX INFO: renamed from: e0 */
    public void m122668e0() {
        this.f95890h.postDelayed(new Runnable() { // from class: l.rtl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f164824a.m122633n0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: h0 */
    public void m122669h0(Bundle bundle) {
        m122593K0();
        m122597N0();
        m122624i0();
        ktl0.m151382u0();
        m122621f0();
        m122626j0();
        this.f95892j.m151388x0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM122663W = m122663W(layoutInflater, viewGroup);
        this.f95897o = viewM122663W;
        return viewM122663W;
    }

    /* JADX INFO: renamed from: l0 */
    public void m122670l0(int i) {
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f95885c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null || intlBounceBackViewPager.getCurrentItem() == i) {
            return;
        }
        this.f95885c._viewpager.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: l.eul0$b */
    public class ViewOnAttachStateChangeListenerC16835b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC16835b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            eul0.this.f95887e.removeCallbacks(eul0.this.f95901s);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: l.eul0$c */
    public class C16836c implements ViewPager.InterfaceC0718j {
        public C16836c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (eul0.this.f95900r) {
                return;
            }
            eul0.this.m122612Y(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
