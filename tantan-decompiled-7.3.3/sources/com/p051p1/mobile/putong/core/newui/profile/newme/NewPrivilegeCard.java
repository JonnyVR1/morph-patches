package com.p051p1.mobile.putong.core.newui.profile.newme;

import android.app.Activity;
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
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.CoreProduct;
import com.p051p1.mobile.putong.core.data.FreeTrialData;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.C8247a;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.box;
import p153l.c6p;
import p153l.c9c0;
import p153l.d79;
import p153l.dbc0;
import p153l.ful0;
import p153l.ge90;
import p153l.gta;
import p153l.j0p;
import p153l.joa;
import p153l.k3d0;
import p153l.kcg0;
import p153l.lc9;
import p153l.psd0;
import p153l.qa00;
import p153l.rf40;
import p153l.t7a;
import p153l.uqb0;
import p153l.y20;
import p153l.z7a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u0016J'\u0010!\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0000¢\u0006\u0004\b#\u0010\u0016J\r\u0010$\u001a\u00020\u000f¢\u0006\u0004\b$\u0010\u0016R\"\u0010+\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010;\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010O\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010.\u001a\u0004\bM\u00100\"\u0004\bN\u00102R\"\u0010S\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR\"\u0010[\u001a\u00020T8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010.\u001a\u0004\b]\u00100\"\u0004\b^\u00102R\"\u0010c\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010F\u001a\u0004\ba\u0010H\"\u0004\bb\u0010JR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u0017\u0010q\u001a\u00020l8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006r"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "k0", "(Landroid/view/View;)V", "count", "o0", "(I)V", "r0", "()V", "s0", "l0", "m0", "n0", "onFinishInflate", "onAttachedToWindow", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "X", "(ILcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "q0", "p0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "get_card_layout", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "set_card_layout", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;)V", "_card_layout", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_privilege_bg", "()Lv/VDraweeView;", "set_privilege_bg", "(Lv/VDraweeView;)V", "_privilege_bg", "f", "get_title_res", "set_title_res", "_title_res", "g", "get_bg_res", "set_bg_res", "_bg_res", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "get_buy_layout", "()Landroid/widget/FrameLayout;", "set_buy_layout", "(Landroid/widget/FrameLayout;)V", "_buy_layout", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_buy", "()Lv/VText;", "set_buy", "(Lv/VText;)V", "_buy", "j", "get_free", "set_free", "_free", "k", "get_desc", "set_desc", "_desc", "Lcom/tantan/library/svga/SVGAnimationView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/tantan/library/svga/SVGAnimationView;", "get_privilege_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_privilege_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_privilege_svga", "m", "get_privilege_icon", "set_privilege_icon", "_privilege_icon", "n", "get_upgrade_tag", "set_upgrade_tag", "_upgrade_tag", "o", "Lcom/p1/mobile/putong/app/PutongFrag;", "p", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ll/kcg0;", "q", "Ll/kcg0;", "subscription", "Ljava/text/NumberFormat;", "r", "Ljava/text/NumberFormat;", "getNumberFormat", "()Ljava/text/NumberFormat;", "numberFormat", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NewPrivilegeCard extends ConstraintLayout implements NewProfilePrivilegedPager.InterfaceC8374b {

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
    public kcg0 subscription;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8372a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27338a;

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
            f27338a = iArr;
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
    public static void m44282h0(NewPrivilegeCard newPrivilegeCard, View view) {
        if (!d79.m114677f0()) {
            newPrivilegeCard.m44294s0();
            return;
        }
        PurchaseType purchaseType = newPrivilegeCard.purchaseType;
        PutongFrag putongFrag = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f18264c.f20438x0.m31177I3() != null) {
            newPrivilegeCard.m44293r0();
            return;
        }
        CoreProduct coreProduct = CoreModule.f18264c.f20396j0;
        PurchaseType purchaseType2 = newPrivilegeCard.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        if (!coreProduct.m31610S4(purchaseType2)) {
            newPrivilegeCard.m44293r0();
            return;
        }
        if (CoreModule.f18264c.f20396j0.m31611T4()) {
            newPrivilegeCard.m44293r0();
            return;
        }
        FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
        if (freeTrialDataM31579C4 == null || TextUtils.isEmpty(freeTrialDataM31579C4.titleText) || TextUtils.isEmpty(freeTrialDataM31579C4.promotionUrl)) {
            return;
        }
        PutongFrag putongFrag2 = newPrivilegeCard.frag;
        if (putongFrag2 == null) {
            Intrinsics.m88391r("frag");
            putongFrag2 = null;
        }
        Intent intentM81348b2 = WebViewAct.m81348b2(putongFrag2.act(), freeTrialDataM31579C4.titleText, freeTrialDataM31579C4.promotionUrl, true);
        intentM81348b2.putExtra("hideNavigationBar", true);
        PutongFrag putongFrag3 = newPrivilegeCard.frag;
        if (putongFrag3 == null) {
            Intrinsics.m88391r("frag");
        } else {
            putongFrag = putongFrag3;
        }
        putongFrag.act().startActivity(intentM81348b2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m44283i0(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX INFO: renamed from: j0 */
    public static void m44284j0(NewPrivilegeCard newPrivilegeCard, int i, C8928d c8928d) {
        PutongFrag putongFrag;
        String str;
        C8928d.a aVarM54703b = c8928d.m54703b();
        if (!NullChecker.m82486a(aVarM54703b)) {
            aVarM54703b = c8928d.m54705d();
        }
        VText vText = newPrivilegeCard.get_upgrade_tag();
        PutongFrag putongFrag2 = newPrivilegeCard.frag;
        PutongFrag putongFrag3 = null;
        if (putongFrag2 == null) {
            Intrinsics.m88391r("frag");
            putongFrag2 = null;
        }
        bnl0.m105515H0(vText, putongFrag2.getString(R$string.f18973Wg));
        bnl0.m105524M(newPrivilegeCard.get_buy(), true);
        bnl0.m105524M(newPrivilegeCard.get_upgrade_tag(), false);
        String strM54826q = C8929e.m54826q(aVarM54703b);
        PurchaseType purchaseType = newPrivilegeCard.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31175H3 = purchaseType == purchaseType2 ? CoreModule.f18264c.f20438x0.m31175H3("meTabSubscriptionCard") : null;
        if (iapAffiliatePromotionDisplaySlotM31175H3 == null || (str = iapAffiliatePromotionDisplaySlotM31175H3.mainTitle) == null || str.length() == 0) {
            CoreProduct coreProduct = CoreModule.f18264c.f20396j0;
            PurchaseType purchaseType3 = newPrivilegeCard.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType3 = null;
            }
            if (!coreProduct.m31610S4(purchaseType3)) {
                lc9 lc9Var = CoreModule.f18264c.f20311G2;
                PurchaseType purchaseType4 = newPrivilegeCard.purchaseType;
                if (purchaseType4 == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType4 = null;
                }
                if (lc9Var.m153654l3(purchaseType4)) {
                    bnl0.m105524M(newPrivilegeCard.get_upgrade_tag(), true);
                    PurchaseType purchaseType5 = newPrivilegeCard.purchaseType;
                    if (purchaseType5 == null) {
                        Intrinsics.m88391r("purchaseType");
                        purchaseType5 = null;
                    }
                    if (purchaseType5 == PurchaseType.TYPE_ULTRA_PREMIUM && CoreModule.f18264c.f20311G2.m153652j3()) {
                        VText vText2 = newPrivilegeCard.get_upgrade_tag();
                        PutongFrag putongFrag4 = newPrivilegeCard.frag;
                        if (putongFrag4 == null) {
                            Intrinsics.m88391r("frag");
                            putongFrag4 = null;
                        }
                        bnl0.m105515H0(vText2, putongFrag4.getString(R$string.f19582qc));
                    }
                    newPrivilegeCard.numberFormat.setMaximumFractionDigits(2);
                    int iM218877t0 = z7a.m218877t0(aVarM54703b.m54784s());
                    NumberFormat numberFormat = newPrivilegeCard.numberFormat;
                    String str2 = iM218877t0 > 0 ? numberFormat.format(aVarM54703b.m54785t() / ((double) iM218877t0)) : numberFormat.format(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    String str3 = aVarM54703b.m54766h() + str2;
                    VText vText3 = newPrivilegeCard.get_buy();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    PutongFrag putongFrag5 = newPrivilegeCard.frag;
                    if (putongFrag5 == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag3 = putongFrag5;
                    }
                    String string = putongFrag3.getString(R$string.f19003Xg);
                    string.getClass();
                    bnl0.m105515H0(vText3, String.format(string, Arrays.copyOf(new Object[]{str3}, 1)));
                } else if (t7a.m189547c()) {
                    VText vText4 = newPrivilegeCard.get_buy();
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    putongFrag = newPrivilegeCard.frag;
                    if (putongFrag == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag3 = putongFrag;
                    }
                    String string2 = putongFrag3.getString(R$string.f19304hb);
                    string2.getClass();
                    bnl0.m105515H0(vText4, String.format(string2, Arrays.copyOf(new Object[]{strM54826q}, 1)));
                } else {
                    PurchaseType purchaseType6 = newPrivilegeCard.purchaseType;
                    if (purchaseType6 == null) {
                        Intrinsics.m88391r("purchaseType");
                        purchaseType6 = null;
                    }
                    if (purchaseType6 != purchaseType2) {
                        VText vText5 = newPrivilegeCard.get_buy();
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        putongFrag = newPrivilegeCard.frag;
                        if (putongFrag == null) {
                            Intrinsics.m88391r("frag");
                        } else {
                            putongFrag3 = putongFrag;
                        }
                        String string3 = putongFrag3.getString(R$string.f19304hb);
                        string3.getClass();
                        bnl0.m105515H0(vText5, String.format(string3, Arrays.copyOf(new Object[]{strM54826q}, 1)));
                    } else {
                        if (i < (d79.m114663V() ? 4 : 3)) {
                            VText vText6 = newPrivilegeCard.get_buy();
                            PutongFrag putongFrag6 = newPrivilegeCard.frag;
                            if (putongFrag6 == null) {
                                Intrinsics.m88391r("frag");
                            } else {
                                putongFrag3 = putongFrag6;
                            }
                            bnl0.m105515H0(vText6, putongFrag3.getString(R$string.f19248fh));
                        } else {
                            VText vText7 = newPrivilegeCard.get_buy();
                            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                            putongFrag = newPrivilegeCard.frag;
                            if (putongFrag == null) {
                                Intrinsics.m88391r("frag");
                            } else {
                                putongFrag3 = putongFrag;
                            }
                            String string4 = putongFrag3.getString(R$string.f19304hb);
                            string4.getClass();
                            bnl0.m105515H0(vText7, String.format(string4, Arrays.copyOf(new Object[]{strM54826q}, 1)));
                        }
                    }
                }
            } else if (CoreModule.f18264c.f20396j0.m31611T4()) {
                bnl0.m105524M(newPrivilegeCard.get_free(), true);
                uqb0.f180374G.m127115L0(newPrivilegeCard.get_free(), "https://auto.tancdn.com/v1/raw/4d10c2e4-323c-4788-b8c1-3d602e9fc6e814.webp");
                VText vText8 = newPrivilegeCard.get_buy();
                PutongFrag putongFrag7 = newPrivilegeCard.frag;
                if (putongFrag7 == null) {
                    Intrinsics.m88391r("frag");
                } else {
                    putongFrag3 = putongFrag7;
                }
                bnl0.m105515H0(vText8, putongFrag3.getString(R$string.f18515Hc));
            } else {
                bnl0.m105524M(newPrivilegeCard.get_free(), true);
                uqb0.f180374G.m127115L0(newPrivilegeCard.get_free(), "https://auto.tancdn.com/v1/raw/5d695179-2ea7-4391-8918-1bb9e3d4574b12.webp");
                VText vText9 = newPrivilegeCard.get_buy();
                PutongFrag putongFrag8 = newPrivilegeCard.frag;
                if (putongFrag8 == null) {
                    Intrinsics.m88391r("frag");
                } else {
                    putongFrag3 = putongFrag8;
                }
                bnl0.m105515H0(vText9, putongFrag3.getString(R$string.f18484Gc));
            }
        } else {
            bnl0.m105524M(newPrivilegeCard.get_free(), false);
            bnl0.m105515H0(newPrivilegeCard.get_buy(), iapAffiliatePromotionDisplaySlotM31175H3.mainTitle);
        }
        newPrivilegeCard.m44287l0();
    }

    @Override // com.p051p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager.InterfaceC8374b
    /* JADX INFO: renamed from: X */
    public void mo44285X(int count, @NotNull PutongFrag frag, @NotNull PurchaseType purchaseType) {
        frag.getClass();
        purchaseType.getClass();
        this.frag = frag;
        this.purchaseType = purchaseType;
        m44290o0(count);
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
        Intrinsics.m88391r("_bg_res");
        return null;
    }

    @NotNull
    public final VText get_buy() {
        VText vText = this._buy;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_buy");
        return null;
    }

    @NotNull
    public final FrameLayout get_buy_layout() {
        FrameLayout frameLayout = this._buy_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_buy_layout");
        return null;
    }

    @NotNull
    public final NewPrivilegeCard get_card_layout() {
        NewPrivilegeCard newPrivilegeCard = this._card_layout;
        if (newPrivilegeCard != null) {
            return newPrivilegeCard;
        }
        Intrinsics.m88391r("_card_layout");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_free() {
        VDraweeView vDraweeView = this._free;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_free");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_bg() {
        VDraweeView vDraweeView = this._privilege_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_privilege_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_icon() {
        VDraweeView vDraweeView = this._privilege_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_privilege_icon");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_privilege_svga() {
        SVGAnimationView sVGAnimationView = this._privilege_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_privilege_svga");
        return null;
    }

    @NotNull
    public final VDraweeView get_title_res() {
        VDraweeView vDraweeView = this._title_res;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_title_res");
        return null;
    }

    @NotNull
    public final VText get_upgrade_tag() {
        VText vText = this._upgrade_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_upgrade_tag");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m44286k0(View view) {
        rf40.m181167a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX INFO: renamed from: l0 */
    public final void m44287l0() {
        if (d79.m114677f0()) {
            return;
        }
        bnl0.m105524M(get_free(), false);
        if (d79.m114681h0()) {
            lc9 lc9Var = CoreModule.f18264c.f20311G2;
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = null;
            }
            if (!lc9Var.m153654l3(purchaseType)) {
                bnl0.m105524M(get_upgrade_tag(), false);
            }
        } else {
            bnl0.m105524M(get_upgrade_tag(), false);
        }
        if (d79.m114681h0()) {
            m44289n0();
        } else {
            m44288m0();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m44288m0() {
        String str;
        String str2;
        PurchaseType purchaseType = this.purchaseType;
        PutongFrag putongFrag = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            C4883c c4883c = CoreModule.f18264c;
            if (!c4883c.f20396j0.f20036g0) {
                IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31175H3 = c4883c.f20438x0.m31175H3("meTabSubscriptionCard");
                if (iapAffiliatePromotionDisplaySlotM31175H3 != null && (str2 = iapAffiliatePromotionDisplaySlotM31175H3.mainTitle) != null && str2.length() != 0) {
                    bnl0.m105515H0(get_buy(), iapAffiliatePromotionDisplaySlotM31175H3.mainTitle);
                    return;
                }
                CoreProduct coreProduct = CoreModule.f18264c.f20396j0;
                PurchaseType purchaseType2 = this.purchaseType;
                if (purchaseType2 == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType2 = null;
                }
                if (coreProduct.m31610S4(purchaseType2) && !CoreModule.f18264c.f20396j0.m31611T4()) {
                    VText vText = get_buy();
                    PutongFrag putongFrag2 = this.frag;
                    if (putongFrag2 == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag = putongFrag2;
                    }
                    bnl0.m105515H0(vText, putongFrag.getString(R$string.f18816R9));
                    return;
                }
                if (CoreModule.f18264c.f20438x0.m31188T3()) {
                    VText vText2 = get_buy();
                    PutongFrag putongFrag3 = this.frag;
                    if (putongFrag3 == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag = putongFrag3;
                    }
                    bnl0.m105515H0(vText2, putongFrag.getString(R$string.f18816R9));
                    return;
                }
            }
        }
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        if (lc9Var.m153654l3(purchaseType3)) {
            return;
        }
        PurchaseType purchaseType4 = this.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType4 = null;
        }
        int i = C8372a.f27338a[purchaseType4.ordinal()];
        if (i == 1) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            PutongFrag putongFrag4 = this.frag;
            if (putongFrag4 == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag = putongFrag4;
            }
            String string = putongFrag.getString(R$string.f19181db);
            string.getClass();
            str = String.format(string, Arrays.copyOf(new Object[]{"VIP"}, 1));
        } else if (i == 2) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            PutongFrag putongFrag5 = this.frag;
            if (putongFrag5 == null) {
                Intrinsics.m88391r("frag");
                putongFrag5 = null;
            }
            String string2 = putongFrag5.getString(R$string.f19181db);
            string2.getClass();
            PutongFrag putongFrag6 = this.frag;
            if (putongFrag6 == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag = putongFrag6;
            }
            str = String.format(string2, Arrays.copyOf(new Object[]{putongFrag.getString(R$string.f18680Mn)}, 1));
        } else if (i == 3) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            PutongFrag putongFrag7 = this.frag;
            if (putongFrag7 == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag = putongFrag7;
            }
            String string3 = putongFrag.getString(R$string.f19181db);
            string3.getClass();
            str = String.format(string3, Arrays.copyOf(new Object[]{"PREMIUM"}, 1));
        } else {
            if (i != 4) {
                return;
            }
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            PutongFrag putongFrag8 = this.frag;
            if (putongFrag8 == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag = putongFrag8;
            }
            String string4 = putongFrag.getString(R$string.f19181db);
            string4.getClass();
            str = String.format(string4, Arrays.copyOf(new Object[]{"Ultra Premium"}, 1));
        }
        bnl0.m105515H0(get_buy(), str);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m44289n0() {
        String str;
        PurchaseType purchaseType = this.purchaseType;
        PutongFrag putongFrag = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            C4883c c4883c = CoreModule.f18264c;
            if (!c4883c.f20396j0.f20036g0) {
                IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM31175H3 = c4883c.f20438x0.m31175H3("meTabSubscriptionCard");
                if (iapAffiliatePromotionDisplaySlotM31175H3 != null && (str = iapAffiliatePromotionDisplaySlotM31175H3.mainTitle) != null && str.length() != 0) {
                    bnl0.m105515H0(get_buy(), iapAffiliatePromotionDisplaySlotM31175H3.mainTitle);
                    return;
                }
                CoreProduct coreProduct = CoreModule.f18264c.f20396j0;
                PurchaseType purchaseType2 = this.purchaseType;
                if (purchaseType2 == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType2 = null;
                }
                if (coreProduct.m31610S4(purchaseType2) && !CoreModule.f18264c.f20396j0.m31611T4()) {
                    VText vText = get_buy();
                    PutongFrag putongFrag2 = this.frag;
                    if (putongFrag2 == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag = putongFrag2;
                    }
                    bnl0.m105515H0(vText, putongFrag.getString(R$string.f18816R9));
                    return;
                }
                if (CoreModule.f18264c.f20438x0.m31188T3()) {
                    VText vText2 = get_buy();
                    PutongFrag putongFrag3 = this.frag;
                    if (putongFrag3 == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag = putongFrag3;
                    }
                    bnl0.m105515H0(vText2, putongFrag.getString(R$string.f18816R9));
                    return;
                }
            }
        }
        lc9 lc9Var = CoreModule.f18264c.f20311G2;
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        if (lc9Var.m153654l3(purchaseType3)) {
            return;
        }
        VText vText3 = get_buy();
        PutongFrag putongFrag4 = this.frag;
        if (putongFrag4 == null) {
            Intrinsics.m88391r("frag");
        } else {
            putongFrag = putongFrag4;
        }
        bnl0.m105515H0(vText3, putongFrag.getString(R$string.f19150cb));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m44290o0(final int count) {
        if (this.subscription != null) {
            m44291p0();
            return;
        }
        PutongFrag putongFrag = this.frag;
        PurchaseType purchaseType = null;
        if (putongFrag == null) {
            Intrinsics.m88391r("frag");
            putongFrag = null;
        }
        PutongFrag putongFrag2 = this.frag;
        if (putongFrag2 == null) {
            Intrinsics.m88391r("frag");
            putongFrag2 = null;
        }
        Act act = putongFrag2.act();
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        kcg0 kcg0VarSubscribe = putongFrag.duringCreated(C8929e.m54827r(act, purchaseType)).subscribe(psd0.m173597H(new y20() { // from class: l.pf40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPrivilegeCard.m44284j0(this.f152153a, count, (C8928d) obj);
            }
        }, new y20() { // from class: l.qf40
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPrivilegeCard.m44283i0((Throwable) obj);
            }
        }));
        kcg0VarSubscribe.getClass();
        this.subscription = kcg0VarSubscribe;
        m44292q0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        for (int i = 0; (parent instanceof ViewGroup) && i < 4; i++) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            parent = viewGroup.getParent();
        }
    }

    @Override // android.view.View
    @RequiresApi(23)
    public void onFinishInflate() {
        super.onFinishInflate();
        m44286k0(this);
        setClipChildren(false);
        setClipToPadding(false);
        get_upgrade_tag().setTranslationY(-qa00.m175859d(5.0f));
        get_upgrade_tag().bringToFront();
        get_upgrade_tag().setElevation(qa00.m175859d(2.0f));
        bnl0.m105524M(get_buy(), false);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.of40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPrivilegeCard.m44282h0(this.f147038a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m44291p0() {
        get_privilege_svga().startAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0365  */
    /* JADX WARN: Code duplicated, block: B:58:0x036f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0373  */
    /* JADX WARN: Code duplicated, block: B:61:0x0377  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q0 */
    public final void m44292q0() {
        String string;
        String str;
        String str2;
        PutongFrag putongFrag;
        box boxVar = box.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        PutongFrag putongFrag2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        boxVar.m105730s(purchaseType);
        boolean zM108173c = c6p.INSTANCE.m108173c();
        bnl0.m105540X(get_title_res(), qa00.m175859d(20.0f));
        bnl0.m105505C0(get_buy(), qa00.f156335v);
        VText vText = get_buy();
        int i = qa00.f156322i;
        bnl0.m105540X(vText, i);
        bnl0.m105537U(get_buy_layout(), qa00.f156321h);
        bnl0.m105540X(get_buy_layout(), qa00.f156328o);
        FrameLayout frameLayout = get_buy_layout();
        int i2 = qa00.f156330q;
        bnl0.m105538V(frameLayout, i2);
        bnl0.m105540X(get_desc(), qa00.f156296I);
        bnl0.m105539W(get_privilege_svga(), qa00.m175859d(51.0f));
        bnl0.m105539W(get_privilege_icon(), qa00.m175859d(51.0f));
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        int i3 = C8372a.f27338a[purchaseType2.ordinal()];
        if (i3 == 1) {
            VText vText2 = get_buy();
            int i4 = qa00.f156323j;
            bnl0.m105550d0(vText2, i4);
            bnl0.m105552e0(get_buy(), i4);
            get_buy().setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80470x0));
            get_buy().setBackgroundResource(dbc0.f87082ia);
            bnl0.m105505C0(get_title_res(), i2);
            bnl0.m105507D0(qa00.m175859d(42.0f), get_title_res());
            uqb0.f180374G.m127115L0(get_title_res(), "https://auto.tancdn.com/v1/raw/9a8fb6c3-de8d-4e68-afc1-37e17faed05913.webp");
            uqb0.f180374G.m127115L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/0274da72-515d-4920-8256-4cdc3a49580513.webp");
            uqb0.f180374G.m127115L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/e8b29481-f896-46bc-ab7e-7e55e6ed79cd13.webp");
            boolean zMo34737Oi = gta.m132210e().m132214d().mo34737Oi();
            PutongFrag putongFrag3 = this.frag;
            if (zMo34737Oi) {
                if (putongFrag3 == null) {
                    Intrinsics.m88391r("frag");
                    putongFrag3 = null;
                }
                string = putongFrag3.getString(R$string.f19364jb);
            } else {
                if (putongFrag3 == null) {
                    Intrinsics.m88391r("frag");
                    putongFrag3 = null;
                }
                string = putongFrag3.getString(R$string.f19335ib);
            }
            string.getClass();
            bnl0.m105515H0(get_desc(), string);
            get_desc().setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80319A0));
            str = zM108173c ? "https://auto.tancdn.com/v1/raw/2ed0984b-7f46-42e2-822e-9d62b2b29e6512.webp" : "https://auto.tancdn.com/v1/raw/38e4b498-9444-4d29-a7ea-245d30cebe0e13.svga";
        } else if (i3 == 2) {
            VText vText3 = get_buy();
            int i5 = qa00.f156323j;
            bnl0.m105550d0(vText3, i5);
            bnl0.m105552e0(get_buy(), i5);
            get_buy().setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80455s0));
            get_buy().setBackgroundResource(dbc0.f86918da);
            bnl0.m105505C0(get_title_res(), i2);
            bnl0.m105507D0(qa00.m175859d(51.0f), get_title_res());
            uqb0.f180374G.m127115L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/f1cdf659-8636-4513-bcbd-1ddfb35eaf9812.webp");
            uqb0.f180374G.m127115L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/61e0afa6-ee39-4395-8db3-33bca36e2cce12.webp");
            uqb0.f180374G.m127115L0(get_title_res(), "https://auto.tancdn.com/v1/raw/ed139794-ad11-4eca-abb1-1e73dd0dd8bb13.webp");
            VText vText4 = get_desc();
            PutongFrag putongFrag4 = this.frag;
            if (putongFrag4 == null) {
                Intrinsics.m88391r("frag");
                putongFrag4 = null;
            }
            bnl0.m105515H0(vText4, putongFrag4.getString(R$string.f19088ab));
            get_desc().setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80473y0));
            str = zM108173c ? "https://auto.tancdn.com/v1/raw/921bb0ae-bdb9-42c8-b925-9a73055a03b812.webp" : "https://auto.tancdn.com/v1/raw/77496448-f42c-42bb-920e-17a31df068a012.svga";
        } else {
            if (i3 != 3) {
                str2 = "";
                if (i3 == 4) {
                    bnl0.m105550d0(get_buy(), 0);
                    bnl0.m105552e0(get_buy(), 0);
                    get_buy().setTextColor(Color.parseColor("#5F486A"));
                    get_buy().setBackgroundResource(dbc0.f86983fa);
                    bnl0.m105505C0(get_title_res(), qa00.f156337x);
                    bnl0.m105507D0(qa00.m175859d(124.0f), get_title_res());
                    bnl0.m105505C0(get_buy(), qa00.f156294G);
                    bnl0.m105540X(get_title_res(), qa00.m175859d(14.0f));
                    bnl0.m105537U(get_buy_layout(), 0);
                    bnl0.m105540X(get_buy(), 0);
                    bnl0.m105540X(get_desc(), qa00.f156295H);
                    bnl0.m105540X(get_buy_layout(), qa00.f156325l);
                    bnl0.m105538V(get_buy_layout(), i);
                    uqb0.f180374G.m127115L0(get_bg_res(), "");
                    uqb0.f180374G.m127115L0(get_privilege_bg(), "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9SNUgzRDNBS01DVU5BS0tSRVpPUU5UQ1RCNFdLTjE0IiwidyI6NjQwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5OTEwNjM0NjM5NzU2MTIzMTkzfQ.png");
                    uqb0.f180374G.m127115L0(get_title_res(), "https://auto.tancdn.com/v1/images/eyJpZCI6IkwzT0pSNklIRkEzQ0lVRFZKWVY2TUNaUU5SUjNPNTE0IiwidyI6MjQ4LCJoIjo3MiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyMjk4MTM4ODM3ODQ3NDU3MzB9.png");
                    if (IntlCountryCodeController.m29125v()) {
                        bnl0.m105515H0(get_desc(), k3d0.m148007c(R$string.f19868zj));
                    } else {
                        bnl0.m105515H0(get_desc(), k3d0.m148007c(R$string.f19837yj));
                    }
                    get_desc().setTextColor(Color.parseColor("#66FFFFFF"));
                    str = zM108173c ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVVSTdYN1YzM1lTU0tWRERJS0hGUTJBV0FXV1k3MjE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTkyMzcyNzE5ODQ3NTY0NTYzfQ.png" : "https://auto.tancdn.com/v1/raw/c4394906-acb9-4366-8edb-9b402f98cad114.svga";
                }
                bnl0.m105524M(get_privilege_svga(), !zM108173c);
                bnl0.m105524M(get_privilege_icon(), zM108173c);
                if (str2.length() > 0) {
                    if (zM108173c) {
                        uqb0.f180374G.m127115L0(get_privilege_icon(), str2);
                        return;
                    }
                    putongFrag = this.frag;
                    if (putongFrag == null) {
                        Intrinsics.m88391r("frag");
                    } else {
                        putongFrag2 = putongFrag;
                    }
                    Act act = putongFrag2.act();
                    act.getClass();
                    SVGALoader.with(act).repeatCount(1).autoPlay(false).from(str2).into(get_privilege_svga());
                }
            }
            VText vText5 = get_buy();
            int i6 = qa00.f156323j;
            bnl0.m105550d0(vText5, i6);
            bnl0.m105552e0(get_buy(), i6);
            get_buy().setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80387X));
            get_buy().setBackgroundResource(dbc0.f86852ba);
            bnl0.m105505C0(get_title_res(), i2);
            bnl0.m105507D0(qa00.m175859d(119.0f), get_title_res());
            uqb0.f180374G.m127115L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/2a997f14-1a0e-4f27-a886-7b570c7b253a12.webp");
            uqb0.f180374G.m127115L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/05a984c6-bbd6-46e7-aa86-3b4a1f0f6afe12.webp");
            uqb0.f180374G.m127115L0(get_title_res(), "https://auto.tancdn.com/v1/raw/095c2e1d-f854-455a-bdb7-b18c5dca6d3513.webp");
            if (d79.m114663V()) {
                bnl0.m105515H0(get_desc(), k3d0.m148007c(R$string.f19806xj));
            } else {
                bnl0.m105515H0(get_desc(), k3d0.m148007c(R$string.f18997Xa));
            }
            get_desc().setTextColor(Color.parseColor("#A38F5F"));
            str = zM108173c ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41VUVTQVdKWERXWVBCNEZXVVNWT0VJT0hGRFIyVTE0IiwidyI6MjQwLCJoIjoyNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MjIwMTE5ODU2NzcwNjk1OTh9.png" : "https://auto.tancdn.com/v1/raw/60258e67-0a45-4eeb-8a7c-69c0a14d319614.svga";
        }
        str2 = str;
        bnl0.m105524M(get_privilege_svga(), !zM108173c);
        bnl0.m105524M(get_privilege_icon(), zM108173c);
        if (str2.length() > 0) {
            if (zM108173c) {
                uqb0.f180374G.m127115L0(get_privilege_icon(), str2);
                return;
            }
            putongFrag = this.frag;
            if (putongFrag == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag2 = putongFrag;
            }
            Act act2 = putongFrag2.act();
            act2.getClass();
            SVGALoader.with(act2).repeatCount(1).autoPlay(false).from(str2).into(get_privilege_svga());
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: r0 */
    public final void m44293r0() {
        C8247a c8247aM40805Z5;
        box boxVar = box.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        PutongFrag putongFrag = null;
        PutongFrag putongFrag2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        boxVar.m105729r(purchaseType);
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        int i = C8372a.f27338a[purchaseType2.ordinal()];
        if (i == 1) {
            PutongFrag putongFrag3 = this.frag;
            if (putongFrag3 == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag = putongFrag3;
            }
            C8927c.m54601O1(putongFrag.act(), "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, false, null, null, null, 508, null);
            return;
        }
        if (i == 2) {
            PutongFrag putongFrag4 = this.frag;
            if (putongFrag4 == null) {
                Intrinsics.m88391r("frag");
            } else {
                putongFrag2 = putongFrag4;
            }
            C8927c.m54571E1(putongFrag2.act(), "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, 28, null);
            return;
        }
        if (i == 3) {
            FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
            String str = (freeTrialDataM31579C4 == null || TextUtils.isEmpty(freeTrialDataM31579C4.skuId)) ? "p_navigation_view,e_intl_me_subscription_card,click" : "p_suggest_users_home_view,e_premium_promo_50off_card,click";
            Activity activityM105508E = bnl0.m105508E(this);
            activityM105508E.getClass();
            C8927c.m54567D0((Act) activityM105508E, str, null, null, null, 0, null, null, null, null, false, false, 4092, null);
            return;
        }
        if (i != 4) {
            return;
        }
        if (CoreModule.f18264c.f20311G2.m153652j3()) {
            CoreModule.f18264c.f20311G2.m153660r3();
            PutongFrag putongFrag5 = this.frag;
            if (putongFrag5 == null) {
                Intrinsics.m88391r("frag");
                putongFrag5 = null;
            }
            Act act = putongFrag5.act();
            NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
            if (newMainAct != null && (c8247aM40805Z5 = newMainAct.m40805Z5()) != null) {
                c8247aM40805Z5.m41261A9();
            }
        }
        Activity activityM105508E2 = bnl0.m105508E(this);
        activityM105508E2.getClass();
        C8927c.m54597N0((Act) activityM105508E2, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m44294s0() {
        box boxVar = box.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        boxVar.m105729r(purchaseType);
        Activity activityM105508E = bnl0.m105508E(this);
        Act act = activityM105508E instanceof Act ? (Act) activityM105508E : null;
        if (act == null) {
            return;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType2 = null;
        }
        int i = C8372a.f27338a[purchaseType2.ordinal()];
        if (i == 1) {
            C8927c.m54567D0(act, "p_navigation_view,e_intl_me_subscription_card,click", null, PurchaseType.TYPE_GET_VIP, null, 0, null, null, null, null, false, false, 4052, null);
            return;
        }
        if (i == 2) {
            C8927c.m54571E1(act, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, 28, null);
            return;
        }
        if (i == 3) {
            FreeTrialData freeTrialDataM31579C4 = CoreModule.f18264c.f20396j0.m31579C4();
            C8927c.m54567D0(act, (freeTrialDataM31579C4 == null || TextUtils.isEmpty(freeTrialDataM31579C4.skuId)) ? "p_navigation_view,e_intl_me_subscription_card,click" : "p_suggest_users_home_view,e_premium_promo_50off_card,click", null, null, null, 0, null, null, null, null, false, false, 4092, null);
        } else {
            if (i != 4) {
                return;
            }
            if (joa.m146396k4()) {
                C8927c.m54597N0(act, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, null, null, 124, null);
            } else {
                ge90.m129971e(act, "MINE_SUB_ITEM", null, d79.m114653L() ? new j0p() : new ful0());
            }
        }
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
