package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.android.billingclient.api.AbstractC0869a;
import com.android.billingclient.api.C0873c;
import com.android.billingclient.api.C0875d;
import com.android.billingclient.api.C0879f;
import com.android.billingclient.api.C0881g;
import com.android.billingclient.api.Purchase;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.common.collect.ImmutableList;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GPPurchaseData;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.GPAffiliateTransaction;
import com.p051p1.mobile.putong.data.GPTransaction;
import com.p051p1.mobile.putong.data.GooglePlayOrders;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010!\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u001e0\u00152\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u001e0\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b%\u0010$J9\u0010,\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020'2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010)2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, m88121d2 = {"Ll/vto;", "Ll/aso;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/android/billingclient/api/a;", "client", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)V", "", "product", "type", "", "g0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/android/billingclient/api/c$c;", "updateParams", "oldProduct", "r0", "(Ljava/lang/String;Lcom/android/billingclient/api/c$c;Ljava/lang/String;Ljava/lang/String;)V", "Ll/x20;", "gpOrderSuccessTrack", "Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "c", "(Ljava/lang/String;Ll/x20;)Lrx/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Ll/x20;)Lrx/c;", "h0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "productType", "", "Landroid/util/Pair;", "Lcom/android/billingclient/api/Purchase;", "d0", "(Ljava/lang/String;)Lrx/c;", "b0", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "t0", "purchaseToken", "", "fromPay", "Lrx/subjects/a;", "subject", "isRestore", "a0", "(Ljava/lang/String;ZLrx/subjects/a;Z)V", "a", "()Lrx/c;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vto extends aso {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vto(@NotNull Act act, @NotNull AbstractC0869a abstractC0869a) {
        super(act, abstractC0869a);
        act.getClass();
        abstractC0869a.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static void m202690A(vto vtoVar, String str, String str2, final String str3, C0875d c0875d, List list) {
        c0875d.getClass();
        list.getClass();
        if (c0875d.m4976b() == 0) {
            List list2 = list;
            if (!jyb.m147479J(list2)) {
                Purchase purchase = (Purchase) jyb.m147529r(list2, new qcj() { // from class: l.bto
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return vto.m202725i0(str3, (Purchase) obj);
                    }
                });
                vtoVar.m202759r0(str, NullChecker.m82486a(purchase) ? C0873c.c.m4958a().m4968b(purchase.m4822e()).m4970d(2).m4967a() : null, str2, str3);
                return;
            }
        }
        vtoVar.m202759r0(str, null, str2, str3);
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m202691A0(vto vtoVar, Throwable th) {
        th.getClass();
        vtoVar.m99958l("error", th.getMessage(), false, vtoVar.type);
        vtoVar.m99959m();
    }

    /* JADX INFO: renamed from: B */
    public static List m202692B(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B0 */
    public static final C22421c m202693B0(vto vtoVar, Order order, GPTransaction gPTransaction, List list) {
        String str;
        ArrayList arrayList;
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = "sign 后端订单校验结果 status is success, orderId->" + ((GooglePlayOrders) it.next()).transactionId;
                    String str3 = vtoVar.type;
                    vtoVar.type = str3;
                    Unit unit = Unit.INSTANCE;
                    vtoVar.m99958l("8-2-2", str2, false, str3);
                    JsonAdapter<GPPurchaseData> jsonAdapter = GPPurchaseData.JSON_ADAPTER;
                    GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
                    if (gPAffiliateTransaction == null || (str = gPAffiliateTransaction.purchaseData) == null) {
                        str = "";
                    }
                    String str4 = jsonAdapter.parse(str).purchaseToken;
                    str4.getClass();
                    vtoVar.m99954f(str4, vtoVar.type);
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                vtoVar.m99958l("error", e.getMessage(), false, vtoVar.type);
            }
        }
        if (list != null) {
            List<GooglePlayOrders> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GooglePlayOrders googlePlayOrders : list2) {
                PaymentApi paymentApi = uqb0.f180388T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.m30583U(gPTransaction, googlePlayOrders, 0));
            }
        } else {
            arrayList = null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? C22421c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : psd0.m173623p(arrayList, new zcj() { // from class: l.ato
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return vto.m202695C0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static final C22421c m202697D0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: E0 */
    public static final C22421c m202699E0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? C22421c.just(PaymentApi.PaymentResultStatus.failed) : C22421c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final C22421c m202701F0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static List m202702G(Function2 function2, Object obj, Object obj2) {
        return (List) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: H */
    public static C22421c m202703H(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static C22421c m202707L(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static C22421c m202709N(final vto vtoVar, x20 x20Var, String str, final Order order) {
        order.getClass();
        String json = order.toJson();
        String str2 = vtoVar.type;
        vtoVar.type = str2;
        Unit unit = Unit.INSTANCE;
        vtoVar.m99958l(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, json, false, str2);
        vtoVar.m99957k(order, null);
        if ((TEnum.equals(order.orderStatus, BundleStatus.stock) || TEnum.equals(order.orderStatus, BundleStatus.purchased)) && x20Var != null) {
            x20Var.call();
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.stock)) {
            String str3 = vtoVar.type;
            vtoVar.type = str3;
            vtoVar.m99958l("8-1-1", "有相同的商品未被确认 需进行订单补偿", false, str3);
            return vtoVar.m202760t0(vtoVar.type, str);
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.purchased)) {
            String str4 = vtoVar.type;
            vtoVar.type = str4;
            vtoVar.m99958l("8-2-1", "当前订单交易正常，通知后端进行订单校验，下发权益", false, str4);
            final GPTransaction gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.source = "pay";
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
            C22421c<List<GooglePlayOrders>> c22421cDoOnError = uqb0.f180388T.m30585W(gPTransactionNew_, vtoVar.URL_PAY).doOnError(new y20() { // from class: l.sto
                @Override // p153l.y20
                public final void call(Object obj) {
                    vto.m202691A0(this.f170595a, (Throwable) obj);
                }
            });
            final Function1 function1 = new Function1() { // from class: l.tto
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vto.m202693B0(this.f176087a, order, gPTransactionNew_, (List) obj);
                }
            };
            C22421c c22421cCompose = c22421cDoOnError.switchMap(new qcj() { // from class: l.uto
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vto.m202697D0(function1, obj);
                }
            }).compose(psd0.m173592C());
            final Function1 function2 = new Function1() { // from class: l.jso
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vto.m202699E0((Object[]) obj);
                }
            };
            return c22421cCompose.switchMap(new qcj() { // from class: l.kso
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vto.m202701F0(function2, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.userCancel)) {
            vtoVar.m99958l("error", "order 状态异常  " + order.toJson(), false, vtoVar.type);
            vtoVar.m99959m();
            return C22421c.just(PaymentApi.PaymentResultStatus.userCancel);
        }
        vtoVar.m99958l("error", "order 状态异常  " + order.toJson(), false, vtoVar.type);
        vtoVar.m99959m();
        return C22421c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: O */
    public static C22421c m202710O(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static void m202711P(vto vtoVar, boolean z, boolean z2, C22507a c22507a, C0875d c0875d, String str) {
        c0875d.getClass();
        vtoVar.m99958l("8-2-4", "非订阅型商品 consumeAsync 结果 response is success -> " + (c0875d.m4976b() == 0), z, vtoVar.type);
        if (c0875d.m4976b() != 0) {
            StringBuilder sb = new StringBuilder("Google BillingClient consume failed, from = ");
            sb.append(z2 ? "pay, errorCode = " : "restore, errorCode = ");
            sb.append(c0875d.m4976b());
            sb.append(", message = ");
            sb.append(c0875d.m4975a());
            vtoVar.m99958l("error", "consumeAsync error -> " + ((Object) sb), z, vtoVar.type);
            CrashHelper.m82479c(new RuntimeException(sb.toString()));
            vtoVar.m99959m();
        }
        if (c22507a != null) {
            c22507a.m137019l(PaymentApi.PaymentResultStatus.succeed);
        }
    }

    /* JADX INFO: renamed from: S */
    public static C22421c m202714S(final vto vtoVar, x20 x20Var, final String str, final Order order) {
        order.getClass();
        String json = order.toJson();
        String str2 = vtoVar.type;
        vtoVar.type = str2;
        Unit unit = Unit.INSTANCE;
        vtoVar.m99958l(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, json, false, str2);
        vtoVar.m99957k(order, null);
        if ((!TEnum.equals(order.orderStatus, "locked") || TEnum.equals(order.orderStatus, BundleStatus.purchased)) && x20Var != null) {
            x20Var.call();
        }
        if (TEnum.equals(order.orderStatus, "locked") && !vtoVar.tryConsumed) {
            vtoVar.tryConsumed = true;
            String str3 = vtoVar.type;
            vtoVar.type = str3;
            vtoVar.m99958l("8-1-1", "有相同的商品未被确认 需进行订单补偿", false, str3);
            C22421c<PaymentApi.PaymentResultStatus> c22421cM202760t0 = vtoVar.m202760t0(vtoVar.type, str);
            final Function1 function1 = new Function1() { // from class: l.lso
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vto.m202726j0(this.f133440a, str, (PaymentApi.PaymentResultStatus) obj);
                }
            };
            return c22421cM202760t0.switchMap(new qcj() { // from class: l.mso
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vto.m202727k0(function1, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.purchased)) {
            String str4 = vtoVar.type;
            vtoVar.type = str4;
            vtoVar.m99958l("8-2-1", "当前订单交易正常，通知后端进行订单校验，下发权益", false, str4);
            final GPTransaction gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.source = "pay";
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
            C22421c<List<GooglePlayOrders>> c22421cDoOnError = uqb0.f180388T.m30585W(gPTransactionNew_, vtoVar.URL_PAY).doOnError(new y20() { // from class: l.nso
                @Override // p153l.y20
                public final void call(Object obj) {
                    vto.m202728l0(this.f143522a, (Throwable) obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.oso
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vto.m202729m0(this.f148885a, order, gPTransactionNew_, (List) obj);
                }
            };
            C22421c c22421cCompose = c22421cDoOnError.switchMap(new qcj() { // from class: l.pso
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vto.m202733o0(function2, obj);
                }
            }).compose(psd0.m173592C());
            final Function1 function3 = new Function1() { // from class: l.qso
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vto.m202735p0((Object[]) obj);
                }
            };
            return c22421cCompose.switchMap(new qcj() { // from class: l.rso
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return vto.m202737q0(function3, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.userCancel)) {
            vtoVar.m99958l("error", "order 状态异常  " + order.toJson(), false, vtoVar.type);
            vtoVar.m99959m();
            return C22421c.just(PaymentApi.PaymentResultStatus.userCancel);
        }
        vtoVar.m99958l("error", "order 状态异常  " + order.toJson(), false, vtoVar.type);
        vtoVar.m99959m();
        return C22421c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: U */
    public static List m202716U(final String str, final String str2, List list) {
        return jyb.m147522n(list, new qcj() { // from class: l.jto
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202722c0(str, str2, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public static C22421c m202718W(final vto vtoVar, final String str, final List list) {
        String string;
        String str2 = vtoVar.TAG;
        List list2 = list;
        jyb.m147479J(list2);
        if (list == null || (string = list.toString()) == null) {
            string = "purchase is null";
        }
        vtoVar.m99958l("2", "订单补偿 订单 ".concat(string), true, null);
        if (jyb.m147479J(list2)) {
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        final GPTransaction gPTransactionNew_ = GPTransaction.new_();
        gPTransactionNew_.source = RequestParameters.X_OSS_RESTORE;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null) {
                    GPAffiliateTransaction gPAffiliateTransactionNew_ = GPAffiliateTransaction.new_();
                    gPAffiliateTransactionNew_.purchaseData = ((Purchase) pair.second).m4819b();
                    gPAffiliateTransactionNew_.signature = ((Purchase) pair.second).m4823f();
                    gPTransactionNew_.affiliateTransactions.add(gPAffiliateTransactionNew_);
                }
            }
        }
        C22421c<List<GooglePlayOrders>> c22421cDoOnError = uqb0.f180388T.m30586X(gPTransactionNew_, vtoVar.URL_RESTORE).doOnError(new y20() { // from class: l.uso
            @Override // p153l.y20
            public final void call(Object obj) {
                vto.m202743u0(this.f180837a, list, str, (Throwable) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.vso
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vto.m202745v0(this.f185639a, list, gPTransactionNew_, (List) obj);
            }
        };
        C22421c c22421cCompose = c22421cDoOnError.switchMap(new qcj() { // from class: l.wso
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202749x0(function1, obj);
            }
        }).compose(psd0.m173592C());
        final Function1 function2 = new Function1() { // from class: l.xso
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vto.m202751y0((Object[]) obj);
            }
        };
        return c22421cCompose.switchMap(new qcj() { // from class: l.yso
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202753z0(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public static final Boolean m202722c0(String str, String str2, Pair pair) {
        Purchase purchase;
        List<String> listM4820c;
        Purchase purchase2;
        List<String> listM4820c2;
        if (Intrinsics.m88377d(str, SubSampleInformationBox.TYPE)) {
            if (pair == null || (purchase2 = (Purchase) pair.second) == null || (listM4820c2 = purchase2.m4820c()) == null) {
                return null;
            }
            return Boolean.valueOf(listM4820c2.contains(x6k.INSTANCE.m209506a(str2).getFirst()));
        }
        if (pair == null || (purchase = (Purchase) pair.second) == null || (listM4820c = purchase.m4820c()) == null) {
            return null;
        }
        return Boolean.valueOf(listM4820c.contains(str2));
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m202723e0(final vto vtoVar, final String str, gcg0 gcg0Var, final List list, C0875d c0875d, List list2) {
        c0875d.getClass();
        String str2 = vtoVar.TAG;
        Objects.toString(c0875d);
        if (c0875d.m4976b() == 0) {
            List list3 = list2;
            if (!jyb.m147479J(list3)) {
                jyb.m147537z(list3, new y20() { // from class: l.nto
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        vto.m202724f0(this.f143619a, list, str, (Purchase) obj);
                    }
                });
                gcg0Var.m137019l(list);
                return;
            }
        }
        gcg0Var.m137019l(list);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m202724f0(vto vtoVar, List list, String str, Purchase purchase) {
        if (purchase != null) {
            String str2 = vtoVar.TAG;
            purchase.toString();
            if (purchase.m4821d() == 2 && TextUtils.isEmpty(purchase.m4818a())) {
                return;
            }
            list.add(Pair.create(str, purchase));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final Boolean m202725i0(String str, Purchase purchase) {
        purchase.getClass();
        List<String> listM4820c = purchase.m4820c();
        x6k x6kVar = x6k.INSTANCE;
        str.getClass();
        return Boolean.valueOf(listM4820c.contains(x6kVar.m209506a(str).getFirst()));
    }

    /* JADX INFO: renamed from: j0 */
    public static final C22421c m202726j0(vto vtoVar, String str, PaymentApi.PaymentResultStatus paymentResultStatus) {
        paymentResultStatus.getClass();
        return paymentResultStatus == PaymentApi.PaymentResultStatus.succeed ? vtoVar.mo192812c(str, null) : C22421c.just(paymentResultStatus);
    }

    /* JADX INFO: renamed from: k0 */
    public static final C22421c m202727k0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m202728l0(vto vtoVar, Throwable th) {
        th.getClass();
        vtoVar.m99958l("error", th.getMessage(), false, vtoVar.type);
        vtoVar.m99959m();
    }

    /* JADX INFO: renamed from: m0 */
    public static final C22421c m202729m0(vto vtoVar, Order order, GPTransaction gPTransaction, List list) {
        String str;
        ArrayList arrayList = null;
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = "pay 后端订单校验结果 status is success, orderId->" + ((GooglePlayOrders) it.next()).transactionId;
                    String str3 = vtoVar.type;
                    vtoVar.type = str3;
                    Unit unit = Unit.INSTANCE;
                    vtoVar.m99958l("8-2-2", str2, false, str3);
                    JsonAdapter<GPPurchaseData> jsonAdapter = GPPurchaseData.JSON_ADAPTER;
                    GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
                    if (gPAffiliateTransaction == null || (str = gPAffiliateTransaction.purchaseData) == null) {
                        str = "";
                    }
                    vtoVar.m202754a0(jsonAdapter.parse(str).purchaseToken, true, null, false);
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                vtoVar.m99958l("error", e.getMessage(), false, vtoVar.type);
            }
        }
        if (list != null) {
            List<GooglePlayOrders> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GooglePlayOrders googlePlayOrders : list2) {
                PaymentApi paymentApi = uqb0.f180388T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.m30583U(gPTransaction, googlePlayOrders, 0));
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? C22421c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : psd0.m173623p(arrayList, new zcj() { // from class: l.zso
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return vto.m202731n0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static final C22421c m202733o0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: p0 */
    public static final C22421c m202735p0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? C22421c.just(PaymentApi.PaymentResultStatus.failed) : C22421c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static final C22421c m202737q0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static List m202739s(List list, List list2) {
        return jyb.m147504e(list, list2);
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m202740s0(vto vtoVar, String str, C0873c c0873c) {
        vtoVar.m99958l(Constants.VIA_SHARE_TYPE_INFO, "启动购买流程，唤起Google Play 购买弹窗", false, str);
        vtoVar.client.mo4838f(vtoVar.com.tencent.open.SocialConstants.PARAM_ACT java.lang.String, c0873c);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m202743u0(vto vtoVar, List list, String str, Throwable th) {
        th.getClass();
        vtoVar.m99958l("error", "restore request " + th.getMessage(), true, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vtoVar.m99959m();
            }
        }
        if (CoreModule.m30933P().m143405a().mo34552mo()) {
            Integer num = uqb0.f180388T.retryRestoreCount.get();
            if (str != null || num.intValue() <= 0) {
                return;
            }
            uqb0.f180388T.retryRestoreCount.put(Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final C22421c m202745v0(vto vtoVar, List list, GPTransaction gPTransaction, List list2) {
        Purchase purchase;
        ArrayList arrayList = null;
        vtoVar.m99958l("3", "restore response size ->" + (list2 != null ? Integer.valueOf(list2.size()) : null), true, null);
        vtoVar.m99956j();
        uqb0.f180388T.retryRestore.put(Boolean.FALSE);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null && (purchase = (Purchase) pair.second) != null) {
                    if (Intrinsics.m88377d(pair.first, SubSampleInformationBox.TYPE)) {
                        String strM4822e = purchase.m4822e();
                        strM4822e.getClass();
                        vtoVar.m99954f(strM4822e, (String) pair.first);
                    } else {
                        vtoVar.m202754a0(purchase.m4822e(), false, null, true);
                    }
                }
            }
        }
        if (list2 != null) {
            List<GooglePlayOrders> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (GooglePlayOrders googlePlayOrders : list3) {
                PaymentApi paymentApi = uqb0.f180388T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.m30583U(gPTransaction, googlePlayOrders, 0));
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? C22421c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : psd0.m173623p(arrayList, new zcj() { // from class: l.lto
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return vto.m202747w0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m202746w(final vto vtoVar, final String str, final List list, final gcg0 gcg0Var) {
        gcg0Var.getClass();
        vtoVar.client.mo4840i(zvb0.m221750a().m221754b(str).m221753a(), new ukb0() { // from class: l.mto
            @Override // p153l.ukb0
            /* JADX INFO: renamed from: b */
            public final void mo5077b(C0875d c0875d, List list2) {
                vto.m202723e0(this.f138643a, str, gcg0Var, list, c0875d, list2);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static final C22421c m202749x0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: y0 */
    public static final C22421c m202751y0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? C22421c.just(PaymentApi.PaymentResultStatus.failed) : C22421c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static void m202752z(final vto vtoVar, final String str, String str2, C0873c.c cVar, String str3, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C0875d c0875d, List list) {
        Object next;
        String strM5030c;
        c0875d.getClass();
        list.getClass();
        if (c0875d.m4976b() != 0 || jyb.m147479J(list)) {
            vtoVar.m99958l("error", "productDetails query error", false, str);
            Order orderNew_ = Order.new_();
            orderNew_.orderStatus = BundleStatus.get("failed");
            uqb0.f180388T.m30588Z(orderNew_);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0879f c0879f = (C0879f) it.next();
            vtoVar.m99958l("4", list.toString(), false, str);
            C0873c.b.a aVarM4957c = C0873c.b.m4950a().m4957c(c0879f);
            aVarM4957c.getClass();
            if (Intrinsics.m88377d(str2, SubSampleInformationBox.TYPE)) {
                List<C0879f.e> listM5012e = c0879f.m5012e();
                String str4 = "";
                if (listM5012e != null) {
                    Iterator<T> it2 = listM5012e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        C0879f.e eVar = (C0879f.e) next;
                        if (Intrinsics.m88377d(eVar.m5028a(), objectRef.element)) {
                            String strM5029b = eVar.m5029b();
                            if (strM5029b == null) {
                                strM5029b = "";
                            }
                            String str5 = (String) objectRef2.element;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (Intrinsics.m88377d(strM5029b, str5)) {
                                break;
                            }
                        }
                    }
                    C0879f.e eVar2 = (C0879f.e) next;
                    if (eVar2 != null && (strM5030c = eVar2.m5030c()) != null) {
                        str4 = strM5030c;
                    }
                }
                vtoVar.m99958l("4-1", "设置订阅offer token ".concat(str4), false, str);
                aVarM4957c.m4956b(str4);
            }
            C0873c.a aVarM4947b = C0873c.m4928a().m4948c(ImmutableList.m15740of(aVarM4957c.m4955a())).m4947b(CoreModule.m30929H().userId());
            aVarM4947b.getClass();
            if (cVar != null) {
                vtoVar.m99958l("4-2", "查询订阅订单  oldProduct = " + str3, false, str);
                aVarM4947b.m4949d(cVar);
            }
            final C0873c c0873cM4946a = aVarM4947b.m4946a();
            c0873cM4946a.getClass();
            Act act = vtoVar.com.tencent.open.SocialConstants.PARAM_ACT java.lang.String;
            if (act instanceof PutongAct) {
                ((PutongAct) act).iap().m103304r(new Runnable() { // from class: l.hto
                    @Override // java.lang.Runnable
                    public final void run() {
                        vto.m202740s0(this.f111567a, str, c0873cM4946a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static final C22421c m202753z0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    @Override // p153l.tvl
    @NotNull
    /* JADX INFO: renamed from: a */
    public C22421c<PaymentApi.PaymentResultStatus> mo192810a() {
        return m202760t0(null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m202754a0(@Nullable String purchaseToken, final boolean fromPay, @Nullable final C22507a<PaymentApi.PaymentResultStatus> subject, final boolean isRestore) {
        x06.C21221a c21221aM208813b = x06.m208813b();
        if (purchaseToken == null) {
            purchaseToken = "";
        }
        x06 x06VarM208816a = c21221aM208813b.m208817b(purchaseToken).m208816a();
        x06VarM208816a.getClass();
        m99958l("8-2-3", "非订阅型商品 开始consumeAsync " + x06VarM208816a.m208815a(), isRestore, this.type);
        this.client.mo4834b(x06VarM208816a, new y06() { // from class: l.kto
            @Override // p153l.y06
            /* JADX INFO: renamed from: f */
            public final void mo5081f(C0875d c0875d, String str) {
                vto.m202711P(this.f128722a, isRestore, fromPay, subject, c0875d, str);
            }
        });
    }

    @Override // p153l.tvl
    @Nullable
    /* JADX INFO: renamed from: b */
    public C22421c<PaymentApi.PaymentResultStatus> mo192811b(@NotNull final String product, @Nullable String oldProduct, @Nullable final x20 gpOrderSuccessTrack) {
        product.getClass();
        this.type = SubSampleInformationBox.TYPE;
        Unit unit = Unit.INSTANCE;
        m99958l("1", "获取 BillingClient 对象", false, SubSampleInformationBox.TYPE);
        if (!NullChecker.m82486a(this.client) || !this.client.mo4837e()) {
            m99958l("error", "client == null  或者连接google 服务失败", false, this.type);
            m99957k(null, "client == null");
            m99959m();
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str = this.type;
        this.type = str;
        m99958l("2", "连接google play 服务 成功", false, str);
        uqb0.f180388T.retryRestore.put(Boolean.TRUE);
        uqb0.f180388T.retryRestoreCount.put(0);
        m202758h0(product, oldProduct, SubSampleInformationBox.TYPE);
        C22421c<Order> c22421cFirst = uqb0.f180388T.m30587Y().first();
        final Function1 function1 = new Function1() { // from class: l.eto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vto.m202709N(this.f95776a, gpOrderSuccessTrack, product, (Order) obj);
            }
        };
        return c22421cFirst.switchMap(new qcj() { // from class: l.oto
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202703H(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public C22421c<List<Pair<String, Purchase>>> m202755b0(@Nullable final String productType, @Nullable final String product) {
        if (!NullChecker.m82486a(this.client)) {
            C22421c<List<Pair<String, Purchase>>> c22421cJust = C22421c.just(null);
            c22421cJust.getClass();
            return c22421cJust;
        }
        if (TextUtils.isEmpty(productType) || TextUtils.isEmpty(product)) {
            C22421c<List<Pair<String, Purchase>>> c22421cM202756d0 = m202756d0("inapp");
            C22421c<List<Pair<String, Purchase>>> c22421cM202756d1 = m202756d0(SubSampleInformationBox.TYPE);
            final Function2 function2 = new Function2() { // from class: l.fto
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vto.m202739s((List) obj, (List) obj2);
                }
            };
            C22421c<List<Pair<String, Purchase>>> c22421cM173625r = psd0.m173625r(c22421cM202756d0, c22421cM202756d1, new rcj() { // from class: l.gto
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return vto.m202702G(function2, obj, obj2);
                }
            });
            c22421cM173625r.getClass();
            return c22421cM173625r;
        }
        productType.getClass();
        C22421c<List<Pair<String, Purchase>>> c22421cM202756d2 = m202756d0(productType);
        final Function1 function1 = new Function1() { // from class: l.cto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vto.m202716U(productType, product, (List) obj);
            }
        };
        C22421c map = c22421cM202756d2.map(new qcj() { // from class: l.dto
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202692B(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @Override // p153l.tvl
    @Nullable
    /* JADX INFO: renamed from: c */
    public C22421c<PaymentApi.PaymentResultStatus> mo192812c(@NotNull final String product, @Nullable final x20 gpOrderSuccessTrack) {
        product.getClass();
        this.type = "inapp";
        Unit unit = Unit.INSTANCE;
        m99958l("1", "获取 BillingClient 对象", false, "inapp");
        if (!NullChecker.m82486a(this.client) || !this.client.mo4837e()) {
            m99958l("error", "client = null 或者连接google 服务失败", false, this.type);
            m99957k(null, "client = null");
            return C22421c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str = this.type;
        this.type = str;
        m99958l("2", "连接google play 服务 成功", false, str);
        uqb0.f180388T.retryRestore.put(Boolean.TRUE);
        uqb0.f180388T.retryRestoreCount.put(0);
        m202757g0(product, "inapp");
        C22421c<Order> c22421cM30587Y = uqb0.f180388T.m30587Y();
        final Function1 function1 = new Function1() { // from class: l.iso
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vto.m202714S(this.f116689a, gpOrderSuccessTrack, product, (Order) obj);
            }
        };
        return c22421cM30587Y.switchMap(new qcj() { // from class: l.tso
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202710O(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public C22421c<List<Pair<String, Purchase>>> m202756d0(@NotNull final String productType) {
        productType.getClass();
        final ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.client)) {
            C22421c<List<Pair<String, Purchase>>> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.ito
                @Override // p153l.y20
                public final void call(Object obj) {
                    vto.m202746w(this.f116857a, productType, arrayList, (gcg0) obj);
                }
            });
            c22421cCreate.getClass();
            return c22421cCreate;
        }
        C22421c<List<Pair<String, Purchase>>> c22421cJust = C22421c.just(arrayList);
        c22421cJust.getClass();
        return c22421cJust;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m202757g0(String product, String type) {
        m202758h0(product, null, type);
    }

    /* JADX INFO: renamed from: h0 */
    public void m202758h0(@NotNull final String product, @Nullable final String oldProduct, @NotNull final String type) {
        product.getClass();
        type.getClass();
        if (!TextUtils.isEmpty(oldProduct)) {
            x6k x6kVar = x6k.INSTANCE;
            if (!Intrinsics.m88377d(x6kVar.m209506a(product).getFirst(), x6kVar.m209506a(oldProduct).getFirst())) {
                this.client.mo4840i(zvb0.m221750a().m221754b(type).m221753a(), new ukb0() { // from class: l.rto
                    @Override // p153l.ukb0
                    /* JADX INFO: renamed from: b */
                    public final void mo5077b(C0875d c0875d, List list) {
                        vto.m202690A(this.f164840a, product, type, oldProduct, c0875d, list);
                    }
                });
                return;
            }
        }
        m202759r0(product, null, type, oldProduct);
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: r0 */
    public final void m202759r0(String product, final C0873c.c updateParams, final String type, final String oldProduct) {
        m99958l("3", "查询 product " + product + " 商品 详情 oldProduct " + oldProduct, false, type);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (Intrinsics.m88377d(type, SubSampleInformationBox.TYPE)) {
            Triple<String, String, String> tripleM209506a = x6k.INSTANCE.m209506a(product);
            String first = tripleM209506a.getFirst();
            String str = first != null ? first : "";
            objectRef.element = tripleM209506a.getSecond();
            objectRef2.element = tripleM209506a.getThird();
            product = str;
        }
        C0881g c0881gM5040a = C0881g.m5036a().m5041b(ImmutableList.m15740of(C0881g.b.m5042a().m5048b(product).m5049c(type).m5047a())).m5040a();
        c0881gM5040a.getClass();
        this.client.mo4839h(c0881gM5040a, new am90() { // from class: l.sso
            @Override // p153l.am90
            /* JADX INFO: renamed from: a */
            public final void mo98817a(C0875d c0875d, List list) {
                vto.m202752z(this.f170485a, type, type, updateParams, oldProduct, objectRef, objectRef2, c0875d, list);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public C22421c<PaymentApi.PaymentResultStatus> m202760t0(@Nullable String type, @Nullable final String product) {
        C22421c<List<Pair<String, Purchase>>> c22421cM202755b0 = m202755b0(type, product);
        final Function1 function1 = new Function1() { // from class: l.pto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vto.m202718W(this.f154098a, product, (List) obj);
            }
        };
        C22421c c22421cSwitchMap = c22421cM202755b0.switchMap(new qcj() { // from class: l.qto
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return vto.m202707L(function1, obj);
            }
        });
        c22421cSwitchMap.getClass();
        return c22421cSwitchMap;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Object[] m202695C0(Object[] objArr) {
        return objArr;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Object[] m202731n0(Object[] objArr) {
        return objArr;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Object[] m202747w0(Object[] objArr) {
        return objArr;
    }
}
