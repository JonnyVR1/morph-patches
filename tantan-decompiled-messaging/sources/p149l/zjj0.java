package p149l;

import android.net.NetworkInfo;
import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.DislikedUsers;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class zjj0 extends jq2<bkj0> {

    /* JADX INFO: renamed from: a */
    public Act f203419a;

    /* JADX INFO: renamed from: b */
    public UnDoLikedUserFrag f203420b;

    /* JADX INFO: renamed from: c */
    public boolean f203421c;

    /* JADX INFO: renamed from: d */
    public Links f203422d;

    /* JADX INFO: renamed from: e */
    public boolean f203423e;

    public zjj0(UnDoLikedUserFrag unDoLikedUserFrag) {
        super(unDoLikedUserFrag);
        this.f203423e = false;
        this.f203419a = unDoLikedUserFrag.act();
        this.f203420b = unDoLikedUserFrag;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ C22306c m219098f0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22306c.just(paymentResultWrapper) : CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.yjj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zjj0.m219099g0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ PaymentResultWrapper m219099g0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Boolean m219104l0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_O_DIAMOND);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m219105m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m219109s0() {
        if (this.f203421c) {
            return;
        }
        m219116F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m219110u0(Bundle bundle) {
        ((bkj0) this.viewModel).m102407e(new d30() { // from class: l.xjj0
            @Override // p149l.d30
            public final void call() {
                this.f193226a.m219109s0();
            }
        });
        ((bkj0) this.viewModel).m102409j();
        ((bkj0) this.viewModel).m102406d(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m219111x0(NetworkInfo networkInfo) {
        m219113C0(false);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m219112A0() {
        this.f203423e = false;
    }

    /* JADX INFO: renamed from: C0 */
    public void m219113C0(boolean z) {
        CoreModule.f17545c.f19663m0.m31099f6(z ? this.f203422d : null);
    }

    /* JADX INFO: renamed from: D0 */
    public void m219114D0(DislikedUsers dislikedUsers) {
        if (this.f203420b.m46829O4().m136622N(dislikedUsers)) {
            CoreModule.f17545c.f19663m0.m31168z8(dislikedUsers.f20387id);
            if (this.f203420b.m46829O4().m136625Q() <= 0) {
                ((bkj0) this.viewModel).m102406d(false, this.f203420b.m46829O4().m136625Q() <= 0);
                ((bkj0) this.viewModel).m102411m(!this.f203421c);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m219115E0(final DislikedUsers dislikedUsers) {
        return CoreMemberModule.m36001F().m132651b().mo35997tq(this.f203419a, dislikedUsers.userInfo, true, false, false, "p_navigation_disliked,card_button_pull", new e30() { // from class: l.pjj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149808a.m219121z0(dislikedUsers, (Relationship) obj);
            }
        }, null, this.f203420b.pageId(), null, null, null);
    }

    /* JADX INFO: renamed from: F0 */
    public void m219116F0(String str) {
        if (this.f203423e) {
            return;
        }
        this.f203423e = true;
        CoreModule.m29935P().m94651a().mo33313Eq(this.f203419a, str, new d30() { // from class: l.ojj0
            @Override // p149l.d30
            public final void call() {
                this.f144299a.m219112A0();
            }
        }, Privilege.vip_undo, false, null);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f203421c = m219118r0();
        CoreModule.f17545c.f19555C0.m210115x4();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.njj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139282a.m219110u0((Bundle) obj);
            }
        }, new d30() { // from class: l.qjj0
            @Override // p149l.d30
            public final void call() {
                zjj0.m219105m0();
            }
        });
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.rjj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.sjj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164844a.m219111x0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.m29935P().m94656g().mo35022On()).filter(new w9j() { // from class: l.tjj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zjj0.m219104l0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.ujj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zjj0.m219098f0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.vjj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181736a.m219120y0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19663m0.m31103g6()).subscribe(mkd0.m154955G(new e30() { // from class: l.wjj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186657a.m219119t0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public Links m219117q0() {
        return this.f203422d;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m219118r0() {
        return !xma.m210087m4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m219119t0(j760 j760Var) {
        this.f203422d = (Links) j760Var.f116564a;
        ((bkj0) this.viewModel).m102410k((List) j760Var.f116565b, this.f203421c);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m219120y0(PaymentResultWrapper paymentResultWrapper) {
        boolean zM219118r0 = m219118r0();
        this.f203421c = zM219118r0;
        ((bkj0) this.viewModel).m102408i(zM219118r0);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m219121z0(DislikedUsers dislikedUsers, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched")) {
            osi0.m165783g(String.format("已向%s发送喜欢", dislikedUsers.userInfo.isFemale() ? "她" : "他"));
        }
        m219114D0(dislikedUsers);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
