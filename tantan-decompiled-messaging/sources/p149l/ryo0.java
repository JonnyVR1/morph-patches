package p149l;

import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class ryo0<D extends nnn0> extends wjm0<axo0<D>, D> {

    /* JADX INFO: renamed from: o */
    public static final int f161569o = t100.m186892f(15);

    /* JADX INFO: renamed from: p */
    public static final int f161570p = t100.m186892f(15);

    /* JADX INFO: renamed from: k */
    public final r1k0 f161571k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f161572l;

    /* JADX INFO: renamed from: m */
    public UserCardData f161573m;

    /* JADX INFO: renamed from: n */
    public BLiveVoiceCall f161574n;

    public ryo0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f161571k = new r1k0();
        mo51532C(new axo0(bsmVar.f77095a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m181667A4(Throwable th) {
        if (th != null) {
            hfw.m130790a("voiceUserCard", th.toString());
        }
        ((axo0) this.viewModel).m99496L0(m181684B4().isShowShadow(), null, null);
        mo123913j4(null);
        m181669Y4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m181668N4(soj0 soj0Var) {
        m181709z4();
    }

    /* JADX INFO: renamed from: Y4 */
    private void m181669Y4() {
        if (m181684B4() == null || m181684B4().isFromJs()) {
            return;
        }
        m206031K2().m182470m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ p1k0 m181679u4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public UserCardData m181684B4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f161572l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f161573m : userCardData;
    }

    /* JADX INFO: renamed from: C4 */
    public String m181685C4() {
        return BLiveType.voiceLive;
    }

    /* JADX INFO: renamed from: D4 */
    public String m181686D4() {
        return "voiceroom-" + m181684B4().getSource();
    }

    /* JADX INFO: renamed from: E4 */
    public void m181687E4(bik0.C15867a c15867a) {
        UserCardData userCardData;
        UserCardData userCardData2;
        UserCardData userCardData3;
        BLiveVoiceCall bLiveVoiceCallM102063l = m206027E2().m160249P2().m102063l(m181684B4().userId());
        if (bLiveVoiceCallM102063l == null || bLiveVoiceCallM102063l.equals(this.f161574n)) {
            if (!m206027E2().mo97490p() && (userCardData = this.f161573m) != null) {
                userCardData.setTo("audience");
            }
            if (this.f161574n == null || bLiveVoiceCallM102063l != null) {
                return;
            }
            this.f161574n = null;
            m181709z4();
            return;
        }
        this.f161574n = bLiveVoiceCallM102063l;
        if (!m206027E2().mo97490p() && (userCardData3 = this.f161573m) != null) {
            userCardData3.setTo("callUser");
        }
        if (!((axo0) this.viewModel).isShowing() || (userCardData2 = this.f161573m) == null) {
            return;
        }
        m181705X4(userCardData2, true);
    }

    /* JADX INFO: renamed from: F4 */
    public boolean m181688F4(String str) {
        return m206027E2().m132091S0(str);
    }

    /* JADX INFO: renamed from: G4 */
    public void m181689G4(final User user) {
        r1k0.m177467a(m206027E2().m132146l0().f56011id, m206027E2().m149814k());
        duringCreated(VCallApiProvider.callInvite(m206027E2().m149814k(), user.f56011id)).filter(new w9j() { // from class: l.gyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105026a.m181690H4((BLiveVoiceCallInvite) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.hyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110127a.m181691I4(user, (BLiveVoiceCallInvite) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ Boolean m181690H4(BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        return Boolean.valueOf(((axo0) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m181691I4(User user, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        lsi0.m151595y(this.f188513f.getString(R$string.f47591vg, user.name));
        ((axo0) this.viewModel).m99500e0();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m181692J4(boolean z, p1k0 p1k0Var) {
        if (mo181707h4() == null) {
            m181667A4(null);
            return;
        }
        ((axo0) this.viewModel).m99496L0(m181684B4().isShowShadow(), mo181707h4(), this.f161574n);
        mo123913j4(mo181707h4());
        if (!z) {
            m181669Y4();
        }
        mo99576P3();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ C22306c m181693K4(UserCardData userCardData, roj0 roj0Var) {
        return new a2k0().m94618p(userCardData.userId(), m206027E2().m149814k(), userCardData.getFromIdentity(), userCardData.getTo(), m181685C4(), m181686D4(), m206027E2().m149818o(), m206027E2().mo132103W0());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m181694L4(UserCardData userCardData) {
        this.f161573m = userCardData;
        this.f161574n = m206027E2().m160249P2().m102063l(userCardData.userId());
        this.f161571k.m177476c("p_audio_profile", m206027E2().m149814k(), m206027E2().mo149813j().anchor.f44419id, mo77274R2(), userCardData);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m181695M4(UserCardData userCardData, p1k0 p1k0Var) {
        this.f161572l = new UserCardBean(p1k0Var, userCardData);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ Boolean m181696O4(bik0.C15867a c15867a) {
        return Boolean.valueOf(((axo0) this.viewModel).isShowing());
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        vzo0.m200776c(this.f121122b.values(), this.f161572l);
        super.mo99576P3();
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ Boolean m181697P4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return Boolean.valueOf(((axo0) this.viewModel).isShowing());
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m181698Q4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return Boolean.valueOf(this.f161573m != null);
    }

    @Override // p149l.x6s
    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        m144512z2(new ayo0(this.f188512e, ((axo0) this.viewModel).f72220q));
        m144512z2(new uxo0(this.f188512e, ((axo0) this.viewModel).f72203G));
        m144512z2(new fzo0(this.f188512e));
        boolean zM206032L2 = m206032L2();
        bsm<? extends T> bsmVar = this.f188512e;
        if (zM206032L2) {
            m144512z2(new exo0(bsmVar, ((axo0) this.viewModel).f72202F));
        } else {
            m144512z2(new lxo0(bsmVar, ((axo0) this.viewModel).f72202F));
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ UserCardData m181699R4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return this.f161573m;
    }

    /* JADX INFO: renamed from: S4 */
    public void m181700S4(BLiveVoiceCall bLiveVoiceCall, String str) {
        u4n0.m191748g(this, bLiveVoiceCall, (TextUtils.equals(str, ypv.f199493a.m199309D0()) || !m181688F4(m181684B4().userId())) ? "" : "voice-manager");
        m181709z4();
    }

    /* JADX INFO: renamed from: T4 */
    public void m181701T4(String str) {
        m181709z4();
        m206028F2().MemberEvent.dismiss().m172467p();
        m206031K2().m182470m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, str).m205591a(this.f161572l.userCardData.userId()).m205592b("3"));
        m206028F2().HourLeaderBoardEvent.show().mo172463j(Boolean.FALSE);
        m206028F2().KnightGuardEvent.closeDialog().mo172463j(new xzq(3800).m212016f(true));
    }

    /* JADX INFO: renamed from: U4 */
    public void m181702U4(String str) {
        if (m203475f4() != null) {
            ayj0.m99568c(act(), mo181707h4(), str, m206027E2().mo132103W0(), ayj0.m99569d(VoiceLive.TYPE, m206027E2() != null ? m206027E2().m149818o() : null));
        }
    }

    /* JADX INFO: renamed from: V4 */
    public void m181703V4(mqv<User> mqvVar) {
        m181709z4();
        D dM206027E2 = m206027E2();
        User user = mqvVar.f135304a;
        mqv<i54> mqvVarM102064m = dM206027E2.m160249P2().m102064m(user.f56011id);
        BLiveVoiceCall bLiveVoiceCallM102063l = dM206027E2.m160249P2().m102063l(user.f56011id);
        if (bLiveVoiceCallM102063l == null) {
            u4n0.m191745d(this, mqvVar);
        } else if (mqvVarM102064m != null) {
            u4n0.m191749h(this, bLiveVoiceCallM102063l, mqvVarM102064m);
        }
    }

    /* JADX INFO: renamed from: W4 */
    public void m181704W4(UserCardData userCardData) {
        m181705X4(userCardData, false);
    }

    /* JADX INFO: renamed from: X4 */
    public void m181705X4(final UserCardData userCardData, final boolean z) {
        duringCreated(m206027E2().m132151m2().onErrorReturn(new w9j() { // from class: l.oyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.pyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151867a.m181693K4(userCardData, (roj0) obj);
            }
        })).onErrorReturn(new w9j() { // from class: l.qyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ryo0.m181679u4((Throwable) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.cyo0
            @Override // p149l.d30
            public final void call() {
                this.f83019a.m181694L4(userCardData);
            }
        }).doOnNext(new e30() { // from class: l.dyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88412a.m181695M4(userCardData, (p1k0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.eyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93781a.m181692J4(z, (p1k0) obj);
            }
        }, new e30() { // from class: l.fyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99887a.m181667A4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: c4 */
    public String mo181706c4() {
        return "voiceLiveRoom";
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: h4 */
    public p1k0 mo181707h4() {
        return this.f161572l.profileData;
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: i4 */
    public void mo181708i4() {
        super.mo181708i4();
        ((axo0) this.viewModel).m99491D0();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().OpenUserCardDialogEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.byo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77948a.m181704W4((UserCardData) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().OpenUserCardDialogEvent.dismiss().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.iyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115469a.m181668N4((soj0) obj);
            }
        }));
        duringCreated(m206027E2().m160251Q2()).filter(new w9j() { // from class: l.jyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120318a.m181696O4((bik0.C15867a) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.kyo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125325a.m181687E4((bik0.C15867a) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170434c0).filter(new w9j() { // from class: l.lyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130590a.m181697P4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).filter(new w9j() { // from class: l.myo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136322a.m181698Q4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).map(new w9j() { // from class: l.nyo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141140a.m181699R4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.byo0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77948a.m181704W4((UserCardData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public void m181709z4() {
        this.f161571k.m177475b();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((axo0) v2).mo71838p();
        }
    }
}
