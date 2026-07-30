package p153l;

import android.content.DialogInterface;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RefundDetail;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.l5 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0001QB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0017¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0017H&¢\u0006\u0004\b+\u0010(J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0015H&¢\u0006\u0004\b-\u0010\u0019J\u001f\u00100\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010\u0014J\u000f\u0010\u000e\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u000e\u0010(J\u0019\u00104\u001a\u00020\u00172\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b6\u0010\u0019J\u000f\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u0010(J\u0017\u00108\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0004¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u00172\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b;\u0010 J+\u0010>\u001a\u00020\u00172\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010<¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bG\u0010\u0014J\u000f\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010\u0014J\u000f\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010\u001bJ\u0015\u0010K\u001a\u00020J2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0005¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0017¢\u0006\u0004\bO\u0010(J\r\u0010P\u001a\u00020\u0017¢\u0006\u0004\bP\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010SR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010XR\"\u0010,\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010\u0019R$\u0010e\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010i\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\"\u0010n\u001a\u00020#8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bj\u00106\u001a\u0004\bk\u0010%\"\u0004\bl\u0010mR\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR,\u0010s\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010UR\u0016\u0010y\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010xR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, m88121d2 = {"Ll/l5;", "Ll/w3m;", "Ll/y3m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "Ll/wn60;", p7f.GPS_DIRECTION_TRUE, "paymentHelper", "r", "(Ll/wn60;)Ll/wn60;", "", "A", "()Z", "Lcom/p1/mobile/putong/data/PayMethod;", FirebaseAnalytics.Param.METHOD, "", c4s.C_ZONE, "(Lcom/p1/mobile/putong/data/PayMethod;)V", "o", "()Ljava/lang/String;", "Ll/y20;", "", SysnotifListener.ACTION_DISMISS, ResourceDirection.f39656v, "(Ll/y20;)V", BaseSei.f14626Z, "w", "", "m", "()D", "q", "b", "()V", "F", "register", "H", "currentPayMethod", "G", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "B", "paymentTrackSource", BaseSei.f14624X, "(Ljava/lang/Integer;)V", "D", "release", "p", "()Ll/y20;", "dialogStateAction", BloodType.f39576O, "Ll/a30;", "onPaySuccess", "Q", "(Ll/a30;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "P", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "other", "R", "(Ljava/lang/String;)V", "e", Constants.INAPP_DATA_TAG, "E", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "K", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "J", p7f.GPS_MEASUREMENT_INTERRUPTED, "a", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "Ll/ndb0;", "Ll/kcg0;", "Ll/kcg0;", "refundSubscription", "f", "Lcom/p1/mobile/putong/data/PayMethod;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/p1/mobile/putong/data/PayMethod;", "L", "g", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "M", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "currentPurchaseSection", "h", "getCurrentPurchaseSectionSource", "N", "currentPurchaseSectionSource", RXScreenCaptureService.KEY_INDEX, "u", "setRefundAmount", "(D)V", "refundAmount", "j", "Ll/y20;", "k", "Ll/a30;", "onPaymentSuccess", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "onlineMatchPushUser", "Ll/ln60;", "Ll/ln60;", "paymentHandlerHelper", "Ll/gq60;", "Ll/gq60;", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/gq60;", p7f.LATITUDE_SOUTH, "(Ll/gq60;)V", "paymentTextResponseData", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class AbstractC18347l5 implements w3m, y3m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final ndb0 mediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public kcg0 refundSubscription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSection;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C8928d currentPurchaseSectionSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public double refundAmount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Privilege firstPrivilege;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public ln60 paymentHandlerHelper;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public gq60 paymentTextResponseData;

    /* JADX INFO: renamed from: l.l5$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/l5$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b implements AbstractC8939a.d {
        public b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            section.getClass();
            AbstractC18347l5.this.m152858M(section);
            AbstractC18347l5.this.m152859N(sectionSource);
            AbstractC18347l5.this.m152854F();
        }
    }

    /* JADX INFO: renamed from: l.l5$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/l5$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class c implements AbstractC8939a.a {
        public c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.a
        /* JADX INFO: renamed from: a */
        public void mo55227a(PayMethod payMethod) {
            payMethod.getClass();
            AbstractC18347l5.this.m152857L(payMethod);
            AbstractC18347l5.this.mo120655H();
            AbstractC18347l5 abstractC18347l5 = AbstractC18347l5.this;
            abstractC18347l5.mo120654G(abstractC18347l5.getCurrentPayMethod());
            C8928d currentPurchaseSection = AbstractC18347l5.this.getCurrentPurchaseSection();
            if (currentPurchaseSection != null) {
                AbstractC18347l5 abstractC18347l6 = AbstractC18347l5.this;
                abstractC18347l6.mo120656I(abstractC18347l6.getCurrentPayMethod(), currentPurchaseSection);
            }
        }
    }

    /* JADX INFO: renamed from: l.l5$d */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/l5$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class d implements AbstractC8939a.c {
        public d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.c
        /* JADX INFO: renamed from: a */
        public void mo55228a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            AbstractC18347l5.this.mo120655H();
        }
    }

    public AbstractC18347l5(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable ndb0 ndb0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = ndb0Var;
        PayMethod payMethod = PayMethod.get("unknown_");
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: A */
    private final boolean m152840A() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d != null) {
            return c8928d.m54711j() | v5b0.m199788n(c8928d.m54715n() ? c8928d.m54703b().m54784s() : c8928d.m54705d().m54784s());
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    private final void m152841C(PayMethod method) {
        double dM152869m = m152869m();
        String strM152871o = m152871o();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", method.toString());
            jSONObject.put("skuID", strM152871o);
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.from));
            jSONObject.put("productType", m152875t().productCategory().toString());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, dM152869m);
            jSONObject.put("if_discount", m152840A());
            jSONObject.put(BLiveOperationTitleShowType.duration, m152873q());
            jSONObject.put("default_duration", tab0.m189811h().m189825p(m152875t().productCategory()));
            C8928d c8928d = this.currentPurchaseSection;
            boolean z = false;
            boolean zM54715n = c8928d != null ? c8928d.m54715n() : false;
            boolean z2 = CoreModule.f18264c.f20333O0.m31086w3() && CoreModule.m30933P().m143405a().mo34428U();
            String str = "yes";
            if (zM54715n) {
                if (TEnum.equals(method, "alipay") && z2) {
                    z = true;
                }
                jSONObject.put("no_secret_payment", z ? "yes" : "no");
            } else {
                jSONObject.put("no_secret_payment", "no");
            }
            if (!z2) {
                str = "no";
            }
            jSONObject.put("user_secret_staus", str);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138522t("e_purchase_button", mo120653E(), jSONObject);
    }

    /* JADX INFO: renamed from: U */
    public static final void m152842U(AbstractC18347l5 abstractC18347l5, PayMethod payMethod) {
        ndb0 ndb0Var = abstractC18347l5.mediator;
        if (ndb0Var != null) {
            payMethod.getClass();
            ndb0Var.m162679e0(payMethod);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m152843c(AbstractC18347l5 abstractC18347l5, Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            abstractC18347l5.refundAmount = ((RefundDetail) optional.get()).totalRefundAmount;
            abstractC18347l5.mo120655H();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m152844f(AbstractC18347l5 abstractC18347l5, Throwable th) {
        abstractC18347l5.refundAmount = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public static void m152845g(final AbstractC18347l5 abstractC18347l5, final PayMethod payMethod) {
        l51.m152887G(new Runnable() { // from class: l.k5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC18347l5.m152842U(this.f123953a, payMethod);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m152846h(AbstractC18347l5 abstractC18347l5, Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            double d2 = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                abstractC18347l5.refundAmount = d2;
                abstractC18347l5.mo120655H();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m152848j(AbstractC18347l5 abstractC18347l5, Throwable th) {
        abstractC18347l5.refundAmount = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: k */
    public static void m152849k(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: r */
    private final <T extends wn60> T m152850r(T paymentHelper) {
        T t = (T) paymentHelper.m207168s(this.currentPurchaseSection).m207171v(this.firstPrivilege).m207175z(this.onlineMatchPushUser).m207143B(this);
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m152851y(AbstractC18347l5 abstractC18347l5, Integer num, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: handlePrivilegeClick");
            return;
        }
        if ((i & 1) != 0) {
            num = 0;
        }
        abstractC18347l5.m152879x(num);
    }

    /* JADX INFO: renamed from: B */
    public boolean mo152852B() {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m152853D(@NotNull PayMethod method) {
        method.getClass();
        if (ueh0.m195759m(this.currentPurchaseSection, m152875t(), this.act)) {
            y20<Integer> y20Var = this.dialogStateAction;
            if (y20Var != null) {
                y20Var.call(0);
                return;
            }
            return;
        }
        if (TEnum.equals(method, "alipay")) {
            m152877v(this.dialogStateAction);
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            m152841C(payMethod);
            return;
        }
        if (TEnum.equals(method, "wechat")) {
            m152880z(this.dialogStateAction);
            PayMethod payMethod2 = PayMethod.get("wechat");
            payMethod2.getClass();
            m152841C(payMethod2);
            return;
        }
        if (TEnum.equals(method, PayMethod.jingdong)) {
            m152878w(this.dialogStateAction);
            PayMethod payMethod3 = PayMethod.get(PayMethod.jingdong);
            payMethod3.getClass();
            m152841C(payMethod3);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract String mo120653E();

    /* JADX INFO: renamed from: F */
    public final void m152854F() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d != null) {
            mo120655H();
            mo120656I(this.currentPayMethod, c8928d);
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo120654G(@NotNull PayMethod currentPayMethod);

    /* JADX INFO: renamed from: H */
    public abstract void mo120655H();

    /* JADX INFO: renamed from: I */
    public abstract void mo120656I(@NotNull PayMethod currentPayMethod, @NotNull C8928d section);

    /* JADX INFO: renamed from: J */
    public final void m152855J() {
        C8928d c8928d = this.currentPurchaseSectionSource;
        if (c8928d != null) {
            this.currentPurchaseSection = c8928d;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final C8928d.a m152856K(@NotNull C8928d section) {
        section.getClass();
        if (!tab0.m189811h().m189835z() || C8929e.m54833x(this.from)) {
            C8928d.a aVarM54703b = section.m54715n() ? section.m54703b() : section.m54705d();
            aVarM54703b.getClass();
            return aVarM54703b;
        }
        if (NullChecker.m82486a(section.m54705d())) {
            C8928d.a aVarM54705d = section.m54705d();
            aVarM54705d.getClass();
            return aVarM54705d;
        }
        C8928d.a aVarM54703b2 = section.m54703b();
        aVarM54703b2.getClass();
        return aVarM54703b2;
    }

    /* JADX INFO: renamed from: L */
    public final void m152857L(@NotNull PayMethod payMethod) {
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: M */
    public final void m152858M(@Nullable C8928d c8928d) {
        this.currentPurchaseSection = c8928d;
    }

    /* JADX INFO: renamed from: N */
    public final void m152859N(@Nullable C8928d c8928d) {
        this.currentPurchaseSectionSource = c8928d;
    }

    /* JADX INFO: renamed from: O */
    public final void m152860O(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: P */
    public final void m152861P(@Nullable Privilege privilege) {
        this.firstPrivilege = privilege;
    }

    /* JADX INFO: renamed from: Q */
    public final void m152862Q(@Nullable a30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccess = onPaySuccess;
    }

    /* JADX INFO: renamed from: R */
    public final void m152863R(@NotNull String other) {
        other.getClass();
        this.onlineMatchPushUser = other;
    }

    /* JADX INFO: renamed from: S */
    public final void m152864S(@Nullable gq60 gq60Var) {
        this.paymentTextResponseData = gq60Var;
    }

    /* JADX INFO: renamed from: T */
    public final void m152865T() {
        C8928d c8928d;
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_purchase_intermediate_page", getClass().getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE), jyb.m147494Y("purchaseShowFrom", abb0.m96735b(this.from)), jyb.m147494Y("productType", m152875t().productCategory().toString()), jyb.m147494Y("skuID", m152871o()));
        ArrayList arrayListM147507f0 = jyb.m147507f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        if (mo152852B() && (c8928d = this.currentPurchaseSection) != null) {
            List<PayMethod> listM189833x = tab0.m189811h().m189833x(c8928d.m54715n() ? c8928d.m54703b().m54784s() : c8928d.m54705d().m54784s());
            listM189833x.getClass();
            arrayListM147507f0.clear();
            arrayListM147507f0.addAll(listM189833x);
        }
        new bo60(this.act, m152875t()).m105668r(this.currentPayMethod).m105662l((wib0.m206573q(m152875t()) && C8929e.m54833x(this.from)) ? false : true).m105667q(new y20() { // from class: l.i5
            @Override // p153l.y20
            public final void call(Object obj) {
                AbstractC18347l5.m152845g(this.f112956a, (PayMethod) obj);
            }
        }).m105670t(arrayListM147507f0).m105666p(new DialogInterface.OnDismissListener() { // from class: l.j5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC18347l5.m152849k(l4g0VarM204399c, dialogInterface);
            }
        }).m105669s();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: V */
    public final void m152866V() {
        ndb0 ndb0Var;
        lib0 lib0VarM55217q;
        gq60 gq60Var = this.paymentTextResponseData;
        if (gq60Var == null || !gq60Var.getNeedTrackSticker() || (ndb0Var = this.mediator) == null || (lib0VarM55217q = ndb0Var.getPurchaseTrack()) == null) {
            return;
        }
        C8928d c8928d = this.currentPurchaseSection;
        c8928d.getClass();
        lib0VarM55217q.m154348z(c8928d, gq60Var, this.purchaseType);
    }

    @Override // p153l.w3m
    /* JADX INFO: renamed from: b */
    public void mo152867b() {
        super.mo152867b();
        if (CoreModule.m30933P().m143405a().mo34428U()) {
            CoreModule.f18264c.f20333O0.m31073C3();
            CoreModule.f18264c.f20333O0.m31072B3();
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        if (TEnum.equals(productCategory, "svip") && !C8929e.m54833x(this.from)) {
            this.refundSubscription = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31596K5()).subscribe(psd0.m173597H(new y20() { // from class: l.e5
                @Override // p153l.y20
                public final void call(Object obj) {
                    AbstractC18347l5.m152846h(this.f92168a, (Optional) obj);
                }
            }, new y20() { // from class: l.f5
                @Override // p153l.y20
                public final void call(Object obj) {
                    AbstractC18347l5.m152844f(this.f97176a, (Throwable) obj);
                }
            }));
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34586s3()) {
            if ((TEnum.equals(productCategory, "oDiamond") || TEnum.equals(productCategory, ProductCategory.oDiamondPrivateCustom)) && !C8929e.m54833x(this.from)) {
                CoreModule.f18264c.f20396j0.m31596K5();
                this.refundSubscription = this.act.duringCreated(CoreModule.f18264c.f20396j0.m31595K4()).subscribe(psd0.m173597H(new y20() { // from class: l.g5
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        AbstractC18347l5.m152843c(this.f102208a, (Optional) obj);
                    }
                }, new y20() { // from class: l.h5
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        AbstractC18347l5.m152848j(this.f107878a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p153l.y3m
    /* JADX INFO: renamed from: d */
    public boolean mo37060d() {
        return false;
    }

    @Override // p153l.y3m
    /* JADX INFO: renamed from: e */
    public boolean mo37061e() {
        a30<PurchaseType, Act, String> a30Var = this.onPaymentSuccess;
        if (a30Var == null) {
            return false;
        }
        a30Var.mo37058a(this.purchaseType, this.act, this.from);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final PayMethod getCurrentPayMethod() {
        return this.currentPayMethod;
    }

    /* JADX INFO: renamed from: m */
    public final double m152869m() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        Merchandise merchandiseM54784s = c8928d.m54715n() ? c8928d.m54703b().m54784s() : c8928d.m54705d().m54784s();
        return v5b0.m199788n(merchandiseM54784s) ? merchandiseM54784s.getFirstCouponPrice() : merchandiseM54784s.defaultStockKeepUnit.prices.price;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C8928d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    /* JADX INFO: renamed from: o */
    public final String m152871o() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d == null) {
            return "";
        }
        String str = (c8928d.m54715n() ? c8928d.m54703b().m54784s() : c8928d.m54705d().m54784s()).defaultStockKeepUnit.f21249id;
        return str == null ? "" : str;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final y20<Integer> m152872p() {
        return this.dialogStateAction;
    }

    /* JADX INFO: renamed from: q */
    public final String m152873q() {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d == null) {
            return "";
        }
        if (c8928d.m54715n()) {
            if (c8928d.m54703b().m54784s().weekly()) {
                return "7d";
            }
            return c8928d.m54703b().m54788w() + "m";
        }
        if (c8928d.m54705d().m54784s().weekly()) {
            return "7d";
        }
        return c8928d.m54705d().m54788w() + "m";
    }

    @Override // p153l.w3m
    public void register() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55194I(new b());
            ndb0Var.m55191F(new c());
            ndb0Var.m55193H(new d());
        }
    }

    @Override // p153l.w3m
    public void release() {
        psd0.m173633z(this.refundSubscription);
        this.refundSubscription = null;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final gq60 getPaymentTextResponseData() {
        return this.paymentTextResponseData;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final PurchaseType m152875t() {
        PurchaseType purchaseTypeM206558b;
        PurchaseType purchaseType = this.purchaseType;
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d == null || !NullChecker.m82486a(c8928d.m54704c()) || (purchaseTypeM206558b = wib0.m206558b(c8928d.m54704c().category)) == PurchaseType.TYPE_NONE) {
            return purchaseType;
        }
        purchaseTypeM206558b.getClass();
        return purchaseTypeM206558b;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final double getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX INFO: renamed from: v */
    public final void m152877v(y20<Integer> dismiss) {
        lib0 lib0VarM55217q;
        wn60 wn60Var = new wn60(m152875t(), this.act, this.from, "");
        ndb0 ndb0Var = this.mediator;
        wn60Var.m207144C((ndb0Var == null || (lib0VarM55217q = ndb0Var.getPurchaseTrack()) == null) ? null : lib0VarM55217q.getPurchaseTrackId());
        if (pta.m173717j()) {
            wn60Var.m207145D(false);
            pta.m173731x(false);
        }
        m152850r(wn60Var).m207156g(dismiss);
    }

    /* JADX INFO: renamed from: w */
    public final void m152878w(y20<Integer> dismiss) {
        lib0 lib0VarM55217q;
        wn60 wn60VarM152850r = m152850r(new wn60(m152875t(), this.act, this.from, ""));
        ndb0 ndb0Var = this.mediator;
        wn60VarM152850r.m207144C((ndb0Var == null || (lib0VarM55217q = ndb0Var.getPurchaseTrack()) == null) ? null : lib0VarM55217q.getPurchaseTrackId());
        wn60VarM152850r.m207157h(dismiss);
    }

    /* JADX INFO: renamed from: x */
    public final void m152879x(@Nullable Integer paymentTrackSource) {
        C8928d c8928d = this.currentPurchaseSection;
        if (c8928d != null) {
            if (this.paymentHandlerHelper == null) {
                this.paymentHandlerHelper = new ln60(this.act, this.purchaseType, this.from, this.mediator);
            }
            ln60 ln60Var = this.paymentHandlerHelper;
            ln60 ln60Var2 = null;
            if (ln60Var == null) {
                Intrinsics.m88391r("paymentHandlerHelper");
                ln60Var = null;
            }
            if (ln60Var.getPurchaseType() != m152875t()) {
                this.paymentHandlerHelper = new ln60(this.act, m152875t(), this.from, this.mediator);
            }
            jn60 jn60Var = new jn60(c8928d, this.currentPurchaseSectionSource, this.currentPayMethod, this.refundAmount, this.paymentTextResponseData, paymentTrackSource, this.dialogStateAction);
            ln60 ln60Var3 = this.paymentHandlerHelper;
            if (ln60Var3 == null) {
                Intrinsics.m88391r("paymentHandlerHelper");
            } else {
                ln60Var2 = ln60Var3;
            }
            ln60Var2.m154965b(jn60Var, this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m152880z(y20<Integer> dismiss) {
        C8928d c8928d;
        C8928d.a aVarM54705d;
        lib0 lib0VarM55217q;
        wn60 wn60VarM152850r = m152850r(new wn60(m152875t(), this.act, this.from, ""));
        ndb0 ndb0Var = this.mediator;
        Merchandise merchandiseM54784s = null;
        wn60VarM152850r.m207144C((ndb0Var == null || (lib0VarM55217q = ndb0Var.getPurchaseTrack()) == null) ? null : lib0VarM55217q.getPurchaseTrackId());
        if (tab0.m189811h().m189835z() && !C8929e.m54833x(this.from) && (c8928d = this.currentPurchaseSection) != null && c8928d.m54714m()) {
            C8928d c8928d2 = this.currentPurchaseSection;
            c8928d2.getClass();
            int i = c8928d2.m54703b().m54784s().quantity;
            ndb0 ndb0Var2 = this.mediator;
            C8928d c8928dM162675a0 = ndb0Var2 != null ? ndb0Var2.m162675a0(i) : null;
            if (c8928dM162675a0 != null && (aVarM54705d = c8928dM162675a0.m54705d()) != null) {
                merchandiseM54784s = aVarM54705d.m54784s();
            }
            wn60VarM152850r.m207174y(merchandiseM54784s);
        }
        wn60VarM152850r.m207159j(dismiss);
    }
}
