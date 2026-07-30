package com.p046p1.mobile.putong.core.newui.profile.newme;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreProduct;
import com.p046p1.mobile.putong.core.data.FreeTrialData;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotionDisplaySlot;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.main.C8096a;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.newme.NewPrivilegeCard;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p147v.VDraweeView;
import p147v.VText;
import p149l.c4g0;
import p149l.c4p;
import p149l.cb9;
import p149l.d740;
import p149l.dfx;
import p149l.e30;
import p149l.h6a;
import p149l.hvc0;
import p149l.mkd0;
import p149l.n6a;
import p149l.qib0;
import p149l.t100;
import p149l.u59;
import p149l.ura;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001f\u0010\u0016J\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0016R\"\u0010'\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00103\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u00107\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010K\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010*\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010.R\"\u0010O\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\"\u0010W\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bX\u0010*\u001a\u0004\bY\u0010,\"\u0004\bZ\u0010.R\"\u0010_\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010B\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0017\u0010m\u001a\u00020h8\u0006¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006n"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/p1/mobile/putong/core/newui/profile/newme/NewProfilePrivilegedPager$b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "k0", "(Landroid/view/View;)V", "count", "l0", "(I)V", "o0", "()V", "onFinishInflate", "onAttachedToWindow", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "X", "(ILcom/p1/mobile/putong/app/PutongFrag;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "n0", "m0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "get_card_layout", "()Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;", "set_card_layout", "(Lcom/p1/mobile/putong/core/newui/profile/newme/NewPrivilegeCard;)V", "_card_layout", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_privilege_bg", "()Lv/VDraweeView;", "set_privilege_bg", "(Lv/VDraweeView;)V", "_privilege_bg", "f", "get_title_res", "set_title_res", "_title_res", "g", "get_bg_res", "set_bg_res", "_bg_res", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "get_buy_layout", "()Landroid/widget/FrameLayout;", "set_buy_layout", "(Landroid/widget/FrameLayout;)V", "_buy_layout", "Lv/VText;", RXScreenCaptureService.KEY_INDEX, "Lv/VText;", "get_buy", "()Lv/VText;", "set_buy", "(Lv/VText;)V", "_buy", "j", "get_free", "set_free", "_free", "k", "get_desc", "set_desc", "_desc", "Lcom/tantan/library/svga/SVGAnimationView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/tantan/library/svga/SVGAnimationView;", "get_privilege_svga", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_privilege_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_privilege_svga", "m", "get_privilege_icon", "set_privilege_icon", "_privilege_icon", "n", "get_upgrade_tag", "set_upgrade_tag", "_upgrade_tag", "o", "Lcom/p1/mobile/putong/app/PutongFrag;", "p", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ll/c4g0;", "q", "Ll/c4g0;", "subscription", "Ljava/text/NumberFormat;", "r", "Ljava/text/NumberFormat;", "getNumberFormat", "()Ljava/text/NumberFormat;", "numberFormat", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NewPrivilegeCard extends ConstraintLayout implements NewProfilePrivilegedPager.InterfaceC8223b {

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
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8221a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26596a;

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
            f26596a = iArr;
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
    public static void m43271h0(NewPrivilegeCard newPrivilegeCard, View view) {
        PurchaseType purchaseType = newPrivilegeCard.purchaseType;
        PutongFrag putongFrag = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f17545c.f19696x0.m30179I3() != null) {
            newPrivilegeCard.m43279o0();
            return;
        }
        CoreProduct coreProduct = CoreModule.f17545c.f19654j0;
        PurchaseType purchaseType2 = newPrivilegeCard.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType2 = null;
        }
        if (!coreProduct.m30607S4(purchaseType2)) {
            newPrivilegeCard.m43279o0();
            return;
        }
        if (CoreModule.f17545c.f19654j0.m30608T4()) {
            newPrivilegeCard.m43279o0();
            return;
        }
        FreeTrialData freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4();
        if (freeTrialDataM30576C4 == null || TextUtils.isEmpty(freeTrialDataM30576C4.titleText) || TextUtils.isEmpty(freeTrialDataM30576C4.promotionUrl)) {
            return;
        }
        PutongFrag putongFrag2 = newPrivilegeCard.frag;
        if (putongFrag2 == null) {
            Intrinsics.m87502r("frag");
            putongFrag2 = null;
        }
        Intent intentM80165a2 = WebViewAct.m80165a2(putongFrag2.act(), freeTrialDataM30576C4.titleText, freeTrialDataM30576C4.promotionUrl, true);
        intentM80165a2.putExtra("hideNavigationBar", true);
        PutongFrag putongFrag3 = newPrivilegeCard.frag;
        if (putongFrag3 == null) {
            Intrinsics.m87502r("frag");
        } else {
            putongFrag = putongFrag3;
        }
        putongFrag.act().startActivity(intentM80165a2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m43272i0(Throwable th) {
    }

    /* JADX INFO: renamed from: j0 */
    public static void m43273j0(NewPrivilegeCard newPrivilegeCard, int i, C8765d c8765d) {
        String str;
        C8765d.a aVarM53520b = c8765d.m53520b();
        if (!NullChecker.m81303a(aVarM53520b)) {
            aVarM53520b = c8765d.m53522d();
        }
        VText vText = newPrivilegeCard.get_upgrade_tag();
        PutongFrag putongFrag = newPrivilegeCard.frag;
        PutongFrag putongFrag2 = null;
        if (putongFrag == null) {
            Intrinsics.m87502r("frag");
            putongFrag = null;
        }
        xdl0.m208335H0(vText, putongFrag.getString(R$string.f17673Dg));
        xdl0.m208344M(newPrivilegeCard.get_buy(), true);
        xdl0.m208344M(newPrivilegeCard.get_upgrade_tag(), false);
        String strM53643q = C8766e.m53643q(aVarM53520b);
        PurchaseType purchaseType = newPrivilegeCard.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        IapAffiliatePromotionDisplaySlot iapAffiliatePromotionDisplaySlotM30177H3 = purchaseType == purchaseType2 ? CoreModule.f17545c.f19696x0.m30177H3("meTabSubscriptionCard") : null;
        if (iapAffiliatePromotionDisplaySlotM30177H3 != null && (str = iapAffiliatePromotionDisplaySlotM30177H3.mainTitle) != null && str.length() != 0) {
            xdl0.m208344M(newPrivilegeCard.get_free(), false);
            xdl0.m208335H0(newPrivilegeCard.get_buy(), iapAffiliatePromotionDisplaySlotM30177H3.mainTitle);
            return;
        }
        CoreProduct coreProduct = CoreModule.f17545c.f19654j0;
        PurchaseType purchaseType3 = newPrivilegeCard.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType3 = null;
        }
        if (coreProduct.m30607S4(purchaseType3)) {
            if (CoreModule.f17545c.f19654j0.m30608T4()) {
                xdl0.m208344M(newPrivilegeCard.get_free(), true);
                qib0.f154691G.m102331L0(newPrivilegeCard.get_free(), "https://auto.tancdn.com/v1/raw/4d10c2e4-323c-4788-b8c1-3d602e9fc6e814.webp");
                VText vText2 = newPrivilegeCard.get_buy();
                PutongFrag putongFrag3 = newPrivilegeCard.frag;
                if (putongFrag3 == null) {
                    Intrinsics.m87502r("frag");
                } else {
                    putongFrag2 = putongFrag3;
                }
                xdl0.m208335H0(vText2, putongFrag2.getString(R$string.f18911sc));
                return;
            }
            xdl0.m208344M(newPrivilegeCard.get_free(), true);
            qib0.f154691G.m102331L0(newPrivilegeCard.get_free(), "https://auto.tancdn.com/v1/raw/5d695179-2ea7-4391-8918-1bb9e3d4574b12.webp");
            VText vText3 = newPrivilegeCard.get_buy();
            PutongFrag putongFrag4 = newPrivilegeCard.frag;
            if (putongFrag4 == null) {
                Intrinsics.m87502r("frag");
            } else {
                putongFrag2 = putongFrag4;
            }
            xdl0.m208335H0(vText3, putongFrag2.getString(R$string.f18881rc));
            return;
        }
        cb9 cb9Var = CoreModule.f17545c.f19569G2;
        PurchaseType purchaseType4 = newPrivilegeCard.purchaseType;
        if (purchaseType4 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType4 = null;
        }
        if (!cb9Var.m105984l3(purchaseType4)) {
            if (!h6a.m129470c()) {
                PurchaseType purchaseType5 = newPrivilegeCard.purchaseType;
                if (purchaseType5 == null) {
                    Intrinsics.m87502r("purchaseType");
                    purchaseType5 = null;
                }
                if (purchaseType5 == purchaseType2) {
                    if (i < (u59.m191812U() ? 4 : 3)) {
                        VText vText4 = newPrivilegeCard.get_buy();
                        PutongFrag putongFrag5 = newPrivilegeCard.frag;
                        if (putongFrag5 == null) {
                            Intrinsics.m87502r("frag");
                        } else {
                            putongFrag2 = putongFrag5;
                        }
                        xdl0.m208335H0(vText4, putongFrag2.getString(R$string.f17913Lg));
                        return;
                    }
                }
            }
            VText vText5 = newPrivilegeCard.get_buy();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            PutongFrag putongFrag6 = newPrivilegeCard.frag;
            if (putongFrag6 == null) {
                Intrinsics.m87502r("frag");
            } else {
                putongFrag2 = putongFrag6;
            }
            String string = putongFrag2.getString(R$string.f18147Ta);
            string.getClass();
            xdl0.m208335H0(vText5, String.format(string, Arrays.copyOf(new Object[]{strM53643q}, 1)));
            return;
        }
        xdl0.m208344M(newPrivilegeCard.get_upgrade_tag(), true);
        PurchaseType purchaseType6 = newPrivilegeCard.purchaseType;
        if (purchaseType6 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType6 = null;
        }
        if (purchaseType6 == PurchaseType.TYPE_ULTRA_PREMIUM && CoreModule.f17545c.f19569G2.m105982j3()) {
            VText vText6 = newPrivilegeCard.get_upgrade_tag();
            PutongFrag putongFrag7 = newPrivilegeCard.frag;
            if (putongFrag7 == null) {
                Intrinsics.m87502r("frag");
                putongFrag7 = null;
            }
            xdl0.m208335H0(vText6, putongFrag7.getString(R$string.f18390bc));
        }
        newPrivilegeCard.numberFormat.setMaximumFractionDigits(2);
        int iM158032t0 = n6a.m158032t0(aVarM53520b.m53601s());
        NumberFormat numberFormat = newPrivilegeCard.numberFormat;
        String str2 = iM158032t0 > 0 ? numberFormat.format(aVarM53520b.m53602t() / ((double) iM158032t0)) : numberFormat.format(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        String str3 = aVarM53520b.m53583h() + str2;
        VText vText7 = newPrivilegeCard.get_buy();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        PutongFrag putongFrag8 = newPrivilegeCard.frag;
        if (putongFrag8 == null) {
            Intrinsics.m87502r("frag");
        } else {
            putongFrag2 = putongFrag8;
        }
        String string2 = putongFrag2.getString(R$string.f17703Eg);
        string2.getClass();
        xdl0.m208335H0(vText7, String.format(string2, Arrays.copyOf(new Object[]{str3}, 1)));
    }

    @Override // com.p046p1.mobile.putong.core.newui.profile.newme.NewProfilePrivilegedPager.InterfaceC8223b
    /* JADX INFO: renamed from: X */
    public void mo43274X(int count, @NotNull PutongFrag frag, @NotNull PurchaseType purchaseType) {
        frag.getClass();
        purchaseType.getClass();
        this.frag = frag;
        this.purchaseType = purchaseType;
        m43276l0(count);
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
        Intrinsics.m87502r("_bg_res");
        return null;
    }

    @NotNull
    public final VText get_buy() {
        VText vText = this._buy;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_buy");
        return null;
    }

    @NotNull
    public final FrameLayout get_buy_layout() {
        FrameLayout frameLayout = this._buy_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_buy_layout");
        return null;
    }

    @NotNull
    public final NewPrivilegeCard get_card_layout() {
        NewPrivilegeCard newPrivilegeCard = this._card_layout;
        if (newPrivilegeCard != null) {
            return newPrivilegeCard;
        }
        Intrinsics.m87502r("_card_layout");
        return null;
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_free() {
        VDraweeView vDraweeView = this._free;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_free");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_bg() {
        VDraweeView vDraweeView = this._privilege_bg;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_privilege_bg");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_icon() {
        VDraweeView vDraweeView = this._privilege_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_privilege_icon");
        return null;
    }

    @NotNull
    public final SVGAnimationView get_privilege_svga() {
        SVGAnimationView sVGAnimationView = this._privilege_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_privilege_svga");
        return null;
    }

    @NotNull
    public final VDraweeView get_title_res() {
        VDraweeView vDraweeView = this._title_res;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_title_res");
        return null;
    }

    @NotNull
    public final VText get_upgrade_tag() {
        VText vText = this._upgrade_tag;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_upgrade_tag");
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m43275k0(View view) {
        d740.m110217a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m43276l0(final int count) {
        if (this.subscription != null) {
            m43277m0();
            return;
        }
        PutongFrag putongFrag = this.frag;
        PurchaseType purchaseType = null;
        if (putongFrag == null) {
            Intrinsics.m87502r("frag");
            putongFrag = null;
        }
        PutongFrag putongFrag2 = this.frag;
        if (putongFrag2 == null) {
            Intrinsics.m87502r("frag");
            putongFrag2 = null;
        }
        Act act = putongFrag2.act();
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        c4g0 c4g0VarSubscribe = putongFrag.duringCreated(C8766e.m53644r(act, purchaseType)).subscribe(mkd0.m154956H(new e30() { // from class: l.b740
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPrivilegeCard.m43273j0(this.f73901a, count, (C8765d) obj);
            }
        }, new e30() { // from class: l.c740
            @Override // p149l.e30
            public final void call(Object obj) {
                NewPrivilegeCard.m43272i0((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.subscription = c4g0VarSubscribe;
        m43278n0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m43277m0() {
        get_privilege_svga().startAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0365  */
    /* JADX WARN: Code duplicated, block: B:58:0x036f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0373  */
    /* JADX WARN: Code duplicated, block: B:61:0x0377  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n0 */
    public final void m43278n0() {
        String string;
        String str;
        String str2;
        PutongFrag putongFrag;
        dfx dfxVar = dfx.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        PutongFrag putongFrag2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        dfxVar.m111525p(purchaseType);
        boolean zM105236c = c4p.INSTANCE.m105236c();
        xdl0.m208360X(get_title_res(), t100.m186890d(20.0f));
        xdl0.m208325C0(get_buy(), t100.f167273v);
        VText vText = get_buy();
        int i = t100.f167260i;
        xdl0.m208360X(vText, i);
        xdl0.m208357U(get_buy_layout(), t100.f167259h);
        xdl0.m208360X(get_buy_layout(), t100.f167266o);
        FrameLayout frameLayout = get_buy_layout();
        int i2 = t100.f167268q;
        xdl0.m208358V(frameLayout, i2);
        xdl0.m208360X(get_desc(), t100.f167234I);
        xdl0.m208359W(get_privilege_svga(), t100.m186890d(51.0f));
        xdl0.m208359W(get_privilege_icon(), t100.m186890d(51.0f));
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType2 = null;
        }
        int i3 = C8221a.f26596a[purchaseType2.ordinal()];
        if (i3 == 1) {
            VText vText2 = get_buy();
            int i4 = t100.f167261j;
            xdl0.m208370d0(vText2, i4);
            xdl0.m208372e0(get_buy(), i4);
            get_buy().setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183897w0));
            get_buy().setBackgroundResource(x2c0.f190199ha);
            xdl0.m208325C0(get_title_res(), i2);
            xdl0.m208327D0(t100.m186890d(42.0f), get_title_res());
            qib0.f154691G.m102331L0(get_title_res(), "https://auto.tancdn.com/v1/raw/9a8fb6c3-de8d-4e68-afc1-37e17faed05913.webp");
            qib0.f154691G.m102331L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/0274da72-515d-4920-8256-4cdc3a49580513.webp");
            qib0.f154691G.m102331L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/e8b29481-f896-46bc-ab7e-7e55e6ed79cd13.webp");
            boolean zMo33734Oi = ura.m195053e().m195057d().mo33734Oi();
            PutongFrag putongFrag3 = this.frag;
            if (zMo33734Oi) {
                if (putongFrag3 == null) {
                    Intrinsics.m87502r("frag");
                    putongFrag3 = null;
                }
                string = putongFrag3.getString(R$string.f18207Va);
            } else {
                if (putongFrag3 == null) {
                    Intrinsics.m87502r("frag");
                    putongFrag3 = null;
                }
                string = putongFrag3.getString(R$string.f18177Ua);
            }
            string.getClass();
            xdl0.m208335H0(get_desc(), string);
            get_desc().setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183906z0));
            str = zM105236c ? "https://auto.tancdn.com/v1/raw/2ed0984b-7f46-42e2-822e-9d62b2b29e6512.webp" : "https://auto.tancdn.com/v1/raw/38e4b498-9444-4d29-a7ea-245d30cebe0e13.svga";
        } else if (i3 == 2) {
            VText vText3 = get_buy();
            int i5 = t100.f167261j;
            xdl0.m208370d0(vText3, i5);
            xdl0.m208372e0(get_buy(), i5);
            get_buy().setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183882r0));
            get_buy().setBackgroundResource(x2c0.f190040ca);
            xdl0.m208325C0(get_title_res(), i2);
            xdl0.m208327D0(t100.m186890d(51.0f), get_title_res());
            qib0.f154691G.m102331L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/f1cdf659-8636-4513-bcbd-1ddfb35eaf9812.webp");
            qib0.f154691G.m102331L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/61e0afa6-ee39-4395-8db3-33bca36e2cce12.webp");
            qib0.f154691G.m102331L0(get_title_res(), "https://auto.tancdn.com/v1/raw/ed139794-ad11-4eca-abb1-1e73dd0dd8bb13.webp");
            VText vText4 = get_desc();
            PutongFrag putongFrag4 = this.frag;
            if (putongFrag4 == null) {
                Intrinsics.m87502r("frag");
                putongFrag4 = null;
            }
            xdl0.m208335H0(vText4, putongFrag4.getString(R$string.f17997Oa));
            get_desc().setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183900x0));
            str = zM105236c ? "https://auto.tancdn.com/v1/raw/921bb0ae-bdb9-42c8-b925-9a73055a03b812.webp" : "https://auto.tancdn.com/v1/raw/77496448-f42c-42bb-920e-17a31df068a012.svga";
        } else {
            if (i3 != 3) {
                str2 = "";
                if (i3 == 4) {
                    xdl0.m208370d0(get_buy(), 0);
                    xdl0.m208372e0(get_buy(), 0);
                    get_buy().setTextColor(Color.parseColor("#5F486A"));
                    get_buy().setBackgroundResource(x2c0.f190103ea);
                    xdl0.m208325C0(get_title_res(), t100.f167275x);
                    xdl0.m208327D0(t100.m186890d(124.0f), get_title_res());
                    xdl0.m208325C0(get_buy(), t100.f167232G);
                    xdl0.m208360X(get_title_res(), t100.m186890d(14.0f));
                    xdl0.m208357U(get_buy_layout(), 0);
                    xdl0.m208360X(get_buy(), 0);
                    xdl0.m208360X(get_desc(), t100.f167233H);
                    xdl0.m208360X(get_buy_layout(), t100.f167263l);
                    xdl0.m208358V(get_buy_layout(), i);
                    qib0.f154691G.m102331L0(get_bg_res(), "");
                    qib0.f154691G.m102331L0(get_privilege_bg(), "https://auto.tancdn.com/v1/images/eyJpZCI6Ik9SNUgzRDNBS01DVU5BS0tSRVpPUU5UQ1RCNFdLTjE0IiwidyI6NjQwLCJoIjozMDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo5OTEwNjM0NjM5NzU2MTIzMTkzfQ.png");
                    qib0.f154691G.m102331L0(get_title_res(), "https://auto.tancdn.com/v1/images/eyJpZCI6IkwzT0pSNklIRkEzQ0lVRFZKWVY2TUNaUU5SUjNPNTE0IiwidyI6MjQ4LCJoIjo3MiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQyMjk4MTM4ODM3ODQ3NDU3MzB9.png");
                    if (IntlCountryCodeController.m28126v()) {
                        xdl0.m208335H0(get_desc(), hvc0.m133156c(R$string.f18459dj));
                    } else {
                        xdl0.m208335H0(get_desc(), hvc0.m133156c(R$string.f18428cj));
                    }
                    get_desc().setTextColor(Color.parseColor("#66FFFFFF"));
                    str = zM105236c ? "https://auto.tancdn.com/v1/images/eyJpZCI6IkVVSTdYN1YzM1lTU0tWRERJS0hGUTJBV0FXV1k3MjE0IiwidyI6MTYwLCJoIjoxNjAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozMTkyMzcyNzE5ODQ3NTY0NTYzfQ.png" : "https://auto.tancdn.com/v1/raw/c4394906-acb9-4366-8edb-9b402f98cad114.svga";
                }
                xdl0.m208344M(get_privilege_svga(), !zM105236c);
                xdl0.m208344M(get_privilege_icon(), zM105236c);
                if (str2.length() > 0) {
                    if (zM105236c) {
                        qib0.f154691G.m102331L0(get_privilege_icon(), str2);
                        return;
                    }
                    putongFrag = this.frag;
                    if (putongFrag == null) {
                        Intrinsics.m87502r("frag");
                    } else {
                        putongFrag2 = putongFrag;
                    }
                    Act act = putongFrag2.act();
                    act.getClass();
                    SVGALoader.with(act).repeatCount(1).autoPlay(false).from(str2).into(get_privilege_svga());
                }
            }
            VText vText5 = get_buy();
            int i6 = t100.f167261j;
            xdl0.m208370d0(vText5, i6);
            xdl0.m208372e0(get_buy(), i6);
            get_buy().setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183815W));
            get_buy().setBackgroundResource(x2c0.f189976aa);
            xdl0.m208325C0(get_title_res(), i2);
            xdl0.m208327D0(t100.m186890d(119.0f), get_title_res());
            qib0.f154691G.m102331L0(get_bg_res(), "https://auto.tancdn.com/v1/raw/2a997f14-1a0e-4f27-a886-7b570c7b253a12.webp");
            qib0.f154691G.m102331L0(get_privilege_bg(), "https://auto.tancdn.com/v1/raw/05a984c6-bbd6-46e7-aa86-3b4a1f0f6afe12.webp");
            qib0.f154691G.m102331L0(get_title_res(), "https://auto.tancdn.com/v1/raw/095c2e1d-f854-455a-bdb7-b18c5dca6d3513.webp");
            if (u59.m191812U()) {
                xdl0.m208335H0(get_desc(), hvc0.m133156c(R$string.f18397bj));
            } else {
                xdl0.m208335H0(get_desc(), hvc0.m133156c(R$string.f17937Ma));
            }
            get_desc().setTextColor(Color.parseColor("#A38F5F"));
            str = zM105236c ? "https://auto.tancdn.com/v1/images/eyJpZCI6Ik41VUVTQVdKWERXWVBCNEZXVVNWT0VJT0hGRFIyVTE0IiwidyI6MjQwLCJoIjoyNDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3MjIwMTE5ODU2NzcwNjk1OTh9.png" : "https://auto.tancdn.com/v1/raw/60258e67-0a45-4eeb-8a7c-69c0a14d319614.svga";
        }
        str2 = str;
        xdl0.m208344M(get_privilege_svga(), !zM105236c);
        xdl0.m208344M(get_privilege_icon(), zM105236c);
        if (str2.length() > 0) {
            if (zM105236c) {
                qib0.f154691G.m102331L0(get_privilege_icon(), str2);
                return;
            }
            putongFrag = this.frag;
            if (putongFrag == null) {
                Intrinsics.m87502r("frag");
            } else {
                putongFrag2 = putongFrag;
            }
            Act act2 = putongFrag2.act();
            act2.getClass();
            SVGALoader.with(act2).repeatCount(1).autoPlay(false).from(str2).into(get_privilege_svga());
        }
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: o0 */
    public final void m43279o0() {
        C8096a c8096aM39794V5;
        dfx dfxVar = dfx.INSTANCE;
        PurchaseType purchaseType = this.purchaseType;
        PutongFrag putongFrag = null;
        PutongFrag putongFrag2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        dfxVar.m111524o(purchaseType);
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType2 = null;
        }
        int i = C8221a.f26596a[purchaseType2.ordinal()];
        if (i == 1) {
            PutongFrag putongFrag3 = this.frag;
            if (putongFrag3 == null) {
                Intrinsics.m87502r("frag");
            } else {
                putongFrag = putongFrag3;
            }
            C8764c.m53418O1(putongFrag.act(), "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, false, null, null, null, 508, null);
            return;
        }
        if (i == 2) {
            PutongFrag putongFrag4 = this.frag;
            if (putongFrag4 == null) {
                Intrinsics.m87502r("frag");
            } else {
                putongFrag2 = putongFrag4;
            }
            C8764c.m53388E1(putongFrag2.act(), "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, 28, null);
            return;
        }
        if (i == 3) {
            FreeTrialData freeTrialDataM30576C4 = CoreModule.f17545c.f19654j0.m30576C4();
            String str = (freeTrialDataM30576C4 == null || TextUtils.isEmpty(freeTrialDataM30576C4.skuId)) ? "p_navigation_view,e_intl_me_subscription_card,click" : "p_suggest_users_home_view,e_premium_promo_50off_card,click";
            Activity activityM208328E = xdl0.m208328E(this);
            activityM208328E.getClass();
            C8764c.m53384D0((Act) activityM208328E, str, null, null, null, 0, null, null, null, null, false, false, 4092, null);
            return;
        }
        if (i != 4) {
            return;
        }
        if (CoreModule.f17545c.f19569G2.m105982j3()) {
            CoreModule.f17545c.f19569G2.m105990r3();
            PutongFrag putongFrag5 = this.frag;
            if (putongFrag5 == null) {
                Intrinsics.m87502r("frag");
                putongFrag5 = null;
            }
            Act act = putongFrag5.act();
            NewMainAct newMainAct = act instanceof NewMainAct ? (NewMainAct) act : null;
            if (newMainAct != null && (c8096aM39794V5 = newMainAct.m39794V5()) != null) {
                c8096aM39794V5.m40449x9();
            }
        }
        Activity activityM208328E2 = xdl0.m208328E(this);
        activityM208328E2.getClass();
        C8764c.m53414N0((Act) activityM208328E2, "p_navigation_view,e_intl_me_subscription_card,click", null, null, null, null, null, 124, null);
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
        m43275k0(this);
        setClipChildren(false);
        setClipToPadding(false);
        get_upgrade_tag().setTranslationY(-t100.m186890d(5.0f));
        get_upgrade_tag().bringToFront();
        get_upgrade_tag().setElevation(t100.m186890d(2.0f));
        xdl0.m208344M(get_buy(), false);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.a740
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewPrivilegeCard.m43271h0(this.f67838a, view);
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
