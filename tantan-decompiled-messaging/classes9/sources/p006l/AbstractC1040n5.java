package p006l;

import android.content.DialogInterface;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.agreement.PurchaseAgreementState;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RefundDetail;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.cwf0;
import l.e30;
import l.e51;
import l.f1m;
import l.g30;
import l.i0e;
import l.j760;
import l.m6h0;
import l.mkd0;
import l.p2b0;
import l.qq3;
import l.rf60;
import l.rxa0;
import l.sab0;
import l.vwb;
import l.w2b0;
import l.wf60;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.n5 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u0002:\u0001QB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0017¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u0017H\u0016¢\u0006\u0004\b*\u0010(J\u000f\u0010+\u001a\u00020\u0017H&¢\u0006\u0004\b+\u0010(J\u0017\u0010-\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0015H&¢\u0006\u0004\b-\u0010\u0019J\u001f\u00100\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010\u0014J\u000f\u0010\u000e\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u000e\u0010(J\u0019\u00104\u001a\u00020\u00172\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b4\u00105J\u0015\u00106\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b6\u0010\u0019J\u000f\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u0010(J\u0017\u00108\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0004¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\u00020\u00172\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b;\u0010 J+\u0010>\u001a\u00020\u00172\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010<¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00172\u0006\u0010D\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0012H\u0016¢\u0006\u0004\bG\u0010\u0014J\u000f\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010\u0014J\u000f\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010\u001bJ\u0015\u0010K\u001a\u00020J2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0005¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0017¢\u0006\u0004\bO\u0010(J\r\u0010P\u001a\u00020\u0017¢\u0006\u0004\bP\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010SR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010XR\"\u0010,\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010\u0019R$\u0010e\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010i\u001a\u0004\u0018\u00010.8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010`\u001a\u0004\bg\u0010b\"\u0004\bh\u0010dR\"\u0010n\u001a\u00020#8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bj\u00106\u001a\u0004\bk\u0010%\"\u0004\bl\u0010mR\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR,\u0010s\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010UR\u0016\u0010y\u001a\u00020w8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010xR%\u0010\u0080\u0001\u001a\u0004\u0018\u00010z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f¨\u0006\u0082\u0001"}, d2 = {"Ll/n5;", "Ll/d1m;", "Ll/f1m;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "Ll/rf60;", "T", "paymentHelper", "r", "(Ll/rf60;)Ll/rf60;", "", "A", "()Z", "Lcom/p1/mobile/putong/data/PayMethod;", "method", "", "C", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "o", "()Ljava/lang/String;", "Ll/e30;", "", "dismiss", "v", "(Ll/e30;)V", "z", "w", "", "m", "()D", "q", "b", "()V", "F", "register", "H", "currentPayMethod", "G", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "I", "(Lcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "B", "paymentTrackSource", "x", "(Ljava/lang/Integer;)V", "D", "release", "p", "()Ll/e30;", "dialogStateAction", "O", "Ll/g30;", "onPaySuccess", "Q", "(Ll/g30;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "P", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "other", "R", "(Ljava/lang/String;)V", "e", "d", "E", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "K", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "t", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "J", "V", "a", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "Ll/j5b0;", "Ll/c4g0;", "Ll/c4g0;", "refundSubscription", "f", "Lcom/p1/mobile/putong/data/PayMethod;", "l", "()Lcom/p1/mobile/putong/data/PayMethod;", "L", "g", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "n", "()Lcom/p1/mobile/putong/core/ui/purchase/d;", "M", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "currentPurchaseSection", "h", "getCurrentPurchaseSectionSource", "N", "currentPurchaseSectionSource", "i", "u", "setRefundAmount", "(D)V", "refundAmount", "j", "Ll/e30;", "k", "Ll/g30;", "onPaymentSuccess", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "onlineMatchPushUser", "Ll/gf60;", "Ll/gf60;", "paymentHandlerHelper", "Ll/bi60;", "Ll/bi60;", "s", "()Ll/bi60;", "S", "(Ll/bi60;)V", "paymentTextResponseData", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public abstract class AbstractC1040n5 implements d1m, f1m {

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
    public com.p1.mobile.putong.core.ui.purchase.d currentPurchaseSection;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public com.p1.mobile.putong.core.ui.purchase.d currentPurchaseSectionSource;

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
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"l/n5$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements AbstractC0212a.d {
        public b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(com.p1.mobile.putong.core.ui.purchase.d section, boolean scroll, boolean isClick, com.p1.mobile.putong.core.ui.purchase.d sectionSource) {
            section.getClass();
            AbstractC1040n5.this.m19664M(section);
            AbstractC1040n5.this.m19665N(sectionSource);
            AbstractC1040n5.this.m19660F();
        }
    }

    /* JADX INFO: renamed from: l.n5$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/n5$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$a;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "", "a", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class c implements AbstractC0212a.a {
        public c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.a
        /* JADX INFO: renamed from: a */
        public void mo7379a(PayMethod payMethod) {
            payMethod.getClass();
            AbstractC1040n5.this.m19663L(payMethod);
            AbstractC1040n5.this.mo11779H();
            AbstractC1040n5 abstractC1040n5 = AbstractC1040n5.this;
            abstractC1040n5.mo11778G(abstractC1040n5.getCurrentPayMethod());
            com.p1.mobile.putong.core.ui.purchase.d currentPurchaseSection = AbstractC1040n5.this.getCurrentPurchaseSection();
            if (currentPurchaseSection != null) {
                AbstractC1040n5 abstractC1040n6 = AbstractC1040n5.this;
                abstractC1040n6.mo11780I(abstractC1040n6.getCurrentPayMethod(), currentPurchaseSection);
            }
        }
    }

    /* JADX INFO: renamed from: l.n5$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/n5$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$c;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;", "agreementState", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/mediator/agreement/PurchaseAgreementState;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements AbstractC0212a.c {
        public d() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.c
        /* JADX INFO: renamed from: a */
        public void mo7380a(PurchaseAgreementState agreementState) {
            agreementState.getClass();
            AbstractC1040n5.this.mo11779H();
        }
    }

    public AbstractC1040n5(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str, @Nullable j5b0 j5b0Var) {
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
    private final boolean m19647A() {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar != null) {
            return dVar.j() | rxa0.n(dVar.n() ? dVar.b().s() : dVar.d().s());
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    private final void m19648C(PayMethod method) {
        double dM19674m = m19674m();
        String strM19676o = m19676o();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", method.toString());
            jSONObject.put("skuID", strM19676o);
            jSONObject.put("purchaseShowFrom", w2b0.b(this.from));
            jSONObject.put("productType", m19680t().productCategory().toString());
            jSONObject.put("price", dM19674m);
            jSONObject.put("if_discount", m19647A());
            jSONObject.put("duration", m19678q());
            jSONObject.put("default_duration", p2b0.h().p(m19680t().productCategory()));
            com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
            boolean z = false;
            boolean zN = dVar != null ? dVar.n() : false;
            boolean z2 = CoreModule.f1534c.f3580O0.m2016w3() && CoreModule.m1854P().m11706a().m5362U();
            String str = "yes";
            if (zN) {
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
            CrashHelper.c(e);
        }
        zvf0.t("e_purchase_button", mo11777E(), jSONObject);
    }

    /* JADX INFO: renamed from: U */
    public static final void m19649U(AbstractC1040n5 abstractC1040n5, PayMethod payMethod) {
        j5b0 j5b0Var = abstractC1040n5.mediator;
        if (j5b0Var != null) {
            payMethod.getClass();
            j5b0Var.m17281e0(payMethod);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m19650c(AbstractC1040n5 abstractC1040n5, Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            abstractC1040n5.refundAmount = ((RefundDetail) optional.get()).totalRefundAmount;
            abstractC1040n5.mo11779H();
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m19651f(AbstractC1040n5 abstractC1040n5, Throwable th) {
        abstractC1040n5.refundAmount = 0.0d;
    }

    /* JADX INFO: renamed from: g */
    public static void m19652g(final AbstractC1040n5 abstractC1040n5, final PayMethod payMethod) {
        e51.G(new Runnable() { // from class: l.m5
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1040n5.m19649U(this.f16797a, payMethod);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m19653h(AbstractC1040n5 abstractC1040n5, Optional optional) {
        optional.getClass();
        if (optional.isPresent()) {
            double d2 = ((RefundDetail) optional.get()).totalRefundAmount;
            if (d2 > 0.0d) {
                abstractC1040n5.refundAmount = d2;
                abstractC1040n5.mo11779H();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m19655j(AbstractC1040n5 abstractC1040n5, Throwable th) {
        abstractC1040n5.refundAmount = 0.0d;
    }

    /* JADX INFO: renamed from: k */
    public static void m19656k(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: r */
    private final <T extends rf60> T m19657r(T paymentHelper) {
        T t = (T) paymentHelper.s(this.currentPurchaseSection).v(this.firstPrivilege).z(this.onlineMatchPushUser).B(this);
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m19658y(AbstractC1040n5 abstractC1040n5, Integer num, int i, Object obj) {
        if (obj != null) {
            qq3.a("Super calls with default arguments not supported in this target, function: handlePrivilegeClick");
            return;
        }
        if ((i & 1) != 0) {
            num = 0;
        }
        abstractC1040n5.m19684x(num);
    }

    /* JADX INFO: renamed from: B */
    public boolean mo19131B() {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m19659D(@NotNull PayMethod method) {
        method.getClass();
        if (m6h0.m(this.currentPurchaseSection, m19680t(), this.act)) {
            e30<Integer> e30Var = this.dialogStateAction;
            if (e30Var != null) {
                e30Var.call(0);
                return;
            }
            return;
        }
        if (TEnum.equals(method, "alipay")) {
            m19682v(this.dialogStateAction);
            PayMethod payMethod = PayMethod.get("alipay");
            payMethod.getClass();
            m19648C(payMethod);
            return;
        }
        if (TEnum.equals(method, "wechat")) {
            m19685z(this.dialogStateAction);
            PayMethod payMethod2 = PayMethod.get("wechat");
            payMethod2.getClass();
            m19648C(payMethod2);
            return;
        }
        if (TEnum.equals(method, "jingdong")) {
            m19683w(this.dialogStateAction);
            PayMethod payMethod3 = PayMethod.get("jingdong");
            payMethod3.getClass();
            m19648C(payMethod3);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public abstract String mo11777E();

    /* JADX INFO: renamed from: F */
    public final void m19660F() {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar != null) {
            mo11779H();
            mo11780I(this.currentPayMethod, dVar);
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo11778G(@NotNull PayMethod currentPayMethod);

    /* JADX INFO: renamed from: H */
    public abstract void mo11779H();

    /* JADX INFO: renamed from: I */
    public abstract void mo11780I(@NotNull PayMethod currentPayMethod, @NotNull com.p1.mobile.putong.core.ui.purchase.d section);

    /* JADX INFO: renamed from: J */
    public final void m19661J() {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSectionSource;
        if (dVar != null) {
            this.currentPurchaseSection = dVar;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final com.p1.mobile.putong.core.ui.purchase.d.a m19662K(@NotNull com.p1.mobile.putong.core.ui.purchase.d section) {
        section.getClass();
        if (!p2b0.h().z() || e.x(this.from)) {
            com.p1.mobile.putong.core.ui.purchase.d.a aVarB = section.n() ? section.b() : section.d();
            aVarB.getClass();
            return aVarB;
        }
        if (NullChecker.a(section.d())) {
            com.p1.mobile.putong.core.ui.purchase.d.a aVarD = section.d();
            aVarD.getClass();
            return aVarD;
        }
        com.p1.mobile.putong.core.ui.purchase.d.a aVarB2 = section.b();
        aVarB2.getClass();
        return aVarB2;
    }

    /* JADX INFO: renamed from: L */
    public final void m19663L(@NotNull PayMethod payMethod) {
        payMethod.getClass();
        this.currentPayMethod = payMethod;
    }

    /* JADX INFO: renamed from: M */
    public final void m19664M(@Nullable com.p1.mobile.putong.core.ui.purchase.d dVar) {
        this.currentPurchaseSection = dVar;
    }

    /* JADX INFO: renamed from: N */
    public final void m19665N(@Nullable com.p1.mobile.putong.core.ui.purchase.d dVar) {
        this.currentPurchaseSectionSource = dVar;
    }

    /* JADX INFO: renamed from: O */
    public final void m19666O(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    /* JADX INFO: renamed from: P */
    public final void m19667P(@Nullable Privilege privilege) {
        this.firstPrivilege = privilege;
    }

    /* JADX INFO: renamed from: Q */
    public final void m19668Q(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccess = onPaySuccess;
    }

    /* JADX INFO: renamed from: R */
    public final void m19669R(@NotNull String other) {
        other.getClass();
        this.onlineMatchPushUser = other;
    }

    /* JADX INFO: renamed from: S */
    public final void m19670S(@Nullable bi60 bi60Var) {
        this.paymentTextResponseData = bi60Var;
    }

    /* JADX INFO: renamed from: T */
    public final void m19671T() {
        com.p1.mobile.putong.core.ui.purchase.d dVar;
        final cwf0 cwf0VarC = i0e.c("p_purchase_intermediate_page", getClass().getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "active"), vwb.Y("purchaseShowFrom", w2b0.b(this.from)), vwb.Y("productType", m19680t().productCategory().toString()), vwb.Y("skuID", m19676o())});
        ArrayList arrayListF0 = vwb.f0(new PayMethod[]{PayMethod.get("alipay"), PayMethod.get("wechat"), PayMethod.get("jingdong")});
        if (mo19131B() && (dVar = this.currentPurchaseSection) != null) {
            List listX = p2b0.h().x(dVar.n() ? dVar.b().s() : dVar.d().s());
            listX.getClass();
            arrayListF0.clear();
            arrayListF0.addAll(listX);
        }
        new wf60(this.act, m19680t()).r(this.currentPayMethod).l((sab0.q(m19680t()) && e.x(this.from)) ? false : true).q(new e30() { // from class: l.k5
            public final void call(Object obj) {
                AbstractC1040n5.m19652g(this.f15616a, (PayMethod) obj);
            }
        }).t(arrayListF0).p(new DialogInterface.OnDismissListener() { // from class: l.l5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC1040n5.m19656k(cwf0VarC, dialogInterface);
            }
        }).s();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: V */
    public final void m19672V() {
        j5b0 j5b0Var;
        hab0 purchaseTrack;
        bi60 bi60Var = this.paymentTextResponseData;
        if (bi60Var == null || !bi60Var.getNeedTrackSticker() || (j5b0Var = this.mediator) == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) {
            return;
        }
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        dVar.getClass();
        purchaseTrack.m16133z(dVar, bi60Var, this.purchaseType);
    }

    @Override // p006l.d1m
    /* JADX INFO: renamed from: b */
    public void mo12554b() {
        super.mo12554b();
        if (CoreModule.m1854P().m11706a().m5362U()) {
            CoreModule.f1534c.f3580O0.m2003C3();
            CoreModule.f1534c.f3580O0.m2002B3();
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        if (TEnum.equals(productCategory, "svip") && !e.x(this.from)) {
            this.refundSubscription = this.act.duringCreated(CoreModule.f1534c.f3643j0.m2521K5()).subscribe(mkd0.H(new e30() { // from class: l.g5
                public final void call(Object obj) {
                    AbstractC1040n5.m19653h(this.f13058a, (Optional) obj);
                }
            }, new e30() { // from class: l.h5
                public final void call(Object obj) {
                    AbstractC1040n5.m19651f(this.f13677a, (Throwable) obj);
                }
            }));
            return;
        }
        if (CoreModule.m1854P().m11706a().m5520s3()) {
            if ((TEnum.equals(productCategory, "oDiamond") || TEnum.equals(productCategory, "oDiamondPrivateCustom")) && !e.x(this.from)) {
                CoreModule.f1534c.f3643j0.m2521K5();
                this.refundSubscription = this.act.duringCreated(CoreModule.f1534c.f3643j0.m2520K4()).subscribe(mkd0.H(new e30() { // from class: l.i5
                    public final void call(Object obj) {
                        AbstractC1040n5.m19650c(this.f14226a, (Optional) obj);
                    }
                }, new e30() { // from class: l.j5
                    public final void call(Object obj) {
                        AbstractC1040n5.m19655j(this.f14998a, (Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean mo19137d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo19139e() {
        g30<PurchaseType, Act, String> g30Var = this.onPaymentSuccess;
        if (g30Var == null) {
            return false;
        }
        g30Var.a(this.purchaseType, this.act, this.from);
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final PayMethod getCurrentPayMethod() {
        return this.currentPayMethod;
    }

    /* JADX INFO: renamed from: m */
    public final double m19674m() {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar == null) {
            return 0.0d;
        }
        Merchandise merchandiseS = dVar.n() ? dVar.b().s() : dVar.d().s();
        return rxa0.n(merchandiseS) ? merchandiseS.getFirstCouponPrice() : merchandiseS.defaultStockKeepUnit.prices.price;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final com.p1.mobile.putong.core.ui.purchase.d getCurrentPurchaseSection() {
        return this.currentPurchaseSection;
    }

    /* JADX INFO: renamed from: o */
    public final String m19676o() {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar == null) {
            return "";
        }
        String str = (dVar.n() ? dVar.b().s() : dVar.d().s()).defaultStockKeepUnit.id;
        return str == null ? "" : str;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final e30<Integer> m19677p() {
        return this.dialogStateAction;
    }

    /* JADX INFO: renamed from: q */
    public final String m19678q() {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar == null) {
            return "";
        }
        if (dVar.n()) {
            if (dVar.b().s().weekly()) {
                return "7d";
            }
            return dVar.b().w() + "m";
        }
        if (dVar.d().s().weekly()) {
            return "7d";
        }
        return dVar.d().w() + "m";
    }

    @Override // p006l.d1m
    public void register() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7346I(new b());
            j5b0Var.m7343F(new c());
            j5b0Var.m7345H(new d());
        }
    }

    @Override // p006l.d1m
    public void release() {
        mkd0.z(this.refundSubscription);
        this.refundSubscription = null;
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final bi60 getPaymentTextResponseData() {
        return this.paymentTextResponseData;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final PurchaseType m19680t() {
        PurchaseType purchaseTypeB;
        PurchaseType purchaseType = this.purchaseType;
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar == null || !NullChecker.a(dVar.c()) || (purchaseTypeB = sab0.b(dVar.c().category)) == PurchaseType.TYPE_NONE) {
            return purchaseType;
        }
        purchaseTypeB.getClass();
        return purchaseTypeB;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final double getRefundAmount() {
        return this.refundAmount;
    }

    /* JADX INFO: renamed from: v */
    public final void m19682v(e30<Integer> dismiss) {
        hab0 purchaseTrack;
        rf60 rf60Var = new rf60(m19680t(), this.act, this.from, "");
        j5b0 j5b0Var = this.mediator;
        rf60Var.C((j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) ? null : purchaseTrack.getPurchaseTrackId());
        if (dsa.m14202j()) {
            rf60Var.D(false);
            dsa.m14216x(false);
        }
        m19657r(rf60Var).g(dismiss);
    }

    /* JADX INFO: renamed from: w */
    public final void m19683w(e30<Integer> dismiss) {
        hab0 purchaseTrack;
        rf60 rf60VarM19657r = m19657r(new rf60(m19680t(), this.act, this.from, ""));
        j5b0 j5b0Var = this.mediator;
        rf60VarM19657r.C((j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) ? null : purchaseTrack.getPurchaseTrackId());
        rf60VarM19657r.h(dismiss);
    }

    /* JADX INFO: renamed from: x */
    public final void m19684x(@Nullable Integer paymentTrackSource) {
        com.p1.mobile.putong.core.ui.purchase.d dVar = this.currentPurchaseSection;
        if (dVar != null) {
            if (this.paymentHandlerHelper == null) {
                this.paymentHandlerHelper = new gf60(this.act, this.purchaseType, this.from, this.mediator);
            }
            gf60 gf60Var = this.paymentHandlerHelper;
            gf60 gf60Var2 = null;
            if (gf60Var == null) {
                Intrinsics.r("paymentHandlerHelper");
                gf60Var = null;
            }
            if (gf60Var.getPurchaseType() != m19680t()) {
                this.paymentHandlerHelper = new gf60(this.act, m19680t(), this.from, this.mediator);
            }
            ef60 ef60Var = new ef60(dVar, this.currentPurchaseSectionSource, this.currentPayMethod, this.refundAmount, this.paymentTextResponseData, paymentTrackSource, this.dialogStateAction);
            gf60 gf60Var3 = this.paymentHandlerHelper;
            if (gf60Var3 == null) {
                Intrinsics.r("paymentHandlerHelper");
            } else {
                gf60Var2 = gf60Var3;
            }
            gf60Var2.m15795b(ef60Var, this);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m19685z(e30<Integer> dismiss) {
        com.p1.mobile.putong.core.ui.purchase.d dVar;
        com.p1.mobile.putong.core.ui.purchase.d.a aVarD;
        hab0 purchaseTrack;
        rf60 rf60VarM19657r = m19657r(new rf60(m19680t(), this.act, this.from, ""));
        j5b0 j5b0Var = this.mediator;
        Merchandise merchandiseS = null;
        rf60VarM19657r.C((j5b0Var == null || (purchaseTrack = j5b0Var.getPurchaseTrack()) == null) ? null : purchaseTrack.getPurchaseTrackId());
        if (p2b0.h().z() && !e.x(this.from) && (dVar = this.currentPurchaseSection) != null && dVar.m()) {
            com.p1.mobile.putong.core.ui.purchase.d dVar2 = this.currentPurchaseSection;
            dVar2.getClass();
            int i = dVar2.b().s().quantity;
            j5b0 j5b0Var2 = this.mediator;
            com.p1.mobile.putong.core.ui.purchase.d dVarM17277a0 = j5b0Var2 != null ? j5b0Var2.m17277a0(i) : null;
            if (dVarM17277a0 != null && (aVarD = dVarM17277a0.d()) != null) {
                merchandiseS = aVarD.s();
            }
            rf60VarM19657r.y(merchandiseS);
        }
        rf60VarM19657r.j(dismiss);
    }
}
