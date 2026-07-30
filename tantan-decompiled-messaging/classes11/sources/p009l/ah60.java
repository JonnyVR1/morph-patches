package p009l;

import com.p000p1.mobile.putong.core.pay.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PaymentOrder;
import com.p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.Data;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.ua20;
import l.ura;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ah60 {

    /* JADX INFO: renamed from: a */
    public static Map<Object, c4g0> f9503a;

    /* JADX INFO: renamed from: b */
    public static b<PaymentResultWrapper> f9504b = b.b();

    /* JADX INFO: renamed from: c */
    public static b<PaymentResultWrapper> f9505c = b.b();

    /* JADX INFO: renamed from: d */
    public static b<yi1> f9506d = b.b();

    /* JADX INFO: renamed from: e */
    public static b<C0763a> f9507e = b.b();

    /* JADX INFO: renamed from: l.ah60$a */
    public static class C0763a {

        /* JADX INFO: renamed from: a */
        public PurchaseType f9508a;

        /* JADX INFO: renamed from: b */
        public Contract f9509b;

        /* JADX INFO: renamed from: c */
        public PaymentParam f9510c;

        /* JADX INFO: renamed from: d */
        public PaymentOrder f9511d;

        /* JADX INFO: renamed from: e */
        public Privilege f9512e;

        /* JADX INFO: renamed from: f */
        public boolean f9513f;

        /* JADX INFO: renamed from: g */
        public Object f9514g;

        public C0763a(PurchaseType purchaseType, Contract contract, PaymentOrder paymentOrder, PaymentParam paymentParam, Privilege privilege, boolean z, Object obj) {
            this.f9508a = purchaseType;
            this.f9509b = contract;
            this.f9510c = paymentParam;
            this.f9511d = paymentOrder;
            this.f9512e = privilege;
            this.f9513f = z;
            this.f9514g = obj;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Boolean m11404A(Data data) {
        if ("signing".equals(data.getModuleData(CoreData.class).contract.contractStatus)) {
            return !vwb.J(data.getModuleData(CoreData.class).orders) ? Boolean.valueOf(TEnum.equals(((PaymentOrder) data.getModuleData(CoreData.class).orders.get(0)).status, "success")) : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: B */
    public static c<C0763a> m11405B() {
        return f9507e.asObservable();
    }

    /* JADX INFO: renamed from: C */
    public static void m11406C(PurchaseType purchaseType) {
        if (NullChecker.a(f9503a)) {
            c4g0 c4g0Var = f9503a.get(purchaseType);
            if (!NullChecker.a(c4g0Var) || c4g0Var.isUnsubscribed()) {
                return;
            }
            c4g0Var.unsubscribe();
            f9503a.remove(purchaseType);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m11407D(final PurchaseType purchaseType, final Object obj) {
        e51.M(new Runnable() { // from class: l.wg60
            @Override // java.lang.Runnable
            public final void run() {
                ah60.m11433r(purchaseType, obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static c<PaymentResultWrapper> m11408E() {
        return f9505c.mergeWith(m11410G());
    }

    /* JADX INFO: renamed from: F */
    public static void m11409F() {
        if (NullChecker.a(f9503a)) {
            Iterator<Object> it = f9503a.keySet().iterator();
            while (it.hasNext()) {
                c4g0 c4g0Var = f9503a.get(it.next());
                if (NullChecker.a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                    c4g0Var.unsubscribe();
                }
            }
            f9503a.clear();
        }
    }

    /* JADX INFO: renamed from: G */
    public static c<PaymentResultWrapper> m11410G() {
        return f9504b.asObservable();
    }

    /* JADX INFO: renamed from: H */
    public static void m11411H(final String str, final yi1 yi1Var) {
        Map<Object, c4g0> map = f9503a;
        if (map == null) {
            f9503a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(str);
            if (NullChecker.a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
                f9503a.remove(str);
            }
        }
        f9503a.put(str, c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(6).observeOn(jo0.a()).flatMap(new w9j() { // from class: l.zf60
            public final Object call(Object obj) {
                return CoreModule.c.O0.o3(str).map(new w9j() { // from class: l.xg60
                    public final Object call(Object obj2) {
                        return vwb.Y(l, (PaymentOrder) obj2);
                    }
                });
            }
        }).takeUntil(new w9j() { // from class: l.kg60
            public final Object call(Object obj) {
                return ah60.m11436u(yi1Var, (j760) obj);
            }
        }).doOnCompleted(new d30() { // from class: l.sg60
            public final void call() {
                ah60.m11421f(yi1Var);
            }
        }).subscribe(mkd0.B()));
    }

    /* JADX INFO: renamed from: I */
    public static void m11412I(final String str, final yi1 yi1Var) {
        Map<Object, c4g0> map = f9503a;
        if (map == null) {
            f9503a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(str);
            if (NullChecker.a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
                f9503a.remove(str);
            }
        }
        f9503a.put(str, c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(5).observeOn(jo0.a()).flatMap(new w9j() { // from class: l.ng60
            public final Object call(Object obj) {
                return CoreModule.c.O0.r3(str).map(new w9j() { // from class: l.rg60
                    public final Object call(Object obj2) {
                        return vwb.Y(l, (PaymentOrder) obj2);
                    }
                });
            }
        }).takeUntil(new w9j() { // from class: l.og60
            public final Object call(Object obj) {
                return ah60.m11441z(yi1Var, (j760) obj);
            }
        }).doOnCompleted(new d30() { // from class: l.pg60
            public final void call() {
                ah60.m11429n(yi1Var);
            }
        }).subscribe(mkd0.B()));
    }

    /* JADX INFO: renamed from: J */
    public static void m11413J(final PurchaseType purchaseType, final SignPaymentParam signPaymentParam, final Privilege privilege, final int i, final Object obj) {
        final String str = signPaymentParam.contractId;
        final String str2 = "contract_" + str;
        c4g0 c4g0VarSubscribe = Act.foreground().filter(new w9j() { // from class: l.fg60
            public final Object call(Object obj2) {
                return Boolean.valueOf(((Act.r) obj2) != null);
            }
        }).skip(1).take(1).flatMap(new w9j() { // from class: l.gg60
            public final Object call(Object obj2) {
                return c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(i);
            }
        }).flatMap(new w9j() { // from class: l.hg60
            public final Object call(Object obj2) {
                return CoreModule.c.j0.H5(str);
            }
        }).takeUntil(new w9j() { // from class: l.ig60
            public final Object call(Object obj2) {
                return ah60.m11404A((Data) obj2);
            }
        }).doOnCompleted(new d30() { // from class: l.jg60
            public final void call() {
                ah60.m11420e(str2);
            }
        }).last().subscribe(mkd0.H(new e30() { // from class: l.lg60
            public final void call(Object obj2) {
                SignPaymentParam signPaymentParam2 = signPaymentParam;
                Data data = (Data) obj2;
                ah60.f9507e.onNext(new ah60.C0763a(purchaseType, data.getModuleData(CoreData.class).contract, vwb.J(data.getModuleData(CoreData.class).orders) ? null : (PaymentOrder) data.getModuleData(CoreData.class).orders.get(0), signPaymentParam2, privilege, "signing".equals(data.getModuleData(CoreData.class).contract.contractStatus) && (signPaymentParam2.delayCharge || vwb.J(data.getModuleData(CoreData.class).orders) || TEnum.equals(((PaymentOrder) data.getModuleData(CoreData.class).orders.get(0)).status, "success")), obj));
            }
        }, new e30() { // from class: l.mg60
            public final void call(Object obj2) {
                ah60.m11423h(str2, (Throwable) obj2);
            }
        }));
        Map<Object, c4g0> map = f9503a;
        if (map == null) {
            f9503a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(str2);
            if (NullChecker.a(c4g0Var)) {
                if (!c4g0Var.isUnsubscribed()) {
                    c4g0Var.unsubscribe();
                }
                f9503a.remove(str2);
            }
        }
        f9503a.put(str2, c4g0VarSubscribe);
    }

    /* JADX INFO: renamed from: K */
    public static void m11414K(final PurchaseType purchaseType, final Object obj) {
        final ch60 ch60Var = new ch60(purchaseType, null);
        c.interval(1L, 5L, TimeUnit.SECONDS).take(6).takeUntil(ch60Var.m12551a().map(new w9j() { // from class: l.tg60
            public final Object call(Object obj2) {
                return ah60.m11424i(purchaseType, obj, (roj0) obj2);
            }
        })).compose(mkd0.C()).doOnNext(new e30() { // from class: l.ug60
            public final void call(Object obj2) {
                ch60Var.m12553d();
            }
        }).doOnCompleted(new d30() { // from class: l.vg60
            public final void call() {
                ch60Var.m12552c();
            }
        }).subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: L */
    public static void m11415L(final PurchaseType purchaseType, f5f0 f5f0Var, final Object obj, boolean z) {
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
            public final Object call(Object obj2) {
                return Boolean.valueOf(((Act.r) obj2) != null);
            }
        }).skip(1).take(1).flatMap(new w9j() { // from class: l.zg60
            public final Object call(Object obj2) {
                return c.interval(i4, i5, TimeUnit.MILLISECONDS).onBackpressureDrop().take(i6).takeUntil(ch60Var.m12551a().map(new w9j() { // from class: l.qg60
                    public final Object call(Object obj3) {
                        return ah60.m11439x(purchaseType, obj, (roj0) obj3);
                    }
                })).compose(mkd0.C());
            }
        }).doOnNext(new e30() { // from class: l.ag60
            public final void call(Object obj2) {
                ch60Var.m12553d();
            }
        }).doOnCompleted(new d30() { // from class: l.bg60
            public final void call() {
                ch60Var.m12552c();
            }
        }).subscribe(mkd0.B());
        Map<Object, c4g0> map = f9503a;
        if (map == null) {
            f9503a = new HashMap();
        } else {
            c4g0 c4g0Var = map.get(purchaseType);
            if (NullChecker.a(c4g0Var) && !c4g0Var.isUnsubscribed()) {
                c4g0Var.unsubscribe();
                f9503a.remove(purchaseType);
            }
        }
        f9503a.put(purchaseType, c4g0VarSubscribe);
        if (ura.e().d().K4()) {
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_VIP) {
                c4g0 c4g0Var2 = f9503a.get("querymerchandise");
                if (NullChecker.a(c4g0Var2) && !c4g0Var2.isUnsubscribed()) {
                    c4g0Var2.unsubscribe();
                    f9503a.remove("querymerchandise");
                }
                f9503a.put("querymerchandise", Act.foreground().filter(new ua20()).skip(1).take(1).delay(5L, TimeUnit.SECONDS).subscribe(mkd0.I(new e30() { // from class: l.cg60
                    public final void call(Object obj2) {
                        ura.e().d().zk();
                    }
                }, new e30() { // from class: l.dg60
                    public final void call(Object obj2) {
                        ah60.f9503a.remove("querymerchandise");
                    }
                }, new d30() { // from class: l.eg60
                    public final void call() {
                        ah60.f9503a.remove("querymerchandise");
                    }
                })));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m11420e(String str) {
        if (NullChecker.a(f9503a)) {
            f9503a.remove(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m11421f(yi1 yi1Var) {
        we60.m24152N();
        sd60.m22068B(yi1Var.f23076c);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m11423h(String str, Throwable th) {
        if (NullChecker.a(f9503a)) {
            f9503a.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ roj0 m11424i(PurchaseType purchaseType, Object obj, roj0 roj0Var) {
        f9505c.onNext(new PaymentResultWrapper(purchaseType, obj));
        return roj0Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m11429n(yi1 yi1Var) {
        sd60.m22068B(yi1Var.f23076c);
        CoreModule.c.O0.B3();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m11433r(PurchaseType purchaseType, Object obj) {
        CoreModule.c.j0.M5(true);
        f9505c.onNext(new PaymentResultWrapper(purchaseType, obj));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Boolean m11436u(yi1 yi1Var, j760 j760Var) {
        PaymentOrder paymentOrder = (PaymentOrder) j760Var.b;
        PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
        boolean z = NullChecker.a(paymentOrder) && (TEnum.equals(paymentOrderStatus, "success") || TEnum.equals(paymentOrderStatus, "failed") || TEnum.equals(paymentOrderStatus, "pending"));
        if (z || ((Long) j760Var.a).longValue() == 5) {
            if (TEnum.equals(paymentOrderStatus, "success")) {
                m11407D(yi1Var.f23076c, yi1Var.f23078e);
            } else if (NullChecker.a(yi1Var)) {
                f9506d.onNext(yi1Var);
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ roj0 m11439x(PurchaseType purchaseType, Object obj, roj0 roj0Var) {
        PaymentResultWrapper paymentResultWrapper = new PaymentResultWrapper(purchaseType, obj);
        paymentResultWrapper.fromSign = true;
        if (ura.e().d().U()) {
            CoreModule.c.O0.C3();
        }
        f9504b.onNext(paymentResultWrapper);
        return roj0Var;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m11441z(yi1 yi1Var, j760 j760Var) {
        PaymentOrder paymentOrder = (PaymentOrder) j760Var.b;
        if (!NullChecker.a(paymentOrder)) {
            if (((Long) j760Var.a).longValue() != 4 || !NullChecker.a(yi1Var)) {
                return Boolean.FALSE;
            }
            f9506d.onNext(yi1Var);
            return Boolean.TRUE;
        }
        PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
        boolean z = NullChecker.a(paymentOrder) && (TEnum.equals(paymentOrderStatus, "success") || TEnum.equals(paymentOrderStatus, "failed") || TEnum.equals(paymentOrderStatus, "pending"));
        if (z || ((Long) j760Var.a).longValue() == 4) {
            if (TEnum.equals(paymentOrderStatus, "success")) {
                we60.m24152N();
                lsi0.w(R$string.f5986K7);
                if (NullChecker.a(yi1Var)) {
                    m11407D(yi1Var.f23076c, yi1Var.f23078e);
                }
            } else if (NullChecker.a(yi1Var)) {
                f9506d.onNext(yi1Var);
            }
        }
        return Boolean.valueOf(z);
    }
}
