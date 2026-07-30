package p009l;

import android.text.TextUtils;
import androidx.annotation.CallSuper;
import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardBean;
import com.p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.data.DbObject;
import l.a2k0;
import l.bik0;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.hfw;
import l.jo0;
import l.k4t;
import l.lsi0;
import l.mqv;
import l.nnn0;
import l.p1k0;
import l.r1k0;
import l.roj0;
import l.soj0;
import l.t100;
import l.u4n0;
import l.w9j;
import l.wu4;
import l.wxs;
import l.xzq;
import l.z2k;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ryo0<D extends nnn0> extends wjm0<axo0<D>, D> {

    /* JADX INFO: renamed from: o */
    public static final int f20028o = t100.f(15);

    /* JADX INFO: renamed from: p */
    public static final int f20029p = t100.f(15);

    /* JADX INFO: renamed from: k */
    public final r1k0 f20030k;

    /* JADX INFO: renamed from: l */
    public UserCardBean f20031l;

    /* JADX INFO: renamed from: m */
    public UserCardData f20032m;

    /* JADX INFO: renamed from: n */
    public BLiveVoiceCall f20033n;

    public ryo0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f20030k = new r1k0();
        C(new axo0(bsmVar.a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public void m21891A4(Throwable th) {
        if (th != null) {
            hfw.a("voiceUserCard", th.toString());
        }
        ((bwr) this).viewModel.m11740L0(m21908B4().isShowShadow(), null, null);
        mo14704j4(null);
        m21893Y4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m21892N4(soj0 soj0Var) {
        m21936z4();
    }

    /* JADX INFO: renamed from: Y4 */
    private void m21893Y4() {
        if (m21908B4() == null || m21908B4().isFromJs()) {
            return;
        }
        K2().m(LiveDialogEnum.WEBVIEW);
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ p1k0 m21903u4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: B4 */
    public UserCardData m21908B4() {
        UserCardData userCardData;
        UserCardBean userCardBean = this.f20031l;
        return (userCardBean == null || (userCardData = userCardBean.userCardData) == null) ? this.f20032m : userCardData;
    }

    /* JADX INFO: renamed from: C4 */
    public String m21909C4() {
        return "voiceLive";
    }

    /* JADX INFO: renamed from: D4 */
    public String m21910D4() {
        return "voiceroom-" + m21908B4().getSource();
    }

    /* JADX INFO: renamed from: E4 */
    public void m21911E4(bik0.a aVar) {
        UserCardData userCardData;
        UserCardData userCardData2;
        UserCardData userCardData3;
        BLiveVoiceCall bLiveVoiceCallL = E2().P2().l(m21908B4().userId());
        if (bLiveVoiceCallL == null || bLiveVoiceCallL.equals(this.f20033n)) {
            if (!E2().p() && (userCardData = this.f20032m) != null) {
                userCardData.setTo("audience");
            }
            if (this.f20033n == null || bLiveVoiceCallL != null) {
                return;
            }
            this.f20033n = null;
            m21936z4();
            return;
        }
        this.f20033n = bLiveVoiceCallL;
        if (!E2().p() && (userCardData3 = this.f20032m) != null) {
            userCardData3.setTo("callUser");
        }
        if (!((bwr) this).viewModel.isShowing() || (userCardData2 = this.f20032m) == null) {
            return;
        }
        m21931X4(userCardData2, true);
    }

    /* JADX INFO: renamed from: F4 */
    public boolean m21912F4(String str) {
        return E2().S0(str);
    }

    /* JADX INFO: renamed from: G4 */
    public void m21913G4(final User user) {
        r1k0.a(((DbObject) E2().l0()).id, E2().k());
        duringCreated(VCallApiProvider.callInvite(E2().k(), ((DbObject) user).id)).filter(new w9j() { // from class: l.gyo0
            public final Object call(Object obj) {
                return this.f13817a.m21914H4((BLiveVoiceCallInvite) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.hyo0
            public final void call(Object obj) {
                this.f14309a.m21915I4(user, (BLiveVoiceCallInvite) obj);
            }
        }, new z2k()));
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ Boolean m21914H4(BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        return Boolean.valueOf(((bwr) this).viewModel.isShowing());
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m21915I4(User user, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        lsi0.y(((wxs) this).f.getString(R.string.vg, user.name));
        ((bwr) this).viewModel.m11744e0();
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m21916J4(boolean z, p1k0 p1k0Var) {
        if (mo21933h4() == null) {
            m21891A4(null);
            return;
        }
        ((bwr) this).viewModel.m11740L0(m21908B4().isShowShadow(), mo21933h4(), this.f20033n);
        mo14704j4(mo21933h4());
        if (!z) {
            m21893Y4();
        }
        m21921P3();
    }

    /* JADX INFO: renamed from: K4 */
    public final /* synthetic */ c m21917K4(UserCardData userCardData, roj0 roj0Var) {
        return new a2k0().p(userCardData.userId(), E2().k(), userCardData.getFromIdentity(), userCardData.getTo(), m21909C4(), m21910D4(), E2().o(), E2().W0());
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m21918L4(UserCardData userCardData) {
        this.f20032m = userCardData;
        this.f20033n = E2().P2().l(userCardData.userId());
        this.f20030k.c("p_audio_profile", E2().k(), ((BLiveAbsData) E2().V2()).anchor.id, R2(), userCardData);
    }

    /* JADX INFO: renamed from: M4 */
    public final /* synthetic */ void m21919M4(UserCardData userCardData, p1k0 p1k0Var) {
        this.f20031l = new UserCardBean(p1k0Var, userCardData);
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ Boolean m21920O4(bik0.a aVar) {
        return Boolean.valueOf(((bwr) this).viewModel.isShowing());
    }

    /* JADX INFO: renamed from: P3 */
    public void m21921P3() {
        vzo0.m23767c(((k4t) this).b.values(), this.f20031l);
        super.P3();
    }

    /* JADX INFO: renamed from: P4 */
    public final /* synthetic */ Boolean m21922P4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return Boolean.valueOf(((bwr) this).viewModel.isShowing());
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ Boolean m21923Q4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return Boolean.valueOf(this.f20032m != null);
    }

    @CallSuper
    /* JADX INFO: renamed from: R3 */
    public void m21924R3() {
        z2(new ayo0(((wxs) this).e, ((bwr) this).viewModel.f9753q));
        z2(new uxo0(((wxs) this).e, ((bwr) this).viewModel.f9736G));
        z2(new fzo0(((wxs) this).e));
        boolean zL2 = L2();
        bsm bsmVar = ((wxs) this).e;
        if (zL2) {
            z2(new exo0(bsmVar, ((bwr) this).viewModel.f9735F));
        } else {
            z2(new lxo0(bsmVar, ((bwr) this).viewModel.f9735F));
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ UserCardData m21925R4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        return this.f20032m;
    }

    /* JADX INFO: renamed from: S4 */
    public void m21926S4(BLiveVoiceCall bLiveVoiceCall, String str) {
        u4n0.g(this, bLiveVoiceCall, (TextUtils.equals(str, ypv.f23196a.m23619D0()) || !m21912F4(m21908B4().userId())) ? "" : "voice-manager");
        m21936z4();
    }

    /* JADX INFO: renamed from: T4 */
    public void m21927T4(String str) {
        m21936z4();
        F2().MemberEvent.dismiss().p();
        K2().m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        F2().ChatEvent.chatInputClick().j(new wu4(true, str).a(this.f20031l.userCardData.userId()).b("3"));
        F2().HourLeaderBoardEvent.show().j(Boolean.FALSE);
        F2().KnightGuardEvent.closeDialog().j(new xzq(3800).f(true));
    }

    /* JADX INFO: renamed from: U4 */
    public void m21928U4(String str) {
        if (m24302f4() != null) {
            ayj0.m11768c(act(), mo21933h4(), str, E2().W0(), ayj0.m11769d("voicelive", E2() != null ? E2().o() : null));
        }
    }

    /* JADX INFO: renamed from: V4 */
    public void m21929V4(mqv<User> mqvVar) {
        m21936z4();
        nnn0 nnn0VarE2 = E2();
        User user = (User) mqvVar.a;
        mqv mqvVarM = nnn0VarE2.P2().m(((DbObject) user).id);
        BLiveVoiceCall bLiveVoiceCallL = nnn0VarE2.P2().l(((DbObject) user).id);
        if (bLiveVoiceCallL == null) {
            u4n0.d(this, mqvVar);
        } else if (mqvVarM != null) {
            u4n0.h(this, bLiveVoiceCallL, mqvVarM);
        }
    }

    /* JADX INFO: renamed from: W4 */
    public void m21930W4(UserCardData userCardData) {
        m21931X4(userCardData, false);
    }

    /* JADX INFO: renamed from: X4 */
    public void m21931X4(final UserCardData userCardData, final boolean z) {
        duringCreated(E2().m2().onErrorReturn(new w9j() { // from class: l.oyo0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.pyo0
            public final Object call(Object obj) {
                return this.f18971a.m21917K4(userCardData, (roj0) obj);
            }
        })).onErrorReturn(new w9j() { // from class: l.qyo0
            public final Object call(Object obj) {
                return ryo0.m21903u4((Throwable) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.cyo0
            public final void call() {
                this.f10824a.m21918L4(userCardData);
            }
        }).doOnNext(new e30() { // from class: l.dyo0
            public final void call(Object obj) {
                this.f12065a.m21919M4(userCardData, (p1k0) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.eyo0
            public final void call(Object obj) {
                this.f12726a.m21916J4(z, (p1k0) obj);
            }
        }, new e30() { // from class: l.fyo0
            public final void call(Object obj) {
                this.f13225a.m21891A4((Throwable) obj);
            }
        }));
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: c4 */
    public String mo21932c4() {
        return "voiceLiveRoom";
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: h4 */
    public p1k0 mo21933h4() {
        return this.f20031l.profileData;
    }

    @Override // p009l.wjm0
    /* JADX INFO: renamed from: i4 */
    public void mo21934i4() {
        super.mo21934i4();
        ((bwr) this).viewModel.m11735D0();
    }

    /* JADX INFO: renamed from: t */
    public void m21935t() {
        super/*l.k4t*/.t();
        duringCreated((c) F2().OpenUserCardDialogEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.byo0
            public final void call(Object obj) {
                this.f10362a.m21930W4((UserCardData) obj);
            }
        }));
        duringCreated((c) F2().OpenUserCardDialogEvent.dismiss().g()).subscribe(ffw.d(new e30() { // from class: l.iyo0
            public final void call(Object obj) {
                this.f14863a.m21892N4((soj0) obj);
            }
        }));
        duringCreated(E2().Q2()).filter(new w9j() { // from class: l.jyo0
            public final Object call(Object obj) {
                return this.f15364a.m21920O4((bik0.a) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.kyo0
            public final void call(Object obj) {
                this.f15883a.m21911E4((bik0.a) obj);
            }
        }));
        duringCreated(E2().q1().c0).filter(new w9j() { // from class: l.lyo0
            public final Object call(Object obj) {
                return this.f16449a.m21922P4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).filter(new w9j() { // from class: l.myo0
            public final Object call(Object obj) {
                return this.f17157a.m21923Q4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).map(new w9j() { // from class: l.nyo0
            public final Object call(Object obj) {
                return this.f17769a.m21925R4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.byo0
            public final void call(Object obj) {
                this.f10362a.m21930W4((UserCardData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public void m21936z4() {
        this.f20030k.b();
        axo0 axo0Var = ((bwr) this).viewModel;
        if (axo0Var != null) {
            axo0Var.p();
        }
    }
}
