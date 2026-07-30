package p002l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p1.mobile.putong.live.base.data.BLiveGuardType;
import com.tantanapp.common.data.DbObject;
import java.util.Collections;
import java.util.List;
import l.ayj0;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.j760;
import l.jo0;
import l.k4t;
import l.lsi0;
import l.qib0;
import l.r610;
import l.roj0;
import l.s410;
import l.s7m;
import l.soj0;
import l.t100;
import l.uvr;
import l.vud0;
import l.vwb;
import l.w14;
import l.w8u;
import l.w9j;
import l.x9j;
import l.ypv;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n1k0<D extends ho2> extends wr2<xyj0<D>, D> {

    /* JADX INFO: renamed from: p */
    public static final int f15781p = t100.f(15);

    /* JADX INFO: renamed from: q */
    public static final int f15782q = t100.f(15);

    /* JADX INFO: renamed from: k */
    public final r1k0 f15783k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f15784l;

    /* JADX INFO: renamed from: m */
    public UserCardData f15785m;

    /* JADX INFO: renamed from: n */
    public String f15786n;

    /* JADX INFO: renamed from: o */
    public boolean f15787o;

    public n1k0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f15783k = new r1k0();
        C(new xyj0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m18367V4(soj0 soj0Var) {
        ((xyj0) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m18368j4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.y(coreService.metaMessage);
                return;
            }
        }
        lsi0.C(R$string.f3203c3);
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m18371m4(Throwable th) {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m18375q4(e30 e30Var, BLiveFakeUserProfile bLiveFakeUserProfile) {
        if (bLiveFakeUserProfile == null) {
            e30Var.call("");
        } else {
            e30Var.call(bLiveFakeUserProfile.profileText);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ p1k0 m18378t4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public void m18385C4() {
        duringCreated(LivingNormalApiProvider.m4811e4(((DbObject) m25547E2().m14582l0()).id)).subscribe(ffw.e(new e30() { // from class: l.x0k0
            public final void call(Object obj) {
                this.f22068a.m18392J4((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.y0k0
            public final void call(Object obj) {
                n1k0.m18368j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public void m18386D4(d30 d30Var) {
        s7m s7mVar = ((bwr) this).viewModel;
        if (s7mVar != null) {
            ((xyj0) s7mVar).m5217q(d30Var);
        }
        if (TextUtils.equals(m18388F4().getSource(), "contribution")) {
            m25548F2().PlugPubEvent.dismissContributeDialog().j(3800);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m18387E4() {
        ((xyj0) ((bwr) this).viewModel).m26225T0(m18388F4().isShowShadow(), null, this.f15787o, ypv.a.D0().equals(((DbObject) m25547E2().m14582l0()).id), this.f15786n);
        m18420k5();
    }

    /* JADX INFO: renamed from: F4 */
    public UserCardData m18388F4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f15784l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f15785m : userCardData;
    }

    /* JADX INFO: renamed from: G4 */
    public void m18389G4(String str, final e30<String> e30Var) {
        duringCreated(new a2k0().m9294k(str)).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.d1k0
            public final void call(Object obj) {
                n1k0.m18375q4(e30Var, (BLiveFakeUserProfile) obj);
            }
        }, new e30() { // from class: l.e1k0
            public final void call(Object obj) {
                e30Var.call("");
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final String m18390H4(UserCardData userCardData) {
        return r610.N(this) ? "multiCall" : userCardData.getScene();
    }

    /* JADX INFO: renamed from: I4 */
    public boolean m18391I4() {
        return ypv.k().u7();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m18392J4(BaseLiveBean baseLiveBean) {
        lsi0.w(R$string.f3510q3);
        m25548F2().FansGroupEvent.showFansGroupPanel().j(Boolean.TRUE);
        m25331a4();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m18393K4() {
        dck0.m11741i(this, m18388F4().userId());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m18394L4(String str) {
        dck0.m11742j(this, str, "contribution");
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m18395M4(User user, List list) {
        ((xyj0) ((bwr) this).viewModel).m26219M0();
        lsi0.y(w8u.u(R$string.f3669x8, r610.w(user.name, 8)));
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m18396N4(User user) {
        dck0.m11743k(this, user, m18388F4().userId());
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo9256O3() {
        super.mo9256O3();
        this.f15783k.m21730b();
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ c m18397O4(UserCardData userCardData, j760 j760Var) {
        Object obj = j760Var.b;
        if (obj != null) {
            this.f15786n = ((gm0) obj).f11510b == null ? null : ((gm0) obj).f11510b.color;
        }
        return new a2k0().m9298o(userCardData.userId(), m25547E2().m17235k(), userCardData.getFromIdentity(), userCardData.getTo(), m18390H4(userCardData), m18388F4().getSource(), m25547E2().m17239o(), ((DbObject) m25547E2().m14582l0()).id, r610.z(this));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        dck0.m11740h(((k4t) this).b.values(), this.f15784l);
        super.mo10254P3();
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m18398P4(UserCardData userCardData) {
        this.f15783k.m21731c("p_live_profile", m25547E2().m17235k(), m25547E2().m17234j().anchor.id, mo21430R2(), userCardData);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m18399Q4(UserCardData userCardData, p1k0 p1k0Var) {
        this.f15784l = new UserCardBean(p1k0Var, userCardData);
    }

    @Override // p002l.x6s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo9823R3() {
        z2(new o0k0(this.f22036e, ((xyj0) ((bwr) this).viewModel).f22535r));
        z2(new g0k0(this.f22036e, null, ((xyj0) ((bwr) this).viewModel).f22519L));
        bsm<? extends T> bsmVar = this.f22036e;
        s7m s7mVar = ((bwr) this).viewModel;
        z2(new tzj0(bsmVar, ((xyj0) s7mVar).f22541x, ((xyj0) s7mVar).f22542y));
        z2(new q0k0(this.f22036e, ((xyj0) ((bwr) this).viewModel).f22543z));
        z2(new dzj0(this.f22036e, ((xyj0) ((bwr) this).viewModel).f22520M));
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m18400R4(p1k0 p1k0Var) {
        if (mo18414g4() == null) {
            m18387E4();
            return;
        }
        boolean zEquals = ((DbObject) ((User) mo18414g4().f16959c.a)).id.equals(((DbObject) m25547E2().m14582l0()).id);
        this.f15787o = ((User) mo18414g4().f16959c.a).fanbaseHierarchy.userType.equals("anchor");
        ((xyj0) ((bwr) this).viewModel).m26225T0(m18388F4().isShowShadow(), mo18414g4(), this.f15787o, zEquals, this.f15786n);
        m18420k5();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m18401S4(Throwable th) {
        m18387E4();
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ y16 m18402T4(BLiveEnvelope bLiveEnvelope) {
        return new y16.C0903a().m26299d(bLiveEnvelope).m26300e(m25547E2().m14539W0()).m26298c();
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m18403U4(y16 y16Var) {
        ((xyj0) ((bwr) this).viewModel).m26246x0(y16Var);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m18404W4(pp50 pp50Var) {
        m18410c5(pp50Var.getContext(), pp50Var.getUser(), pp50Var.getTargetUserId());
    }

    /* JADX INFO: renamed from: X4 */
    public void m18405X4(String str) {
        m18386D4(null);
        m25548F2().MemberEvent.dismiss().p();
        m25551K2().m22225m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m25548F2().ChatEvent.chatInputClick().j(new wu4(true, str).m25481a(this.f15784l.userCardData.userId()).m25482b("3"));
        m25548F2().HourLeaderBoardEvent.show().j(Boolean.FALSE);
        m25548F2().KnightGuardEvent.closeDialog().j(new xzq(3800).m26284f(true));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m18406Y4() {
        if (m18388F4().jumpOtherRoomCallBack() != null) {
            m18386D4(null);
            m18388F4().jumpOtherRoomCallBack().call();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void m18407Z4() {
        m18386D4(new d30() { // from class: l.i1k0
            public final void call() {
                this.f12396a.m18393K4();
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public void m18408a5(User user) {
        if (user == null) {
            return;
        }
        m25548F2().GiftWallV2Event.showGiftWallV2Dialog().j(new hp50(user, this.f15784l));
        m18386D4(null);
    }

    /* JADX INFO: renamed from: b5 */
    public void m18409b5(User user) {
        if (user == null) {
            return;
        }
        m25548F2().KnightGuardEvent.openDialog().j(new xzq(3800).m26287i(m25337i0(qib0.c0.userId()) ? BLiveGuardType.get("anchorGuard") : BLiveGuardType.get("userGuard")).m26285g(user).m26286h("p_live_profile"));
        m18386D4(null);
    }

    /* JADX INFO: renamed from: c5 */
    public void m18410c5(Context context, User user, String str) {
        if (m25552L2() || t7t.m22811c(this.f22036e.f8339h)) {
            lsi0.y(ypv.e.getString(R$string.f3115Y1));
        } else if (r610.P(this) || ((Boolean) m14184F3(new w14(3800, 4))).booleanValue()) {
            lsi0.w(R$string.f3662x1);
        } else {
            ypv.a.B0(context, user, str, "live_user_card", true, ayj0.d("live", m25547E2() != null ? m25547E2().m17239o() : null));
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m18411d5(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m18386D4(new d30() { // from class: l.w0k0
            public final void call() {
                this.f21405a.m18394L4(str);
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public void m18412e5(final User user, String str) {
        duringCreated(LivingNormalApiProvider.m4544A7(Collections.singletonList(((DbObject) user).id), r610.A(this), s410.D, s410.u)).subscribe(ffw.e(new e30() { // from class: l.v0k0
            public final void call(Object obj) {
                this.f20921a.m18395M4(user, (List) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: f5 */
    public void m18413f5(final User user) {
        if (user == null) {
            return;
        }
        r1k0.m21726h();
        m18386D4(new d30() { // from class: l.h1k0
            public final void call() {
                this.f11843a.m18396N4(user);
            }
        });
    }

    @Override // p002l.wr2
    /* JADX INFO: renamed from: g4 */
    public p1k0 mo18414g4() {
        return this.f15784l.profileData;
    }

    /* JADX INFO: renamed from: g5 */
    public void m18415g5(final UserCardData userCardData) {
        this.f15785m = userCardData;
        duringCreated(c.zip(m25547E2().m14587m2(), m25547E2().f12141B.m15719z(), new x9j() { // from class: l.j1k0
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((roj0) obj, (gm0) obj2);
            }
        }).flatMap(new w9j() { // from class: l.k1k0
            public final Object call(Object obj) {
                return this.f14168a.m18397O4(userCardData, (j760) obj);
            }
        })).onErrorReturn(new w9j() { // from class: l.l1k0
            public final Object call(Object obj) {
                return n1k0.m18378t4((Throwable) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.m1k0
            public final void call() {
                this.f15205a.m18398P4(userCardData);
            }
        }).doOnNext(new e30() { // from class: l.s0k0
            public final void call(Object obj) {
                this.f18748a.m18399Q4(userCardData, (p1k0) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.t0k0
            public final void call(Object obj) {
                this.f19352a.m18400R4((p1k0) obj);
            }
        }, new e30() { // from class: l.u0k0
            public final void call(Object obj) {
                this.f20447a.m18401S4((Throwable) obj);
            }
        }));
    }

    @Override // p002l.wr2
    /* JADX INFO: renamed from: h4 */
    public void mo18416h4() {
        super.mo18416h4();
        ((xyj0) ((bwr) this).viewModel).m26214H0();
    }

    /* JADX INFO: renamed from: h5 */
    public void m18417h5() {
        r44 r44Var = (r44) m14184F3(new y24(3800).m26304e(m18388F4().userId()));
        if (r44Var == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m4965v5(r44Var.m21770a().f17801b, TextUtils.equals(r44Var.m21771b(), ((DbObject) m25547E2().m14582l0()).id) ? m25547E2().m17235k() : r44Var.m21770a().f17800a, 0, 9, m25547E2().m14539W0())).map(new w9j() { // from class: l.z0k0
            public final Object call(Object obj) {
                return this.f23164a.m18402T4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.a1k0
            public final void call(Object obj) {
                this.f7337a.m18403U4((y16) obj);
            }
        }, new e30() { // from class: l.b1k0
            public final void call(Object obj) {
                n1k0.m18371m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i5 */
    public void m18418i5(String str) {
        if (m25547E2().m14582l0() == null) {
            return;
        }
        String str2 = ((DbObject) m25547E2().m14582l0()).id;
        if (TextUtils.isEmpty(uvr.d().w0())) {
            return;
        }
        String strW0 = uvr.d().w0();
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(100).m25610e((strW0.contains("%3F") ? strW0.concat("%26") : strW0.concat("%3F")) + "userId%3D" + str + "%26anchorId%3D" + str2).m25608c());
    }

    /* JADX INFO: renamed from: j5 */
    public void m18419j5() {
        m25548F2().MemberEvent.show().j(2);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m18420k5() {
        if (m18388F4() == null || m18388F4().isFromJs()) {
            return;
        }
        m25551K2().m22225m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: l5 */
    public void m18421l5() {
        if (m18388F4() != null) {
            r1k0.m21724f(m18388F4(), mo21430R2());
        }
    }

    /* JADX INFO: renamed from: m5 */
    public void m18422m5(String str) {
        p1k0 p1k0Var;
        UserCardBean userCardBean = this.f15784l;
        if (userCardBean == null || userCardBean.userCardData == null || (p1k0Var = userCardBean.profileData) == null || p1k0Var.m19973m() == null || !TextUtils.equals(this.f15784l.userCardData.userId(), str)) {
            return;
        }
        this.f15784l.profileData.m19973m().blockStatus = "blocked";
    }

    /* JADX INFO: renamed from: t */
    public void mo18423t() {
        super.t();
        m14189f3(m25548F2().OpenUserCardDialogEvent.show()).m14209b(new e30() { // from class: l.r0k0
            public final void call(Object obj) {
                this.f18311a.m18415g5((UserCardData) obj);
            }
        });
        m14189f3(m25548F2().OpenUserCardDialogEvent.dismiss()).m14209b(new e30() { // from class: l.c1k0
            public final void call(Object obj) {
                this.f8458a.m18367V4((soj0) obj);
            }
        });
        m14189f3(m25548F2().GiftWallV2Event.openProfilePage()).m14209b(new e30() { // from class: l.f1k0
            public final void call(Object obj) {
                this.f10100a.m18404W4((pp50) obj);
            }
        });
        m14189f3(m25548F2().LiveBlackListEvent.updateBlackStatus()).m14209b(new e30() { // from class: l.g1k0
            public final void call(Object obj) {
                this.f10723a.m18422m5((String) obj);
            }
        });
    }
}
