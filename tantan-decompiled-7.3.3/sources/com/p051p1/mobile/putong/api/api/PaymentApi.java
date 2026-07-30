package com.p051p1.mobile.putong.api.api;

import com.clevertap.android.sdk.Constants;
import com.immomo.hdata.android.MDevice;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.ContractEnvelope;
import com.p051p1.mobile.putong.data.ContractIds;
import com.p051p1.mobile.putong.data.GPResult;
import com.p051p1.mobile.putong.data.GPTransaction;
import com.p051p1.mobile.putong.data.GooglePlayOrders;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.Order;
import com.p051p1.mobile.putong.data.OrderData;
import com.p051p1.mobile.putong.data.PaymentParam;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.jxd0;
import p153l.p7f;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.qzd;
import p153l.r8f0;
import p153l.si20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.x1d0;
import p153l.xi5;
import p153l.y20;
import p153l.z1d0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001cJ\r\u0010#\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0003J'\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010$j\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0\u000b¢\u0006\u0004\b'\u0010\u0016J\u001b\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000b2\u0006\u0010(\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R.\u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020%\u0018\u00010$j\n\u0012\u0004\u0012\u00020%\u0018\u0001`&0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u000b8F¢\u0006\u0006\u001a\u0004\b@\u0010\u0016¨\u0006D"}, m88121d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi;", "Ll/xi5;", "<init>", "()V", "Lcom/p1/mobile/putong/data/GPTransaction;", "gpTransaction", "", "a0", "(Lcom/p1/mobile/putong/data/GPTransaction;)V", "Lcom/p1/mobile/putong/data/PaymentParam;", "paymentParam", "Lrx/c;", "Lcom/p1/mobile/putong/data/OrderData;", p7f.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/p1/mobile/putong/data/PaymentParam;)Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "b0", "Lcom/p1/mobile/putong/data/Order;", "order", "Z", "(Lcom/p1/mobile/putong/data/Order;)V", "Y", "()Lrx/c;", "", "url", "", "Lcom/p1/mobile/putong/data/GooglePlayOrders;", "W", "(Lcom/p1/mobile/putong/data/GPTransaction;Ljava/lang/String;)Lrx/c;", "orders", "", "times", "U", "(Lcom/p1/mobile/putong/data/GPTransaction;Lcom/p1/mobile/putong/data/GooglePlayOrders;I)Lrx/c;", "X", "R", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/data/Contract;", "Lkotlin/collections/ArrayList;", p7f.LATITUDE_SOUTH, "id", "Lcom/p1/mobile/putong/data/ContractEnvelope;", "Q", "(Ljava/lang/String;)Lrx/c;", "a", "Ljava/lang/String;", "STATUS_PROCESSED", "Ll/jxd0;", "b", "Ll/jxd0;", "retryRestore", "Ll/vxd0;", "c", "Ll/vxd0;", "retryRestoreCount", "Lrx/subjects/b;", Constants.INAPP_DATA_TAG, "Lrx/subjects/b;", "resultSub", "Lrx/subjects/a;", "e", "Lrx/subjects/a;", SchemeKey.subscriptions, "Ll/uxj0;", p7f.GPS_DIRECTION_TRUE, "contracts", "PaymentResultStatus", "SignResultStatus", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PaymentApi extends xi5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String STATUS_PROCESSED = "processed";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public jxd0 retryRestore = new jxd0("retry_restore" + uqb0.f180397c0.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public vxd0 retryRestoreCount = new vxd0("retry_restore_count" + uqb0.f180397c0.userId(), 0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C22508b<Order> resultSub;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C22507a<ArrayList<Contract>> subscriptions;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", StateEvent.ProcessResult.SUCCEED, "failed", "subscriptionChanged", "pending", "toSigning", BundleStatus.userCancel, "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum PaymentResultStatus {
        succeed,
        failed,
        subscriptionChanged,
        pending,
        toSigning,
        userCancel;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<PaymentResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/api/api/PaymentApi$SignResultStatus;", "", "<init>", "(Ljava/lang/String;I)V", StateEvent.ProcessResult.SUCCEED, "failed", "signing", "pending", "toSigning", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public enum SignResultStatus {
        succeed,
        failed,
        signing,
        pending,
        toSigning;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

        @NotNull
        public static EnumEntries<SignResultStatus> getEntries() {
            return $ENTRIES;
        }
    }

    public PaymentApi() {
        C22508b<Order> c22508bM222767b = C22508b.m222767b();
        c22508bM222767b.getClass();
        this.resultSub = c22508bM222767b;
        C22507a<ArrayList<Contract>> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.subscriptions = c22507aM222758b;
    }

    /* JADX INFO: renamed from: A */
    public static PaymentResultStatus m30560A(Function1 function1, Object obj) {
        return (PaymentResultStatus) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static PaymentResultStatus m30561B(OrderData orderData) {
        orderData.getClass();
        return TEnum.equals(orderData.data.orderStatus, "success") ? PaymentResultStatus.succeed : PaymentResultStatus.failed;
    }

    /* JADX INFO: renamed from: C */
    public static x1d0 m30562C(PaymentParam paymentParam) {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s(paymentParam.url)).m209038l(z1d0.create(Network.JSON, paymentParam.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: D */
    public static Unit m30563D(GPTransaction gPTransaction) {
        try {
            String mMuidV3 = MDevice.getMMuidV3(App.f16088e);
            if (mMuidV3 == null || mMuidV3.length() == 0) {
                gPTransaction.mmuid = MDevice.getmmuid(App.f16088e, qzd.m178768a());
            } else {
                gPTransaction.mmuid = mMuidV3;
            }
            gPTransaction.smid = r8f0.m180187f().m180190g();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static x1d0 m30564E(ContractIds contractIds) {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s("/contracts/cancel")).m209038l(z1d0.create(Network.JSON, contractIds.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: F */
    public static x1d0 m30565F() {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s("/contracts/query")).m209038l(z1d0.create(Network.JSON, "")).m209028b();
    }

    /* JADX INFO: renamed from: G */
    public static List m30566G(PaymentApi paymentApi, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return null;
        }
        List<GooglePlayOrders> list = gPResult.data.googlePlayOrders;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.m88377d(((GooglePlayOrders) obj).status, paymentApi.STATUS_PROCESSED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public static x1d0 m30567H(PaymentParam paymentParam, PaymentParam paymentParam2) {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s(paymentParam.url)).m209038l(z1d0.create(Network.JSON, paymentParam2.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: I */
    public static x1d0 m30568I(String str, GPTransaction gPTransaction) {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s(str)).m209038l(z1d0.create(Network.JSON, gPTransaction.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: J */
    public static C22421c m30569J(PaymentApi paymentApi, int i, GPTransaction gPTransaction, GooglePlayOrders googlePlayOrders, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return C22421c.just(PaymentResultStatus.failed);
        }
        if (!gPResult.data.googlePlayOrders.isEmpty()) {
            List<GooglePlayOrders> list = gPResult.data.googlePlayOrders;
            list.getClass();
            GooglePlayOrders googlePlayOrders2 = (GooglePlayOrders) CollectionsKt.firstOrNull((List) list);
            if (!Intrinsics.m88377d(googlePlayOrders2 != null ? googlePlayOrders2.status : null, paymentApi.STATUS_PROCESSED)) {
                return i < 5 ? paymentApi.m30583U(gPTransaction, googlePlayOrders, i + 1) : C22421c.just(PaymentResultStatus.failed);
            }
        }
        return C22421c.just(PaymentResultStatus.succeed);
    }

    /* JADX INFO: renamed from: K */
    public static C22421c m30570K(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static ContractEnvelope m30571L(PaymentApi paymentApi, String str, ContractEnvelope contractEnvelope) {
        contractEnvelope.getClass();
        ArrayList<Contract> arrayListM222761e = paymentApi.subscriptions.m222761e();
        if (contractEnvelope.meta.code == 200) {
            arrayListM222761e.getClass();
            Iterator<Contract> it = arrayListM222761e.iterator();
            it.getClass();
            Contract contract = null;
            while (it.hasNext()) {
                Contract next = it.next();
                next.getClass();
                Contract contract2 = next;
                if (Intrinsics.m88377d(contract2.f39583id, str)) {
                    contract = contract2;
                }
            }
            if (contract != null) {
                arrayListM222761e.remove(contract);
            }
            paymentApi.subscriptions.onNext(arrayListM222761e);
        }
        return contractEnvelope;
    }

    /* JADX INFO: renamed from: M */
    public static ContractEnvelope m30572M(Function1 function1, Object obj) {
        return (ContractEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static x1d0 m30573N(String str, GPTransaction gPTransaction) {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s(str)).m209038l(z1d0.create(Network.JSON, gPTransaction.toJson())).m209028b();
    }

    /* JADX INFO: renamed from: O */
    public static void m30574O(Throwable th) {
        C22421c.just(PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: P */
    public static List m30575P(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static List m30576x(PaymentApi paymentApi, GPResult gPResult) {
        gPResult.getClass();
        Meta meta = gPResult.meta;
        if (meta.code != 200 || meta.subCode != 0) {
            return null;
        }
        List<GooglePlayOrders> list = gPResult.data.googlePlayOrders;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.m88377d(((GooglePlayOrders) obj).status, paymentApi.STATUS_PROCESSED)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static x1d0 m30577y(String str) {
        return uqb0.f180376H.auth().m209043q(xi5.m211117s(str)).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: z */
    public static List m30578z(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final C22421c<ContractEnvelope> m30579Q(@NotNull final String id) {
        id.getClass();
        final ContractIds contractIdsNew_ = ContractIds.new_();
        contractIdsNew_.ids.add(id);
        C22421c<R> c22421cCompose = new si20(new pcj() { // from class: l.yk60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30564E(contractIdsNew_);
            }
        }, ContractEnvelope.JSON_ADAPTER).compose(psd0.m173592C());
        final Function1 function1 = new Function1() { // from class: l.zk60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m30571L(this.f204745a, id, (ContractEnvelope) obj);
            }
        };
        C22421c<ContractEnvelope> map = c22421cCompose.map(new qcj() { // from class: l.al60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PaymentApi.m30572M(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: R */
    public final void m30580R() {
        this.subscriptions.onNext(null);
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final C22421c<ArrayList<Contract>> m30581S() {
        if (this.subscriptions.m222761e() == null) {
            m30582T();
        }
        return this.subscriptions;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final C22421c<uxj0> m30582T() {
        C22421c<uxj0> c22421cMo105317z5 = uqb0.f180397c0.mo105317z5(new pcj() { // from class: l.uk60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30565F();
            }
        }, this.subscriptions);
        c22421cMo105317z5.getClass();
        return c22421cMo105317z5;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final C22421c<PaymentResultStatus> m30583U(@NotNull final GPTransaction gpTransaction, @NotNull final GooglePlayOrders orders, final int times) {
        gpTransaction.getClass();
        orders.getClass();
        if (Intrinsics.m88377d(orders.status, this.STATUS_PROCESSED)) {
            C22421c<PaymentResultStatus> c22421cJust = C22421c.just(PaymentResultStatus.succeed);
            c22421cJust.getClass();
            return c22421cJust;
        }
        m30589a0(gpTransaction);
        final String str = "/googleplay/orders/" + orders.transactionId;
        C22421c c22421cDelay = new si20(new pcj() { // from class: l.il60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30577y(str);
            }
        }, GPResult.JSON_ADAPTER).doOnError(new y20() { // from class: l.jl60
            @Override // p153l.y20
            public final void call(Object obj) {
                PaymentApi.m30574O((Throwable) obj);
            }
        }).delay(1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: l.kl60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m30569J(this.f127330a, times, gpTransaction, orders, (GPResult) obj);
            }
        };
        C22421c<PaymentResultStatus> c22421cSwitchMap = c22421cDelay.switchMap(new qcj() { // from class: l.ll60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PaymentApi.m30570K(function1, obj);
            }
        });
        c22421cSwitchMap.getClass();
        return c22421cSwitchMap;
    }

    @NotNull
    /* JADX INFO: renamed from: V */
    public final C22421c<OrderData> m30584V(@NotNull final PaymentParam paymentParam) {
        paymentParam.getClass();
        final PaymentParam paymentParamMo225055clone = paymentParam.mo225055clone();
        paymentParamMo225055clone.getClass();
        C22421c c22421cCompose = new si20(new pcj() { // from class: l.hl60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30567H(paymentParam, paymentParamMo225055clone);
            }
        }, OrderData.JSON_ADAPTER).compose(psd0.m173592C());
        c22421cCompose.getClass();
        return c22421cCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final C22421c<List<GooglePlayOrders>> m30585W(@NotNull final GPTransaction gpTransaction, @NotNull final String url) {
        gpTransaction.getClass();
        url.getClass();
        m30589a0(gpTransaction);
        si20 si20Var = new si20(new pcj() { // from class: l.el60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30568I(url, gpTransaction);
            }
        }, GPResult.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.fl60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m30566G(this.f99623a, (GPResult) obj);
            }
        };
        C22421c map = si20Var.map(new qcj() { // from class: l.gl60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PaymentApi.m30578z(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final C22421c<List<GooglePlayOrders>> m30586X(@NotNull final GPTransaction gpTransaction, @NotNull final String url) {
        gpTransaction.getClass();
        url.getClass();
        m30589a0(gpTransaction);
        si20 si20Var = new si20(new pcj() { // from class: l.vk60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30573N(url, gpTransaction);
            }
        }, GPResult.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.wk60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m30576x(this.f189531a, (GPResult) obj);
            }
        };
        C22421c map = si20Var.map(new qcj() { // from class: l.xk60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PaymentApi.m30575P(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final C22421c<Order> m30587Y() {
        return this.resultSub;
    }

    /* JADX INFO: renamed from: Z */
    public final void m30588Z(@NotNull Order order) {
        order.getClass();
        this.resultSub.onNext(order);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m30589a0(final GPTransaction gpTransaction) {
        new Function0() { // from class: l.ml60
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentApi.m30563D(gpTransaction);
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final C22421c<PaymentResultStatus> m30590b0(@NotNull final PaymentParam paymentParam) {
        paymentParam.getClass();
        si20 si20Var = new si20(new pcj() { // from class: l.bl60
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return PaymentApi.m30562C(paymentParam);
            }
        }, OrderData.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.cl60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentApi.m30561B((OrderData) obj);
            }
        };
        C22421c<PaymentResultStatus> c22421cCompose = si20Var.map(new qcj() { // from class: l.dl60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PaymentApi.m30560A(function1, obj);
            }
        }).compose(psd0.m173592C());
        c22421cCompose.getClass();
        return c22421cCompose;
    }
}
