package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCanJoinGame;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGame;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import com.p046p1.mobile.putong.live.livingroom.virtual.game.VirtualGamePanelViewModel;
import com.tantanapp.sharedlibrary.loader.LoadEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import tech.sud.mgp.core.SudMGP;

/* JADX INFO: loaded from: classes5.dex */
public class grl0 extends h4t<nnn0, VirtualGamePanelViewModel> implements C12875a.a {

    /* JADX INFO: renamed from: i */
    public s8n0 f104071i;

    /* JADX INFO: renamed from: j */
    public BLiveVoiceGame f104072j;

    /* JADX INFO: renamed from: k */
    public boolean f104073k;

    /* JADX INFO: renamed from: l */
    public int f104074l;

    public grl0(bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        this.f104073k = true;
        this.f104074l = 0;
        this.f104071i = new s8n0(bsmVar.f77095a);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m127716J3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m127718L3(e30 e30Var, Throwable th) {
        th.toString();
        gkh0.m126627j("intl_sud_sdk", "load  sud sdk failed");
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m127720N3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m127721O3(e30 e30Var, LoadEvent loadEvent) {
        if (loadEvent.m81438c()) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m127725T3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m127730Y3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m127731Z3(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: b4 */
    public static /* synthetic */ void m127733b4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: d4 */
    private void m127735d4(final e30<Boolean> e30Var) {
        if (djt.m112139v()) {
            e30Var.call(Boolean.TRUE);
        } else {
            duringCreated(djt.m112140w()).subscribe(ffw.m121194e(new e30() { // from class: l.frl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    grl0.m127721O3(e30Var, (LoadEvent) obj);
                }
            }, new e30() { // from class: l.nql0
                @Override // p149l.e30
                public final void call(Object obj) {
                    grl0.m127718L3(e30Var, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public Pair<int[], Integer> m127736f4(j6n0 j6n0Var) {
        return ((VirtualGamePanelViewModel) this.viewModel).f52295d.m77012u(j6n0Var.f116489d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m127737j4(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            this.f104071i.m75271x();
        } else if (c4319c == C4319c.f15548i) {
            this.f104071i.m75273z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m127738m4(Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.m151593w(R$string.f46676F9);
        } else {
            m127739s4();
            m127750r4();
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m127739s4() {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = new GameViewInfoModel.GameViewRectModel();
        gameViewRectModel.left = 0;
        gameViewRectModel.top = t100.m186890d(151.0f) + xdl0.m208333G0(true);
        gameViewRectModel.right = 0;
        gameViewRectModel.bottom = t100.m186890d(200.0f);
        s8n0 s8n0Var = this.f104071i;
        s8n0Var.f50997k = gameViewRectModel;
        GameConfigModel gameConfigModelM75277G = s8n0Var.m75277G();
        GameConfigModel.GameUi gameUi = gameConfigModelM75277G.f50999ui;
        gameUi.ping.hide = false;
        gameUi.join_btn.custom = true;
        gameUi.lobby_players.custom = true;
        gameUi.game_bg.hide = false;
        gameConfigModelM75277G.gameCPU = i7n.m134918d() ? 1 : 0;
        gameConfigModelM75277G.f50999ui.lobby_game_setting.hide = true;
        gameConfigModelM75277G.gameSoundControl = 1;
        SudMGP.getCfg().setShowLoadingGameBg(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: J0 */
    public void mo75286J0() {
        if (((nnn0) m206027E2()).m160249P2().m102069r().m201350C(ypv.f199493a.m199309D0()) != null) {
            m127742h4();
            return;
        }
        xpm0 xpm0Var = new xpm0();
        xpm0Var.m210507a(new d30() { // from class: l.qql0
            @Override // p149l.d30
            public final void call() {
                this.f155914a.m127742h4();
            }
        });
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(xpm0Var);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: Q0 */
    public void mo75287Q0(SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        super.mo75287Q0(mGCommonGameSound);
        bxl bxlVar = (bxl) m129297F3(new bu00(7012));
        if (bxlVar == null || TextUtils.isEmpty(mGCommonGameSound.url)) {
            return;
        }
        boolean zEquals = TextUtils.equals(mGCommonGameSound.times, "0");
        if (!mGCommonGameSound.isPlay) {
            bxlVar.stopEffect(mGCommonGameSound.url.hashCode());
            bxlVar.stopSurroundMusic();
        } else {
            if (zEquals) {
                bxlVar.mo71856E(mGCommonGameSound.url, true);
                return;
            }
            int i = this.f104074l;
            this.f104074l = i + 1;
            bxlVar.mo71884u(i % 20, mGCommonGameSound.url, zEquals, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: R0 */
    public void mo75288R0(String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        hfw.m130790a("virtual_game", "Join userId:" + str + ",in" + mGCommonPlayerIn.isIn);
        if (TextUtils.equals(str, ypv.f199493a.m199309D0())) {
            if (mGCommonPlayerIn.isIn) {
                duringCreated(gql0.m127601h(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.rql0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        grl0.m127720N3((BLiveEnvelope) obj);
                    }
                }));
                return;
            }
            duringCreated(gql0.m127602i(((nnn0) m206027E2()).m149814k(), str, mGCommonPlayerIn.reason + "")).subscribe(ffw.m121197h(new e30() { // from class: l.sql0
                @Override // p149l.e30
                public final void call(Object obj) {
                    grl0.m127733b4((BLiveEnvelope) obj);
                }
            }));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        djt.m112114C();
        m129301d3(bhj.class, new w9j() { // from class: l.mql0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f135269a.m127743i4((bhj) obj);
            }
        });
        duringCreated(lifecycle()).subscribe(ffw.m121197h(new e30() { // from class: l.xql0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194020a.m127737j4((C4319c) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: T0 */
    public void mo75289T0(String str, boolean z) {
        hfw.m130790a("virtual_game", "Ready userId:" + str + ",isReady" + z);
        if (TextUtils.equals(str, ypv.f199493a.m199309D0())) {
            if (z) {
                duringCreated(gql0.m127603j(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.tql0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        grl0.m127730Y3((BLiveEnvelope) obj);
                    }
                }));
            } else if (this.f104071i.m75261n().playerIsReady(str)) {
                duringCreated(gql0.m127597d(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121197h(new e30() { // from class: l.uql0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        grl0.m127725T3((BLiveEnvelope) obj);
                    }
                }));
            }
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: Z */
    public void mo75290Z(View view) {
        hfw.m130790a("virtual_game", "onAddGameView");
        ((VirtualGamePanelViewModel) this.viewModel).m76954Q();
        ((VoiceVirtualRoomView) m206036Q2()).f52150f.removeAllViews();
        TouchSwallowView touchSwallowView = ((VoiceVirtualRoomView) m206036Q2()).f52150f;
        int i = xdl0.f192403e;
        touchSwallowView.addView(view, i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public final void m127740e4() {
        HashSet<String> playerInSet;
        Set<String> setKeySet = this.f104071i.m75261n().getPlayerPlayingMap().keySet();
        if (!vwb.m200296J(setKeySet) && m127741g4()) {
            for (String str : setKeySet) {
                boolean zPlayerIsPlaying = this.f104071i.m75261n().playerIsPlaying(str);
                if (!alk0.m97309h(((nnn0) m206027E2()).m160249P2().m102063l(str)) && zPlayerIsPlaying && TextUtils.equals(ypv.f199493a.m199309D0(), str)) {
                    this.f104071i.m75281K();
                    hfw.m130790a("virtual_game", "playing notifySelfEnd");
                }
            }
            return;
        }
        String captainUserId = this.f104071i.m75261n().getCaptainUserId();
        if (!TextUtils.equals(ypv.f199493a.m199309D0(), captainUserId) || (playerInSet = this.f104071i.m75261n().getPlayerInSet()) == null) {
            return;
        }
        HashSet<String> playerReadySet = this.f104071i.m75261n().getPlayerReadySet();
        for (String str2 : playerInSet) {
            if (!this.f104071i.m75261n().playerIsPlaying(str2) && !alk0.m97309h(((nnn0) m206027E2()).m160249P2().m102063l(str2))) {
                if (TextUtils.equals(str2, captainUserId)) {
                    if (playerReadySet != null && playerReadySet.contains(str2)) {
                        this.f104071i.m75282L();
                        hfw.m130790a("virtual_game", "notifyUserCancelPrepare");
                    }
                    this.f104071i.m75284N();
                    hfw.m130790a("virtual_game", "notifyUserQuitGame");
                } else {
                    this.f104071i.m75278H(str2);
                    hfw.m130790a("virtual_game", "kickoutPerson");
                }
            }
        }
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m127741g4() {
        Set<String> setKeySet = this.f104071i.m75261n().getPlayerPlayingMap().keySet();
        if (vwb.m200296J(setKeySet)) {
            return false;
        }
        Iterator<String> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (this.f104071i.m75261n().playerIsPlaying(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m127742h4() {
        duringCreated(gql0.m127598e(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.vql0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182656a.m127745l4((BLiveVoiceCanJoinGame) obj);
            }
        }, new vud0()));
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ String m127743i4(bhj bhjVar) {
        BLiveVoiceGame bLiveVoiceGame = this.f104072j;
        return bLiveVoiceGame == null ? "" : bLiveVoiceGame.backgroundImage;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m127744k4() {
        this.f104071i.m75280J();
        this.f104071i.m75283M();
        if (this.f104073k) {
            lsi0.m151595y("加入成功");
        }
        this.f104073k = true;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m127745l4(BLiveVoiceCanJoinGame bLiveVoiceCanJoinGame) {
        if (bLiveVoiceCanJoinGame.can) {
            e51.m114743H(act(), new Runnable() { // from class: l.wql0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187702a.m127744k4();
                }
            }, 1000L);
        } else {
            lsi0.m151595y(bLiveVoiceCanJoinGame.msg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        jxl jxlVarM132067H0 = ((nnn0) m206027E2()).m132067H0();
        if (jxlVarM132067H0 != null) {
            jxlVarM132067H0.mo138335a().stopSurroundMusic();
        }
        this.f104074l = 0;
        this.f104072j = null;
        this.f104071i.m75270w();
        this.f104071i.m75285O(null);
        ((VoiceVirtualRoomView) m206036Q2()).f52150f.removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: n1 */
    public void mo75292n1(String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        hfw.m130790a("virtual_game", "Playing userId:" + str + ",isPlaying" + mGCommonPlayerPlaying.isPlaying);
        String str2 = mGCommonPlayerPlaying.gameRoundId;
        if (TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.f104072j.providerRoundId)) {
            str2 = this.f104072j.providerRoundId;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.equals(str, ypv.f199493a.m199309D0())) {
            if (mGCommonPlayerPlaying.isPlaying) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = this.f104071i.m75261n().getPlayerPlayingMap().keySet();
                String captainUserId = this.f104071i.m75261n().getCaptainUserId();
                if (!vwb.m200296J(setKeySet)) {
                    for (String str3 : setKeySet) {
                        if (this.f104071i.m75261n().playerIsPlaying(str3)) {
                            arrayList.add(str3);
                        }
                    }
                }
                this.f104072j.providerRoundId = str2;
                duringCreated(gql0.m127605l(((nnn0) m206027E2()).m149814k(), str2, arrayList, this.f104072j.type, captainUserId)).subscribe(ffw.m121197h(new e30() { // from class: l.oql0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        grl0.m127731Z3((BLiveEnvelope) obj);
                    }
                }));
            } else {
                duringCreated(gql0.m127604k(((nnn0) m206027E2()).m149814k(), mGCommonPlayerPlaying.gameRoundId, mGCommonPlayerPlaying.reason + "")).subscribe(ffw.m121197h(new e30() { // from class: l.pql0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        grl0.m127716J3((BLiveEnvelope) obj);
                    }
                }));
            }
        }
        m127740e4();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m127746n4(LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        m127750r4();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m127747o4(LongLinkVirtualVoice.VoiceLiveGameTypeMessage voiceLiveGameTypeMessage) {
        m127750r4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    public void onGameStarted() {
        this.f188513f.getWindow().setSoftInputMode(19);
        if (((nnn0) m206027E2()).mo121372N2()) {
            mo75286J0();
            ((nnn0) m206027E2()).mo121369I3(false);
            this.f104073k = false;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m127748p4(bik0.C15867a c15867a) {
        m127740e4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m127749q4(BLiveVoiceGame bLiveVoiceGame) {
        m206028F2().GameEvent.loadGame().m172467p();
        BLiveVoiceGame bLiveVoiceGame2 = this.f104072j;
        if (bLiveVoiceGame2 == null || bLiveVoiceGame == null || bLiveVoiceGame2.agoraGameId != bLiveVoiceGame.agoraGameId || !TextUtils.equals(bLiveVoiceGame2.providerRoundId, bLiveVoiceGame.providerRoundId)) {
            this.f104072j = bLiveVoiceGame;
            m206028F2().VoiceVirtualLiveEvent.changeRoomBg().mo172463j("");
            if (bLiveVoiceGame != null) {
                this.f104071i.m75253D(((nnn0) m206027E2()).m149818o(), bLiveVoiceGame.agoraGameId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r4 */
    public void m127750r4() {
        duringCreated(gql0.m127600g(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.erl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92940a.m127749q4((BLiveVoiceGame) obj);
            }
        }, new vud0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m144512z2(new lql0(this.f188512e, ((VirtualGamePanelViewModel) this.viewModel).f52295d));
        ((VirtualGamePanelViewModel) this.viewModel).setSwallowTarget(this.f188512e.f77100f);
        this.f104071i.m75285O(this);
        m127735d4(new e30() { // from class: l.yql0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199604a.m127738m4((Boolean) obj);
            }
        });
        m104250o2(((nnn0) m206027E2()).f108769z.m181789r().m189079W0(), false).filter(new w9j() { // from class: l.zql0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("game".equals(((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj).getTemplate()));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.arl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71295a.m127746n4((LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
        m104250o2(((nnn0) m206027E2()).m132160q1().m189052J(), false).subscribe(ffw.m121197h(new e30() { // from class: l.brl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76911a.m127747o4((LongLinkVirtualVoice.VoiceLiveGameTypeMessage) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m160251Q2()).subscribe(ffw.m121197h(new e30() { // from class: l.crl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82260a.m127748p4((bik0.C15867a) obj);
            }
        }));
        m129301d3(j6n0.class, new w9j() { // from class: l.drl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f87646a.m127736f4((j6n0) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: t0 */
    public void mo75293t0() {
        hfw.m130790a("virtual_game", "onRemoveGameView");
        ((VoiceVirtualRoomView) m206036Q2()).f52150f.removeAllViews();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: x0 */
    public void mo75294x0(SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        super.mo75294x0(mGCommonGameSoundState);
        bxl bxlVar = (bxl) m129297F3(new bu00(7012));
        if (mGCommonGameSoundState.state || bxlVar == null) {
            return;
        }
        int i = this.f104074l;
        int i2 = i > 20 ? i % 20 : 20;
        for (int i3 = 0; i3 < i2; i3++) {
            bxlVar.stopEffect(i3);
        }
        this.f104074l = 0;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    /* JADX INFO: renamed from: n0 */
    public void mo75291n0() {
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.C12875a.a
    public void onGameDestroyed() {
    }
}
