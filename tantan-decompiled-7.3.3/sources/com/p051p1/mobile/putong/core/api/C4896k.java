package com.p051p1.mobile.putong.core.api;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4896k;
import com.p051p1.mobile.putong.core.data.H5MerchandiseData;
import com.p051p1.mobile.putong.core.data.H5MerchandiseEnvelope;
import com.p051p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p051p1.mobile.putong.core.data.H5PayOrderData;
import com.p051p1.mobile.putong.core.data.H5PayOrderDataEnvelope;
import com.p051p1.mobile.putong.core.data.H5PayOrderDataList;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.data.PaymentData;
import com.p051p1.mobile.putong.data.PaymentEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22508b;
import p153l.bkj0;
import p153l.dy6;
import p153l.fo0;
import p153l.gcg0;
import p153l.gta;
import p153l.jyb;
import p153l.pcj;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.xyd0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.k */
/* JADX INFO: loaded from: classes9.dex */
public class C4896k extends dy6 {

    /* JADX INFO: renamed from: T */
    public static PaymentData f20786T;

    /* JADX INFO: renamed from: U */
    public static int f20787U;

    /* JADX INFO: renamed from: V */
    public static ArrayList<H5PayOrderConfigData> f20788V = new ArrayList<>();

    /* JADX INFO: renamed from: R */
    public xyd0 f20789R;

    /* JADX INFO: renamed from: S */
    public C22508b<bkj0<Integer, Integer, String>> f20790S;

    public C4896k(C4883c c4883c) {
        super(c4883c);
        this.f20789R = new xyd0("h5_pay_order_key_value_" + uqb0.f180396b0.f170324a.userId(), new HashSet());
        this.f20790S = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: C3 */
    public static void m35163C3(boolean z) {
        f20787U = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: D3 */
    public static void m35164D3(String str) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ H5MerchandiseData m35167c3(H5MerchandiseData h5MerchandiseData) {
        return h5MerchandiseData != null ? h5MerchandiseData : H5MerchandiseData.new_();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ uxj0 m35169e3(PaymentEnvelope paymentEnvelope) {
        f20786T = paymentEnvelope.data;
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ uxj0 m35177m3(gcg0 gcg0Var, Notification notification) {
        PaymentData paymentData = f20786T;
        if (paymentData != null) {
            gcg0Var.m137019l(paymentData);
        } else {
            gcg0Var.m137019l(PaymentData.new_());
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ List m35178n3(List list) {
        return list.size() == 7 ? jyb.m147521m0(list, 6) : list;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ List m35180p3(H5PayOrderDataEnvelope h5PayOrderDataEnvelope) {
        List<H5PayOrderData> list = h5PayOrderDataEnvelope.data.orderList;
        return list != null ? list : H5PayOrderDataList.new_().orderList;
    }

    /* JADX INFO: renamed from: u3 */
    public static String m35182u3(String str) {
        return TextUtils.concat("https://m.tantanapp.com/monetization/codapay/?from=", str).toString();
    }

    /* JADX INFO: renamed from: y3 */
    public static String m35183y3(String str) {
        if (TextUtils.equals("liveGiftBarRechargeClick", str)) {
            return PaymentData.FROM_LIVE_RECHARGE;
        }
        if (TextUtils.equals("liveFastGiftClick", str)) {
            return "quick_gift";
        }
        if (TextUtils.equals("liveGiftBarGiftClick", str)) {
            return "live_gift";
        }
        return (TextUtils.equals(BLiveOperationClickAction.f45265h5, str) || TextUtils.isEmpty(str)) ? "H5" : PaymentData.FROM_LIVE_RECHARGE;
    }

    /* JADX INFO: renamed from: A3 */
    public String m35184A3(String str) {
        for (String str2 : this.f20789R.get()) {
            if (str2.contains(str)) {
                return str2.split("_")[2];
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: B3 */
    public void m35185B3() {
        f20786T = null;
    }

    /* JADX INFO: renamed from: r3 */
    public void m35186r3(String str, String str2) {
        HashSet<String> hashSet = this.f20789R.get();
        if (hashSet.size() >= 5) {
            TreeSet treeSet = new TreeSet(hashSet);
            treeSet.comparator();
            hashSet.remove(treeSet.first());
        }
        hashSet.add(TextUtils.concat(String.valueOf(System.currentTimeMillis()), "_", str, "_", str2).toString());
        this.f20789R.put(hashSet);
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<H5MerchandiseData> m35187s3() {
        return this.f91137Q.scheduled("h5_pay_merchandises", 0, new pcj() { // from class: l.n29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.c29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32279a0(uqb0.f180396b0.f170324a.userId())).m209028b();
                    }
                }, H5MerchandiseEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.d29
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((H5MerchandiseEnvelope) obj).data;
                    }
                }).map(new qcj() { // from class: l.e29
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4896k.m35167c3((H5MerchandiseData) obj);
                    }
                });
            }
        }).observeOn(fo0.m126432a()).take(1);
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<List<H5PayOrderData>> m35188t3() {
        return this.f91137Q.scheduled("h5_pay_orders", 0, new pcj() { // from class: l.m29
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.f29
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32287c0(uqb0.f180396b0.f170324a.userId())).m209028b();
                    }
                }, H5PayOrderDataEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.g29
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4896k.m35180p3((H5PayOrderDataEnvelope) obj);
                    }
                }).observeOn(fo0.m126432a()).take(1);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22508b<bkj0<Integer, Integer, String>> m35189v3() {
        return this.f20790S;
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<PaymentData> m35190w3() {
        return C22421c.create(new C22421c.a() { // from class: l.l29
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129756a.m35191x3((gcg0) obj);
            }
        }).observeOn(fo0.m126432a()).take(1);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m35191x3(final gcg0 gcg0Var) {
        PaymentData paymentData = f20786T;
        if (paymentData == null) {
            this.f91137Q.scheduled("h5_pay_config", 0, new pcj() { // from class: l.o29
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return qi20.m176656c(new pcj() { // from class: l.p29
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            return C4879a.f20236P.auth().m209043q(C4879a.m32283b0(uqb0.f180396b0.f170324a.userId())).m209028b();
                        }
                    }, PaymentEnvelope.JSON_ADAPTER).map(new qcj() { // from class: l.a29
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C4896k.m35169e3((PaymentEnvelope) obj);
                        }
                    }).take(2000L, TimeUnit.MILLISECONDS).materialize().map(new qcj() { // from class: l.b29
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return C4896k.m35177m3(gcg0Var, (Notification) obj);
                        }
                    });
                }
            });
        } else {
            gcg0Var.m137019l(paymentData);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public void m35192z3(final Context context, final String str, final boolean z) {
        ProductCategory productCategory;
        if (TextUtils.equals(str, PaymentData.FROM_TEAM) && !z) {
            context.startActivity(gta.m132210e().m132214d().mo34772Vj(context, str));
            return;
        }
        if (CoreModule.m30930K().mo31838xf()) {
            productCategory = ProductCategory.get(ProductCategory.tttDiamond);
        } else {
            productCategory = TextUtils.equals(str, "wallet") ? ProductCategory.get(ProductCategory.tttCoin) : ProductCategory.get(ProductCategory.tttLiveCoin);
        }
        CoreModule.f18264c.f20396j0.m31649z5(productCategory, false).filter(new qcj() { // from class: l.z19
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new qcj() { // from class: l.h29
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4896k.m35178n3((List) obj);
            }
        }).flatMap(new qcj() { // from class: l.i29
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gta.m132210e().m132214d().mo34832g5(context, (List) obj);
            }
        }).take(1).doOnNext(new y20() { // from class: l.j29
            @Override // p153l.y20
            public final void call(Object obj) {
                gta.m132210e().m132214d().mo34743Q6().m137019l((List) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.k29
            @Override // p153l.y20
            public final void call(Object obj) {
                Context context2 = context;
                boolean z2 = z;
                String str2 = str;
                context2.startActivity(z2 ? gta.m132210e().m132214d().mo34917rf(context2, str2) : gta.m132210e().m132214d().mo34772Vj(context2, str2));
            }
        }));
    }
}
