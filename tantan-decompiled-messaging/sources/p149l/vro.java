package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.android.billingclient.api.AbstractC0865a;
import com.android.billingclient.api.C0869c;
import com.android.billingclient.api.C0871d;
import com.android.billingclient.api.C0875f;
import com.android.billingclient.api.C0877g;
import com.android.billingclient.api.Purchase;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.common.collect.ImmutableList;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GPPurchaseData;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.GPAffiliateTransaction;
import com.p046p1.mobile.putong.data.GPTransaction;
import com.p046p1.mobile.putong.data.GooglePlayOrders;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010!\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u001e0\u00152\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u001e0\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b%\u0010$J9\u0010,\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020'2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010)2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, m87232d2 = {"Ll/vro;", "Ll/aqo;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/android/billingclient/api/a;", "client", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)V", "", "product", "type", "", "g0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/android/billingclient/api/c$c;", "updateParams", "oldProduct", "r0", "(Ljava/lang/String;Lcom/android/billingclient/api/c$c;Ljava/lang/String;Ljava/lang/String;)V", "Ll/d30;", "gpOrderSuccessTrack", "Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "c", "(Ljava/lang/String;Ll/d30;)Lrx/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Ll/d30;)Lrx/c;", "h0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "productType", "", "Landroid/util/Pair;", "Lcom/android/billingclient/api/Purchase;", "d0", "(Ljava/lang/String;)Lrx/c;", "b0", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "t0", "purchaseToken", "", "fromPay", "Lrx/subjects/a;", "subject", "isRestore", "a0", "(Ljava/lang/String;ZLrx/subjects/a;Z)V", "a", "()Lrx/c;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vro extends aqo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vro(@NotNull Act act, @NotNull AbstractC0865a abstractC0865a) {
        super(act, abstractC0865a);
        act.getClass();
        abstractC0865a.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static void m199671A(vro vroVar, String str, String str2, final String str3, C0871d c0871d, List list) {
        c0871d.getClass();
        list.getClass();
        if (c0871d.m4966b() == 0) {
            List list2 = list;
            if (!vwb.m200296J(list2)) {
                Purchase purchase = (Purchase) vwb.m200346r(list2, new w9j() { // from class: l.bro
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return vro.m199706i0(str3, (Purchase) obj);
                    }
                });
                vroVar.m199740r0(str, NullChecker.m81303a(purchase) ? C0869c.c.m4948a().m4958b(purchase.m4812e()).m4960d(2).m4957a() : null, str2, str3);
                return;
            }
        }
        vroVar.m199740r0(str, null, str2, str3);
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m199672A0(vro vroVar, Throwable th) {
        th.getClass();
        vroVar.m98321l("error", th.getMessage(), false, vroVar.type);
        vroVar.m98322m();
    }

    /* JADX INFO: renamed from: B */
    public static List m199673B(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B0 */
    public static final C22306c m199674B0(vro vroVar, Order order, GPTransaction gPTransaction, List list) {
        String str;
        ArrayList arrayList;
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = "sign 后端订单校验结果 status is success, orderId->" + ((GooglePlayOrders) it.next()).transactionId;
                    String str3 = vroVar.type;
                    vroVar.type = str3;
                    Unit unit = Unit.INSTANCE;
                    vroVar.m98321l("8-2-2", str2, false, str3);
                    JsonAdapter<GPPurchaseData> jsonAdapter = GPPurchaseData.JSON_ADAPTER;
                    GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
                    if (gPAffiliateTransaction == null || (str = gPAffiliateTransaction.purchaseData) == null) {
                        str = "";
                    }
                    String str4 = jsonAdapter.parse(str).purchaseToken;
                    str4.getClass();
                    vroVar.m98317f(str4, vroVar.type);
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                vroVar.m98321l("error", e.getMessage(), false, vroVar.type);
            }
        }
        if (list != null) {
            List<GooglePlayOrders> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GooglePlayOrders googlePlayOrders : list2) {
                PaymentApi paymentApi = qib0.f154705T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.m29585U(gPTransaction, googlePlayOrders, 0));
            }
        } else {
            arrayList = null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? C22306c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : mkd0.m154982p(arrayList, new faj() { // from class: l.aro
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return vro.m199676C0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static final C22306c m199678D0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: E0 */
    public static final C22306c m199680E0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? C22306c.just(PaymentApi.PaymentResultStatus.failed) : C22306c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final C22306c m199682F0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static List m199683G(Function2 function2, Object obj, Object obj2) {
        return (List) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: H */
    public static C22306c m199684H(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static C22306c m199688L(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static C22306c m199690N(final vro vroVar, d30 d30Var, String str, final Order order) {
        order.getClass();
        String json = order.toJson();
        String str2 = vroVar.type;
        vroVar.type = str2;
        Unit unit = Unit.INSTANCE;
        vroVar.m98321l(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, json, false, str2);
        vroVar.m98320k(order, null);
        if ((TEnum.equals(order.orderStatus, BundleStatus.stock) || TEnum.equals(order.orderStatus, BundleStatus.purchased)) && d30Var != null) {
            d30Var.call();
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.stock)) {
            String str3 = vroVar.type;
            vroVar.type = str3;
            vroVar.m98321l("8-1-1", "有相同的商品未被确认 需进行订单补偿", false, str3);
            return vroVar.m199741t0(vroVar.type, str);
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.purchased)) {
            String str4 = vroVar.type;
            vroVar.type = str4;
            vroVar.m98321l("8-2-1", "当前订单交易正常，通知后端进行订单校验，下发权益", false, str4);
            final GPTransaction gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.source = "pay";
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
            C22306c<List<GooglePlayOrders>> c22306cDoOnError = qib0.f154705T.m29587W(gPTransactionNew_, vroVar.URL_PAY).doOnError(new e30() { // from class: l.sro
                @Override // p149l.e30
                public final void call(Object obj) {
                    vro.m199672A0(this.f166117a, (Throwable) obj);
                }
            });
            final Function1 function1 = new Function1() { // from class: l.tro
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vro.m199674B0(this.f171827a, order, gPTransactionNew_, (List) obj);
                }
            };
            C22306c c22306cCompose = c22306cDoOnError.switchMap(new w9j() { // from class: l.uro
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vro.m199678D0(function1, obj);
                }
            }).compose(mkd0.m154951C());
            final Function1 function2 = new Function1() { // from class: l.jqo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vro.m199680E0((Object[]) obj);
                }
            };
            return c22306cCompose.switchMap(new w9j() { // from class: l.kqo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vro.m199682F0(function2, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.userCancel)) {
            vroVar.m98321l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
            vroVar.m98322m();
            return C22306c.just(PaymentApi.PaymentResultStatus.userCancel);
        }
        vroVar.m98321l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
        vroVar.m98322m();
        return C22306c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: O */
    public static C22306c m199691O(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static void m199692P(vro vroVar, boolean z, boolean z2, C22392a c22392a, C0871d c0871d, String str) {
        c0871d.getClass();
        vroVar.m98321l("8-2-4", "非订阅型商品 consumeAsync 结果 response is success -> " + (c0871d.m4966b() == 0), z, vroVar.type);
        if (c0871d.m4966b() != 0) {
            StringBuilder sb = new StringBuilder("Google BillingClient consume failed, from = ");
            sb.append(z2 ? "pay, errorCode = " : "restore, errorCode = ");
            sb.append(c0871d.m4966b());
            sb.append(", message = ");
            sb.append(c0871d.m4965a());
            vroVar.m98321l("error", "consumeAsync error -> " + ((Object) sb), z, vroVar.type);
            CrashHelper.m81296c(new RuntimeException(sb.toString()));
            vroVar.m98322m();
        }
        if (c22392a != null) {
            c22392a.m132487l(PaymentApi.PaymentResultStatus.succeed);
        }
    }

    /* JADX INFO: renamed from: S */
    public static C22306c m199695S(final vro vroVar, d30 d30Var, final String str, final Order order) {
        order.getClass();
        String json = order.toJson();
        String str2 = vroVar.type;
        vroVar.type = str2;
        Unit unit = Unit.INSTANCE;
        vroVar.m98321l(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO, json, false, str2);
        vroVar.m98320k(order, null);
        if ((!TEnum.equals(order.orderStatus, "locked") || TEnum.equals(order.orderStatus, BundleStatus.purchased)) && d30Var != null) {
            d30Var.call();
        }
        if (TEnum.equals(order.orderStatus, "locked") && !vroVar.tryConsumed) {
            vroVar.tryConsumed = true;
            String str3 = vroVar.type;
            vroVar.type = str3;
            vroVar.m98321l("8-1-1", "有相同的商品未被确认 需进行订单补偿", false, str3);
            C22306c<PaymentApi.PaymentResultStatus> c22306cM199741t0 = vroVar.m199741t0(vroVar.type, str);
            final Function1 function1 = new Function1() { // from class: l.lqo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vro.m199707j0(this.f129368a, str, (PaymentApi.PaymentResultStatus) obj);
                }
            };
            return c22306cM199741t0.switchMap(new w9j() { // from class: l.mqo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vro.m199708k0(function1, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.purchased)) {
            String str4 = vroVar.type;
            vroVar.type = str4;
            vroVar.m98321l("8-2-1", "当前订单交易正常，通知后端进行订单校验，下发权益", false, str4);
            final GPTransaction gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.source = "pay";
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
            C22306c<List<GooglePlayOrders>> c22306cDoOnError = qib0.f154705T.m29587W(gPTransactionNew_, vroVar.URL_PAY).doOnError(new e30() { // from class: l.nqo
                @Override // p149l.e30
                public final void call(Object obj) {
                    vro.m199709l0(this.f140088a, (Throwable) obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.oqo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vro.m199710m0(this.f145171a, order, gPTransactionNew_, (List) obj);
                }
            };
            C22306c c22306cCompose = c22306cDoOnError.switchMap(new w9j() { // from class: l.pqo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vro.m199714o0(function2, obj);
                }
            }).compose(mkd0.m154951C());
            final Function1 function3 = new Function1() { // from class: l.qqo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vro.m199716p0((Object[]) obj);
                }
            };
            return c22306cCompose.switchMap(new w9j() { // from class: l.rqo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return vro.m199718q0(function3, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, BundleStatus.userCancel)) {
            vroVar.m98321l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
            vroVar.m98322m();
            return C22306c.just(PaymentApi.PaymentResultStatus.userCancel);
        }
        vroVar.m98321l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
        vroVar.m98322m();
        return C22306c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: U */
    public static List m199697U(final String str, final String str2, List list) {
        return vwb.m200339n(list, new w9j() { // from class: l.jro
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199703c0(str, str2, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public static C22306c m199699W(final vro vroVar, final String str, final List list) {
        String string;
        String str2 = vroVar.TAG;
        List list2 = list;
        vwb.m200296J(list2);
        if (list == null || (string = list.toString()) == null) {
            string = "purchase is null";
        }
        vroVar.m98321l("2", "订单补偿 订单 ".concat(string), true, null);
        if (vwb.m200296J(list2)) {
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        final GPTransaction gPTransactionNew_ = GPTransaction.new_();
        gPTransactionNew_.source = RequestParameters.X_OSS_RESTORE;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null) {
                    GPAffiliateTransaction gPAffiliateTransactionNew_ = GPAffiliateTransaction.new_();
                    gPAffiliateTransactionNew_.purchaseData = ((Purchase) pair.second).m4809b();
                    gPAffiliateTransactionNew_.signature = ((Purchase) pair.second).m4813f();
                    gPTransactionNew_.affiliateTransactions.add(gPAffiliateTransactionNew_);
                }
            }
        }
        C22306c<List<GooglePlayOrders>> c22306cDoOnError = qib0.f154705T.m29588X(gPTransactionNew_, vroVar.URL_RESTORE).doOnError(new e30() { // from class: l.uqo
            @Override // p149l.e30
            public final void call(Object obj) {
                vro.m199724u0(this.f177759a, list, str, (Throwable) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.vqo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vro.m199726v0(this.f182663a, list, gPTransactionNew_, (List) obj);
            }
        };
        C22306c c22306cCompose = c22306cDoOnError.switchMap(new w9j() { // from class: l.wqo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199730x0(function1, obj);
            }
        }).compose(mkd0.m154951C());
        final Function1 function2 = new Function1() { // from class: l.xqo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vro.m199732y0((Object[]) obj);
            }
        };
        return c22306cCompose.switchMap(new w9j() { // from class: l.yqo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199734z0(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public static final Boolean m199703c0(String str, String str2, Pair pair) {
        Purchase purchase;
        List<String> listM4810c;
        Purchase purchase2;
        List<String> listM4810c2;
        if (Intrinsics.m87488d(str, SubSampleInformationBox.TYPE)) {
            if (pair == null || (purchase2 = (Purchase) pair.second) == null || (listM4810c2 = purchase2.m4810c()) == null) {
                return null;
            }
            return Boolean.valueOf(listM4810c2.contains(f4k.INSTANCE.m119322a(str2).getFirst()));
        }
        if (pair == null || (purchase = (Purchase) pair.second) == null || (listM4810c = purchase.m4810c()) == null) {
            return null;
        }
        return Boolean.valueOf(listM4810c.contains(str2));
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m199704e0(final vro vroVar, final String str, z3g0 z3g0Var, final List list, C0871d c0871d, List list2) {
        c0871d.getClass();
        String str2 = vroVar.TAG;
        Objects.toString(c0871d);
        if (c0871d.m4966b() == 0) {
            List list3 = list2;
            if (!vwb.m200296J(list3)) {
                vwb.m200354z(list3, new e30() { // from class: l.nro
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        vro.m199705f0(this.f140209a, list, str, (Purchase) obj);
                    }
                });
                z3g0Var.m132487l(list);
                return;
            }
        }
        z3g0Var.m132487l(list);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m199705f0(vro vroVar, List list, String str, Purchase purchase) {
        if (purchase != null) {
            String str2 = vroVar.TAG;
            purchase.toString();
            if (purchase.m4811d() == 2 && TextUtils.isEmpty(purchase.m4808a())) {
                return;
            }
            list.add(Pair.create(str, purchase));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final Boolean m199706i0(String str, Purchase purchase) {
        purchase.getClass();
        List<String> listM4810c = purchase.m4810c();
        f4k f4kVar = f4k.INSTANCE;
        str.getClass();
        return Boolean.valueOf(listM4810c.contains(f4kVar.m119322a(str).getFirst()));
    }

    /* JADX INFO: renamed from: j0 */
    public static final C22306c m199707j0(vro vroVar, String str, PaymentApi.PaymentResultStatus paymentResultStatus) {
        paymentResultStatus.getClass();
        return paymentResultStatus == PaymentApi.PaymentResultStatus.succeed ? vroVar.mo123064c(str, null) : C22306c.just(paymentResultStatus);
    }

    /* JADX INFO: renamed from: k0 */
    public static final C22306c m199708k0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m199709l0(vro vroVar, Throwable th) {
        th.getClass();
        vroVar.m98321l("error", th.getMessage(), false, vroVar.type);
        vroVar.m98322m();
    }

    /* JADX INFO: renamed from: m0 */
    public static final C22306c m199710m0(vro vroVar, Order order, GPTransaction gPTransaction, List list) {
        String str;
        ArrayList arrayList = null;
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = "pay 后端订单校验结果 status is success, orderId->" + ((GooglePlayOrders) it.next()).transactionId;
                    String str3 = vroVar.type;
                    vroVar.type = str3;
                    Unit unit = Unit.INSTANCE;
                    vroVar.m98321l("8-2-2", str2, false, str3);
                    JsonAdapter<GPPurchaseData> jsonAdapter = GPPurchaseData.JSON_ADAPTER;
                    GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
                    if (gPAffiliateTransaction == null || (str = gPAffiliateTransaction.purchaseData) == null) {
                        str = "";
                    }
                    vroVar.m199735a0(jsonAdapter.parse(str).purchaseToken, true, null, false);
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                vroVar.m98321l("error", e.getMessage(), false, vroVar.type);
            }
        }
        if (list != null) {
            List<GooglePlayOrders> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GooglePlayOrders googlePlayOrders : list2) {
                PaymentApi paymentApi = qib0.f154705T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.m29585U(gPTransaction, googlePlayOrders, 0));
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? C22306c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : mkd0.m154982p(arrayList, new faj() { // from class: l.zqo
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return vro.m199712n0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static final C22306c m199714o0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: p0 */
    public static final C22306c m199716p0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? C22306c.just(PaymentApi.PaymentResultStatus.failed) : C22306c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static final C22306c m199718q0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static List m199720s(List list, List list2) {
        return vwb.m200321e(list, list2);
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m199721s0(vro vroVar, String str, C0869c c0869c) {
        vroVar.m98321l(Constants.VIA_SHARE_TYPE_INFO, "启动购买流程，唤起Google Play 购买弹窗", false, str);
        vroVar.client.mo4828f(vroVar.com.tencent.open.SocialConstants.PARAM_ACT java.lang.String, c0869c);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m199724u0(vro vroVar, List list, String str, Throwable th) {
        th.getClass();
        vroVar.m98321l("error", "restore request " + th.getMessage(), true, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vroVar.m98322m();
            }
        }
        if (CoreModule.m29935P().m94651a().mo33549mo()) {
            Integer num = qib0.f154705T.retryRestoreCount.get();
            if (str != null || num.intValue() <= 0) {
                return;
            }
            qib0.f154705T.retryRestoreCount.put(Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final C22306c m199726v0(vro vroVar, List list, GPTransaction gPTransaction, List list2) {
        Purchase purchase;
        ArrayList arrayList = null;
        vroVar.m98321l("3", "restore response size ->" + (list2 != null ? Integer.valueOf(list2.size()) : null), true, null);
        vroVar.m98319j();
        qib0.f154705T.retryRestore.put(Boolean.FALSE);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null && (purchase = (Purchase) pair.second) != null) {
                    if (Intrinsics.m87488d(pair.first, SubSampleInformationBox.TYPE)) {
                        String strM4812e = purchase.m4812e();
                        strM4812e.getClass();
                        vroVar.m98317f(strM4812e, (String) pair.first);
                    } else {
                        vroVar.m199735a0(purchase.m4812e(), false, null, true);
                    }
                }
            }
        }
        if (list2 != null) {
            List<GooglePlayOrders> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (GooglePlayOrders googlePlayOrders : list3) {
                PaymentApi paymentApi = qib0.f154705T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.m29585U(gPTransaction, googlePlayOrders, 0));
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? C22306c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : mkd0.m154982p(arrayList, new faj() { // from class: l.lro
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return vro.m199728w0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m199727w(final vro vroVar, final String str, final List list, final z3g0 z3g0Var) {
        z3g0Var.getClass();
        vroVar.client.mo4830i(vnb0.m198999a().m199003b(str).m199002a(), new qcb0() { // from class: l.mro
            @Override // p149l.qcb0
            /* JADX INFO: renamed from: b */
            public final void mo5067b(C0871d c0871d, List list2) {
                vro.m199704e0(this.f135391a, str, z3g0Var, list, c0871d, list2);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static final C22306c m199730x0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: y0 */
    public static final C22306c m199732y0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? C22306c.just(PaymentApi.PaymentResultStatus.failed) : C22306c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static void m199733z(final vro vroVar, final String str, String str2, C0869c.c cVar, String str3, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, C0871d c0871d, List list) {
        Object next;
        String strM5020c;
        c0871d.getClass();
        list.getClass();
        if (c0871d.m4966b() != 0 || vwb.m200296J(list)) {
            vroVar.m98321l("error", "productDetails query error", false, str);
            Order orderNew_ = Order.new_();
            orderNew_.orderStatus = BundleStatus.get("failed");
            qib0.f154705T.m29590Z(orderNew_);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0875f c0875f = (C0875f) it.next();
            vroVar.m98321l("4", list.toString(), false, str);
            C0869c.b.a aVarM4947c = C0869c.b.m4940a().m4947c(c0875f);
            aVarM4947c.getClass();
            if (Intrinsics.m87488d(str2, SubSampleInformationBox.TYPE)) {
                List<C0875f.e> listM5002e = c0875f.m5002e();
                String str4 = "";
                if (listM5002e != null) {
                    Iterator<T> it2 = listM5002e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        C0875f.e eVar = (C0875f.e) next;
                        if (Intrinsics.m87488d(eVar.m5018a(), objectRef.element)) {
                            String strM5019b = eVar.m5019b();
                            if (strM5019b == null) {
                                strM5019b = "";
                            }
                            String str5 = (String) objectRef2.element;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (Intrinsics.m87488d(strM5019b, str5)) {
                                break;
                            }
                        }
                    }
                    C0875f.e eVar2 = (C0875f.e) next;
                    if (eVar2 != null && (strM5020c = eVar2.m5020c()) != null) {
                        str4 = strM5020c;
                    }
                }
                vroVar.m98321l("4-1", "设置订阅offer token ".concat(str4), false, str);
                aVarM4947c.m4946b(str4);
            }
            C0869c.a aVarM4937b = C0869c.m4918a().m4938c(ImmutableList.m15686of(aVarM4947c.m4945a())).m4937b(CoreModule.m29931H().userId());
            aVarM4937b.getClass();
            if (cVar != null) {
                vroVar.m98321l("4-2", "查询订阅订单  oldProduct = " + str3, false, str);
                aVarM4937b.m4939d(cVar);
            }
            final C0869c c0869cM4936a = aVarM4937b.m4936a();
            c0869cM4936a.getClass();
            Act act = vroVar.com.tencent.open.SocialConstants.PARAM_ACT java.lang.String;
            if (act instanceof PutongAct) {
                ((PutongAct) act).iap().m148942r(new Runnable() { // from class: l.hro
                    @Override // java.lang.Runnable
                    public final void run() {
                        vro.m199721s0(this.f109232a, str, c0869cM4936a);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static final C22306c m199734z0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    @Override // p149l.ftl
    @NotNull
    /* JADX INFO: renamed from: a */
    public C22306c<PaymentApi.PaymentResultStatus> mo123062a() {
        return m199741t0(null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m199735a0(@Nullable String purchaseToken, final boolean fromPay, @Nullable final C22392a<PaymentApi.PaymentResultStatus> subject, final boolean isRestore) {
        sz5.C20084a c20084aM186742b = sz5.m186742b();
        if (purchaseToken == null) {
            purchaseToken = "";
        }
        sz5 sz5VarM186745a = c20084aM186742b.m186746b(purchaseToken).m186745a();
        sz5VarM186745a.getClass();
        m98321l("8-2-3", "非订阅型商品 开始consumeAsync " + sz5VarM186745a.m186744a(), isRestore, this.type);
        this.client.mo4824b(sz5VarM186745a, new tz5() { // from class: l.kro
            @Override // p149l.tz5
            /* JADX INFO: renamed from: f */
            public final void mo5071f(C0871d c0871d, String str) {
                vro.m199692P(this.f124377a, isRestore, fromPay, subject, c0871d, str);
            }
        });
    }

    @Override // p149l.ftl
    @Nullable
    /* JADX INFO: renamed from: b */
    public C22306c<PaymentApi.PaymentResultStatus> mo123063b(@NotNull final String product, @Nullable String oldProduct, @Nullable final d30 gpOrderSuccessTrack) {
        product.getClass();
        this.type = SubSampleInformationBox.TYPE;
        Unit unit = Unit.INSTANCE;
        m98321l("1", "获取 BillingClient 对象", false, SubSampleInformationBox.TYPE);
        if (!NullChecker.m81303a(this.client) || !this.client.mo4827e()) {
            m98321l("error", "client == null  或者连接google 服务失败", false, this.type);
            m98320k(null, "client == null");
            m98322m();
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str = this.type;
        this.type = str;
        m98321l("2", "连接google play 服务 成功", false, str);
        qib0.f154705T.retryRestore.put(Boolean.TRUE);
        qib0.f154705T.retryRestoreCount.put(0);
        m199739h0(product, oldProduct, SubSampleInformationBox.TYPE);
        C22306c<Order> c22306cFirst = qib0.f154705T.m29589Y().first();
        final Function1 function1 = new Function1() { // from class: l.ero
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vro.m199690N(this.f92948a, gpOrderSuccessTrack, product, (Order) obj);
            }
        };
        return c22306cFirst.switchMap(new w9j() { // from class: l.oro
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199684H(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public C22306c<List<Pair<String, Purchase>>> m199736b0(@Nullable final String productType, @Nullable final String product) {
        if (!NullChecker.m81303a(this.client)) {
            C22306c<List<Pair<String, Purchase>>> c22306cJust = C22306c.just(null);
            c22306cJust.getClass();
            return c22306cJust;
        }
        if (TextUtils.isEmpty(productType) || TextUtils.isEmpty(product)) {
            C22306c<List<Pair<String, Purchase>>> c22306cM199737d0 = m199737d0("inapp");
            C22306c<List<Pair<String, Purchase>>> c22306cM199737d1 = m199737d0(SubSampleInformationBox.TYPE);
            final Function2 function2 = new Function2() { // from class: l.fro
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vro.m199720s((List) obj, (List) obj2);
                }
            };
            C22306c<List<Pair<String, Purchase>>> c22306cM154984r = mkd0.m154984r(c22306cM199737d0, c22306cM199737d1, new x9j() { // from class: l.gro
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return vro.m199683G(function2, obj, obj2);
                }
            });
            c22306cM154984r.getClass();
            return c22306cM154984r;
        }
        productType.getClass();
        C22306c<List<Pair<String, Purchase>>> c22306cM199737d2 = m199737d0(productType);
        final Function1 function1 = new Function1() { // from class: l.cro
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vro.m199697U(productType, product, (List) obj);
            }
        };
        C22306c map = c22306cM199737d2.map(new w9j() { // from class: l.dro
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199673B(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @Override // p149l.ftl
    @Nullable
    /* JADX INFO: renamed from: c */
    public C22306c<PaymentApi.PaymentResultStatus> mo123064c(@NotNull final String product, @Nullable final d30 gpOrderSuccessTrack) {
        product.getClass();
        this.type = "inapp";
        Unit unit = Unit.INSTANCE;
        m98321l("1", "获取 BillingClient 对象", false, "inapp");
        if (!NullChecker.m81303a(this.client) || !this.client.mo4827e()) {
            m98321l("error", "client = null 或者连接google 服务失败", false, this.type);
            m98320k(null, "client = null");
            return C22306c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str = this.type;
        this.type = str;
        m98321l("2", "连接google play 服务 成功", false, str);
        qib0.f154705T.retryRestore.put(Boolean.TRUE);
        qib0.f154705T.retryRestoreCount.put(0);
        m199738g0(product, "inapp");
        C22306c<Order> c22306cM29589Y = qib0.f154705T.m29589Y();
        final Function1 function1 = new Function1() { // from class: l.iqo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vro.m199695S(this.f114533a, gpOrderSuccessTrack, product, (Order) obj);
            }
        };
        return c22306cM29589Y.switchMap(new w9j() { // from class: l.tqo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199691O(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public C22306c<List<Pair<String, Purchase>>> m199737d0(@NotNull final String productType) {
        productType.getClass();
        final ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(this.client)) {
            C22306c<List<Pair<String, Purchase>>> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.iro
                @Override // p149l.e30
                public final void call(Object obj) {
                    vro.m199727w(this.f114659a, productType, arrayList, (z3g0) obj);
                }
            });
            c22306cCreate.getClass();
            return c22306cCreate;
        }
        C22306c<List<Pair<String, Purchase>>> c22306cJust = C22306c.just(arrayList);
        c22306cJust.getClass();
        return c22306cJust;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m199738g0(String product, String type) {
        m199739h0(product, null, type);
    }

    /* JADX INFO: renamed from: h0 */
    public void m199739h0(@NotNull final String product, @Nullable final String oldProduct, @NotNull final String type) {
        product.getClass();
        type.getClass();
        if (!TextUtils.isEmpty(oldProduct)) {
            f4k f4kVar = f4k.INSTANCE;
            if (!Intrinsics.m87488d(f4kVar.m119322a(product).getFirst(), f4kVar.m119322a(oldProduct).getFirst())) {
                this.client.mo4830i(vnb0.m198999a().m199003b(type).m199002a(), new qcb0() { // from class: l.rro
                    @Override // p149l.qcb0
                    /* JADX INFO: renamed from: b */
                    public final void mo5067b(C0871d c0871d, List list) {
                        vro.m199671A(this.f160762a, product, type, oldProduct, c0871d, list);
                    }
                });
                return;
            }
        }
        m199740r0(product, null, type, oldProduct);
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: r0 */
    public final void m199740r0(String product, final C0869c.c updateParams, final String type, final String oldProduct) {
        m98321l("3", "查询 product " + product + " 商品 详情 oldProduct " + oldProduct, false, type);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (Intrinsics.m87488d(type, SubSampleInformationBox.TYPE)) {
            Triple<String, String, String> tripleM119322a = f4k.INSTANCE.m119322a(product);
            String first = tripleM119322a.getFirst();
            String str = first != null ? first : "";
            objectRef.element = tripleM119322a.getSecond();
            objectRef2.element = tripleM119322a.getThird();
            product = str;
        }
        C0877g c0877gM5030a = C0877g.m5026a().m5031b(ImmutableList.m15686of(C0877g.b.m5032a().m5038b(product).m5039c(type).m5037a())).m5030a();
        c0877gM5030a.getClass();
        this.client.mo4829h(c0877gM5030a, new wd90() { // from class: l.sqo
            @Override // p149l.wd90
            /* JADX INFO: renamed from: a */
            public final void mo136040a(C0871d c0871d, List list) {
                vro.m199733z(this.f166002a, type, type, updateParams, oldProduct, objectRef, objectRef2, c0871d, list);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public C22306c<PaymentApi.PaymentResultStatus> m199741t0(@Nullable String type, @Nullable final String product) {
        C22306c<List<Pair<String, Purchase>>> c22306cM199736b0 = m199736b0(type, product);
        final Function1 function1 = new Function1() { // from class: l.pro
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vro.m199699W(this.f150937a, product, (List) obj);
            }
        };
        C22306c c22306cSwitchMap = c22306cM199736b0.switchMap(new w9j() { // from class: l.qro
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vro.m199688L(function1, obj);
            }
        });
        c22306cSwitchMap.getClass();
        return c22306cSwitchMap;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Object[] m199676C0(Object[] objArr) {
        return objArr;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Object[] m199712n0(Object[] objArr) {
        return objArr;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Object[] m199728w0(Object[] objArr) {
        return objArr;
    }
}
