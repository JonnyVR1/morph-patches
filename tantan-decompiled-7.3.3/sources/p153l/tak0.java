package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class tak0<D extends oo2> extends ms2<d8k0<D>, D> {

    /* JADX INFO: renamed from: p */
    public static final int f172738p = qa00.m175861f(15);

    /* JADX INFO: renamed from: q */
    public static final int f172739q = qa00.m175861f(15);

    /* JADX INFO: renamed from: k */
    public final xak0 f172740k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f172741l;

    /* JADX INFO: renamed from: m */
    public UserCardData f172742m;

    /* JADX INFO: renamed from: n */
    public String f172743n;

    /* JADX INFO: renamed from: o */
    public boolean f172744o;

    public tak0(dum<D> dumVar) {
        super(dumVar);
        this.f172740k = new xak0();
        mo52715C(new d8k0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m189860V4(vxj0 vxj0Var) {
        ((d8k0) this.viewModel).mo73021p();
    }

    /* JADX INFO: renamed from: j4 */
    public static /* synthetic */ void m189861j4(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            if (!TextUtils.isEmpty(coreService.metaMessage)) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165621C(R$string.f48009c3);
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m189864m4(Throwable th) {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m189868q4(y20 y20Var, BLiveFakeUserProfile bLiveFakeUserProfile) {
        if (bLiveFakeUserProfile == null) {
            y20Var.call("");
        } else {
            y20Var.call(bLiveFakeUserProfile.profileText);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ vak0 m189871t4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public void m189878C4() {
        duringCreated(LivingNormalApiProvider.m72628e4(m213810E2().m168532l0().f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.dak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85895a.m189885J4((BaseLiveBean) obj);
            }
        }, new y20() { // from class: l.eak0
            @Override // p153l.y20
            public final void call(Object obj) {
                tak0.m189861j4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D4 */
    public void m189879D4(x20 x20Var) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((d8k0) v2).m73022q(x20Var);
        }
        if (TextUtils.equals(m189881F4().getSource(), "contribution")) {
            m213811F2().PlugPubEvent.dismissContributeDialog().mo199273j(3800);
        }
    }

    /* JADX INFO: renamed from: E4 */
    public final void m189880E4() {
        ((d8k0) this.viewModel).m114889T0(m189881F4().isShowShadow(), null, this.f172744o, zrv.f205799a.m207631D0().equals(m213810E2().m168532l0().f56859id), this.f172743n);
        m189911k5();
    }

    /* JADX INFO: renamed from: F4 */
    public UserCardData m189881F4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f172741l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f172742m : userCardData;
    }

    /* JADX INFO: renamed from: G4 */
    public void m189882G4(String str, final y20<String> y20Var) {
        duringCreated(new gbk0().m129791k(str)).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.jak0
            @Override // p153l.y20
            public final void call(Object obj) {
                tak0.m189868q4(y20Var, (BLiveFakeUserProfile) obj);
            }
        }, new y20() { // from class: l.kak0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call("");
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final String m189883H4(UserCardData userCardData) {
        return bf10.m103808N(this) ? BLiveActivity.TYPE_MULTI_CALL : userCardData.getScene();
    }

    /* JADX INFO: renamed from: I4 */
    public boolean m189884I4() {
        return zrv.m221193k().m203746u7();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m189885J4(BaseLiveBean baseLiveBean) {
        o1j0.m165649w(R$string.f48316q3);
        m213811F2().FansGroupEvent.showFansGroupPanel().mo199273j(Boolean.TRUE);
        m159727a4();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ void m189886K4() {
        jlk0.m146087i(this, m189881F4().userId());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m189887L4(String str) {
        jlk0.m146088j(this, str, "contribution");
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m189888M4(User user, List list) {
        ((d8k0) this.viewModel).m114883M0();
        o1j0.m165651y(xau.m209911u(R$string.f48475x8, bf10.m103845w(user.name, 8)));
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m189889N4(User user) {
        jlk0.m146089k(this, user, m189881F4().userId());
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        this.f172740k.m209863b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ C22421c m189890O4(UserCardData userCardData, pf60 pf60Var) {
        S s = pf60Var.f152157b;
        if (s != 0) {
            this.f172743n = ((cm0) s).f82502b == null ? null : ((cm0) s).f82502b.color;
        }
        return new gbk0().m129795o(userCardData.userId(), m213810E2().m202191k(), userCardData.getFromIdentity(), userCardData.getTo(), m189883H4(userCardData), m189881F4().getSource(), m213810E2().m202194o(), m213810E2().m168532l0().f56859id, bf10.m103848z(this));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        jlk0.m146086h(this.f130285b.values(), this.f172741l);
        super.mo96837P3();
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ void m189891P4(UserCardData userCardData) {
        this.f172740k.m209864c("p_live_profile", m213810E2().m202191k(), m213810E2().mo183435j().anchor.f45267id, mo78457R2(), userCardData);
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m189892Q4(UserCardData userCardData, vak0 vak0Var) {
        this.f172741l = new UserCardBean(vak0Var, userCardData);
    }

    @Override // p153l.y8s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        m153103z2(new u9k0(this.f196918e, ((d8k0) this.viewModel).f85642r));
        m153103z2(new m9k0(this.f196918e, null, ((d8k0) this.viewModel).f85626L));
        dum<? extends T> dumVar = this.f196918e;
        V v2 = this.viewModel;
        m153103z2(new z8k0(dumVar, ((d8k0) v2).f85648x, ((d8k0) v2).f85649y));
        m153103z2(new w9k0(this.f196918e, ((d8k0) this.viewModel).f85650z));
        m153103z2(new j8k0(this.f196918e, ((d8k0) this.viewModel).f85627M));
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m189893R4(vak0 vak0Var) {
        if (mo159733g4() == null) {
            m189880E4();
            return;
        }
        boolean zEquals = mo159733g4().f183108c.f143542a.f56859id.equals(m213810E2().m168532l0().f56859id);
        this.f172744o = mo159733g4().f183108c.f143542a.fanbaseHierarchy.userType.equals("anchor");
        ((d8k0) this.viewModel).m114889T0(m189881F4().isShowShadow(), mo159733g4(), this.f172744o, zEquals, this.f172743n);
        m189911k5();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m189894S4(Throwable th) {
        m189880E4();
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ d36 m189895T4(BLiveEnvelope bLiveEnvelope) {
        return new d36.C16428a().m113795d(bLiveEnvelope).m113796e(m213810E2().mo168489W0()).m113794c();
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m189896U4(d36 d36Var) {
        ((d8k0) this.viewModel).m114910x0(d36Var);
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ void m189897W4(vx50 vx50Var) {
        m189903c5(vx50Var.getContext(), vx50Var.getUser(), vx50Var.getTargetUserId());
    }

    /* JADX INFO: renamed from: X4 */
    public void m189898X4(String str) {
        m189879D4(null);
        m213811F2().MemberEvent.dismiss().m199277p();
        m213814K2().m189706m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, str).m202991a(this.f172741l.userCardData.userId()).m202992b("3"));
        m213811F2().HourLeaderBoardEvent.show().mo199273j(Boolean.FALSE);
        m213811F2().KnightGuardEvent.closeDialog().mo199273j(new y1r(3800).m213962f(true));
    }

    /* JADX INFO: renamed from: Y4 */
    public void m189899Y4() {
        if (m189881F4().jumpOtherRoomCallBack() != null) {
            m189879D4(null);
            m189881F4().jumpOtherRoomCallBack().call();
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void m189900Z4() {
        m189879D4(new x20() { // from class: l.oak0
            @Override // p153l.x20
            public final void call() {
                this.f145744a.m189886K4();
            }
        });
    }

    /* JADX INFO: renamed from: a5 */
    public void m189901a5(User user) {
        if (user == null) {
            return;
        }
        m213811F2().GiftWallV2Event.showGiftWallV2Dialog().mo199273j(new nx50(user, this.f172741l));
        m189879D4(null);
    }

    /* JADX INFO: renamed from: b5 */
    public void m189902b5(User user) {
        if (user == null) {
            return;
        }
        m213811F2().KnightGuardEvent.openDialog().mo199273j(new y1r(3800).m213965i(m159735i0(uqb0.f180397c0.userId()) ? BLiveGuardType.get(BLiveGuardType.anchorGuard) : BLiveGuardType.get(BLiveGuardType.userGuard)).m213963g(user).m213964h("p_live_profile"));
        m189879D4(null);
    }

    /* JADX INFO: renamed from: c5 */
    public void m189903c5(Context context, User user, String str) {
        if (m213815L2() || u9t.m195114c(this.f196918e.f90822h)) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47921Y1));
        } else if (bf10.m103810P(this) || ((Boolean) m138856F3(new v24(3800, 4))).booleanValue()) {
            o1j0.m165649w(R$string.f48468x1);
        } else {
            zrv.f205799a.m207627B0(context, user, str, "live_user_card", true, g7k0.m129334d("live", m213810E2() != null ? m213810E2().m202194o() : null));
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m189904d5(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m189879D4(new x20() { // from class: l.cak0
            @Override // p153l.x20
            public final void call() {
                this.f80604a.m189887L4(str);
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public void m189905e5(final User user, String str) {
        duringCreated(LivingNormalApiProvider.m72361A7(Collections.singletonList(user.f56859id), bf10.m103795A(this), cd10.f81052D, cd10.f81093u)).subscribe(dhw.m115826e(new y20() { // from class: l.bak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75719a.m189888M4(user, (List) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: f5 */
    public void m189906f5(final User user) {
        if (user == null) {
            return;
        }
        xak0.m209859h();
        m189879D4(new x20() { // from class: l.nak0
            @Override // p153l.x20
            public final void call() {
                this.f141024a.m189889N4(user);
            }
        });
    }

    @Override // p153l.ms2
    /* JADX INFO: renamed from: g4 */
    public vak0 mo159733g4() {
        return this.f172741l.profileData;
    }

    /* JADX INFO: renamed from: g5 */
    public void m189907g5(final UserCardData userCardData) {
        this.f172742m = userCardData;
        duringCreated(C22421c.zip(m213810E2().m168537m2(), m213810E2().f148254B.m209633z(), new rcj() { // from class: l.pak0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((uxj0) obj, (cm0) obj2);
            }
        }).flatMap(new qcj() { // from class: l.qak0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156392a.m189890O4(userCardData, (pf60) obj);
            }
        })).onErrorReturn(new qcj() { // from class: l.rak0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return tak0.m189871t4((Throwable) obj);
            }
        }).doOnSubscribe(new x20() { // from class: l.sak0
            @Override // p153l.x20
            public final void call() {
                this.f167053a.m189891P4(userCardData);
            }
        }).doOnNext(new y20() { // from class: l.y9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198101a.m189892Q4(userCardData, (vak0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.z9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203493a.m189893R4((vak0) obj);
            }
        }, new y20() { // from class: l.aak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69151a.m189894S4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ms2
    /* JADX INFO: renamed from: h4 */
    public void mo159734h4() {
        super.mo159734h4();
        ((d8k0) this.viewModel).m114878H0();
    }

    /* JADX INFO: renamed from: h5 */
    public void m189908h5() {
        q54 q54Var = (q54) m138856F3(new x34(3800).m209191e(m189881F4().userId()));
        if (q54Var == null) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72782v5(q54Var.m175288a().f150593b, TextUtils.equals(q54Var.m175289b(), m213810E2().m168532l0().f56859id) ? m213810E2().m202191k() : q54Var.m175288a().f150592a, 0, 9, m213810E2().mo168489W0())).map(new qcj() { // from class: l.fak0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97988a.m189895T4((BLiveEnvelope) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.gak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103010a.m189896U4((d36) obj);
            }
        }, new y20() { // from class: l.hak0
            @Override // p153l.y20
            public final void call(Object obj) {
                tak0.m189864m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i5 */
    public void m189909i5(String str) {
        if (m213810E2().m168532l0() == null) {
            return;
        }
        String str2 = m213810E2().m168532l0().f56859id;
        if (TextUtils.isEmpty(vxr.m203876d().m171030w0())) {
            return;
        }
        String strM171030w0 = vxr.m203876d().m171030w0();
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(100).m103154e((strM171030w0.contains("%3F") ? strM171030w0.concat("%26") : strM171030w0.concat("%3F")) + "userId%3D" + str + "%26anchorId%3D" + str2).m103152c());
    }

    /* JADX INFO: renamed from: j5 */
    public void m189910j5() {
        m213811F2().MemberEvent.show().mo199273j(2);
    }

    /* JADX INFO: renamed from: k5 */
    public final void m189911k5() {
        if (m189881F4() == null || m189881F4().isFromJs()) {
            return;
        }
        m213814K2().m189706m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: l5 */
    public void m189912l5() {
        if (m189881F4() != null) {
            xak0.m209857f(m189881F4(), mo78457R2());
        }
    }

    /* JADX INFO: renamed from: m5 */
    public void m189913m5(String str) {
        vak0 vak0Var;
        UserCardBean userCardBean = this.f172741l;
        if (userCardBean == null || userCardBean.userCardData == null || (vak0Var = userCardBean.profileData) == null || vak0Var.m200538m() == null || !TextUtils.equals(this.f172741l.userCardData.userId(), str)) {
            return;
        }
        this.f172741l.profileData.m200538m().blockStatus = "blocked";
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138861f3(m213811F2().OpenUserCardDialogEvent.show()).m138881b(new y20() { // from class: l.x9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192946a.m189907g5((UserCardData) obj);
            }
        });
        m138861f3(m213811F2().OpenUserCardDialogEvent.dismiss()).m138881b(new y20() { // from class: l.iak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113603a.m189860V4((vxj0) obj);
            }
        });
        m138861f3(m213811F2().GiftWallV2Event.openProfilePage()).m138881b(new y20() { // from class: l.lak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130707a.m189897W4((vx50) obj);
            }
        });
        m138861f3(m213811F2().LiveBlackListEvent.updateBlackStatus()).m138881b(new y20() { // from class: l.mak0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135558a.m189913m5((String) obj);
            }
        });
    }
}
