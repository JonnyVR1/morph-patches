package com.p000p1.mobile.putong.core.api;

import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0171k;
import com.p1.mobile.putong.core.data.H5MerchandiseData;
import com.p1.mobile.putong.core.data.H5MerchandiseEnvelope;
import com.p1.mobile.putong.core.data.H5PayOrderConfigData;
import com.p1.mobile.putong.core.data.H5PayOrderData;
import com.p1.mobile.putong.core.data.H5PayOrderDataEnvelope;
import com.p1.mobile.putong.core.data.H5PayOrderDataList;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.data.PaymentData;
import com.p1.mobile.putong.data.PaymentEnvelope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.jo0;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.vqd0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.z3g0;
import p006l.ax6;
import p006l.qib0;
import p006l.ura;
import rx.Notification;
import rx.c;
import rx.subjects.b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.k */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0171k extends ax6 {

    /* JADX INFO: renamed from: T */
    public static PaymentData f4033T;

    /* JADX INFO: renamed from: U */
    public static int f4034U;

    /* JADX INFO: renamed from: V */
    public static ArrayList<H5PayOrderConfigData> f4035V = new ArrayList<>();

    /* JADX INFO: renamed from: R */
    public vqd0 f4036R;

    /* JADX INFO: renamed from: S */
    public b<xaj0<Integer, Integer, String>> f4037S;

    public C0171k(C0158c c0158c) {
        super(c0158c);
        this.f4036R = new vqd0("h5_pay_order_key_value_" + qib0.f19804b0.f17706a.userId(), new HashSet());
        this.f4037S = b.b();
    }

    /* JADX INFO: renamed from: C3 */
    public static void m6097C3(boolean z) {
        f4034U = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: D3 */
    public static void m6098D3(String str) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ H5MerchandiseData m6101c3(H5MerchandiseData h5MerchandiseData) {
        return h5MerchandiseData != null ? h5MerchandiseData : H5MerchandiseData.new_();
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ roj0 m6103e3(PaymentEnvelope paymentEnvelope) {
        f4033T = paymentEnvelope.data;
        return roj0.a;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ roj0 m6111m3(z3g0 z3g0Var, Notification notification) {
        PaymentData paymentData = f4033T;
        if (paymentData != null) {
            z3g0Var.onNext(paymentData);
        } else {
            z3g0Var.onNext(PaymentData.new_());
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: n3 */
    public static /* synthetic */ List m6112n3(List list) {
        return list.size() == 7 ? vwb.m0(list, 6) : list;
    }

    /* JADX INFO: renamed from: p3 */
    public static /* synthetic */ List m6114p3(H5PayOrderDataEnvelope h5PayOrderDataEnvelope) {
        List list = h5PayOrderDataEnvelope.data.orderList;
        return list != null ? list : H5PayOrderDataList.new_().orderList;
    }

    /* JADX INFO: renamed from: u3 */
    public static String m6116u3(String str) {
        return TextUtils.concat("https://m.tantanapp.com/monetization/codapay/?from=", str).toString();
    }

    /* JADX INFO: renamed from: y3 */
    public static String m6117y3(String str) {
        if (TextUtils.equals("liveGiftBarRechargeClick", str)) {
            return "live_recharge";
        }
        if (TextUtils.equals("liveFastGiftClick", str)) {
            return "quick_gift";
        }
        if (TextUtils.equals("liveGiftBarGiftClick", str)) {
            return "live_gift";
        }
        return (TextUtils.equals("h5", str) || TextUtils.isEmpty(str)) ? "H5" : "live_recharge";
    }

    /* JADX INFO: renamed from: A3 */
    public String m6118A3(String str) {
        for (String str2 : (HashSet) this.f4036R.get()) {
            if (str2.contains(str)) {
                return str2.split("_")[2];
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: B3 */
    public void m6119B3() {
        f4033T = null;
    }

    /* JADX INFO: renamed from: r3 */
    public void m6120r3(String str, String str2) {
        HashSet hashSet = (HashSet) this.f4036R.get();
        if (hashSet.size() >= 5) {
            TreeSet treeSet = new TreeSet(hashSet);
            treeSet.comparator();
            hashSet.remove(treeSet.first());
        }
        hashSet.add(TextUtils.concat(String.valueOf(System.currentTimeMillis()), "_", str, "_", str2).toString());
        this.f4036R.put(hashSet);
    }

    /* JADX INFO: renamed from: s3 */
    public c<H5MerchandiseData> m6121s3() {
        return this.f8580Q.scheduled("h5_pay_merchandises", 0, new v9j() { // from class: l.f19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.u09
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3206a0(qib0.f19804b0.f17706a.userId())).b();
                    }
                }, H5MerchandiseEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.v09
                    public final Object call(Object obj) {
                        return ((H5MerchandiseEnvelope) obj).data;
                    }
                }).map(new w9j() { // from class: l.w09
                    public final Object call(Object obj) {
                        return C0171k.m6101c3((H5MerchandiseData) obj);
                    }
                });
            }
        }).observeOn(jo0.a()).take(1);
    }

    /* JADX INFO: renamed from: t3 */
    public c<List<H5PayOrderData>> m6122t3() {
        return this.f8580Q.scheduled("h5_pay_orders", 0, new v9j() { // from class: l.e19
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.x09
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3214c0(qib0.f19804b0.f17706a.userId())).b();
                    }
                }, H5PayOrderDataEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.y09
                    public final Object call(Object obj) {
                        return C0171k.m6114p3((H5PayOrderDataEnvelope) obj);
                    }
                }).observeOn(jo0.a()).take(1);
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public b<xaj0<Integer, Integer, String>> m6123v3() {
        return this.f4037S;
    }

    /* JADX INFO: renamed from: w3 */
    public c<PaymentData> m6124w3() {
        return c.create(new c.a() { // from class: l.d19
            public final void call(Object obj) {
                this.f9975a.m6125x3((z3g0) obj);
            }
        }).observeOn(jo0.a()).take(1);
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m6125x3(final z3g0 z3g0Var) {
        PaymentData paymentData = f4033T;
        if (paymentData == null) {
            this.f8580Q.scheduled("h5_pay_config", 0, new v9j() { // from class: l.g19
                public final Object call() {
                    return ia20.m16569c(new v9j() { // from class: l.h19
                        public final Object call() {
                            return C0154a.f3483P.auth().q(C0154a.m3210b0(qib0.f19804b0.f17706a.userId())).b();
                        }
                    }, PaymentEnvelope.JSON_ADAPTER).map(new w9j() { // from class: l.s09
                        public final Object call(Object obj) {
                            return C0171k.m6103e3((PaymentEnvelope) obj);
                        }
                    }).take(2000L, TimeUnit.MILLISECONDS).materialize().map(new w9j() { // from class: l.t09
                        public final Object call(Object obj) {
                            return C0171k.m6111m3(z3g0Var, (Notification) obj);
                        }
                    });
                }
            });
        } else {
            z3g0Var.onNext(paymentData);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public void m6126z3(final Context context, final String str, final boolean z) {
        ProductCategory productCategory;
        if (TextUtils.equals(str, "tantan_assistant") && !z) {
            context.startActivity(ura.m25555e().m25559d().m5706Vj(context, str));
            return;
        }
        if (CoreModule.m1851K().xf()) {
            productCategory = ProductCategory.get("tttDiamond");
        } else {
            productCategory = TextUtils.equals(str, "wallet") ? ProductCategory.get("tttCoin") : ProductCategory.get("tttLiveCoin");
        }
        CoreModule.f1534c.f3643j0.m2574z5(productCategory, false).filter(new w9j() { // from class: l.r09
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new w9j() { // from class: l.z09
            public final Object call(Object obj) {
                return C0171k.m6112n3((List) obj);
            }
        }).flatMap(new w9j() { // from class: l.a19
            public final Object call(Object obj) {
                return ura.m25555e().m25559d().m5766g5(context, (List) obj);
            }
        }).take(1).doOnNext(new e30() { // from class: l.b19
            public final void call(Object obj) {
                ura.m25555e().m25559d().m5677Q6().onNext((List) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.c19
            public final void call(Object obj) {
                Context context2 = context;
                boolean z2 = z;
                String str2 = str;
                context2.startActivity(z2 ? ura.m25555e().m25559d().m5851rf(context2, str2) : ura.m25555e().m25559d().m5706Vj(context2, str2));
            }
        }));
    }
}
