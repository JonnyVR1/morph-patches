package p153l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.PurchaseUpgradeIntroView;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010K\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010MR\u0018\u0010Q\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010PR\"\u0010V\u001a\u0010\u0012\f\u0012\n T*\u0004\u0018\u00010S0S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010e¨\u0006g"}, m88121d2 = {"Ll/cjb0;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "purchaseShowFrom", "Lcom/p1/mobile/putong/core/data/Merchandise;", "noneRenewableMerchandise", "autoRenewableMerchandise", "", FirebaseAnalytics.Event.REFUND, "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/core/data/Merchandise;Ljava/lang/Long;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "e", "(Landroid/view/View;)V", "p", "()V", BLiveStormDanmakuGiftResourceType.f45294s, "u", "r", "q", "skus", "w", "(Ljava/lang/String;)V", "k", "()Ljava/lang/String;", ResourceDirection.f39656v, "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getPurchaseShowFrom", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/Merchandise;", "getNoneRenewableMerchandise", "()Lcom/p1/mobile/putong/core/data/Merchandise;", "getAutoRenewableMerchandise", "f", "Ljava/lang/Long;", "getRefund", "()Ljava/lang/Long;", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "o", "()Landroid/widget/LinearLayout;", "set_root", "(Landroid/widget/LinearLayout;)V", "_root", "Landroid/widget/FrameLayout;", "h", "Landroid/widget/FrameLayout;", "m", "()Landroid/widget/FrameLayout;", "set_intro_root", "(Landroid/widget/FrameLayout;)V", "_intro_root", RXScreenCaptureService.KEY_INDEX, "n", "set_payment_root", "_payment_root", "j", BLiveStormDanmakuGiftResourceType.f45292l, "set_agreement_root", "_agreement_root", "Ll/l4g0;", "Ll/l4g0;", "statisticsPageHelper", "Ll/lib0;", "Ll/lib0;", "purchaseTrack", "Ll/y20;", "", "kotlin.jvm.PlatformType", "Ll/y20;", "dialogStateAction", "Ll/ndb0;", "Ll/ndb0;", "mediator", "Ll/jl80;", "Ll/jl80;", OMSTemplateType.dialog, "", "Ll/w3m;", "Ljava/util/List;", "purchaseComponentsList", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "currentPurchaseSection", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "Lcom/p1/mobile/putong/core/ui/purchase/PurchaseUpgradeIntroView;", "_intro_view", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class cjb0 {

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
    public l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public lib0 purchaseTrack;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public jl80 dialog;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public List<w3m> purchaseComponentsList;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public PurchaseUpgradeIntroView _intro_view;

    /* JADX INFO: renamed from: l.cjb0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/cjb0$a", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16276a implements AbstractC8939a.e {
        public C16276a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            String strM147490U = jyb.m147490U(mib0.m158481j(sections), Constants.SEPARATOR_COMMA);
            cjb0 cjb0Var = cjb0.this;
            strM147490U.getClass();
            cjb0Var.m110109w(strM147490U);
        }
    }

    /* JADX INFO: renamed from: l.cjb0$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/cjb0$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16277b implements AbstractC8939a.d {
        public C16277b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            cjb0.this.currentPurchaseSection = section;
            PurchaseUpgradeIntroView purchaseUpgradeIntroView = cjb0.this._intro_view;
            if (purchaseUpgradeIntroView != null) {
                purchaseUpgradeIntroView.m54320n0(section.m54715n());
            }
        }
    }

    /* JADX INFO: renamed from: l.cjb0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/cjb0$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16278c implements AbstractC8939a.a {
        public C16278c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            PurchaseUpgradeIntroView purchaseUpgradeIntroView;
            payMethod.getClass();
            C8928d c8928d = cjb0.this.currentPurchaseSection;
            if (c8928d == null || (purchaseUpgradeIntroView = cjb0.this._intro_view) == null) {
                return;
            }
            purchaseUpgradeIntroView.m54320n0(c8928d.m54715n());
        }
    }

    /* JADX INFO: renamed from: l.cjb0$d */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/cjb0$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16279d implements AbstractC8939a.b {
        public C16279d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.b
        /* JADX INFO: renamed from: a */
        public void mo55181a(jn60 paymentHandlerData, PurchaseType purchaseType) {
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                lib0 lib0Var = cjb0.this.purchaseTrack;
                if (lib0Var != null) {
                    lib0Var.m154342s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                lib0 lib0Var2 = cjb0.this.purchaseTrack;
                if (lib0Var2 != null) {
                    lib0.m154331u(lib0Var2, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            lib0 lib0Var3 = cjb0.this.purchaseTrack;
            if (lib0Var3 != null) {
                lib0Var3.m154346x(paymentHandlerData, purchaseType);
            }
        }
    }

    /* JADX INFO: renamed from: l.cjb0$e */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/cjb0$e", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16280e implements AbstractC8939a.c {
        public C16280e() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.c
        /* JADX INFO: renamed from: a */
        public void mo55228a(PurchaseAgreementState agreementState) {
            PurchaseUpgradeIntroView purchaseUpgradeIntroView;
            agreementState.getClass();
            C8928d c8928d = cjb0.this.currentPurchaseSection;
            if (c8928d == null || (purchaseUpgradeIntroView = cjb0.this._intro_view) == null) {
                return;
            }
            purchaseUpgradeIntroView.m54320n0(c8928d.m54715n());
        }
    }

    /* JADX INFO: renamed from: l.cjb0$f */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/cjb0$f", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C16281f extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    public cjb0(@NotNull Act act, @NotNull PurchaseType purchaseType, @NotNull String str, @NotNull Merchandise merchandise, @NotNull Merchandise merchandise2, @Nullable Long l2) {
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
        this.statisticsPageHelper = new l4g0(new C16281f());
        this.dialogStateAction = new y20() { // from class: l.yib0
            @Override // p153l.y20
            public final void call(Object obj) {
                cjb0.m110087a(this.f200057a, ((Integer) obj).intValue());
            }
        };
        this.purchaseComponentsList = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m110087a(cjb0 cjb0Var, int i) {
        if (i == -1) {
            jl80 jl80Var = cjb0Var.dialog;
            if (jl80Var != null) {
                jl80Var.hide();
                return;
            }
            return;
        }
        if (i != 0) {
            if (i == 1) {
                jl80 jl80Var2 = cjb0Var.dialog;
                if (jl80Var2 != null) {
                    jl80Var2.show();
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
        }
        jl80 jl80Var3 = cjb0Var.dialog;
        if (jl80Var3 != null) {
            jl80Var3.dismiss();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m110088b(cjb0 cjb0Var, DialogInterface dialogInterface) {
        cjb0Var.m110104q();
    }

    /* JADX INFO: renamed from: c */
    public static void m110089c(cjb0 cjb0Var, DialogInterface dialogInterface) {
        CoreModule.m30933P().m143405a().mo34311E9();
        cjb0Var.m110104q();
        w1e.m204401e(cjb0Var.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: t */
    public static final void m110096t(cjb0 cjb0Var) {
        jl80 jl80Var = cjb0Var.dialog;
        if (jl80Var != null) {
            jl80Var.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m110097e(View view) {
        djb0.m116072a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final String m110098k() {
        ArrayList arrayList = new ArrayList();
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            arrayList.add("VIP");
        }
        if (!CoreModule.m30933P().m143405a().mo34492e2()) {
            arrayList.add("see");
        }
        if (CoreModule.m30933P().m143405a().mo34637z9()) {
            arrayList.add("quickchat");
        }
        return jyb.m147490U(arrayList, Constants.SEPARATOR_COMMA);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final FrameLayout m110099l() {
        FrameLayout frameLayout = this._agreement_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_agreement_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FrameLayout m110100m() {
        FrameLayout frameLayout = this._intro_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_intro_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final FrameLayout m110101n() {
        FrameLayout frameLayout = this._payment_root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_payment_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LinearLayout m110102o() {
        LinearLayout linearLayout = this._root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final void m110103p() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55195J(new C16276a());
            ndb0Var.m55194I(new C16277b());
            ndb0Var.m55191F(new C16278c());
            ndb0Var.m55192G(new C16279d());
            ndb0Var.m55193H(new C16280e());
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m110104q() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55196K();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m110105r() {
        d9b0 d9b0Var = new d9b0(this.act, this.purchaseType, this.purchaseShowFrom, this.mediator);
        m110099l().addView(d9b0Var.mo96551a(m110099l()));
        d9b0Var.register();
        this.purchaseComponentsList.add(d9b0Var);
    }

    /* JADX INFO: renamed from: s */
    public final void m110106s() {
        if (wib0.m206565i(this.purchaseType)) {
            m110102o().setBackgroundResource(jbc0.f119673m8);
        }
        PurchaseUpgradeIntroView purchaseUpgradeIntroView = (PurchaseUpgradeIntroView) p9r.m171370a(this.act).inflate(rec0.f162511X1, (ViewGroup) m110100m(), false);
        this._intro_view = purchaseUpgradeIntroView;
        if (purchaseUpgradeIntroView != null) {
            purchaseUpgradeIntroView.m54317k0(this.act, this.purchaseType, this.noneRenewableMerchandise, this.autoRenewableMerchandise, this.refund);
            purchaseUpgradeIntroView.m54316j0(new x20() { // from class: l.bjb0
                @Override // p153l.x20
                public final void call() {
                    cjb0.m110096t(this.f76971a);
                }
            });
            purchaseUpgradeIntroView.m54318l0();
            m110100m().addView(purchaseUpgradeIntroView);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m110107u() {
        qfb0 qfb0Var = new qfb0(this.act, this.purchaseType, this.purchaseShowFrom, this.mediator);
        m110101n().addView(qfb0Var.mo96551a(m110101n()));
        qfb0Var.m152860O(this.dialogStateAction);
        qfb0Var.register();
        this.purchaseComponentsList.add(qfb0Var);
    }

    /* JADX INFO: renamed from: v */
    public final void m110108v() {
        this.mediator = new gjb0(this.act, this.purchaseType, this.purchaseShowFrom);
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_svip_upgrade;
        if (wib0.m206565i(this.purchaseType)) {
            purchaseTrackPageType = PurchaseTrackPageType.page_odiamond_upgrade;
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        beb0 beb0Var = new beb0(productCategory, purchaseTrackPageType, this.purchaseShowFrom);
        this.purchaseTrack = beb0Var;
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55201P(beb0Var);
        }
        lib0 lib0Var = this.purchaseTrack;
        if (lib0Var != null) {
            ProductCategory productCategory2 = this.purchaseType.productCategory();
            productCategory2.getClass();
            lib0Var.m154344v(productCategory2);
        }
        ndb0 ndb0Var2 = this.mediator;
        gjb0 gjb0Var = ndb0Var2 instanceof gjb0 ? (gjb0) ndb0Var2 : null;
        if (gjb0Var != null) {
            gjb0Var.m130466h0(CollectionsKt.listOf((Object[]) new Merchandise[]{this.noneRenewableMerchandise, this.autoRenewableMerchandise}));
        }
        jl80 jl80VarM146020O = new jl80.C17971a(this.act).m146022Q(rec0.f162507W1).m146043l0(new DialogInterface.OnCancelListener() { // from class: l.zib0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                cjb0.m110088b(this.f204501a, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ajb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                cjb0.m110089c(this.f71806a, dialogInterface);
            }
        }).m146020O();
        this.dialog = jl80VarM146020O;
        View viewM145966L = jl80VarM146020O != null ? jl80VarM146020O.m145966L() : null;
        if (viewM145966L != null) {
            m110097e(viewM145966L);
            m110106s();
            m110107u();
            m110105r();
            m110103p();
            ndb0 ndb0Var3 = this.mediator;
            if (ndb0Var3 != null) {
                ndb0Var3.mo55223w();
            }
            Iterator<w3m> it = this.purchaseComponentsList.iterator();
            while (it.hasNext()) {
                it.next().mo152867b();
            }
        }
        jl80 jl80Var = this.dialog;
        if (jl80Var != null) {
            jl80Var.show();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m110109w(String skus) {
        String strValueOf;
        String str = "no";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.purchaseShowFrom));
            jSONObject.put("productType", mib0.m158482k(this.purchaseType));
            jSONObject.put("skuGroup", skus);
            jSONObject.put("if_sale", "no");
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            jSONObject.put("function_type", "otherVas");
            jSONObject.put("is_window", "yes");
            jSONObject.put("product_type_window", m110098k());
            Long l2 = this.refund;
            if (l2 == null || (strValueOf = String.valueOf(l2.longValue())) == null) {
                strValueOf = "";
            }
            jSONObject.put("renewal_amount_window", strValueOf);
            jSONObject.put("trigger_firsttime_window", CoreModule.m30933P().m143405a().mo34425Tq());
            JSONObject jSONObjectM181657U = pk50.m172568j().m172574f().m181657U(OmsDialog.p_purchase_page.getIdentifier(), jSONObject);
            jSONObjectM181657U.getClass();
            jSONObject = jSONObjectM181657U;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }
}
