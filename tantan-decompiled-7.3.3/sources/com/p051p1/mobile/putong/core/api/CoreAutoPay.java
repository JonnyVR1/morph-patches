package com.p051p1.mobile.putong.core.api;

import android.util.Pair;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.CoreAutoPay;
import com.p051p1.mobile.putong.core.data.AutoDeducts;
import com.p051p1.mobile.putong.core.data.ContractInfo;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.OrderInfo;
import com.p051p1.mobile.putong.core.data.PaymentOrder;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dy6;
import p153l.jyb;
import p153l.pcj;
import p153l.qcj;
import p153l.qi20;
import p153l.uqb0;
import p153l.uxj0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreAutoPay extends dy6 {

    /* JADX INFO: renamed from: R */
    public AutoPayStatus f19907R;

    /* JADX INFO: renamed from: S */
    public final C22507a<AutoPayStatus> f19908S;

    /* JADX INFO: renamed from: T */
    public boolean f19909T;

    /* JADX INFO: renamed from: U */
    public ArrayList<PurchaseType> f19910U;

    public enum AutoPayStatus {
        ali,
        none
    }

    public CoreAutoPay(C4883c c4883c) {
        super(c4883c);
        AutoPayStatus autoPayStatus = AutoPayStatus.none;
        this.f19907R = autoPayStatus;
        this.f19908S = C22507a.m222759c(autoPayStatus);
        this.f19909T = false;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ PaymentOrder m31065g3(Envelope envelope) {
        if (envelope.data == null || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).orders)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).orders.get(0);
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ PaymentOrder m31067i3(Envelope envelope) {
        if (envelope.data == null || jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).orders)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).orders.get(0);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22421c m31071A3() {
        return qi20.m176654a(new pcj() { // from class: l.qz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32243Q2()).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.rz6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165493a.m31089z3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public void m31072B3() {
        uqb0.f180388T.m30582T();
    }

    /* JADX INFO: renamed from: C3 */
    public C22421c<uxj0> m31073C3() {
        return this.f91137Q.scheduled("payment_refreshStatus", 0, new pcj() { // from class: l.nz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f144408a.m31071A3();
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public String m31074D3() {
        return m31086w3() ? "yes" : "no";
    }

    /* JADX INFO: renamed from: E3 */
    public String m31075E3() {
        return m31086w3() ? "yes" : "no";
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<AutoPayStatus> m31076m3() {
        return this.f19908S.asObservable();
    }

    /* JADX INFO: renamed from: n3 */
    public boolean m31077n3() {
        return m31086w3() && !this.f19909T;
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<PaymentOrder> m31078o3(final String str) {
        return this.f91137Q.scheduled("autopayment_order_state" + str, 0, new pcj() { // from class: l.tz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.wz6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32348r1(str)).m209028b();
                    }
                }).map(new qcj() { // from class: l.xz6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreAutoPay.m31067i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final ContractInfo m31079p3(ContractInfo contractInfo) {
        return contractInfo;
    }

    /* JADX INFO: renamed from: q3 */
    public final OrderInfo m31080q3(OrderInfo orderInfo) {
        return orderInfo;
    }

    /* JADX INFO: renamed from: r3 */
    public C22421c<PaymentOrder> m31081r3(final String str) {
        return this.f91137Q.scheduled("payment_status_" + str, 0, new pcj() { // from class: l.yz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.oz6
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32247R2(str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.pz6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreAutoPay.m31065g3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<Pair<OrderInfo, ContractInfo>> m31082s3() {
        return m31083t3("callback");
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<Pair<OrderInfo, ContractInfo>> m31083t3(final String str) {
        return this.f91137Q.scheduled("get_renewable_contract_infos_" + str, 0, new pcj() { // from class: l.sz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f171358a.m31088y3(str);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m31084u3(PurchaseType purchaseType) {
        return m31086w3() && !jyb.m147479J(this.f19910U) && this.f19910U.contains(purchaseType);
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m31085v3() {
        return this.f19909T;
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m31086w3() {
        return this.f19907R == AutoPayStatus.ali;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ Pair m31087x3(Envelope envelope) {
        List<ContractInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).contractInfos;
        List<OrderInfo> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).orderInfos;
        return Pair.create(jyb.m147479J(list2) ? null : m31080q3(list2.get(0)), !jyb.m147479J(list) ? m31079p3(list.get(0)) : null);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ C22421c m31088y3(final String str) {
        return qi20.m176654a(new pcj() { // from class: l.uz6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32265W1(str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.vz6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186445a.m31087x3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ uxj0 m31089z3(Envelope envelope) {
        if (!NullChecker.m82486a(envelope.data) || !NullChecker.m82486a(((CoreData) envelope.getModuleData(CoreData.class)).autoDeducts)) {
            this.f19907R = AutoPayStatus.none;
            this.f19909T = false;
        } else if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).autoDeducts)) {
            this.f19907R = AutoPayStatus.none;
        } else {
            boolean z = false;
            for (AutoDeducts autoDeducts : ((CoreData) envelope.getModuleData(CoreData.class)).autoDeducts) {
                if ("signing".equals(autoDeducts.autoDeductStatus)) {
                    this.f19909T = autoDeducts.rateLimitReached;
                    z = true;
                }
            }
            if (z) {
                this.f19907R = AutoPayStatus.ali;
            } else {
                this.f19907R = AutoPayStatus.none;
                this.f19909T = false;
            }
        }
        this.f19908S.m137019l(this.f19907R);
        return uxj0.f181467a;
    }
}
