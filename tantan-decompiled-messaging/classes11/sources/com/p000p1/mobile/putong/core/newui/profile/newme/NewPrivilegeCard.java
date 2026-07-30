package com.p000p1.mobile.putong.core.newui.profile.newme;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.core.newui.main.C0260a;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreProduct;
import com.p1.mobile.putong.core.data.FreeTrialData;
import com.p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.c4g0;
import l.c4p;
import l.cb9;
import l.d30;
import l.d740;
import l.e30;
import l.h6a;
import l.hvc0;
import l.mkd0;
import l.qib0;
import l.t100;
import l.u59;
import l.ura;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.dfx;
import p009l.n6a;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001f\u0010\u0016J\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0016R\"\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\"\u0010O\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010*\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010.R\"\u0010_\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "k0", "(Landroid/view/View;)V", "count", "l0", "(I)V", "o0", "()V", "onFinishInflate", "onAttachedToWindow", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "X", "(ILcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "n0", "m0", "d", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "get_card_layout", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "set_card_layout", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;)V", "_card_layout", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_privilege_bg", "()Lv/VDraweeView;", "set_privilege_bg", "(Lv/VDraweeView;)V", "_privilege_bg", "f", "get_title_res", "set_title_res", "_title_res", "g", "get_bg_res", "set_bg_res", "_bg_res", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "get_buy_layout", "()Landroid/widget/FrameLayout;", "set_buy_layout", "(Landroid/widget/FrameLayout;)V", "_buy_layout", "Lv/VText;", "i", "Lv/VText;", "get_buy", "()Lv/VText;", "set_buy", "(Lv/VText;)V", "_buy", "j", "get_free", "set_free", "_free", "k", "get_desc", "set_desc", "_desc", "Lcom/tantan/library/svga/SVGAnimationView;", "l", "Lcom/tantan/library/svga/SVGAnimationView;", "get_privilege_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_privilege_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_privilege_svga", "m", "get_privilege_icon", "set_privilege_icon", "_privilege_icon", "n", "get_upgrade_tag", "set_upgrade_tag", "_upgrade_tag", "o", "Lcom/p1/mobile/putong/app/PutongFrag;", "p", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ll/c4g0;", "q", "Ll/c4g0;", "subscription", "Ljava/text/NumberFormat;", "r", "Ljava/text/NumberFormat;", "getNumberFormat", "()Ljava/text/NumberFormat;", "numberFormat", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewPrivilegeCard extends ConstraintLayout implements NewProfilePrivilegedPager.InterfaceC0387b {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public NewPrivilegeCard _card_layout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _privilege_bg;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VDraweeView _title_res;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VDraweeView _bg_res;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _buy_layout;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _buy;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VDraweeView _free;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public SVGAnimationView _privilege_svga;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VDraweeView _privilege_icon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _upgrade_tag;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public PutongFrag frag;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public c4g0 subscription;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0385a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5374a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5374a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPrivilegeCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        this.numberFormat = numberInstance;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m7492h0(NewPrivilegeCard newPrivilegeCard, View view) {
        PurchaseType purchaseType = newPrivilegeCard.purchaseType;
        Frag frag = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.c.x0.I3() != null) {
            newPrivilegeCard.m7500o0();
            return;
        }
        CoreProduct coreProduct = CoreModule.c.j0;
        PurchaseType purchaseType2 = newPrivilegeCard.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
            purchaseType2 = null;
        }
        if (!coreProduct.S4(purchaseType2)) {
            newPrivilegeCard.m7500o0();
            return;
        }
        if (CoreModule.c.j0.T4()) {
            newPrivilegeCard.m7500o0();
            return;
        }
        FreeTrialData freeTrialDataC4 = CoreModule.c.j0.C4();
        if (freeTrialDataC4 == null || TextUtils.isEmpty(freeTrialDataC4.titleText) || TextUtils.isEmpty(freeTrialDataC4.promotionUrl)) {
            return;
        }
        Frag frag2 = newPrivilegeCard.frag;
        if (frag2 == null) {
            Intrinsics.r("frag");
            frag2 = null;
        }
        Intent intentM10499a2 = WebViewAct.m10499a2(frag2.act(), freeTrialDataC4.titleText, freeTrialDataC4.promotionUrl, true);
        intentM10499a2.putExtra("hideNavigationBar", true);
        Frag frag3 = newPrivilegeCard.frag;
        if (frag3 == null) {
            Intrinsics.r("frag");
        } else {
            frag = frag3;
        }
        frag.act().startActivity(intentM10499a2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m7493i0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m7494j0(NewPrivilegeCard newPrivilegeCard, int i, d dVar) {
        String str;
        d.a aVarB = dVar.b();
        if (!NullChecker.a(aVarB)) {
            aVarB = dVar.d();
        }
        VText vText = newPrivilegeCard.get_upgrade_tag();
        Fragment fragment = newPrivilegeCard.frag;
        Fragment fragment2 = null;
        if (fragment == null) {
            Intrinsics.r("frag");
            fragment = null;
        }
        xdl0.H0(vText, fragment.getString(R.string.Dg));
        xdl0.M(newPrivilegeCard.get_buy(), true);
        xdl0.M(newPrivilegeCard.get_upgrade_tag(), false);
        String strQ = e.q(aVarB);
        PurchaseType purchaseType = newPrivilegeCard.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotH3 = purchaseType == purchaseType2 ? CoreModule.c.x0.H3("meTabSubscriptionCard") : null;
        if (iapAffiliatePromotionDisplaySlotH3 != null && (str = iapAffiliatePromotionDisplaySlotH3.mainTitle) != null && str.length() != 0) {
            xdl0.M(newPrivilegeCard.get_free(), false);
            xdl0.H0(newPrivilegeCard.get_buy(), iapAffiliatePromotionDisplaySlotH3.mainTitle);
            return;
        }
        CoreProduct coreProduct = CoreModule.c.j0;
        PurchaseType purchaseType3 = newPrivilegeCard.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        if (coreProduct.S4(purchaseType3)) {
            if (CoreModule.c.j0.T4()) {
                xdl0.M(newPrivilegeCard.get_free(), true);
                qib0.G.L0(newPrivilegeCard.get_free(), "https://auto.tancdn.com/v1/raw/4d10c2e4-323c-4788-b8c1-3d602e9fc6e814.webp");
                VText vText2 = newPrivilegeCard.get_buy();
                Fragment fragment3 = newPrivilegeCard.frag;
                if (fragment3 == null) {
                    Intrinsics.r("frag");
                } else {
                    fragment2 = fragment3;
                }
                xdl0.H0(vText2, fragment2.getString(R.string.sc));
                return;
            }
            xdl0.M(newPrivilegeCard.get_free(), true);
            qib0.G.L0(newPrivilegeCard.get_free(), "https://auto.tancdn.com/v1/raw/5d695179-2ea7-4391-8918-1bb9e3d4574b12.webp");
            VText vText3 = newPrivilegeCard.get_buy();
            Fragment fragment4 = newPrivilegeCard.frag;
            if (fragment4 == null) {
                Intrinsics.r("frag");
            } else {
                fragment2 = fragment4;
            }
            xdl0.H0(vText3, fragment2.getString(R.string.rc));
            return;
        }
        cb9 cb9Var = CoreModule.c.G2;
        PurchaseType purchaseType4 = newPrivilegeCard.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.r("purchaseType");
            purchaseType4 = null;
        }
        if (!cb9Var.l3(purchaseType4)) {
            if (!h6a.c()) {
                PurchaseType purchaseType5 = newPrivilegeCard.purchaseType;
                if (purchaseType5 == null) {
                    Intrinsics.r("purchaseType");
                    purchaseType5 = null;
                }
                if (purchaseType5 == purchaseType2) {
                    if (i < (u59.U() ? 4 : 3)) {
                        VText vText4 = newPrivilegeCard.get_buy();
                        Fragment fragment5 = newPrivilegeCard.frag;
                        if (fragment5 == null) {
                            Intrinsics.r("frag");
                        } else {
                            fragment2 = fragment5;
                        }
                        xdl0.H0(vText4, fragment2.getString(R.string.Lg));
                        return;
                    }
                }
            }
            VText vText5 = newPrivilegeCard.get_buy();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Fragment fragment6 = newPrivilegeCard.frag;
            if (fragment6 == null) {
                Intrinsics.r("frag");
            } else {
                fragment2 = fragment6;
            }
            String string = fragment2.getString(R.string.Ta);
            string.getClass();
            xdl0.H0(vText5, String.format(string, Arrays.copyOf(new Object[]{strQ}, 1)));
            return;
        }
        xdl0.M(newPrivilegeCard.get_upgrade_tag(), true);
        PurchaseType purchaseType6 = newPrivilegeCard.purchaseType;
        if (purchaseType6 == null) {
            Intrinsics.r("purchaseType");
            purchaseType6 = null;
        }
        if (purchaseType6 == PurchaseType.TYPE_ULTRA_PREMIUM && CoreModule.c.G2.j3()) {
            VText vText6 = newPrivilegeCard.get_upgrade_tag();
            Fragment fragment7 = newPrivilegeCard.frag;
            if (fragment7 == null) {
                Intrinsics.r("frag");
                fragment7 = null;
            }
            xdl0.H0(vText6, fragment7.getString(R.string.bc));
        }
        newPrivilegeCard.numberFormat.setMaximumFractionDigits(2);
        int iM18787t0 = n6a.m18787t0(aVarB.s());
        NumberFormat numberFormat = newPrivilegeCard.numberFormat;
        String str2 = iM18787t0 > 0 ? numberFormat.format(aVarB.t() / ((double) iM18787t0)) : numberFormat.format(0.0d);
        String str3 = aVarB.h() + str2;
        VText vText7 = newPrivilegeCard.get_buy();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Fragment fragment8 = newPrivilegeCard.frag;
        if (fragment8 == null) {
            Intrinsics.r("frag");
        } else {
            fragment2 = fragment8;
        }
        String string2 = fragment2.getString(R.string.Eg);
        string2.getClass();
        xdl0.H0(vText7, String.format(string2, Arrays.copyOf(new Object[]{str3}, 1)));
    }

    @Override // com.p000p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager.InterfaceC0387b
    /* JADX INFO: renamed from: X */
    public void mo7495X(int count, @NotNull PutongFrag frag, @NotNull PurchaseType purchaseType) {
        frag.getClass();
        purchaseType.getClass();
        this.frag = frag;
        this.purchaseType = purchaseType;
        m7497l0(count);
    }

    @NotNull
    public final NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    @NotNull
    public final VDraweeView get_bg_res() {
        VDraweeView vDraweeView = this._bg_res;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_bg_res");
        return null;
    }

    @NotNull
    public final VText get_buy() {
        VText vText = this._buy;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_buy");
        return null;
    }

    @NotNull
    public final FrameLayout get_buy_layout() {
        FrameLayout frameLayout = this._buy_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_buy_layout");
        return null;
    }

    @NotNull
    public final NewPrivilegeCard get_card_layout() {
        NewPrivilegeCard newPrivilegeCard = this._card_layout;
        if (newPrivilegeCard != null) {
            return newPrivilegeCard;
        }
        Intrinsics.r("_card_layout");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_free() {
        VDraweeView vDraweeView = this._free;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_free");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_bg() {
        VDraweeView vDraweeView = this._privilege_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_privilege_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_icon() {
        VDraweeView vDraweeView = this._privilege_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_privilege_icon");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_privilege_svga() {
        SVGAnimationView sVGAnimationView = this._privilege_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_privilege_svga");
        return null;
    }

    @NotNull
    public final VDraweeView get_title_res() {
        VDraweeView vDraweeView = this._title_res;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_title_res");
        return null;
    }

    @NotNull
    public final VText get_upgrade_tag() {
        VText vText = this._upgrade_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_upgrade_tag");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7496k0(View view) {
        d740.a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7497l0(final int count) {
        if (this.subscription != null) {
            m7498m0();
            return;
        }
        Frag frag = this.frag;
        PurchaseType purchaseType = null;
        if (frag == null) {
            Intrinsics.r("frag");
            frag = null;
        }
        Frag frag2 = this.frag;
        if (frag2 == null) {
            Intrinsics.r("frag");
            frag2 = null;
        }
        Act act = frag2.act();
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        c4g0 c4g0VarSubscribe = frag.duringCreated(e.r(act, purchaseType)).subscribe(mkd0.H(new e30() { // from class: l.b740
            public final void call(Object obj) {
                NewPrivilegeCard.m7494j0(this.f9924a, count, (d) obj);
            }
        }, new e30() { // from class: l.c740
            public final void call(Object obj) {
                NewPrivilegeCard.m7493i0((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.subscription = c4g0VarSubscribe;
        m7499n0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m7498m0() {
        get_privilege_svga().startAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0365  */
    /* JADX WARN: Code duplicated, block: B:58:0x036f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0373  */
    /* JADX WARN: Code duplicated, block: B:61:0x0377  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n0 */
    public final void m7499n0() {
        String string;
        String str;
        String str2;
        Frag frag;
        dfx dfxVar = dfx.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        Frag frag2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        dfxVar.m13331p(purchaseType);
        boolean zC = c4p.INSTANCE.c();
        xdl0.X(get_title_res(), t100.d(20.0f));
        xdl0.C0(get_buy(), t100.v);
        VText vText = get_buy();
        int i = t100.i;
        xdl0.X(vText, i);
        xdl0.U(get_buy_layout(), t100.h);
        xdl0.X(get_buy_layout(), t100.o);
        FrameLayout frameLayout = get_buy_layout();
        int i2 = t100.q;
        xdl0.V(frameLayout, i2);
        xdl0.X(get_desc(), t100.I);
        xdl0.W(get_privilege_svga(), t100.d(51.0f));
        xdl0.W(get_privilege_icon(), t100.d(51.0f));
        Enum r1 = this.purchaseType;
        if (r1 == null) {
            Intrinsics.r("purchaseType");
            r1 = null;
        }
        int i3 = C0385a.f5374a[r1.ordinal()];
        if (i3 == 1) {
            VText vText2 = get_buy();
            int i4 = t100.j;
            xdl0.d0(vText2, i4);
            xdl0.e0(get_buy(), i4);
            get_buy().setTextColor(CoreModule.b.getResources().getColor(w0c0.w0));
            get_buy().setBackgroundResource(x2c0.ha);
            xdl0.C0(get_title_res(), i2);
            xdl0.D0(t100.d(42.0f), new View[]{get_title_res()});
            qib0.G.L0(get_title_res(), "https://auto.tancdn.com/v1/raw/9a8fb6c3-de8d-4e68-afc1-37e17faed05913.webp");
            qib0.G.L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/0274da72-515d-4920-8256-4cdc3a49580513.webp");
            qib0.G.L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/e8b29481-f896-46bc-ab7e-7e55e6ed79cd13.webp");
            boolean zOi = ura.e().d().Oi();
            Fragment fragment = this.frag;
            if (zOi) {
                if (fragment == null) {
                    Intrinsics.r("frag");
                    fragment = null;
                }
                string = fragment.getString(R.string.Va);
            } else {
                if (fragment == null) {
                    Intrinsics.r("frag");
                    fragment = null;
                }
                string = fragment.getString(R.string.Ua);
            }
            string.getClass();
            xdl0.H0(get_desc(), string);
            get_desc().setTextColor(CoreModule.b.getResources().getColor(w0c0.z0));
            str = zC ? "https://auto.tancdn.com/v1/raw/2ed0984b-7f46-42e2-822e-9d62b2b29e6512.webp" : "https://auto.tancdn.com/v1/raw/38e4b498-9444-4d29-a7ea-245d30cebe0e13.svga";
        } else if (i3 == 2) {
            VText vText3 = get_buy();
            int i5 = t100.j;
            xdl0.d0(vText3, i5);
            xdl0.e0(get_buy(), i5);
            get_buy().setTextColor(CoreModule.b.getResources().getColor(w0c0.r0));
            get_buy().setBackgroundResource(x2c0.ca);
            xdl0.C0(get_title_res(), i2);
            xdl0.D0(t100.d(51.0f), new View[]{get_title_res()});
            qib0.G.L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/f1cdf659-8636-4513-bcbd-1ddfb35eaf9812.webp");
            qib0.G.L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/61e0afa6-ee39-4395-8db3-33bca36e2cce12.webp");
            qib0.G.L0(get_title_res(), "https://auto.tancdn.com/v1/raw/ed139794-ad11-4eca-abb1-1e73dd0dd8bb13.webp");
            VText vText4 = get_desc();
            Fragment fragment2 = this.frag;
            if (fragment2 == null) {
                Intrinsics.r("frag");
                fragment2 = null;
            }
            xdl0.H0(vText4, fragment2.getString(R.string.Oa));
            get_desc().setTextColor(CoreModule.b.getResources().getColor(w0c0.x0));
            str = zC ? "https://auto.tancdn.com/v1/raw/921bb0ae-bdb9-42c8-b925-9a73055a03b812.webp" : "https://auto.tancdn.com/v1/raw/77496448-f42c-42bb-920e-17a31df068a012.svga";
        } else {
            if (i3 != 3) {
                str2 = "";
                if (i3 == 4) {
                    xdl0.d0(get_buy(), 0);
                    xdl0.e0(get_buy(), 0);
                    get_buy().setTextColor(Color.parseColor("#5F486A"));
                    get_buy().setBackgroundResource(x2c0.ea);
                    xdl0.C0(get_title_res(), t100.x);
                    xdl0.D0(t100.d(124.0f), new View[]{get_title_res()});
                    xdl0.C0(get_buy(), t100.G);
                    xdl0.X(get_title_res(), t100.d(14.0f));
                    xdl0.U(get_buy_layout(), 0);
                    xdl0.X(get_buy(), 0);
                    xdl0.X(get_desc(), t100.H);
                    xdl0.X(get_buy_layout(), t100.l);
                    xdl0.V(get_buy_layout(), i);
                    qib0.G.L0(get_bg_res(), "");
                    qib0.G.L0(get_privilege_bg(), "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9SNUgzRDNBS01DVU5BS0tSRVpPUU5UQ1RCNFdLTjE0IiwidyI6NjQwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5OTEwNjM0NjM5NzU2MTIzMTkzfQ.png");
                    qib0.G.L0(get_title_res(), "https://auto.tancdn.com/v1/images/eyJpZCI6IkwzT0pSNklIRkEzQ0lVRFZKWVY2TUNaUU5SUjNPNTE0IiwidyI6MjQ4LCJoIjo3MiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyMjk4MTM4ODM3ODQ3NDU3MzB9.png");
                    if (IntlCountryCodeController.v()) {
                        xdl0.H0(get_desc(), hvc0.c(R.string.dj));
                    } else {
                        xdl0.H0(get_desc(), hvc0.c(R.string.cj));
                    }
                    get_desc().setTextColor(Color.parseColor("#66FFFFFF"));
                    str = zC ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVVSTdYN1YzM1lTU0tWRERJS0hGUTJBV0FXV1k3MjE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTkyMzcyNzE5ODQ3NTY0NTYzfQ.png" : "https://auto.tancdn.com/v1/raw/c4394906-acb9-4366-8edb-9b402f98cad114.svga";
                }
                xdl0.M(get_privilege_svga(), !zC);
                xdl0.M(get_privilege_icon(), zC);
                if (str2.length() > 0) {
                    if (zC) {
                        qib0.G.L0(get_privilege_icon(), str2);
                        return;
                    }
                    frag = this.frag;
                    if (frag == null) {
                        Intrinsics.r("frag");
                    } else {
                        frag2 = frag;
                    }
                    Act act = frag2.act();
                    act.getClass();
                    SVGALoader.with(act).repeatCount(1).autoPlay(false).from(str2).into(get_privilege_svga());
                }
            }
            VText vText5 = get_buy();
            int i6 = t100.j;
            xdl0.d0(vText5, i6);
            xdl0.e0(get_buy(), i6);
            get_buy().setTextColor(CoreModule.b.getResources().getColor(w0c0.W));
            get_buy().setBackgroundResource(x2c0.aa);
            xdl0.C0(get_title_res(), i2);
            xdl0.D0(t100.d(119.0f), new View[]{get_title_res()});
            qib0.G.L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/2a997f14-1a0e-4f27-a886-7b570c7b253a12.webp");
            qib0.G.L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/05a984c6-bbd6-46e7-aa86-3b4a1f0f6afe12.webp");
            qib0.G.L0(get_title_res(), "https://auto.tancdn.com/v1/raw/095c2e1d-f854-455a-bdb7-b18c5dca6d3513.webp");
            if (u59.U()) {
                xdl0.H0(get_desc(), hvc0.c(R.string.bj));
            } else {
                xdl0.H0(get_desc(), hvc0.c(R.string.Ma));
            }
            get_desc().setTextColor(Color.parseColor("#A38F5F"));
            str = zC ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41VUVTQVdKWERXWVBCNEZXVVNWT0VJT0hGRFIyVTE0IiwidyI6MjQwLCJoIjoyNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MjIwMTE5ODU2NzcwNjk1OTh9.png" : "https://auto.tancdn.com/v1/raw/60258e67-0a45-4eeb-8a7c-69c0a14d319614.svga";
        }
        str2 = str;
        xdl0.M(get_privilege_svga(), !zC);
        xdl0.M(get_privilege_icon(), zC);
        if (str2.length() > 0) {
            if (zC) {
                qib0.G.L0(get_privilege_icon(), str2);
                return;
            }
            frag = this.frag;
            if (frag == null) {
                Intrinsics.r("frag");
            } else {
                frag2 = frag;
            }
            Act act2 = frag2.act();
            act2.getClass();
            SVGALoader.with(act2).repeatCount(1).autoPlay(false).from(str2).into(get_privilege_svga());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresApi(23)
    /* JADX INFO: renamed from: o0 */
    public final void m7500o0() {
        C0260a c0260aM3870V5;
        dfx dfxVar = dfx.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        NewMainAct newMainAct = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        dfxVar.m13330o(purchaseType);
        Enum r0 = this.purchaseType;
        if (r0 == null) {
            Intrinsics.r("purchaseType");
            r0 = null;
        }
        int i = C0385a.f5374a[r0.ordinal()];
        if (i == 1) {
            NewMainAct newMainAct2 = this.frag;
            if (newMainAct2 == null) {
                Intrinsics.r("frag");
            } else {
                newMainAct = newMainAct2;
            }
            c.O1(newMainAct.act(), "p_navigation_view,e_intl_me_subscription_card,click", (Privilege) null, (d30) null, (d30) null, false, (User) null, (Object) null, (e30) null, 508, (Object) null);
            return;
        }
        if (i == 2) {
            NewMainAct newMainAct3 = this.frag;
            if (newMainAct3 == null) {
                Intrinsics.r("frag");
            } else {
                newMainAct = newMainAct3;
            }
            c.E1(newMainAct.act(), "p_navigation_view,e_intl_me_subscription_card,click", (Privilege) null, (d30) null, (Object) null, 28, (Object) null);
            return;
        }
        if (i == 3) {
            FreeTrialData freeTrialDataC4 = CoreModule.c.j0.C4();
            String str = (freeTrialDataC4 == null || TextUtils.isEmpty(freeTrialDataC4.skuId)) ? "p_navigation_view,e_intl_me_subscription_card,click" : "p_suggest_users_home_view,e_premium_promo_50off_card,click";
            Act actE = xdl0.E(this);
            actE.getClass();
            c.D0(actE, str, (Privilege) null, (PurchaseType) null, (e30) null, 0, (d30) null, (d30) null, (String) null, (Object) null, false, false, 4092, (Object) null);
            return;
        }
        if (i != 4) {
            return;
        }
        if (CoreModule.c.G2.j3()) {
            CoreModule.c.G2.r3();
            Frag frag = this.frag;
            if (frag == null) {
                Intrinsics.r("frag");
                frag = null;
            }
            NewMainAct newMainActAct = frag.act();
            newMainAct = newMainActAct instanceof NewMainAct ? newMainActAct : null;
            if (newMainAct != null && (c0260aM3870V5 = newMainAct.m3870V5()) != null) {
                c0260aM3870V5.m4533x9();
            }
        }
        Act actE2 = xdl0.E(this);
        actE2.getClass();
        c.N0(actE2, "p_navigation_view,e_intl_me_subscription_card,click", (e30) null, (d30) null, (d30) null, (Privilege) null, (String) null, 124, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        ViewParent parent = getParent();
        for (int i = 0; (parent instanceof ViewGroup) && i < 4; i++) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            parent = viewGroup.getParent();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RequiresApi(23)
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7496k0(this);
        setClipChildren(false);
        setClipToPadding(false);
        get_upgrade_tag().setTranslationY(-t100.d(5.0f));
        get_upgrade_tag().bringToFront();
        get_upgrade_tag().setElevation(t100.d(2.0f));
        xdl0.M(get_buy(), false);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.a740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPrivilegeCard.m7492h0(this.f9318a, view);
            }
        });
    }

    public final void set_bg_res(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._bg_res = vDraweeView;
    }

    public final void set_buy(@NotNull VText vText) {
        vText.getClass();
        this._buy = vText;
    }

    public final void set_buy_layout(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._buy_layout = frameLayout;
    }

    public final void set_card_layout(@NotNull NewPrivilegeCard newPrivilegeCard) {
        newPrivilegeCard.getClass();
        this._card_layout = newPrivilegeCard;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_free(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._free = vDraweeView;
    }

    public final void set_privilege_bg(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._privilege_bg = vDraweeView;
    }

    public final void set_privilege_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._privilege_icon = vDraweeView;
    }

    public final void set_privilege_svga(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._privilege_svga = sVGAnimationView;
    }

    public final void set_title_res(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._title_res = vDraweeView;
    }

    public final void set_upgrade_tag(@NotNull VText vText) {
        vText.getClass();
        this._upgrade_tag = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewPrivilegeCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewPrivilegeCard(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
