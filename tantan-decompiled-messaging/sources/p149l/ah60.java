package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PaymentOrder;
import com.p046p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.Data;
import com.p046p1.mobile.putong.data.PaymentParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class ah60 {

    /* JADX INFO: renamed from: a */
    public static Map<Object, c4g0> f69556a;

    /* JADX INFO: renamed from: b */
    public static C22393b<PaymentResultWrapper> f69557b = C22393b.m221521b();

    /* JADX INFO: renamed from: c */
    public static C22393b<PaymentResultWrapper> f69558c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public static C22393b<yi1> f69559d = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public static C22393b<C15617a> f69560e = C22393b.m221521b();

    /* JADX INFO: renamed from: l.ah60$a */
    public static class C15617a {

        /* JADX INFO: renamed from: a */
        public PurchaseType f69561a;

        /* JADX INFO: renamed from: b */
        public Contract f69562b;

        /* JADX INFO: renamed from: c */
        public PaymentParam f69563c;

        /* JADX INFO: renamed from: d */
        public PaymentOrder f69564d;

        /* JADX INFO: renamed from: e */
        public Privilege f69565e;

        /* JADX INFO: renamed from: f */
        public boolean f69566f;

        /* JADX INFO: renamed from: g */
        public Object f69567g;

        public C15617a(PurchaseType purchaseType, Contract contract, PaymentOrder paymentOrder, PaymentParam paymentParam, Privilege privilege, boolean z, Object obj) {
            this.f69561a = purchaseType;
            this.f69562b = contract;
            this.f69563c = paymentParam;
            this.f69564d = paymentOrder;
            this.f69565e = privilege;
            this.f69566f = z;
            this.f69567g = obj;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Boolean m96366A(Data data) {
        if ("signing".equals(((CoreData) data.getModuleData(CoreData.class)).contract.contractStatus)) {
            return !vwb.m200296J(((CoreData) data.getModuleData(CoreData.class)).orders) ? Boolean.valueOf(TEnum.equals(((CoreData) data.getModuleData(CoreData.class)).orders.get(0).status, "success")) : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: B */
    public static C22306c<C15617a> m96367B() {
        return f69560e.asObservable();
    }

    /* JADX INFO: renamed from: C */
    public static void m96368C(PurchaseType purchaseType) {
        if (NullChecker.m81303a(f69556a)) {
            c4g0 c4g0Var = f69556a.get(purchaseType);
            if (!NullChecker.m81303a(c4g0Var) || c4g0Var.isUnsubscribed()) {
                return;
            }
            c4g0Var.unsubscribe();
            f69556a.remove(purchaseType);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m96369D(final PurchaseType purchaseType, final Object obj) {
        e51.m114748M(new Runnable() { // from class: l.wg60
            @Override // java.lang.Runnable
            public final void run() {
                ah60.m96395r(purchaseType, obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static C22306c<PaymentResultWrapper> m96370E() {
        return f69558c.mergeWith(m96372G());
    }

    /* JADX INFO: renamed from: F */
    public static void m96371F() {
        if (NullChecker.m81303a(f69556a)) {
            Iterator<Object> it = f69556a.keySet().iterator();
            while (it.hasNext()) {
                c4g0 c4g0Var = f69556a.get(it.next());
                if (NullChecker.m81303a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                    c4g0Var.unsubscribe();
                }
            }
            f69556a.clear();
        }
    }

    /* JADX INFO: renamed from: G */
    public static C22306c<PaymentResultWrapper> m96372G() {
        return f69557b.asObservable();
    }

    /* JADX INFO: renamed from: H */
    public static void m96373H(final String str, final yi1 yi1Var) {
        Map<Object, c4g0> map = f69556a;
        if (map == null) {
            f69556a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(str);
            if (NullChecker.m81303a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
                f69556a.remove(str);
            }
        }
        f69556a.put(str, C22306c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(6).observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.zf60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19591O0.m30080o3(str).map(new w9j() { // from class: l.xg60
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return vwb.m200311Y(l, (PaymentOrder) obj2);
                    }
                });
            }
        }).takeUntil((w9j<? super R, Boolean>) new w9j() { // from class: l.kg60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ah60.m96398u(yi1Var, (j760) obj);
            }
        }).doOnCompleted(new d30() { // from class: l.sg60
            @Override // p149l.d30
            public final void call() {
                ah60.m96383f(yi1Var);
            }
        }).subscribe(mkd0.m154950B()));
    }

    /* JADX INFO: renamed from: I */
    public static void m96374I(final String str, final yi1 yi1Var) {
        Map<Object, c4g0> map = f69556a;
        if (map == null) {
            f69556a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(str);
            if (NullChecker.m81303a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
                f69556a.remove(str);
            }
        }
        f69556a.put(str, C22306c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(5).observeOn(jo0.m142408a()).flatMap(new w9j() { // from class: l.ng60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19591O0.m30083r3(str).map(new w9j() { // from class: l.rg60
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return vwb.m200311Y(l, (PaymentOrder) obj2);
                    }
                });
            }
        }).takeUntil((w9j<? super R, Boolean>) new w9j() { // from class: l.og60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ah60.m96403z(yi1Var, (j760) obj);
            }
        }).doOnCompleted(new d30() { // from class: l.pg60
            @Override // p149l.d30
            public final void call() {
                ah60.m96391n(yi1Var);
            }
        }).subscribe(mkd0.m154950B()));
    }

    /* JADX INFO: renamed from: J */
    public static void m96375J(final PurchaseType purchaseType, final SignPaymentParam signPaymentParam, final Privilege privilege, final int i, final Object obj) {
        final String str = signPaymentParam.contractId;
        final String str2 = "contract_" + str;
        c4g0 c4g0VarSubscribe = Act.foreground().filter(new w9j() { // from class: l.fg60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return Boolean.valueOf(((Act.C4299r) obj2) != null);
            }
        }).skip(1).take(1).flatMap(new w9j() { // from class: l.gg60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return C22306c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(i);
            }
        }).flatMap(new w9j() { // from class: l.hg60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return CoreModule.f17545c.f19654j0.m30587H5(str);
            }
        }).takeUntil(new w9j() { // from class: l.ig60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return ah60.m96366A((Data) obj2);
            }
        }).doOnCompleted(new d30() { // from class: l.jg60
            @Override // p149l.d30
            public final void call() {
                ah60.m96382e(str2);
            }
        }).last().subscribe(mkd0.m154956H(new e30() { // from class: l.lg60
            @Override // p149l.e30
            public final void call(Object obj2) {
                SignPaymentParam signPaymentParam2 = signPaymentParam;
                Data data = (Data) obj2;
                ah60.f69560e.m132487l(new ah60.C15617a(purchaseType, ((CoreData) data.getModuleData(CoreData.class)).contract, vwb.m200296J(((CoreData) data.getModuleData(CoreData.class)).orders) ? null : ((CoreData) data.getModuleData(CoreData.class)).orders.get(0), signPaymentParam2, privilege, "signing".equals(((CoreData) data.getModuleData(CoreData.class)).contract.contractStatus) && (signPaymentParam2.delayCharge || vwb.m200296J(((CoreData) data.getModuleData(CoreData.class)).orders) || TEnum.equals(((CoreData) data.getModuleData(CoreData.class)).orders.get(0).status, "success")), obj));
            }
        }, new e30() { // from class: l.mg60
            @Override // p149l.e30
            public final void call(Object obj2) {
                ah60.m96385h(str2, (Throwable) obj2);
            }
        }));
        Map<Object, c4g0> map = f69556a;
        if (map == null) {
            f69556a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(str2);
            if (NullChecker.m81303a(c4g0Var)) {
                if (!c4g0Var.isUnsubscribed()) {
                    c4g0Var.unsubscribe();
                }
                f69556a.remove(str2);
            }
        }
        f69556a.put(str2, c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: K */
    public static void m96376K(final PurchaseType purchaseType, final Object obj) {
        final ch60 ch60Var = new ch60(purchaseType, null);
        C22306c.interval(1L, 5L, TimeUnit.SECONDS).take(6).takeUntil(ch60Var.m106852a().map(new w9j() { // from class: l.tg60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return ah60.m96386i(purchaseType, obj, (roj0) obj2);
            }
        })).compose(mkd0.m154951C()).doOnNext(new e30() { // from class: l.ug60
            @Override // p149l.e30
            public final void call(Object obj2) {
                ch60Var.m106854d();
            }
        }).doOnCompleted(new d30() { // from class: l.vg60
            @Override // p149l.d30
            public final void call() {
                ch60Var.m106853c();
            }
        }).subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: L */
    public static void m96377L(final PurchaseType purchaseType, f5f0 f5f0Var, final Object obj, boolean z) {
        int i;
        int i2;
        int i3;
        final ch60 ch60Var = new ch60(purchaseType, f5f0Var);
        if (z) {
            i3 = 500;
            i2 = 3000;
            i = 7;
        } else {
            i = 6;
            i2 = 5000;
            i3 = 0;
        }
        final int i4 = i3;
        final int i5 = i2;
        final int i6 = i;
        c4g0 c4g0VarSubscribe = Act.foreground().filter(new w9j() { // from class: l.yg60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return Boolean.valueOf(((Act.C4299r) obj2) != null);
            }
        }).skip(1).take(1).flatMap(new w9j() { // from class: l.zg60
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return C22306c.interval(i4, i5, TimeUnit.MILLISECONDS).onBackpressureDrop().take(i6).takeUntil(ch60Var.m106852a().map(new w9j() { // from class: l.qg60
                    @Override // p149l.w9j
                    public final Object call(Object obj3) {
                        return ah60.m96401x(purchaseType, obj, (roj0) obj3);
                    }
                })).compose(mkd0.m154951C());
            }
        }).doOnNext(new e30() { // from class: l.ag60
            @Override // p149l.e30
            public final void call(Object obj2) {
                ch60Var.m106854d();
            }
        }).doOnCompleted(new d30() { // from class: l.bg60
            @Override // p149l.d30
            public final void call() {
                ch60Var.m106853c();
            }
        }).subscribe(mkd0.m154950B());
        Map<Object, c4g0> map = f69556a;
        if (map == null) {
            f69556a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(purchaseType);
            if (NullChecker.m81303a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
                f69556a.remove(purchaseType);
            }
        }
        f69556a.put(purchaseType, c4g0VarSubscribe);
        if (ura.m195053e().m195057d().mo33713K4()) {
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_VIP) {
                c4g0 c4g0Var2 = f69556a.get("querymerchandise");
                if (NullChecker.m81303a(c4g0Var2) && !c4g0Var2.isUnsubscribed()) {
                    c4g0Var2.unsubscribe();
                    f69556a.remove("querymerchandise");
                }
                f69556a.put("querymerchandise", Act.foreground().filter(new ua20()).skip(1).take(1).delay(5L, TimeUnit.SECONDS).subscribe(mkd0.m154957I(new e30() { // from class: l.cg60
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        ura.m195053e().m195057d().mo33960zk();
                    }
                }, new e30() { // from class: l.dg60
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        ah60.f69556a.remove("querymerchandise");
                    }
                }, new d30() { // from class: l.eg60
                    @Override // p149l.d30
                    public final void call() {
                        ah60.f69556a.remove("querymerchandise");
                    }
                })));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m96382e(String str) {
        if (NullChecker.m81303a(f69556a)) {
            f69556a.remove(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m96383f(yi1 yi1Var) {
        we60.m202849N();
        sd60.m183448B(yi1Var.f198434c);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m96385h(String str, Throwable th) {
        if (NullChecker.m81303a(f69556a)) {
            f69556a.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ roj0 m96386i(PurchaseType purchaseType, Object obj, roj0 roj0Var) {
        f69558c.m132487l(new PaymentResultWrapper(purchaseType, obj));
        return roj0Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m96391n(yi1 yi1Var) {
        sd60.m183448B(yi1Var.f198434c);
        CoreModule.f17545c.f19591O0.m30074B3();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m96395r(PurchaseType purchaseType, Object obj) {
        CoreModule.f17545c.f19654j0.m30597M5(true);
        f69558c.m132487l(new PaymentResultWrapper(purchaseType, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Boolean m96398u(yi1 yi1Var, j760 j760Var) {
        PaymentOrder paymentOrder = (PaymentOrder) j760Var.f116565b;
        PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
        boolean z = NullChecker.m81303a(paymentOrder) && (TEnum.equals(paymentOrderStatus, "success") || TEnum.equals(paymentOrderStatus, "failed") || TEnum.equals(paymentOrderStatus, "pending"));
        if (z || ((Long) j760Var.f116564a).longValue() == 5) {
            if (TEnum.equals(paymentOrderStatus, "success")) {
                m96369D(yi1Var.f198434c, yi1Var.f198436e);
            } else if (NullChecker.m81303a(yi1Var)) {
                f69559d.m132487l(yi1Var);
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ roj0 m96401x(PurchaseType purchaseType, Object obj, roj0 roj0Var) {
        PaymentResultWrapper paymentResultWrapper = new PaymentResultWrapper(purchaseType, obj);
        paymentResultWrapper.fromSign = true;
        if (ura.m195053e().m195057d().mo33753U()) {
            CoreModule.f17545c.f19591O0.m30075C3();
        }
        f69557b.m132487l(paymentResultWrapper);
        return roj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m96403z(yi1 yi1Var, j760 j760Var) {
        PaymentOrder paymentOrder = (PaymentOrder) j760Var.f116565b;
        if (!NullChecker.m81303a(paymentOrder)) {
            if (((Long) j760Var.f116564a).longValue() != 4 || !NullChecker.m81303a(yi1Var)) {
                return Boolean.FALSE;
            }
            f69559d.m132487l(yi1Var);
            return Boolean.TRUE;
        }
        PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
        boolean z = NullChecker.m81303a(paymentOrder) && (TEnum.equals(paymentOrderStatus, "success") || TEnum.equals(paymentOrderStatus, "failed") || TEnum.equals(paymentOrderStatus, "pending"));
        if (z || ((Long) j760Var.f116564a).longValue() == 4) {
            if (TEnum.equals(paymentOrderStatus, "success")) {
                we60.m202849N();
                lsi0.m151593w(R$string.f27208K7);
                if (NullChecker.m81303a(yi1Var)) {
                    m96369D(yi1Var.f198434c, yi1Var.f198436e);
                }
            } else if (NullChecker.m81303a(yi1Var)) {
                f69559d.m132487l(yi1Var);
            }
        }
        return Boolean.valueOf(z);
    }
}
