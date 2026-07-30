package p003l;

import android.text.TextUtils;
import android.util.Pair;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a;
import com.android.billingclient.api.c;
import com.android.billingclient.api.d;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.google.common.collect.ImmutableList;
import com.p000p1.mobile.putong.core.data.ChatInterruptStage;
import com.p000p1.mobile.putong.core.data.GPPurchaseData;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.PaymentApi;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.GPAffiliateTransaction;
import com.p1.mobile.putong.data.GPTransaction;
import com.p1.mobile.putong.data.GooglePlayOrders;
import com.p1.mobile.putong.data.Order;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
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
import l.d30;
import l.e30;
import l.faj;
import l.mkd0;
import l.qcb0;
import l.qib0;
import l.sz5;
import l.tz5;
import l.vnb0;
import l.vwb;
import l.w9j;
import l.wd90;
import l.x9j;
import l.z3g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010!\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u001e0\u00152\u0006\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0018\u00010\u001e0\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b#\u0010$J)\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b%\u0010$J9\u0010,\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\b2\u0006\u0010(\u001a\u00020'2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010)2\u0006\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Ll/vro;", "Ll/aqo;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/android/billingclient/api/a;", "client", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/android/billingclient/api/a;)V", "", "product", "type", "", "g0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/android/billingclient/api/c$c;", "updateParams", "oldProduct", "r0", "(Ljava/lang/String;Lcom/android/billingclient/api/c$c;Ljava/lang/String;Ljava/lang/String;)V", "Ll/d30;", "gpOrderSuccessTrack", "Lrx/c;", "Lcom/p1/mobile/putong/api/api/PaymentApi$PaymentResultStatus;", "c", "(Ljava/lang/String;Ll/d30;)Lrx/c;", "b", "(Ljava/lang/String;Ljava/lang/String;Ll/d30;)Lrx/c;", "h0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "productType", "", "Landroid/util/Pair;", "Lcom/android/billingclient/api/Purchase;", "d0", "(Ljava/lang/String;)Lrx/c;", "b0", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "t0", "purchaseToken", "", "fromPay", "Lrx/subjects/a;", "subject", "isRestore", "a0", "(Ljava/lang/String;ZLrx/subjects/a;Z)V", "a", "()Lrx/c;", "pay_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public final class vro extends aqo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vro(@NotNull Act act, @NotNull a aVar) {
        super(act, aVar);
        act.getClass();
        aVar.getClass();
    }

    /* JADX INFO: renamed from: A */
    public static void m10272A(vro vroVar, String str, String str2, final String str3, d dVar, List list) {
        dVar.getClass();
        list.getClass();
        if (dVar.b() == 0) {
            List list2 = list;
            if (!vwb.J(list2)) {
                Purchase purchase = (Purchase) vwb.r(list2, new w9j() { // from class: l.bro
                    public final Object call(Object obj) {
                        return vro.m10307i0(str3, (Purchase) obj);
                    }
                });
                vroVar.m10341r0(str, NullChecker.a(purchase) ? c.c.a().b(purchase.e()).d(2).a() : null, str2, str3);
                return;
            }
        }
        vroVar.m10341r0(str, null, str2, str3);
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m10273A0(vro vroVar, Throwable th) {
        th.getClass();
        vroVar.m5506l("error", th.getMessage(), false, vroVar.type);
        vroVar.m5507m();
    }

    /* JADX INFO: renamed from: B */
    public static List m10274B(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B0 */
    public static final rx.c m10275B0(vro vroVar, Order order, GPTransaction gPTransaction, List list) {
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
                    vroVar.m5506l("8-2-2", str2, false, str3);
                    JsonAdapter<GPPurchaseData> jsonAdapter = GPPurchaseData.JSON_ADAPTER;
                    GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
                    if (gPAffiliateTransaction == null || (str = gPAffiliateTransaction.purchaseData) == null) {
                        str = "";
                    }
                    String str4 = ((GPPurchaseData) jsonAdapter.parse(str)).purchaseToken;
                    str4.getClass();
                    vroVar.m5502f(str4, vroVar.type);
                }
            } catch (IOException e) {
                CrashHelper.c(e);
                vroVar.m5506l("error", e.getMessage(), false, vroVar.type);
            }
        }
        if (list != null) {
            List<GooglePlayOrders> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GooglePlayOrders googlePlayOrders : list2) {
                PaymentApi paymentApi = qib0.T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.U(gPTransaction, googlePlayOrders, 0));
            }
        } else {
            arrayList = null;
        }
        return (arrayList == null || arrayList.isEmpty()) ? rx.c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : mkd0.p(arrayList, new faj() { // from class: l.aro
            public final Object call(Object[] objArr) {
                return vro.m10277C0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static final rx.c m10279D0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: E0 */
    public static final rx.c m10281E0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? rx.c.just(PaymentApi.PaymentResultStatus.failed) : rx.c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final rx.c m10283F0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G */
    public static List m10284G(Function2 function2, Object obj, Object obj2) {
        return (List) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: H */
    public static rx.c m10285H(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    public static rx.c m10289L(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    public static rx.c m10291N(final vro vroVar, d30 d30Var, String str, final Order order) {
        order.getClass();
        String json = order.toJson();
        String str2 = vroVar.type;
        vroVar.type = str2;
        Unit unit = Unit.INSTANCE;
        vroVar.m5506l("8", json, false, str2);
        vroVar.m5505k(order, null);
        if ((TEnum.equals(order.orderStatus, "stock") || TEnum.equals(order.orderStatus, "purchased")) && d30Var != null) {
            d30Var.call();
        }
        if (TEnum.equals(order.orderStatus, "stock")) {
            String str3 = vroVar.type;
            vroVar.type = str3;
            vroVar.m5506l("8-1-1", "有相同的商品未被确认 需进行订单补偿", false, str3);
            return vroVar.m10342t0(vroVar.type, str);
        }
        if (TEnum.equals(order.orderStatus, "purchased")) {
            String str4 = vroVar.type;
            vroVar.type = str4;
            vroVar.m5506l("8-2-1", "当前订单交易正常，通知后端进行订单校验，下发权益", false, str4);
            final GPTransaction gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.source = "pay";
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
            rx.c cVarDoOnError = qib0.T.W(gPTransactionNew_, vroVar.URL_PAY).doOnError(new e30() { // from class: l.sro
                public final void call(Object obj) {
                    vro.m10273A0(this.f7455a, (Throwable) obj);
                }
            });
            final Function1 function1 = new Function1() { // from class: l.tro
                public final Object invoke(Object obj) {
                    return vro.m10275B0(this.f7616a, order, gPTransactionNew_, (List) obj);
                }
            };
            rx.c cVarCompose = cVarDoOnError.switchMap(new w9j() { // from class: l.uro
                public final Object call(Object obj) {
                    return vro.m10279D0(function1, obj);
                }
            }).compose(mkd0.C());
            final Function1 function2 = new Function1() { // from class: l.jqo
                public final Object invoke(Object obj) {
                    return vro.m10281E0((Object[]) obj);
                }
            };
            return cVarCompose.switchMap(new w9j() { // from class: l.kqo
                public final Object call(Object obj) {
                    return vro.m10283F0(function2, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, "userCancel")) {
            vroVar.m5506l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
            vroVar.m5507m();
            return rx.c.just(PaymentApi.PaymentResultStatus.userCancel);
        }
        vroVar.m5506l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
        vroVar.m5507m();
        return rx.c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: O */
    public static rx.c m10292O(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P */
    public static void m10293P(vro vroVar, boolean z, boolean z2, rx.subjects.a aVar, d dVar, String str) {
        dVar.getClass();
        vroVar.m5506l("8-2-4", "非订阅型商品 consumeAsync 结果 response is success -> " + (dVar.b() == 0), z, vroVar.type);
        if (dVar.b() != 0) {
            StringBuilder sb = new StringBuilder("Google BillingClient consume failed, from = ");
            sb.append(z2 ? "pay, errorCode = " : "restore, errorCode = ");
            sb.append(dVar.b());
            sb.append(", message = ");
            sb.append(dVar.a());
            vroVar.m5506l("error", "consumeAsync error -> " + ((Object) sb), z, vroVar.type);
            CrashHelper.c(new RuntimeException(sb.toString()));
            vroVar.m5507m();
        }
        if (aVar != null) {
            aVar.onNext(PaymentApi.PaymentResultStatus.succeed);
        }
    }

    /* JADX INFO: renamed from: S */
    public static rx.c m10296S(final vro vroVar, d30 d30Var, final String str, final Order order) {
        order.getClass();
        String json = order.toJson();
        String str2 = vroVar.type;
        vroVar.type = str2;
        Unit unit = Unit.INSTANCE;
        vroVar.m5506l("8", json, false, str2);
        vroVar.m5505k(order, null);
        if ((!TEnum.equals(order.orderStatus, ChatInterruptStage.locked) || TEnum.equals(order.orderStatus, "purchased")) && d30Var != null) {
            d30Var.call();
        }
        if (TEnum.equals(order.orderStatus, ChatInterruptStage.locked) && !vroVar.tryConsumed) {
            vroVar.tryConsumed = true;
            String str3 = vroVar.type;
            vroVar.type = str3;
            vroVar.m5506l("8-1-1", "有相同的商品未被确认 需进行订单补偿", false, str3);
            rx.c<PaymentApi.PaymentResultStatus> cVarM10342t0 = vroVar.m10342t0(vroVar.type, str);
            final Function1 function1 = new Function1() { // from class: l.lqo
                public final Object invoke(Object obj) {
                    return vro.m10308j0(this.f6190a, str, (PaymentApi.PaymentResultStatus) obj);
                }
            };
            return cVarM10342t0.switchMap(new w9j() { // from class: l.mqo
                public final Object call(Object obj) {
                    return vro.m10309k0(function1, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, "purchased")) {
            String str4 = vroVar.type;
            vroVar.type = str4;
            vroVar.m5506l("8-2-1", "当前订单交易正常，通知后端进行订单校验，下发权益", false, str4);
            final GPTransaction gPTransactionNew_ = GPTransaction.new_();
            gPTransactionNew_.source = "pay";
            gPTransactionNew_.affiliateTransactions.add(order.affiliateTransaction);
            rx.c cVarDoOnError = qib0.T.W(gPTransactionNew_, vroVar.URL_PAY).doOnError(new e30() { // from class: l.nqo
                public final void call(Object obj) {
                    vro.m10310l0(this.f6554a, (Throwable) obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: l.oqo
                public final Object invoke(Object obj) {
                    return vro.m10311m0(this.f6741a, order, gPTransactionNew_, (List) obj);
                }
            };
            rx.c cVarCompose = cVarDoOnError.switchMap(new w9j() { // from class: l.pqo
                public final Object call(Object obj) {
                    return vro.m10315o0(function2, obj);
                }
            }).compose(mkd0.C());
            final Function1 function3 = new Function1() { // from class: l.qqo
                public final Object invoke(Object obj) {
                    return vro.m10317p0((Object[]) obj);
                }
            };
            return cVarCompose.switchMap(new w9j() { // from class: l.rqo
                public final Object call(Object obj) {
                    return vro.m10319q0(function3, obj);
                }
            });
        }
        if (TEnum.equals(order.orderStatus, "userCancel")) {
            vroVar.m5506l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
            vroVar.m5507m();
            return rx.c.just(PaymentApi.PaymentResultStatus.userCancel);
        }
        vroVar.m5506l("error", "order 状态异常  " + order.toJson(), false, vroVar.type);
        vroVar.m5507m();
        return rx.c.just(PaymentApi.PaymentResultStatus.failed);
    }

    /* JADX INFO: renamed from: U */
    public static List m10298U(final String str, final String str2, List list) {
        return vwb.n(list, new w9j() { // from class: l.jro
            public final Object call(Object obj) {
                return vro.m10304c0(str, str2, (Pair) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public static rx.c m10300W(final vro vroVar, final String str, final List list) {
        String string;
        String str2 = vroVar.TAG;
        List list2 = list;
        vwb.J(list2);
        if (list == null || (string = list.toString()) == null) {
            string = "purchase is null";
        }
        vroVar.m5506l("2", "订单补偿 订单 ".concat(string), true, null);
        if (vwb.J(list2)) {
            return rx.c.just(PaymentApi.PaymentResultStatus.failed);
        }
        final GPTransaction gPTransactionNew_ = GPTransaction.new_();
        gPTransactionNew_.source = "restore";
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null) {
                    GPAffiliateTransaction gPAffiliateTransactionNew_ = GPAffiliateTransaction.new_();
                    gPAffiliateTransactionNew_.purchaseData = ((Purchase) pair.second).b();
                    gPAffiliateTransactionNew_.signature = ((Purchase) pair.second).f();
                    gPTransactionNew_.affiliateTransactions.add(gPAffiliateTransactionNew_);
                }
            }
        }
        rx.c cVarDoOnError = qib0.T.X(gPTransactionNew_, vroVar.URL_RESTORE).doOnError(new e30() { // from class: l.uqo
            public final void call(Object obj) {
                vro.m10325u0(this.f7808a, list, str, (Throwable) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: l.vqo
            public final Object invoke(Object obj) {
                return vro.m10327v0(this.f8029a, list, gPTransactionNew_, (List) obj);
            }
        };
        rx.c cVarCompose = cVarDoOnError.switchMap(new w9j() { // from class: l.wqo
            public final Object call(Object obj) {
                return vro.m10331x0(function1, obj);
            }
        }).compose(mkd0.C());
        final Function1 function2 = new Function1() { // from class: l.xqo
            public final Object invoke(Object obj) {
                return vro.m10333y0((Object[]) obj);
            }
        };
        return cVarCompose.switchMap(new w9j() { // from class: l.yqo
            public final Object call(Object obj) {
                return vro.m10335z0(function2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public static final Boolean m10304c0(String str, String str2, Pair pair) {
        Purchase purchase;
        List listC;
        Purchase purchase2;
        List listC2;
        if (Intrinsics.d(str, "subs")) {
            if (pair == null || (purchase2 = (Purchase) pair.second) == null || (listC2 = purchase2.c()) == null) {
                return null;
            }
            return Boolean.valueOf(listC2.contains(f4k.INSTANCE.m6388a(str2).getFirst()));
        }
        if (pair == null || (purchase = (Purchase) pair.second) == null || (listC = purchase.c()) == null) {
            return null;
        }
        return Boolean.valueOf(listC.contains(str2));
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m10305e0(final vro vroVar, final String str, z3g0 z3g0Var, final List list, d dVar, List list2) {
        dVar.getClass();
        String str2 = vroVar.TAG;
        Objects.toString(dVar);
        if (dVar.b() == 0) {
            List list3 = list2;
            if (!vwb.J(list3)) {
                vwb.z(list3, new e30() { // from class: l.nro
                    public final void call(Object obj) {
                        vro.m10306f0(this.f6555a, list, str, (Purchase) obj);
                    }
                });
                z3g0Var.onNext(list);
                return;
            }
        }
        z3g0Var.onNext(list);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m10306f0(vro vroVar, List list, String str, Purchase purchase) {
        if (purchase != null) {
            String str2 = vroVar.TAG;
            purchase.toString();
            if (purchase.d() == 2 && TextUtils.isEmpty(purchase.a())) {
                return;
            }
            list.add(Pair.create(str, purchase));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final Boolean m10307i0(String str, Purchase purchase) {
        purchase.getClass();
        List listC = purchase.c();
        f4k f4kVar = f4k.INSTANCE;
        str.getClass();
        return Boolean.valueOf(listC.contains(f4kVar.m6388a(str).getFirst()));
    }

    /* JADX INFO: renamed from: j0 */
    public static final rx.c m10308j0(vro vroVar, String str, PaymentApi.PaymentResultStatus paymentResultStatus) {
        paymentResultStatus.getClass();
        return paymentResultStatus == PaymentApi.PaymentResultStatus.succeed ? vroVar.mo6514c(str, null) : rx.c.just(paymentResultStatus);
    }

    /* JADX INFO: renamed from: k0 */
    public static final rx.c m10309k0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m10310l0(vro vroVar, Throwable th) {
        th.getClass();
        vroVar.m5506l("error", th.getMessage(), false, vroVar.type);
        vroVar.m5507m();
    }

    /* JADX INFO: renamed from: m0 */
    public static final rx.c m10311m0(vro vroVar, Order order, GPTransaction gPTransaction, List list) {
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
                    vroVar.m5506l("8-2-2", str2, false, str3);
                    JsonAdapter<GPPurchaseData> jsonAdapter = GPPurchaseData.JSON_ADAPTER;
                    GPAffiliateTransaction gPAffiliateTransaction = order.affiliateTransaction;
                    if (gPAffiliateTransaction == null || (str = gPAffiliateTransaction.purchaseData) == null) {
                        str = "";
                    }
                    vroVar.m10336a0(((GPPurchaseData) jsonAdapter.parse(str)).purchaseToken, true, null, false);
                }
            } catch (IOException e) {
                CrashHelper.c(e);
                vroVar.m5506l("error", e.getMessage(), false, vroVar.type);
            }
        }
        if (list != null) {
            List<GooglePlayOrders> list2 = list;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (GooglePlayOrders googlePlayOrders : list2) {
                PaymentApi paymentApi = qib0.T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.U(gPTransaction, googlePlayOrders, 0));
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? rx.c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : mkd0.p(arrayList, new faj() { // from class: l.zqo
            public final Object call(Object[] objArr) {
                return vro.m10313n0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static final rx.c m10315o0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: p0 */
    public static final rx.c m10317p0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? rx.c.just(PaymentApi.PaymentResultStatus.failed) : rx.c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static final rx.c m10319q0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static List m10321s(List list, List list2) {
        return vwb.e(list, new List[]{list2});
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m10322s0(vro vroVar, String str, c cVar) {
        vroVar.m5506l("6", "启动购买流程，唤起Google Play 购买弹窗", false, str);
        vroVar.client.f(vroVar.act, cVar);
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m10325u0(vro vroVar, List list, String str, Throwable th) {
        th.getClass();
        vroVar.m5506l("error", "restore request " + th.getMessage(), true, null);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vroVar.m5507m();
            }
        }
        if (CoreModule.P().a().mo()) {
            Integer num = (Integer) qib0.T.c.get();
            if (str != null || num.intValue() <= 0) {
                return;
            }
            qib0.T.c.put(Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final rx.c m10327v0(vro vroVar, List list, GPTransaction gPTransaction, List list2) {
        Purchase purchase;
        ArrayList arrayList = null;
        vroVar.m5506l("3", "restore response size ->" + (list2 != null ? Integer.valueOf(list2.size()) : null), true, null);
        vroVar.m5504j();
        qib0.T.b.put(Boolean.FALSE);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null && (purchase = (Purchase) pair.second) != null) {
                    if (Intrinsics.d(pair.first, "subs")) {
                        String strE = purchase.e();
                        strE.getClass();
                        vroVar.m5502f(strE, (String) pair.first);
                    } else {
                        vroVar.m10336a0(purchase.e(), false, null, true);
                    }
                }
            }
        }
        if (list2 != null) {
            List<GooglePlayOrders> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (GooglePlayOrders googlePlayOrders : list3) {
                PaymentApi paymentApi = qib0.T;
                gPTransaction.getClass();
                arrayList.add(paymentApi.U(gPTransaction, googlePlayOrders, 0));
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? rx.c.just(new PaymentApi.PaymentResultStatus[]{PaymentApi.PaymentResultStatus.failed}) : mkd0.p(arrayList, new faj() { // from class: l.lro
            public final Object call(Object[] objArr) {
                return vro.m10329w0(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m10328w(final vro vroVar, final String str, final List list, final z3g0 z3g0Var) {
        z3g0Var.getClass();
        vroVar.client.i(vnb0.a().b(str).a(), new qcb0() { // from class: l.mro
            /* JADX INFO: renamed from: b */
            public final void m8259b(d dVar, List list2) {
                vro.m10305e0(this.f6421a, str, z3g0Var, list, dVar, list2);
            }
        });
    }

    /* JADX INFO: renamed from: x0 */
    public static final rx.c m10331x0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX INFO: renamed from: y0 */
    public static final rx.c m10333y0(Object[] objArr) {
        objArr.getClass();
        for (Object obj : ArraysKt.filterNotNull(objArr)) {
            if (obj != PaymentApi.PaymentResultStatus.succeed) {
                return obj != null ? rx.c.just(PaymentApi.PaymentResultStatus.failed) : rx.c.just(PaymentApi.PaymentResultStatus.succeed);
            }
        }
        obj = null;
        if (obj != null) {
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m10334z(final vro vroVar, final String str, String str2, c.c cVar, String str3, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, d dVar, List list) {
        Object next;
        String strC;
        dVar.getClass();
        list.getClass();
        if (dVar.b() != 0 || vwb.J(list)) {
            vroVar.m5506l("error", "productDetails query error", false, str);
            Order orderNew_ = Order.new_();
            orderNew_.orderStatus = BundleStatus.get("failed");
            qib0.T.Z(orderNew_);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            vroVar.m5506l("4", list.toString(), false, str);
            c.b.a aVarC = c.b.a().c(fVar);
            aVarC.getClass();
            if (Intrinsics.d(str2, "subs")) {
                List listE = fVar.e();
                String str4 = "";
                if (listE != null) {
                    Iterator it2 = listE.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        f.e eVar = (f.e) next;
                        if (Intrinsics.d(eVar.a(), objectRef.element)) {
                            String strB = eVar.b();
                            if (strB == null) {
                                strB = "";
                            }
                            String str5 = (String) objectRef2.element;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (Intrinsics.d(strB, str5)) {
                                break;
                            }
                        }
                    }
                    f.e eVar2 = (f.e) next;
                    if (eVar2 != null && (strC = eVar2.c()) != null) {
                        str4 = strC;
                    }
                }
                vroVar.m5506l("4-1", "设置订阅offer token ".concat(str4), false, str);
                aVarC.b(str4);
            }
            c.a aVarB = c.a().c(ImmutableList.of(aVarC.a())).b(CoreModule.H().userId());
            aVarB.getClass();
            if (cVar != null) {
                vroVar.m5506l("4-2", "查询订阅订单  oldProduct = " + str3, false, str);
                aVarB.d(cVar);
            }
            final c cVarA = aVarB.a();
            cVarA.getClass();
            PutongAct putongAct = vroVar.act;
            if (putongAct instanceof PutongAct) {
                putongAct.iap().r(new Runnable() { // from class: l.hro
                    @Override // java.lang.Runnable
                    public final void run() {
                        vro.m10322s0(this.f4955a, str, cVarA);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static final rx.c m10335z0(Function1 function1, Object obj) {
        return (rx.c) function1.invoke(obj);
    }

    @Override // p003l.ftl
    @NotNull
    /* JADX INFO: renamed from: a */
    public rx.c<PaymentApi.PaymentResultStatus> mo6512a() {
        return m10342t0(null, null);
    }

    /* JADX INFO: renamed from: a0 */
    public void m10336a0(@Nullable String purchaseToken, final boolean fromPay, @Nullable final rx.subjects.a<PaymentApi.PaymentResultStatus> subject, final boolean isRestore) {
        sz5.a aVarB = sz5.b();
        if (purchaseToken == null) {
            purchaseToken = "";
        }
        sz5 sz5VarA = aVarB.b(purchaseToken).a();
        sz5VarA.getClass();
        m5506l("8-2-3", "非订阅型商品 开始consumeAsync " + sz5VarA.a(), isRestore, this.type);
        this.client.b(sz5VarA, new tz5() { // from class: l.kro
            /* JADX INFO: renamed from: f */
            public final void m7635f(d dVar, String str) {
                vro.m10293P(this.f5703a, isRestore, fromPay, subject, dVar, str);
            }
        });
    }

    @Override // p003l.ftl
    @Nullable
    /* JADX INFO: renamed from: b */
    public rx.c<PaymentApi.PaymentResultStatus> mo6513b(@NotNull final String product, @Nullable String oldProduct, @Nullable final d30 gpOrderSuccessTrack) {
        product.getClass();
        this.type = "subs";
        Unit unit = Unit.INSTANCE;
        m5506l("1", "获取 BillingClient 对象", false, "subs");
        if (!NullChecker.a(this.client) || !this.client.e()) {
            m5506l("error", "client == null  或者连接google 服务失败", false, this.type);
            m5505k(null, "client == null");
            m5507m();
            return rx.c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str = this.type;
        this.type = str;
        m5506l("2", "连接google play 服务 成功", false, str);
        qib0.T.b.put(Boolean.TRUE);
        qib0.T.c.put(0);
        m10340h0(product, oldProduct, "subs");
        rx.c cVarFirst = qib0.T.Y().first();
        final Function1 function1 = new Function1() { // from class: l.ero
            public final Object invoke(Object obj) {
                return vro.m10291N(this.f4334a, gpOrderSuccessTrack, product, (Order) obj);
            }
        };
        return cVarFirst.switchMap(new w9j() { // from class: l.oro
            public final Object call(Object obj) {
                return vro.m10285H(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public rx.c<List<Pair<String, Purchase>>> m10337b0(@Nullable final String productType, @Nullable final String product) {
        if (!NullChecker.a(this.client)) {
            rx.c<List<Pair<String, Purchase>>> cVarJust = rx.c.just((Object) null);
            cVarJust.getClass();
            return cVarJust;
        }
        if (TextUtils.isEmpty(productType) || TextUtils.isEmpty(product)) {
            rx.c<List<Pair<String, Purchase>>> cVarM10338d0 = m10338d0("inapp");
            rx.c<List<Pair<String, Purchase>>> cVarM10338d1 = m10338d0("subs");
            final Function2 function2 = new Function2() { // from class: l.fro
                public final Object invoke(Object obj, Object obj2) {
                    return vro.m10321s((List) obj, (List) obj2);
                }
            };
            rx.c<List<Pair<String, Purchase>>> cVarR = mkd0.r(cVarM10338d0, cVarM10338d1, new x9j() { // from class: l.gro
                public final Object call(Object obj, Object obj2) {
                    return vro.m10284G(function2, obj, obj2);
                }
            });
            cVarR.getClass();
            return cVarR;
        }
        productType.getClass();
        rx.c<List<Pair<String, Purchase>>> cVarM10338d2 = m10338d0(productType);
        final Function1 function1 = new Function1() { // from class: l.cro
            public final Object invoke(Object obj) {
                return vro.m10298U(productType, product, (List) obj);
            }
        };
        rx.c<List<Pair<String, Purchase>>> map = cVarM10338d2.map(new w9j() { // from class: l.dro
            public final Object call(Object obj) {
                return vro.m10274B(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @Override // p003l.ftl
    @Nullable
    /* JADX INFO: renamed from: c */
    public rx.c<PaymentApi.PaymentResultStatus> mo6514c(@NotNull final String product, @Nullable final d30 gpOrderSuccessTrack) {
        product.getClass();
        this.type = "inapp";
        Unit unit = Unit.INSTANCE;
        m5506l("1", "获取 BillingClient 对象", false, "inapp");
        if (!NullChecker.a(this.client) || !this.client.e()) {
            m5506l("error", "client = null 或者连接google 服务失败", false, this.type);
            m5505k(null, "client = null");
            return rx.c.just(PaymentApi.PaymentResultStatus.failed);
        }
        String str = this.type;
        this.type = str;
        m5506l("2", "连接google play 服务 成功", false, str);
        qib0.T.b.put(Boolean.TRUE);
        qib0.T.c.put(0);
        m10339g0(product, "inapp");
        rx.c cVarY = qib0.T.Y();
        final Function1 function1 = new Function1() { // from class: l.iqo
            public final Object invoke(Object obj) {
                return vro.m10296S(this.f5196a, gpOrderSuccessTrack, product, (Order) obj);
            }
        };
        return cVarY.switchMap(new w9j() { // from class: l.tqo
            public final Object call(Object obj) {
                return vro.m10292O(function1, obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public rx.c<List<Pair<String, Purchase>>> m10338d0(@NotNull final String productType) {
        productType.getClass();
        final ArrayList arrayList = new ArrayList();
        if (NullChecker.a(this.client)) {
            rx.c<List<Pair<String, Purchase>>> cVarCreate = rx.c.create(new rx.c.a() { // from class: l.iro
                public final void call(Object obj) {
                    vro.m10328w(this.f5208a, productType, arrayList, (z3g0) obj);
                }
            });
            cVarCreate.getClass();
            return cVarCreate;
        }
        rx.c<List<Pair<String, Purchase>>> cVarJust = rx.c.just(arrayList);
        cVarJust.getClass();
        return cVarJust;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m10339g0(String product, String type) {
        m10340h0(product, null, type);
    }

    /* JADX INFO: renamed from: h0 */
    public void m10340h0(@NotNull final String product, @Nullable final String oldProduct, @NotNull final String type) {
        product.getClass();
        type.getClass();
        if (!TextUtils.isEmpty(oldProduct)) {
            f4k f4kVar = f4k.INSTANCE;
            if (!Intrinsics.d(f4kVar.m6388a(product).getFirst(), f4kVar.m6388a(oldProduct).getFirst())) {
                this.client.i(vnb0.a().b(type).a(), new qcb0() { // from class: l.rro
                    /* JADX INFO: renamed from: b */
                    public final void m9181b(d dVar, List list) {
                        vro.m10272A(this.f7235a, product, type, oldProduct, dVar, list);
                    }
                });
                return;
            }
        }
        m10341r0(product, null, type, oldProduct);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10341r0(String product, final c.c updateParams, final String type, final String oldProduct) {
        m5506l("3", "查询 product " + product + " 商品 详情 oldProduct " + oldProduct, false, type);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        if (Intrinsics.d(type, "subs")) {
            Triple<String, String, String> tripleM6388a = f4k.INSTANCE.m6388a(product);
            String str = (String) tripleM6388a.getFirst();
            String str2 = str != null ? str : "";
            objectRef.element = tripleM6388a.getSecond();
            objectRef2.element = tripleM6388a.getThird();
            product = str2;
        }
        g gVarA = g.a().b(ImmutableList.of(g.b.a().b(product).c(type).a())).a();
        gVarA.getClass();
        this.client.h(gVarA, new wd90() { // from class: l.sqo
            /* JADX INFO: renamed from: a */
            public final void m9475a(d dVar, List list) {
                vro.m10334z(this.f7441a, type, type, updateParams, oldProduct, objectRef, objectRef2, dVar, list);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: t0 */
    public rx.c<PaymentApi.PaymentResultStatus> m10342t0(@Nullable String type, @Nullable final String product) {
        rx.c<List<Pair<String, Purchase>>> cVarM10337b0 = m10337b0(type, product);
        final Function1 function1 = new Function1() { // from class: l.pro
            public final Object invoke(Object obj) {
                return vro.m10300W(this.f6914a, product, (List) obj);
            }
        };
        rx.c<PaymentApi.PaymentResultStatus> cVarSwitchMap = cVarM10337b0.switchMap(new w9j() { // from class: l.qro
            public final Object call(Object obj) {
                return vro.m10289L(function1, obj);
            }
        });
        cVarSwitchMap.getClass();
        return cVarSwitchMap;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Object[] m10277C0(Object[] objArr) {
        return objArr;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Object[] m10313n0(Object[] objArr) {
        return objArr;
    }

    /* JADX INFO: renamed from: w0 */
    public static final Object[] m10329w0(Object[] objArr) {
        return objArr;
    }
}
