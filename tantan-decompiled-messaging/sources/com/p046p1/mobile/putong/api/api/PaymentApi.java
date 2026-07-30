package com.p046p1.mobile.putong.api.api;

import com.clevertap.android.sdk.Constants;
import com.immomo.hdata.android.MDevice;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.ContractEnvelope;
import com.p046p1.mobile.putong.data.ContractIds;
import com.p046p1.mobile.putong.data.GPResult;
import com.p046p1.mobile.putong.data.GPTransaction;
import com.p046p1.mobile.putong.data.GooglePlayOrders;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.Order;
import com.p046p1.mobile.putong.data.OrderData;
import com.p046p1.mobile.putong.data.PaymentParam;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
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
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.dyd;
import p149l.e30;
import p149l.hpd0;
import p149l.j6f;
import p149l.k0f0;
import p149l.ka20;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.stc0;
import p149l.tpd0;
import p149l.utc0;
import p149l.v9j;
import p149l.w9j;
import p149l.xh5;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001cJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0003J'\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010$j\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0\u000b¢\u0006\u0004\b'\u0010\u0016J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000b2\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R.\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010$j\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u000b8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0016¨\u0006D"}, m87232d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi;", "Ll/xh5;", "<init>", "()V", "Lcom/p1/mobile/putong/data/GPTransaction;", "gpTransaction", "", "a0", "(Lcom/p1/mobile/putong/data/GPTransaction;)V", "Lcom/p1/mobile/putong/data/PaymentParam;", "paymentParam", "Lrx/c;", "Lcom/p1/mobile/putong/data/OrderData;", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/data/PaymentParam;)Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "b0", "Lcom/p1/mobile/putong/data/Order;", "order", "Z", "(Lcom/p1/mobile/putong/data/Order;)V", "Y", "()Lrx/c;", "", "url", "", "Lcom/p1/mobile/putong/data/GooglePlayOrders;", "W", "(Lcom/p1/mobile/putong/data/GPTransaction;Ljava/lang/String;)Lrx/c;", "orders", "", "times", "U", "(Lcom/p1/mobile/putong/data/GPTransaction;Lcom/p1/mobile/putong/data/GooglePlayOrders;I)Lrx/c;", "X", "R", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/data/Contract;", "Lkotlin/collections/ArrayList;", j6f.LATITUDE_SOUTH, "id", "Lcom/p1/mobile/putong/data/ContractEnvelope;", "Q", "(Ljava/lang/String;)Lrx/c;", "a", "Ljava/lang/String;", "STATUS_PROCESSED", "Ll/hpd0;", "b", "Ll/hpd0;", "retryRestore", "Ll/tpd0;", "c", "Ll/tpd0;", "retryRestoreCount", "Lrx/subjects/b;", Constants.INAPP_DATA_TAG, "Lrx/subjects/b;", "resultSub", "Lrx/subjects/a;", "e", "Lrx/subjects/a;", SchemeKey.subscriptions, "Ll/roj0;", j6f.GPS_DIRECTION_TRUE, "contracts", "PaymentResultStatus", "SignResultStatus", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class PaymentApi extends xh5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String STATUS_PROCESSED = "processed";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public hpd0 retryRestore = new hpd0("retry_restore" + qib0.f154714c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public tpd0 retryRestoreCount = new tpd0("retry_restore_count" + qib0.f154714c0.userId(), 0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C22393b<Order> resultSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C22392a<ArrayList<Contract>> subscriptions;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m87232d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", StateEvent.ProcessResult.SUCCEED, "failed", "subscriptionChanged", "pending", "toSigning", BundleStatus.userCancel, "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum PaymentResultStatus {
        succeed,
        failed,
        subscriptionChanged,
        pending,
        toSigning,
        userCancel;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<PaymentResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi$SignResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", StateEvent.ProcessResult.SUCCEED, "failed", "signing", "pending", "toSigning", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public enum SignResultStatus {
        succeed,
        failed,
        signing,
        pending,
        toSigning;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<SignResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public PaymentApi() {
        C22393b<Order> c22393bM221521b = C22393b.m221521b();
        c22393bM221521b.getClass();
        this.resultSub = c22393bM221521b;
        C22392a<ArrayList<Contract>> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.subscriptions = c22392aM221512b;
    }

    /* JADX INFO: renamed from: A */
    public static PaymentResultStatus m29562A(Function1 function1, Object obj) {
        return (PaymentResultStatus) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static PaymentResultStatus m29563B(OrderData orderData) {
        orderData.getClass();
        return TEnum.equals(orderData.data.orderStatus, "success") ? PaymentResultStatus.succeed : PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: C */
    public static stc0 m29564C(PaymentParam paymentParam) {
        return qib0.f154693H.auth().m185898q(xh5.m208771s(paymentParam.url)).m185893l(utc0.create(Network.JSON, paymentParam.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: D */
    public static Unit m29565D(GPTransaction gPTransaction) {
        try {
            String mMuidV3 = MDevice.getMMuidV3(App.f15369e);
            if (mMuidV3 == null || mMuidV3.length() == 0) {
                gPTransaction.mmuid = MDevice.getmmuid(App.f15369e, dyd.m114055a());
            } else {
                gPTransaction.mmuid = mMuidV3;
            }
            gPTransaction.smid = k0f0.m144032f().m144035g();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static stc0 m29566E(ContractIds contractIds) {
        return qib0.f154693H.auth().m185898q(xh5.m208771s("/contracts/cancel")).m185893l(utc0.create(Network.JSON, contractIds.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: F */
    public static stc0 m29567F() {
        return qib0.f154693H.auth().m185898q(xh5.m208771s("/contracts/query")).m185893l(utc0.create(Network.JSON, "")).m185883b();
    }

    /* JADX INFO: renamed from: G */
    public static List m29568G(PaymentApi paymentApi, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return null;
        }
        List<GooglePlayOrders> list = gPResult.data.googlePlayOrders;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.m87488d(((GooglePlayOrders) obj).status, paymentApi.STATUS_PROCESSED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public static stc0 m29569H(PaymentParam paymentParam, PaymentParam paymentParam2) {
        return qib0.f154693H.auth().m185898q(xh5.m208771s(paymentParam.url)).m185893l(utc0.create(Network.JSON, paymentParam2.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: I */
    public static stc0 m29570I(String str, GPTransaction gPTransaction) {
        return qib0.f154693H.auth().m185898q(xh5.m208771s(str)).m185893l(utc0.create(Network.JSON, gPTransaction.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: J */
    public static C22306c m29571J(PaymentApi paymentApi, int i, GPTransaction gPTransaction, GooglePlayOrders googlePlayOrders, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return C22306c.just(PaymentResultStatus.failed);
        }
        if (!gPResult.data.googlePlayOrders.isEmpty()) {
            List<GooglePlayOrders> list = gPResult.data.googlePlayOrders;
            list.getClass();
            GooglePlayOrders googlePlayOrders2 = (GooglePlayOrders) CollectionsKt.firstOrNull((List) list);
            if (!Intrinsics.m87488d(googlePlayOrders2 != null ? googlePlayOrders2.status : null, paymentApi.STATUS_PROCESSED)) {
                return i < 5 ? paymentApi.m29585U(gPTransaction, googlePlayOrders, i + 1) : C22306c.just(PaymentResultStatus.failed);
            }
        }
        return C22306c.just(PaymentResultStatus.succeed);
    }

    /* JADX INFO: renamed from: K */
    public static C22306c m29572K(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static ContractEnvelope m29573L(PaymentApi paymentApi, String str, ContractEnvelope contractEnvelope) {
        contractEnvelope.getClass();
        ArrayList<Contract> arrayListM221515e = paymentApi.subscriptions.m221515e();
        if (contractEnvelope.meta.code == 200) {
            arrayListM221515e.getClass();
            Iterator<Contract> it = arrayListM221515e.iterator();
            it.getClass();
            Contract contract = null;
            while (it.hasNext()) {
                Contract next = it.next();
                next.getClass();
                Contract contract2 = next;
                if (Intrinsics.m87488d(contract2.f38735id, str)) {
                    contract = contract2;
                }
            }
            if (contract != null) {
                arrayListM221515e.remove(contract);
            }
            paymentApi.subscriptions.onNext(arrayListM221515e);
        }
        return contractEnvelope;
    }

    /* JADX INFO: renamed from: M */
    public static ContractEnvelope m29574M(Function1 function1, Object obj) {
        return (ContractEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static stc0 m29575N(String str, GPTransaction gPTransaction) {
        return qib0.f154693H.auth().m185898q(xh5.m208771s(str)).m185893l(utc0.create(Network.JSON, gPTransaction.toJson())).m185883b();
    }

    /* JADX INFO: renamed from: O */
    public static void m29576O(Throwable th) {
        C22306c.just(PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: P */
    public static List m29577P(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static List m29578x(PaymentApi paymentApi, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return null;
        }
        List<GooglePlayOrders> list = gPResult.data.googlePlayOrders;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.m87488d(((GooglePlayOrders) obj).status, paymentApi.STATUS_PROCESSED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static stc0 m29579y(String str) {
        return qib0.f154693H.auth().m185898q(xh5.m208771s(str)).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: z */
    public static List m29580z(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final C22306c<ContractEnvelope> m29581Q(@NotNull final String id) {
        id.getClass();
        final ContractIds contractIdsNew_ = ContractIds.new_();
        contractIdsNew_.ids.add(id);
        C22306c<R> c22306cCompose = new ka20(new v9j() { // from class: l.tc60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29566E(contractIdsNew_);
            }
        }, ContractEnvelope.JSON_ADAPTER).compose(mkd0.m154951C());
        final Function1 function1 = new Function1() { // from class: l.uc60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m29573L(this.f175799a, id, (ContractEnvelope) obj);
            }
        };
        C22306c<ContractEnvelope> map = c22306cCompose.map(new w9j() { // from class: l.vc60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PaymentApi.m29574M(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: R */
    public final void m29582R() {
        this.subscriptions.onNext(null);
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final C22306c<ArrayList<Contract>> m29583S() {
        if (this.subscriptions.m221515e() == null) {
            m29584T();
        }
        return this.subscriptions;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final C22306c<roj0> m29584T() {
        C22306c<roj0> c22306cMo97528z5 = qib0.f154714c0.mo97528z5(new v9j() { // from class: l.pc60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29567F();
            }
        }, this.subscriptions);
        c22306cMo97528z5.getClass();
        return c22306cMo97528z5;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final C22306c<PaymentResultStatus> m29585U(@NotNull final GPTransaction gpTransaction, @NotNull final GooglePlayOrders orders, final int times) {
        gpTransaction.getClass();
        orders.getClass();
        if (Intrinsics.m87488d(orders.status, this.STATUS_PROCESSED)) {
            C22306c<PaymentResultStatus> c22306cJust = C22306c.just(PaymentResultStatus.succeed);
            c22306cJust.getClass();
            return c22306cJust;
        }
        m29591a0(gpTransaction);
        final String str = "/googleplay/orders/" + orders.transactionId;
        C22306c c22306cDelay = new ka20(new v9j() { // from class: l.dd60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29579y(str);
            }
        }, GPResult.JSON_ADAPTER).doOnError(new e30() { // from class: l.ed60
            @Override // p149l.e30
            public final void call(Object obj) {
                PaymentApi.m29576O((Throwable) obj);
            }
        }).delay(1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: l.fd60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m29571J(this.f97011a, times, gpTransaction, orders, (GPResult) obj);
            }
        };
        C22306c<PaymentResultStatus> c22306cSwitchMap = c22306cDelay.switchMap(new w9j() { // from class: l.gd60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PaymentApi.m29572K(function1, obj);
            }
        });
        c22306cSwitchMap.getClass();
        return c22306cSwitchMap;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final C22306c<OrderData> m29586V(@NotNull final PaymentParam paymentParam) {
        paymentParam.getClass();
        final PaymentParam paymentParamMo223809clone = paymentParam.mo223809clone();
        paymentParamMo223809clone.getClass();
        C22306c c22306cCompose = new ka20(new v9j() { // from class: l.cd60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29569H(paymentParam, paymentParamMo223809clone);
            }
        }, OrderData.JSON_ADAPTER).compose(mkd0.m154951C());
        c22306cCompose.getClass();
        return c22306cCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final C22306c<List<GooglePlayOrders>> m29587W(@NotNull final GPTransaction gpTransaction, @NotNull final String url) {
        gpTransaction.getClass();
        url.getClass();
        m29591a0(gpTransaction);
        ka20 ka20Var = new ka20(new v9j() { // from class: l.zc60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29570I(url, gpTransaction);
            }
        }, GPResult.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.ad60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m29568G(this.f68913a, (GPResult) obj);
            }
        };
        C22306c map = ka20Var.map(new w9j() { // from class: l.bd60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PaymentApi.m29580z(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final C22306c<List<GooglePlayOrders>> m29588X(@NotNull final GPTransaction gpTransaction, @NotNull final String url) {
        gpTransaction.getClass();
        url.getClass();
        m29591a0(gpTransaction);
        ka20 ka20Var = new ka20(new v9j() { // from class: l.qc60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29575N(url, gpTransaction);
            }
        }, GPResult.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.rc60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m29578x(this.f158742a, (GPResult) obj);
            }
        };
        C22306c map = ka20Var.map(new w9j() { // from class: l.sc60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PaymentApi.m29577P(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final C22306c<Order> m29589Y() {
        return this.resultSub;
    }

    /* JADX INFO: renamed from: Z */
    public final void m29590Z(@NotNull Order order) {
        order.getClass();
        this.resultSub.onNext(order);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m29591a0(final GPTransaction gpTransaction) {
        new Function0() { // from class: l.hd60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentApi.m29565D(gpTransaction);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final C22306c<PaymentResultStatus> m29592b0(@NotNull final PaymentParam paymentParam) {
        paymentParam.getClass();
        ka20 ka20Var = new ka20(new v9j() { // from class: l.wc60
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m29564C(paymentParam);
            }
        }, OrderData.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.xc60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m29563B((OrderData) obj);
            }
        };
        C22306c<PaymentResultStatus> c22306cCompose = ka20Var.map(new w9j() { // from class: l.yc60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PaymentApi.m29562A(function1, obj);
            }
        }).compose(mkd0.m154951C());
        c22306cCompose.getClass();
        return c22306cCompose;
    }
}
