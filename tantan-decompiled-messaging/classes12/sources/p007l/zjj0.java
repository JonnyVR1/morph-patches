package p007l;

import android.net.NetworkInfo;
import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p000p1.mobile.putong.data.LikeExtraData;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Relationship;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.DislikedUsers;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mkd0;
import l.osi0;
import l.w9j;
import l.xma;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zjj0 extends jq2<bkj0> {

    /* JADX INFO: renamed from: a */
    public Act f15789a;

    /* JADX INFO: renamed from: b */
    public UnDoLikedUserFrag f15790b;

    /* JADX INFO: renamed from: c */
    public boolean f15791c;

    /* JADX INFO: renamed from: d */
    public Links f15792d;

    /* JADX INFO: renamed from: e */
    public boolean f15793e;

    public zjj0(UnDoLikedUserFrag unDoLikedUserFrag) {
        super(unDoLikedUserFrag);
        this.f15793e = false;
        this.f15789a = unDoLikedUserFrag.act();
        this.f15790b = unDoLikedUserFrag;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ c m17474f0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? c.just(paymentResultWrapper) : CoreModule.c.C0.x3().distinctUntilChanged().skip(1).take(1).map(new w9j() { // from class: l.yjj0
            public final Object call(Object obj) {
                return zjj0.m17475g0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ PaymentResultWrapper m17475g0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Boolean m17480l0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_O_DIAMOND);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m17481m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m17485s0() {
        if (this.f15791c) {
            return;
        }
        m17492F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m17486u0(Bundle bundle) {
        ((bkj0) ((jq2) this).viewModel).m8900e(new d30() { // from class: l.xjj0
            public final void call() {
                this.f15023a.m17485s0();
            }
        });
        ((bkj0) ((jq2) this).viewModel).m8903j();
        ((bkj0) ((jq2) this).viewModel).m8899d(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m17487x0(NetworkInfo networkInfo) {
        m17489C0(false);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m17488A0() {
        this.f15793e = false;
    }

    /* JADX INFO: renamed from: C0 */
    public void m17489C0(boolean z) {
        CoreModule.c.m0.f6(z ? this.f15792d : null);
    }

    /* JADX INFO: renamed from: D0 */
    public void m17490D0(DislikedUsers dislikedUsers) {
        if (this.f15790b.m509O4().m10953N(dislikedUsers)) {
            CoreModule.c.m0.z8(dislikedUsers.id);
            if (this.f15790b.m509O4().m10956Q() <= 0) {
                ((bkj0) ((jq2) this).viewModel).m8899d(false, this.f15790b.m509O4().m10956Q() <= 0);
                ((bkj0) ((jq2) this).viewModel).m8905m(!this.f15791c);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m17491E0(final DislikedUsers dislikedUsers) {
        return CoreMemberModule.F().b().tq(this.f15789a, dislikedUsers.userInfo, true, false, false, "p_navigation_disliked,card_button_pull", new e30() { // from class: l.pjj0
            public final void call(Object obj) {
                this.f11865a.m17499z0(dislikedUsers, (Relationship) obj);
            }
        }, (e30) null, this.f15790b.pageId(), (LikeExtraData) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: F0 */
    public void m17492F0(String str) {
        if (this.f15793e) {
            return;
        }
        this.f15793e = true;
        CoreModule.P().a().Eq(this.f15789a, str, new d30() { // from class: l.ojj0
            public final void call() {
                this.f11491a.m17488A0();
            }
        }, Privilege.vip_undo, false, (User) null);
    }

    /* JADX INFO: renamed from: Z */
    public void m17493Z() {
        super.Z();
        this.f15791c = m17496r0();
        CoreModule.c.C0.x4();
    }

    /* JADX INFO: renamed from: a0 */
    public void m17494a0() {
        super.a0();
        creates(new e30() { // from class: l.njj0
            public final void call(Object obj) {
                this.f10817a.m17486u0((Bundle) obj);
            }
        }, new d30() { // from class: l.qjj0
            public final void call() {
                zjj0.m17481m0();
            }
        });
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.rjj0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.sjj0
            public final void call(Object obj) {
                this.f12968a.m17487x0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.P().g().On()).filter(new w9j() { // from class: l.tjj0
            public final Object call(Object obj) {
                return zjj0.m17480l0((PaymentResultWrapper) obj);
            }
        }).switchMap(new w9j() { // from class: l.ujj0
            public final Object call(Object obj) {
                return zjj0.m17474f0((PaymentResultWrapper) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.vjj0
            public final void call(Object obj) {
                this.f14180a.m17498y0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.c.m0.g6()).subscribe(mkd0.G(new e30() { // from class: l.wjj0
            public final void call(Object obj) {
                this.f14558a.m17497t0((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public Links m17495q0() {
        return this.f15792d;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m17496r0() {
        return !xma.m4();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m17497t0(j760 j760Var) {
        this.f15792d = (Links) j760Var.a;
        ((bkj0) ((jq2) this).viewModel).m8904k((List) j760Var.b, this.f15791c);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m17498y0(PaymentResultWrapper paymentResultWrapper) {
        boolean zM17496r0 = m17496r0();
        this.f15791c = zM17496r0;
        ((bkj0) ((jq2) this).viewModel).m8901i(zM17496r0);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m17499z0(DislikedUsers dislikedUsers, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched")) {
            osi0.g(String.format("已向%s发送喜欢", dislikedUsers.userInfo.isFemale() ? "她" : "他"));
        }
        m17490D0(dislikedUsers);
    }

    public void destroy() {
    }
}
