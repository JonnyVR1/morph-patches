package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class n1k0<D extends ho2> extends wr2<xyj0<D>, D> {

    /* JADX INFO: renamed from: p */
    public static final int f136654p = t100.m186892f(15);

    /* JADX INFO: renamed from: q */
    public static final int f136655q = t100.m186892f(15);

    /* JADX INFO: renamed from: k */
    public final r1k0 f136656k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f136657l;

    /* JADX INFO: renamed from: m */
    public UserCardData f136658m;

    /* JADX INFO: renamed from: n */
    public String f136659n;

    /* JADX INFO: renamed from: o */
    public boolean f136660o;

    public n1k0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f136656k = new r1k0();
        mo51532C(new xyj0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m157379V4(soj0 soj0Var) {
        ((xyj0) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m157380j4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151565C(R$string.f47161c3);
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m157383m4(Throwable th) {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m157387q4(e30 e30Var, BLiveFakeUserProfile bLiveFakeUserProfile) {
        if (bLiveFakeUserProfile == null) {
            e30Var.call("");
        } else {
            e30Var.call(bLiveFakeUserProfile.profileText);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ p1k0 m157390t4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public void m157397C4() {
        duringCreated(LivingNormalApiProvider.m71445e4(m206027E2().m132146l0().f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.x0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188981a.m157404J4((BaseLiveBean) obj);
            }
        }, new e30() { // from class: l.y0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                n1k0.m157380j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public void m157398D4(d30 d30Var) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((xyj0) v2).m71839q(d30Var);
        }
        if (TextUtils.equals(m157400F4().getSource(), "contribution")) {
            m206028F2().PlugPubEvent.dismissContributeDialog().mo172463j(3800);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m157399E4() {
        ((xyj0) this.viewModel).m211814T0(m157400F4().isShowShadow(), null, this.f136660o, ypv.f199493a.m199309D0().equals(m206027E2().m132146l0().f56011id), this.f136659n);
        m157432k5();
    }

    /* JADX INFO: renamed from: F4 */
    public UserCardData m157400F4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f136657l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f136658m : userCardData;
    }

    /* JADX INFO: renamed from: G4 */
    public void m157401G4(String str, final e30<String> e30Var) {
        duringCreated(new a2k0().m94613k(str)).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.d1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                n1k0.m157387q4(e30Var, (BLiveFakeUserProfile) obj);
            }
        }, new e30() { // from class: l.e1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call("");
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final String m157402H4(UserCardData userCardData) {
        return r610.m177979N(this) ? BLiveActivity.TYPE_MULTI_CALL : userCardData.getScene();
    }

    /* JADX INFO: renamed from: I4 */
    public boolean m157403I4() {
        return ypv.m215672k().m195959u7();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m157404J4(BaseLiveBean baseLiveBean) {
        lsi0.m151593w(R$string.f47468q3);
        m206028F2().FansGroupEvent.showFansGroupPanel().mo172463j(Boolean.TRUE);
        m205081a4();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m157405K4() {
        dck0.m110724i(this, m157400F4().userId());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m157406L4(String str) {
        dck0.m110725j(this, str, "contribution");
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m157407M4(User user, List list) {
        ((xyj0) this.viewModel).m211808M0();
        lsi0.m151595y(w8u.m202218u(R$string.f47627x8, r610.m178016w(user.name, 8)));
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m157408N4(User user) {
        dck0.m110726k(this, user, m157400F4().userId());
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        this.f136656k.m177475b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ C22306c m157409O4(UserCardData userCardData, j760 j760Var) {
        S s = j760Var.f116565b;
        if (s != 0) {
            this.f136659n = ((gm0) s).f103418b == null ? null : ((gm0) s).f103418b.color;
        }
        return new a2k0().m94617o(userCardData.userId(), m206027E2().m149814k(), userCardData.getFromIdentity(), userCardData.getTo(), m157402H4(userCardData), m157400F4().getSource(), m206027E2().m149818o(), m206027E2().m132146l0().f56011id, r610.m178019z(this));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        dck0.m110723h(this.f121122b.values(), this.f136657l);
        super.mo99576P3();
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m157410P4(UserCardData userCardData) {
        this.f136656k.m177476c("p_live_profile", m206027E2().m149814k(), m206027E2().mo149813j().anchor.f44419id, mo77274R2(), userCardData);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m157411Q4(UserCardData userCardData, p1k0 p1k0Var) {
        this.f136657l = new UserCardBean(p1k0Var, userCardData);
    }

    @Override // p149l.x6s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        m144512z2(new o0k0(this.f188512e, ((xyj0) this.viewModel).f195081r));
        m144512z2(new g0k0(this.f188512e, null, ((xyj0) this.viewModel).f195065L));
        bsm<? extends T> bsmVar = this.f188512e;
        V v2 = this.viewModel;
        m144512z2(new tzj0(bsmVar, ((xyj0) v2).f195087x, ((xyj0) v2).f195088y));
        m144512z2(new q0k0(this.f188512e, ((xyj0) this.viewModel).f195089z));
        m144512z2(new dzj0(this.f188512e, ((xyj0) this.viewModel).f195066M));
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m157412R4(p1k0 p1k0Var) {
        if (mo157426g4() == null) {
            m157399E4();
            return;
        }
        boolean zEquals = mo157426g4().f146688c.f135304a.f56011id.equals(m206027E2().m132146l0().f56011id);
        this.f136660o = mo157426g4().f146688c.f135304a.fanbaseHierarchy.userType.equals("anchor");
        ((xyj0) this.viewModel).m211814T0(m157400F4().isShowShadow(), mo157426g4(), this.f136660o, zEquals, this.f136659n);
        m157432k5();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m157413S4(Throwable th) {
        m157399E4();
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ y16 m157414T4(BLiveEnvelope bLiveEnvelope) {
        return new y16.C21277a().m212139d(bLiveEnvelope).m212140e(m206027E2().mo132103W0()).m212138c();
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m157415U4(y16 y16Var) {
        ((xyj0) this.viewModel).m211835x0(y16Var);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m157416W4(pp50 pp50Var) {
        m157422c5(pp50Var.getContext(), pp50Var.getUser(), pp50Var.getTargetUserId());
    }

    /* JADX INFO: renamed from: X4 */
    public void m157417X4(String str) {
        m157398D4(null);
        m206028F2().MemberEvent.dismiss().m172467p();
        m206031K2().m182470m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, str).m205591a(this.f136657l.userCardData.userId()).m205592b("3"));
        m206028F2().HourLeaderBoardEvent.show().mo172463j(Boolean.FALSE);
        m206028F2().KnightGuardEvent.closeDialog().mo172463j(new xzq(3800).m212016f(true));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m157418Y4() {
        if (m157400F4().jumpOtherRoomCallBack() != null) {
            m157398D4(null);
            m157400F4().jumpOtherRoomCallBack().call();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void m157419Z4() {
        m157398D4(new d30() { // from class: l.i1k0
            @Override // p149l.d30
            public final void call() {
                this.f110464a.m157405K4();
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public void m157420a5(User user) {
        if (user == null) {
            return;
        }
        m206028F2().GiftWallV2Event.showGiftWallV2Dialog().mo172463j(new hp50(user, this.f136657l));
        m157398D4(null);
    }

    /* JADX INFO: renamed from: b5 */
    public void m157421b5(User user) {
        if (user == null) {
            return;
        }
        m206028F2().KnightGuardEvent.openDialog().mo172463j(new xzq(3800).m212019i(m205087i0(qib0.f154714c0.userId()) ? BLiveGuardType.get(BLiveGuardType.anchorGuard) : BLiveGuardType.get(BLiveGuardType.userGuard)).m212017g(user).m212018h("p_live_profile"));
        m157398D4(null);
    }

    /* JADX INFO: renamed from: c5 */
    public void m157422c5(Context context, User user, String str) {
        if (m206032L2() || t7t.m187503c(this.f188512e.f77102h)) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f47073Y1));
        } else if (r610.m177981P(this) || ((Boolean) m129297F3(new w14(3800, 4))).booleanValue()) {
            lsi0.m151593w(R$string.f47620x1);
        } else {
            ypv.f199493a.m199305B0(context, user, str, "live_user_card", true, ayj0.m99569d("live", m206027E2() != null ? m206027E2().m149818o() : null));
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m157423d5(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m157398D4(new d30() { // from class: l.w0k0
            @Override // p149l.d30
            public final void call() {
                this.f183925a.m157406L4(str);
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public void m157424e5(final User user, String str) {
        duringCreated(LivingNormalApiProvider.m71178A7(Collections.singletonList(user.f56011id), r610.m177966A(this), s410.f162214D, s410.f162255u)).subscribe(ffw.m121194e(new e30() { // from class: l.v0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179120a.m157407M4(user, (List) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: f5 */
    public void m157425f5(final User user) {
        if (user == null) {
            return;
        }
        r1k0.m177471h();
        m157398D4(new d30() { // from class: l.h1k0
            @Override // p149l.d30
            public final void call() {
                this.f105435a.m157408N4(user);
            }
        });
    }

    @Override // p149l.wr2
    /* JADX INFO: renamed from: g4 */
    public p1k0 mo157426g4() {
        return this.f136657l.profileData;
    }

    /* JADX INFO: renamed from: g5 */
    public void m157427g5(final UserCardData userCardData) {
        this.f136658m = userCardData;
        duringCreated(C22306c.zip(m206027E2().m132151m2(), m206027E2().f108741B.m140028z(), new x9j() { // from class: l.j1k0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((roj0) obj, (gm0) obj2);
            }
        }).flatMap(new w9j() { // from class: l.k1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120610a.m157409O4(userCardData, (j760) obj);
            }
        })).onErrorReturn(new w9j() { // from class: l.l1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return n1k0.m157390t4((Throwable) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.m1k0
            @Override // p149l.d30
            public final void call() {
                this.f130835a.m157410P4(userCardData);
            }
        }).doOnNext(new e30() { // from class: l.s0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161776a.m157411Q4(userCardData, (p1k0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.t0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167195a.m157412R4((p1k0) obj);
            }
        }, new e30() { // from class: l.u0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172920a.m157413S4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.wr2
    /* JADX INFO: renamed from: h4 */
    public void mo157428h4() {
        super.mo157428h4();
        ((xyj0) this.viewModel).m211803H0();
    }

    /* JADX INFO: renamed from: h5 */
    public void m157429h5() {
        r44 r44Var = (r44) m129297F3(new y24(3800).m212356e(m157400F4().userId()));
        if (r44Var == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71599v5(r44Var.m177769a().f152538b, TextUtils.equals(r44Var.m177770b(), m206027E2().m132146l0().f56011id) ? m206027E2().m149814k() : r44Var.m177769a().f152537a, 0, 9, m206027E2().mo132103W0())).map(new w9j() { // from class: l.z0k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f201000a.m157414T4((BLiveEnvelope) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.a1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67184a.m157415U4((y16) obj);
            }
        }, new e30() { // from class: l.b1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                n1k0.m157383m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i5 */
    public void m157430i5(String str) {
        if (m206027E2().m132146l0() == null) {
            return;
        }
        String str2 = m206027E2().m132146l0().f56011id;
        if (TextUtils.isEmpty(uvr.m196087d().m162723w0())) {
            return;
        }
        String strM162723w0 = uvr.m196087d().m162723w0();
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(100).m206701e((strM162723w0.contains("%3F") ? strM162723w0.concat("%26") : strM162723w0.concat("%3F")) + "userId%3D" + str + "%26anchorId%3D" + str2).m206699c());
    }

    /* JADX INFO: renamed from: j5 */
    public void m157431j5() {
        m206028F2().MemberEvent.show().mo172463j(2);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m157432k5() {
        if (m157400F4() == null || m157400F4().isFromJs()) {
            return;
        }
        m206031K2().m182470m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: l5 */
    public void m157433l5() {
        if (m157400F4() != null) {
            r1k0.m177469f(m157400F4(), mo77274R2());
        }
    }

    /* JADX INFO: renamed from: m5 */
    public void m157434m5(String str) {
        p1k0 p1k0Var;
        UserCardBean userCardBean = this.f136657l;
        if (userCardBean == null || userCardBean.userCardData == null || (p1k0Var = userCardBean.profileData) == null || p1k0Var.m167093m() == null || !TextUtils.equals(this.f136657l.userCardData.userId(), str)) {
            return;
        }
        this.f136657l.profileData.m167093m().blockStatus = "blocked";
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129302f3(m206028F2().OpenUserCardDialogEvent.show()).m129322b(new e30() { // from class: l.r0k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157179a.m157427g5((UserCardData) obj);
            }
        });
        m129302f3(m206028F2().OpenUserCardDialogEvent.dismiss()).m129322b(new e30() { // from class: l.c1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78284a.m157379V4((soj0) obj);
            }
        });
        m129302f3(m206028F2().GiftWallV2Event.openProfilePage()).m129322b(new e30() { // from class: l.f1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94104a.m157416W4((pp50) obj);
            }
        });
        m129302f3(m206028F2().LiveBlackListEvent.updateBlackStatus()).m129322b(new e30() { // from class: l.g1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100183a.m157434m5((String) obj);
            }
        });
    }
}
