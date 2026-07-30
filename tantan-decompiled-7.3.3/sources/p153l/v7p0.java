package p153l;

import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class v7p0<D extends rwn0> extends atm0<e6p0<D>, D> {

    /* JADX INFO: renamed from: o */
    public static final int f182790o = qa00.m175861f(15);

    /* JADX INFO: renamed from: p */
    public static final int f182791p = qa00.m175861f(15);

    /* JADX INFO: renamed from: k */
    public final xak0 f182792k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f182793l;

    /* JADX INFO: renamed from: m */
    public UserCardData f182794m;

    /* JADX INFO: renamed from: n */
    public BLiveVoiceCall f182795n;

    public v7p0(dum<D> dumVar) {
        super(dumVar);
        this.f182792k = new xak0();
        mo52715C(new e6p0(dumVar.f90815a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m200215A4(Throwable th) {
        if (th != null) {
            fhw.m125605a("voiceUserCard", th.toString());
        }
        ((e6p0) this.viewModel).m119648L0(m200232B4().isShowShadow(), null, null);
        mo100222j4(null);
        m200217Y4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m200216N4(vxj0 vxj0Var) {
        m200254z4();
    }

    /* JADX INFO: renamed from: Y4 */
    private void m200217Y4() {
        if (m200232B4() == null || m200232B4().isFromJs()) {
            return;
        }
        m213814K2().m189706m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ vak0 m200227u4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public UserCardData m200232B4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f182793l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f182794m : userCardData;
    }

    /* JADX INFO: renamed from: C4 */
    public String m200233C4() {
        return BLiveType.voiceLive;
    }

    /* JADX INFO: renamed from: D4 */
    public String m200234D4() {
        return "voiceroom-" + m200232B4().getSource();
    }

    /* JADX INFO: renamed from: E4 */
    public void m200235E4(hrk0.C17564a c17564a) {
        UserCardData userCardData;
        UserCardData userCardData2;
        UserCardData userCardData3;
        BLiveVoiceCall bLiveVoiceCallM136873l = m213810E2().m183411P2().m136873l(m200232B4().userId());
        if (bLiveVoiceCallM136873l == null || bLiveVoiceCallM136873l.equals(this.f182795n)) {
            if (!m213810E2().mo118373p() && (userCardData = this.f182794m) != null) {
                userCardData.setTo("audience");
            }
            if (this.f182795n == null || bLiveVoiceCallM136873l != null) {
                return;
            }
            this.f182795n = null;
            m200254z4();
            return;
        }
        this.f182795n = bLiveVoiceCallM136873l;
        if (!m213810E2().mo118373p() && (userCardData3 = this.f182794m) != null) {
            userCardData3.setTo("callUser");
        }
        if (!((e6p0) this.viewModel).isShowing() || (userCardData2 = this.f182794m) == null) {
            return;
        }
        m200253X4(userCardData2, true);
    }

    /* JADX INFO: renamed from: F4 */
    public boolean m200236F4(String str) {
        return m213810E2().m168477S0(str);
    }

    /* JADX INFO: renamed from: G4 */
    public void m200237G4(final User user) {
        xak0.m209855a(m213810E2().m168532l0().f56859id, m213810E2().m202191k());
        duringCreated(VCallApiProvider.callInvite(m213810E2().m202191k(), user.f56859id)).filter(new qcj() { // from class: l.k7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124281a.m200238H4((BLiveVoiceCallInvite) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.l7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130369a.m200239I4(user, (BLiveVoiceCallInvite) obj);
            }
        }, new r5k()));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ Boolean m200238H4(BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        return Boolean.valueOf(((e6p0) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m200239I4(User user, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        o1j0.m165651y(this.f196919f.getString(R$string.f48439vg, user.name));
        ((e6p0) this.viewModel).m119652e0();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m200240J4(boolean z, vak0 vak0Var) {
        if (mo100219h4() == null) {
            m200215A4(null);
            return;
        }
        ((e6p0) this.viewModel).m119648L0(m200232B4().isShowShadow(), mo100219h4(), this.f182795n);
        mo100222j4(mo100219h4());
        if (!z) {
            m200217Y4();
        }
        mo96837P3();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ C22421c m200241K4(UserCardData userCardData, uxj0 uxj0Var) {
        return new gbk0().m129796p(userCardData.userId(), m213810E2().m202191k(), userCardData.getFromIdentity(), userCardData.getTo(), m200233C4(), m200234D4(), m213810E2().m202194o(), m213810E2().mo168489W0());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m200242L4(UserCardData userCardData) {
        this.f182794m = userCardData;
        this.f182795n = m213810E2().m183411P2().m136873l(userCardData.userId());
        this.f182792k.m209864c("p_audio_profile", m213810E2().m202191k(), m213810E2().mo183435j().anchor.f45267id, mo78457R2(), userCardData);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m200243M4(UserCardData userCardData, vak0 vak0Var) {
        this.f182793l = new UserCardBean(vak0Var, userCardData);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ Boolean m200244O4(hrk0.C17564a c17564a) {
        return Boolean.valueOf(((e6p0) this.viewModel).isShowing());
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        z8p0.m219019c(this.f130285b.values(), this.f182793l);
        super.mo96837P3();
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ Boolean m200245P4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return Boolean.valueOf(((e6p0) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m200246Q4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return Boolean.valueOf(this.f182794m != null);
    }

    @Override // p153l.y8s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        m153103z2(new e7p0(this.f196918e, ((e6p0) this.viewModel).f92329q));
        m153103z2(new y6p0(this.f196918e, ((e6p0) this.viewModel).f92312G));
        m153103z2(new j8p0(this.f196918e));
        boolean zM213815L2 = m213815L2();
        dum<? extends T> dumVar = this.f196918e;
        if (zM213815L2) {
            m153103z2(new i6p0(dumVar, ((e6p0) this.viewModel).f92311F));
        } else {
            m153103z2(new p6p0(dumVar, ((e6p0) this.viewModel).f92311F));
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ UserCardData m200247R4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return this.f182794m;
    }

    /* JADX INFO: renamed from: S4 */
    public void m200248S4(BLiveVoiceCall bLiveVoiceCall, String str) {
        ydn0.m215254g(this, bLiveVoiceCall, (TextUtils.equals(str, zrv.f205799a.m207631D0()) || !m200236F4(m200232B4().userId())) ? "" : "voice-manager");
        m200254z4();
    }

    /* JADX INFO: renamed from: T4 */
    public void m200249T4(String str) {
        m200254z4();
        m213811F2().MemberEvent.dismiss().m199277p();
        m213814K2().m189706m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m213811F2().ChatEvent.chatInputClick().mo199273j(new vv4(true, str).m202991a(this.f182793l.userCardData.userId()).m202992b("3"));
        m213811F2().HourLeaderBoardEvent.show().mo199273j(Boolean.FALSE);
        m213811F2().KnightGuardEvent.closeDialog().mo199273j(new y1r(3800).m213962f(true));
    }

    /* JADX INFO: renamed from: U4 */
    public void m200250U4(String str) {
        if (m100217f4() != null) {
            g7k0.m129333c(act(), mo100219h4(), str, m213810E2().mo168489W0(), g7k0.m129334d(VoiceLive.TYPE, m213810E2() != null ? m213810E2().m202194o() : null));
        }
    }

    /* JADX INFO: renamed from: V4 */
    public void m200251V4(nsv<User> nsvVar) {
        m200254z4();
        D dM213810E2 = m213810E2();
        User user = nsvVar.f143542a;
        nsv<h64> nsvVarM136874m = dM213810E2.m183411P2().m136874m(user.f56859id);
        BLiveVoiceCall bLiveVoiceCallM136873l = dM213810E2.m183411P2().m136873l(user.f56859id);
        if (bLiveVoiceCallM136873l == null) {
            ydn0.m215251d(this, nsvVar);
        } else if (nsvVarM136874m != null) {
            ydn0.m215255h(this, bLiveVoiceCallM136873l, nsvVarM136874m);
        }
    }

    /* JADX INFO: renamed from: W4 */
    public void m200252W4(UserCardData userCardData) {
        m200253X4(userCardData, false);
    }

    /* JADX INFO: renamed from: X4 */
    public void m200253X4(final UserCardData userCardData, final boolean z) {
        duringCreated(m213810E2().m168537m2().onErrorReturn(new qcj() { // from class: l.s7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).flatMap(new qcj() { // from class: l.t7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172461a.m200241K4(userCardData, (uxj0) obj);
            }
        })).onErrorReturn(new qcj() { // from class: l.u7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v7p0.m200227u4((Throwable) obj);
            }
        }).doOnSubscribe(new x20() { // from class: l.g7p0
            @Override // p153l.x20
            public final void call() {
                this.f102613a.m200242L4(userCardData);
            }
        }).doOnNext(new y20() { // from class: l.h7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108145a.m200243M4(userCardData, (vak0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.i7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113286a.m200240J4(z, (vak0) obj);
            }
        }, new y20() { // from class: l.j7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118702a.m200215A4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: c4 */
    public String mo100214c4() {
        return "voiceLiveRoom";
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: h4 */
    public vak0 mo100219h4() {
        return this.f182793l.profileData;
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: i4 */
    public void mo100221i4() {
        super.mo100221i4();
        ((e6p0) this.viewModel).m119643D0();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().OpenUserCardDialogEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.f7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97582a.m200252W4((UserCardData) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().OpenUserCardDialogEvent.dismiss().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.m7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135094a.m200216N4((vxj0) obj);
            }
        }));
        duringCreated(m213810E2().m183413Q2()).filter(new qcj() { // from class: l.n7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f140619a.m200244O4((hrk0.C17564a) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.o7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145289a.m200235E4((hrk0.C17564a) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71701c0).filter(new qcj() { // from class: l.p7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f150955a.m200245P4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).filter(new qcj() { // from class: l.q7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f155997a.m200246Q4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).map(new qcj() { // from class: l.r7p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161629a.m200247R4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.f7p0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97582a.m200252W4((UserCardData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public void m200254z4() {
        this.f182792k.m209863b();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((e6p0) v2).mo73021p();
        }
    }
}
