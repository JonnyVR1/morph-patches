package p149l;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.HelperManagerAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeSVipContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeSeeContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeUltraPremiumContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.IntlPrivilegeVipContent;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.view.IntlBounceBackViewPager;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.view.IntlTopCardLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.view.bottom.IntlAlphaTransformerViewPager;
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
import p147v.VIcon;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class all0 implements s7m<gkl0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f70448a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f70449b;

    /* JADX INFO: renamed from: c */
    public IntlTopCardLayout f70450c;

    /* JADX INFO: renamed from: d */
    public IntlAlphaTransformerViewPager f70451d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f70452e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f70453f;

    /* JADX INFO: renamed from: g */
    public VText f70454g;

    /* JADX INFO: renamed from: h */
    public VText f70455h;

    /* JADX INFO: renamed from: i */
    public PutongFrag f70456i;

    /* JADX INFO: renamed from: j */
    public gkl0 f70457j;

    /* JADX INFO: renamed from: k */
    public C8765d.a f70458k;

    /* JADX INFO: renamed from: l */
    public PurchaseType f70459l;

    /* JADX INFO: renamed from: n */
    public c3n f70461n;

    /* JADX INFO: renamed from: o */
    public View f70462o;

    /* JADX INFO: renamed from: u */
    public c4g0 f70468u;

    /* JADX INFO: renamed from: m */
    public PurchaseType f70460m = null;

    /* JADX INFO: renamed from: p */
    public ArrayList<ViewGroup> f70463p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public String f70464q = "";

    /* JADX INFO: renamed from: r */
    public boolean f70465r = false;

    /* JADX INFO: renamed from: s */
    public final Runnable f70466s = new RunnableC15652a();

    /* JADX INFO: renamed from: t */
    public Interpolator f70467t = new LinearInterpolator();

    /* JADX INFO: renamed from: v */
    public e30<Integer> f70469v = new C15655d();

    /* JADX INFO: renamed from: l.all0$a */
    public class RunnableC15652a implements Runnable {
        public RunnableC15652a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM53643q = C8766e.m53643q(all0.this.f70458k);
            String strM53649w = C8766e.m53649w(all0.this.f70458k);
            all0.this.f70454g.setTextColor(Color.parseColor("#CC000000"));
            all0.this.f70455h.setTextColor(Color.parseColor("#66000000"));
            all0.this.m97346U0();
            xdl0.m208344M(all0.this.f70453f, false);
            int i = C15656e.f70474a[all0.this.f70459l.ordinal()];
            if (i == 1) {
                all0.this.f70452e.setBackgroundResource(x2c0.f190614ub);
                xdl0.m208344M(all0.this.f70454g, true);
                if (!CoreModule.f17545c.f19639e0.m169527p9().isVIP() && CoreModule.f17545c.f19654j0.m30574B4() && all0.this.m97364k0()) {
                    all0 all0Var = all0.this;
                    all0Var.m97396L0(all0Var.f70464q);
                    return;
                }
                all0.this.m97337P0(strM53649w);
                if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19639e0.m169527p9().isVIPExpired()) {
                    all0.this.f70454g.setText(strM53643q + ((Object) CoreModule.f17544b.getText(R$string.f17865Js)));
                    return;
                }
                all0.this.f70454g.setText(strM53643q + ((Object) CoreModule.f17544b.getText(R$string.f17805Hs)));
                return;
            }
            if (i == 2) {
                all0.this.f70452e.setBackgroundResource(x2c0.f189977ab);
                xdl0.m208344M(all0.this.f70454g, true);
                if (CoreModule.f17545c.f19654j0.m30572A4() && all0.this.m97364k0()) {
                    all0 all0Var2 = all0.this;
                    all0Var2.m97396L0(all0Var2.f70464q);
                    return;
                }
                all0.this.m97337P0(strM53649w);
                int i2 = R$string.f17655Cs;
                int i3 = R$string.f19047ws;
                long jM157733g = n3b0.m157733g();
                all0 all0Var3 = all0.this;
                if (jM157733g != 0) {
                    all0Var3.f70454g.setText(strM53643q + CoreModule.f17544b.getString(i2));
                    return;
                }
                all0Var3.f70454g.setText(strM53643q + CoreModule.f17544b.getString(i3));
                return;
            }
            if (i == 3) {
                xdl0.m208344M(all0.this.f70454g, true);
                all0.this.f70452e.setBackgroundResource(x2c0.f189480Ka);
                if (CoreModule.f17545c.f19654j0.m30643y4() && all0.this.m97364k0()) {
                    all0 all0Var4 = all0.this;
                    all0Var4.m97396L0(all0Var4.f70464q);
                    return;
                }
                all0.this.m97337P0(strM53649w);
                if (all0.this.f70458k != null && (TEnum.equals(all0.this.f70458k.m53579f(), ProductCategory.tttVipUpgradeToPremium) || TEnum.equals(all0.this.f70458k.m53579f(), ProductCategory.tttSeeUpgradeToPremium))) {
                    xdl0.m208344M(all0.this.f70453f, true);
                    all0.this.m97342S0();
                    all0.this.f70454g.setText(String.format(all0.this.getAct().getString(com.p046p1.mobile.putong.core.pay.R$string.f27479i6), all0.this.f70458k.m53581g()));
                    return;
                } else {
                    all0.this.f70454g.setText(strM53643q + ((Object) CoreModule.f17544b.getText(R$string.f17938Mb)));
                    return;
                }
            }
            if (i != 4) {
                return;
            }
            xdl0.m208344M(all0.this.f70454g, true);
            all0.this.m97337P0(strM53649w);
            all0.this.f70452e.setBackgroundResource(x2c0.f190262jb);
            all0.this.f70454g.setTextColor(Color.parseColor("#F9E7FF"));
            all0.this.f70454g.setTypeface(Typeface.defaultFromStyle(1));
            all0.this.f70455h.setTextColor(Color.parseColor("#80F9E7FF"));
            if (all0.this.f70458k != null && (TEnum.equals(all0.this.f70458k.m53579f(), ProductCategory.tttPremiumUpgradeToUltra) || TEnum.equals(all0.this.f70458k.m53579f(), ProductCategory.Promo_premiumUpgradeToUltra))) {
                xdl0.m208344M(all0.this.f70453f, true);
                all0.this.m97342S0();
                all0.this.f70454g.setText(String.format(all0.this.getAct().getString(com.p046p1.mobile.putong.core.pay.R$string.f27479i6), all0.this.f70458k.m53581g()));
                return;
            }
            boolean zM210083k4 = xma.m210083k4();
            all0 all0Var5 = all0.this;
            if (zM210083k4) {
                all0Var5.f70454g.setText(strM53643q + ((Object) CoreModule.f17544b.getText(R$string.f18855qg)));
                return;
            }
            all0Var5.f70454g.setText(strM53643q + ((Object) CoreModule.f17544b.getText(R$string.f18825pg)));
        }
    }

    /* JADX INFO: renamed from: l.all0$d */
    public class C15655d implements e30<Integer> {
        public C15655d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Integer num) {
            if (num.intValue() == 5) {
                all0 all0Var = all0.this;
                all0Var.m97340R0(true, all0Var.f70459l == PurchaseType.TYPE_ULTRA_PREMIUM);
            }
        }
    }

    /* JADX INFO: renamed from: l.all0$e */
    public static /* synthetic */ class C15656e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70474a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f70474a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70474a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70474a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70474a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: l.all0$f */
    public static class C15657f {
        /* JADX INFO: renamed from: b */
        public static void m97409b(all0 all0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            all0Var.f70448a = (VNavigationBar) viewGroup.getChildAt(0);
            all0Var.f70449b = (ConstraintLayout) viewGroup.getChildAt(1);
            all0Var.f70450c = (IntlTopCardLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            all0Var.f70451d = (IntlAlphaTransformerViewPager) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
            all0Var.f70452e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            all0Var.f70453f = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
            all0Var.f70454g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
            all0Var.f70455h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m97410c(all0 all0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f96003sf, viewGroup, false);
            m97409b(all0Var, viewInflate);
            return viewInflate;
        }
    }

    public all0(PutongFrag putongFrag) {
        this.f70456i = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m97319B0(Long l2) {
        SVGAnimationView sVGAnimationView = this.f70453f;
        if (sVGAnimationView != null) {
            sVGAnimationView.startAnimation();
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m97322E0(String str) {
        PutongFrag putongFrag = this.f70456i;
        cll0.m107554a(this.f70459l, !"MINE_SUB_ITEM".equals(putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : null));
        if (NullChecker.m81303a(this.f70458k) && NullChecker.m81303a(this.f70458k.m53601s())) {
            mc60.m153988b(this.f70456i.act(), this.f70459l, this.f70458k.m53547C(), str, ogj.m164200c().m164201a(this.f70459l), new lej.C18204a(this.f70456i.act(), this.f70459l, this.f70458k, str), this.f70469v);
        }
    }

    @SuppressLint({"ResourceAsColor"})
    /* JADX INFO: renamed from: K0 */
    private void m97329K0() {
        this.f70448a.setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f70448a.getRightIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f70448a.getLeftIconContainer().setBackgroundColor(Color.parseColor("#00ffffff"));
        this.f70448a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ikl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113689a.m97374q0(view);
            }
        });
        VIcon vIcon = new VIcon(this.f70456i.act());
        vIcon.setIconStyle(4);
        vIcon.setImageResource(x2c0.f189862Wk);
        vIcon.setColorFilter(Color.parseColor("#1F1F1F"));
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.jkl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118396a.m97375r0(view);
            }
        });
        this.f70448a.setRightIconViews(vIcon);
    }

    /* JADX INFO: renamed from: N0 */
    private void m97333N0() {
        this.f70452e.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC15653b());
        this.f70450c.m57680e(this.f70456i, new C15654c());
        xdl0.m208329E0(this.f70452e, new View.OnClickListener() { // from class: l.zkl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203553a.m97377s0(view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    private void m97335O0(User user, boolean z) {
        m97391D0();
        u9p u9pVar = u9p.INSTANCE;
        u9pVar.m192605A(user);
        u9pVar.m192622y(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public void m97337P0(String str) {
        xdl0.m208344M(this.f70455h, !TextUtils.isEmpty(str));
        this.f70455h.setText(CoreModule.f17544b.getString(R$string.f18971uc, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public boolean m97340R0(boolean z, final boolean z2) {
        if (NullChecker.m81303a(this.f70458k)) {
            u9p.INSTANCE.m192623z(this.f70458k);
        }
        PutongFrag putongFrag = this.f70456i;
        String from = putongFrag instanceof VipNewUiFrag ? ((VipNewUiFrag) putongFrag).getFrom() : "";
        return z2 ? u9p.INSTANCE.m192608D(getAct(), new e30() { // from class: l.skl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164997a.m97378t0(z2, (User) obj);
            }
        }, new e30() { // from class: l.tkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170898a.m97380u0(z2, (User) obj);
            }
        }, new e30() { // from class: l.ukl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176943a.m97382v0(z2, (User) obj);
            }
        }, z, from, null, getAct()) : u9p.INSTANCE.m192607C(getAct(), new Runnable() { // from class: l.vkl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181826a.m97384w0(z2);
            }
        }, new e30() { // from class: l.wkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186783a.m97386x0(z2, (User) obj);
            }
        }, new e30() { // from class: l.xkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193322a.m97388y0(z2, (User) obj);
            }
        }, new e30() { // from class: l.ykl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198774a.m97390z0(z2, (User) obj);
            }
        }, z, from, null, getAct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public void m97342S0() {
        Animator animatorM103741n = bt0.m103741n(this.f70452e, bt0.f77162i, 1.0f, 1.0f);
        Animator animatorM103741n2 = bt0.m103741n(this.f70452e, bt0.f77162i, 1.0f, 0.96f);
        Animator animatorM103741n3 = bt0.m103741n(this.f70452e, bt0.f77162i, 0.96f, 1.03f);
        Animator animatorM103741n4 = bt0.m103741n(this.f70452e, bt0.f77162i, 1.03f, 1.0f);
        animatorM103741n.setDuration(500L);
        animatorM103741n2.setDuration(333L);
        animatorM103741n3.setDuration(333L);
        animatorM103741n4.setDuration(333L);
        animatorM103741n.setInterpolator(this.f70467t);
        animatorM103741n2.setInterpolator(this.f70467t);
        animatorM103741n3.setInterpolator(this.f70467t);
        animatorM103741n4.setInterpolator(this.f70467t);
        bt0.m103733f(bt0.m103748u(false, null, -1L, animatorM103741n, animatorM103741n2, animatorM103741n3, animatorM103741n4), new Runnable() { // from class: l.mkl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134335a.m97317A0();
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public void m97317A0() {
        mkd0.m154992z(this.f70468u);
        this.f70468u = this.f70456i.duringCreated(C22306c.interval(0L, 2250L, TimeUnit.MILLISECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.pkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150009a.m97319B0((Long) obj);
            }
        }, new e30() { // from class: l.qkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                all0.m97383w((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public void m97346U0() {
        mkd0.m154992z(this.f70468u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m97348Y(int i) {
        PurchaseType purchaseType = gkl0.m126656t0().get(i);
        if (sab0.m182905w(purchaseType)) {
            if (this.f70448a.getLeftIconContainer().getChildCount() > 0 && (this.f70448a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f70448a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#80000000"));
            }
            if (this.f70448a.getTitleContainer().getChildCount() > 0 && (this.f70448a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f70448a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#b8000000"));
            }
            this.f70448a.getLeftIconContainer().getChildAt(0);
            this.f70450c._indicator.setPageColor(Color.parseColor("#26ffcf48"));
            this.f70450c._indicator.setFillColor(Color.parseColor("#ffcf48"));
            this.f70462o.setBackground(this.f70456i.act().getDrawable(x2c0.f190582tb));
            m97349Z(PurchaseType.TYPE_GET_VIP);
        } else if (sab0.m182901s(purchaseType)) {
            if (this.f70448a.getLeftIconContainer().getChildCount() > 0 && (this.f70448a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f70448a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#80000000"));
            }
            if (this.f70448a.getTitleContainer().getChildCount() > 0 && (this.f70448a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f70448a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#b8000000"));
            }
            this.f70450c._indicator.setPageColor(Color.parseColor("#26ffcf48"));
            this.f70450c._indicator.setFillColor(Color.parseColor("#ff932b"));
            this.f70462o.setBackground(this.f70456i.act().getDrawable(x2c0.f189945Za));
            m97349Z(PurchaseType.TYPE_GET_LIKERS);
        } else if (sab0.m182899q(purchaseType)) {
            if (this.f70448a.getLeftIconContainer().getChildCount() > 0 && (this.f70448a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f70448a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#cce8ca8a"));
            }
            if (this.f70448a.getTitleContainer().getChildCount() > 0 && (this.f70448a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f70448a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#cce8ca8a"));
            }
            this.f70450c._indicator.setPageColor(Color.parseColor("#26ffdea2"));
            this.f70450c._indicator.setFillColor(Color.parseColor("#ffdea2"));
            m97349Z(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
            this.f70462o.setBackground(this.f70456i.act().getDrawable(x2c0.f189449Ja));
        } else if (sab0.m182904v(purchaseType)) {
            if (this.f70448a.getLeftIconContainer().getChildCount() > 0 && (this.f70448a.getLeftIconContainer().getChildAt(0) instanceof VIcon)) {
                ((VIcon) this.f70448a.getLeftIconContainer().getChildAt(0)).setColorFilter(Color.parseColor("#3D2747"));
            }
            if (this.f70448a.getTitleContainer().getChildCount() > 0 && (this.f70448a.getTitleContainer().getChildAt(0) instanceof TextView)) {
                ((TextView) this.f70448a.getTitleContainer().getChildAt(0)).setTextColor(Color.parseColor("#3D2747"));
            }
            this.f70450c._indicator.setPageColor(Color.parseColor("#33705E44"));
            this.f70450c._indicator.setFillColor(Color.parseColor("#705E44"));
            m97349Z(PurchaseType.TYPE_ULTRA_PREMIUM);
            qib0.f154691G.m102314D(this.f70462o, "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ1QUNBVEJDNE5PTVY3TjdRUUtIVFRRM0Y3TFNBNzE0IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjE5OTAyMzI1NTU1Mn0.png");
        }
        m97392G0(i);
        this.f70451d.setCurrentItem(i);
        if (this.f70463p.get(i) instanceof gxo) {
            ((gxo) this.f70463p.get(i)).mo57553i();
        }
    }

    /* JADX INFO: renamed from: Z */
    private void m97349Z(PurchaseType purchaseType) {
        int i = C15656e.f70474a[purchaseType.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.f70456i.act().setStatusBarColor(this.f70456i.act().getResources().getColor(w0c0.f183811U1));
                int systemUiVisibility = this.f70456i.act().getWindow().getDecorView().getSystemUiVisibility();
                int i2 = systemUiVisibility & (-8193);
                if (Build.VERSION.SDK_INT >= 26) {
                    i2 = systemUiVisibility & (-8209);
                }
                this.f70456i.act().getWindow().getDecorView().setSystemUiVisibility(i2);
                return;
            }
            if (i != 4) {
                return;
            }
        }
        this.f70456i.act().setStatusBarColor(this.f70456i.act().getResources().getColor(w0c0.f183811U1));
        PutongAct.setLightStatusBar(this.f70456i.act().getWindow(), 16);
    }

    /* JADX INFO: renamed from: a0 */
    private ViewGroup m97351a0(PurchaseType purchaseType) {
        int i = C15656e.f70474a[purchaseType.ordinal()];
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
    public static /* synthetic */ void m97353c() {
    }

    /* JADX INFO: renamed from: f0 */
    private void m97357f0() {
        m97358g0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private void m97358g0(boolean z) {
        ViewGroup next;
        ArrayList<PurchaseType> arrayListM126656t0 = gkl0.m126656t0();
        if (vwb.m200296J(arrayListM126656t0)) {
            return;
        }
        this.f70450c.m57679d(arrayListM126656t0);
        if (z && !vwb.m200296J(this.f70463p)) {
            ArrayList<ViewGroup> arrayList = new ArrayList<>();
            ArrayList arrayList2 = new ArrayList();
            for (PurchaseType purchaseType : arrayListM126656t0) {
                Iterator<ViewGroup> it = this.f70463p.iterator();
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
                    ViewGroup viewGroupM97351a0 = m97351a0(purchaseType);
                    if (NullChecker.m81303a(viewGroupM97351a0)) {
                        arrayList.add(viewGroupM97351a0);
                    }
                }
            }
            if (arrayList.size() == arrayListM126656t0.size()) {
                this.f70463p = arrayList;
                if (NullChecker.m81303a(this.f70461n)) {
                    this.f70461n.m105099s(this.f70463p);
                    this.f70451d.setCurrentItem(0);
                    return;
                }
                return;
            }
        }
        this.f70463p = new ArrayList<>();
        Iterator<PurchaseType> it2 = arrayListM126656t0.iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroupM97351a1 = m97351a0(it2.next());
            if (NullChecker.m81303a(viewGroupM97351a1)) {
                this.f70463p.add(viewGroupM97351a1);
            }
        }
        if (!vwb.m200296J(this.f70463p) && NullChecker.m81303a(this.f70461n)) {
            this.f70461n.m105099s(this.f70463p);
            this.f70451d.setCurrentItem(0);
        }
        mep0.m154302d1(this.f70453f, t100.f167260i);
        this.f70453f.setAlpha(153);
        SVGALoader.with(this.f70456i.act()).from("https://auto.tancdn.com/v1/raw/051048fc-7b33-41f3-a36c-1004f82d5167.pdf").autoPlay(false).repeatCount(1).into(this.f70453f);
    }

    /* JADX INFO: renamed from: i0 */
    private void m97360i0() {
        this.f70461n = new c3n((VipNewUiFrag) this.f70456i);
        this.f70451d.mo4180X(true, new z2n());
        this.f70451d.setOffscreenPageLimit(3);
        this.f70451d.setAdapter(this.f70461n);
    }

    /* JADX INFO: renamed from: j0 */
    private void m97362j0() {
        this.f70457j.creates(new e30() { // from class: l.hkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108255a.m97370o0((Bundle) obj);
            }
        }, new d30() { // from class: l.rkl0
            @Override // p149l.d30
            public final void call() {
                all0.m97353c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public boolean m97364k0() {
        if (NullChecker.m81303a(this.f70458k) && NullChecker.m81303a(this.f70458k.m53601s())) {
            if (this.f70458k.m53601s().quantity == (CoreModule.f17545c.f19654j0.m30645z4() ? 12 : 1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m97367m0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        m97394I0();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m97368n(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m97369n0() {
        if (m97364k0()) {
            this.f70452e.removeCallbacks(this.f70466s);
            this.f70452e.post(this.f70466s);
        }
        if (vwb.m200296J(this.f70463p)) {
            return;
        }
        for (ViewParent viewParent : this.f70463p) {
            if (viewParent instanceof gxo) {
                ((gxo) viewParent).mo57551b(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m97370o0(Bundle bundle) {
        Bundle arguments = this.f70456i.getArguments();
        if (NullChecker.m81303a(arguments)) {
            String string = arguments.getString("vip_selected_purchase_type");
            PurchaseType purchaseTypeValueOf = !TextUtils.isEmpty(string) ? PurchaseType.valueOf(string) : null;
            int i = arguments.getInt("vip_selected_page", -1);
            if (i >= 0) {
                this.f70450c._viewpager.setCurrentItem(i);
                m97348Y(this.f70450c._viewpager.getCurrentItem());
            } else {
                this.f70450c._viewpager.setCurrentItem(c690.m105372a(purchaseTypeValueOf, true, new bll0()));
                m97348Y(this.f70450c._viewpager.getCurrentItem());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m97372p0() {
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f70450c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        m97348Y(intlBounceBackViewPager.getCurrentItem());
        this.f70465r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m97374q0(View view) {
        if (m97398Q0()) {
            return;
        }
        getAct().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m97375r0(View view) {
        nb90.m158766d();
        if (this.f70456i.act() != null) {
            this.f70456i.act().startActivity(new Intent(this.f70456i.act(), (Class<?>) HelperManagerAct.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m97377s0(View view) {
        m97391D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m97378t0(boolean z, User user) {
        m97335O0(user, z);
        u9p.payFromSalvageAction = user == null ? "" : "oneMath";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m97380u0(boolean z, User user) {
        m97335O0(user, z);
        u9p.payFromSalvageAction = "oneMath";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m97382v0(boolean z, User user) {
        m97335O0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m97383w(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public /* synthetic */ void m97384w0(boolean z) {
        m97335O0(null, z);
        u9p.payFromSalvageAction = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m97386x0(boolean z, User user) {
        m97335O0(user, z);
        u9p.payFromSalvageAction = MatchFrom.superLiked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m97388y0(boolean z, User user) {
        m97335O0(user, z);
        u9p.payFromSalvageAction = "liked";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m97390z0(boolean z, User user) {
        m97335O0(user, z);
        u9p.payFromSalvageAction = "seeProfile";
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f70456i.getContext();
    }

    /* JADX INFO: renamed from: D0 */
    public void m97391D0() {
        if (((CoreModule.f17545c.f19654j0.m30572A4() && this.f70459l == PurchaseType.TYPE_GET_LIKERS) || ((CoreModule.f17545c.f19654j0.m30574B4() && this.f70459l == PurchaseType.TYPE_GET_VIP) || (CoreModule.f17545c.f19654j0.m30643y4() && this.f70459l == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE))) && m97364k0()) {
            m97322E0(CoreModule.f17545c.f19654j0.m30576C4().skuId);
        } else if (NullChecker.m81303a(this.f70458k) && NullChecker.m81303a(this.f70458k.m53601s())) {
            m97322E0(this.f70458k.m53601s().defaultStockKeepUnit.affiliateProducts.getProductId());
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m97392G0(int i) {
        if (gkl0.m126656t0().size() > i) {
            PurchaseType purchaseType = gkl0.m126656t0().get(i);
            C8765d.a aVarM126662r0 = this.f70457j.m126662r0(purchaseType);
            cll0.m107562i(purchaseType);
            cll0.m107559f(purchaseType);
            m97393H0(purchaseType, aVarM126662r0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m97393H0(PurchaseType purchaseType, C8765d.a aVar) {
        this.f70457j.m126661L0(purchaseType, aVar);
        if (gkl0.m126656t0().size() <= m97403d0() || gkl0.m126656t0().get(m97403d0()) != purchaseType) {
            return;
        }
        this.f70458k = aVar;
        this.f70459l = purchaseType;
        this.f70452e.removeCallbacks(this.f70466s);
        this.f70452e.post(this.f70466s);
    }

    /* JADX INFO: renamed from: I0 */
    public void m97394I0() {
        odp odpVar;
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f70450c;
        if (intlTopCardLayout == null || (odpVar = intlTopCardLayout.adapter) == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            return;
        }
        odpVar.m163699s(intlBounceBackViewPager);
    }

    /* JADX INFO: renamed from: J0 */
    public void m97395J0() {
        IntlBounceBackViewPager intlBounceBackViewPager;
        PurchaseType purchaseTypeM105626b;
        PurchaseType purchaseTypeM97402c0 = this.f70460m;
        if (purchaseTypeM97402c0 == null) {
            purchaseTypeM97402c0 = m97402c0();
        }
        gkl0.m126640I0();
        gkl0.m126657u0();
        ArrayList<PurchaseType> arrayListM126656t0 = gkl0.m126656t0();
        int iIndexOf = (purchaseTypeM97402c0 == null || arrayListM126656t0 == null || !arrayListM126656t0.contains(purchaseTypeM97402c0)) ? -1 : arrayListM126656t0.indexOf(purchaseTypeM97402c0);
        if (iIndexOf < 0 && (purchaseTypeM105626b = c7r.m105626b()) != null && arrayListM126656t0 != null && arrayListM126656t0.contains(purchaseTypeM105626b)) {
            iIndexOf = arrayListM126656t0.indexOf(purchaseTypeM105626b);
        }
        if (iIndexOf < 0) {
            iIndexOf = 0;
        }
        this.f70460m = null;
        this.f70465r = true;
        m97358g0(true);
        m97406l0(iIndexOf);
        IntlTopCardLayout intlTopCardLayout = this.f70450c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null) {
            this.f70465r = false;
        } else {
            intlBounceBackViewPager.post(new Runnable() { // from class: l.okl0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144450a.m97372p0();
                }
            });
        }
        m97401b0();
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L0 */
    public void m97396L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f70464q = str;
        if (this.f70450c._viewpager.getCurrentItem() >= gkl0.m126656t0().size() || !m97364k0()) {
            return;
        }
        if ((sab0.m182905w(this.f70459l) && CoreModule.f17545c.f19654j0.m30574B4()) || ((sab0.m182901s(this.f70459l) && CoreModule.f17545c.f19654j0.m30572A4()) || (sab0.m182899q(this.f70459l) && CoreModule.f17545c.f19654j0.m30643y4()))) {
            xdl0.m208344M(this.f70455h, false);
            xdl0.m208344M(this.f70454g, true);
            String strM133156c = hvc0.m133156c(CoreModule.f17545c.f19654j0.m30645z4() ? R$string.f18390bc : R$string.f17572A5);
            this.f70454g.setText(strM133156c + SignParameters.NEW_LINE + str);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m97397M0(PurchaseType purchaseType) {
        this.f70460m = purchaseType;
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m97398Q0() {
        PurchaseType purchaseType = this.f70459l;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m97340R0(false, purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public View m97399W(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15657f.m97410c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gkl0 gkl0Var) {
        this.f70457j = gkl0Var;
    }

    /* JADX INFO: renamed from: b0 */
    public void m97401b0() {
        getAct().duringCreated(ugc0.m193536c()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.kkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123571a.m97367m0((RecentContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.lkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                all0.m97368n((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public PurchaseType m97402c0() {
        int iM97403d0 = m97403d0();
        ArrayList<PurchaseType> arrayListM126656t0 = gkl0.m126656t0();
        if (iM97403d0 >= 0 && iM97403d0 < arrayListM126656t0.size()) {
            return arrayListM126656t0.get(iM97403d0);
        }
        PurchaseType purchaseType = this.f70459l;
        if (purchaseType != null) {
            return purchaseType;
        }
        return null;
    }

    /* JADX INFO: renamed from: d0 */
    public int m97403d0() {
        return this.f70450c._viewpager.getCurrentItem();
    }

    @Override // p149l.s7m
    public void destroy() {
        if (!vwb.m200296J(this.f70463p)) {
            for (ViewGroup viewGroup : this.f70463p) {
                if (viewGroup instanceof IntlPrivilegeSVipContent) {
                    ((IntlPrivilegeSVipContent) viewGroup).m57565v0();
                    break;
                }
            }
        }
        m97346U0();
    }

    /* JADX INFO: renamed from: e0 */
    public void m97404e0() {
        this.f70455h.postDelayed(new Runnable() { // from class: l.nkl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139450a.m97369n0();
            }
        }, 100L);
    }

    /* JADX INFO: renamed from: h0 */
    public void m97405h0(Bundle bundle) {
        m97329K0();
        m97333N0();
        m97360i0();
        gkl0.m126657u0();
        m97357f0();
        m97362j0();
        this.f70457j.m126663x0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM97399W = m97399W(layoutInflater, viewGroup);
        this.f70462o = viewM97399W;
        return viewM97399W;
    }

    /* JADX INFO: renamed from: l0 */
    public void m97406l0(int i) {
        IntlBounceBackViewPager intlBounceBackViewPager;
        IntlTopCardLayout intlTopCardLayout = this.f70450c;
        if (intlTopCardLayout == null || (intlBounceBackViewPager = intlTopCardLayout._viewpager) == null || intlBounceBackViewPager.getCurrentItem() == i) {
            return;
        }
        this.f70450c._viewpager.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: l.all0$b */
    public class ViewOnAttachStateChangeListenerC15653b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC15653b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            all0.this.f70452e.removeCallbacks(all0.this.f70466s);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: l.all0$c */
    public class C15654c implements ViewPager.InterfaceC0716j {
        public C15654c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (all0.this.f70465r) {
                return;
            }
            all0.this.m97348Y(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
