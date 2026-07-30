package p153l;

import android.text.TextUtils;
import com.android.billingclient.api.AbstractC0869a;
import com.android.billingclient.api.C0875d;
import com.android.billingclient.api.Purchase;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.GPAffiliateTransaction;
import com.p051p1.mobile.putong.data.GPTransaction;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 42\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\b8\u0004X\u0085D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\b8\u0004X\u0085D¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010'\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u0014\u0010*\u001a\u00020\b8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010-\u001a\u00020\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010\"R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00103\u001a\u00020\u000b8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\u001c\u00102¨\u00065"}, m88121d2 = {"Ll/aso;", "Ll/tvl;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/android/billingclient/api/a;", "billingClient", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)V", "", "step", "message", "", "isRestore", "type", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Lcom/p1/mobile/putong/data/Order;", "order", "k", "(Lcom/p1/mobile/putong/data/Order;Ljava/lang/String;)V", "Lcom/android/billingclient/api/Purchase;", FirebaseAnalytics.Event.PURCHASE, RXScreenCaptureService.KEY_INDEX, "(Lcom/android/billingclient/api/Purchase;)Z", "purchaseToken", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "j", "()V", "m", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Ljava/lang/String;", "URL_PAY", "c", "URL_RESTORE", Constants.INAPP_DATA_TAG, "TYPE_PRODUCT", "e", "TYPE_SUBS", "TAG", "g", "Lcom/android/billingclient/api/a;", "client", "h", "Ll/kcg0;", "Ll/kcg0;", "subscription", "Z", "tryConsumed", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class aso implements tvl {

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
    public final AbstractC0869a client;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public String type;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public kcg0 subscription;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @JvmField
    public boolean tryConsumed;

    public aso(@NotNull Act act, @NotNull AbstractC0869a abstractC0869a) {
        act.getClass();
        abstractC0869a.getClass();
        this.act = act;
        this.URL_PAY = "/googleplay/orders";
        this.URL_RESTORE = "/googleplay/orders";
        this.TYPE_PRODUCT = "product";
        this.TYPE_SUBS = "subscription";
        this.TAG = "IntlPayment";
        this.client = abstractC0869a;
        if (act instanceof PutongAct) {
            this.subscription = act.duringCreated(((PutongAct) act).iap().m103296j()).subscribe(psd0.m173596G(new y20() { // from class: l.yro
                @Override // p153l.y20
                public final void call(Object obj) {
                    aso.m99951e(this.f201340a, (pf60) obj);
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
    public static void m99951e(aso asoVar, pf60 pf60Var) {
        Order orderNew_;
        int iM4976b;
        String str;
        int iM4976b2;
        pf60Var.getClass();
        String str2 = asoVar.type;
        asoVar.type = str2;
        Unit unit = Unit.INSTANCE;
        asoVar.m99958l("7", "处理 Google Play 商品购买 回调 " + pf60Var, false, str2);
        ((C0875d) pf60Var.f152156a).m4976b();
        ((C0875d) pf60Var.f152156a).m4975a();
        boolean z = true;
        if (((C0875d) pf60Var.f152156a).m4976b() == 0 && NullChecker.m82486a(pf60Var.f152157b)) {
            S s = pf60Var.f152157b;
            s.getClass();
            if (((Collection) s).isEmpty()) {
                asoVar.m99958l("error", "billResult getResponseCode ->" + ((C0875d) pf60Var.f152156a).m4976b(), false, asoVar.type);
                orderNew_ = Order.new_();
                iM4976b = ((C0875d) pf60Var.f152156a).m4976b();
                if (iM4976b != 1) {
                    str = BundleStatus.userCancel;
                } else if (iM4976b != 7) {
                    str = "failed";
                } else {
                    str = "locked";
                }
                orderNew_.orderStatus = BundleStatus.get(str);
                uqb0.f180388T.m30588Z(orderNew_);
                iM4976b2 = ((C0875d) pf60Var.f152156a).m4976b();
                if (iM4976b2 != -3) {
                    asoVar.m99957k(orderNew_, "SERVICE_TIMEOUT");
                    asoVar.m99958l("error", "SERVICE_TIMEOUT", false, asoVar.type);
                } else if (iM4976b2 != -2) {
                    asoVar.m99957k(orderNew_, "FEATURE_NOT_SUPPORTED");
                    asoVar.m99958l("error", "FEATURE_NOT_SUPPORTED", false, asoVar.type);
                } else if (iM4976b2 != -1) {
                    asoVar.m99957k(orderNew_, "SERVICE_DISCONNECTED");
                    asoVar.m99958l("error", "SERVICE_DISCONNECTED", false, asoVar.type);
                } else if (iM4976b2 != 12) {
                    switch (iM4976b2) {
                        case 1:
                            asoVar.m99957k(orderNew_, "USER_CANCELED");
                            asoVar.m99958l("error", "USER_CANCELED", false, asoVar.type);
                            break;
                        case 2:
                            asoVar.m99957k(orderNew_, "SERVICE_UNAVAILABLE");
                            asoVar.m99958l("error", "SERVICE_UNAVAILABLE", false, asoVar.type);
                            break;
                        case 3:
                            asoVar.m99957k(orderNew_, "BILLING_UNAVAILABLE");
                            asoVar.m99958l("error", "BILLING_UNAVAILABLE", false, asoVar.type);
                            break;
                        case 4:
                            asoVar.m99957k(orderNew_, "ITEM_UNAVAILABLE");
                            asoVar.m99958l("error", "ITEM_UNAVAILABLE", false, asoVar.type);
                            break;
                        case 5:
                            asoVar.m99957k(orderNew_, "DEVELOPER_ERROR");
                            asoVar.m99958l("error", "DEVELOPER_ERROR", false, asoVar.type);
                            break;
                        case 6:
                            asoVar.m99957k(orderNew_, "ERROR");
                            asoVar.m99958l("error", "ERROR", false, asoVar.type);
                            break;
                        case 7:
                            asoVar.m99957k(orderNew_, "ITEM_ALREADY_OWNED");
                            asoVar.m99958l("error", "ITEM_ALREADY_OWNED", false, asoVar.type);
                            break;
                        case 8:
                            asoVar.m99957k(orderNew_, "ITEM_NOT_OWNED");
                            asoVar.m99958l("error", "ITEM_NOT_OWNED", false, asoVar.type);
                            break;
                        default:
                            asoVar.m99957k(orderNew_, "UNKNOWN_ERROR");
                            asoVar.m99958l("error", "UNKNOWN_ERROR", false, asoVar.type);
                            break;
                    }
                } else {
                    asoVar.m99957k(orderNew_, "NETWORK_ERROR");
                    asoVar.m99958l("error", "NETWORK_ERROR", false, asoVar.type);
                }
            } else {
                Iterator it = ((List) pf60Var.f152157b).iterator();
                while (it.hasNext()) {
                    if (!asoVar.m99955i((Purchase) it.next())) {
                        z = false;
                    }
                }
                if (!z) {
                    CoreModule.f18273l.m143405a().mo34599tk(asoVar.act);
                }
            }
        } else {
            asoVar.m99958l("error", "billResult getResponseCode ->" + ((C0875d) pf60Var.f152156a).m4976b(), false, asoVar.type);
            orderNew_ = Order.new_();
            iM4976b = ((C0875d) pf60Var.f152156a).m4976b();
            if (iM4976b != 1) {
                str = BundleStatus.userCancel;
            } else if (iM4976b != 7) {
                str = "failed";
            } else {
                str = "locked";
            }
            orderNew_.orderStatus = BundleStatus.get(str);
            uqb0.f180388T.m30588Z(orderNew_);
            iM4976b2 = ((C0875d) pf60Var.f152156a).m4976b();
            if (iM4976b2 != -3) {
                asoVar.m99957k(orderNew_, "SERVICE_TIMEOUT");
                asoVar.m99958l("error", "SERVICE_TIMEOUT", false, asoVar.type);
            } else if (iM4976b2 != -2) {
                asoVar.m99957k(orderNew_, "FEATURE_NOT_SUPPORTED");
                asoVar.m99958l("error", "FEATURE_NOT_SUPPORTED", false, asoVar.type);
            } else if (iM4976b2 != -1) {
                asoVar.m99957k(orderNew_, "SERVICE_DISCONNECTED");
                asoVar.m99958l("error", "SERVICE_DISCONNECTED", false, asoVar.type);
            } else if (iM4976b2 != 12) {
                switch (iM4976b2) {
                    case 1:
                        asoVar.m99957k(orderNew_, "USER_CANCELED");
                        asoVar.m99958l("error", "USER_CANCELED", false, asoVar.type);
                        break;
                    case 2:
                        asoVar.m99957k(orderNew_, "SERVICE_UNAVAILABLE");
                        asoVar.m99958l("error", "SERVICE_UNAVAILABLE", false, asoVar.type);
                        break;
                    case 3:
                        asoVar.m99957k(orderNew_, "BILLING_UNAVAILABLE");
                        asoVar.m99958l("error", "BILLING_UNAVAILABLE", false, asoVar.type);
                        break;
                    case 4:
                        asoVar.m99957k(orderNew_, "ITEM_UNAVAILABLE");
                        asoVar.m99958l("error", "ITEM_UNAVAILABLE", false, asoVar.type);
                        break;
                    case 5:
                        asoVar.m99957k(orderNew_, "DEVELOPER_ERROR");
                        asoVar.m99958l("error", "DEVELOPER_ERROR", false, asoVar.type);
                        break;
                    case 6:
                        asoVar.m99957k(orderNew_, "ERROR");
                        asoVar.m99958l("error", "ERROR", false, asoVar.type);
                        break;
                    case 7:
                        asoVar.m99957k(orderNew_, "ITEM_ALREADY_OWNED");
                        asoVar.m99958l("error", "ITEM_ALREADY_OWNED", false, asoVar.type);
                        break;
                    case 8:
                        asoVar.m99957k(orderNew_, "ITEM_NOT_OWNED");
                        asoVar.m99958l("error", "ITEM_NOT_OWNED", false, asoVar.type);
                        break;
                    default:
                        asoVar.m99957k(orderNew_, "UNKNOWN_ERROR");
                        asoVar.m99958l("error", "UNKNOWN_ERROR", false, asoVar.type);
                        break;
                }
            } else {
                asoVar.m99957k(orderNew_, "NETWORK_ERROR");
                asoVar.m99958l("error", "NETWORK_ERROR", false, asoVar.type);
            }
        }
        psd0.m173633z(asoVar.subscription);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final aso m99953h(@NotNull Act act, @Nullable AbstractC0869a abstractC0869a) {
        return INSTANCE.m99960a(act, abstractC0869a);
    }

    /* JADX INFO: renamed from: f */
    public void m99954f(@NotNull String purchaseToken, @Nullable String type) {
        purchaseToken.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Intrinsics.m88377d(SubSampleInformationBox.TYPE, type)) {
                c10 c10VarM107483a = c10.m107480b().m107484b(purchaseToken).m107483a();
                c10VarM107483a.getClass();
                this.client.mo4833a(c10VarM107483a, new d10() { // from class: l.zro
                    @Override // p153l.d10
                    /* JADX INFO: renamed from: e */
                    public final void mo5080e(C0875d c0875d) {
                        aso.m99952g(c0875d);
                    }
                });
            }
            Result.m225066constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m99955i(@NotNull Purchase purchase) {
        purchase.getClass();
        if (purchase.m4821d() != 1) {
            m99958l("error", purchase.toString(), false, this.type);
            m99957k(null, "purchaseState = " + purchase.m4821d() + "purchase failed");
            return false;
        }
        GPAffiliateTransaction gPAffiliateTransactionNew_ = GPAffiliateTransaction.new_();
        gPAffiliateTransactionNew_.purchaseData = purchase.m4819b();
        gPAffiliateTransactionNew_.signature = purchase.m4823f();
        Order orderNew_ = Order.new_();
        String strM4818a = purchase.m4818a();
        if (strM4818a == null) {
            strM4818a = "";
        }
        orderNew_.orderId = strM4818a;
        orderNew_.affiliateTransaction = gPAffiliateTransactionNew_;
        orderNew_.orderStatus = BundleStatus.get(BundleStatus.purchased);
        uqb0.f180388T.m30588Z(orderNew_);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m99956j() {
        if (CoreModule.m30933P().m143405a().mo34445Xi()) {
            CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("svip"));
            CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("seeWhoLikedMe"));
            CoreModule.f18264c.f20396j0.m31601N4(ProductCategory.get("vip"));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m99957k(@Nullable Order order, @Nullable String message) {
        GPTransaction gPTransactionNew_;
        if (order == null) {
            pf60 pf60VarM147494Y = jyb.m147494Y(FirebaseAnalytics.Param.TRANSACTION_ID, "");
            pf60 pf60VarM147494Y2 = jyb.m147494Y("transaction_date", "");
            pf60 pf60VarM147494Y3 = jyb.m147494Y("platform", "googlePay");
            pf60 pf60VarM147494Y4 = jyb.m147494Y("code", 202001);
            if (TextUtils.isEmpty(message)) {
                message = "";
            }
            i4g0.m138495D("e_purchase_pay_response", "p_purchase_page", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4, jyb.m147494Y("message", message));
            return;
        }
        String json = null;
        if (NullChecker.m82486a(order.affiliateTransaction)) {
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
        pf60 pf60VarM147494Y5 = jyb.m147494Y(FirebaseAnalytics.Param.TRANSACTION_ID, json);
        pf60 pf60VarM147494Y6 = jyb.m147494Y("transaction_date", order.affiliateTransaction == null ? "" : Long.valueOf(pzi0.m174453n()));
        pf60 pf60VarM147494Y7 = jyb.m147494Y("platform", "googlePay");
        pf60 pf60VarM147494Y8 = jyb.m147494Y("code", order.orderStatus);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        i4g0.m138495D("e_purchase_pay_response", "p_purchase_page", pf60VarM147494Y5, pf60VarM147494Y6, pf60VarM147494Y7, pf60VarM147494Y8, jyb.m147494Y("message", message));
    }

    /* JADX INFO: renamed from: l */
    public void m99958l(@NotNull String step, @Nullable String message, boolean isRestore, @Nullable String type) {
        step.getClass();
        String str = isRestore ? "e_purchase_google_pay_restore_step" : "e_purchase_google_pay_step";
        String str2 = isRestore ? "p_purchase_google_pay_restore" : "p_purchase_google_pay";
        pf60 pf60VarM147494Y = jyb.m147494Y("purchase_step", step);
        if (!NullChecker.m82486a(type)) {
            type = "";
        }
        pf60 pf60VarM147494Y2 = jyb.m147494Y("purchase_type", type);
        pf60 pf60VarM147494Y3 = jyb.m147494Y("is_new_code", Boolean.FALSE);
        if (TextUtils.isEmpty(message)) {
            message = "";
        }
        i4g0.m138495D(str, str2, pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, jyb.m147494Y("message", message));
    }

    /* JADX INFO: renamed from: m */
    public void m99959m() {
        uqb0.m197269e1("purchase_failed_gp", new Object[0]);
    }

    /* JADX INFO: renamed from: l.aso$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/aso$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/android/billingclient/api/a;", "billingClient", "Ll/aso;", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)Ll/aso;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final aso m99960a(@NotNull Act act, @Nullable AbstractC0869a billingClient) {
            act.getClass();
            if (billingClient == null) {
                return null;
            }
            C0875d c0875dMo4836d = billingClient.mo4836d("fff");
            c0875dMo4836d.getClass();
            gta.m132210e().m132214d().mo34823ep();
            Objects.toString(c0875dMo4836d);
            return new vto(act, billingClient);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m99952g(C0875d c0875d) {
    }
}
