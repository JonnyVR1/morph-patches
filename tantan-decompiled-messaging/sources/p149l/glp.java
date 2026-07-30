package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class glp extends jq2<amp> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<PurchaseType> f103389c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, C8765d.a> f103390a;

    /* JADX INFO: renamed from: b */
    public c4g0 f103391b;

    public glp(mcr mcrVar) {
        super(mcrVar);
        this.f103390a = new HashMap<>();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m126889E0() {
        f103389c.clear();
    }

    /* JADX INFO: renamed from: F0 */
    public static void m126890F0() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            boolean z = userM169527p9.isVIP() && !n3b0.m157742q();
            if (z) {
                ArrayList<PurchaseType> arrayListM126902q0 = m126902q0();
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM126902q0.contains(purchaseType) && !userM169527p9.isSVIP()) {
                    m126902q0().remove(purchaseType);
                    return;
                }
            }
            if (u59.m191810S()) {
                if (!z || userM169527p9.isSVIP()) {
                    ArrayList<PurchaseType> arrayListM126902q1 = m126902q0();
                    PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (arrayListM126902q1.contains(purchaseType2)) {
                        return;
                    }
                    m126902q0().add(purchaseType2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m126892f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ Boolean m126893g0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ PaymentResultWrapper m126895i0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m126899m0() {
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: o0 */
    private void m126901o0() {
        duringCreated(ugc0.m193536c()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.elp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92134a.m126911u0((RecentContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.flp
            @Override // p149l.e30
            public final void call(Object obj) {
                glp.m126892f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList<PurchaseType> m126902q0() {
        return f103389c;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX INFO: renamed from: r0 */
    public static void m126903r0() {
        ArrayList<PurchaseType> arrayListM126902q0;
        PurchaseType purchaseType;
        f103389c.clear();
        ArrayList<PurchaseType> arrayList = f103389c;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
        arrayList.add(purchaseType2);
        ArrayList<PurchaseType> arrayList2 = f103389c;
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
        arrayList2.add(purchaseType3);
        m126890F0();
        if (u59.m191812U()) {
            f103389c.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            boolean zIsVIP = userM169527p9.isVIP();
            userM169527p9.isSVIP();
            boolean z = zIsVIP && !n3b0.m157742q();
            xma.m210047L3();
            xma.m210040C3();
            if (z) {
                ArrayList<PurchaseType> arrayListM126902q1 = m126902q0();
                PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM126902q1.contains(purchaseType4) && !userM169527p9.isSVIP()) {
                    m126902q0().remove(purchaseType4);
                } else if (u59.m191810S() && (!z || userM169527p9.isSVIP())) {
                    arrayListM126902q0 = m126902q0();
                    purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (!arrayListM126902q0.contains(purchaseType)) {
                        m126902q0().add(purchaseType);
                    }
                }
            } else if (u59.m191810S()) {
                arrayListM126902q0 = m126902q0();
                purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (!arrayListM126902q0.contains(purchaseType)) {
                    m126902q0().add(purchaseType);
                }
            }
            if (!userM169527p9.isVIP() && !n3b0.m157742q()) {
                f103389c.remove(purchaseType2);
            }
        }
        if (xma.m210047L3()) {
            f103389c.remove(purchaseType2);
            f103389c.remove(purchaseType3);
        }
        if (xma.m210040C3()) {
            f103389c.remove(purchaseType2);
            f103389c.remove(purchaseType3);
            f103389c.remove(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ C22306c m126904A0(final PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.fromSign) {
            return C22306c.just(paymentResultWrapper);
        }
        e51.m114743H(act(), new Runnable() { // from class: l.clp
            @Override // java.lang.Runnable
            public final void run() {
                glp.m126899m0();
            }
        }, 1000L);
        return CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.dlp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return glp.m126895i0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m126905C0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType;
        V v2 = this.viewModel;
        if (v2 == 0 || this.lifecycleProviderImpl == null) {
            return;
        }
        if (paymentResultWrapper != null && (purchaseType = paymentResultWrapper.purchaseType) != null) {
            ((amp) v2).m97643X0(purchaseType);
        }
        ((amp) this.viewModel).m97640U0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m126906D0() {
        if (u59.m191814W()) {
            y8p.m213413d().m213420g(this, null);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m126907G0(PurchaseType purchaseType, C8765d.a aVar) {
        this.f103390a.put(purchaseType, aVar);
    }

    /* JADX INFO: renamed from: p0 */
    public C8765d.a m126908p0(PurchaseType purchaseType) {
        return this.f103390a.get(purchaseType);
    }

    /* JADX INFO: renamed from: s0 */
    public void m126909s0() {
        mcr mcrVar = this.lifecycleProviderImpl;
        if (mcrVar instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) mcrVar).m20600t4(new C4317a.a() { // from class: l.wkp
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return this.f186796a.m126912x0(i, i2, intent);
                }
            });
        }
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xkp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193333a.m126913y0((C4319c) obj);
            }
        }));
        this.f103390a.clear();
        if (CoreModule.f17545c.f19654j0.m30604Q4() && !u59.m191817Z()) {
            final long j = CoreModule.f17545c.f19654j0.m30576C4().endTime * 1000;
            this.f103391b = duringCreated(C22306c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ykp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198790a.m126914z0(j, (Long) obj);
                }
            }));
        }
        duringCreated(ah60.m96370E()).filter(new w9j() { // from class: l.zkp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return glp.m126893g0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.alp
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70478a.m126904A0((PaymentResultWrapper) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.blp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76201a.m126905C0((PaymentResultWrapper) obj);
            }
        }));
        if (u9p.INSTANCE.m192617t()) {
            CoreModule.f17545c.f19572H2.m187615j3();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m126910t0() {
        int iIndexOf = f103389c.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iIndexOf >= 0) {
            ((amp) this.viewModel).m97670v0(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m126911u0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((amp) v2).m97639T0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ boolean m126912x0(int i, int i2, Intent intent) {
        if (i == 1012 && intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
            if (TextUtils.isEmpty(string)) {
                lsi0.m151595y("二维码信息有误，请重试");
                return false;
            }
            ok3.m164815N(act(), string);
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m126913y0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            CoreModule.f17545c.f19687u0.m30429a7(0L, CoreLikers.LikersTriggerBy.my_privilege_liker);
            CoreModule.f17545c.f19555C0.m210112u4();
            m126906D0();
            m126901o0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m126914z0(long j, Long l2) {
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            ((amp) this.viewModel).m97642W0(zck0.m218065a(j, true, true, true, true));
        } else {
            mkd0.m154992z(this.f103391b);
            ((amp) this.viewModel).m97664o0();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
