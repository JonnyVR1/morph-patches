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
import com.p051p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class gnp extends ar2<aop> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<PurchaseType> f105128c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, C8928d.a> f105129a;

    /* JADX INFO: renamed from: b */
    public kcg0 f105130b;

    public gnp(ner nerVar) {
        super(nerVar);
        this.f105129a = new HashMap<>();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m130938E0() {
        f105128c.clear();
    }

    /* JADX INFO: renamed from: F0 */
    public static void m130939F0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            boolean z = userM116600p9.isVIP() && !rbb0.m180744q();
            if (z) {
                ArrayList<PurchaseType> arrayListM130951q0 = m130951q0();
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM130951q0.contains(purchaseType) && !userM116600p9.isSVIP()) {
                    m130951q0().remove(purchaseType);
                    return;
                }
            }
            if (d79.m114661T()) {
                if (!z || userM116600p9.isSVIP()) {
                    ArrayList<PurchaseType> arrayListM130951q1 = m130951q0();
                    PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (arrayListM130951q1.contains(purchaseType2)) {
                        return;
                    }
                    m130951q0().add(purchaseType2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m130941f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ Boolean m130942g0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ PaymentResultWrapper m130944i0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m130948m0() {
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: o0 */
    private void m130950o0() {
        duringCreated(bpc0.m105791c()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.enp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94801a.m130960u0((RecentContractInfosEnvelope) obj);
            }
        }, new y20() { // from class: l.fnp
            @Override // p153l.y20
            public final void call(Object obj) {
                gnp.m130941f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList<PurchaseType> m130951q0() {
        return f105128c;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX INFO: renamed from: r0 */
    public static void m130952r0() {
        ArrayList<PurchaseType> arrayListM130951q0;
        PurchaseType purchaseType;
        f105128c.clear();
        ArrayList<PurchaseType> arrayList = f105128c;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
        arrayList.add(purchaseType2);
        ArrayList<PurchaseType> arrayList2 = f105128c;
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
        arrayList2.add(purchaseType3);
        m130939F0();
        if (d79.m114663V()) {
            f105128c.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            boolean zIsVIP = userM116600p9.isVIP();
            userM116600p9.isSVIP();
            boolean z = zIsVIP && !rbb0.m180744q();
            joa.m146361M3();
            joa.m146354D3();
            if (z) {
                ArrayList<PurchaseType> arrayListM130951q1 = m130951q0();
                PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM130951q1.contains(purchaseType4) && !userM116600p9.isSVIP()) {
                    m130951q0().remove(purchaseType4);
                } else if (d79.m114661T() && (!z || userM116600p9.isSVIP())) {
                    arrayListM130951q0 = m130951q0();
                    purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (!arrayListM130951q0.contains(purchaseType)) {
                        m130951q0().add(purchaseType);
                    }
                }
            } else if (d79.m114661T()) {
                arrayListM130951q0 = m130951q0();
                purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (!arrayListM130951q0.contains(purchaseType)) {
                    m130951q0().add(purchaseType);
                }
            }
            if (!userM116600p9.isVIP() && !rbb0.m180744q()) {
                f105128c.remove(purchaseType2);
            }
        }
        if (joa.m146361M3()) {
            f105128c.remove(purchaseType2);
            f105128c.remove(purchaseType3);
        }
        if (joa.m146354D3()) {
            f105128c.remove(purchaseType2);
            f105128c.remove(purchaseType3);
            f105128c.remove(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ C22421c m130953A0(final PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.fromSign) {
            return C22421c.just(paymentResultWrapper);
        }
        l51.m152888H(act(), new Runnable() { // from class: l.cnp
            @Override // java.lang.Runnable
            public final void run() {
                gnp.m130948m0();
            }
        }, 1000L);
        return CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.dnp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gnp.m130944i0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m130954C0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType;
        V v2 = this.viewModel;
        if (v2 == 0 || this.lifecycleProviderImpl == null) {
            return;
        }
        if (paymentResultWrapper != null && (purchaseType = paymentResultWrapper.purchaseType) != null) {
            ((aop) v2).m99184X0(purchaseType);
        }
        ((aop) this.viewModel).m99181U0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m130955D0() {
        if (d79.m114665X()) {
            yap.m214902d().m214909g(this, null);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m130956G0(PurchaseType purchaseType, C8928d.a aVar) {
        this.f105129a.put(purchaseType, aVar);
    }

    /* JADX INFO: renamed from: p0 */
    public C8928d.a m130957p0(PurchaseType purchaseType) {
        return this.f105129a.get(purchaseType);
    }

    /* JADX INFO: renamed from: s0 */
    public void m130958s0() {
        ner nerVar = this.lifecycleProviderImpl;
        if (nerVar instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) nerVar).m21599t4(new C4468a.a() { // from class: l.wmp
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return this.f189818a.m130961x0(i, i2, intent);
                }
            });
        }
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.xmp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195114a.m130962y0((C4470c) obj);
            }
        }));
        this.f105129a.clear();
        if (CoreModule.f18264c.f20396j0.m31607Q4() && !d79.m114668a0()) {
            final long j = CoreModule.f18264c.f20396j0.m31579C4().endTime * 1000;
            this.f105130b = duringCreated(C22421c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.ymp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200691a.m130963z0(j, (Long) obj);
                }
            }));
        }
        duringCreated(fp60.m126543E()).filter(new qcj() { // from class: l.zmp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gnp.m130942g0((PaymentResultWrapper) obj);
            }
        }).switchMap(new qcj() { // from class: l.anp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72370a.m130953A0((PaymentResultWrapper) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.bnp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77569a.m130954C0((PaymentResultWrapper) obj);
            }
        }));
        if (ubp.INSTANCE.m195285t()) {
            CoreModule.f18264c.f20314H2.m108611j3();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m130959t0() {
        int iIndexOf = f105128c.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iIndexOf >= 0) {
            ((aop) this.viewModel).m99211v0(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m130960u0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((aop) v2).m99180T0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ boolean m130961x0(int i, int i2, Intent intent) {
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

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m130962y0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            CoreModule.f18264c.f20429u0.m31439e7(0L, CoreLikers.LikersTriggerBy.my_privilege_liker);
            CoreModule.f18264c.f20297C0.m146425v4();
            m130955D0();
            m130950o0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m130963z0(long j, Long l2) {
        if (CoreModule.f18264c.f20396j0.m31607Q4()) {
            ((aop) this.viewModel).m99183W0(fmk0.m126240a(j, true, true, true, true));
        } else {
            psd0.m173633z(this.f105130b);
            ((aop) this.viewModel).m99205o0();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
