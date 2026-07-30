package p153l;

import android.net.NetworkInfo;
import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.DislikedUsers;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UnDoLikedUserFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class ctj0 extends ar2<etj0> {

    /* JADX INFO: renamed from: a */
    public Act f83704a;

    /* JADX INFO: renamed from: b */
    public UnDoLikedUserFrag f83705b;

    /* JADX INFO: renamed from: c */
    public boolean f83706c;

    /* JADX INFO: renamed from: d */
    public Links f83707d;

    /* JADX INFO: renamed from: e */
    public boolean f83708e;

    public ctj0(UnDoLikedUserFrag unDoLikedUserFrag) {
        super(unDoLikedUserFrag);
        this.f83708e = false;
        this.f83704a = unDoLikedUserFrag.act();
        this.f83705b = unDoLikedUserFrag;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ C22421c m112492f0(final PaymentResultWrapper paymentResultWrapper) {
        return paymentResultWrapper.fromSign ? C22421c.just(paymentResultWrapper) : CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged().skip(1).take(1).map(new qcj() { // from class: l.btj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ctj0.m112493g0(paymentResultWrapper, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ PaymentResultWrapper m112493g0(PaymentResultWrapper paymentResultWrapper, List list) {
        return paymentResultWrapper;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ Boolean m112498l0(PaymentResultWrapper paymentResultWrapper) {
        PurchaseType purchaseType = paymentResultWrapper.purchaseType;
        return Boolean.valueOf(purchaseType == PurchaseType.TYPE_GET_VIP || purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || purchaseType == PurchaseType.TYPE_O_DIAMOND);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m112499m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m112503s0() {
        if (this.f83706c) {
            return;
        }
        m112510F0("p_navigation_disliked,card_button_pull");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m112504u0(Bundle bundle) {
        ((etj0) this.viewModel).m122468e(new x20() { // from class: l.atj0
            @Override // p153l.x20
            public final void call() {
                this.f73367a.m112503s0();
            }
        });
        ((etj0) this.viewModel).m122470j();
        ((etj0) this.viewModel).m122467d(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m112505x0(NetworkInfo networkInfo) {
        m112507C0(false);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m112506A0() {
        this.f83708e = false;
    }

    /* JADX INFO: renamed from: C0 */
    public void m112507C0(boolean z) {
        CoreModule.f18264c.f20405m0.m32102f6(z ? this.f83707d : null);
    }

    /* JADX INFO: renamed from: D0 */
    public void m112508D0(DislikedUsers dislikedUsers) {
        if (this.f83705b.m48012O4().m155710N(dislikedUsers)) {
            CoreModule.f18264c.f20405m0.m32171z8(dislikedUsers.f21129id);
            if (this.f83705b.m48012O4().m155713Q() <= 0) {
                ((etj0) this.viewModel).m122467d(false, this.f83705b.m48012O4().m155713Q() <= 0);
                ((etj0) this.viewModel).m122472m(!this.f83706c);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m112509E0(final DislikedUsers dislikedUsers) {
        return CoreMemberModule.m37004F().m187693b().mo37000tq(this.f83704a, dislikedUsers.userInfo, true, false, false, "p_navigation_disliked,card_button_pull", new y20() { // from class: l.ssj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170465a.m112515z0(dislikedUsers, (Relationship) obj);
            }
        }, null, this.f83705b.pageId(), null, null, null);
    }

    /* JADX INFO: renamed from: F0 */
    public void m112510F0(String str) {
        if (this.f83708e) {
            return;
        }
        this.f83708e = true;
        CoreModule.m30933P().m143405a().mo34316Eq(this.f83704a, str, new x20() { // from class: l.rsj0
            @Override // p153l.x20
            public final void call() {
                this.f164698a.m112506A0();
            }
        }, Privilege.vip_undo, false, null);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f83706c = m112512r0();
        CoreModule.f18264c.f20297C0.m146428y4();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qsj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159335a.m112504u0((Bundle) obj);
            }
        }, new x20() { // from class: l.tsj0
            @Override // p153l.x20
            public final void call() {
                ctj0.m112499m0();
            }
        });
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.usj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vsj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185633a.m112505x0((NetworkInfo) obj);
            }
        }));
        duringCreated(CoreModule.m30933P().m143410g().mo36025On()).filter(new qcj() { // from class: l.wsj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ctj0.m112498l0((PaymentResultWrapper) obj);
            }
        }).switchMap(new qcj() { // from class: l.xsj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ctj0.m112492f0((PaymentResultWrapper) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.ysj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201412a.m112514y0((PaymentResultWrapper) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20405m0.m32106g6()).subscribe(psd0.m173596G(new y20() { // from class: l.zsj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205882a.m112513t0((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public Links m112511q0() {
        return this.f83707d;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m112512r0() {
        return !joa.m146401n4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m112513t0(pf60 pf60Var) {
        this.f83707d = (Links) pf60Var.f152156a;
        ((etj0) this.viewModel).m122471k((List) pf60Var.f152157b, this.f83706c);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m112514y0(PaymentResultWrapper paymentResultWrapper) {
        boolean zM112512r0 = m112512r0();
        this.f83706c = zM112512r0;
        ((etj0) this.viewModel).m122469i(zM112512r0);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m112515z0(DislikedUsers dislikedUsers, Relationship relationship) {
        if (!TEnum.equals(relationship.state, "matched")) {
            r1j0.m179420g(String.format("已向%s发送喜欢", dislikedUsers.userInfo.isFemale() ? "她" : "他"));
        }
        m112508D0(dislikedUsers);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
