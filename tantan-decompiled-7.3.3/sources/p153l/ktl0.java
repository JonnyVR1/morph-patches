package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class ktl0 extends ar2<eul0> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<PurchaseType> f128715c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, C8928d.a> f128716a;

    /* JADX INFO: renamed from: b */
    public kcg0 f128717b;

    public ktl0(ner nerVar) {
        super(nerVar);
        this.f128716a = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m151360A0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            CoreModule.f18264c.f20429u0.m31439e7(0L, CoreLikers.LikersTriggerBy.my_privilege_liker);
            CoreModule.f18264c.f20297C0.m146425v4();
            m151364H0();
            ((eul0) this.viewModel).m122665b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m151361E0(long j, Long l2) {
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            ((eul0) this.viewModel).m122660L0(fmk0.m126240a(j, true, true, true, true));
        } else {
            psd0.m173633z(this.f128717b);
            ((eul0) this.viewModel).m122668e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ C22421c m151362F0(final PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.fromSign) {
            return C22421c.just(paymentResultWrapper);
        }
        l51.m152888H(act(), new Runnable() { // from class: l.zsl0
            @Override // java.lang.Runnable
            public final void run() {
                ktl0.m151378p0();
            }
        }, 1000L);
        return CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.atl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ktl0.m151371i0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m151363G0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType;
        V v2 = this.viewModel;
        if (v2 == 0 || this.lifecycleProviderImpl == null) {
            return;
        }
        if (paymentResultWrapper != null && (purchaseType = paymentResultWrapper.purchaseType) != null) {
            ((eul0) v2).m122661M0(purchaseType);
        }
        ((eul0) this.viewModel).m122659J0();
    }

    /* JADX INFO: renamed from: H0 */
    private void m151364H0() {
        if (d79.m114665X()) {
            yap.m214902d().m214909g(this, null);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m151365I0() {
        f128715c.clear();
    }

    /* JADX INFO: renamed from: J0 */
    private static void m151366J0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            boolean z = userM116600p9.isVIP() && !rbb0.m180744q();
            if (z) {
                ArrayList<PurchaseType> arrayListM151381t0 = m151381t0();
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM151381t0.contains(purchaseType) && !userM116600p9.isSVIP()) {
                    m151381t0().remove(purchaseType);
                    return;
                }
            }
            if (d79.m114661T()) {
                if (!z || userM116600p9.isSVIP()) {
                    ArrayList<PurchaseType> arrayListM151381t1 = m151381t0();
                    PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (arrayListM151381t1.contains(purchaseType2)) {
                        return;
                    }
                    m151381t0().add(purchaseType2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ PaymentResultWrapper m151371i0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Boolean m151373k0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m151378p0() {
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: q0 */
    public static int m151379q0() {
        m151382u0();
        return f128715c.indexOf(PurchaseType.TYPE_GET_VIP);
    }

    /* JADX INFO: renamed from: s0 */
    public static int m151380s0(PurchaseType purchaseType) {
        m151382u0();
        if (jyb.m147479J(f128715c) || !f128715c.contains(purchaseType)) {
            return 0;
        }
        return f128715c.indexOf(purchaseType);
    }

    /* JADX INFO: renamed from: t0 */
    public static ArrayList<PurchaseType> m151381t0() {
        return f128715c;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m151382u0() {
        f128715c.clear();
        f128715c.add(PurchaseType.TYPE_GET_VIP);
        f128715c.add(PurchaseType.TYPE_GET_LIKERS);
        m151366J0();
        if (d79.m114663V()) {
            f128715c.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ boolean m151383z0(int i, int i2, Intent intent) {
        if (i == 1012 && intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
            if (TextUtils.isEmpty(string)) {
                o1j0.m165651y("二维码信息有误，请重试");
                return false;
            }
            hl3.m135671N(act(), string);
        }
        return false;
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m151384C0(uxj0 uxj0Var) {
        ((eul0) this.viewModel).m122659J0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m151385D0(User user) {
        ((eul0) this.viewModel).m122659J0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m151386L0(PurchaseType purchaseType, C8928d.a aVar) {
        this.f128716a.put(purchaseType, aVar);
    }

    /* JADX INFO: renamed from: r0 */
    public C8928d.a m151387r0(PurchaseType purchaseType) {
        return this.f128716a.get(purchaseType);
    }

    /* JADX INFO: renamed from: x0 */
    public void m151388x0() {
        ner nerVar = this.lifecycleProviderImpl;
        if (nerVar instanceof VipNewUiFrag) {
            ((VipNewUiFrag) nerVar).m21599t4(new C4468a.a() { // from class: l.ysl0
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return this.f201418a.m151383z0(i, i2, intent);
                }
            });
        }
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ctl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83710a.m151360A0((C4470c) obj);
            }
        }));
        this.f128716a.clear();
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            final long j = CoreModule.f18264c.f20396j0.m31579C4().endTime * 1000;
            this.f128717b = duringCreated(C22421c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.dtl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90605a.m151361E0(j, (Long) obj);
                }
            }));
        }
        duringCreated((C22421c) fp60.m126543E().filter(new qcj() { // from class: l.etl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ktl0.m151373k0((PaymentResultWrapper) obj);
            }
        }).switchMap(new qcj() { // from class: l.ftl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f100756a.m151362F0((PaymentResultWrapper) obj);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.gtl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106429a.m151363G0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9().map(new uy30()).distinctUntilChanged(), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("seeWhoLikedMe")), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.htl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(joa.m146361M3());
            }
        }).distinctUntilChanged(), new scj() { // from class: l.itl0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return uxj0.f181467a;
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.jtl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122601a.m151384C0((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.btl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78364a.m151385D0((User) obj);
            }
        }));
        if (ubp.INSTANCE.m195285t()) {
            CoreModule.f18264c.f20314H2.m108611j3();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m151389y0() {
        int iIndexOf = f128715c.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iIndexOf >= 0) {
            ((eul0) this.viewModel).m122670l0(iIndexOf);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
