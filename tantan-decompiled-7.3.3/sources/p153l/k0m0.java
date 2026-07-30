package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCanJoinGame;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGame;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import com.p051p1.mobile.putong.live.livingroom.virtual.game.VirtualGamePanelViewModel;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: classes5.dex */
public class k0m0 extends i6t<rwn0, VirtualGamePanelViewModel> implements C13038a.a {

    /* JADX INFO: renamed from: i */
    public whn0 f123405i;

    /* JADX INFO: renamed from: j */
    public BLiveVoiceGame f123406j;

    /* JADX INFO: renamed from: k */
    public boolean f123407k;

    /* JADX INFO: renamed from: l */
    public int f123408l;

    public k0m0(dum<? extends rwn0> dumVar) {
        super(dumVar);
        this.f123407k = true;
        this.f123408l = 0;
        this.f123405i = new whn0(dumVar.f90815a);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m147797J3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m147799L3(y20 y20Var, Throwable th) {
        th.toString();
        nsh0.m164608j("intl_sud_sdk", "load  sud sdk failed");
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m147801N3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m147802O3(y20 y20Var, LoadEvent loadEvent) {
        if (loadEvent.m82621c()) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m147806T3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m147811Y3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m147812Z3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m147814b4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: d4 */
    private void m147816d4(final y20<Boolean> y20Var) {
        if (elt.m121284v()) {
            y20Var.call(Boolean.TRUE);
        } else {
            duringCreated(elt.m121285w()).subscribe(dhw.m115826e(new y20() { // from class: l.j0m0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k0m0.m147802O3(y20Var, (LoadEvent) obj);
                }
            }, new y20() { // from class: l.rzl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k0m0.m147799L3(y20Var, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public Pair<int[], Integer> m147817f4(nfn0 nfn0Var) {
        return ((VirtualGamePanelViewModel) this.viewModel).f53143d.m78195u(nfn0Var.f141748d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m147818j4(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            this.f123405i.m76454x();
        } else if (c4470c == C4470c.f16267i) {
            this.f123405i.m76456z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m147819m4(Boolean bool) {
        if (!bool.booleanValue()) {
            o1j0.m165649w(R$string.f47524F9);
        } else {
            m147820s4();
            m147831r4();
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m147820s4() {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = new GameViewInfoModel.GameViewRectModel();
        gameViewRectModel.left = 0;
        gameViewRectModel.top = qa00.m175859d(151.0f) + bnl0.m105513G0(true);
        gameViewRectModel.right = 0;
        gameViewRectModel.bottom = qa00.m175859d(200.0f);
        whn0 whn0Var = this.f123405i;
        whn0Var.f51845k = gameViewRectModel;
        GameConfigModel gameConfigModelM76460G = whn0Var.m76460G();
        GameConfigModel.GameUi gameUi = gameConfigModelM76460G.f51847ui;
        gameUi.ping.hide = false;
        gameUi.join_btn.custom = true;
        gameUi.lobby_players.custom = true;
        gameUi.game_bg.hide = false;
        gameConfigModelM76460G.gameCPU = i9n.m139129d() ? 1 : 0;
        gameConfigModelM76460G.f51847ui.lobby_game_setting.hide = true;
        gameConfigModelM76460G.gameSoundControl = 1;
        SudMGP.getCfg().setShowLoadingGameBg(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: J0 */
    public void mo76469J0() {
        if (((rwn0) m213810E2()).m183411P2().m136879r().m97107C(zrv.f205799a.m207631D0()) != null) {
            m147823h4();
            return;
        }
        bzm0 bzm0Var = new bzm0();
        bzm0Var.m107180a(new x20() { // from class: l.uzl0
            @Override // p153l.x20
            public final void call() {
                this.f181793a.m147823h4();
            }
        });
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(bzm0Var);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: Q0 */
    public void mo76470Q0(SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        super.mo76470Q0(mGCommonGameSound);
        uzl uzlVar = (uzl) m138856F3(new k210(7012));
        if (uzlVar == null || TextUtils.isEmpty(mGCommonGameSound.url)) {
            return;
        }
        boolean zEquals = TextUtils.equals(mGCommonGameSound.times, "0");
        if (!mGCommonGameSound.isPlay) {
            uzlVar.stopEffect(mGCommonGameSound.url.hashCode());
            uzlVar.stopSurroundMusic();
        } else {
            if (zEquals) {
                uzlVar.mo73039E(mGCommonGameSound.url, true);
                return;
            }
            int i = this.f123408l;
            this.f123408l = i + 1;
            uzlVar.mo73067u(i % 20, mGCommonGameSound.url, zEquals, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: R0 */
    public void mo76471R0(String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        fhw.m125605a("virtual_game", "Join userId:" + str + ",in" + mGCommonPlayerIn.isIn);
        if (TextUtils.equals(str, zrv.f205799a.m207631D0())) {
            if (mGCommonPlayerIn.isIn) {
                duringCreated(kzl0.m152186h(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.vzl0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k0m0.m147801N3((BLiveEnvelope) obj);
                    }
                }));
                return;
            }
            duringCreated(kzl0.m152187i(((rwn0) m213810E2()).m202191k(), str, mGCommonPlayerIn.reason + "")).subscribe(dhw.m115829h(new y20() { // from class: l.wzl0
                @Override // p153l.y20
                public final void call(Object obj) {
                    k0m0.m147814b4((BLiveEnvelope) obj);
                }
            }));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        elt.m121259C();
        m138860d3(vjj.class, new qcj() { // from class: l.qzl0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160274a.m147824i4((vjj) obj);
            }
        });
        duringCreated(lifecycle()).subscribe(dhw.m115829h(new y20() { // from class: l.b0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74281a.m147818j4((C4470c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: T0 */
    public void mo76472T0(String str, boolean z) {
        fhw.m125605a("virtual_game", "Ready userId:" + str + ",isReady" + z);
        if (TextUtils.equals(str, zrv.f205799a.m207631D0())) {
            if (z) {
                duringCreated(kzl0.m152188j(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.xzl0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k0m0.m147811Y3((BLiveEnvelope) obj);
                    }
                }));
            } else if (this.f123405i.m76444n().playerIsReady(str)) {
                duringCreated(kzl0.m152182d(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115829h(new y20() { // from class: l.yzl0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k0m0.m147806T3((BLiveEnvelope) obj);
                    }
                }));
            }
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: Z */
    public void mo76473Z(View view) {
        fhw.m125605a("virtual_game", "onAddGameView");
        ((VirtualGamePanelViewModel) this.viewModel).m78137Q();
        ((VoiceVirtualRoomView) m213819Q2()).f52998f.removeAllViews();
        TouchSwallowView touchSwallowView = ((VoiceVirtualRoomView) m213819Q2()).f52998f;
        int i = bnl0.f77544e;
        touchSwallowView.addView(view, i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m147821e4() {
        HashSet<String> playerInSet;
        Set<String> setKeySet = this.f123405i.m76444n().getPlayerPlayingMap().keySet();
        if (!jyb.m147479J(setKeySet) && m147822g4()) {
            for (String str : setKeySet) {
                boolean zPlayerIsPlaying = this.f123405i.m76444n().playerIsPlaying(str);
                if (!guk0.m132329h(((rwn0) m213810E2()).m183411P2().m136873l(str)) && zPlayerIsPlaying && TextUtils.equals(zrv.f205799a.m207631D0(), str)) {
                    this.f123405i.m76464K();
                    fhw.m125605a("virtual_game", "playing notifySelfEnd");
                }
            }
            return;
        }
        String captainUserId = this.f123405i.m76444n().getCaptainUserId();
        if (!TextUtils.equals(zrv.f205799a.m207631D0(), captainUserId) || (playerInSet = this.f123405i.m76444n().getPlayerInSet()) == null) {
            return;
        }
        HashSet<String> playerReadySet = this.f123405i.m76444n().getPlayerReadySet();
        for (String str2 : playerInSet) {
            if (!this.f123405i.m76444n().playerIsPlaying(str2) && !guk0.m132329h(((rwn0) m213810E2()).m183411P2().m136873l(str2))) {
                if (TextUtils.equals(str2, captainUserId)) {
                    if (playerReadySet != null && playerReadySet.contains(str2)) {
                        this.f123405i.m76465L();
                        fhw.m125605a("virtual_game", "notifyUserCancelPrepare");
                    }
                    this.f123405i.m76467N();
                    fhw.m125605a("virtual_game", "notifyUserQuitGame");
                } else {
                    this.f123405i.m76461H(str2);
                    fhw.m125605a("virtual_game", "kickoutPerson");
                }
            }
        }
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m147822g4() {
        Set<String> setKeySet = this.f123405i.m76444n().getPlayerPlayingMap().keySet();
        if (jyb.m147479J(setKeySet)) {
            return false;
        }
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (this.f123405i.m76444n().playerIsPlaying(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m147823h4() {
        duringCreated(kzl0.m152183e(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.zzl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206716a.m147826l4((BLiveVoiceCanJoinGame) obj);
            }
        }, new z2e0()));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ String m147824i4(vjj vjjVar) {
        BLiveVoiceGame bLiveVoiceGame = this.f123406j;
        return bLiveVoiceGame == null ? "" : bLiveVoiceGame.backgroundImage;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m147825k4() {
        this.f123405i.m76463J();
        this.f123405i.m76466M();
        if (this.f123407k) {
            o1j0.m165651y("加入成功");
        }
        this.f123407k = true;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m147826l4(BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame) {
        if (bLiveVoiceCanJoinGame.can) {
            l51.m152888H(act(), new Runnable() { // from class: l.a0m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67728a.m147825k4();
                }
            }, 1000L);
        } else {
            o1j0.m165651y(bLiveVoiceCanJoinGame.msg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        c0m c0mVarM168456H0 = ((rwn0) m213810E2()).m168456H0();
        if (c0mVarM168456H0 != null) {
            c0mVarM168456H0.mo107430a().stopSurroundMusic();
        }
        this.f123408l = 0;
        this.f123406j = null;
        this.f123405i.m76453w();
        this.f123405i.m76468O(null);
        ((VoiceVirtualRoomView) m213819Q2()).f52998f.removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: n1 */
    public void mo76475n1(String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        fhw.m125605a("virtual_game", "Playing userId:" + str + ",isPlaying" + mGCommonPlayerPlaying.isPlaying);
        String str2 = mGCommonPlayerPlaying.gameRoundId;
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.f123406j.providerRoundId)) {
            str2 = this.f123406j.providerRoundId;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.equals(str, zrv.f205799a.m207631D0())) {
            if (mGCommonPlayerPlaying.isPlaying) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = this.f123405i.m76444n().getPlayerPlayingMap().keySet();
                String captainUserId = this.f123405i.m76444n().getCaptainUserId();
                if (!jyb.m147479J(setKeySet)) {
                    for (String str3 : setKeySet) {
                        if (this.f123405i.m76444n().playerIsPlaying(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
                this.f123406j.providerRoundId = str2;
                duringCreated(kzl0.m152190l(((rwn0) m213810E2()).m202191k(), str2, arrayList, this.f123406j.type, captainUserId)).subscribe(dhw.m115829h(new y20() { // from class: l.szl0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k0m0.m147812Z3((BLiveEnvelope) obj);
                    }
                }));
            } else {
                duringCreated(kzl0.m152189k(((rwn0) m213810E2()).m202191k(), mGCommonPlayerPlaying.gameRoundId, mGCommonPlayerPlaying.reason + "")).subscribe(dhw.m115829h(new y20() { // from class: l.tzl0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k0m0.m147797J3((BLiveEnvelope) obj);
                    }
                }));
            }
        }
        m147821e4();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m147827n4(LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        m147831r4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m147828o4(LongLinkVirtualVoice.VoiceLiveGameTypeMessage voiceLiveGameTypeMessage) {
        m147831r4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    public void onGameStarted() {
        this.f196919f.getWindow().setSoftInputMode(19);
        if (((rwn0) m213810E2()).mo146598N2()) {
            mo76469J0();
            ((rwn0) m213810E2()).mo146595I3(false);
            this.f123407k = false;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m147829p4(hrk0.C17564a c17564a) {
        m147821e4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m147830q4(BLiveVoiceGame bLiveVoiceGame) {
        m213811F2().GameEvent.loadGame().m199277p();
        BLiveVoiceGame bLiveVoiceGame2 = this.f123406j;
        if (bLiveVoiceGame2 == null || bLiveVoiceGame == null || bLiveVoiceGame2.agoraGameId != bLiveVoiceGame.agoraGameId || !TextUtils.equals(bLiveVoiceGame2.providerRoundId, bLiveVoiceGame.providerRoundId)) {
            this.f123406j = bLiveVoiceGame;
            m213811F2().VoiceVirtualLiveEvent.changeRoomBg().mo199273j("");
            if (bLiveVoiceGame != null) {
                this.f123405i.m76436D(((rwn0) m213810E2()).m202194o(), bLiveVoiceGame.agoraGameId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public void m147831r4() {
        duringCreated(kzl0.m152185g(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.i0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112419a.m147830q4((BLiveVoiceGame) obj);
            }
        }, new z2e0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m153103z2(new pzl0(this.f196918e, ((VirtualGamePanelViewModel) this.viewModel).f53143d));
        ((VirtualGamePanelViewModel) this.viewModel).setSwallowTarget(this.f196918e.f90820f);
        this.f123405i.m76468O(this);
        m147816d4(new y20() { // from class: l.c0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79282a.m147819m4((Boolean) obj);
            }
        });
        m113231o2(((rwn0) m213810E2()).f148282z.m170284r().m98261W0(), false).filter(new qcj() { // from class: l.d0m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("game".equals(((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj).getTemplate()));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.e0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91508a.m147827n4((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
        m113231o2(((rwn0) m213810E2()).m168545q1().m98234J(), false).subscribe(dhw.m115829h(new y20() { // from class: l.f0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96699a.m147828o4((LongLinkVirtualVoice.VoiceLiveGameTypeMessage) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m183413Q2()).subscribe(dhw.m115829h(new y20() { // from class: l.g0m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101661a.m147829p4((hrk0.C17564a) obj);
            }
        }));
        m138860d3(nfn0.class, new qcj() { // from class: l.h0m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107312a.m147817f4((nfn0) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: t0 */
    public void mo76476t0() {
        fhw.m125605a("virtual_game", "onRemoveGameView");
        ((VoiceVirtualRoomView) m213819Q2()).f52998f.removeAllViews();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: x0 */
    public void mo76477x0(SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        super.mo76477x0(mGCommonGameSoundState);
        uzl uzlVar = (uzl) m138856F3(new k210(7012));
        if (mGCommonGameSoundState.state || uzlVar == null) {
            return;
        }
        int i = this.f123408l;
        int i2 = i > 20 ? i % 20 : 20;
        for (int i3 = 0; i3 < i2; i3++) {
            uzlVar.stopEffect(i3);
        }
        this.f123408l = 0;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    /* JADX INFO: renamed from: n0 */
    public void mo76474n0() {
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C13038a.a
    public void onGameDestroyed() {
    }
}
