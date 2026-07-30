package p149l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.PurchaseUpgradeIntroView;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010K\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010PR\"\u0010V\u001a\u0010\u0012\f\u0012\n T*\u0004\u0018\u00010S0S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010e¨\u0006g"}, m87232d2 = {"Ll/yab0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "purchaseShowFrom", "Lcom/p1/mobile/putong/core/data/Merchandise;", "noneRenewableMerchandise", "autoRenewableMerchandise", "", FirebaseAnalytics.Event.REFUND, "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/Long;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "e", "(Landroid/view/View;)V", "p", "()V", BLiveStormDanmakuGiftResourceType.f44446s, "u", "r", "q", "skus", "w", "(Ljava/lang/String;)V", "k", "()Ljava/lang/String;", ResourceDirection.f38808v, "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getPurchaseShowFrom", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", "getNoneRenewableMerchandise", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "getAutoRenewableMerchandise", "f", "Ljava/lang/Long;", "getRefund", "()Ljava/lang/Long;", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "o", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_intro_root", "(Landroid/widget/FrameLayout;)V", "_intro_root", RXScreenCaptureService.KEY_INDEX, "n", "set_payment_root", "_payment_root", "j", BLiveStormDanmakuGiftResourceType.f44444l, "set_agreement_root", "_agreement_root", "Ll/cwf0;", "Ll/cwf0;", "statisticsPageHelper", "Ll/hab0;", "Ll/hab0;", "purchaseTrack", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "Ll/j5b0;", "Ll/j5b0;", "mediator", "Ll/dd80;", "Ll/dd80;", OMSTemplateType.dialog, "", "Ll/d1m;", "Ljava/util/List;", "purchaseComponentsList", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "_intro_view", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class yab0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String purchaseShowFrom;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Merchandise noneRenewableMerchandise;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Merchandise autoRenewableMerchandise;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Long refund;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public LinearLayout _root;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public FrameLayout _intro_root;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _payment_root;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public FrameLayout _agreement_root;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public hab0 purchaseTrack;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public dd80 dialog;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public PurchaseUpgradeIntroView _intro_view;

    /* JADX INFO: renamed from: l.yab0$a */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/yab0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21347a implements AbstractC8776a.e {
        public C21347a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.e
        /* JADX INFO: renamed from: a */
        public void mo53996a(List<? extends C8765d> sections) {
            sections.getClass();
            String strM200307U = vwb.m200307U(iab0.m135149j(sections), Constants.SEPARATOR_COMMA);
            yab0 yab0Var = yab0.this;
            strM200307U.getClass();
            yab0Var.m213830w(strM200307U);
        }
    }

    /* JADX INFO: renamed from: l.yab0$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/yab0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21348b implements AbstractC8776a.d {
        public C21348b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
        /* JADX INFO: renamed from: a */
        public void mo53997a(C8765d section, boolean scroll, boolean isClick, C8765d sectionSource) {
            section.getClass();
            yab0.this.currentPurchaseSection = section;
            PurchaseUpgradeIntroView purchaseUpgradeIntroView = yab0.this._intro_view;
            if (purchaseUpgradeIntroView != null) {
                purchaseUpgradeIntroView.m53137n0(section.m53532n());
            }
        }
    }

    /* JADX INFO: renamed from: l.yab0$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/yab0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21349c implements AbstractC8776a.a {
        public C21349c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.a
        /* JADX INFO: renamed from: a */
        public void mo54044a(PayMethod payMethod) {
            PurchaseUpgradeIntroView purchaseUpgradeIntroView;
            payMethod.getClass();
            C8765d c8765d = yab0.this.currentPurchaseSection;
            if (c8765d == null || (purchaseUpgradeIntroView = yab0.this._intro_view) == null) {
                return;
            }
            purchaseUpgradeIntroView.m53137n0(c8765d.m53532n());
        }
    }

    /* JADX INFO: renamed from: l.yab0$d */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/yab0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21350d implements AbstractC8776a.b {
        public C21350d() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.b
        /* JADX INFO: renamed from: a */
        public void mo53998a(ef60 paymentHandlerData, PurchaseType purchaseType) {
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                hab0 hab0Var = yab0.this.purchaseTrack;
                if (hab0Var != null) {
                    hab0Var.m130120s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                hab0 hab0Var2 = yab0.this.purchaseTrack;
                if (hab0Var2 != null) {
                    hab0.m130097u(hab0Var2, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            hab0 hab0Var3 = yab0.this.purchaseTrack;
            if (hab0Var3 != null) {
                hab0Var3.m130124x(paymentHandlerData, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: l.yab0$e */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/yab0$e", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21351e implements AbstractC8776a.c {
        public C21351e() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.c
        /* JADX INFO: renamed from: a */
        public void mo54045a(PurchaseAgreementState agreementState) {
            PurchaseUpgradeIntroView purchaseUpgradeIntroView;
            agreementState.getClass();
            C8765d c8765d = yab0.this.currentPurchaseSection;
            if (c8765d == null || (purchaseUpgradeIntroView = yab0.this._intro_view) == null) {
                return;
            }
            purchaseUpgradeIntroView.m53137n0(c8765d.m53532n());
        }
    }

    /* JADX INFO: renamed from: l.yab0$f */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"l/yab0$f", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21352f extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    public yab0(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull String str, @NotNull Merchandise merchandise, @NotNull Merchandise merchandise2, @Nullable Long l2) {
        act.getClass();
        purchaseType.getClass();
        str.getClass();
        merchandise.getClass();
        merchandise2.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.purchaseShowFrom = str;
        this.noneRenewableMerchandise = merchandise;
        this.autoRenewableMerchandise = merchandise2;
        this.refund = l2;
        this.statisticsPageHelper = new cwf0(new C21352f());
        this.dialogStateAction = new e30() { // from class: l.uab0
            @Override // p149l.e30
            public final void call(Object obj) {
                yab0.m213808a(this.f175592a, ((Integer) obj).intValue());
            }
        };
        this.purchaseComponentsList = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m213808a(yab0 yab0Var, int i) {
        if (i == -1) {
            dd80 dd80Var = yab0Var.dialog;
            if (dd80Var != null) {
                dd80Var.hide();
                return;
            }
            return;
        }
        if (i != 0) {
            if (i == 1) {
                dd80 dd80Var2 = yab0Var.dialog;
                if (dd80Var2 != null) {
                    dd80Var2.show();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
        }
        dd80 dd80Var3 = yab0Var.dialog;
        if (dd80Var3 != null) {
            dd80Var3.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m213809b(yab0 yab0Var, DialogInterface dialogInterface) {
        yab0Var.m213825q();
    }

    /* JADX INFO: renamed from: c */
    public static void m213810c(yab0 yab0Var, DialogInterface dialogInterface) {
        CoreModule.m29935P().m94651a().mo33308E9();
        yab0Var.m213825q();
        i0e.m133796e(yab0Var.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: t */
    public static final void m213817t(yab0 yab0Var) {
        dd80 dd80Var = yab0Var.dialog;
        if (dd80Var != null) {
            dd80Var.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m213818e(View view) {
        zab0.m217732a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final String m213819k() {
        ArrayList arrayList = new ArrayList();
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            arrayList.add("VIP");
        }
        if (!CoreModule.m29935P().m94651a().mo33489e2()) {
            arrayList.add("see");
        }
        if (CoreModule.m29935P().m94651a().mo33634z9()) {
            arrayList.add("quickchat");
        }
        return vwb.m200307U(arrayList, Constants.SEPARATOR_COMMA);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final FrameLayout m213820l() {
        FrameLayout frameLayout = this._agreement_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m213821m() {
        FrameLayout frameLayout = this._intro_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_intro_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final FrameLayout m213822n() {
        FrameLayout frameLayout = this._payment_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_payment_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LinearLayout m213823o() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m213824p() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54012J(new C21347a());
            j5b0Var.m54011I(new C21348b());
            j5b0Var.m54008F(new C21349c());
            j5b0Var.m54009G(new C21350d());
            j5b0Var.m54010H(new C21351e());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m213825q() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54013K();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m213826r() {
        z0b0 z0b0Var = new z0b0(this.act, this.purchaseType, this.purchaseShowFrom, this.mediator);
        m213820l().addView(z0b0Var.mo95244a(m213820l()));
        z0b0Var.register();
        this.purchaseComponentsList.add(z0b0Var);
    }

    /* JADX INFO: renamed from: s */
    public final void m213827s() {
        if (sab0.m182891i(this.purchaseType)) {
            m213823o().setBackgroundResource(d3c0.f84018m8);
        }
        PurchaseUpgradeIntroView purchaseUpgradeIntroView = (PurchaseUpgradeIntroView) o7r.m163037a(this.act).inflate(m6c0.f131551X1, (ViewGroup) m213821m(), false);
        this._intro_view = purchaseUpgradeIntroView;
        if (purchaseUpgradeIntroView != null) {
            purchaseUpgradeIntroView.m53134k0(this.act, this.purchaseType, this.noneRenewableMerchandise, this.autoRenewableMerchandise, this.refund);
            purchaseUpgradeIntroView.m53133j0(new d30() { // from class: l.xab0
                @Override // p149l.d30
                public final void call() {
                    yab0.m213817t(this.f191725a);
                }
            });
            purchaseUpgradeIntroView.m53135l0();
            m213821m().addView(purchaseUpgradeIntroView);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m213828u() {
        m7b0 m7b0Var = new m7b0(this.act, this.purchaseType, this.purchaseShowFrom, this.mediator);
        m213822n().addView(m7b0Var.mo95244a(m213822n()));
        m7b0Var.m157939O(this.dialogStateAction);
        m7b0Var.register();
        this.purchaseComponentsList.add(m7b0Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m213829v() {
        this.mediator = new cbb0(this.act, this.purchaseType, this.purchaseShowFrom);
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_svip_upgrade;
        if (sab0.m182891i(this.purchaseType)) {
            purchaseTrackPageType = PurchaseTrackPageType.page_odiamond_upgrade;
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, purchaseTrackPageType, this.purchaseShowFrom);
        this.purchaseTrack = x5b0Var;
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54018P(x5b0Var);
        }
        hab0 hab0Var = this.purchaseTrack;
        if (hab0Var != null) {
            ProductCategory productCategory2 = this.purchaseType.productCategory();
            productCategory2.getClass();
            hab0Var.m130122v(productCategory2);
        }
        j5b0 j5b0Var2 = this.mediator;
        cbb0 cbb0Var = j5b0Var2 instanceof cbb0 ? (cbb0) j5b0Var2 : null;
        if (cbb0Var != null) {
            cbb0Var.m105994h0(CollectionsKt.listOf((Object[]) new Merchandise[]{this.noneRenewableMerchandise, this.autoRenewableMerchandise}));
        }
        dd80 dd80VarM110960O = new dd80.C16336a(this.act).m110962Q(m6c0.f131547W1).m110983l0(new DialogInterface.OnCancelListener() { // from class: l.vab0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                yab0.m213809b(this.f180725a, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.wab0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                yab0.m213810c(this.f185451a, dialogInterface);
            }
        }).m110960O();
        this.dialog = dd80VarM110960O;
        View viewM110906L = dd80VarM110960O != null ? dd80VarM110960O.m110906L() : null;
        if (viewM110906L != null) {
            m213818e(viewM110906L);
            m213827s();
            m213828u();
            m213826r();
            m213824p();
            j5b0 j5b0Var3 = this.mediator;
            if (j5b0Var3 != null) {
                j5b0Var3.mo54040w();
            }
            Iterator<d1m> it = this.purchaseComponentsList.iterator();
            while (it.hasNext()) {
                it.next().mo100278b();
            }
        }
        dd80 dd80Var = this.dialog;
        if (dd80Var != null) {
            dd80Var.show();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m213830w(String skus) {
        String strValueOf;
        String str = "no";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.purchaseShowFrom));
            jSONObject.put("productType", iab0.m135150k(this.purchaseType));
            jSONObject.put("skuGroup", skus);
            jSONObject.put("if_sale", "no");
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30088w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            jSONObject.put("function_type", "otherVas");
            jSONObject.put("is_window", "yes");
            jSONObject.put("product_type_window", m213819k());
            Long l2 = this.refund;
            if (l2 == null || (strValueOf = String.valueOf(l2.longValue())) == null) {
                strValueOf = "";
            }
            jSONObject.put("renewal_amount_window", strValueOf);
            jSONObject.put("trigger_firsttime_window", CoreModule.m29935P().m94651a().mo33422Tq());
            JSONObject jSONObjectM145234U = ic50.m135327j().m135333f().m145234U(OmsDialog.p_purchase_page.getIdentifier(), jSONObject);
            jSONObjectM145234U.getClass();
            jSONObject = jSONObjectM145234U;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.statisticsPageHelper.m109039o(jSONObject);
        i0e.m133797f(this.statisticsPageHelper);
    }
}
