package p003l;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.android.billingclient.api.d;
import com.p000p1.mobile.putong.core.data.ChatInterruptStage;
import com.p000p1.mobile.putong.core.data.CoreStaticData;
import com.p000p1.mobile.putong.core.data.IntlPayQueryType;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.GPAffiliateTransaction;
import com.p1.mobile.putong.data.GPTransaction;
import com.p1.mobile.putong.data.Order;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.e30;
import l.i10;
import l.j10;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.ura;
import l.vwb;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 42\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0004X\u0085D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\b8\u0004X\u0085D¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010*\u001a\u00020\b8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010-\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00103\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u001c\u00102¨\u00065"}, d2 = {"Ll/aqo;", "Ll/ftl;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/android/billingclient/api/a;", "billingClient", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)V", "", "step", "message", "", "isRestore", "type", "", "l", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/p1/mobile/putong/data/Order;", IntlPayQueryType.order, "k", "(Lcom/p1/mobile/putong/data/Order;Ljava/lang/String;)V", "Lcom/android/billingclient/api/Purchase;", "purchase", "i", "(Lcom/android/billingclient/api/Purchase;)Z", "purchaseToken", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "j", "()V", "m", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/lang/String;", "URL_PAY", "c", "URL_RESTORE", "d", "TYPE_PRODUCT", "e", "TYPE_SUBS", "TAG", "g", "Lcom/android/billingclient/api/a;", "client", "h", "Ll/c4g0;", "Ll/c4g0;", "subscription", "Z", "tryConsumed", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public abstract class aqo implements ftl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String URL_PAY;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String URL_RESTORE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public String TYPE_PRODUCT;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public String TYPE_SUBS;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final a client;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public String type;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public c4g0 subscription;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    public boolean tryConsumed;

    public aqo(@NotNull Act act, @NotNull a aVar) {
        act.getClass();
        aVar.getClass();
        this.act = act;
        this.URL_PAY = "/googleplay/orders";
        this.URL_RESTORE = "/googleplay/orders";
        this.TYPE_PRODUCT = "product";
        this.TYPE_SUBS = "subscription";
        this.TAG = "IntlPayment";
        this.client = aVar;
        if (act instanceof PutongAct) {
            this.subscription = act.duringCreated(((PutongAct) act).iap().j()).subscribe(mkd0.G(new e30() { // from class: l.ypo
                public final void call(Object obj) {
                    aqo.m5499e(this.f9098a, (j760) obj);
                }
            }));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135  */
    /* JADX WARN: Code duplicated, block: B:42:0x0140  */
    /* JADX WARN: Code duplicated, block: B:43:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0156  */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x0076, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static void m5499e(aqo aqoVar, j760 j760Var) {
        Order orderNew_;
        int iB;
        String str;
        int iB2;
        j760Var.getClass();
        String str2 = aqoVar.type;
        aqoVar.type = str2;
        Unit unit = Unit.INSTANCE;
        aqoVar.m5506l("7", "处理 Google Play 商品购买 回调 " + j760Var, false, str2);
        ((d) j760Var.a).b();
        ((d) j760Var.a).a();
        boolean z = true;
        if (((d) j760Var.a).b() == 0 && NullChecker.a(j760Var.b)) {
            Object obj = j760Var.b;
            obj.getClass();
            if (((Collection) obj).isEmpty()) {
                aqoVar.m5506l("error", "billResult getResponseCode ->" + ((d) j760Var.a).b(), false, aqoVar.type);
                orderNew_ = Order.new_();
                iB = ((d) j760Var.a).b();
                if (iB != 1) {
                    str = "userCancel";
                } else if (iB != 7) {
                    str = "failed";
                } else {
                    str = ChatInterruptStage.locked;
                }
                orderNew_.orderStatus = BundleStatus.get(str);
                qib0.T.Z(orderNew_);
                iB2 = ((d) j760Var.a).b();
                if (iB2 != -3) {
                    aqoVar.m5505k(orderNew_, "SERVICE_TIMEOUT");
                    aqoVar.m5506l("error", "SERVICE_TIMEOUT", false, aqoVar.type);
                } else if (iB2 != -2) {
                    aqoVar.m5505k(orderNew_, "FEATURE_NOT_SUPPORTED");
                    aqoVar.m5506l("error", "FEATURE_NOT_SUPPORTED", false, aqoVar.type);
                } else if (iB2 != -1) {
                    aqoVar.m5505k(orderNew_, "SERVICE_DISCONNECTED");
                    aqoVar.m5506l("error", "SERVICE_DISCONNECTED", false, aqoVar.type);
                } else if (iB2 != 12) {
                    switch (iB2) {
                        case 1:
                            aqoVar.m5505k(orderNew_, "USER_CANCELED");
                            aqoVar.m5506l("error", "USER_CANCELED", false, aqoVar.type);
                            break;
                        case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                            aqoVar.m5505k(orderNew_, "SERVICE_UNAVAILABLE");
                            aqoVar.m5506l("error", "SERVICE_UNAVAILABLE", false, aqoVar.type);
                            break;
                        case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                            aqoVar.m5505k(orderNew_, "BILLING_UNAVAILABLE");
                            aqoVar.m5506l("error", "BILLING_UNAVAILABLE", false, aqoVar.type);
                            break;
                        case 4:
                            aqoVar.m5505k(orderNew_, "ITEM_UNAVAILABLE");
                            aqoVar.m5506l("error", "ITEM_UNAVAILABLE", false, aqoVar.type);
                            break;
                        case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                            aqoVar.m5505k(orderNew_, "DEVELOPER_ERROR");
                            aqoVar.m5506l("error", "DEVELOPER_ERROR", false, aqoVar.type);
                            break;
                        case 6:
                            aqoVar.m5505k(orderNew_, "ERROR");
                            aqoVar.m5506l("error", "ERROR", false, aqoVar.type);
                            break;
                        case 7:
                            aqoVar.m5505k(orderNew_, "ITEM_ALREADY_OWNED");
                            aqoVar.m5506l("error", "ITEM_ALREADY_OWNED", false, aqoVar.type);
                            break;
                        case 8:
                            aqoVar.m5505k(orderNew_, "ITEM_NOT_OWNED");
                            aqoVar.m5506l("error", "ITEM_NOT_OWNED", false, aqoVar.type);
                            break;
                        default:
                            aqoVar.m5505k(orderNew_, "UNKNOWN_ERROR");
                            aqoVar.m5506l("error", "UNKNOWN_ERROR", false, aqoVar.type);
                            break;
                    }
                } else {
                    aqoVar.m5505k(orderNew_, "NETWORK_ERROR");
                    aqoVar.m5506l("error", "NETWORK_ERROR", false, aqoVar.type);
                }
            } else {
                Iterator it = ((List) j760Var.b).iterator();
                while (it.hasNext()) {
                    if (!aqoVar.m5503i((Purchase) it.next())) {
                        z = false;
                    }
                }
                if (!z) {
                    CoreModule.l.a().tk(aqoVar.act);
                }
            }
        } else {
            aqoVar.m5506l("error", "billResult getResponseCode ->" + ((d) j760Var.a).b(), false, aqoVar.type);
            orderNew_ = Order.new_();
            iB = ((d) j760Var.a).b();
            if (iB != 1) {
                str = "userCancel";
            } else if (iB != 7) {
                str = "failed";
            } else {
                str = ChatInterruptStage.locked;
            }
            orderNew_.orderStatus = BundleStatus.get(str);
            qib0.T.Z(orderNew_);
            iB2 = ((d) j760Var.a).b();
            if (iB2 != -3) {
                aqoVar.m5505k(orderNew_, "SERVICE_TIMEOUT");
                aqoVar.m5506l("error", "SERVICE_TIMEOUT", false, aqoVar.type);
            } else if (iB2 != -2) {
                aqoVar.m5505k(orderNew_, "FEATURE_NOT_SUPPORTED");
                aqoVar.m5506l("error", "FEATURE_NOT_SUPPORTED", false, aqoVar.type);
            } else if (iB2 != -1) {
                aqoVar.m5505k(orderNew_, "SERVICE_DISCONNECTED");
                aqoVar.m5506l("error", "SERVICE_DISCONNECTED", false, aqoVar.type);
            } else if (iB2 != 12) {
                switch (iB2) {
                    case 1:
                        aqoVar.m5505k(orderNew_, "USER_CANCELED");
                        aqoVar.m5506l("error", "USER_CANCELED", false, aqoVar.type);
                        break;
                    case QuickChatCardWrapper.QuickChatCardType.PASSIVE /* 2 */:
                        aqoVar.m5505k(orderNew_, "SERVICE_UNAVAILABLE");
                        aqoVar.m5506l("error", "SERVICE_UNAVAILABLE", false, aqoVar.type);
                        break;
                    case QuickChatCardWrapper.QuickChatCardType.PEI_LIAO /* 3 */:
                        aqoVar.m5505k(orderNew_, "BILLING_UNAVAILABLE");
                        aqoVar.m5506l("error", "BILLING_UNAVAILABLE", false, aqoVar.type);
                        break;
                    case 4:
                        aqoVar.m5505k(orderNew_, "ITEM_UNAVAILABLE");
                        aqoVar.m5506l("error", "ITEM_UNAVAILABLE", false, aqoVar.type);
                        break;
                    case CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE /* 5 */:
                        aqoVar.m5505k(orderNew_, "DEVELOPER_ERROR");
                        aqoVar.m5506l("error", "DEVELOPER_ERROR", false, aqoVar.type);
                        break;
                    case 6:
                        aqoVar.m5505k(orderNew_, "ERROR");
                        aqoVar.m5506l("error", "ERROR", false, aqoVar.type);
                        break;
                    case 7:
                        aqoVar.m5505k(orderNew_, "ITEM_ALREADY_OWNED");
                        aqoVar.m5506l("error", "ITEM_ALREADY_OWNED", false, aqoVar.type);
                        break;
                    case 8:
                        aqoVar.m5505k(orderNew_, "ITEM_NOT_OWNED");
                        aqoVar.m5506l("error", "ITEM_NOT_OWNED", false, aqoVar.type);
                        break;
                    default:
                        aqoVar.m5505k(orderNew_, "UNKNOWN_ERROR");
                        aqoVar.m5506l("error", "UNKNOWN_ERROR", false, aqoVar.type);
                        break;
                }
            } else {
                aqoVar.m5505k(orderNew_, "NETWORK_ERROR");
                aqoVar.m5506l("error", "NETWORK_ERROR", false, aqoVar.type);
            }
        }
        mkd0.z(aqoVar.subscription);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final aqo m5501h(@NotNull Act act, @Nullable a aVar) {
        return INSTANCE.m5508a(act, aVar);
    }

    /* JADX INFO: renamed from: f */
    public void m5502f(@NotNull String purchaseToken, @Nullable String type) {
        purchaseToken.getClass();
        try {
            Result.Companion companion = Result.Companion;
            if (Intrinsics.d("subs", type)) {
                i10 i10VarA = i10.b().b(purchaseToken).a();
                i10VarA.getClass();
                this.client.a(i10VarA, new j10() { // from class: l.zpo
                    /* JADX INFO: renamed from: e */
                    public final void m11444e(d dVar) {
                        aqo.m5500g(dVar);
                    }
                });
            }
            Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(ResultKt.a(th));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m5503i(@NotNull Purchase purchase) {
        purchase.getClass();
        if (purchase.d() != 1) {
            m5506l("error", purchase.toString(), false, this.type);
            m5505k(null, "purchaseState = " + purchase.d() + "purchase failed");
            return false;
        }
        GPAffiliateTransaction gPAffiliateTransactionNew_ = GPAffiliateTransaction.new_();
        gPAffiliateTransactionNew_.purchaseData = purchase.b();
        gPAffiliateTransactionNew_.signature = purchase.f();
        Order orderNew_ = Order.new_();
        String strA = purchase.a();
        if (strA == null) {
            strA = "";
        }
        orderNew_.orderId = strA;
        orderNew_.affiliateTransaction = gPAffiliateTransactionNew_;
        orderNew_.orderStatus = BundleStatus.get("purchased");
        qib0.T.Z(orderNew_);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m5504j() {
        if (CoreModule.P().a().Xi()) {
            CoreModule.c.j0.N4(ProductCategory.get("svip"));
            CoreModule.c.j0.N4(ProductCategory.get("seeWhoLikedMe"));
            CoreModule.c.j0.N4(ProductCategory.get("vip"));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5505k(@Nullable Order order, @Nullable String message) {
        GPTransaction gPTransactionNew_;
        if (order == null) {
            j760 j760VarY = vwb.Y("transaction_id", "");
            j760 j760VarY2 = vwb.Y("transaction_date", "");
            j760 j760VarY3 = vwb.Y("platform", "googlePay");
            j760 j760VarY4 = vwb.Y("code", 202001);
            if (TextUtils.isEmpty(message)) {
                message = "";
            }
            zvf0.D("e_purchase_pay_response", "p_purchase_page", new j760[]{j760VarY, j760VarY2, j760VarY3, j760VarY4, vwb.Y("message", message)});
            return;
        }
        String json = null;
        if (NullChecker.a(order.affiliateTransaction)) {
            gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
        } else {
            gPTransactionNew_ = null;
        }
        if (order.affiliateTransaction == null) {
            json = "";
        } else if (gPTransactionNew_ != null) {
            json = gPTransactionNew_.toJson();
        }
        j760 j760VarY5 = vwb.Y("transaction_id", json);
        j760 j760VarY6 = vwb.Y("transaction_date", order.affiliateTransaction == null ? "" : Long.valueOf(mqi0.n()));
        j760 j760VarY7 = vwb.Y("platform", "googlePay");
        j760 j760VarY8 = vwb.Y("code", order.orderStatus);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        zvf0.D("e_purchase_pay_response", "p_purchase_page", new j760[]{j760VarY5, j760VarY6, j760VarY7, j760VarY8, vwb.Y("message", message)});
    }

    /* JADX INFO: renamed from: l */
    public void m5506l(@NotNull String step, @Nullable String message, boolean isRestore, @Nullable String type) {
        step.getClass();
        String str = isRestore ? "e_purchase_google_pay_restore_step" : "e_purchase_google_pay_step";
        String str2 = isRestore ? "p_purchase_google_pay_restore" : "p_purchase_google_pay";
        j760 j760VarY = vwb.Y("purchase_step", step);
        if (!NullChecker.a(type)) {
            type = "";
        }
        j760 j760VarY2 = vwb.Y("purchase_type", type);
        j760 j760VarY3 = vwb.Y("is_new_code", Boolean.FALSE);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        zvf0.D(str, str2, new j760[]{j760VarY, j760VarY2, j760VarY3, vwb.Y("message", message)});
    }

    /* JADX INFO: renamed from: m */
    public void m5507m() {
        qib0.e1("purchase_failed_gp", new Object[0]);
    }

    /* JADX INFO: renamed from: l.aqo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll/aqo$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/android/billingclient/api/a;", "billingClient", "Ll/aqo;", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)Ll/aqo;", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final aqo m5508a(@NotNull Act act, @Nullable a billingClient) {
            act.getClass();
            if (billingClient == null) {
                return null;
            }
            d dVarD = billingClient.d("fff");
            dVarD.getClass();
            ura.e().d().ep();
            Objects.toString(dVarD);
            return new vro(act, billingClient);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m5500g(d dVar) {
    }
}
