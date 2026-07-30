package com.p000p1.mobile.putong.api.api;

import com.immomo.hdata.android.MDevice;
import com.p000p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.ContractEnvelope;
import com.p1.mobile.putong.data.ContractIds;
import com.p1.mobile.putong.data.GPResult;
import com.p1.mobile.putong.data.GPTransaction;
import com.p1.mobile.putong.data.GooglePlayOrders;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.data.Order;
import com.p1.mobile.putong.data.OrderData;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.dyd;
import l.e30;
import l.hpd0;
import l.mkd0;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import p006l.k0f0;
import p006l.ka20;
import p006l.qib0;
import p006l.xh5;
import rx.c;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001cJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0003J'\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010$j\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0\u000b¢\u0006\u0004\b'\u0010\u0016J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000b2\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R.\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010$j\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u000b8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0016¨\u0006D"}, d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi;", "Ll/xh5;", "<init>", "()V", "Lcom/p1/mobile/putong/data/GPTransaction;", "gpTransaction", "", "a0", "(Lcom/p1/mobile/putong/data/GPTransaction;)V", "Lcom/p1/mobile/putong/data/PaymentParam;", "paymentParam", "Lrx/c;", "Lcom/p1/mobile/putong/data/OrderData;", "V", "(Lcom/p1/mobile/putong/data/PaymentParam;)Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "b0", "Lcom/p1/mobile/putong/data/Order;", "order", "Z", "(Lcom/p1/mobile/putong/data/Order;)V", "Y", "()Lrx/c;", "", "url", "", "Lcom/p1/mobile/putong/data/GooglePlayOrders;", "W", "(Lcom/p1/mobile/putong/data/GPTransaction;Ljava/lang/String;)Lrx/c;", "orders", "", "times", "U", "(Lcom/p1/mobile/putong/data/GPTransaction;Lcom/p1/mobile/putong/data/GooglePlayOrders;I)Lrx/c;", "X", "R", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/data/Contract;", "Lkotlin/collections/ArrayList;", "S", "id", "Lcom/p1/mobile/putong/data/ContractEnvelope;", "Q", "(Ljava/lang/String;)Lrx/c;", "a", "Ljava/lang/String;", "STATUS_PROCESSED", "Ll/hpd0;", "b", "Ll/hpd0;", "retryRestore", "Ll/tpd0;", "c", "Ll/tpd0;", "retryRestoreCount", "Lrx/subjects/b;", "d", "Lrx/subjects/b;", "resultSub", "Lrx/subjects/a;", "e", "Lrx/subjects/a;", "subscriptions", "Ll/roj0;", "T", "contracts", "PaymentResultStatus", "SignResultStatus", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class PaymentApi extends xh5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String STATUS_PROCESSED = "processed";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public hpd0 retryRestore = new hpd0("retry_restore" + qib0.f19805c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public tpd0 retryRestoreCount = new tpd0("retry_restore_count" + qib0.f19805c0.userId(), 0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final b<Order> resultSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final a<ArrayList<Contract>> subscriptions;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "succeed", "failed", "subscriptionChanged", "pending", "toSigning", "userCancel", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum PaymentResultStatus {
        succeed,
        failed,
        subscriptionChanged,
        pending,
        toSigning,
        userCancel;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<PaymentResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi$SignResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", "succeed", "failed", "signing", "pending", "toSigning", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum SignResultStatus {
        succeed,
        failed,
        signing,
        pending,
        toSigning;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        @NotNull
        public static EnumEntries<SignResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public PaymentApi() {
        b<Order> bVarB = b.b();
        bVarB.getClass();
        this.resultSub = bVarB;
        a<ArrayList<Contract>> aVarB = a.b();
        aVarB.getClass();
        this.subscriptions = aVarB;
    }

    /* JADX INFO: renamed from: A */
    public static PaymentResultStatus m1468A(Function1 function1, Object obj) {
        return (PaymentResultStatus) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static PaymentResultStatus m1469B(OrderData orderData) {
        orderData.getClass();
        return TEnum.equals(orderData.data.orderStatus, "success") ? PaymentResultStatus.succeed : PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: C */
    public static stc0 m1470C(PaymentParam paymentParam) {
        return qib0.f19784H.auth().q(xh5.m27260s(paymentParam.url)).l(utc0.create(Network.JSON, paymentParam.toJson())).b();
    }

    /* JADX INFO: renamed from: D */
    public static Unit m1471D(GPTransaction gPTransaction) {
        try {
            String mMuidV3 = MDevice.getMMuidV3(App.e);
            if (mMuidV3 == null || mMuidV3.length() == 0) {
                gPTransaction.mmuid = MDevice.getmmuid(App.e, dyd.a());
            } else {
                gPTransaction.mmuid = mMuidV3;
            }
            gPTransaction.smid = k0f0.m17882f().m17885g();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static stc0 m1472E(ContractIds contractIds) {
        return qib0.f19784H.auth().q(xh5.m27260s("/contracts/cancel")).l(utc0.create(Network.JSON, contractIds.toJson())).b();
    }

    /* JADX INFO: renamed from: F */
    public static stc0 m1473F() {
        return qib0.f19784H.auth().q(xh5.m27260s("/contracts/query")).l(utc0.create(Network.JSON, "")).b();
    }

    /* JADX INFO: renamed from: G */
    public static List m1474G(PaymentApi paymentApi, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return null;
        }
        List list = gPResult.data.googlePlayOrders;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.d(((GooglePlayOrders) obj).status, paymentApi.STATUS_PROCESSED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public static stc0 m1475H(PaymentParam paymentParam, PaymentParam paymentParam2) {
        return qib0.f19784H.auth().q(xh5.m27260s(paymentParam.url)).l(utc0.create(Network.JSON, paymentParam2.toJson())).b();
    }

    /* JADX INFO: renamed from: I */
    public static stc0 m1476I(String str, GPTransaction gPTransaction) {
        return qib0.f19784H.auth().q(xh5.m27260s(str)).l(utc0.create(Network.JSON, gPTransaction.toJson())).b();
    }

    /* JADX INFO: renamed from: J */
    public static c m1477J(PaymentApi paymentApi, int i, GPTransaction gPTransaction, GooglePlayOrders googlePlayOrders, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return c.just(PaymentResultStatus.failed);
        }
        if (!gPResult.data.googlePlayOrders.isEmpty()) {
            List list = gPResult.data.googlePlayOrders;
            list.getClass();
            GooglePlayOrders googlePlayOrders2 = (GooglePlayOrders) CollectionsKt.firstOrNull(list);
            if (!Intrinsics.d(googlePlayOrders2 != null ? googlePlayOrders2.status : null, paymentApi.STATUS_PROCESSED)) {
                return i < 5 ? paymentApi.m1491U(gPTransaction, googlePlayOrders, i + 1) : c.just(PaymentResultStatus.failed);
            }
        }
        return c.just(PaymentResultStatus.succeed);
    }

    /* JADX INFO: renamed from: K */
    public static c m1478K(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static ContractEnvelope m1479L(PaymentApi paymentApi, String str, ContractEnvelope contractEnvelope) {
        contractEnvelope.getClass();
        ArrayList arrayList = (ArrayList) paymentApi.subscriptions.e();
        if (contractEnvelope.meta.code == 200) {
            arrayList.getClass();
            Iterator it = arrayList.iterator();
            it.getClass();
            Contract contract = null;
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                Contract contract2 = (Contract) next;
                if (Intrinsics.d(contract2.id, str)) {
                    contract = contract2;
                }
            }
            if (contract != null) {
                arrayList.remove(contract);
            }
            paymentApi.subscriptions.onNext(arrayList);
        }
        return contractEnvelope;
    }

    /* JADX INFO: renamed from: M */
    public static ContractEnvelope m1480M(Function1 function1, Object obj) {
        return (ContractEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static stc0 m1481N(String str, GPTransaction gPTransaction) {
        return qib0.f19784H.auth().q(xh5.m27260s(str)).l(utc0.create(Network.JSON, gPTransaction.toJson())).b();
    }

    /* JADX INFO: renamed from: O */
    public static void m1482O(Throwable th) {
        c.just(PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: P */
    public static List m1483P(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static List m1484x(PaymentApi paymentApi, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return null;
        }
        List list = gPResult.data.googlePlayOrders;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.d(((GooglePlayOrders) obj).status, paymentApi.STATUS_PROCESSED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static stc0 m1485y(String str) {
        return qib0.f19784H.auth().q(xh5.m27260s(str)).f().b();
    }

    /* JADX INFO: renamed from: z */
    public static List m1486z(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final c<ContractEnvelope> m1487Q(@NotNull final String id) {
        id.getClass();
        final ContractIds contractIdsNew_ = ContractIds.new_();
        contractIdsNew_.ids.add(id);
        c cVarCompose = new ka20(new v9j() { // from class: l.tc60
            public final Object call() {
                return PaymentApi.m1472E(contractIdsNew_);
            }
        }, ContractEnvelope.JSON_ADAPTER).compose(mkd0.C());
        final Function1 function1 = new Function1() { // from class: l.uc60
            public final Object invoke(Object obj) {
                return PaymentApi.m1479L(this.f23485a, id, (ContractEnvelope) obj);
            }
        };
        c<ContractEnvelope> map = cVarCompose.map(new w9j() { // from class: l.vc60
            public final Object call(Object obj) {
                return PaymentApi.m1480M(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: R */
    public final void m1488R() {
        this.subscriptions.onNext((Object) null);
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final c<ArrayList<Contract>> m1489S() {
        if (this.subscriptions.e() == null) {
            m1490T();
        }
        return this.subscriptions;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final c<roj0> m1490T() {
        c<roj0> cVarMo12020z5 = qib0.f19805c0.mo12020z5(new v9j() { // from class: l.pc60
            public final Object call() {
                return PaymentApi.m1473F();
            }
        }, this.subscriptions);
        cVarMo12020z5.getClass();
        return cVarMo12020z5;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final c<PaymentResultStatus> m1491U(@NotNull final GPTransaction gpTransaction, @NotNull final GooglePlayOrders orders, final int times) {
        gpTransaction.getClass();
        orders.getClass();
        if (Intrinsics.d(orders.status, this.STATUS_PROCESSED)) {
            c<PaymentResultStatus> cVarJust = c.just(PaymentResultStatus.succeed);
            cVarJust.getClass();
            return cVarJust;
        }
        m1497a0(gpTransaction);
        final String str = "/googleplay/orders/" + orders.transactionId;
        c cVarDelay = new ka20(new v9j() { // from class: l.dd60
            public final Object call() {
                return PaymentApi.m1485y(str);
            }
        }, GPResult.JSON_ADAPTER).doOnError(new e30() { // from class: l.ed60
            public final void call(Object obj) {
                PaymentApi.m1482O((Throwable) obj);
            }
        }).delay(1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: l.fd60
            public final Object invoke(Object obj) {
                return PaymentApi.m1477J(this.f12659a, times, gpTransaction, orders, (GPResult) obj);
            }
        };
        c<PaymentResultStatus> cVarSwitchMap = cVarDelay.switchMap(new w9j() { // from class: l.gd60
            public final Object call(Object obj) {
                return PaymentApi.m1478K(function1, obj);
            }
        });
        cVarSwitchMap.getClass();
        return cVarSwitchMap;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final c<OrderData> m1492V(@NotNull final PaymentParam paymentParam) {
        paymentParam.getClass();
        final PaymentParam paymentParamClone = paymentParam.clone();
        paymentParamClone.getClass();
        c<OrderData> cVarCompose = new ka20(new v9j() { // from class: l.cd60
            public final Object call() {
                return PaymentApi.m1475H(paymentParam, paymentParamClone);
            }
        }, OrderData.JSON_ADAPTER).compose(mkd0.C());
        cVarCompose.getClass();
        return cVarCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final c<List<GooglePlayOrders>> m1493W(@NotNull final GPTransaction gpTransaction, @NotNull final String url) {
        gpTransaction.getClass();
        url.getClass();
        m1497a0(gpTransaction);
        ka20 ka20Var = new ka20(new v9j() { // from class: l.zc60
            public final Object call() {
                return PaymentApi.m1476I(url, gpTransaction);
            }
        }, GPResult.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.ad60
            public final Object invoke(Object obj) {
                return PaymentApi.m1474G(this.f8217a, (GPResult) obj);
            }
        };
        c<List<GooglePlayOrders>> map = ka20Var.map(new w9j() { // from class: l.bd60
            public final Object call(Object obj) {
                return PaymentApi.m1486z(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final c<List<GooglePlayOrders>> m1494X(@NotNull final GPTransaction gpTransaction, @NotNull final String url) {
        gpTransaction.getClass();
        url.getClass();
        m1497a0(gpTransaction);
        ka20 ka20Var = new ka20(new v9j() { // from class: l.qc60
            public final Object call() {
                return PaymentApi.m1481N(url, gpTransaction);
            }
        }, GPResult.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.rc60
            public final Object invoke(Object obj) {
                return PaymentApi.m1484x(this.f20511a, (GPResult) obj);
            }
        };
        c<List<GooglePlayOrders>> map = ka20Var.map(new w9j() { // from class: l.sc60
            public final Object call(Object obj) {
                return PaymentApi.m1483P(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final c<Order> m1495Y() {
        return this.resultSub;
    }

    /* JADX INFO: renamed from: Z */
    public final void m1496Z(@NotNull Order order) {
        order.getClass();
        this.resultSub.onNext(order);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m1497a0(final GPTransaction gpTransaction) {
        new Function0() { // from class: l.hd60
            public final Object invoke() {
                return PaymentApi.m1471D(gpTransaction);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final c<PaymentResultStatus> m1498b0(@NotNull final PaymentParam paymentParam) {
        paymentParam.getClass();
        ka20 ka20Var = new ka20(new v9j() { // from class: l.wc60
            public final Object call() {
                return PaymentApi.m1470C(paymentParam);
            }
        }, OrderData.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.xc60
            public final Object invoke(Object obj) {
                return PaymentApi.m1469B((OrderData) obj);
            }
        };
        c<PaymentResultStatus> cVarCompose = ka20Var.map(new w9j() { // from class: l.yc60
            public final Object call(Object obj) {
                return PaymentApi.m1468A(function1, obj);
            }
        }).compose(mkd0.C());
        cVarCompose.getClass();
        return cVarCompose;
    }
}
