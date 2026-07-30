package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.ah60;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.ok3;
import l.s7m;
import l.w9j;
import l.y8p;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class glp extends jq2<amp> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<PurchaseType> f13379c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, d.a> f13380a;

    /* JADX INFO: renamed from: b */
    public c4g0 f13381b;

    public glp(mcr mcrVar) {
        super(mcrVar);
        this.f13380a = new HashMap<>();
    }

    /* JADX INFO: renamed from: E0 */
    public static void m15866E0() {
        f13379c.clear();
    }

    /* JADX INFO: renamed from: F0 */
    public static void m15867F0() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            boolean z = userM21490p9.isVIP() && !n3b0.q();
            if (z) {
                ArrayList<PurchaseType> arrayListM15879q0 = m15879q0();
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM15879q0.contains(purchaseType) && !userM21490p9.isSVIP()) {
                    m15879q0().remove(purchaseType);
                    return;
                }
            }
            if (u59.m24981S()) {
                if (!z || userM21490p9.isSVIP()) {
                    ArrayList<PurchaseType> arrayListM15879q1 = m15879q0();
                    PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (arrayListM15879q1.contains(purchaseType2)) {
                        return;
                    }
                    m15879q0().add(purchaseType2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m15869f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ Boolean m15870g0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ PaymentResultWrapper m15872i0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m15876m0() {
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: o0 */
    private void m15878o0() {
        duringCreated(ugc0.m25207c()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.elp
            public final void call(Object obj) {
                this.f11243a.m15888u0((RecentContractInfosEnvelope) obj);
            }
        }, new e30() { // from class: l.flp
            public final void call(Object obj) {
                glp.m15869f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public static ArrayList<PurchaseType> m15879q0() {
        return f13379c;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX INFO: renamed from: r0 */
    public static void m15880r0() {
        ArrayList<PurchaseType> arrayListM15879q0;
        PurchaseType purchaseType;
        f13379c.clear();
        ArrayList<PurchaseType> arrayList = f13379c;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
        arrayList.add(purchaseType2);
        ArrayList<PurchaseType> arrayList2 = f13379c;
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
        arrayList2.add(purchaseType3);
        m15867F0();
        if (u59.m24983U()) {
            f13379c.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
        if (IntlCountryCodeController.m10k()) {
            return;
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            boolean zIsVIP = userM21490p9.isVIP();
            userM21490p9.isSVIP();
            boolean z = zIsVIP && !n3b0.q();
            xma.m27355L3();
            xma.m27348C3();
            if (z) {
                ArrayList<PurchaseType> arrayListM15879q1 = m15879q0();
                PurchaseType purchaseType4 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM15879q1.contains(purchaseType4) && !userM21490p9.isSVIP()) {
                    m15879q0().remove(purchaseType4);
                } else if (u59.m24981S() && (!z || userM21490p9.isSVIP())) {
                    arrayListM15879q0 = m15879q0();
                    purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (!arrayListM15879q0.contains(purchaseType)) {
                        m15879q0().add(purchaseType);
                    }
                }
            } else if (u59.m24981S()) {
                arrayListM15879q0 = m15879q0();
                purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (!arrayListM15879q0.contains(purchaseType)) {
                    m15879q0().add(purchaseType);
                }
            }
            if (!userM21490p9.isVIP() && !n3b0.q()) {
                f13379c.remove(purchaseType2);
            }
        }
        if (xma.m27355L3()) {
            f13379c.remove(purchaseType2);
            f13379c.remove(purchaseType3);
        }
        if (xma.m27348C3()) {
            f13379c.remove(purchaseType2);
            f13379c.remove(purchaseType3);
            f13379c.remove(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ c m15881A0(final PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.fromSign) {
            return c.just(paymentResultWrapper);
        }
        e51.H(act(), new Runnable() { // from class: l.clp
            @Override // java.lang.Runnable
            public final void run() {
                glp.m15876m0();
            }
        }, 1000L);
        return CoreModule.f1534c.f3544C0.m27422x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.dlp
            public final Object call(Object obj) {
                return glp.m15872i0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m15882C0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType;
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar == null || ((jq2) this).lifecycleProviderImpl == null) {
            return;
        }
        if (paymentResultWrapper != null && (purchaseType = paymentResultWrapper.purchaseType) != null) {
            ((amp) s7mVar).m12095X0(purchaseType);
        }
        ((amp) ((jq2) this).viewModel).m12092U0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m15883D0() {
        if (u59.m24985W()) {
            y8p.d().g(this, (d30) null);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m15884G0(PurchaseType purchaseType, d.a aVar) {
        this.f13380a.put(purchaseType, aVar);
    }

    /* JADX INFO: renamed from: p0 */
    public d.a m15885p0(PurchaseType purchaseType) {
        return this.f13380a.get(purchaseType);
    }

    /* JADX INFO: renamed from: s0 */
    public void m15886s0() {
        IntlVipNewUiFrag intlVipNewUiFrag = ((jq2) this).lifecycleProviderImpl;
        if (intlVipNewUiFrag instanceof IntlVipNewUiFrag) {
            intlVipNewUiFrag.t4(new a.a() { // from class: l.wkp
                /* JADX INFO: renamed from: a */
                public final boolean m26414a(int i, int i2, Intent intent) {
                    return this.f25205a.m15889x0(i, i2, intent);
                }
            });
        }
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.xkp
            public final void call(Object obj) {
                this.f27574a.m15890y0((com.p1.mobile.android.app.c) obj);
            }
        }));
        this.f13380a.clear();
        if (CoreModule.f1534c.f3643j0.m2532Q4() && !u59.m24988Z()) {
            final long j = CoreModule.f1534c.f3643j0.m2504C4().endTime * 1000;
            this.f13381b = duringCreated(c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ykp
                public final void call(Object obj) {
                    this.f28276a.m15891z0(j, (Long) obj);
                }
            }));
        }
        duringCreated(ah60.E()).filter(new w9j() { // from class: l.zkp
            public final Object call(Object obj) {
                return glp.m15870g0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.alp
            public final Object call(Object obj) {
                return this.f8347a.m15881A0((PaymentResultWrapper) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.blp
            public final void call(Object obj) {
                this.f8977a.m15882C0((PaymentResultWrapper) obj);
            }
        }));
        if (u9p.INSTANCE.m25159t()) {
            CoreModule.f1534c.f3561H2.m24530j3();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m15887t0() {
        int iIndexOf = f13379c.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iIndexOf >= 0) {
            ((amp) ((jq2) this).viewModel).m12123v0(iIndexOf);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m15888u0(RecentContractInfosEnvelope recentContractInfosEnvelope) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar != null) {
            ((amp) s7mVar).m12091T0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ boolean m15889x0(int i, int i2, Intent intent) {
        if (i == 1012 && intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
            if (TextUtils.isEmpty(string)) {
                lsi0.y("二维码信息有误，请重试");
                return false;
            }
            ok3.N(act(), string);
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m15890y0(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            CoreModule.f1534c.f3676u0.m2357a7(0L, CoreLikers.LikersTriggerBy.my_privilege_liker);
            CoreModule.f1534c.f3544C0.m27420u4();
            m15883D0();
            m15878o0();
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m15891z0(long j, Long l2) {
        if (CoreModule.f1534c.f3643j0.m2532Q4()) {
            ((amp) ((jq2) this).viewModel).m12094W0(zck0.m28688a(j, true, true, true, true));
        } else {
            mkd0.z(this.f13381b);
            ((amp) ((jq2) this).viewModel).m12117o0();
        }
    }

    public void destroy() {
    }
}
