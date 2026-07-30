package p149l;

import android.content.DialogInterface;
import com.clevertap.android.sdk.Constants;
import com.google.common.base.Optional;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RefundDetail;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: renamed from: l.n5 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0001QB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0017¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0017H&¢\u0006\u0004\b+\u0010(J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0015H&¢\u0006\u0004\b-\u0010\u0019J\u001f\u00100\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010\u0014J\u000f\u0010\u000e\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u000e\u0010(J\u0019\u00104\u001a\u00020\u00172\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b6\u0010\u0019J\u000f\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u0010(J\u0017\u00108\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0004¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u00172\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b;\u0010 J+\u0010>\u001a\u00020\u00172\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010<¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bG\u0010\u0014J\u000f\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010\u0014J\u000f\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010\u001bJ\u0015\u0010K\u001a\u00020J2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0005¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0017¢\u0006\u0004\bO\u0010(J\r\u0010P\u001a\u00020\u0017¢\u0006\u0004\bP\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010SR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010XR\"\u0010,\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010\u0019R$\u0010e\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010i\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\"\u0010n\u001a\u00020#8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bj\u00106\u001a\u0004\bk\u0010%\"\u0004\bl\u0010mR\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR,\u0010s\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010UR\u0016\u0010y\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010xR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, m87232d2 = {"Ll/n5;", "Ll/d1m;", "Ll/f1m;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/rf60;", j6f.GPS_DIRECTION_TRUE, "paymentHelper", "r", "(Ll/rf60;)Ll/rf60;", "", "A", "()Z", "Lcom/p1/mobile/putong/data/PayMethod;", FirebaseAnalytics.Param.METHOD, "", b2s.C_ZONE, "(Lcom/p1/mobile/putong/data/PayMethod;)V", "o", "()Ljava/lang/String;", "Ll/e30;", "", SysnotifListener.ACTION_DISMISS, ResourceDirection.f38808v, "(Ll/e30;)V", BaseSei.f13932Z, "w", "", "m", "()D", "q", "b", "()V", "F", "register", "H", "currentPayMethod", "G", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "B", "paymentTrackSource", BaseSei.f13930X, "(Ljava/lang/Integer;)V", "D", "release", "p", "()Ll/e30;", "dialogStateAction", BloodType.f38728O, "Ll/g30;", "onPaySuccess", "Q", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "P", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "other", "R", "(Ljava/lang/String;)V", "e", Constants.INAPP_DATA_TAG, "E", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "K", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", Constants.KEY_T, "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "J", j6f.GPS_MEASUREMENT_INTERRUPTED, "a", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "Ll/j5b0;", "Ll/c4g0;", "Ll/c4g0;", "refundSubscription", "f", "Lcom/p1/mobile/putong/data/PayMethod;", BLiveStormDanmakuGiftResourceType.f44444l, "()Lcom/p1/mobile/putong/data/PayMethod;", "L", "g", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "M", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "currentPurchaseSection", "h", "getCurrentPurchaseSectionSource", "N", "currentPurchaseSectionSource", RXScreenCaptureService.KEY_INDEX, "u", "setRefundAmount", "(D)V", "refundAmount", "j", "Ll/e30;", "k", "Ll/g30;", "onPaymentSuccess", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "onlineMatchPushUser", "Ll/gf60;", "Ll/gf60;", "paymentHandlerHelper", "Ll/bi60;", "Ll/bi60;", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/bi60;", j6f.LATITUDE_SOUTH, "(Ll/bi60;)V", "paymentTextResponseData", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class AbstractC18623n5 implements d1m, f1m {

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
    public final j5b0 mediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public c4g0 refundSubscription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public PayMethod currentPayMethod;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSection;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public C8765d currentPurchaseSectionSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public double refundAmount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Privilege firstPrivilege;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public gf60 paymentHandlerHelper;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public bi60 paymentTextResponseData;

    /* JADX INFO: renamed from: l.n5$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/n5$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b implements AbstractC8776a.d {
        public b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
        /* JADX INFO: renamed from: a */
        public void mo53997a(C8765d section, boolean scroll, boolean isClick, C8765d sectionSource) {
            section.getClass();
            AbstractC18623n5.this.m157937M(section);
            AbstractC18623n5.this.m157938N(sectionSource);
            AbstractC18623n5.this.m157933F();
        }
    }

    /* JADX INFO: renamed from: l.n5$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/n5$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class c implements AbstractC8776a.a {
        public c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.a
        /* JADX INFO: renamed from: a */
        public void mo54044a(PayMethod payMethod) {
            payMethod.getClass();
            AbstractC18623n5.this.m157936L(payMethod);
            AbstractC18623n5.this.mo95240H();
            AbstractC18623n5 abstractC18623n5 = AbstractC18623n5.this;
            abstractC18623n5.mo95239G(abstractC18623n5.getCurrentPayMethod());
            C8765d currentPurchaseSection = AbstractC18623n5.this.getCurrentPurchaseSection();
            if (currentPurchaseSection != null) {
                AbstractC18623n5 abstractC18623n6 = AbstractC18623n5.this;
                abstractC18623n6.mo95241I(abstractC18623n6.getCurrentPayMethod(), currentPurchaseSection);
            }
        }
    }

    /* JADX INFO: renamed from: l.n5$d */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/n5$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class d implements AbstractC8776a.c {
        public d() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.c
        /* JADX INFO: renamed from: a */
        public void mo54045a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            AbstractC18623n5.this.mo95240H();
        }
    }

    public AbstractC18623n5(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.mediator = j5b0Var;
        PayMethod payMethod = PayMethod.get("unknown_");
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: A */
    private final boolean m157920A() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d != null) {
            return c8765d.m53528j() | rxa0.m181493n(c8765d.m53532n() ? c8765d.m53520b().m53601s() : c8765d.m53522d().m53601s());
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    private final void m157921C(PayMethod method) {
        double dM157947m = m157947m();
        String strM157949o = m157949o();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", method.toString());
            jSONObject.put("skuID", strM157949o);
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.from));
            jSONObject.put("productType", m157953t().productCategory().toString());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, dM157947m);
            jSONObject.put("if_discount", m157920A());
            jSONObject.put(BLiveOperationTitleShowType.duration, m157951q());
            jSONObject.put("default_duration", p2b0.m167133h().m167147p(m157953t().productCategory()));
            C8765d c8765d = this.currentPurchaseSection;
            boolean z = false;
            boolean zM53532n = c8765d != null ? c8765d.m53532n() : false;
            boolean z2 = CoreModule.f17545c.f19591O0.m30088w3() && CoreModule.m29935P().m94651a().mo33425U();
            String str = "yes";
            if (zM53532n) {
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
            CrashHelper.m81296c(e);
        }
        zvf0.m220398t("e_purchase_button", mo95238E(), jSONObject);
    }

    /* JADX INFO: renamed from: U */
    public static final void m157922U(AbstractC18623n5 abstractC18623n5, PayMethod payMethod) throws Exception {
        j5b0 j5b0Var = abstractC18623n5.mediator;
        if (j5b0Var != null) {
            payMethod.getClass();
            j5b0Var.m139835e0(payMethod);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m157923c(AbstractC18623n5 abstractC18623n5, Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            abstractC18623n5.refundAmount = ((RefundDetail) optional.get()).totalRefundAmount;
            abstractC18623n5.mo95240H();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m157924f(AbstractC18623n5 abstractC18623n5, Throwable th) {
        abstractC18623n5.refundAmount = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: g */
    public static void m157925g(final AbstractC18623n5 abstractC18623n5, final PayMethod payMethod) {
        e51.m114742G(new Runnable() { // from class: l.m5
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                AbstractC18623n5.m157922U(this.f131347a, payMethod);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m157926h(AbstractC18623n5 abstractC18623n5, Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            double d2 = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                abstractC18623n5.refundAmount = d2;
                abstractC18623n5.mo95240H();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m157928j(AbstractC18623n5 abstractC18623n5, Throwable th) {
        abstractC18623n5.refundAmount = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: k */
    public static void m157929k(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: r */
    private final <T extends rf60> T m157930r(T paymentHelper) {
        T t = (T) paymentHelper.m179102s(this.currentPurchaseSection).m179105v(this.firstPrivilege).m179109z(this.onlineMatchPushUser).m179077B(this);
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m157931y(AbstractC18623n5 abstractC18623n5, Integer num, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: handlePrivilegeClick");
            return;
        }
        if ((i & 1) != 0) {
            num = 0;
        }
        abstractC18623n5.m157957x(num);
    }

    /* JADX INFO: renamed from: B */
    public boolean mo153356B() {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m157932D(@NotNull PayMethod method) {
        method.getClass();
        if (m6h0.m153227m(this.currentPurchaseSection, m157953t(), this.act)) {
            e30<Integer> e30Var = this.dialogStateAction;
            if (e30Var != null) {
                e30Var.call(0);
                return;
            }
            return;
        }
        if (TEnum.equals(method, "alipay")) {
            m157955v(this.dialogStateAction);
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            m157921C(payMethod);
            return;
        }
        if (TEnum.equals(method, "wechat")) {
            m157958z(this.dialogStateAction);
            PayMethod payMethod2 = PayMethod.get("wechat");
            payMethod2.getClass();
            m157921C(payMethod2);
            return;
        }
        if (TEnum.equals(method, PayMethod.jingdong)) {
            m157956w(this.dialogStateAction);
            PayMethod payMethod3 = PayMethod.get(PayMethod.jingdong);
            payMethod3.getClass();
            m157921C(payMethod3);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract String mo95238E();

    /* JADX INFO: renamed from: F */
    public final void m157933F() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d != null) {
            mo95240H();
            mo95241I(this.currentPayMethod, c8765d);
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo95239G(@NotNull PayMethod currentPayMethod);

    /* JADX INFO: renamed from: H */
    public abstract void mo95240H();

    /* JADX INFO: renamed from: I */
    public abstract void mo95241I(@NotNull PayMethod currentPayMethod, @NotNull C8765d section);

    /* JADX INFO: renamed from: J */
    public final void m157934J() {
        C8765d c8765d = this.currentPurchaseSectionSource;
        if (c8765d != null) {
            this.currentPurchaseSection = c8765d;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final C8765d.a m157935K(@NotNull C8765d section) {
        section.getClass();
        if (!p2b0.m167133h().m167157z() || C8766e.m53650x(this.from)) {
            C8765d.a aVarM53520b = section.m53532n() ? section.m53520b() : section.m53522d();
            aVarM53520b.getClass();
            return aVarM53520b;
        }
        if (NullChecker.m81303a(section.m53522d())) {
            C8765d.a aVarM53522d = section.m53522d();
            aVarM53522d.getClass();
            return aVarM53522d;
        }
        C8765d.a aVarM53520b2 = section.m53520b();
        aVarM53520b2.getClass();
        return aVarM53520b2;
    }

    /* JADX INFO: renamed from: L */
    public final void m157936L(@NotNull PayMethod payMethod) {
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: M */
    public final void m157937M(@Nullable C8765d c8765d) {
        this.currentPurchaseSection = c8765d;
    }

    /* JADX INFO: renamed from: N */
    public final void m157938N(@Nullable C8765d c8765d) {
        this.currentPurchaseSectionSource = c8765d;
    }

    /* JADX INFO: renamed from: O */
    public final void m157939O(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: P */
    public final void m157940P(@Nullable Privilege privilege) {
        this.firstPrivilege = privilege;
    }

    /* JADX INFO: renamed from: Q */
    public final void m157941Q(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccess = onPaySuccess;
    }

    /* JADX INFO: renamed from: R */
    public final void m157942R(@NotNull String other) {
        other.getClass();
        this.onlineMatchPushUser = other;
    }

    /* JADX INFO: renamed from: S */
    public final void m157943S(@Nullable bi60 bi60Var) {
        this.paymentTextResponseData = bi60Var;
    }

    /* JADX INFO: renamed from: T */
    public final void m157944T() {
        C8765d c8765d;
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_purchase_intermediate_page", getClass().getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE), vwb.m200311Y("purchaseShowFrom", w2b0.m201088b(this.from)), vwb.m200311Y("productType", m157953t().productCategory().toString()), vwb.m200311Y("skuID", m157949o()));
        ArrayList arrayListM200324f0 = vwb.m200324f0(PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get(PayMethod.jingdong));
        if (mo153356B() && (c8765d = this.currentPurchaseSection) != null) {
            List<PayMethod> listM167155x = p2b0.m167133h().m167155x(c8765d.m53532n() ? c8765d.m53520b().m53601s() : c8765d.m53522d().m53601s());
            listM167155x.getClass();
            arrayListM200324f0.clear();
            arrayListM200324f0.addAll(listM167155x);
        }
        new wf60(this.act, m157953t()).m202975r(this.currentPayMethod).m202969l((sab0.m182899q(m157953t()) && C8766e.m53650x(this.from)) ? false : true).m202974q(new e30() { // from class: l.k5
            @Override // p149l.e30
            public final void call(Object obj) {
                AbstractC18623n5.m157925g(this.f121134a, (PayMethod) obj);
            }
        }).m202977t(arrayListM200324f0).m202973p(new DialogInterface.OnDismissListener() { // from class: l.l5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC18623n5.m157929k(cwf0VarM133794c, dialogInterface);
            }
        }).m202976s();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: V */
    public final void m157945V() {
        j5b0 j5b0Var;
        hab0 purchaseTrack;
        bi60 bi60Var = this.paymentTextResponseData;
        if (bi60Var == null || !bi60Var.getNeedTrackSticker() || (j5b0Var = this.mediator) == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) {
            return;
        }
        C8765d c8765d = this.currentPurchaseSection;
        c8765d.getClass();
        purchaseTrack.m130126z(c8765d, bi60Var, this.purchaseType);
    }

    @Override // p149l.d1m
    /* JADX INFO: renamed from: b */
    public void mo100278b() {
        super.mo100278b();
        if (CoreModule.m29935P().m94651a().mo33425U()) {
            CoreModule.f17545c.f19591O0.m30075C3();
            CoreModule.f17545c.f19591O0.m30074B3();
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        if (TEnum.equals(productCategory, "svip") && !C8766e.m53650x(this.from)) {
            this.refundSubscription = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30593K5()).subscribe(mkd0.m154956H(new e30() { // from class: l.g5
                @Override // p149l.e30
                public final void call(Object obj) {
                    AbstractC18623n5.m157926h(this.f100596a, (Optional) obj);
                }
            }, new e30() { // from class: l.h5
                @Override // p149l.e30
                public final void call(Object obj) {
                    AbstractC18623n5.m157924f(this.f105904a, (Throwable) obj);
                }
            }));
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33583s3()) {
            if ((TEnum.equals(productCategory, "oDiamond") || TEnum.equals(productCategory, ProductCategory.oDiamondPrivateCustom)) && !C8766e.m53650x(this.from)) {
                CoreModule.f17545c.f19654j0.m30593K5();
                this.refundSubscription = this.act.duringCreated(CoreModule.f17545c.f19654j0.m30592K4()).subscribe(mkd0.m154956H(new e30() { // from class: l.i5
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        AbstractC18623n5.m157923c(this.f111495a, (Optional) obj);
                    }
                }, new e30() { // from class: l.j5
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        AbstractC18623n5.m157928j(this.f116254a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo36057d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo36058e() {
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccess;
        if (g30Var == null) {
            return false;
        }
        g30Var.mo36055a(this.purchaseType, this.act, this.from);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final PayMethod getCurrentPayMethod() {
        return this.currentPayMethod;
    }

    /* JADX INFO: renamed from: m */
    public final double m157947m() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        Merchandise merchandiseM53601s = c8765d.m53532n() ? c8765d.m53520b().m53601s() : c8765d.m53522d().m53601s();
        return rxa0.m181493n(merchandiseM53601s) ? merchandiseM53601s.getFirstCouponPrice() : merchandiseM53601s.defaultStockKeepUnit.prices.price;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final C8765d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    /* JADX INFO: renamed from: o */
    public final String m157949o() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d == null) {
            return "";
        }
        String str = (c8765d.m53532n() ? c8765d.m53520b().m53601s() : c8765d.m53522d().m53601s()).defaultStockKeepUnit.f20507id;
        return str == null ? "" : str;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final e30<Integer> m157950p() {
        return this.dialogStateAction;
    }

    /* JADX INFO: renamed from: q */
    public final String m157951q() {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d == null) {
            return "";
        }
        if (c8765d.m53532n()) {
            if (c8765d.m53520b().m53601s().weekly()) {
                return "7d";
            }
            return c8765d.m53520b().m53605w() + "m";
        }
        if (c8765d.m53522d().m53601s().weekly()) {
            return "7d";
        }
        return c8765d.m53522d().m53605w() + "m";
    }

    @Override // p149l.d1m
    public void register() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54011I(new b());
            j5b0Var.m54008F(new c());
            j5b0Var.m54010H(new d());
        }
    }

    @Override // p149l.d1m
    public void release() {
        mkd0.m154992z(this.refundSubscription);
        this.refundSubscription = null;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final bi60 getPaymentTextResponseData() {
        return this.paymentTextResponseData;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final PurchaseType m157953t() {
        PurchaseType purchaseTypeM182884b;
        PurchaseType purchaseType = this.purchaseType;
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d == null || !NullChecker.m81303a(c8765d.m53521c()) || (purchaseTypeM182884b = sab0.m182884b(c8765d.m53521c().category)) == PurchaseType.TYPE_NONE) {
            return purchaseType;
        }
        purchaseTypeM182884b.getClass();
        return purchaseTypeM182884b;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final double getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX INFO: renamed from: v */
    public final void m157955v(e30<Integer> dismiss) {
        hab0 purchaseTrack;
        rf60 rf60Var = new rf60(m157953t(), this.act, this.from, "");
        j5b0 j5b0Var = this.mediator;
        rf60Var.m179078C((j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) ? null : purchaseTrack.getPurchaseTrackId());
        if (dsa.m113437j()) {
            rf60Var.m179079D(false);
            dsa.m113451x(false);
        }
        m157930r(rf60Var).m179090g(dismiss);
    }

    /* JADX INFO: renamed from: w */
    public final void m157956w(e30<Integer> dismiss) {
        hab0 purchaseTrack;
        rf60 rf60VarM157930r = m157930r(new rf60(m157953t(), this.act, this.from, ""));
        j5b0 j5b0Var = this.mediator;
        rf60VarM157930r.m179078C((j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) ? null : purchaseTrack.getPurchaseTrackId());
        rf60VarM157930r.m179091h(dismiss);
    }

    /* JADX INFO: renamed from: x */
    public final void m157957x(@Nullable Integer paymentTrackSource) {
        C8765d c8765d = this.currentPurchaseSection;
        if (c8765d != null) {
            if (this.paymentHandlerHelper == null) {
                this.paymentHandlerHelper = new gf60(this.act, this.purchaseType, this.from, this.mediator);
            }
            gf60 gf60Var = this.paymentHandlerHelper;
            gf60 gf60Var2 = null;
            if (gf60Var == null) {
                Intrinsics.m87502r("paymentHandlerHelper");
                gf60Var = null;
            }
            if (gf60Var.getPurchaseType() != m157953t()) {
                this.paymentHandlerHelper = new gf60(this.act, m157953t(), this.from, this.mediator);
            }
            ef60 ef60Var = new ef60(c8765d, this.currentPurchaseSectionSource, this.currentPayMethod, this.refundAmount, this.paymentTextResponseData, paymentTrackSource, this.dialogStateAction);
            gf60 gf60Var3 = this.paymentHandlerHelper;
            if (gf60Var3 == null) {
                Intrinsics.m87502r("paymentHandlerHelper");
            } else {
                gf60Var2 = gf60Var3;
            }
            gf60Var2.m125880b(ef60Var, this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m157958z(e30<Integer> dismiss) {
        C8765d c8765d;
        C8765d.a aVarM53522d;
        hab0 purchaseTrack;
        rf60 rf60VarM157930r = m157930r(new rf60(m157953t(), this.act, this.from, ""));
        j5b0 j5b0Var = this.mediator;
        Merchandise merchandiseM53601s = null;
        rf60VarM157930r.m179078C((j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) ? null : purchaseTrack.getPurchaseTrackId());
        if (p2b0.m167133h().m167157z() && !C8766e.m53650x(this.from) && (c8765d = this.currentPurchaseSection) != null && c8765d.m53531m()) {
            C8765d c8765d2 = this.currentPurchaseSection;
            c8765d2.getClass();
            int i = c8765d2.m53520b().m53601s().quantity;
            j5b0 j5b0Var2 = this.mediator;
            C8765d c8765dM139831a0 = j5b0Var2 != null ? j5b0Var2.m139831a0(i) : null;
            if (c8765dM139831a0 != null && (aVarM53522d = c8765dM139831a0.m53522d()) != null) {
                merchandiseM53601s = aVarM53522d.m53601s();
            }
            rf60VarM157930r.m179108y(merchandiseM53601s);
        }
        rf60VarM157930r.m179093j(dismiss);
    }
}
