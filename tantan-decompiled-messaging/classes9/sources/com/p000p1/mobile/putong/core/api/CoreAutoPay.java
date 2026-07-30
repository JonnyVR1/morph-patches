package com.p000p1.mobile.putong.core.api;

import android.util.Pair;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.CoreAutoPay;
import com.p1.mobile.putong.core.data.AutoDeducts;
import com.p1.mobile.putong.core.data.ContractInfo;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.OrderInfo;
import com.p1.mobile.putong.core.data.PaymentOrder;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import p006l.ax6;
import p006l.ia20;
import p006l.qib0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreAutoPay extends ax6 {

    /* JADX INFO: renamed from: R */
    public AutoPayStatus f3155R;

    /* JADX INFO: renamed from: S */
    public final a<AutoPayStatus> f3156S;

    /* JADX INFO: renamed from: T */
    public boolean f3157T;

    /* JADX INFO: renamed from: U */
    public ArrayList<PurchaseType> f3158U;

    public enum AutoPayStatus {
        ali,
        none
    }

    public CoreAutoPay(C0158c c0158c) {
        super(c0158c);
        AutoPayStatus autoPayStatus = AutoPayStatus.none;
        this.f3155R = autoPayStatus;
        this.f3156S = a.c(autoPayStatus);
        this.f3157T = false;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ PaymentOrder m1995g3(Envelope envelope) {
        if (envelope.data == null || vwb.J(envelope.getModuleData(CoreData.class).orders)) {
            return null;
        }
        return (PaymentOrder) envelope.getModuleData(CoreData.class).orders.get(0);
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ PaymentOrder m1997i3(Envelope envelope) {
        if (envelope.data == null || vwb.J(envelope.getModuleData(CoreData.class).orders)) {
            return null;
        }
        return (PaymentOrder) envelope.getModuleData(CoreData.class).orders.get(0);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ c m2001A3() {
        return ia20.m16567a(new v9j() { // from class: l.ny6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3170Q2()).f().b();
            }
        }).map(new w9j() { // from class: l.oy6
            public final Object call(Object obj) {
                return this.f18486a.m2019z3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public void m2002B3() {
        qib0.f19796T.m1490T();
    }

    /* JADX INFO: renamed from: C3 */
    public c<roj0> m2003C3() {
        return this.f8580Q.scheduled("payment_refreshStatus", 0, new v9j() { // from class: l.ky6
            public final Object call() {
                return this.f16082a.m2001A3();
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public String m2004D3() {
        return m2016w3() ? "yes" : "no";
    }

    /* JADX INFO: renamed from: E3 */
    public String m2005E3() {
        return m2016w3() ? "yes" : "no";
    }

    /* JADX INFO: renamed from: m3 */
    public c<AutoPayStatus> m2006m3() {
        return this.f3156S.asObservable();
    }

    /* JADX INFO: renamed from: n3 */
    public boolean m2007n3() {
        return m2016w3() && !this.f3157T;
    }

    /* JADX INFO: renamed from: o3 */
    public c<PaymentOrder> m2008o3(final String str) {
        return this.f8580Q.scheduled("autopayment_order_state" + str, 0, new v9j() { // from class: l.qy6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.ty6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3275r1(str)).b();
                    }
                }).map(new w9j() { // from class: l.uy6
                    public final Object call(Object obj) {
                        return CoreAutoPay.m1997i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final ContractInfo m2009p3(ContractInfo contractInfo) {
        return contractInfo;
    }

    /* JADX INFO: renamed from: q3 */
    public final OrderInfo m2010q3(OrderInfo orderInfo) {
        return orderInfo;
    }

    /* JADX INFO: renamed from: r3 */
    public c<PaymentOrder> m2011r3(final String str) {
        return this.f8580Q.scheduled("payment_status_" + str, 0, new v9j() { // from class: l.vy6
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.ly6
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3174R2(str)).f().b();
                    }
                }).map(new w9j() { // from class: l.my6
                    public final Object call(Object obj) {
                        return CoreAutoPay.m1995g3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public c<Pair<OrderInfo, ContractInfo>> m2012s3() {
        return m2013t3("callback");
    }

    /* JADX INFO: renamed from: t3 */
    public c<Pair<OrderInfo, ContractInfo>> m2013t3(final String str) {
        return this.f8580Q.scheduled("get_renewable_contract_infos_" + str, 0, new v9j() { // from class: l.py6
            public final Object call() {
                return this.f19434a.m2018y3(str);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m2014u3(PurchaseType purchaseType) {
        return m2016w3() && !vwb.J(this.f3158U) && this.f3158U.contains(purchaseType);
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m2015v3() {
        return this.f3157T;
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m2016w3() {
        return this.f3155R == AutoPayStatus.ali;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ Pair m2017x3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).contractInfos;
        List list2 = envelope.getModuleData(CoreData.class).orderInfos;
        return Pair.create(vwb.J(list2) ? null : m2010q3((OrderInfo) list2.get(0)), !vwb.J(list) ? m2009p3((ContractInfo) list.get(0)) : null);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ c m2018y3(final String str) {
        return ia20.m16567a(new v9j() { // from class: l.ry6
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3192W1(str)).f().b();
            }
        }).map(new w9j() { // from class: l.sy6
            public final Object call(Object obj) {
                return this.f21743a.m2017x3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ roj0 m2019z3(Envelope envelope) {
        if (!NullChecker.a(envelope.data) || !NullChecker.a(envelope.getModuleData(CoreData.class).autoDeducts)) {
            this.f3155R = AutoPayStatus.none;
            this.f3157T = false;
        } else if (vwb.J(envelope.getModuleData(CoreData.class).autoDeducts)) {
            this.f3155R = AutoPayStatus.none;
        } else {
            boolean z = false;
            for (AutoDeducts autoDeducts : envelope.getModuleData(CoreData.class).autoDeducts) {
                if ("signing".equals(autoDeducts.autoDeductStatus)) {
                    this.f3157T = autoDeducts.rateLimitReached;
                    z = true;
                }
            }
            if (z) {
                this.f3155R = AutoPayStatus.ali;
            } else {
                this.f3155R = AutoPayStatus.none;
                this.f3157T = false;
            }
        }
        this.f3156S.onNext(this.f3155R);
        return roj0.a;
    }
}
