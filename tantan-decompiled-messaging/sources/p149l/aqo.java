package p149l;

import android.text.TextUtils;
import com.android.billingclient.api.AbstractC0865a;
import com.android.billingclient.api.C0871d;
import com.android.billingclient.api.Purchase;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.GPAffiliateTransaction;
import com.p046p1.mobile.putong.data.GPTransaction;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 42\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0004X\u0085D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\b8\u0004X\u0085D¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010*\u001a\u00020\b8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010-\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00103\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u001c\u00102¨\u00065"}, m87232d2 = {"Ll/aqo;", "Ll/ftl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/android/billingclient/api/a;", "billingClient", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)V", "", "step", "message", "", "isRestore", "type", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/p1/mobile/putong/data/Order;", "order", "k", "(Lcom/p1/mobile/putong/data/Order;Ljava/lang/String;)V", "Lcom/android/billingclient/api/Purchase;", FirebaseAnalytics.Event.PURCHASE, RXScreenCaptureService.KEY_INDEX, "(Lcom/android/billingclient/api/Purchase;)Z", "purchaseToken", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "j", "()V", "m", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/lang/String;", "URL_PAY", "c", "URL_RESTORE", Constants.INAPP_DATA_TAG, "TYPE_PRODUCT", "e", "TYPE_SUBS", "TAG", "g", "Lcom/android/billingclient/api/a;", "client", "h", "Ll/c4g0;", "Ll/c4g0;", "subscription", "Z", "tryConsumed", "Companion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public final AbstractC0865a client;

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

    public aqo(@NotNull Act act, @NotNull AbstractC0865a abstractC0865a) {
        act.getClass();
        abstractC0865a.getClass();
        this.act = act;
        this.URL_PAY = "/googleplay/orders";
        this.URL_RESTORE = "/googleplay/orders";
        this.TYPE_PRODUCT = "product";
        this.TYPE_SUBS = "subscription";
        this.TAG = "IntlPayment";
        this.client = abstractC0865a;
        if (act instanceof PutongAct) {
            this.subscription = act.duringCreated(((PutongAct) act).iap().m148934j()).subscribe(mkd0.m154955G(new e30() { // from class: l.ypo
                @Override // p149l.e30
                public final void call(Object obj) {
                    aqo.m98314e(this.f199472a, (j760) obj);
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m98314e(aqo aqoVar, j760 j760Var) {
        Order orderNew_;
        int iM4966b;
        String str;
        int iM4966b2;
        j760Var.getClass();
        String str2 = aqoVar.type;
        aqoVar.type = str2;
        Unit unit = Unit.INSTANCE;
        aqoVar.m98321l("7", "处理 Google Play 商品购买 回调 " + j760Var, false, str2);
        ((C0871d) j760Var.f116564a).m4966b();
        ((C0871d) j760Var.f116564a).m4965a();
        boolean z = true;
        if (((C0871d) j760Var.f116564a).m4966b() == 0 && NullChecker.m81303a(j760Var.f116565b)) {
            S s = j760Var.f116565b;
            s.getClass();
            if (((Collection) s).isEmpty()) {
                aqoVar.m98321l("error", "billResult getResponseCode ->" + ((C0871d) j760Var.f116564a).m4966b(), false, aqoVar.type);
                orderNew_ = Order.new_();
                iM4966b = ((C0871d) j760Var.f116564a).m4966b();
                if (iM4966b != 1) {
                    str = BundleStatus.userCancel;
                } else if (iM4966b != 7) {
                    str = "failed";
                } else {
                    str = "locked";
                }
                orderNew_.orderStatus = BundleStatus.get(str);
                qib0.f154705T.m29590Z(orderNew_);
                iM4966b2 = ((C0871d) j760Var.f116564a).m4966b();
                if (iM4966b2 != -3) {
                    aqoVar.m98320k(orderNew_, "SERVICE_TIMEOUT");
                    aqoVar.m98321l("error", "SERVICE_TIMEOUT", false, aqoVar.type);
                } else if (iM4966b2 != -2) {
                    aqoVar.m98320k(orderNew_, "FEATURE_NOT_SUPPORTED");
                    aqoVar.m98321l("error", "FEATURE_NOT_SUPPORTED", false, aqoVar.type);
                } else if (iM4966b2 != -1) {
                    aqoVar.m98320k(orderNew_, "SERVICE_DISCONNECTED");
                    aqoVar.m98321l("error", "SERVICE_DISCONNECTED", false, aqoVar.type);
                } else if (iM4966b2 != 12) {
                    switch (iM4966b2) {
                        case 1:
                            aqoVar.m98320k(orderNew_, "USER_CANCELED");
                            aqoVar.m98321l("error", "USER_CANCELED", false, aqoVar.type);
                            break;
                        case 2:
                            aqoVar.m98320k(orderNew_, "SERVICE_UNAVAILABLE");
                            aqoVar.m98321l("error", "SERVICE_UNAVAILABLE", false, aqoVar.type);
                            break;
                        case 3:
                            aqoVar.m98320k(orderNew_, "BILLING_UNAVAILABLE");
                            aqoVar.m98321l("error", "BILLING_UNAVAILABLE", false, aqoVar.type);
                            break;
                        case 4:
                            aqoVar.m98320k(orderNew_, "ITEM_UNAVAILABLE");
                            aqoVar.m98321l("error", "ITEM_UNAVAILABLE", false, aqoVar.type);
                            break;
                        case 5:
                            aqoVar.m98320k(orderNew_, "DEVELOPER_ERROR");
                            aqoVar.m98321l("error", "DEVELOPER_ERROR", false, aqoVar.type);
                            break;
                        case 6:
                            aqoVar.m98320k(orderNew_, "ERROR");
                            aqoVar.m98321l("error", "ERROR", false, aqoVar.type);
                            break;
                        case 7:
                            aqoVar.m98320k(orderNew_, "ITEM_ALREADY_OWNED");
                            aqoVar.m98321l("error", "ITEM_ALREADY_OWNED", false, aqoVar.type);
                            break;
                        case 8:
                            aqoVar.m98320k(orderNew_, "ITEM_NOT_OWNED");
                            aqoVar.m98321l("error", "ITEM_NOT_OWNED", false, aqoVar.type);
                            break;
                        default:
                            aqoVar.m98320k(orderNew_, "UNKNOWN_ERROR");
                            aqoVar.m98321l("error", "UNKNOWN_ERROR", false, aqoVar.type);
                            break;
                    }
                } else {
                    aqoVar.m98320k(orderNew_, "NETWORK_ERROR");
                    aqoVar.m98321l("error", "NETWORK_ERROR", false, aqoVar.type);
                }
            } else {
                Iterator it = ((List) j760Var.f116565b).iterator();
                while (it.hasNext()) {
                    if (!aqoVar.m98318i((Purchase) it.next())) {
                        z = false;
                    }
                }
                if (!z) {
                    CoreModule.f17554l.m94651a().mo33596tk(aqoVar.act);
                }
            }
        } else {
            aqoVar.m98321l("error", "billResult getResponseCode ->" + ((C0871d) j760Var.f116564a).m4966b(), false, aqoVar.type);
            orderNew_ = Order.new_();
            iM4966b = ((C0871d) j760Var.f116564a).m4966b();
            if (iM4966b != 1) {
                str = BundleStatus.userCancel;
            } else if (iM4966b != 7) {
                str = "failed";
            } else {
                str = "locked";
            }
            orderNew_.orderStatus = BundleStatus.get(str);
            qib0.f154705T.m29590Z(orderNew_);
            iM4966b2 = ((C0871d) j760Var.f116564a).m4966b();
            if (iM4966b2 != -3) {
                aqoVar.m98320k(orderNew_, "SERVICE_TIMEOUT");
                aqoVar.m98321l("error", "SERVICE_TIMEOUT", false, aqoVar.type);
            } else if (iM4966b2 != -2) {
                aqoVar.m98320k(orderNew_, "FEATURE_NOT_SUPPORTED");
                aqoVar.m98321l("error", "FEATURE_NOT_SUPPORTED", false, aqoVar.type);
            } else if (iM4966b2 != -1) {
                aqoVar.m98320k(orderNew_, "SERVICE_DISCONNECTED");
                aqoVar.m98321l("error", "SERVICE_DISCONNECTED", false, aqoVar.type);
            } else if (iM4966b2 != 12) {
                switch (iM4966b2) {
                    case 1:
                        aqoVar.m98320k(orderNew_, "USER_CANCELED");
                        aqoVar.m98321l("error", "USER_CANCELED", false, aqoVar.type);
                        break;
                    case 2:
                        aqoVar.m98320k(orderNew_, "SERVICE_UNAVAILABLE");
                        aqoVar.m98321l("error", "SERVICE_UNAVAILABLE", false, aqoVar.type);
                        break;
                    case 3:
                        aqoVar.m98320k(orderNew_, "BILLING_UNAVAILABLE");
                        aqoVar.m98321l("error", "BILLING_UNAVAILABLE", false, aqoVar.type);
                        break;
                    case 4:
                        aqoVar.m98320k(orderNew_, "ITEM_UNAVAILABLE");
                        aqoVar.m98321l("error", "ITEM_UNAVAILABLE", false, aqoVar.type);
                        break;
                    case 5:
                        aqoVar.m98320k(orderNew_, "DEVELOPER_ERROR");
                        aqoVar.m98321l("error", "DEVELOPER_ERROR", false, aqoVar.type);
                        break;
                    case 6:
                        aqoVar.m98320k(orderNew_, "ERROR");
                        aqoVar.m98321l("error", "ERROR", false, aqoVar.type);
                        break;
                    case 7:
                        aqoVar.m98320k(orderNew_, "ITEM_ALREADY_OWNED");
                        aqoVar.m98321l("error", "ITEM_ALREADY_OWNED", false, aqoVar.type);
                        break;
                    case 8:
                        aqoVar.m98320k(orderNew_, "ITEM_NOT_OWNED");
                        aqoVar.m98321l("error", "ITEM_NOT_OWNED", false, aqoVar.type);
                        break;
                    default:
                        aqoVar.m98320k(orderNew_, "UNKNOWN_ERROR");
                        aqoVar.m98321l("error", "UNKNOWN_ERROR", false, aqoVar.type);
                        break;
                }
            } else {
                aqoVar.m98320k(orderNew_, "NETWORK_ERROR");
                aqoVar.m98321l("error", "NETWORK_ERROR", false, aqoVar.type);
            }
        }
        mkd0.m154992z(aqoVar.subscription);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final aqo m98316h(@NotNull Act act, @Nullable AbstractC0865a abstractC0865a) {
        return INSTANCE.m98323a(act, abstractC0865a);
    }

    /* JADX INFO: renamed from: f */
    public void m98317f(@NotNull String purchaseToken, @Nullable String type) {
        purchaseToken.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Intrinsics.m87488d(SubSampleInformationBox.TYPE, type)) {
                i10 i10VarM133941a = i10.m133938b().m133942b(purchaseToken).m133941a();
                i10VarM133941a.getClass();
                this.client.mo4823a(i10VarM133941a, new j10() { // from class: l.zpo
                    @Override // p149l.j10
                    /* JADX INFO: renamed from: e */
                    public final void mo5070e(C0871d c0871d) {
                        aqo.m98315g(c0871d);
                    }
                });
            }
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m98318i(@NotNull Purchase purchase) {
        purchase.getClass();
        if (purchase.m4811d() != 1) {
            m98321l("error", purchase.toString(), false, this.type);
            m98320k(null, "purchaseState = " + purchase.m4811d() + "purchase failed");
            return false;
        }
        GPAffiliateTransaction gPAffiliateTransactionNew_ = GPAffiliateTransaction.new_();
        gPAffiliateTransactionNew_.purchaseData = purchase.m4809b();
        gPAffiliateTransactionNew_.signature = purchase.m4813f();
        Order orderNew_ = Order.new_();
        String strM4808a = purchase.m4808a();
        if (strM4808a == null) {
            strM4808a = "";
        }
        orderNew_.orderId = strM4808a;
        orderNew_.affiliateTransaction = gPAffiliateTransactionNew_;
        orderNew_.orderStatus = BundleStatus.get(BundleStatus.purchased);
        qib0.f154705T.m29590Z(orderNew_);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m98319j() {
        if (CoreModule.m29935P().m94651a().mo33442Xi()) {
            CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("svip"));
            CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("seeWhoLikedMe"));
            CoreModule.f17545c.f19654j0.m30598N4(ProductCategory.get("vip"));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m98320k(@Nullable Order order, @Nullable String message) {
        GPTransaction gPTransactionNew_;
        if (order == null) {
            j760 j760VarM200311Y = vwb.m200311Y(FirebaseAnalytics.Param.TRANSACTION_ID, "");
            j760 j760VarM200311Y2 = vwb.m200311Y("transaction_date", "");
            j760 j760VarM200311Y3 = vwb.m200311Y("platform", "googlePay");
            j760 j760VarM200311Y4 = vwb.m200311Y("code", 202001);
            if (TextUtils.isEmpty(message)) {
                message = "";
            }
            zvf0.m220371D("e_purchase_pay_response", "p_purchase_page", j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, j760VarM200311Y4, vwb.m200311Y("message", message));
            return;
        }
        String json = null;
        if (NullChecker.m81303a(order.affiliateTransaction)) {
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
        j760 j760VarM200311Y5 = vwb.m200311Y(FirebaseAnalytics.Param.TRANSACTION_ID, json);
        j760 j760VarM200311Y6 = vwb.m200311Y("transaction_date", order.affiliateTransaction == null ? "" : Long.valueOf(mqi0.m155943n()));
        j760 j760VarM200311Y7 = vwb.m200311Y("platform", "googlePay");
        j760 j760VarM200311Y8 = vwb.m200311Y("code", order.orderStatus);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        zvf0.m220371D("e_purchase_pay_response", "p_purchase_page", j760VarM200311Y5, j760VarM200311Y6, j760VarM200311Y7, j760VarM200311Y8, vwb.m200311Y("message", message));
    }

    /* JADX INFO: renamed from: l */
    public void m98321l(@NotNull String step, @Nullable String message, boolean isRestore, @Nullable String type) {
        step.getClass();
        String str = isRestore ? "e_purchase_google_pay_restore_step" : "e_purchase_google_pay_step";
        String str2 = isRestore ? "p_purchase_google_pay_restore" : "p_purchase_google_pay";
        j760 j760VarM200311Y = vwb.m200311Y("purchase_step", step);
        if (!NullChecker.m81303a(type)) {
            type = "";
        }
        j760 j760VarM200311Y2 = vwb.m200311Y("purchase_type", type);
        j760 j760VarM200311Y3 = vwb.m200311Y("is_new_code", Boolean.FALSE);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        zvf0.m220371D(str, str2, j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, vwb.m200311Y("message", message));
    }

    /* JADX INFO: renamed from: m */
    public void m98322m() {
        qib0.m174815e1("purchase_failed_gp", new Object[0]);
    }

    /* JADX INFO: renamed from: l.aqo$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/aqo$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/android/billingclient/api/a;", "billingClient", "Ll/aqo;", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)Ll/aqo;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final aqo m98323a(@NotNull Act act, @Nullable AbstractC0865a billingClient) {
            act.getClass();
            if (billingClient == null) {
                return null;
            }
            C0871d c0871dMo4826d = billingClient.mo4826d("fff");
            c0871dMo4826d.getClass();
            ura.m195053e().m195057d().mo33820ep();
            Objects.toString(c0871dMo4826d);
            return new vro(act, billingClient);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m98315g(C0871d c0871d) {
    }
}
