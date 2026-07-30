package com.p046p1.mobile.putong.core.api;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4745k;
import com.p046p1.mobile.putong.core.data.H5MerchandiseData;
import com.p046p1.mobile.putong.core.data.H5MerchandiseEnvelope;
import com.p046p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p046p1.mobile.putong.core.data.H5PayOrderData;
import com.p046p1.mobile.putong.core.data.H5PayOrderDataEnvelope;
import com.p046p1.mobile.putong.core.data.H5PayOrderDataList;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.data.PaymentEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22393b;
import p149l.ax6;
import p149l.e30;
import p149l.jo0;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.ura;
import p149l.v9j;
import p149l.vqd0;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.z3g0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.k */
/* JADX INFO: loaded from: classes9.dex */
public class C4745k extends ax6 {

    /* JADX INFO: renamed from: T */
    public static PaymentData f20044T;

    /* JADX INFO: renamed from: U */
    public static int f20045U;

    /* JADX INFO: renamed from: V */
    public static ArrayList<H5PayOrderConfigData> f20046V = new ArrayList<>();

    /* JADX INFO: renamed from: R */
    public vqd0 f20047R;

    /* JADX INFO: renamed from: S */
    public C22393b<xaj0<Integer, Integer, String>> f20048S;

    public C4745k(C4732c c4732c) {
        super(c4732c);
        this.f20047R = new vqd0("h5_pay_order_key_value_" + qib0.f154713b0.f139230a.userId(), new HashSet());
        this.f20048S = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: C3 */
    public static void m34160C3(boolean z) {
        f20045U = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: D3 */
    public static void m34161D3(String str) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ H5MerchandiseData m34164c3(H5MerchandiseData h5MerchandiseData) {
        return h5MerchandiseData != null ? h5MerchandiseData : H5MerchandiseData.new_();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ roj0 m34166e3(PaymentEnvelope paymentEnvelope) {
        f20044T = paymentEnvelope.data;
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ roj0 m34174m3(z3g0 z3g0Var, Notification notification) {
        PaymentData paymentData = f20044T;
        if (paymentData != null) {
            z3g0Var.m132487l(paymentData);
        } else {
            z3g0Var.m132487l(PaymentData.new_());
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ List m34175n3(List list) {
        return list.size() == 7 ? vwb.m200338m0(list, 6) : list;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ List m34177p3(H5PayOrderDataEnvelope h5PayOrderDataEnvelope) {
        List<H5PayOrderData> list = h5PayOrderDataEnvelope.data.orderList;
        return list != null ? list : H5PayOrderDataList.new_().orderList;
    }

    /* JADX INFO: renamed from: u3 */
    public static String m34179u3(String str) {
        return TextUtils.concat("https://m.tantanapp.com/monetization/codapay/?from=", str).toString();
    }

    /* JADX INFO: renamed from: y3 */
    public static String m34180y3(String str) {
        if (TextUtils.equals("liveGiftBarRechargeClick", str)) {
            return PaymentData.FROM_LIVE_RECHARGE;
        }
        if (TextUtils.equals("liveFastGiftClick", str)) {
            return "quick_gift";
        }
        if (TextUtils.equals("liveGiftBarGiftClick", str)) {
            return "live_gift";
        }
        return (TextUtils.equals(BLiveOperationClickAction.f44417h5, str) || TextUtils.isEmpty(str)) ? "H5" : PaymentData.FROM_LIVE_RECHARGE;
    }

    /* JADX INFO: renamed from: A3 */
    public String m34181A3(String str) {
        for (String str2 : this.f20047R.get()) {
            if (str2.contains(str)) {
                return str2.split("_")[2];
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: B3 */
    public void m34182B3() {
        f20044T = null;
    }

    /* JADX INFO: renamed from: r3 */
    public void m34183r3(String str, String str2) {
        HashSet<String> hashSet = this.f20047R.get();
        if (hashSet.size() >= 5) {
            TreeSet treeSet = new TreeSet(hashSet);
            treeSet.comparator();
            hashSet.remove(treeSet.first());
        }
        hashSet.add(TextUtils.concat(String.valueOf(System.currentTimeMillis()), "_", str, "_", str2).toString());
        this.f20047R.put(hashSet);
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<H5MerchandiseData> m34184s3() {
        return this.f72126Q.scheduled("h5_pay_merchandises", 0, new v9j() { // from class: l.f19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.u09
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31276a0(qib0.f154713b0.f139230a.userId())).m185883b();
                    }
                }, H5MerchandiseEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.v09
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((H5MerchandiseEnvelope) obj).data;
                    }
                }).map(new w9j() { // from class: l.w09
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4745k.m34164c3((H5MerchandiseData) obj);
                    }
                });
            }
        }).observeOn(jo0.m142408a()).take(1);
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<List<H5PayOrderData>> m34185t3() {
        return this.f72126Q.scheduled("h5_pay_orders", 0, new v9j() { // from class: l.e19
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.x09
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31284c0(qib0.f154713b0.f139230a.userId())).m185883b();
                    }
                }, H5PayOrderDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.y09
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4745k.m34177p3((H5PayOrderDataEnvelope) obj);
                    }
                }).observeOn(jo0.m142408a()).take(1);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22393b<xaj0<Integer, Integer, String>> m34186v3() {
        return this.f20048S;
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<PaymentData> m34187w3() {
        return C22306c.create(new C22306c.a() { // from class: l.d19
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83248a.m34188x3((z3g0) obj);
            }
        }).observeOn(jo0.m142408a()).take(1);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m34188x3(final z3g0 z3g0Var) {
        PaymentData paymentData = f20044T;
        if (paymentData == null) {
            this.f72126Q.scheduled("h5_pay_config", 0, new v9j() { // from class: l.g19
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return ia20.m135119c(new v9j() { // from class: l.h19
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            return C4728a.f19494P.auth().m185898q(C4728a.m31280b0(qib0.f154713b0.f139230a.userId())).m185883b();
                        }
                    }, PaymentEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.s09
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C4745k.m34166e3((PaymentEnvelope) obj);
                        }
                    }).take(2000L, TimeUnit.MILLISECONDS).materialize().map(new w9j() { // from class: l.t09
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return C4745k.m34174m3(z3g0Var, (Notification) obj);
                        }
                    });
                }
            });
        } else {
            z3g0Var.m132487l(paymentData);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public void m34189z3(final Context context, final String str, final boolean z) {
        ProductCategory productCategory;
        if (TextUtils.equals(str, PaymentData.FROM_TEAM) && !z) {
            context.startActivity(ura.m195053e().m195057d().mo33769Vj(context, str));
            return;
        }
        if (CoreModule.m29932K().mo30835xf()) {
            productCategory = ProductCategory.get(ProductCategory.tttDiamond);
        } else {
            productCategory = TextUtils.equals(str, "wallet") ? ProductCategory.get(ProductCategory.tttCoin) : ProductCategory.get(ProductCategory.tttLiveCoin);
        }
        CoreModule.f17545c.f19654j0.m30646z5(productCategory, false).filter(new w9j() { // from class: l.r09
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new w9j() { // from class: l.z09
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4745k.m34175n3((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.a19
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ura.m195053e().m195057d().mo33829g5(context, (List) obj);
            }
        }).take(1).doOnNext(new e30() { // from class: l.b19
            @Override // p149l.e30
            public final void call(Object obj) {
                ura.m195053e().m195057d().mo33740Q6().m132487l((List) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.c19
            @Override // p149l.e30
            public final void call(Object obj) {
                Context context2 = context;
                boolean z2 = z;
                String str2 = str;
                context2.startActivity(z2 ? ura.m195053e().m195057d().mo33914rf(context2, str2) : ura.m195053e().m195057d().mo33769Vj(context2, str2));
            }
        }));
    }
}
