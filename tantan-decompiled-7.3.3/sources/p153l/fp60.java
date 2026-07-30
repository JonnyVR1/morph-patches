package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PaymentOrder;
import com.p051p1.mobile.putong.core.data.PaymentOrderStatus;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.Data;
import com.p051p1.mobile.putong.data.PaymentParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class fp60 {

    /* JADX INFO: renamed from: a */
    public static Map<Object, kcg0> f100101a;

    /* JADX INFO: renamed from: b */
    public static C22508b<PaymentResultWrapper> f100102b = C22508b.m222767b();

    /* JADX INFO: renamed from: c */
    public static C22508b<PaymentResultWrapper> f100103c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public static C22508b<fj1> f100104d = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public static C22508b<C17027a> f100105e = C22508b.m222767b();

    /* JADX INFO: renamed from: l.fp60$a */
    public static class C17027a {

        /* JADX INFO: renamed from: a */
        public PurchaseType f100106a;

        /* JADX INFO: renamed from: b */
        public Contract f100107b;

        /* JADX INFO: renamed from: c */
        public PaymentParam f100108c;

        /* JADX INFO: renamed from: d */
        public PaymentOrder f100109d;

        /* JADX INFO: renamed from: e */
        public Privilege f100110e;

        /* JADX INFO: renamed from: f */
        public boolean f100111f;

        /* JADX INFO: renamed from: g */
        public Object f100112g;

        public C17027a(PurchaseType purchaseType, Contract contract, PaymentOrder paymentOrder, PaymentParam paymentParam, Privilege privilege, boolean z, Object obj) {
            this.f100106a = purchaseType;
            this.f100107b = contract;
            this.f100108c = paymentParam;
            this.f100109d = paymentOrder;
            this.f100110e = privilege;
            this.f100111f = z;
            this.f100112g = obj;
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ Boolean m126539A(Data data) {
        if ("signing".equals(((CoreData) data.getModuleData(CoreData.class)).contract.contractStatus)) {
            return !jyb.m147479J(((CoreData) data.getModuleData(CoreData.class)).orders) ? Boolean.valueOf(TEnum.equals(((CoreData) data.getModuleData(CoreData.class)).orders.get(0).status, "success")) : Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: B */
    public static C22421c<C17027a> m126540B() {
        return f100105e.asObservable();
    }

    /* JADX INFO: renamed from: C */
    public static void m126541C(PurchaseType purchaseType) {
        if (NullChecker.m82486a(f100101a)) {
            kcg0 kcg0Var = f100101a.get(purchaseType);
            if (!NullChecker.m82486a(kcg0Var) || kcg0Var.isUnsubscribed()) {
                return;
            }
            kcg0Var.unsubscribe();
            f100101a.remove(purchaseType);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m126542D(final PurchaseType purchaseType, final Object obj) {
        l51.m152893M(new Runnable() { // from class: l.bp60
            @Override // java.lang.Runnable
            public final void run() {
                fp60.m126568r(purchaseType, obj);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static C22421c<PaymentResultWrapper> m126543E() {
        return f100103c.mergeWith(m126545G());
    }

    /* JADX INFO: renamed from: F */
    public static void m126544F() {
        if (NullChecker.m82486a(f100101a)) {
            Iterator<Object> it = f100101a.keySet().iterator();
            while (it.hasNext()) {
                kcg0 kcg0Var = f100101a.get(it.next());
                if (NullChecker.m82486a(kcg0Var) && !kcg0Var.isUnsubscribed()) {
                    kcg0Var.unsubscribe();
                }
            }
            f100101a.clear();
        }
    }

    /* JADX INFO: renamed from: G */
    public static C22421c<PaymentResultWrapper> m126545G() {
        return f100102b.asObservable();
    }

    /* JADX INFO: renamed from: H */
    public static void m126546H(final String str, final fj1 fj1Var) {
        Map<Object, kcg0> map = f100101a;
        if (map == null) {
            f100101a = new HashMap();
        } else {
            kcg0 kcg0Var = map.get(str);
            if (NullChecker.m82486a(kcg0Var) && !kcg0Var.isUnsubscribed()) {
                kcg0Var.unsubscribe();
                f100101a.remove(str);
            }
        }
        f100101a.put(str, C22421c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(6).observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.eo60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20333O0.m31078o3(str).map(new qcj() { // from class: l.cp60
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return jyb.m147494Y(l, (PaymentOrder) obj2);
                    }
                });
            }
        }).takeUntil((qcj<? super R, Boolean>) new qcj() { // from class: l.po60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fp60.m126571u(fj1Var, (pf60) obj);
            }
        }).doOnCompleted(new x20() { // from class: l.xo60
            @Override // p153l.x20
            public final void call() {
                fp60.m126556f(fj1Var);
            }
        }).subscribe(psd0.m173591B()));
    }

    /* JADX INFO: renamed from: I */
    public static void m126547I(final String str, final fj1 fj1Var) {
        Map<Object, kcg0> map = f100101a;
        if (map == null) {
            f100101a = new HashMap();
        } else {
            kcg0 kcg0Var = map.get(str);
            if (NullChecker.m82486a(kcg0Var) && !kcg0Var.isUnsubscribed()) {
                kcg0Var.unsubscribe();
                f100101a.remove(str);
            }
        }
        f100101a.put(str, C22421c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(5).observeOn(fo0.m126432a()).flatMap(new qcj() { // from class: l.so60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20333O0.m31081r3(str).map(new qcj() { // from class: l.wo60
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return jyb.m147494Y(l, (PaymentOrder) obj2);
                    }
                });
            }
        }).takeUntil((qcj<? super R, Boolean>) new qcj() { // from class: l.to60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fp60.m126576z(fj1Var, (pf60) obj);
            }
        }).doOnCompleted(new x20() { // from class: l.uo60
            @Override // p153l.x20
            public final void call() {
                fp60.m126564n(fj1Var);
            }
        }).subscribe(psd0.m173591B()));
    }

    /* JADX INFO: renamed from: J */
    public static void m126548J(final PurchaseType purchaseType, final SignPaymentParam signPaymentParam, final Privilege privilege, final int i, final Object obj) {
        final String str = signPaymentParam.contractId;
        final String str2 = "contract_" + str;
        kcg0 kcg0VarSubscribe = Act.foreground().filter(new qcj() { // from class: l.ko60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return Boolean.valueOf(((Act.C4450r) obj2) != null);
            }
        }).skip(1).take(1).flatMap(new qcj() { // from class: l.lo60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return C22421c.interval(2L, 5L, TimeUnit.SECONDS).onBackpressureDrop().take(i);
            }
        }).flatMap(new qcj() { // from class: l.mo60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return CoreModule.f18264c.f20396j0.m31590H5(str);
            }
        }).takeUntil(new qcj() { // from class: l.no60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return fp60.m126539A((Data) obj2);
            }
        }).doOnCompleted(new x20() { // from class: l.oo60
            @Override // p153l.x20
            public final void call() {
                fp60.m126555e(str2);
            }
        }).last().subscribe(psd0.m173597H(new y20() { // from class: l.qo60
            @Override // p153l.y20
            public final void call(Object obj2) {
                SignPaymentParam signPaymentParam2 = signPaymentParam;
                Data data = (Data) obj2;
                fp60.f100105e.m137019l(new fp60.C17027a(purchaseType, ((CoreData) data.getModuleData(CoreData.class)).contract, jyb.m147479J(((CoreData) data.getModuleData(CoreData.class)).orders) ? null : ((CoreData) data.getModuleData(CoreData.class)).orders.get(0), signPaymentParam2, privilege, "signing".equals(((CoreData) data.getModuleData(CoreData.class)).contract.contractStatus) && (signPaymentParam2.delayCharge || jyb.m147479J(((CoreData) data.getModuleData(CoreData.class)).orders) || TEnum.equals(((CoreData) data.getModuleData(CoreData.class)).orders.get(0).status, "success")), obj));
            }
        }, new y20() { // from class: l.ro60
            @Override // p153l.y20
            public final void call(Object obj2) {
                fp60.m126558h(str2, (Throwable) obj2);
            }
        }));
        Map<Object, kcg0> map = f100101a;
        if (map == null) {
            f100101a = new HashMap();
        } else {
            kcg0 kcg0Var = map.get(str2);
            if (NullChecker.m82486a(kcg0Var)) {
                if (!kcg0Var.isUnsubscribed()) {
                    kcg0Var.unsubscribe();
                }
                f100101a.remove(str2);
            }
        }
        f100101a.put(str2, kcg0VarSubscribe);
    }

    /* JADX INFO: renamed from: K */
    public static void m126549K(final PurchaseType purchaseType, final Object obj) {
        final hp60 hp60Var = new hp60(purchaseType, null);
        C22421c.interval(1L, 5L, TimeUnit.SECONDS).take(6).takeUntil(hp60Var.m136479a().map(new qcj() { // from class: l.yo60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return fp60.m126559i(purchaseType, obj, (uxj0) obj2);
            }
        })).compose(psd0.m173592C()).doOnNext(new y20() { // from class: l.zo60
            @Override // p153l.y20
            public final void call(Object obj2) {
                hp60Var.m136481d();
            }
        }).doOnCompleted(new x20() { // from class: l.ap60
            @Override // p153l.x20
            public final void call() {
                hp60Var.m136480c();
            }
        }).subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: L */
    public static void m126550L(final PurchaseType purchaseType, mdf0 mdf0Var, final Object obj, boolean z) {
        int i;
        int i2;
        int i3;
        final hp60 hp60Var = new hp60(purchaseType, mdf0Var);
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
        kcg0 kcg0VarSubscribe = Act.foreground().filter(new qcj() { // from class: l.dp60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return Boolean.valueOf(((Act.C4450r) obj2) != null);
            }
        }).skip(1).take(1).flatMap(new qcj() { // from class: l.ep60
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return C22421c.interval(i4, i5, TimeUnit.MILLISECONDS).onBackpressureDrop().take(i6).takeUntil(hp60Var.m136479a().map(new qcj() { // from class: l.vo60
                    @Override // p153l.qcj
                    public final Object call(Object obj3) {
                        return fp60.m126574x(purchaseType, obj, (uxj0) obj3);
                    }
                })).compose(psd0.m173592C());
            }
        }).doOnNext(new y20() { // from class: l.fo60
            @Override // p153l.y20
            public final void call(Object obj2) {
                hp60Var.m136481d();
            }
        }).doOnCompleted(new x20() { // from class: l.go60
            @Override // p153l.x20
            public final void call() {
                hp60Var.m136480c();
            }
        }).subscribe(psd0.m173591B());
        Map<Object, kcg0> map = f100101a;
        if (map == null) {
            f100101a = new HashMap();
        } else {
            kcg0 kcg0Var = map.get(purchaseType);
            if (NullChecker.m82486a(kcg0Var) && !kcg0Var.isUnsubscribed()) {
                kcg0Var.unsubscribe();
                f100101a.remove(purchaseType);
            }
        }
        f100101a.put(purchaseType, kcg0VarSubscribe);
        if (gta.m132210e().m132214d().mo34716K4()) {
            if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_VIP) {
                kcg0 kcg0Var2 = f100101a.get("querymerchandise");
                if (NullChecker.m82486a(kcg0Var2) && !kcg0Var2.isUnsubscribed()) {
                    kcg0Var2.unsubscribe();
                    f100101a.remove("querymerchandise");
                }
                f100101a.put("querymerchandise", Act.foreground().filter(new dj20()).skip(1).take(1).delay(5L, TimeUnit.SECONDS).subscribe(psd0.m173598I(new y20() { // from class: l.ho60
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        gta.m132210e().m132214d().mo34963zk();
                    }
                }, new y20() { // from class: l.io60
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        fp60.f100101a.remove("querymerchandise");
                    }
                }, new x20() { // from class: l.jo60
                    @Override // p153l.x20
                    public final void call() {
                        fp60.f100101a.remove("querymerchandise");
                    }
                })));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m126555e(String str) {
        if (NullChecker.m82486a(f100101a)) {
            f100101a.remove(str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m126556f(fj1 fj1Var) {
        bn60.m105331N();
        xl60.m211494B(fj1Var.f99288c);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m126558h(String str, Throwable th) {
        if (NullChecker.m82486a(f100101a)) {
            f100101a.remove(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ uxj0 m126559i(PurchaseType purchaseType, Object obj, uxj0 uxj0Var) {
        f100103c.m137019l(new PaymentResultWrapper(purchaseType, obj));
        return uxj0Var;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m126564n(fj1 fj1Var) {
        xl60.m211494B(fj1Var.f99288c);
        CoreModule.f18264c.f20333O0.m31072B3();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m126568r(PurchaseType purchaseType, Object obj) {
        CoreModule.f18264c.f20396j0.m31600M5(true);
        f100103c.m137019l(new PaymentResultWrapper(purchaseType, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ Boolean m126571u(fj1 fj1Var, pf60 pf60Var) {
        PaymentOrder paymentOrder = (PaymentOrder) pf60Var.f152157b;
        PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
        boolean z = NullChecker.m82486a(paymentOrder) && (TEnum.equals(paymentOrderStatus, "success") || TEnum.equals(paymentOrderStatus, "failed") || TEnum.equals(paymentOrderStatus, "pending"));
        if (z || ((Long) pf60Var.f152156a).longValue() == 5) {
            if (TEnum.equals(paymentOrderStatus, "success")) {
                m126542D(fj1Var.f99288c, fj1Var.f99290e);
            } else if (NullChecker.m82486a(fj1Var)) {
                f100104d.m137019l(fj1Var);
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ uxj0 m126574x(PurchaseType purchaseType, Object obj, uxj0 uxj0Var) {
        PaymentResultWrapper paymentResultWrapper = new PaymentResultWrapper(purchaseType, obj);
        paymentResultWrapper.fromSign = true;
        if (gta.m132210e().m132214d().mo34756U()) {
            CoreModule.f18264c.f20333O0.m31073C3();
        }
        f100102b.m137019l(paymentResultWrapper);
        return uxj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m126576z(fj1 fj1Var, pf60 pf60Var) {
        PaymentOrder paymentOrder = (PaymentOrder) pf60Var.f152157b;
        if (!NullChecker.m82486a(paymentOrder)) {
            if (((Long) pf60Var.f152156a).longValue() != 4 || !NullChecker.m82486a(fj1Var)) {
                return Boolean.FALSE;
            }
            f100104d.m137019l(fj1Var);
            return Boolean.TRUE;
        }
        PaymentOrderStatus paymentOrderStatus = paymentOrder.status;
        boolean z = NullChecker.m82486a(paymentOrder) && (TEnum.equals(paymentOrderStatus, "success") || TEnum.equals(paymentOrderStatus, "failed") || TEnum.equals(paymentOrderStatus, "pending"));
        if (z || ((Long) pf60Var.f152156a).longValue() == 4) {
            if (TEnum.equals(paymentOrderStatus, "success")) {
                bn60.m105331N();
                o1j0.m165649w(R$string.f28056K7);
                if (NullChecker.m82486a(fj1Var)) {
                    m126542D(fj1Var.f99288c, fj1Var.f99290e);
                }
            } else if (NullChecker.m82486a(fj1Var)) {
                f100104d.m137019l(fj1Var);
            }
        }
        return Boolean.valueOf(z);
    }
}
