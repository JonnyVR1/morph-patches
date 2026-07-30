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
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUiFrag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class gkl0 extends jq2<all0> {

    /* JADX INFO: renamed from: c */
    public static ArrayList<PurchaseType> f103205c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, C8765d.a> f103206a;

    /* JADX INFO: renamed from: b */
    public c4g0 f103207b;

    public gkl0(mcr mcrVar) {
        super(mcrVar);
        this.f103206a = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m126635A0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            CoreModule.f17545c.f19687u0.m30429a7(0L, CoreLikers.LikersTriggerBy.my_privilege_liker);
            CoreModule.f17545c.f19555C0.m210112u4();
            m126639H0();
            ((all0) this.viewModel).m97401b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m126636E0(long j, Long l2) {
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            ((all0) this.viewModel).m97396L0(zck0.m218065a(j, true, true, true, true));
        } else {
            mkd0.m154992z(this.f103207b);
            ((all0) this.viewModel).m97404e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public /* synthetic */ C22306c m126637F0(final PaymentResultWrapper paymentResultWrapper) {
        if (paymentResultWrapper.fromSign) {
            return C22306c.just(paymentResultWrapper);
        }
        e51.m114743H(act(), new Runnable() { // from class: l.vjl0
            @Override // java.lang.Runnable
            public final void run() {
                gkl0.m126653p0();
            }
        }, 1000L);
        return CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.wjl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gkl0.m126646i0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m126638G0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType;
        V v2 = this.viewModel;
        if (v2 == 0 || this.lifecycleProviderImpl == null) {
            return;
        }
        if (paymentResultWrapper != null && (purchaseType = paymentResultWrapper.purchaseType) != null) {
            ((all0) v2).m97397M0(purchaseType);
        }
        ((all0) this.viewModel).m97395J0();
    }

    /* JADX INFO: renamed from: H0 */
    private void m126639H0() {
        if (u59.m191814W()) {
            y8p.m213413d().m213420g(this, null);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m126640I0() {
        f103205c.clear();
    }

    /* JADX INFO: renamed from: J0 */
    private static void m126641J0() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            boolean z = userM169527p9.isVIP() && !n3b0.m157742q();
            if (z) {
                ArrayList<PurchaseType> arrayListM126656t0 = m126656t0();
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayListM126656t0.contains(purchaseType) && !userM169527p9.isSVIP()) {
                    m126656t0().remove(purchaseType);
                    return;
                }
            }
            if (u59.m191810S()) {
                if (!z || userM169527p9.isSVIP()) {
                    ArrayList<PurchaseType> arrayListM126656t1 = m126656t0();
                    PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                    if (arrayListM126656t1.contains(purchaseType2)) {
                        return;
                    }
                    m126656t0().add(purchaseType2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ PaymentResultWrapper m126646i0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Boolean m126648k0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_GET_LIKERS || purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m126653p0() {
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: q0 */
    public static int m126654q0() {
        m126657u0();
        return f103205c.indexOf(PurchaseType.TYPE_GET_VIP);
    }

    /* JADX INFO: renamed from: s0 */
    public static int m126655s0(PurchaseType purchaseType) {
        m126657u0();
        if (vwb.m200296J(f103205c) || !f103205c.contains(purchaseType)) {
            return 0;
        }
        return f103205c.indexOf(purchaseType);
    }

    /* JADX INFO: renamed from: t0 */
    public static ArrayList<PurchaseType> m126656t0() {
        return f103205c;
    }

    /* JADX INFO: renamed from: u0 */
    public static void m126657u0() {
        f103205c.clear();
        f103205c.add(PurchaseType.TYPE_GET_VIP);
        f103205c.add(PurchaseType.TYPE_GET_LIKERS);
        m126641J0();
        if (u59.m191812U()) {
            f103205c.add(PurchaseType.TYPE_ULTRA_PREMIUM);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ boolean m126658z0(int i, int i2, Intent intent) {
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

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m126659C0(roj0 roj0Var) {
        ((all0) this.viewModel).m97395J0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m126660D0(User user) {
        ((all0) this.viewModel).m97395J0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m126661L0(PurchaseType purchaseType, C8765d.a aVar) {
        this.f103206a.put(purchaseType, aVar);
    }

    /* JADX INFO: renamed from: r0 */
    public C8765d.a m126662r0(PurchaseType purchaseType) {
        return this.f103206a.get(purchaseType);
    }

    /* JADX INFO: renamed from: x0 */
    public void m126663x0() {
        mcr mcrVar = this.lifecycleProviderImpl;
        if (mcrVar instanceof VipNewUiFrag) {
            ((VipNewUiFrag) mcrVar).m20600t4(new C4317a.a() { // from class: l.ujl0
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return this.f176780a.m126658z0(i, i2, intent);
                }
            });
        }
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.yjl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198640a.m126635A0((C4319c) obj);
            }
        }));
        this.f103206a.clear();
        if (CoreModule.f17545c.f19654j0.m30604Q4()) {
            final long j = CoreModule.f17545c.f19654j0.m30576C4().endTime * 1000;
            this.f103207b = duringCreated(C22306c.interval(0L, 1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zjl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203428a.m126636E0(j, (Long) obj);
                }
            }));
        }
        duringCreated((C22306c) ah60.m96370E().filter(new w9j() { // from class: l.akl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gkl0.m126648k0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.bkl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76054a.m126637F0((PaymentResultWrapper) obj);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.ckl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81344a.m126638G0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9().map(new gq30()).distinctUntilChanged(), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("seeWhoLikedMe")), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.dkl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xma.m210047L3());
            }
        }).distinctUntilChanged(), new y9j() { // from class: l.ekl0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return roj0.f160388a;
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.fkl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98081a.m126659C0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.xjl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193230a.m126660D0((User) obj);
            }
        }));
        if (u9p.INSTANCE.m192617t()) {
            CoreModule.f17545c.f19572H2.m187615j3();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m126664y0() {
        int iIndexOf = f103205c.indexOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (iIndexOf >= 0) {
            ((all0) this.viewModel).m97406l0(iIndexOf);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
