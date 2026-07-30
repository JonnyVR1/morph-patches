package com.p046p1.mobile.putong.core.api;

import android.util.Pair;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.CoreAutoPay;
import com.p046p1.mobile.putong.core.data.AutoDeducts;
import com.p046p1.mobile.putong.core.data.ContractInfo;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.OrderInfo;
import com.p046p1.mobile.putong.core.data.PaymentOrder;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.ia20;
import p149l.qib0;
import p149l.roj0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class CoreAutoPay extends ax6 {

    /* JADX INFO: renamed from: R */
    public AutoPayStatus f19166R;

    /* JADX INFO: renamed from: S */
    public final C22392a<AutoPayStatus> f19167S;

    /* JADX INFO: renamed from: T */
    public boolean f19168T;

    /* JADX INFO: renamed from: U */
    public ArrayList<PurchaseType> f19169U;

    public enum AutoPayStatus {
        ali,
        none
    }

    public CoreAutoPay(C4732c c4732c) {
        super(c4732c);
        AutoPayStatus autoPayStatus = AutoPayStatus.none;
        this.f19166R = autoPayStatus;
        this.f19167S = C22392a.m221513c(autoPayStatus);
        this.f19168T = false;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ PaymentOrder m30067g3(Envelope envelope) {
        if (envelope.data == null || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).orders)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).orders.get(0);
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ PaymentOrder m30069i3(Envelope envelope) {
        if (envelope.data == null || vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).orders)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).orders.get(0);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ C22306c m30073A3() {
        return ia20.m135117a(new v9j() { // from class: l.ny6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31240Q2()).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.oy6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f146292a.m30091z3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public void m30074B3() {
        qib0.f154705T.m29584T();
    }

    /* JADX INFO: renamed from: C3 */
    public C22306c<roj0> m30075C3() {
        return this.f72126Q.scheduled("payment_refreshStatus", 0, new v9j() { // from class: l.ky6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f125252a.m30073A3();
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public String m30076D3() {
        return m30088w3() ? "yes" : "no";
    }

    /* JADX INFO: renamed from: E3 */
    public String m30077E3() {
        return m30088w3() ? "yes" : "no";
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<AutoPayStatus> m30078m3() {
        return this.f19167S.asObservable();
    }

    /* JADX INFO: renamed from: n3 */
    public boolean m30079n3() {
        return m30088w3() && !this.f19168T;
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<PaymentOrder> m30080o3(final String str) {
        return this.f72126Q.scheduled("autopayment_order_state" + str, 0, new v9j() { // from class: l.qy6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.ty6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31345r1(str)).m185883b();
                    }
                }).map(new w9j() { // from class: l.uy6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreAutoPay.m30069i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public final ContractInfo m30081p3(ContractInfo contractInfo) {
        return contractInfo;
    }

    /* JADX INFO: renamed from: q3 */
    public final OrderInfo m30082q3(OrderInfo orderInfo) {
        return orderInfo;
    }

    /* JADX INFO: renamed from: r3 */
    public C22306c<PaymentOrder> m30083r3(final String str) {
        return this.f72126Q.scheduled("payment_status_" + str, 0, new v9j() { // from class: l.vy6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.ly6
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31244R2(str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.my6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreAutoPay.m30067g3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<Pair<OrderInfo, ContractInfo>> m30084s3() {
        return m30085t3("callback");
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<Pair<OrderInfo, ContractInfo>> m30085t3(final String str) {
        return this.f72126Q.scheduled("get_renewable_contract_infos_" + str, 0, new v9j() { // from class: l.py6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f151800a.m30090y3(str);
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public boolean m30086u3(PurchaseType purchaseType) {
        return m30088w3() && !vwb.m200296J(this.f19169U) && this.f19169U.contains(purchaseType);
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m30087v3() {
        return this.f19168T;
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m30088w3() {
        return this.f19166R == AutoPayStatus.ali;
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ Pair m30089x3(Envelope envelope) {
        List<ContractInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).contractInfos;
        List<OrderInfo> list2 = ((CoreData) envelope.getModuleData(CoreData.class)).orderInfos;
        return Pair.create(vwb.m200296J(list2) ? null : m30082q3(list2.get(0)), !vwb.m200296J(list) ? m30081p3(list.get(0)) : null);
    }

    /* JADX INFO: renamed from: y3 */
    public final /* synthetic */ C22306c m30090y3(final String str) {
        return ia20.m135117a(new v9j() { // from class: l.ry6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31262W1(str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.sy6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f166897a.m30089x3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ roj0 m30091z3(Envelope envelope) {
        if (!NullChecker.m81303a(envelope.data) || !NullChecker.m81303a(((CoreData) envelope.getModuleData(CoreData.class)).autoDeducts)) {
            this.f19166R = AutoPayStatus.none;
            this.f19168T = false;
        } else if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).autoDeducts)) {
            this.f19166R = AutoPayStatus.none;
        } else {
            boolean z = false;
            for (AutoDeducts autoDeducts : ((CoreData) envelope.getModuleData(CoreData.class)).autoDeducts) {
                if ("signing".equals(autoDeducts.autoDeductStatus)) {
                    this.f19168T = autoDeducts.rateLimitReached;
                    z = true;
                }
            }
            if (z) {
                this.f19166R = AutoPayStatus.ali;
            } else {
                this.f19166R = AutoPayStatus.none;
                this.f19168T = false;
            }
        }
        this.f19167S.m132487l(this.f19166R);
        return roj0.f160388a;
    }
}
