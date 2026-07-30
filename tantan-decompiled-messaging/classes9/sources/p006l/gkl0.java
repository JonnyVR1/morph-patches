package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
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
import l.gq30;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.n3b0;
import l.ok3;
import l.roj0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.y8p;
import l.y9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gkl0 extends jq2<all0> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<PurchaseType> f13347c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, d.a> f13348a;

    /* JADX INFO: renamed from: b */
    public c4g0 f13349b;

    public gkl0(mcr mcrVar) {
        super(mcrVar);
        this.f13348a = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m15817A0(c cVar) {
        if (cVar == c.i) {
            CoreModule.f1534c.f3676u0.m2357a7(0L, CoreLikers.LikersTriggerBy.my_privilege_liker);
            CoreModule.f1534c.f3544C0.m27420u4();
            m15821H0();
            ((all0) ((jq2) this).viewModel).m11973b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m15818E0(long j, Long l2) {
        if (CoreModule.f1534c.f3643j0.m2532Q4()) {
            ((all0) ((jq2) this).viewModel).m11968L0(zck0.m28688a(j, true, true, true, true));
        } else {
            mkd0.z(this.f13349b);
            ((all0) ((jq2) this).viewModel).m11976e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ rx.c m15819F0(final PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.fromSign) {
            return rx.c.just(paymentResultWrapper);
        }
        e51.H(act(), new Runnable() { // from class: l.vjl0
            @Override // java.lang.Runnable
            public final void run() {
                gkl0.m15835p0();
            }
        }, 1000L);
        return CoreModule.f1534c.f3544C0.m27422x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.wjl0
            public final Object call(Object obj) {
                return gkl0.m15828i0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m15820G0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType;
        s7m s7mVar = ((jq2) this).viewModel;
        if (s7mVar == null || ((jq2) this).lifecycleProviderImpl == null) {
            return;
        }
        if (paymentResultWrapper != null && (purchaseType = paymentResultWrapper.purchaseType) != null) {
            ((all0) s7mVar).m11969M0(purchaseType);
        }
        ((all0) ((jq2) this).viewModel).m11967J0();
    }

    /* JADX INFO: renamed from: H0 */
    private void m15821H0() {
        if (u59.m24985W()) {
            y8p.d().g(this, (d30) null);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m15822I0() {
        f13347c.clear();
    }

    /* JADX INFO: renamed from: J0 */
    private static void m15823J0() {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            boolean z = userM21490p9.isVIP() && !n3b0.q();
            if (z) {
                ArrayList<PurchaseType> arrayListM15838t0 = m15838t0();
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM15838t0.contains(purchaseType) && !userM21490p9.isSVIP()) {
                    m15838t0().remove(purchaseType);
                    return;
                }
            }
            if (u59.m24981S()) {
                if (!z || userM21490p9.isSVIP()) {
                    ArrayList<PurchaseType> arrayListM15838t1 = m15838t0();
                    PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (arrayListM15838t1.contains(purchaseType2)) {
                        return;
                    }
                    m15838t0().add(purchaseType2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ PaymentResultWrapper m15828i0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Boolean m15830k0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m15835p0() {
        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
        CoreModule.f1534c.f3544C0.m27420u4();
    }

    /* JADX INFO: renamed from: q0 */
    public static int m15836q0() {
        m15839u0();
        return f13347c.indexOf(PurchaseType.TYPE_GET_VIP);
    }

    /* JADX INFO: renamed from: s0 */
    public static int m15837s0(PurchaseType purchaseType) {
        m15839u0();
        if (vwb.J(f13347c) || !f13347c.contains(purchaseType)) {
            return 0;
        }
        return f13347c.indexOf(purchaseType);
    }

    /* JADX INFO: renamed from: t0 */
    public static ArrayList<PurchaseType> m15838t0() {
        return f13347c;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m15839u0() {
        f13347c.clear();
        f13347c.add(PurchaseType.TYPE_GET_VIP);
        f13347c.add(PurchaseType.TYPE_GET_LIKERS);
        m15823J0();
        if (u59.m24983U()) {
            f13347c.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ boolean m15840z0(int i, int i2, Intent intent) {
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

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m15841C0(roj0 roj0Var) {
        ((all0) ((jq2) this).viewModel).m11967J0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m15842D0(User user) {
        ((all0) ((jq2) this).viewModel).m11967J0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m15843L0(PurchaseType purchaseType, d.a aVar) {
        this.f13348a.put(purchaseType, aVar);
    }

    /* JADX INFO: renamed from: r0 */
    public d.a m15844r0(PurchaseType purchaseType) {
        return this.f13348a.get(purchaseType);
    }

    /* JADX INFO: renamed from: x0 */
    public void m15845x0() {
        VipNewUiFrag vipNewUiFrag = ((jq2) this).lifecycleProviderImpl;
        if (vipNewUiFrag instanceof VipNewUiFrag) {
            vipNewUiFrag.t4(new a.a() { // from class: l.ujl0
                /* JADX INFO: renamed from: a */
                public final boolean m25250a(int i, int i2, Intent intent) {
                    return this.f23578a.m15840z0(i, i2, intent);
                }
            });
        }
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.yjl0
            public final void call(Object obj) {
                this.f28251a.m15817A0((c) obj);
            }
        }));
        this.f13348a.clear();
        if (CoreModule.f1534c.f3643j0.m2532Q4()) {
            final long j = CoreModule.f1534c.f3643j0.m2504C4().endTime * 1000;
            this.f13349b = duringCreated(rx.c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.zjl0
                public final void call(Object obj) {
                    this.f28781a.m15818E0(j, (Long) obj);
                }
            }));
        }
        duringCreated(ah60.E().filter(new w9j() { // from class: l.akl0
            public final Object call(Object obj) {
                return gkl0.m15830k0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.bkl0
            public final Object call(Object obj) {
                return this.f8961a.m15819F0((PaymentResultWrapper) obj);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.ckl0
            public final void call(Object obj) {
                this.f9705a.m15820G0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(rx.c.combineLatest(CoreModule.f1534c.f3628e0.m21486o9().map(new gq30()).distinctUntilChanged(), CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("seeWhoLikedMe")), CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.dkl0
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m27355L3());
            }
        }).distinctUntilChanged(), new y9j() { // from class: l.ekl0
            /* JADX INFO: renamed from: a */
            public final Object m14638a(Object obj, Object obj2, Object obj3) {
                return roj0.a;
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.fkl0
            public final void call(Object obj) {
                this.f12747a.m15841C0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.xjl0
            public final void call(Object obj) {
                this.f27554a.m15842D0((User) obj);
            }
        }));
        if (u9p.INSTANCE.m25159t()) {
            CoreModule.f1534c.f3561H2.m24530j3();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m15846y0() {
        int iIndexOf = f13347c.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iIndexOf >= 0) {
            ((all0) ((jq2) this).viewModel).m11979l0(iIndexOf);
        }
    }

    public void destroy() {
    }
}
